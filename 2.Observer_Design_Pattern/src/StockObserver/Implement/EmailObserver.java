package StockObserver.Implement;

import NotificationObservable.NotificationObservableInterface;
import StockObserver.StockObserverInterface;

public class EmailObserver implements StockObserverInterface {

    private String email;
    private NotificationObservableInterface notificationObservableInterface;

    public EmailObserver(String email, NotificationObservableInterface notificationObservableInterface) {
        this.email = email;
        this.notificationObservableInterface = notificationObservableInterface;
    }

    @Override
    public void update() {
        Integer StockCount = notificationObservableInterface.getStockData();
        System.out.println("Email Message sending to = "+this.email+" we have new stock of "+StockCount);
    }
}
