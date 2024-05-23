package p010a4;

import java.util.concurrent.Executor;
import p048c4.AbstractC3271d;
import p048c4.InterfaceC3269b;

/* renamed from: a4.k */
/* loaded from: classes.dex */
public final class C0118k implements InterfaceC3269b {

    /* renamed from: a4.k$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C0118k f694a = new C0118k();
    }

    /* renamed from: a */
    public static C0118k m541a() {
        return a.f694a;
    }

    /* renamed from: b */
    public static Executor m542b() {
        return (Executor) AbstractC3271d.m16651c(AbstractC0117j.m540a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m542b();
    }
}
