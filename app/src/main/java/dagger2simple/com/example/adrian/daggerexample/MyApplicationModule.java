package dagger2simple.com.example.adrian.daggerexample;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//It extends the AndroidInjector to perform injection on a concrete Android component type (in our case MainActivity).
@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
