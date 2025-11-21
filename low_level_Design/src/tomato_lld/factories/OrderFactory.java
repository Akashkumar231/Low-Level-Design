package tomato_lld.factories;


import tomato_lld.models.*;
import tomato_lld.strategy.PaymentStrategy;

import java.util.List;

public interface OrderFactory {
    Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems,
                      PaymentStrategy paymentStrategy, double totalCost, String orderType);
}