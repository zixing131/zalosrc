package com.zing.zalo;

import android.location.LocationListener;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.g */
/* loaded from: classes3.dex */
public final class C8914g {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f47653c;

    /* renamed from: a */
    private final Map f47654a;

    /* renamed from: b */
    private final Map f47655b;

    /* renamed from: com.zing.zalo.g$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f47656q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C8914g mo12V4() {
            return c.f47657a.m47590a();
        }
    }

    /* renamed from: com.zing.zalo.g$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8914g m47589a() {
            return (C8914g) C8914g.f47653c.getValue();
        }
    }

    /* renamed from: com.zing.zalo.g$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f47657a = new c();

        /* renamed from: b */
        private static final C8914g f47658b = new C8914g(null);

        private c() {
        }

        /* renamed from: a */
        public final C8914g m47590a() {
            return f47658b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f47656q);
        f47653c = m129210a;
    }

    public /* synthetic */ C8914g(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    private final void m47585c(LocationListener locationListener) {
        this.f47654a.remove(locationListener);
        this.f47655b.remove(locationListener);
    }

    /* renamed from: b */
    public final void m47586b(LocationListener locationListener) {
        long j11;
        AbstractC19074t.m100208f(locationListener, "listener");
        if (this.f47654a.containsKey(locationListener) && this.f47655b.containsKey(locationListener)) {
            SensitiveData sensitiveData = (SensitiveData) this.f47655b.get(locationListener);
            if (sensitiveData == null) {
                m47585c(locationListener);
                return;
            }
            C8937j0 c8937j0 = C8937j0.f47749a;
            long m47665f = c8937j0.m47665f();
            Long l11 = (Long) this.f47654a.get(locationListener);
            if (l11 != null) {
                j11 = l11.longValue();
            } else {
                j11 = 0;
            }
            c8937j0.m47666n(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, sensitiveData.m35528c(), m47665f, m47665f - j11, sensitiveData.m35527b(), sensitiveData.m35526a());
            m47585c(locationListener);
            return;
        }
        m47585c(locationListener);
    }

    /* renamed from: d */
    public final void m47587d(SensitiveData sensitiveData, LocationListener locationListener) {
        AbstractC19074t.m100208f(sensitiveData, "data");
        AbstractC19074t.m100208f(locationListener, "listener");
        this.f47654a.put(locationListener, Long.valueOf(C8937j0.f47749a.m47665f()));
        this.f47655b.put(locationListener, sensitiveData);
    }

    private C8914g() {
        this.f47654a = new ConcurrentHashMap();
        this.f47655b = new ConcurrentHashMap();
    }
}
