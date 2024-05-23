package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ls1 implements rc1, zza, q81, a81 {

    /* renamed from: p */
    private final Context f24039p;

    /* renamed from: q */
    private final rr2 f24040q;

    /* renamed from: r */
    private final dt1 f24041r;

    /* renamed from: s */
    private final tq2 f24042s;

    /* renamed from: t */
    private final iq2 f24043t;

    /* renamed from: u */
    private final n22 f24044u;

    /* renamed from: v */
    private Boolean f24045v;

    /* renamed from: w */
    private final boolean f24046w = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21137U5)).booleanValue();

    public ls1(Context context, rr2 rr2Var, dt1 dt1Var, tq2 tq2Var, iq2 iq2Var, n22 n22Var) {
        this.f24039p = context;
        this.f24040q = rr2Var;
        this.f24041r = dt1Var;
        this.f24042s = tq2Var;
        this.f24043t = iq2Var;
        this.f24044u = n22Var;
    }

    /* renamed from: c */
    private final ct1 m24369c(String str) {
        String str2;
        ct1 m21542a = this.f24041r.m21542a();
        m21542a.m21010e(this.f24042s.f28473b.f27823b);
        m21542a.m21009d(this.f24043t);
        m21542a.m21007b("action", str);
        boolean z11 = false;
        if (!this.f24043t.f22349u.isEmpty()) {
            m21542a.m21007b("ancn", (String) this.f24043t.f22349u.get(0));
        }
        if (this.f24043t.f22334k0) {
            if (true != zzt.zzo().m22947v(this.f24039p)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            m21542a.m21007b("device_connectivity", str2);
            m21542a.m21007b("event_timestamp", String.valueOf(zzt.zzB().mo105913a()));
            m21542a.m21007b("offline_ad", "1");
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21223d6)).booleanValue()) {
            if (zzf.zzd(this.f24042s.f28472a.f26941a) != 1) {
                z11 = true;
            }
            m21542a.m21007b("scar", String.valueOf(z11));
            if (z11) {
                zzl zzlVar = this.f24042s.f28472a.f26941a.f19398d;
                m21542a.m21008c("ragent", zzlVar.zzp);
                m21542a.m21008c("rtype", zzf.zza(zzf.zzb(zzlVar)));
            }
        }
        return m21542a;
    }

    /* renamed from: g */
    private final void m24370g(ct1 ct1Var) {
        if (this.f24043t.f22334k0) {
            this.f24044u.m24800d(new p22(zzt.zzB().mo105913a(), this.f24042s.f28473b.f27823b.f24014b, ct1Var.m21011f(), 2));
            return;
        }
        ct1Var.m21012g();
    }

    /* renamed from: j */
    private final boolean m24371j() {
        if (this.f24045v == null) {
            synchronized (this) {
                if (this.f24045v == null) {
                    String str = (String) zzay.zzc().m21823b(AbstractC4554gx.f21308m1);
                    zzt.zzp();
                    String zzo = zzs.zzo(this.f24039p);
                    boolean z11 = false;
                    if (str != null && zzo != null) {
                        try {
                            z11 = Pattern.matches(str, zzo);
                        } catch (RuntimeException e11) {
                            zzt.zzo().m22945t(e11, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f24045v = Boolean.valueOf(z11);
                }
            }
        }
        return this.f24045v.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.a81
    /* renamed from: a */
    public final void mo20033a(zze zzeVar) {
        zze zzeVar2;
        if (!this.f24046w) {
            return;
        }
        ct1 m24369c = m24369c("ifts");
        m24369c.m21007b("reason", "adapter");
        int i11 = zzeVar.zza;
        String str = zzeVar.zzb;
        if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zze zzeVar3 = zzeVar.zzd;
            i11 = zzeVar3.zza;
            str = zzeVar3.zzb;
        }
        if (i11 >= 0) {
            m24369c.m21007b("arec", String.valueOf(i11));
        }
        String m26156a = this.f24040q.m26156a(str);
        if (m26156a != null) {
            m24369c.m21007b("areec", m26156a);
        }
        m24369c.m21012g();
    }

    @Override // com.google.android.gms.internal.ads.a81
    /* renamed from: l0 */
    public final void mo20034l0(zzdmo zzdmoVar) {
        if (!this.f24046w) {
            return;
        }
        ct1 m24369c = m24369c("ifts");
        m24369c.m21007b("reason", "exception");
        if (!TextUtils.isEmpty(zzdmoVar.getMessage())) {
            m24369c.m21007b("msg", zzdmoVar.getMessage());
        }
        m24369c.m21012g();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!this.f24043t.f22334k0) {
            return;
        }
        m24370g(m24369c("click"));
    }

    @Override // com.google.android.gms.internal.ads.a81
    public final void zzb() {
        if (!this.f24046w) {
            return;
        }
        ct1 m24369c = m24369c("ifts");
        m24369c.m21007b("reason", "blocked");
        m24369c.m21012g();
    }

    @Override // com.google.android.gms.internal.ads.rc1
    public final void zzd() {
        if (!m24371j()) {
            return;
        }
        m24369c("adapter_shown").m21012g();
    }

    @Override // com.google.android.gms.internal.ads.rc1
    public final void zze() {
        if (!m24371j()) {
            return;
        }
        m24369c("adapter_impression").m21012g();
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final void zzl() {
        if (!m24371j() && !this.f24043t.f22334k0) {
            return;
        }
        m24370g(m24369c(ZinstantMetaConstant.IMPRESSION_META_NAME));
    }
}
