package com.example.menustest_jmsb;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.menustest_jmsb.databinding.FragmentRookieBinding;


public class RookieFragment extends Fragment {

    // Binding del fragment
    FragmentRookieBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inicializamos el binding inflando el layout
        binding = FragmentRookieBinding.inflate(inflater, container, false);

        // Devolvemos la vista raíz del binding
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Aquí podemos acceder a las vistas (botones, textos, etc.)
    }
}