package lab3;

public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(title);
    }

    @Override
    public void add(Element e) {
    }

    @Override
    public Element get(int poz) {
        return null;
    }

    @Override
    public void remove(Element e) {
    }
}