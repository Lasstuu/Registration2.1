package main.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

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
        ArrayList<String> diplomas = new ArrayList<>();
        CheckBox cbKandi = findViewById(R.id.cbKandi);
        CheckBox cbDI = findViewById(R.id.cbDI);
        CheckBox cbTohtori = findViewById(R.id.cbTohtori);
        CheckBox cbMaisteri = findViewById(R.id.cbMaisteri);
        if(cbKandi.isChecked() == true){diplomas.add("Kandidaatin tutkinto");}
        if(cbDI.isChecked() == true){diplomas.add("Diplomi-insinöörin tutkinto");}
        if(cbTohtori.isChecked() == true){diplomas.add("Tekniikan tohtorin tutkinto");}
        if(cbMaisteri.isChecked() == true){diplomas.add("Uimamaisteri");}

        switch (rgUserType.getCheckedRadioButtonId()) {

            case R.id.rbTite:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email,"Tietotekniikka", diplomas));
                break;
            case R.id.rbTuta:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email,"Tuotantotalous", diplomas));
                break;
            case R.id.rbLate:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email,"Laskennallinen tekniikka", diplomas));
                break;
            case R.id.rbSate:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email,"Sähkötekniikka", diplomas));
                break;
        }


    }

}