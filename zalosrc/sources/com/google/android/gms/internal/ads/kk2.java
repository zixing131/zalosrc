package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class kk2 implements sh2 {

    /* renamed from: a */
    private final hk0 f23355a;

    /* renamed from: b */
    private final boolean f23356b;

    /* renamed from: c */
    private final boolean f23357c;

    /* renamed from: d */
    private final ScheduledExecutorService f23358d;

    /* renamed from: e */
    private final uc3 f23359e;

    /* renamed from: f */
    private final String f23360f;

    /* renamed from: g */
    private final wj0 f23361g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kk2(hk0 hk0Var, boolean z11, boolean z12, wj0 wj0Var, uc3 uc3Var, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.f23355a = hk0Var;
        this.f23356b = z11;
        this.f23357c = z12;
        this.f23361g = wj0Var;
        this.f23359e = uc3Var;
        this.f23360f = str;
        this.f23358d = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ lk2 m23957a(Exception exc) {
        this.f23355a.m22945t(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21313m6)).booleanValue() && this.f23357c) {
            return kc3.m23877i(null);
        }
        if (!this.f23356b) {
            return kc3.m23877i(null);
        }
        return kc3.m23874f(kc3.m23883o(kc3.m23881m(kc3.m23877i(null), new y43() { // from class: com.google.android.gms.internal.ads.ik2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new lk2(str);
            }
        }, this.f23359e), ((Long) AbstractC4778mz.f24948c.m24091e()).longValue(), TimeUnit.MILLISECONDS, this.f23358d), Exception.class, new y43() { // from class: com.google.android.gms.internal.ads.jk2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                kk2.this.m23957a((Exception) obj);
                return null;
            }
        }, this.f23359e);
    }
}
