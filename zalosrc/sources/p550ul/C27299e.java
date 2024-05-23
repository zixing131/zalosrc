package p550ul;

import ag0.C0808c0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import hm0.C20096c;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import jm0.InterfaceC21299i;
import me0.AbstractC23244v8;
import org.json.JSONObject;
import p550ul.C27301g;
import p609wh.AbstractC29039u0;
import p609wh.C29000b;
import p609wh.C29037t0;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import qm0.AbstractC25363p0;
import tg0.C26676b;

/* renamed from: ul.e */
/* loaded from: classes3.dex */
public class C27299e extends C29000b {
    public static final a Companion = new a(null);

    /* renamed from: L */
    private static final AtomicBoolean f128477L = new AtomicBoolean(false);

    /* renamed from: M */
    private static ConcurrentLinkedQueue f128478M = new ConcurrentLinkedQueue();

    /* renamed from: K */
    private int f128479K;

    /* renamed from: ul.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ul.e$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f128480a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f128481b;

        b(InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2) {
            this.f128480a = interfaceC18505l;
            this.f128481b = interfaceC18505l2;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            this.f128481b.mo205i9(c20096c);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            String str;
            AbstractC19074t.m100208f(jSONObject, "result");
            InterfaceC18505l interfaceC18505l = this.f128480a;
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                str = optJSONObject.optString("cloud_viewer_key");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            interfaceC18505l.mo205i9(str);
        }
    }

    /* renamed from: ul.e$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ul.e$c$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a extends C19071q implements InterfaceC18505l {

            /* renamed from: y */
            public static final a f128483y = new a();

            a() {
                super(1, C0808c0.class, "queueRequestFirst", "queueRequestFirst(Lcom/zing/zalo/connection/Request;)V", 0);
            }

            /* renamed from: h */
            public final void m139793h(C29037t0 c29037t0) {
                C0808c0.m2047c(c29037t0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m139793h((C29037t0) obj);
                return C24848g0.f119245a;
            }
        }

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m139792a(String str) {
            AbstractC19074t.m100208f(str, "newViewerKey");
            C26676b.m136955e("SMLZCloudBaseRequest", "onViewerKeyReady(): " + AbstractC23244v8.m119735E(str, 20) + ". Pending queue: " + C27299e.f128478M.size() + " request(s)", C26676b.b.f126332q);
            C27301g.Companion.m139821a().m139820c(str);
            C27299e.this.m139790q0(a.f128483y);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139792a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.e$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ul.e$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C20096c f128485q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20096c c20096c) {
                super(1);
                this.f128485q = c20096c;
            }

            /* renamed from: a */
            public final void m139795a(C29037t0 c29037t0) {
                AbstractC19074t.m100208f(c29037t0, "request");
                InterfaceC21299i interfaceC21299i = c29037t0.f103757G;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1342c(this.f128485q);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m139795a((C29037t0) obj);
                return C24848g0.f119245a;
            }
        }

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m139794a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            C26676b.m136955e("SMLZCloudBaseRequest", "onRequestViewerKeyFailed(): " + c20096c, C26676b.b.f126335t);
            C27299e.this.m139790q0(new a(c20096c));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139794a((C20096c) obj);
            return C24848g0.f119245a;
        }
    }

    public C27299e(InterfaceC21299i interfaceC21299i) {
        super(interfaceC21299i);
    }

    /* renamed from: p0 */
    private final C29037t0 m139789p0(InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2) {
        Map m131407l;
        C29000b c29000b = new C29000b(new b(interfaceC18505l, interfaceC18505l2));
        c29000b.f103775r = 10;
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("client_type", "1"), AbstractC24866w.m129235a("client_version", String.valueOf(CoreUtility.f89236l)));
        c29000b.m110314j(AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_CLOUD_MEDIA) + "/keys/v1/authenticate", "", (String[]) m131407l.keySet().toArray(new String[0]), (String[]) m131407l.values().toArray(new String[0]));
        c29000b.m110305c0(1504000);
        c29000b.f103773p = new Random().nextInt(Integer.MAX_VALUE);
        return c29000b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final void m139790q0(InterfaceC18505l interfaceC18505l) {
        while (f128478M.peek() != null) {
            C26676b.m136957g("SMLZCloudBaseRequest", "dispatchActionForRequestQueue(): " + interfaceC18505l, null, 4, null);
            Object poll = f128478M.poll();
            AbstractC19074t.m100205c(poll);
            interfaceC18505l.mo205i9(poll);
        }
    }

    /* renamed from: r0 */
    private final boolean m139791r0(int i11) {
        return i11 == -205 || i11 == -204;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p609wh.C29037t0, jm0.AbstractC21298h
    /* renamed from: T */
    public void mo82640T(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.setRequestProperty("cloud-viewer-key", C27301g.Companion.m139821a().m139819b());
        }
        super.mo82640T(httpURLConnection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jm0.AbstractC21298h
    /* renamed from: U */
    public void mo110301U() {
        super.mo110301U();
        C27301g.a aVar = C27301g.Companion;
        C26676b.m136960j("SMLZCloudBaseRequest", "onSetupNativeCustomHeader(): " + aVar.m139821a().m139819b());
        m110308g("cloud-viewer-key", aVar.m139821a().m139819b());
    }

    @Override // p609wh.C29037t0, jm0.AbstractC21298h
    /* renamed from: X */
    public void mo51550X(int i11, String str, String str2) {
        if (m139791r0(i11)) {
            C26676b.m136962l("SMLZCloudBaseRequest", "Cloud viewer key is invalid, fetch new one");
            f128478M.add(this);
            if (!f128477L.compareAndSet(false, true)) {
                C26676b.m136957g("SMLZCloudBaseRequest", "There is another cloud viewer being fetched, wait and add request to the queue", null, 4, null);
                return;
            } else if (this.f128479K < 1) {
                C26676b.m136955e("SMLZCloudBaseRequest", "Request new cloud viewer key", C26676b.b.f126332q);
                this.f128479K++;
                C0808c0.m2047c(m139789p0(new c(), new d()));
                return;
            }
        }
        super.mo51550X(i11, str, str2);
    }
}
