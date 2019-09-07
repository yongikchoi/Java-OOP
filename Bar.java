//I worked on the homework assignment alone, using only course materials.
/**
 * @author YongIk Choi
 * @version 1.0.0
 **/
public class Bar {
    private int barLength;
    private int barWidth;
    private String chocolateType;

    /**
     * Constructor for Bar
     * @param chocolateType - type of chocolate
     * @param barLength - length of bar
     * @param barWidth - length of width
     */
    public Bar(String chocolateType, int barLength, int barWidth) {
        this.chocolateType = chocolateType;
        this.barLength = barLength;
        this.barWidth = barWidth;
    }
    /**
     * Calculates the perimeter of the chocolate bar
     * @return - returns the perimeter as integer
     */
    public int getPerimeter() {
        return barLength * 2 + barWidth * 2;
    }
    /**
     * Calculates the area of the chocolate bar
     * @return - returns the area as integer
     */
    public int getArea() {
        return barLength * barWidth;
    }

    /**
     * Returns true or false based on whether the bar is a square
     * @return - returns the truth value of shape
     */
    public boolean isSquare() {
        return barLength == barWidth;
    }

    /**
     * Takes cost parameters and returns the cost of making the bar
     * @param chocolateCost - cost of chocolate
     * @param trimCost - cost of trim
     * @return - returns the cost as double
     */
    public double calculateCost(double chocolateCost, double trimCost) {
        double cost = getArea() * chocolateCost + getPerimeter() * trimCost;
        return cost;
    }

    /**
     * Writes out the description of the rectangle/square of the bar
     * @return - returns the statement as string
     */
    public String getDetails() {
        if (isSquare()) {
            return "Square " + getArea() +  " piece bar of " + chocolateType + " chocolate";

        } else {
            return barLength + " by " + barWidth + " bar of " + chocolateType + " chocolate";
        }
    }

    /**
     * Draws the bar of the chocolate bar using the character M
     */
    public void drawBar() {
        for (int i = 0; i < barLength; i++) {
            for (int j = 0; j < barWidth - 1; j++) {
                System.out.print("M");
            }
            System.out.println("M");
        }
    }
}