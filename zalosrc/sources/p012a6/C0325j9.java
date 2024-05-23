package p012a6;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: a6.j9 */
/* loaded from: classes2.dex */
final class C0325j9 implements InterfaceC26584c {

    /* renamed from: a */
    static final C0325j9 f1534a = new C0325j9();

    /* renamed from: b */
    private static final C26583b f1535b;

    static {
        C26583b.b m136509a = C26583b.m136509a("errorCode");
        C0598y1 c0598y1 = new C0598y1();
        c0598y1.m900a(1);
        f1535b = m136509a.m136514b(c0598y1.m901b()).m136513a();
    }

    private C0325j9() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        ((InterfaceC26585d) obj2).mo671a(f1535b, ((C0406ne) obj).m789a());
    }
}
