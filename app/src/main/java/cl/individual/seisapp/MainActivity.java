package cl.individual.seisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nombre = findViewById(R.id.editTextNombre);
        EditText apellido = findViewById(R.id.editTextApellido);
        EditText correo = findViewById(R.id.editTextEmail);
        EditText contrasena = findViewById(R.id.editTextContrasena);


        Button botonCrearCuenta = findViewById(R.id.botonCrearCuenta);

        botonCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nombre.getText().toString();
                String lastName = apellido.getText().toString();
                String email = correo.getText().toString();
                String password = contrasena.getText().toString();


                if (name.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || !email.contains("@")) {
                    Toast.makeText(getBaseContext(), "¡Debe completar todos los campos!", Toast.LENGTH_LONG).show();
                    return;
                }
                String textToast = "Nombre usuario: " + name + " " + lastName + " Correo Electronico: " + email + " Password : " + password;
                Toast.makeText(getBaseContext(), textToast, Toast.LENGTH_LONG).show();
            }
        });

    }
}