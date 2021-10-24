import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestData {

    public List<Map<String, String>> generate() {

        List<Map<String, String>> maps = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>() {{
            put("tradeId", "3212");
            put("creationDate", "2020.06.01");
            put("swapId", "32062");
            put("price", "21");
            put("quantity", "600");
            put("commission", "3");
        }};

        Map<String, String> map2 = new HashMap<>() {{
            put("tradeId", "3232");
            put("creationDate", "2020.03.01");
            put("swapId", "32032");
            put("price", "23");
            put("quantity", "300");
            put("commission", "2");
        }};

        Map<String, String> map3 = new HashMap<>() {{
            put("tradeId", "5231");
            put("creationDate", "2019.05.23");
            put("swapId", "32051");
            put("price", "23");
            put("quantity", "500");
            put("commission", "2");
        }};

        Map<String, String> map4 = new HashMap<>() {{
            put("tradeId", "6452");
            put("creationDate", "2024.02.13");
            put("swapId", "34022");
            put("price", "45");
            put("quantity", "200");
            put("commission", "4");
        }};

        Map<String, String> map5 = new HashMap<>() {{
            put("tradeId", "6542");
            put("creationDate", "2021.02.17");
            put("swapId", "35022");
            put("price", "54");
            put("quantity", "200");
            put("commission", "5");
        }};

        Map<String, String> map6 = new HashMap<>() {{
            put("tradeId", "8358");
            put("creationDate", "2021.03.02");
            put("swapId", "33038");
            put("price", "35");
            put("quantity", "300");
            put("commission", "3");
        }};

        Map<String, String> map7 = new HashMap<>() {{
            put("tradeId", "2369");
            put("creationDate", "2019.02.18");
            put("swapId", "33029");
            put("price", "36");
            put("quantity", "200");
            put("commission", "3");
        }};

        Map<String, String> map8 = new HashMap<>() {{
            put("tradeId", "3212");
            put("creationDate", "2020.06.01 ");
            put("swapId", "32062");
            put("price", "21");
            put("quantity", "600");
            put("commission", "2");
        }};

        Map<String, String> map9 = new HashMap<>() {{
            put("tradeId", "3212");
            put("creationDate", "2020.06.01 ");
            put("swapId", "32062");
            put("price", "21");
            put("quantity", "600");
            put("commission", "2");
        }};

        Map<String, String> map10 = new HashMap<>() {{
            put("tradeId", "3211");
            put("creationDate", "2020.06.01 ");
            put("swapId", "32062");
            put("price", "21");
            put("quantity", "600");
            put("commission", "2");
        }};

        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        maps.add(map4);
        maps.add(map5);
        maps.add(map6);
        maps.add(map7);
        maps.add(map8);
        maps.add(map9);
        maps.add(map10);

        return maps;


    }
}
