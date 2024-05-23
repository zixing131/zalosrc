package androidx.lifecycle;

import fn0.AbstractC19074t;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import um0.InterfaceC27315f;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes2.dex */
public final class C1771h {

    /* renamed from: b */
    private boolean f7315b;

    /* renamed from: c */
    private boolean f7316c;

    /* renamed from: a */
    private boolean f7314a = true;

    /* renamed from: d */
    private final Queue f7317d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m9284d(C1771h c1771h, Runnable runnable) {
        AbstractC19074t.m100208f(c1771h, "this$0");
        AbstractC19074t.m100208f(runnable, "$runnable");
        c1771h.m9285f(runnable);
    }

    /* renamed from: f */
    private final void m9285f(Runnable runnable) {
        if (this.f7317d.offer(runnable)) {
            m9288e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    /* renamed from: b */
    public final boolean m9286b() {
        return this.f7315b || !this.f7314a;
    }

    /* renamed from: c */
    public final void m9287c(InterfaceC27315f interfaceC27315f, final Runnable runnable) {
        AbstractC19074t.m100208f(interfaceC27315f, "context");
        AbstractC19074t.m100208f(runnable, "runnable");
        MainCoroutineDispatcher mo112861G0 = Dispatchers.m112681c().mo112861G0();
        if (!mo112861G0.mo9278E0(interfaceC27315f) && !m9286b()) {
            m9285f(runnable);
        } else {
            mo112861G0.mo9279z0(interfaceC27315f, new Runnable() { // from class: androidx.lifecycle.g
                @Override // java.lang.Runnable
                public final void run() {
                    C1771h.m9284d(C1771h.this, runnable);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m9288e() {
        if (this.f7316c) {
            return;
        }
        try {
            this.f7316c = true;
            while ((!this.f7317d.isEmpty()) && m9286b()) {
                Runnable runnable = (Runnable) this.f7317d.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f7316c = false;
        }
    }

    /* renamed from: g */
    public final void m9289g() {
        this.f7315b = true;
        m9288e();
    }

    /* renamed from: h */
    public final void m9290h() {
        this.f7314a = true;
    }

    /* renamed from: i */
    public final void m9291i() {
        if (!this.f7314a) {
            return;
        }
        if (!this.f7315b) {
            this.f7314a = false;
            m9288e();
            return;
        }
        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
    }
}
