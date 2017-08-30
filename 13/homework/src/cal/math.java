/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;
/**
 *
 * @author student
 * @version 0.1
 */
public class math {
    /**
     * 
     * @param x
     * 長
     * @param y
     * 寬
     * @return
     * 面積
     */
    public static double Area(double x,double y){
        return rounder(x*y);
    }
    /**
     * 
     * @param r
     * 半徑
     * @return
     * 園面積
     */
    public static double CArea(double r){
        return rounder( Math.PI * Math.pow(r,2) );
    }
    public static double rounder(double dat){
        return( (double)Math.round( dat*100 ) /100 );
    }

}
