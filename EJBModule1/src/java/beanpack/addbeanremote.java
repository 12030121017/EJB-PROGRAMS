package beanpack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.ejb.Remote;
/**
 *
 * @author student
 */
@Remote
public interface addbeanremote {
    int inc(int a);
    int add(int a,int b);
}
