package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes7.dex */
public final class TimeoutCancellationException extends CancellationException implements CopyableThrowable<TimeoutCancellationException> {

    /* renamed from: p */
    public final transient Job f105949p;

    public TimeoutCancellationException(String str, Job job) {
        super(str);
        this.f105949p = job;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
