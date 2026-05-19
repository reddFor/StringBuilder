package org.example;

import org.example.task_1.StringBuilderWithUndo;

public class Main {
    public static void main(String[] args) {


        StringBuilderWithUndo betaStringBuilder = new StringBuilderWithUndo();

        betaStringBuilder.append("SNAP");
        betaStringBuilder.append("SHOT");
        betaStringBuilder.append(01.12);
        betaStringBuilder.insert(1, "-");
        betaStringBuilder.append(02);
        betaStringBuilder.undo();
        System.out.println(betaStringBuilder);




    }
}