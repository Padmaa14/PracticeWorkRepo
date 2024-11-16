package observeDesignPtrn.Examples;

public class MobileNotifyObserverImpl implements NotificationObserver{
    long mobileno;
    Observable observable;

    MobileNotifyObserverImpl(long mobileno,Observable observable){
     this.mobileno=mobileno;
     this.observable=observable;
    }

    @Override
    public void update() {

    }
}
