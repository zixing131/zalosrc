package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import p468r0.C25593d;

/* loaded from: classes2.dex */
public final class q42 implements c32 {

    /* renamed from: a */
    private final Context f26626a;

    /* renamed from: b */
    private final lh1 f26627b;

    /* renamed from: c */
    private final Executor f26628c;

    /* renamed from: d */
    private final hq2 f26629d;

    public q42(Context context, Executor executor, lh1 lh1Var, hq2 hq2Var) {
        this.f26626a = context;
        this.f26627b = lh1Var;
        this.f26628c = executor;
        this.f26629d = hq2Var;
    }

    /* renamed from: d */
    private static String m25654d(iq2 iq2Var) {
        try {
            return iq2Var.f22351w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: a */
    public final boolean mo20789a(tq2 tq2Var, iq2 iq2Var) {
        Context context = this.f26626a;
        if ((context instanceof Activity) && C4555gy.m22629g(context) && !TextUtils.isEmpty(m25654d(iq2Var))) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: b */
    public final tc3 mo20790b(final tq2 tq2Var, final iq2 iq2Var) {
        final Uri uri;
        String m25654d = m25654d(iq2Var);
        if (m25654d != null) {
            uri = Uri.parse(m25654d);
        } else {
            uri = null;
        }
        return kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.o42
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return q42.this.m25655c(uri, tq2Var, iq2Var, obj);
            }
        }, this.f26628c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ tc3 m25655c(Uri uri, tq2 tq2Var, iq2 iq2Var, Object obj) {
        try {
            C25593d m132189a = new C25593d.a().m132189a();
            m132189a.f122359a.setData(uri);
            zzc zzcVar = new zzc(m132189a.f122359a, null);
            final pl0 pl0Var = new pl0();
            kg1 mo20307c = this.f26627b.mo20307c(new k41(tq2Var, iq2Var, null), new ng1(new sh1() { // from class: com.google.android.gms.internal.ads.p42
                @Override // com.google.android.gms.internal.ads.sh1
                /* renamed from: a */
                public final void mo21616a(boolean z11, Context context, j81 j81Var) {
                    pl0 pl0Var2 = pl0.this;
                    try {
                        zzt.zzi();
                        zzm.zza(context, (AdOverlayInfoParcel) pl0Var2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            pl0Var.zzd(new AdOverlayInfoParcel(zzcVar, null, mo20307c.mo23943h(), null, new zzcgv(0, 0, false, false, false), null, null));
            this.f26629d.m22997a();
            return kc3.m23877i(mo20307c.mo23944i());
        } catch (Throwable th2) {
            yk0.zzh("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }
}
