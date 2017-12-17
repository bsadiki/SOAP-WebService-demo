package webService;

import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        String url="http://localhost:4567/" ;
        Endpoint.publish(url,new BanqueService());
    }
}