package observeDesignPtrn.Observable;

import observeDesignPtrn.Observer.NotificationObserver;

public interface StocksObservable {
    public void addStock(NotificationObserver notificationObserver);
    public void notifySubscribers();
    public void setStockCount(int addnewstock);
    public int getStockCount();

    public void removeStock(NotificationObserver notificationObserver);
}
