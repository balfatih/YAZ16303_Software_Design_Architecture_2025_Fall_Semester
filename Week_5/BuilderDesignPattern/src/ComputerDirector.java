public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer constructGamingComputer() {
        computerBuilder.setCpu("Intel i9 14th 14900");
        computerBuilder.setGpu("RTX 4060");
        computerBuilder.setDisc(2000);
        computerBuilder.setRam(64);
        computerBuilder.setBluetooth(true);

        return computerBuilder.build();
    }

    public Computer constructOfficeComputer() {
        computerBuilder.setCpu("Intel i7 14th 14900");
        computerBuilder.setGpu("RTX 1040");
        computerBuilder.setDisc(512);
        computerBuilder.setRam(8);
        computerBuilder.setBluetooth(true);

        return computerBuilder.build();
    }
}
