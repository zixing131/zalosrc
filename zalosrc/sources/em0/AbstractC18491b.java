package em0;

import android.os.Looper;
import bm0.AbstractC2848b;
import fn0.AbstractC19074t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p342m6.AbstractC22888j;

/* renamed from: em0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC18491b {
    /* renamed from: a */
    public static final Object m97867a(AbstractC22888j abstractC22888j, long j11, TimeUnit timeUnit) {
        AbstractC19074t.m100208f(abstractC22888j, "<this>");
        AbstractC19074t.m100208f(timeUnit, "timeUnit");
        m97868b();
        if (abstractC22888j.mo117587p()) {
            return m97869c(abstractC22888j);
        }
        C18492c c18492c = new C18492c();
        abstractC22888j.mo117577f(AbstractC2848b.m13733a(), c18492c);
        abstractC22888j.mo117575d(AbstractC2848b.m13733a(), c18492c);
        abstractC22888j.mo117572a(AbstractC2848b.m13733a(), c18492c);
        c18492c.m97870a(j11, timeUnit);
        return m97869c(abstractC22888j);
    }

    /* renamed from: b */
    private static final void m97868b() {
        if (!AbstractC19074t.m100204b(Looper.getMainLooper(), Looper.myLooper())) {
        } else {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
    }

    /* renamed from: c */
    private static final Object m97869c(AbstractC22888j abstractC22888j) {
        if (abstractC22888j.mo117588q()) {
            return abstractC22888j.mo117584m();
        }
        if (abstractC22888j.mo117586o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC22888j.mo117583l());
    }
}
