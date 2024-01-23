package org.example.observer.notificationmanage;

public class NotificationManager implements PaymentListener {
    private void sendNotification(){
        System.out.println("Notification sent");
    }

    @Override
    public void paymentMade() {
        sendNotification();
    }



}
