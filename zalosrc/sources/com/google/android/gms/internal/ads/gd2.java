package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p342m6.AbstractC22888j;
import p355n4.AbstractC23536a;
import p355n4.C23538c;
import p355n4.InterfaceC23537b;

/* loaded from: classes2.dex */
public final class gd2 implements sh2 {

    /* renamed from: a */
    final hk0 f20558a;

    /* renamed from: b */
    InterfaceC23537b f20559b;

    /* renamed from: c */
    private final ScheduledExecutorService f20560c;

    /* renamed from: d */
    private final uc3 f20561d;

    /* renamed from: e */
    private final Context f20562e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gd2(Context context, hk0 hk0Var, ScheduledExecutorService scheduledExecutorService, uc3 uc3Var) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21349q2)).booleanValue()) {
            this.f20559b = AbstractC23536a.m123621a(context);
        }
        this.f20562e = context;
        this.f20558a = hk0Var;
        this.f20560c = scheduledExecutorService;
        this.f20561d = uc3Var;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        AbstractC22888j mo123622d;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21309m2)).booleanValue()) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21359r2)).booleanValue()) {
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21319n2)).booleanValue()) {
                    return kc3.m23881m(p23.m25381a(this.f20559b.mo123622d()), new y43() { // from class: com.google.android.gms.internal.ads.dd2
                        @Override // com.google.android.gms.internal.ads.y43
                        public final Object apply(Object obj) {
                            C23538c c23538c = (C23538c) obj;
                            return new hd2(c23538c.m123623a(), c23538c.m123624b());
                        }
                    }, kl0.f23368f);
                }
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21349q2)).booleanValue()) {
                    mo123622d = fs2.m22157a(this.f20562e);
                } else {
                    mo123622d = this.f20559b.mo123622d();
                }
                if (mo123622d == null) {
                    return kc3.m23877i(new hd2(null, -1));
                }
                tc3 m23882n = kc3.m23882n(p23.m25381a(mo123622d), new qb3() { // from class: com.google.android.gms.internal.ads.ed2
                    @Override // com.google.android.gms.internal.ads.qb3
                    public final tc3 zza(Object obj) {
                        C23538c c23538c = (C23538c) obj;
                        if (c23538c == null) {
                            return kc3.m23877i(new hd2(null, -1));
                        }
                        return kc3.m23877i(new hd2(c23538c.m123623a(), c23538c.m123624b()));
                    }
                }, kl0.f23368f);
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21329o2)).booleanValue()) {
                    m23882n = kc3.m23883o(m23882n, ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21339p2)).longValue(), TimeUnit.MILLISECONDS, this.f20560c);
                }
                return kc3.m23874f(m23882n, Exception.class, new y43() { // from class: com.google.android.gms.internal.ads.fd2
                    @Override // com.google.android.gms.internal.ads.y43
                    public final Object apply(Object obj) {
                        gd2.this.f20558a.m22945t((Exception) obj, "AppSetIdInfoSignal");
                        return new hd2(null, -1);
                    }
                }, this.f20561d);
            }
        }
        return kc3.m23877i(new hd2(null, -1));
    }
}
