package NotificationObservable.Implement;

import NotificationObservable.NotificationObservableInterface;
import StockObserver.StockObserverInterface;

import java.util.ArrayList;

public class SamsungObservable implements NotificationObservableInterface {
    private ArrayList<StockObserverInterface>observers;
    private int Stock;

    public SamsungObservable(){
        observers = new ArrayList<StockObserverInterface>();
        Stock = 0;
    }

    @Override
    public void addObserver(StockObserverInterface stockObserverInterface) {
        observers.add(stockObserverInterface);
    }

    @Override
    public void removeObserver(StockObserverInterface stockObserverInterface) {
        observers.remove(stockObserverInterface);
    }

    @Override
    public void notifyObserver() {
        for(StockObserverInterface eachObserver : observers) {
            eachObserver.update();
        }
    }

    @Override
    public void setData(Integer newStock) {
        if(Stock != newStock) {
            Stock = newStock;
            notifyObserver();
        }
    }

    @Override
    public int getStockData() {
        return Stock;
    }

}
