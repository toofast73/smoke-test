package tests;

import apiObjects.Cases;
import com.gurock.testrail.APIException;
import org.json.simple.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Vladimir on 17.02.2016.
 */
public class GetCaseTest extends ApiTest  {





        @Test
        public void getCaseTest() throws APIException, IOException {

            int caseId = 0;

            Cases testCase = new Cases(client);








            JSONObject responseContent = testCase.getCase(caseId);
            System.out.println(responseContent);
        }


    }

