package maa.firebase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        String username = getIntent().getExtras().getString("username");
        String mail = getIntent().getExtras().getString("mail");
        String provider = getIntent().getExtras().getString("provider");
        String uuid = getIntent().getExtras().getString("uuid");
        String photo = getIntent().getExtras().getString("photo");

    }
}
