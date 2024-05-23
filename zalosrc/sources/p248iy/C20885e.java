package p248iy;

import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import on0.AbstractC24344y;
import on0.C24329j;

/* renamed from: iy.e */
/* loaded from: classes.dex */
public final class C20885e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private byte f102605a;

    /* renamed from: b */
    private long f102606b;

    /* renamed from: c */
    private long f102607c;

    /* renamed from: d */
    private long f102608d;

    /* renamed from: e */
    private int f102609e;

    /* renamed from: f */
    private int f102610f;

    /* renamed from: g */
    private String f102611g;

    /* renamed from: h */
    private int f102612h;

    /* renamed from: i */
    private String f102613i;

    /* renamed from: j */
    private int f102614j;

    /* renamed from: k */
    private int f102615k;

    /* renamed from: l */
    private int f102616l;

    /* renamed from: m */
    private int f102617m;

    /* renamed from: n */
    private int f102618n;

    /* renamed from: o */
    private int f102619o;

    /* renamed from: p */
    private String f102620p;

    /* renamed from: iy.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20885e m109198a(long j11, int i11, int i12, String str, int i13, String str2, int i14, int i15, int i16, long j12, String str3) {
            C20885e c20885e = new C20885e();
            c20885e.m109186m((byte) 2);
            c20885e.m109194u(j11);
            c20885e.m109196w(i11);
            c20885e.m109181h(i12);
            c20885e.m109189p(str);
            c20885e.m109188o(i13);
            c20885e.m109187n(str2);
            c20885e.m109182i(i14);
            c20885e.m109193t(i15);
            c20885e.m109191r(i16);
            c20885e.m109184k((int) j12);
            c20885e.m109190q(str3);
            return c20885e;
        }

        /* renamed from: b */
        public final C20885e m109199b(String str, int i11, int i12, int i13, long j11, String str2, int i14) {
            int i15;
            AbstractC19074t.m100208f(str, "uid");
            int m109224b = AbstractC20887g.m109224b();
            int m109225c = AbstractC20887g.m109225c();
            String m109201a = AbstractC20886f.m109201a();
            if (!TextUtils.isEmpty(str)) {
                i15 = Integer.parseInt(str);
            } else {
                i15 = 0;
            }
            return m109198a(System.currentTimeMillis(), i15, i14, AbstractC19074t.m100216n("", Integer.valueOf(m109224b)), m109225c, m109201a, i11, i12, i13, j11, str2);
        }

        /* renamed from: c */
        public final C20885e m109200c(long j11, long j12, int i11, String str, int i12, int i13, int i14, int i15, int i16, long j13, String str2, int i17) {
            C20885e c20885e = new C20885e();
            c20885e.m109186m((byte) 1);
            c20885e.m109192s(j11);
            c20885e.m109183j(j12);
            c20885e.m109196w(i11);
            c20885e.m109181h(i17);
            c20885e.m109189p(str);
            c20885e.m109188o(i12);
            c20885e.m109182i(i13);
            c20885e.m109193t(i14);
            c20885e.m109195v(i15);
            c20885e.m109185l(i16);
            c20885e.m109184k((int) j13);
            c20885e.m109190q(str2);
            return c20885e;
        }
    }

    /* renamed from: a */
    public final int m109174a() {
        return this.f102614j;
    }

    /* renamed from: b */
    public final int m109175b() {
        return this.f102619o;
    }

    /* renamed from: c */
    public final byte m109176c() {
        return this.f102605a;
    }

    /* renamed from: d */
    public final String m109177d() {
        return this.f102620p;
    }

    /* renamed from: e */
    public final int m109178e() {
        return this.f102618n;
    }

    /* renamed from: f */
    public final long m109179f() {
        return this.f102607c;
    }

    /* renamed from: g */
    public final int m109180g() {
        return this.f102615k;
    }

    /* renamed from: h */
    public final void m109181h(int i11) {
        this.f102610f = i11;
    }

    /* renamed from: i */
    public final void m109182i(int i11) {
        this.f102614j = i11;
    }

    /* renamed from: j */
    public final void m109183j(long j11) {
        this.f102608d = j11;
    }

    /* renamed from: k */
    public final void m109184k(int i11) {
        this.f102619o = i11;
    }

    /* renamed from: l */
    public final void m109185l(int i11) {
        this.f102617m = i11;
    }

    /* renamed from: m */
    public final void m109186m(byte b11) {
        this.f102605a = b11;
    }

    /* renamed from: n */
    public final void m109187n(String str) {
        this.f102613i = str;
    }

    /* renamed from: o */
    public final void m109188o(int i11) {
        this.f102612h = i11;
    }

    /* renamed from: p */
    public final void m109189p(String str) {
        this.f102611g = str;
    }

    /* renamed from: q */
    public final void m109190q(String str) {
        String m127212k1;
        if (str != null) {
            String m127019g = new C24329j("[\\n\\t ]").m127019g(str, " ");
            this.f102620p = m127019g;
            AbstractC19074t.m100205c(m127019g);
            if (m127019g.length() > 512) {
                String str2 = this.f102620p;
                AbstractC19074t.m100205c(str2);
                m127212k1 = AbstractC24344y.m127212k1(str2, 512);
                this.f102620p = m127212k1;
                return;
            }
            return;
        }
        this.f102620p = null;
    }

    /* renamed from: r */
    public final void m109191r(int i11) {
        this.f102618n = i11;
    }

    /* renamed from: s */
    public final void m109192s(long j11) {
        this.f102607c = j11;
    }

    /* renamed from: t */
    public final void m109193t(int i11) {
        this.f102615k = i11;
    }

    /* renamed from: u */
    public final void m109194u(long j11) {
        this.f102606b = j11;
    }

    /* renamed from: v */
    public final void m109195v(int i11) {
        this.f102616l = i11;
    }

    /* renamed from: w */
    public final void m109196w(int i11) {
        this.f102609e = i11;
    }

    /* renamed from: x */
    public final String m109197x() {
        StringBuffer stringBuffer = new StringBuffer(128);
        byte b11 = this.f102605a;
        if (b11 == 1) {
            stringBuffer.append("\n");
            stringBuffer.append(AbstractC19074t.m100216n("", Byte.valueOf(this.f102605a)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Long.valueOf(this.f102607c)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Long.valueOf(this.f102608d)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102609e)));
            stringBuffer.append("\t");
            stringBuffer.append("1");
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102610f)));
            stringBuffer.append("\t");
            stringBuffer.append(this.f102611g);
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102612h)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102614j)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102615k)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102616l)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102617m)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102619o)));
            stringBuffer.append("\t");
            stringBuffer.append(this.f102620p);
            stringBuffer.append("\t");
        } else if (b11 == 2) {
            stringBuffer.append("\n");
            stringBuffer.append(AbstractC19074t.m100216n("", Byte.valueOf(this.f102605a)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Long.valueOf(this.f102606b)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102609e)));
            stringBuffer.append("\t");
            stringBuffer.append("1");
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102610f)));
            stringBuffer.append("\t");
            stringBuffer.append(this.f102611g);
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102612h)));
            stringBuffer.append("\t");
            stringBuffer.append(this.f102613i);
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102614j)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102615k)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102618n)));
            stringBuffer.append("\t");
            stringBuffer.append(AbstractC19074t.m100216n("", Integer.valueOf(this.f102619o)));
            stringBuffer.append("\t");
            stringBuffer.append(this.f102620p);
            stringBuffer.append("\t");
        }
        String stringBuffer2 = stringBuffer.toString();
        AbstractC19074t.m100207e(stringBuffer2, "strBuilder.toString()");
        return stringBuffer2;
    }
}
