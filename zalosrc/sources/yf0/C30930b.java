package yf0;

import android.content.Context;
import com.zing.zalo.zbrowser.cache.C16897a;
import com.zing.zalo.zbrowser.cache.C16899c;
import com.zing.zalo.zbrowser.cache.C16900d;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import on0.C24321d;
import org.json.JSONArray;
import org.json.JSONObject;
import p140ev.C18614c;
import p307kv.AbstractC21954k;
import p348mi.AbstractC23309i;
import th0.C26697c;
import th0.C26699e;
import uh0.C27267f;
import vh0.AbstractC28254a;
import vu.C28630a;

/* renamed from: yf0.b */
/* loaded from: classes5.dex */
public final class C30930b {

    /* renamed from: f */
    private static C30930b f142641f;

    /* renamed from: a */
    private C16900d f142643a;

    /* renamed from: b */
    private C16899c f142644b;

    /* renamed from: c */
    private int f142645c;

    /* renamed from: d */
    private int f142646d;

    /* renamed from: e */
    private int f142647e;
    public static final a Companion = new a(null);

    /* renamed from: g */
    private static final String f142642g = "javaClass";

    /* renamed from: yf0.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final synchronized C30930b m150239a() {
            C30930b c30930b;
            try {
                if (C30930b.f142641f == null) {
                    C30930b.f142641f = new C30930b();
                }
                c30930b = C30930b.f142641f;
                AbstractC19074t.m100205c(c30930b);
            } catch (Throwable th2) {
                throw th2;
            }
            return c30930b;
        }

        /* renamed from: b */
        public final String m150240b(String str) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            Pattern compile = Pattern.compile(C27267f.m139581a(str).f128233c + "/zapps/[0-9]*");
            AbstractC19074t.m100207e(compile, "compile(...)");
            Matcher matcher = compile.matcher(str);
            AbstractC19074t.m100207e(matcher, "matcher(...)");
            if (matcher.find()) {
                String group = matcher.group();
                AbstractC19074t.m100207e(group, "group(...)");
                return group;
            }
            return "";
        }
    }

    public C30930b() {
        this.f142645c = 32768;
        this.f142646d = ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
        this.f142647e = 604800;
        try {
            JSONObject jSONObject = new JSONObject(AbstractC23309i.m122317qe());
            this.f142646d = jSONObject.optInt("jump_disk_size", ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
            this.f142645c = jSONObject.optInt("jump_mem_size", 32768);
            this.f142647e = jSONObject.optInt("jump_expire", 604800);
        } catch (Exception unused) {
        }
        this.f142643a = new C16900d(this.f142645c, null);
        try {
            this.f142644b = C16899c.m90373L(m150231e(), 1, 1, this.f142646d, null, true);
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C16897a m150230d(C16899c c16899c, String str) {
        InputStream inputStream;
        C16899c.e m90395F;
        InputStream m90422a;
        C16897a c16897a = null;
        c16897a = null;
        c16897a = null;
        InputStream inputStream2 = null;
        if (c16899c == null || c16899c.isClosed()) {
            return null;
        }
        try {
            try {
                m90395F = c16899c.m90395F(m150232f(str));
            } catch (Exception e11) {
                e = e11;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
        if (m90395F == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) m90395F.m90423b(0));
        if (c16899c.m90396G()) {
            m90422a = new GZIPInputStream(m90395F.m90422a(0));
        } else {
            m90422a = m90395F.m90422a(0);
        }
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                AbstractC19074t.m100205c(m90422a);
                int read = m90422a.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            c16897a = C16897a.m90360a(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            m90422a.close();
        } catch (Exception e13) {
            inputStream = m90422a;
            e = e13;
            try {
                AbstractC20110a.f98889a.m104564x(f142642g).mo104561u(e, "Get cache file from disk cache error", new Object[0]);
                if (inputStream != null) {
                    inputStream.close();
                }
                return c16897a;
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e14) {
                        AbstractC20110a.f98889a.mo104552e(e14);
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            inputStream2 = m90422a;
            th = th4;
            if (inputStream2 != null) {
            }
            throw th;
        }
        return c16897a;
    }

    /* renamed from: e */
    private final File m150231e() {
        return new File(C20131e.f99303a.m104930L());
    }

    /* renamed from: f */
    private final String m150232f(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            byte[] bytes = str.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            String str2 = "";
            for (byte b11 : messageDigest.digest()) {
                String hexString = Integer.toHexString(b11 & 255);
                AbstractC19074t.m100207e(hexString, "toHexString(...)");
                if (hexString.length() == 1) {
                    str2 = str2 + "0" + hexString;
                } else {
                    str2 = str2 + hexString;
                }
            }
            return str2;
        } catch (Exception unused) {
            return String.valueOf(str.hashCode());
        }
    }

    /* renamed from: h */
    private final void m150233h(C16899c c16899c, String str, C16897a c16897a) {
        OutputStream m90407f;
        if (c16899c != null && !c16899c.isClosed() && str != null && c16897a != null) {
            try {
                C16899c.c m90394A = c16899c.m90394A(m150232f(str));
                if (c16899c.m90396G()) {
                    m90407f = new GZIPOutputStream(m90394A.m90407f(0));
                } else {
                    m90407f = m90394A.m90407f(0);
                }
                m90407f.write(c16897a.m90361b().array());
                m90407f.close();
                m90394A.m90406e();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104561u(e11, f142642g, "Put data to disk cache error");
            }
        }
    }

    /* renamed from: j */
    private final void m150234j(C16899c c16899c, String str) {
        if (c16899c != null && !c16899c.isClosed()) {
            try {
                c16899c.m90397Q(m150232f(str));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104561u(e11, "Remove cache file from disk cache error", new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public final JSONObject m150235c(Context context, String str, int i11) {
        C16897a c16897a;
        C26697c m137251r;
        C16899c c16899c;
        C16900d c16900d;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        try {
            String host = new URL(str).getHost();
            AbstractC19074t.m100207e(host, "getHost(...)");
            if (C28630a.Companion.m143193c(host)) {
                host = Companion.m150240b(str);
            }
            C16900d c16900d2 = this.f142643a;
            if (c16900d2 != null && c16900d2 != null) {
                c16897a = (C16897a) c16900d2.m149139d(host);
            } else {
                c16897a = null;
            }
            if (c16897a == null && (c16899c = this.f142644b) != null && (c16897a = m150230d(c16899c, host)) != null && (c16900d = this.f142643a) != null && c16900d != null) {
                c16900d.m90432k(host, c16897a);
            }
            if (c16897a != null) {
                if (c16897a.f86041a < System.currentTimeMillis() / 1000) {
                    m150238k(host);
                    return null;
                }
                byte[] bArr = c16897a.f86043c;
                AbstractC19074t.m100207e(bArr, "data");
                JSONObject jSONObject = new JSONObject(new String(bArr, C24321d.f117408b));
                C26699e m150478d = C30939f0.Companion.m150478d(context);
                if (m150478d != null && (m137251r = m150478d.m137251r()) != null) {
                    if (!AbstractC21954k.Companion.m114625t(str)) {
                        str = AbstractC28254a.m142262a(m137251r.m137212n(str), str, i11);
                    }
                    jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
                    jSONObject.put("inApp", 1);
                    jSONObject.put("extOpen", (Object) null);
                    jSONObject.put("cookiesIdLogins", new JSONArray());
                    jSONObject.put("cookiesOAuthLogins", new JSONArray());
                    return jSONObject;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: g */
    public final void m150236g(Context context, List list, JSONObject jSONObject) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(list, "listRequest");
        AbstractC19074t.m100208f(jSONObject, "data");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18614c c18614c = (C18614c) it.next();
            if (C30939f0.Companion.m150480f(context, c18614c.m98361l())) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(c18614c.m98357h()));
                    long currentTimeMillis = System.currentTimeMillis();
                    jSONObject2.put("genTime", currentTimeMillis);
                    String jSONObject3 = jSONObject2.toString();
                    AbstractC19074t.m100207e(jSONObject3, "toString(...)");
                    byte[] bytes = jSONObject3.getBytes(C24321d.f117408b);
                    AbstractC19074t.m100207e(bytes, "getBytes(...)");
                    C16897a c16897a = new C16897a((int) ((currentTimeMillis / 1000) + this.f142647e), "json", bytes, "");
                    String str = C27267f.m139581a(c18614c.m98361l()).f128233c;
                    if (C28630a.Companion.m143193c(str)) {
                        str = Companion.m150240b(c18614c.m98361l());
                    }
                    C16900d c16900d = this.f142643a;
                    if (c16900d != null) {
                    }
                    m150233h(this.f142644b, str, c16897a);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: i */
    public final void m150237i() {
        C16900d c16900d = this.f142643a;
        if (c16900d != null) {
            c16900d.m149138c();
        }
        C16899c c16899c = this.f142644b;
        if (c16899c != null) {
            c16899c.m90399s();
        }
    }

    /* renamed from: k */
    public final void m150238k(String str) {
        AbstractC19074t.m100208f(str, "domain");
        C16900d c16900d = this.f142643a;
        if (c16900d != null && ((C16897a) c16900d.m149139d(str)) != null) {
            c16900d.m149141f(str);
        }
        C16899c c16899c = this.f142644b;
        if (c16899c != null && m150230d(c16899c, str) != null) {
            m150234j(c16899c, str);
        }
    }
}
