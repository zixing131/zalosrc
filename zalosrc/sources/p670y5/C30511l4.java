package p670y5;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: y5.l4 */
/* loaded from: classes2.dex */
final class C30511l4 implements InterfaceC26584c {

    /* renamed from: a */
    static final C30511l4 f141464a = new C30511l4();

    /* renamed from: b */
    private static final C26583b f141465b;

    /* renamed from: c */
    private static final C26583b f141466c;

    /* renamed from: d */
    private static final C26583b f141467d;

    static {
        C26583b.b m136509a = C26583b.m136509a("logEventKey");
        C30433h2 c30433h2 = new C30433h2();
        c30433h2.m149528a(1);
        f141465b = m136509a.m136514b(c30433h2.m149529b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("eventCount");
        C30433h2 c30433h22 = new C30433h2();
        c30433h22.m149528a(2);
        f141466c = m136509a2.m136514b(c30433h22.m149529b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("inferenceDurationStats");
        C30433h2 c30433h23 = new C30433h2();
        c30433h23.m149528a(3);
        f141467d = m136509a3.m136514b(c30433h23.m149529b()).m136513a();
    }

    private C30511l4() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        C30339c3 c30339c3 = (C30339c3) obj;
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f141465b, c30339c3.m149469a());
        interfaceC26585d.mo671a(f141466c, c30339c3.m149471c());
        interfaceC26585d.mo671a(f141467d, c30339c3.m149470b());
    }
}
