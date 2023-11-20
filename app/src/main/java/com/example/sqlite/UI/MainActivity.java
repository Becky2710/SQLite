package com.example.sqlite.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.sqlite.R;
import com.example.sqlite.ViewModel.PersonaViewModel;
import com.example.sqlite.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    public static PersonaViewModel personaViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personaViewModel = new ViewModelProvider(this).get(PersonaViewModel.class);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AgregarPersonaActivity.class));
            }
        });

        binding.btnMostrarLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MostrarListaActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}