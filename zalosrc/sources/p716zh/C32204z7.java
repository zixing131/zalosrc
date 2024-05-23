package p716zh;

import ae.C0766k;
import am.AbstractC0906d0;
import am.AbstractC0924m0;
import am.C0927o;
import android.net.TrafficStats;
import android.text.TextUtils;
import androidx.core.text.AbstractC1463b;
import com.androidquery.util.C3977j;
import com.androidquery.util.InterfaceC3968a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import dj.C18013y0;
import en0.InterfaceC18494a;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19656s0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lu.C22652b;
import me0.AbstractC23009a3;
import me0.AbstractC23056e6;
import me0.AbstractC23143m5;
import me0.C23055e5;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import nh0.C23793c;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONException;
import org.json.JSONObject;
import p142ey.C18638h;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C24002m;
import p405ov.C24559a;
import p560uw.EnumC27376c;
import p645xh.C29628e;
import p716zh.C31944h6;
import p716zh.C32204z7;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vg.C28203u6;
import vi0.C28264b;
import vi0.EnumC28265c;

/* renamed from: zh.z7 */
/* loaded from: classes3.dex */
public final class C32204z7 {
    public static final b Companion = new b(null);

    /* renamed from: l */
    private static final InterfaceC24854k f148507l;

    /* renamed from: a */
    private final Map f148508a;

    /* renamed from: b */
    private final Map f148509b;

    /* renamed from: c */
    private final Map f148510c;

    /* renamed from: d */
    private final ExecutorService f148511d;

    /* renamed from: e */
    private final Map f148512e;

    /* renamed from: f */
    private final Set f148513f;

    /* renamed from: g */
    private final Map f148514g;

    /* renamed from: h */
    private final Map f148515h;

    /* renamed from: i */
    private final Map f148516i;

    /* renamed from: j */
    private final Set f148517j;

    /* renamed from: k */
    private final InterfaceC24854k f148518k;

