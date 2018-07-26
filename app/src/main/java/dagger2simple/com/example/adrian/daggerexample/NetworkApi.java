package dagger2simple.com.example.adrian.daggerexample;

import android.util.Log;

import javax.inject.Inject;


//This class will be injected into the activity

public class NetworkApi {

    private final String TAG = "NETWORKAPI_TAG";

    //With the @Inject annotation on the constructor, we instruct Dagger that an object of this class can be injected into other objects.
    //Dagger automatically calls this constructor, if an instance of this class is requested.
    @Inject
    public NetworkApi(){
        Log.d(TAG,"Empty constructor()");
    }

    public boolean validateUser(String username, String password) {
        // imagine an actual network call here
        // for demo purpose return false in "real" life
        if (username == null || username.length() == 0) {
            Log.d(TAG,"validateUser == false");
            return false;
        } else {
            Log.d(TAG,"validateUser == true");
            return true;
        }
    }
}
