package p665y0;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: y0.g */
/* loaded from: classes.dex */
public class C30245g {

    /* renamed from: s */
    static Object[] f140488s;

    /* renamed from: t */
    static int f140489t;

    /* renamed from: u */
    static Object[] f140490u;

    /* renamed from: v */
    static int f140491v;

    /* renamed from: p */
    int[] f140492p;

    /* renamed from: q */
    Object[] f140493q;

    /* renamed from: r */
    int f140494r;

    public C30245g() {
        this.f140492p = AbstractC30241c.f140457a;
        this.f140493q = AbstractC30241c.f140459c;
        this.f140494r = 0;
    }

    /* renamed from: a */
    private void m149155a(int i11) {
        if (i11 == 8) {
            synchronized (C30245g.class) {
                try {
                    Object[] objArr = f140490u;
                    if (objArr != null) {
                        this.f140493q = objArr;
                        f140490u = (Object[]) objArr[0];
                        this.f140492p = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f140491v--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i11 == 4) {
            synchronized (C30245g.class) {
                try {
                    Object[] objArr2 = f140488s;
                    if (objArr2 != null) {
                        this.f140493q = objArr2;
                        f140488s = (Object[]) objArr2[0];
                        this.f140492p = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f140489t--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f140492p = new int[i11];
        this.f140493q = new Object[i11 << 1];
    }

    /* renamed from: b */
    private static int m149156b(int[] iArr, int i11, int i12) {
        try {
            return AbstractC30241c.m149118a(iArr, i11, i12);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m149157d(int[] iArr, Object[] objArr, int i11) {
        if (iArr.length == 8) {
            synchronized (C30245g.class) {
                try {
                    if (f140491v < 10) {
                        objArr[0] = f140490u;
                        objArr[1] = iArr;
                        for (int i12 = (i11 << 1) - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f140490u = objArr;
                        f140491v++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C30245g.class) {
                try {
                    if (f140489t < 10) {
                        objArr[0] = f140488s;
                        objArr[1] = iArr;
                        for (int i13 = (i11 << 1) - 1; i13 >= 2; i13--) {
                            objArr[i13] = null;
                        }
                        f140488s = objArr;
                        f140489t++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public void m149158c(int i11) {
        int i12 = this.f140494r;
        int[] iArr = this.f140492p;
        if (iArr.length < i11) {
            Object[] objArr = this.f140493q;
            m149155a(i11);
            if (this.f140494r > 0) {
                System.arraycopy(iArr, 0, this.f140492p, 0, i12);
                System.arraycopy(objArr, 0, this.f140493q, 0, i12 << 1);
            }
            m149157d(iArr, objArr, i12);
        }
        if (this.f140494r == i12) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i11 = this.f140494r;
        if (i11 > 0) {
            int[] iArr = this.f140492p;
            Object[] objArr = this.f140493q;
            this.f140492p = AbstractC30241c.f140457a;
            this.f140493q = AbstractC30241c.f140459c;
            this.f140494r = 0;
            m149157d(iArr, objArr, i11);
        }
        if (this.f140494r <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (m149160f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (m149162h(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    int m149159e(Object obj, int i11) {
        int i12 = this.f140494r;
        if (i12 == 0) {
            return -1;
        }
        int m149156b = m149156b(this.f140492p, i12, i11);
        if (m149156b < 0) {
            return m149156b;
        }
        if (obj.equals(this.f140493q[m149156b << 1])) {
            return m149156b;
        }
        int i13 = m149156b + 1;
        while (i13 < i12 && this.f140492p[i13] == i11) {
            if (obj.equals(this.f140493q[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = m149156b - 1; i14 >= 0 && this.f140492p[i14] == i11; i14--) {
            if (obj.equals(this.f140493q[i14 << 1])) {
                return i14;
            }
        }
        return ~i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30245g) {
            C30245g c30245g = (C30245g) obj;
            if (size() != c30245g.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f140494r; i11++) {
                try {
                    Object m149163i = m149163i(i11);
                    Object m149167o = m149167o(i11);
                    Object obj2 = c30245g.get(m149163i);
                    if (m149167o == null) {
                        if (obj2 != null || !c30245g.containsKey(m149163i)) {
                            return false;
                        }
                    } else if (!m149167o.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i12 = 0; i12 < this.f140494r; i12++) {
                try {
                    Object m149163i2 = m149163i(i12);
                    Object m149167o2 = m149167o(i12);
                    Object obj3 = map.get(m149163i2);
                    if (m149167o2 == null) {
                        if (obj3 != null || !map.containsKey(m149163i2)) {
                            return false;
                        }
                    } else if (!m149167o2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m149160f(Object obj) {
        if (obj == null) {
            return m149161g();
        }
        return m149159e(obj, obj.hashCode());
    }

    /* renamed from: g */
    int m149161g() {
        int i11 = this.f140494r;
        if (i11 == 0) {
            return -1;
        }
        int m149156b = m149156b(this.f140492p, i11, 0);
        if (m149156b < 0) {
            return m149156b;
        }
        if (this.f140493q[m149156b << 1] == null) {
            return m149156b;
        }
        int i12 = m149156b + 1;
        while (i12 < i11 && this.f140492p[i12] == 0) {
            if (this.f140493q[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m149156b - 1; i13 >= 0 && this.f140492p[i13] == 0; i13--) {
            if (this.f140493q[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int m149160f = m149160f(obj);
        if (m149160f >= 0) {
            return this.f140493q[(m149160f << 1) + 1];
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m149162h(Object obj) {
        int i11 = this.f140494r * 2;
        Object[] objArr = this.f140493q;
        if (obj == null) {
            for (int i12 = 1; i12 < i11; i12 += 2) {
                if (objArr[i12] == null) {
                    return i12 >> 1;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i11; i13 += 2) {
            if (obj.equals(objArr[i13])) {
                return i13 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f140492p;
        Object[] objArr = this.f140493q;
        int i11 = this.f140494r;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            int i15 = iArr[i13];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i14 += hashCode ^ i15;
            i13++;
            i12 += 2;
        }
        return i14;
    }

    /* renamed from: i */
    public Object m149163i(int i11) {
        return this.f140493q[i11 << 1];
    }

    public boolean isEmpty() {
        return this.f140494r <= 0;
    }

    /* renamed from: k */
    public void m149164k(C30245g c30245g) {
        int i11 = c30245g.f140494r;
        m149158c(this.f140494r + i11);
        if (this.f140494r == 0) {
            if (i11 > 0) {
                System.arraycopy(c30245g.f140492p, 0, this.f140492p, 0, i11);
                System.arraycopy(c30245g.f140493q, 0, this.f140493q, 0, i11 << 1);
                this.f140494r = i11;
                return;
            }
            return;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            put(c30245g.m149163i(i12), c30245g.m149167o(i12));
        }
    }

    /* renamed from: l */
    public Object m149165l(int i11) {
        Object[] objArr = this.f140493q;
        int i12 = i11 << 1;
        Object obj = objArr[i12 + 1];
        int i13 = this.f140494r;
        int i14 = 0;
        if (i13 <= 1) {
            m149157d(this.f140492p, objArr, i13);
            this.f140492p = AbstractC30241c.f140457a;
            this.f140493q = AbstractC30241c.f140459c;
        } else {
            int i15 = i13 - 1;
            int[] iArr = this.f140492p;
            int i16 = 8;
            if (iArr.length > 8 && i13 < iArr.length / 3) {
                if (i13 > 8) {
                    i16 = i13 + (i13 >> 1);
                }
                m149155a(i16);
                if (i13 == this.f140494r) {
                    if (i11 > 0) {
                        System.arraycopy(iArr, 0, this.f140492p, 0, i11);
                        System.arraycopy(objArr, 0, this.f140493q, 0, i12);
                    }
                    if (i11 < i15) {
                        int i17 = i11 + 1;
                        int i18 = i15 - i11;
                        System.arraycopy(iArr, i17, this.f140492p, i11, i18);
                        System.arraycopy(objArr, i17 << 1, this.f140493q, i12, i18 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i11 < i15) {
                    int i19 = i11 + 1;
                    int i21 = i15 - i11;
                    System.arraycopy(iArr, i19, iArr, i11, i21);
                    Object[] objArr2 = this.f140493q;
                    System.arraycopy(objArr2, i19 << 1, objArr2, i12, i21 << 1);
                }
                Object[] objArr3 = this.f140493q;
                int i22 = i15 << 1;
                objArr3[i22] = null;
                objArr3[i22 + 1] = null;
            }
            i14 = i15;
        }
        if (i13 == this.f140494r) {
            this.f140494r = i14;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: n */
    public Object m149166n(int i11, Object obj) {
        int i12 = (i11 << 1) + 1;
        Object[] objArr = this.f140493q;
        Object obj2 = objArr[i12];
        objArr[i12] = obj;
        return obj2;
    }

    /* renamed from: o */
    public Object m149167o(int i11) {
        return this.f140493q[(i11 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i11;
        int m149159e;
        int i12 = this.f140494r;
        if (obj == null) {
            m149159e = m149161g();
            i11 = 0;
        } else {
            int hashCode = obj.hashCode();
            i11 = hashCode;
            m149159e = m149159e(obj, hashCode);
        }
        if (m149159e >= 0) {
            int i13 = (m149159e << 1) + 1;
            Object[] objArr = this.f140493q;
            Object obj3 = objArr[i13];
            objArr[i13] = obj2;
            return obj3;
        }
        int i14 = ~m149159e;
        int[] iArr = this.f140492p;
        if (i12 >= iArr.length) {
            int i15 = 8;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i15 = 4;
            }
            Object[] objArr2 = this.f140493q;
            m149155a(i15);
            if (i12 == this.f140494r) {
                int[] iArr2 = this.f140492p;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f140493q, 0, objArr2.length);
                }
                m149157d(iArr, objArr2, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f140492p;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr3 = this.f140493q;
            System.arraycopy(objArr3, i14 << 1, objArr3, i16 << 1, (this.f140494r - i14) << 1);
        }
        int i17 = this.f140494r;
        if (i12 == i17) {
            int[] iArr4 = this.f140492p;
            if (i14 < iArr4.length) {
                iArr4[i14] = i11;
                Object[] objArr4 = this.f140493q;
                int i18 = i14 << 1;
                objArr4[i18] = obj;
                objArr4[i18 + 1] = obj2;
                this.f140494r = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int m149160f = m149160f(obj);
        if (m149160f >= 0) {
            return m149165l(m149160f);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int m149160f = m149160f(obj);
        if (m149160f >= 0) {
            return m149166n(m149160f, obj2);
        }
        return null;
    }

    public int size() {
        return this.f140494r;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f140494r * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f140494r; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object m149163i = m149163i(i11);
            if (m149163i != this) {
                sb2.append(m149163i);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object m149167o = m149167o(i11);
            if (m149167o != this) {
                sb2.append(m149167o);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int m149160f = m149160f(obj);
        if (m149160f < 0) {
            return false;
        }
        Object m149167o = m149167o(m149160f);
        if (obj2 != m149167o && (obj2 == null || !obj2.equals(m149167o))) {
            return false;
        }
        m149165l(m149160f);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int m149160f = m149160f(obj);
        if (m149160f < 0) {
            return false;
        }
        Object m149167o = m149167o(m149160f);
        if (m149167o != obj2 && (obj2 == null || !obj2.equals(m149167o))) {
            return false;
        }
        m149166n(m149160f, obj3);
        return true;
    }

    public C30245g(int i11) {
        if (i11 == 0) {
            this.f140492p = AbstractC30241c.f140457a;
            this.f140493q = AbstractC30241c.f140459c;
        } else {
            m149155a(i11);
        }
        this.f140494r = 0;
    }

    public C30245g(C30245g c30245g) {
        this();
        if (c30245g != null) {
            m149164k(c30245g);
        }
    }
}
