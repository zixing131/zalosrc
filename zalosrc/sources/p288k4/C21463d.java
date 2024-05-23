package p288k4;

import p048c4.AbstractC3271d;
import p048c4.InterfaceC3269b;

/* renamed from: k4.d */
/* loaded from: classes.dex */
public final class C21463d implements InterfaceC3269b {

    /* renamed from: k4.d$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C21463d f104479a = new C21463d();
    }

    /* renamed from: a */
    public static C21463d m111052a() {
        return a.f104479a;
    }

    /* renamed from: c */
    public static InterfaceC21460a m111053c() {
        return (InterfaceC21460a) AbstractC3271d.m16651c(AbstractC21461b.m111047b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC21460a get() {
        return m111053c();
    }
}
