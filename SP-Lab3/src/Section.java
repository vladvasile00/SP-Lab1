package lab3;

import java.util.ArrayList;

public class Section implements Element {
    private String name;
    private ArrayList<Element> subElements=new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(name);
        for(Element el:subElements) {
            el.print();
        }

    }

    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub
        this.subElements.add(e);
    }

    @Override
    public Element get(int poz) {
        // TODO Auto-generated method stub
        if(poz < 0 || poz >= this.subElements.size()) {
            // alternativa aruncam exceptie
            return null;
        }
        return this.subElements.get(poz);
    }

    @Override
    public void remove(Element e) {
        // TODO Auto-generated method stub
        this.subElements.remove(e);
    }
}