package p435q2;

import androidx.work.InterfaceC2141d0;
import androidx.work.impl.C2155a0;
import androidx.work.impl.InterfaceC2215o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: q2.d */
/* loaded from: classes.dex */
public final class C25077d {

    /* renamed from: a */
    private final InterfaceC2141d0 f120474a;

    /* renamed from: b */
    private final InterfaceC2215o0 f120475b;

    /* renamed from: c */
    private final long f120476c;

    /* renamed from: d */
    private final Object f120477d;

    /* renamed from: e */
    private final Map f120478e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25077d(InterfaceC2141d0 interfaceC2141d0, InterfaceC2215o0 interfaceC2215o0) {
        this(interfaceC2141d0, interfaceC2215o0, 0L, 4, null);
        AbstractC19074t.m100208f(interfaceC2141d0, "runnableScheduler");
        AbstractC19074t.m100208f(interfaceC2215o0, "launcher");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m129996d(C25077d c25077d, C2155a0 c2155a0) {
        AbstractC19074t.m100208f(c25077d, "this$0");
        AbstractC19074t.m100208f(c2155a0, "$token");
        c25077d.f120475b.mo11723d(c2155a0, 3);
    }

    /* renamed from: b */
    public final void m129997b(C2155a0 c2155a0) {
        Runnable runnable;
        AbstractC19074t.m100208f(c2155a0, "token");
        synchronized (this.f120477d) {
            runnable = (Runnable) this.f120478e.remove(c2155a0);
        }
        if (runnable != null) {
            this.f120474a.mo11502a(runnable);
        }
    }

    /* renamed from: c */
    public final void m129998c(final C2155a0 c2155a0) {
        AbstractC19074t.m100208f(c2155a0, "token");
        Runnable runnable = new Runnable() { // from class: q2.c
            @Override // java.lang.Runnable
            public final void run() {
                C25077d.m129996d(C25077d.this, c2155a0);
            }
        };
        synchronized (this.f120477d) {
        }
        this.f120474a.mo11503b(this.f120476c, runnable);
    }

    public C25077d(InterfaceC2141d0 interfaceC2141d0, InterfaceC2215o0 interfaceC2215o0, long j11) {
        AbstractC19074t.m100208f(interfaceC2141d0, "runnableScheduler");
        AbstractC19074t.m100208f(interfaceC2215o0, "launcher");
        this.f120474a = interfaceC2141d0;
        this.f120475b = interfaceC2215o0;
        this.f120476c = j11;
        this.f120477d = new Object();
        this.f120478e = new LinkedHashMap();
    }

    public /* synthetic */ C25077d(InterfaceC2141d0 interfaceC2141d0, InterfaceC2215o0 interfaceC2215o0, long j11, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC2141d0, interfaceC2215o0, (i11 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j11);
    }
}
