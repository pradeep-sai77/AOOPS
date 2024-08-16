import java.util.ArrayList;
import java.util.List;

public class RetailAnalytics {
    private List<SalesData> salesDataList;

    public RetailAnalytics() {
        salesDataList = new ArrayList<>();
    }

    public void addSalesData(SalesData data) {
        salesDataList.add(data);
    }

    public double calculateTotalRevenue() {
        return salesDataList.stream().mapToDouble(SalesData::getRevenue).sum();
    }

    public int calculateTotalQuantitySold() {
        return salesDataList.stream().mapToInt(SalesData::getQuantitySold).sum();
    }

    public double calculateAverageRevenuePerSale() {
        return salesDataList.stream().mapToDouble(SalesData::getRevenue).average().orElse(0.0);
    }
}
