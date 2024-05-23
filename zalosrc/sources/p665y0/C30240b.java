package p665y0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: y0.b */
/* loaded from: classes2.dex */
public final class C30240b implements Collection, Set {

    /* renamed from: t */
    private static final int[] f140446t = new int[0];

    /* renamed from: u */
    private static final Object[] f140447u = new Object[0];

    /* renamed from: v */
    private static Object[] f140448v;

    /* renamed from: w */
    private static int f140449w;

    /* renamed from: x */
    private static Object[] f140450x;

    /* renamed from: y */
    private static int f140451y;

    /* renamed from: p */
    private int[] f140452p;

    /* renamed from: q */
    Object[] f140453q;

    /* renamed from: r */
    int f140454r;

    /* renamed from: s */
    private AbstractC30244f f140455s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0.b$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC30244f {
        a() {
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: a */
        protected void mo149099a() {
            C30240b.this.clear();
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: b */
        protected Object mo149100b(int i11, int i12) {
            return C30240b.this.f140453q[i11];
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: c */
        protected Map mo149101c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: d */
        protected int mo149102d() {
            return C30240b.this.f140454r;
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: e */
        protected int mo149103e(Object obj) {
            return C30240b.this.indexOf(obj);
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: f */
        protected int mo149104f(Object obj) {
            return C30240b.this.indexOf(obj);
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: g */
        protected void mo149105g(Object obj, Object obj2) {
            C30240b.this.add(obj);
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: h */
        protected void mo149106h(int i11) {
            C30240b.this.m149116p(i11);
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: i */
        protected Object mo149107i(int i11, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C30240b() {
        this(0);
    }

    /* renamed from: e */
    private void m149108e(int i11) {
        if (i11 == 8) {
            synchronized (C30240b.class) {
                try {
                    Object[] objArr = f140450x;
                    if (objArr != null) {
                        this.f140453q = objArr;
                        f140450x = (Object[]) objArr[0];
                        this.f140452p = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f140451y--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i11 == 4) {
            synchronized (C30240b.class) {
                try {
                    Object[] objArr2 = f140448v;
                    if (objArr2 != null) {
                        this.f140453q = objArr2;
                        f140448v = (Object[]) objArr2[0];
                        this.f140452p = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f140449w--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f140452p = new int[i11];
        this.f140453q = new Object[i11];
    }

    /* renamed from: j */
    private static void m149109j(int[] iArr, Object[] objArr, int i11) {
        if (iArr.length == 8) {
            synchronized (C30240b.class) {
                try {
                    if (f140451y < 10) {
                        objArr[0] = f140450x;
                        objArr[1] = iArr;
                        for (int i12 = i11 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f140450x = objArr;
                        f140451y++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C30240b.class) {
                try {
                    if (f140449w < 10) {
                        objArr[0] = f140448v;
                        objArr[1] = iArr;
                        for (int i13 = i11 - 1; i13 >= 2; i13--) {
                            objArr[i13] = null;
                        }
                        f140448v = objArr;
                        f140449w++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: k */
    private AbstractC30244f m149110k() {
        if (this.f140455s == null) {
            this.f140455s = new a();
        }
        return this.f140455s;
    }

    /* renamed from: l */
    private int m149111l(Object obj, int i11) {
        int i12 = this.f140454r;
        if (i12 == 0) {
            return -1;
        }
        int m149118a = AbstractC30241c.m149118a(this.f140452p, i12, i11);
        if (m149118a < 0) {
            return m149118a;
        }
        if (obj.equals(this.f140453q[m149118a])) {
            return m149118a;
        }
        int i13 = m149118a + 1;
        while (i13 < i12 && this.f140452p[i13] == i11) {
            if (obj.equals(this.f140453q[i13])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = m149118a - 1; i14 >= 0 && this.f140452p[i14] == i11; i14--) {
            if (obj.equals(this.f140453q[i14])) {
                return i14;
            }
        }
        return ~i13;
    }

    /* renamed from: m */
    private int m149112m() {
        int i11 = this.f140454r;
        if (i11 == 0) {
            return -1;
        }
        int m149118a = AbstractC30241c.m149118a(this.f140452p, i11, 0);
        if (m149118a < 0) {
            return m149118a;
        }
        if (this.f140453q[m149118a] == null) {
            return m149118a;
        }
        int i12 = m149118a + 1;
        while (i12 < i11 && this.f140452p[i12] == 0) {
            if (this.f140453q[i12] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m149118a - 1; i13 >= 0 && this.f140452p[i13] == 0; i13--) {
            if (this.f140453q[i13] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i11;
        int m149111l;
        if (obj == null) {
            m149111l = m149112m();
            i11 = 0;
        } else {
            int hashCode = obj.hashCode();
            i11 = hashCode;
            m149111l = m149111l(obj, hashCode);
        }
        if (m149111l >= 0) {
            return false;
        }
        int i12 = ~m149111l;
        int i13 = this.f140454r;
        int[] iArr = this.f140452p;
        if (i13 >= iArr.length) {
            int i14 = 8;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 < 4) {
                i14 = 4;
            }
            Object[] objArr = this.f140453q;
            m149108e(i14);
            int[] iArr2 = this.f140452p;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f140453q, 0, objArr.length);
            }
            m149109j(iArr, objArr, this.f140454r);
        }
        int i15 = this.f140454r;
        if (i12 < i15) {
            int[] iArr3 = this.f140452p;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f140453q;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f140454r - i12);
        }
        this.f140452p[i12] = i11;
        this.f140453q[i12] = obj;
        this.f140454r++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        m149114g(this.f140454r + collection.size());
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= add(it.next());
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i11 = this.f140454r;
        if (i11 != 0) {
            m149109j(this.f140452p, this.f140453q, i11);
            this.f140452p = f140446t;
            this.f140453q = f140447u;
            this.f140454r = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void m149113d(C30240b c30240b) {
        int i11 = c30240b.f140454r;
        m149114g(this.f140454r + i11);
        if (this.f140454r == 0) {
            if (i11 > 0) {
                System.arraycopy(c30240b.f140452p, 0, this.f140452p, 0, i11);
                System.arraycopy(c30240b.f140453q, 0, this.f140453q, 0, i11);
                this.f140454r = i11;
                return;
            }
            return;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            add(c30240b.m149117r(i12));
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f140454r; i11++) {
                try {
                    if (!set.contains(m149117r(i11))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m149114g(int i11) {
        int[] iArr = this.f140452p;
        if (iArr.length < i11) {
            Object[] objArr = this.f140453q;
            m149108e(i11);
            int i12 = this.f140454r;
            if (i12 > 0) {
                System.arraycopy(iArr, 0, this.f140452p, 0, i12);
                System.arraycopy(objArr, 0, this.f140453q, 0, this.f140454r);
            }
            m149109j(iArr, objArr, this.f140454r);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f140452p;
        int i11 = this.f140454r;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += iArr[i13];
        }
        return i12;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return m149112m();
        }
        return m149111l(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f140454r <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return m149110k().m149149m().iterator();
    }

    /* renamed from: n */
    public boolean m149115n(C30240b c30240b) {
        int i11 = c30240b.f140454r;
        int i12 = this.f140454r;
        for (int i13 = 0; i13 < i11; i13++) {
            remove(c30240b.m149117r(i13));
        }
        if (i12 == this.f140454r) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public Object m149116p(int i11) {
        Object[] objArr = this.f140453q;
        Object obj = objArr[i11];
        int i12 = this.f140454r;
        if (i12 <= 1) {
            m149109j(this.f140452p, objArr, i12);
            this.f140452p = f140446t;
            this.f140453q = f140447u;
            this.f140454r = 0;
        } else {
            int[] iArr = this.f140452p;
            int i13 = 8;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                if (i12 > 8) {
                    i13 = i12 + (i12 >> 1);
                }
                m149108e(i13);
                this.f140454r--;
                if (i11 > 0) {
                    System.arraycopy(iArr, 0, this.f140452p, 0, i11);
                    System.arraycopy(objArr, 0, this.f140453q, 0, i11);
                }
                int i14 = this.f140454r;
                if (i11 < i14) {
                    int i15 = i11 + 1;
                    System.arraycopy(iArr, i15, this.f140452p, i11, i14 - i11);
                    System.arraycopy(objArr, i15, this.f140453q, i11, this.f140454r - i11);
                }
            } else {
                int i16 = i12 - 1;
                this.f140454r = i16;
                if (i11 < i16) {
                    int i17 = i11 + 1;
                    System.arraycopy(iArr, i17, iArr, i11, i16 - i11);
                    Object[] objArr2 = this.f140453q;
                    System.arraycopy(objArr2, i17, objArr2, i11, this.f140454r - i11);
                }
                this.f140453q[this.f140454r] = null;
            }
        }
        return obj;
    }

    /* renamed from: r */
    public Object m149117r(int i11) {
        return this.f140453q[i11];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m149116p(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= remove(it.next());
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z11 = false;
        for (int i11 = this.f140454r - 1; i11 >= 0; i11--) {
            if (!collection.contains(this.f140453q[i11])) {
                m149116p(i11);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f140454r;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i11 = this.f140454r;
        Object[] objArr = new Object[i11];
        System.arraycopy(this.f140453q, 0, objArr, 0, i11);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f140454r * 14);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f140454r; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object m149117r = m149117r(i11);
            if (m149117r != this) {
                sb2.append(m149117r);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C30240b(int i11) {
        if (i11 == 0) {
            this.f140452p = f140446t;
            this.f140453q = f140447u;
        } else {
            m149108e(i11);
        }
        this.f140454r = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f140454r) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f140454r);
        }
        System.arraycopy(this.f140453q, 0, objArr, 0, this.f140454r);
        int length = objArr.length;
        int i11 = this.f140454r;
        if (length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }

    public C30240b(C30240b c30240b) {
        this();
        if (c30240b != null) {
            m149113d(c30240b);
        }
    }
}
