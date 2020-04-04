package tech.elzakaria.batch.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.retry.RetryCallback;
import org.springframework.batch.retry.RetryContext;
import org.springframework.batch.retry.listener.RetryListenerSupport;


@Slf4j
public class OnRetryOwnListener extends RetryListenerSupport {

    @Override
    public <T> void onError(RetryContext context, RetryCallback<T> callback, Throwable throwable) {
        log.info("TECH EXCELLENCE : listener triggered");
        super.onError(context, callback, throwable);
    }
}
