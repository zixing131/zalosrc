package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;
import p229i5.AbstractC20294o;

/* renamed from: com.google.android.gms.internal.ads.vq */
/* loaded from: classes2.dex */
public abstract class AbstractC5103vq {
    /* renamed from: a */
    public static int m27332a(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return AbstractC20294o.m105946a(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ee, code lost:            if (true != r4) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f0, code lost:            r5 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f1, code lost:            r4 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:            if (true != r4) goto L64;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] m27333b(String str, boolean z11) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int length = str.length();
        int i11 = 0;
        boolean z12 = false;
        int i12 = 0;
        while (i11 < length) {
            int codePointAt = Character.codePointAt(charArray, i11);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of2 = Character.UnicodeBlock.of(codePointAt);
                if (of2.equals(Character.UnicodeBlock.BOPOMOFO) || of2.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of2.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || of2.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of2.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of2.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of2.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of2.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of2.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of2.equals(Character.UnicodeBlock.HANGUL_JAMO) || of2.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || of2.equals(Character.UnicodeBlock.HIRAGANA) || of2.equals(Character.UnicodeBlock.KATAKANA) || of2.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z12) {
                        arrayList.add(new String(charArray, i12, i11 - i12));
                    }
                    arrayList.add(new String(charArray, i11, charCount));
                    z12 = false;
                    i11 += charCount;
                }
            }
            if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                if (!z11 || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                    if (z12) {
                        arrayList.add(new String(charArray, i12, i11 - i12));
                        z12 = false;
                    }
                }
            }
            i11 += charCount;
        }
        if (z12) {
            arrayList.add(new String(charArray, i12, i11 - i12));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
