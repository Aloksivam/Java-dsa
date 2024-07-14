package Algorithms.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JobSequenceProblem {
	static class Job{
		int id,deadLine,profit;
		
		public Job(int id,int deadLine, int profit) {
			this.deadLine = deadLine;
			this.profit = profit;
			this.id = id;
		}
	}
//	static int JobSeq(int[] jobDeadline,int[] profit){
//		int[][] job = new int[profit.length][3];
//		for (int i = jobDeadline.length-1; i >=0; i--) {
//			job[i][0] = i;
//			job[i][1] = jobDeadline[i];
//			job[i][2] = profit[i];
//		}
//		Arrays.sort(job, Comparator.comparingDouble(w->w[2]));
//		int time=0,ans=0;
//		ArrayList<String> li = new ArrayList<>();
//		for (int i = 0; i < job.length; i++) {
//			if(time<job[i][1]){
//			ans+=job[i][2];
//			li.add("A"+job[i][0]+" ");
//			time++;
//			}
//		}
//		System.out.println(li);
//		return ans;
//	}
	public static void main(String[] args) {
		System.out.println("Let us Do job sequence problem where idea is " +
				"we will be given arrays of job each job has its deadline and profit if the job finishes before deadline");
		int[][] jobsInfo = {{4,20},{1,10},{1,40},{1,30}};
		ArrayList<Job> jobs = new ArrayList<>();
		for (int i = 0; i < jobsInfo.length; i++) {
			jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
		}
		Collections.sort(jobs,(a,b)->b.profit-a.profit);
		ArrayList<String> li = new ArrayList<>();
		int time = 0,profit=0;
		for (int i = 0; i < jobs.size(); i++) {
			Job curr = jobs.get(i);
			if(curr.deadLine>time){
				time++;
				profit+=curr.profit;
				li.add("job"+ curr.id+" ");
			}
		}
		System.out.println(li);
	}
}
