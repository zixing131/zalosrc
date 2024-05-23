package com.zing.zalo;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.c */
/* loaded from: classes3.dex */
public final class C7408c {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f40272a;

    /* renamed from: com.zing.zalo.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f40273q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7408c mo12V4() {
            return c.f40274a.m37630a();
        }
    }

    /* renamed from: com.zing.zalo.c$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7408c m37629a() {
            return (C7408c) C7408c.f40272a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.c$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f40274a = new c();

        /* renamed from: b */
        private static final C7408c f40275b = new C7408c(null);

        private c() {
        }

        /* renamed from: a */
        public final C7408c m37630a() {
            return f40275b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f40273q);
        f40272a = m129210a;
    }

    private C7408c() {
    }

    public /* synthetic */ C7408c(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: b */
    public final void m37627b(SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "data");
        C8937j0 c8937j0 = C8937j0.f47749a;
        c8937j0.m47666n("callLog", sensitiveData.m35528c(), c8937j0.m47665f(), 0L, sensitiveData.m35527b(), sensitiveData.m35526a());
    }
}
