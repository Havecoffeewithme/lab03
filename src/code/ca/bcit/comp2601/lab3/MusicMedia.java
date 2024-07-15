/**
 * this class represents the parent MusicMedia class with its attributes
 *
 * An abstract class with fields for song title and artist name.
 * Constructor that takes parameters to set both fields. Parameters must be validated appropriately before they are
 * assigned to the fields. If either parameter is invalid throw an IllegalArgumentException and do nothing else
 * (let the program terminate).
 * Getter and setter for each field, as appropriate
 * toString() method overridden, to display the field values
 * Abstract method void play()
 *
 * @author : Percy Ratheko
 * verson 1.3
 */


package ca.bcit.comp2601.lab3;

public abstract class MusicMedia
{
    private String songTitle;

    private String artistName;


    // instance
    {
        songTitle  = "noTitle";
        artistName = "noName";
    }


    /**
     * Constructor
     * @param songTitle : the name of the song.
     * @param artistName : the name of the artist.
     */

    public MusicMedia(final String songTitle,
                      final String artistName)
    {
        super();
        validateArtistName(artistName);
        validateSongTitle(songTitle);
        this.songTitle = songTitle;
        this.artistName = artistName;
    }

    /**
     * @return : returns the song title
     */
    public String getSongTitle()
    {
        return songTitle;
    }

    /**
     * @return : returns artist name
     */
    public String getArtistName()
    {
        return artistName;
    }



    /**
     * @param songTitle : sets the song title
     */
    public void setSongTitle(final String songTitle)
    {
        validateSongTitle(songTitle);
        this.songTitle = songTitle;
    }


    /**
     * @param artistName : sets the name of the artist.
     */
    public void setArtistName(final String artistName)

    {
        validateArtistName(artistName);
        this.artistName = artistName;
    }

    public abstract void play();


    /**
     * validates song title.

     * @param songTitle : the song title.
     */
    private static void validateSongTitle(final String songTitle)
    {
        if(songTitle.isBlank())
        {
            throw new IllegalArgumentException("invalid" + songTitle);
        }

    }


    /**
     * validates artist name

     * @param artistName : the artist name .
     */
    private static void validateArtistName(final String artistName)
    {
        if(artistName.isBlank())
        {
            throw new IllegalArgumentException("invalid" + artistName);
        }

    }



    @Override
    public String toString()
    {
        return "MusicMedia{" +
                "songTitle='" + songTitle + '\'' +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
