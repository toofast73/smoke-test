package tests.users;

import apiObjects.Users;
import com.gurock.testrail.APIException;
import org.json.simple.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import tests.ApiTest;

import java.io.IOException;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.junit.Assert.assertEquals;

/**
 * Created by Vladimir on 17.02.2016.
 */
public class GetUserByEmailTest extends ApiTest {

    //private String EMAIL = "vladimir.kerimoff73@yandex.ru";

    @Test
    public void getUserByEmail() throws APIException, IOException {
        Users users = new Users(client);
        JSONObject user_from_response = users.getUserByEmail(EMAIL);
        //System.out.println(user_from_response);
        //assertTrue(EMAIL.equals(user_from_response.get("EMAIL")));
        //randomAlphabetic(1);
        assertEquals(EMAIL, user_from_response.get("EMAIL"));
    }
}
