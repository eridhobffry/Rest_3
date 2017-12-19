import javax.json.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("myressourceint")
public class PrimZahlenServiceIntArray {

//    @GET
//    @Path("ping")
//    public String getServerTime() {
//        System.out.println("RESTful Service 'MessageService' is running ==> ping");
//        return "received ping on " + new Date().toString();
//    }



    @Path("{zahl}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int [] getPrimZahlArray(@PathParam("zahl") int zahl) throws Exception {
        PrimZahlArrayInter prim =new PrimZahlArrayImpl();
        int[] result;
        result = prim.primZahlArray(zahl);

        return result;
    }

}
