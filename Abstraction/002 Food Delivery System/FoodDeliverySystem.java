// Abstract Class
abstract class Restaurant {
    abstract void placeOrder();
    abstract void prepareFood();
    abstract void estimateDeliveryTime();
}

// Fast Food
class FastFoodRestaurant extends Restaurant {

    void placeOrder() {
        System.out.println("Fast Food Order Placed");
    }

    void prepareFood() {
        System.out.println("Preparing fast food using pre-cooked items");
    }

    void estimateDeliveryTime() {
        System.out.println("Delivery Time: 20 minutes");
    }
}

// Traditional Food
class TraditionalRestaurant extends Restaurant {

    void placeOrder() {
        System.out.println("Traditional Food Order Placed");
    }

    void prepareFood() {
        System.out.println("Cooking fresh traditional food");
    }

    void estimateDeliveryTime() {
        System.out.println("Delivery Time: 45 minutes");
    }
}

// Dessert Shop
class DessertShop extends Restaurant {

    void placeOrder() {
        System.out.println("Dessert Order Placed");
    }

    void prepareFood() {
        System.out.println("Preparing and decorating desserts");
    }

    void estimateDeliveryTime() {
        System.out.println("Delivery Time: 30 minutes");
    }
}

// Main Class
public class FoodDeliverySystem {
    public static void main(String[] args) {

        Restaurant fastFood = new FastFoodRestaurant();
        Restaurant traditional = new TraditionalRestaurant();
        Restaurant dessert = new DessertShop();

        System.out.println("---- Fast Food ----");
        fastFood.placeOrder();
        fastFood.prepareFood();
        fastFood.estimateDeliveryTime();

        System.out.println("\n---- Traditional Food ----");
        traditional.placeOrder();
        traditional.prepareFood();
        traditional.estimateDeliveryTime();

        System.out.println("\n---- Dessert ----");
        dessert.placeOrder();
        dessert.prepareFood();
        dessert.estimateDeliveryTime();
    }
}