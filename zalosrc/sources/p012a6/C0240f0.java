package p012a6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.f0 */
/* loaded from: classes2.dex */
public final class C0240f0 extends AbstractMap implements Serializable {

    /* renamed from: y */
    private static final Object f1108y = new Object();

    /* renamed from: p */
    private transient Object f1109p;

    /* renamed from: q */
    transient int[] f1110q;

    /* renamed from: r */
    transient Object[] f1111r;

    /* renamed from: s */
    transient Object[] f1112s;

    /* renamed from: t */
    private transient int f1113t;

    /* renamed from: u */
    private transient int f1114u;

    /* renamed from: v */
    private transient Set f1115v;

    /* renamed from: w */
    private transient Set f1116w;

    /* renamed from: x */
    private transient Collection f1117x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0240f0(int i11) {
        m712o(12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ Object m700h(C0240f0 c0240f0) {
        Object obj = c0240f0.f1109p;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final int m703r() {
        return (1 << (this.f1113t & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final int m704t(Object obj) {
        if (m714q()) {
            return -1;
        }
        int m742a = AbstractC0278h0.m742a(obj);
        int m703r = m703r();
        Object obj2 = this.f1109p;
        obj2.getClass();
        int m720c = AbstractC0259g0.m720c(obj2, m742a & m703r);
        if (m720c != 0) {
            int i11 = ~m703r;
            int i12 = m742a & i11;
            do {
                int i13 = m720c - 1;
                int[] iArr = this.f1110q;
                iArr.getClass();
                int i14 = iArr[i13];
                if ((i14 & i11) == i12) {
                    Object[] objArr = this.f1111r;
                    objArr.getClass();
                    if (AbstractC0466qh.m859a(obj, objArr[i13])) {
                        return i13;
                    }
                }
                m720c = i14 & m703r;
            } while (m720c != 0);
        }
        return -1;
    }

    /* renamed from: u */
    private final int m705u(int i11, int i12, int i13, int i14) {
        int i15 = i12 - 1;
        Object m721d = AbstractC0259g0.m721d(i12);
        if (i14 != 0) {
            AbstractC0259g0.m722e(m721d, i13 & i15, i14 + 1);
        }
        Object obj = this.f1109p;
        obj.getClass();
        int[] iArr = this.f1110q;
        iArr.getClass();
        for (int i16 = 0; i16 <= i11; i16++) {
            int m720c = AbstractC0259g0.m720c(obj, i16);
            while (m720c != 0) {
                int i17 = m720c - 1;
                int i18 = iArr[i17];
                int i19 = ((~i11) & i18) | i16;
                int i21 = i19 & i15;
                int m720c2 = AbstractC0259g0.m720c(m721d, i21);
                AbstractC0259g0.m722e(m721d, i21, m720c);
                iArr[i17] = ((~i15) & i19) | (m720c2 & i15);
                m720c = i18 & i11;
            }
        }
        this.f1109p = m721d;
        m707w(i15);
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final Object m706v(Object obj) {
        if (m714q()) {
            return f1108y;
        }
        int m703r = m703r();
        Object obj2 = this.f1109p;
        obj2.getClass();
        int[] iArr = this.f1110q;
        iArr.getClass();
        Object[] objArr = this.f1111r;
        objArr.getClass();
        int m719b = AbstractC0259g0.m719b(obj, null, m703r, obj2, iArr, objArr, null);
        if (m719b == -1) {
            return f1108y;
        }
        Object[] objArr2 = this.f1112s;
        objArr2.getClass();
        Object obj3 = objArr2[m719b];
        m713p(m719b, m703r);
        this.f1114u--;
        m711n();
        return obj3;
    }

    /* renamed from: w */
    private final void m707w(int i11) {
        this.f1113t = ((32 - Integer.numberOfLeadingZeros(i11)) & 31) | (this.f1113t & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m714q()) {
            return;
        }
        m711n();
        Map m710k = m710k();
        if (m710k == null) {
            Object[] objArr = this.f1111r;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f1114u, (Object) null);
            Object[] objArr2 = this.f1112s;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f1114u, (Object) null);
            Object obj = this.f1109p;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f1110q;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f1114u, 0);
            this.f1114u = 0;
            return;
        }
        this.f1113t = AbstractC0544v1.m882a(size(), 3, 1073741823);
        m710k.clear();
        this.f1109p = null;
        this.f1114u = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map m710k = m710k();
        if (m710k != null) {
            return m710k.containsKey(obj);
        }
        if (m704t(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map m710k = m710k();
        if (m710k == null) {
            for (int i11 = 0; i11 < this.f1114u; i11++) {
                Object[] objArr = this.f1112s;
                objArr.getClass();
                if (AbstractC0466qh.m859a(obj, objArr[i11])) {
                    return true;
                }
            }
            return false;
        }
        return m710k.containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m708e() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f1116w;
        if (set == null) {
            C0596y c0596y = new C0596y(this);
            this.f1116w = c0596y;
            return c0596y;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final int m709f(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.f1114u) {
            return i12;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map m710k = m710k();
        if (m710k != null) {
            return m710k.get(obj);
        }
        int m704t = m704t(obj);
        if (m704t == -1) {
            return null;
        }
        Object[] objArr = this.f1112s;
        objArr.getClass();
        return objArr[m704t];
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
    public final Map m710k() {
        Object obj = this.f1109p;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f1115v;
        if (set == null) {
            C0183c0 c0183c0 = new C0183c0(this);
            this.f1115v = c0183c0;
            return c0183c0;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m711n() {
        this.f1113t += 32;
    }

    /* renamed from: o */
    final void m712o(int i11) {
        this.f1113t = AbstractC0544v1.m882a(12, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m713p(int i11, int i12) {
        Object obj = this.f1109p;
        obj.getClass();
        int[] iArr = this.f1110q;
        iArr.getClass();
        Object[] objArr = this.f1111r;
        objArr.getClass();
        Object[] objArr2 = this.f1112s;
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
            int m742a = AbstractC0278h0.m742a(obj2) & i12;
            int m720c = AbstractC0259g0.m720c(obj, m742a);
            if (m720c == size) {
                AbstractC0259g0.m722e(obj, m742a, i11 + 1);
                return;
            }
            while (true) {
                int i14 = m720c - 1;
                int i15 = iArr[i14];
                int i16 = i15 & i12;
                if (i16 != size) {
                    m720c = i16;
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
        if (m714q()) {
            AbstractC0163b.m620d(m714q(), "Arrays already allocated");
            int i11 = this.f1113t;
            int max = Math.max(i11 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f1109p = AbstractC0259g0.m721d(max2);
            m707w(max2 - 1);
            this.f1110q = new int[i11];
            this.f1111r = new Object[i11];
            this.f1112s = new Object[i11];
        }
        Map m710k = m710k();
        if (m710k == null) {
            int[] iArr = this.f1110q;
            iArr.getClass();
            Object[] objArr = this.f1111r;
            objArr.getClass();
            Object[] objArr2 = this.f1112s;
            objArr2.getClass();
            int i12 = this.f1114u;
            int i13 = i12 + 1;
            int m742a = AbstractC0278h0.m742a(obj);
            int m703r = m703r();
            int i14 = m742a & m703r;
            Object obj3 = this.f1109p;
            obj3.getClass();
            int m720c = AbstractC0259g0.m720c(obj3, i14);
            if (m720c == 0) {
                if (i13 > m703r) {
                    m703r = m705u(m703r, AbstractC0259g0.m718a(m703r), m742a, i12);
                } else {
                    Object obj4 = this.f1109p;
                    obj4.getClass();
                    AbstractC0259g0.m722e(obj4, i14, i13);
                }
            } else {
                int i15 = ~m703r;
                int i16 = m742a & i15;
                int i17 = 0;
                while (true) {
                    int i18 = m720c - 1;
                    int i19 = iArr[i18];
                    int i21 = i19 & i15;
                    if (i21 == i16 && AbstractC0466qh.m859a(obj, objArr[i18])) {
                        Object obj5 = objArr2[i18];
                        objArr2[i18] = obj2;
                        return obj5;
                    }
                    int i22 = i19 & m703r;
                    i17++;
                    if (i22 == 0) {
                        if (i17 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(m703r() + 1, 1.0f);
                            int m708e = m708e();
                            while (m708e >= 0) {
                                Object[] objArr3 = this.f1111r;
                                objArr3.getClass();
                                Object obj6 = objArr3[m708e];
                                Object[] objArr4 = this.f1112s;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[m708e]);
                                m708e = m709f(m708e);
                            }
                            this.f1109p = linkedHashMap;
                            this.f1110q = null;
                            this.f1111r = null;
                            this.f1112s = null;
                            m711n();
                            return linkedHashMap.put(obj, obj2);
                        }
                        if (i13 > m703r) {
                            m703r = m705u(m703r, AbstractC0259g0.m718a(m703r), m742a, i12);
                        } else {
                            iArr[i18] = (i13 & m703r) | i21;
                        }
                    } else {
                        m720c = i22;
                    }
                }
            }
            int[] iArr2 = this.f1110q;
            iArr2.getClass();
            int length = iArr2.length;
            if (i13 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                int[] iArr3 = this.f1110q;
                iArr3.getClass();
                this.f1110q = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.f1111r;
                objArr5.getClass();
                this.f1111r = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.f1112s;
                objArr6.getClass();
                this.f1112s = Arrays.copyOf(objArr6, min);
            }
            int i23 = (~m703r) & m742a;
            int[] iArr4 = this.f1110q;
            iArr4.getClass();
            iArr4[i12] = i23;
            Object[] objArr7 = this.f1111r;
            objArr7.getClass();
            objArr7[i12] = obj;
            Object[] objArr8 = this.f1112s;
            objArr8.getClass();
            objArr8[i12] = obj2;
            this.f1114u = i13;
            m711n();
            return null;
        }
        return m710k.put(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean m714q() {
        return this.f1109p == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map m710k = m710k();
        if (m710k != null) {
            return m710k.remove(obj);
        }
        Object m706v = m706v(obj);
        if (m706v == f1108y) {
            return null;
        }
        return m706v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m710k = m710k();
        if (m710k != null) {
            return m710k.size();
        }
        return this.f1114u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f1117x;
        if (collection == null) {
            C0221e0 c0221e0 = new C0221e0(this);
            this.f1117x = c0221e0;
            return c0221e0;
        }
        return collection;
    }
}
