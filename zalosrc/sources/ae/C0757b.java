package ae;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23148n;
import me0.AbstractC23161o1;
import mm0.AbstractC23350e;
import on0.C24321d;
import org.json.JSONArray;
import org.json.JSONObject;
import p405ov.C24559a;
import p609wh.C29037t0;

/* renamed from: ae.b */
/* loaded from: classes3.dex */
public final class C0757b extends AbstractC0756a {
    /* renamed from: k */
    public final void m1344k(String str) {
        AbstractC19074t.m100208f(str, "data");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(AbstractC17522a.m93345h(1));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(str.length()));
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        byteArrayOutputStream.write(bytes);
        AbstractC0756a.m1332c(this, (short) 134, byteArrayOutputStream, (byte) 0, 4, null);
    }

    /* renamed from: l */
    public final void m1345l(int i11, JSONArray jSONArray) {
        AbstractC19074t.m100208f(jSONArray, "seenData");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(AbstractC17522a.m93345h(i11));
        byteArrayOutputStream.write(AbstractC17522a.m93345h(1));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seens", jSONArray);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(jSONObject.toString().length()));
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        byte[] bytes = jSONObject2.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        byteArrayOutputStream.write(bytes);
        AbstractC0756a.m1332c(this, (short) 136, byteArrayOutputStream, (byte) 0, 4, null);
    }

    /* renamed from: m */
    public final void m1346m(int i11, int i12, int i13, boolean z11) {
        if (!m1334a()) {
            return;
        }
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        RequestPacket m1336d = m1336d();
        m1336d.m93301w((byte) 2);
        m1336d.m93297s(i11);
        m1336d.m93298t((byte) 6);
        m1336d.m93295q((short) 10211);
        m1336d.m93275F((byte) 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", i12);
            jSONObject.put("reason", i13);
            jSONObject.put("forward", z11 ? 1 : 0);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            byte[] bytes = jSONObject2.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            byteArrayOutputStream.write(bytes);
            C24559a.m127933c("[E2EE]", "sendDisableE2eeGroup 10211: " + jSONObject);
            m1336d.m93303y(byteArrayOutputStream.toByteArray());
            m1337e.m110313i0(m1336d);
            m1340i(m1337e);
        } catch (Exception e11) {
            InterfaceC20094a m1339h = m1339h();
            if (m1339h != null) {
                m1339h.mo926a(new C20096c(17001, AbstractC23161o1.m119318c(17001, "")));
            }
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n */
    public final void m1347n() {
        AbstractC0756a.m1332c(this, (short) 133, null, (byte) 0, 6, null);
    }

    /* renamed from: o */
    public final void m1348o(byte b11, JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "data");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(AbstractC17522a.m93345h(1));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        byteArrayOutputStream.write(new byte[]{b11});
        byteArrayOutputStream.write(AbstractC17522a.m93344g(jSONObject.toString().length()));
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        byte[] bytes = jSONObject2.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        byteArrayOutputStream.write(bytes);
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        RequestPacket m1336d = m1336d();
        m1336d.m93295q((short) 131);
        if (b11 == 1) {
            m1336d.m93270A(5000L);
        }
        m1336d.m93303y(byteArrayOutputStream.toByteArray());
        m1337e.m110313i0(m1336d);
        m1340i(m1337e);
    }

    /* renamed from: p */
    public final void m1349p(List list, String str) {
        AbstractC19074t.m100208f(list, "listConversation11Pull");
        AbstractC19074t.m100208f(str, "trackingLog");
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        RequestPacket m1336d = m1336d();
        m1336d.m93295q((short) 2132);
        m1336d.m93275F((byte) 0);
        ByteArrayOutputStream m1333g = AbstractC0756a.m1333g(this, str, 0, 2, null);
        m1333g.write(AbstractC17522a.m93344g(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m1333g.write(AbstractC17522a.m93344g(((Number) it.next()).intValue()));
        }
        m1336d.m93303y(m1333g.toByteArray());
        m1337e.m110313i0(m1336d);
        m1340i(m1337e);
    }

    /* renamed from: q */
    public final void m1350q(int i11, long j11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(AbstractC17522a.m93345h(1));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sct", 1);
        jSONObject.put("id", i11);
        jSONObject.put("msgId", j11);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("seens", jSONArray);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(jSONObject2.toString().length()));
        String jSONObject3 = jSONObject2.toString();
        AbstractC19074t.m100207e(jSONObject3, "toString(...)");
        byte[] bytes = jSONObject3.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        byteArrayOutputStream.write(bytes);
        AbstractC0756a.m1332c(this, (short) 135, byteArrayOutputStream, (byte) 0, 4, null);
    }

    /* renamed from: r */
    public final void m1351r(String str) {
        AbstractC19074t.m100208f(str, "text");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
        byteArrayOutputStream.write(AbstractC23148n.m118830d());
        byteArrayOutputStream.write(0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("input", str);
        jSONObject.put("encode_type", 0);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        byte[] bytes = jSONObject2.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes.length));
        byteArrayOutputStream.write(bytes);
        AbstractC0756a.m1332c(this, (short) 759, byteArrayOutputStream, (byte) 0, 4, null);
    }

    /* renamed from: s */
    public final void m1352s(String str, long j11) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
        byteArrayOutputStream.write(AbstractC23148n.m118830d());
        byteArrayOutputStream.write(0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
        jSONObject.put("fileId", j11);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        byte[] bytes = jSONObject2.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes.length));
        byteArrayOutputStream.write(bytes);
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        RequestPacket m1336d = m1336d();
        m1336d.m93295q((short) 760);
        m1336d.m93270A(30000L);
        m1336d.m93303y(byteArrayOutputStream.toByteArray());
        m1337e.m110313i0(m1336d);
        m1340i(m1337e);
    }
}
