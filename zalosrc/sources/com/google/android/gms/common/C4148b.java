package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4222t1;
import p229i5.AbstractC20289j;
import p289k5.C21472e;
import p538u5.AbstractC27037d;

/* renamed from: com.google.android.gms.common.b */
/* loaded from: classes.dex */
public class C4148b {

    /* renamed from: a */
    public static final int f16477a = AbstractC4150d.f16480a;

    /* renamed from: b */
    private static final C4148b f16478b = new C4148b();

    /* renamed from: h */
    public static C4148b m19567h() {
        return f16478b;
    }

    /* renamed from: a */
    public void m19568a(Context context) {
        AbstractC4150d.m19577a(context);
    }

    /* renamed from: b */
    public int m19569b(Context context) {
        return AbstractC4150d.m19579c(context);
    }

    /* renamed from: c */
    public Intent m19570c(int i11) {
        return mo19197d(null, i11, null);
    }

    /* renamed from: d */
    public Intent mo19197d(Context context, int i11, String str) {
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return null;
            }
            return AbstractC4222t1.m19800c("com.google.android.gms");
        }
        if (context != null && AbstractC20289j.m105933g(context)) {
            return AbstractC4222t1.m19798a();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f16477a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C21472e.m111067a(context).m111064f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return AbstractC4222t1.m19799b("com.google.android.gms", sb2.toString());
    }

    /* renamed from: e */
    public PendingIntent mo19198e(Context context, int i11, int i12) {
        return m19571f(context, i11, i12, null);
    }

    /* renamed from: f */
    public PendingIntent m19571f(Context context, int i11, int i12, String str) {
        Intent mo19197d = mo19197d(context, i11, str);
        if (mo19197d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i12, mo19197d, AbstractC27037d.f127681a | 134217728);
    }

    /* renamed from: g */
    public String mo19199g(int i11) {
        return AbstractC4150d.m19580d(i11);
    }

    /* renamed from: i */
    public int mo19200i(Context context) {
        return mo19201j(context, f16477a);
    }

    /* renamed from: j */
    public int mo19201j(Context context, int i11) {
        int m19584h = AbstractC4150d.m19584h(context, i11);
        if (AbstractC4150d.m19585i(context, m19584h)) {
            return 18;
        }
        return m19584h;
    }

    /* renamed from: k */
    public boolean m19572k(Context context, int i11) {
        return AbstractC4150d.m19585i(context, i11);
    }

    /* renamed from: l */
    public boolean m19573l(Context context, String str) {
        return AbstractC4150d.m19589m(context, str);
    }

    /* renamed from: m */
    public boolean mo19202m(int i11) {
        return AbstractC4150d.m19587k(i11);
    }
}
