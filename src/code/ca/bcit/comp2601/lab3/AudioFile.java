/**
 * This class represents the AudioFile class , the child class of MusicMedia class

 * author : Percy Ratheko

 * version 1.3
 */


package ca.bcit.comp2601.lab3;

public class AudioFile extends MusicMedia implements FileManager
{
    private String fileName;

    private int fileSizeInMb;

    private static final int MINIMUM_SIZE_Mb ;



    static
    {
        MINIMUM_SIZE_Mb = 0;
    }

    // instance
    {
        fileSizeInMb = MINIMUM_SIZE_Mb;
        fileName     = "noFilename";
    }




    /**
     * CConstructor
     * @param songTitle    : the title of the song.
     * @param artistName   : The artist name.
     * @param fileName     : The file name
     * @param fileSizeInMb : file size in Mb
     */
    public AudioFile(final String songTitle,
                     final String artistName,
                     final String fileName,
                     final int fileSizeInMb)
    {

        super(songTitle, artistName);
        validateFilename(fileName);
        validateFileSize(fileSizeInMb);
        this.fileName = fileName;
        this.fileSizeInMb = fileSizeInMb;
    }


    /**
     * @return : retuns file name
     */
    public String getFileName()
    {
        return fileName;
    }


    /**
     * @param fileName : sets file name
     */
    public void setFileName(final String fileName)
    {
        validateFilename(fileName);
        this.fileName = fileName;
    }


    /**
     * @return : returns the size in Mb.
     */
    public int getFileSizeInMb()
    {
        return fileSizeInMb;
    }


    /**
     * @param fileSizeInMb : sets the file size.
     */
    public void setFileSizeInMb(final int fileSizeInMb)
    {
        validateFileSize(fileSizeInMb);
        this.fileSizeInMb = fileSizeInMb;
    }

    @Override
    public void save(String fileName)
    {
        System.out.println(fileName + " it has been saved");
    }

    @Override
    public void delete(String fileName)
    {
        System.out.println(fileName + " has been deleted");
    }

    @Override
    public void play()
    {
        System.out.println(fileName + " is currently playing");
    }


    /**
     * it validates the filename
     *
     * @param fileName : the file name
     */
    private static void validateFilename(final String fileName)
    {
        if(fileName.isBlank())
        {
            throw new IllegalArgumentException("invalid filename: " + fileName);
        }

    }


    /**
     * it validates the file size before setting it.

     * @param fileSizeInMb : the file size.
     */
    private static void validateFileSize(final int fileSizeInMb)
    {
        if(fileSizeInMb <= MINIMUM_SIZE_Mb)
        {
            throw new IllegalArgumentException("invalid file size" + fileSizeInMb);
        }

    }




    @Override
    public String toString()
    {
        return "Audiofile{" + "filename= " + fileName + '\'' + " , filesizeinMb= " + fileSizeInMb + '}';
    }
}
