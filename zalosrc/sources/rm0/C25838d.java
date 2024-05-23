package rm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import gn0.InterfaceC19521e;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import ln0.AbstractC22543l;
import ln0.C22537f;
import qm0.AbstractC25336c;
import qm0.AbstractC25351j0;
import qm0.AbstractC25356m;

/* renamed from: rm0.d */
/* loaded from: classes.dex */
public final class C25838d implements Map, Serializable, InterfaceC19521e {

    /* renamed from: C */
    public static final a f123234C = new a(null);

    /* renamed from: D */
    private static final C25838d f123235D;

    /* renamed from: A */
    private C25839e f123236A;

    /* renamed from: B */
    private boolean f123237B;

    /* renamed from: p */
    private Object[] f123238p;

    /* renamed from: q */
    private Object[] f123239q;

    /* renamed from: r */
    private int[] f123240r;

    /* renamed from: s */
    private int[] f123241s;

    /* renamed from: t */
    private int f123242t;

    /* renamed from: u */
    private int f123243u;

    /* renamed from: v */
    private int f123244v;

    /* renamed from: w */
    private int f123245w;

    /* renamed from: x */
    private int f123246x;

    /* renamed from: y */
    private C25840f f123247y;

    /* renamed from: z */
    private C25841g f123248z;

    /* renamed from: rm0.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public final int m133279c(int i11) {
            int m116580c;
            m116580c = AbstractC22543l.m116580c(i11, 1);
            return Integer.highestOneBit(m116580c * 3);
        }

        /* renamed from: d */
        public final int m133280d(int i11) {
            return Integer.numberOfLeadingZeros(i11) + 1;
        }

