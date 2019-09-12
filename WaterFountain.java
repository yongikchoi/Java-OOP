//I worked on the homework assignment alone, using only course materials.
/**
 * This classs deals with WaterFountains
 * @author YongIk Choi
 * @version 1.0.0
 */
public class WaterFountain {
    private String modelName;
    private boolean requiresMaintenance;
    private int cupsPoured;
    private static int totalWaterFountains;
    public static final String SOFTWARE_VERSION = "2.0.0";

    /**
     * Creates a constructor for Waterfountain to be manipulated
     * @param modelName - the model name in string
     * @param cupsPoured - the number of cups poured in integer
     */
    public WaterFountain(String modelName, int cupsPoured) {
        this.modelName = modelName;
        this.cupsPoured = cupsPoured;
        requiresMaintenance = false;
        totalWaterFountains++;
    }

    /**
     * Sets the name of the model of the fountain
     * @param modelName - name of the model of the fountain
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * Retrieves the model name of the fountain
     * @return returns the model name as a string
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the maintenance status of the fountain
     * @param requiresMaintenance - true or false value regarding the status of the fountain
     */
    public void setRequiresMaintenance(boolean requiresMaintenance) {
        this.requiresMaintenance = requiresMaintenance;
    }

    /**
     * Retrieves the maintenance status of the fountain
     * @return - returns the maintenance status of the fountain as a boolean
     */
    public boolean getRequiresMaintenance() {
        return this.requiresMaintenance;
    }

    /**
     * Sets the number of cups poured by the fountain
     * @param cupsPoured - the number of cups poured as an integer
     */
    public void setCupsPoured(int cupsPoured) {
        this.cupsPoured = cupsPoured;
    }

    /**
     * Retrieves the number of cups poured by the fountain
     * @return - returns the number of cups poured as an integer
     */
    public int getCupsPoured() {
        return this.cupsPoured;
    }

    /**
     * A static method that gets the total number of water fountains created by the class
     * @return - returns the number of water fountains as an integer
     */
    public static int getTotalWaterFountains() {
        return totalWaterFountains;
    }

    /**
     * pours the cup if the the waterfountain is working properly
     */
    public void pourCup() {
        if (!requiresMaintenance) {
            cupsPoured++;
        }
    }

    /**
     * Method that compares two waterfountains sees if they are true or not
     * @param other - another waterfountain that is in comparison
     * @return a boolean of true or false depending on the comparison.
     */
    public boolean equals(WaterFountain other) {
        if (this.getModelName() == other.getModelName()) {
            if (this.getRequiresMaintenance() == other.getRequiresMaintenance()) {
                if (this.getCupsPoured() == other.getCupsPoured()) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * method that writes out the description of the water fountain
     * @return - returns a string that descripes the current status of the waterfountain
     */
    public String toString() {
        if (this.getRequiresMaintenance()) {
            return this.getModelName() + " has poured " + this.getCupsPoured()
                    + " cups, requires maintenance, and is running version: " + SOFTWARE_VERSION;
        } else {
            return this.getModelName() + " has poured " + this.getCupsPoured()
                    + " cups, does not require maintenance, and is running version: " + SOFTWARE_VERSION;
        }
    }

    public static void main (String[] args) {
        WaterFountain wf = new WaterFountain("A-222", 987);
        WaterFountain wf2 = new WaterFountain("B-5", 1);
        wf.pourCup();
        System.out.println(wf.getCupsPoured());
        wf.setCupsPoured(12);
        System.out.println(wf.getCupsPoured());
        System.out.println(wf.getModelName());
        System.out.println(wf.getRequiresMaintenance());

        wf2.setRequiresMaintenance(true);
        wf2.setModelName("apple");

        System.out.println(wf.equals(wf2));
        System.out.println(wf.equals(wf));

        System.out.println(wf.toString());
        System.out.println(wf2.toString());

        System.out.println(WaterFountain.totalWaterFountains);
        System.out.println(wf.getTotalWaterFountains());

    }
}