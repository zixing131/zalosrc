package com.zing.zalo;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.e */
/* loaded from: classes3.dex */
public final class C8011e {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f43819a;

    /* renamed from: com.zing.zalo.e$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f43820q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C8011e mo12V4() {
            return c.f43821a.m43186a();
        }
    }

    /* renamed from: com.zing.zalo.e$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8011e m43185a() {
            return (C8011e) C8011e.f43819a.getValue();
        }
    }

    /* renamed from: com.zing.zalo.e$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f43821a = new c();

        /* renamed from: b */
        private static final C8011e f43822b = new C8011e(null);

        private c() {
        }

        /* renamed from: a */
        public final C8011e m43186a() {
            return f43822b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f43820q);
        f43819a = m129210a;
    }

    private C8011e() {
    }

    public /* synthetic */ C8011e(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: b */
    public final void m43183b(SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "data");
        C8937j0 c8937j0 = C8937j0.f47749a;
        c8937j0.m47666n("clipboard", sensitiveData.m35528c(), c8937j0.m47665f(), 0L, sensitiveData.m35527b(), sensitiveData.m35526a());
    }
}
