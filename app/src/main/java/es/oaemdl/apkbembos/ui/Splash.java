package es.oaemdl.apkbembos.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.oaemdl.apkbembos.R;
import es.oaemdl.apkbembos.databinding.FragmentSplashBinding;

public class Splash extends Fragment {
    FragmentSplashBinding binding;
    View view;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSplashBinding.inflate(inflater, container, false);
        return view = binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        new Handler().postDelayed( () -> Navigation.findNavController( view ).navigate( R.id.nav_bienvenido ), 3000);
    }

}