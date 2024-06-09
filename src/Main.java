public class Main {


    public static void main(String[] args) {
        double [] fractions = {21.426, 8.17, -14.0, 73.6, -99.99, -10.5, 3.14,
                0.79, -51.05, -25.88, 733.90, -30.410, 67.44, -0.001, 20.21 };

        double sum = 0.0;
        int quantity = 0;
        boolean negativeNum = false;

            for (double number : fractions ) {
                if (number < 0) {
                    negativeNum = true;
                }else if (number > 0) {
                    if (negativeNum) {
                        if (number > 0) {
                            sum = sum + number;
                            quantity++;
                        }
                    }
            }

        }
        double average = sum/ quantity;
        System.out.println(average);

    }
}