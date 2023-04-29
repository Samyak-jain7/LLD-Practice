package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }
    @Override
    public void update() {
            sendMessageOnMobile(userName, "Item in stock");
    }
    private void sendMessageOnMobile(String userName, String msg) {
        System.out.println("Message sent to: "+userName);
    }
}
