package BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("KILLA HAKAN",10,95,70, 50,50);
        Fighter f2 = new Fighter("MASSAKA",20,85,80,50,50);

        Match match= new Match(f1,f2,70,85);
        match.run();

    }
}
