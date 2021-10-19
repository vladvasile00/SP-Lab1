package Lab3;

public interface Element {
    public void print();

    public void add(Element e) throws Exception;

    public Element get(int poz);

    public void remove(Element e);

    public boolean find(Element e);
}