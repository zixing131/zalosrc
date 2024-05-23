package p351n0;

import java.util.concurrent.Executor;

/* renamed from: n0.c */
/* loaded from: classes.dex */
public class C23504c extends AbstractC23506e {

    /* renamed from: c */
    private static volatile C23504c f114141c;

    /* renamed from: d */
    private static final Executor f114142d = new Executor() { // from class: n0.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C23504c.m123374i(runnable);
        }
    };

    /* renamed from: e */
    private static final Executor f114143e = new Executor() { // from class: n0.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C23504c.m123375j(runnable);
        }
    };

    /* renamed from: a */
    private AbstractC23506e f114144a;

    /* renamed from: b */
    private final AbstractC23506e f114145b;

    private C23504c() {
        C23505d c23505d = new C23505d();
        this.f114145b = c23505d;
        this.f114144a = c23505d;
    }

    /* renamed from: g */
    public static Executor m123372g() {
        return f114143e;
    }

    /* renamed from: h */
    public static C23504c m123373h() {
        if (f114141c != null) {
            return f114141c;
        }
        synchronized (C23504c.class) {
            try {
                if (f114141c == null) {
                    f114141c = new C23504c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f114141c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m123374i(Runnable runnable) {
        m123373h().mo123378d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m123375j(Runnable runnable) {
        m123373h().mo123376a(runnable);
    }

    @Override // p351n0.AbstractC23506e
    /* renamed from: a */
    public void mo123376a(Runnable runnable) {
        this.f114144a.mo123376a(runnable);
    }

    @Override // p351n0.AbstractC23506e
    /* renamed from: c */
    public boolean mo123377c() {
        return this.f114144a.mo123377c();
    }

    @Override // p351n0.AbstractC23506e
    /* renamed from: d */
    public void mo123378d(Runnable runnable) {
        this.f114144a.mo123378d(runnable);
    }
}
