package org.song.qswidgets;

import android.app.Application;


/**
 * appcontext
 *
 * @author Administrator
 */
public class AppContext extends Application {

    private static AppContext instance;

    public static AppContext getInstance() {
        if (instance == null)
            throw new RuntimeException("AppContext is null");
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        init();
    }

    private void init() {
    }
}
