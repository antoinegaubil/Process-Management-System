package ca.concordia.processmanagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    static void FirstScenario(){
        
        PIDManager.allocateMap();
        ProcessManager.createProcess();
        ProcessManager.terminateProcess(300);
    
    }
    
     static void SecondScenario(){
          
        PIDManager.allocateMap();
         
        for (int i = 0; i < 500; i++) {
          ProcessManager.createProcess();
        }
          ProcessManager.createProcess();
    }
    
     static void ThirdScenario(){
         
          PIDManager.allocateMap();
         
         for (int i = 0; i < 500; i++) {
          ProcessManager.createProcess();
        }
         
          ProcessManager.terminateProcess(i);
          ProcessManager.createProcess();
          ProcessManager.createProcess();
         
          for (int i = 500; i > 0; i--) {
          ProcessManager.terminateProcess(i);
        }
    
    }
    

    public static void main(String[] args) throws Exception {

        
       FirstScenario();
       //SecondScenrio();
       //ThirdScenario();

    }

}
