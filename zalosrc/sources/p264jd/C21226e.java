package p264jd;

import android.net.TrafficStats;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gd.AbstractC19393b;
import gd.InterfaceC19394c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vc.EnumC27961a;
import vi.C28260f;
import vi.C28261g;

/* renamed from: jd.e */
/* loaded from: classes3.dex */
public final class C21226e extends AbstractC19393b {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f103486c;

    /* renamed from: jd.e$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f103487q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21226e mo12V4() {
            return c.f103488a.m109997a();
        }
    }

    /* renamed from: jd.e$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21226e m109996a() {
            return (C21226e) C21226e.f103486c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jd.e$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f103488a = new c();

        /* renamed from: b */
        private static final C21226e f103489b = new C21226e();

        private c() {
        }

        /* renamed from: a */
        public final C21226e m109997a() {
            return f103489b;
        }
    }

    /* renamed from: jd.e$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC19394c {

        /* renamed from: a */
        private final C28261g f103490a;

        /* renamed from: b */
        private final InterfaceC21225d f103491b;

        public d(C28261g c28261g, InterfaceC21225d interfaceC21225d) {
            AbstractC19074t.m100208f(c28261g, "zipFileMetadata");
            this.f103490a = c28261g;
            this.f103491b = interfaceC21225d;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: a */
        public String mo101516a() {
            return "SMLUploadZipFileToDrive";
        }

        /* renamed from: b */
        public final InterfaceC21225d m109998b() {
            return this.f103491b;
        }

        /* renamed from: c */
        public final C28261g m109999c() {
            return this.f103490a;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: f */
        public String mo101517f() {
            return this.f103490a.mo142291d();
        }
    }

    /* renamed from: jd.e$e */
    /* loaded from: classes3.dex */
    public static final class e {
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f103487q);
        f103486c = m129210a;
    }

    @Override // p185gc.AbstractC19384h
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo13388b(Object obj) {
        m109994h((d) obj);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x029f A[Catch: Exception -> 0x0298, TryCatch #17 {Exception -> 0x0298, blocks: (B:57:0x0294, B:42:0x029a, B:44:0x029f, B:45:0x02a2, B:47:0x02a7, B:48:0x02aa), top: B:56:0x0294 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a7 A[Catch: Exception -> 0x0298, TryCatch #17 {Exception -> 0x0298, blocks: (B:57:0x0294, B:42:0x029a, B:44:0x029f, B:45:0x02a2, B:47:0x02a7, B:48:0x02aa), top: B:56:0x0294 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c4 A[Catch: Exception -> 0x02bd, TryCatch #22 {Exception -> 0x02bd, blocks: (B:76:0x02b9, B:62:0x02bf, B:64:0x02c4, B:65:0x02c7, B:67:0x02cc, B:68:0x02cf), top: B:75:0x02b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cc A[Catch: Exception -> 0x02bd, TryCatch #22 {Exception -> 0x02bd, blocks: (B:76:0x02b9, B:62:0x02bf, B:64:0x02c4, B:65:0x02c7, B:67:0x02cc, B:68:0x02cf), top: B:75:0x02b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021e A[Catch: Exception -> 0x0222, TryCatch #13 {Exception -> 0x0222, blocks: (B:91:0x0210, B:93:0x021e, B:94:0x0224), top: B:90:0x0210 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected e m109994h(d dVar) {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        DataOutputStream dataOutputStream;
        OutputStream outputStream;
        FileInputStream fileInputStream;
        int i11;
        HttpsURLConnection httpsURLConnection2;
        FileInputStream fileInputStream2;
        OutputStream outputStream2;
        Exception e11;
        long length;
        int i12;
        String format;
        String str;
        InputStream inputStream;
        BufferedReader bufferedReader;
        AbstractC19074t.m100208f(dVar, "params");
        C28261g m109999c = dVar.m109999c();
        InterfaceC21225d m109998b = dVar.m109998b();
        TrafficStats.setThreadStatsTag(1001);
        C27225c.m139327b(4);
        File file = new File(C18388c.f92779a.m97397h(m109999c.mo142291d()));
        try {
            if (file.exists() && file.isFile()) {
                fileInputStream2 = new FileInputStream(file);
                try {
                    length = file.length();
                    EnumC27961a m142293e = m109999c.m142293e();
                    EnumC27961a enumC27961a = EnumC27961a.f130359r;
                    i12 = 0;
                    if (m142293e == enumC27961a) {
                        try {
                            C19067n0 c19067n0 = C19067n0.f94947a;
                            format = String.format("https://www.googleapis.com/upload/drive/v3/files/%s?uploadType=multipart", Arrays.copyOf(new Object[]{m109999c.m142319h().m142306h()}, 1));
                            AbstractC19074t.m100207e(format, "format(...)");
                        } catch (Exception e12) {
                            e = e12;
                            i11 = 4;
                            httpsURLConnection2 = null;
                            outputStream2 = null;
                            dataOutputStream = null;
                            try {
                                C27225c.m139330e("SMLUploadZipFileToDrive", i11, e);
                                if (httpsURLConnection2 != null) {
                                }
                                AbstractC29237l.m145996a(fileInputStream2);
                                if (dataOutputStream != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (outputStream2 != null) {
                                }
                                AbstractC29237l.m145996a(outputStream2);
                                return null;
                            } catch (Throwable th3) {
                                th2 = th3;
                                httpsURLConnection = httpsURLConnection2;
                                fileInputStream = fileInputStream2;
                                outputStream = outputStream2;
                                if (httpsURLConnection != null) {
                                    try {
                                        httpsURLConnection.disconnect();
                                    } catch (Exception e13) {
                                        AbstractC20110a.f98889a.mo104552e(e13);
                                        throw th2;
                                    }
                                }
                                AbstractC29237l.m145996a(fileInputStream);
                                if (dataOutputStream != null) {
                                    dataOutputStream.flush();
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (outputStream != null) {
                                    outputStream.flush();
                                }
                                AbstractC29237l.m145996a(outputStream);
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileInputStream = fileInputStream2;
                            httpsURLConnection = null;
                            dataOutputStream = null;
                            outputStream = null;
                            if (httpsURLConnection != null) {
                            }
                            AbstractC29237l.m145996a(fileInputStream);
                            if (dataOutputStream != null) {
                            }
                            AbstractC29237l.m145996a(dataOutputStream);
                            if (outputStream != null) {
                            }
                            AbstractC29237l.m145996a(outputStream);
                            throw th2;
                        }
                    } else {
                        format = "https://www.googleapis.com/upload/drive/v3/files?uploadType=multipart";
                    }
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(format).openConnection());
                    AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    httpsURLConnection2 = (HttpsURLConnection) uRLConnection;
                    try {
                        int m107385a = AbstractC20626a.m107385a(3);
                        httpsURLConnection2.setDoInput(true);
                        httpsURLConnection2.setDoOutput(true);
                        httpsURLConnection2.setUseCaches(false);
                        httpsURLConnection2.setConnectTimeout(m107385a);
                        httpsURLConnection2.setReadTimeout(m107385a);
                        if (m109999c.m142293e() == enumC27961a) {
                            str = "PATCH";
                        } else {
                            str = "POST";
                        }
                        httpsURLConnection2.setRequestMethod(str);
                        httpsURLConnection2.setRequestProperty("Connection", "Keep-Alive");
                        httpsURLConnection2.setRequestProperty("Authorization", "Bearer " + m101513d());
                        httpsURLConnection2.setRequestProperty("Content-Type", "multipart/related; boundary=zalo_upload_media");
                        outputStream2 = httpsURLConnection2.getOutputStream();
                    } catch (Exception e14) {
                        e = e14;
                        i11 = 4;
                        outputStream2 = null;
                        dataOutputStream = null;
                        C27225c.m139330e("SMLUploadZipFileToDrive", i11, e);
                        if (httpsURLConnection2 != null) {
                        }
                        AbstractC29237l.m145996a(fileInputStream2);
                        if (dataOutputStream != null) {
                        }
                        AbstractC29237l.m145996a(dataOutputStream);
                        if (outputStream2 != null) {
                        }
                        AbstractC29237l.m145996a(outputStream2);
                        return null;
                    } catch (Throwable th5) {
                        fileInputStream = fileInputStream2;
                        th2 = th5;
                        httpsURLConnection = httpsURLConnection2;
                        dataOutputStream = null;
                        outputStream = null;
                        if (httpsURLConnection != null) {
                        }
                        AbstractC29237l.m145996a(fileInputStream);
                        if (dataOutputStream != null) {
                        }
                        AbstractC29237l.m145996a(dataOutputStream);
                        if (outputStream != null) {
                        }
                        AbstractC29237l.m145996a(outputStream);
                        throw th2;
                    }
                } catch (Exception e15) {
                    e = e15;
                } catch (Throwable th6) {
                    fileInputStream = fileInputStream2;
                    th2 = th6;
                }
                try {
                    dataOutputStream = new DataOutputStream(outputStream2);
                    try {
                        dataOutputStream.writeBytes("\r\n--zalo_upload_media\r\nContent-Type: application/json; charset=UTF-8\r\n\r\n" + C27224b.f127988a.m139326f(m109999c) + "\r\n\r\n--zalo_upload_media\r\nContent-Type: application/zip\r\n\r\n");
                        byte[] bArr = new byte[8192];
                        long j11 = 0;
                        while (true) {
                            int read = fileInputStream2.read(bArr);
                            outputStream = outputStream2;
                            if (read == -1) {
                                break;
                            }
                            try {
                                dataOutputStream.write(bArr, i12, read);
                                fileInputStream = fileInputStream2;
                                long j12 = j11 + read;
                                if (m109998b != null) {
                                    try {
                                        m109998b.mo98999b(j12, length);
                                    } catch (Exception e16) {
                                        e = e16;
                                        outputStream2 = outputStream;
                                        fileInputStream2 = fileInputStream;
                                        i11 = 4;
                                        C27225c.m139330e("SMLUploadZipFileToDrive", i11, e);
                                        if (httpsURLConnection2 != null) {
                                            try {
                                                httpsURLConnection2.disconnect();
                                            } catch (Exception e17) {
                                                e11 = e17;
                                                AbstractC20110a.f98889a.mo104552e(e11);
                                                return null;
                                            }
                                        }
                                        AbstractC29237l.m145996a(fileInputStream2);
                                        if (dataOutputStream != null) {
                                            dataOutputStream.flush();
                                        }
                                        AbstractC29237l.m145996a(dataOutputStream);
                                        if (outputStream2 != null) {
                                            outputStream2.flush();
                                        }
                                        AbstractC29237l.m145996a(outputStream2);
                                        return null;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th2 = th;
                                        httpsURLConnection = httpsURLConnection2;
                                        if (httpsURLConnection != null) {
                                        }
                                        AbstractC29237l.m145996a(fileInputStream);
                                        if (dataOutputStream != null) {
                                        }
                                        AbstractC29237l.m145996a(dataOutputStream);
                                        if (outputStream != null) {
                                        }
                                        AbstractC29237l.m145996a(outputStream);
                                        throw th2;
                                    }
                                }
                                j11 = j12;
                                outputStream2 = outputStream;
                                fileInputStream2 = fileInputStream;
                                i12 = 0;
                            } catch (Exception e18) {
                                e = e18;
                                outputStream2 = outputStream;
                            } catch (Throwable th8) {
                                th = th8;
                                fileInputStream = fileInputStream2;
                            }
                        }
                        FileInputStream fileInputStream3 = fileInputStream2;
                        dataOutputStream.writeBytes("\r\n");
                        dataOutputStream.writeBytes("--zalo_upload_media--");
                        dataOutputStream.writeBytes("\r\n");
                        dataOutputStream.flush();
                        C27225c.m139327b(4);
                        int responseCode = httpsURLConnection2.getResponseCode();
                        if (responseCode == 200) {
                            try {
                                inputStream = httpsURLConnection2.getInputStream();
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                                } catch (IOException e19) {
                                    e = e19;
                                    bufferedReader = null;
                                    AbstractC20110a.f98889a.mo104552e(e);
                                    AbstractC29237l.m145996a(inputStream);
                                    AbstractC29237l.m145996a(bufferedReader);
                                    httpsURLConnection2.disconnect();
                                    AbstractC29237l.m145996a(fileInputStream3);
                                    dataOutputStream.flush();
                                    AbstractC29237l.m145996a(dataOutputStream);
                                    if (outputStream != null) {
                                    }
                                    AbstractC29237l.m145996a(outputStream);
                                    return null;
                                } catch (Throwable th9) {
                                    th = th9;
                                    bufferedReader = null;
                                    AbstractC29237l.m145996a(inputStream);
                                    AbstractC29237l.m145996a(bufferedReader);
                                    throw th;
                                }
                            } catch (IOException e21) {
                                e = e21;
                                inputStream = null;
                            } catch (Throwable th10) {
                                th = th10;
                                inputStream = null;
                            }
                            try {
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    String str2 = null;
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine != null) {
                                            str2 = readLine;
                                        } else {
                                            readLine = null;
                                        }
                                        if (readLine == null) {
                                            break;
                                        }
                                        sb2.append(str2);
                                    }
                                    if (m109998b != null) {
                                        C28260f m142319h = m109999c.m142319h();
                                        String sb3 = sb2.toString();
                                        AbstractC19074t.m100207e(sb3, "toString(...)");
                                        m109998b.mo98998a(m142319h, file, sb3);
                                    }
                                    AbstractC29237l.m145996a(inputStream);
                                } catch (Throwable th11) {
                                    th = th11;
                                    AbstractC29237l.m145996a(inputStream);
                                    AbstractC29237l.m145996a(bufferedReader);
                                    throw th;
                                }
                            } catch (IOException e22) {
                                e = e22;
                                AbstractC20110a.f98889a.mo104552e(e);
                                AbstractC29237l.m145996a(inputStream);
                                AbstractC29237l.m145996a(bufferedReader);
                                httpsURLConnection2.disconnect();
                                AbstractC29237l.m145996a(fileInputStream3);
                                dataOutputStream.flush();
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (outputStream != null) {
                                }
                                AbstractC29237l.m145996a(outputStream);
                                return null;
                            }
                            AbstractC29237l.m145996a(bufferedReader);
                        } else {
                            C27225c.m139331f("SMLUploadZipFileToDrive", 4, responseCode, httpsURLConnection2);
                        }
                        try {
                            httpsURLConnection2.disconnect();
                            AbstractC29237l.m145996a(fileInputStream3);
                            dataOutputStream.flush();
                            AbstractC29237l.m145996a(dataOutputStream);
                            if (outputStream != null) {
                                outputStream.flush();
                            }
                            AbstractC29237l.m145996a(outputStream);
                            return null;
                        } catch (Exception e23) {
                            e11 = e23;
                            AbstractC20110a.f98889a.mo104552e(e11);
                            return null;
                        }
                    } catch (Exception e24) {
                        e = e24;
                    } catch (Throwable th12) {
                        th = th12;
                        fileInputStream = fileInputStream2;
                        outputStream = outputStream2;
                    }
                } catch (Exception e25) {
                    e = e25;
                    i11 = 4;
                    dataOutputStream = null;
                    C27225c.m139330e("SMLUploadZipFileToDrive", i11, e);
                    if (httpsURLConnection2 != null) {
                    }
                    AbstractC29237l.m145996a(fileInputStream2);
                    if (dataOutputStream != null) {
                    }
                    AbstractC29237l.m145996a(dataOutputStream);
                    if (outputStream2 != null) {
                    }
                    AbstractC29237l.m145996a(outputStream2);
                    return null;
                } catch (Throwable th13) {
                    fileInputStream = fileInputStream2;
                    outputStream = outputStream2;
                    th2 = th13;
                    httpsURLConnection = httpsURLConnection2;
                    dataOutputStream = null;
                }
            }
            C18390e.m97412t("[SMLUploadZipFileToDrive] Zip file to upload not exist or not a valid file!!!!!", true);
            try {
                AbstractC29237l.m145996a(null);
                AbstractC29237l.m145996a(null);
                AbstractC29237l.m145996a(null);
                return null;
            } catch (Exception e26) {
                AbstractC20110a.f98889a.mo104552e(e26);
                return null;
            }
        } catch (Exception e27) {
            e = e27;
            i11 = 4;
            httpsURLConnection2 = null;
            fileInputStream2 = null;
        } catch (Throwable th14) {
            th2 = th14;
            httpsURLConnection = null;
            dataOutputStream = null;
            outputStream = null;
            fileInputStream = null;
        }
    }
}
