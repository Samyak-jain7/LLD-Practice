import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {

        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("silver", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);

        iphoneStocksObservable.setStockCount(10);
        iphoneStocksObservable.setStockCount(0);
        iphoneStocksObservable.setStockCount(100);

    }
}