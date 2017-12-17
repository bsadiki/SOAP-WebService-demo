package webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "converstionEuroEnDhs")
    public double convertir(@WebParam(name = "montant") double montant){
        return montant*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*9000);
    }
    @WebMethod
    public List<Compte> compteList(){
        List<Compte> comptes=new ArrayList<>();
        comptes.add(new Compte(1,Math.random()*1000));
        comptes.add(new Compte(2,Math.random()*1000));
        comptes.add(new Compte(3,Math.random()*1000));
        return comptes;
    }
}
