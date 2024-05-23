package androidx.recyclerview.widget;

import androidx.core.util.C1485g;
import androidx.core.util.InterfaceC1484f;
import androidx.recyclerview.widget.C1927t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public class C1905a implements C1927t.a {

    /* renamed from: a */
    private InterfaceC1484f f7938a;

    /* renamed from: b */
    final ArrayList f7939b;

    /* renamed from: c */
    final ArrayList f7940c;

    /* renamed from: d */
    final a f7941d;

    /* renamed from: e */
    Runnable f7942e;

    /* renamed from: f */
    final boolean f7943f;

    /* renamed from: g */
    final C1927t f7944g;

    /* renamed from: h */
    private int f7945h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo9981a(int i11, int i12);

        /* renamed from: b */
        void mo9982b(b bVar);

        /* renamed from: c */
        void mo9983c(b bVar);

        /* renamed from: d */
        void mo9984d(int i11, int i12);

        /* renamed from: e */
        void mo9985e(int i11, int i12, Object obj);

        /* renamed from: f */
        RecyclerView.AbstractC1876c0 mo9986f(int i11);

        /* renamed from: g */
        void mo9987g(int i11, int i12);

        /* renamed from: h */
        void mo9988h(int i11, int i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        int f7946a;

        /* renamed from: b */
        int f7947b;

        /* renamed from: c */
        Object f7948c;

        /* renamed from: d */
        int f7949d;

        b(int i11, int i12, int i13, Object obj) {
            this.f7946a = i11;
            this.f7947b = i12;
            this.f7949d = i13;
            this.f7948c = obj;
        }

        /* renamed from: a */
        String m10393a() {
            int i11 = this.f7946a;
            return i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i11 = this.f7946a;
            if (i11 != bVar.f7946a) {
                return false;
            }
            if (i11 == 8 && Math.abs(this.f7949d - this.f7947b) == 1 && this.f7949d == bVar.f7947b && this.f7947b == bVar.f7949d) {
                return true;
            }
            if (this.f7949d != bVar.f7949d || this.f7947b != bVar.f7947b) {
                return false;
            }
            Object obj2 = this.f7948c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f7948c)) {
                    return false;
                }
            } else if (bVar.f7948c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f7946a * 31) + this.f7947b) * 31) + this.f7949d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m10393a() + ",s:" + this.f7947b + "c:" + this.f7949d + ",p:" + this.f7948c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1905a(a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m10367c(b bVar) {
        m10373v(bVar);
    }

    /* renamed from: d */
    private void m10368d(b bVar) {
        m10373v(bVar);
    }

    /* renamed from: f */
    private void m10369f(b bVar) {
        boolean z11;
        char c11;
        int i11 = bVar.f7947b;
        int i12 = bVar.f7949d + i11;
        char c12 = 65535;
        int i13 = i11;
        int i14 = 0;
        while (i13 < i12) {
            if (this.f7941d.mo9986f(i13) == null && !m10371h(i13)) {
                if (c12 == 1) {
                    m10373v(mo10375a(2, i11, i14, null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c11 = 0;
            } else {
                if (c12 == 0) {
                    m10372k(mo10375a(2, i11, i14, null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c11 = 1;
            }
            if (z11) {
                i13 -= i14;
                i12 -= i14;
                i14 = 1;
            } else {
                i14++;
            }
            i13++;
            c12 = c11;
        }
        if (i14 != bVar.f7949d) {
            mo10376b(bVar);
            bVar = mo10375a(2, i11, i14, null);
        }
        if (c12 == 0) {
            m10372k(bVar);
        } else {
            m10373v(bVar);
        }
    }

    /* renamed from: g */
    private void m10370g(b bVar) {
        int i11 = bVar.f7947b;
        int i12 = bVar.f7949d + i11;
        int i13 = i11;
        char c11 = 65535;
        int i14 = 0;
        while (i11 < i12) {
            if (this.f7941d.mo9986f(i11) == null && !m10371h(i11)) {
                if (c11 == 1) {
                    m10373v(mo10375a(4, i13, i14, bVar.f7948c));
                    i13 = i11;
                    i14 = 0;
                }
                c11 = 0;
            } else {
                if (c11 == 0) {
                    m10372k(mo10375a(4, i13, i14, bVar.f7948c));
                    i13 = i11;
                    i14 = 0;
                }
                c11 = 1;
            }
            i14++;
            i11++;
        }
        if (i14 != bVar.f7949d) {
            Object obj = bVar.f7948c;
            mo10376b(bVar);
            bVar = mo10375a(4, i13, i14, obj);
        }
        if (c11 == 0) {
            m10372k(bVar);
        } else {
            m10373v(bVar);
        }
    }

    /* renamed from: h */
    private boolean m10371h(int i11) {
        int size = this.f7940c.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) this.f7940c.get(i12);
            int i13 = bVar.f7946a;
            if (i13 == 8) {
                if (m10382n(bVar.f7949d, i12 + 1) == i11) {
                    return true;
                }
            } else if (i13 == 1) {
                int i14 = bVar.f7947b;
                int i15 = bVar.f7949d + i14;
                while (i14 < i15) {
                    if (m10382n(i14, i12 + 1) == i11) {
                        return true;
                    }
                    i14++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m10372k(b bVar) {
        int i11;
        int i12 = bVar.f7946a;
        if (i12 != 1 && i12 != 8) {
            int m10374z = m10374z(bVar.f7947b, i12);
            int i13 = bVar.f7947b;
            int i14 = bVar.f7946a;
            if (i14 != 2) {
                if (i14 == 4) {
                    i11 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i11 = 0;
            }
            int i15 = 1;
            for (int i16 = 1; i16 < bVar.f7949d; i16++) {
                int m10374z2 = m10374z(bVar.f7947b + (i11 * i16), bVar.f7946a);
                int i17 = bVar.f7946a;
                if (i17 == 2 ? m10374z2 == m10374z : !(i17 != 4 || m10374z2 != m10374z + 1)) {
                    i15++;
                } else {
                    b mo10375a = mo10375a(i17, m10374z, i15, bVar.f7948c);
                    m10380l(mo10375a, i13);
                    mo10376b(mo10375a);
                    if (bVar.f7946a == 4) {
                        i13 += i15;
                    }
                    m10374z = m10374z2;
                    i15 = 1;
                }
            }
            Object obj = bVar.f7948c;
            mo10376b(bVar);
            if (i15 > 0) {
                b mo10375a2 = mo10375a(bVar.f7946a, m10374z, i15, obj);
                m10380l(mo10375a2, i13);
                mo10376b(mo10375a2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: v */
    private void m10373v(b bVar) {
        this.f7940c.add(bVar);
        int i11 = bVar.f7946a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 == 8) {
                        this.f7941d.mo9981a(bVar.f7947b, bVar.f7949d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                this.f7941d.mo9985e(bVar.f7947b, bVar.f7949d, bVar.f7948c);
                return;
            }
            this.f7941d.mo9984d(bVar.f7947b, bVar.f7949d);
            return;
        }
        this.f7941d.mo9987g(bVar.f7947b, bVar.f7949d);
    }

    /* renamed from: z */
    private int m10374z(int i11, int i12) {
        int i13;
        int i14;
        for (int size = this.f7940c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f7940c.get(size);
            int i15 = bVar.f7946a;
            if (i15 == 8) {
                int i16 = bVar.f7947b;
                int i17 = bVar.f7949d;
                if (i16 < i17) {
                    i14 = i16;
                    i13 = i17;
                } else {
                    i13 = i16;
                    i14 = i17;
                }
                if (i11 >= i14 && i11 <= i13) {
                    if (i14 == i16) {
                        if (i12 == 1) {
                            bVar.f7949d = i17 + 1;
                        } else if (i12 == 2) {
                            bVar.f7949d = i17 - 1;
                        }
                        i11++;
                    } else {
                        if (i12 == 1) {
                            bVar.f7947b = i16 + 1;
                        } else if (i12 == 2) {
                            bVar.f7947b = i16 - 1;
                        }
                        i11--;
                    }
                } else if (i11 < i16) {
                    if (i12 == 1) {
                        bVar.f7947b = i16 + 1;
                        bVar.f7949d = i17 + 1;
                    } else if (i12 == 2) {
                        bVar.f7947b = i16 - 1;
                        bVar.f7949d = i17 - 1;
                    }
                }
            } else {
                int i18 = bVar.f7947b;
                if (i18 <= i11) {
                    if (i15 == 1) {
                        i11 -= bVar.f7949d;
                    } else if (i15 == 2) {
                        i11 += bVar.f7949d;
                    }
                } else if (i12 == 1) {
                    bVar.f7947b = i18 + 1;
                } else if (i12 == 2) {
                    bVar.f7947b = i18 - 1;
                }
            }
        }
        for (int size2 = this.f7940c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f7940c.get(size2);
            if (bVar2.f7946a == 8) {
                int i19 = bVar2.f7949d;
                if (i19 == bVar2.f7947b || i19 < 0) {
                    this.f7940c.remove(size2);
                    mo10376b(bVar2);
                }
            } else if (bVar2.f7949d <= 0) {
                this.f7940c.remove(size2);
                mo10376b(bVar2);
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.C1927t.a
    /* renamed from: a */
    public b mo10375a(int i11, int i12, int i13, Object obj) {
        b bVar = (b) this.f7938a.mo7484b();
        if (bVar == null) {
            return new b(i11, i12, i13, obj);
        }
        bVar.f7946a = i11;
        bVar.f7947b = i12;
        bVar.f7949d = i13;
        bVar.f7948c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.C1927t.a
    /* renamed from: b */
    public void mo10376b(b bVar) {
        if (!this.f7943f) {
            bVar.f7948c = null;
            this.f7938a.mo7483a(bVar);
        }
    }

    /* renamed from: e */
    public int m10377e(int i11) {
        int size = this.f7939b.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) this.f7939b.get(i12);
            int i13 = bVar.f7946a;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 8) {
                        int i14 = bVar.f7947b;
                        if (i14 == i11) {
                            i11 = bVar.f7949d;
                        } else {
                            if (i14 < i11) {
                                i11--;
                            }
                            if (bVar.f7949d <= i11) {
                                i11++;
                            }
                        }
                    }
                } else {
                    int i15 = bVar.f7947b;
                    if (i15 <= i11) {
                        int i16 = bVar.f7949d;
                        if (i15 + i16 > i11) {
                            return -1;
                        }
                        i11 -= i16;
                    } else {
                        continue;
                    }
                }
            } else if (bVar.f7947b <= i11) {
                i11 += bVar.f7949d;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m10378i() {
        int size = this.f7940c.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f7941d.mo9983c((b) this.f7940c.get(i11));
        }
        m10391x(this.f7940c);
        this.f7945h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m10379j() {
        m10378i();
        int size = this.f7939b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f7939b.get(i11);
            int i12 = bVar.f7946a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 == 8) {
                            this.f7941d.mo9983c(bVar);
                            this.f7941d.mo9981a(bVar.f7947b, bVar.f7949d);
                        }
                    } else {
                        this.f7941d.mo9983c(bVar);
                        this.f7941d.mo9985e(bVar.f7947b, bVar.f7949d, bVar.f7948c);
                    }
                } else {
                    this.f7941d.mo9983c(bVar);
                    this.f7941d.mo9988h(bVar.f7947b, bVar.f7949d);
                }
            } else {
                this.f7941d.mo9983c(bVar);
                this.f7941d.mo9987g(bVar.f7947b, bVar.f7949d);
            }
            Runnable runnable = this.f7942e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m10391x(this.f7939b);
        this.f7945h = 0;
    }

    /* renamed from: l */
    void m10380l(b bVar, int i11) {
        this.f7941d.mo9982b(bVar);
        int i12 = bVar.f7946a;
        if (i12 != 2) {
            if (i12 == 4) {
                this.f7941d.mo9985e(i11, bVar.f7949d, bVar.f7948c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.f7941d.mo9988h(i11, bVar.f7949d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m10381m(int i11) {
        return m10382n(i11, 0);
    }

    /* renamed from: n */
    int m10382n(int i11, int i12) {
        int size = this.f7940c.size();
        while (i12 < size) {
            b bVar = (b) this.f7940c.get(i12);
            int i13 = bVar.f7946a;
            if (i13 == 8) {
                int i14 = bVar.f7947b;
                if (i14 == i11) {
                    i11 = bVar.f7949d;
                } else {
                    if (i14 < i11) {
                        i11--;
                    }
                    if (bVar.f7949d <= i11) {
                        i11++;
                    }
                }
            } else {
                int i15 = bVar.f7947b;
                if (i15 > i11) {
                    continue;
                } else if (i13 == 2) {
                    int i16 = bVar.f7949d;
                    if (i11 < i15 + i16) {
                        return -1;
                    }
                    i11 -= i16;
                } else if (i13 == 1) {
                    i11 += bVar.f7949d;
                }
            }
            i12++;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m10383o(int i11) {
        return (i11 & this.f7945h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m10384p() {
        if (this.f7939b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m10385q() {
        if (!this.f7940c.isEmpty() && !this.f7939b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m10386r(int i11, int i12, Object obj) {
        if (i12 < 1) {
            return false;
        }
        this.f7939b.add(mo10375a(4, i11, i12, obj));
        this.f7945h |= 4;
        if (this.f7939b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m10387s(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f7939b.add(mo10375a(1, i11, i12, null));
        this.f7945h |= 1;
        if (this.f7939b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m10388t(int i11, int i12, int i13) {
        if (i11 == i12) {
            return false;
        }
        if (i13 == 1) {
            this.f7939b.add(mo10375a(8, i11, i12, null));
            this.f7945h |= 8;
            if (this.f7939b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m10389u(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f7939b.add(mo10375a(2, i11, i12, null));
        this.f7945h |= 2;
        if (this.f7939b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m10390w() {
        this.f7944g.m10640b(this.f7939b);
        int size = this.f7939b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f7939b.get(i11);
            int i12 = bVar.f7946a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 == 8) {
                            m10368d(bVar);
                        }
                    } else {
                        m10370g(bVar);
                    }
                } else {
                    m10369f(bVar);
                }
            } else {
                m10367c(bVar);
            }
            Runnable runnable = this.f7942e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f7939b.clear();
    }

    /* renamed from: x */
    void m10391x(List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            mo10376b((b) list.get(i11));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m10392y() {
        m10391x(this.f7939b);
        m10391x(this.f7940c);
        this.f7945h = 0;
    }

    C1905a(a aVar, boolean z11) {
        this.f7938a = new C1485g(30);
        this.f7939b = new ArrayList();
        this.f7940c = new ArrayList();
        this.f7945h = 0;
        this.f7941d = aVar;
        this.f7943f = z11;
        this.f7944g = new C1927t(this);
    }
}
