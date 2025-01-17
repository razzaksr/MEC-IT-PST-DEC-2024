package mybank.zealous;

public class Customer {
    private String fullName;
    private String pan;
    private long contactNumber;
    private long aadhaar;
    @Override
    public String toString() {
        return "Customer {\nfullName=" + fullName + ",\n pan=" + pan + ",\n contactNumber=" + contactNumber + ",\n aadhaar="
                + aadhaar + "\n}\n";
    }
    public Customer() {
    }
    public Customer(String fullName, String pan, long contactNumber, long aadhaar) {
        this.fullName = fullName;
        this.pan = pan;
        this.contactNumber = contactNumber;
        this.aadhaar = aadhaar;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPan() {
        return pan;
    }
    public void setPan(String pan) {
        this.pan = pan;
    }
    public long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
    public long getAadhaar() {
        return aadhaar;
    }
    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }
}
