import java.util.ArrayList
public class Playlist implements Media {
    private String title;
    private ArrayList<Media> media = new ArrayList<>();

    public Section(String title){
        this.title = title;
    }

    public void add(Media media){
        this.media.add(media);
    }

    public void remove(Media media) {
        this.media.remove(media);
    }

    public boolean find(Media media) {
        for (Media m: this.media) {
            if (find(media))
                return true;
        }

        return false;
    }


    public void print() {
        System.out.println("Title" + this.title);

        for (Media m : this.media)
            m.print();
    }
}

}


