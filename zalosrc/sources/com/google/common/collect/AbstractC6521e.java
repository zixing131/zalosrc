package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;
import p358n7.AbstractC23600d;

/* renamed from: com.google.common.collect.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6521e extends AbstractC6519c implements Set {

    /* renamed from: q */
    private transient AbstractC6520d f36359q;

    /* renamed from: com.google.common.collect.e$a */
    /* loaded from: classes3.dex */
    private static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: p */
        final Object[] f36360p;

        a(Object[] objArr) {
            this.f36360p = objArr;
        }

        Object readResolve() {
            return AbstractC6521e.m33425n(this.f36360p);
        }
    }

    /* renamed from: l */
    static int m33423l(int i11) {
        int max = Math.max(i11, 2);
        boolean z11 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z11 = false;
        }
        AbstractC23600d.m123733d(z11, "collection too large");
        return 1073741824;
    }

    /* renamed from: m */
    private static AbstractC6521e m33424m(int i11, Object... objArr) {
        if (i11 != 0) {
            if (i11 != 1) {
                int m33423l = m33423l(i11);
                Object[] objArr2 = new Object[m33423l];
                int i12 = m33423l - 1;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    Object m33440a = AbstractC6524h.m33440a(objArr[i15], i15);
                    int hashCode = m33440a.hashCode();
                    int m33406a = AbstractC6518b.m33406a(hashCode);
                    while (true) {
                        int i16 = m33406a & i12;
                        Object obj = objArr2[i16];
                        if (obj == null) {
                            objArr[i14] = m33440a;
                            objArr2[i16] = m33440a;
                            i13 += hashCode;
                            i14++;
                            break;
                        }
                        if (obj.equals(m33440a)) {
                            break;
                        }
                        m33406a++;
                    }
                }
                Arrays.fill(objArr, i14, i11, (Object) null);
                if (i14 == 1) {
                    return new C6529m(objArr[0], i13);
                }
                if (m33423l(i14) < m33423l / 2) {
                    return m33424m(i14, objArr);
                }
                if (m33429v(i14, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i14);
                }
                return new C6527k(objArr, i13, objArr2, i12, i14);
            }
            return m33427t(objArr[0]);
        }
        return m33426s();
    }

    /* renamed from: n */
    public static AbstractC6521e m33425n(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return m33424m(objArr.length, (Object[]) objArr.clone());
            }
            return m33427t(objArr[0]);
        }
        return m33426s();
    }

    /* renamed from: s */
    public static AbstractC6521e m33426s() {
        return C6527k.f36366w;
    }

    /* renamed from: t */
    public static AbstractC6521e m33427t(Object obj) {
        return new C6529m(obj);
    }

    /* renamed from: u */
    public static AbstractC6521e m33428u(Object obj, Object obj2, Object obj3) {
        return m33424m(3, obj, obj2, obj3);
    }

    /* renamed from: v */
    private static boolean m33429v(int i11, int i12) {
        return i11 < (i12 >> 1) + (i12 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC6521e) && mo33432r() && ((AbstractC6521e) obj).mo33432r() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC6528l.m33447a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();

    /* renamed from: k */
    public AbstractC6520d m33430k() {
        AbstractC6520d abstractC6520d = this.f36359q;
        if (abstractC6520d == null) {
            AbstractC6520d mo33431p = mo33431p();
            this.f36359q = mo33431p;
            return mo33431p;
        }
        return abstractC6520d;
    }

    /* renamed from: p */
    abstract AbstractC6520d mo33431p();

    /* renamed from: r */
    abstract boolean mo33432r();

    @Override // com.google.common.collect.AbstractC6519c
    Object writeReplace() {
        return new a(toArray());
    }
}
