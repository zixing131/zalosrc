package p326ll;

import ag0.C0808c0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.NativeHttp;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import f40.C18719a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hu.C20128b;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import jm0.AbstractC21302l;
import jm0.C21296f;
import jm0.InterfaceC21299i;
import jm0.InterfaceC21303m;
import me0.AbstractC23138m0;
import me0.C23055e5;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONException;
import org.json.JSONObject;
import p301kl.C21757a;
import p301kl.C21758b;
import p348mi.AbstractC23306f;
import p609wh.AbstractC29039u0;
import p609wh.C29000b;
import p609wh.C29037t0;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25363p0;

/* renamed from: ll.c */
/* loaded from: classes.dex */
public final class C22512c implements InterfaceC22510a {
    public static final a Companion = new a(null);

    /* renamed from: ll.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ll.c$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ int f110168q;

        /* renamed from: r */
        final /* synthetic */ String f110169r;

        /* renamed from: s */
        final /* synthetic */ String f110170s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, String str, String str2) {
            super(2);
            this.f110168q = i11;
            this.f110169r = str;
            this.f110170s = str2;
        }

        /* renamed from: a */
        public final void m116410a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            String str;
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            try {
                JSONObject jSONObject = new JSONObject();
                int i11 = this.f110168q;
                String str2 = this.f110169r;
                String str3 = this.f110170s;
                jSONObject.put("user_action", i11);
                jSONObject.put("public_key", str2);
                jSONObject.put("pc_name", str3);
                str = jSONObject.toString();
            } catch (JSONException e11) {
                AbstractC23350e.m122776f("SMLZaloTransferMsgApiHelper", e11);
                str = "";
            }
            AbstractC19074t.m100205c(str);
            linkedHashMap.put("confirm_data", str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m116410a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ll.c$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ boolean f110171q;

        /* renamed from: r */
        final /* synthetic */ String f110172r;

        /* renamed from: s */
        final /* synthetic */ String f110173s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, String str, String str2) {
            super(2);
            this.f110171q = z11;
            this.f110172r = str;
            this.f110173s = str2;
        }

        /* renamed from: a */
        public final void m116411a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            String str;
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            try {
                JSONObject jSONObject = new JSONObject();
                boolean z11 = this.f110171q;
                String str2 = this.f110172r;
                String str3 = this.f110173s;
                jSONObject.put("user_action", z11 ? 1 : 0);
                jSONObject.put("sync_session", str2);
                jSONObject.put("pc_name", str3);
                str = jSONObject.toString();
            } catch (JSONException e11) {
                AbstractC23350e.m122776f("SMLZaloTransferMsgApiHelper", e11);
                str = "";
            }
            AbstractC19074t.m100205c(str);
            linkedHashMap.put("confirm_data", str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m116411a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ll.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final d f110174q = new d();

        d() {
            super(2);
        }

        /* renamed from: a */
        public final void m116412a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m116412a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ll.c$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC21299i {

        /* renamed from: b */
        final /* synthetic */ String f110176b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18505l f110177c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18509p f110178d;

        e(String str, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
            this.f110176b = str;
            this.f110177c = interfaceC18505l;
            this.f110178d = interfaceC18509p;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            C22512c.this.m116407n("onRequestFailed(" + this.f110176b + "): " + c20096c);
            InterfaceC18509p interfaceC18509p = this.f110178d;
            Integer valueOf = Integer.valueOf(C22512c.this.m116404k(c20096c));
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18509p.mo240pC(valueOf, m104492d);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "result");
            C22512c c22512c = C22512c.this;
            c22512c.m116408o("onRequestComplete(" + this.f110176b + ")" + c22512c.m116405l(jSONObject));
            this.f110177c.mo205i9(jSONObject);
        }
    }

    /* renamed from: ll.c$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC21303m {

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f110180b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f110181c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18509p f110182d;

        f(InterfaceC18505l interfaceC18505l, CountDownLatch countDownLatch, InterfaceC18509p interfaceC18509p) {
            this.f110180b = interfaceC18505l;
            this.f110181c = countDownLatch;
            this.f110182d = interfaceC18509p;
        }

        @Override // jm0.InterfaceC21303m
        /* renamed from: a */
        public void mo51590a(int i11) {
        }

        @Override // jm0.InterfaceC21303m
        /* renamed from: b */
        public void mo51591b(JSONObject jSONObject, boolean z11) {
            AbstractC19074t.m100208f(jSONObject, "data");
            C22512c.this.m116408o("NATIVE upload Transfer DB success! " + jSONObject);
            this.f110180b.mo205i9(jSONObject);
            this.f110181c.countDown();
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            C22512c.this.m116407n("NATIVE upload Transfer DB failed! " + c20096c);
            InterfaceC18509p interfaceC18509p = this.f110182d;
            Integer valueOf = Integer.valueOf(C22512c.this.m116404k(c20096c));
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18509p.mo240pC(valueOf, m104492d);
            this.f110181c.countDown();
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public /* synthetic */ void mo1343f(JSONObject jSONObject) {
            AbstractC21302l.m110331a(this, jSONObject);
        }
    }

    /* renamed from: ll.c$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C21758b f110183q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C21758b c21758b) {
            super(2);
            this.f110183q = c21758b;
        }

        /* renamed from: a */
        public final void m116413a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            String str;
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            linkedHashMap.put("pc_name", this.f110183q.m112246d());
            linkedHashMap.put("public_key", this.f110183q.m112247e());
            linkedHashMap.put("status", String.valueOf(this.f110183q.m112248f()));
            linkedHashMap.put("error_code", String.valueOf(this.f110183q.m112244b()));
            linkedHashMap.put("error_message", this.f110183q.m112245c());
            if (this.f110183q.m112243a()) {
                str = "1";
            } else {
                str = "0";
            }
            linkedHashMap.put("can_retry", str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m116413a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: i */
    private final void m116402i(int i11, String str, String str2, int i12, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2) {
        if (!AbstractC23138m0.Companion.m118774a()) {
            interfaceC18509p.mo240pC(-2, "Invalid User ID");
            return;
        }
        if (!C23055e5.m118273h(false, 1, null)) {
            String str3 = AbstractC20095b.f98829a;
            AbstractC19074t.m100207e(str3, "NETWORK_ERROR_MSG");
            interfaceC18509p.mo240pC(50001, str3);
            return;
        }
        e eVar = new e(str2, interfaceC18505l, interfaceC18509p);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("client_type", "1");
        linkedHashMap.put("device_type", "1");
        linkedHashMap.put("client_version", String.valueOf(CoreUtility.f89236l));
        C29000b c29000b = new C29000b(eVar);
        c29000b.f103775r = i11;
        interfaceC18509p2.mo240pC(c29000b, linkedHashMap);
        String str4 = str + str2;
        Set keySet = linkedHashMap.keySet();
        AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
        String[] strArr = (String[]) keySet.toArray(new String[0]);
        Collection values = linkedHashMap.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        c29000b.m110314j(str4, "", strArr, (String[]) values.toArray(new String[0]));
        if (i12 != -1) {
            c29000b.m110305c0(i12);
        }
        m116408o("executeRequest(): " + c29000b);
        C0808c0.m2046b(c29000b);
    }

    /* renamed from: j */
    static /* synthetic */ void m116403j(C22512c c22512c, int i11, String str, String str2, int i12, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2, int i13, Object obj) {
        int i14;
        InterfaceC18509p interfaceC18509p3;
        if ((i13 & 8) != 0) {
            i14 = -1;
        } else {
            i14 = i12;
        }
        if ((i13 & 64) != 0) {
            interfaceC18509p3 = d.f110174q;
        } else {
            interfaceC18509p3 = interfaceC18509p2;
        }
        c22512c.m116402i(i11, str, str2, i14, interfaceC18505l, interfaceC18509p, interfaceC18509p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final int m116404k(C20096c c20096c) {
        if (c20096c.m104489a() == 200) {
            return c20096c.m104491c();
        }
        return c20096c.m104489a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final String m116405l(JSONObject jSONObject) {
        String optString = jSONObject.optString("data");
        AbstractC19074t.m100205c(optString);
        if (optString.length() == 0) {
            return "";
        }
        return ": " + optString;
    }

    /* renamed from: m */
    private final void m116406m() {
        NativeHttp.m93186a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m116407n(String str) {
        C18719a.m98712e("SMLZaloTransferMsgApiHelper", str, C18719a.a.f94036s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m116408o(String str) {
        C18719a.m98712e("SMLZaloTransferMsgApiHelper", str, C18719a.a.f94035r);
    }

    /* renamed from: p */
    private final void m116409p(C21757a c21757a, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        HashMap m131406k;
        m116408o("NATIVE upload Transfer DB: params=" + c21757a);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C29000b c29000b = new C29000b(new f(interfaceC18505l, countDownLatch, interfaceC18509p));
        File m112241g = c21757a.m112241g();
        String m122785a = AbstractC23352g.m122785a(m112241g);
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        C24860q[] c24860qArr = new C24860q[15];
        String str = "1";
        c24860qArr[0] = AbstractC24866w.m129235a("device_type", "1");
        c24860qArr[1] = AbstractC24866w.m129235a("client_version", String.valueOf(CoreUtility.f89236l));
        c24860qArr[2] = AbstractC24866w.m129235a("file_name", m112241g.getName());
        c24860qArr[3] = AbstractC24866w.m129235a("checksum", m122785a);
        c24860qArr[4] = AbstractC24866w.m129235a("file_size", String.valueOf(m112241g.length()));
        c24860qArr[5] = AbstractC24866w.m129235a("device_name", C20128b.m104758e(false, 1, null));
        c24860qArr[6] = AbstractC24866w.m129235a("client_time", String.valueOf(c21757a.m112235a()));
        c24860qArr[7] = AbstractC24866w.m129235a("client_file_id", String.valueOf(nextInt));
        c24860qArr[8] = AbstractC24866w.m129235a("from_seq_id", String.valueOf(c21757a.m112237c()));
        c24860qArr[9] = AbstractC24866w.m129235a("public_key", c21757a.m112239e());
        c24860qArr[10] = AbstractC24866w.m129235a("encrypted_key", c21757a.m112236b());
        c24860qArr[11] = AbstractC24866w.m129235a("backup_type", "1");
        c24860qArr[12] = AbstractC24866w.m129235a("retry_source", String.valueOf(c21757a.m112240f()));
        if (!c21757a.m112242h()) {
            str = "0";
        }
        c24860qArr[13] = AbstractC24866w.m129235a("is_full_transfer", str);
        c24860qArr[14] = AbstractC24866w.m129235a("db_info", c21757a.m112238d().toString());
        m131406k = AbstractC25363p0.m131406k(c24860qArr);
        boolean m93894g = AbstractC23306f.m120594K1().m93894g();
        if (m93894g) {
            c29000b.m110312i("https://trans-bin.zaloapp.com/upload", "");
        } else {
            m116408o("Add params to request URL");
            Set keySet = m131406k.keySet();
            AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
            String[] strArr = (String[]) keySet.toArray(new String[0]);
            Collection values = m131406k.values();
            AbstractC19074t.m100207e(values, "<get-values>(...)");
            c29000b.m110314j("https://trans-bin.zaloapp.com/upload", "", strArr, (String[]) values.toArray(new String[0]));
        }
        c29000b.f103775r = 9;
        C21296f c21296f = new C21296f("file_data", m112241g.getName(), "application/octet-stream", m112241g);
        c21296f.m110270m(AbstractC23306f.m120594K1().m93892e());
        if (m93894g) {
            m116408o("Add params to request body");
            Hashtable hashtable = new Hashtable();
            for (Map.Entry entry : m131406k.entrySet()) {
                hashtable.put(entry.getKey(), entry.getValue());
            }
            c21296f.m110265h(hashtable);
        }
        c29000b.m110309g0(c21296f);
        c29000b.m110304b0(false);
        c29000b.m110305c0(24020);
        c29000b.m110316k0(20000L);
        C0808c0.m2046b(c29000b);
        countDownLatch.await();
    }

    @Override // p326ll.InterfaceC22510a
    /* renamed from: a */
    public void mo116393a(C21757a c21757a, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c21757a, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        try {
            if (!C23055e5.m118273h(false, 1, null)) {
                m116407n("Network NOT available!");
                String str = AbstractC20095b.f98829a;
                AbstractC19074t.m100207e(str, "NETWORK_ERROR_MSG");
                interfaceC18509p.mo240pC(50001, str);
                return;
            }
            m116406m();
            m116409p(c21757a, interfaceC18505l, interfaceC18509p);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZaloTransferMsgApiHelper", e11);
            String str2 = AbstractC20095b.f98832d;
            AbstractC19074t.m100207e(str2, "UNKNOWN_MSG");
            interfaceC18509p.mo240pC(502, str2);
        }
    }

    @Override // p326ll.InterfaceC22510a
    /* renamed from: b */
    public void mo116394b(C21758b c21758b, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c21758b, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m116403j(this, 10, "https://trans-bin.zaloapp.com/upload", "/transferstatus", 0, interfaceC18505l, interfaceC18509p, new g(c21758b), 8, null);
    }

    @Override // p326ll.InterfaceC22510a
    /* renamed from: c */
    public void mo116395c(int i11, String str, String str2, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "publicKey");
        AbstractC19074t.m100208f(str2, "pcName");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m116403j(this, 10, "https://trans-bin.zaloapp.com/upload", "/confirmtransfer", 0, interfaceC18505l, interfaceC18509p, new b(i11, str, str2), 8, null);
    }

    @Override // p326ll.InterfaceC22510a
    /* renamed from: d */
    public void mo116396d(boolean z11, String str, String str2, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "syncSession");
        AbstractC19074t.m100208f(str2, "pcName");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.MSG_BACKUP);
        AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
        m116403j(this, 10, m145033a, "/confirmsync", 0, interfaceC18505l, interfaceC18509p, new c(z11, str, str2), 8, null);
    }
}
