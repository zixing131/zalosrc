package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class q43 {
    /* renamed from: a */
    public static String m25656a(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            if (m25660e(str.charAt(i11))) {
                char[] charArray = str.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (m25660e(c11)) {
                        charArray[i11] = (char) (c11 ^ ' ');
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return str;
    }

    /* renamed from: b */
    public static String m25657b(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            if (m25659d(str.charAt(i11))) {
                char[] charArray = str.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (m25659d(c11)) {
                        charArray[i11] = (char) (c11 ^ ' ');
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m25658c(CharSequence charSequence, CharSequence charSequence2) {
        int m25661f;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = charSequence.charAt(i11);
            char charAt2 = charSequence2.charAt(i11);
            if (charAt != charAt2 && ((m25661f = m25661f(charAt)) >= 26 || m25661f != m25661f(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m25659d(char c11) {
        return c11 >= 'a' && c11 <= 'z';
    }

    /* renamed from: e */
    public static boolean m25660e(char c11) {
        return c11 >= 'A' && c11 <= 'Z';
    }

    /* renamed from: f */
    private static int m25661f(char c11) {
        return (char) ((c11 | ' ') - 97);
    }
}
