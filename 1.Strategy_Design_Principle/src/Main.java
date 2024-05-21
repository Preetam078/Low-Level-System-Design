import EnitityTypes.CityBus;
import EnitityTypes.Lamborgini;
import EnitityTypes.TataNexon;

public class Main {
    public static void main(String[] args) {
        System.out.println("......Welcome to vehicle Drive Simulation....");
        CityBus bus = new CityBus();
        bus.getDriveMode();
        Lamborgini avandator = new Lamborgini();
        avandator.getDriveMode();
        TataNexon tataNexon = new TataNexon();
        tataNexon.getDriveMode();
    }
}