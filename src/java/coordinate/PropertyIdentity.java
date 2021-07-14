package java.coordinate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PropertyIdentity {
    private String name;
    private BigDecimal fee;
    private BigDecimal quantity;
    private BigDecimal value;

    public PropertyIdentity(String name, BigDecimal fee, BigDecimal quantity, BigDecimal value) {
        this.name = name;
        this.fee = fee;
        this.quantity = quantity;
        this.value = value;
    }

    public static List<PropertyIdentity> toAssertedOrder(List<Map<String, String>> data) {
        List<PropertyIdentity> assertedProperties = new ArrayList<>();

        for (Map<String, String> assertedProperty : data) {
            assertedProperties.add(toProperty(assertedProperty));
        }

        return assertedProperties;
    }

    public static PropertyIdentity toProperty (Map<String, String> properties) {
        String name = properties.get("Name");
        BigDecimal fee = new BigDecimal(properties.get("Fee"));
        BigDecimal quantity = new BigDecimal(properties.get("Quantity"));
        BigDecimal value = new BigDecimal(properties.get("Value"));

        return new PropertyIdentity(name, fee, quantity, value);
    }

    @Override
    public String toString() {
        return "PropertyIdentity{" +
                "name='" + name + '\'' +
                ", fee=" + fee +
                ", quantity=" + quantity +
                ", value=" + value +
                '}';
    }
}
