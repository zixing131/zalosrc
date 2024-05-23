package p012a6;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;

/* renamed from: a6.f5 */
/* loaded from: classes2.dex */
final class C0245f5 implements InterfaceC26584c {

    /* renamed from: a */
    static final C0245f5 f1125a = new C0245f5();

    /* renamed from: b */
    private static final C26583b f1126b;

    /* renamed from: c */
    private static final C26583b f1127c;

    /* renamed from: d */
    private static final C26583b f1128d;

    /* renamed from: e */
    private static final C26583b f1129e;

    /* renamed from: f */
    private static final C26583b f1130f;

    static {
        C26583b.b m136509a = C26583b.m136509a("errorCode");
        C0598y1 c0598y1 = new C0598y1();
        c0598y1.m900a(1);
        f1126b = m136509a.m136514b(c0598y1.m901b()).m136513a();
        C26583b.b m136509a2 = C26583b.m136509a("hasResult");
        C0598y1 c0598y12 = new C0598y1();
        c0598y12.m900a(2);
        f1127c = m136509a2.m136514b(c0598y12.m901b()).m136513a();
        C26583b.b m136509a3 = C26583b.m136509a("isColdCall");
        C0598y1 c0598y13 = new C0598y1();
        c0598y13.m900a(3);
        f1128d = m136509a3.m136514b(c0598y13.m901b()).m136513a();
        C26583b.b m136509a4 = C26583b.m136509a("imageInfo");
        C0598y1 c0598y14 = new C0598y1();
        c0598y14.m900a(4);
        f1129e = m136509a4.m136514b(c0598y14.m901b()).m136513a();
        C26583b.b m136509a5 = C26583b.m136509a("recognizerOptions");
        C0598y1 c0598y15 = new C0598y1();
        c0598y15.m900a(5);
        f1130f = m136509a5.m136514b(c0598y15.m901b()).m136513a();
    }

    private C0245f5() {
    }

    @Override // p520t8.InterfaceC26584c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
        C0490s3 c0490s3 = (C0490s3) obj;
        InterfaceC26585d interfaceC26585d = (InterfaceC26585d) obj2;
        interfaceC26585d.mo671a(f1126b, c0490s3.m872a());
        interfaceC26585d.mo671a(f1127c, null);
        interfaceC26585d.mo671a(f1128d, c0490s3.m874c());
        interfaceC26585d.mo671a(f1129e, null);
        interfaceC26585d.mo671a(f1130f, c0490s3.m873b());
    }
}
