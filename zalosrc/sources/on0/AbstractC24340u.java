package on0;

import fn0.AbstractC19074t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: on0.u */
/* loaded from: classes.dex */
public abstract class AbstractC24340u extends AbstractC24339t {
    /* renamed from: l */
    public static final Void m127106l(String str) {
        AbstractC19074t.m100208f(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    /* renamed from: m */
    public static Integer m127107m(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        return m127108n(str, 10);
    }

    /* renamed from: n */
    public static final Integer m127108n(String str, int i11) {
        boolean z11;
        int i12;
        int i13;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC24317b.m126975a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i14 = 0;
        char charAt = str.charAt(0);
        int i15 = -2147483647;
        if (AbstractC19074t.m100209g(charAt, 48) < 0) {
            i12 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i15 = Integer.MIN_VALUE;
                z11 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z11 = false;
            }
        } else {
            z11 = false;
            i12 = 0;
        }
        int i16 = -59652323;
        while (i12 < length) {
            int m126976b = AbstractC24317b.m126976b(str.charAt(i12), i11);
            if (m126976b < 0) {
                return null;
            }
            if ((i14 < i16 && (i16 != -59652323 || i14 < (i16 = i15 / i11))) || (i13 = i14 * i11) < i15 + m126976b) {
                return null;
            }
            i14 = i13 - m126976b;
            i12++;
        }
        if (z11) {
            return Integer.valueOf(i14);
        }
        return Integer.valueOf(-i14);
    }

    /* renamed from: o */
    public static Long m127109o(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        return m127110p(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long m127110p(String str, int i11) {
        boolean z11;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC24317b.m126975a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        long j11 = -9223372036854775807L;
        if (AbstractC19074t.m100209g(charAt, 48) < 0) {
            z11 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j11 = Long.MIN_VALUE;
                i12 = 1;
                long j12 = -256204778801521550L;
                long j13 = 0;
                long j14 = -256204778801521550L;
                while (i12 < length) {
                    int m126976b = AbstractC24317b.m126976b(str.charAt(i12), i11);
                    if (m126976b < 0) {
                        return null;
                    }
                    if (j13 < j14) {
                        if (j14 == j12) {
                            j14 = j11 / i11;
                            if (j13 < j14) {
                            }
                        }
                        return null;
                    }
                    long j15 = j13 * i11;
                    long j16 = m126976b;
                    if (j15 < j11 + j16) {
                        return null;
                    }
                    j13 = j15 - j16;
                    i12++;
                    j12 = -256204778801521550L;
                }
                if (!z11) {
                    return Long.valueOf(j13);
                }
                return Long.valueOf(-j13);
            }
            if (charAt != '+') {
                return null;
            }
            i12 = 1;
        }
        z11 = false;
        long j122 = -256204778801521550L;
        long j132 = 0;
        long j142 = -256204778801521550L;
        while (i12 < length) {
        }
        if (!z11) {
        }
    }
}
