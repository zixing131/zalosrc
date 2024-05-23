package p449qi;

import ag0.C0829l0;
import au.AbstractC2373t;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import dj.C17945a0;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jm0.C21294d;
import jm0.InterfaceC21299i;
import km0.AbstractC21767b;
import km0.EnumC21773h;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import me0.C23055e5;
import mm0.AbstractC23350e;
import on0.C24321d;
import org.json.JSONArray;
import org.json.JSONObject;
import p461qu.AbstractC25495a;
import p609wh.AbstractC29039u0;
import p609wh.C29037t0;
import p645xh.C29628e;
import pm0.AbstractC24866w;
import qm0.AbstractC25363p0;

/* renamed from: qi.c */
/* loaded from: classes.dex */
public final class C25291c implements InterfaceC25289a {
    public static final a Companion = new a(null);

    /* renamed from: qi.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: qi.c$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f121275a;

        /* renamed from: b */
        final /* synthetic */ boolean f121276b;

        b(InterfaceC20094a interfaceC20094a, boolean z11) {
            this.f121275a = interfaceC20094a;
            this.f121276b = z11;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            InterfaceC20094a interfaceC20094a = this.f121275a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
            if (this.f121276b && c20096c.m104491c() == 50001) {
                ToastUtils.m89262j();
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            InterfaceC20094a interfaceC20094a = this.f121275a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(jSONObject);
            }
        }
    }

    /* renamed from: qi.c$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f121277a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18509p f121278b;

        c(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
            this.f121277a = interfaceC18505l;
            this.f121278b = interfaceC18509p;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                InterfaceC18509p interfaceC18509p = this.f121278b;
                Integer valueOf = Integer.valueOf(c20096c.m104491c());
                String m104492d = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                interfaceC18509p.mo240pC(valueOf, m104492d);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    this.f121277a.mo205i9(obj);
                    return;
                } else {
                    AbstractC23350e.m122774d("ZaloAutoDownloadApiHelper", "pullActionMedia(): invalid object");
                    return;
                }
            }
            AbstractC23350e.m122774d("ZaloAutoDownloadApiHelper", "pullActionMedia(): NULL");
        }
    }

    /* renamed from: qi.c$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC21769d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f121279a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f121280b;

        d(InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l) {
            this.f121279a = interfaceC18509p;
            this.f121280b = interfaceC18505l;
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: a */
        public void mo13651a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            AbstractC23350e.m122774d("ZaloAutoDownloadApiHelper", "onRequestError(): " + str + " (" + i11 + ")");
            this.f121279a.mo240pC(Integer.valueOf(i11), str);
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: b */
        public void mo13652b(EnumC21773h enumC21773h, Object obj) {
            AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(obj, "result");
            if (enumC21773h == EnumC21773h.JSON) {
                this.f121280b.mo205i9((JSONObject) obj);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRequestSuccess(): ");
            sb2.append(obj);
        }
    }

    /* renamed from: c */
    private final C29037t0 m130866c(InterfaceC20094a interfaceC20094a, boolean z11) {
        return new C29037t0(new b(interfaceC20094a, z11));
    }

    /* renamed from: d */
    static /* synthetic */ C29037t0 m130867d(C25291c c25291c, InterfaceC20094a interfaceC20094a, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c25291c.m130866c(interfaceC20094a, z11);
    }

    @Override // p449qi.InterfaceC25289a
    /* renamed from: a */
    public void mo130863a(List list, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        Map m131407l;
        AbstractC19074t.m100208f(list, "items");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        d dVar = new d(interfaceC18509p, interfaceC18505l);
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("sessionKey", CoreUtility.f89232h), AbstractC24866w.m129235a("clientType", "1"), AbstractC24866w.m129235a("clientVersion", String.valueOf(CoreUtility.f89236l)));
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("threadId", AbstractC25495a.m132090o(c17945a0.mo95039W2()));
            jSONObject.put("destType", c17945a0.m94847A6() ? 1 : 0);
            jSONObject.put("clientmsgId", c17945a0.m95029V3().m41045i());
            jSONObject.put("fromUid", c17945a0.m94862C4());
            jSONObject.put("deviceId", AbstractC2373t.m12409g());
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        byte[] bytes = jSONArray2.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        C21294d c21294d = new C21294d("listAction", "fileName", "application/json", false, bytes);
        InterfaceC21766a m112296a = AbstractC21767b.f105718a.m112296a();
        String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.SUBMIT_ACTION_MEDIA);
        AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
        InterfaceC21766a.a.m112291b(m112296a, m145033a, 0, false, m131407l, c21294d, null, dVar, 38, null);
    }

    @Override // p449qi.InterfaceC25289a
    /* renamed from: b */
    public void mo130864b(long j11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        C29628e.m147249E0().m93432x();
        if (!C23055e5.m118273h(false, 1, null)) {
            String str = AbstractC20095b.f98829a;
            AbstractC19074t.m100207e(str, "NETWORK_ERROR_MSG");
            interfaceC18509p.mo240pC(50001, str);
            return;
        }
        C29037t0 m130867d = m130867d(this, new c(interfaceC18505l, interfaceC18509p), false, 2, null);
        m130867d.f103775r = 2;
        RequestPacket requestPacket = new RequestPacket();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(50));
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloAutoDownloadApiHelper", e11);
        }
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        requestPacket.m93273D(Integer.parseInt(str2));
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 2136);
        requestPacket.m93275F((byte) 0);
        m130867d.m110313i0(requestPacket);
        C0829l0.m2174c(m130867d);
    }
}
