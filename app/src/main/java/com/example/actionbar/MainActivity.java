package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
    }

    //옵션메뉴를 구성하기위해 호출되는 메소드
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //메뉴 xml파일은 인플레이션 후 메뉴에 설정할 수 있음
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //옵션메뉴를 선택하면 호출되는 메소드
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        switch(id) {
            case R.id.Item1:
                textView.setText("1번 메뉴 선택");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}