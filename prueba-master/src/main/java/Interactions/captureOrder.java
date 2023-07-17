package Interactions;

import Models.orderModel;
import Models.supportModel;

import java.util.ResourceBundle;

public class captureOrder {
    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
            return ResourceBundle.getBundle("data.order");
        }
    }

    public static String getCaptureOrder(String keys) {

        return resourceBundle().getString(keys);
    }

    public static orderModel order() {
        orderModel orderModel1 = new orderModel();
        orderModel1.setOrderInputV(captureOrder.getCaptureOrder("data.order"));
    return orderModel1;


    }
}