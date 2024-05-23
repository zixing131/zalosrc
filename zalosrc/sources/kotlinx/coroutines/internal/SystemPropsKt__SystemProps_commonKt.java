package kotlinx.coroutines.internal;

import on0.AbstractC24340u;

/* loaded from: classes.dex */
public final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    /* renamed from: a */
    public static final int m113723a(String str, int i11, int i12, int i13) {
        return (int) SystemPropsKt.m113715c(str, i11, i12, i13);
    }

    /* renamed from: b */
    public static final long m113724b(String str, long j11, long j12, long j13) {
        Long m127109o;
        String m113716d = SystemPropsKt.m113716d(str);
        if (m113716d != null) {
            m127109o = AbstractC24340u.m127109o(m113716d);
            if (m127109o != null) {
                long longValue = m127109o.longValue();
                if (j12 <= longValue && longValue <= j13) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j12 + ".." + j13 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m113716d + '\'').toString());
        }
        return j11;
    }

    /* renamed from: c */
    public static final String m113725c(String str, String str2) {
        String m113716d = SystemPropsKt.m113716d(str);
        if (m113716d != null) {
            return m113716d;
        }
        return str2;
    }

    /* renamed from: d */
    public static final boolean m113726d(String str, boolean z11) {
        String m113716d = SystemPropsKt.m113716d(str);
        if (m113716d != null) {
            return Boolean.parseBoolean(m113716d);
        }
        return z11;
    }

    /* renamed from: e */
    public static /* synthetic */ int m113727e(String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = 1;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return SystemPropsKt.m113714b(str, i11, i12, i13);
    }

    /* renamed from: f */
    public static /* synthetic */ long m113728f(String str, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j12 = 1;
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            j13 = Long.MAX_VALUE;
        }
        return SystemPropsKt.m113715c(str, j11, j14, j13);
    }
}
