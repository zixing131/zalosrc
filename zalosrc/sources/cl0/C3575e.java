package cl0;

import bl0.C2837c;
import bl0.C2839e;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.C19071q;
import vk0.AbstractC28282d;
import vk0.C28284f;
import xk0.C29699f;
import zk0.InterfaceC32222a;

/* renamed from: cl0.e */
/* loaded from: classes7.dex */
public final class C3575e extends AbstractC28282d {

    /* renamed from: cl0.e$a */
    /* loaded from: classes7.dex */
    /* synthetic */ class a extends C19071q implements InterfaceC18494a {
        a(Object obj) {
            super(0, obj, C3575e.class, "currentTreeCacheStation", "currentTreeCacheStation()Lcom/zing/zalo/zinstant/universe/request/document/station/DOMCurrentTreeCacheStation;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C3583m mo12V4() {
            return ((C3575e) this.f94922q).m18163k();
        }
    }

    /* renamed from: cl0.e$b */
    /* loaded from: classes7.dex */
    /* synthetic */ class b extends C19071q implements InterfaceC18494a {
        b(Object obj) {
            super(0, obj, C3575e.class, "memCacheStation", "memCacheStation()Lcom/zing/zalo/zinstant/universe/request/document/station/DOMMemCacheStation;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C3590t mo12V4() {
            return ((C3575e) this.f94922q).m18165m();
        }
    }

    /* renamed from: cl0.e$c */
    /* loaded from: classes7.dex */
    /* synthetic */ class c extends C19071q implements InterfaceC18494a {
        c(Object obj) {
            super(0, obj, C3575e.class, "layoutCacheStation", "layoutCacheStation()Lcom/zing/zalo/zinstant/universe/request/document/station/DOMLayoutCacheStation;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C3588r mo12V4() {
            return ((C3575e) this.f94922q).m18164l();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3575e(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "info");
    }

    @Override // vk0.AbstractC28282d
    /* renamed from: i */
    public void mo18152i(C29699f c29699f) {
        AbstractC19074t.m100208f(c29699f, "spaceship");
        c29699f.m147694d(new a(this));
        c29699f.m147694d(new b(this));
        c29699f.m147694d(new c(this));
    }

    /* renamed from: k */
    public final C3583m m18163k() {
        return new C3583m((C2837c) m142531b(), m142532c());
    }

    /* renamed from: l */
    public final C3588r m18164l() {
        return new C3588r((C2837c) m142531b(), m142532c());
    }

    /* renamed from: m */
    public final C3590t m18165m() {
        return new C3590t((C2837c) m142531b(), m142532c());
    }

    @Override // vk0.AbstractC28282d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C2839e mo18153j() {
        return new C2839e(null, new C28284f(400, "cache - unknown"), 1, 0 == true ? 1 : 0);
    }
}
