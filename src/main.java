import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        PriorityScheduling p=new PriorityScheduling();
        int NumOfProcesses=0;
        Process newProcess;
        Scanner s=new Scanner(System.in);
        Scanner m=new Scanner(System.in);
        System.out.println("============== PRIORITY SCHEDULING ==============");
        System.out.println("Enter number of processes..");
        NumOfProcesses=s.nextInt();
        List<Process> prs=new ArrayList<>();
        for(int i=0;i<NumOfProcesses;i++){
            newProcess=new Process();
            System.out.println("Enter name of process "+(i+1)+" : ..");
            newProcess.setName(m.nextLine());
            System.out.println("Enter arrival time of process "+(i+1)+" : ..");
            newProcess.setArrivalTime(s.nextInt());
            System.out.println("Enter burst time of process "+(i+1)+" : ..");
            newProcess.setBurstTime(s.nextInt());
            System.out.println("Enter priority of process "+(i+1)+" : ..");
            newProcess.setPriority(s.nextInt());
            prs.add(newProcess);
        }
        List<Integer>tempbusrt=new ArrayList<>();
        for(int i=0;i<prs.size();i++){
            tempbusrt.add(prs.get(i).getBurstTime());
        }
        p.setProcesses(prs);
        p.setBurst(tempbusrt);
        p.run();
        p.print();


    }
}
