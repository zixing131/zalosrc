package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes2.dex */
public abstract class AbstractC1915h {

    /* renamed from: a */
    private static final Comparator f8056a = new a();

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes2.dex */
    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            int i11 = gVar.f8071a - gVar2.f8071a;
            if (i11 == 0) {
                return gVar.f8072b - gVar2.f8072b;
            }
            return i11;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        /* renamed from: a */
        public abstract boolean mo421a(int i11, int i12);

        /* renamed from: b */
        public abstract boolean mo422b(int i11, int i12);

        /* renamed from: c */
        public Object mo423c(int i11, int i12) {
            return null;
        }

        /* renamed from: d */
        public abstract int mo424d();

        /* renamed from: e */
        public abstract int mo425e();
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        private final List f8057a;

        /* renamed from: b */
        private final int[] f8058b;

        /* renamed from: c */
        private final int[] f8059c;

        /* renamed from: d */
        private final b f8060d;

        /* renamed from: e */
        private final int f8061e;

        /* renamed from: f */
        private final int f8062f;

        /* renamed from: g */
        private final boolean f8063g;

        c(b bVar, List list, int[] iArr, int[] iArr2, boolean z11) {
            this.f8057a = list;
            this.f8058b = iArr;
            this.f8059c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f8060d = bVar;
            this.f8061e = bVar.mo425e();
            this.f8062f = bVar.mo424d();
            this.f8063g = z11;
            m10496a();
            m10501h();
        }

        /* renamed from: a */
        private void m10496a() {
            g gVar;
            if (this.f8057a.isEmpty()) {
                gVar = null;
            } else {
                gVar = (g) this.f8057a.get(0);
            }
            if (gVar == null || gVar.f8071a != 0 || gVar.f8072b != 0) {
                g gVar2 = new g();
                gVar2.f8071a = 0;
                gVar2.f8072b = 0;
                gVar2.f8074d = false;
                gVar2.f8073c = 0;
                gVar2.f8075e = false;
                this.f8057a.add(0, gVar2);
            }
        }

