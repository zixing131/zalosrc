package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class xy1 extends qy1 {

    /* renamed from: v */
    private String f30684v;

    /* renamed from: w */
    private int f30685w = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xy1(Context context) {
        this.f27000u = new af0(context, zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: E */
    public final void mo19635E(Bundle bundle) {
        synchronized (this.f26996q) {
            try {
                if (!this.f26998s) {
                    this.f26998s = true;
                    try {
                        int i11 = this.f30685w;
                        if (i11 == 2) {
                            this.f27000u.m20100g().mo21363B2(this.f26999t, new py1(this));
                        } else if (i11 == 3) {
                            this.f27000u.m20100g().mo21364S3(this.f30684v, new py1(this));
                        } else {
                            this.f26995p.zze(new zzedj(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f26995p.zze(new zzedj(1));
                    } catch (Throwable th2) {
                        zzt.zzo().m22945t(th2, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.f26995p.zze(new zzedj(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qy1, com.google.android.gms.common.internal.AbstractC4172d.b
    /* renamed from: Q */
    public final void mo19643Q(ConnectionResult connectionResult) {
        yk0.zze("Cannot connect to remote service, fallback to local instance.");
        this.f26995p.zze(new zzedj(1));
    }

    /* renamed from: b */
    public final tc3 m28078b(zzcbc zzcbcVar) {
        synchronized (this.f26996q) {
            try {
                int i11 = this.f30685w;
                if (i11 != 1 && i11 != 2) {
                    return kc3.m23876h(new zzedj(2));
                }
                if (this.f26997r) {
                    return this.f26995p;
                }
                this.f30685w = 2;
                this.f26997r = true;
                this.f26999t = zzcbcVar;
                this.f27000u.checkAvailabilityAndConnect();
                this.f26995p.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.vy1
                    @Override // java.lang.Runnable
                    public final void run() {
                        xy1.this.m25918a();
                    }
                }, kl0.f23368f);
                return this.f26995p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final tc3 m28079c(String str) {
        synchronized (this.f26996q) {
            try {
                int i11 = this.f30685w;
                if (i11 != 1 && i11 != 3) {
                    return kc3.m23876h(new zzedj(2));
                }
                if (this.f26997r) {
                    return this.f26995p;
                }
                this.f30685w = 3;
                this.f26997r = true;
                this.f30684v = str;
                this.f27000u.checkAvailabilityAndConnect();
                this.f26995p.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.uy1
                    @Override // java.lang.Runnable
                    public final void run() {
                        xy1.this.m25918a();
                    }
                }, kl0.f23368f);
                return this.f26995p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
