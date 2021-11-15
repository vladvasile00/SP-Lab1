import java.util.ArrayList;


public class MediaPlayer{
    private String title;


    public MediaPlayer(String title){
        this.title = title;
        this.title = new ArrayList<Playlist>();}

    public void addContent (Media media) {
        this.media.add(media);
    }

    public void addAuthor(Media media) {
        this.media.add(media);
    }

    public void print() {
        System.out.println("MediaPlayer: " + title);

        for (Media m : this.media) {
            this.media.print();
        }

    }
}
}
