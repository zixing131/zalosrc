package p670y5;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: y5.r6 */
/* loaded from: classes2.dex */
final class C30627r6 implements InterfaceC26584c {

    /* renamed from: a */
    static final C30627r6 f141717a = new C30627r6();

    /* renamed from: b */
    private static final C26583b f141718b;

    /* renamed from: c */
    private static final C26583b f141719c;

    /* renamed from: d */
    private static final C26583b f141720d;

    /* renamed from: e */
    private static final C26583b f141721e;

    /* renamed from: f */
    private static final C26583b f141722f;

    /* renamed from: g */
    private static final C26583b f141723g;

    static {
        C26583b.b m136509a = C26583b.m136509a("maxMs");
        C30433h2 c30433h2 = new C30433h2();
        c30433h2.m149528a(1);
        f141718b = m136509a.m136514b(c30433h2.m149529b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("minMs");
        C30433h2 c30433h22 = new C30433h2();
        c30433h22.m149528a(2);
        f141719c = m136509a2.m136514b(c30433h22.m149529b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("avgMs");
        C30433h2 c30433h23 = new C30433h2();
        c30433h23.m149528a(3);
        f141720d = m136509a3.m136514b(c30433h23.m149529b()).m136513a();
        C26583b.b m136509a4 = C26583b.m136509a("firstQuartileMs");
        C30433h2 c30433h24 = new C30433h2();
        c30433h24.m149528a(4);
        f141721e = m136509a4.m136514b(c30433h24.m149529b()).m136513a();
        C26583b.b m136509a5 = C26583b.m136509a("medianMs");
        C30433h2 c30433h25 = new C30433h2();
        c30433h25.m149528a(5);
        f141722f = m136509a5.m136514b(c30433h25.m149529b()).m136513a();
        C26583b.b m136509a6 = C26583b.m136509a("thirdQuartileMs");
        C30433h2 c30433h26 = new C30433h2();
        c30433h26.m149528a(6);
        f141723g = m136509a6.m136514b(c30433h26.m149529b()).m136513a();
    }

    private C30627r6() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        C30499kb c30499kb = (C30499kb) obj;
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f141718b, c30499kb.m149557c());
        interfaceC26585d.mo671a(f141719c, c30499kb.m149559e());
        interfaceC26585d.mo671a(f141720d, c30499kb.m149555a());
        interfaceC26585d.mo671a(f141721e, c30499kb.m149556b());
        interfaceC26585d.mo671a(f141722f, c30499kb.m149558d());
        interfaceC26585d.mo671a(f141723g, c30499kb.m149560f());
    }
}
