package variante.builders;

import variante.abstractions.ComputerBuilder;

public class CustomComputerBuilder extends ComputerBuilder {
    @Override
    public ComputerBuilder withProcessor(String processor) {
        computer.setProcessor(processor);
        return this;
    }

    @Override
    public ComputerBuilder withRamMemory(int ramMemory) {
        computer.setRamMemory(ramMemory);
        return this;
    }

    @Override
    public ComputerBuilder withDiskStorage(int diskStorage) {
        computer.setDiskStorage(diskStorage);
        return this;
    }

    @Override
    public ComputerBuilder withGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    @Override
    public ComputerBuilder withOperatingSystem(String operatingSystem) {
        computer.setOperatingSystem(operatingSystem);
        return this;
    }

    @Override
    public ComputerBuilder withWifi(boolean hasWifi) {
        computer.setHasWifi(hasWifi);
        return this;
    }
}
