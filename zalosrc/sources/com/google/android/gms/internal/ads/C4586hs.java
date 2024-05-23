package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4172d;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.hs */
/* loaded from: classes2.dex */
public final class C4586hs implements AbstractC4172d.a {

    /* renamed from: p */
    final /* synthetic */ zzbeb f21888p;

    /* renamed from: q */
    final /* synthetic */ pl0 f21889q;

    /* renamed from: r */
    final /* synthetic */ C4659js f21890r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4586hs(C4659js c4659js, zzbeb zzbebVar, pl0 pl0Var) {
        this.f21890r = c4659js;
        this.f21888p = zzbebVar;
        this.f21889q = pl0Var;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: E */
    public final void mo19635E(Bundle bundle) {
        Object obj;
        boolean z11;
        final C5253zr c5253zr;
        obj = this.f21890r.f22976d;
        synchronized (obj) {
            try {
                C4659js c4659js = this.f21890r;
                z11 = c4659js.f22974b;
                if (!z11) {
                    c4659js.f22974b = true;
                    c5253zr = this.f21890r.f22973a;
                    if (c5253zr == null) {
                        return;
                    }
                    uc3 uc3Var = kl0.f23363a;
                    final zzbeb zzbebVar = this.f21888p;
                    final pl0 pl0Var = this.f21889q;
                    final tc3 mo21340T = uc3Var.mo21340T(new Runnable() { // from class: com.google.android.gms.internal.ads.es
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbdy m20703N;
                            C4586hs c4586hs = C4586hs.this;
                            C5253zr c5253zr2 = c5253zr;
                            zzbeb zzbebVar2 = zzbebVar;
                            pl0 pl0Var2 = pl0Var;
                            try {
                                C4365bs m28589h = c5253zr2.m28589h();
                                if (c5253zr2.m28588g()) {
                                    m20703N = m28589h.m20704Q(zzbebVar2);
                                } else {
                                    m20703N = m28589h.m20703N(zzbebVar2);
                                }
                                if (!m20703N.m28701M()) {
                                    pl0Var2.zze(new RuntimeException("No entry contents."));
                                    C4659js.m23734e(c4586hs.f21890r);
                                    return;
                                }
                                C4549gs c4549gs = new C4549gs(c4586hs, m20703N.m28699J(), 1);
                                int read = c4549gs.read();
                                if (read != -1) {
                                    c4549gs.unread(read);
                                    pl0Var2.zzd(C4733ls.m24363b(c4549gs, m20703N.m28700K(), m20703N.m28703Z(), m20703N.m28704t(), m20703N.m28702Q()));
                                    return;
                                }
                                throw new IOException("Unable to read from cache.");
                            } catch (RemoteException e11) {
                                e = e11;
                                yk0.zzh("Unable to obtain a cache service instance.", e);
                                pl0Var2.zze(e);
                                C4659js.m23734e(c4586hs.f21890r);
                            } catch (IOException e12) {
                                e = e12;
                                yk0.zzh("Unable to obtain a cache service instance.", e);
                                pl0Var2.zze(e);
                                C4659js.m23734e(c4586hs.f21890r);
                            }
                        }
                    });
                    final pl0 pl0Var2 = this.f21889q;
                    pl0Var2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.fs
                        @Override // java.lang.Runnable
                        public final void run() {
                            pl0 pl0Var3 = pl0.this;
                            Future future = mo21340T;
                            if (pl0Var3.isCancelled()) {
                                future.cancel(true);
                            }
                        }
                    }, kl0.f23368f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: N */
    public final void mo19636N(int i11) {
    }
}
