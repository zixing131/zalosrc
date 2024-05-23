package p010a4;

import p668y3.AbstractC30277c;
import p668y3.C30276b;
import p668y3.InterfaceC30279e;
import p668y3.InterfaceC30280f;
import p668y3.InterfaceC30282h;

/* renamed from: a4.s */
/* loaded from: classes.dex */
final class C0126s implements InterfaceC30280f {

    /* renamed from: a */
    private final AbstractC0123p f701a;

    /* renamed from: b */
    private final String f702b;

    /* renamed from: c */
    private final C30276b f703c;

    /* renamed from: d */
    private final InterfaceC30279e f704d;

    /* renamed from: e */
    private final InterfaceC0127t f705e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0126s(AbstractC0123p abstractC0123p, String str, C30276b c30276b, InterfaceC30279e interfaceC30279e, InterfaceC0127t interfaceC0127t) {
        this.f701a = abstractC0123p;
        this.f702b = str;
        this.f703c = c30276b;
        this.f704d = interfaceC30279e;
        this.f705e = interfaceC0127t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m555e(Exception exc) {
    }

    @Override // p668y3.InterfaceC30280f
    /* renamed from: a */
    public void mo556a(AbstractC30277c abstractC30277c, InterfaceC30282h interfaceC30282h) {
        this.f705e.mo559a(AbstractC0122o.m547a().mo511e(this.f701a).mo509c(abstractC30277c).mo512f(this.f702b).mo510d(this.f704d).mo508b(this.f703c).mo507a(), interfaceC30282h);
    }

    @Override // p668y3.InterfaceC30280f
    /* renamed from: b */
    public void mo557b(AbstractC30277c abstractC30277c) {
        mo556a(abstractC30277c, new InterfaceC30282h() { // from class: a4.r
            @Override // p668y3.InterfaceC30282h
            /* renamed from: a */
            public final void mo553a(Exception exc) {
                C0126s.m555e(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC0123p m558d() {
        return this.f701a;
    }
}
