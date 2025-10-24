public class GamingComputerBuilder implements ComputerBuilder {

    private Computer computer;
    //constructor
    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void setCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void setRam(int ram) {
        computer.setRam(ram);
    }

    @Override
    public void setGpu(String gpu) {
        computer.setGpu(gpu);
    }

    @Override
    public void setDisc(int disc) {
        computer.setDisc(disc);
    }

    @Override
    public void setBluetooth(boolean bluetooth) {
        computer.setHasBluetooth(bluetooth);
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}
