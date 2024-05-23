package p228i4;

import om0.InterfaceC24312a;
import p048c4.InterfaceC3269b;
import p288k4.InterfaceC21460a;

/* renamed from: i4.n0 */
/* loaded from: classes.dex */
public final class C20251n0 implements InterfaceC3269b {

    /* renamed from: a */
    private final InterfaceC24312a f100136a;

    /* renamed from: b */
    private final InterfaceC24312a f100137b;

    /* renamed from: c */
    private final InterfaceC24312a f100138c;

    /* renamed from: d */
    private final InterfaceC24312a f100139d;

    /* renamed from: e */
    private final InterfaceC24312a f100140e;

    public C20251n0(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5) {
        this.f100136a = interfaceC24312a;
        this.f100137b = interfaceC24312a2;
        this.f100138c = interfaceC24312a3;
        this.f100139d = interfaceC24312a4;
        this.f100140e = interfaceC24312a5;
    }

    /* renamed from: a */
    public static C20251n0 m105823a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5) {
        return new C20251n0(interfaceC24312a, interfaceC24312a2, interfaceC24312a3, interfaceC24312a4, interfaceC24312a5);
    }

    /* renamed from: c */
    public static C20249m0 m105824c(InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2, Object obj, Object obj2, InterfaceC24312a interfaceC24312a) {
        return new C20249m0(interfaceC21460a, interfaceC21460a2, (AbstractC20232e) obj, (C20263t0) obj2, interfaceC24312a);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C20249m0 get() {
        return m105824c((InterfaceC21460a) this.f100136a.get(), (InterfaceC21460a) this.f100137b.get(), this.f100138c.get(), this.f100139d.get(), this.f100140e);
    }
}
