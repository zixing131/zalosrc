package com.zing.zalo;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.k0 */
/* loaded from: classes3.dex */
public final class C8939k0 {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f47751a;

    /* renamed from: com.zing.zalo.k0$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f47752q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8939k0 mo12V4() {
            return c.f47753a.m47672a();
        }
    }

    /* renamed from: com.zing.zalo.k0$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8939k0 m47671a() {
            return (C8939k0) C8939k0.f47751a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.k0$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f47753a = new c();

        /* renamed from: b */
        private static final C8939k0 f47754b = new C8939k0(null);

        private c() {
        }

        /* renamed from: a */
        public final C8939k0 m47672a() {
            return f47754b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f47752q);
        f47751a = m129210a;
    }

    private C8939k0() {
    }

    public /* synthetic */ C8939k0(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: b */
    public final void m47669b(SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "data");
        C8937j0 c8937j0 = C8937j0.f47749a;
        c8937j0.m47666n("wifi", sensitiveData.m35528c(), c8937j0.m47665f(), 0L, sensitiveData.m35527b(), sensitiveData.m35526a());
    }
}
