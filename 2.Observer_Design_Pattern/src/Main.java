import NotificationObservable.Implement.IphoneObservable;
import NotificationObservable.Implement.SamsungObservable;
import StockObserver.Implement.EmailObserver;
import StockObserver.Implement.SmsObserver;

/*
* There could be same Question: Weather Changes Display LLD
* */

public class Main {
    public static void main(String[] args)
    {
        IphoneObservable iphoneObservable = new IphoneObservable();
        SamsungObservable samsungObservable = new SamsungObservable();

        EmailObserver preetam = new EmailObserver("preetammondal78@gmail.com",iphoneObservable);
        SmsObserver riya = new SmsObserver("7827817030",samsungObservable);

        iphoneObservable.addObserver(preetam);
        samsungObservable.addObserver(riya);

        iphoneObservable.setData(100);
        samsungObservable.setData(300);
    }
}