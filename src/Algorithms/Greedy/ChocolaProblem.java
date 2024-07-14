package Algorithms.Greedy;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
	public static void main(String[] args) {
		System.out.println("Let us do chocolate problem where we have to cut a complete chocolate into smallest pieces and each horizontal and vertical row has its own cost of cutting ");
		int n=4,m=6;
		Integer costver[] = {2,1,3,1,4};
		Integer costHor[] = {4,1,2};
		Arrays.sort(costver, Collections.reverseOrder());
		Arrays.sort(costHor, Collections.reverseOrder());
		int h=0,v=0;
		int hp=1,vp=1;
		int cost = 0;
		while(h<costHor.length&& v<costver.length){
			//vertical cost<horizontal cost
			if(costver[v]<=costHor[h]){
				cost+=(vp*costHor[h]);
				hp++;
				h++;
			}
			else{
				cost+=(hp*costver[v]);
				vp++;
				v++;
			}
		}
		while(h<costHor.length){
			cost+=(vp*costHor[h]);
			hp++;
			h++;
		}
		while(v<costver.length){
			cost+=(hp*costver[v]);
			vp++;
			v++;
		}
		System.out.println("Cost  is"+ cost);
	}
}
