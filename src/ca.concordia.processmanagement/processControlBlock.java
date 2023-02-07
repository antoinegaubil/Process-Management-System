package ca.concordia.processmanagement;

class processControlBlock {
    int pid;
    String processStatus;

    public processControlBlock(int pid, String processStatus){
        setProcessStatus(processStatus);
        this.pid = pid;
        this.processStatus = getProcessStatus();
    }

    public int getPid(){
        return pid;
    }
    public void setPid(int pid){
        this.pid = pid;
    }

    public String getProcessStatus(){
        System.out.println(processStatus);
        return processStatus;
    }

    public void setProcessStatus(String processStatus){
        this.processStatus = processStatus;
    }
}
