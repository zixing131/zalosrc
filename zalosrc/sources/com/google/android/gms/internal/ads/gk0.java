package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class gk0 {

    /* renamed from: a */
    private final Object f20714a = new Object();

    /* renamed from: c */
    private volatile int f20716c = 1;

    /* renamed from: b */
    private volatile long f20715b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ gk0(fk0 fk0Var) {
    }

    /* renamed from: a */
    public final void m22463a() {
        long mo105913a = zzt.zzB().mo105913a();
        synchronized (this.f20714a) {
            try {
                if (this.f20716c == 3) {
                    if (this.f20715b + ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21192a5)).longValue() <= mo105913a) {
                        this.f20716c = 1;
                    }
                }
            } finally {
            }
        }
        long mo105913a2 = zzt.zzB().mo105913a();
        synchronized (this.f20714a) {
            try {
                if (this.f20716c != 2) {
                    return;
                }
                this.f20716c = 3;
                if (this.f20716c == 3) {
                    this.f20715b = mo105913a2;
                }
            } finally {
            }
        }
    }
}
