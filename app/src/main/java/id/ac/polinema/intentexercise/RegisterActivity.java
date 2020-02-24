package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Password;

public class RegisterActivity extends AppCompatActivity {

    private EditText homePage;
    private EditText aboutYou;
    private EditText fullName;

    @NotEmpty
    @Email
    private EditText emailEditText;

    @Password(min = 6, scheme = Password.Scheme.ALPHA_NUMERIC_MIXED_CASE_SYMBOLS)
    private EditText passwordEditText;

    @ConfirmPassword
    private EditText confirmPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullName = findViewById(R.id.text_fullname);
        emailEditText = findViewById(R.id.text_email);
        passwordEditText = findViewById(R.id.text_password);
        confirmPasswordEditText = findViewById(R.id.text_confirm_password);
        homePage = findViewById(R.id.text_homepage);
        aboutYou = findViewById(R.id.text_about);
    }

    public void handleRegister(View view) {
    }
}
