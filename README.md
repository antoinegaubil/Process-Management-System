# Process Management System

## Overview
This Java project implements a simple process management system. It provides functionalities for creating and terminating processes, along with a PID (Process ID) manager to manage unique process IDs.

## Scenarios
The project includes three scenarios:

1. **First Scenario:** Allocates a map of PID values, creates a process, and terminates a process with PID 300.

2. **Second Scenario:** Allocates a map of PID values and creates 200 processes.

3. **Third Scenario:** Allocates a map of PID values, creates 200 processes, terminates a process with PID 499, creates two processes, and terminates processes from PID 499 to PID 300.


## Components
### PIDManager
Manages Process IDs (PID) by allocating, releasing, and initializing a PID map.

### ProcessOperations
An interface defining operations for creating and terminating processes.

### ProcessManager
Implements the ProcessOperations interface, creating and terminating processes using the PID manager.

### processControlBlock
A class representing the Process Control Block (PCB) containing PID and process status.

