public class Medicine {
    private String medicineID;
    private String name;
    private String category;
    private String minStockLevel;

    public Medicine (String medicineID, String name, String category, String minStockLevel) {
        this.medicineID = medicineID;
        this.name = name;
        this.category = category;
        this.minStockLevel = minStockLevel;
    }

    // Getters for retrieving medicine details //
    public String getMedicineID() {return medicineID;}
    public String getName() {return name;}
    public String getCategory() {return category;}
    public String getMinStockLevel() {return minStockLevel;}

    // Reccomendation for required stock medicine level, double the minimum //
    public int getRequiredStockLevel() { return Integer.parseInt(minStockLevel) * 2; }

    // Setters for updating medicine detai  ls //
    public void setMedicineID(String medicineID) {this.medicineID = medicineID;}
    public void setName(String name) {this.name = name;}
    public void setCategory(String category) {this.category = category;}
    public void setMinStockLevel(String minStockLevel) {this.minStockLevel = minStockLevel;}

    public void updateDetails(String name, String category, String minStockLevel) {
        this.name = name;
        this.category = category;
        this.minStockLevel = minStockLevel;
    }

    public String getDetails() {
        return "Medicine ID: " + medicineID + ", Name: " + name + ", Category: " + category + ", Minimum Stock Level: " + minStockLevel;
    }

    // To save file //
    public String toFileString() {
        return medicineID + "," + name + "," + category + "," + minStockLevel;
    }
}
