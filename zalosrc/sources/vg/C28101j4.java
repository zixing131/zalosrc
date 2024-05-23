package vg;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import on0.AbstractC24342w;
import p185gc.AbstractC19381e;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: vg.j4 */
/* loaded from: classes3.dex */
public final class C28101j4 extends AbstractC19381e {

    /* renamed from: a */
    private final String f131063a;

    /* renamed from: b */
    private final Map f131064b;

    /* renamed from: c */
    private final Map f131065c;

    /* renamed from: vg.j4$a */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: vg.j4$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C33009a extends a {

            /* renamed from: a */
            public static final C33009a f131066a = new C33009a();

            private C33009a() {
                super(null);
            }
        }

        /* renamed from: vg.j4$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends a {

            /* renamed from: a */
            private final String f131067a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                AbstractC19074t.m100208f(str, "fileExtension");
                this.f131067a = str;
            }

            /* renamed from: a */
            public final String m141573a() {
                return this.f131067a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC19074t.m100204b(this.f131067a, ((b) obj).f131067a);
            }

            public int hashCode() {
                return this.f131067a.hashCode();
            }

            public String toString() {
                return "Valid(fileExtension=" + this.f131067a + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.j4$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f131068t;

        /* renamed from: u */
        private /* synthetic */ Object f131069u;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f131069u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f131068t;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f131069u;
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(C28101j4.this.f131063a).openConnection());
                AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                if (httpURLConnection.getContentType() != null) {
                    C28101j4 c28101j4 = C28101j4.this;
                    String contentType = httpURLConnection.getContentType();
                    AbstractC19074t.m100207e(contentType, "getContentType(...)");
                    String m141571f = c28101j4.m141571f(contentType);
                    if (m141571f.length() > 0) {
                        obj2 = new a.b(m141571f);
                    } else {
                        obj2 = a.C33009a.f131066a;
                    }
                    this.f131068t = 1;
                    if (flowCollector.mo12109b(obj2, this) == m142578e) {
                        return m142578e;
                    }
                } else {
                    a.C33009a c33009a = a.C33009a.f131066a;
                    this.f131068t = 2;
                    if (flowCollector.mo12109b(c33009a, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.j4$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f131071t;

        /* renamed from: u */
        private /* synthetic */ Object f131072u;

        /* renamed from: v */
        /* synthetic */ Object f131073v;

        c(Continuation continuation) {
            super(3, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f131071t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f131072u;
                AbstractC20110a.f98889a.mo104552e((Throwable) this.f131073v);
                a.C33009a c33009a = a.C33009a.f131066a;
                this.f131072u = null;
                this.f131071t = 1;
                if (flowCollector.mo12109b(c33009a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f131072u = flowCollector;
            cVar.f131073v = th2;
            return cVar.mo239o(C24848g0.f119245a);
        }
    }

    public C28101j4(String str) {
        Map m131407l;
        Map m131401f;
        AbstractC19074t.m100208f(str, "mediaUrl");
        this.f131063a = str;
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("image/png", "png"), AbstractC24866w.m129235a("image/jpeg", "jpg"), AbstractC24866w.m129235a("image/jpg", "jpg"));
        this.f131064b = m131407l;
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("video/mp4", "mp4"));
        this.f131065c = m131401f;
    }

    /* renamed from: e */
    private final String m141570e(Map map, String str) {
        boolean m127149O;
        for (Map.Entry entry : map.entrySet()) {
            m127149O = AbstractC24342w.m127149O(str, (CharSequence) entry.getKey(), false, 2, null);
            if (m127149O) {
                return (String) entry.getValue();
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final String m141571f(String str) {
        String m141570e = m141570e(this.f131064b, str);
        String m141570e2 = m141570e(this.f131065c, str);
        if (m141570e.length() == 0) {
            return m141570e2;
        }
        return m141570e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19381e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Flow mo93498b() {
        return FlowKt.m113267C(FlowKt.m113288f(FlowKt.m113265A(new b(null)), new c(null)), Dispatchers.m112680b());
    }
}
