import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CityListSingleton {

    private static CityListSingleton instance;

    public static CityListSingleton getInstance() {
        if (instance == null) {
            instance = new CityListSingleton();
        }

        return instance;
    }

    Date date =  new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    String timeString = sdf.format(date);

    public List<City> getCities() {
        System.out.println("Getting cities... Please wait...");

        try {
            Thread.sleep(2000);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        System.out.println(timeString);
        List<City> cities = new ArrayList<>();
        cities.add(new City("Kırklareli"));
        cities.add(new City("Ankara"));
        cities.add(new City("İstanbul"));

        return cities;
    }

}
