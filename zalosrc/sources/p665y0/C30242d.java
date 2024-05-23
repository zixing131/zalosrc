package p665y0;

/* renamed from: y0.d */
/* loaded from: classes.dex */
public class C30242d implements Cloneable {

    /* renamed from: t */
    private static final Object f140460t = new Object();

    /* renamed from: p */
    private boolean f140461p;

    /* renamed from: q */
    private long[] f140462q;

    /* renamed from: r */
    private Object[] f140463r;

    /* renamed from: s */
    private int f140464s;

    public C30242d() {
        this(10);
    }

    /* renamed from: e */
    private void m149124e() {
        int i11 = this.f140464s;
        long[] jArr = this.f140462q;
        Object[] objArr = this.f140463r;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f140460t) {
                if (i13 != i12) {
                    jArr[i12] = jArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        this.f140461p = false;
        this.f140464s = i12;
    }

    /* renamed from: a */
    public void m149125a(long j11, Object obj) {
        int i11 = this.f140464s;
        if (i11 != 0 && j11 <= this.f140462q[i11 - 1]) {
            m149132j(j11, obj);
            return;
        }
        if (this.f140461p && i11 >= this.f140462q.length) {
            m149124e();
        }
        int i12 = this.f140464s;
        if (i12 >= this.f140462q.length) {
            int m149123f = AbstractC30241c.m149123f(i12 + 1);
            long[] jArr = new long[m149123f];
            Object[] objArr = new Object[m149123f];
            long[] jArr2 = this.f140462q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f140463r;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f140462q = jArr;
            this.f140463r = objArr;
        }
        this.f140462q[i12] = j11;
        this.f140463r[i12] = obj;
        this.f140464s = i12 + 1;
    }

    /* renamed from: b */
    public void m149126b() {
        int i11 = this.f140464s;
        Object[] objArr = this.f140463r;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f140464s = 0;
        this.f140461p = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C30242d clone() {
        try {
            C30242d c30242d = (C30242d) super.clone();
            c30242d.f140462q = (long[]) this.f140462q.clone();
            c30242d.f140463r = (Object[]) this.f140463r.clone();
            return c30242d;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    /* renamed from: f */
    public Object m149128f(long j11) {
        return m149129g(j11, null);
    }

    /* renamed from: g */
    public Object m149129g(long j11, Object obj) {
        Object obj2;
        int m149119b = AbstractC30241c.m149119b(this.f140462q, this.f140464s, j11);
        if (m149119b >= 0 && (obj2 = this.f140463r[m149119b]) != f140460t) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: h */
    public int m149130h(long j11) {
        if (this.f140461p) {
            m149124e();
        }
        return AbstractC30241c.m149119b(this.f140462q, this.f140464s, j11);
    }

    /* renamed from: i */
    public long m149131i(int i11) {
        if (this.f140461p) {
            m149124e();
        }
        return this.f140462q[i11];
    }

    /* renamed from: j */
    public void m149132j(long j11, Object obj) {
        int m149119b = AbstractC30241c.m149119b(this.f140462q, this.f140464s, j11);
        if (m149119b >= 0) {
            this.f140463r[m149119b] = obj;
            return;
        }
        int i11 = ~m149119b;
        int i12 = this.f140464s;
        if (i11 < i12) {
            Object[] objArr = this.f140463r;
            if (objArr[i11] == f140460t) {
                this.f140462q[i11] = j11;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f140461p && i12 >= this.f140462q.length) {
            m149124e();
            i11 = ~AbstractC30241c.m149119b(this.f140462q, this.f140464s, j11);
        }
        int i13 = this.f140464s;
        if (i13 >= this.f140462q.length) {
            int m149123f = AbstractC30241c.m149123f(i13 + 1);
            long[] jArr = new long[m149123f];
            Object[] objArr2 = new Object[m149123f];
            long[] jArr2 = this.f140462q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f140463r;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f140462q = jArr;
            this.f140463r = objArr2;
        }
        int i14 = this.f140464s;
        if (i14 - i11 != 0) {
            long[] jArr3 = this.f140462q;
            int i15 = i11 + 1;
            System.arraycopy(jArr3, i11, jArr3, i15, i14 - i11);
            Object[] objArr4 = this.f140463r;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f140464s - i11);
        }
        this.f140462q[i11] = j11;
        this.f140463r[i11] = obj;
        this.f140464s++;
    }

    /* renamed from: k */
    public void m149133k(long j11) {
        int m149119b = AbstractC30241c.m149119b(this.f140462q, this.f140464s, j11);
        if (m149119b >= 0) {
            Object[] objArr = this.f140463r;
            Object obj = objArr[m149119b];
            Object obj2 = f140460t;
            if (obj != obj2) {
                objArr[m149119b] = obj2;
                this.f140461p = true;
            }
        }
    }

    /* renamed from: l */
    public void m149134l(int i11) {
        Object[] objArr = this.f140463r;
        Object obj = objArr[i11];
        Object obj2 = f140460t;
        if (obj != obj2) {
            objArr[i11] = obj2;
            this.f140461p = true;
        }
    }

    /* renamed from: m */
    public int m149135m() {
        if (this.f140461p) {
            m149124e();
        }
        return this.f140464s;
    }

    /* renamed from: n */
    public Object m149136n(int i11) {
        if (this.f140461p) {
            m149124e();
        }
        return this.f140463r[i11];
    }

    public String toString() {
        if (m149135m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f140464s * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f140464s; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m149131i(i11));
            sb2.append('=');
            Object m149136n = m149136n(i11);
            if (m149136n != this) {
                sb2.append(m149136n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C30242d(int i11) {
        this.f140461p = false;
        if (i11 == 0) {
            this.f140462q = AbstractC30241c.f140458b;
            this.f140463r = AbstractC30241c.f140459c;
        } else {
            int m149123f = AbstractC30241c.m149123f(i11);
            this.f140462q = new long[m149123f];
            this.f140463r = new Object[m149123f];
        }
    }
}
