package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class uw2 {
    /* renamed from: a */
    public static void m27075a(tc3 tc3Var, vw2 vw2Var, kw2 kw2Var) {
        m27081g(tc3Var, vw2Var, kw2Var, false);
    }

    /* renamed from: b */
    public static void m27076b(tc3 tc3Var, vw2 vw2Var, kw2 kw2Var) {
        m27081g(tc3Var, vw2Var, kw2Var, true);
    }

    /* renamed from: c */
    public static void m27077c(tc3 tc3Var, vw2 vw2Var, kw2 kw2Var) {
        if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            return;
        }
        kc3.m23886r(ac3.m20071D(tc3Var), new tw2(vw2Var, kw2Var), kl0.f23368f);
    }

    /* renamed from: d */
    public static void m27078d(tc3 tc3Var, kw2 kw2Var) {
        if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            return;
        }
        kc3.m23886r(ac3.m20071D(tc3Var), new rw2(kw2Var), kl0.f23368f);
    }

    /* renamed from: e */
    public static boolean m27079e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzay.zzc().m21823b(AbstractC4554gx.f20939A7), str);
    }

    /* renamed from: f */
    public static int m27080f(dr2 dr2Var) {
        int zzd = zzf.zzd(dr2Var) - 1;
        return (zzd == 0 || zzd == 1) ? 7 : 23;
    }

    /* renamed from: g */
    private static void m27081g(tc3 tc3Var, vw2 vw2Var, kw2 kw2Var, boolean z11) {
        if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            return;
        }
        kc3.m23886r(ac3.m20071D(tc3Var), new sw2(vw2Var, kw2Var, z11), kl0.f23368f);
    }
}
