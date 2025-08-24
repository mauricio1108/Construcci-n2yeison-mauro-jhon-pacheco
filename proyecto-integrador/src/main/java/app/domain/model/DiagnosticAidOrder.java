package app.domain.model;
 
public class DiagnosticAidOrder extends Order {
    private int itemNumber;
    private String diagnosticAidId;
    private String diagnosticAidName;
    private int quantity;
    private boolean requiresSpecialist;
    private String specialistId;
    private double cost;
 
    public DiagnosticAidOrder(int orderNumber, String patientId, String physicianId, java.util.Date creationDate, int itemNumber, String diagnosticAidId, String diagnosticAidName, int quantity, boolean requiresSpecialist, String specialistId, double cost) {
        super(orderNumber, patientId, physicianId, creationDate);
        this.itemNumber = itemNumber;
        this.diagnosticAidId = diagnosticAidId;
        this.diagnosticAidName = diagnosticAidName;
        this.quantity = quantity;
        this.requiresSpecialist = requiresSpecialist;
        this.specialistId = specialistId;
        this.cost = cost;
    }
 
    // Getters and setters
    public int getItemNumber() { return itemNumber; }
    public void setItemNumber(int itemNumber) { this.itemNumber = itemNumber; }
    public String getDiagnosticAidId() { return diagnosticAidId; }
    public void setDiagnosticAidId(String diagnosticAidId) { this.diagnosticAidId = diagnosticAidId; }
    public String getDiagnosticAidName() { return diagnosticAidName; }
    public void setDiagnosticAidName(String diagnosticAidName) { this.diagnosticAidName = diagnosticAidName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public boolean isRequiresSpecialist() { return requiresSpecialist; }
    public void setRequiresSpecialist(boolean requiresSpecialist) { this.requiresSpecialist = requiresSpecialist; }
    public String getSpecialistId() { return specialistId; }
    public void setSpecialistId(String specialistId) { this.specialistId = specialistId; }
    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public DiagnosticAidOrder findById(DiagnosticAidOrder order) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}