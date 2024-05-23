package ae;

import ag0.C0829l0;
import android.text.TextUtils;
import bo.C3013n3;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import fn0.AbstractC19074t;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import jm0.InterfaceC21299i;
import me0.AbstractC23161o1;
import me0.C23055e5;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p609wh.C29037t0;
import p645xh.C29628e;

/* renamed from: ae.i */
/* loaded from: classes3.dex */
public final class C0764i extends AbstractC0756a {

    /* renamed from: ae.i$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC21299i {
        a() {
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            InterfaceC20094a m1339h;
            AbstractC19074t.m100208f(c20096c, "error_message");
            if (C0764i.this.m1339h() != null && (m1339h = C0764i.this.m1339h()) != null) {
                m1339h.mo926a(c20096c);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "object");
            if (C0764i.this.m1339h() != null) {
                JSONObject jSONObject2 = null;
                try {
                    if (!jSONObject.isNull("data")) {
                        jSONObject2 = jSONObject.getJSONObject("data");
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                InterfaceC20094a m1339h = C0764i.this.m1339h();
                if (m1339h != null) {
                    m1339h.mo927b(jSONObject2);
                }
            }
        }
    }

    /* renamed from: k */
    public final void m1381k(String str, List list, long j11, C3063z0 c3063z0, PrivacyInfo privacyInfo, int i11, C3013n3 c3013n3, int i12, TrackingSource trackingSource) {
        InterfaceC20094a m1339h;
        boolean z11;
        int i13;
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(list, "taggedProfiles");
        if (!m1334a()) {
            return;
        }
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(i12));
            if (!TextUtils.isEmpty(str)) {
                Charset charset = StandardCharsets.UTF_8;
                AbstractC19074t.m100207e(charset, "UTF_8");
                byte[] bytes = str.getBytes(charset);
                AbstractC19074t.m100207e(bytes, "getBytes(...)");
                byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes.length));
                byteArrayOutputStream.write(bytes);
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            }
            if (!list.isEmpty()) {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(list.size()));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt((String) it.next())));
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            }
            byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            if (c3063z0 != null) {
                byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z0.m153170b()));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z0.m153169a()));
                if (!TextUtils.isEmpty(c3063z0.m14727f())) {
                    String m14727f = c3063z0.m14727f();
                    AbstractC19074t.m100207e(m14727f, "getDesc(...)");
                    Charset charset2 = StandardCharsets.UTF_8;
                    AbstractC19074t.m100207e(charset2, "UTF_8");
                    byte[] bytes2 = m14727f.getBytes(charset2);
                    AbstractC19074t.m100207e(bytes2, "getBytes(...)");
                    i13 = bytes2.length;
                } else {
                    i13 = 0;
                }
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                if (i13 > 0) {
                    String m14727f2 = c3063z0.m14727f();
                    AbstractC19074t.m100207e(m14727f2, "getDesc(...)");
                    Charset charset3 = StandardCharsets.UTF_8;
                    AbstractC19074t.m100207e(charset3, "UTF_8");
                    byte[] bytes3 = m14727f2.getBytes(charset3);
                    AbstractC19074t.m100207e(bytes3, "getBytes(...)");
                    byteArrayOutputStream.write(bytes3);
                }
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93342e(-1.0d));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(-1.0d));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            }
            if (privacyInfo != null) {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo.f45973p));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo.f45974q.size()));
                Iterator it2 = privacyInfo.f45974q.iterator();
                while (it2.hasNext()) {
                    String m56333d = ((LikeContactItem) it2.next()).m56333d();
                    AbstractC19074t.m100207e(m56333d, "getUserId(...)");
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(m56333d)));
                }
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(-1));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            }
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            if (c3013n3 != null) {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(c3013n3.f11990b));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(c3013n3.f11991c));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(c3013n3.f11989a));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(c3013n3.f11992d));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(c3013n3.f11993e));
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(-1));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(-1));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(-1.0d));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(-1));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(-1));
            }
            if (trackingSource != null) {
                byteArrayOutputStream.write(AbstractC17522a.m93345h(trackingSource.m40683t()));
                byte[] m40681n = trackingSource.m40681n();
                byteArrayOutputStream.write(AbstractC17522a.m93345h(m40681n.length));
                AbstractC19074t.m100205c(m40681n);
                if (m40681n.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    byteArrayOutputStream.write(m40681n);
                }
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        m1337e.f103775r = 2;
        RequestPacket requestPacket = new RequestPacket();
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        requestPacket.m93273D(Integer.parseInt(str2));
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 1799);
        requestPacket.m93275F((byte) 1);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        m1337e.m110313i0(requestPacket);
        if (C23055e5.m118273h(false, 1, null)) {
            C0829l0.m2174c(m1337e);
        } else if (m1339h() != null && (m1339h = m1339h()) != null) {
            m1339h.mo926a(new C20096c(50001, AbstractC23161o1.m119318c(50001, "")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:7:0x0037, B:10:0x0064, B:13:0x006b, B:14:0x009d, B:16:0x00b2, B:17:0x00b6, B:25:0x00cf, B:28:0x00d3, B:31:0x00e2, B:34:0x0104, B:35:0x011a, B:37:0x0123, B:39:0x0153, B:41:0x0171, B:42:0x0177, B:44:0x017d, B:51:0x0199, B:54:0x01ac, B:56:0x01d8, B:58:0x0264, B:61:0x0284, B:63:0x0287, B:77:0x028b, B:78:0x0233, B:79:0x019d, B:81:0x013a, B:82:0x0096, B:20:0x00bc, B:46:0x0183), top: B:6:0x0037, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2 A[Catch: Exception -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0093, blocks: (B:7:0x0037, B:10:0x0064, B:13:0x006b, B:14:0x009d, B:16:0x00b2, B:17:0x00b6, B:25:0x00cf, B:28:0x00d3, B:31:0x00e2, B:34:0x0104, B:35:0x011a, B:37:0x0123, B:39:0x0153, B:41:0x0171, B:42:0x0177, B:44:0x017d, B:51:0x0199, B:54:0x01ac, B:56:0x01d8, B:58:0x0264, B:61:0x0284, B:63:0x0287, B:77:0x028b, B:78:0x0233, B:79:0x019d, B:81:0x013a, B:82:0x0096, B:20:0x00bc, B:46:0x0183), top: B:6:0x0037, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0153 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:7:0x0037, B:10:0x0064, B:13:0x006b, B:14:0x009d, B:16:0x00b2, B:17:0x00b6, B:25:0x00cf, B:28:0x00d3, B:31:0x00e2, B:34:0x0104, B:35:0x011a, B:37:0x0123, B:39:0x0153, B:41:0x0171, B:42:0x0177, B:44:0x017d, B:51:0x0199, B:54:0x01ac, B:56:0x01d8, B:58:0x0264, B:61:0x0284, B:63:0x0287, B:77:0x028b, B:78:0x0233, B:79:0x019d, B:81:0x013a, B:82:0x0096, B:20:0x00bc, B:46:0x0183), top: B:6:0x0037, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d8 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:7:0x0037, B:10:0x0064, B:13:0x006b, B:14:0x009d, B:16:0x00b2, B:17:0x00b6, B:25:0x00cf, B:28:0x00d3, B:31:0x00e2, B:34:0x0104, B:35:0x011a, B:37:0x0123, B:39:0x0153, B:41:0x0171, B:42:0x0177, B:44:0x017d, B:51:0x0199, B:54:0x01ac, B:56:0x01d8, B:58:0x0264, B:61:0x0284, B:63:0x0287, B:77:0x028b, B:78:0x0233, B:79:0x019d, B:81:0x013a, B:82:0x0096, B:20:0x00bc, B:46:0x0183), top: B:6:0x0037, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0264 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:7:0x0037, B:10:0x0064, B:13:0x006b, B:14:0x009d, B:16:0x00b2, B:17:0x00b6, B:25:0x00cf, B:28:0x00d3, B:31:0x00e2, B:34:0x0104, B:35:0x011a, B:37:0x0123, B:39:0x0153, B:41:0x0171, B:42:0x0177, B:44:0x017d, B:51:0x0199, B:54:0x01ac, B:56:0x01d8, B:58:0x0264, B:61:0x0284, B:63:0x0287, B:77:0x028b, B:78:0x0233, B:79:0x019d, B:81:0x013a, B:82:0x0096, B:20:0x00bc, B:46:0x0183), top: B:6:0x0037, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028b A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #2 {Exception -> 0x0093, blocks: (B:7:0x0037, B:10:0x0064, B:13:0x006b, B:14:0x009d, B:16:0x00b2, B:17:0x00b6, B:25:0x00cf, B:28:0x00d3, B:31:0x00e2, B:34:0x0104, B:35:0x011a, B:37:0x0123, B:39:0x0153, B:41:0x0171, B:42:0x0177, B:44:0x017d, B:51:0x0199, B:54:0x01ac, B:56:0x01d8, B:58:0x0264, B:61:0x0284, B:63:0x0287, B:77:0x028b, B:78:0x0233, B:79:0x019d, B:81:0x013a, B:82:0x0096, B:20:0x00bc, B:46:0x0183), top: B:6:0x0037, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0233 A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:7:0x0037, B:10:0x0064, B:13:0x006b, B:14:0x009d, B:16:0x00b2, B:17:0x00b6, B:25:0x00cf, B:28:0x00d3, B:31:0x00e2, B:34:0x0104, B:35:0x011a, B:37:0x0123, B:39:0x0153, B:41:0x0171, B:42:0x0177, B:44:0x017d, B:51:0x0199, B:54:0x01ac, B:56:0x01d8, B:58:0x0264, B:61:0x0284, B:63:0x0287, B:77:0x028b, B:78:0x0233, B:79:0x019d, B:81:0x013a, B:82:0x0096, B:20:0x00bc, B:46:0x0183), top: B:6:0x0037, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:7:0x0037, B:10:0x0064, B:13:0x006b, B:14:0x009d, B:16:0x00b2, B:17:0x00b6, B:25:0x00cf, B:28:0x00d3, B:31:0x00e2, B:34:0x0104, B:35:0x011a, B:37:0x0123, B:39:0x0153, B:41:0x0171, B:42:0x0177, B:44:0x017d, B:51:0x0199, B:54:0x01ac, B:56:0x01d8, B:58:0x0264, B:61:0x0284, B:63:0x0287, B:77:0x028b, B:78:0x0233, B:79:0x019d, B:81:0x013a, B:82:0x0096, B:20:0x00bc, B:46:0x0183), top: B:6:0x0037, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013a A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:7:0x0037, B:10:0x0064, B:13:0x006b, B:14:0x009d, B:16:0x00b2, B:17:0x00b6, B:25:0x00cf, B:28:0x00d3, B:31:0x00e2, B:34:0x0104, B:35:0x011a, B:37:0x0123, B:39:0x0153, B:41:0x0171, B:42:0x0177, B:44:0x017d, B:51:0x0199, B:54:0x01ac, B:56:0x01d8, B:58:0x0264, B:61:0x0284, B:63:0x0287, B:77:0x028b, B:78:0x0233, B:79:0x019d, B:81:0x013a, B:82:0x0096, B:20:0x00bc, B:46:0x0183), top: B:6:0x0037, inners: #0, #1 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1382l(String str, List list, long j11, C3063z0 c3063z0, PrivacyInfo privacyInfo, int i11, StoryMusicAttachment storyMusicAttachment, int i12, long j12, C23307g c23307g, TrackingSource trackingSource) {
        InterfaceC20094a m1339h;
        int i13;
        AbstractC19074t.m100208f(list, "taggedProfiles");
        AbstractC19074t.m100208f(c23307g, "photoInfo");
        if (!m1334a()) {
            return;
        }
        C29037t0 c29037t0 = new C29037t0(new a());
        C29628e.m147249E0().m93432x();
        c29037t0.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int i14 = CoreUtility.f89236l;
            byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
            byteArrayOutputStream.write((byte) 1);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(i12));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j12));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (str != null && str.length() != 0) {
            Charset forName = Charset.forName("UTF-8");
            AbstractC19074t.m100207e(forName, "forName(...)");
            byte[] bytes = str.getBytes(forName);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes.length));
            Charset forName2 = Charset.forName("UTF-8");
            AbstractC19074t.m100207e(forName2, "forName(...)");
            byte[] bytes2 = str.getBytes(forName2);
            AbstractC19074t.m100207e(bytes2, "getBytes(...)");
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(list.size()));
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt((String) it.next())));
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            }
            byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
            if (c3063z0 == null) {
                byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z0.m153170b()));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z0.m153169a()));
                if (TextUtils.isEmpty(c3063z0.m14727f())) {
                    i13 = 0;
                } else {
                    String m14727f = c3063z0.m14727f();
                    AbstractC19074t.m100207e(m14727f, "getDesc(...)");
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC19074t.m100207e(charset, "UTF_8");
                    byte[] bytes3 = m14727f.getBytes(charset);
                    AbstractC19074t.m100207e(bytes3, "getBytes(...)");
                    i13 = bytes3.length;
                }
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                if (i13 > 0) {
                    String m14727f2 = c3063z0.m14727f();
                    AbstractC19074t.m100207e(m14727f2, "getDesc(...)");
                    Charset charset2 = StandardCharsets.UTF_8;
                    AbstractC19074t.m100207e(charset2, "UTF_8");
                    byte[] bytes4 = m14727f2.getBytes(charset2);
                    AbstractC19074t.m100207e(bytes4, "getBytes(...)");
                    byteArrayOutputStream.write(bytes4);
                }
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93342e(-1.0d));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(-1.0d));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            }
            if (privacyInfo == null) {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo.f45973p));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo.f45974q.size()));
                if (privacyInfo.f45974q.size() > 0) {
                    Iterator it2 = privacyInfo.f45974q.iterator();
                    while (it2.hasNext()) {
                        try {
                            String m56333d = ((LikeContactItem) it2.next()).m56333d();
                            AbstractC19074t.m100207e(m56333d, "getUserId(...)");
                            byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(m56333d)));
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                    }
                }
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(-1));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            }
            byteArrayOutputStream.write(AbstractC17522a.m93344g(c23307g.f113474a));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(c23307g.f113475b));
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            if (storyMusicAttachment == null) {
                String m46923a = storyMusicAttachment.m46923a();
                Charset charset3 = StandardCharsets.UTF_8;
                AbstractC19074t.m100207e(charset3, "UTF_8");
                byte[] bytes5 = m46923a.getBytes(charset3);
                AbstractC19074t.m100207e(bytes5, "getBytes(...)");
                byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes5.length));
                byteArrayOutputStream.write(bytes5);
                byteArrayOutputStream.write((byte) storyMusicAttachment.m46924b());
                byteArrayOutputStream.write(AbstractC17522a.m93344g(storyMusicAttachment.m46925c()));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(storyMusicAttachment.m46928f()));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(storyMusicAttachment.m46929g()));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(storyMusicAttachment.m46926d()));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(storyMusicAttachment.m46927e()));
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(0.0d));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(0.0d));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(0.0d));
                byteArrayOutputStream.write(AbstractC17522a.m93342e(0.0d));
            }
            if (trackingSource == null) {
                byteArrayOutputStream.write(AbstractC17522a.m93345h(trackingSource.m40683t()));
                byte[] m40681n = trackingSource.m40681n();
                byteArrayOutputStream.write(AbstractC17522a.m93345h(m40681n.length));
                AbstractC19074t.m100205c(m40681n);
                if (!(m40681n.length == 0)) {
                    byteArrayOutputStream.write(m40681n);
                }
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            requestPacket.m93273D(Integer.parseInt(str2));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 1797);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            requestPacket.m93276G(1);
            c29037t0.m110313i0(requestPacket);
            if (!C23055e5.m118273h(false, 1, null)) {
                C0829l0.m2174c(c29037t0);
                return;
            } else {
                if (m1339h() == null || (m1339h = m1339h()) == null) {
                    return;
                }
                m1339h.mo926a(new C20096c(50001, AbstractC20095b.f98829a));
                return;
            }
        }
        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(list.size()));
        if (!list.isEmpty()) {
        }
        byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
        if (c3063z0 == null) {
        }
        if (privacyInfo == null) {
        }
        byteArrayOutputStream.write(AbstractC17522a.m93344g(c23307g.f113474a));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(c23307g.f113475b));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
        if (storyMusicAttachment == null) {
        }
        if (trackingSource == null) {
        }
        RequestPacket requestPacket2 = new RequestPacket();
        requestPacket2.m93301w((byte) 1);
        requestPacket2.m93302x((byte) 0);
        String str22 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str22, "currentUserUid");
        requestPacket2.m93273D(Integer.parseInt(str22));
        requestPacket2.m93274E((byte) 3);
        requestPacket2.m93295q((short) 1797);
        requestPacket2.m93275F((byte) 0);
        requestPacket2.m93303y(byteArrayOutputStream.toByteArray());
        requestPacket2.m93276G(1);
        c29037t0.m110313i0(requestPacket2);
        if (!C23055e5.m118273h(false, 1, null)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:            if (r1.equals("en") == false) goto L20;     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1383m(int i11) {
        String str;
        if (!m1334a()) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i12 = 1;
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
        String str2 = AbstractC18458a.f93019a;
        if (str2 != null && str2.length() != 0 && (str = AbstractC18458a.f93019a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3241) {
                if (hashCode != 3500) {
                    if (hashCode == 3763) {
                        str.equals("vi");
                    }
                } else if (str.equals("my")) {
                    i12 = 3;
                }
            }
            byteArrayOutputStream.write(i12);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
            AbstractC0756a.m1332c(this, (short) 3855, byteArrayOutputStream, (byte) 0, 4, null);
        }
        i12 = 0;
        byteArrayOutputStream.write(i12);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
        AbstractC0756a.m1332c(this, (short) 3855, byteArrayOutputStream, (byte) 0, 4, null);
    }
}
