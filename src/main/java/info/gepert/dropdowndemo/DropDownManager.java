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
public class DropDownManager<T extends Clickable> {
 
    public T select(SchemaSelector<T> schemaSelector) {
        return schemaSelector.select();
    }
}
