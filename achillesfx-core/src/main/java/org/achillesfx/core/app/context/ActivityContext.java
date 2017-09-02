package org.achillesfx.core.app.context;

import org.achillesfx.core.app.base.AchillesFxStage;

/**
 * @description
 * @create 2017-09-02 下午1:07
 * @email spartajet.guo@gmail.com
 */
public class ActivityContext extends Context {
    private AchillesFxStage primaryStage;

    public ActivityContext(AchillesFxStage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public AchillesFxStage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(AchillesFxStage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
