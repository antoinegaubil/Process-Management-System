package ca.concordia.processmanagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    static void FirstScenario() throws Exception {
        ProcessOperations x = new ProcessManager();
        PIDManager.allocateMap();
        x.createProcess();
        x.terminateProcess(300);
    
    }
    
     static void SecondScenario() throws Exception {
         ProcessOperations x = new ProcessManager();

         PIDManager.allocateMap();
         
        for (int i = 0; i < 200; i++) {
          x.createProcess();
        }
          x.createProcess();
    }
    
     static void ThirdScenario() throws Exception {
         ProcessOperations x = new ProcessManager();

         PIDManager.allocateMap();
         
         for (int i = 0; i < 200; i++) {
          x.createProcess();
        }
         
          x.terminateProcess(499);
          x.createProcess();
          x.createProcess();
         
          for (int i = 499; i > 299; i--) {
          x.terminateProcess(i);
        }
    
    }
    

    public static void main(String[] args) throws Exception {

        ProcessOperations x = new ProcessManager();
       FirstScenario();
       //SecondScenario();
       //ThirdScenario();

    }

}
