package dagger2simple.com.example.adrian.daggerexample;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class MyApplication extends Application  implements HasActivityInjector {

    private final String TAG = "MYAPPLICATION_TAG";

    //This way a DispatchingAndroidInjector is injected
    // which is then returned when an injector for an activity is requested (through activityInjector()).
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate(){
        Log.d(TAG, "onCreate()");
        super.onCreate();
        //Here, we use our MyApplicationComponent (now prefixed with Dagger) to inject our Application class.
        DaggerMyApplicationComponent.create().inject(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        Log.d(TAG,"activityInjector()");
        return dispatchingAndroidInjector;
    }
}
