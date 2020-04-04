package telran.data;

public class Book implements Printable {
    private String title;
    private String autor;


    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book");
    }
}
