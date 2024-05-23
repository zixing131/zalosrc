package p012a6;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: a6.r6 */
/* loaded from: classes2.dex */
final class C0474r6 implements InterfaceC26584c {

    /* renamed from: a */
    static final C0474r6 f1847a = new C0474r6();

    /* renamed from: b */
    private static final C26583b f1848b;

    /* renamed from: c */
    private static final C26583b f1849c;

    /* renamed from: d */
    private static final C26583b f1850d;

    /* renamed from: e */
    private static final C26583b f1851e;

    static {
        C26583b.b m136509a = C26583b.m136509a("imageFormat");
        C0598y1 c0598y1 = new C0598y1();
        c0598y1.m900a(1);
        f1848b = m136509a.m136514b(c0598y1.m901b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("originalImageSize");
        C0598y1 c0598y12 = new C0598y1();
        c0598y12.m900a(2);
        f1849c = m136509a2.m136514b(c0598y12.m901b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("compressedImageSize");
        C0598y1 c0598y13 = new C0598y1();
        c0598y13.m900a(3);
        f1850d = m136509a3.m136514b(c0598y13.m901b()).m136513a();
        C26583b.b m136509a4 = C26583b.m136509a("isOdmlImage");
        C0598y1 c0598y14 = new C0598y1();
        c0598y14.m900a(4);
        f1851e = m136509a4.m136514b(c0598y14.m901b()).m136513a();
    }

    private C0474r6() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        C0479rb c0479rb = (C0479rb) obj;
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f1848b, c0479rb.m863a());
        interfaceC26585d.mo671a(f1849c, c0479rb.m864b());
        interfaceC26585d.mo671a(f1850d, null);
        interfaceC26585d.mo671a(f1851e, null);
    }
}
