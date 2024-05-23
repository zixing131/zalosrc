package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class mt3 implements Iterable, Serializable {

    /* renamed from: q */
    public static final mt3 f24751q = new it3(dv3.f19428d);

    /* renamed from: r */
    private static final Comparator f24752r;

    /* renamed from: s */
    private static final lt3 f24753s;

    /* renamed from: p */
    private int f24754p = 0;

    static {
        int i11 = xs3.f30618a;
        f24753s = new lt3(null);
        f24752r = new dt3();
    }

    /* renamed from: D */
    public static int m24723D(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) < 0) {
            if (i11 >= 0) {
                if (i12 < i11) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i11 + ", " + i12);
                }
                throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i11 + " < 0");
        }
        return i14;
    }

    /* renamed from: G */
    public static jt3 m24724G() {
        return new jt3(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public static mt3 m24725H(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return f24751q;
        }
        return m24732n(iterable.iterator(), size);
    }

    /* renamed from: I */
    public static mt3 m24726I(byte[] bArr) {
        return m24727J(bArr, 0, bArr.length);
    }

    /* renamed from: J */
    public static mt3 m24727J(byte[] bArr, int i11, int i12) {
        m24723D(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new it3(bArr2);
    }

    /* renamed from: K */
    public static mt3 m24728K(String str) {
        return new it3(str.getBytes(dv3.f19426b));
    }

    /* renamed from: L */
    public static mt3 m24729L(InputStream inputStream) {
        mt3 m24727J;
        ArrayList arrayList = new ArrayList();
        int i11 = 256;
        while (true) {
            byte[] bArr = new byte[i11];
            int i12 = 0;
            while (i12 < i11) {
                int read = inputStream.read(bArr, i12, i11 - i12);
                if (read == -1) {
                    break;
                }
                i12 += read;
            }
            if (i12 == 0) {
                m24727J = null;
            } else {
                m24727J = m24727J(bArr, 0, i12);
            }
            if (m24727J == null) {
                return m24725H(arrayList);
            }
            arrayList.add(m24727J);
            i11 = Math.min(i11 + i11, 8192);
        }
    }

    /* renamed from: M */
    public static mt3 m24730M(byte[] bArr) {
        return new it3(bArr);
    }

    /* renamed from: e */
    public static void m24731e(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
        }
    }

    /* renamed from: n */
    private static mt3 m24732n(Iterator it, int i11) {
        if (i11 > 0) {
            if (i11 == 1) {
                return (mt3) it.next();
            }
            int i12 = i11 >>> 1;
            mt3 m24732n = m24732n(it, i12);
            mt3 m24732n2 = m24732n(it, i11 - i12);
            if (Integer.MAX_VALUE - m24732n.mo22168p() >= m24732n2.mo22168p()) {
                return sw3.m26445Q(m24732n, m24732n2);
            }
            throw new IllegalArgumentException("ByteString would be too long: " + m24732n.mo22168p() + "+" + m24732n2.mo22168p());
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i11)));
    }

    /* renamed from: A */
    public abstract ByteBuffer mo23392A();

    /* renamed from: B */
    public abstract void mo23393B(bt3 bt3Var);

    /* renamed from: C */
    public abstract boolean mo23394C();

    /* renamed from: E */
    public final int m24733E() {
        return this.f24754p;
    }

    @Override // java.lang.Iterable
    /* renamed from: F */
    public gt3 iterator() {
        return new ct3(this);
    }

    /* renamed from: d */
    public final String m24735d(Charset charset) {
        if (mo22168p() == 0) {
            return "";
        }
        return mo23399z(charset);
    }

    public abstract boolean equals(Object obj);

    /* renamed from: g */
    public final void m24736g(byte[] bArr, int i11, int i12, int i13) {
        m24723D(0, i13, mo22168p());
        m24723D(i12, i12 + i13, bArr.length);
        if (i13 > 0) {
            mo22169r(bArr, 0, i12, i13);
        }
    }

    public final int hashCode() {
        int i11 = this.f24754p;
        if (i11 == 0) {
            int mo22168p = mo22168p();
            i11 = mo23395u(mo22168p, 0, mo22168p);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f24754p = i11;
        }
        return i11;
    }

    /* renamed from: j */
    public final boolean m24737j() {
        return mo22168p() == 0;
    }

    /* renamed from: k */
    public final byte[] m24738k() {
        int mo22168p = mo22168p();
        if (mo22168p == 0) {
            return dv3.f19428d;
        }
        byte[] bArr = new byte[mo22168p];
        mo22169r(bArr, 0, 0, mo22168p);
        return bArr;
    }

    /* renamed from: l */
    public abstract byte mo22166l(int i11);

    /* renamed from: m */
    public abstract byte mo22167m(int i11);

    /* renamed from: p */
    public abstract int mo22168p();

    /* renamed from: r */
    public abstract void mo22169r(byte[] bArr, int i11, int i12, int i13);

    /* renamed from: s */
    public abstract int mo23014s();

    /* renamed from: t */
    public abstract boolean mo23015t();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo22168p());
        if (mo22168p() <= 50) {
            concat = ww3.m27731a(this);
        } else {
            concat = ww3.m27731a(mo23397w(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public abstract int mo23395u(int i11, int i12, int i13);

    /* renamed from: v */
    public abstract int mo23396v(int i11, int i12, int i13);

    /* renamed from: w */
    public abstract mt3 mo23397w(int i11, int i12);

    /* renamed from: x */
    public abstract vt3 mo23398x();

    /* renamed from: z */
    protected abstract String mo23399z(Charset charset);
}
