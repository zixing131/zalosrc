package p228i4;

import p048c4.AbstractC3271d;
import p048c4.InterfaceC3269b;

/* renamed from: i4.j */
/* loaded from: classes.dex */
public final class C20242j implements InterfaceC3269b {

    /* renamed from: i4.j$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C20242j f100117a = new C20242j();
    }

    /* renamed from: a */
    public static C20242j m105745a() {
        return a.f100117a;
    }

    /* renamed from: c */
    public static AbstractC20232e m105746c() {
        return (AbstractC20232e) AbstractC3271d.m16651c(AbstractC20234f.m105732d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC20232e get() {
        return m105746c();
    }
}
