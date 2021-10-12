public class Author {
    private String name;

    public Author(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + "]";
    }

    public void print() {
        System.out.println("Author: " + name);
    }

}