package vn0;

/* renamed from: vn0.l */
/* loaded from: classes7.dex */
public final class C28328l {

    /* renamed from: a */
    public static final C28328l f132061a;

    /* renamed from: b */
    public static final char[] f132062b;

    /* renamed from: c */
    public static final byte[] f132063c;

    static {
        C28328l c28328l = new C28328l();
        f132061a = c28328l;
        f132062b = new char[117];
        f132063c = new byte[126];
        c28328l.m142731f();
        c28328l.m142730e();
    }

    private C28328l() {
    }

    /* renamed from: a */
    private final void m142726a(char c11, char c12) {
        m142727b(c11, c12);
    }

    /* renamed from: b */
    private final void m142727b(int i11, char c11) {
        if (c11 != 'u') {
            f132062b[c11] = (char) i11;
        }
    }

    /* renamed from: c */
    private final void m142728c(char c11, byte b11) {
        m142729d(c11, b11);
    }

    /* renamed from: d */
    private final void m142729d(int i11, byte b11) {
        f132063c[i11] = b11;
    }

    /* renamed from: e */
    private final void m142730e() {
        for (int i11 = 0; i11 < 33; i11++) {
            m142729d(i11, Byte.MAX_VALUE);
        }
        m142729d(9, (byte) 3);
        m142729d(10, (byte) 3);
        m142729d(13, (byte) 3);
        m142729d(32, (byte) 3);
        m142728c(',', (byte) 4);
        m142728c(':', (byte) 5);
        m142728c('{', (byte) 6);
        m142728c('}', (byte) 7);
        m142728c('[', (byte) 8);
        m142728c(']', (byte) 9);
        m142728c('\"', (byte) 1);
        m142728c('\\', (byte) 2);
    }

    /* renamed from: f */
    private final void m142731f() {
        for (int i11 = 0; i11 < 32; i11++) {
            m142727b(i11, 'u');
        }
        m142727b(8, 'b');
        m142727b(9, 't');
        m142727b(10, 'n');
        m142727b(12, 'f');
        m142727b(13, 'r');
        m142726a('/', '/');
        m142726a('\"', '\"');
        m142726a('\\', '\\');
    }
}
