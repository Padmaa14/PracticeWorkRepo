package observeDesignPtrn.Examples;

import java.util.List;

public interface Observable {

    // List<Observer> observer = null;

    public void addTrainings(NotificationObserver notificationObserver);

    public void removeTraining(NotificationObserver notificationObserver);

    public void notifyTrainingEmail();

    default public void setData(Training training) {
        // setdata()
    }

    default public void getData() {
        //getdata
    }

}
