public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public Table(Table table) {
        this.title = table.title;
    }

    public void print() {
        System.out.println(this.title);
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }
}
