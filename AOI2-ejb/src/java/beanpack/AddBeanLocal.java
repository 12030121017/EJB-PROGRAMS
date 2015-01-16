/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package beanpack;
import javax.ejb.Local;


/**
 *
 * @author student
 */
@Local 
public interface AddBeanLocal {
    int addition(int a,int b);
}
