package com.learn.runtime;

public class MemoryManagementDemo {
	public static void main(String args[]){
        Runtime rt = Runtime.getRuntime();
        
        long mem1,mem2;
        Integer someints[] = new Integer[1000];
        
        System.out.println("Java������еĿ����ڴ���:"+rt.freeMemory());
		System.out.println("Java �������ͼʹ�õ�����ڴ���:"+ rt.maxMemory());
		System.out.println("���� Java ������е��ڴ�����:"+ rt.totalMemory());
        
        mem1 = rt.freeMemory();
        System.out.println("Initial free is : " + mem1);
        
        rt.gc();
        mem1 = rt.freeMemory();
        System.out.println("Free memory after garbage collection : " + mem1);
        
        //allocate integers
        for(int i=0; i<1000; i++) {
        	someints[i] = new Integer(i);   
        }
        mem2 = rt.freeMemory();
        System.out.println("Free memory after allocation : " + mem2);
        System.out.println("Memory used by allocation : " +(mem1-mem2));  
        
        //discard Intergers
        for(int i=0; i<1000; i++) {
        	someints[i] = null;
        }
        rt.gc();
        mem2 = rt.freeMemory();
        System.out.println("Free memory after collecting " + "discarded integers : " + mem2);
} 
}
