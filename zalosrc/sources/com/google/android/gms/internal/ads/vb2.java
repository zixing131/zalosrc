package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class vb2 implements rh2 {

    /* renamed from: a */
    final dr2 f29252a;

    /* renamed from: b */
    private final long f29253b;

    public vb2(dr2 dr2Var, long j11) {
        AbstractC4205o.m19723l(dr2Var, "the targeting must not be null");
        this.f29252a = dr2Var;
        this.f29253b = j11;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Bundle bundle = (Bundle) obj;
        zzl zzlVar = this.f29252a.f19398d;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.f29252a.f19400f);
        int i11 = this.f29252a.f19409o.f26311a;
        int i12 = i11 - 1;
        if (i11 != 0) {
            boolean z17 = true;
            if (i12 != 1) {
                if (i12 == 2) {
                    bundle.putBoolean("is_rewarded_interstitial", true);
                }
            } else {
                bundle.putBoolean("is_new_rewarded", true);
            }
            bundle.putLong("start_signals_timestamp", this.f29253b);
            String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb));
            if (zzlVar.zzb != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            nr2.m24987f(bundle, "cust_age", format, z11);
            nr2.m24983b(bundle, "extras", zzlVar.zzc);
            int i13 = zzlVar.zzd;
            if (i13 != -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            nr2.m24986e(bundle, "cust_gender", i13, z12);
            nr2.m24985d(bundle, "kw", zzlVar.zze);
            int i14 = zzlVar.zzg;
            if (i14 != -1) {
                z13 = true;
            } else {
                z13 = false;
            }
            nr2.m24986e(bundle, "tag_for_child_directed_treatment", i14, z13);
            if (zzlVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            if (zzlVar.zza >= 2 && zzlVar.zzh) {
                z14 = true;
            } else {
                z14 = false;
            }
            nr2.m24986e(bundle, "d_imp_hdr", 1, z14);
            String str = zzlVar.zzi;
            if (zzlVar.zza >= 2 && !TextUtils.isEmpty(str)) {
                z15 = true;
            } else {
                z15 = false;
            }
            nr2.m24987f(bundle, "ppid", str, z15);
            Location location = zzlVar.zzk;
            if (location != null) {
                float accuracy = location.getAccuracy();
                long time = location.getTime();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", accuracy * 1000.0f);
                bundle2.putLong("lat", (long) (latitude * 1.0E7d));
                bundle2.putLong("long", (long) (longitude * 1.0E7d));
                bundle2.putLong("time", time * 1000);
                bundle.putBundle("uule", bundle2);
            }
            nr2.m24984c(bundle, ZMediaPlayer.OnNativeInvokeListener.ARG_URL, zzlVar.zzl);
            nr2.m24985d(bundle, "neighboring_content_urls", zzlVar.zzv);
            nr2.m24983b(bundle, "custom_targeting", zzlVar.zzn);
            nr2.m24985d(bundle, "category_exclusions", zzlVar.zzo);
            nr2.m24984c(bundle, "request_agent", zzlVar.zzp);
            nr2.m24984c(bundle, "request_pkg", zzlVar.zzq);
            boolean z18 = zzlVar.zzr;
            if (zzlVar.zza >= 7) {
                z16 = true;
            } else {
                z16 = false;
            }
            nr2.m24988g(bundle, "is_designed_for_families", z18, z16);
            if (zzlVar.zza >= 8) {
                int i15 = zzlVar.zzt;
                if (i15 == -1) {
                    z17 = false;
                }
                nr2.m24986e(bundle, "tag_for_under_age_of_consent", i15, z17);
                nr2.m24984c(bundle, "max_ad_content_rating", zzlVar.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
