package cn.uncode.schedule.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;


/**
 * @author juny.ye
 */
@Component
public class SimpleTask {

    private static int i = 0;
    

    public void print() {
        System.out.println("===========start!=========");
        System.out.println("I:"+i);i++;
        System.out.println("=========== end !=========");
    }
    
    public void print1() {
        System.out.println("===========start!=========");
        System.out.println("print<<1>>:"+i);i++;
        System.out.println("=========== end !=========");
    }
    
    public void print2() {
        System.out.println("===========start!=========");
        System.out.println("print<<2>>:"+i);i++;
        System.out.println("=========== end !=========");
    }
    
    public void print3() {
        System.out.println("===========start!=========");
        System.out.println("print<<3>>:"+i);i++;
        System.out.println("=========== end !=========");
    }
    
    public void print4() {
        System.out.println("===========start!=========");
        System.out.println("print<<4>>:"+i);i++;
        System.out.println("=========== end !=========");
    }
    
    
    public void print5(String param) {
        System.out.println("===========start!=========");
        System.out.println("print<<5>>:"+i+"-"+param);i++;
        System.out.println("=========== end !=========");
    }
    
    public List<Map<String, String>> before(){
    	List<Map<String, String>> list = new ArrayList<>();
    	for(int a = 1000;a <= 5120; a++){
    		String key = a + "ksudi";
    		Map<String, String> item = new HashMap<>();
    		for(int i=100;i<150;i++){
    			String value = key + i;
    			item.put(value, value);
        	}
//    		System.err.println(item);
    		list.add(item);
    	}
    	return list;
    }
    
    public void runing(String str){
    	System.err.println(str);
    }
    
    public void after(){
    	System.err.println("after====================================================");
    }


}
