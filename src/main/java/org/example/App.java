package org.example;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

/**
 * Hello world!
 *
 */
public class App 
{
    //vertx server setup   
    public static void main( String[] args )
    {
        Vertx vertx = Vertx.vertx();    

        HttpServer server = vertx.createHttpServer();

        Router router = Router.router( vertx );

        Route Handler1 = router.post("/hello").handler( 
            
            routingContext ->{
                System.out.println( "Request received: " + routingContext.request().path() );
                HttpServerResponse response = routingContext.response();
                response.setChunked(true);
                response.write("hello nitrwek");
                response.end();
            }
         ); 
         server
            .requestHandler(router)
            .listen( 8090 );
    }
}
