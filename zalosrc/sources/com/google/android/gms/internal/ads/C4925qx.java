package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.qx */
/* loaded from: classes2.dex */
final class C4925qx extends AbstractC4962rx {
    /* renamed from: b */
    private static final String m25917b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < str.length() && str.charAt(i12) == ',') {
            i12++;
        }
        while (length > 0) {
            int i13 = length - 1;
            if (str.charAt(i13) != ',') {
                break;
            }
            length = i13;
        }
        if (length < i12) {
            return null;
        }
        if (i12 == 0) {
            if (length == str.length()) {
                return str;
            }
        } else {
            i11 = i12;
        }
        return str.substring(i11, length);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4962rx
    /* renamed from: a */
    public final String mo25351a(String str, String str2) {
        String m25917b = m25917b(str);
        String m25917b2 = m25917b(str2);
        if (TextUtils.isEmpty(m25917b)) {
            return m25917b2;
        }
        if (TextUtils.isEmpty(m25917b2)) {
            return m25917b;
        }
        return m25917b + "," + m25917b2;
    }
}
