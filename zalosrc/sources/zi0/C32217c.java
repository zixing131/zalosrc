package zi0;

import p173fz.C19172a;

/* renamed from: zi0.c */
/* loaded from: classes.dex */
public final class C32217c implements InterfaceC32215a {

    /* renamed from: b */
    private static boolean f148613b;

    /* renamed from: a */
    public static final C32217c f148612a = new C32217c();

    /* renamed from: c */
    private static String f148614c = "https://pay.zalo.me/iap/gg/receipt";

    private C32217c() {
    }

    @Override // zi0.InterfaceC32215a
    /* renamed from: a */
    public boolean mo155338a() {
        return f148613b;
    }

    @Override // zi0.InterfaceC32215a
    /* renamed from: b */
    public String mo155339b() {
        return f148614c;
    }

    /* renamed from: c */
    public final void m155342c() {
        boolean z11 = false;
        if (C19172a.m100600k("features@inapp_billing@enable", 0) == 1) {
            z11 = true;
        }
        f148613b = z11;
        f148614c = C19172a.m100607r("features@inapp_billing@verify_url", "https://pay.zalo.me/iap/gg/receipt");
    }
}
