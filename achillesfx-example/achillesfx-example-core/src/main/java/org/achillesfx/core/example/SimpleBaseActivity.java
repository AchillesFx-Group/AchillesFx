package org.achillesfx.core.example;

import org.achillesfx.core.app.activity.BaseActivity;

/**
 * @description
 * @create 2017-09-01 下午11:52
 * @email spartajet.guo@gmail.com
 */
public class SimpleBaseActivity extends BaseActivity {

    @Override
    public void onCreate() {
        setContentView("/view/SimpleExample.fxml", null, null);
    }
}
