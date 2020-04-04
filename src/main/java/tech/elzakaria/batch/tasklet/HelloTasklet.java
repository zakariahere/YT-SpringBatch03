package tech.elzakaria.batch.tasklet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Tasklet normal qui fait un traitement quelconque
 */
@Slf4j
public class HelloTasklet implements Tasklet {

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        log.info("HELLO TASKLET, TRAITEMENT UNIQUE EST TRANSACTIONNEL A LA DIFFERENCE DU MODE CHUNK");
        return RepeatStatus.FINISHED;
    }
}
