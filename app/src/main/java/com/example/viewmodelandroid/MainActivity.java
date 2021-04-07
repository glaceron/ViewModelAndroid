package com.example.viewmodelandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.viewmodelandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private ActivityMainBinding binding;
    MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button.setOnClickListener(this);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        binding.textView.setText(String.valueOf(viewModel.numero));
    }
    @Override
    public void onClick(View v)
    {
        if(v == binding.button)
        {
            binding.textView.setText(String.valueOf(viewModel.añadirNumero()));
        }
    }
}