package p670y5;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: y5.x6 */
/* loaded from: classes2.dex */
final class C30741x6 implements InterfaceC26584c {

    /* renamed from: a */
    static final C30741x6 f141995a = new C30741x6();

    /* renamed from: b */
    private static final C26583b f141996b;

    /* renamed from: c */
    private static final C26583b f141997c;

    /* renamed from: d */
    private static final C26583b f141998d;

    /* renamed from: e */
    private static final C26583b f141999e;

    static {
        C26583b.b m136509a = C26583b.m136509a("imageFormat");
        C30433h2 c30433h2 = new C30433h2();
        c30433h2.m149528a(1);
        f141996b = m136509a.m136514b(c30433h2.m149529b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("originalImageSize");
        C30433h2 c30433h22 = new C30433h2();
        c30433h22.m149528a(2);
        f141997c = m136509a2.m136514b(c30433h22.m149529b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("compressedImageSize");
        C30433h2 c30433h23 = new C30433h2();
        c30433h23.m149528a(3);
        f141998d = m136509a3.m136514b(c30433h23.m149529b()).m136513a();
        C26583b.b m136509a4 = C26583b.m136509a("isOdmlImage");
        C30433h2 c30433h24 = new C30433h2();
        c30433h24.m149528a(4);
        f141999e = m136509a4.m136514b(c30433h24.m149529b()).m136513a();
    }

    private C30741x6() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        C30632rb c30632rb = (C30632rb) obj;
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f141996b, c30632rb.m149618a());
        interfaceC26585d.mo671a(f141997c, c30632rb.m149619b());
        interfaceC26585d.mo671a(f141998d, null);
        interfaceC26585d.mo671a(f141999e, null);
    }
}
