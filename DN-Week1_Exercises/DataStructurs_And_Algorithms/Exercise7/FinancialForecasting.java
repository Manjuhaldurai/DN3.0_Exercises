package Exercise7;

public class FinancialForecasting {

    public static void main(String[] args) {
        double currentValue = 1000.0;
        double growthRate = 0.05;
        int periods = 10;

        double futureValue = FinancialCalculator.predictFutureValue(currentValue, growthRate, periods);

        System.out.println("Current Value: " + currentValue);
        System.out.println("Growth Rate: " + growthRate);
        System.out.println("Periods: " + periods);
        System.out.println("Predicted Future Value: " + futureValue);
    }
}
