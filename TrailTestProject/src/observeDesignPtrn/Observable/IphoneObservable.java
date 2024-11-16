package observeDesignPtrn.Observable;

import observeDesignPtrn.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StocksObservable {
    public List<NotificationObserver> notificationObserversList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addStock(NotificationObserver notificationObserver) {
        notificationObserversList.add(notificationObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserver notificationObserver : notificationObserversList) {
            notificationObserver.update();
        }
    }

    @Override
    public void setStockCount(int addnewstock) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + addnewstock;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void removeStock(NotificationObserver notificationObserver) {
        notificationObserversList.remove(notificationObserver);

    }
}
