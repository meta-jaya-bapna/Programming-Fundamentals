/**
 * Class name-Fcfs
 *
 *@version 1.0
 *@author Jaya Bapna
 */
 
/*
 *A class to implement First Come First Serve Scheduling 
 */

public class Fcfs {
     int [][]FCFS( int arrival_time [], int  job_size[] )
     {
		/* 
		* Below function finds the waiting time for all the processes.
		* The function returns the two dimensional array which contains waiting time
		* start tie=me and burst time of each process.
		* The function calculates waiting time, start time and burst time for each process.
		*/
        int counter1,counter2;
        int numberOfJobs=arrival_time.length;                         //To store total number of processes.
        int[][]fcfs=new int[numberOfJobs][5];
        int waiting_time=0, starting_time=1, burst_time=job_size[0];  //Waiting time of first job is zero.
        for(counter1=0;counter1<numberOfJobs;counter1++)
        {
            counter2=0;
            if(starting_time<arrival_time[counter1])
                starting_time=arrival_time[counter1];
            burst_time=starting_time + job_size[counter1]-1;
            waiting_time=starting_time- arrival_time[counter1];
            fcfs[counter1][counter2++]=counter1+1;
            fcfs[counter1][counter2++]=arrival_time[counter1];
            fcfs[counter1][counter2++]=waiting_time;
            fcfs[counter1][counter2++]=starting_time;
            fcfs[counter1][counter2++]=burst_time;
            starting_time= burst_time + 1;                         //start time of process is one more than burst time
        }
        return fcfs; 											   //returns final 2 D array
     }

}