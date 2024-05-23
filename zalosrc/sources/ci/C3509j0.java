package ci;

import ag0.C0815e1;
import android.text.TextUtils;
import au.EnumC2382z;
import com.zing.zalo.p062db.C7962g;
import dg0.AbstractC17930e;
import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import on0.AbstractC24341v;
import p361nb.C23661r;
import pm0.C24848g0;

/* renamed from: ci.j0 */
/* loaded from: classes3.dex */
public final class C3509j0 {

    /* renamed from: a */
    public static final C3509j0 f14705a = new C3509j0();

    /* renamed from: b */
    private static final Map f14706b;

    /* renamed from: ci.j0$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f14707a;

        /* renamed from: b */
        private long f14708b;

        /* renamed from: c */
        private long f14709c;

        /* renamed from: d */
        private int f14710d;

        public a(String str) {
            AbstractC19074t.m100208f(str, "mConversationId");
            this.f14707a = str;
        }

        /* renamed from: a */
        public final String m17734a() {
            return this.f14707a;
        }

        /* renamed from: b */
        public final long m17735b() {
            return this.f14709c;
        }

        /* renamed from: c */
        public final long m17736c() {
            return this.f14708b;
        }

        /* renamed from: d */
        public final int m17737d() {
            return this.f14710d;
        }

        /* renamed from: e */
        public final void m17738e(long j11) {
            this.f14709c = j11;
        }

        /* renamed from: f */
        public final void m17739f(long j11) {
            this.f14708b = j11;
        }

