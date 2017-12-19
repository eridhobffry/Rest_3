import javax.json.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("myresourceint")
public class PrimZahlenServiceIntArray {

//    @GET
//    @Path("ping")
//    public String getServerTime() {
//        System.out.println("RESTful Service 'MessageService' is running ==> ping");
//        return "received ping on " + new Date().toString();
//    }



    @Path("{zahl}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPrimZahlArray(@PathParam("zahl") Integer zahl) throws Exception {
        PrimZahlArrayInter prim = new PrimZahlArrayImpl();
        int[] result;
        result = prim.primZahlArray(zahl);

        return Response.status(200).entity(result).build();
    }

}
