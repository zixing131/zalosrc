package p264jd;

import android.net.TrafficStats;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gd.AbstractC19393b;
import gd.InterfaceC19394c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import javax.net.ssl.HttpsURLConnection;
import p128ed.C18388c;
import p128ed.C18390e;
import p543uc.C27224b;
import p543uc.C27225c;
import p620wt.AbstractC29237l;
import vc.EnumC27961a;
import vi.C28261g;

/* renamed from: jd.b */
/* loaded from: classes3.dex */
public final class C21223b extends AbstractC19393b {
    public static final a Companion = new a(null);

    /* renamed from: jd.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: jd.b$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC19394c {

        /* renamed from: a */
        private final C28261g f103469a;

        public b(C28261g c28261g) {
            AbstractC19074t.m100208f(c28261g, "zipFileMetadata");
            this.f103469a = c28261g;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: a */
        public String mo101516a() {
            return "SMLSendInitReqUp";
        }

        /* renamed from: b */
        public final C28261g m109975b() {
            return this.f103469a;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: f */
        public String mo101517f() {
            return this.f103469a.mo142291d();
        }
    }

    /* renamed from: jd.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final String f103470a;

        public c(String str) {
            AbstractC19074t.m100208f(str, "sessionUploadURI");
            this.f103470a = str;
        }

        /* renamed from: a */
        public final String m109976a() {
            return this.f103470a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9 A[Catch: Exception -> 0x01b5, TryCatch #10 {Exception -> 0x01b5, blocks: (B:69:0x01b1, B:58:0x01b9, B:59:0x01bc, B:61:0x01c1, B:62:0x01c4), top: B:68:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c1 A[Catch: Exception -> 0x01b5, TryCatch #10 {Exception -> 0x01b5, blocks: (B:69:0x01b1, B:58:0x01b9, B:59:0x01bc, B:61:0x01c1, B:62:0x01c4), top: B:68:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p185gc.AbstractC19384h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c mo13388b(b bVar) {
        OutputStream outputStream;
        DataOutputStream dataOutputStream;
        HttpsURLConnection httpsURLConnection;
        String str;
        String str2;
        OutputStream outputStream2;
        int responseCode;
        AbstractC19074t.m100208f(bVar, "params");
        C28261g m109975b = bVar.m109975b();
        TrafficStats.setThreadStatsTag(1001);
        C27225c.m139327b(4);
        File file = new File(C18388c.f92779a.m97397h(m109975b.mo142291d()));
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
            } catch (Exception e11) {
                e = e11;
                outputStream = null;
                httpsURLConnection = null;
                dataOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                dataOutputStream = null;
            }
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
        if (file.exists() && file.isFile()) {
            long length = file.length();
            EnumC27961a m142293e = m109975b.m142293e();
            EnumC27961a enumC27961a = EnumC27961a.f130359r;
            if (m142293e == enumC27961a) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                str = String.format("https://www.googleapis.com/upload/drive/v3/files/%s?uploadType=resumable", Arrays.copyOf(new Object[]{m109975b.m142319h().m142306h()}, 1));
                AbstractC19074t.m100207e(str, "format(...)");
            } else {
                str = "https://www.googleapis.com/upload/drive/v3/files?uploadType=resumable";
            }
            URL url = new URL(str);
            C18390e.m97413u("[SMLSendInitReqUp] " + url, false, 2, null);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection3 = (HttpsURLConnection) uRLConnection;
            try {
                String m139326f = C27224b.f127988a.m139326f(m109975b);
                int m107385a = AbstractC20626a.m107385a(3);
                httpsURLConnection3.setDoInput(true);
                httpsURLConnection3.setDoOutput(true);
                httpsURLConnection3.setUseCaches(false);
                httpsURLConnection3.setConnectTimeout(m107385a);
                httpsURLConnection3.setReadTimeout(m107385a);
                if (m109975b.m142293e() == enumC27961a) {
                    str2 = "PATCH";
                } else {
                    str2 = "POST";
                }
                httpsURLConnection3.setRequestMethod(str2);
                httpsURLConnection3.setRequestProperty("Connection", "Keep-Alive");
                httpsURLConnection3.setRequestProperty("Authorization", "Bearer " + m101513d());
                httpsURLConnection3.setRequestProperty("X-Upload-Content-Type", "application/zip");
                httpsURLConnection3.setRequestProperty("X-Upload-Content-Length", String.valueOf(length));
                httpsURLConnection3.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                httpsURLConnection3.setRequestProperty("Content-Length", String.valueOf(m139326f.length()));
                outputStream2 = httpsURLConnection3.getOutputStream();
                try {
                    dataOutputStream = new DataOutputStream(outputStream2);
                } catch (Exception e13) {
                    e = e13;
                    dataOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    dataOutputStream = null;
                }
                try {
                    dataOutputStream.writeBytes(m139326f);
                    dataOutputStream.flush();
                    C27225c.m139327b(4);
                    responseCode = httpsURLConnection3.getResponseCode();
                } catch (Exception e14) {
                    e = e14;
                    outputStream = outputStream2;
                    e = e;
                    httpsURLConnection = httpsURLConnection3;
                    try {
                        C27225c.m139330e("SMLSendInitReqUp", 4, e);
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        if (dataOutputStream != null) {
                            dataOutputStream.flush();
                        }
                        AbstractC29237l.m145996a(dataOutputStream);
                        if (outputStream != null) {
                            outputStream.flush();
                        }
                        AbstractC29237l.m145996a(outputStream);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        httpsURLConnection2 = httpsURLConnection;
                        if (httpsURLConnection2 != null) {
                            try {
                                httpsURLConnection2.disconnect();
                            } catch (Exception e15) {
                                AbstractC20110a.f98889a.mo104552e(e15);
                                throw th;
                            }
                        }
                        if (dataOutputStream != null) {
                            dataOutputStream.flush();
                        }
                        AbstractC29237l.m145996a(dataOutputStream);
                        if (outputStream != null) {
                            outputStream.flush();
                        }
                        AbstractC29237l.m145996a(outputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    httpsURLConnection2 = httpsURLConnection3;
                    outputStream = outputStream2;
                    th = th;
                    if (httpsURLConnection2 != null) {
                    }
                    if (dataOutputStream != null) {
                    }
                    AbstractC29237l.m145996a(dataOutputStream);
                    if (outputStream != null) {
                    }
                    AbstractC29237l.m145996a(outputStream);
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
                httpsURLConnection = httpsURLConnection3;
                outputStream = null;
                dataOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                dataOutputStream = null;
                httpsURLConnection2 = httpsURLConnection3;
                outputStream = null;
            }
            if (responseCode == 200) {
                String headerField = httpsURLConnection3.getHeaderField("Location");
                AbstractC19074t.m100205c(headerField);
                c cVar = new c(headerField);
                try {
                    httpsURLConnection3.disconnect();
                    dataOutputStream.flush();
                    AbstractC29237l.m145996a(dataOutputStream);
                    if (outputStream2 != null) {
                        outputStream2.flush();
                    }
                    AbstractC29237l.m145996a(outputStream2);
                } catch (Exception e17) {
                    AbstractC20110a.f98889a.mo104552e(e17);
                }
                return cVar;
            }
            C27225c.m139331f("SMLSendInitReqUp", 4, responseCode, httpsURLConnection3);
            httpsURLConnection3.disconnect();
            dataOutputStream.flush();
            AbstractC29237l.m145996a(dataOutputStream);
            if (outputStream2 != null) {
                outputStream2.flush();
            }
            AbstractC29237l.m145996a(outputStream2);
            return null;
        }
        C18390e.m97413u("[SMLSendInitReqUp] Zip file to upload not exist or not a valid file!", false, 2, null);
        try {
            AbstractC29237l.m145996a(null);
            AbstractC29237l.m145996a(null);
        } catch (Exception e18) {
            AbstractC20110a.f98889a.mo104552e(e18);
        }
        return null;
    }
}
