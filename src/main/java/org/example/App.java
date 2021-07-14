package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vertx vertx = Vertx.vertx();    

        HttpServer server = vertx.createHttpServer();

        Router router = Router.router( vertx );

        router.route().handler( 
            
            RoutingContext ->{
                routingContext.respose() = routingContext.response();
                response.putHeader("content-type","text/plain");
                response.end("Hello World!");

            }
         );

    }
}
