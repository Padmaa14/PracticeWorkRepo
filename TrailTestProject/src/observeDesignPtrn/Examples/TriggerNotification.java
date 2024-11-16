package observeDesignPtrn.Examples;

public class TriggerNotification {
    public static void main(String arg[]) {
        TrainingObservableImpl observable = new TrainingObservableImpl();
        NotificationObserver observer = new EmailNotificationObserverImpl("sweetep@gmail.com", observable);
        NotificationObserver observer2 = new MobileNotifyObserverImpl(88795471, observable);
        observable.addTrainings(observer);
        observable.addTrainings(observer2);
        observable.setTrainingCount(5);

    }
}
