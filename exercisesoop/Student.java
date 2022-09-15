package exercisesoop;

public class Student {
    private int studentCode;
    private String fullName;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(int studentCode, String fullName, String address, String phoneNumber) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Student{" +
                "studentCode =" + studentCode +
                "fullName =" + fullName +
                "address = " + address +
                "phoneNumber =" + phoneNumber +
                "}";
    }

    public void displayInformation() {
        System.out.printf("%-5d %-15s %-15s %-20s \n", studentCode, fullName, address, phoneNumber);
    }
}
