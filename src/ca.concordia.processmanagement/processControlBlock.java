package ca.concordia.processmanagement;

class processControlBlock {
    int pid;
    String processStatus;

    public processControlBlock(int pid, String processStatus){
        this.pid = pid;
        this.processStatus = processStatus;
    }

    public int getPid(){
        return pid;
    }
    public void setPid(int pid){
        this.pid = pid;
    }

    public String getProcessStatus(){
        return processStatus;
    }
    public void setProcessStatus(String processStatus){
        this.processStatus = processStatus;
    }
}
