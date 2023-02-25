package Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	
	
	public static List<List<Integer>> merge(int[][] p1, int[][] p2){
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(p1, (a,b) -> {
			return a[0] - b[0];
		});
		Arrays.sort(p2, (a,b) -> {
			return a[0] - b[0];
		});
		
		int i = 0 ; int j = 0;
		
		while(i < p1.length && j< p2.length) {
			while(p1[i][0] == p2[j][0]) {
				List<Integer> l = new ArrayList<>();
				l.add(p1[i][0]);
				l.add(p1[i][1]);
				l.add(p2[j][1]);
				res.add(l);
				j++;
				i++;
				continue;
			}
			//if(p1[i][0] != p2[j][0])
			 i++;
		}
		return res;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Adapter");
		System.out.println("");
		
		AsiaPlugs asiaPlugs = new AsiaPlugs(1);
		IndiaPlug indiaPlug = new IndiaPlug(1);
		        

		
		//IndiaplugAdapter indiaAdapter = new IndiaplugAdapter(indiaPlug);
		int[][] p1 = { { 1, 2 }, { 3, 4 }, {1, 6}};
		int[][] p2 = { { 1, 2 }, { 3, 4 } };
		merge(p1,p2);
		
		}
		
		

}
