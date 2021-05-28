package com.company;

import com.company.logic.Processor;
import com.company.presentation.OutputCLI;

public class Main {

    public static void main(String[] args) {
        OutputCLI.textGenerate();
        OutputCLI.mainMenu();
        Processor.mainController();
    }
}
