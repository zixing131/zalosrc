package com.zing.zalo;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.f */
/* loaded from: classes.dex */
public final class C8019f {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f43836a;

    /* renamed from: com.zing.zalo.f$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f43837q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8019f mo12V4() {
            return c.f43838a.m43206a();
        }
    }

    /* renamed from: com.zing.zalo.f$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8019f m43205a() {
            return (C8019f) C8019f.f43836a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.f$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f43838a = new c();

        /* renamed from: b */
        private static final C8019f f43839b = new C8019f(null);

        private c() {
        }

        /* renamed from: a */
        public final C8019f m43206a() {
            return f43839b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f43837q);
        f43836a = m129210a;
    }

    private C8019f() {
    }

    public /* synthetic */ C8019f(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: b */
    public final void m43203b(SensitiveData sensitiveData) {
        if (sensitiveData == null || sensitiveData.m35528c().length() == 0) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            new Exception("Access sensitive gallery data without define sourceId").printStackTrace();
            aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
            sensitiveData = new SensitiveData("unknown", "unknown", null, 4, null);
        }
        C8937j0 c8937j0 = C8937j0.f47749a;
        long m47665f = c8937j0.m47665f();
        AbstractC19074t.m100205c(sensitiveData);
        c8937j0.m47666n("gallery", sensitiveData.m35528c(), m47665f, 0L, sensitiveData.m35527b(), sensitiveData.m35526a());
    }
}
