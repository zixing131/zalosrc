package p602w9;

import java.nio.ByteBuffer;

/* renamed from: w9.c */
/* loaded from: classes.dex */
public abstract class AbstractC28827c {

    /* renamed from: a */
    private static AbstractC28827c f133533a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w9.c$a */
    /* loaded from: classes3.dex */
    public static class a {
        /* renamed from: a */
        public static void m144122a(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) {
            if (!m144127f(b12) && (((b11 << 28) + (b12 + 112)) >> 30) == 0 && !m144127f(b13) && !m144127f(b14)) {
                int m144132k = ((b11 & 7) << 18) | (m144132k(b12) << 12) | (m144132k(b13) << 6) | m144132k(b14);
                cArr[i11] = m144126e(m144132k);
                cArr[i11 + 1] = m144131j(m144132k);
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* renamed from: b */
        public static void m144123b(byte b11, char[] cArr, int i11) {
            cArr[i11] = (char) b11;
        }

        /* renamed from: c */
        public static void m144124c(byte b11, byte b12, byte b13, char[] cArr, int i11) {
            if (!m144127f(b12) && ((b11 != -32 || b12 >= -96) && ((b11 != -19 || b12 < -96) && !m144127f(b13)))) {
                cArr[i11] = (char) (((b11 & 15) << 12) | (m144132k(b12) << 6) | m144132k(b13));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* renamed from: d */
        public static void m144125d(byte b11, byte b12, char[] cArr, int i11) {
            if (b11 >= -62) {
                if (!m144127f(b12)) {
                    cArr[i11] = (char) (((b11 & 31) << 6) | m144132k(b12));
                    return;
                }
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        /* renamed from: e */
        private static char m144126e(int i11) {
            return (char) ((i11 >>> 10) + 55232);
        }

        /* renamed from: f */
        private static boolean m144127f(byte b11) {
            return b11 > -65;
        }

        /* renamed from: g */
        public static boolean m144128g(byte b11) {
            return b11 >= 0;
        }

        /* renamed from: h */
        public static boolean m144129h(byte b11) {
            return b11 < -16;
        }

        /* renamed from: i */
        public static boolean m144130i(byte b11) {
            return b11 < -32;
        }

        /* renamed from: j */
        private static char m144131j(int i11) {
            return (char) ((i11 & 1023) + 56320);
        }

        /* renamed from: k */
        private static int m144132k(byte b11) {
            return b11 & 63;
        }
    }

    /* renamed from: d */
    public static AbstractC28827c m144120d() {
        if (f133533a == null) {
            f133533a = new C28828d();
        }
        return f133533a;
    }

    /* renamed from: e */
    public static void m144121e(AbstractC28827c abstractC28827c) {
        f133533a = abstractC28827c;
    }

    /* renamed from: a */
    public abstract String mo101931a(ByteBuffer byteBuffer, int i11, int i12);

    /* renamed from: b */
    public abstract void mo101932b(CharSequence charSequence, ByteBuffer byteBuffer);

    /* renamed from: c */
    public abstract int mo101933c(CharSequence charSequence);
}
