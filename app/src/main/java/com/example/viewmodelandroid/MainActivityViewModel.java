package com.example.viewmodelandroid;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel
{
    private int numero = 0;

    public int añadirNumero()
    {
        numero++;
        return numero;
    }

    public int getNumero()
    {
        return numero;
    }
}
