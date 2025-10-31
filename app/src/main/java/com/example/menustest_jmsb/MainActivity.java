package com.example.menustest_jmsb;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.menustest_jmsb.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private NavController navController;
    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

// 1. Obtenemos la referencia de la Toolbar del layout
        setSupportActionBar(binding.toolbar);

// 2. Obtenemos el NavController desde el contenedor del grafo
        navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();

// 3. Configuramos la AppBar para que el título y el botón de navegación
// se actualicen automáticamente al navegar entre fragments
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    // Método que se ejecuta cuando el usuario pulsa el botón de “navegación superior” de la barra de la app, es decir:
// el icono de flecha atrás, o el icono de menú hamburguesa (si tienes un DrawerLayout).
    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }

}