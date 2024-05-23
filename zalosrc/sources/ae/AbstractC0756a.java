package ae;

import ag0.C0829l0;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import fn0.AbstractC19074t;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.ByteArrayOutputStream;
import jm0.InterfaceC21299i;
import me0.AbstractC23148n;
import me0.AbstractC23161o1;
import me0.AbstractC23238v2;
import me0.C23055e5;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p609wh.C29037t0;

/* renamed from: ae.a */
/* loaded from: classes3.dex */
public abstract class AbstractC0756a {

    /* renamed from: a */
    private InterfaceC20094a f2527a;

    /* renamed from: ae.a$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC21299i {
        a() {
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            InterfaceC20094a m1339h = AbstractC0756a.this.m1339h();
            if (m1339h != null) {
                m1339h.mo926a(c20096c);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "object");
            InterfaceC20094a m1339h = AbstractC0756a.this.m1339h();
            if (m1339h != null) {
                m1339h.mo927b(jSONObject);
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m1332c(AbstractC0756a abstractC0756a, short s7, ByteArrayOutputStream byteArrayOutputStream, byte b11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                byteArrayOutputStream = null;
            }
            if ((i11 & 4) != 0) {
                b11 = 0;
            }
            abstractC0756a.m1335b(s7, byteArrayOutputStream, b11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAndSendSimpleSocketRequest");
    }

    /* renamed from: g */
    public static /* synthetic */ ByteArrayOutputStream m1333g(AbstractC0756a abstractC0756a, String str, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                str = "";
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return abstractC0756a.m1338f(str, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStandardAPIBaos");
    }

    /* renamed from: a */
    public final boolean m1334a() {
        if (AbstractC23304d.f113427q1.get()) {
            InterfaceC20094a interfaceC20094a = this.f2527a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(502, AbstractC20095b.f98832d));
            }
            return false;
        }
        String str = CoreUtility.f89233i;
        if (str == null || str.length() == 0) {
            CoreUtility.f89233i = AbstractC23309i.m121738b1();
        }
        String str2 = CoreUtility.f89233i;
        if (str2 != null && str2.length() != 0) {
            return true;
        }
        InterfaceC20094a interfaceC20094a2 = this.f2527a;
        if (interfaceC20094a2 != null) {
            interfaceC20094a2.mo926a(new C20096c(502, AbstractC20095b.f98832d));
        }
        return false;
    }

    /* renamed from: b */
    public final void m1335b(short s7, ByteArrayOutputStream byteArrayOutputStream, byte b11) {
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        RequestPacket m1336d = m1336d();
        m1336d.m93295q(s7);
        m1336d.m93275F(b11);
        if (byteArrayOutputStream != null) {
            m1336d.m93303y(byteArrayOutputStream.toByteArray());
        }
        m1337e.m110313i0(m1336d);
        m1340i(m1337e);
    }

    /* renamed from: d */
    public final RequestPacket m1336d() {
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        requestPacket.m93273D(Integer.parseInt(str));
        requestPacket.m93274E((byte) 3);
        return requestPacket;
    }

    /* renamed from: e */
    public final C29037t0 m1337e() {
        return new C29037t0(new a());
    }

    /* renamed from: f */
    protected final ByteArrayOutputStream m1338f(String str, int i11) {
        AbstractC19074t.m100208f(str, "trackingData");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        AbstractC23238v2.m119728m(byteArrayOutputStream, str);
        byteArrayOutputStream.write(AbstractC23148n.m118830d());
        byteArrayOutputStream.write(i11);
        return byteArrayOutputStream;
    }

    /* renamed from: h */
    public final InterfaceC20094a m1339h() {
        return this.f2527a;
    }

    /* renamed from: i */
    public final void m1340i(C29037t0 c29037t0) {
        AbstractC19074t.m100208f(c29037t0, "request");
        if (C23055e5.m118272g(false)) {
            C0829l0.m2174c(c29037t0);
            return;
        }
        InterfaceC20094a interfaceC20094a = this.f2527a;
        if (interfaceC20094a != null) {
            interfaceC20094a.mo926a(new C20096c(50001, AbstractC23161o1.m119318c(50001, "")));
        }
    }

    /* renamed from: j */
    public final void m1341j(InterfaceC20094a interfaceC20094a) {
        this.f2527a = interfaceC20094a;
    }
}
