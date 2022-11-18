/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package client;

import javax.ws.rs.GET;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author HP
 */

//@RegisterRestClient(baseUri = "http://localhost:8080/MSAApp/rest/example")
@RegisterRestClient(configKey = "myclient")
public interface MSAClient {
    
    @GET
    public String SayHello();
    
}
