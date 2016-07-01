package aba.spring.batch.processor;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeProcess;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemProcessor;

import aba.spring.batch.model.Model1Vo;
import aba.spring.batch.utils.GestionDates;

public class Model1Processor implements ItemProcessor<Model1Vo, Model1Vo> {

	//====ATTRIBUTS
	/** Logger de la classe.*/
	private static final Logger log = LoggerFactory.getLogger(Model1Processor.class); 
	
	/** private StepExecution.*/
	private StepExecution stepExecution;
	
	/** idJobInstance.*/
	private Long idJobInstance;
	
	// ====== Methodes
	
   /**
    * Methode executer avant le step pour récupérer le idJobInstance.
	 * @param stepExecution the stepExecution to set
	 */
	@BeforeStep
	public void setStepExecution(StepExecution stepExecution) {
		
		this.stepExecution = stepExecution;
		this.idJobInstance = this.stepExecution.getJobExecution().getExecutionContext().getLong("idJobInstance");
		
	}
	
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
		ret1.setIdJobInstance(this.idJobInstance);
		ret1.setDateModif(GestionDates.getDateDuJour());
		
		log.debug("FIN de processor Model1Vo");
		return ret1;
			
	}


	/**
	 * @return the idJobInstance
	 */
	public Long getIdJobInstance() {
		return idJobInstance;
	}


	/**
	 * @param idJobInstance the idJobInstance to set
	 */
	public void setIdJobInstance(Long idJobInstance) {
		this.idJobInstance = idJobInstance;
	}
	

}
