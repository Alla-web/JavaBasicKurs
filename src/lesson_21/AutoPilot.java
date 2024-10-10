package lesson_21;

public class AutoPilot {
    private String softwareVersion;
    private Autobus autobus; // двунаправленность связи

    // constructor
    public AutoPilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    //getter
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    //setter
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    // method
    public String toString() {
        return "Autopilot: {SV: " + softwareVersion + "}";
    }
}
