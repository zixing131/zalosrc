package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hq */
/* loaded from: classes2.dex */
final class RunnableC4584hq implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C4621iq f21875p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4584hq(C4621iq c4621iq) {
        this.f21875p = c4621iq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z11;
        boolean z12;
        List list;
        obj = this.f21875p.f22260r;
        synchronized (obj) {
            C4621iq c4621iq = this.f21875p;
            z11 = c4621iq.f22261s;
            if (z11) {
                z12 = c4621iq.f22262t;
                if (z12) {
                    c4621iq.f22261s = false;
                    yk0.zze("App went background");
                    list = this.f21875p.f22263u;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((InterfaceC4657jq) it.next()).zza(false);
                        } catch (Exception e11) {
                            yk0.zzh("", e11);
                        }
                    }
                }
            }
            yk0.zze("App is still foreground");
        }
    }
}
