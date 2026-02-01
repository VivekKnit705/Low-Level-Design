package com.example.low_level_design.FacadeDesignPattern.exp2;

import com.example.low_level_design.FacadeDesignPattern.exp2.model.Invoice;
import com.example.low_level_design.FacadeDesignPattern.exp2.model.Notification;
import com.example.low_level_design.FacadeDesignPattern.exp2.model.Payment;
import com.example.low_level_design.FacadeDesignPattern.exp2.model.ProductDao;

public class OrderFacade {

    ProductDao productDao;
    Payment payment;
    Invoice invoice;
    Notification notification;

    public OrderFacade(){
        this.productDao=new ProductDao();
        this.payment=new Payment();
        this.invoice=new Invoice();
        this.notification=new Notification();
    }

    public void createOrder(){
        productDao.getProduct(111);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();

    }
}
