package variante;

import variante.builders.CustomComputerBuilder;
import variante.modeles.Computer;

public class Configurator {
    public Computer buildGamingComputer() {
        return new CustomComputerBuilder()
                .withProcessor("Intel Core i9-14900K")
                .withRamMemory(64)
                .withDiskStorage(2000)
                .withGraphicsCard("NVIDIA RTX 4090")
                .withOperatingSystem("Windows 11 Pro")
                .withWifi(true)
                .getComputer();
    }

    public Computer buildOfficeComputer() {
        return new CustomComputerBuilder()
                .withProcessor("Intel Core i5-13400")
                .withRamMemory(16)
                .withDiskStorage(512)
                .withGraphicsCard("Intel UHD Graphics")
                .withOperatingSystem("Ubuntu 24.04 LTS")
                .withWifi(false)
                .getComputer();
    }
}
