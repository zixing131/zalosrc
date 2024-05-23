package id;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.backuprestore.media.exception.DriveAuthException;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gd.AbstractC19393b;
import gd.InterfaceC19394c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import p128ed.C18390e;
import p543uc.C27224b;
import p543uc.C27225c;
import p543uc.C27229g;
import p620wt.AbstractC29237l;
import si.C26263i;

/* renamed from: id.b */
/* loaded from: classes3.dex */
public final class C20512b extends AbstractC19393b {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private c f100785c = new c();

    /* renamed from: d */
    private b f100786d = new b(false, 1, null);

    /* renamed from: id.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: id.b$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC19394c {

        /* renamed from: a */
        private final boolean f100787a;

        public b(boolean z11) {
            this.f100787a = z11;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: a */
        public String mo101516a() {
            return "SMLGetFilesMetadataOnDrive";
        }

        /* renamed from: b */
        public final boolean m106566b() {
            return this.f100787a;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: f */
        public String mo101517f() {
            return this.f100787a ? "Get1FileSample" : "GetAll";
        }

        public /* synthetic */ b(boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    /* renamed from: id.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final HashMap f100788a = new HashMap();

        /* renamed from: b */
        private final ArrayList f100789b = new ArrayList();

        /* renamed from: c */
        private ArrayList f100790c;

        /* renamed from: a */
        public final ArrayList m106567a() {
            return this.f100789b;
        }

        /* renamed from: b */
        public final ArrayList m106568b() {
            return this.f100790c;
        }

        /* renamed from: c */
        public final HashMap m106569c() {
            return this.f100788a;
        }

        /* renamed from: d */
        public final void m106570d(ArrayList arrayList) {
            this.f100790c = arrayList;
        }

        /* renamed from: e */
        public final int m106571e() {
            return this.f100788a.size() + this.f100789b.size();
        }
    }

    /* renamed from: g */
    private final void m106562g(C27229g c27229g) {
        this.f100785c.m106569c().putAll(c27229g.m139342c());
        this.f100785c.m106567a().addAll(c27229g.m139340a());
        if (c27229g.m139341b() != null && (!c27229g.m139341b().isEmpty())) {
            if (this.f100785c.m106568b() == null) {
                this.f100785c.m106570d(new ArrayList());
            }
            ArrayList m106568b = this.f100785c.m106568b();
            if (m106568b != null) {
                m106568b.addAll(c27229g.m139341b());
            }
        }
    }

    /* renamed from: h */
    private final String m106563h(String str) {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://www.googleapis.com/drive/v3/files");
        sb2.append("?pageSize=");
        if (this.f100786d.m106566b()) {
            i11 = 1;
        } else {
            i11 = 1000;
        }
        sb2.append(i11);
        sb2.append("&");
        sb2.append("spaces=");
        C27224b c27224b = C27224b.f127988a;
        sb2.append(c27224b.m139322b());
        sb2.append("&");
        sb2.append("q=");
        sb2.append(c27224b.m139324d());
        if (!TextUtils.isEmpty(str)) {
            sb2.append("&");
            sb2.append("pageToken=");
            sb2.append(str);
        }
        sb2.append("&fields=nextPageToken,files(");
        sb2.append("id");
        sb2.append(",");
        sb2.append("name");
        sb2.append(",");
        sb2.append("properties");
        sb2.append(",");
        sb2.append("appProperties");
        sb2.append(",");
        sb2.append("mimeType");
        sb2.append(",");
        sb2.append("size");
        sb2.append(",");
        sb2.append("md5Checksum");
        sb2.append(")");
        sb2.append("&orderBy=modifiedTime" + C18390e.f92781a.m97416c(" ") + "desc");
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m106564i(String str) {
        InputStream inputStream;
        Closeable closeable;
        InputStreamReader inputStreamReader;
        Exception e11;
        HttpURLConnection httpURLConnection;
        String str2;
        C18390e.f92781a.m97414a(2);
        TrafficStats.setThreadStatsTag(1001);
        HttpURLConnection httpURLConnection2 = null;
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(m106563h(str)).openConnection());
                AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                str = (HttpURLConnection) uRLConnection;
            } catch (Exception e12) {
                inputStream = null;
                inputStreamReader = null;
                e11 = e12;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                closeable = null;
                if (httpURLConnection2 != null) {
                }
                AbstractC29237l.m145996a(closeable);
                AbstractC29237l.m145996a(inputStream);
                throw th;
            }
            try {
                int m107385a = AbstractC20626a.m107385a(3);
                str.setDoInput(true);
                str.setDoOutput(false);
                str.setRequestMethod("GET");
                str.setConnectTimeout(m107385a);
                str.setReadTimeout(m107385a);
                str.setRequestProperty("Authorization", "Bearer " + m101513d());
                int responseCode = str.getResponseCode();
                AbstractC20110a.f98889a.mo104548a("getListFileofPagewithToken responseCode: " + responseCode, new Object[0]);
                if (responseCode == 200) {
                    inputStream = str.getInputStream();
                    try {
                        inputStreamReader = new InputStreamReader(inputStream);
                    } catch (Exception e13) {
                        inputStreamReader = null;
                        e11 = e13;
                        httpURLConnection = str;
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = null;
                        httpURLConnection2 = str;
                        if (httpURLConnection2 != null) {
                        }
                        AbstractC29237l.m145996a(closeable);
                        AbstractC29237l.m145996a(inputStream);
                        throw th;
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        StringBuffer stringBuffer = new StringBuffer();
                        String str3 = null;
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                str3 = readLine;
                            } else {
                                readLine = null;
                            }
                            if (readLine == null) {
                                break;
                            } else {
                                stringBuffer.append(str3);
                            }
                        }
                        String stringBuffer2 = stringBuffer.toString();
                        AbstractC19074t.m100207e(stringBuffer2, "toString(...)");
                        C27229g m139345a = C27229g.Companion.m139345a(stringBuffer2);
                        try {
                            str.disconnect();
                            bufferedReader.close();
                        } catch (IOException e14) {
                            AbstractC20110a.f98889a.mo104552e(e14);
                        }
                        if (m139345a != null && m139345a.m139344e() > 0) {
                            m106562g(m139345a);
                            if (!this.f100786d.m106566b() && !TextUtils.isEmpty(m139345a.m139343d())) {
                                if (!C26263i.m135055u().m135069I()) {
                                    m106564i(m139345a.m139343d());
                                } else {
                                    throw new InterruptedException("Thread interrupt while getting list zip file metadata from drive");
                                }
                            } else if (this.f100786d.m106566b()) {
                                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                                if (this.f100785c.m106571e() > 0) {
                                    str2 = "YES";
                                } else {
                                    str2 = "NO";
                                }
                                aVar.mo104548a("annv2 checkServer - server valid ? " + str2, new Object[0]);
                            } else {
                                AbstractC20110a.f98889a.mo104548a("annv2 Number of file on Drive = (%d) files", Integer.valueOf(this.f100785c.m106571e()));
                            }
                        }
                        inputStreamReader2 = inputStreamReader;
                    } catch (Exception e15) {
                        e11 = e15;
                        httpURLConnection = str;
                        C27225c.m139330e("SMLGetFilesMetadataOnDrive", 2, e11);
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception e16) {
                                AbstractC20110a.f98889a.mo104552e(e16);
                            }
                        }
                        AbstractC29237l.m145996a(inputStreamReader);
                        AbstractC29237l.m145996a(inputStream);
                    }
                } else {
                    try {
                        str.disconnect();
                    } catch (IOException e17) {
                        AbstractC20110a.f98889a.mo104552e(e17);
                    }
                    C27225c.m139331f("SMLGetFilesMetadataOnDrive", 2, responseCode, str);
                    inputStream = null;
                }
                try {
                    str.disconnect();
                } catch (Exception e18) {
                    AbstractC20110a.f98889a.mo104552e(e18);
                }
                AbstractC29237l.m145996a(inputStreamReader2);
            } catch (Exception e19) {
                inputStreamReader = null;
                e11 = e19;
                inputStream = null;
                httpURLConnection = str;
                C27225c.m139330e("SMLGetFilesMetadataOnDrive", 2, e11);
                if (httpURLConnection != null) {
                }
                AbstractC29237l.m145996a(inputStreamReader);
                AbstractC29237l.m145996a(inputStream);
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                closeable = null;
                httpURLConnection2 = str;
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception e21) {
                        AbstractC20110a.f98889a.mo104552e(e21);
                    }
                }
                AbstractC29237l.m145996a(closeable);
                AbstractC29237l.m145996a(inputStream);
                throw th;
            }
            AbstractC29237l.m145996a(inputStream);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // p185gc.AbstractC19384h
    /* renamed from: j */
    public c mo13388b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        this.f100786d = bVar;
        this.f100785c = new c();
        if (m101513d().length() != 0) {
            m106564i(null);
            return this.f100785c;
        }
        throw new DriveAuthException(2, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, "Get list Drive failed: invalid token");
    }
}
