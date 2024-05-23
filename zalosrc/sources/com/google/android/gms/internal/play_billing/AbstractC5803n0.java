package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.play_billing.n0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5803n0 implements Iterable, Serializable {

    /* renamed from: q */
    public static final AbstractC5803n0 f33371q = new C5785k0(AbstractC5804n1.f33378d);

    /* renamed from: r */
    private static final Comparator f33372r;

    /* renamed from: s */
    private static final C5797m0 f33373s;

    /* renamed from: p */
    private int f33374p = 0;

    static {
        int i11 = AbstractC5722a0.f33231a;
        f33373s = new C5797m0(null);
        f33372r = new C5755f0();
    }

    /* renamed from: p */
    public static int m30371p(int i11, int i12, int i13) {
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

    /* renamed from: s */
    public static AbstractC5803n0 m30372s(byte[] bArr, int i11, int i12) {
        m30371p(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new C5785k0(bArr2);
    }

    /* renamed from: d */
    public abstract byte mo30239d(int i11);

    /* renamed from: e */
    public abstract byte mo30240e(int i11);

    public abstract boolean equals(Object obj);

    /* renamed from: g */
    public abstract int mo30241g();

    public final int hashCode() {
        int i11 = this.f33374p;
        if (i11 == 0) {
            int mo30241g = mo30241g();
            i11 = mo30308j(mo30241g, 0, mo30241g);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f33374p = i11;
        }
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C5749e0(this);
    }

    /* renamed from: j */
    protected abstract int mo30308j(int i11, int i12, int i13);

    /* renamed from: k */
    public abstract AbstractC5803n0 mo30309k(int i11, int i12);

    /* renamed from: l */
    protected abstract String mo30310l(Charset charset);

    /* renamed from: m */
    public abstract void mo30311m(AbstractC5743d0 abstractC5743d0);

    /* renamed from: n */
    public abstract boolean mo30312n();

    /* renamed from: r */
    public final int m30373r() {
        return this.f33374p;
    }

    /* renamed from: t */
    public final String m30374t(Charset charset) {
        return mo30241g() == 0 ? "" : mo30310l(charset);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo30241g());
        if (mo30241g() <= 50) {
            concat = AbstractC5859w2.m30548a(this);
        } else {
            concat = AbstractC5859w2.m30548a(mo30309k(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
