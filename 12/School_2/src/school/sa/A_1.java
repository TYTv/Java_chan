/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.sa;

import school.stu.student2;

/**
 *
 * @author student
 * @version 1.0 <br> 
 * 版本顯示
 */
public class A_1 extends A implements student2{
    	private int math;
	/**
         * 
         * @param name
         * 學員姓名
         * @param chi
         * 國文分數
         * @param math 
         * 數學分數
         */
	public A_1(String name, int chi, int math)
	{
		super(name,chi);
		this.math=math;
		
		
	}
	/**
         * @return 
         * 顯示數學
         */
	@Override
        public String show()
	{
		
		return super.show()+"\tMATH:"+math;
	}
}
