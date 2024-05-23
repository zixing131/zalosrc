package com.zing.zalo;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.ConcurrentHashMap;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.r */
/* loaded from: classes3.dex */
public final class C9274r {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC24854k f49194e;

    /* renamed from: a */
    private final ConcurrentHashMap f49195a;

    /* renamed from: b */
    private String f49196b;

    /* renamed from: c */
    private String f49197c;

    /* renamed from: d */
    private SensitiveExtraData f49198d;

    /* renamed from: com.zing.zalo.r$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f49199q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9274r mo12V4() {
            return c.f49200a.m49664a();
        }
    }

    /* renamed from: com.zing.zalo.r$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C9274r m49663a() {
            return (C9274r) C9274r.f49194e.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.r$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f49200a = new c();

        /* renamed from: b */
        private static final C9274r f49201b = new C9274r(null);

        private c() {
        }

        /* renamed from: a */
        public final C9274r m49664a() {
            return f49201b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f49199q);
        f49194e = m129210a;
    }

    public /* synthetic */ C9274r(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    private final void m49659c() {
        this.f49196b = "";
        this.f49197c = "";
        this.f49198d = null;
        this.f49195a.clear();
    }

    /* renamed from: b */
    public final void m49660b() {
        if (this.f49196b.length() == 0) {
            return;
        }
        C8937j0 c8937j0 = C8937j0.f47749a;
        long m47665f = c8937j0.m47665f();
        Long l11 = (Long) this.f49195a.get(this.f49196b);
        if (l11 == null) {
            l11 = 0L;
        }
        c8937j0.m47666n("microphone", this.f49196b, m47665f, m47665f - l11.longValue(), this.f49197c, this.f49198d);
        m49659c();
    }

    /* renamed from: d */
    public final void m49661d(SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "data");
        this.f49196b = sensitiveData.m35528c();
        this.f49197c = sensitiveData.m35527b();
        this.f49198d = sensitiveData.m35526a();
        this.f49195a.clear();
        this.f49195a.put(this.f49196b, Long.valueOf(C8937j0.f47749a.m47665f()));
    }

    private C9274r() {
        this.f49195a = new ConcurrentHashMap();
        this.f49196b = "";
        this.f49197c = "";
    }
}
