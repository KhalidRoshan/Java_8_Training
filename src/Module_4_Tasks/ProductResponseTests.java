package Module_4_Tasks;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ProductResponseTests {

    public static void main(String[] args) {

        Response response1 = new Response("Response 1 Body", 501, "json");
        Response response2 = new Response("Response 2 Body", 200, "xml");
        Response response3 = new Response("Response 3 Body", 400, "json");
        Response response4 = new Response("Response 4 Body", 400, "xml");
        Response response5 = new Response("Response 5 Body", 201, "json");

        ArrayList<Response> responsesList = new ArrayList<Response>();
        responsesList.add(response1);
        responsesList.add(response2);
        responsesList.add(response3);
        responsesList.add(response4);
        responsesList.add(response5);

        Predicate<Response> responsesWithCode400 = i -> {
            return i.statusCode == 400;
        };

        Predicate<Response> responsesWithTypeJson = i -> {
            return i.responseType.equals("json");
        };

        //6. Print all the responses with status code 400 from the given list of responses.

        System.out.println("------------------------");

        fetchResponseWithCode(responsesWithCode400, responsesList);

        //7.  Print all the responses the response type JSON from the given list of responses.

        System.out.println("------------------------");

        fetchResponseWithType(responsesWithTypeJson, responsesList);

        //8. Print all the responses with status code 400 and response type JSON

        System.out.println("------------------------");

        fetchResponseWithCode(responsesWithCode400.and(responsesWithTypeJson), responsesList);

        //9. Print all the responses with status code 400 or response type JSON

        System.out.println("------------------------");

        fetchResponseWithCode(responsesWithCode400.or(responsesWithTypeJson), responsesList);

        //10. Print all the responses with status code is not 400 and response type JSON

        System.out.println("------------------------");

        fetchResponseWithCode(responsesWithCode400.negate().and(responsesWithTypeJson), responsesList);

    }

    public static void fetchResponseWithCode(Predicate<Response> codePredicate, ArrayList<Response> responseList) {
        for (Response response : responseList) {
            if (codePredicate.test(response)) {
                System.out.println("Response Code: " + response.getStatusCode() + " | Response Type : " + response.getResponseType() + " | Response Body : " + response.getResponseBody());
            }

        }
    }

    public static void fetchResponseWithType(Predicate<Response> typePredicate, ArrayList<Response> responseList) {
        for (Response response : responseList) {
            if (typePredicate.test(response)) {
                System.out.println("Response Code: " +response.getStatusCode() + " | Response Type : " + response.getResponseType() + " | Response Body :" + response.getResponseBody());
            }

        }
    }
}
