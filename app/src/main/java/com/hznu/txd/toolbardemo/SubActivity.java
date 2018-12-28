package com.hznu.txd.toolbardemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Toolbar tbSub = (Toolbar) findViewById(R.id.tb_SubAC);
        tbSub.setTitleTextColor(Color.WHITE);       // 标题文本颜色
        tbSub.setSubtitleTextColor(Color.WHITE);    // 子标题文本颜色
        tbSub.setTitle("第二个页面");
        tbSub.setSubtitle("第二个小标题");
        tbSub.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(tbSub);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

    }

    // 不会超时
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.subtoolbar, menu);
        Button btn_test = (Button)menu.findItem(R.id.btn_test).getActionView();
        btn_test.setText("TEST");
        btn_test.setTextColor(Color.WHITE);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SubActivity.this, "ActionBar Button for Test", Toast.LENGTH_LONG).show();
            }
        });
        return true;
    }

    // 这样会超时的哦，不知道为什么
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.btn_test:
//                Toast.makeText(SubActivity.this, "ActionBar Button for Test", Toast.LENGTH_LONG).show();
//                break;
//            default:
//        }
//
//        return true;
//    }


}
