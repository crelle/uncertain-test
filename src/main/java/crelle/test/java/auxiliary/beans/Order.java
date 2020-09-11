package crelle.test.java.auxiliary.beans;

import java.util.List;

/**
 * @author:crelle
 * @className:Orders
 * @version:1.0.0
 * @date:2020/8/15
 * @description:XX
 **/
public class Order {

    private String orderId;

    private String orderName;

    private String money;

    private List<Order> subOrder;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public List<Order> getSubOrder() {
        return subOrder;
    }

    public void setSubOrder(List<Order> subOrder) {
        this.subOrder = subOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", money='" + money + '\'' +
                ", subOrder=" + subOrder +
                '}';
    }
}
