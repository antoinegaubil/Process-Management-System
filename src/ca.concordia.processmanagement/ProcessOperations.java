package ca.concordia.processmanagement;
import java.util.ArrayList;
import java.util.List;
public interface ProcessOperations {
    int createProcess() throws Exception;

    void terminateProcess(int pid) throws Exception;
}

class ProcessManager implements ProcessOperations{
private List<processControlBlock> processes = new ArrayList<>();

    @Override
    public int createProcess() throws Exception {
        int pid = PIDManager.allocatePid();
        processControlBlock process = new processControlBlock(pid, "ready");
        processes.add(process);
        return pid;
    }

    @Override
    public void terminateProcess(int pid) throws Exception {
    for (int i = 0; i < processes.size(); i++){
        if (processes.get(i).getPid() == pid){
            PIDManager.releasePid(pid);
            processes.remove(i);
            return;
        }
    }
    throw new Exception("Process with PIO " + pid + "not found");
    }
}
