package fj;

import ae.C0757b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import eg.C18425b;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Map;
import km0.AbstractC21767b;
import km0.EnumC21773h;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p405ov.C24559a;
import p454qn.AbstractC25384a;
import p609wh.AbstractC29039u0;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25363p0;

/* renamed from: fj.a0 */
/* loaded from: classes.dex */
public final class C18957a0 implements InterfaceC18956a {
    public static final a Companion = new a(null);

    /* renamed from: fj.a0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: fj.a0$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24559a.m127933c("[UnreadMessage]", "getAllConversationsMarkAsUnread failed error = " + c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C24559a.m127933c("[UnreadMessage]", "getAllConversationsMarkAsUnread success res = " + obj);
            JSONObject m131571b = AbstractC25384a.m131571b(String.valueOf(obj));
            if (m131571b == null) {
                return;
            }
            C18425b.Companion.m97655a().m97653m(m131571b);
        }
    }

    /* renamed from: fj.a0$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC21769d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f94643a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f94644b;

        c(InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l) {
            this.f94643a = interfaceC18509p;
            this.f94644b = interfaceC18505l;
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: a */
        public void mo13651a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            AbstractC23350e.m122774d("ChatApiHelper", "onRequestError(): " + str + " (" + i11 + ")");
            this.f94643a.mo240pC(Integer.valueOf(i11), str);
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: b */
        public void mo13652b(EnumC21773h enumC21773h, Object obj) {
            AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(obj, "result");
            if (enumC21773h == EnumC21773h.JSON) {
                this.f94644b.mo205i9((JSONObject) obj);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRequestSuccess(): ");
            sb2.append(obj);
        }
    }

    /* renamed from: c */
    private final String m99470c(C17945a0 c17945a0) {
        if (AbstractC19074t.m100204b(c17945a0.m94862C4(), c17945a0.mo95039W2())) {
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100205c(str);
            return str;
        }
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100205c(mo95039W2);
        return mo95039W2;
    }

    @Override // fj.InterfaceC18956a
    /* renamed from: a */
    public void mo99468a(String str) {
        AbstractC19074t.m100208f(str, "data");
        new C0757b().m1344k(str);
    }

    @Override // fj.InterfaceC18956a
    /* renamed from: b */
    public void mo99469b() {
        b bVar = new b();
        C0757b c0757b = new C0757b();
        c0757b.m1341j(bVar);
        c0757b.m1347n();
    }

    /* renamed from: d */
    public void m99471d(C17945a0 c17945a0, String str, boolean z11, int i11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        Map m131407l;
        AbstractC19074t.m100208f(c17945a0, "msg");
        AbstractC19074t.m100208f(str, "templateId");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        c cVar = new c(interfaceC18509p, interfaceC18505l);
        C24860q[] c24860qArr = new C24860q[5];
        c24860qArr[0] = AbstractC24866w.m129235a("session_key", CoreUtility.f89232h);
        String str2 = "1";
        c24860qArr[1] = AbstractC24866w.m129235a("client_type", "1");
        c24860qArr[2] = AbstractC24866w.m129235a("client_version", String.valueOf(CoreUtility.f89236l));
        if (z11) {
            str2 = "0";
        }
        c24860qArr[3] = AbstractC24866w.m129235a("tracking_type", str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gmi", c17945a0.m95029V3().m41046j());
        jSONObject.put("cmi", c17945a0.m95029V3().m41044h());
        jSONObject.put("fuid", c17945a0.m94862C4());
        jSONObject.put("tuid", m99470c(c17945a0));
        jSONObject.put("ts_rd", AbstractC23306f.m120579F1().mo124310e());
        jSONObject.put("zinst_id", str);
        if (!z11) {
            jSONObject.put("error_code", i11);
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        c24860qArr[4] = AbstractC24866w.m129235a("tracking_data", jSONObject.toString());
        m131407l = AbstractC25363p0.m131407l(c24860qArr);
        InterfaceC21766a m112296a = AbstractC21767b.f105718a.m112296a();
        String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.UPLOAD_ZINSTANT_LOG);
        AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
        InterfaceC21766a.a.m112292c(m112296a, m145033a, 0, false, m131407l, null, null, cVar, 38, null);
    }
}
