package com.ebookfrenzy.roomdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.net.URL;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import com.ebookfrenzy.roomdemo.ui.main.MainFragment;
public class WebActivity extends AppCompatActivity {

    @Override
    /*protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }

    public void showWebPage(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://sites.google.com/student.mmu.edu.my/wongshouhongtutorial8/home"));
        startActivity(intent);
    }*/

}