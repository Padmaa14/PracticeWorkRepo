package observeDesignPtrn.Observer;

import observeDesignPtrn.Observable.StocksObservable;

public class EmailNotification implements NotificationObserver {
    String emailId;
    StocksObservable stocksObservable;

    EmailNotification(String emailId,StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in stock Order in hurry");

    }

    private void sendEmail(String emailId,String msg) {
        System.out.println("Msg :"+msg);
        System.out.println("Email sent to :"+emailId);
    }
}
