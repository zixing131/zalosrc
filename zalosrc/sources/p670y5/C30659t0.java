package p670y5;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y5.t0 */
/* loaded from: classes2.dex */
public final class C30659t0 extends AbstractMap implements Serializable {

    /* renamed from: y */
    private static final Object f141806y = new Object();

    /* renamed from: p */
    private transient Object f141807p;

    /* renamed from: q */
    transient int[] f141808q;

    /* renamed from: r */
    transient Object[] f141809r;

    /* renamed from: s */
    transient Object[] f141810s;

    /* renamed from: t */
    private transient int f141811t;

    /* renamed from: u */
    private transient int f141812u;

    /* renamed from: v */
    private transient Set f141813v;

    /* renamed from: w */
    private transient Set f141814w;

    /* renamed from: x */
    private transient Collection f141815x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30659t0(int i11) {
        m149648o(12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ Object m149636h(C30659t0 c30659t0) {
        Object obj = c30659t0.f141807p;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final int m149639r() {
        return (1 << (this.f141811t & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final int m149640t(Object obj) {
        if (m149650q()) {
            return -1;
        }
        int m149666a = AbstractC30697v0.m149666a(obj);
        int m149639r = m149639r();
        Object obj2 = this.f141807p;
        obj2.getClass();
        int m149653c = AbstractC30678u0.m149653c(obj2, m149666a & m149639r);
        if (m149653c != 0) {
            int i11 = ~m149639r;
            int i12 = m149666a & i11;
            do {
                int i13 = m149653c - 1;
                int[] iArr = this.f141808q;
                iArr.getClass();
                int i14 = iArr[i13];
                if ((i14 & i11) == i12) {
                    Object[] objArr = this.f141809r;
                    objArr.getClass();
                    if (AbstractC30506l.m149562a(obj, objArr[i13])) {
                        return i13;
                    }
                }
                m149653c = i14 & m149639r;
            } while (m149653c != 0);
        }
        return -1;
    }

    /* renamed from: u */
    private final int m149641u(int i11, int i12, int i13, int i14) {
        int i15 = i12 - 1;
        Object m149654d = AbstractC30678u0.m149654d(i12);
        if (i14 != 0) {
            AbstractC30678u0.m149655e(m149654d, i13 & i15, i14 + 1);
        }
        Object obj = this.f141807p;
        obj.getClass();
        int[] iArr = this.f141808q;
        iArr.getClass();
        for (int i16 = 0; i16 <= i11; i16++) {
            int m149653c = AbstractC30678u0.m149653c(obj, i16);
            while (m149653c != 0) {
                int i17 = m149653c - 1;
                int i18 = iArr[i17];
                int i19 = ((~i11) & i18) | i16;
                int i21 = i19 & i15;
                int m149653c2 = AbstractC30678u0.m149653c(m149654d, i21);
                AbstractC30678u0.m149655e(m149654d, i21, m149653c);
                iArr[i17] = ((~i15) & i19) | (m149653c2 & i15);
                m149653c = i18 & i11;
            }
        }
        this.f141807p = m149654d;
        m149643w(i15);
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final Object m149642v(Object obj) {
        if (m149650q()) {
            return f141806y;
        }
        int m149639r = m149639r();
        Object obj2 = this.f141807p;
        obj2.getClass();
        int[] iArr = this.f141808q;
        iArr.getClass();
        Object[] objArr = this.f141809r;
        objArr.getClass();
        int m149652b = AbstractC30678u0.m149652b(obj, null, m149639r, obj2, iArr, objArr, null);
        if (m149652b == -1) {
            return f141806y;
        }
        Object[] objArr2 = this.f141810s;
        objArr2.getClass();
        Object obj3 = objArr2[m149652b];
        m149649p(m149652b, m149639r);
        this.f141812u--;
        m149647n();
        return obj3;
    }

    /* renamed from: w */
    private final void m149643w(int i11) {
        this.f141811t = ((32 - Integer.numberOfLeadingZeros(i11)) & 31) | (this.f141811t & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m149650q()) {
            return;
        }
        m149647n();
        Map m149646k = m149646k();
        if (m149646k == null) {
            Object[] objArr = this.f141809r;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f141812u, (Object) null);
            Object[] objArr2 = this.f141810s;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f141812u, (Object) null);
            Object obj = this.f141807p;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f141808q;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f141812u, 0);
            this.f141812u = 0;
            return;
        }
        this.f141811t = AbstractC30376e2.m149496a(size(), 3, 1073741823);
        m149646k.clear();
        this.f141807p = null;
        this.f141812u = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map m149646k = m149646k();
        if (m149646k != null) {
            return m149646k.containsKey(obj);
        }
        if (m149640t(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map m149646k = m149646k();
        if (m149646k == null) {
            for (int i11 = 0; i11 < this.f141812u; i11++) {
                Object[] objArr = this.f141810s;
                objArr.getClass();
                if (AbstractC30506l.m149562a(obj, objArr[i11])) {
                    return true;
                }
            }
            return false;
        }
        return m149646k.containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m149644e() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f141814w;
        if (set == null) {
            C30545n0 c30545n0 = new C30545n0(this);
            this.f141814w = c30545n0;
            return c30545n0;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final int m149645f(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.f141812u) {
            return i12;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map m149646k = m149646k();
        if (m149646k != null) {
            return m149646k.get(obj);
        }
        int m149640t = m149640t(obj);
        if (m149640t == -1) {
            return null;
        }
        Object[] objArr = this.f141810s;
        objArr.getClass();
        return objArr[m149640t];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final Map m149646k() {
        Object obj = this.f141807p;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f141813v;
        if (set == null) {
            C30602q0 c30602q0 = new C30602q0(this);
            this.f141813v = c30602q0;
            return c30602q0;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m149647n() {
        this.f141811t += 32;
    }

    /* renamed from: o */
    final void m149648o(int i11) {
        this.f141811t = AbstractC30376e2.m149496a(12, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m149649p(int i11, int i12) {
        Object obj = this.f141807p;
        obj.getClass();
        int[] iArr = this.f141808q;
        iArr.getClass();
        Object[] objArr = this.f141809r;
        objArr.getClass();
        Object[] objArr2 = this.f141810s;
        objArr2.getClass();
        int size = size();
        int i13 = size - 1;
        if (i11 < i13) {
            Object obj2 = objArr[i13];
            objArr[i11] = obj2;
            objArr2[i11] = objArr2[i13];
            objArr[i13] = null;
            objArr2[i13] = null;
            iArr[i11] = iArr[i13];
            iArr[i13] = 0;
            int m149666a = AbstractC30697v0.m149666a(obj2) & i12;
            int m149653c = AbstractC30678u0.m149653c(obj, m149666a);
            if (m149653c == size) {
                AbstractC30678u0.m149655e(obj, m149666a, i11 + 1);
                return;
            }
            while (true) {
                int i14 = m149653c - 1;
                int i15 = iArr[i14];
                int i16 = i15 & i12;
                if (i16 != size) {
                    m149653c = i16;
                } else {
                    iArr[i14] = ((i11 + 1) & i12) | (i15 & (~i12));
                    return;
                }
            }
        } else {
            objArr[i11] = null;
            objArr2[i11] = null;
            iArr[i11] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (m149650q()) {
            AbstractC30582p.m149601d(m149650q(), "Arrays already allocated");
            int i11 = this.f141811t;
            int max = Math.max(i11 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f141807p = AbstractC30678u0.m149654d(max2);
            m149643w(max2 - 1);
            this.f141808q = new int[i11];
            this.f141809r = new Object[i11];
            this.f141810s = new Object[i11];
        }
        Map m149646k = m149646k();
        if (m149646k == null) {
            int[] iArr = this.f141808q;
            iArr.getClass();
            Object[] objArr = this.f141809r;
            objArr.getClass();
            Object[] objArr2 = this.f141810s;
            objArr2.getClass();
            int i12 = this.f141812u;
            int i13 = i12 + 1;
            int m149666a = AbstractC30697v0.m149666a(obj);
            int m149639r = m149639r();
            int i14 = m149666a & m149639r;
            Object obj3 = this.f141807p;
            obj3.getClass();
            int m149653c = AbstractC30678u0.m149653c(obj3, i14);
            if (m149653c == 0) {
                if (i13 > m149639r) {
                    m149639r = m149641u(m149639r, AbstractC30678u0.m149651a(m149639r), m149666a, i12);
                } else {
                    Object obj4 = this.f141807p;
                    obj4.getClass();
                    AbstractC30678u0.m149655e(obj4, i14, i13);
                }
            } else {
                int i15 = ~m149639r;
                int i16 = m149666a & i15;
                int i17 = 0;
                while (true) {
                    int i18 = m149653c - 1;
                    int i19 = iArr[i18];
                    int i21 = i19 & i15;
                    if (i21 == i16 && AbstractC30506l.m149562a(obj, objArr[i18])) {
                        Object obj5 = objArr2[i18];
                        objArr2[i18] = obj2;
                        return obj5;
                    }
                    int i22 = i19 & m149639r;
                    i17++;
                    if (i22 == 0) {
                        if (i17 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(m149639r() + 1, 1.0f);
                            int m149644e = m149644e();
                            while (m149644e >= 0) {
                                Object[] objArr3 = this.f141809r;
                                objArr3.getClass();
                                Object obj6 = objArr3[m149644e];
                                Object[] objArr4 = this.f141810s;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[m149644e]);
                                m149644e = m149645f(m149644e);
                            }
                            this.f141807p = linkedHashMap;
                            this.f141808q = null;
                            this.f141809r = null;
                            this.f141810s = null;
                            m149647n();
                            return linkedHashMap.put(obj, obj2);
                        }
                        if (i13 > m149639r) {
                            m149639r = m149641u(m149639r, AbstractC30678u0.m149651a(m149639r), m149666a, i12);
                        } else {
                            iArr[i18] = (i13 & m149639r) | i21;
                        }
                    } else {
                        m149653c = i22;
                    }
                }
            }
            int[] iArr2 = this.f141808q;
            iArr2.getClass();
            int length = iArr2.length;
            if (i13 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                int[] iArr3 = this.f141808q;
                iArr3.getClass();
                this.f141808q = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.f141809r;
                objArr5.getClass();
                this.f141809r = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.f141810s;
                objArr6.getClass();
                this.f141810s = Arrays.copyOf(objArr6, min);
            }
            int i23 = (~m149639r) & m149666a;
            int[] iArr4 = this.f141808q;
            iArr4.getClass();
            iArr4[i12] = i23;
            Object[] objArr7 = this.f141809r;
            objArr7.getClass();
            objArr7[i12] = obj;
            Object[] objArr8 = this.f141810s;
            objArr8.getClass();
            objArr8[i12] = obj2;
            this.f141812u = i13;
            m149647n();
            return null;
        }
        return m149646k.put(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean m149650q() {
        return this.f141807p == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map m149646k = m149646k();
        if (m149646k != null) {
            return m149646k.remove(obj);
        }
        Object m149642v = m149642v(obj);
        if (m149642v == f141806y) {
            return null;
        }
        return m149642v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m149646k = m149646k();
        if (m149646k != null) {
            return m149646k.size();
        }
        return this.f141812u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f141815x;
        if (collection == null) {
            C30640s0 c30640s0 = new C30640s0(this);
            this.f141815x = c30640s0;
            return c30640s0;
        }
        return collection;
    }
}
