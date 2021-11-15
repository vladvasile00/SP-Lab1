public interface Media {
    void print();
    void add(Media media) throws Exception;
    void remove(Media media);
    boolean find(Media media);
}
