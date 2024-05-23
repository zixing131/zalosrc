package p234ia;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ia.a */
/* loaded from: classes.dex */
public class C20448a {

    /* renamed from: a */
    private final ReferenceQueue f100649a = new ReferenceQueue();

    /* renamed from: b */
    private final Set f100650b = Collections.synchronizedSet(new HashSet());

    /* renamed from: ia.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo106483a();
    }

    private C20448a() {
    }

    /* renamed from: a */
    public static C20448a m106481a() {
        C20448a c20448a = new C20448a();
        c20448a.m106482b(c20448a, new Runnable() { // from class: ia.p
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c20448a.f100649a;
        final Set set = c20448a.f100650b;
        Thread thread = new Thread(new Runnable() { // from class: ia.o
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((C20475r) referenceQueue2.remove()).mo106483a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c20448a;
    }

    /* renamed from: b */
    public a m106482b(Object obj, Runnable runnable) {
        C20475r c20475r = new C20475r(obj, this.f100649a, this.f100650b, runnable, null);
        this.f100650b.add(c20475r);
        return c20475r;
    }
}
