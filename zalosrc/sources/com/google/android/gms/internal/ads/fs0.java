package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class fs0 {

    /* renamed from: a */
    private static final Pattern f20272a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b */
    private static final Pattern f20273b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    /* renamed from: a */
    public static String m22155a(String str, String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = f20272a.matcher(str);
        int i11 = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb2.append(str.substring(0, end));
            while (i11 <= 0) {
                String str2 = strArr[i11];
                if (str2 != null) {
                    sb2.append(str2);
                }
                i11++;
            }
            sb2.append(str.substring(end));
        } else {
            if (!f20273b.matcher(str).find()) {
                while (i11 <= 0) {
                    String str3 = strArr[i11];
                    if (str3 != null) {
                        sb2.append(str3);
                    }
                    i11++;
                }
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
