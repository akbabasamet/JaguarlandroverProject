package pages;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojo.JaguarCategoryPojo;
import pojo.JaguarPojo;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class JaguarAPIPage {

    public static RequestSpecification goBaseUrl() {
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/v2").build();
        spec.pathParams("first", "pet");
        return spec;
    }

    public static JaguarPojo expectedData() {
        JaguarCategoryPojo category = new JaguarCategoryPojo("Dog");
        JaguarPojo expectedData = new JaguarPojo(50, category, "Bobo");
        return expectedData;
    }

    public static Response postReguest() {
        Response response = given().spec(goBaseUrl()).contentType(ContentType.JSON).body(expectedData()).when().post("/{first}");
        response.prettyPrint();
        return response;
    }

    public static void statusCode() {
        postReguest().then().assertThat().statusCode(200);
    }

    public static void assertion() throws IOException {

        ObjectMapper objMap = new ObjectMapper();
        JaguarPojo actualData = objMap.readValue(postReguest().asString(), JaguarPojo.class);

        Assert.assertEquals(expectedData().getId(), actualData.getId());
        Assert.assertEquals(expectedData().getName(), actualData.getName());
    }


}