        /* renamed from: g */
        public final void m17740g(int i11) {
            this.f14710d = i11;
        }
    }

    /* renamed from: ci.j0$b */
    /* loaded from: classes3.dex */
    public static final class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f14711p;

        /* renamed from: q */
        final /* synthetic */ int f14712q;

        /* renamed from: r */
        final /* synthetic */ EnumC2382z f14713r;

        /* renamed from: s */
        final /* synthetic */ int f14714s;

        b(String str, int i11, EnumC2382z enumC2382z, int i12) {
            this.f14711p = str;
            this.f14712q = i11;
            this.f14713r = enumC2382z;
            this.f14714s = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            String m17732d = C3509j0.f14705a.m17732d(this.f14711p);
            if (TextUtils.isEmpty(m17732d)) {
                return;
            }
            int i11 = this.f14712q;
            EnumC2382z enumC2382z = this.f14713r;
            int i12 = this.f14714s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logActionSaveCount: conversationId= ");
            sb2.append(m17732d);
            sb2.append(", trackingSourceType= ");
            sb2.append(i11);
            sb2.append(", mediaType= ");
            sb2.append(enumC2382z);
            sb2.append(", count= ");
            sb2.append(i12);
            int i13 = this.f14712q;
            int m12438c = this.f14713r.m12438c();
            int i14 = this.f14714s;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14);
            C0815e1.m2075D().m2102X(new C23661r(5, i13, m17732d, m12438c, sb3.toString(), ""));
        }
    }

    /* renamed from: ci.j0$c */
    /* loaded from: classes3.dex */
    public static final class c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f14715p;

        /* renamed from: q */
        final /* synthetic */ int f14716q;

        /* renamed from: r */
        final /* synthetic */ EnumC2382z f14717r;

        /* renamed from: s */
        final /* synthetic */ int f14718s;

        c(String str, int i11, EnumC2382z enumC2382z, int i12) {
            this.f14715p = str;
            this.f14716q = i11;
            this.f14717r = enumC2382z;
            this.f14718s = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            String m17732d = C3509j0.f14705a.m17732d(this.f14715p);
            if (TextUtils.isEmpty(m17732d)) {
                return;
            }
            int i11 = this.f14716q;
            EnumC2382z enumC2382z = this.f14717r;
            int i12 = this.f14718s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logActionShareCount: conversationId= ");
            sb2.append(m17732d);
            sb2.append(", trackingSourceType= ");
            sb2.append(i11);
            sb2.append(", mediaType= ");
            sb2.append(enumC2382z);
            sb2.append(", count= ");
            sb2.append(i12);
            int i13 = this.f14716q;
            int m12438c = this.f14717r.m12438c();
            int i14 = this.f14718s;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14);
            C0815e1.m2075D().m2102X(new C23661r(6, i13, m17732d, m12438c, sb3.toString(), ""));
        }
    }

    /* renamed from: ci.j0$d */
    /* loaded from: classes3.dex */
    public static final class d implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f14719p;

        /* renamed from: q */
        final /* synthetic */ int f14720q;

        /* renamed from: r */
        final /* synthetic */ int f14721r;

        d(String str, int i11, int i12) {
            this.f14719p = str;
            this.f14720q = i11;
            this.f14721r = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            String m17732d = C3509j0.f14705a.m17732d(this.f14719p);
            if (TextUtils.isEmpty(m17732d)) {
                return;
            }
            int i11 = this.f14720q;
            int i12 = this.f14721r;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logFileClickedCount: conversationId= ");
            sb2.append(m17732d);
            sb2.append(", trackingSourceType= ");
            sb2.append(i11);
            sb2.append(", count= ");
            sb2.append(i12);
            int i13 = this.f14720q;
            int m12438c = EnumC2382z.f9947t.m12438c();
            int i14 = this.f14721r;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14);
            C0815e1.m2075D().m2102X(new C23661r(4, i13, m17732d, m12438c, sb3.toString(), ""));
        }
    }

    /* renamed from: ci.j0$e */
    /* loaded from: classes3.dex */
    public static final class e implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f14722p;

        /* renamed from: q */
        final /* synthetic */ int f14723q;

        /* renamed from: r */
        final /* synthetic */ EnumC2382z f14724r;

        /* renamed from: s */
        final /* synthetic */ int f14725s;

        e(String str, int i11, EnumC2382z enumC2382z, int i12) {
            this.f14722p = str;
            this.f14723q = i11;
            this.f14724r = enumC2382z;
            this.f14725s = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            String m17732d = C3509j0.f14705a.m17732d(this.f14722p);
            if (TextUtils.isEmpty(m17732d)) {
                return;
            }
            int i11 = this.f14723q;
            EnumC2382z enumC2382z = this.f14724r;
            int i12 = this.f14725s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logLastOffset: conversationId= ");
            sb2.append(m17732d);
            sb2.append(", trackingSourceType= ");
            sb2.append(i11);
            sb2.append(", mediaType= ");
            sb2.append(enumC2382z);
            sb2.append(", lastOffset= ");
            sb2.append(i12);
            int i13 = this.f14723q;
            int m12438c = this.f14724r.m12438c();
            int i14 = this.f14725s;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14);
            C0815e1.m2075D().m2102X(new C23661r(1, i13, m17732d, m12438c, sb3.toString(), ""));
        }
    }

    /* renamed from: ci.j0$f */
    /* loaded from: classes3.dex */
    public static final class f implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f14726p;

        /* renamed from: q */
        final /* synthetic */ int f14727q;

        /* renamed from: r */
        final /* synthetic */ int f14728r;

        f(String str, int i11, int i12) {
            this.f14726p = str;
            this.f14727q = i11;
            this.f14728r = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            String m17732d = C3509j0.f14705a.m17732d(this.f14726p);
            if (TextUtils.isEmpty(m17732d)) {
                return;
            }
            int i11 = this.f14727q;
            int i12 = this.f14728r;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logLinkClickedCount: conversationId= ");
            sb2.append(m17732d);
            sb2.append(", trackingSourceType= ");
            sb2.append(i11);
            sb2.append(", count= ");
            sb2.append(i12);
            int i13 = this.f14727q;
            int m12438c = EnumC2382z.f9946s.m12438c();
            int i14 = this.f14728r;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14);
            C0815e1.m2075D().m2102X(new C23661r(3, i13, m17732d, m12438c, sb3.toString(), ""));
        }
    }

    /* renamed from: ci.j0$g */
    /* loaded from: classes3.dex */
    public static final class g implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f14729p;

        /* renamed from: q */
        final /* synthetic */ int f14730q;

        /* renamed from: r */
        final /* synthetic */ int f14731r;

        g(String str, int i11, int i12) {
            this.f14729p = str;
            this.f14730q = i11;
            this.f14731r = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            String m17732d = C3509j0.f14705a.m17732d(this.f14729p);
            if (TextUtils.isEmpty(m17732d)) {
                return;
            }
            int i11 = this.f14730q;
            int i12 = this.f14731r;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logMediaViewFullCount: conversationId= ");
            sb2.append(m17732d);
            sb2.append(", trackingSourceType= ");
            sb2.append(i11);
            sb2.append(", count= ");
            sb2.append(i12);
            int i13 = this.f14730q;
            int m12438c = EnumC2382z.f9945r.m12438c();
            int i14 = this.f14731r;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14);
            C0815e1.m2075D().m2102X(new C23661r(2, i13, m17732d, m12438c, sb3.toString(), ""));
        }
    }

    /* renamed from: ci.j0$h */
    /* loaded from: classes3.dex */
    public static final class h implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f14732p;

        h(String str) {
            this.f14732p = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3509j0 c3509j0 = C3509j0.f14705a;
            Map m17731c = c3509j0.m17731c();
            String str = this.f14732p;
            synchronized (m17731c) {
                try {
                    a aVar = (a) c3509j0.m17731c().get(str);
                    if (aVar == null) {
                        return;
                    }
                    aVar.m17740g(aVar.m17737d() - 1);
                    int m17737d = aVar.m17737d();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("stopMediaStoreScreen: conversationId= ");
                    sb2.append(str);
                    sb2.append(", mTokenCount= ");
                    sb2.append(m17737d);
                    if (aVar.m17737d() <= 0) {
                        c3509j0.m17731c().remove(str);
                        c3509j0.m17733q(aVar);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f14706b = synchronizedMap;
    }

    private C3509j0() {
    }

    /* renamed from: e */
    public static final void m17719e(String str, int i11, EnumC2382z enumC2382z, int i12) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC17930e.Companion.m94551d().mo94528b(new b(str, i11, enumC2382z, i12));
    }

    /* renamed from: f */
    public static final void m17720f(String str, int i11, EnumC2382z enumC2382z, int i12) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC17930e.Companion.m94551d().mo94528b(new c(str, i11, enumC2382z, i12));
    }

    /* renamed from: g */
    public static final void m17721g(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC17930e.Companion.m94551d().mo94528b(new d(str, i11, i12));
    }

    /* renamed from: h */
    public static final void m17722h(String str, int i11, EnumC2382z enumC2382z, int i12) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC17930e.Companion.m94551d().mo94528b(new e(str, i11, enumC2382z, i12));
    }

    /* renamed from: i */
    public static final void m17723i(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC17930e.Companion.m94551d().mo94528b(new f(str, i11, i12));
    }

    /* renamed from: j */
    public static final void m17724j(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC17930e.Companion.m94551d().mo94528b(new g(str, i11, i12));
    }

    /* renamed from: k */
    private final void m17725k(a aVar) {
        if (aVar == null) {
            return;
        }
        String m17732d = m17732d(aVar.m17734a());
        if (TextUtils.isEmpty(m17732d)) {
            return;
        }
        long m17735b = aVar.m17735b() - aVar.m17736c();
        if (m17735b >= 0 && m17735b <= 86400000) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logSessionTime: conversationId= ");
            sb2.append(m17732d);
            sb2.append(", sessionDuration(ms)= ");
            sb2.append(m17735b);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m17735b);
            C0815e1.m2075D().m2102X(new C23661r(0, 0, m17732d, 0, sb3.toString(), ""));
        }
    }

    /* renamed from: l */
    public static final void m17726l(final String str) {
        if (str != null) {
            AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C3509j0.m17727m(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m17727m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map map = f14706b;
        synchronized (map) {
            try {
                a aVar = (a) map.get(str);
                if (aVar == null) {
                    aVar = new a(str);
                    aVar.m17739f(System.currentTimeMillis());
                    map.put(str, aVar);
                }
                aVar.m17740g(aVar.m17737d() + 1);
                int m17737d = aVar.m17737d();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("startMediaStoreScreen: conversationId= ");
                sb2.append(str);
                sb2.append(", mTokenCount= ");
                sb2.append(m17737d);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public static final void m17728n() {
        AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.i0
            @Override // java.lang.Runnable
            public final void run() {
                C3509j0.m17729o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m17729o() {
        Map map = f14706b;
        synchronized (map) {
            try {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    f14705a.m17733q((a) it.next());
                }
                f14706b.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public static final void m17730p(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC17930e.Companion.m94551d().mo94531e(new h(str), 500L);
    }

    /* renamed from: c */
    public final Map m17731c() {
        return f14706b;
    }

    /* renamed from: d */
    public final String m17732d(String str) {
        String m127114D;
        AbstractC19074t.m100208f(str, "conversationId");
        m127114D = AbstractC24341v.m127114D(str, "group_", "", false, 4, null);
        return C7962g.f43287r + m127114D;
    }

    /* renamed from: q */
    public final void m17733q(a aVar) {
        AbstractC19074t.m100208f(aVar, "session");
        aVar.m17738e(System.currentTimeMillis());
        m17725k(aVar);
    }
}
