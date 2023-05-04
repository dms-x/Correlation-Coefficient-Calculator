import java.util.*;

public class Main {
    public static void main(String[] args) {
        Double[] s1 = {2.57, 0.15, -0.15, -0.36, -1.16, 0.57, 1.06, 0.41, 1.11, 2.01, 2.63, -0.08, 2.63, 0.83, -1.27, 5.37, -0.17, -0.26, -1.00, 4.52};
        Double[] s2 = {1.22, -1.14, -0.23, 0.8, -1.34, 0.16, -0.31, 0.71, 0.70, 1.55, 0.95, 0.16, 0.98, -0.14, -0.07, 1.65, -0.97, 0.30, -0.06, 3.11};

        coCoe(s1, s2);
    }

    public static double avgCalculator(Double[] list){
        double sum = 0;
        for(int i = 0; i < list.length; i++){
            sum += list[i];
        }
        double avg = sum / list.length;
        return avg;
    }
    public static double sdCalculator(Double[] list){
        double avg = avgCalculator(list);
        double sum = 0;

        for(int i = 0; i < list.length; i++){
            sum += (list[i] - avg) * (list[i] - avg);
        }
        double sd = Math.sqrt(sum / (list.length - 1));
        return sd;
    }

    public static double covariance(Double[] list1, Double[] list2){
        double sum = 0;
        double avg1 = avgCalculator(list1);
        double avg2 = avgCalculator(list2);

        for(int i = 0; i < list1.length; i++){
            sum += (list1[i] - avg1) * (list2[i] - avg2) / (list1.length - 1);
        }

        return sum;
    }

    public static void coCoe(Double[] list1, Double[] list2){
        double sd1 = sdCalculator(list1);
        double sd2 = sdCalculator(list2);
        double cv = covariance(list1, list2);
        double coco = cv / (sd1 * sd2);

        System.out.println(coco);
    }
}