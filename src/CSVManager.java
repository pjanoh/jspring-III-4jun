public class CSVManager extends BaseManager {
    private int[] expenses = new int[12];

    public CSVManager(String path) {
        String[] lines = readLines(path);
        for (String line : lines) {
            String[] parts = line.split(","); // month, revenue, expense
            int month = Integer.parseInt(parts[0]) - 1;
            int revenue = Integer.parseInt(parts[1]);
            int expense = Integer.parseInt(parts[2]);

            profits[month] = revenue - expense;
            expenses[month] = expense;
        }
    }

    /// proffit
}
