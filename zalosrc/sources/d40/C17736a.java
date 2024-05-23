package d40;

import am.AbstractC0924m0;
import en0.InterfaceC18494a;
import f40.C18719a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p620wt.AbstractC29231f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: d40.a */
/* loaded from: classes.dex */
public final class C17736a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f89906a;

    /* renamed from: d40.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f89907q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C17736a mo12V4() {
            return c.f89908a.m93897a();
        }
    }

    /* renamed from: d40.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C17736a m93896a() {
            return (C17736a) C17736a.f89906a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d40.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f89908a = new c();

        /* renamed from: b */
        private static final C17736a f89909b = new C17736a();

        private c() {
        }

        /* renamed from: a */
        public final C17736a m93897a() {
            return f89909b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f89907q);
        f89906a = m129210a;
    }

    /* renamed from: d */
    public static final C17736a m93889d() {
        return Companion.m93896a();
    }

    /* renamed from: b */
    public final void m93890b() {
        C18719a.m98714g("SMLTransferMsgToPCConfigs", "clearAllMemCache()", null, 4, null);
    }

    /* renamed from: c */
    public final long m93891c() {
        return AbstractC0924m0.m3799f3();
    }

    /* renamed from: e */
    public final int m93892e() {
        return AbstractC0924m0.m3268N();
    }

    /* renamed from: f */
    public final void m93893f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        C18719a.m98714g("SMLTransferMsgToPCConfigs", "handleServerConfig(): " + jSONObject, null, 4, null);
        try {
            long j11 = 1024;
            AbstractC0924m0.m3756dk(AbstractC29231f.m145985c(jSONObject, "limit_size", 200L, 0L, 0L, 8, null) * j11 * j11);
            AbstractC0924m0.m4317we(AbstractC29231f.m145983a(jSONObject, "upload_chunk_size", 524288, 524288, 3145728));
            boolean z11 = false;
            if (jSONObject.optInt("enable_move_param", 0) == 1) {
                z11 = true;
            }
            AbstractC0924m0.m2966Cg(z11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLTransferMsgToPCConfigs", e11);
        }
    }

    /* renamed from: g */
    public final boolean m93894g() {
        return AbstractC0924m0.m3249M9();
    }
}
