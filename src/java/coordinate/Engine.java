package java.coordinate;

import java.util.List;
import java.util.Map;

public class Engine {

    public void positionAssertion(List<Map<String, String>> assertedData) {
        List<PropertyIdentity> assertedIdentity = PropertyIdentity.toAssertedOrder(assertedData);
        print(assertedIdentity);
    }

    private static void print(List<PropertyIdentity> list) {
        for(PropertyIdentity property : list) {
            System.out.println(property);
        }
    }
}
