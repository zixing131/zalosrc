package p206hd;

import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gd.AbstractC19393b;
import gd.InterfaceC19394c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import lu.C22652b;
import p543uc.C27224b;
import p543uc.C27225c;
import si.C26263i;
import vi.C28260f;
import vi.C28261g;

/* renamed from: hd.b */
/* loaded from: classes3.dex */
public final class C19998b extends AbstractC19393b {
    public static final a Companion = new a(null);

    /* renamed from: hd.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: hd.b$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC19394c {

        /* renamed from: a */
        private final C28261g f98310a;

        /* renamed from: b */
        private final String f98311b;

        /* renamed from: c */
        private final InterfaceC19997a f98312c;

        public b(C28261g c28261g, String str, InterfaceC19997a interfaceC19997a) {
            AbstractC19074t.m100208f(c28261g, "zipFileMetadataWithAction");
            AbstractC19074t.m100208f(str, "pathOut");
            this.f98310a = c28261g;
            this.f98311b = str;
            this.f98312c = interfaceC19997a;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: a */
        public String mo101516a() {
            return "SMLDownloadZipFileFromDrive";
        }

        /* renamed from: b */
        public final InterfaceC19997a m103758b() {
            return this.f98312c;
        }

        /* renamed from: c */
        public final String m103759c() {
            return this.f98311b;
        }

        /* renamed from: d */
        public final C28261g m103760d() {
            return this.f98310a;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: f */
        public String mo101517f() {
            return this.f98310a.mo142291d();
        }
    }

    /* renamed from: hd.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final String f98313a;

        public c(String str) {
            AbstractC19074t.m100208f(str, "pathOut");
            this.f98313a = str;
        }

        /* renamed from: a */
        public final String m103761a() {
            return this.f98313a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00bf: MOVE (r4 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:192), block:B:106:0x00be */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0112 A[Catch: Exception -> 0x010e, TryCatch #2 {Exception -> 0x010e, blocks: (B:25:0x010a, B:16:0x0112, B:17:0x0115), top: B:24:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0136 A[Catch: Exception -> 0x0132, TryCatch #6 {Exception -> 0x0132, blocks: (B:80:0x012e, B:69:0x0136, B:71:0x013b), top: B:79:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b A[Catch: Exception -> 0x0132, TRY_LEAVE, TryCatch #6 {Exception -> 0x0132, blocks: (B:80:0x012e, B:69:0x0136, B:71:0x013b), top: B:79:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // p185gc.AbstractC19384h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c mo13388b(b bVar) {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        ?? r82;
        InputStream inputStream3;
        FileOutputStream fileOutputStream2;
        c cVar;
        InterfaceC19997a m103758b;
        InputStream inputStream4;
        AbstractC19074t.m100208f(bVar, "params");
        C28260f m142319h = bVar.m103760d().m142319h();
        FileOutputStream fileOutputStream3 = null;
        if (TextUtils.isEmpty(m142319h.m142306h())) {
            return null;
        }
        try {
            try {
                URL url = new URL(C27224b.f127988a.m139321a(m142319h.m142306h()));
                C22652b.m117234a(url.toString());
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) uRLConnection;
                try {
                    int m107385a = AbstractC20626a.m107385a(3);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(m107385a);
                    httpURLConnection.setReadTimeout(40000);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                    httpURLConnection.setRequestProperty("Authorization", "Bearer " + m101513d());
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    r82 = 200;
                    if (responseCode == 200) {
                        try {
                            InputStream inputStream5 = httpURLConnection.getInputStream();
                            try {
                                fileOutputStream2 = new FileOutputStream(bVar.m103759c());
                            } catch (FileNotFoundException e11) {
                                e = e11;
                                fileOutputStream2 = null;
                            } catch (Exception e12) {
                                e = e12;
                                r82 = 0;
                                inputStream3 = inputStream5;
                                C27225c.m139330e("SMLDownloadZipFileFromDrive", 5, e);
                                if (r82 != 0) {
                                }
                                if (inputStream3 != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                inputStream = inputStream5;
                                if (fileOutputStream3 != null) {
                                    try {
                                        fileOutputStream3.close();
                                    } catch (Exception e13) {
                                        AbstractC20110a.f98889a.mo104552e(e13);
                                        throw th2;
                                    }
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                    throw th2;
                                }
                                throw th2;
                            }
                            try {
                                byte[] bArr = new byte[8192];
                                long mo142289b = m142319h.mo142289b();
                                long j11 = 0;
                                while (true) {
                                    int read = inputStream5.read(bArr);
                                    if (read != -1) {
                                        if (C26263i.m135055u().m135069I() || ((m103758b = bVar.m103758b()) != null && m103758b.isCancelled())) {
                                            break;
                                        }
                                        fileOutputStream2.write(bArr, 0, read);
                                        j11 += read;
                                        InterfaceC19997a m103758b2 = bVar.m103758b();
                                        if (m103758b2 != null) {
                                            m103758b2.mo103756a(j11, mo142289b);
                                        }
                                    } else {
                                        cVar = new c(bVar.m103759c());
                                        break;
                                    }
                                }
                                throw new InterruptedException("Thread interrupted while downloading file from drive");
                            } catch (FileNotFoundException e14) {
                                e = e14;
                                AbstractC20110a.f98889a.mo104552e(e);
                                cVar = null;
                                fileOutputStream3 = fileOutputStream2;
                                inputStream4 = inputStream5;
                                if (fileOutputStream3 != null) {
                                }
                                if (inputStream4 != null) {
                                }
                                httpURLConnection.disconnect();
                                return cVar;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            inputStream3 = responseCode;
                        }
                    } else {
                        C27225c.m139331f("SMLDownloadZipFileFromDrive", 5, responseCode, httpURLConnection);
                        cVar = null;
                        inputStream4 = null;
                    }
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream3.close();
                        } catch (Exception e16) {
                            AbstractC20110a.f98889a.mo104552e(e16);
                        }
                    }
                    if (inputStream4 != null) {
                        inputStream4.close();
                    }
                    httpURLConnection.disconnect();
                    return cVar;
                } catch (Exception e17) {
                    e = e17;
                    inputStream2 = null;
                    r82 = inputStream2;
                    inputStream3 = inputStream2;
                    C27225c.m139330e("SMLDownloadZipFileFromDrive", 5, e);
                    if (r82 != 0) {
                        try {
                            r82.close();
                        } catch (Exception e18) {
                            AbstractC20110a.f98889a.mo104552e(e18);
                            return null;
                        }
                    }
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (httpURLConnection != null) {
                        return null;
                    }
                    httpURLConnection.disconnect();
                    return null;
                } catch (Throwable th4) {
                    th2 = th4;
                    inputStream = null;
                }
            } catch (Exception e19) {
                e = e19;
                httpURLConnection = null;
                inputStream2 = null;
            } catch (Throwable th5) {
                th2 = th5;
                httpURLConnection = null;
                inputStream = null;
            }
        } catch (Throwable th6) {
            th2 = th6;
            fileOutputStream3 = fileOutputStream;
        }
    }
}
