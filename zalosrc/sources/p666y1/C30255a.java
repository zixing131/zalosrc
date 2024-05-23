package p666y1;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.core.graphics.AbstractC1409d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p666y1.C30256b;

/* renamed from: y1.a */
/* loaded from: classes2.dex */
public final class C30255a {

    /* renamed from: g */
    private static final Comparator f140503g = new a();

    /* renamed from: a */
    final int[] f140504a;

    /* renamed from: b */
    final int[] f140505b;

    /* renamed from: c */
    final List f140506c;

    /* renamed from: e */
    final C30256b.c[] f140508e;

    /* renamed from: f */
    private final float[] f140509f = new float[3];

    /* renamed from: d */
    final TimingLogger f140507d = null;

    /* renamed from: y1.a$a */
    /* loaded from: classes2.dex */
    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar2.m149230g() - bVar.m149230g();
        }
    }

    /* renamed from: y1.a$b */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a */
        private int f140510a;

        /* renamed from: b */
        private int f140511b;

        /* renamed from: c */
        private int f140512c;

        /* renamed from: d */
        private int f140513d;

        /* renamed from: e */
        private int f140514e;

        /* renamed from: f */
        private int f140515f;

        /* renamed from: g */
        private int f140516g;

        /* renamed from: h */
        private int f140517h;

        /* renamed from: i */
        private int f140518i;

        b(int i11, int i12) {
            this.f140510a = i11;
            this.f140511b = i12;
            m149226c();
        }

        /* renamed from: a */
        final boolean m149224a() {
            if (m149228e() > 1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        final int m149225b() {
            int m149229f = m149229f();
            C30255a c30255a = C30255a.this;
            int[] iArr = c30255a.f140504a;
            int[] iArr2 = c30255a.f140505b;
            C30255a.m149211e(iArr, m149229f, this.f140510a, this.f140511b);
            Arrays.sort(iArr, this.f140510a, this.f140511b + 1);
            C30255a.m149211e(iArr, m149229f, this.f140510a, this.f140511b);
            int i11 = this.f140512c / 2;
            int i12 = this.f140510a;
            int i13 = 0;
            while (true) {
                int i14 = this.f140511b;
                if (i12 <= i14) {
                    i13 += iArr2[iArr[i12]];
                    if (i13 >= i11) {
                        return Math.min(i14 - 1, i12);
                    }
                    i12++;
                } else {
                    return this.f140510a;
                }
            }
        }

        /* renamed from: c */
        final void m149226c() {
            C30255a c30255a = C30255a.this;
            int[] iArr = c30255a.f140504a;
            int[] iArr2 = c30255a.f140505b;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MIN_VALUE;
            int i17 = 0;
            for (int i18 = this.f140510a; i18 <= this.f140511b; i18++) {
                int i19 = iArr[i18];
                i17 += iArr2[i19];
                int m149217k = C30255a.m149217k(i19);
                int m149216j = C30255a.m149216j(i19);
                int m149215i = C30255a.m149215i(i19);
                if (m149217k > i14) {
                    i14 = m149217k;
                }
                if (m149217k < i11) {
                    i11 = m149217k;
                }
                if (m149216j > i15) {
                    i15 = m149216j;
                }
                if (m149216j < i12) {
                    i12 = m149216j;
                }
                if (m149215i > i16) {
                    i16 = m149215i;
                }
                if (m149215i < i13) {
                    i13 = m149215i;
                }
            }
            this.f140513d = i11;
            this.f140514e = i14;
            this.f140515f = i12;
            this.f140516g = i15;
            this.f140517h = i13;
            this.f140518i = i16;
            this.f140512c = i17;
        }

        /* renamed from: d */
        final C30256b.e m149227d() {
            C30255a c30255a = C30255a.this;
            int[] iArr = c30255a.f140504a;
            int[] iArr2 = c30255a.f140505b;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = this.f140510a; i15 <= this.f140511b; i15++) {
                int i16 = iArr[i15];
                int i17 = iArr2[i16];
                i12 += i17;
                i11 += C30255a.m149217k(i16) * i17;
                i13 += C30255a.m149216j(i16) * i17;
                i14 += i17 * C30255a.m149215i(i16);
            }
            float f11 = i12;
            return new C30256b.e(C30255a.m149209b(Math.round(i11 / f11), Math.round(i13 / f11), Math.round(i14 / f11)), i12);
        }

        /* renamed from: e */
        final int m149228e() {
            return (this.f140511b + 1) - this.f140510a;
        }

        /* renamed from: f */
        final int m149229f() {
            int i11 = this.f140514e - this.f140513d;
            int i12 = this.f140516g - this.f140515f;
            int i13 = this.f140518i - this.f140517h;
            if (i11 < i12 || i11 < i13) {
                return (i12 < i11 || i12 < i13) ? -1 : -2;
            }
            return -3;
        }

        /* renamed from: g */
        final int m149230g() {
            return ((this.f140514e - this.f140513d) + 1) * ((this.f140516g - this.f140515f) + 1) * ((this.f140518i - this.f140517h) + 1);
        }

        /* renamed from: h */
        final b m149231h() {
            if (m149224a()) {
                int m149225b = m149225b();
                b bVar = new b(m149225b + 1, this.f140511b);
                this.f140511b = m149225b;
                m149226c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    public C30255a(int[] iArr, int i11, C30256b.c[] cVarArr) {
        this.f140508e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f140505b = iArr2;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int m149213g = m149213g(iArr[i12]);
            iArr[i12] = m149213g;
            iArr2[m149213g] = iArr2[m149213g] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0 && m149218l(i14)) {
                iArr2[i14] = 0;
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f140504a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 <= i11) {
            this.f140506c = new ArrayList();
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = iArr3[i17];
                this.f140506c.add(new C30256b.e(m149208a(i18), iArr2[i18]));
            }
            return;
        }
        this.f140506c = m149214h(i11);
    }

    /* renamed from: a */
    private static int m149208a(int i11) {
        return m149209b(m149217k(i11), m149216j(i11), m149215i(i11));
    }

    /* renamed from: b */
    static int m149209b(int i11, int i12, int i13) {
        return Color.rgb(m149212f(i11, 5, 8), m149212f(i12, 5, 8), m149212f(i13, 5, 8));
    }

    /* renamed from: c */
    private List m149210c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C30256b.e m149227d = ((b) it.next()).m149227d();
            if (!m149220n(m149227d)) {
                arrayList.add(m149227d);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static void m149211e(int[] iArr, int i11, int i12, int i13) {
        if (i11 != -2) {
            if (i11 == -1) {
                while (i12 <= i13) {
                    int i14 = iArr[i12];
                    iArr[i12] = m149217k(i14) | (m149215i(i14) << 10) | (m149216j(i14) << 5);
                    i12++;
                }
                return;
            }
            return;
        }
        while (i12 <= i13) {
            int i15 = iArr[i12];
            iArr[i12] = m149215i(i15) | (m149216j(i15) << 10) | (m149217k(i15) << 5);
            i12++;
        }
    }

    /* renamed from: f */
    private static int m149212f(int i11, int i12, int i13) {
        return (i13 > i12 ? i11 << (i13 - i12) : i11 >> (i12 - i13)) & ((1 << i13) - 1);
    }

    /* renamed from: g */
    private static int m149213g(int i11) {
        return m149212f(Color.blue(i11), 8, 5) | (m149212f(Color.red(i11), 8, 5) << 10) | (m149212f(Color.green(i11), 8, 5) << 5);
    }

    /* renamed from: h */
    private List m149214h(int i11) {
        PriorityQueue priorityQueue = new PriorityQueue(i11, f140503g);
        priorityQueue.offer(new b(0, this.f140504a.length - 1));
        m149221o(priorityQueue, i11);
        return m149210c(priorityQueue);
    }

    /* renamed from: i */
    static int m149215i(int i11) {
        return i11 & 31;
    }

    /* renamed from: j */
    static int m149216j(int i11) {
        return (i11 >> 5) & 31;
    }

    /* renamed from: k */
    static int m149217k(int i11) {
        return (i11 >> 10) & 31;
    }

    /* renamed from: l */
    private boolean m149218l(int i11) {
        int m149208a = m149208a(i11);
        AbstractC1409d.m7139h(m149208a, this.f140509f);
        return m149219m(m149208a, this.f140509f);
    }

    /* renamed from: m */
    private boolean m149219m(int i11, float[] fArr) {
        C30256b.c[] cVarArr = this.f140508e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (!this.f140508e[i12].mo149243a(i11, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    private boolean m149220n(C30256b.e eVar) {
        return m149219m(eVar.m149255e(), eVar.m149253c());
    }

    /* renamed from: o */
    private void m149221o(PriorityQueue priorityQueue, int i11) {
        b bVar;
        while (priorityQueue.size() < i11 && (bVar = (b) priorityQueue.poll()) != null && bVar.m149224a()) {
            priorityQueue.offer(bVar.m149231h());
            priorityQueue.offer(bVar);
        }
    }

    /* renamed from: d */
    public List m149222d() {
        return this.f140506c;
    }
}
