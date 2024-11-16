package observeDesignPtrn;

import java.util.ArrayList;
import java.util.List;

public class ObservableWeatherImpl implements ObservableWeather{

    List<ObserverDisplay> observerDisplayList=new ArrayList<>();
    int initialdegree=0;
    @Override
    public void add(ObserverDisplay observerDisplay) {
        observerDisplayList.add(observerDisplay);
    }

    @Override
    public void remove(ObserverDisplay observerDisplay) {
        observerDisplayList.remove(observerDisplay);
    }
    @Override
    public void notifyWeatherChange() {
        for(ObserverDisplay o:observerDisplayList){
            o.update();
        }
    }
    public void setWeatherinCelcius(int degree){
        degree =initialdegree+degree;
        notifyWeatherChange(); //setweather can be called from anywhere in application if we need to set some data
    }
}
