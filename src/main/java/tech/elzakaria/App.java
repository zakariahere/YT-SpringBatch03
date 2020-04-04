package tech.elzakaria;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world Job Launcher!
 */
public class App {
    public static void main(String[] args) throws Exception{

        //My classpath
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("import-individus.xml");

        //init job launcher
        JobLauncher jobLauncher = classPathXmlApplicationContext.getBean(JobLauncher.class);

        //retrieve my job
        Job job = classPathXmlApplicationContext.getBean(Job.class);

        //Launch job
        jobLauncher.run(job, new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters());

    }
}
