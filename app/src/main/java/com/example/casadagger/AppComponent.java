package com.example.casadagger;

import com.example.casadagger.model.Casa;

import dagger.Component;

@Component
public interface AppComponent {

    Casa getCasa();

}
