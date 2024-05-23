package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class nr2 {
    /* renamed from: a */
    public static Bundle m24982a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return new Bundle();
        }
        return bundle2;
    }

    /* renamed from: b */
    public static void m24983b(Bundle bundle, String str, Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    /* renamed from: c */
    public static void m24984c(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: d */
    public static void m24985d(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    /* renamed from: e */
    public static void m24986e(Bundle bundle, String str, int i11, boolean z11) {
        if (z11) {
            bundle.putInt(str, i11);
        }
    }

    /* renamed from: f */
    public static void m24987f(Bundle bundle, String str, String str2, boolean z11) {
        if (z11) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: g */
    public static void m24988g(Bundle bundle, String str, boolean z11, boolean z12) {
        if (z12) {
            bundle.putBoolean(str, z11);
        }
    }
}
