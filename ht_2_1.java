/**
 * Created by Ruslan on 10.11.2016.
 */
public class ht_2_1 {

    public static void main(String[] args) {
        int[] numbers_int = {5,3,4,8,2,-6,11,7,1,-9};
        double[] numbers_double = {5.5,3.3,4.4,8.8,2.2,-6.6,11.11,7.7,1.1,-9.9};

        System.out.println("SumInt= " + sum(numbers_int));
        System.out.println("SumDouble= " + sum(numbers_double));

        System.out.println("MinInt= " + min(numbers_int));
        System.out.println("MinDouble= " + min(numbers_double));

        System.out.println("MaxInt= " + max(numbers_int));
        System.out.println("MaxDouble= " + max(numbers_double));

        System.out.println("maxPositiveInt= " + maxPositive(numbers_int));
        System.out.println("maxPositiveDouble= " + maxPositive(numbers_double));

        System.out.println("multiplicationInt= " + multiplication(numbers_int));
        System.out.println("multiplicationDouble= " + multiplication(numbers_double));

        System.out.println("modulusdInt " + modulus(numbers_int));
        System.out.println("modulusdDouble " + modulus(numbers_double));

        System.out.println("secondLargestInt= " + secondLargest(numbers_int));
        System.out.println("secondLargestDouble= " + secondLargest(numbers_double));
    }

    static int sum(int[] numbers_int){
        int result = 0;
        for (int i = 0; i < (numbers_int.length); i++ ){
            result = numbers_int[i] + result;
        }
        return result;
    }

    static double sum(double[] numbers_double){
        double result = 0;
        for (int i = 0; i < (numbers_double.length); i++ ){
            result = numbers_double[i] + result;
        }
        return result;
    }

    static int min(int[] numbers_int){

        int result = numbers_int[0];
        for (int i = 0; i < (numbers_int.length); i++ ){
            if(result > numbers_int[i]){
                result = numbers_int[i];
            }
        }
        return result;
    }

    static double min(double[] numbers_double){
        double result = numbers_double[0];
        for (int i = 0; i < (numbers_double.length); i++ ){
            if(result > numbers_double[i]){
                result = numbers_double[i];
            }
        }
        return result;
    }

    static int max(int[] numbers_int){
        int result = -numbers_int[0];
        for (int i = 0; i < (numbers_int.length); i++ ){
            if(result < numbers_int[i]){
                result = numbers_int[i];
            }
        }
        return result;
    }

    static double max(double[] numbers_double){
        double result = numbers_double[0];
        for (int i = 0; i < (numbers_double.length); i++ ){
            if(result < numbers_double[i]){
                result = numbers_double[i];
            }
        }
        return result;
    }

    static int maxPositive(int[] numbers_int){
        int result = -numbers_int[0];
        for (int i = 0; i < (numbers_int.length); i++ ){
            if(result < numbers_int[i] && numbers_int[i] > 0){
                result = numbers_int[i];
            }
        }
        return result;
    }

    static double maxPositive(double[] numbers_double){
        double result = -numbers_double[0];
        for (int i = 0; i < (numbers_double.length); i++ ){
            if(result < numbers_double[i] && numbers_double[i] > 0){
                result = numbers_double[i];
            }
        }
        return result;
    }

    static int multiplication(int[] numbers_int){
        int result = 1;
        for (int i = 0; i < (numbers_int.length); i++ ){
            result = result * numbers_int[i];
        }
        return result;
    }

    static double multiplication(double[] numbers_double){
        double result = 1;
        for (int i = 0; i < (numbers_double.length); i++ ){
            result = result * numbers_double[i];
        }
        return result;
    }

    static int modulus(int[] numbers_int){

        int firstElement = numbers_int[0];
        int lastElement  = numbers_int[numbers_int.length-1];

        /*System.out.println("modulusdInt " + firstElement % lastElement);*/
        return firstElement % lastElement;

    }

    static double modulus(double[] numbers_double){
        double firstElement = numbers_double[0];
        double lastElement  = numbers_double[numbers_double.length-1];

        /*System.out.println("modulusdDouble " + firstElement % lastElement);*/
        return firstElement % lastElement;
    }

    static int secondLargest(int[] numbers_int){

        for(int i = numbers_int.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( numbers_int[j] > numbers_int[j+1] ){
                    int tmp = numbers_int[j];
                    numbers_int[j] = numbers_int[j+1];
                    numbers_int[j+1] = tmp;
                }
            }
        }

        return numbers_int[numbers_int.length-2];
    }

    static double secondLargest(double[] numbers_double){
        for(int i = numbers_double.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( numbers_double[j] > numbers_double[j+1] ){
                    double tmp = numbers_double[j];
                    numbers_double[j] = numbers_double[j+1];
                    numbers_double[j+1] = tmp;
                }
            }
        }

        return numbers_double[numbers_double.length-2];
    }
}
