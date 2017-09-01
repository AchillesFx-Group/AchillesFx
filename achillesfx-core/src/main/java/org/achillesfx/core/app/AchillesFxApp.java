package org.achillesfx.core.app;

import javafx.application.Application;
import javafx.stage.Stage;
import org.achillesfx.core.app.activity.Activity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @description
 * @create 2017-08-19 下午12:35
 * @email spartajet.guo@gmail.com
 */
public class AchillesFxApp extends Application {
    private static Logger logger = LoggerFactory.getLogger(AchillesFxApp.class);
    private Activity startActivity;
    private static Class<? extends Activity> startClass;
    private Map<String, Object> params;

    private static AchillesFxApp achillesFxApp;

//    private AchillesFxApp() {
//    }

    public static AchillesFxApp getApplication() {
        if (achillesFxApp == null) {
            achillesFxApp = new AchillesFxApp();
        }
        return achillesFxApp;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.startActivity = startClass.newInstance();
        primaryStage.setScene(startActivity.getScene());
        primaryStage.show();
    }

    public static void launchApp(Class<? extends Activity> appClass, Map<String, Object> params) {
        startClass = appClass;
        Application.launch(AchillesFxApp.class);
    }

    public static void launchApp(Class<? extends Activity> appClass) {
        launchApp(appClass, null);
    }

    public Object getParaByName(String name) {
        return this.params.get(name);
    }

    public int getIntParaByName(String name) {
        return (int) (this.params.get(name));
    }

}
