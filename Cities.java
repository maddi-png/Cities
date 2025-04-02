import java.util.HashMap;
/**
 * Write a description of class Cities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cities
{
    public static void main(String[] args) {
        HashMap<String, String> capCities = new HashMap<String, String>();
        capCities.put("New Zealand", "Wellington");
        capCities.put("Australia", "Canberra");
        capCities.put("GRM", "Berlin");
        capCities.put("Norway", "Oslo");
        capCities.put("USA", "Washington");
        
        System.out.println(capCities);
        System.out.println(capCities.get("New Zealand"));
    }
}
