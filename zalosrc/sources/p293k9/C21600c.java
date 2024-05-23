package p293k9;

import com.google.firebase.C6576e;
import nm0.AbstractC23885b;
import om0.InterfaceC24312a;

/* renamed from: k9.c */
/* loaded from: classes3.dex */
public final class C21600c implements InterfaceC24312a {

    /* renamed from: a */
    private final C21598a f104953a;

    public C21600c(C21598a c21598a) {
        this.f104953a = c21598a;
    }

    /* renamed from: a */
    public static C21600c m111529a(C21598a c21598a) {
        return new C21600c(c21598a);
    }

    /* renamed from: c */
    public static C6576e m111530c(C21598a c21598a) {
        return (C6576e) AbstractC23885b.m124958c(c21598a.m111520b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6576e get() {
        return m111530c(this.f104953a);
    }
}
