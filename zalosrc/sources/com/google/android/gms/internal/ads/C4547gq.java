package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gq */
/* loaded from: classes2.dex */
public final class C4547gq {

    /* renamed from: b */
    int f20791b;

    /* renamed from: a */
    private final Object f20790a = new Object();

    /* renamed from: c */
    private final List f20792c = new LinkedList();

    /* renamed from: a */
    public final C4510fq m22509a(boolean z11) {
        int i11;
        synchronized (this.f20790a) {
            try {
                C4510fq c4510fq = null;
                if (this.f20792c.isEmpty()) {
                    yk0.zze("Queue empty");
                    return null;
                }
                int i12 = 0;
                if (this.f20792c.size() >= 2) {
                    int i13 = Integer.MIN_VALUE;
                    int i14 = 0;
                    for (C4510fq c4510fq2 : this.f20792c) {
                        int m22124b = c4510fq2.m22124b();
                        if (m22124b > i13) {
                            i12 = i14;
                        }
                        if (m22124b > i13) {
                            i11 = m22124b;
                        } else {
                            i11 = i13;
                        }
                        if (m22124b > i13) {
                            c4510fq = c4510fq2;
                        }
                        i14++;
                        i13 = i11;
                    }
                    this.f20792c.remove(i12);
                    return c4510fq;
                }
                C4510fq c4510fq3 = (C4510fq) this.f20792c.get(0);
                if (z11) {
                    this.f20792c.remove(0);
                } else {
                    c4510fq3.m22131i();
                }
                return c4510fq3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m22510b(C4510fq c4510fq) {
        synchronized (this.f20790a) {
            try {
                if (this.f20792c.size() >= 10) {
                    yk0.zze("Queue is full, current size = " + this.f20792c.size());
                    this.f20792c.remove(0);
                }
                int i11 = this.f20791b;
                this.f20791b = i11 + 1;
                c4510fq.m22132j(i11);
                c4510fq.m22136n();
                this.f20792c.add(c4510fq);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final boolean m22511c(C4510fq c4510fq) {
        synchronized (this.f20790a) {
            try {
                Iterator it = this.f20792c.iterator();
                while (it.hasNext()) {
                    C4510fq c4510fq2 = (C4510fq) it.next();
                    if (!zzt.zzo().m22936h().zzM()) {
                        if (!c4510fq.equals(c4510fq2) && c4510fq2.m22126d().equals(c4510fq.m22126d())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzt.zzo().m22936h().zzN() && !c4510fq.equals(c4510fq2) && c4510fq2.m22128f().equals(c4510fq.m22128f())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final boolean m22512d(C4510fq c4510fq) {
        synchronized (this.f20790a) {
            try {
                if (this.f20792c.contains(c4510fq)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
