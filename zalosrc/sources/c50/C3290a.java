package c50;

import fn0.AbstractC19074t;

/* renamed from: c50.a */
/* loaded from: classes5.dex */
public final class C3290a {

    /* renamed from: a */
    public static final C3290a f14080a = new C3290a();

    private C3290a() {
    }

    /* renamed from: a */
    public final EnumC3291b m16708a(String str, String str2) {
        AbstractC19074t.m100208f(str, "inputKey");
        AbstractC19074t.m100208f(str2, "pinCode");
        return m16709b(str, str2.length());
    }

    /* renamed from: b */
    public final EnumC3291b m16709b(String str, int i11) {
        AbstractC19074t.m100208f(str, "inputKey");
        if (str.length() == 0) {
            return EnumC3291b.f14081p;
        }
        if (str.length() < i11) {
            return EnumC3291b.f14082q;
        }
        if (str.length() == i11) {
            return EnumC3291b.f14083r;
        }
        return EnumC3291b.f14084s;
    }
}
