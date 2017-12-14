import javax.json.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("/ftocservice")
public class FtoCService {

    @GET
    @Produces("application/json")
    public Response convertFtoC() throws JSONException {
        JsonArray jsonArray = new JsonArray() {
            public JsonObject getJsonObject(int i) {
                return null;
            }

            public JsonArray getJsonArray(int i) {
                return null;
            }

            public JsonNumber getJsonNumber(int i) {
                return null;
            }

            public JsonString getJsonString(int i) {
                return null;
            }

            public <T extends JsonValue> List<T> getValuesAs(Class<T> aClass) {
                return null;
            }

            public String getString(int i) {
                return null;
            }

            public String getString(int i, String s) {
                return null;
            }

            public int getInt(int i) {
                return 0;
            }

            public int getInt(int i, int i1) {
                return 0;
            }

            public boolean getBoolean(int i) {
                return false;
            }

            public boolean getBoolean(int i, boolean b) {
                return false;
            }

            public boolean isNull(int i) {
                return false;
            }

            public int size() {
                return 0;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean contains(Object o) {
                return false;
            }

            public Iterator<JsonValue> iterator() {
                return null;
            }

            public Object[] toArray() {
                return new Object[0];
            }

            public <T> T[] toArray(T[] a) {
                return null;
            }

            public boolean add(JsonValue jsonValue) {
                return false;
            }

            public boolean remove(Object o) {
                return false;
            }

            public boolean containsAll(Collection<?> c) {
                return false;
            }

            public boolean addAll(Collection<? extends JsonValue> c) {
                return false;
            }

            public boolean addAll(int index, Collection<? extends JsonValue> c) {
                return false;
            }

            public boolean removeAll(Collection<?> c) {
                return false;
            }

            public boolean retainAll(Collection<?> c) {
                return false;
            }

            public void clear() {

            }

            public JsonValue get(int index) {
                return null;
            }

            public JsonValue set(int index, JsonValue element) {
                return null;
            }

            public void add(int index, JsonValue element) {

            }

            public JsonValue remove(int index) {
                return null;
            }

            public int indexOf(Object o) {
                return 0;
            }

            public int lastIndexOf(Object o) {
                return 0;
            }

            public ListIterator<JsonValue> listIterator() {
                return null;
            }

            public ListIterator<JsonValue> listIterator(int index) {
                return null;
            }

            public List<JsonValue> subList(int fromIndex, int toIndex) {
                return null;
            }

            public ValueType getValueType() {
                return null;
            }
        };

        Double fahrenheit = 98.24;
        Double celsius;
        celsius = (fahrenheit - 32)*5/9;
        jsonArray.put("F Value", fahrenheit);
        jsonArray.put("C Value", celsius);

        String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
        return Response.status(200).entity(result).build();
    }

//    @Path("{f}")
//    @GET
//    @Produces("application/json")
//    public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
//
//        JSONObject jsonObject = new JSONObject();
//        float celsius;
//        celsius =  (f - 32)*5/9;
//        jsonObject.put("F Value", f);
//        jsonObject.put("C Value", celsius);
//
//        String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
//        return Response.status(200).entity(result).build();
//    }
}