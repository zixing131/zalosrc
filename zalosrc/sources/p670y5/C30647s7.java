package p670y5;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: y5.s7 */
/* loaded from: classes2.dex */
final class C30647s7 implements InterfaceC26584c {

    /* renamed from: a */
    static final C30647s7 f141779a = new C30647s7();

    /* renamed from: b */
    private static final C26583b f141780b;

    /* renamed from: c */
    private static final C26583b f141781c;

    /* renamed from: d */
    private static final C26583b f141782d;

    /* renamed from: e */
    private static final C26583b f141783e;

    /* renamed from: f */
    private static final C26583b f141784f;

    static {
        C26583b.b m136509a = C26583b.m136509a("inferenceCommonLogEvent");
        C30433h2 c30433h2 = new C30433h2();
        c30433h2.m149528a(1);
        f141780b = m136509a.m136514b(c30433h2.m149529b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("options");
        C30433h2 c30433h22 = new C30433h2();
        c30433h22.m149528a(2);
        f141781c = m136509a2.m136514b(c30433h22.m149529b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("detectedBarcodeFormats");
        C30433h2 c30433h23 = new C30433h2();
        c30433h23.m149528a(3);
        f141782d = m136509a3.m136514b(c30433h23.m149529b()).m136513a();
        C26583b.b m136509a4 = C26583b.m136509a("detectedBarcodeValueTypes");
        C30433h2 c30433h24 = new C30433h2();
        c30433h24.m149528a(4);
        f141783e = m136509a4.m136514b(c30433h24.m149529b()).m136513a();
        C26583b.b m136509a5 = C26583b.m136509a("imageInfo");
        C30433h2 c30433h25 = new C30433h2();
        c30433h25.m149528a(5);
        f141784f = m136509a5.m136514b(c30433h25.m149529b()).m136513a();
    }

    private C30647s7() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        C30690uc c30690uc = (C30690uc) obj;
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f141780b, c30690uc.m149661d());
        interfaceC26585d.mo671a(f141781c, c30690uc.m149662e());
        interfaceC26585d.mo671a(f141782d, c30690uc.m149658a());
        interfaceC26585d.mo671a(f141783e, c30690uc.m149659b());
        interfaceC26585d.mo671a(f141784f, c30690uc.m149660c());
    }
}
