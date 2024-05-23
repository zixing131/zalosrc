package p293k9;

import com.google.firebase.perf.session.SessionManager;
import nm0.AbstractC23885b;
import om0.InterfaceC24312a;

/* renamed from: k9.g */
/* loaded from: classes3.dex */
public final class C21604g implements InterfaceC24312a {

    /* renamed from: a */
    private final C21598a f104957a;

    public C21604g(C21598a c21598a) {
        this.f104957a = c21598a;
    }

    /* renamed from: a */
    public static C21604g m111541a(C21598a c21598a) {
        return new C21604g(c21598a);
    }

    /* renamed from: c */
    public static SessionManager m111542c(C21598a c21598a) {
        return (SessionManager) AbstractC23885b.m124958c(c21598a.m111524f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return m111542c(this.f104957a);
    }
}
