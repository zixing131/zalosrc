package p012a6;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: a6.l9 */
/* loaded from: classes2.dex */
final class C0363l9 implements InterfaceC26584c {

    /* renamed from: a */
    static final C0363l9 f1605a = new C0363l9();

    /* renamed from: b */
    private static final C26583b f1606b;

    /* renamed from: c */
    private static final C26583b f1607c;

    /* renamed from: d */
    private static final C26583b f1608d;

    static {
        C26583b.b m136509a = C26583b.m136509a("languageOption");
        C0598y1 c0598y1 = new C0598y1();
        c0598y1.m900a(3);
        f1606b = m136509a.m136514b(c0598y1.m901b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("isUsingLegacyApi");
        C0598y1 c0598y12 = new C0598y1();
        c0598y12.m900a(4);
        f1607c = m136509a2.m136514b(c0598y12.m901b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("sdkVersion");
        C0598y1 c0598y13 = new C0598y1();
        c0598y13.m900a(5);
        f1608d = m136509a3.m136514b(c0598y13.m901b()).m136513a();
    }

    private C0363l9() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f1606b, ((C0539ue) obj).m881a());
        interfaceC26585d.mo671a(f1607c, null);
        interfaceC26585d.mo671a(f1608d, null);
    }
}
