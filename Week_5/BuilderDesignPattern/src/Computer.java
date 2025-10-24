//PRODUCT (Ürün) SINIFI

public class Computer {
    private String cpu;
    private int ram;
    private String gpu;
    private int disc;
    private boolean hasBluetooth;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    public boolean getHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public String toString(){
        return "Computer {" +
                "cpu = " + cpu +
                "ram = " + ram +
                "gpu = " + gpu +
                "disc =" + disc +
                "bluetooth = " + hasBluetooth +
                "}";
    }
}
