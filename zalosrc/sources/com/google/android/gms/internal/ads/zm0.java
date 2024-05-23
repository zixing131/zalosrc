package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zm0 {

    /* renamed from: b */
    private long f31566b;

    /* renamed from: a */
    private final long f31565a = TimeUnit.MILLISECONDS.toNanos(((Long) zzay.zzc().m21823b(AbstractC4554gx.f20941B)).longValue());

    /* renamed from: c */
    private boolean f31567c = true;

    /* renamed from: a */
    public final void m28547a(SurfaceTexture surfaceTexture, final mm0 mm0Var) {
        if (mm0Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f31567c && Math.abs(timestamp - this.f31566b) < this.f31565a) {
            return;
        }
        this.f31567c = false;
        this.f31566b = timestamp;
        zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ym0
            @Override // java.lang.Runnable
            public final void run() {
                mm0.this.zzk();
            }
        });
    }

    /* renamed from: b */
    public final void m28548b() {
        this.f31567c = true;
    }
}
