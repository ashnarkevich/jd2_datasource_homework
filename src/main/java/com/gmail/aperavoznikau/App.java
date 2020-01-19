package com.gmail.aperavoznikau;

import com.gmail.aperavoznikau.controller.HomeWorkController;

public class App {

    public static void main(String[] args) {
        HomeWorkController homeWorkController = HomeWorkController.getInstance();
        homeWorkController.runTask();
    }

}
