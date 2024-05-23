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

/* renamed from: cl0.g */
/* loaded from: classes7.dex */
public final class C3577g extends AbstractC28282d {

    /* renamed from: cl0.g$a */
    /* loaded from: classes7.dex */
    /* synthetic */ class a extends C19071q implements InterfaceC18494a {
        a(Object obj) {
            super(0, obj, C3577g.class, "cacheStation", "cacheStation()Lcom/zing/zalo/zinstant/universe/request/document/station/DOMCacheStation;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C3576f mo12V4() {
            return ((C3577g) this.f94922q).m18171l();
        }
    }

    /* renamed from: cl0.g$b */
    /* loaded from: classes7.dex */
    /* synthetic */ class b extends C19071q implements InterfaceC18494a {
        b(Object obj) {
            super(0, obj, C3577g.class, "base64Station", "base64Station()Lcom/zing/zalo/zinstant/universe/request/document/station/DOMBase64Station;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C3572b mo12V4() {
            return ((C3577g) this.f94922q).m18170k();
        }
    }

    /* renamed from: cl0.g$c */
    /* loaded from: classes7.dex */
    /* synthetic */ class c extends C19071q implements InterfaceC18494a {
        c(Object obj) {
            super(0, obj, C3577g.class, "fileStation", "fileStation()Lcom/zing/zalo/zinstant/universe/request/document/station/DOMFileStation;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C3586p mo12V4() {
            return ((C3577g) this.f94922q).m18173n();
        }
    }

    /* renamed from: cl0.g$d */
    /* loaded from: classes7.dex */
    /* synthetic */ class d extends C19071q implements InterfaceC18494a {
        d(Object obj) {
            super(0, obj, C3577g.class, "fileCacheStation", "fileCacheStation()Lcom/zing/zalo/zinstant/universe/request/document/station/DOMCacheFileStation;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C3574d mo12V4() {
            return ((C3577g) this.f94922q).m18172m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3577g(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "info");
    }

    @Override // vk0.AbstractC28282d
    /* renamed from: i */
    public void mo18152i(C29699f c29699f) {
        AbstractC19074t.m100208f(c29699f, "spaceship");
        c29699f.m147694d(new a(this));
        if (m18174o()) {
            c29699f.m147694d(new b(this));
        }
        if (m18175p()) {
            c29699f.m147694d(new c(this));
        } else {
            c29699f.m147694d(new d(this));
        }
    }

    /* renamed from: k */
    public final C3572b m18170k() {
        return new C3572b((C2837c) m142531b(), m142532c());
    }

    /* renamed from: l */
    public final C3576f m18171l() {
        return new C3576f((C2837c) m142531b(), m142532c());
    }

    /* renamed from: m */
    public final C3574d m18172m() {
        return new C3574d((C2837c) m142531b(), m142532c());
    }

    /* renamed from: n */
    public final C3586p m18173n() {
        return new C3586p((C2837c) m142531b(), m142532c());
    }

    /* renamed from: o */
    public final boolean m18174o() {
        if (((C2837c) m142531b()).m13703h().m99733c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m18175p() {
        if (((C2837c) m142531b()).m13703h().m99737g() != null) {
            return true;
        }
        return false;
    }

    @Override // vk0.AbstractC28282d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C2839e mo18153j() {
        return new C2839e(null, new C28284f(400, "document central - unknown"), 1, 0 == true ? 1 : 0);
    }
}
