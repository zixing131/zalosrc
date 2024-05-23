package gl0;

import fl0.AbstractC18997h;
import fl0.C18990a;
import fl0.C18992c;
import fl0.C18996g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ik0.AbstractC20601x;
import ik0.InterfaceC20585h;
import ik0.InterfaceC20587j;
import pj0.InterfaceC24775a;

/* renamed from: gl0.d */
/* loaded from: classes7.dex */
public final class C19482d extends AbstractC18997h {

    /* renamed from: b */
    private final int f96644b;

    /* renamed from: c */
    private final C18996g f96645c;

    /* renamed from: d */
    private final C18992c f96646d;

    /* renamed from: e */
    private final C18990a f96647e;

    /* renamed from: f */
    private final InterfaceC20587j f96648f;

    /* renamed from: g */
    private final InterfaceC20585h f96649g;

    /* renamed from: h */
    private final InterfaceC24775a f96650h;

    public /* synthetic */ C19482d(int i11, C18996g c18996g, C18992c c18992c, C18990a c18990a, InterfaceC20587j interfaceC20587j, InterfaceC20585h interfaceC20585h, InterfaceC24775a interfaceC24775a, AbstractC20601x abstractC20601x, int i12, AbstractC19060k abstractC19060k) {
        this(i11, c18996g, c18992c, c18990a, interfaceC20587j, interfaceC20585h, (i12 & 64) != 0 ? new C19487i(null) : interfaceC24775a, abstractC20601x);
    }

    /* renamed from: b */
    public final InterfaceC20587j m101845b() {
        return this.f96648f;
    }

    /* renamed from: c */
    public final int m101846c() {
        return this.f96644b;
    }

    /* renamed from: d */
    public final C18990a m101847d() {
        return this.f96647e;
    }

    /* renamed from: e */
    public final C18992c m101848e() {
        return this.f96646d;
    }

    /* renamed from: f */
    public final InterfaceC20585h m101849f() {
        return this.f96649g;
    }

    /* renamed from: g */
    public final InterfaceC24775a m101850g() {
        return this.f96650h;
    }

    /* renamed from: h */
    public final C18996g m101851h() {
        return this.f96645c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19482d(int i11, C18996g c18996g, C18992c c18992c, C18990a c18990a, InterfaceC20587j interfaceC20587j, InterfaceC20585h interfaceC20585h, InterfaceC24775a interfaceC24775a, AbstractC20601x abstractC20601x) {
        super(abstractC20601x);
        AbstractC19074t.m100208f(c18996g, "utility");
        AbstractC19074t.m100208f(c18992c, "environment");
        AbstractC19074t.m100208f(c18990a, "config");
        AbstractC19074t.m100208f(interfaceC20587j, "callback");
        AbstractC19074t.m100208f(interfaceC20585h, "layoutListener");
        AbstractC19074t.m100208f(interfaceC24775a, "preloadCallback");
        AbstractC19074t.m100208f(abstractC20601x, "zinstantRequest");
        this.f96644b = i11;
        this.f96645c = c18996g;
        this.f96646d = c18992c;
        this.f96647e = c18990a;
        this.f96648f = interfaceC20587j;
        this.f96649g = interfaceC20585h;
        this.f96650h = interfaceC24775a;
    }
}
