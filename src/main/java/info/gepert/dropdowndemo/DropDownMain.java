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
public class DropDownMain {

    public static void main(String[] args) {
        SchemaSelector<SimpleSchema> simpleSchemaSelector = new SimpleSchemaSelector();
        DropDownManager<SimpleSchema> managerOne = new DropDownManager<>();
        SimpleSchema schema = managerOne.select(simpleSchemaSelector);
        schema.click();
        schema.simpleSchemaAction();

        SchemaSelector<ComplexSchema> complexSchemaSelector = new ComplexSchemaSelector();
        DropDownManager<ComplexSchema> managerTwo = new DropDownManager<>();
        ComplexSchema complexSchema = managerTwo.select(complexSchemaSelector);
        complexSchema.click();
        complexSchema.complexSchemaAction();

    }

}
