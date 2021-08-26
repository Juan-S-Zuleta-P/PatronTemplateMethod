package co.unicauca.restaurant.server.app;

import co.unicauca.restaurant.server.infra.ServerSocketRestaurant;

/**
 *
 * @author Juanc
 */
public class RestaurantApplication {

    /**
     * Clase principal que inicializa el servidor
     *
     * @param args
     */
    public static void main(String args[]) {
        ServerSocketRestaurant server = new ServerSocketRestaurant();
        server.startServer();
    }
}
