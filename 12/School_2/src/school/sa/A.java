/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.sa;

import school.stu.student;
import school.stu.student2;

/**
 *
 * @author student
 * @since Felix <br> build 0809
 */
public class A extends student implements student2{
    	private int chi;
	
	public A(String name,int chi)
	{
		super(name);
		this.chi=chi;
	}
	
	public String show()
	{
		//return super.show()+"\tCHI"+chi;
		return show2()+"\tCCHHII"+chi;
	}

}
