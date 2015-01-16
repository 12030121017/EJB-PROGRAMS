/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import javax.ejb.Local;

/**
 *
 * @author student
 */
@Local
public interface MyBeanLocal {

    String Printm(final String name);
    int addition(int a, int b);
    
}
