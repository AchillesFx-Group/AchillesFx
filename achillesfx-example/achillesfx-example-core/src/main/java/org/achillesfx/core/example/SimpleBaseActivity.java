package org.achillesfx.core.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.achillesfx.core.app.activity.BaseActivity;
import org.achillesfx.core.app.context.ActivityContext;
import org.achillesfx.core.app.intent.ActivityIntent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description
 * @create 2017-09-01 下午11:52
 * @email spartajet.guo@gmail.com
 */
public class SimpleBaseActivity extends BaseActivity {
    private Logger logger = LoggerFactory.getLogger(SimpleBaseActivity.class);
    @FXML
    private TextField text1;
    @FXML
    private Button intentTestButton;

    public SimpleBaseActivity(ActivityContext context) {
        super(context);
    }

    @Override
    public void onCreate() {
        setContentView("/view/SimpleExample.fxml", null, (String[]) null);
        this.initViews();
    }

    private void initViews() {
        Button button1 = (Button) findViewById("button1");
//        text1 = (TextField) findViewById("text1");
        button1.setOnAction(event -> text1.setText("clicked!"));
        this.intentTestButton.setOnAction(event -> {
            SecondActivity secondActivity = new SecondActivity(getContext());
            ActivityIntent intent = new ActivityIntent(getContext(), this, secondActivity);
            intent.start();
        });
    }

    @Override
    public void onStop() {
        logger.info("simple activity stop ");
        super.onStop();
    }
}
