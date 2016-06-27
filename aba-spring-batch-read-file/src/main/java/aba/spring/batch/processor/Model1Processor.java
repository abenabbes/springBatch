package aba.spring.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import aba.spring.batch.model.Model1Vo;

public class Model1Processor implements ItemProcessor<Model1Vo, Model1Vo> {

	private static final Logger log = LoggerFactory.getLogger(Model1Processor.class); 

	@Override
	public Model1Vo process(Model1Vo item) throws Exception {
		
		log.debug("debut de processor Model1Vo");
		
		if(item == null){
			return null;
		}
		
		Model1Vo ret1 = new Model1Vo();
		
			ret1.setNom(item.getNom());
			ret1.setUneDate(item.getUneDate());
			ret1.setVal(item.getVal());
			
		
		log.debug("FIN de processor Model1Vo");
		
		return ret1;
			
	}
	

}
