package ad;

import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import im0.AbstractC20626a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import lu.C22652b;
import me0.AbstractC23238v2;
import p128ed.C18388c;
import p543uc.C27224b;
import p543uc.C27225c;
import p677yc.AbstractC30897a;
import si.C26263i;
import vi.C28255a;

/* renamed from: ad.b */
/* loaded from: classes3.dex */
public final class C0738b extends AbstractC30897a {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private final C28255a f2466e;

    /* renamed from: ad.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0738b(String str, C28255a c28255a) {
        super(str);
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(c28255a, "fileNeedDownload");
        this.f2466e = c28255a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00c0: MOVE (r2 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:193), block:B:92:0x00c0 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:39:0x0142, B:41:0x014a, B:42:0x014d, B:54:0x0165, B:56:0x016a, B:58:0x016f), top: B:7:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:39:0x0142, B:41:0x014a, B:42:0x014d, B:54:0x0165, B:56:0x016a, B:58:0x016f), top: B:7:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:39:0x0142, B:41:0x014a, B:42:0x014d, B:54:0x0165, B:56:0x016a, B:58:0x016f), top: B:7:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:39:0x0142, B:41:0x014a, B:42:0x014d, B:54:0x0165, B:56:0x016a, B:58:0x016f), top: B:7:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f A[Catch: Exception -> 0x0146, TRY_LEAVE, TryCatch #7 {Exception -> 0x0146, blocks: (B:39:0x0142, B:41:0x014a, B:42:0x014d, B:54:0x0165, B:56:0x016a, B:58:0x016f), top: B:7:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // p677yc.AbstractC30897a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo1205a() {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        FileOutputStream fileOutputStream2;
        Exception e11;
        FileOutputStream fileOutputStream3;
        FileNotFoundException e12;
        if (TextUtils.isEmpty(this.f2466e.m142266e())) {
            return;
        }
        FileOutputStream fileOutputStream4 = null;
        try {
            try {
                try {
                    URL url = new URL(C27224b.f127988a.m139321a(this.f2466e.m142266e()));
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
                        String m150123g = m150123g();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bearer ");
                        sb2.append(m150123g);
                        httpURLConnection.setRequestProperty("Authorization", sb2.toString());
                        httpURLConnection.connect();
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 200) {
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                try {
                                    String str = AbstractC20130d.m104892r0() + C18388c.f92779a.m97395f(this.f2466e.m142269i());
                                    try {
                                        fileOutputStream3 = new FileOutputStream(str);
                                    } catch (FileNotFoundException e13) {
                                        fileOutputStream3 = null;
                                        e12 = e13;
                                    }
                                    try {
                                        byte[] bArr = new byte[8192];
                                        while (true) {
                                            int read = inputStream.read(bArr);
                                            if (read != -1) {
                                                if (!C26263i.m135055u().m135069I()) {
                                                    fileOutputStream3.write(bArr, 0, read);
                                                } else {
                                                    throw new InterruptedException("Thread interrupt while downloading file to drive");
                                                }
                                            } else {
                                                File file = new File(str);
                                                File file2 = new File(this.f2466e.m142269i());
                                                if (file.exists()) {
                                                    if (!file2.exists()) {
                                                        AbstractC23238v2.m119717b(file, file2);
                                                    }
                                                    file.delete();
                                                }
                                                AbstractC20110a.f98889a.m104564x("SMLDriveDownloadTask").mo104548a("Download file success: " + this.f2466e.m142269i() + ". Id = " + this.f2466e.m142266e(), new Object[0]);
                                            }
                                        }
                                    } catch (FileNotFoundException e14) {
                                        e12 = e14;
                                        AbstractC20110a.f98889a.mo104552e(e12);
                                        fileOutputStream4 = fileOutputStream3;
                                        if (fileOutputStream4 != null) {
                                        }
                                        if (inputStream != null) {
                                        }
                                        httpURLConnection.disconnect();
                                    }
                                    fileOutputStream4 = fileOutputStream3;
                                } catch (Exception e15) {
                                    fileOutputStream2 = null;
                                    e11 = e15;
                                    C27225c.m139330e("SMLDriveDownloadTask", 5, e11);
                                    if (fileOutputStream2 != null) {
                                    }
                                    if (inputStream != null) {
                                    }
                                    if (httpURLConnection == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (fileOutputStream4 != null) {
                                        try {
                                            fileOutputStream4.close();
                                        } catch (Exception e16) {
                                            AbstractC20110a.f98889a.mo104552e(e16);
                                            throw th;
                                        }
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                            } catch (Exception e17) {
                                e11 = e17;
                                fileOutputStream2 = sb2;
                                C27225c.m139330e("SMLDriveDownloadTask", 5, e11);
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection == null) {
                                    httpURLConnection.disconnect();
                                    return;
                                }
                                return;
                            }
                        } else {
                            C27225c.m139331f("SMLDriveDownloadTask", 5, responseCode, httpURLConnection);
                            inputStream = null;
                        }
                        if (fileOutputStream4 != null) {
                            fileOutputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        httpURLConnection.disconnect();
                    } catch (Exception e18) {
                        fileOutputStream2 = null;
                        e11 = e18;
                        inputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                } catch (Exception e19) {
                    inputStream = null;
                    fileOutputStream2 = null;
                    e11 = e19;
                    httpURLConnection = null;
                } catch (Throwable th4) {
                    th = th4;
                    httpURLConnection = null;
                    inputStream = null;
                }
            } catch (Exception e21) {
                AbstractC20110a.f98889a.mo104552e(e21);
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream4 = fileOutputStream;
        }
    }

    @Override // p677yc.AbstractC30897a
    /* renamed from: e */
    public String mo1206e() {
        return this.f2466e.mo142271k();
    }

    @Override // p677yc.AbstractC30897a
    /* renamed from: f */
    public String mo1207f() {
        return "DriveDownloadTask";
    }
}
