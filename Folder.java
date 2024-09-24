import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemObject {
    List<FileSystemObject> contents;

    public Folder(String name) {
        super(name);
        this.contents = new ArrayList<>();
    }

    public void add(FileSystemObject obj) {
        contents.add(obj);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemObject obj : contents) {
            totalSize += obj.getSize();
        }
        return totalSize;
    }

    public void listContents() {
        for (FileSystemObject obj : contents) {
            System.out.println(obj);
            if(obj instanceof Folder) {
                ((Folder) obj).listContents();
            }
        }
    }

    public int countFiles() {
        int count = 0;
        for (FileSystemObject obj : contents) {
            if (obj instanceof File) {
                count++;
            } else if (obj instanceof Folder) {
                count += ((Folder) obj).countFiles();
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Folder: " + name;
    }
}