        /* renamed from: e */
        public final C25838d m133281e() {
            return C25838d.f123235D;
        }
    }

    /* renamed from: rm0.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends d implements Iterator, InterfaceC19517a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25838d c25838d) {
            super(c25838d);
            AbstractC19074t.m100208f(c25838d, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i */
        public c next() {
            m133285a();
            if (m133286c() < m133288e().f123243u) {
                int m133286c = m133286c();
                m133290g(m133286c + 1);
                m133291h(m133286c);
                c cVar = new c(m133288e(), m133287d());
                m133289f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: j */
        public final void m133283j(StringBuilder sb2) {
            AbstractC19074t.m100208f(sb2, "sb");
            if (m133286c() < m133288e().f123243u) {
                int m133286c = m133286c();
                m133290g(m133286c + 1);
                m133291h(m133286c);
                Object obj = m133288e().f123238p[m133287d()];
                if (obj == m133288e()) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = m133288e().f123239q;
                AbstractC19074t.m100205c(objArr);
                Object obj2 = objArr[m133287d()];
                if (obj2 == m133288e()) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                m133289f();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: k */
        public final int m133284k() {
            int i11;
            if (m133286c() < m133288e().f123243u) {
                int m133286c = m133286c();
                m133290g(m133286c + 1);
                m133291h(m133286c);
                Object obj = m133288e().f123238p[m133287d()];
                int i12 = 0;
                if (obj != null) {
                    i11 = obj.hashCode();
                } else {
                    i11 = 0;
                }
                Object[] objArr = m133288e().f123239q;
                AbstractC19074t.m100205c(objArr);
                Object obj2 = objArr[m133287d()];
                if (obj2 != null) {
                    i12 = obj2.hashCode();
                }
                int i13 = i11 ^ i12;
                m133289f();
                return i13;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: rm0.d$c */
    /* loaded from: classes7.dex */
    public static final class c implements Map.Entry, InterfaceC19517a {

        /* renamed from: p */
        private final C25838d f123249p;

        /* renamed from: q */
        private final int f123250q;

        public c(C25838d c25838d, int i11) {
            AbstractC19074t.m100208f(c25838d, "map");
            this.f123249p = c25838d;
            this.f123250q = i11;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (AbstractC19074t.m100204b(entry.getKey(), getKey()) && AbstractC19074t.m100204b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f123249p.f123238p[this.f123250q];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f123249p.f123239q;
            AbstractC19074t.m100205c(objArr);
            return objArr[this.f123250q];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i11;
            Object key = getKey();
            int i12 = 0;
            if (key != null) {
                i11 = key.hashCode();
            } else {
                i11 = 0;
            }
            Object value = getValue();
            if (value != null) {
                i12 = value.hashCode();
            }
            return i11 ^ i12;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f123249p.m133271n();
            Object[] m133253k = this.f123249p.m133253k();
            int i11 = this.f123250q;
            Object obj2 = m133253k[i11];
            m133253k[i11] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: rm0.d$d */
    /* loaded from: classes7.dex */
    public static class d {

        /* renamed from: p */
        private final C25838d f123251p;

        /* renamed from: q */
        private int f123252q;

        /* renamed from: r */
        private int f123253r;

        /* renamed from: s */
        private int f123254s;

        public d(C25838d c25838d) {
            AbstractC19074t.m100208f(c25838d, "map");
            this.f123251p = c25838d;
            this.f123253r = -1;
            this.f123254s = c25838d.f123245w;
            m133289f();
        }

        /* renamed from: a */
        public final void m133285a() {
            if (this.f123251p.f123245w == this.f123254s) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: c */
        public final int m133286c() {
            return this.f123252q;
        }

        /* renamed from: d */
        public final int m133287d() {
            return this.f123253r;
        }

        /* renamed from: e */
        public final C25838d m133288e() {
            return this.f123251p;
        }

        /* renamed from: f */
        public final void m133289f() {
            while (this.f123252q < this.f123251p.f123243u) {
                int[] iArr = this.f123251p.f123240r;
                int i11 = this.f123252q;
                if (iArr[i11] < 0) {
                    this.f123252q = i11 + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: g */
        public final void m133290g(int i11) {
            this.f123252q = i11;
        }

        /* renamed from: h */
        public final void m133291h(int i11) {
            this.f123253r = i11;
        }

        public final boolean hasNext() {
            if (this.f123252q < this.f123251p.f123243u) {
                return true;
            }
            return false;
        }

        public final void remove() {
            m133285a();
            if (this.f123253r != -1) {
                this.f123251p.m133271n();
                this.f123251p.m133243P(this.f123253r);
                this.f123253r = -1;
                this.f123254s = this.f123251p.f123245w;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* renamed from: rm0.d$e */
    /* loaded from: classes7.dex */
    public static final class e extends d implements Iterator, InterfaceC19517a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C25838d c25838d) {
            super(c25838d);
            AbstractC19074t.m100208f(c25838d, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m133285a();
            if (m133286c() < m133288e().f123243u) {
                int m133286c = m133286c();
                m133290g(m133286c + 1);
                m133291h(m133286c);
                Object obj = m133288e().f123238p[m133287d()];
                m133289f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: rm0.d$f */
    /* loaded from: classes7.dex */
    public static final class f extends d implements Iterator, InterfaceC19517a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C25838d c25838d) {
            super(c25838d);
            AbstractC19074t.m100208f(c25838d, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m133285a();
            if (m133286c() < m133288e().f123243u) {
                int m133286c = m133286c();
                m133290g(m133286c + 1);
                m133291h(m133286c);
                Object[] objArr = m133288e().f123239q;
                AbstractC19074t.m100205c(objArr);
                Object obj = objArr[m133287d()];
                m133289f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        C25838d c25838d = new C25838d(0);
        c25838d.f123237B = true;
        f123235D = c25838d;
    }

    private C25838d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i11, int i12) {
        this.f123238p = objArr;
        this.f123239q = objArr2;
        this.f123240r = iArr;
        this.f123241s = iArr2;
        this.f123242t = i11;
        this.f123243u = i12;
        this.f123244v = f123234C.m133280d(m133235A());
    }

    /* renamed from: A */
    private final int m133235A() {
        return this.f123241s.length;
    }

    /* renamed from: E */
    private final int m133236E(Object obj) {
        int i11;
        if (obj != null) {
            i11 = obj.hashCode();
        } else {
            i11 = 0;
        }
        return (i11 * (-1640531527)) >>> this.f123244v;
    }

    /* renamed from: H */
    private final boolean m133237H(Collection collection) {
        boolean z11 = false;
        if (collection.isEmpty()) {
            return false;
        }
        m133257u(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m133238I((Map.Entry) it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: I */
    private final boolean m133238I(Map.Entry entry) {
        int m133269i = m133269i(entry.getKey());
        Object[] m133253k = m133253k();
        if (m133269i >= 0) {
            m133253k[m133269i] = entry.getValue();
            return true;
        }
        int i11 = (-m133269i) - 1;
        if (!AbstractC19074t.m100204b(entry.getValue(), m133253k[i11])) {
            m133253k[i11] = entry.getValue();
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private final boolean m133239J(int i11) {
        int m133236E = m133236E(this.f123238p[i11]);
        int i12 = this.f123242t;
        while (true) {
            int[] iArr = this.f123241s;
            if (iArr[m133236E] == 0) {
                iArr[m133236E] = i11 + 1;
                this.f123240r[i11] = m133236E;
                return true;
            }
            i12--;
            if (i12 < 0) {
                return false;
            }
            int i13 = m133236E - 1;
            if (m133236E == 0) {
                m133236E = m133235A() - 1;
            } else {
                m133236E = i13;
            }
        }
    }

    /* renamed from: K */
    private final void m133240K() {
        this.f123245w++;
    }

    /* renamed from: L */
    private final void m133241L(int i11) {
        m133240K();
        if (this.f123243u > size()) {
            m133254o();
        }
        int i12 = 0;
        if (i11 == m133235A()) {
            AbstractC25356m.m131329l(this.f123241s, 0, 0, m133235A());
        } else {
            this.f123241s = new int[i11];
            this.f123244v = f123234C.m133280d(i11);
        }
        while (i12 < this.f123243u) {
            int i13 = i12 + 1;
            if (m133239J(i12)) {
                i12 = i13;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: N */
    private final void m133242N(int i11) {
        int m116584g;
        m116584g = AbstractC22543l.m116584g(this.f123242t * 2, m133235A() / 2);
        int i12 = m116584g;
        int i13 = 0;
        int i14 = i11;
        do {
            int i15 = i11 - 1;
            if (i11 == 0) {
                i11 = m133235A() - 1;
            } else {
                i11 = i15;
            }
            i13++;
            if (i13 > this.f123242t) {
                this.f123241s[i14] = 0;
                return;
            }
            int[] iArr = this.f123241s;
            int i16 = iArr[i11];
            if (i16 == 0) {
                iArr[i14] = 0;
                return;
            }
            if (i16 < 0) {
                iArr[i14] = -1;
            } else {
                int i17 = i16 - 1;
                if (((m133236E(this.f123238p[i17]) - i11) & (m133235A() - 1)) >= i13) {
                    this.f123241s[i14] = i16;
                    this.f123240r[i17] = i14;
                }
                i12--;
            }
            i14 = i11;
            i13 = 0;
            i12--;
        } while (i12 >= 0);
        this.f123241s[i14] = -1;
    }

    /* renamed from: P */
    public final void m133243P(int i11) {
        AbstractC25837c.m133230f(this.f123238p, i11);
        m133242N(this.f123240r[i11]);
        this.f123240r[i11] = -1;
        this.f123246x = size() - 1;
        m133240K();
    }

    /* renamed from: R */
    private final boolean m133244R(int i11) {
        int m133275y = m133275y();
        int i12 = this.f123243u;
        int i13 = m133275y - i12;
        int size = i12 - size();
        if (i13 < i11 && i13 + size >= i11 && size >= m133275y() / 4) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final Object[] m133253k() {
        Object[] objArr = this.f123239q;
        if (objArr != null) {
            return objArr;
        }
        Object[] m133228d = AbstractC25837c.m133228d(m133275y());
        this.f123239q = m133228d;
        return m133228d;
    }

    /* renamed from: o */
    private final void m133254o() {
        int i11;
        Object[] objArr = this.f123239q;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = this.f123243u;
            if (i12 >= i11) {
                break;
            }
            if (this.f123240r[i12] >= 0) {
                Object[] objArr2 = this.f123238p;
                objArr2[i13] = objArr2[i12];
                if (objArr != null) {
                    objArr[i13] = objArr[i12];
                }
                i13++;
            }
            i12++;
        }
        AbstractC25837c.m133231g(this.f123238p, i13, i11);
        if (objArr != null) {
            AbstractC25837c.m133231g(objArr, i13, this.f123243u);
        }
        this.f123243u = i13;
    }

    /* renamed from: r */
    private final boolean m133255r(Map map) {
        if (size() == map.size() && m133272p(map.entrySet())) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private final void m133256t(int i11) {
        Object[] objArr;
        if (i11 >= 0) {
            if (i11 > m133275y()) {
                int m131238d = AbstractC25336c.f121523p.m131238d(m133275y(), i11);
                this.f123238p = AbstractC25837c.m133229e(this.f123238p, m131238d);
                Object[] objArr2 = this.f123239q;
                if (objArr2 != null) {
                    objArr = AbstractC25837c.m133229e(objArr2, m131238d);
                } else {
                    objArr = null;
                }
                this.f123239q = objArr;
                int[] copyOf = Arrays.copyOf(this.f123240r, m131238d);
                AbstractC19074t.m100207e(copyOf, "copyOf(...)");
                this.f123240r = copyOf;
                int m133279c = f123234C.m133279c(m131238d);
                if (m133279c > m133235A()) {
                    m133241L(m133279c);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: u */
    private final void m133257u(int i11) {
        if (m133244R(i11)) {
            m133241L(m133235A());
        } else {
            m133256t(this.f123243u + i11);
        }
    }

    /* renamed from: w */
    private final int m133258w(Object obj) {
        int m133236E = m133236E(obj);
        int i11 = this.f123242t;
        while (true) {
            int i12 = this.f123241s[m133236E];
            if (i12 == 0) {
                return -1;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (AbstractC19074t.m100204b(this.f123238p[i13], obj)) {
                    return i13;
                }
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            int i14 = m133236E - 1;
            if (m133236E == 0) {
                m133236E = m133235A() - 1;
            } else {
                m133236E = i14;
            }
        }
    }

    private final Object writeReplace() {
        if (this.f123237B) {
            return new C25843i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: x */
    private final int m133259x(Object obj) {
        int i11 = this.f123243u;
        while (true) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
            if (this.f123240r[i11] >= 0) {
                Object[] objArr = this.f123239q;
                AbstractC19074t.m100205c(objArr);
                if (AbstractC19074t.m100204b(objArr[i11], obj)) {
                    return i11;
                }
            }
        }
    }

    /* renamed from: B */
    public Set m133260B() {
        C25840f c25840f = this.f123247y;
        if (c25840f == null) {
            C25840f c25840f2 = new C25840f(this);
            this.f123247y = c25840f2;
            return c25840f2;
        }
        return c25840f;
    }

    /* renamed from: C */
    public int m133261C() {
        return this.f123246x;
    }

    /* renamed from: D */
    public Collection m133262D() {
        C25841g c25841g = this.f123248z;
        if (c25841g == null) {
            C25841g c25841g2 = new C25841g(this);
            this.f123248z = c25841g2;
            return c25841g2;
        }
        return c25841g;
    }

    /* renamed from: F */
    public final boolean m133263F() {
        return this.f123237B;
    }

    /* renamed from: G */
    public final e m133264G() {
        return new e(this);
    }

    /* renamed from: M */
    public final boolean m133265M(Map.Entry entry) {
        AbstractC19074t.m100208f(entry, "entry");
        m133271n();
        int m133258w = m133258w(entry.getKey());
        if (m133258w < 0) {
            return false;
        }
        Object[] objArr = this.f123239q;
        AbstractC19074t.m100205c(objArr);
        if (!AbstractC19074t.m100204b(objArr[m133258w], entry.getValue())) {
            return false;
        }
        m133243P(m133258w);
        return true;
    }

    /* renamed from: O */
    public final int m133266O(Object obj) {
        m133271n();
        int m133258w = m133258w(obj);
        if (m133258w < 0) {
            return -1;
        }
        m133243P(m133258w);
        return m133258w;
    }

    /* renamed from: Q */
    public final boolean m133267Q(Object obj) {
        m133271n();
        int m133259x = m133259x(obj);
        if (m133259x < 0) {
            return false;
        }
        m133243P(m133259x);
        return true;
    }

    /* renamed from: S */
    public final f m133268S() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m133271n();
        AbstractC25351j0 it = new C22537f(0, this.f123243u - 1).iterator();
        while (it.hasNext()) {
            int mo116552a = it.mo116552a();
            int[] iArr = this.f123240r;
            int i11 = iArr[mo116552a];
            if (i11 >= 0) {
                this.f123241s[i11] = 0;
                iArr[mo116552a] = -1;
            }
        }
        AbstractC25837c.m133231g(this.f123238p, 0, this.f123243u);
        Object[] objArr = this.f123239q;
        if (objArr != null) {
            AbstractC25837c.m133231g(objArr, 0, this.f123243u);
        }
        this.f123246x = 0;
        this.f123243u = 0;
        m133240K();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (m133258w(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (m133259x(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m133276z();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof Map) || !m133255r((Map) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int m133258w = m133258w(obj);
        if (m133258w < 0) {
            return null;
        }
        Object[] objArr = this.f123239q;
        AbstractC19074t.m100205c(objArr);
        return objArr[m133258w];
    }

    @Override // java.util.Map
    public int hashCode() {
        b m133274v = m133274v();
        int i11 = 0;
        while (m133274v.hasNext()) {
            i11 += m133274v.m133284k();
        }
        return i11;
    }

    /* renamed from: i */
    public final int m133269i(Object obj) {
        int m116584g;
        m133271n();
        while (true) {
            int m133236E = m133236E(obj);
            m116584g = AbstractC22543l.m116584g(this.f123242t * 2, m133235A() / 2);
            int i11 = 0;
            while (true) {
                int i12 = this.f123241s[m133236E];
                if (i12 <= 0) {
                    if (this.f123243u >= m133275y()) {
                        m133257u(1);
                    } else {
                        int i13 = this.f123243u;
                        int i14 = i13 + 1;
                        this.f123243u = i14;
                        this.f123238p[i13] = obj;
                        this.f123240r[i13] = m133236E;
                        this.f123241s[m133236E] = i14;
                        this.f123246x = size() + 1;
                        m133240K();
                        if (i11 > this.f123242t) {
                            this.f123242t = i11;
                        }
                        return i13;
                    }
                } else {
                    if (AbstractC19074t.m100204b(this.f123238p[i12 - 1], obj)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > m116584g) {
                        m133241L(m133235A() * 2);
                        break;
                    }
                    int i15 = m133236E - 1;
                    if (m133236E == 0) {
                        m133236E = m133235A() - 1;
                    } else {
                        m133236E = i15;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m133260B();
    }

    /* renamed from: l */
    public final Map m133270l() {
        m133271n();
        this.f123237B = true;
        if (size() > 0) {
            return this;
        }
        C25838d c25838d = f123235D;
        AbstractC19074t.m100206d(c25838d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c25838d;
    }

    /* renamed from: n */
    public final void m133271n() {
        if (!this.f123237B) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p */
    public final boolean m133272p(Collection collection) {
        AbstractC19074t.m100208f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m133273q((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m133271n();
        int m133269i = m133269i(obj);
        Object[] m133253k = m133253k();
        if (m133269i < 0) {
            int i11 = (-m133269i) - 1;
            Object obj3 = m133253k[i11];
            m133253k[i11] = obj2;
            return obj3;
        }
        m133253k[m133269i] = obj2;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        AbstractC19074t.m100208f(map, "from");
        m133271n();
        m133237H(map.entrySet());
    }

    /* renamed from: q */
    public final boolean m133273q(Map.Entry entry) {
        AbstractC19074t.m100208f(entry, "entry");
        int m133258w = m133258w(entry.getKey());
        if (m133258w < 0) {
            return false;
        }
        Object[] objArr = this.f123239q;
        AbstractC19074t.m100205c(objArr);
        return AbstractC19074t.m100204b(objArr[m133258w], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        int m133266O = m133266O(obj);
        if (m133266O < 0) {
            return null;
        }
        Object[] objArr = this.f123239q;
        AbstractC19074t.m100205c(objArr);
        Object obj2 = objArr[m133266O];
        AbstractC25837c.m133230f(objArr, m133266O);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m133261C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b m133274v = m133274v();
        int i11 = 0;
        while (m133274v.hasNext()) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            m133274v.m133283j(sb2);
            i11++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: v */
    public final b m133274v() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m133262D();
    }

    /* renamed from: y */
    public final int m133275y() {
        return this.f123238p.length;
    }

    /* renamed from: z */
    public Set m133276z() {
        C25839e c25839e = this.f123236A;
        if (c25839e == null) {
            C25839e c25839e2 = new C25839e(this);
            this.f123236A = c25839e2;
            return c25839e2;
        }
        return c25839e;
    }

    public C25838d() {
        this(8);
    }

    public C25838d(int i11) {
        this(AbstractC25837c.m133228d(i11), null, new int[i11], new int[f123234C.m133279c(i11)], 2, 0);
    }
}
