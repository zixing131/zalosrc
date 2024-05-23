package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l94 {

    /* renamed from: c */
    public static final l94 f23798c = new l94(new int[]{2}, 8);

    /* renamed from: d */
    private static final l94 f23799d = new l94(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    private static final f83 f23800e;

    /* renamed from: a */
    private final int[] f23801a;

    /* renamed from: b */
    private final int f23802b;

    static {
        e83 e83Var = new e83();
        e83Var.m21628a(5, 6);
        e83Var.m21628a(17, 6);
        e83Var.m21628a(7, 6);
        e83Var.m21628a(18, 6);
        e83Var.m21628a(6, 8);
        e83Var.m21628a(8, 8);
        e83Var.m21628a(14, 8);
        f23800e = e83Var.m21630c();
    }

    public l94(int[] iArr, int i11) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f23801a = copyOf;
        Arrays.sort(copyOf);
        this.f23802b = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair m24183a(C4671k3 c4671k3) {
        int m22326T;
        String str = c4671k3.f23099l;
        str.getClass();
        int m23843a = k70.m23843a(str, c4671k3.f23096i);
        f83 f83Var = f23800e;
        if (!f83Var.containsKey(Integer.valueOf(m23843a))) {
            return null;
        }
        int i11 = 8;
        if (m23843a == 18) {
            if (!m24184c(18)) {
                m23843a = 6;
                if (m24184c(m23843a)) {
                    return null;
                }
                int i12 = c4671k3.f23112y;
                if (i12 != -1 && m23843a != 18) {
                    if (i12 > 8) {
                        return null;
                    }
                } else {
                    int i13 = c4671k3.f23113z;
                    if (i13 == -1) {
                        i13 = 48000;
                    }
                    if (g92.f20474a >= 29) {
                        i12 = k94.m23858a(m23843a, i13);
                    } else {
                        Integer num = (Integer) f83Var.getOrDefault(Integer.valueOf(m23843a), 0);
                        num.getClass();
                        i12 = num.intValue();
                    }
                }
                int i14 = g92.f20474a;
                if (i14 <= 28) {
                    if (i12 != 7) {
                        if (i12 == 3 || i12 == 4 || i12 == 5) {
                            i11 = 6;
                        }
                    }
                    if (i14 <= 26 && "fugu".equals(g92.f20475b) && i11 == 1) {
                        i11 = 2;
                    }
                    m22326T = g92.m22326T(i11);
                    if (m22326T != 0) {
                        return null;
                    }
                    return Pair.create(Integer.valueOf(m23843a), Integer.valueOf(m22326T));
                }
                i11 = i12;
                if (i14 <= 26) {
                    i11 = 2;
                }
                m22326T = g92.m22326T(i11);
                if (m22326T != 0) {
                }
            } else {
                m23843a = 18;
            }
        }
        if (m23843a == 8 && !m24184c(8)) {
            m23843a = 7;
        }
        if (m24184c(m23843a)) {
        }
    }

    /* renamed from: c */
    public final boolean m24184c(int i11) {
        if (Arrays.binarySearch(this.f23801a, i11) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l94) && Arrays.equals(this.f23801a, ((l94) obj).f23801a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f23801a) * 31) + 8;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + Arrays.toString(this.f23801a) + "]";
    }
}
