package org.achillesfx.core.example;

import org.achillesfx.core.app.activity.BaseActivity;
import org.achillesfx.core.app.context.ActivityContext;

/**
 * @description
 * @create 2017-09-02 下午11:48
 * @email spartajet.guo@gmail.com
 */
public class SecondActivity extends BaseActivity {
    public SecondActivity(ActivityContext context) {
        super(context);
    }

    @Override
    public void onCreate() {
        setContentView("/view/SecondExample.fxml", null, null);
    }
}
