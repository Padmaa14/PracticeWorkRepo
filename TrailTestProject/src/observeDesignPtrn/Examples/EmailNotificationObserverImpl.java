package observeDesignPtrn.Examples;

public class EmailNotificationObserverImpl implements NotificationObserver {

    String email;
    Observable observable;

    EmailNotificationObserverImpl(String email, Observable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEMail(email,"POSH trainning is now online please complete it");// for example

    }

    public void sendEMail(String email, String msg) {
        System.out.println("Email sent on : "+email+" Please complete the training "+msg); // email format
    }

}
