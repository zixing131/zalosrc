package p293k9;

import com.google.firebase.perf.config.C6662a;
import nm0.AbstractC23885b;
import om0.InterfaceC24312a;

/* renamed from: k9.b */
/* loaded from: classes3.dex */
public final class C21599b implements InterfaceC24312a {

    /* renamed from: a */
    private final C21598a f104952a;

    public C21599b(C21598a c21598a) {
        this.f104952a = c21598a;
    }

    /* renamed from: a */
    public static C21599b m111526a(C21598a c21598a) {
        return new C21599b(c21598a);
    }

    /* renamed from: c */
    public static C6662a m111527c(C21598a c21598a) {
        return (C6662a) AbstractC23885b.m124958c(c21598a.m111519a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6662a get() {
        return m111527c(this.f104952a);
    }
}
