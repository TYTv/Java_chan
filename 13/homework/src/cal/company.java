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
public class company {
    /**
     * 
     * @param m
     * 本金
     * @param r
     * 利率
     * @param y
     * 年
     * @return
     * 業績 = <br>本金*(1+利率)^年
     */
    public static double FV(int m,double r,int y){
        return math.rounder( m * java.lang.Math.pow( (1+r), y ) );
    }
    /**
     * 
     * @param m
     * 本金
     * @return
     * 分級實領
     */
    public static int Money(int m){
        double t=0;
        
        if(m>=500000){
            t=0.03;
        }else if(m>=0 && m<500000){
            t=0;
        }

       return (int)(18000 + m * t);
    }

    public static void FV(double d, double d0, double d1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void Money() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
