package tests.users;

import apiObjects.Users;
import com.gurock.testrail.APIException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;
import tests.ApiTest;

import java.io.IOException;

/**
 * Created by Vladimir on 17.02.2016.
 */
public class GetUsersTest extends ApiTest {

    @Test
    public void getUsersTest() throws APIException, IOException {

        Users users = new Users(client);
        JSONArray usersFromResponse = users.getUsers();

        JSONObject first_user = (JSONObject) usersFromResponse.get(0);

        //System.out.println(usersFromResponse);
        //System.out.println(first_user);
        //System.out.println(first_user.get("name"));

    }
}
