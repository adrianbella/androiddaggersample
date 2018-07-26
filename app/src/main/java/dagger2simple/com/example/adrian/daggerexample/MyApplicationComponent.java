package dagger2simple.com.example.adrian.daggerexample;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

//In the @Component annotation the modules are specified which are used to create the implementation of the component.
//While we reference our ActivityModule to inject activities, we also reference the AndroidInjectionModule
//which is needed to ensure the binding of the Android base types (Activities, Fragments, etc.).
@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {
}
