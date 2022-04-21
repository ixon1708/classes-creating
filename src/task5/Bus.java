package task5;

public class Bus {

    private int number;
    private int trackNumber;
    private String brand;
    private int startExploitationYear;
    private int mileage;

    public Bus(int number, int trackNumber, String brand, int startExploitationYear, int mileage) {
        this.number = number;
        this.trackNumber = trackNumber;
        this.brand = brand;
        this.startExploitationYear = startExploitationYear;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "number=" + number +
                ", trackNumber=" + trackNumber +
                ", brand='" + brand + '\'' +
                ", startExpluatationYear=" + startExploitationYear +
                ", mileage=" + mileage +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStartExploitationYear() {
        return startExploitationYear;
    }

    public void setStartExploitationYear(int startExploitationYear) {
        this.startExploitationYear = startExploitationYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
