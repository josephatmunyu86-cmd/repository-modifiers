package admin;

public class Finance {
    private double hospitalRevenue;

    Finance(double hospitalRevenue) {
        this.hospitalRevenue = hospitalRevenue;
    }
    protected void displayFinancialRecords() {
        System.out.println("Hospital Revenue: UGX " + hospitalRevenue);
    }
}
