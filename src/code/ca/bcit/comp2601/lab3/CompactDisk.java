/**
 * this class represents the child class Compact Disk with its attributes.

 * Has a field to hold the number of tracks on the CD
 * Has a static field called “READING_METHOD” whose value is “laser”
 * Constructor takes parameters for title, artist. The number of tracks. The number of tracks should be validated
 * appropriately and an IllegalArgumentException will be thrown if the value is bad.
 * Getter and setter for the number of tracks field
 * toString that will display the number of tracks, title, and artist
 * play() method will display a simple message indicating that the cd is being played
 *
 *
 * @author : Percy Ratheko
 * verson 1.3
 */


package ca.bcit.comp2601.lab3;

public class CompactDisk extends MusicMedia
{
    private int numberOfTracks;

    /**
     * Constructor.
     * @param songTitle : song title .
     * @param artistName : The name of the artist.
     * @param numberOfTracks : number of tracks.
     */
    public CompactDisk(final String songTitle,
                       final String artistName,
                       final int numberOfTracks)
    {


        super(songTitle, artistName);
        this.numberOfTracks = numberOfTracks;
    }

    /**
     * @return : returns the number of tracks.
     */
    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }


    /**
     * @param numberOfTracks : sets the number of tracks
     */
    public void setNumberOfTracks(int numberOfTracks)
    {
        this.numberOfTracks = numberOfTracks;
    }

    @Override
    public void play()
    {
        System.out.println("The C.D is currently playing Music");
    }

    @Override
    public String toString()
    {
        return "CompactDisk{" +
                "numberOfTracks=" + numberOfTracks +
                '}';
    }
}
