/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import javax.ejb.Stateless;

/**
 *
 * @author student
 */
@Stateless
public class MyBean implements MyBeanLocal {

    @Override
    public String Printm(final String name) {
        return "Hello"+name;
    }
    @Override
    public int addition(int a, int b)
    {
        return a+b;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
