package com.company.Command;

import java.util.ArrayList;

public class CakePipeline {

    private ArrayList<CakesCommand> cakesPipeLine = new ArrayList<>();


    public void PlaceCommand(CakesCommand command){
        cakesPipeLine.add(command);
    }

    public void execute(){
        for(CakesCommand command : cakesPipeLine){
            command.execute();
        }
        cakesPipeLine.clear();

    }
}
