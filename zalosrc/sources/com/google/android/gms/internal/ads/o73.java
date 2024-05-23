package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class o73 {

    /* renamed from: a */
    private static final Pattern f25480a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b */
    private static final Pattern f25481b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: a */
    public static long m25094a(String str, String str2) {
        long j11 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j11 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                lr1.m24353b("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = f25480a.matcher(str2);
            if (matcher.matches()) {
                try {
                    String group = matcher.group(2);
                    group.getClass();
                    long parseLong = Long.parseLong(group);
                    String group2 = matcher.group(1);
                    group2.getClass();
                    long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                    if (j11 < 0) {
                        return parseLong2;
                    }
                    if (j11 != parseLong2) {
                        lr1.m24356e("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
                        return Math.max(j11, parseLong2);
                    }
                    return j11;
                } catch (NumberFormatException unused2) {
                    lr1.m24353b("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
                    return j11;
                }
            }
            return j11;
        }
        return j11;
    }

    /* renamed from: b */
    public static long m25095b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f25481b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }
}
