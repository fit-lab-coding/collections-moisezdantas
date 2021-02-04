package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {

    public static Map<String, Boolean>  random (int quantity, int percent){

        int result = (quantity * percent) / 100;

        Map<String, Boolean> listUser = new HashMap<>();

        for(int i =0; i < result; i++){
            listUser.put("user"+Math.random() , true);
        }
        for(int j =0; j < quantity - result; j++){
            listUser.put("user"+Math.random() , false);
        }

        return listUser;
    }
}
