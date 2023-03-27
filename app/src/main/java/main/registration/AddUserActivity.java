package main.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void addUser(View view) {

        RadioGroup rgUserType = findViewById(R.id.rgUserType);
        TextView tvFirstName = findViewById(R.id.txtfirstName);
        TextView tvLastName = findViewById(R.id.txtLastName);
        TextView tvEmail = findViewById(R.id.email);
        String firstName = tvFirstName.getText().toString();
        String lastName = tvLastName.getText().toString();
        String email = tvEmail.getText().toString();
        int image = 0;
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.pfp1:
                image = R.drawable.pfp1;
                break;
            case R.id.pfp2:
                image = R.drawable.pfp2;
                break;
        }
        switch (rgUserType.getCheckedRadioButtonId()) {

            case R.id.rbTite:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email,"Tietotekniikka", image));
                break;
            case R.id.rbTuta:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email,"Tuotantotalous", image));
                break;
            case R.id.rbLate:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email,"Laskennallinen tekniikka", image));
                break;
            case R.id.rbSate:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email,"Sähkötekniikka", image));
                break;
        }

    }

}