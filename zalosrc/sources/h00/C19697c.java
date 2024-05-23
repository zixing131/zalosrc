package h00;

import a00.C0018c;
import a00.InterfaceC0017b;
import android.graphics.Bitmap;
import b00.C2478a;
import b00.C2480c;
import c00.C3181a;
import d00.C17687a;
import d00.C17689c;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import g00.C19189b;
import g00.C19192e;
import g00.C19195h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k00.AbstractC21426c;
import k00.C21424a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p733zz.C32609a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25376w;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: h00.c */
/* loaded from: classes4.dex */
public final class C19697c implements InterfaceC19696b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C19189b f97708a;

    /* renamed from: b */
    private C19195h f97709b;

    /* renamed from: c */
    private C19192e f97710c;

    /* renamed from: h00.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: h00.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        private CoroutineScope f97711t;

        /* renamed from: u */
        int f97712u;

        /* renamed from: w */
        final /* synthetic */ C19695a f97714w;

        /* renamed from: x */
        final /* synthetic */ boolean f97715x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C19695a c19695a, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f97714w = c19695a;
            this.f97715x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            AbstractC19074t.m100208f(continuation, "completion");
            b bVar = new b(this.f97714w, this.f97715x, continuation);
            bVar.f97711t = (CoroutineScope) obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f97712u == 0) {
                AbstractC24862s.m129228b(obj);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Starting detect document bound: ");
                sb2.append(this.f97714w);
                Bitmap m103340a = this.f97714w.m103340a();
                int width = m103340a.getWidth();
                int height = m103340a.getHeight();
                if (AbstractC21426c.m110930a(m103340a)) {
                    float m103358q = C19697c.this.m103358q(m103340a);
                    int width2 = (int) (m103340a.getWidth() * m103358q);
                    int height2 = (int) (m103340a.getHeight() * m103358q);
                    C17689c m103353k = C19697c.this.m103353k(m103340a, width2, height2);
                    C19697c.this.m103354m(m103353k);
                    C19697c c19697c = C19697c.this;
                    C17687a m93696p = m103353k.m93696p();
                    AbstractC19074t.m100207e(m93696p, "frame.flattenMax()");
                    List m103357p = C19697c.this.m103357p(c19697c.m103352j(m93696p), this.f97715x, width2, height2);
                    C19697c.this.m103367z(m103357p, 15, 50, width2, height2);
                    C2480c m103355n = C19697c.this.m103355n(m103357p, width2, height2);
                    if (m103355n != null) {
                        C19697c.this.m103362u(m103355n, m103358q);
                        return m103355n;
                    }
                    return C2480c.m12519c(width, height);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public final Object mo240pC(Object obj, Object obj2) {
            return ((b) mo238a(obj, (Continuation) obj2)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: h00.c$c */
    /* loaded from: classes4.dex */
    public static final class c implements Comparator {

        /* renamed from: p */
        public static final c f97716p = new c();

        c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(C2478a c2478a, C2478a c2478a2) {
            return Double.compare(c2478a2.f10095v, c2478a.f10095v);
        }
    }

    /* renamed from: h00.c$d */
    /* loaded from: classes4.dex */
    public static final class d implements Comparator {

        /* renamed from: p */
        public static final d f97717p = new d();

        d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(C32609a c32609a, C32609a c32609a2) {
            AbstractC19074t.m100205c(c32609a2);
            double m157943e = c32609a2.m157943e();
            AbstractC19074t.m100205c(c32609a);
            return Double.compare(m157943e, c32609a.m157943e());
        }
    }

    /* renamed from: h00.c$e */
    /* loaded from: classes4.dex */
    public static final class e implements Comparator {

        /* renamed from: p */
        public static final e f97718p = new e();

        e() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(C32609a c32609a, C32609a c32609a2) {
            AbstractC19074t.m100205c(c32609a2);
            double m157943e = c32609a2.m157943e();
            AbstractC19074t.m100205c(c32609a);
            return Double.compare(m157943e, c32609a.m157943e());
        }
    }

    /* renamed from: h00.c$f */
    /* loaded from: classes4.dex */
    public static final class f implements Comparator {

        /* renamed from: p */
        public static final f f97719p = new f();

        f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(C32609a c32609a, C32609a c32609a2) {
            AbstractC19074t.m100205c(c32609a2);
            double m157943e = c32609a2.m157943e();
            AbstractC19074t.m100205c(c32609a);
            return Double.compare(m157943e, c32609a.m157943e());
        }
    }

    public C19697c(C19189b c19189b, C19195h c19195h, C19192e c19192e) {
        AbstractC19074t.m100208f(c19189b, "detector");
        AbstractC19074t.m100208f(c19195h, "gammaCorrection");
        AbstractC19074t.m100208f(c19192e, "gauss");
        this.f97708a = c19189b;
        this.f97709b = c19195h;
        this.f97710c = c19192e;
    }

    /* renamed from: j */
    public final C17687a m103352j(C17687a c17687a) {
        this.f97708a.m100638b(c17687a);
        return c17687a;
    }

    /* renamed from: k */
    public final C17689c m103353k(Bitmap bitmap, int i11, int i12) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i12, false);
        C21424a c21424a = C21424a.f104417b;
        AbstractC19074t.m100207e(createScaledBitmap, "scaledBitmap");
        C17689c m110928a = c21424a.m110928a(createScaledBitmap, false);
        createScaledBitmap.recycle();
        return m110928a;
    }

    /* renamed from: m */
    public final void m103354m(C17689c c17689c) {
        int m93705n = c17689c.m93705n();
        for (int i11 = 0; i11 < m93705n; i11++) {
            this.f97709b.m100649a((C17687a) c17689c.m93701g(i11));
        }
        int m93705n2 = c17689c.m93705n();
        for (int i12 = 0; i12 < m93705n2; i12++) {
            this.f97710c.m100645b((C17687a) c17689c.m93701g(i12));
        }
    }

    /* renamed from: n */
    public final C2480c m103355n(List list, int i11, int i12) {
        InterfaceC0017b interfaceC0017b;
        InterfaceC0017b interfaceC0017b2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i13 = 20;
        while (arrayList.isEmpty() && i13 <= 45) {
            int size = list.size() - 1;
            int i14 = 0;
            while (i14 < size) {
                C32609a c32609a = (C32609a) list.get(i14);
                double m157952o = c32609a.m157952o();
                i14++;
                int size2 = list.size();
                int i15 = i14;
                while (i15 < size2) {
                    C32609a c32609a2 = (C32609a) list.get(i15);
                    int i16 = i14;
                    if (Math.abs(m157952o - c32609a2.m157952o()) <= i13) {
                        C2478a c2478a = new C2478a();
                        if (m157952o > 45) {
                            c32609a.m157958w();
                            c32609a2.m157958w();
                            c2478a.f10090q = c32609a;
                            c2478a.f10091r = c32609a2;
                            arrayList.add(c2478a);
                        } else {
                            c2478a.f10092s = c32609a;
                            c2478a.f10093t = c32609a2;
                            arrayList2.add(c2478a);
                        }
                    }
                    i15++;
                    i14 = i16;
                }
            }
            i13 += 5;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i17 = 30; arrayList3.isEmpty() && i17 < Math.min(i11, i12); i17 += 30) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2478a c2478a2 = (C2478a) it.next();
                c2478a2.f10090q.m157958w();
                c2478a2.f10091r.m157958w();
                InterfaceC0017b interfaceC0017b3 = c2478a2.f10090q.f150703p;
                AbstractC19074t.m100207e(interfaceC0017b3, "v.ver1.begin");
                float y11 = interfaceC0017b3.getY();
                InterfaceC0017b interfaceC0017b4 = c2478a2.f10091r.f150703p;
                AbstractC19074t.m100207e(interfaceC0017b4, "v.ver2.begin");
                if (y11 < interfaceC0017b4.getY()) {
                    interfaceC0017b = c2478a2.f10090q.f150703p;
                    AbstractC19074t.m100207e(interfaceC0017b, "v.ver1.begin");
                } else {
                    interfaceC0017b = c2478a2.f10091r.f150703p;
                    AbstractC19074t.m100207e(interfaceC0017b, "v.ver2.begin");
                }
                InterfaceC0017b interfaceC0017b5 = c2478a2.f10090q.f150704q;
                AbstractC19074t.m100207e(interfaceC0017b5, "v.ver1.end");
                float y12 = interfaceC0017b5.getY();
                InterfaceC0017b interfaceC0017b6 = c2478a2.f10091r.f150704q;
                AbstractC19074t.m100207e(interfaceC0017b6, "v.ver2.end");
                if (y12 > interfaceC0017b6.getY()) {
                    interfaceC0017b2 = c2478a2.f10090q.f150704q;
                    AbstractC19074t.m100207e(interfaceC0017b2, "v.ver1.end");
                } else {
                    interfaceC0017b2 = c2478a2.f10091r.f150704q;
                    AbstractC19074t.m100207e(interfaceC0017b2, "v.ver2.end");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C2478a c2478a3 = (C2478a) it2.next();
                    C32609a c32609a3 = c2478a2.f10090q;
                    AbstractC19074t.m100207e(c32609a3, "v.ver1");
                    double m157949l = c32609a3.m157949l();
                    C32609a c32609a4 = c2478a3.f10092s;
                    AbstractC19074t.m100207e(c32609a4, "h.hoz1");
                    double abs = Math.abs(m157949l - c32609a4.m157949l());
                    if (abs >= 90 - i13 && abs <= i13 + 90) {
                        float f11 = i17;
                        if ((c2478a3.f10092s.m157947j(interfaceC0017b) < f11 && c2478a3.f10093t.m157947j(interfaceC0017b2) < f11) || (c2478a3.f10092s.m157947j(interfaceC0017b2) < f11 && c2478a3.f10093t.m157947j(interfaceC0017b) < f11)) {
                            c2478a3.f10092s.m157957v();
                            c2478a3.f10093t.m157957v();
                            C2478a c2478a4 = new C2478a(c2478a2.f10090q, c2478a3.f10092s, c2478a2.f10091r, c2478a3.f10093t);
                            c2478a4.m12504d(i11, i12);
                            C2480c c2480c = c2478a4.f10094u;
                            AbstractC19074t.m100207e(c2480c, "lh.tetragram");
                            if (c2480c.m12526i()) {
                                arrayList3.add(c2478a4);
                            }
                        }
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Detected ");
        sb2.append(arrayList3.size());
        sb2.append(" bounds");
        if (!arrayList3.isEmpty()) {
            AbstractC25376w.m131534w(arrayList3, c.f97716p);
            double d11 = ((C2478a) arrayList3.get(0)).f10096w;
            int i18 = 0;
            for (int i19 = 1; i19 < 5 && i19 < arrayList3.size(); i19++) {
                if (((C2478a) arrayList3.get(i19)).f10096w < d11 && ((C2478a) arrayList3.get(i19)).f10095v > ((C2478a) arrayList3.get(i18)).f10095v * 0.8d) {
                    d11 = ((C2478a) arrayList3.get(i19)).f10096w;
                    i18 = i19;
                }
            }
            return ((C2478a) arrayList3.get(i18)).f10094u;
        }
        return null;
    }

    /* renamed from: o */
    private final int m103356o(List list, C32609a c32609a, int i11) {
        double d11 = i11;
        double d12 = 1 + d11;
        int size = list.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            C32609a c32609a2 = (C32609a) list.get(i13);
            if (c32609a2 != c32609a) {
                double m157944f = c32609a.m157944f(c32609a2);
                if (m157944f < d12 && m157944f < d11) {
                    i12 = i13;
                    d12 = m157944f;
                }
            }
        }
        return i12;
    }

    /* renamed from: p */
    public final List m103357p(C17687a c17687a, boolean z11, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        int i13 = c17687a.f89695q;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = c17687a.f89694p;
            for (int i16 = 0; i16 < i15; i16++) {
                if (c17687a.m93688m(i14, i16).floatValue() > 0.5f) {
                    arrayList.add(new C0018c(i14, i16));
                }
            }
        }
        if (z11) {
            Collections.shuffle(arrayList);
        }
        List m15978a = new C3181a(arrayList, i11, i12, 1.0d, 0.017453292519943295d, 10, 10, 10, 1000).m15978a();
        AbstractC19074t.m100207e(m15978a, "ht.lines");
        return m15978a;
    }

    /* renamed from: q */
    public final float m103358q(Bitmap bitmap) {
        int width;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            width = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
        }
        return 360.0f / width;
    }

    /* renamed from: r */
    private final void m103359r(List list, int i11, int i12, int i13) {
        boolean z11;
        if (((C32609a) list.get(0)).m157952o() < 45) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C32609a) it.next()).m157957v();
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((C32609a) it2.next()).m157958w();
            }
        }
        AbstractC25376w.m131534w(list, d.f97717p);
        for (int i14 = 0; i14 <= list.size() - 1; i14++) {
            C32609a c32609a = (C32609a) list.get(i14);
            while (true) {
                int m103356o = m103356o(list, c32609a, i11);
                if (m103356o != -1 && i14 < list.size() && m103356o < list.size()) {
                    C32609a c32609a2 = (C32609a) list.get(m103356o);
                    if (c32609a.m157943e() < c32609a2.m157943e()) {
                        Collections.swap(list, i14, m103356o);
                        c32609a = (C32609a) list.get(i14);
                        c32609a2 = (C32609a) list.get(m103356o);
                    }
                    if (z11) {
                        m103360s(c32609a, c32609a2, i13);
                    } else {
                        m103361t(c32609a, c32609a2, i12);
                    }
                    list.remove(m103356o);
                }
            }
        }
    }

    /* renamed from: s */
    private final void m103360s(C32609a c32609a, C32609a c32609a2, int i11) {
        c32609a.m157957v();
        c32609a2.m157957v();
        InterfaceC0017b interfaceC0017b = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b, "keep.end");
        float y11 = interfaceC0017b.getY();
        InterfaceC0017b interfaceC0017b2 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b2, "keep.begin");
        float y12 = y11 - interfaceC0017b2.getY();
        InterfaceC0017b interfaceC0017b3 = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b3, "keep.end");
        float x11 = interfaceC0017b3.getX();
        InterfaceC0017b interfaceC0017b4 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b4, "keep.begin");
        float x12 = x11 - interfaceC0017b4.getX();
        InterfaceC0017b interfaceC0017b5 = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b5, "keep.end");
        float x13 = interfaceC0017b5.getX();
        InterfaceC0017b interfaceC0017b6 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b6, "keep.begin");
        float y13 = x13 * interfaceC0017b6.getY();
        InterfaceC0017b interfaceC0017b7 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b7, "keep.begin");
        float x14 = interfaceC0017b7.getX();
        InterfaceC0017b interfaceC0017b8 = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b8, "keep.end");
        float y14 = y13 - (x14 * interfaceC0017b8.getY());
        InterfaceC0017b interfaceC0017b9 = c32609a2.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b9, "remove.begin");
        float x15 = interfaceC0017b9.getX();
        InterfaceC0017b interfaceC0017b10 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b10, "keep.begin");
        float f11 = 0.0f;
        if (x15 < interfaceC0017b10.getX()) {
            InterfaceC0017b interfaceC0017b11 = c32609a2.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b11, "remove.begin");
            float x16 = interfaceC0017b11.getX();
            float f12 = ((y12 * x16) + y14) / x12;
            if (f12 >= 0) {
                float f13 = i11;
                if (f12 > f13) {
                    f11 = f13 - 1;
                } else {
                    f11 = f12;
                    InterfaceC0017b interfaceC0017b12 = c32609a.f150703p;
                    AbstractC19074t.m100207e(interfaceC0017b12, "keep.begin");
                    interfaceC0017b12.mo34e(x16);
                    InterfaceC0017b interfaceC0017b13 = c32609a.f150703p;
                    AbstractC19074t.m100207e(interfaceC0017b13, "keep.begin");
                    interfaceC0017b13.mo32b(f11);
                    return;
                }
            }
            x16 = ((x12 * f11) - y14) / y12;
            InterfaceC0017b interfaceC0017b122 = c32609a.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b122, "keep.begin");
            interfaceC0017b122.mo34e(x16);
            InterfaceC0017b interfaceC0017b132 = c32609a.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b132, "keep.begin");
            interfaceC0017b132.mo32b(f11);
            return;
        }
        InterfaceC0017b interfaceC0017b14 = c32609a2.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b14, "remove.end");
        float x17 = interfaceC0017b14.getX();
        InterfaceC0017b interfaceC0017b15 = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b15, "keep.end");
        if (x17 > interfaceC0017b15.getX()) {
            InterfaceC0017b interfaceC0017b16 = c32609a2.f150704q;
            AbstractC19074t.m100207e(interfaceC0017b16, "remove.end");
            float x18 = interfaceC0017b16.getX();
            float f14 = ((y12 * x18) + y14) / x12;
            if (f14 >= 0) {
                float f15 = i11;
                if (f14 > f15) {
                    f11 = f15 - 1;
                } else {
                    f11 = f14;
                    InterfaceC0017b interfaceC0017b17 = c32609a.f150704q;
                    AbstractC19074t.m100207e(interfaceC0017b17, "keep.end");
                    interfaceC0017b17.mo34e(x18);
                    InterfaceC0017b interfaceC0017b18 = c32609a.f150704q;
                    AbstractC19074t.m100207e(interfaceC0017b18, "keep.end");
                    interfaceC0017b18.mo32b(f11);
                }
            }
            x18 = ((x12 * f11) - y14) / y12;
            InterfaceC0017b interfaceC0017b172 = c32609a.f150704q;
            AbstractC19074t.m100207e(interfaceC0017b172, "keep.end");
            interfaceC0017b172.mo34e(x18);
            InterfaceC0017b interfaceC0017b182 = c32609a.f150704q;
            AbstractC19074t.m100207e(interfaceC0017b182, "keep.end");
            interfaceC0017b182.mo32b(f11);
        }
    }

    /* renamed from: t */
    private final void m103361t(C32609a c32609a, C32609a c32609a2, int i11) {
        c32609a.m157958w();
        c32609a2.m157958w();
        InterfaceC0017b interfaceC0017b = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b, "keep.end");
        float y11 = interfaceC0017b.getY();
        InterfaceC0017b interfaceC0017b2 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b2, "keep.begin");
        float y12 = y11 - interfaceC0017b2.getY();
        InterfaceC0017b interfaceC0017b3 = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b3, "keep.end");
        float x11 = interfaceC0017b3.getX();
        InterfaceC0017b interfaceC0017b4 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b4, "keep.begin");
        float x12 = x11 - interfaceC0017b4.getX();
        InterfaceC0017b interfaceC0017b5 = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b5, "keep.end");
        float x13 = interfaceC0017b5.getX();
        InterfaceC0017b interfaceC0017b6 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b6, "keep.begin");
        float y13 = x13 * interfaceC0017b6.getY();
        InterfaceC0017b interfaceC0017b7 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b7, "keep.begin");
        float x14 = interfaceC0017b7.getX();
        InterfaceC0017b interfaceC0017b8 = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b8, "keep.end");
        float y14 = y13 - (x14 * interfaceC0017b8.getY());
        InterfaceC0017b interfaceC0017b9 = c32609a2.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b9, "remove.begin");
        float y15 = interfaceC0017b9.getY();
        InterfaceC0017b interfaceC0017b10 = c32609a.f150703p;
        AbstractC19074t.m100207e(interfaceC0017b10, "keep.begin");
        float f11 = 0.0f;
        if (y15 < interfaceC0017b10.getY()) {
            InterfaceC0017b interfaceC0017b11 = c32609a2.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b11, "remove.begin");
            float y16 = interfaceC0017b11.getY();
            float f12 = ((x12 * y16) - y14) / y12;
            if (f12 < 0) {
                y16 = ((y12 * 0.0f) + y14) / x12;
            } else {
                float f13 = i11;
                if (f12 > f13) {
                    f11 = f13 - 1;
                    y16 = f12;
                } else {
                    f11 = f12;
                }
            }
            InterfaceC0017b interfaceC0017b12 = c32609a.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b12, "keep.begin");
            interfaceC0017b12.mo34e(f11);
            InterfaceC0017b interfaceC0017b13 = c32609a.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b13, "keep.begin");
            interfaceC0017b13.mo32b(y16);
            return;
        }
        InterfaceC0017b interfaceC0017b14 = c32609a2.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b14, "remove.end");
        float y17 = interfaceC0017b14.getY();
        InterfaceC0017b interfaceC0017b15 = c32609a.f150704q;
        AbstractC19074t.m100207e(interfaceC0017b15, "keep.end");
        if (y17 > interfaceC0017b15.getY()) {
            InterfaceC0017b interfaceC0017b16 = c32609a2.f150704q;
            AbstractC19074t.m100207e(interfaceC0017b16, "remove.end");
            float y18 = interfaceC0017b16.getY();
            float f14 = ((x12 * y18) - y14) / y12;
            if (f14 < 0) {
                y18 = ((y12 * 0.0f) + y14) / x12;
            } else {
                float f15 = i11;
                if (f14 > f15) {
                    f11 = f15 - 1;
                    y18 = f14;
                } else {
                    f11 = f14;
                }
            }
            InterfaceC0017b interfaceC0017b17 = c32609a.f150704q;
            AbstractC19074t.m100207e(interfaceC0017b17, "keep.end");
            interfaceC0017b17.mo34e(f11);
            InterfaceC0017b interfaceC0017b18 = c32609a.f150704q;
            AbstractC19074t.m100207e(interfaceC0017b18, "keep.end");
            interfaceC0017b18.mo32b(y18);
        }
    }

    /* renamed from: u */
    public final void m103362u(C2480c c2480c, float f11) {
        if (f11 != 1.0f) {
            for (InterfaceC0017b interfaceC0017b : c2480c.m12532p()) {
                AbstractC19074t.m100207e(interfaceC0017b, "p");
                interfaceC0017b.mo34e(interfaceC0017b.getX() / f11);
                interfaceC0017b.mo32b(interfaceC0017b.getY() / f11);
            }
        }
    }

    /* renamed from: v */
    private final void m103363v(List list, int i11, int i12, int i13, int i14) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C32609a) it.next()).m157957v();
        }
        AbstractC25376w.m131534w(list, e.f97718p);
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (i15 < list.size()) {
            arrayList.clear();
            C32609a c32609a = (C32609a) list.get(i15);
            if (c32609a.m157952o() >= 45) {
                i15++;
            } else {
                arrayList.add(c32609a);
                int size = list.size();
                for (int i16 = i15 + 1; i16 < size; i16++) {
                    C32609a c32609a2 = (C32609a) list.get(i16);
                    if (c32609a2.m157945g(arrayList, i11)) {
                        arrayList.add(c32609a2);
                    }
                }
                if (arrayList.size() > 1) {
                    list.removeAll(arrayList);
                    int size2 = arrayList.size();
                    m103359r(arrayList, i12, i13, i14);
                    int size3 = arrayList.size();
                    list.addAll(arrayList);
                    if (size3 < size2) {
                        i15--;
                    }
                }
                i15++;
            }
        }
    }

    /* renamed from: w */
    private final void m103364w(List list, int i11, int i12, int i13, int i14) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C32609a) it.next()).m157958w();
        }
        AbstractC25376w.m131534w(list, f.f97719p);
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (i15 < list.size()) {
            arrayList.clear();
            C32609a c32609a = (C32609a) list.get(i15);
            if (c32609a.m157952o() < 45) {
                i15++;
            } else {
                arrayList.add(c32609a);
                int size = list.size();
                for (int i16 = i15 + 1; i16 < size; i16++) {
                    C32609a c32609a2 = (C32609a) list.get(i16);
                    if (c32609a2.m157945g(arrayList, i11)) {
                        arrayList.add(c32609a2);
                    }
                }
                if (arrayList.size() > 1) {
                    list.removeAll(arrayList);
                    int size2 = arrayList.size();
                    m103359r(arrayList, i12, i13, i14);
                    int size3 = arrayList.size();
                    list.addAll(arrayList);
                    if (size3 < size2) {
                        i15--;
                    }
                }
                i15++;
            }
        }
    }

    /* renamed from: x */
    private final void m103365x(List list, int i11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C32609a) it.next()).m157943e() < i11) {
                it.remove();
            }
        }
    }

    /* renamed from: y */
    private final void m103366y(List list, int i11, int i12, int i13) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C32609a c32609a = (C32609a) it.next();
            InterfaceC0017b interfaceC0017b = c32609a.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b, "l.begin");
            float f11 = i11;
            if (interfaceC0017b.getX() < f11) {
                InterfaceC0017b interfaceC0017b2 = c32609a.f150704q;
                AbstractC19074t.m100207e(interfaceC0017b2, "l.end");
                if (interfaceC0017b2.getX() < f11) {
                    it.remove();
                }
            }
            InterfaceC0017b interfaceC0017b3 = c32609a.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b3, "l.begin");
            if (interfaceC0017b3.getY() < f11) {
                InterfaceC0017b interfaceC0017b4 = c32609a.f150704q;
                AbstractC19074t.m100207e(interfaceC0017b4, "l.end");
                if (interfaceC0017b4.getY() < f11) {
                    it.remove();
                }
            }
            InterfaceC0017b interfaceC0017b5 = c32609a.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b5, "l.begin");
            float f12 = i12 - i11;
            if (interfaceC0017b5.getX() > f12) {
                InterfaceC0017b interfaceC0017b6 = c32609a.f150704q;
                AbstractC19074t.m100207e(interfaceC0017b6, "l.end");
                if (interfaceC0017b6.getX() > f12) {
                    it.remove();
                }
            }
            InterfaceC0017b interfaceC0017b7 = c32609a.f150703p;
            AbstractC19074t.m100207e(interfaceC0017b7, "l.begin");
            float f13 = i13 - i11;
            if (interfaceC0017b7.getY() > f13) {
                InterfaceC0017b interfaceC0017b8 = c32609a.f150704q;
                AbstractC19074t.m100207e(interfaceC0017b8, "l.end");
                if (interfaceC0017b8.getY() > f13) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: z */
    public final void m103367z(List list, int i11, int i12, int i13, int i14) {
        m103366y(list, 3, i13, i14);
        m103363v(list, i11, i12, i13, i14);
        m103364w(list, i11, i12, i13, i14);
        m103365x(list, 50);
    }

    @Override // h00.InterfaceC19696b
    /* renamed from: l */
    public Object mo103343a(C19695a c19695a, boolean z11, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new b(c19695a, z11, null), continuation);
    }
}
