package com.example.demo.service;


import com.example.demo.model.Circle;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class CircleService {
    public void testInputThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i<=100 ;i++ ){
                    Circle.i=i;
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                        System.out.println(Circle.i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Circle.i=0;
            }
        }).start();
    }

    public void testOnputThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i<=100 ;i++ ){
                    Circle.O=i;
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                        //System.out.println(Circle.O);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Circle.O=0;
            }
        }).start();
    }


}
