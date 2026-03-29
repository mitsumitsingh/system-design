package sumit.lld.compositepattern;

public class CompositePatternDemo {
    public static void main(String[] args) {

        // Root Node
        Folder root = new Folder("Root");

        // Direct leaves under root (File 1, File 2)
        root.add(new File("file1.txt", 10));
        root.add(new File("file2.txt", 20));

        // Sub-folder A (Node) with two leaves (File 3, File 4)
        Folder subFolderA = new Folder("SubFolder-A");
        subFolderA.add(new File("file3.txt", 15));
        subFolderA.add(new File("file4.txt", 25));
        root.add(subFolderA);

        // File 5 directly under root (Leaf)
        root.add(new File("file5.txt", 30));

        // Sub-folder B (Node) — contains Sub-folder C and File 7
        Folder subFolderB = new Folder("SubFolder-B");

        // Sub-folder C (nested Node inside B) — contains File 6
        Folder subFolderC = new Folder("SubFolder-C");
        subFolderC.add(new File("file6.txt", 50));

        subFolderB.add(subFolderC);
        subFolderB.add(new File("file7.txt", 40));
        root.add(subFolderB);

        // Display the full tree
        System.out.println("========== File System Tree ==========");
        root.display(0);

        // Uniform treatment — same call on any node or leaf
        System.out.println("\n========== Size Calculations ==========");
        System.out.println("Total size of Root:        " + root.getSize()        + " KB");
        System.out.println("Total size of SubFolder-A: " + subFolderA.getSize()  + " KB");
        System.out.println("Total size of SubFolder-B: " + subFolderB.getSize()  + " KB");
        System.out.println("Total size of SubFolder-C: " + subFolderC.getSize()  + " KB");
        System.out.println("Size of file1.txt:         " + 10                    + " KB");
    }
}
