import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> borrowings;

    public IOU() {
        this.borrowings = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.borrowings.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return borrowings.getOrDefault(toWhom, 0.0);
    }
}
