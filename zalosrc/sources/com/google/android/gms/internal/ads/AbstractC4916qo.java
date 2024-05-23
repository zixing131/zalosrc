package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.qo */
/* loaded from: classes2.dex */
public abstract class AbstractC4916qo {

    /* renamed from: a */
    public static final int f26898a;

    /* renamed from: b */
    public static final String f26899b;

    /* renamed from: c */
    public static final String f26900c;

    /* renamed from: d */
    public static final String f26901d;

    /* renamed from: e */
    public static final String f26902e;

    /* renamed from: f */
    private static final Pattern f26903f;

    /* renamed from: g */
    private static final Pattern f26904g;

    /* renamed from: h */
    private static final Pattern f26905h;

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i11 = 26;
        }
        f26898a = i11;
        String str = Build.DEVICE;
        f26899b = str;
        String str2 = Build.MANUFACTURER;
        f26900c = str2;
        String str3 = Build.MODEL;
        f26901d = str3;
        f26902e = str + ", " + str3 + ", " + str2 + ", " + i11;
        f26903f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f26904g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f26905h = Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    /* renamed from: a */
    public static float m25825a(float f11, float f12, float f13) {
        return Math.max(0.1f, Math.min(f11, 8.0f));
    }

    /* renamed from: b */
    public static int m25826b(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            i12 = ~binarySearch;
        } else {
            while (true) {
                i11 = binarySearch + 1;
                if (i11 >= jArr.length || jArr[i11] != j11) {
                    break;
                }
                binarySearch = i11;
            }
            if (z11) {
                i12 = binarySearch;
            } else {
                i12 = i11;
            }
        }
        if (z12) {
            return Math.min(jArr.length - 1, i12);
        }
        return i12;
    }

    /* renamed from: c */
    public static int m25827c(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                int i12 = binarySearch - 1;
                if (i12 < 0 || jArr[i12] != j11) {
                    break;
                }
                binarySearch = i12;
            }
            i11 = binarySearch;
        }
        if (z12) {
            return Math.max(0, i11);
        }
        return i11;
    }

    /* renamed from: d */
    public static int m25828d(int i11, int i12) {
        return ((i11 + i12) - 1) / i12;
    }

    /* renamed from: e */
    public static int m25829e(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i11, i13));
    }

    /* renamed from: f */
    public static int m25830f(int i11) {
        return i11 != 1 ? 13107200 : 3538944;
    }

    /* renamed from: g */
    public static int m25831g(String str) {
        boolean z11;
        int length = str.length();
        if (length <= 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20611c(z11);
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i11 = (i11 << 8) | str.charAt(i12);
        }
        return i11;
    }

    /* renamed from: h */
    public static int m25832h(int i11) {
        if (i11 == 8) {
            return 3;
        }
        if (i11 == 16) {
            return 2;
        }
        if (i11 != 24) {
            return i11 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: i */
    public static int m25833i(int i11, int i12) {
        if (i11 != Integer.MIN_VALUE) {
            if (i11 != 1073741824) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return i12;
                    }
                    throw new IllegalArgumentException();
                }
                return i12 + i12;
            }
            return i12 * 4;
        }
        return i12 * 3;
    }

    /* renamed from: j */
    public static long m25834j(long j11, long j12, long j13) {
        if (j13 >= j12 && j13 % j12 == 0) {
            return j11 / (j13 / j12);
        }
        if (j13 < j12 && j12 % j13 == 0) {
            return j11 * (j12 / j13);
        }
        return (long) (j11 * (j12 / j13));
    }

    /* renamed from: k */
    public static String m25835k(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int length = objArr.length;
            if (i11 < length) {
                sb2.append(objArr[i11].getClass().getSimpleName());
                if (i11 < length - 1) {
                    sb2.append(", ");
                }
                i11++;
            } else {
                return sb2.toString();
            }
        }
    }

    /* renamed from: l */
    public static ExecutorService m25836l(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC4879po("Loader:ExtractorMediaPeriod"));
    }

    /* renamed from: m */
    public static void m25837m(InterfaceC4840on interfaceC4840on) {
        if (interfaceC4840on != null) {
            try {
                interfaceC4840on.zzd();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: n */
    public static void m25838n(long[] jArr, long j11, long j12) {
        int i11 = 0;
        if (j12 >= 1000000 && j12 % 1000000 == 0) {
            long j13 = j12 / 1000000;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] / j13;
                i11++;
            }
            return;
        }
        if (j12 < 1000000 && 1000000 % j12 == 0) {
            long j14 = 1000000 / j12;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] * j14;
                i11++;
            }
            return;
        }
        double d11 = 1000000.0d / j12;
        while (i11 < jArr.length) {
            jArr[i11] = (long) (jArr[i11] * d11);
            i11++;
        }
    }

    /* renamed from: o */
    public static boolean m25839o(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    /* renamed from: p */
    public static byte[] m25840p(String str) {
        byte[] bArr = new byte[38];
        for (int i11 = 0; i11 < 38; i11++) {
            int i12 = i11 + i11;
            bArr[i11] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: q */
    public static byte[] m25841q(String str) {
        return str.getBytes(Charset.defaultCharset());
    }
}
