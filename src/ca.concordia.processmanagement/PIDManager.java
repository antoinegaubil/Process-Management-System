package ca.concordia.processmanagement;


class Pid_manager {
	static final int MIN_PID = 300;
	static final int MAX_PID = 500;
	private int pid_arraylist[];
	boolean available ;
	int i;
	
	
 

int allocateMap()throws Exception {
	try {
        for (i = MIN_PID; i <= MAX_PID; i++) {
            pid_arraylist[i] = MIN_PID;
            System.out.println("Memory allocated successfully");
        }
	}
	catch  (Exception e ) 
	if ( pid_arraylist == null) {
		system.out.println( "unsuccessful");
		}
   return 0 ;
}


int allocatePid()throws Exception {

	int j =0;
	try {
	for (i=0;i <pid_arraylist.length ;i++)
	         if (pid_arraylist[i]== 0) {
	        	 available= true;
	        	 pid_arraylist[i] = 1; 
	        	 j  = j  + MIN_PID; 
	        	
	         }
	         else 
	        	 return pid_arraylist[i] ; 
	}
    catch (Exception e )
	  if (pid_arraylist[i]== 1)
		  System.out.println("pid arnt  available ");
}

static void releasePid(int pid){
    if (pid_arraylist == null){
        System.out.println("PID manager not initialized");
        return;
    }
    if (pid < MIN_PID || pid > MAX_PID){
        System.out.println("Given PID is out of range");
    }

    int newPid = pid - MIN_PID;
    if (pid_arraylist[newPid] == 0){
        System.out.println("PID " + pid + "is already released");
        return;
    }
    System.out.println("Releasing PID :" + pid);
    pid_arraylist[newPid] = 0;
    }


}
	
   
