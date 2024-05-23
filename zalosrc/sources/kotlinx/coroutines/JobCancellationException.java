package kotlinx.coroutines;

import fn0.AbstractC19074t;
import java.util.concurrent.CancellationException;

/* loaded from: classes7.dex */
public final class JobCancellationException extends CancellationException implements CopyableThrowable<JobCancellationException> {

    /* renamed from: p */
    public final transient Job f105899p;

    public JobCancellationException(String str, Throwable th2, Job job) {
        super(str);
        this.f105899p = job;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!AbstractC19074t.m100204b(jobCancellationException.getMessage(), getMessage()) || !AbstractC19074t.m100204b(jobCancellationException.f105899p, this.f105899p) || !AbstractC19074t.m100204b(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i11;
        String message = getMessage();
        AbstractC19074t.m100205c(message);
        int hashCode = ((message.hashCode() * 31) + this.f105899p.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i11 = cause.hashCode();
        } else {
            i11 = 0;
        }
        return hashCode + i11;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f105899p;
    }
}
