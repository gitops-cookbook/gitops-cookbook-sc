package org.acme;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;


@Path("/bubble")
public class BubbleResource {
   
    @ConfigProperty(name = "color", defaultValue = "blue")
    String color;

    @GET
    public JsonObject bubble() {
        JsonObjectBuilder color = Json
                                    .createObjectBuilder()
                                    .add("color", this.color);
        return color.build();
    }

}