public class Lasagna {
    
    public int expectedMinutesInOven()
    {
        return 40;
    }
    public int remainingMinutesInOven(int currentMinutesInOven)
    {
        return expectedMinutesInOven() - currentMinutesInOven;
    }   
    public int preparationTimeInMinutes(int layersOfLasagne)
    {
        return 2 * layersOfLasagne;
    }
    public int totalTimeInMinutes(int layersOfLasagne,int currentMinutesInOven)
    {
        return preparationTimeInMinutes(layersOfLasagne) + currentMinutesInOven;
    }

    /* 
    Bestanden!
    Your solution to Log Levels is exemplar, congratulations! It is exactly what we think is the most idiomatic implementation of the tasks at hand. Rejoice! 
    */
}
