package p179g4;

import java.util.concurrent.Executor;
import om0.InterfaceC24312a;
import p030b4.InterfaceC2511e;
import p048c4.InterfaceC3269b;
import p197h4.InterfaceC19774x;
import p228i4.InterfaceC20230d;
import p255j4.InterfaceC20913a;

/* renamed from: g4.d */
/* loaded from: classes.dex */
public final class C19220d implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f95686a;

    /* renamed from: b */
    private final InterfaceC24312a f95687b;

    /* renamed from: c */
    private final InterfaceC24312a f95688c;

    /* renamed from: d */
    private final InterfaceC24312a f95689d;

    /* renamed from: e */
    private final InterfaceC24312a f95690e;

    public C19220d(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5) {
        this.f95686a = interfaceC24312a;
        this.f95687b = interfaceC24312a2;
        this.f95688c = interfaceC24312a3;
        this.f95689d = interfaceC24312a4;
        this.f95690e = interfaceC24312a5;
    }

    /* renamed from: a */
    public static C19220d m100866a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5) {
        return new C19220d(interfaceC24312a, interfaceC24312a2, interfaceC24312a3, interfaceC24312a4, interfaceC24312a5);
    }

    /* renamed from: c */
    public static C19219c m100867c(Executor executor, InterfaceC2511e interfaceC2511e, InterfaceC19774x interfaceC19774x, InterfaceC20230d interfaceC20230d, InterfaceC20913a interfaceC20913a) {
        return new C19219c(executor, interfaceC2511e, interfaceC19774x, interfaceC20230d, interfaceC20913a);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C19219c get() {
        return m100867c((Executor) this.f95686a.get(), (InterfaceC2511e) this.f95687b.get(), (InterfaceC19774x) this.f95688c.get(), (InterfaceC20230d) this.f95689d.get(), (InterfaceC20913a) this.f95690e.get());
    }
}
