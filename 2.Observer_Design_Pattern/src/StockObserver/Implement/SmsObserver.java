package StockObserver.Implement;

import NotificationObservable.NotificationObservableInterface;
import StockObserver.StockObserverInterface;

public class SmsObserver implements StockObserverInterface {

    private String SmsNumber;
    private NotificationObservableInterface notificationObservableInterface;

    public SmsObserver(String smsNumber, NotificationObservableInterface notificationObservableInterface) {
        this.SmsNumber = smsNumber;
        this.notificationObservableInterface = notificationObservableInterface;
    }

    @Override
    public void update() {
        Integer StockCount = notificationObservableInterface.getStockData();
        System.out.println("Phone Message sending to = "+this.SmsNumber+" we have new stock of "+StockCount);
    }
}
