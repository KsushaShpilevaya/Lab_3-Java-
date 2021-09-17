package Data;

public class LibraryGenerics<type extends Data> {
    public LibraryGenerics(type[] d) {
        data = d;
    }
    private type[] data;
}
