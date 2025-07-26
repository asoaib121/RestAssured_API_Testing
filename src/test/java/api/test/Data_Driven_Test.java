package api.test;

import api.endpoints.UserEndPoints2;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Data_Driven_Test {

    @Test(priority = 1, dataProvider ="Data", dataProviderClass = DataProviders.class)
    public void testPostUser(String userID, String userName, String fname, String lname, String useremail, String pwd, String ph){

      User userPayload= new User();

        userPayload.setId(Integer.parseInt(userID));
        userPayload.setUsername(userName);
        userPayload.setFirstName(fname);
        userPayload.setLastName(lname);
        userPayload.setEmail(useremail);
        userPayload.setPassword(pwd);
        userPayload.setPhone(ph);

        Response response=UserEndPoints2.createUser(userPayload);
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test(priority = 2, dataProvider = "UserNames", dataProviderClass=DataProviders.class)
    public void testDeleteUserByName(String userName){

        Response response=UserEndPoints2.deleteUser(userName);
        Assert.assertEquals(response.getStatusCode(),200);
    }
}