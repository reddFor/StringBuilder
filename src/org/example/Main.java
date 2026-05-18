package org.example;

import org.example.task.BetaStringBuilder;

public class Main {
    public static void main(String[] args) {


        BetaStringBuilder betaStringBuilder = new BetaStringBuilder();

        betaStringBuilder.append("SNAP");
        betaStringBuilder.append("SHOT");
        betaStringBuilder.append(01.12);
        betaStringBuilder.insert(1, "-");
        betaStringBuilder.append(02);
        betaStringBuilder.undo();
        System.out.println(betaStringBuilder);




    }
}