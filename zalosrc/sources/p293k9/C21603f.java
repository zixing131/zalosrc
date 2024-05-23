package p293k9;

import com.google.firebase.perf.config.RemoteConfigManager;
import nm0.AbstractC23885b;
import om0.InterfaceC24312a;

/* renamed from: k9.f */
/* loaded from: classes3.dex */
public final class C21603f implements InterfaceC24312a {

    /* renamed from: a */
    private final C21598a f104956a;

    public C21603f(C21598a c21598a) {
        this.f104956a = c21598a;
    }

    /* renamed from: a */
    public static C21603f m111538a(C21598a c21598a) {
        return new C21603f(c21598a);
    }

    /* renamed from: c */
    public static RemoteConfigManager m111539c(C21598a c21598a) {
        return (RemoteConfigManager) AbstractC23885b.m124958c(c21598a.m111523e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return m111539c(this.f104956a);
    }
}
