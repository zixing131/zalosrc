package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wq1 {

    /* renamed from: a */
    private final vr2 f30066a;

    /* renamed from: b */
    private final tq1 f30067b;

    public wq1(vr2 vr2Var, tq1 tq1Var) {
        this.f30066a = vr2Var;
        this.f30067b = tq1Var;
    }

    /* renamed from: a */
    final v90 m27688a() {
        v90 m27337b = this.f30066a.m27337b();
        if (m27337b != null) {
            return m27337b;
        }
        yk0.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    /* renamed from: b */
    public final pb0 m27689b(String str) {
        pb0 mo26265t = m27688a().mo26265t(str);
        this.f30067b.m26653e(str, mo26265t);
        return mo26265t;
    }

    /* renamed from: c */
    public final yr2 m27690c(String str, JSONObject jSONObject) {
        y90 zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new ua0(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new ua0(new zzbxu());
            } else {
                v90 m27688a = m27688a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (m27688a.mo26263c(string)) {
                            zzb = m27688a.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (m27688a.mo26264o(string)) {
                            zzb = m27688a.zzb(string);
                        } else {
                            zzb = m27688a.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e11) {
                        yk0.zzh("Invalid custom event.", e11);
                    }
                }
                zzb = m27688a.zzb(str);
            }
            yr2 yr2Var = new yr2(zzb);
            this.f30067b.m26652d(str, yr2Var);
            return yr2Var;
        } catch (Throwable th2) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21185Z7)).booleanValue()) {
                this.f30067b.m26652d(str, null);
            }
            throw new zzfek(th2);
        }
    }

    /* renamed from: d */
    public final boolean m27691d() {
        if (this.f30066a.m27337b() != null) {
            return true;
        }
        return false;
    }
}
