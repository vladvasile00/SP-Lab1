public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(this.title);
    }
}
