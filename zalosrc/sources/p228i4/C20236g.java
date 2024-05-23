package p228i4;

import p048c4.AbstractC3271d;
import p048c4.InterfaceC3269b;

/* renamed from: i4.g */
/* loaded from: classes.dex */
public final class C20236g implements InterfaceC3269b {

    /* renamed from: i4.g$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C20236g f100111a = new C20236g();
    }

    /* renamed from: a */
    public static C20236g m105733a() {
        return a.f100111a;
    }

    /* renamed from: b */
    public static String m105734b() {
        return (String) AbstractC3271d.m16651c(AbstractC20234f.m105729a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m105734b();
    }
}
