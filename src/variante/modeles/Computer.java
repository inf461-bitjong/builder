package variante.modeles;

public class Computer {
    private String processor;
    private int ramMemory;
    private int diskStorage;
    private String graphicsCard;
    private String operatingSystem;
    private boolean hasWifi;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setDiskStorage(int diskStorage) {
        this.diskStorage = diskStorage;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public void displaySpecs() {
        System.out.println("Computer Specifications:");
        System.out.println(" - Processor: " + processor);
        System.out.println(" - RAM: " + ramMemory + " GB");
        System.out.println(" - Storage: " + diskStorage + " GB");
        System.out.println(" - Graphics Card: " + graphicsCard);
        System.out.println(" - Operating System: " + operatingSystem);
        System.out.println(" - Wi-Fi: " + (hasWifi ? "Yes" : "No"));
    }
}
