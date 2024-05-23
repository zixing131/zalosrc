package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class h62 implements c32 {
    /* renamed from: d */
    private static Bundle m22711d(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        return new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: a */
    public final boolean mo20789a(tq2 tq2Var, iq2 iq2Var) {
        if (!TextUtils.isEmpty(iq2Var.f22351w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""))) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: b */
    public final tc3 mo20790b(tq2 tq2Var, iq2 iq2Var) {
        String optString = iq2Var.f22351w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        dr2 dr2Var = tq2Var.f28472a.f26941a;
        br2 br2Var = new br2();
        br2Var.m20678G(dr2Var);
        br2Var.m20681J(optString);
        Bundle m22711d = m22711d(dr2Var.f19398d.zzm);
        Bundle m22711d2 = m22711d(m22711d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        m22711d2.putInt("gw", 1);
        String optString2 = iq2Var.f22351w.optString("mad_hac", null);
        if (optString2 != null) {
            m22711d2.putString("mad_hac", optString2);
        }
        String optString3 = iq2Var.f22351w.optString("adJson", null);
        if (optString3 != null) {
            m22711d2.putString("_ad", optString3);
        }
        m22711d2.putBoolean("_noRefresh", true);
        Iterator<String> keys = iq2Var.f22291E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = iq2Var.f22291E.optString(next, null);
            if (next != null) {
                m22711d2.putString(next, optString4);
            }
        }
        m22711d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", m22711d2);
        zzl zzlVar = dr2Var.f19398d;
        br2Var.m20693e(new zzl(zzlVar.zza, zzlVar.zzb, m22711d2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, m22711d, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        dr2 m20695g = br2Var.m20695g();
        Bundle bundle = new Bundle();
        lq2 lq2Var = tq2Var.f28473b.f27823b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(lq2Var.f24013a));
        bundle2.putInt("refresh_interval", lq2Var.f24015c);
        bundle2.putString("gws_query_id", lq2Var.f24014b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = tq2Var.f28472a.f26941a.f19400f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", iq2Var.f22352x);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(iq2Var.f22317c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(iq2Var.f22319d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(iq2Var.f22345q));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(iq2Var.f22339n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(iq2Var.f22327h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(iq2Var.f22329i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(iq2Var.f22331j));
        bundle3.putString("transaction_id", iq2Var.f22333k);
        bundle3.putString("valid_from_timestamp", iq2Var.f22335l);
        bundle3.putBoolean("is_closable_area_disabled", iq2Var.f22303Q);
        if (iq2Var.f22337m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", iq2Var.f22337m.f32015q);
            bundle4.putString("rb_type", iq2Var.f22337m.f32014p);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return mo21953c(m20695g, bundle);
    }

    /* renamed from: c */
    protected abstract tc3 mo21953c(dr2 dr2Var, Bundle bundle);
}
