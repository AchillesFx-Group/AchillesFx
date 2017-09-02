package org.achillesfx.core.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.achillesfx.core.app.activity.BaseActivity;
import org.achillesfx.core.app.context.ActivityContext;

/**
 * @description
 * @create 2017-09-01 下午11:52
 * @email spartajet.guo@gmail.com
 */
public class SimpleBaseActivity extends BaseActivity {
    @FXML
    private TextField text1;

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
    }
}
