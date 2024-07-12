public class AnnalynsInfiltration {
    /**
     * Implement the (static) AnnalynsInfiltration.canFastAttack() method
     *  that takes a boolean value that indicates if the knight is awake.
     *  This method 
     * @param knightIsAwake
     * @return true if a fast attack can be made based on the state of the knight.
     *  Otherwise, returns false:
     */
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }
/**
 * Implement the (static) AnnalynsInfiltration.canSpy() method 
 * that takes three boolean values, indicating if the knight, archer and the prisoner, respectively, are awake.
 *  The method returns 
 * @param knightIsAwake
 * @param archerIsAwake
 * @param prisonerIsAwake
 * @return true if the group can be spied upon, based on the state of the three characters. Otherwise, returns false:
 */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }
/**
 * Implement the (static) AnnalynsInfiltration.canFreePrisoner() method that takes four boolean values.
 *  The first three parameters indicate if the knight, archer and the prisoner, respectively, are awake. 
 * The last parameter indicates if Annalyn's pet dog is present. 
 * The method returns true if the prisoner can be freed based on the state of the three characters and Annalyn's pet dog's presence. Otherwise, it returns false:
 * @param knightIsAwake
 * @param archerIsAwake
 * @param prisonerIsAwake
 * @param petDogIsPresent
 * @return
 */
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return petDogIsPresent && !archerIsAwake || !petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake;
    } 
    
    /**
     * Bestanden!
     *  Your solution to Annalyn's Infiltration is exemplar, congratulations! It is exactly what we think is the most idiomatic implementation of the tasks at hand. Rejoice!
     */
}
