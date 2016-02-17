package apiObjects;

import com.gurock.testrail.APIClient;

/**
 * Created by Vladimir on 17.02.2016.
 */
public abstract class ApiObject {

    public APIClient client;
/*
    public String HOSTNAME;
    public String apiFunction;
*/

    public ApiObject(APIClient client) {
        setClient(client);
    }

    public void setClient(APIClient client) {
        this.client = client;
    }
}
