package models;

public interface Element {
    void add(Element element) throws Exception;
    void remove(Element element);
}
