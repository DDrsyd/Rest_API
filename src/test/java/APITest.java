import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;




public class APITest {
    @Test
    void test1(){
        Response response = get("https://demoqa.com/BookStore/v1/Books");
        System.out.println("Response :"+response.asString());
        System.out.println("Status Code :"+response.getStatusCode());
        System.out.println("Time Taken :"+response.getTime());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
    @Test
    void test2(){
        given().get("https://demoqa.com/BookStore/v1/Books").
                then().
                statusCode(200);
    }
}
