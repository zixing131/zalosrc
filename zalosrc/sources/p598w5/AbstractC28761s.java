package p598w5;

import java.util.Arrays;
import java.util.Set;

/* renamed from: w5.s */
/* loaded from: classes2.dex */
public abstract class AbstractC28761s extends AbstractC28756n implements Set {

    /* renamed from: q */
    private transient AbstractC28759q f133287q;

    /* renamed from: k */
    static int m143896k(int i11) {
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
    public static AbstractC28761s m143897n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = {"ADMINISTRATIVE_AREA_LEVEL_1", "ADMINISTRATIVE_AREA_LEVEL_2", "COUNTRY", "LOCALITY", "POSTAL_CODE", "SCHOOL_DISTRICT"};
        System.arraycopy(objArr, 0, objArr2, 6, 0);
        return m143898r(6, objArr2);
    }

    /* renamed from: r */
    private static AbstractC28761s m143898r(int i11, Object... objArr) {
        if (i11 != 0) {
            if (i11 != 1) {
                int m143896k = m143896k(i11);
                Object[] objArr2 = new Object[m143896k];
                int i12 = m143896k - 1;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    Object obj = objArr[i15];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int m143888a = AbstractC28755m.m143888a(hashCode);
                        while (true) {
                            int i16 = m143888a & i12;
                            Object obj2 = objArr2[i16];
                            if (obj2 == null) {
                                objArr[i14] = obj;
                                objArr2[i16] = obj;
                                i13 += hashCode;
                                i14++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                m143888a++;
                            }
                        }
                    } else {
                        throw new NullPointerException("at index " + i15);
                    }
                }
                Arrays.fill(objArr, i14, i11, (Object) null);
                if (i14 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new C28765w(obj3);
                }
                if (m143896k(i14) >= m143896k / 2) {
                    if (i14 < 4) {
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    return new C28764v(objArr, i13, objArr2, i12, i14);
                }
                return m143898r(i14, objArr);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C28765w(obj4);
        }
        return C28764v.f133294x;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC28761s) && mo143901p() && ((AbstractC28761s) obj).mo143901p() && hashCode() != obj.hashCode()) {
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
    public final AbstractC28759q m143899l() {
        AbstractC28759q abstractC28759q = this.f133287q;
        if (abstractC28759q == null) {
            AbstractC28759q mo143900m = mo143900m();
            this.f133287q = mo143900m;
            return mo143900m;
        }
        return abstractC28759q;
    }

    /* renamed from: m */
    AbstractC28759q mo143900m() {
        Object[] array = toArray();
        int i11 = AbstractC28759q.f133286r;
        return AbstractC28759q.m143894l(array, array.length);
    }

    /* renamed from: p */
    boolean mo143901p() {
        return false;
    }
}
