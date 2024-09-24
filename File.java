
public class File extends FileSystemObject {
    int size;
    
    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override 
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File: " + name + " (" + size + " KB)";
    }
}
