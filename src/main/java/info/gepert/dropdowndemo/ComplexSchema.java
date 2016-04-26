/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.gepert.dropdowndemo;

/**
 *
 * @author advena
 */
class ComplexSchema implements Clickable{

    @Override
    public void click() {
        System.out.println("I'm in " + this.toString());
    }

    void complexSchemaAction() {
        System.out.println("I'm complex schema action only");
    }
    
}
