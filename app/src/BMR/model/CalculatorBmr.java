package BMR.model;

public class CalculatorBmr {
    private double weight;
    private double height;
    private int age;
    private String gender;

    public CalculatorBmr(double weight, double height, int age, String gender){
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    public double calculate(){
        double result;

        if (gender.equalsIgnoreCase("Male")) {
            if (age >= 0 && age <= 3) {
                result = (59.512 * weight) - 30.4;
            } else if (age > 3 && age <= 10) {
                result = (22.706 * weight) + 504.3;
            } else if (age > 10 && age <= 18) {
                result = (0.056 * weight + 2.800) * 239;
            } else if (age > 18 && age <= 30) {
                result = (15.057 * weight) + 692.2;
            } else if (age > 30 && age <= 60) {
                result = (11.472 * weight) + 873.1;
            } else {
                result = (11.711 * weight) + 587.7;
            }
        } else if (gender.equalsIgnoreCase("Female")) {
            if (age >= 0 && age <= 3) {
                result = (58.317 * weight) - 31.1;
            } else if (age > 3 && age <= 10) {
                result = (20.315 * weight) + 485.9;
            } else if (age > 10 && age <= 18) {
                result = (13.384 * weight) + 692.6;
            } else if (age > 18 && age <= 30) {
                result = (14.818 * weight) + 486.6;
            } else if (age > 30 && age <= 60) {
                result = (8.126 * weight) + 845.6;
            } else {
                result = (9.082 * weight) + 658.5;
            }
        } else {
            throw new IllegalArgumentException("Gênero ou idade inválido!");
        }

        return result;
    }
}
