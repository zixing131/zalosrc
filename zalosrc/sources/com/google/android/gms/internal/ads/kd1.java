package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class kd1 {

    /* renamed from: p */
    protected final Map f23215p = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public kd1(Set set) {
        m23891v0(set);
    }

    /* renamed from: n0 */
    public final synchronized void m23889n0(if1 if1Var) {
        m23890s0(if1Var.f22165a, if1Var.f22166b);
    }

    /* renamed from: s0 */
    public final synchronized void m23890s0(Object obj, Executor executor) {
        this.f23215p.put(obj, executor);
    }

    /* renamed from: v0 */
    public final synchronized void m23891v0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m23889n0((if1) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x0 */
    public final synchronized void m23892x0(final jd1 jd1Var) {
        for (Map.Entry entry : this.f23215p.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.id1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        jd1.this.zza(key);
                    } catch (Throwable th2) {
                        zzt.zzo().m22944s(th2, "EventEmitter.notify");
                        zze.zzb("Event emitter exception.", th2);
                    }
                }
            });
        }
    }
}
