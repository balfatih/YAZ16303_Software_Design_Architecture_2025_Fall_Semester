public interface ComputerBuilder {

    void setCpu(String cpu);
    void setRam(int ram);
    void setGpu(String gpu);
    void setDisc(int disc);
    void setBluetooth(boolean bluetooth);

    Computer build();

}
