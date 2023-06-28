package cl.individual.seisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cl.individual.seisapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.botonCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = binding.editTextNombre.getText().toString();
                String apellido = binding.editTextApellido.getText().toString();
                String correo = binding.editTextEmail.getText().toString();
                String clave = binding.editTextContrasena.getText().toString();


                if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || clave.isEmpty() || !correo.contains("@")) {
                    Toast.makeText(getBaseContext(), "¡Debe completar todos los campos!", Toast.LENGTH_LONG).show();
                    return;
                }
                String textToast = "Nombre usuario: " + nombre + " " + apellido + " Correo Electronico: " + correo + " Password : " + clave;
                Toast.makeText(getBaseContext(), textToast, Toast.LENGTH_LONG).show();
            }
        });

    }
}