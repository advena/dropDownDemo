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
class SchemaSelectorFactory {
    
    final static SimpleSchemaSelector getSimpleSchemaSelector() {
        return new SimpleSchemaSelector();
    }

    final static ComplexSchemaSelector getComplexSchemaSelector() {
        return new ComplexSchemaSelector();
    }

}
