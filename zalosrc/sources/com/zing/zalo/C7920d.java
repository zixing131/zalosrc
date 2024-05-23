package com.zing.zalo;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.ConcurrentHashMap;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.d */
/* loaded from: classes3.dex */
public final class C7920d {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC24854k f42848e;

    /* renamed from: a */
    private final ConcurrentHashMap f42849a;

    /* renamed from: b */
    private String f42850b;

    /* renamed from: c */
    private String f42851c;

    /* renamed from: d */
    private SensitiveExtraData f42852d;

    /* renamed from: com.zing.zalo.d$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f42853q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C7920d mo12V4() {
            return c.f42854a.m40941a();
        }
    }

    /* renamed from: com.zing.zalo.d$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7920d m40940a() {
            return (C7920d) C7920d.f42848e.getValue();
        }
    }

    /* renamed from: com.zing.zalo.d$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f42854a = new c();

        /* renamed from: b */
        private static final C7920d f42855b = new C7920d(null);

        private c() {
        }

        /* renamed from: a */
        public final C7920d m40941a() {
            return f42855b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f42853q);
        f42848e = m129210a;
    }

    public /* synthetic */ C7920d(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    private final void m40936c() {
        this.f42850b = "";
        this.f42851c = "";
        this.f42852d = null;
        this.f42849a.clear();
    }

    /* renamed from: b */
    public final void m40937b() {
        if (this.f42850b.length() == 0) {
            return;
        }
        C8937j0 c8937j0 = C8937j0.f47749a;
        long m47665f = c8937j0.m47665f();
        Long l11 = (Long) this.f42849a.get(this.f42850b);
        if (l11 == null) {
            l11 = 0L;
        }
        c8937j0.m47666n("camera", this.f42850b, m47665f, m47665f - l11.longValue(), this.f42851c, this.f42852d);
        m40936c();
    }

    /* renamed from: d */
    public final void m40938d(SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "data");
        this.f42850b = sensitiveData.m35528c();
        this.f42851c = sensitiveData.m35527b();
        this.f42852d = sensitiveData.m35526a();
        this.f42849a.clear();
        this.f42849a.put(this.f42850b, Long.valueOf(C8937j0.f47749a.m47665f()));
    }

    private C7920d() {
        this.f42849a = new ConcurrentHashMap();
        this.f42850b = "";
        this.f42851c = "";
    }
}
