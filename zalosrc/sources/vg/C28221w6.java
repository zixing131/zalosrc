package vg;

import java.util.concurrent.atomic.AtomicInteger;
import p405ov.C24561c;

/* renamed from: vg.w6 */
/* loaded from: classes3.dex */
public class C28221w6 {

    /* renamed from: a */
    private final long[] f131624a = {21600000, 0, 15000, 30000, 60000, 900000, 3600000, 21600000, 86400000};

    /* renamed from: b */
    private final AtomicInteger f131625b = new AtomicInteger(1);

    /* renamed from: c */
    private long f131626c;

    /* renamed from: a */
    public final boolean m142179a() {
        if (System.currentTimeMillis() - this.f131626c >= m142180b()[this.f131625b.get()]) {
            this.f131626c = System.currentTimeMillis();
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public long[] m142180b() {
        return this.f131624a;
    }

    /* renamed from: c */
    public final void m142181c(int i11) {
        if (i11 == -69) {
            this.f131625b.set(0);
        } else if (this.f131625b.incrementAndGet() >= m142180b().length) {
            this.f131625b.set(1);
        }
        C24561c.m127942b("[BirthdayHub]", "onFail errorCode=" + i11 + ", timesRetry=" + this.f131625b.get());
    }

    /* renamed from: d */
    public final void m142182d() {
        this.f131625b.set(1);
    }
}
