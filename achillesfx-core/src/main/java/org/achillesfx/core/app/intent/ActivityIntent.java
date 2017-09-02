package org.achillesfx.core.app.intent;

import org.achillesfx.core.app.context.ActivityContext;

/**
 * @description
 * @create 2017-09-02 下午1:13
 * @email spartajet.guo@gmail.com
 */
public class ActivityIntent extends Intent {
    private ActivityContext context;

    public ActivityIntent(ActivityContext context) {
        this.context = context;
    }

    public ActivityContext getContext() {
        return context;
    }

    public void setContext(ActivityContext context) {
        this.context = context;
    }
}
