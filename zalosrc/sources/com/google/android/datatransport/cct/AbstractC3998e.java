package com.google.android.datatransport.cct;

/* renamed from: com.google.android.datatransport.cct.e */
/* loaded from: classes.dex */
public abstract class AbstractC3998e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m18905a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i11 = 0; i11 < str.length(); i11++) {
                sb2.append(str.charAt(i11));
                if (str2.length() > i11) {
                    sb2.append(str2.charAt(i11));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
