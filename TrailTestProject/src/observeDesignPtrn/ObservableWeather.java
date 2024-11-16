package observeDesignPtrn;

public interface ObservableWeather {


    void add(ObserverDisplay observerDisplay);

    void remove(ObserverDisplay observerDisplay);

    public void notifyWeatherChange();
    //getdata depends on business logic

}
