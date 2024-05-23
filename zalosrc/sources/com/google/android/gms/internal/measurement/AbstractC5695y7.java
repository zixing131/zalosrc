package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.y7 */
/* loaded from: classes.dex */
public abstract class AbstractC5695y7 extends AbstractC5593s7 implements Set {

    /* renamed from: q */
    private transient AbstractC5678x7 f32929q;

    /* renamed from: k */
    static int m30044k(int i11) {
        int max = Math.max(i11, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    /* renamed from: n */
    public static AbstractC5695y7 m30045n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return m30046r(15, objArr2);
    }

    /* renamed from: r */
    private static AbstractC5695y7 m30046r(int i11, Object... objArr) {
        if (i11 != 0) {
            if (i11 != 1) {
                int m30044k = m30044k(i11);
                Object[] objArr2 = new Object[m30044k];
                int i12 = m30044k - 1;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    Object obj = objArr[i15];
                    AbstractC5288a8.m28880a(obj, i15);
                    int hashCode = obj.hashCode();
                    int m29527a = AbstractC5542p7.m29527a(hashCode);
                    while (true) {
                        int i16 = m29527a & i12;
                        Object obj2 = objArr2[i16];
                        if (obj2 == null) {
                            objArr[i14] = obj;
                            objArr2[i16] = obj;
                            i13 += hashCode;
                            i14++;
                            break;
                        }
                        if (!obj2.equals(obj)) {
                            m29527a++;
                        }
                    }
                }
                Arrays.fill(objArr, i14, i11, (Object) null);
                if (i14 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new C5339d8(obj3);
                }
                if (m30044k(i14) < m30044k / 2) {
                    return m30046r(i14, objArr);
                }
                if (i14 < 10) {
                    objArr = Arrays.copyOf(objArr, i14);
                }
                return new C5322c8(objArr, i13, objArr2, i12, i14);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C5339d8(obj4);
        }
        return C5322c8.f32308x;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC5695y7) && mo28970p() && ((AbstractC5695y7) obj).mo28970p() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();

    /* renamed from: l */
    public final AbstractC5678x7 m30047l() {
        AbstractC5678x7 abstractC5678x7 = this.f32929q;
        if (abstractC5678x7 == null) {
            AbstractC5678x7 mo28969m = mo28969m();
            this.f32929q = mo28969m;
            return mo28969m;
        }
        return abstractC5678x7;
    }

    /* renamed from: m */
    AbstractC5678x7 mo28969m() {
        Object[] array = toArray();
        int i11 = AbstractC5678x7.f32910r;
        return AbstractC5678x7.m30015l(array, array.length);
    }

    /* renamed from: p */
    boolean mo28970p() {
        return false;
    }
}
