package ae;

import ag0.C0829l0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.ByteArrayOutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import me0.AbstractC23161o1;
import me0.AbstractC23238v2;
import me0.C23055e5;
import org.json.JSONObject;
import p320ld.C22447s;
import p609wh.C29037t0;

/* renamed from: ae.g */
/* loaded from: classes3.dex */
public final class C0762g extends AbstractC0756a {

    /* renamed from: b */
    private InterfaceC20094a f2537b;

    /* renamed from: k */
    private final ByteArrayOutputStream m1372k() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        return byteArrayOutputStream;
    }

    /* renamed from: l */
    public final String m1373l() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            AbstractC19074t.m100207e(networkInterfaces, "getNetworkInterfaces(...)");
            boolean z11 = true;
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                AbstractC19074t.m100207e(nextElement, "nextElement(...)");
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                AbstractC19074t.m100207e(inetAddresses, "getInetAddresses(...)");
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    AbstractC19074t.m100207e(nextElement2, "nextElement(...)");
                    InetAddress inetAddress = nextElement2;
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        if (!z11) {
                            sb2.append("\n");
                        }
                        sb2.append(((Inet4Address) inetAddress).getHostAddress());
                        z11 = false;
                    }
                }
            }
            return sb2.toString();
        } catch (SocketException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    public void m1374m(long j11, long j12, String str, String str2) {
        String str3;
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(str2, "data");
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j12));
            String m1373l = m1373l();
            if (m1373l == null) {
                m1373l = "";
            }
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes = m1373l.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            byteArrayOutputStream.write((byte) bytes.length);
            byteArrayOutputStream.write(bytes);
            if (C22447s.m116003H() == 1) {
                str3 = "WIFI";
            } else {
                str3 = "3G";
            }
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes2 = str3.getBytes(charset);
            AbstractC19074t.m100207e(bytes2, "getBytes(...)");
            byteArrayOutputStream.write((byte) bytes2.length);
            byteArrayOutputStream.write(bytes2);
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes3 = str.getBytes(charset);
            AbstractC19074t.m100207e(bytes3, "getBytes(...)");
            byteArrayOutputStream.write((byte) bytes3.length);
            byteArrayOutputStream.write(bytes3);
            AbstractC23238v2.m119728m(byteArrayOutputStream, str2);
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            String str4 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str4, "currentUserUid");
            requestPacket.m93273D(Integer.parseInt(str4));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 516);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m1337e.m110313i0(requestPacket);
            if (C23055e5.m118272g(false)) {
                C0829l0.m2174c(m1337e);
                return;
            }
            InterfaceC20094a interfaceC20094a = this.f2537b;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(50001, AbstractC23161o1.m119318c(50001, "")));
            }
        } catch (Exception e11) {
            InterfaceC20094a interfaceC20094a2 = this.f2537b;
            if (interfaceC20094a2 != null) {
                interfaceC20094a2.mo926a(new C20096c(112, AbstractC23161o1.m119318c(112, e11.toString())));
            }
        }
    }

    /* renamed from: n */
    public void m1375n(long j11, String str, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "apiName");
        AbstractC19074t.m100208f(jSONObject, "payload");
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes = str.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes.length));
            byteArrayOutputStream.write(bytes);
            AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject.toString());
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            requestPacket.m93273D(Integer.parseInt(str2));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 517);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m1337e.m110313i0(requestPacket);
            if (C23055e5.m118272g(false)) {
                C0829l0.m2174c(m1337e);
                return;
            }
            InterfaceC20094a interfaceC20094a = this.f2537b;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(50001, AbstractC23161o1.m119318c(50001, "")));
            }
        } catch (Exception e11) {
            InterfaceC20094a interfaceC20094a2 = this.f2537b;
            if (interfaceC20094a2 != null) {
                interfaceC20094a2.mo926a(new C20096c(112, AbstractC23161o1.m119318c(112, e11.toString())));
            }
        }
    }

    /* renamed from: o */
    public void m1376o(long j11, String str, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "apiName");
        AbstractC19074t.m100208f(jSONObject, "payload");
        try {
            C29037t0 m1337e = m1337e();
            m1337e.f103775r = 2;
            ByteArrayOutputStream m1372k = m1372k();
            m1372k.write(AbstractC17522a.m93346i(j11));
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes = str.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            m1372k.write(AbstractC17522a.m93345h(bytes.length));
            m1372k.write(bytes);
            AbstractC23238v2.m119728m(m1372k, jSONObject.toString());
            RequestPacket m1336d = m1336d();
            m1336d.m93295q((short) 520);
            m1336d.m93275F((byte) 0);
            m1336d.m93303y(m1372k.toByteArray());
            m1337e.m110313i0(m1336d);
            m1340i(m1337e);
        } catch (Exception e11) {
            InterfaceC20094a m1339h = m1339h();
            if (m1339h != null) {
                m1339h.mo926a(new C20096c(112, AbstractC23161o1.m119318c(112, e11.toString())));
            }
        }
    }

    /* renamed from: p */
    public void m1377p(String str, int i11) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        try {
            C29037t0 m1337e = m1337e();
            m1337e.f103775r = 2;
            ByteArrayOutputStream m1372k = m1372k();
            AbstractC23238v2.m119728m(m1372k, str);
            m1372k.write(AbstractC17522a.m93344g(i11));
            AbstractC23238v2.m119728m(m1372k, "");
            RequestPacket m1336d = m1336d();
            m1336d.m93295q((short) 1265);
            m1336d.m93303y(m1372k.toByteArray());
            m1337e.m110313i0(m1336d);
            m1340i(m1337e);
        } catch (Exception e11) {
            InterfaceC20094a m1339h = m1339h();
            if (m1339h != null) {
                m1339h.mo926a(new C20096c(112, AbstractC23161o1.m119318c(112, e11.toString())));
            }
        }
    }

    /* renamed from: q */
    public void m1378q(long j11, String str, int i11) {
        AbstractC19074t.m100208f(str, "permissionId");
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes = str.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes.length));
            byteArrayOutputStream.write(bytes);
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            requestPacket.m93273D(Integer.parseInt(str2));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 518);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            m1337e.m110313i0(requestPacket);
            if (C23055e5.m118272g(false)) {
                C0829l0.m2174c(m1337e);
                return;
            }
            InterfaceC20094a interfaceC20094a = this.f2537b;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(50001, AbstractC23161o1.m119318c(50001, "")));
            }
        } catch (Exception e11) {
            InterfaceC20094a interfaceC20094a2 = this.f2537b;
            if (interfaceC20094a2 != null) {
                interfaceC20094a2.mo926a(new C20096c(112, AbstractC23161o1.m119318c(112, e11.toString())));
            }
        }
    }
}
