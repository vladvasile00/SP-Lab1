public class Main {
    public static void main(String[] args)  {
        // tema cautare extensiva
        
        Playlist p1 = new Playlist("Scorpions");
        Playlist pp1 = new Playlist("Scorpions");
        p1.add(pp1);
        Playlist p2 = new Playlist("Scorpions 2");
        p1.add(p2);
        System.out.println("Printing ");
        System.out.println();
        pp1.print();
        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        pp1.print();
    }
}
