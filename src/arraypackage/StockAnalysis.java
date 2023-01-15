package arraypackage;
import java.util.Arrays;

public class StockAnalysis {
    public static void main(String[] args) {
        double[] ricePrices = {100, 105, 110, 115};
        double[] wheatPrices = {200, 205, 210, 215};
        double[] cottonPrices = {300, 310, 320, 325};

      
    }

    public static int findMaxIndex(double[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
