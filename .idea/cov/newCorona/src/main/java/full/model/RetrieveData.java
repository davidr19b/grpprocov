package full.model;

import kong.unirest.HeaderNames;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class RetrieveData {


    String response = Unirest.get("https://covid-19-data.p.rapidapi.com/report/country/name?date=2020-12-29&name=Austria")
            .header("x-rapidapi-key", "bc9440d10bmsh49b22a8c0d218c8p1ff48ajsn8a33b561f21a")
            .header("x-rapidapi-host", "covid-19-data.p.rapidapi.com")
            .asString()
            .getBody();

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }


    @Override
    public String toString() {
        return "RetrieveData{" +
                "response=" + response +
                '}';
    }
}