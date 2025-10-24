//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ComputerBuilder builder = new GamingComputerBuilder();

        ComputerDirector director = new ComputerDirector(builder);

        Computer gamingPC = director.constructGamingComputer();
        System.out.println(gamingPC);

        Computer officePC = director.constructOfficeComputer();
        System.out.println(officePC);
    }
}