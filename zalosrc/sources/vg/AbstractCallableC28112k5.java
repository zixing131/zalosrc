package vg;

import java.util.concurrent.Callable;

/* renamed from: vg.k5 */
/* loaded from: classes3.dex */
public abstract class AbstractCallableC28112k5 implements Callable {

    /* renamed from: b */
    private static final Object f131090b = new Object();

    /* renamed from: a */
    private volatile Object f131091a = f131090b;

    /* renamed from: a */
    public Object m141598a() {
        Object obj = this.f131091a;
        Object obj2 = f131090b;
        if (obj != obj2) {
            return this.f131091a;
        }
        synchronized (this) {
            try {
                if (this.f131091a == obj2) {
                    this.f131091a = call();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f131091a;
    }

    /* renamed from: b */
    public void m141599b() {
        this.f131091a = f131090b;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return null;
    }
}
