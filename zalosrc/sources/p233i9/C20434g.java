package p233i9;

import com.google.firebase.C6576e;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import om0.InterfaceC24312a;
import p015a9.InterfaceC0662b;
import p035b9.InterfaceC2661e;

/* renamed from: i9.g */
/* loaded from: classes3.dex */
public final class C20434g implements InterfaceC24312a {

    /* renamed from: a */
    private final InterfaceC24312a f100609a;

    /* renamed from: b */
    private final InterfaceC24312a f100610b;

    /* renamed from: c */
    private final InterfaceC24312a f100611c;

    /* renamed from: d */
    private final InterfaceC24312a f100612d;

    /* renamed from: e */
    private final InterfaceC24312a f100613e;

    /* renamed from: f */
    private final InterfaceC24312a f100614f;

    /* renamed from: g */
    private final InterfaceC24312a f100615g;

    public C20434g(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5, InterfaceC24312a interfaceC24312a6, InterfaceC24312a interfaceC24312a7) {
        this.f100609a = interfaceC24312a;
        this.f100610b = interfaceC24312a2;
        this.f100611c = interfaceC24312a3;
        this.f100612d = interfaceC24312a4;
        this.f100613e = interfaceC24312a5;
        this.f100614f = interfaceC24312a6;
        this.f100615g = interfaceC24312a7;
    }

    /* renamed from: a */
    public static C20434g m106439a(InterfaceC24312a interfaceC24312a, InterfaceC24312a interfaceC24312a2, InterfaceC24312a interfaceC24312a3, InterfaceC24312a interfaceC24312a4, InterfaceC24312a interfaceC24312a5, InterfaceC24312a interfaceC24312a6, InterfaceC24312a interfaceC24312a7) {
        return new C20434g(interfaceC24312a, interfaceC24312a2, interfaceC24312a3, interfaceC24312a4, interfaceC24312a5, interfaceC24312a6, interfaceC24312a7);
    }

    /* renamed from: c */
    public static C20432e m106440c(C6576e c6576e, InterfaceC0662b interfaceC0662b, InterfaceC2661e interfaceC2661e, InterfaceC0662b interfaceC0662b2, RemoteConfigManager remoteConfigManager, C6662a c6662a, SessionManager sessionManager) {
        return new C20432e(c6576e, interfaceC0662b, interfaceC2661e, interfaceC0662b2, remoteConfigManager, c6662a, sessionManager);
    }

    @Override // om0.InterfaceC24312a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C20432e get() {
        return m106440c((C6576e) this.f100609a.get(), (InterfaceC0662b) this.f100610b.get(), (InterfaceC2661e) this.f100611c.get(), (InterfaceC0662b) this.f100612d.get(), (RemoteConfigManager) this.f100613e.get(), (C6662a) this.f100614f.get(), (SessionManager) this.f100615g.get());
    }
}
