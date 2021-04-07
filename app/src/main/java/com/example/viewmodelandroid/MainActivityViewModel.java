package com.example.viewmodelandroid;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel
{
    int numero = 0;

    public int añadirNumero()
    {
        numero++;
        return numero;
    }
}
