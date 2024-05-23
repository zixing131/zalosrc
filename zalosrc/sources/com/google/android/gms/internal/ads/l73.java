package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class l73 extends AbstractMap implements Serializable {

    /* renamed from: y */
    private static final Object f23770y = new Object();

    /* renamed from: p */
    private transient Object f23771p;

    /* renamed from: q */
    transient int[] f23772q;

    /* renamed from: r */
    transient Object[] f23773r;

    /* renamed from: s */
    transient Object[] f23774s;

    /* renamed from: t */
    private transient int f23775t;

    /* renamed from: u */
    private transient int f23776u;

    /* renamed from: v */
    private transient Set f23777v;

    /* renamed from: w */
    private transient Set f23778w;

    /* renamed from: x */
    private transient Collection f23779x;

    public l73(int i11) {
        m24163t(8);
    }

    /* renamed from: A */
    public final int m24138A(Object obj) {
        if (m24165v()) {
            return -1;
        }
        int m26864b = u73.m26864b(obj);
        int m24158z = m24158z();
        Object obj2 = this.f23771p;
        obj2.getClass();
        int m24486c = m73.m24486c(obj2, m26864b & m24158z);
        if (m24486c != 0) {
            int i11 = ~m24158z;
            int i12 = m26864b & i11;
            do {
                int i13 = m24486c - 1;
                int i14 = m24142E()[i13];
                if ((i14 & i11) == i12 && e53.m21617a(obj, m24143a()[i13])) {
                    return i13;
                }
                m24486c = i14 & m24158z;
            } while (m24486c != 0);
        }
        return -1;
    }

    /* renamed from: B */
    private final int m24139B(int i11, int i12, int i13, int i14) {
        Object m24487d = m73.m24487d(i12);
        int i15 = i12 - 1;
        if (i14 != 0) {
            m73.m24488e(m24487d, i13 & i15, i14 + 1);
        }
        Object obj = this.f23771p;
        obj.getClass();
        int[] m24142E = m24142E();
        for (int i16 = 0; i16 <= i11; i16++) {
            int m24486c = m73.m24486c(obj, i16);
            while (m24486c != 0) {
                int i17 = m24486c - 1;
                int i18 = m24142E[i17];
                int i19 = ((~i11) & i18) | i16;
                int i21 = i19 & i15;
                int m24486c2 = m73.m24486c(m24487d, i21);
                m73.m24488e(m24487d, i21, m24486c);
                m24142E[i17] = ((~i15) & i19) | (m24486c2 & i15);
                m24486c = i18 & i11;
            }
        }
        this.f23771p = m24487d;
        m24141D(i15);
        return i15;
    }

    /* renamed from: C */
    public final Object m24140C(Object obj) {
        if (m24165v()) {
            return f23770y;
        }
        int m24158z = m24158z();
        Object obj2 = this.f23771p;
        obj2.getClass();
        int m24485b = m73.m24485b(obj, null, m24158z, obj2, m24142E(), m24143a(), null);
        if (m24485b == -1) {
            return f23770y;
        }
        Object obj3 = m24144b()[m24485b];
        m24164u(m24485b, m24158z);
        this.f23776u--;
        m24162r();
        return obj3;
    }

    /* renamed from: D */
    private final void m24141D(int i11) {
        this.f23775t = ((32 - Integer.numberOfLeadingZeros(i11)) & 31) | (this.f23775t & (-32));
    }

    /* renamed from: E */
    public final int[] m24142E() {
        int[] iArr = this.f23772q;
        iArr.getClass();
        return iArr;
    }

    /* renamed from: a */
    public final Object[] m24143a() {
        Object[] objArr = this.f23773r;
        objArr.getClass();
        return objArr;
    }

    /* renamed from: b */
    public final Object[] m24144b() {
        Object[] objArr = this.f23774s;
        objArr.getClass();
        return objArr;
    }

    /* renamed from: d */
    public static /* synthetic */ int m24146d(l73 l73Var) {
        int i11 = l73Var.f23776u;
        l73Var.f23776u = i11 - 1;
        return i11;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m24149i(l73 l73Var, int i11) {
        return l73Var.m24143a()[i11];
    }

    /* renamed from: n */
    public static /* synthetic */ Object m24152n(l73 l73Var, int i11) {
        return l73Var.m24144b()[i11];
    }

    /* renamed from: o */
    public static /* synthetic */ Object m24153o(l73 l73Var) {
        Object obj = l73Var.f23771p;
        obj.getClass();
        return obj;
    }

    /* renamed from: q */
    public static /* synthetic */ void m24154q(l73 l73Var, int i11, Object obj) {
        l73Var.m24144b()[i11] = obj;
    }

    /* renamed from: z */
    public final int m24158z() {
        return (1 << (this.f23775t & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m24165v()) {
            return;
        }
        m24162r();
        Map m24161p = m24161p();
        if (m24161p != null) {
            this.f23775t = ha3.m22773b(size(), 3, 1073741823);
            m24161p.clear();
            this.f23771p = null;
            this.f23776u = 0;
            return;
        }
        Arrays.fill(m24143a(), 0, this.f23776u, (Object) null);
        Arrays.fill(m24144b(), 0, this.f23776u, (Object) null);
        Object obj = this.f23771p;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m24142E(), 0, this.f23776u, 0);
        this.f23776u = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map m24161p = m24161p();
        if (m24161p != null) {
            return m24161p.containsKey(obj);
        }
        if (m24138A(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map m24161p = m24161p();
        if (m24161p == null) {
            for (int i11 = 0; i11 < this.f23776u; i11++) {
                if (e53.m21617a(obj, m24144b()[i11])) {
                    return true;
                }
            }
            return false;
        }
        return m24161p.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f23778w;
        if (set == null) {
            g73 g73Var = new g73(this);
            this.f23778w = g73Var;
            return g73Var;
        }
        return set;
    }

    /* renamed from: g */
    public final int m24159g() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map m24161p = m24161p();
        if (m24161p != null) {
            return m24161p.get(obj);
        }
        int m24138A = m24138A(obj);
        if (m24138A == -1) {
            return null;
        }
        return m24144b()[m24138A];
    }

    /* renamed from: h */
    public final int m24160h(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.f23776u) {
            return i12;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f23777v;
        if (set == null) {
            i73 i73Var = new i73(this);
            this.f23777v = i73Var;
            return i73Var;
        }
        return set;
    }

    /* renamed from: p */
    public final Map m24161p() {
        Object obj = this.f23771p;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (m24165v()) {
            j53.m23539i(m24165v(), "Arrays already allocated");
            int i11 = this.f23775t;
            int max = Math.max(i11 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f23771p = m73.m24487d(max2);
            m24141D(max2 - 1);
            this.f23772q = new int[i11];
            this.f23773r = new Object[i11];
            this.f23774s = new Object[i11];
        }
        Map m24161p = m24161p();
        if (m24161p != null) {
            return m24161p.put(obj, obj2);
        }
        int[] m24142E = m24142E();
        Object[] m24143a = m24143a();
        Object[] m24144b = m24144b();
        int i12 = this.f23776u;
        int i13 = i12 + 1;
        int m26864b = u73.m26864b(obj);
        int m24158z = m24158z();
        int i14 = m26864b & m24158z;
        Object obj3 = this.f23771p;
        obj3.getClass();
        int m24486c = m73.m24486c(obj3, i14);
        if (m24486c == 0) {
            if (i13 > m24158z) {
                m24158z = m24139B(m24158z, m73.m24484a(m24158z), m26864b, i12);
            } else {
                Object obj4 = this.f23771p;
                obj4.getClass();
                m73.m24488e(obj4, i14, i13);
            }
        } else {
            int i15 = ~m24158z;
            int i16 = m26864b & i15;
            int i17 = 0;
            while (true) {
                int i18 = m24486c - 1;
                int i19 = m24142E[i18];
                int i21 = i19 & i15;
                if (i21 == i16 && e53.m21617a(obj, m24143a[i18])) {
                    Object obj5 = m24144b[i18];
                    m24144b[i18] = obj2;
                    return obj5;
                }
                int i22 = i19 & m24158z;
                i17++;
                if (i22 == 0) {
                    if (i17 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m24158z() + 1, 1.0f);
                        int m24159g = m24159g();
                        while (m24159g >= 0) {
                            linkedHashMap.put(m24143a()[m24159g], m24144b()[m24159g]);
                            m24159g = m24160h(m24159g);
                        }
                        this.f23771p = linkedHashMap;
                        this.f23772q = null;
                        this.f23773r = null;
                        this.f23774s = null;
                        m24162r();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > m24158z) {
                        m24158z = m24139B(m24158z, m73.m24484a(m24158z), m26864b, i12);
                    } else {
                        m24142E[i18] = (i13 & m24158z) | i21;
                    }
                } else {
                    m24486c = i22;
                }
            }
        }
        int length = m24142E().length;
        if (i13 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f23772q = Arrays.copyOf(m24142E(), min);
            this.f23773r = Arrays.copyOf(m24143a(), min);
            this.f23774s = Arrays.copyOf(m24144b(), min);
        }
        m24142E()[i12] = (~m24158z) & m26864b;
        m24143a()[i12] = obj;
        m24144b()[i12] = obj2;
        this.f23776u = i13;
        m24162r();
        return null;
    }

    /* renamed from: r */
    public final void m24162r() {
        this.f23775t += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map m24161p = m24161p();
        if (m24161p != null) {
            return m24161p.remove(obj);
        }
        Object m24140C = m24140C(obj);
        if (m24140C == f23770y) {
            return null;
        }
        return m24140C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m24161p = m24161p();
        if (m24161p != null) {
            return m24161p.size();
        }
        return this.f23776u;
    }

    /* renamed from: t */
    final void m24163t(int i11) {
        this.f23775t = ha3.m22773b(8, 1, 1073741823);
    }

    /* renamed from: u */
    public final void m24164u(int i11, int i12) {
        Object obj = this.f23771p;
        obj.getClass();
        int[] m24142E = m24142E();
        Object[] m24143a = m24143a();
        Object[] m24144b = m24144b();
        int size = size();
        int i13 = size - 1;
        if (i11 < i13) {
            Object obj2 = m24143a[i13];
            m24143a[i11] = obj2;
            m24144b[i11] = m24144b[i13];
            m24143a[i13] = null;
            m24144b[i13] = null;
            m24142E[i11] = m24142E[i13];
            m24142E[i13] = 0;
            int m26864b = u73.m26864b(obj2) & i12;
            int m24486c = m73.m24486c(obj, m26864b);
            if (m24486c == size) {
                m73.m24488e(obj, m26864b, i11 + 1);
                return;
            }
            while (true) {
                int i14 = m24486c - 1;
                int i15 = m24142E[i14];
                int i16 = i15 & i12;
                if (i16 != size) {
                    m24486c = i16;
                } else {
                    m24142E[i14] = ((i11 + 1) & i12) | (i15 & (~i12));
                    return;
                }
            }
        } else {
            m24143a[i11] = null;
            m24144b[i11] = null;
            m24142E[i11] = 0;
        }
    }

    /* renamed from: v */
    public final boolean m24165v() {
        return this.f23771p == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f23779x;
        if (collection == null) {
            k73 k73Var = new k73(this);
            this.f23779x = k73Var;
            return k73Var;
        }
        return collection;
    }
}
