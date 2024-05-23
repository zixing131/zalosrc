package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class gy1 implements fz1 {

    /* renamed from: h */
    private static final Pattern f21455h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a */
    private final dx1 f21456a;

    /* renamed from: b */
    private final uc3 f21457b;

    /* renamed from: c */
    private final dr2 f21458c;

    /* renamed from: d */
    private final ScheduledExecutorService f21459d;

    /* renamed from: e */
    private final m12 f21460e;

    /* renamed from: f */
    private final vw2 f21461f;

    /* renamed from: g */
    private final Context f21462g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gy1(Context context, dr2 dr2Var, dx1 dx1Var, uc3 uc3Var, ScheduledExecutorService scheduledExecutorService, m12 m12Var, vw2 vw2Var) {
        this.f21462g = context;
        this.f21458c = dr2Var;
        this.f21456a = dx1Var;
        this.f21457b = uc3Var;
        this.f21459d = scheduledExecutorService;
        this.f21460e = m12Var;
        this.f21461f = vw2Var;
    }

    @Override // com.google.android.gms.internal.ads.fz1
    /* renamed from: a */
    public final tc3 mo21571a(zzcbc zzcbcVar) {
        tc3 m21559b = this.f21456a.m21559b(zzcbcVar);
        kw2 m23764a = jw2.m23764a(this.f21462g, 11);
        uw2.m27078d(m21559b, m23764a);
        tc3 m23882n = kc3.m23882n(m21559b, new qb3() { // from class: com.google.android.gms.internal.ads.dy1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return gy1.this.m22639c((InputStream) obj);
            }
        }, this.f21457b);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20966D4)).booleanValue()) {
            m23882n = kc3.m23875g(kc3.m23883o(m23882n, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20976E4)).intValue(), TimeUnit.SECONDS, this.f21459d), TimeoutException.class, new qb3() { // from class: com.google.android.gms.internal.ads.ey1
                @Override // com.google.android.gms.internal.ads.qb3
                public final tc3 zza(Object obj) {
                    return kc3.m23876h(new zzebh(5));
                }
            }, kl0.f23368f);
        }
        uw2.m27075a(m23882n, this.f21461f, m23764a);
        kc3.m23886r(m23882n, new fy1(this), kl0.f23368f);
        return m23882n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ tc3 m22639c(InputStream inputStream) {
        return kc3.m23877i(new tq2(new qq2(this.f21458c), sq2.m26389a(new InputStreamReader(inputStream))));
    }
}
