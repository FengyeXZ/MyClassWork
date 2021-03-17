/**
 * Frank Xu
 * 2021/03/11
 */
class heater {
    //there are the feilds
    private double temperature;
    private double max;
    private double min;
    private double increment;
    //there is the constructor
    public heater(double newTemperature, double newMax, double newMin) {
        temperature = newTemperature;
        max = newMax;
        min = newMin;
        increment = 5;
    }
    //set the increment
    public double setIncrement(double x) {
        if (x < 0) {
            System.out.println("Error, don't input a negative number");
        }
        else {
            increment = x;     
        }
        return increment;
    }
    //increase temperature by x times increament.
    public double warmer(double x) {
        if ((max - temperature) < (x * increment)) {
            System.out.println("Error, is too much");
        }
        else {
            temperature = temperature + x * increment;
        }
        return temperature;
    }
    //decrease temperature by x times increament.
    public double cooler(double x) {
        if ((temperature - min) < (x * increment)) {
            System.out.println("Error, is too much");
        }
        else {
            temperature = temperature - x * increment;
        }
        return temperature;
    }
}
