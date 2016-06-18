/**
 * 
 */
package aba.spring.batch.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import aba.spring.batch.model.Model1Vo;

/**
 * @author ali
 *
 */
public class Model1Mapper implements FieldSetMapper<Model1Vo>{

	@Override
	public Model1Vo mapFieldSet(FieldSet fieldSet) throws BindException {
		Model1Vo model1 = new Model1Vo();
		model1.setNom(fieldSet.readString(0));
		model1.setUneDate(fieldSet.readDate(1, "dd/MM/yyyy"));
		model1.setVal(fieldSet.readString(2));
		return model1;
	}

}
