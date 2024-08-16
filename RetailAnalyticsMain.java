public class RetailAnalyticsMain {
    public static void main(String[] args) {
        RetailAnalytics analytics = new RetailAnalytics();
        
        // Add sales data
        analytics.addSalesData(new SalesData("Product A", 10, 200.0));
        analytics.addSalesData(new SalesData("Product B", 5, 75.0));
        
        // Perform analytics
        double totalRevenue = analytics.calculateTotalRevenue();
        int totalQuantitySold = analytics.calculateTotalQuantitySold();
        double averageRevenuePerSale = analytics.calculateAverageRevenuePerSale();
        
        // Output the results
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Total Quantity Sold: " + totalQuantitySold);
        System.out.println("Average Revenue Per Sale: $" + averageRevenuePerSale);
    }
}
