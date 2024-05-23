package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class dj2 implements sh2 {

    /* renamed from: a */
    private final Context f19273a;

    /* renamed from: b */
    private final hk0 f19274b;

    /* renamed from: c */
    private final ScheduledExecutorService f19275c;

    /* renamed from: d */
    private final Executor f19276d;

    /* renamed from: e */
    private final String f19277e;

    /* renamed from: f */
    private final yj0 f19278f;

    public dj2(yj0 yj0Var, int i11, Context context, hk0 hk0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f19278f = yj0Var;
        this.f19273a = context;
        this.f19274b = hk0Var;
        this.f19275c = scheduledExecutorService;
        this.f19276d = executor;
        this.f19277e = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ej2 m21426a(Exception exc) {
        this.f19274b.m22945t(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return kc3.m23874f((ac3) kc3.m23883o(kc3.m23881m(ac3.m20071D(kc3.m23880l(new pb3() { // from class: com.google.android.gms.internal.ads.aj2
            @Override // com.google.android.gms.internal.ads.pb3
            public final tc3 zza() {
                return kc3.m23877i(null);
            }
        }, this.f19276d)), new y43() { // from class: com.google.android.gms.internal.ads.bj2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new ej2(str);
            }
        }, this.f19276d), ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21082P0)).longValue(), TimeUnit.MILLISECONDS, this.f19275c), Exception.class, new y43() { // from class: com.google.android.gms.internal.ads.cj2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                dj2.this.m21426a((Exception) obj);
                return null;
            }
        }, ad3.m20088b());
    }
}
