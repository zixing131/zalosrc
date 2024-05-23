package com.zing.zalo;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.a */
/* loaded from: classes.dex */
public final class C6917a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f37899a;

    /* renamed from: com.zing.zalo.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f37900q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6917a mo12V4() {
            return c.f37901a.m35543a();
        }
    }

    /* renamed from: com.zing.zalo.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C6917a m35542a() {
            return (C6917a) C6917a.f37899a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f37901a = new c();

        /* renamed from: b */
        private static final C6917a f37902b = new C6917a(null);

        private c() {
        }

        /* renamed from: a */
        public final C6917a m35543a() {
            return f37902b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f37900q);
        f37899a = m129210a;
    }

    private C6917a() {
    }

    public /* synthetic */ C6917a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: b */
    public final void m35540b(SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "data");
        C8937j0 c8937j0 = C8937j0.f47749a;
        c8937j0.m47666n("ads_id", sensitiveData.m35528c(), c8937j0.m47665f(), 0L, sensitiveData.m35527b(), sensitiveData.m35526a());
    }
}
