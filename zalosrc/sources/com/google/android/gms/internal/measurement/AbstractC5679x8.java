package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.x8 */
/* loaded from: classes.dex */
public abstract class AbstractC5679x8 implements Iterable, Serializable {

    /* renamed from: q */
    public static final AbstractC5679x8 f32911q = new C5611t8(AbstractC5290aa.f32259d);

    /* renamed from: r */
    private static final Comparator f32912r;

    /* renamed from: s */
    private static final C5645v8 f32913s;

    /* renamed from: p */
    private int f32914p = 0;

    static {
        int i11 = AbstractC5441j8.f32440a;
        f32913s = new C5645v8(null);
        f32912r = new C5526o8();
    }

    /* renamed from: p */
    public static int m30020p(int i11, int i12, int i13) {
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
    public static AbstractC5679x8 m30021s(byte[] bArr, int i11, int i12) {
        m30020p(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new C5611t8(bArr2);
    }

    /* renamed from: d */
    public abstract byte mo29549d(int i11);

    /* renamed from: e */
    public abstract byte mo29550e(int i11);

    public abstract boolean equals(Object obj);

    /* renamed from: g */
    public abstract int mo29551g();

    public final int hashCode() {
        int i11 = this.f32914p;
        if (i11 == 0) {
            int mo29551g = mo29551g();
            i11 = mo29630j(mo29551g, 0, mo29551g);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f32914p = i11;
        }
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C5509n8(this);
    }

    /* renamed from: j */
    protected abstract int mo29630j(int i11, int i12, int i13);

    /* renamed from: k */
    public abstract AbstractC5679x8 mo29631k(int i11, int i12);

    /* renamed from: l */
    protected abstract String mo29632l(Charset charset);

    /* renamed from: m */
    public abstract void mo29633m(AbstractC5492m8 abstractC5492m8);

    /* renamed from: n */
    public abstract boolean mo29634n();

    /* renamed from: r */
    public final int m30022r() {
        return this.f32914p;
    }

    /* renamed from: t */
    public final String m30023t(Charset charset) {
        if (mo29551g() == 0) {
            return "";
        }
        return mo29632l(charset);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo29551g());
        if (mo29551g() <= 50) {
            concat = AbstractC5461kb.m29368a(this);
        } else {
            concat = AbstractC5461kb.m29368a(mo29631k(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
