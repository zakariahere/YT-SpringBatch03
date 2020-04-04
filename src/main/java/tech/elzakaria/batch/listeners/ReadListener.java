package tech.elzakaria.batch.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.SkipListener;
import org.springframework.batch.item.file.FlatFileParseException;
import tech.elzakaria.beans.Individu;


@Slf4j
public class ReadListener implements SkipListener<FlatFileParseException, Individu> {

    @Override
    public void onSkipInRead(Throwable t) {
        log.error("[TECHEXCELLENCE] IS ERROR on READ " + t.getMessage());
    }

    @Override
    public void onSkipInWrite(Individu item, Throwable t) {
        log.error("[TECHEXCELLENCE] IS ON WRITE " + t.getMessage());
    }

    @Override
    public void onSkipInProcess(FlatFileParseException item, Throwable t) {
        log.error("[TECHEXCELLENCE] IS ON PROCESS " + t.getMessage());
    }
}
