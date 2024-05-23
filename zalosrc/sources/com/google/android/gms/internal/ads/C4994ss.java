package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ss */
/* loaded from: classes2.dex */
public final class C4994ss {

    /* renamed from: a */
    private final byte[] f27829a;

    /* renamed from: b */
    private int f27830b;

    /* renamed from: c */
    final /* synthetic */ C5031ts f27831c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4994ss(C5031ts c5031ts, byte[] bArr, AbstractC4957rs abstractC4957rs) {
        this.f27831c = c5031ts;
        this.f27829a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final synchronized void m26393d() {
        try {
            C5031ts c5031ts = this.f27831c;
            if (c5031ts.f28527b) {
                c5031ts.f28526a.mo25703L(this.f27829a);
                this.f27831c.f28526a.mo25701B(0);
                this.f27831c.f28526a.mo25705b(this.f27830b);
                this.f27831c.f28526a.mo25702C(null);
                this.f27831c.f28526a.zzf();
            }
        } catch (RemoteException e11) {
            yk0.zzf("Clearcut log failed", e11);
        }
    }

    /* renamed from: a */
    public final C4994ss m26394a(int i11) {
        this.f27830b = i11;
        return this;
    }

    /* renamed from: c */
    public final synchronized void m26395c() {
        ExecutorService executorService;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21000G8)).booleanValue()) {
            executorService = this.f27831c.f28528c;
            executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qs
                @Override // java.lang.Runnable
                public final void run() {
                    C4994ss.this.m26393d();
                }
            });
        } else {
            m26393d();
        }
    }
}
