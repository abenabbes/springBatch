/**
 * 
 */
package aba.spring.batch.tasklet;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * @author ali
 *
 */
public class Step1Service implements Tasklet{

	//====ATTRIBUTS
	/** Logger de la classe.*/
	private static final Logger log = LoggerFactory.getLogger(Step1Service.class); 

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)
			throws Exception {
		
		log.debug("Debut du step 1");
		
		//Récuperation de idJobInstance
		Long idJobInstance = chunkContext.getStepContext().getStepExecution().getJobExecution().getJobInstance().getId();
		
		//mise dans le context d'execution de l'idJobInstance
		ExecutionContext context =  chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext();
		context.put("idJobInstance", idJobInstance);
		
		log.debug("Fin du step 1");
		return RepeatStatus.FINISHED;
	}

}
