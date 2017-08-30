/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.sb;

import school.stu.student;
import school.stu.student2;

/**
 *
 * @author student
 */
public class B extends student implements student2{
	private int eng;
	
	public B(String name, int eng)
	{
		super(name);
		this.eng=eng;
	}
	
	public String show()
	{
		return super.show()+"\tENG:"+eng;
		
	}
}
