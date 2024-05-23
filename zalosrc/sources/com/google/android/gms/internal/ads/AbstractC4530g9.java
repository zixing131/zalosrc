package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.g9 */
/* loaded from: classes2.dex */
public abstract class AbstractC4530g9 {
    /* renamed from: a */
    public static long m22302a(String str) {
        try {
            return m22305d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e11) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                AbstractC5048u8.m26868c(e11, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            AbstractC5048u8.m26869d("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* renamed from: b */
    public static C5196y7 m22303b(C4639j8 c4639j8) {
        long j11;
        boolean z11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = c4639j8.f22716c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        if (str != null) {
            j11 = m22302a(str);
        } else {
            j11 = 0;
        }
        String str2 = (String) map.get("Cache-Control");
        int i11 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z11 = false;
            j12 = 0;
            j13 = 0;
            while (i11 < split.length) {
                String trim = split[i11].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j13 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z11 = true;
                }
                i11++;
            }
            i11 = 1;
        } else {
            z11 = false;
            j12 = 0;
            j13 = 0;
        }
        String str3 = (String) map.get("Expires");
        if (str3 != null) {
            j14 = m22302a(str3);
        } else {
            j14 = 0;
        }
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j15 = m22302a(str4);
        } else {
            j15 = 0;
        }
        String str5 = (String) map.get("ETag");
        if (i11 != 0) {
            j17 = currentTimeMillis + (j12 * 1000);
            if (z11) {
                j18 = j17;
            } else {
                Long.signum(j13);
                j18 = (j13 * 1000) + j17;
            }
            j16 = j18;
        } else {
            j16 = 0;
            if (j11 > 0 && j14 >= j11) {
                j17 = currentTimeMillis + (j14 - j11);
                j16 = j17;
            } else {
                j17 = 0;
            }
        }
        C5196y7 c5196y7 = new C5196y7();
        c5196y7.f30820a = c4639j8.f22715b;
        c5196y7.f30821b = str5;
        c5196y7.f30825f = j17;
        c5196y7.f30824e = j16;
        c5196y7.f30822c = j11;
        c5196y7.f30823d = j15;
        c5196y7.f30826g = map;
        c5196y7.f30827h = c4639j8.f22717d;
        return c5196y7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m22304c(long j11) {
        return m22305d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j11));
    }

    /* renamed from: d */
    private static SimpleDateFormat m22305d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
