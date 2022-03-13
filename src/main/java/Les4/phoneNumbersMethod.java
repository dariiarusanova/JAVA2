package Les4;

import java.util.HashMap;
import java.util.Map;

public class phoneNumbersMethod {
    public static void Method(){
        HashMap<String,String> phoneNumbers = new HashMap();
        phoneNumbers.put("mom","79164654");
        phoneNumbers.put("dad","789745644");
        phoneNumbers.put("grandma","456451");
        phoneNumbers.put("grandpa","843151");
        phoneNumbers.put("sister","7894123");
        phoneNumbers.put("brother","971321");
        phoneNumbers.put("uncle","999975");
        phoneNumbers.put("unt","9718321");
        phoneNumbers.put("stepsister","777845");
        String s = phoneNumbers.get("dad");
        System.out.println("Номер папы "+ s);
        System.out.println("*****************");
        for (Map.Entry<String,String> entry : phoneNumbers.entrySet()){
            System.out.println("Контактное лицо " + entry.getKey());
            System.out.println("Номер телефона " + entry.getValue());
        }

    }
}
