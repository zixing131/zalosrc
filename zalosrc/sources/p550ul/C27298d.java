package p550ul;

import ag0.C0808c0;
import ag0.C0829l0;
import com.zing.zalo.data.zalocloud.model.api.BaseResponse;
import com.zing.zalo.data.zalocloud.model.api.CloudInfoResponse;
import com.zing.zalo.data.zalocloud.model.api.CloudKeyResponse;
import com.zing.zalo.data.zalocloud.model.api.CloudQuotaUsageResponse;
import com.zing.zalo.data.zalocloud.model.api.CloudSettings;
import com.zing.zalo.data.zalocloud.model.api.CloudUrlPattern;
import com.zing.zalo.data.zalocloud.model.api.DownloadUrlsResponse;
import com.zing.zalo.data.zalocloud.model.api.MyCloudQuotaUsageResponse;
import com.zing.zalo.data.zalocloud.model.api.RequestMigrateServerItemParams;
import com.zing.zalo.data.zalocloud.model.api.SubmitCloudKeyResponse;
import com.zing.zalo.data.zalocloud.model.api.SubmitE2EEInfoParams;
import com.zing.zalo.data.zalocloud.model.api.TransferCloudKeyParams;
import com.zing.zalo.data.zalocloud.model.api.UpdateMigrationStatusParams;
import com.zing.zalo.data.zalocloud.model.api.VerifyCloudQueueResponse;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.AbstractC20095b;
import hm0.C20096c;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import jm0.C21294d;
import jm0.C21296f;
import jm0.InterfaceC21299i;
import kotlinx.serialization.json.JsonObject;
import me0.AbstractC23138m0;
import me0.AbstractC23148n;
import me0.AbstractC23238v2;
import me0.AbstractC23244v8;
import me0.C23055e5;
import on0.C24321d;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p609wh.AbstractC29039u0;
import p609wh.C29037t0;
import p613wl.C29085a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25370t;
import sl.C26316a;
import sl.C26317b;
import sl.C26318c;
import sl.C26319d;
import tg0.C26676b;
import tn0.C26788f;
import un0.AbstractC27323a;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: ul.d */
/* loaded from: classes3.dex */
public final class C27298d implements InterfaceC27297c {
    public static final a Companion = new a(null);

    /* renamed from: ul.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ul.d$a0 */
    /* loaded from: classes3.dex */
    static final class a0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C26317b f128410q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(C26317b c26317b) {
            super(2);
            this.f128410q = c26317b;
        }

