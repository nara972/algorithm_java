package com.java.al;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("도시의 개수, 도로의 개수, 거리 정보, 출발 도시 번호를 입력하세요");
		//도시의 개수, 도로의 개수,거리 정보, 출발 도시 번호
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int x=sc.nextInt();
		
		ArrayList<ArrayList<Integer>> graph =new ArrayList<ArrayList<Integer>>();
		//모든 도시에 대한 최단 거리 초기화
		int[] d=new int[300001];
		
		//그래프 및 최단 거리 테이블 초기화(0번째 인덱스는 사용하지 않음)
		for(int i=0;i<=n;i++) {
			//1~n 노드 생성
			graph.add(new ArrayList<Integer>());
			d[i]=-1;
			
		}
		//모든 도로 정보 입력 받기
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			graph.get(a).add(b);
		}
		System.out.println("graph:"+graph);
		
		//출발 도시까지의 거리는 0으로 설정
		d[x]=0;
		
		//너비 우선 탐색(BFS) 수행
		//BFS:가까운 노드부터 탐색하는 알고리즘으로 인접한 노드를 계속해서 큐에 집어넣은 방식이다.
		//선입선출 방식인 큐 자료구조 이용
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(x);//큐에 시작노드를 저장
		
		//큐에 노드가 없을 때까지 반복
		while(!q.isEmpty()) {
			int now=q.poll();
			//현재 도시에서 이동할 수 있는 모든 도시를 확인
			for(int i=0;i<graph.get(now).size();i++) {
				int nextNode=graph.get(now).get(i);
				//아직 방문하지 않은 도시라면
				if(d[nextNode] ==-1) {
					//최단 거리 갱신
					d[nextNode]=d[now]+1;	
					q.offer(nextNode);
				}
			}
		}
		//최단 거리가 k인 모든 도시의 번호를 오름차순으로 출력
		boolean check=false;
		for(int i=1;i<=n;i++) {
			if(d[i]==k) {
				System.out.println(i);
				check=true;
			}
		}
		//만약 최단 거리가 k인 도시가 없다면, -1 출력
		if(!check)System.out.println(-1);
		
		
	}
}
