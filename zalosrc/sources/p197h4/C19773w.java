package p197h4;

import java.util.concurrent.Executor;
import om0.InterfaceC24312a;
import p048c4.InterfaceC3269b;
import p228i4.InterfaceC20230d;
import p255j4.InterfaceC20913a;

/* renamed from: h4.w */
/* loaded from: classes.dex */
public final class C19773w implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f97920a;

    /* renamed from: b */
    private final InterfaceC24312a f97921b;

    /* renamed from: c */
    private final InterfaceC24312a f97922c;

    /* renamed from: d */
    private final InterfaceC24312a f97923d;

    public C19773w(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4) {
        this.f97920a = interfaceC24312a;
        this.f97921b = interfaceC24312a2;
        this.f97922c = interfaceC24312a3;
        this.f97923d = interfaceC24312a4;
    }

    /* renamed from: a */
    public static C19773w m103522a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4) {
        return new C19773w(interfaceC24312a, interfaceC24312a2, interfaceC24312a3, interfaceC24312a4);
    }

    /* renamed from: c */
    public static C19772v m103523c(Executor executor, InterfaceC20230d interfaceC20230d, InterfaceC19774x interfaceC19774x, InterfaceC20913a interfaceC20913a) {
        return new C19772v(executor, interfaceC20230d, interfaceC19774x, interfaceC20913a);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C19772v get() {
        return m103523c((Executor) this.f97920a.get(), (InterfaceC20230d) this.f97921b.get(), (InterfaceC19774x) this.f97922c.get(), (InterfaceC20913a) this.f97923d.get());
    }
}
