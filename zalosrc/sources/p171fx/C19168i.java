package p171fx;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fx.i */
/* loaded from: classes4.dex */
public class C19168i extends Thread {

    /* renamed from: q */
    private static final List f95259q = new ArrayList();

    /* renamed from: p */
    private volatile boolean f95260p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fx.i$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        static final C19168i f95261a = new C19168i();
    }

    /* renamed from: a */
    private void m100577a() {
        try {
            AbstractC19160a abstractC19160a = (AbstractC19160a) f95259q.remove(0);
            if (abstractC19160a != null) {
                abstractC19160a.mo98440a(abstractC19160a.m100506b());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m100578b(AbstractC19160a abstractC19160a, List list) {
        C19168i c19168i = a.f95261a;
        synchronized (c19168i) {
            if (list != null) {
                try {
                    abstractC19160a.m100508d(list);
                    list.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (abstractC19160a.m100507c()) {
                f95259q.add(0, abstractC19160a);
            } else {
                f95259q.add(abstractC19160a);
            }
            c19168i.notifyAll();
        }
    }

    /* renamed from: c */
    public static void m100579c(AbstractC19160a abstractC19160a) {
        m100578b(abstractC19160a, null);
    }

    /* renamed from: d */
    public static void m100580d(AbstractC19160a abstractC19160a, List list) {
        m100578b(abstractC19160a, list);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f95260p) {
            synchronized (this) {
                if (f95259q.isEmpty()) {
                    try {
                        wait();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (this.f95260p) {
                m100577a();
            } else {
                return;
            }
        }
    }

    private C19168i() {
        super("Z:ZamTrackingBGWorker");
        this.f95260p = true;
        start();
    }
}
