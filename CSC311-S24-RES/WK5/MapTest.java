import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MapTest {
	public static void main(String[] args) {
		
		Map<String, String> car1 = new HashMap<String, String>();
        
        car1.put("Make", "Toyota");
        car1.put("Model", "Camry");
        car1.put("Color", "Red");
        
        Map<String, String> car2 = new HashMap<String, String>();
        
        car2.put("Make", "Tesla");
        car2.put("Model", "Model 3");
        car2.put("Color", "Blue");

        
        List <Map> cars = new ArrayList<Map>();
        
        cars.add(car1);
        cars.add(car2);
        
        
        System.out.println(cars);
   
	}

}
