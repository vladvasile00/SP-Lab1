package lab3;

public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print(){
        System.out.println("Image with name: " + imageName);
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