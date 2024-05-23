package p012a6;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: a6.e5 */
/* loaded from: classes2.dex */
final class C0226e5 implements InterfaceC26584c {

    /* renamed from: a */
    static final C0226e5 f1022a = new C0226e5();

    /* renamed from: b */
    private static final C26583b f1023b;

    /* renamed from: c */
    private static final C26583b f1024c;

    /* renamed from: d */
    private static final C26583b f1025d;

    static {
        C26583b.b m136509a = C26583b.m136509a("logEventKey");
        C0598y1 c0598y1 = new C0598y1();
        c0598y1.m900a(1);
        f1023b = m136509a.m136514b(c0598y1.m901b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("eventCount");
        C0598y1 c0598y12 = new C0598y1();
        c0598y12.m900a(2);
        f1024c = m136509a2.m136514b(c0598y12.m901b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("inferenceDurationStats");
        C0598y1 c0598y13 = new C0598y1();
        c0598y13.m900a(3);
        f1025d = m136509a3.m136514b(c0598y13.m901b()).m136513a();
    }

    private C0226e5() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        C0528u3 c0528u3 = (C0528u3) obj;
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f1023b, c0528u3.m878a());
        interfaceC26585d.mo671a(f1024c, c0528u3.m880c());
        interfaceC26585d.mo671a(f1025d, c0528u3.m879b());
    }
}
