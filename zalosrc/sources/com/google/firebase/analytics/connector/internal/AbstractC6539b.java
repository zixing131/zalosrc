package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC5678x7;
import com.google.android.gms.internal.measurement.AbstractC5695y7;
import com.google.android.gms.internal.measurement.C5610t7;
import p230i6.AbstractC20327s;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
/* loaded from: classes.dex */
public abstract class AbstractC6539b {

    /* renamed from: a */
    private static final AbstractC5695y7 f36387a = AbstractC5695y7.m30045n("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b */
    private static final AbstractC5678x7 f36388b = AbstractC5678x7.m30018p("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    private static final AbstractC5678x7 f36389c = AbstractC5678x7.m30017n("auto", "app", "am");

    /* renamed from: d */
    private static final AbstractC5678x7 f36390d = AbstractC5678x7.m30016m("_r", "_dbg");

    /* renamed from: e */
    private static final AbstractC5678x7 f36391e;

    /* renamed from: f */
    private static final AbstractC5678x7 f36392f;

    /* renamed from: g */
    public static final /* synthetic */ int f36393g = 0;

    static {
        C5610t7 c5610t7 = new C5610t7();
        c5610t7.m29628a(AbstractC20327s.f100303a);
        c5610t7.m29628a(AbstractC20327s.f100304b);
        f36391e = c5610t7.m29629b();
        f36392f = AbstractC5678x7.m30016m("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* renamed from: a */
    public static boolean m33464a(String str, String str2, Bundle bundle) {
        char c11;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m33467d(str) || bundle == null) {
            return false;
        }
        AbstractC5678x7 abstractC5678x7 = f36390d;
        int size = abstractC5678x7.size();
        int i11 = 0;
        while (i11 < size) {
            boolean containsKey = bundle.containsKey((String) abstractC5678x7.get(i11));
            i11++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c11 = 2;
                }
                c11 = 65535;
            } else {
                if (str.equals("fdl")) {
                    c11 = 1;
                }
                c11 = 65535;
            }
        } else {
            if (str.equals("fcm")) {
                c11 = 0;
            }
            c11 = 65535;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 != 2) {
                    return false;
                }
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    /* renamed from: b */
    public static boolean m33465b(String str, Bundle bundle) {
        if (f36388b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            AbstractC5678x7 abstractC5678x7 = f36390d;
            int size = abstractC5678x7.size();
            int i11 = 0;
            while (i11 < size) {
                boolean containsKey = bundle.containsKey((String) abstractC5678x7.get(i11));
                i11++;
                if (containsKey) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m33466c(String str) {
        if (!f36387a.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m33467d(String str) {
        if (!f36389c.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m33468e(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
                return false;
            }
            if (f36391e.contains(str2)) {
                return false;
            }
            AbstractC5678x7 abstractC5678x7 = f36392f;
            int size = abstractC5678x7.size();
            int i11 = 0;
            while (i11 < size) {
                boolean matches = str2.matches((String) abstractC5678x7.get(i11));
                i11++;
                if (matches) {
                    return false;
                }
            }
            return true;
        }
        if (str.equals("fcm") || str.equals("frc")) {
            return true;
        }
        return false;
    }
}
