package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class t62 implements qb3 {

    /* renamed from: a */
    private final hv2 f28226a;

    /* renamed from: b */
    private final y71 f28227b;

    /* renamed from: c */
    private final kx2 f28228c;

    /* renamed from: d */
    private final ox2 f28229d;

    /* renamed from: e */
    private final Executor f28230e;

    /* renamed from: f */
    private final ScheduledExecutorService f28231f;

    /* renamed from: g */
    private final y31 f28232g;

    /* renamed from: h */
    private final p62 f28233h;

    /* renamed from: i */
    private final g32 f28234i;

    /* renamed from: j */
    private final Context f28235j;

    /* renamed from: k */
    private final vw2 f28236k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t62(Context context, hv2 hv2Var, p62 p62Var, y71 y71Var, kx2 kx2Var, ox2 ox2Var, y31 y31Var, Executor executor, ScheduledExecutorService scheduledExecutorService, g32 g32Var, vw2 vw2Var) {
        this.f28235j = context;
        this.f28226a = hv2Var;
        this.f28233h = p62Var;
        this.f28227b = y71Var;
        this.f28228c = kx2Var;
        this.f28229d = ox2Var;
        this.f28232g = y31Var;
        this.f28230e = executor;
        this.f28231f = scheduledExecutorService;
        this.f28234i = g32Var;
        this.f28236k = vw2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ tc3 m26574a(iq2 iq2Var, tq2 tq2Var, c32 c32Var, Throwable th2) {
        kw2 m23764a = jw2.m23764a(this.f28235j, 12);
        m23764a.mo23068t(iq2Var.f22292F);
        m23764a.zzf();
        p62 p62Var = this.f28233h;
        tc3 m23883o = kc3.m23883o(c32Var.mo20790b(tq2Var, iq2Var), iq2Var.f22305S, TimeUnit.MILLISECONDS, this.f28231f);
        p62Var.m25410e(tq2Var, iq2Var, m23883o, this.f28228c);
        uw2.m27075a(m23883o, this.f28236k, m23764a);
        return m23883o;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    @Override // com.google.android.gms.internal.ads.qb3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ tc3 zza(Object obj) {
        String str;
        kq2 kq2Var;
        int i11;
        final tq2 tq2Var = (tq2) obj;
        int i12 = tq2Var.f28473b.f27823b.f24017e;
        if (i12 != 0) {
            if (i12 >= 200 && i12 < 300) {
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20956C4)).booleanValue()) {
                    str = "No fill.";
                }
            } else if (i12 >= 300 && i12 < 400) {
                str = "No location header to follow redirect or too many redirects.";
            } else {
                str = "Received error HTTP response code: " + i12;
            }
            lq2 lq2Var = tq2Var.f28473b.f27823b;
            kq2Var = lq2Var.f24021i;
            if (kq2Var != null) {
                str = kq2Var.m24019a();
            }
            this.f28234i.m22274g(lq2Var);
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21254g7)).booleanValue() && (i11 = tq2Var.f28473b.f27823b.f24017e) != 0 && (i11 < 200 || i11 >= 300)) {
                return kc3.m23876h(new zzekr(3, str));
            }
            lu2 m28018a = qu2.m25890c(kc3.m23876h(new zzekr(3, str)), bv2.RENDER_CONFIG_INIT, this.f28226a).m28018a();
            for (iq2 iq2Var : tq2Var.f28473b.f27822a) {
                this.f28234i.m22271d(iq2Var);
                Iterator it = iq2Var.f22313a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c32 mo27824a = this.f28232g.mo27824a(iq2Var.f22315b, (String) it.next());
                        if (mo27824a == null || !mo27824a.mo20789a(tq2Var, iq2Var)) {
                        }
                    } else {
                        this.f28234i.m22272e(iq2Var, 0L, cs2.m20999d(1, null, null));
                        break;
                    }
                }
            }
            this.f28227b.m23890s0(new ez0(tq2Var, this.f28229d, this.f28228c), this.f28230e);
            int i13 = 0;
            for (final iq2 iq2Var2 : tq2Var.f28473b.f27822a) {
                Iterator it2 = iq2Var2.f22313a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str2 = (String) it2.next();
                    final c32 mo27824a2 = this.f28232g.mo27824a(iq2Var2.f22315b, str2);
                    if (mo27824a2 != null && mo27824a2.mo20789a(tq2Var, iq2Var2)) {
                        m28018a = this.f28226a.m28361b(bv2.RENDER_CONFIG_WATERFALL, m28018a).m28025h("render-config-" + i13 + "-" + str2).m28020c(Throwable.class, new qb3() { // from class: com.google.android.gms.internal.ads.s62
                            @Override // com.google.android.gms.internal.ads.qb3
                            public final tc3 zza(Object obj2) {
                                return t62.this.m26574a(iq2Var2, tq2Var, mo27824a2, (Throwable) obj2);
                            }
                        }).m28018a();
                        break;
                    }
                }
                i13++;
            }
            return m28018a;
        }
        str = "No ad config.";
        lq2 lq2Var2 = tq2Var.f28473b.f27823b;
        kq2Var = lq2Var2.f24021i;
        if (kq2Var != null) {
        }
        this.f28234i.m22274g(lq2Var2);
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21254g7)).booleanValue()) {
        }
        lu2 m28018a2 = qu2.m25890c(kc3.m23876h(new zzekr(3, str)), bv2.RENDER_CONFIG_INIT, this.f28226a).m28018a();
        while (r1.hasNext()) {
        }
        this.f28227b.m23890s0(new ez0(tq2Var, this.f28229d, this.f28228c), this.f28230e);
        int i132 = 0;
        while (r1.hasNext()) {
        }
        return m28018a2;
    }
}
