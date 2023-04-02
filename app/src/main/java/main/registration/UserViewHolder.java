package main.registration;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView userName, userType, userEmail, userDiploma;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userName = itemView.findViewById(R.id.txtName);
        userType = itemView.findViewById(R.id.txtUserType);
        userEmail = itemView.findViewById(R.id.txtUVEmail);
        userDiploma = itemView.findViewById(R.id.txtDiplomas);
    }
}
