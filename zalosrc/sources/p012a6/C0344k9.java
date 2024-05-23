package p012a6;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: a6.k9 */
/* loaded from: classes2.dex */
final class C0344k9 implements InterfaceC26584c {

    /* renamed from: a */
    static final C0344k9 f1559a = new C0344k9();

    /* renamed from: b */
    private static final C26583b f1560b;

    /* renamed from: c */
    private static final C26583b f1561c;

    /* renamed from: d */
    private static final C26583b f1562d;

    static {
        C26583b.b m136509a = C26583b.m136509a("inferenceCommonLogEvent");
        C0598y1 c0598y1 = new C0598y1();
        c0598y1.m900a(1);
        f1560b = m136509a.m136514b(c0598y1.m901b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("imageInfo");
        C0598y1 c0598y12 = new C0598y1();
        c0598y12.m900a(2);
        f1561c = m136509a2.m136514b(c0598y12.m901b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("recognizerOptions");
        C0598y1 c0598y13 = new C0598y1();
        c0598y13.m900a(3);
        f1562d = m136509a3.m136514b(c0598y13.m901b()).m136513a();
    }

    private C0344k9() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        C0463qe c0463qe = (C0463qe) obj;
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f1560b, c0463qe.m854b());
        interfaceC26585d.mo671a(f1561c, c0463qe.m853a());
        interfaceC26585d.mo671a(f1562d, c0463qe.m855c());
    }
}
