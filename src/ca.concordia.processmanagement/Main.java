package ca.concordia.processmanagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    static void FirstScenario(){
        
        PIDManager.allocateMap();
        PIDManager.allocatePid();
        PIDManager.releasePid(300);
    
    }
    
     static void SecondScenario(){
    
    }
    
     static void ThirdScenario(){
    
    }
    

    public static void main(String[] args) throws Exception {

        
       FirstScenario();
       //SecondScenrio();
       //ThirdScenario();

    }

}
