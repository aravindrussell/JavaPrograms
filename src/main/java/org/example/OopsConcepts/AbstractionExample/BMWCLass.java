package org.example.OopsConcepts.AbstractionExample;

public class BMWCLass extends CarClass{
    @Override
    void Engine() {
        System.out.println("Start BMW Engine");
    }

    @Override
    void Interiour() {
        System.out.println("BMW Inter");
    }

    @Override
    void door() {
        System.out.println("Open BMW Door");
    }

    @Override
    void color() {
        System.out.println("BMW Car Color");
    }
}
