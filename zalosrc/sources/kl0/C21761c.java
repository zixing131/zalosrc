package kl0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.C19071q;
import jl0.C21285a;
import jl0.C21287c;
import vk0.AbstractC28282d;
import vk0.C28284f;
import xk0.C29699f;
import zk0.InterfaceC32222a;

/* renamed from: kl0.c */
/* loaded from: classes7.dex */
public final class C21761c extends AbstractC28282d {

    /* renamed from: kl0.c$a */
    /* loaded from: classes7.dex */
    /* synthetic */ class a extends C19071q implements InterfaceC18494a {
        a(Object obj) {
            super(0, obj, C21761c.class, "cacheStation", "cacheStation()Lcom/zing/zalo/zinstant/universe/request/zinstantdata/station/ZinstantDataCacheStation;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C21760b mo12V4() {
            return ((C21761c) this.f94922q).m112250k();
        }
    }

    /* renamed from: kl0.c$b */
    /* loaded from: classes7.dex */
    /* synthetic */ class b extends C19071q implements InterfaceC18494a {
        b(Object obj) {
            super(0, obj, C21761c.class, "remoteStation", "remoteStation()Lcom/zing/zalo/zinstant/universe/request/zinstantdata/station/ZinstantDataRemoteStation;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C21764f mo12V4() {
            return ((C21761c) this.f94922q).m112251l();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21761c(C21285a c21285a, InterfaceC32222a interfaceC32222a) {
        super(c21285a, interfaceC32222a);
        AbstractC19074t.m100208f(c21285a, "info");
    }

    @Override // vk0.AbstractC28282d
    /* renamed from: i */
    public void mo18152i(C29699f c29699f) {
        AbstractC19074t.m100208f(c29699f, "spaceship");
        c29699f.m147694d(new a(this));
        c29699f.m147694d(new b(this));
    }

    /* renamed from: k */
    public final C21760b m112250k() {
        return new C21760b((C21285a) m142531b(), m142532c());
    }

    /* renamed from: l */
    public final C21764f m112251l() {
        return new C21764f((C21285a) m142531b(), m142532c());
    }

    @Override // vk0.AbstractC28282d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C21287c mo18153j() {
        return new C21287c(null, new C28284f(300, "zinstantdata - unknown"), 1, null);
    }
}
