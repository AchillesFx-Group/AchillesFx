package org.achillesfx.core.app.intent;

import org.achillesfx.core.app.activity.Activity;
import org.achillesfx.core.app.base.AchillesFxStage;
import org.achillesfx.core.app.context.ActivityContext;

/**
 * @description
 * @create 2017-09-02 下午1:13
 * @email spartajet.guo@gmail.com
 */
public class ActivityIntent extends Intent {
    private ActivityContext context;
    private Activity previous;
    private Activity next;

    public ActivityIntent(ActivityContext context, Activity previous, Activity next) {
        this.context = context;
        this.previous = previous;
        this.next = next;
    }

    public ActivityIntent(ActivityContext context) {
        this.context = context;
    }

    public ActivityContext getContext() {
        return context;
    }

    public void setContext(ActivityContext context) {
        this.context = context;
    }


    @Override
    public void start() {
        AchillesFxStage primaryStage = this.context.getPrimaryStage();
        this.previous.onStop();
        this.next.onStart();
        primaryStage.setActivity(next);
    }

    public Activity getPrevious() {
        return previous;
    }

    public void setPrevious(Activity previous) {
        this.previous = previous;
    }

    public Activity getNext() {
        return next;
    }

    public void setNext(Activity next) {
        this.next = next;
    }
}
