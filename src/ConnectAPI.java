import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class ConnectAPI {

	public static void main(String[] args) {

		try {	
            // create HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // create HttpRequest for GET Method
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/ability/1/")) // URL of API 
                .GET() // defind Method is GET
                .build();

            // send Request and received Response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // out put from API
            System.out.println("Response Code : " + response.statusCode());
            ArrayList<String> resultList = new ArrayList();
            resultList.add(response.body());
            System.out.println(resultList);


        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
