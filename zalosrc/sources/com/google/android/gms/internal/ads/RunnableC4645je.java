package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.je */
/* loaded from: classes2.dex */
public final class RunnableC4645je implements Runnable {

    /* renamed from: p */
    final /* synthetic */ int f22787p;

    /* renamed from: q */
    final /* synthetic */ C4719le f22788q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4645je(C4719le c4719le, int i11, boolean z11) {
        this.f22788q = c4719le;
        this.f22787p = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4606ib c4606ib;
        C4719le c4719le = this.f22788q;
        if (this.f22787p > 0) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = c4719le.f23865a.getPackageManager().getPackageInfo(c4719le.f23865a.getPackageName(), 0);
            Context context = c4719le.f23865a;
            c4606ib = g03.m22256a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            c4606ib = null;
        }
        this.f22788q.f23874j = c4606ib;
        if (this.f22787p < 4) {
            if (c4606ib == null || !c4606ib.m23218r0() || c4606ib.m23216F0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !c4606ib.m23219s0() || !c4606ib.m23214D0().m26061I() || c4606ib.m23214D0().m26060F() == -2) {
                this.f22788q.m24250o(this.f22787p + 1, true);
            }
        }
    }
}
