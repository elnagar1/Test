package Dashboard.US14598.TestCases.ViewModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JsonDataReader {


    static List<JSONObject> listA = null;

    private static List getUser(JSONObject obj) throws IOException, ParseException {
        List list = new ArrayList();
        list.add(obj.get("firstname"));
        list.add(obj.get("lastname"));
        list.add(obj.get("email"));
        list.add(obj.get("password"));
        return list;
    }

    public static List<JSONObject> readJsonAsList() throws IOException, ParseException {

        String filePath = System.getProperty("user.dir") + "/src/main/java/Dashboard/USE14599/TestData/UserData.json";
        File srcFile = new File(filePath);
        JSONParser jsonParser = new JSONParser();
        JSONArray jarray = (JSONArray) jsonParser.parse(new FileReader(srcFile));

        listA = new ArrayList<>();

        for (Object jsonObj : jarray) {

            listA.add((JSONObject) jsonObj);

        }

        return listA;
    }


    public static Object[][] readJsonAsDataProvider() throws IOException, ParseException {
        readJsonAsList();
        Object[][] arrayData = new Object[listA.size()][listA.get(0).size()];
        List userlist;

        for (int i = 0; i < listA.size(); i++) {
            userlist = getUser(listA.get(i));
            for (int j = 0; j < listA.get(0).size(); j++) {
                System.out.println(userlist.get(j));
                arrayData[i][j] = userlist.get(j);
            }
        }

        return arrayData;
    }

}
