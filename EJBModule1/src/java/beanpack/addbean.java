package beanpack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.ejb.Stateless;
/**
 *
 * @author student
 */
@Stateless
public class addbean implements addbeanlocal,addbeanremote{
@Override
public int inc(int a){
    return a+10;
}
@Override
public int add(int a,int b){
    return a+b;
}
}
