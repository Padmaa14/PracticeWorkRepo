package observeDesignPtrn.Examples;

import java.util.ArrayList;
import java.util.List;

public class TrainingObservableImpl implements Observable {

    public List<NotificationObserver> observerList = new ArrayList<>();
    public int trainingNo = 0;

    @Override
    public void addTrainings(NotificationObserver notificationObserver) {
        observerList.add(notificationObserver);
    }

    @Override
    public void removeTraining(NotificationObserver notificationObserver) {
        observerList.remove(notificationObserver);
    }

    @Override
    public void notifyTrainingEmail() {
        for (NotificationObserver obj : observerList) {
            //notify all by email
            obj.update();
        }
    }

    public void setTrainingCount(int newTrainingcount) {
        if (trainingNo == 0) { //not necessary code
            notifyTrainingEmail();
        }
        trainingNo = trainingNo + newTrainingcount;
    }

    public int getTrainingNoCount() {
        return trainingNo;
    }

    @Override
    public void setData(Training newtraining) {
        //Observable.super.setData();
    }
}
