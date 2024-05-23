package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class p02 implements rc1, zza, q81, a81 {

    /* renamed from: p */
    private final Context f26015p;

    /* renamed from: q */
    private final rr2 f26016q;

    /* renamed from: r */
    private final tq2 f26017r;

    /* renamed from: s */
    private final iq2 f26018s;

    /* renamed from: t */
    private final n22 f26019t;

    /* renamed from: u */
    private Boolean f26020u;

    /* renamed from: v */
    private final boolean f26021v = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21137U5)).booleanValue();

    /* renamed from: w */
    private final rv2 f26022w;

    /* renamed from: x */
    private final String f26023x;

    public p02(Context context, rr2 rr2Var, tq2 tq2Var, iq2 iq2Var, n22 n22Var, rv2 rv2Var, String str) {
        this.f26015p = context;
        this.f26016q = rr2Var;
        this.f26017r = tq2Var;
        this.f26018s = iq2Var;
        this.f26019t = n22Var;
        this.f26022w = rv2Var;
        this.f26023x = str;
    }

    /* renamed from: c */
    private final qv2 m25368c(String str) {
        String str2;
        qv2 m25905b = qv2.m25905b(str);
        m25905b.m25912h(this.f26017r, null);
        m25905b.m25910f(this.f26018s);
        m25905b.m25907a("request_id", this.f26023x);
        if (!this.f26018s.f22349u.isEmpty()) {
            m25905b.m25907a("ancn", (String) this.f26018s.f22349u.get(0));
        }
        if (this.f26018s.f22334k0) {
            if (true != zzt.zzo().m22947v(this.f26015p)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            m25905b.m25907a("device_connectivity", str2);
            m25905b.m25907a("event_timestamp", String.valueOf(zzt.zzB().mo105913a()));
            m25905b.m25907a("offline_ad", "1");
        }
        return m25905b;
    }

    /* renamed from: g */
    private final void m25369g(qv2 qv2Var) {
        if (this.f26018s.f22334k0) {
            this.f26019t.m24800d(new p22(zzt.zzB().mo105913a(), this.f26017r.f28473b.f27823b.f24014b, this.f26022w.mo22195b(qv2Var), 2));
            return;
        }
        this.f26022w.mo22194a(qv2Var);
    }

    /* renamed from: j */
    private final boolean m25370j() {
        if (this.f26020u == null) {
            synchronized (this) {
                if (this.f26020u == null) {
                    String str = (String) zzay.zzc().m21823b(AbstractC4554gx.f21308m1);
                    zzt.zzp();
                    String zzo = zzs.zzo(this.f26015p);
                    boolean z11 = false;
                    if (str != null && zzo != null) {
                        try {
                            z11 = Pattern.matches(str, zzo);
                        } catch (RuntimeException e11) {
                            zzt.zzo().m22945t(e11, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f26020u = Boolean.valueOf(z11);
                }
            }
        }
        return this.f26020u.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.a81
    /* renamed from: a */
    public final void mo20033a(zze zzeVar) {
        zze zzeVar2;
        if (!this.f26021v) {
            return;
        }
        int i11 = zzeVar.zza;
        String str = zzeVar.zzb;
        if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zze zzeVar3 = zzeVar.zzd;
            i11 = zzeVar3.zza;
            str = zzeVar3.zzb;
        }
        String m26156a = this.f26016q.m26156a(str);
        qv2 m25368c = m25368c("ifts");
        m25368c.m25907a("reason", "adapter");
        if (i11 >= 0) {
            m25368c.m25907a("arec", String.valueOf(i11));
        }
        if (m26156a != null) {
            m25368c.m25907a("areec", m26156a);
        }
        this.f26022w.mo22194a(m25368c);
    }

    @Override // com.google.android.gms.internal.ads.a81
    /* renamed from: l0 */
    public final void mo20034l0(zzdmo zzdmoVar) {
        if (!this.f26021v) {
            return;
        }
        qv2 m25368c = m25368c("ifts");
        m25368c.m25907a("reason", "exception");
        if (!TextUtils.isEmpty(zzdmoVar.getMessage())) {
            m25368c.m25907a("msg", zzdmoVar.getMessage());
        }
        this.f26022w.mo22194a(m25368c);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!this.f26018s.f22334k0) {
            return;
        }
        m25369g(m25368c("click"));
    }

    @Override // com.google.android.gms.internal.ads.a81
    public final void zzb() {
        if (!this.f26021v) {
            return;
        }
        rv2 rv2Var = this.f26022w;
        qv2 m25368c = m25368c("ifts");
        m25368c.m25907a("reason", "blocked");
        rv2Var.mo22194a(m25368c);
    }

    @Override // com.google.android.gms.internal.ads.rc1
    public final void zzd() {
        if (!m25370j()) {
            return;
        }
        this.f26022w.mo22194a(m25368c("adapter_shown"));
    }

    @Override // com.google.android.gms.internal.ads.rc1
    public final void zze() {
        if (!m25370j()) {
            return;
        }
        this.f26022w.mo22194a(m25368c("adapter_impression"));
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final void zzl() {
        if (!m25370j() && !this.f26018s.f22334k0) {
            return;
        }
        m25369g(m25368c(ZinstantMetaConstant.IMPRESSION_META_NAME));
    }
}
