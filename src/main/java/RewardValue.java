
public class RewardValue {
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
