package ca.bcit.comp2601.lab3;

public class Driver
{
    public static void main(String[] args)
    {
        final AudioFile   p1;
        final CompactDisk c1;
        final VinylRecord v1;


        p1 = new AudioFile("mono lisa","lil wayne", "xhosa.txt",200);
        c1 = new CompactDisk("close to u","Drake",888);
        v1 = new VinylRecord("exchange","Bryson tiller ", 76, 12,500);

        System.out.println(p1);
        System.out.println(c1);
        System.out.println(v1);

    }
}
