import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        class RewardValue {
            private double cashValue;
            private double milesValue;

            public RewardValue(double cashValue) {
                this.cashValue = cashValue;
                this.milesValue = cashValue / 0.0035;
            }

            public RewardValue(double milesValue, boolean isMiles) {
                if (isMiles) {
                    this.milesValue = milesValue;
                    // Convert miles to cash at a rate of 0.0035
                    this.cashValue = milesValue * 0.0035;
                } else {
                    this.cashValue = milesValue;
                    this.milesValue = milesValue / 0.0035;
                }
            }

            // Getter method for cash value
            public double getCashValue() {
                return cashValue;
            }

            // Getter method for miles value
            public double getMilesValue() {
                return milesValue;
            }
        }

        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}