    /* renamed from: zh.z7$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f148519q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C32204z7 mo12V4() {
            return c.f148520a.m155282a();
        }
    }

    /* renamed from: zh.z7$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public final C18013y0 m155280b(ContactProfile contactProfile) {
            if (contactProfile != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("phone", contactProfile.f42455y);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                return new C18013y0(contactProfile.f42437s, 0, contactProfile.f42446v, AbstractC23306f.m120583H().m110204g().m116324p(), jSONObject.toString(), "recommened.user", contactProfile.f42434r);
            }
            return null;
        }

        /* renamed from: c */
        public final C32204z7 m155281c() {
            return (C32204z7) C32204z7.f148507l.getValue();
        }
    }

    /* renamed from: zh.z7$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f148520a = new c();

        /* renamed from: b */
        private static final C32204z7 f148521b = new C32204z7(null);

        private c() {
        }

        /* renamed from: a */
        public final C32204z7 m155282a() {
            return f148521b;
        }
    }

    /* renamed from: zh.z7$d */
    /* loaded from: classes3.dex */
    public final class d implements Runnable {

        /* renamed from: p */
        private final String f148522p;

        /* renamed from: q */
        private final boolean f148523q;

        /* renamed from: r */
        final /* synthetic */ C32204z7 f148524r;

        /* renamed from: zh.z7$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends C24002m {

            /* renamed from: A0 */
            final /* synthetic */ d f148525A0;

            /* renamed from: B0 */
            final /* synthetic */ C32204z7 f148526B0;

            /* renamed from: y0 */
            final /* synthetic */ long f148527y0;

            /* renamed from: z0 */
            final /* synthetic */ C18013y0 f148528z0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j11, C18013y0 c18013y0, d dVar, C32204z7 c32204z7) {
                super(3);
                this.f148527y0 = j11;
                this.f148528z0 = c18013y0;
                this.f148525A0 = dVar;
                this.f148526B0 = c32204z7;
            }

            @Override // p379o3.C24002m
            /* renamed from: E1 */
            protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
                String str2;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c23995f, "status");
                if (file != null && file.exists() && c23995f.m125657h() == 200 && AbstractC23009a3.m117961l(file.getPath()) != null) {
                    AbstractC20110a.f98889a.mo104548a("ParseLink downloadSuccess: " + file.getPath(), new Object[0]);
                    str2 = file.getPath();
                    AbstractC19074t.m100207e(str2, "getPath(...)");
                } else {
                    str2 = "";
                }
                long mo124319c = C23793c.Companion.m124321a().mo124319c() - this.f148527y0;
                this.f148528z0.f91251B.m154947s(str2);
                this.f148528z0.f91251B.f147945C = mo124319c;
                if (this.f148525A0.m155287c()) {
                    List list = (List) this.f148526B0.f148510c.remove(this.f148525A0.m155286b());
                    this.f148526B0.f148516i.put(this.f148525A0.m155286b(), this.f148528z0);
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((h) it.next()).mo64441c(this.f148525A0.m155286b(), str2);
                        }
                    }
                } else {
                    C32204z7 c32204z7 = this.f148526B0;
                    d dVar = this.f148525A0;
                    C32204z7.m155264r(c32204z7, dVar, 0, dVar.m155286b(), this.f148528z0, false, 16, null);
                }
                C24559a.m127933c("[ParseLink]", "Download thumb url[" + AbstractC31856b8.m153142a(this.f148525A0.m155286b()) + "] finished, timeDownload: " + mo124319c + ", filePath: " + ((Object) str2) + ", code: " + c23995f.m125657h());
            }
        }

        public d(C32204z7 c32204z7, String str, boolean z11) {
            AbstractC19074t.m100208f(str, "mUrl");
            this.f148524r = c32204z7;
            this.f148522p = str;
            this.f148523q = z11;
        }

        /* renamed from: d */
        public static final String m155284d(String str) {
            AbstractC19074t.m100208f(str, "html");
            return AbstractC1463b.m7440a(str, 0).toString();
        }

        /* renamed from: e */
        private final void m155285e(String str, C18013y0 c18013y0) {
            if (str.length() == 0) {
                C24559a.m127933c("[ParseLink]", "Download thumb url[" + AbstractC31856b8.m153142a(this.f148522p) + "] is empty");
                C32204z7.m155264r(this.f148524r, this, 0, this.f148522p, c18013y0, false, 16, null);
                return;
            }
            C23528a c23528a = new C23528a(MainApplication.Companion.m35500c());
            File file = new File(C28264b.Companion.m142373a().m142367c(EnumC28265c.f131803s), AbstractC23352g.m122788d(str + ".jpg") + ".jpg");
            AbstractC20110a.f98889a.mo104548a("ParseLink- downloadThumb: " + str + " - outputPath: " + file.getPath(), new Object[0]);
            String m153142a = AbstractC31856b8.m153142a(this.f148522p);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Start download thumb url: ");
            sb2.append(m153142a);
            C24559a.m127933c("[ParseLink]", sb2.toString());
            ((C23528a) c23528a.m123612r(this.f148524r.m155259i())).m123601f(str, file, new a(C23793c.Companion.m124321a().mo124319c(), c18013y0, this, this.f148524r));
        }

        /* renamed from: b */
        public final String m155286b() {
            return this.f148522p;
        }

        /* renamed from: c */
        public final boolean m155287c() {
            return this.f148523q;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0270  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0282 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:115:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0275 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0204 -> B:73:0x026b). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Throwable th2;
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            HttpURLConnection m155265s;
            int responseCode;
            String contentType;
            boolean m127149O;
            boolean m127120J;
            String m153562b;
            boolean m127149O2;
            boolean m127149O3;
            C24559a.m127933c("[ParseLink]", "Begin parse link client url: " + AbstractC31856b8.m153142a(this.f148522p));
            long mo124319c = C23793c.Companion.m124321a().mo124319c();
            HttpURLConnection httpURLConnection = null;
            r13 = null;
            InputStream inputStream2 = null;
            httpURLConnection = null;
            try {
                try {
                    TrafficStats.setThreadStatsTag(ZAbstractBase.ZVU_BLEND_PERCENTAGE);
                    m155265s = this.f148524r.m155265s(this.f148522p);
                    try {
                        responseCode = m155265s.getResponseCode();
                        contentType = m155265s.getContentType();
                    } catch (Exception e11) {
                        e = e11;
                        inputStream = null;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        inputStream = null;
                        byteArrayOutputStream = null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    inputStream = null;
                    byteArrayOutputStream = null;
                } catch (Throwable th4) {
                    th2 = th4;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
            } catch (IOException e13) {
                AbstractC20110a.f98889a.mo104552e(e13);
            }
            if (contentType != null) {
                boolean z11 = false;
                m127149O = AbstractC24342w.m127149O(contentType, "text/html", false, 2, null);
                if (!m127149O) {
                    m127149O2 = AbstractC24342w.m127149O(contentType, "application/xhtml+xml", false, 2, null);
                    if (!m127149O2) {
                        m127149O3 = AbstractC24342w.m127149O(contentType, "application/xml", false, 2, null);
                        if (m127149O3) {
                        }
                    }
                }
                if (responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 401) {
                    String url = m155265s.getURL().toString();
                    AbstractC19074t.m100207e(url, "toString(...)");
                    m127120J = AbstractC24341v.m127120J(url, "http://", false, 2, null);
                    if (!m127120J) {
                        if (responseCode == 200) {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                inputStream2 = m155265s.getInputStream();
                                byte[] bArr = new byte[16384];
                                int i11 = 0;
                                while (true) {
                                    int read = inputStream2.read(bArr);
                                    if (read < 0 || (i11 = i11 + read) > 2097152) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    }
                                }
                                C24559a.m127933c("[ParseLink]", "Download done data url: " + AbstractC31856b8.m153142a(this.f148522p));
                                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                                AbstractC19074t.m100207e(byteArrayOutputStream2, "toString(...)");
                                C31944h6.c m153528M = C31944h6.m153528M(byteArrayOutputStream2, new C31944h6.a() { // from class: zh.a8
                                    @Override // p716zh.C31944h6.a
                                    /* renamed from: a */
                                    public final String mo152986a(String str) {
                                        String m155284d;
                                        m155284d = C32204z7.d.m155284d(str);
                                        return m155284d;
                                    }
                                });
                                if (m153528M.m153564d()) {
                                    if (!TextUtils.isEmpty((CharSequence) m153528M.m153563c().get("title"))) {
                                        m153562b = (String) m153528M.m153563c().get("title");
                                    } else {
                                        m153562b = m153528M.m153562b();
                                    }
                                    String str = (String) m153528M.m153563c().get("image");
                                    if (str == null) {
                                        str = "";
                                    }
                                    String str2 = str;
                                    String str3 = (String) m153528M.m153563c().get("description");
                                    if (m153562b != null && m153562b.length() != 0 && m153562b.length() > 80) {
                                        m153562b = AbstractC19656s0.m103080w(m153562b, 80);
                                    }
                                    String str4 = m153562b;
                                    if (str3 != null && str3.length() != 0 && str3.length() > 200) {
                                        str3 = AbstractC19656s0.m103080w(str3, 200);
                                    }
                                    C18013y0 m95793h = C18013y0.m95793h(str4, C31944h6.m153552r(this.f148522p), 0, "", this.f148522p, str3, m153528M.m153561a());
                                    C32098s c32098s = m95793h.f91251B;
                                    c32098s.f147969s = this.f148522p;
                                    if (str2.length() > 0) {
                                        z11 = true;
                                    }
                                    c32098s.f147976z = z11;
                                    m95793h.f91251B.m154949u(EnumC27376c.f128983r);
                                    m95793h.f91251B.f147943A = C23793c.Companion.m124321a().mo124319c() - mo124319c;
                                    String m154935e = m95793h.f91251B.m154935e();
                                    AbstractC19074t.m100207e(m154935e, "getParamJsonString(...)");
                                    m95793h.f91017v = m154935e;
                                    if (this.f148523q) {
                                        this.f148524r.m155263q(this, 0, this.f148522p, m95793h, false);
                                    }
                                    AbstractC19074t.m100205c(m95793h);
                                    m155285e(str2, m95793h);
                                } else {
                                    C32204z7.m155264r(this.f148524r, this, 1, this.f148522p, null, false, 16, null);
                                }
                                m155265s.disconnect();
                                C24559a.m127933c("[ParseLink]", "Time parse link [" + AbstractC31856b8.m153142a(this.f148522p) + "]: " + (C23793c.Companion.m124321a().mo124319c() - mo124319c));
                                m155265s.disconnect();
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e14) {
                                    AbstractC20110a.f98889a.mo104552e(e14);
                                }
                                inputStream2.close();
                            } catch (Exception e15) {
                                e = e15;
                                inputStream = inputStream2;
                                httpURLConnection = m155265s;
                                try {
                                    AbstractC20110a.f98889a.mo104552e(e);
                                    C32204z7.m155264r(this.f148524r, this, -1, this.f148522p, null, false, 16, null);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (IOException e16) {
                                            AbstractC20110a.f98889a.mo104552e(e16);
                                        }
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (IOException e17) {
                                            AbstractC20110a.f98889a.mo104552e(e17);
                                        }
                                    }
                                    if (inputStream == null) {
                                        try {
                                            inputStream.close();
                                            throw th2;
                                        } catch (IOException e18) {
                                            AbstractC20110a.f98889a.mo104552e(e18);
                                            throw th2;
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th6) {
                                th2 = th6;
                                inputStream = inputStream2;
                                httpURLConnection = m155265s;
                                if (httpURLConnection != null) {
                                }
                                if (byteArrayOutputStream != null) {
                                }
                                if (inputStream == null) {
                                }
                            }
                            return;
                        }
                        throw new IOException("Invalid parse link response from server :" + responseCode);
                    }
                }
            }
            m155265s.disconnect();
            C32204z7.m155264r(this.f148524r, this, 1, this.f148522p, null, false, 16, null);
            m155265s.disconnect();
        }
    }

    /* renamed from: zh.z7$e */
    /* loaded from: classes3.dex */
    public final class e implements Runnable {

        /* renamed from: p */
        private String f148529p;

        /* renamed from: q */
        final /* synthetic */ C32204z7 f148530q;

        /* renamed from: zh.z7$e$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: b */
            final /* synthetic */ C32204z7 f148532b;

            a(C32204z7 c32204z7) {
                this.f148532b = c32204z7;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, "errorMessage");
                C32204z7 c32204z7 = this.f148532b;
                e eVar = e.this;
                C32204z7.m155264r(c32204z7, eVar, -1, eVar.f148529p, null, false, 16, null);
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                AbstractC19074t.m100208f(obj, "entity");
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    String optString = jSONObject.optString("uid");
                    String optString2 = jSONObject.optString("avt");
                    String optString3 = jSONObject.optString("stt");
                    String optString4 = jSONObject.optString("dpn");
                    int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    String optString5 = jSONObject.optString("qrImgLink");
                    ContactProfile contactProfile = new ContactProfile(optString);
                    contactProfile.f42446v = optString2;
                    contactProfile.f42458z = optString3;
                    contactProfile.f42437s = optString4;
                    contactProfile.f42455y = e.this.f148529p;
                    contactProfile.f42447v0 = optInt;
                    contactProfile.f42352K0 = optInt;
                    contactProfile.f42373R0 = 85;
                    C18013y0 m155280b = C32204z7.Companion.m155280b(contactProfile);
                    AbstractC19074t.m100205c(m155280b);
                    m155280b.m95797k(optString5, null);
                    C32204z7 c32204z7 = this.f148532b;
                    e eVar = e.this;
                    C32204z7.m155264r(c32204z7, eVar, 0, eVar.f148529p, m155280b, false, 16, null);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    C32204z7 c32204z72 = this.f148532b;
                    e eVar2 = e.this;
                    C32204z7.m155264r(c32204z72, eVar2, -1, eVar2.f148529p, null, false, 16, null);
                }
            }
        }

        public e(C32204z7 c32204z7, String str) {
            boolean m127120J;
            AbstractC19074t.m100208f(str, "phone");
            this.f148530q = c32204z7;
            this.f148529p = "";
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            m127120J = AbstractC24341v.m127120J(lowerCase, "tel:", false, 2, null);
            if (m127120J) {
                str = str.substring(4, str.length() - 1);
                AbstractC19074t.m100207e(str, "substring(...)");
            }
            this.f148529p = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a(this.f148530q));
                c0766k.mo1583Y9(this.f148529p, AbstractC23309i.m121779c5(), 7);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zh.z7$f */
    /* loaded from: classes3.dex */
    public static final class f implements Runnable {

        /* renamed from: p */
        private final String f148533p;

        /* renamed from: q */
        private final i f148534q;

        public f(String str, i iVar) {
            AbstractC19074t.m100208f(iVar, "listener");
            this.f148533p = str;
            this.f148534q = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f148533p;
            AbstractC19074t.m100205c(str);
            if (!TextUtils.isEmpty(C31944h6.m153548n(str))) {
                return;
            }
            ArrayList m118814b = AbstractC23143m5.m118814b(this.f148533p);
            AbstractC19074t.m100207e(m118814b, "getListSuggestionTime(...)");
            this.f148534q.mo95617a(m118814b);
        }
    }

    /* renamed from: zh.z7$g */
    /* loaded from: classes3.dex */
    public final class g implements Runnable {

        /* renamed from: p */
        private final String f148535p;

        /* renamed from: q */
        private final boolean f148536q;

        /* renamed from: r */
        private int f148537r;

        /* renamed from: s */
        private final int f148538s;

        /* renamed from: t */
        final /* synthetic */ C32204z7 f148539t;

        /* renamed from: zh.z7$g$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: b */
            final /* synthetic */ C32204z7 f148541b;

            /* renamed from: c */
            final /* synthetic */ long f148542c;

            a(C32204z7 c32204z7, long j11) {
                this.f148541b = c32204z7;
                this.f148542c = j11;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                boolean z11;
                int i11;
                AbstractC19074t.m100208f(c20096c, "errorMessage");
                C24559a.m127933c("[ParseLink]", "Error[" + AbstractC31856b8.m153142a(g.this.f148535p) + "]: " + c20096c.m104492d());
                if (c20096c.m104491c() != 1003 && c20096c.m104491c() != 1004) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                C32204z7 c32204z7 = this.f148541b;
                g gVar = g.this;
                if (z11) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                C32204z7.m155264r(c32204z7, gVar, i11, gVar.f148535p, null, false, 16, null);
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                AbstractC19074t.m100208f(obj, "entity");
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received parse data: ");
                    sb2.append(jSONObject);
                    C24559a.m127933c("[ParseLink]", "Received parse data from server url: " + AbstractC31856b8.m153142a(g.this.f148535p));
                    C18013y0 m154930o = C32098s.m154930o(jSONObject);
                    if (m154930o == null) {
                        C32204z7 c32204z7 = this.f148541b;
                        g gVar = g.this;
                        C32204z7.m155264r(c32204z7, gVar, 1, gVar.f148535p, null, false, 16, null);
                    } else {
                        C32204z7 c32204z72 = this.f148541b;
                        g gVar2 = g.this;
                        C32204z7.m155264r(c32204z72, gVar2, 0, gVar2.f148535p, m154930o, false, 16, null);
                    }
                    m154930o.f91251B.f147943A = C23793c.Companion.m124321a().mo124319c() - this.f148542c;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public g(C32204z7 c32204z7, String str, boolean z11, int i11, int i12) {
            AbstractC19074t.m100208f(str, "mUrl");
            this.f148539t = c32204z7;
            this.f148535p = str;
            this.f148536q = z11;
            this.f148537r = i11;
            this.f148538s = i12;
        }

        /* renamed from: b */
        public final void m155290b(int i11) {
            this.f148537r = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long mo124319c = C23793c.Companion.m124321a().mo124319c();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a(this.f148539t, mo124319c));
                c0766k.m1850i0(this.f148535p, this.f148536q, this.f148537r, this.f148538s);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zh.z7$h */
    /* loaded from: classes3.dex */
    public interface h {
        /* renamed from: a */
        void mo64439a(String str, int i11);

        /* renamed from: b */
        void mo64440b(String str, C18013y0 c18013y0);

        /* renamed from: c */
        void mo64441c(String str, String str2);
    }

    /* renamed from: zh.z7$i */
    /* loaded from: classes3.dex */
    public interface i {
        /* renamed from: a */
        void mo95617a(ArrayList arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.z7$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final j f148543q = new j();

        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3977j mo12V4() {
            return new C3977j(MainApplication.Companion.m35500c());
        }
    }

    /* renamed from: zh.z7$k */
    /* loaded from: classes3.dex */
    public static final class k extends LinkedBlockingDeque {
        k() {
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null && !(obj instanceof Runnable)) {
                return false;
            }
            return m155293e((Runnable) obj);
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        /* renamed from: d */
        public boolean add(Runnable runnable) {
            AbstractC19074t.m100208f(runnable, "element");
            super.addFirst(runnable);
            return true;
        }

        /* renamed from: e */
        public /* bridge */ boolean m155293e(Runnable runnable) {
            return super.contains(runnable);
        }

        /* renamed from: g */
        public /* bridge */ int m155294g() {
            return super.size();
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        /* renamed from: j */
        public boolean offer(Runnable runnable) {
            AbstractC19074t.m100208f(runnable, C0927o.f3427r);
            return super.offerFirst(runnable);
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
        /* renamed from: k */
        public void put(Runnable runnable) {
            AbstractC19074t.m100208f(runnable, C0927o.f3427r);
            super.putFirst(runnable);
        }

        /* renamed from: l */
        public /* bridge */ boolean m155297l(Runnable runnable) {
            return super.remove(runnable);
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public final /* bridge */ boolean remove(Object obj) {
            if (obj != null && !(obj instanceof Runnable)) {
                return false;
            }
            return m155297l((Runnable) obj);
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingDeque, java.util.Deque
        public final /* bridge */ int size() {
            return m155294g();
        }
    }

    /* renamed from: zh.z7$l */
    /* loaded from: classes3.dex */
    public static final class l implements C18638h.a {

        /* renamed from: a */
        final /* synthetic */ C18013y0 f148544a;

        /* renamed from: b */
        final /* synthetic */ C32204z7 f148545b;

        /* renamed from: c */
        final /* synthetic */ String f148546c;

        /* renamed from: d */
        final /* synthetic */ h f148547d;

        l(C18013y0 c18013y0, C32204z7 c32204z7, String str, h hVar) {
            this.f148544a = c18013y0;
            this.f148545b = c32204z7;
            this.f148546c = str;
            this.f148547d = hVar;
        }

        @Override // p142ey.C18638h.a
        /* renamed from: a */
        public void mo95329a(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, "uid");
            AbstractC19074t.m100208f(str2, "errorMsg");
            this.f148545b.f148512e.put(this.f148546c, this.f148544a);
            h hVar = this.f148547d;
            String str3 = this.f148546c;
            C18013y0 c18013y0 = this.f148544a;
            AbstractC19074t.m100205c(c18013y0);
            C18013y0 m95795g = c18013y0.m95795g();
            AbstractC19074t.m100207e(m95795g, "cloneData(...)");
            hVar.mo64440b(str3, m95795g);
        }

        @Override // p142ey.C18638h.a
        /* renamed from: b */
        public void mo95330b(String str, String str2, String str3) {
            AbstractC19074t.m100208f(str, "uid");
            AbstractC19074t.m100208f(str2, "linkQRCode");
            C18013y0 c18013y0 = this.f148544a;
            if (c18013y0 != null) {
                c18013y0.m95797k(str2, str3);
            }
            this.f148545b.f148512e.put(this.f148546c, this.f148544a);
            h hVar = this.f148547d;
            String str4 = this.f148546c;
            C18013y0 c18013y02 = this.f148544a;
            AbstractC19074t.m100205c(c18013y02);
            C18013y0 m95795g = c18013y02.m95795g();
            AbstractC19074t.m100207e(m95795g, "cloneData(...)");
            hVar.mo64440b(str4, m95795g);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f148519q);
        f148507l = m129210a;
    }

    public /* synthetic */ C32204z7(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: A */
    static /* synthetic */ void m155251A(C32204z7 c32204z7, String str, h hVar, Class cls, boolean z11, int i11, int i12, Object obj) {
        boolean z12;
        int i13;
        if ((i12 & 8) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        if ((i12 & 16) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        c32204z7.m155268z(str, hVar, cls, z12, i13);
    }

    /* renamed from: i */
    public final C3977j m155259i() {
        return (C3977j) this.f148518k.getValue();
    }

    /* renamed from: j */
    public static final C32204z7 m155260j() {
        return Companion.m155281c();
    }

    /* renamed from: m */
    private final int m155261m(String str) {
        Integer num = (Integer) this.f148508a.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: n */
    private final int m155262n(String str) {
        Integer num = (Integer) this.f148515h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: q */
    public final void m155263q(Runnable runnable, int i11, String str, C18013y0 c18013y0, boolean z11) {
        List<h> list;
        int m155261m;
        try {
            synchronized (this) {
                try {
                    boolean z12 = runnable instanceof d;
                    this.f148509b.remove(str);
                    if (z11) {
                        list = (List) this.f148510c.remove(str);
                    } else {
                        list = (List) this.f148510c.get(str);
                    }
                    if (list != null) {
                        if (i11 != -1) {
                            if (i11 != 0) {
                                if (i11 != 1) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ((h) it.next()).mo64439a(str, -1);
                                    }
                                } else {
                                    C24559a.m127933c("[ParseLink]", "Result no data url: " + AbstractC31856b8.m153142a(str));
                                    if (z12) {
                                        this.f148517j.add(str);
                                    } else {
                                        this.f148513f.add(str);
                                    }
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        ((h) it2.next()).mo64439a(str, 1);
                                    }
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Success: ");
                                sb2.append(c18013y0);
                                if (z12) {
                                    this.f148516i.put(str, c18013y0);
                                } else {
                                    this.f148512e.put(str, c18013y0);
                                }
                                for (h hVar : list) {
                                    AbstractC19074t.m100205c(c18013y0);
                                    C18013y0 m95795g = c18013y0.m95795g();
                                    AbstractC19074t.m100207e(m95795g, "cloneData(...)");
                                    hVar.mo64440b(str, m95795g);
                                }
                                C24559a.m127933c("[ParseLink]", "Success url: " + AbstractC31856b8.m153142a(str));
                            }
                        } else {
                            C24559a.m127933c("[ParseLink]", "Failed url: " + AbstractC31856b8.m153142a(str));
                            if (z12) {
                                m155261m = m155262n(str) + 1;
                                this.f148515h.put(str, Integer.valueOf(m155261m));
                            } else {
                                m155261m = m155261m(str) + 1;
                                this.f148508a.put(str, Integer.valueOf(m155261m));
                            }
                            if (m155261m < 3) {
                                if (runnable instanceof g) {
                                    ((g) runnable).m155290b(m155261m);
                                }
                                this.f148509b.put(str, runnable);
                                this.f148510c.put(str, list);
                                this.f148511d.execute(runnable);
                            } else {
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    ((h) it3.next()).mo64439a(str, -1);
                                }
                            }
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m155264r(C32204z7 c32204z7, Runnable runnable, int i11, String str, C18013y0 c18013y0, boolean z11, int i12, Object obj) {
        boolean z12;
        if ((i12 & 16) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        c32204z7.m155263q(runnable, i11, str, c18013y0, z12);
    }

    /* renamed from: s */
    public final HttpURLConnection m155265s(String str) {
        HttpURLConnection httpURLConnection;
        boolean z11;
        boolean m127120J;
        String str2 = str;
        int i11 = 0;
        do {
            C22652b.m117234a(str2);
            URL url = new URL(str2);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", "WhatsApp/2");
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 301 && responseCode != 302 && responseCode != 303) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                String headerField = httpURLConnection.getHeaderField("Location");
                AbstractC19074t.m100205c(headerField);
                m127120J = AbstractC24341v.m127120J(headerField, "/", false, 2, null);
                if (m127120J) {
                    headerField = url.getProtocol() + "://" + url.getHost() + headerField;
                }
                String m153552r = C31944h6.m153552r(str2);
                AbstractC19074t.m100205c(headerField);
                boolean equals = TextUtils.equals(m153552r, C31944h6.m153552r(headerField));
                AbstractC19074t.m100205c(headerField);
                if (!equals) {
                    i11++;
                    Map map = this.f148514g;
                    AbstractC19074t.m100205c(headerField);
                    map.put(str, headerField);
                }
                httpURLConnection.disconnect();
                str2 = headerField;
            }
            if (!z11) {
                break;
            }
        } while (i11 <= 2);
        return httpURLConnection;
    }

    /* renamed from: t */
    private final void m155266t(String str, boolean z11, h hVar) {
        if (hVar != null && !TextUtils.isEmpty(str)) {
            C18013y0 c18013y0 = (C18013y0) this.f148516i.get(str);
            boolean z12 = true;
            if (c18013y0 != null) {
                C18013y0 m95795g = c18013y0.m95795g();
                C32098s c32098s = m95795g.f91251B;
                c32098s.f147943A = 0L;
                c32098s.f147944B = 0L;
                c32098s.f147945C = 0L;
                String m154934d = c32098s.m154934d();
                AbstractC19074t.m100207e(m154934d, "getLocalPathThumbLink(...)");
                if (m154934d.length() <= 0) {
                    z12 = false;
                }
                c32098s.f147976z = z12;
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC19074t.m100207e(m95795g, "also(...)");
                hVar.mo64440b(str, m95795g);
                return;
            }
            if (this.f148517j.contains(str)) {
                AbstractC23350e.m122774d("ParseLink", "Invalid input");
                hVar.mo64439a(str, 1);
            } else {
                if (m155262n(str) >= 3) {
                    AbstractC23350e.m122774d("ParseLink", "Reach retry limit");
                    hVar.mo64439a(str, -1);
                    return;
                }
                C24559a.m127933c("[ParseLink]", "Start parsing link from Client url: " + AbstractC31856b8.m153142a(str));
                m155267y(str, z11, hVar);
            }
        }
    }

    /* renamed from: y */
    private final void m155267y(String str, boolean z11, h hVar) {
        if (C23055e5.m118272g(false)) {
            synchronized (this) {
                try {
                    List list = (List) this.f148510c.get(str);
                    if (list == null) {
                        list = new ArrayList();
                        this.f148510c.put(str, list);
                    }
                    if (!list.contains(hVar)) {
                        list.add(hVar);
                    }
                    if (((Runnable) this.f148509b.get(str)) == null) {
                        d dVar = new d(this, str, z11);
                        this.f148509b.put(str, dVar);
                        this.f148511d.execute(dVar);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        AbstractC23350e.m122774d("ParseLink", "Network not connected");
        hVar.mo64439a(str, -2);
    }

    /* renamed from: z */
    private final void m155268z(String str, h hVar, Class cls, boolean z11, int i11) {
        try {
            if (C29628e.m147249E0().m93432x()) {
                synchronized (this) {
                    try {
                        List list = (List) this.f148510c.get(str);
                        if (list == null) {
                            list = new ArrayList();
                            this.f148510c.put(str, list);
                        }
                        if (!list.contains(hVar)) {
                            list.add(hVar);
                        }
                        Runnable runnable = (Runnable) this.f148509b.get(str);
                        String simpleName = cls.getSimpleName();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Begin parse link task. Type: ");
                        sb2.append(simpleName);
                        if (runnable == null) {
                            if (AbstractC19074t.m100204b(cls, e.class)) {
                                runnable = new e(this, str);
                            } else if (AbstractC19074t.m100204b(cls, g.class)) {
                                runnable = new g(this, str, z11, m155261m(str), i11);
                            }
                            if (runnable != null) {
                                this.f148509b.put(str, runnable);
                                this.f148511d.execute(runnable);
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
                return;
            }
            AbstractC23350e.m122774d("ParseLink", "Socket not connected");
            hVar.mo64439a(str, -2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public final void m155269h() {
        this.f148515h.clear();
        this.f148516i.clear();
        this.f148513f.clear();
    }

    /* renamed from: k */
    public final C18013y0 m155270k(String str) {
        if (str != null && str.length() != 0) {
            C18013y0 c18013y0 = (C18013y0) this.f148512e.get(str);
            if (c18013y0 != null) {
                return c18013y0.m95795g();
            }
            if (this.f148516i.get(str) != null) {
                return (C18013y0) this.f148516i.get(str);
            }
            return null;
        }
        return null;
    }

    /* renamed from: l */
    public final String m155271l(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        String str2 = (String) this.f148514g.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: o */
    public final boolean m155272o(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        return this.f148514g.containsKey(str);
    }

    /* renamed from: p */
    public final boolean m155273p(String str) {
        if (!this.f148513f.contains(str)) {
            if (this.f148508a.containsKey(str)) {
                Object obj = this.f148508a.get(str);
                AbstractC19074t.m100205c(obj);
                if (((Number) obj).intValue() >= 3) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final void m155274u(String str, boolean z11, h hVar) {
        if (hVar == null) {
            return;
        }
        if (str != null) {
            try {
                if (str.length() != 0) {
                    C18013y0 c18013y0 = (C18013y0) this.f148512e.get(str);
                    if (c18013y0 != null) {
                        C18013y0 m95795g = c18013y0.m95795g();
                        AbstractC19074t.m100207e(m95795g, "cloneData(...)");
                        hVar.mo64440b(str, m95795g);
                    } else if (this.f148513f.contains(str)) {
                        hVar.mo64439a(str, 1);
                    } else if (m155261m(str) >= 3) {
                        hVar.mo64439a(str, -1);
                    } else {
                        C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.Companion.m35500c(), AbstractC23056e6.m118285k(str));
                        if (m2800f != null) {
                            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, String.valueOf(m2800f.m153300r()), null, 2, null);
                            if (m141798e != null) {
                                C18013y0 m155280b = Companion.m155280b(m141798e);
                                if (z11) {
                                    C18638h m98510a = C18638h.Companion.m98510a();
                                    String str2 = m141798e.f42434r;
                                    AbstractC19074t.m100207e(str2, "uid");
                                    m98510a.m98507i(str2, new l(m155280b, this, str, hVar));
                                } else {
                                    this.f148512e.put(str, m155280b);
                                    AbstractC19074t.m100205c(m155280b);
                                    C18013y0 m95795g2 = m155280b.m95795g();
                                    AbstractC19074t.m100207e(m95795g2, "cloneData(...)");
                                    hVar.mo64440b(str, m95795g2);
                                }
                            } else {
                                m155251A(this, str, hVar, e.class, false, 0, 24, null);
                            }
                        } else {
                            m155251A(this, str, hVar, e.class, false, 0, 24, null);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        hVar.mo64439a(str, 1);
    }

    /* renamed from: v */
    public final void m155275v(String str, i iVar) {
        AbstractC19074t.m100208f(iVar, "listener");
        this.f148511d.execute(new f(str, iVar));
    }

    /* renamed from: w */
    public final void m155276w(String str, h hVar, boolean z11, int i11) {
        boolean m127120J;
        boolean m127120J2;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (hVar != null) {
            try {
                m127120J = AbstractC24341v.m127120J(str, "http://", false, 2, null);
                if (!m127120J) {
                    m127120J2 = AbstractC24341v.m127120J(str, "https://", false, 2, null);
                    if (!m127120J2) {
                        str = "https://" + str;
                    }
                }
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    C18013y0 c18013y0 = (C18013y0) this.f148512e.get(str2);
                    if (c18013y0 != null) {
                        C18013y0 m95795g = c18013y0.m95795g();
                        C32098s c32098s = m95795g.f91251B;
                        c32098s.f147943A = 0L;
                        c32098s.f147944B = 0L;
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC19074t.m100207e(m95795g, "also(...)");
                        hVar.mo64440b(str2, m95795g);
                        return;
                    }
                    if (this.f148513f.contains(str2)) {
                        AbstractC23350e.m122774d("ParseLink", "Invalid input");
                        hVar.mo64439a(str2, 1);
                        return;
                    } else {
                        if (m155261m(str2) >= 3) {
                            AbstractC23350e.m122774d("ParseLink", "Reach retry limit");
                            hVar.mo64439a(str2, -1);
                            return;
                        }
                        C24559a.m127933c("[ParseLink]", "Start parsing link from SERVER url: " + AbstractC31856b8.m153142a(str2));
                        m155268z(str2, hVar, g.class, z11, i11);
                        return;
                    }
                }
                hVar.mo64439a(str2, 1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: x */
    public final void m155277x(String str, boolean z11, boolean z12, int i11, h hVar) {
        boolean m127120J;
        String m127116F;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        m127120J = AbstractC24341v.m127120J(str, "https://", false, 2, null);
        if (!m127120J) {
            m127116F = AbstractC24341v.m127116F(str, "http://", "", false, 4, null);
            str = "https://" + m127116F;
        }
        if (AbstractC0924m0.m3481U9() && !C31944h6.m153517B(str)) {
            m155266t(str, z12, hVar);
        } else {
            m155276w(str, hVar, z11, i11);
        }
    }

    private C32204z7() {
        InterfaceC24854k m129210a;
        this.f148508a = new HashMap();
        this.f148509b = new HashMap();
        this.f148510c = new HashMap();
        this.f148512e = new HashMap();
        this.f148513f = new HashSet();
        this.f148514g = new HashMap();
        this.f148515h = new HashMap();
        this.f148516i = new HashMap();
        this.f148517j = new HashSet();
        m129210a = AbstractC24856m.m129210a(j.f148543q);
        this.f148518k = m129210a;
        this.f148511d = new ThreadPoolExecutor(1, 2, 30L, TimeUnit.SECONDS, new k(), new ThreadFactoryC18928a("ParseLinkPhone"));
    }
}
