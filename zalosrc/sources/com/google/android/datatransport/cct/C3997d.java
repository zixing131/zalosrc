package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.C3997d;
import com.google.firebase.encoders.EncodingException;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p010a4.AbstractC0116i;
import p010a4.C0115h;
import p030b4.AbstractC2512f;
import p030b4.AbstractC2513g;
import p030b4.InterfaceC2519m;
import p121e4.AbstractC18197a;
import p149f4.AbstractC18717b;
import p149f4.InterfaceC18716a;
import p149f4.InterfaceC18718c;
import p288k4.InterfaceC21460a;
import p520t8.InterfaceC26582a;
import p668y3.C30276b;
import p703z3.AbstractC31196a;
import p703z3.AbstractC31205j;
import p703z3.AbstractC31206k;
import p703z3.AbstractC31207l;
import p703z3.AbstractC31208m;
import p703z3.AbstractC31209n;
import p703z3.AbstractC31210o;
import p703z3.EnumC31211p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes.dex */
public final class C3997d implements InterfaceC2519m {

    /* renamed from: a */
    private final InterfaceC26582a f15800a;

    /* renamed from: b */
    private final ConnectivityManager f15801b;

    /* renamed from: c */
    private final Context f15802c;

    /* renamed from: d */
    final URL f15803d;

    /* renamed from: e */
    private final InterfaceC21460a f15804e;

    /* renamed from: f */
    private final InterfaceC21460a f15805f;

    /* renamed from: g */
    private final int f15806g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final URL f15807a;

        /* renamed from: b */
        final AbstractC31205j f15808b;

        /* renamed from: c */
        final String f15809c;

        a(URL url, AbstractC31205j abstractC31205j, String str) {
            this.f15807a = url;
            this.f15808b = abstractC31205j;
            this.f15809c = str;
        }

