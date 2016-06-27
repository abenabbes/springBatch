/**
 * 
 */
package aba.spring.batch;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ali
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/database-context-test.xml",
        "classpath:spring/spring-batch-context-test.xml",
        "classpath:spring/jobs-uni-file-context.xml" })
public class AppTest {

	@Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;
 
    @Test
    public void launchJobTest() throws Exception {
        JobExecution jobExecution = jobLauncherTestUtils.launchJob();
     assertEquals("testing complete Job", BatchStatus.COMPLETED, jobExecution.getStatus());
    }
}
