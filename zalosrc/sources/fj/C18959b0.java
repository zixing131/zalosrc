package fj;

import ag0.C0829l0;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jm0.InterfaceC21299i;
import me0.AbstractC23148n;
import me0.AbstractC23161o1;
import me0.AbstractC23238v2;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p056cj.C3533a;
import p609wh.C29037t0;
import p645xh.C29628e;

/* renamed from: fj.b0 */
/* loaded from: classes.dex */
public final class C18959b0 implements InterfaceC18981x {
    public static final a Companion = new a(null);

    /* renamed from: fj.b0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: fj.b0$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f94648a;

        /* renamed from: b */
        final /* synthetic */ boolean f94649b;

        b(InterfaceC20094a interfaceC20094a, boolean z11) {
            this.f94648a = interfaceC20094a;
            this.f94649b = z11;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            InterfaceC20094a interfaceC20094a = this.f94648a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
            if (this.f94649b && c20096c.m104491c() == 50001) {
                ToastUtils.m89262j();
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            InterfaceC20094a interfaceC20094a = this.f94648a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(jSONObject);
            }
        }
    }

    /* renamed from: c */
    private final RequestPacket m99472c() {
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        requestPacket.m93273D(Integer.parseInt(str));
        requestPacket.m93274E((byte) 3);
        return requestPacket;
    }

    /* renamed from: d */
    private final C29037t0 m99473d(InterfaceC20094a interfaceC20094a, boolean z11) {
        return new C29037t0(new b(interfaceC20094a, z11));
    }

    /* renamed from: e */
    static /* synthetic */ C29037t0 m99474e(C18959b0 c18959b0, InterfaceC20094a interfaceC20094a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC20094a = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c18959b0.m99473d(interfaceC20094a, z11);
    }

    /* renamed from: f */
    private final ByteArrayOutputStream m99475f(String str, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        AbstractC23238v2.m119728m(byteArrayOutputStream, str);
        byteArrayOutputStream.write(AbstractC23148n.m118830d());
        byteArrayOutputStream.write(i11);
        return byteArrayOutputStream;
    }

    /* renamed from: g */
    static /* synthetic */ ByteArrayOutputStream m99476g(C18959b0 c18959b0, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return c18959b0.m99475f(str, i11);
    }

    /* renamed from: h */
    private final void m99477h(C29037t0 c29037t0, InterfaceC20094a interfaceC20094a) {
        if (C23055e5.m118272g(false)) {
            C0829l0.m2174c(c29037t0);
        } else if (interfaceC20094a != null) {
            interfaceC20094a.mo926a(new C20096c(50001, AbstractC23161o1.m119318c(50001, "")));
        }
    }

    @Override // fj.InterfaceC18981x
    /* renamed from: a */
    public void mo99478a(List list, boolean z11, int i11, int i12, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(list, "ackMsgList");
        if (list.isEmpty()) {
            return;
        }
        C29628e.m147249E0().m93432x();
        try {
            C29037t0 m99474e = m99474e(this, interfaceC20094a, false, 2, null);
            m99474e.f103775r = 2;
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                JSONObject m17930y = ((C3533a) list.get(i13)).m17930y();
                if (m17930y != null) {
                    jSONArray.put(m17930y);
                }
            }
            jSONObject.put("seen", z11 ? 1 : 0);
            jSONObject.put("data", jSONArray);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes = jSONObject2.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            byteArrayOutputStream.write(bytes);
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 1);
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            requestPacket.m93273D(Integer.parseInt(str));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) i11);
            requestPacket.m93275F((byte) i12);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m99474e.m110313i0(requestPacket);
            if (C23055e5.m118272g(false)) {
                C0829l0.m2174c(m99474e);
            } else if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(50001, AbstractC20095b.f98829a));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloMessageApiHelper", e11);
        }
    }

    @Override // fj.InterfaceC18981x
    /* renamed from: b */
    public void mo99479b(Map map, String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(map, "uids");
        AbstractC19074t.m100208f(str, "trackingData");
        if (map.isEmpty()) {
            return;
        }
        C29037t0 m99474e = m99474e(this, interfaceC20094a, false, 2, null);
        m99474e.f103775r = 2;
        RequestPacket m99472c = m99472c();
        m99472c.m93295q((short) 2130);
        try {
            ByteArrayOutputStream m99476g = m99476g(this, str, 0, 2, null);
            m99476g.write(AbstractC17522a.m93344g(map.size()));
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                m99476g.write((byte) intValue);
                ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(intValue));
                if (arrayList != null) {
                    m99476g.write(AbstractC17522a.m93344g(arrayList.size()));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        AbstractC19074t.m100205c(str2);
                        m99476g.write(AbstractC17522a.m93344g(Integer.parseInt(str2)));
                    }
                } else {
                    throw new Exception();
                }
            }
            m99472c.m93303y(m99476g.toByteArray());
            m99474e.m110313i0(m99472c);
            m99477h(m99474e, interfaceC20094a);
        } catch (Exception e11) {
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(112, AbstractC23161o1.m119318c(112, e11.toString())));
            }
        }
    }
}