        /* renamed from: b */
        private void m10497b(List list, InterfaceC1926s interfaceC1926s, int i11, int i12, int i13) {
            if (!this.f8063g) {
                interfaceC1926s.mo10406a(i11, i12);
                return;
            }
            for (int i14 = i12 - 1; i14 >= 0; i14--) {
                int i15 = i13 + i14;
                int i16 = this.f8059c[i15];
                int i17 = i16 & 31;
                if (i17 != 0) {
                    if (i17 != 4 && i17 != 8) {
                        if (i17 == 16) {
                            list.add(new e(i15, i11, false));
                        } else {
                            throw new IllegalStateException("unknown flag for pos " + i15 + " " + Long.toBinaryString(i17));
                        }
                    } else {
                        int i18 = i16 >> 5;
                        interfaceC1926s.mo10409d(m10503j(list, i18, true).f8065b, i11);
                        if (i17 == 4) {
                            interfaceC1926s.mo10408c(i11, 1, this.f8060d.mo423c(i18, i15));
                        }
                    }
                } else {
                    interfaceC1926s.mo10406a(i11, 1);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).f8065b++;
                    }
                }
            }
        }

        /* renamed from: c */
        private void m10498c(List list, InterfaceC1926s interfaceC1926s, int i11, int i12, int i13) {
            if (!this.f8063g) {
                interfaceC1926s.mo10407b(i11, i12);
                return;
            }
            for (int i14 = i12 - 1; i14 >= 0; i14--) {
                int i15 = i13 + i14;
                int i16 = this.f8058b[i15];
                int i17 = i16 & 31;
                if (i17 != 0) {
                    if (i17 != 4 && i17 != 8) {
                        if (i17 == 16) {
                            list.add(new e(i15, i11 + i14, true));
                        } else {
                            throw new IllegalStateException("unknown flag for pos " + i15 + " " + Long.toBinaryString(i17));
                        }
                    } else {
                        int i18 = i16 >> 5;
                        e m10503j = m10503j(list, i18, false);
                        interfaceC1926s.mo10409d(i11 + i14, m10503j.f8065b - 1);
                        if (i17 == 4) {
                            interfaceC1926s.mo10408c(m10503j.f8065b - 1, 1, this.f8060d.mo423c(i15, i18));
                        }
                    }
                } else {
                    interfaceC1926s.mo10407b(i11 + i14, 1);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).f8065b--;
                    }
                }
            }
        }

        /* renamed from: f */
        private void m10499f(int i11, int i12, int i13) {
            if (this.f8058b[i11 - 1] != 0) {
                return;
            }
            m10500g(i11, i12, i13, false);
        }

        /* renamed from: g */
        private boolean m10500g(int i11, int i12, int i13, boolean z11) {
            int i14;
            int i15;
            if (z11) {
                i12--;
                i15 = i11;
                i14 = i12;
            } else {
                i14 = i11 - 1;
                i15 = i14;
            }
            while (i13 >= 0) {
                g gVar = (g) this.f8057a.get(i13);
                int i16 = gVar.f8071a;
                int i17 = gVar.f8073c;
                int i18 = i16 + i17;
                int i19 = gVar.f8072b + i17;
                int i21 = 4;
                if (z11) {
                    for (int i22 = i15 - 1; i22 >= i18; i22--) {
                        if (this.f8060d.mo422b(i22, i14)) {
                            if (this.f8060d.mo421a(i22, i14)) {
                                i21 = 8;
                            }
                            this.f8059c[i14] = (i22 << 5) | 16;
                            this.f8058b[i22] = (i14 << 5) | i21;
                            return true;
                        }
                    }
                } else {
                    for (int i23 = i12 - 1; i23 >= i19; i23--) {
                        if (this.f8060d.mo422b(i14, i23)) {
                            if (this.f8060d.mo421a(i14, i23)) {
                                i21 = 8;
                            }
                            int i24 = i11 - 1;
                            this.f8058b[i24] = (i23 << 5) | 16;
                            this.f8059c[i23] = (i24 << 5) | i21;
                            return true;
                        }
                    }
                }
                i15 = gVar.f8071a;
                i12 = gVar.f8072b;
                i13--;
            }
            return false;
        }

        /* renamed from: h */
        private void m10501h() {
            int i11;
            int i12 = this.f8061e;
            int i13 = this.f8062f;
            for (int size = this.f8057a.size() - 1; size >= 0; size--) {
                g gVar = (g) this.f8057a.get(size);
                int i14 = gVar.f8071a;
                int i15 = gVar.f8073c;
                int i16 = i14 + i15;
                int i17 = gVar.f8072b + i15;
                if (this.f8063g) {
                    while (i12 > i16) {
                        m10499f(i12, i13, size);
                        i12--;
                    }
                    while (i13 > i17) {
                        m10502i(i12, i13, size);
                        i13--;
                    }
                }
                for (int i18 = 0; i18 < gVar.f8073c; i18++) {
                    int i19 = gVar.f8071a + i18;
                    int i21 = gVar.f8072b + i18;
                    if (this.f8060d.mo421a(i19, i21)) {
                        i11 = 1;
                    } else {
                        i11 = 2;
                    }
                    this.f8058b[i19] = (i21 << 5) | i11;
                    this.f8059c[i21] = (i19 << 5) | i11;
                }
                i12 = gVar.f8071a;
                i13 = gVar.f8072b;
            }
        }

        /* renamed from: i */
        private void m10502i(int i11, int i12, int i13) {
            if (this.f8059c[i12 - 1] != 0) {
                return;
            }
            m10500g(i11, i12, i13, true);
        }

        /* renamed from: j */
        private static e m10503j(List list, int i11, boolean z11) {
            int i12;
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = (e) list.get(size);
                if (eVar.f8064a == i11 && eVar.f8066c == z11) {
                    list.remove(size);
                    while (size < list.size()) {
                        e eVar2 = (e) list.get(size);
                        int i13 = eVar2.f8065b;
                        if (z11) {
                            i12 = 1;
                        } else {
                            i12 = -1;
                        }
                        eVar2.f8065b = i13 + i12;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: d */
        public void m10504d(InterfaceC1926s interfaceC1926s) {
            C1912e c1912e;
            if (interfaceC1926s instanceof C1912e) {
                c1912e = (C1912e) interfaceC1926s;
            } else {
                c1912e = new C1912e(interfaceC1926s);
            }
            ArrayList arrayList = new ArrayList();
            int i11 = this.f8061e;
            int i12 = this.f8062f;
            for (int size = this.f8057a.size() - 1; size >= 0; size--) {
                g gVar = (g) this.f8057a.get(size);
                int i13 = gVar.f8073c;
                int i14 = gVar.f8071a + i13;
                int i15 = gVar.f8072b + i13;
                if (i14 < i11) {
                    m10498c(arrayList, c1912e, i14, i11 - i14, i14);
                }
                if (i15 < i12) {
                    m10497b(arrayList, c1912e, i14, i12 - i15, i15);
                }
                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                    int[] iArr = this.f8058b;
                    int i17 = gVar.f8071a;
                    if ((iArr[i17 + i16] & 31) == 2) {
                        c1912e.mo10408c(i17 + i16, 1, this.f8060d.mo423c(i17 + i16, gVar.f8072b + i16));
                    }
                }
                i11 = gVar.f8071a;
                i12 = gVar.f8072b;
            }
            c1912e.m10449e();
        }

        /* renamed from: e */
        public void m10505e(RecyclerView.AbstractC1880g abstractC1880g) {
            m10504d(new C1907b(abstractC1880g));
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$d */
    /* loaded from: classes2.dex */
    public static abstract class d {
        /* renamed from: a */
        public abstract boolean mo10506a(Object obj, Object obj2);

        /* renamed from: b */
        public abstract boolean mo10507b(Object obj, Object obj2);

        /* renamed from: c */
        public Object mo10508c(Object obj, Object obj2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.h$e */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a */
        int f8064a;

        /* renamed from: b */
        int f8065b;

        /* renamed from: c */
        boolean f8066c;

        public e(int i11, int i12, boolean z11) {
            this.f8064a = i11;
            this.f8065b = i12;
            this.f8066c = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.h$f */
    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a */
        int f8067a;

        /* renamed from: b */
        int f8068b;

        /* renamed from: c */
        int f8069c;

        /* renamed from: d */
        int f8070d;

        public f() {
        }

        public f(int i11, int i12, int i13, int i14) {
            this.f8067a = i11;
            this.f8068b = i12;
            this.f8069c = i13;
            this.f8070d = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.h$g */
    /* loaded from: classes2.dex */
    public static class g {

        /* renamed from: a */
        int f8071a;

        /* renamed from: b */
        int f8072b;

        /* renamed from: c */
        int f8073c;

        /* renamed from: d */
        boolean f8074d;

        /* renamed from: e */
        boolean f8075e;

        g() {
        }
    }

    /* renamed from: a */
    public static c m10492a(b bVar) {
        return m10493b(bVar, true);
    }

    /* renamed from: b */
    public static c m10493b(b bVar, boolean z11) {
        f fVar;
        int mo425e = bVar.mo425e();
        int mo424d = bVar.mo424d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(0, mo425e, 0, mo424d));
        int abs = mo425e + mo424d + Math.abs(mo425e - mo424d);
        int i11 = abs * 2;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            f fVar2 = (f) arrayList2.remove(arrayList2.size() - 1);
            g m10494c = m10494c(bVar, fVar2.f8067a, fVar2.f8068b, fVar2.f8069c, fVar2.f8070d, iArr, iArr2, abs);
            if (m10494c != null) {
                if (m10494c.f8073c > 0) {
                    arrayList.add(m10494c);
                }
                m10494c.f8071a += fVar2.f8067a;
                m10494c.f8072b += fVar2.f8069c;
                if (arrayList3.isEmpty()) {
                    fVar = new f();
                } else {
                    fVar = (f) arrayList3.remove(arrayList3.size() - 1);
                }
                fVar.f8067a = fVar2.f8067a;
                fVar.f8069c = fVar2.f8069c;
                if (m10494c.f8075e) {
                    fVar.f8068b = m10494c.f8071a;
                    fVar.f8070d = m10494c.f8072b;
                } else if (m10494c.f8074d) {
                    fVar.f8068b = m10494c.f8071a - 1;
                    fVar.f8070d = m10494c.f8072b;
                } else {
                    fVar.f8068b = m10494c.f8071a;
                    fVar.f8070d = m10494c.f8072b - 1;
                }
                arrayList2.add(fVar);
                if (m10494c.f8075e) {
                    if (m10494c.f8074d) {
                        int i12 = m10494c.f8071a;
                        int i13 = m10494c.f8073c;
                        fVar2.f8067a = i12 + i13 + 1;
                        fVar2.f8069c = m10494c.f8072b + i13;
                    } else {
                        int i14 = m10494c.f8071a;
                        int i15 = m10494c.f8073c;
                        fVar2.f8067a = i14 + i15;
                        fVar2.f8069c = m10494c.f8072b + i15 + 1;
                    }
                } else {
                    int i16 = m10494c.f8071a;
                    int i17 = m10494c.f8073c;
                    fVar2.f8067a = i16 + i17;
                    fVar2.f8069c = m10494c.f8072b + i17;
                }
                arrayList2.add(fVar2);
            } else {
                arrayList3.add(fVar2);
            }
        }
        Collections.sort(arrayList, f8056a);
        return new c(bVar, arrayList, iArr, iArr2, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:            if (r24[r13 - 1] < r24[r13 + r5]) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:            if (r25[r12 - 1] < r25[r12 + 1]) goto L50;     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[LOOP:4: B:54:0x00ca->B:58:0x00de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9 A[EDGE_INSN: B:59:0x00e9->B:60:0x00e9 BREAK  A[LOOP:4: B:54:0x00ca->B:58:0x00de], SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static g m10494c(b bVar, int i11, int i12, int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        boolean z11;
        int i16;
        int i17;
        boolean z12;
        int i18;
        int i19;
        int i21;
        boolean z13;
        int i22;
        int i23 = i12 - i11;
        int i24 = i14 - i13;
        int i25 = 1;
        if (i23 >= 1 && i24 >= 1) {
            int i26 = i23 - i24;
            int i27 = ((i23 + i24) + 1) / 2;
            int i28 = (i15 - i27) - 1;
            int i29 = i15 + i27 + 1;
            Arrays.fill(iArr, i28, i29, 0);
            Arrays.fill(iArr2, i28 + i26, i29 + i26, i23);
            if (i26 % 2 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i31 = 0;
            while (i31 <= i27) {
                int i32 = -i31;
                int i33 = i32;
                while (i33 <= i31) {
                    if (i33 != i32) {
                        if (i33 != i31) {
                            int i34 = i15 + i33;
                        }
                        i21 = iArr[(i15 + i33) - i25] + i25;
                        z13 = true;
                        for (i22 = i21 - i33; i21 < i23 && i22 < i24 && bVar.mo422b(i11 + i21, i13 + i22); i22++) {
                            i21++;
                        }
                        int i35 = i15 + i33;
                        iArr[i35] = i21;
                        if (!z11 && i33 >= (i26 - i31) + 1 && i33 <= (i26 + i31) - 1 && i21 >= iArr2[i35]) {
                            g gVar = new g();
                            int i36 = iArr2[i35];
                            gVar.f8071a = i36;
                            gVar.f8072b = i36 - i33;
                            gVar.f8073c = iArr[i35] - i36;
                            gVar.f8074d = z13;
                            gVar.f8075e = false;
                            return gVar;
                        }
                        i33 += 2;
                        i25 = 1;
                    }
                    i21 = iArr[i15 + i33 + i25];
                    z13 = false;
                    while (i21 < i23) {
                        i21++;
                    }
                    int i352 = i15 + i33;
                    iArr[i352] = i21;
                    if (!z11) {
                    }
                    i33 += 2;
                    i25 = 1;
                }
                int i37 = i32;
                while (i37 <= i31) {
                    int i38 = i37 + i26;
                    if (i38 != i31 + i26) {
                        if (i38 != i32 + i26) {
                            int i39 = i15 + i38;
                            i16 = 1;
                        } else {
                            i16 = 1;
                        }
                        i17 = iArr2[(i15 + i38) + i16] - i16;
                        z12 = true;
                        i18 = i17 - i38;
                        while (i17 > 0 && i18 > 0) {
                            i19 = i23;
                            if (bVar.mo422b((i11 + i17) - 1, (i13 + i18) - 1)) {
                                break;
                            }
                            i17--;
                            i18--;
                            i23 = i19;
                        }
                        i19 = i23;
                        int i41 = i15 + i38;
                        iArr2[i41] = i17;
                        if (z11 && i38 >= i32 && i38 <= i31 && iArr[i41] >= i17) {
                            g gVar2 = new g();
                            int i42 = iArr2[i41];
                            gVar2.f8071a = i42;
                            gVar2.f8072b = i42 - i38;
                            gVar2.f8073c = iArr[i41] - i42;
                            gVar2.f8074d = z12;
                            gVar2.f8075e = true;
                            return gVar2;
                        }
                        i37 += 2;
                        i23 = i19;
                    } else {
                        i16 = 1;
                    }
                    i17 = iArr2[(i15 + i38) - i16];
                    z12 = false;
                    i18 = i17 - i38;
                    while (i17 > 0) {
                        i19 = i23;
                        if (bVar.mo422b((i11 + i17) - 1, (i13 + i18) - 1)) {
                        }
                    }
                    i19 = i23;
                    int i412 = i15 + i38;
                    iArr2[i412] = i17;
                    if (z11) {
                    }
                    i37 += 2;
                    i23 = i19;
                }
                i31++;
                i23 = i23;
                i25 = 1;
            }
            throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
        }
        return null;
    }
}
