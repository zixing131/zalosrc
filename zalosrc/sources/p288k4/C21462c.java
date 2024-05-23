package p288k4;

import p048c4.AbstractC3271d;
import p048c4.InterfaceC3269b;

/* renamed from: k4.c */
/* loaded from: classes.dex */
public final class C21462c implements InterfaceC3269b {

    /* renamed from: k4.c$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C21462c f104478a = new C21462c();
    }

    /* renamed from: a */
    public static C21462c m111048a() {
        return a.f104478a;
    }

    /* renamed from: b */
    public static InterfaceC21460a m111049b() {
        return (InterfaceC21460a) AbstractC3271d.m16651c(AbstractC21461b.m111046a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC21460a get() {
        return m111049b();
    }
}