        /* renamed from: a */
        public final void m139747a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "req");
            AbstractC19074t.m100208f(linkedHashMap, "<anonymous parameter 1>");
            JSONObject jSONObject = new JSONObject();
            C26317b c26317b = this.f128410q;
            jSONObject.put("client_type", 1);
            jSONObject.put("client_version", CoreUtility.f89236l);
            jSONObject.put("key_version", c26317b.m135452d());
            jSONObject.put("public_key", c26317b.m135454f());
            jSONObject.put("encrypted_private_key", c26317b.m135451c());
            jSONObject.put("encrypt_key_hash", c26317b.m135449a());
            jSONObject.put("encrypt_type", c26317b.m135450b());
            if (c26317b.m135453e() != -1) {
                jSONObject.put("opt_in", c26317b.m135453e());
            }
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            byte[] bytes = jSONObject2.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            c29037t0.m110309g0(new C21296f("key", "", "application/json", bytes));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139747a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ul.d$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final a Companion;

        /* renamed from: q */
        public static final b f128411q = new b("DOWNLOAD_URL", 0, "/downloadurls/v1");

        /* renamed from: r */
        private static final /* synthetic */ b[] f128412r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f128413s;

        /* renamed from: p */
        private final String f128414p;

        /* renamed from: ul.d$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m139750a(String str) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                for (b bVar : b.values()) {
                    if (AbstractC19074t.m100204b(bVar.m139749c(), str)) {
                        return bVar;
                    }
                }
                return null;
            }
        }

        static {
            b[] m139748b = m139748b();
            f128412r = m139748b;
            f128413s = AbstractC30166b.m148796a(m139748b);
            Companion = new a(null);
        }

        private b(String str, int i11, String str2) {
            this.f128414p = str2;
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m139748b() {
            return new b[]{f128411q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f128412r.clone();
        }

        /* renamed from: c */
        public final String m139749c() {
            return this.f128414p;
        }
    }

    /* renamed from: ul.d$b0 */
    /* loaded from: classes3.dex */
    static final class b0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128415q;

        /* renamed from: r */
        final /* synthetic */ List f128416r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(InterfaceC18505l interfaceC18505l, List list) {
            super(1);
            this.f128415q = interfaceC18505l;
            this.f128416r = list;
        }

        /* renamed from: a */
        public final void m139751a(JSONObject jSONObject) {
            int m131511r;
            JSONArray jSONArray;
            AbstractC19074t.m100208f(jSONObject, "jsonObj");
            int optInt = jSONObject.optInt("error_code");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            ArrayList arrayList = new ArrayList();
            if (optInt != 0) {
                if (optJSONObject != null) {
                    jSONArray = optJSONObject.optJSONArray("noiseIdsErr");
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        arrayList.add(jSONArray.getString(i11));
                    }
                }
            }
            InterfaceC18505l interfaceC18505l = this.f128415q;
            List list = this.f128416r;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SubmitE2EEInfoParams) it.next()).m41385a());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!arrayList.contains((String) obj)) {
                    arrayList3.add(obj);
                }
            }
            interfaceC18505l.mo205i9(arrayList3);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139751a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ String f128417q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(2);
            this.f128417q = str;
        }

        /* renamed from: a */
        public final void m139752a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            linkedHashMap.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f128417q);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139752a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$c0 */
    /* loaded from: classes3.dex */
    static final class c0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ List f128418q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(List list) {
            super(2);
            this.f128418q = list;
        }

        /* renamed from: a */
        public final void m139753a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            Map m131401f;
            AbstractC19074t.m100208f(c29037t0, "req");
            AbstractC19074t.m100208f(linkedHashMap, "<anonymous parameter 1>");
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            List list = this.f128418q;
            m145315b.mo131586a();
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("info", m145315b.m139868e(new C26788f(SubmitE2EEInfoParams.Companion.serializer()), list)));
            byte[] bytes = new JsonObject(m131401f).toString().getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            c29037t0.m110309g0(new C21296f("data", "", "application/json", bytes));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139753a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C26316a f128419q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C26316a c26316a) {
            super(2);
            this.f128419q = c26316a;
        }

        /* renamed from: a */
        public final void m139754a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "req");
            AbstractC19074t.m100208f(linkedHashMap, "<anonymous parameter 1>");
            JSONObject jSONObject = new JSONObject();
            C26316a c26316a = this.f128419q;
            jSONObject.put("client_type", 1);
            jSONObject.put("client_version", CoreUtility.f89236l);
            jSONObject.put("encrypt_key_hash", c26316a.m135445a());
            jSONObject.put("new_encrypted_private_key", c26316a.m135448d());
            jSONObject.put("new_encrypt_key_hash", c26316a.m135447c());
            jSONObject.put("encrypt_type", c26316a.m135446b());
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            byte[] bytes = jSONObject2.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            c29037t0.m110310h(new C21294d("key", "key", "application/json", false, bytes));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139754a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$d0 */
    /* loaded from: classes3.dex */
    static final class d0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18510q f128420q;

        /* renamed from: r */
        final /* synthetic */ String f128421r;

        /* renamed from: s */
        final /* synthetic */ String f128422s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(InterfaceC18510q interfaceC18510q, String str, String str2) {
            super(1);
            this.f128420q = interfaceC18510q;
            this.f128421r = str;
            this.f128422s = str2;
        }

        /* renamed from: a */
        public final void m139755a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            InterfaceC18510q interfaceC18510q = this.f128420q;
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m145315b.mo131586a();
            interfaceC18510q.mo45599Hr(m145315b.m139867d(BaseResponse.Companion.serializer(), jSONObject2), this.f128421r, this.f128422s);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139755a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.d$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final e f128423q = new e();

        e() {
            super(2);
        }

        /* renamed from: a */
        public final void m139756a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139756a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$e0 */
    /* loaded from: classes3.dex */
    static final class e0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ String f128424q;

        /* renamed from: r */
        final /* synthetic */ String f128425r;

        /* renamed from: s */
        final /* synthetic */ String f128426s;

        /* renamed from: t */
        final /* synthetic */ List f128427t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, String str2, String str3, List list) {
            super(2);
            this.f128424q = str;
            this.f128425r = str2;
            this.f128426s = str3;
            this.f128427t = list;
        }

        /* renamed from: a */
        public final void m139757a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            String m131214n0;
            AbstractC19074t.m100208f(c29037t0, "req");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            linkedHashMap.put("total_part", this.f128424q);
            linkedHashMap.put("part_id", this.f128425r);
            linkedHashMap.put("submit_id", this.f128426s);
            m131214n0 = AbstractC25332a0.m131214n0(this.f128427t, ",", null, null, 0, null, null, 62, null);
            byte[] bytes = m131214n0.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            c29037t0.m110309g0(new C21296f("file", "noise_ids.txt", "text/plain", bytes));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139757a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.d$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final f f128428q = new f();

        f() {
            super(2);
        }

        /* renamed from: a */
        public final void m139758a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139758a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$f0 */
    /* loaded from: classes3.dex */
    static final class f0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f0 f128429q = new f0();

        f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m139759a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139759a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.d$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f128430q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC18509p interfaceC18509p) {
            super(3);
            this.f128430q = interfaceC18509p;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m139760a(((Number) obj).intValue(), (String) obj2, (String) obj3);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m139760a(int i11, String str, String str2) {
            AbstractC19074t.m100208f(str, "msg");
            AbstractC19074t.m100208f(str2, "<anonymous parameter 2>");
            this.f128430q.mo240pC(Integer.valueOf(i11), str);
        }
    }

    /* renamed from: ul.d$g0 */
    /* loaded from: classes3.dex */
    static final class g0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final g0 f128431q = new g0();

        g0() {
            super(2);
        }

        /* renamed from: a */
        public final void m139761a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139761a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC21299i {

        /* renamed from: b */
        final /* synthetic */ String f128433b;

        /* renamed from: c */
        final /* synthetic */ boolean f128434c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18505l f128435d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC18510q f128436e;

        h(String str, boolean z11, InterfaceC18505l interfaceC18505l, InterfaceC18510q interfaceC18510q) {
            this.f128433b = str;
            this.f128434c = z11;
            this.f128435d = interfaceC18505l;
            this.f128436e = interfaceC18510q;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            String m104490b = c20096c.m104490b();
            if (m104490b == null) {
                m104490b = "";
            }
            String m96095n = AbstractC18069a.m96095n(m104490b, "data");
            AbstractC19074t.m100207e(m96095n, "optString(...)");
            C26676b.m136955e("SMLZCloudApiHelper", "onRequestFailed(" + this.f128433b + "): " + c20096c + ". " + m96095n, C26676b.b.f126335t);
            InterfaceC18510q interfaceC18510q = this.f128436e;
            Integer valueOf = Integer.valueOf(c20096c.m104491c());
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18510q.mo45599Hr(valueOf, m104492d, m96095n);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            String str;
            AbstractC19074t.m100208f(jSONObject, "result");
            if (C27298d.this.m139739F(this.f128433b)) {
                String str2 = this.f128433b;
                if (this.f128434c) {
                    str = C27298d.this.m139738E(jSONObject);
                } else {
                    str = "";
                }
                C26676b.m136955e("SMLZCloudApiHelper", "onRequestComplete(" + str2 + ")" + str, C26676b.b.f126332q);
            }
            this.f128435d.mo205i9(jSONObject);
        }
    }

    /* renamed from: ul.d$h0 */
    /* loaded from: classes3.dex */
    static final class h0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ int f128437q;

        /* renamed from: r */
        final /* synthetic */ JSONObject f128438r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(int i11, JSONObject jSONObject) {
            super(2);
            this.f128437q = i11;
            this.f128438r = jSONObject;
        }

        /* renamed from: a */
        public final void m139762a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "req");
            AbstractC19074t.m100208f(linkedHashMap, "<anonymous parameter 1>");
            JSONObject jSONObject = new JSONObject();
            int i11 = this.f128437q;
            JSONObject jSONObject2 = this.f128438r;
            jSONObject.put("qos_code", i11);
            jSONObject.put("info", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            byte[] bytes = jSONObject3.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            c29037t0.m110309g0(new C21296f("data", "", "application/json", bytes));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139762a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.d$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final i f128439q = new i();

        i() {
            super(2);
        }

        /* renamed from: a */
        public final void m139763a(C29037t0 c29037t0, RequestPacket requestPacket) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(requestPacket, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139763a((C29037t0) obj, (RequestPacket) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$i0 */
    /* loaded from: classes3.dex */
    static final class i0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ TransferCloudKeyParams f128440q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(TransferCloudKeyParams transferCloudKeyParams) {
            super(2);
            this.f128440q = transferCloudKeyParams;
        }

        /* renamed from: a */
        public final void m139764a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            linkedHashMap.put("data", C29085a.f134890a.m145315b().mo131597b(TransferCloudKeyParams.Companion.serializer(), this.f128440q));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139764a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ int f128441a;

        /* renamed from: b */
        final /* synthetic */ boolean f128442b;

        /* renamed from: c */
        final /* synthetic */ C27298d f128443c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18505l f128444d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC18509p f128445e;

        j(int i11, boolean z11, C27298d c27298d, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
            this.f128441a = i11;
            this.f128442b = z11;
            this.f128443c = c27298d;
            this.f128444d = interfaceC18505l;
            this.f128445e = interfaceC18509p;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            C26676b.m136955e("SMLZCloudApiHelper", "onRequestFailed(" + this.f128441a + "): " + c20096c, C26676b.b.f126335t);
            InterfaceC18509p interfaceC18509p = this.f128445e;
            Integer valueOf = Integer.valueOf(c20096c.m104489a());
            String m104493e = c20096c.m104493e();
            AbstractC19074t.m100207e(m104493e, "getMessageBase(...)");
            interfaceC18509p.mo240pC(valueOf, m104493e);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            String str;
            AbstractC19074t.m100208f(jSONObject, "result");
            int i11 = this.f128441a;
            if (this.f128442b) {
                str = this.f128443c.m139738E(jSONObject);
            } else {
                str = "";
            }
            C26676b.m136955e("SMLZCloudApiHelper", "onRequestComplete(" + i11 + ")" + str, C26676b.b.f126332q);
            this.f128444d.mo205i9(jSONObject);
        }
    }

    /* renamed from: ul.d$j0 */
    /* loaded from: classes3.dex */
    static final class j0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f128446q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18494a f128447r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(InterfaceC18509p interfaceC18509p, InterfaceC18494a interfaceC18494a) {
            super(1);
            this.f128446q = interfaceC18509p;
            this.f128447r = interfaceC18494a;
        }

        /* renamed from: a */
        public final void m139765a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            int optInt = jSONObject.optInt("error_code");
            String optString = jSONObject.optString("error_message");
            if (optInt != 0) {
                InterfaceC18509p interfaceC18509p = this.f128446q;
                Integer valueOf = Integer.valueOf(optInt);
                AbstractC19074t.m100205c(optString);
                interfaceC18509p.mo240pC(valueOf, optString);
                return;
            }
            this.f128447r.mo12V4();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139765a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$k */
    /* loaded from: classes3.dex */
    static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128448q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18509p f128449r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
            super(1);
            this.f128448q = interfaceC18505l;
            this.f128449r = interfaceC18509p;
        }

        /* renamed from: a */
        public final void m139766a(JSONObject jSONObject) {
            String str = "";
            AbstractC19074t.m100208f(jSONObject, "it");
            try {
                Object optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject == null) {
                    optJSONObject = "";
                }
                AbstractC27323a m145315b = C29085a.f134890a.m145315b();
                String obj = optJSONObject.toString();
                m145315b.mo131586a();
                this.f128448q.mo205i9((CloudInfoResponse) m145315b.m139867d(CloudInfoResponse.Companion.serializer(), obj));
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudApiHelper", e11);
                InterfaceC18509p interfaceC18509p = this.f128449r;
                String message = e11.getMessage();
                if (message != null) {
                    str = message;
                }
                interfaceC18509p.mo240pC(0, str);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139766a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$k0 */
    /* loaded from: classes3.dex */
    static final class k0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C26318c f128450q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(C26318c c26318c) {
            super(2);
            this.f128450q = c26318c;
        }

        /* renamed from: a */
        public final void m139767a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "req");
            AbstractC19074t.m100208f(linkedHashMap, "<anonymous parameter 1>");
            JSONObject jSONObject = new JSONObject();
            C26318c c26318c = this.f128450q;
            jSONObject.put("cloud_media_file_size_limit", c26318c.m135455a());
            jSONObject.put("my_cloud_file_size_limit", c26318c.m135458d());
            jSONObject.put("enable_community", c26318c.m135456b());
            jSONObject.put("enable_offload", c26318c.m135457c());
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            byte[] bytes = jSONObject2.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            c29037t0.m110309g0(new C21296f("settings", "", "application/json", bytes));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139767a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$l */
    /* loaded from: classes3.dex */
    static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128451q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f128451q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m139768a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            Object optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                optJSONObject = "";
            }
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            String obj = optJSONObject.toString();
            m145315b.mo131586a();
            this.f128451q.mo205i9((CloudKeyResponse) m145315b.m139867d(CloudKeyResponse.Companion.serializer(), obj));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139768a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$l0 */
    /* loaded from: classes3.dex */
    static final class l0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f128452q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18494a f128453r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(InterfaceC18509p interfaceC18509p, InterfaceC18494a interfaceC18494a) {
            super(1);
            this.f128452q = interfaceC18509p;
            this.f128453r = interfaceC18494a;
        }

        /* renamed from: a */
        public final void m139769a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            int optInt = jSONObject.optInt("error_code");
            String optString = jSONObject.optString("error_message");
            if (optInt != 0) {
                InterfaceC18509p interfaceC18509p = this.f128452q;
                Integer valueOf = Integer.valueOf(optInt);
                AbstractC19074t.m100205c(optString);
                interfaceC18509p.mo240pC(valueOf, optString);
                return;
            }
            this.f128453r.mo12V4();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139769a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$m */
    /* loaded from: classes3.dex */
    static final class m extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ String f128454q;

        /* renamed from: r */
        final /* synthetic */ int f128455r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, int i11) {
            super(2);
            this.f128454q = str;
            this.f128455r = i11;
        }

        /* renamed from: a */
        public final void m139770a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            linkedHashMap.put("encrypt_key_hash", this.f128454q);
            linkedHashMap.put("encrypt_type", String.valueOf(this.f128455r));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139770a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$m0 */
    /* loaded from: classes3.dex */
    static final class m0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ UpdateMigrationStatusParams f128456q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(UpdateMigrationStatusParams updateMigrationStatusParams) {
            super(2);
            this.f128456q = updateMigrationStatusParams;
        }

        /* renamed from: a */
        public final void m139771a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "req");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            UpdateMigrationStatusParams updateMigrationStatusParams = this.f128456q;
            m145315b.mo131586a();
            byte[] bytes = m145315b.m139868e(UpdateMigrationStatusParams.Companion.serializer(), updateMigrationStatusParams).toString().getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            c29037t0.m110309g0(new C21296f("migratestatus", "", "application/json", bytes));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139771a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$n */
    /* loaded from: classes3.dex */
    static final class n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128457q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18509p f128458r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
            super(1);
            this.f128457q = interfaceC18505l;
            this.f128458r = interfaceC18509p;
        }

        /* renamed from: a */
        public final void m139772a(JSONObject jSONObject) {
            Object obj;
            String str = "";
            AbstractC19074t.m100208f(jSONObject, "it");
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    obj = optJSONObject.optJSONObject("cloud_settings");
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = "";
                }
                AbstractC27323a m145315b = C29085a.f134890a.m145315b();
                String obj2 = obj.toString();
                m145315b.mo131586a();
                this.f128457q.mo205i9((CloudSettings) m145315b.m139867d(CloudSettings.Companion.serializer(), obj2));
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudApiHelper", e11);
                InterfaceC18509p interfaceC18509p = this.f128458r;
                String message = e11.getMessage();
                if (message != null) {
                    str = message;
                }
                interfaceC18509p.mo240pC(0, str);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139772a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$n0 */
    /* loaded from: classes3.dex */
    static final class n0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128459q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f128459q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m139773a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            Object optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                optJSONObject = "";
            }
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            String obj = optJSONObject.toString();
            m145315b.mo131586a();
            this.f128459q.mo205i9((VerifyCloudQueueResponse) m145315b.m139867d(VerifyCloudQueueResponse.Companion.serializer(), obj));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139773a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$o */
    /* loaded from: classes3.dex */
    static final class o extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128460q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18509p f128461r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
            super(1);
            this.f128460q = interfaceC18505l;
            this.f128461r = interfaceC18509p;
        }

        /* renamed from: a */
        public final void m139774a(JSONObject jSONObject) {
            Object obj;
            String str = "";
            AbstractC19074t.m100208f(jSONObject, "it");
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    obj = optJSONObject.optJSONObject("patterns");
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = "";
                }
                AbstractC27323a m145315b = C29085a.f134890a.m145315b();
                String obj2 = obj.toString();
                m145315b.mo131586a();
                this.f128460q.mo205i9((CloudUrlPattern) m145315b.m139867d(CloudUrlPattern.Companion.serializer(), obj2));
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudApiHelper", e11);
                InterfaceC18509p interfaceC18509p = this.f128461r;
                String message = e11.getMessage();
                if (message != null) {
                    str = message;
                }
                interfaceC18509p.mo240pC(0, str);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139774a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$o0 */
    /* loaded from: classes3.dex */
    static final class o0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C26319d f128462q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(C26319d c26319d) {
            super(2);
            this.f128462q = c26319d;
        }

        /* renamed from: a */
        public final void m139775a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            String m131214n0;
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            String m135459a = this.f128462q.m135459a();
            Charset charset = C24321d.f117408b;
            byte[] bytes = m135459a.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            String m119744h = AbstractC23244v8.m119744h(bytes);
            m131214n0 = AbstractC25332a0.m131214n0(this.f128462q.m135460b(), ",", null, null, 0, null, null, 62, null);
            byte[] bytes2 = m131214n0.getBytes(charset);
            AbstractC19074t.m100207e(bytes2, "getBytes(...)");
            String m119744h2 = AbstractC23244v8.m119744h(bytes2);
            linkedHashMap.put("load_type", "1");
            AbstractC19074t.m100205c(m119744h);
            linkedHashMap.put("last_noise_id", m119744h);
            AbstractC19074t.m100205c(m119744h2);
            linkedHashMap.put("list_noise_ids", m119744h2);
            linkedHashMap.put("tracking_source", String.valueOf(this.f128462q.m135461c()));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139775a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$p */
    /* loaded from: classes3.dex */
    static final class p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128463q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f128463q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m139776a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            Object optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                optJSONObject = "";
            }
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            String obj = optJSONObject.toString();
            m145315b.mo131586a();
            this.f128463q.mo205i9((MyCloudQuotaUsageResponse) m145315b.m139867d(MyCloudQuotaUsageResponse.Companion.serializer(), obj));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139776a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$q */
    /* loaded from: classes3.dex */
    static final class q extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128464q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f128464q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m139777a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            Object optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                optJSONObject = "";
            }
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            String obj = optJSONObject.toString();
            m145315b.mo131586a();
            this.f128464q.mo205i9((CloudQuotaUsageResponse) m145315b.m139867d(CloudQuotaUsageResponse.Companion.serializer(), obj));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139777a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$r */
    /* loaded from: classes3.dex */
    static final class r extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f128465q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f128466r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f128465q = interfaceC18509p;
            this.f128466r = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m139778a(JSONObject jSONObject) {
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(jSONObject, "json");
            try {
                int optInt = jSONObject.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                if (optInt == 0) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                    if (optJSONObject2 != null) {
                        InterfaceC18505l interfaceC18505l = this.f128466r;
                        String jSONObject2 = optJSONObject2.toString();
                        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                        if (jSONObject2.length() > 0 && (optJSONObject = optJSONObject2.optJSONObject("store")) != null) {
                            interfaceC18505l.mo205i9(optJSONObject);
                        }
                    }
                } else {
                    String optString = jSONObject.optString("message");
                    C27296b m139712a = C27296b.Companion.m139712a();
                    AbstractC19074t.m100205c(optString);
                    m139712a.m139710b(optInt, optString);
                    this.f128465q.mo240pC(Integer.valueOf(optInt), optString);
                }
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudApiHelper", e11);
                InterfaceC18509p interfaceC18509p = this.f128465q;
                String message = e11.getMessage();
                if (message == null) {
                    message = "";
                }
                interfaceC18509p.mo240pC(0, message);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139778a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$s */
    /* loaded from: classes3.dex */
    static final class s extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f128467q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(InterfaceC18509p interfaceC18509p) {
            super(2);
            this.f128467q = interfaceC18509p;
        }

        /* renamed from: a */
        public final void m139779a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMsg");
            C27296b.Companion.m139712a().m139710b(i11, str);
            this.f128467q.mo240pC(Integer.valueOf(i11), str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139779a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$t */
    /* loaded from: classes3.dex */
    static final class t extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ JSONObject f128468q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(JSONObject jSONObject) {
            super(2);
            this.f128468q = jSONObject;
        }

        /* renamed from: a */
        public final void m139780a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            JSONObject jSONObject = this.f128468q;
            linkedHashMap.put("product_id", jSONObject.optString("product_id"));
            linkedHashMap.put("base_plan_id", jSONObject.optString("base_plan_id"));
            String optString = jSONObject.optString("offer_id");
            AbstractC19074t.m100205c(optString);
            if (optString.length() > 0) {
                linkedHashMap.put("offer_id", optString);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139780a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$u */
    /* loaded from: classes3.dex */
    static final class u extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ int f128469q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i11) {
            super(2);
            this.f128469q = i11;
        }

        /* renamed from: a */
        public final void m139781a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            linkedHashMap.put("bitmap", String.valueOf(this.f128469q));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139781a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$v */
    /* loaded from: classes3.dex */
    static final class v extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f128470q;

        /* renamed from: r */
        final /* synthetic */ String f128471r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC18505l f128472s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(InterfaceC18509p interfaceC18509p, String str, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f128470q = interfaceC18509p;
            this.f128471r = str;
            this.f128472s = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m139782a(JSONObject jSONObject) {
            String str;
            AbstractC19074t.m100208f(jSONObject, "it");
            int optInt = jSONObject.optInt("error_code");
            String optString = jSONObject.optString("error_message");
            if (optInt != 0) {
                InterfaceC18509p interfaceC18509p = this.f128470q;
                Integer valueOf = Integer.valueOf(optInt);
                AbstractC19074t.m100205c(optString);
                interfaceC18509p.mo240pC(valueOf, optString);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            if (optJSONObject != null) {
                str = optJSONObject.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            m145315b.mo131586a();
            DownloadUrlsResponse downloadUrlsResponse = (DownloadUrlsResponse) m145315b.m139867d(DownloadUrlsResponse.Companion.serializer(), str);
            C26676b.m136955e("SMLZCloudApiHelper", "onRequestComplete(" + this.f128471r + "): " + downloadUrlsResponse, C26676b.b.f126332q);
            this.f128472s.mo205i9(downloadUrlsResponse);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139782a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$w */
    /* loaded from: classes3.dex */
    static final class w extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ List f128473q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(List list) {
            super(2);
            this.f128473q = list;
        }

        /* renamed from: a */
        public final void m139783a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            String m131214n0;
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            m131214n0 = AbstractC25332a0.m131214n0(this.f128473q, ",", null, null, 0, null, null, 62, null);
            byte[] bytes = m131214n0.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            String m119744h = AbstractC23244v8.m119744h(bytes);
            AbstractC19074t.m100205c(m119744h);
            linkedHashMap.put("list_noise_ids", m119744h);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139783a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$x */
    /* loaded from: classes3.dex */
    static final class x extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128474q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f128474q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m139784a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            InterfaceC18505l interfaceC18505l = this.f128474q;
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m145315b.mo131586a();
            interfaceC18505l.mo205i9(m145315b.m139867d(BaseResponse.Companion.serializer(), jSONObject2));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139784a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$y */
    /* loaded from: classes3.dex */
    static final class y extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ long f128475q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(long j11) {
            super(2);
            this.f128475q = j11;
        }

        /* renamed from: a */
        public final void m139785a(C29037t0 c29037t0, RequestPacket requestPacket) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(requestPacket, "reqPacket");
            requestPacket.m93304z(this.f128475q);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139785a((C29037t0) obj, (RequestPacket) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ul.d$z */
    /* loaded from: classes3.dex */
    static final class z extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f128476q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f128476q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m139786a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m145315b.mo131586a();
            this.f128476q.mo205i9((SubmitCloudKeyResponse) m145315b.m139867d(SubmitCloudKeyResponse.Companion.serializer(), jSONObject2));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139786a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: A */
    static /* synthetic */ void m139734A(C27298d c27298d, int i11, String str, String str2, int i12, boolean z11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2, int i13, Object obj) {
        String str3;
        int i14;
        boolean z12;
        InterfaceC18509p interfaceC18509p3;
        if ((i13 & 2) != 0) {
            String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_CLOUD_MEDIA);
            AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
            str3 = m145033a;
        } else {
            str3 = str;
        }
        if ((i13 & 8) != 0) {
            i14 = -1;
        } else {
            i14 = i12;
        }
        if ((i13 & 16) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i13 & 128) != 0) {
            interfaceC18509p3 = f.f128428q;
        } else {
            interfaceC18509p3 = interfaceC18509p2;
        }
        c27298d.m139744y(i11, str3, str2, i14, z12, interfaceC18505l, interfaceC18509p, interfaceC18509p3);
    }

    /* renamed from: B */
    static /* synthetic */ void m139735B(C27298d c27298d, int i11, String str, String str2, int i12, boolean z11, InterfaceC18505l interfaceC18505l, InterfaceC18510q interfaceC18510q, InterfaceC18509p interfaceC18509p, int i13, Object obj) {
        String str3;
        int i14;
        boolean z12;
        InterfaceC18509p interfaceC18509p2;
        if ((i13 & 2) != 0) {
            String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_CLOUD_MEDIA);
            AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
            str3 = m145033a;
        } else {
            str3 = str;
        }
        if ((i13 & 8) != 0) {
            i14 = -1;
        } else {
            i14 = i12;
        }
        if ((i13 & 16) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i13 & 128) != 0) {
            interfaceC18509p2 = e.f128423q;
        } else {
            interfaceC18509p2 = interfaceC18509p;
        }
        c27298d.m139745z(i11, str3, str2, i14, z12, interfaceC18505l, interfaceC18510q, interfaceC18509p2);
    }

    /* renamed from: C */
    private final void m139736C(int i11, int i12, byte[] bArr, int i13, boolean z11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, long j11, InterfaceC18509p interfaceC18509p2) {
        if (!AbstractC23138m0.Companion.m118774a()) {
            interfaceC18509p.mo240pC(-2, "Invalid User ID");
            return;
        }
        if (!C23055e5.m118273h(false, 1, null)) {
            String str = AbstractC20095b.f98829a;
            AbstractC19074t.m100207e(str, "NETWORK_ERROR_MSG");
            interfaceC18509p.mo240pC(50001, str);
            return;
        }
        C29037t0 c29037t0 = new C29037t0(new j(i11, z11, this, interfaceC18505l, interfaceC18509p));
        c29037t0.f103775r = 2;
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        requestPacket.m93273D(Integer.parseInt(str2));
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) i11);
        requestPacket.m93275F((byte) i12);
        if (i13 != -1) {
            c29037t0.m110305c0(i13);
        }
        if (j11 > 0) {
            requestPacket.m93270A(j11);
        }
        requestPacket.m93303y(bArr);
        interfaceC18509p2.mo240pC(c29037t0, requestPacket);
        c29037t0.m110313i0(requestPacket);
        C26676b.m136955e("SMLZCloudApiHelper", "executeSocketRequest(): " + c29037t0 + ", timeout=" + j11 + "ms", C26676b.b.f126332q);
        C0829l0.m2174c(c29037t0);
    }

    /* renamed from: D */
    static /* synthetic */ void m139737D(C27298d c27298d, int i11, int i12, byte[] bArr, int i13, boolean z11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, long j11, InterfaceC18509p interfaceC18509p2, int i14, Object obj) {
        int i15;
        boolean z12;
        long j12;
        InterfaceC18509p interfaceC18509p3;
        if ((i14 & 8) != 0) {
            i15 = -1;
        } else {
            i15 = i13;
        }
        if ((i14 & 16) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i14 & 128) != 0) {
            j12 = 0;
        } else {
            j12 = j11;
        }
        if ((i14 & 256) != 0) {
            interfaceC18509p3 = i.f128439q;
        } else {
            interfaceC18509p3 = interfaceC18509p2;
        }
        c27298d.m139736C(i11, i12, bArr, i15, z12, interfaceC18505l, interfaceC18509p, j12, interfaceC18509p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final String m139738E(JSONObject jSONObject) {
        String optString = jSONObject.optString("data");
        AbstractC19074t.m100205c(optString);
        if (optString.length() == 0) {
            return "";
        }
        return ": " + optString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final boolean m139739F(String str) {
        if (b.Companion.m139750a(str) != b.f128411q) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private final ByteArrayOutputStream m139742w(String str, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        AbstractC23238v2.m119728m(byteArrayOutputStream, str);
        byteArrayOutputStream.write(AbstractC23148n.m118830d());
        byteArrayOutputStream.write(i11);
        return byteArrayOutputStream;
    }

    /* renamed from: x */
    static /* synthetic */ ByteArrayOutputStream m139743x(C27298d c27298d, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return c27298d.m139742w(str, i11);
    }

    /* renamed from: y */
    private final void m139744y(int i11, String str, String str2, int i12, boolean z11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2) {
        m139745z(i11, str, str2, i12, z11, interfaceC18505l, new g(interfaceC18509p), interfaceC18509p2);
    }

    /* renamed from: z */
    private final void m139745z(int i11, String str, String str2, int i12, boolean z11, InterfaceC18505l interfaceC18505l, InterfaceC18510q interfaceC18510q, InterfaceC18509p interfaceC18509p) {
        if (!AbstractC23138m0.Companion.m118774a()) {
            interfaceC18510q.mo45599Hr(-2, "Invalid User ID", "");
            return;
        }
        if (!C23055e5.m118273h(false, 1, null)) {
            String str3 = AbstractC20095b.f98829a;
            AbstractC19074t.m100207e(str3, "NETWORK_ERROR_MSG");
            interfaceC18510q.mo45599Hr(50001, str3, "");
            return;
        }
        h hVar = new h(str2, z11, interfaceC18505l, interfaceC18510q);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("client_type", "1");
        linkedHashMap.put("client_version", String.valueOf(CoreUtility.f89236l));
        C27299e c27299e = new C27299e(hVar);
        c27299e.f103775r = i11;
        interfaceC18509p.mo240pC(c27299e, linkedHashMap);
        c27299e.m110308g("cloud-viewer-key", C27301g.Companion.m139821a().m139819b());
        Set keySet = linkedHashMap.keySet();
        AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
        String[] strArr = (String[]) keySet.toArray(new String[0]);
        Collection values = linkedHashMap.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        c27299e.m110314j(str + str2, "", strArr, (String[]) values.toArray(new String[0]));
        c27299e.f103773p = new Random().nextInt(Integer.MAX_VALUE);
        if (i12 != -1) {
            c27299e.m110305c0(i12);
        }
        C26676b.m136955e("SMLZCloudApiHelper", "executeRequest(): " + c27299e, C26676b.b.f126332q);
        C0808c0.m2046b(c27299e);
    }

    /* renamed from: G */
    public long m139746G(RequestMigrateServerItemParams requestMigrateServerItemParams, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, long j11) {
        AbstractC19074t.m100208f(requestMigrateServerItemParams, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        ByteArrayOutputStream m139743x = m139743x(this, null, 0, 3, null);
        AbstractC23238v2.m119728m(m139743x, "localhost");
        AbstractC23238v2.m119728m(m139743x, C29085a.f134890a.m145314a().mo131597b(RequestMigrateServerItemParams.Companion.serializer(), requestMigrateServerItemParams));
        long mostSignificantBits = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        byte[] byteArray = m139743x.toByteArray();
        AbstractC19074t.m100207e(byteArray, "toByteArray(...)");
        m139737D(this, 2605, 0, byteArray, 0, false, new x(interfaceC18505l), interfaceC18509p, j11, new y(mostSignificantBits), 24, null);
        return mostSignificantBits;
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: a */
    public void mo139714a(C26317b c26317b, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c26317b, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 9, null, "/keys/v2/subscriptions", 0, false, new z(interfaceC18505l), interfaceC18509p, new a0(c26317b), 26, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: b */
    public void mo139715b(int i11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 10, null, "/onboarding/opt-in/v1", 0, false, interfaceC18505l, interfaceC18509p, new u(i11), 26, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: c */
    public void mo139716c(String str, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 10, null, "/onboarding/ack/v1", 0, false, interfaceC18505l, interfaceC18509p, new c(str), 26, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: d */
    public void mo139717d(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 10, null, "/info/v1/usage-zcloud", 1504500, false, new q(interfaceC18505l), interfaceC18509p, null, 146, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: e */
    public void mo139718e(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 11, null, "/queue/mb/reset", 1504201, false, interfaceC18505l, interfaceC18509p, null, 146, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: f */
    public void mo139719f(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 10, null, "/info/v1/cloud-settings", 0, false, new n(interfaceC18505l, interfaceC18509p), interfaceC18509p, null, 154, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: g */
    public void mo139720g(JSONObject jSONObject, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(jSONObject, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 11, "https://dev-media.api.zaloapp.com/cloudmedia", "/payment/v1/req-payment-iap", 0, false, new r(interfaceC18509p, interfaceC18505l), new s(interfaceC18509p), new t(jSONObject), 24, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: h */
    public void mo139721h(C26319d c26319d, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c26319d, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 10, null, "/queue/mb/verify", 1504200, false, new n0(interfaceC18505l), interfaceC18509p, new o0(c26319d), 2, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: i */
    public void mo139722i(int i11, JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "params");
        String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_CLOUD_QOS);
        AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
        m139734A(this, 9, m145033a, "/realtimeqos/v1/errorinfo", 0, false, f0.f128429q, g0.f128431q, new h0(i11, jSONObject), 8, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: j */
    public void mo139723j(UpdateMigrationStatusParams updateMigrationStatusParams, InterfaceC18494a interfaceC18494a, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(updateMigrationStatusParams, "params");
        AbstractC19074t.m100208f(interfaceC18494a, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_CLOUD);
        AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
        m139734A(this, 9, m145033a, "/migration/v1/migratestatus", 1504420, false, new l0(interfaceC18509p, interfaceC18494a), interfaceC18509p, new m0(updateMigrationStatusParams), 16, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: k */
    public void mo139724k(String str, String str2, String str3, List list, InterfaceC18510q interfaceC18510q, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "totalPart");
        AbstractC19074t.m100208f(str2, "partId");
        AbstractC19074t.m100208f(str3, "submitId");
        AbstractC19074t.m100208f(list, "listIds");
        AbstractC19074t.m100208f(interfaceC18510q, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        C26676b.m136958h("submitLocalCloudQueue(): totalPart=" + str + ", partId=" + str2 + ", submitId=" + str3 + ", listIds.size=" + list.size(), null, 2, null);
        String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_CLOUD_QOS);
        AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
        m139734A(this, 9, m145033a, "/cloudqueue/v1/qosallqueue/file", 0, false, new d0(interfaceC18510q, str2, str), interfaceC18509p, new e0(str, str2, str3, list), 24, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: l */
    public void mo139725l(List list, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(list, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 9, null, "/queue/mb/submitMediaExtInfo", 1504220, false, new b0(interfaceC18505l, list), interfaceC18509p, new c0(list), 18, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: m */
    public void mo139726m(List list, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(list, "noiseIds");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        String m139749c = b.f128411q.m139749c();
        m139734A(this, 10, null, m139749c, 1504304, false, new v(interfaceC18509p, m139749c, interfaceC18505l), interfaceC18509p, new w(list), 18, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: n */
    public void mo139727n(String str, int i11, InterfaceC18505l interfaceC18505l, InterfaceC18510q interfaceC18510q) {
        AbstractC19074t.m100208f(str, "encryptKeyHash");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18510q, "onError");
        m139735B(this, 10, null, "/keys/v3/cloudkey", 0, false, new l(interfaceC18505l), interfaceC18510q, new m(str, i11), 26, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: o */
    public void mo139728o(C26318c c26318c, InterfaceC18494a interfaceC18494a, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c26318c, "params");
        AbstractC19074t.m100208f(interfaceC18494a, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 9, null, "/settings/v1", 0, false, new j0(interfaceC18509p, interfaceC18494a), interfaceC18509p, new k0(c26318c), 26, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: p */
    public void mo139729p(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_CLOUD);
        AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
        m139734A(this, 10, m145033a, "/cloudinfo/v3/info", 1504002, false, new k(interfaceC18505l, interfaceC18509p), interfaceC18509p, null, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: q */
    public void mo139730q(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 10, null, "/info/v1/usage-mycloud", 1504500, false, new p(interfaceC18505l), interfaceC18509p, null, 146, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: r */
    public void mo139731r(TransferCloudKeyParams transferCloudKeyParams, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(transferCloudKeyParams, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_CLOUD_KEY);
        AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
        m139734A(this, 11, m145033a, "/send_cloud_key", 1504130, false, interfaceC18505l, interfaceC18509p, new i0(transferCloudKeyParams), 16, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: s */
    public void mo139732s(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 10, "https://dev-media.api.zaloapp.com/cloudmedia", "/info/mc-pattern", 0, false, new o(interfaceC18505l, interfaceC18509p), interfaceC18509p, null, 152, null);
    }

    @Override // p550ul.InterfaceC27297c
    /* renamed from: t */
    public void mo139733t(C26316a c26316a, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c26316a, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m139734A(this, 6, null, "/keys/v1/cloudkey/change-backup-key", 0, false, interfaceC18505l, interfaceC18509p, new d(c26316a), 26, null);
    }
}
