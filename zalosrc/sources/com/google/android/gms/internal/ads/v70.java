package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v70 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ g80 f29215p;

    /* renamed from: q */
    final /* synthetic */ b70 f29216q;

    /* renamed from: r */
    final /* synthetic */ h80 f29217r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v70(h80 h80Var, g80 g80Var, b70 b70Var) {
        this.f29217r = h80Var;
        this.f29215p = g80Var;
        this.f29216q = b70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.f29217r.f21572a;
        synchronized (obj) {
            try {
                if (this.f29215p.m27650a() != -1 && this.f29215p.m27650a() != 1) {
                    this.f29215p.m27651c();
                    uc3 uc3Var = kl0.f23367e;
                    final b70 b70Var = this.f29216q;
                    uc3Var.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.u70
                        @Override // java.lang.Runnable
                        public final void run() {
                            b70.this.zzc();
                        }
                    });
                    zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
                }
            } finally {
            }
        }
    }
}
