package org.example.infrastructure.data;

public class RemoteUserDataMapper extends AbstractUserDataMapper {

    public RemoteUserDataMapper() {

        String url = "http://myusersservice.com";
        // okHTTTP
        // HTTP GET CALL ==> Response
        // Response.getBody
        // JSONOBJECT json = new JSONOBJECT(body);
        // JSONARRAY users = JSONObject.getArray("users")

        // jackson-databind ? jackson-core ? jackson-annotations
        // ObjectMapper = new ObjectMapper();
        // User users = mapper.readValue(body, Users.class).getUsers();
    }
}
