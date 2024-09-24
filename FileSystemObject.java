abstract class FileSystemObject {
    String name;

    public FileSystemObject(String name) {
        this.name = name;
    }

    public abstract int getSize();
}