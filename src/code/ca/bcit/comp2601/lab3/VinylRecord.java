/**
 * This class represents the VinylRecord class , the subclass of CompactDisk class

 * author : Percy Ratheko

 * version 1.3
 */


package ca.bcit.comp2601.lab3;

public class VinylRecord extends CompactDisk
{
    private int sizeInInches;

    private int weightInGrams;

    private final static int MINIMUM_WEIGHT ;
    private final static int MINIMUM_SIZE ;

    private final static int FIRST_SIZE_INCHES;

    private final static int SECOND_SIZE_INCHES;

    private final static int THIRD_SIZE_INCHES;


    static
    {
        FIRST_SIZE_INCHES  = 7 ;
        SECOND_SIZE_INCHES = 10;
        THIRD_SIZE_INCHES  = 12;
        MINIMUM_SIZE       = 0;

        MINIMUM_WEIGHT = 0 ;
    }

    // instances
    {
        weightInGrams = MINIMUM_WEIGHT;
        sizeInInches = MINIMUM_SIZE ;
    }

    /**
     * Constructor
     * @param songTitle      : The song title .
     * @param artistName     : the artist Name.
     * @param numberOfTracks : The number of tracks.
     * @param sizeInInches   : The size in inches.
     * @param weightInGrams  : The weight in grams.
     */
    public VinylRecord(final String songTitle,
                       final String artistName,
                       final int numberOfTracks,
                       final int sizeInInches,
                       final int weightInGrams)
    {

        super(songTitle, artistName, numberOfTracks);
        validateweightInGrams(weightInGrams);
        validateSizeInInches(sizeInInches);
        this.sizeInInches = sizeInInches;
        this.weightInGrams = weightInGrams;
    }


    /**
     * @return : returns the size in Inches.
     */
    public int getSizeInInches()
    {
        return sizeInInches;
    }


    /**
     * @param sizeInInches :sets the size in Inches.
     */
    public void setSizeInInches(final int sizeInInches)
    {
        validateSizeInInches(sizeInInches);
        this.sizeInInches = sizeInInches;
    }

    /**
     * @return : returns the weight in grams .
     */
    public int getWeightInGrams()
    {
        return weightInGrams;
    }


    /**
     * @param weightInGrams : sets the weight in grams
     */
    public void setWeightInGrams(final int weightInGrams)
    {
        validateweightInGrams(weightInGrams);
        this.weightInGrams = weightInGrams;
    }


    /**
     * Validates the weight

     * @param weightInGrams : weight in grams.
     */
    private static void validateweightInGrams(final int weightInGrams)
    {
        if(weightInGrams <= MINIMUM_WEIGHT)
        {
            throw new IllegalArgumentException("invalid weight" + weightInGrams);
        }

    }


    /**
     * validates the size in inches.

     * @param sizeInInches : the size in inches.
     */
    private static void validateSizeInInches(final int sizeInInches)
    {
        if(!(sizeInInches == FIRST_SIZE_INCHES || sizeInInches == SECOND_SIZE_INCHES || sizeInInches == THIRD_SIZE_INCHES))
        {
            throw new IllegalArgumentException("invalid size" + sizeInInches);
        }

    }

    @Override
    public String toString()
    {
        return "VinylRecord{" +
                "sizeInInches=" + sizeInInches +
                ", weightInGrams=" + weightInGrams +
                '}';
    }


}
