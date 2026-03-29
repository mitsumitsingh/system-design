package sumit.lld.compositepattern;

public class File implements FileSystemComponent{

    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "[File] " + name + " (" + size + " KB)");
    }
}
