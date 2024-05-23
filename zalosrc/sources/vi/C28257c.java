package vi;

import fn0.AbstractC19074t;
import vc.EnumC27961a;

/* renamed from: vi.c */
/* loaded from: classes3.dex */
public class C28257c implements InterfaceC28256b {

    /* renamed from: a */
    private final InterfaceC28256b f131754a;

    /* renamed from: b */
    private final EnumC27961a f131755b;

    public C28257c(InterfaceC28256b interfaceC28256b, EnumC27961a enumC27961a) {
        AbstractC19074t.m100208f(interfaceC28256b, "wrapped");
        AbstractC19074t.m100208f(enumC27961a, "actionDrive");
        this.f131754a = interfaceC28256b;
        this.f131755b = enumC27961a;
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: a */
    public String mo142288a() {
        return this.f131754a.mo142288a();
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: b */
    public long mo142289b() {
        return this.f131754a.mo142289b();
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: c */
    public void mo142290c(long j11) {
        this.f131754a.mo142290c(j11);
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: d */
    public String mo142291d() {
        return this.f131754a.mo142291d();
    }

    /* renamed from: e */
    public final EnumC27961a m142293e() {
        return this.f131755b;
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: f */
    public String mo142292f() {
        return this.f131754a.mo142292f();
    }

    /* renamed from: g */
    public final InterfaceC28256b m142294g() {
        return this.f131754a;
    }

    public String toString() {
        return "actionDrive=" + this.f131755b + ", wrapped=" + this.f131754a;
    }
}
