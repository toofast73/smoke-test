package tests.users;

import apiObjects.Users;
import com.gurock.testrail.APIException;
import org.json.simple.JSONObject;
import org.junit.Test;
import tests.ApiTest;

import java.io.IOException;

/**
 * Created by Vladimir on 17.02.2016.
 */
public class GetUserTest extends ApiTest {

    @Test
    public void getUser() throws APIException, IOException {
        Users users = new Users(client);
        JSONObject user = users.getUser(1);
        System.out.println(user);

    }
}
