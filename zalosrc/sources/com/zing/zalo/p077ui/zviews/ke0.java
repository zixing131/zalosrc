package com.zing.zalo.p077ui.zviews;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public abstract class ke0 {
    /* renamed from: a */
    public static String m87327a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int length = str.length() - 1; length >= 0 && sb2.length() < 7; length--) {
            if (Character.isDigit(str.charAt(length))) {
                sb2.append(str.charAt(length));
            }
        }
        return sb2.toString();
    }
}
