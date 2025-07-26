package api.endpoints;

/**
 * Swagger URL ---> https://petstore.swagger.io/#
 *
 * Create User(post) : https://petstore.swagger.io/#/user/createUsersWithList
 * Get User (Get) :https://petstore.swagger.io/#/user/{username}
 * Update User (put) : https://petstore.swagger.io/#/user/{username}
 * Delete user (Delete) : https://petstore.swagger.io/#/user/{username}
 */

//Routes class work maintain in the url.This class command every url
public class Routes {

    public static String base_url="https://petstore.swagger.io/v2";

    //User module
    public static String post_url=base_url+"/user";
    public static String get_url=base_url+"/user/{username}";
    public static String update_url=base_url+"/user/{username}";
    public static String delete_url=base_url+"/user/{username}";

    //Store module
         //Here you will create Store module URL's
    //Pet module
         //Here you will create Pet module URL's
}
