import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Section implements Element {
    private String title;
    private ArrayList<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
    }

    public Section(Section section) {
        this.title = section.title;
        this.elements = new ArrayList<>();
        Collections.copy(this.elements, section.elements);
    }

    @Override
    public void add(Element elementToBeAdded) throws Exception {
        Element element = Utils.checkAndReturnCopy(elementToBeAdded);
        this.elements.add(element);
    }

    public void addWithoutCopy(Element elementToBeAdded) throws Exception {
        this.elements.add(elementToBeAdded);
    }

    @Override
    public void remove(Element element) {
        this.elements.remove(element);
    }

    public void print() {
        System.out.println("Titlu: " + this.title);

        for (Element i : this.elements)
            i.print();
    }
}
