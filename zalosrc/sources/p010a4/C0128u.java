package p010a4;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p179g4.InterfaceC19221e;
import p197h4.C19768r;
import p197h4.C19772v;
import p288k4.InterfaceC21460a;
import p668y3.C30276b;
import p668y3.InterfaceC30281g;
import p668y3.InterfaceC30282h;

/* renamed from: a4.u */
/* loaded from: classes.dex */
public class C0128u implements InterfaceC0127t {

    /* renamed from: e */
    private static volatile AbstractC0129v f706e;

    /* renamed from: a */
    private final InterfaceC21460a f707a;

    /* renamed from: b */
    private final InterfaceC21460a f708b;

    /* renamed from: c */
    private final InterfaceC19221e f709c;

    /* renamed from: d */
    private final C19768r f710d;

    public C0128u(InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2, InterfaceC19221e interfaceC19221e, C19768r c19768r, C19772v c19772v) {
        this.f707a = interfaceC21460a;
        this.f708b = interfaceC21460a2;
        this.f709c = interfaceC19221e;
        this.f710d = c19768r;
        c19772v.m103521c();
    }

    /* renamed from: b */
    private AbstractC0116i m560b(AbstractC0122o abstractC0122o) {
        return AbstractC0116i.m531a().mo499i(this.f707a.mo111045a()).mo501k(this.f708b.mo111045a()).mo500j(abstractC0122o.mo506g()).mo498h(new C0115h(abstractC0122o.mo502b(), abstractC0122o.m548d())).mo497g(abstractC0122o.mo503c().mo149411a()).mo494d();
    }

    /* renamed from: c */
    public static C0128u m561c() {
        AbstractC0129v abstractC0129v = f706e;
        if (abstractC0129v != null) {
            return abstractC0129v.mo523b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set m562d(InterfaceC0113f interfaceC0113f) {
        if (interfaceC0113f instanceof InterfaceC0114g) {
            return Collections.unmodifiableSet(((InterfaceC0114g) interfaceC0113f).mo528b());
        }
        return Collections.singleton(C30276b.m149414b("proto"));
    }

    /* renamed from: f */
    public static void m563f(Context context) {
        if (f706e == null) {
            synchronized (C0128u.class) {
                try {
                    if (f706e == null) {
                        f706e = C0112e.m520c().mo525b(context).mo524a();
                    }
                } finally {
                }
            }
        }
    }

    @Override // p010a4.InterfaceC0127t
    /* renamed from: a */
    public void mo559a(AbstractC0122o abstractC0122o, InterfaceC30282h interfaceC30282h) {
        this.f709c.mo100865a(abstractC0122o.mo505f().m551f(abstractC0122o.mo503c().mo149413c()), m560b(abstractC0122o), interfaceC30282h);
    }

    /* renamed from: e */
    public C19768r m564e() {
        return this.f710d;
    }

    /* renamed from: g */
    public InterfaceC30281g m565g(InterfaceC0113f interfaceC0113f) {
        return new C0124q(m562d(interfaceC0113f), AbstractC0123p.m549a().mo517b(interfaceC0113f.mo527a()).mo518c(interfaceC0113f.getExtras()).mo516a(), this);
    }
}
