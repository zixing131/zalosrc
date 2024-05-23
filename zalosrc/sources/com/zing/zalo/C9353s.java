package com.zing.zalo;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.ConcurrentHashMap;
import pm0.AbstractC24856m;
import pm0.C24860q;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.s */
/* loaded from: classes.dex */
public final class C9353s {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f49524b;

    /* renamed from: a */
    private final ConcurrentHashMap f49525a;

    /* renamed from: com.zing.zalo.s$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f49526q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9353s mo12V4() {
            return c.f49527a.m50397a();
        }
    }

    /* renamed from: com.zing.zalo.s$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C9353s m50396a() {
            return (C9353s) C9353s.f49524b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.s$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f49527a = new c();

        /* renamed from: b */
        private static final C9353s f49528b = new C9353s(null);

        private c() {
        }

        /* renamed from: a */
        public final C9353s m50397a() {
            return f49528b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f49526q);
        f49524b = m129210a;
    }

    public /* synthetic */ C9353s(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    private final void m50391c(String str, C24860q c24860q) {
        SensitiveExtraData sensitiveExtraData;
        SensitiveData sensitiveData;
        if (this.f49525a.get(str) == null) {
            return;
        }
        C24860q c24860q2 = (C24860q) this.f49525a.get(str);
        SensitiveData sensitiveData2 = null;
        if (c24860q2 != null && (sensitiveData = (SensitiveData) c24860q2.m129215c()) != null) {
            sensitiveExtraData = sensitiveData.m35526a();
        } else {
            sensitiveExtraData = null;
        }
        if (sensitiveExtraData == null) {
            sensitiveExtraData = new SensitiveExtraData();
        }
        sensitiveExtraData.m35534c((String) c24860q.m129215c(), c24860q.m129216d());
        C24860q c24860q3 = (C24860q) this.f49525a.get(str);
        if (c24860q3 != null) {
            sensitiveData2 = (SensitiveData) c24860q3.m129215c();
        }
        if (sensitiveData2 != null) {
            sensitiveData2.m35529d(sensitiveExtraData);
        }
    }

    /* renamed from: b */
    public final void m50392b(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "sourceId");
        if (this.f49525a.get(str) == null) {
            return;
        }
        m50391c(str, new C24860q("isSuccess", Boolean.valueOf(z11)));
        C24860q c24860q = (C24860q) this.f49525a.get(str);
        if (c24860q != null) {
            C8937j0 c8937j0 = C8937j0.f47749a;
            long m47665f = c8937j0.m47665f();
            c8937j0.m47666n("phonebook", str, m47665f, m47665f - ((Number) c24860q.m129216d()).longValue(), ((SensitiveData) c24860q.m129215c()).m35527b(), ((SensitiveData) c24860q.m129215c()).m35526a());
        }
    }

    /* renamed from: d */
    public final void m50393d(SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "data");
        this.f49525a.put(sensitiveData.m35528c(), new C24860q(sensitiveData, Long.valueOf(C8937j0.f47749a.m47665f())));
    }

    /* renamed from: e */
    public final void m50394e(SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "data");
        SensitiveExtraData sensitiveExtraData = new SensitiveExtraData();
        sensitiveExtraData.m35536e("isSuccess", true);
        sensitiveData.m35529d(sensitiveExtraData);
        C8937j0 c8937j0 = C8937j0.f47749a;
        c8937j0.m47666n("phonebook", sensitiveData.m35528c(), c8937j0.m47665f(), 0L, sensitiveData.m35527b(), sensitiveData.m35526a());
    }

    private C9353s() {
        this.f49525a = new ConcurrentHashMap();
    }
}
