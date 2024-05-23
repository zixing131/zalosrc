package ae;

import ag0.C0829l0;
import android.text.TextUtils;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
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
import me0.AbstractC23006a0;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p609wh.C29037t0;
import p645xh.C29628e;

/* renamed from: ae.c */
/* loaded from: classes3.dex */
public final class C0758c extends AbstractC0756a {

    /* renamed from: ae.c$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC21299i {
        a() {
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            InterfaceC20094a m1339h;
            AbstractC19074t.m100208f(c20096c, "error_message");
            if (C0758c.this.m1339h() != null && (m1339h = C0758c.this.m1339h()) != null) {
                m1339h.mo926a(c20096c);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "object");
            if (C0758c.this.m1339h() != null) {
                JSONObject jSONObject2 = null;
                try {
                    if (!jSONObject.isNull("data")) {
                        jSONObject2 = jSONObject.getJSONObject("data");
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                InterfaceC20094a m1339h = C0758c.this.m1339h();
                if (m1339h != null) {
                    m1339h.mo927b(jSONObject2);
                }
            }
        }
    }

    /* renamed from: ae.c$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC21299i {
        b() {
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            InterfaceC20094a m1339h;
            AbstractC19074t.m100208f(c20096c, "error_message");
            if (C0758c.this.m1339h() != null && (m1339h = C0758c.this.m1339h()) != null) {
                m1339h.mo926a(c20096c);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "object");
            if (C0758c.this.m1339h() != null) {
                JSONObject jSONObject2 = null;
                try {
                    if (!jSONObject.isNull("data")) {
                        jSONObject2 = jSONObject.getJSONObject("data");
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                InterfaceC20094a m1339h = C0758c.this.m1339h();
                if (m1339h != null) {
                    m1339h.mo927b(jSONObject2);
                }
            }
        }
    }

    /* renamed from: k */
    public final void m1353k(String str, String str2) {
        AbstractC19074t.m100208f(str, "page");
        AbstractC19074t.m100208f(str2, "records");
        if (!m1334a()) {
            return;
        }
        try {
            C29037t0 m1337e = m1337e();
            m1337e.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(Short.parseShort(str)));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(Short.parseShort(str2)));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(AbstractC23006a0.m117905e()));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
            RequestPacket m1336d = m1336d();
            m1336d.m93295q((short) 182);
            m1336d.m93275F((byte) 4);
            m1336d.params = byteArrayOutputStream.toByteArray();
            m1337e.m110313i0(m1336d);
            m1340i(m1337e);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    public final void m1354l(long j11, List list, String str, List list2, C3063z0 c3063z0, PrivacyInfo privacyInfo, List list3, boolean z11, int i11, TrackingSource trackingSource, long j12, SongInfo songInfo, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        InterfaceC20094a m1339h;
        int i19;
        AbstractC19074t.m100208f(list, "fileIds");
        AbstractC19074t.m100208f(str, "description");
        AbstractC19074t.m100208f(list2, "taggedUids");
        AbstractC19074t.m100208f(list3, "photoInfos");
        if (m1334a()) {
            C29037t0 c29037t0 = new C29037t0(new a());
            C29628e.m147249E0().m93432x();
            c29037t0.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(list.size()));
                int size = list.size();
                for (int i21 = 0; i21 < size; i21++) {
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(((Number) list.get(i21)).longValue()));
                }
                byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
                Charset charset = StandardCharsets.UTF_8;
                AbstractC19074t.m100207e(charset, "UTF_8");
                byte[] bytes = str.getBytes(charset);
                AbstractC19074t.m100207e(bytes, "getBytes(...)");
                byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes.length));
                AbstractC19074t.m100207e(charset, "UTF_8");
                byte[] bytes2 = str.getBytes(charset);
                AbstractC19074t.m100207e(bytes2, "getBytes(...)");
                byteArrayOutputStream.write(bytes2);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(list2.size()));
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        try {
                            byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt((String) it.next())));
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                    }
                }
                byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
                if (c3063z0 != null) {
                    byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z0.m153170b()));
                    byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z0.m153169a()));
                    if (TextUtils.isEmpty(c3063z0.m14727f())) {
                        i19 = 0;
                    } else {
                        String m14727f = c3063z0.m14727f();
                        AbstractC19074t.m100207e(m14727f, "getDesc(...)");
                        Charset charset2 = StandardCharsets.UTF_8;
                        AbstractC19074t.m100207e(charset2, "UTF_8");
                        byte[] bytes3 = m14727f.getBytes(charset2);
                        AbstractC19074t.m100207e(bytes3, "getBytes(...)");
                        i19 = bytes3.length;
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(i19));
                    if (i19 > 0) {
                        String m14727f2 = c3063z0.m14727f();
                        AbstractC19074t.m100207e(m14727f2, "getDesc(...)");
                        Charset charset3 = StandardCharsets.UTF_8;
                        AbstractC19074t.m100207e(charset3, "UTF_8");
                        byte[] bytes4 = m14727f2.getBytes(charset3);
                        AbstractC19074t.m100207e(bytes4, "getBytes(...)");
                        byteArrayOutputStream.write(bytes4);
                    }
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                }
                if (privacyInfo != null) {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo.f45973p));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo.f45974q.size()));
                    if (privacyInfo.f45974q.size() > 0) {
                        Iterator it2 = privacyInfo.f45974q.iterator();
                        while (it2.hasNext()) {
                            try {
                                String m56333d = ((LikeContactItem) it2.next()).m56333d();
                                AbstractC19074t.m100207e(m56333d, "getUserId(...)");
                                byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(m56333d)));
                            } catch (Exception e12) {
                                AbstractC23350e.m122778h(e12);
                            }
                        }
                    }
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(-1));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                }
                int size2 = list3.size();
                for (int i22 = 0; i22 < size2; i22++) {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(((C23307g) list3.get(i22)).f113474a));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(((C23307g) list3.get(i22)).f113475b));
                }
                byteArrayOutputStream.write(z11 ? 1 : 0);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                int i23 = CoreUtility.f89236l;
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                byteArrayOutputStream.write(new byte[]{(byte) 1});
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i23));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                if (trackingSource != null) {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(trackingSource.m40683t()));
                    byte[] m40681n = trackingSource.m40681n();
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(m40681n.length));
                    AbstractC19074t.m100205c(m40681n);
                    if (!(m40681n.length == 0)) {
                        byteArrayOutputStream.write(m40681n);
                    }
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                }
                byteArrayOutputStream.write(AbstractC17522a.m93346i(j12));
                if (songInfo != null) {
                    String m45182d = songInfo.m45182d();
                    Charset charset4 = StandardCharsets.UTF_8;
                    AbstractC19074t.m100207e(charset4, "UTF_8");
                    byte[] bytes5 = m45182d.getBytes(charset4);
                    AbstractC19074t.m100207e(bytes5, "getBytes(...)");
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes5.length));
                    byteArrayOutputStream.write(bytes5);
                    byteArrayOutputStream.write(songInfo.m45181c() ? (byte) 1 : (byte) 0);
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(0);
                }
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i15));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i16));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i17));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i18));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(i13));
            } catch (Exception e13) {
                AbstractC23350e.m122778h(e13);
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            requestPacket.m93273D(Integer.parseInt(str2));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 1245);
            requestPacket.m93275F((byte) 10);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            requestPacket.m93276G(1);
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118273h(false, 1, null)) {
                C0829l0.m2174c(c29037t0);
            } else {
                if (m1339h() == null || (m1339h = m1339h()) == null) {
                    return;
                }
                m1339h.mo926a(new C20096c(50001, AbstractC20095b.f98829a));
            }
        }
    }

    /* renamed from: m */
    public final void m1355m(long j11, long j12, String str, List list, C3063z0 c3063z0, PrivacyInfo privacyInfo, List list2, boolean z11, int i11, TrackingSource trackingSource, long j13, SongInfo songInfo) {
        InterfaceC20094a m1339h;
        int i12;
        AbstractC19074t.m100208f(str, "description");
        AbstractC19074t.m100208f(list, "taggedUids");
        AbstractC19074t.m100208f(list2, "photoInfos");
        if (m1334a()) {
            C29037t0 c29037t0 = new C29037t0(new b());
            C29628e.m147249E0().m93432x();
            c29037t0.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                int i13 = CoreUtility.f89236l;
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                byteArrayOutputStream.write((byte) 1);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
                byteArrayOutputStream.write(AbstractC17522a.m93346i(j12));
                Charset charset = StandardCharsets.UTF_8;
                AbstractC19074t.m100207e(charset, "UTF_8");
                byte[] bytes = str.getBytes(charset);
                AbstractC19074t.m100207e(bytes, "getBytes(...)");
                byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes.length));
                AbstractC19074t.m100207e(charset, "UTF_8");
                byte[] bytes2 = str.getBytes(charset);
                AbstractC19074t.m100207e(bytes2, "getBytes(...)");
                byteArrayOutputStream.write(bytes2);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(list.size()));
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt((String) it.next())));
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                    }
                }
                byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
                if (c3063z0 != null) {
                    byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z0.m153170b()));
                    byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z0.m153169a()));
                    if (TextUtils.isEmpty(c3063z0.m14727f())) {
                        i12 = 0;
                    } else {
                        String m14727f = c3063z0.m14727f();
                        AbstractC19074t.m100207e(m14727f, "getDesc(...)");
                        Charset charset2 = StandardCharsets.UTF_8;
                        AbstractC19074t.m100207e(charset2, "UTF_8");
                        byte[] bytes3 = m14727f.getBytes(charset2);
                        AbstractC19074t.m100207e(bytes3, "getBytes(...)");
                        i12 = bytes3.length;
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                    if (i12 > 0) {
                        String m14727f2 = c3063z0.m14727f();
                        AbstractC19074t.m100207e(m14727f2, "getDesc(...)");
                        Charset charset3 = StandardCharsets.UTF_8;
                        AbstractC19074t.m100207e(charset3, "UTF_8");
                        byte[] bytes4 = m14727f2.getBytes(charset3);
                        AbstractC19074t.m100207e(bytes4, "getBytes(...)");
                        byteArrayOutputStream.write(bytes4);
                    }
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93342e(-1.0d));
                    byteArrayOutputStream.write(AbstractC17522a.m93342e(-1.0d));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                }
                if (privacyInfo != null) {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo.f45973p));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo.f45974q.size()));
                    if (privacyInfo.f45974q.size() > 0) {
                        Iterator it2 = privacyInfo.f45974q.iterator();
                        while (it2.hasNext()) {
                            try {
                                String m56333d = ((LikeContactItem) it2.next()).m56333d();
                                AbstractC19074t.m100207e(m56333d, "getUserId(...)");
                                byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(m56333d)));
                            } catch (Exception e12) {
                                AbstractC23350e.m122778h(e12);
                            }
                        }
                    }
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(-1));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                }
                int size = list2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(((C23307g) list2.get(i14)).f113474a));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(((C23307g) list2.get(i14)).f113475b));
                }
                byteArrayOutputStream.write(z11 ? 1 : 0);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                if (trackingSource != null) {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(trackingSource.m40683t()));
                    byte[] m40681n = trackingSource.m40681n();
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(m40681n.length));
                    AbstractC19074t.m100205c(m40681n);
                    if (!(m40681n.length == 0)) {
                        byteArrayOutputStream.write(m40681n);
                    }
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                }
                byteArrayOutputStream.write(AbstractC17522a.m93346i(j13));
                if (songInfo != null) {
                    String m45182d = songInfo.m45182d();
                    Charset charset4 = StandardCharsets.UTF_8;
                    AbstractC19074t.m100207e(charset4, "UTF_8");
                    byte[] bytes5 = m45182d.getBytes(charset4);
                    AbstractC19074t.m100207e(bytes5, "getBytes(...)");
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes5.length));
                    byteArrayOutputStream.write(bytes5);
                    byteArrayOutputStream.write(songInfo.m45181c() ? (byte) 1 : (byte) 0);
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(0);
                }
            } catch (Exception e13) {
                AbstractC23350e.m122778h(e13);
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            requestPacket.m93273D(Integer.parseInt(str2));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 1796);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            requestPacket.m93276G(1);
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118273h(false, 1, null)) {
                C0829l0.m2174c(c29037t0);
            } else {
                if (m1339h() == null || (m1339h = m1339h()) == null) {
                    return;
                }
                m1339h.mo926a(new C20096c(50001, AbstractC20095b.f98829a));
            }
        }
    }
}
