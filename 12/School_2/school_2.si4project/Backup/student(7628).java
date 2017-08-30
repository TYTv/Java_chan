/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.stu;

/**
 *
 * @author student
 */
public class student {
    private String name;
	
    public student(String name)
    {
	this.name=name;
    }
	
	
    public String show()
    {
        return "NAME:"+name;
    }
	
    protected String show2()
    {
	return "NNAAMMEE:"+name;
    }
}
