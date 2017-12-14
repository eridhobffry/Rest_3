package main.java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author eridhobuffery
 */
@Path("myresourcestring")
public class PrimZahlenServiceString {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        // Grenze bis zu der Primzahlen gesucht werden
        int n = 10;
        StringBuilder primZahl = new StringBuilder();
        // beginne bei der Zahl 2 da 1 keine Primzahl ist
        for (int i = 2; i <= n; i++) {
            // isPrimzahl ist ein Wahrheitswert, um zu überprüfen ob wir eine
            // Primzahl gefunden haben. falls nicht wird sie später auf false
            // gesetzt.
            boolean isPrimzahl = true;
            // i durch jede Zahl kleiner als i zu teilen und zu überprüfen, ob
            // ein Rest übrig bleibt. BSP. im wiki 25=i und j wäre die Variable
            // die hochgezählt wird
            for (int j = 2; j < i && isPrimzahl; j++) {
                // Wenn eine division als rest 0 hat dann ist die Zahl keine
                // Primzahl und somit ist isPrimzahl auf false zu setzten
                if ((i % j) == 0) {
                    isPrimzahl = false;
                }
            }
            // gib eine Meldung aus falls es sich um eine Primzahl handelt.
            if (isPrimzahl) {
                primZahl.append(i + " -- ");
            }
        }
        String result = "@Produces(\"application/xml\") Output: \n\nPrim\n\n" + primZahl;
        return "<Primzahlen>" + "<Zahl>" + 10 + "</Zahl>" + "<output>" + result + "</output>" + "</primzahlen>";
    }

    }