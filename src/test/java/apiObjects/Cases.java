package apiObjects;

import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Vladimir on 17.02.2016.
 */
public class Cases extends ApiObject {


    public Cases(APIClient client){
        super(client);

    }

    public JSONObject getCase(int case_id) throws APIException, IOException {
        String getCase_uri = "";
        return (JSONObject) client.sendGet(getCase_uri);
    }

    public JSONObject addCase(Map data, int sectionId) throws APIException, IOException {
        String addCase_uri = "";
        return (JSONObject) client.sendPost(addCase_uri+sectionId,data);
    }



}
