public class FileSystemSimulation {
    public static void main(String[] args) {
        // Create some files
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.jpg", 500);
        File file3 = new File("file3.mp3", 1000);

        // Create folders and add files
        Folder folder1 = new Folder("Documents");
        Folder folder2 = new Folder("Music");
        folder1.add(file1);
        folder2.add(file2);
        folder2.add(file3);

        // Create a root folder and add subfolders
        Folder rootFolder = new Folder("Root");
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        // List contents of the root folder
        System.out.println("Listing contents of root folder:");
        rootFolder.listContents();

        // Calculate total size of files in root folder
        System.out.println("Total size of root folder: " + rootFolder.getSize() + " KB");

        // Count the number of files
        System.out.println("Total number of files in root folder: " + rootFolder.countFiles());
    }
}
