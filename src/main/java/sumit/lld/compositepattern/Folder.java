package sumit.lld.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    // Child management methods
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    public List<FileSystemComponent> getChildren() {
        return children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        // Delegate to children recursively
        return children.stream()
                .mapToInt(FileSystemComponent::getSize)
                .sum();
    }

    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "[Folder] " + name + "/");
        for (FileSystemComponent child : children) {
            child.display(indent + 4); // Recurse into every child
        }
    }

}
