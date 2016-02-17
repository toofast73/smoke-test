package apiObjects;

import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by Vladimir on 17.02.2016.
 */
public class Users extends ApiObject {


    public Users(APIClient client) {
        super(client);
    }

    public JSONArray getUsers() throws APIException, IOException {
        return (JSONArray) client.sendGet("get_users");
    }

    public JSONObject getUser(int user_id) throws APIException, IOException {

        String url = String.format("get_user/%s", user_id);
        return (JSONObject) client.sendGet(url);
    }

    public JSONObject getUserByEmail(String email) throws APIException, IOException {

        String url = String.format("get_user_by_email/&email=%s", email);
        return (JSONObject) client.sendGet(url);
    }

}
