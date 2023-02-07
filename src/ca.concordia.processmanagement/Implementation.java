package ca.concordia.processmanagement;

import java.util.ArrayList;
import java.util.List;

public class Implementation {

    private List<ProcessControlBlock> processes = new ArrayList<>();
    private List<Integer> readyQueue = new ArrayList<>();

    public int createProcess() throws Exception {
        int pid = PIDManager.allocatePid();
        if (pid == -1) {
            throw new Exception("Unable to allocate PID");
        }
        ProcessControlBlock process = new ProcessControlBlock(pid, "ready");
        processes.add(process);
        readyQueue.add(pid);
        return pid;
    }

    public void terminateProcess(int pid) throws Exception {
        for (int i = 0; i < processes.size(); i++) {
            if (processes.get(i).getPid() == pid) {
                processes.remove(i);
                PIDManager.releasePid(pid);
                readyQueue.remove(Integer.valueOf(pid));
                return;
            }
        }
        throw new Exception("Process with PID " + pid + " not found");
    }
}
