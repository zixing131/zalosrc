package p603wa;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wa.b */
/* loaded from: classes3.dex */
public final class C28860b {

    /* renamed from: a */
    private final C28859a f133676a;

    /* renamed from: b */
    private final int[] f133677b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28860b(C28859a c28859a, int[] iArr) {
        if (iArr.length != 0) {
            this.f133676a = c28859a;
            int length = iArr.length;
            int i11 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i11 < length && iArr[i11] == 0) {
                    i11++;
                }
                if (i11 == length) {
                    this.f133677b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i11];
                this.f133677b = iArr2;
                System.arraycopy(iArr, i11, iArr2, 0, iArr2.length);
                return;
            }
            this.f133677b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    C28860b m144292a(C28860b c28860b) {
        if (this.f133676a.equals(c28860b.f133676a)) {
            if (m144297f()) {
                return c28860b;
            }
            if (c28860b.m144297f()) {
                return this;
            }
            int[] iArr = this.f133677b;
            int[] iArr2 = c28860b.f133677b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i11 = length; i11 < iArr.length; i11++) {
                iArr3[i11] = C28859a.m144284a(iArr2[i11 - length], iArr[i11]);
            }
            return new C28860b(this.f133676a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C28860b[] m144293b(C28860b c28860b) {
        if (this.f133676a.equals(c28860b.f133676a)) {
            if (!c28860b.m144297f()) {
                C28860b m144288e = this.f133676a.m144288e();
                int m144289f = this.f133676a.m144289f(c28860b.m144294c(c28860b.m144296e()));
                C28860b c28860b2 = this;
                while (c28860b2.m144296e() >= c28860b.m144296e() && !c28860b2.m144297f()) {
                    int m144296e = c28860b2.m144296e() - c28860b.m144296e();
                    int m144291h = this.f133676a.m144291h(c28860b2.m144294c(c28860b2.m144296e()), m144289f);
                    C28860b m144299h = c28860b.m144299h(m144296e, m144291h);
                    m144288e = m144288e.m144292a(this.f133676a.m144285b(m144296e, m144291h));
                    c28860b2 = c28860b2.m144292a(m144299h);
                }
                return new C28860b[]{m144288e, c28860b2};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: c */
    int m144294c(int i11) {
        return this.f133677b[(r0.length - 1) - i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int[] m144295d() {
        return this.f133677b;
    }

    /* renamed from: e */
    int m144296e() {
        return this.f133677b.length - 1;
    }

    /* renamed from: f */
    boolean m144297f() {
        if (this.f133677b[0] != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C28860b m144298g(C28860b c28860b) {
        if (this.f133676a.equals(c28860b.f133676a)) {
            if (!m144297f() && !c28860b.m144297f()) {
                int[] iArr = this.f133677b;
                int length = iArr.length;
                int[] iArr2 = c28860b.f133677b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = iArr[i11];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = i11 + i13;
                        iArr3[i14] = C28859a.m144284a(iArr3[i14], this.f133676a.m144291h(i12, iArr2[i13]));
                    }
                }
                return new C28860b(this.f133676a, iArr3);
            }
            return this.f133676a.m144288e();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C28860b m144299h(int i11, int i12) {
        if (i11 >= 0) {
            if (i12 == 0) {
                return this.f133676a.m144288e();
            }
            int length = this.f133677b.length;
            int[] iArr = new int[i11 + length];
            for (int i13 = 0; i13 < length; i13++) {
                iArr[i13] = this.f133676a.m144291h(this.f133677b[i13], i12);
            }
            return new C28860b(this.f133676a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        if (m144297f()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(m144296e() * 8);
        for (int m144296e = m144296e(); m144296e >= 0; m144296e--) {
            int m144294c = m144294c(m144296e);
            if (m144294c != 0) {
                if (m144294c < 0) {
                    if (m144296e == m144296e()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    m144294c = -m144294c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m144296e == 0 || m144294c != 1) {
                    int m144290g = this.f133676a.m144290g(m144294c);
                    if (m144290g == 0) {
                        sb2.append('1');
                    } else if (m144290g == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(m144290g);
                    }
                }
                if (m144296e != 0) {
                    if (m144296e == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m144296e);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
