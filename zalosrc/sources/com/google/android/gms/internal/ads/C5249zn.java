package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.zn */
/* loaded from: classes2.dex */
public final class C5249zn {

    /* renamed from: a */
    private final ExecutorService f31595a = AbstractC4916qo.m25836l("Loader:ExtractorMediaPeriod");

    /* renamed from: b */
    private HandlerC5100vn f31596b;

    /* renamed from: c */
    private IOException f31597c;

    public C5249zn(String str) {
    }

    /* renamed from: a */
    public final long m28557a(InterfaceC5138wn interfaceC5138wn, InterfaceC5063un interfaceC5063un, int i11) {
        boolean z11;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20613e(z11);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC5100vn(this, myLooper, interfaceC5138wn, interfaceC5063un, i11, elapsedRealtime).m27313c(0L);
        return elapsedRealtime;
    }

    /* renamed from: f */
    public final void m28558f() {
        this.f31596b.m27311a(false);
    }

    /* renamed from: g */
    public final void m28559g(int i11) {
        IOException iOException = this.f31597c;
        if (iOException == null) {
            HandlerC5100vn handlerC5100vn = this.f31596b;
            if (handlerC5100vn != null) {
                handlerC5100vn.m27312b(handlerC5100vn.f29411r);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: h */
    public final void m28560h(Runnable runnable) {
        HandlerC5100vn handlerC5100vn = this.f31596b;
        if (handlerC5100vn != null) {
            handlerC5100vn.m27311a(true);
        }
        this.f31595a.execute(runnable);
        this.f31595a.shutdown();
    }

    /* renamed from: i */
    public final boolean m28561i() {
        return this.f31596b != null;
    }
}
