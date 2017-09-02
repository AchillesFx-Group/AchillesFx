package org.achillesfx.core.app.base;

import javafx.stage.Stage;
import org.achillesfx.core.app.activity.Activity;

/**
 * The type Achilles fx stage.
 *
 * @description
 * @create 2017 -09-01 下午11:42
 * @email spartajet.guo @gmail.com
 */
public class AchillesFxStage {
    /**
     * The Stage.
     */
    private final Stage stage;
    /**
     * The Activity.
     */
    private Activity activity;

    /**
     * Instantiates a new Achilles fx stage.
     *
     * @param stage the stage
     */
    public AchillesFxStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * Sets activity.
     *
     * @param activity the activity
     * @return the activity
     */
    public AchillesFxStage setActivity(Activity activity) {
        this.activity = activity;
        this.stage.setScene(activity.getScene());
        return this;
    }

    /**
     * Gets stage.
     *
     * @return the stage
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * Gets activity.
     *
     * @return the activity
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * Show.
     */
    public void show() {
        this.stage.show();
    }
}
