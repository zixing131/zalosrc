package p665y0;

/* renamed from: y0.h */
/* loaded from: classes2.dex */
public class C30246h implements Cloneable {

    /* renamed from: t */
    private static final Object f140495t = new Object();

    /* renamed from: p */
    private boolean f140496p;

    /* renamed from: q */
    private int[] f140497q;

    /* renamed from: r */
    private Object[] f140498r;

    /* renamed from: s */
    private int f140499s;

    public C30246h() {
        this(10);
    }

    /* renamed from: e */
    private void m149168e() {
        int i11 = this.f140499s;
        int[] iArr = this.f140497q;
        Object[] objArr = this.f140498r;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f140495t) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        this.f140496p = false;
        this.f140499s = i12;
    }

    /* renamed from: a */
    public void m149169a(int i11, Object obj) {
        int i12 = this.f140499s;
        if (i12 != 0 && i11 <= this.f140497q[i12 - 1]) {
            m149177k(i11, obj);
            return;
        }
        if (this.f140496p && i12 >= this.f140497q.length) {
            m149168e();
        }
        int i13 = this.f140499s;
        if (i13 >= this.f140497q.length) {
            int m149122e = AbstractC30241c.m149122e(i13 + 1);
            int[] iArr = new int[m149122e];
            Object[] objArr = new Object[m149122e];
            int[] iArr2 = this.f140497q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f140498r;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f140497q = iArr;
            this.f140498r = objArr;
        }
        this.f140497q[i13] = i11;
        this.f140498r[i13] = obj;
        this.f140499s = i13 + 1;
    }

    /* renamed from: b */
    public void m149170b() {
        int i11 = this.f140499s;
        Object[] objArr = this.f140498r;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f140499s = 0;
        this.f140496p = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C30246h clone() {
        try {
            C30246h c30246h = (C30246h) super.clone();
            c30246h.f140497q = (int[]) this.f140497q.clone();
            c30246h.f140498r = (Object[]) this.f140498r.clone();
            return c30246h;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    /* renamed from: f */
    public Object m149172f(int i11) {
        return m149173g(i11, null);
    }

    /* renamed from: g */
    public Object m149173g(int i11, Object obj) {
        Object obj2;
        int m149118a = AbstractC30241c.m149118a(this.f140497q, this.f140499s, i11);
        if (m149118a >= 0 && (obj2 = this.f140498r[m149118a]) != f140495t) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: h */
    public int m149174h(int i11) {
        if (this.f140496p) {
            m149168e();
        }
        return AbstractC30241c.m149118a(this.f140497q, this.f140499s, i11);
    }

    /* renamed from: i */
    public int m149175i(Object obj) {
        if (this.f140496p) {
            m149168e();
        }
        for (int i11 = 0; i11 < this.f140499s; i11++) {
            if (this.f140498r[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public int m149176j(int i11) {
        if (this.f140496p) {
            m149168e();
        }
        return this.f140497q[i11];
    }

    /* renamed from: k */
    public void m149177k(int i11, Object obj) {
        int m149118a = AbstractC30241c.m149118a(this.f140497q, this.f140499s, i11);
        if (m149118a >= 0) {
            this.f140498r[m149118a] = obj;
            return;
        }
        int i12 = ~m149118a;
        int i13 = this.f140499s;
        if (i12 < i13) {
            Object[] objArr = this.f140498r;
            if (objArr[i12] == f140495t) {
                this.f140497q[i12] = i11;
                objArr[i12] = obj;
                return;
            }
        }
        if (this.f140496p && i13 >= this.f140497q.length) {
            m149168e();
            i12 = ~AbstractC30241c.m149118a(this.f140497q, this.f140499s, i11);
        }
        int i14 = this.f140499s;
        if (i14 >= this.f140497q.length) {
            int m149122e = AbstractC30241c.m149122e(i14 + 1);
            int[] iArr = new int[m149122e];
            Object[] objArr2 = new Object[m149122e];
            int[] iArr2 = this.f140497q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f140498r;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f140497q = iArr;
            this.f140498r = objArr2;
        }
        int i15 = this.f140499s;
        if (i15 - i12 != 0) {
            int[] iArr3 = this.f140497q;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr4 = this.f140498r;
            System.arraycopy(objArr4, i12, objArr4, i16, this.f140499s - i12);
        }
        this.f140497q[i12] = i11;
        this.f140498r[i12] = obj;
        this.f140499s++;
    }

    /* renamed from: l */
    public void m149178l(int i11) {
        int m149118a = AbstractC30241c.m149118a(this.f140497q, this.f140499s, i11);
        if (m149118a >= 0) {
            Object[] objArr = this.f140498r;
            Object obj = objArr[m149118a];
            Object obj2 = f140495t;
            if (obj != obj2) {
                objArr[m149118a] = obj2;
                this.f140496p = true;
            }
        }
    }

    /* renamed from: m */
    public int m149179m() {
        if (this.f140496p) {
            m149168e();
        }
        return this.f140499s;
    }

    /* renamed from: n */
    public Object m149180n(int i11) {
        if (this.f140496p) {
            m149168e();
        }
        return this.f140498r[i11];
    }

    public String toString() {
        if (m149179m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f140499s * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f140499s; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m149176j(i11));
            sb2.append('=');
            Object m149180n = m149180n(i11);
            if (m149180n != this) {
                sb2.append(m149180n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C30246h(int i11) {
        this.f140496p = false;
        if (i11 == 0) {
            this.f140497q = AbstractC30241c.f140457a;
            this.f140498r = AbstractC30241c.f140459c;
        } else {
            int m149122e = AbstractC30241c.m149122e(i11);
            this.f140497q = new int[m149122e];
            this.f140498r = new Object[m149122e];
        }
    }
}
