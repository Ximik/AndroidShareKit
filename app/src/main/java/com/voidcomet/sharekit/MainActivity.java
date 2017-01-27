package com.voidcomet.sharekit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share = (Button)findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareItem item = new ShareItem();
                ShareKit kit = new ShareKit();
                kit.share(MainActivity,Provider.FACEBOOK,item);
            }
        });
        }
}
