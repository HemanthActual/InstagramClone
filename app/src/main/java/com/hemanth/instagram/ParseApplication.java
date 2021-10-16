package com.hemanth.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("T6hkuTx27eoeqflaecLFtLoutwkBqOL5XJEiumGA")
                .clientKey("fRMXmLYQZ10G25goCRvDmjmL0BHBLE8Iv6qsa5MI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
