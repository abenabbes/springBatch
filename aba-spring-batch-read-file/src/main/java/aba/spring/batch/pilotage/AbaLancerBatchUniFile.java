/**
 * 
 */
package aba.spring.batch.pilotage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author ali
 *
 */
public class AbaLancerBatchUniFile {

	private static final Logger log = LoggerFactory.getLogger(AbaLancerBatchUniFile.class); 

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		log.debug("debut");
		//Noms des fichier de config des JOBs
		String job_uniFiles = "spring/jobs-uni-file-context.xml";
		
		String[] springConfig  = {job_uniFiles};
			
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
			
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("modelJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			log.debug("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

		log.debug("Done");

	  }
}
