package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public abstract class fj0 {
    /* renamed from: a */
    static Uri m22025a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i11 = indexOf + 1;
            return Uri.parse(str.substring(0, i11) + str2 + "=" + str3 + "&" + str.substring(i11));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    /* renamed from: b */
    public static String m22026b(Uri uri, Context context) {
        if (!zzt.zzn().m21425z(context)) {
            return uri.toString();
        }
        String m21405f = zzt.zzn().m21405f(context);
        if (m21405f == null) {
            return uri.toString();
        }
        String str = (String) zzay.zzc().m21823b(AbstractC4554gx.f21207c0);
        String uri2 = uri.toString();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21197b0)).booleanValue() && uri2.contains(str)) {
            zzt.zzn().m21417r(context, m21405f);
            return m22028d(uri2, context).replace(str, m21405f);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        }
        String uri3 = m22025a(m22028d(uri2, context), "fbs_aeid", m21405f).toString();
        zzt.zzn().m21417r(context, m21405f);
        return uri3;
    }

    /* renamed from: c */
    public static String m22027c(String str, Context context, boolean z11) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21277j0)).booleanValue() && !z11) {
            return str;
        }
        if (zzt.zzn().m21425z(context) && !TextUtils.isEmpty(str)) {
            String m21405f = zzt.zzn().m21405f(context);
            if (m21405f == null) {
                return str;
            }
            String str2 = (String) zzay.zzc().m21823b(AbstractC4554gx.f21207c0);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21197b0)).booleanValue() && str.contains(str2)) {
                if (zzt.zzp().zzg(str)) {
                    zzt.zzn().m21417r(context, m21405f);
                    return m22028d(str, context).replace(str2, m21405f);
                }
                if (zzt.zzp().zzh(str)) {
                    zzt.zzn().m21418s(context, m21405f);
                    return m22028d(str, context).replace(str2, m21405f);
                }
                return str;
            }
            if (!str.contains("fbs_aeid")) {
                if (zzt.zzp().zzg(str)) {
                    zzt.zzn().m21417r(context, m21405f);
                    return m22025a(m22028d(str, context), "fbs_aeid", m21405f).toString();
                }
                if (zzt.zzp().zzh(str)) {
                    zzt.zzn().m21418s(context, m21405f);
                    return m22025a(m22028d(str, context), "fbs_aeid", m21405f).toString();
                }
                return str;
            }
            return str;
        }
        return str;
    }

    /* renamed from: d */
    private static String m22028d(String str, Context context) {
        String m21409j = zzt.zzn().m21409j(context);
        String m21407h = zzt.zzn().m21407h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(m21409j)) {
            str = m22025a(str, "gmp_app_id", m21409j).toString();
        }
        if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(m21407h)) {
            return m22025a(str, "fbs_aiid", m21407h).toString();
        }
        return str;
    }
}
