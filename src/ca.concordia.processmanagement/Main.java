package ca.concordia.processmanagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        PIDManager.allocateMap();

        PIDManager.allocatePid();
        PIDManager.allocatePid();


        PIDManager.releasePid(300);

        PIDManager.allocatePid();
        PIDManager.allocatePid();
        PIDManager.allocatePid();

        PIDManager.releasePid(302);

    }

}