        /* renamed from: a */
        a m18904a(URL url) {
            return new a(url, this.f15808b, this.f15809c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f15810a;

        /* renamed from: b */
        final URL f15811b;

        /* renamed from: c */
        final long f15812c;

        b(int i11, URL url, long j11) {
            this.f15810a = i11;
            this.f15811b = url;
            this.f15812c = j11;
        }
    }

    C3997d(Context context, InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2, int i11) {
        this.f15800a = AbstractC31205j.m152078b();
        this.f15802c = context;
        this.f15801b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f15803d = m18903n(C3994a.f15791c);
        this.f15804e = interfaceC21460a2;
        this.f15805f = interfaceC21460a;
        this.f15806g = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public b m18894e(a aVar) {
        AbstractC18197a.m96968f("CctTransportBackend", "Making request to: %s", aVar.f15807a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f15807a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f15806g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f15809c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f15800a.mo136507a(aVar.f15808b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC18197a.m96968f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC18197a.m96964b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC18197a.m96964b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b(responseCode, null, 0L);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            InputStream m18902m = m18902m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                            try {
                                b bVar = new b(responseCode, null, AbstractC31209n.m152087b(new BufferedReader(new InputStreamReader(m18902m))).mo152071c());
                                if (m18902m != null) {
                                    m18902m.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                return bVar;
                            } finally {
                            }
                        } catch (Throwable th2) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    }
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                } finally {
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (EncodingException e11) {
            e = e11;
            AbstractC18197a.m96966d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e12) {
            e = e12;
            AbstractC18197a.m96966d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, null, 0L);
        } catch (UnknownHostException e13) {
            e = e13;
            AbstractC18197a.m96966d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, null, 0L);
        } catch (IOException e14) {
            e = e14;
            AbstractC18197a.m96966d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* renamed from: f */
    private static int m18895f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC31210o.b.UNKNOWN_MOBILE_SUBTYPE.m152090c();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC31210o.b.COMBINED.m152090c();
        }
        if (AbstractC31210o.b.m152089b(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    /* renamed from: g */
    private static int m18896g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC31210o.c.NONE.m152092c();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m18897h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            AbstractC18197a.m96966d("CctTransportBackend", "Unable to find version code for package", e11);
            return -1;
        }
    }

    /* renamed from: i */
    private AbstractC31205j m18898i(AbstractC2512f abstractC2512f) {
        AbstractC31207l.a m152082j;
        HashMap hashMap = new HashMap();
        for (AbstractC0116i abstractC0116i : abstractC2512f.mo12588b()) {
            String mo492j = abstractC0116i.mo492j();
            if (!hashMap.containsKey(mo492j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC0116i);
                hashMap.put(mo492j, arrayList);
            } else {
                ((List) hashMap.get(mo492j)).add(abstractC0116i);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC0116i abstractC0116i2 = (AbstractC0116i) ((List) entry.getValue()).get(0);
            AbstractC31208m.a mo152064b = AbstractC31208m.m152083a().mo152068f(EnumC31211p.DEFAULT).mo152069g(this.f15805f.mo111045a()).mo152070h(this.f15804e.mo111045a()).mo152064b(AbstractC31206k.m152079a().mo152040c(AbstractC31206k.b.ANDROID_FIREBASE).mo152039b(AbstractC31196a.m152003a().mo152028m(Integer.valueOf(abstractC0116i2.m533g("sdk-version"))).mo152025j(abstractC0116i2.m532b("model")).mo152021f(abstractC0116i2.m532b("hardware")).mo152019d(abstractC0116i2.m532b("device")).mo152027l(abstractC0116i2.m532b("product")).mo152026k(abstractC0116i2.m532b("os-uild")).mo152023h(abstractC0116i2.m532b("manufacturer")).mo152020e(abstractC0116i2.m532b("fingerprint")).mo152018c(abstractC0116i2.m532b("country")).mo152022g(abstractC0116i2.m532b("locale")).mo152024i(abstractC0116i2.m532b("mcc_mnc")).mo152017b(abstractC0116i2.m532b("application_build")).mo152016a()).mo152038a());
            try {
                mo152064b.m152084i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo152064b.m152085j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC0116i abstractC0116i3 : (List) entry.getValue()) {
                C0115h mo490e = abstractC0116i3.mo490e();
                C30276b m530b = mo490e.m530b();
                if (m530b.equals(C30276b.m149414b("proto"))) {
                    m152082j = AbstractC31207l.m152082j(mo490e.m529a());
                } else if (m530b.equals(C30276b.m149414b("json"))) {
                    m152082j = AbstractC31207l.m152081i(new String(mo490e.m529a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC18197a.m96969g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m530b);
                }
                m152082j.mo152050c(abstractC0116i3.mo491f()).mo152051d(abstractC0116i3.mo493k()).mo152055h(abstractC0116i3.m534h("tz-offset")).mo152052e(AbstractC31210o.m152088a().mo152076c(AbstractC31210o.c.m152091b(abstractC0116i3.m533g("net-type"))).mo152075b(AbstractC31210o.b.m152089b(abstractC0116i3.m533g("mobile-subtype"))).mo152074a());
                if (abstractC0116i3.mo489d() != null) {
                    m152082j.mo152049b(abstractC0116i3.mo489d());
                }
                arrayList3.add(m152082j.mo152048a());
            }
            mo152064b.mo152065c(arrayList3);
            arrayList2.add(mo152064b.mo152063a());
        }
        return AbstractC31205j.m152077a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m18899j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    static long m18900k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ a m18901l(a aVar, b bVar) {
        URL url = bVar.f15811b;
        if (url != null) {
            AbstractC18197a.m96964b("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.m18904a(bVar.f15811b);
        }
        return null;
    }

    /* renamed from: m */
    private static InputStream m18902m(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: n */
    private static URL m18903n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e11) {
            throw new IllegalArgumentException("Invalid url: " + str, e11);
        }
    }

    @Override // p030b4.InterfaceC2519m
    /* renamed from: a */
    public AbstractC2513g mo12617a(AbstractC2512f abstractC2512f) {
        AbstractC31205j m18898i = m18898i(abstractC2512f);
        URL url = this.f15803d;
        String str = null;
        if (abstractC2512f.mo12589c() != null) {
            try {
                C3994a m18887d = C3994a.m18887d(abstractC2512f.mo12589c());
                if (m18887d.m18889e() != null) {
                    str = m18887d.m18889e();
                }
                if (m18887d.m18890f() != null) {
                    url = m18903n(m18887d.m18890f());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC2513g.m12601a();
            }
        }
        try {
            b bVar = (b) AbstractC18717b.m98707a(5, new a(url, m18898i, str), new InterfaceC18716a() { // from class: com.google.android.datatransport.cct.b
                @Override // p149f4.InterfaceC18716a
                public final Object apply(Object obj) {
                    C3997d.b m18894e;
                    m18894e = C3997d.this.m18894e((C3997d.a) obj);
                    return m18894e;
                }
            }, new InterfaceC18718c() { // from class: com.google.android.datatransport.cct.c
                @Override // p149f4.InterfaceC18718c
                /* renamed from: a */
                public final Object mo18891a(Object obj, Object obj2) {
                    C3997d.a m18901l;
                    m18901l = C3997d.m18901l((C3997d.a) obj, (C3997d.b) obj2);
                    return m18901l;
                }
            });
            int i11 = bVar.f15810a;
            if (i11 == 200) {
                return AbstractC2513g.m12603e(bVar.f15812c);
            }
            if (i11 < 500 && i11 != 404) {
                if (i11 == 400) {
                    return AbstractC2513g.m12602d();
                }
                return AbstractC2513g.m12601a();
            }
            return AbstractC2513g.m12604f();
        } catch (IOException e11) {
            AbstractC18197a.m96966d("CctTransportBackend", "Could not make request to the backend", e11);
            return AbstractC2513g.m12604f();
        }
    }

    @Override // p030b4.InterfaceC2519m
    /* renamed from: b */
    public AbstractC0116i mo12618b(AbstractC0116i abstractC0116i) {
        NetworkInfo activeNetworkInfo = this.f15801b.getActiveNetworkInfo();
        return abstractC0116i.m536l().m537a("sdk-version", Build.VERSION.SDK_INT).m539c("model", Build.MODEL).m539c("hardware", Build.HARDWARE).m539c("device", Build.DEVICE).m539c("product", Build.PRODUCT).m539c("os-uild", Build.ID).m539c("manufacturer", Build.MANUFACTURER).m539c("fingerprint", Build.FINGERPRINT).m538b("tz-offset", m18900k()).m537a("net-type", m18896g(activeNetworkInfo)).m537a("mobile-subtype", m18895f(activeNetworkInfo)).m539c("country", Locale.getDefault().getCountry()).m539c("locale", Locale.getDefault().getLanguage()).m539c("mcc_mnc", m18899j(this.f15802c).getSimOperator()).m539c("application_build", Integer.toString(m18897h(this.f15802c))).mo494d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3997d(Context context, InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2) {
        this(context, interfaceC21460a, interfaceC21460a2, 130000);
    }
}
