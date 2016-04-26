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
abstract class SchemaSelector<T> {

    private T schema;

    SchemaSelector(T schema) {
        this.schema = schema;
    }

    public T select() {
        return schema;
    }
    
}
