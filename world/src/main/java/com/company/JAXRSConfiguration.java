package com.company;



import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

/**
 * Configures a JAX-RS endpoint. Delete this class, if you are not exposing
 * JAX-RS resources in your application.
 *
 * @author airhacks.com
 */
//@SecurityScheme(securitySchemeName = "jwt", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "jwt")
//@LoginConfig(authMethod = "MP-JWT", realmName = "MP-JWT")
//@DeclareRoles({"users"})
@ApplicationPath("resources")
@OpenAPIDefinition(info = @Info(
            title = "World Application", 
            version = "1.0.0", 
            contact = @Contact(
                    name = "tss dev", 
                    email = "rodrigo.dasilva@gmail.com",
                    url = "http://ciacformazione.it")
            ),
            servers = {
                @Server(url = "/world",description = "localhost")
            })
public class JAXRSConfiguration extends Application {

}
