package main.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        UserStorage.getInstance().loadUsers(context);
    }   

    public void switchToAddUser(View view){
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }
    public void switchListUsers(View view){
        UserStorage.getInstance().saveUsers(context);
        Intent intent = new Intent(this, ListUsersActivity.class);
        startActivity(intent);
    }

}