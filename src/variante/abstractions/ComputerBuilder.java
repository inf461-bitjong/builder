package variante.abstractions;

import variante.modeles.Computer;

public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public Computer getComputer() {
        return computer;
    }

    public abstract ComputerBuilder withProcessor(String processor);

    public abstract ComputerBuilder withRamMemory(int ramMemory);

    public abstract ComputerBuilder withDiskStorage(int diskStorage);

    public abstract ComputerBuilder withGraphicsCard(String graphicsCard);

    public abstract ComputerBuilder withOperatingSystem(String operatingSystem);

    public abstract ComputerBuilder withWifi(boolean hasWifi);
}
