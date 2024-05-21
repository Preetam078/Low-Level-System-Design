package NotificationObservable;

import StockObserver.StockObserverInterface;

public interface NotificationObservableInterface {
    public void addObserver(StockObserverInterface stockObserverInterface);
    public void removeObserver(StockObserverInterface stockObserverInterface);
    public void notifyObserver();
    public void setData(Integer newStock);
    public int getStockData();
}
