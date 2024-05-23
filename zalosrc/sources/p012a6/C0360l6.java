package p012a6;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: a6.l6 */
/* loaded from: classes2.dex */
final class C0360l6 implements InterfaceC26584c {

    /* renamed from: a */
    static final C0360l6 f1592a = new C0360l6();

    /* renamed from: b */
    private static final C26583b f1593b;

    /* renamed from: c */
    private static final C26583b f1594c;

    /* renamed from: d */
    private static final C26583b f1595d;

    /* renamed from: e */
    private static final C26583b f1596e;

    /* renamed from: f */
    private static final C26583b f1597f;

    /* renamed from: g */
    private static final C26583b f1598g;

    static {
        C26583b.b m136509a = C26583b.m136509a("maxMs");
        C0598y1 c0598y1 = new C0598y1();
        c0598y1.m900a(1);
        f1593b = m136509a.m136514b(c0598y1.m901b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("minMs");
        C0598y1 c0598y12 = new C0598y1();
        c0598y12.m900a(2);
        f1594c = m136509a2.m136514b(c0598y12.m901b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("avgMs");
        C0598y1 c0598y13 = new C0598y1();
        c0598y13.m900a(3);
        f1595d = m136509a3.m136514b(c0598y13.m901b()).m136513a();
        C26583b.b m136509a4 = C26583b.m136509a("firstQuartileMs");
        C0598y1 c0598y14 = new C0598y1();
        c0598y14.m900a(4);
        f1596e = m136509a4.m136514b(c0598y14.m901b()).m136513a();
        C26583b.b m136509a5 = C26583b.m136509a("medianMs");
        C0598y1 c0598y15 = new C0598y1();
        c0598y15.m900a(5);
        f1597f = m136509a5.m136514b(c0598y15.m901b()).m136513a();
        C26583b.b m136509a6 = C26583b.m136509a("thirdQuartileMs");
        C0598y1 c0598y16 = new C0598y1();
        c0598y16.m900a(6);
        f1598g = m136509a6.m136514b(c0598y16.m901b()).m136513a();
    }

    private C0360l6() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        C0346kb c0346kb = (C0346kb) obj;
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f1593b, c0346kb.m774c());
        interfaceC26585d.mo671a(f1594c, c0346kb.m776e());
        interfaceC26585d.mo671a(f1595d, c0346kb.m772a());
        interfaceC26585d.mo671a(f1596e, c0346kb.m773b());
        interfaceC26585d.mo671a(f1597f, c0346kb.m775d());
        interfaceC26585d.mo671a(f1598g, c0346kb.m777f());
    }
}
