package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p342m6.AbstractC22894m;
import p355n4.C23538c;

/* loaded from: classes2.dex */
public final class xi2 implements sh2 {

    /* renamed from: a */
    private final hk0 f30473a;

    /* renamed from: b */
    private final String f30474b;

    /* renamed from: c */
    private final ScheduledExecutorService f30475c;

    /* renamed from: d */
    private final uc3 f30476d;

    /* renamed from: e */
    private final C4993sr f30477e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xi2(String str, C4993sr c4993sr, hk0 hk0Var, ScheduledExecutorService scheduledExecutorService, uc3 uc3Var, byte[] bArr) {
        this.f30474b = str;
        this.f30477e = c4993sr;
        this.f30473a = hk0Var;
        this.f30475c = scheduledExecutorService;
        this.f30476d = uc3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ yi2 m27890a(Exception exc) {
        this.f30473a.m22945t(exc, "AppSetIdInfoGmscoreSignal");
        return new yi2(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21309m2)).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21359r2)).booleanValue()) {
                tc3 m23882n = kc3.m23882n(p23.m25381a(AbstractC22894m.m117604f(null)), new qb3() { // from class: com.google.android.gms.internal.ads.vi2
                    @Override // com.google.android.gms.internal.ads.qb3
                    public final tc3 zza(Object obj) {
                        C23538c c23538c = (C23538c) obj;
                        if (c23538c == null) {
                            return kc3.m23877i(new yi2(null, -1));
                        }
                        return kc3.m23877i(new yi2(c23538c.m123623a(), c23538c.m123624b()));
                    }
                }, this.f30476d);
                if (((Boolean) AbstractC4814ny.f25372a.m24091e()).booleanValue()) {
                    m23882n = kc3.m23883o(m23882n, ((Long) AbstractC4814ny.f25373b.m24091e()).longValue(), TimeUnit.MILLISECONDS, this.f30475c);
                }
                return kc3.m23874f(m23882n, Exception.class, new y43() { // from class: com.google.android.gms.internal.ads.wi2
                    @Override // com.google.android.gms.internal.ads.y43
                    public final Object apply(Object obj) {
                        return xi2.this.m27890a((Exception) obj);
                    }
                }, this.f30476d);
            }
        }
        return kc3.m23877i(new yi2(null, -1));
    }
}
