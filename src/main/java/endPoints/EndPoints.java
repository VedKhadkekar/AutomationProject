package endPoints;
import payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Locale;
import java.util.ResourceBundle;

import static io.restassured.RestAssured.*;

/*
created to perform the CRUD operations
create, read/get, update, delete
*/
public class EndPoints {

    public static ResourceBundle config(){
        ResourceBundle resourceBundle =ResourceBundle.getBundle("BaseURL.properties", Locale.US); //load the properties file
        return resourceBundle;
    }

    public static Response createUser(User user){
        Response response =
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(user)
       .when()
                .post(BaseURL.create_user);
                //.post(config().getString("create_user"));
        return response;
    }

    public static Response getUser(String username){
        Response response =
                given()
                        .pathParam("username",username)
               .when()
                        //.get(config().getString("get_user"));
                        .get(BaseURL.get_user);
        return response;
    }

    public static Response updateUser(User user, String username){
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .pathParam("username",username)
                        .body(user)
               .when()
                        //.put(config().getString("update_user"));
                        .put(BaseURL.update_user);
        return response;
    }

    public static Response deleteUser(String username){
        Response response =
                given()
                        .pathParam("username",username)
               .when()
                        //.delete(config().getString("delete_user"));
                        .delete(BaseURL.delete_user);
        return response;
    }
}
