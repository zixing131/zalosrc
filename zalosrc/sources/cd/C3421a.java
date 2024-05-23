package cd;

import android.net.TrafficStats;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
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
import javax.net.ssl.HttpsURLConnection;
import ln0.AbstractC22543l;
import p543uc.C27225c;
import p677yc.AbstractC30897a;
import si.C26263i;
import vi.C28255a;

/* renamed from: cd.a */
/* loaded from: classes3.dex */
public final class C3421a extends AbstractC30897a {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private final C28255a f14362e;

    /* renamed from: cd.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3421a(String str, C28255a c28255a) {
        super(str);
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(c28255a, "localFile");
        this.f14362e = c28255a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0248 A[Catch: Exception -> 0x0213, TRY_ENTER, TryCatch #23 {Exception -> 0x0213, blocks: (B:23:0x0201, B:25:0x020f, B:27:0x0217, B:113:0x0248, B:115:0x024d, B:117:0x0252, B:119:0x0257, B:121:0x025c, B:123:0x0261), top: B:4:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024d A[Catch: Exception -> 0x0213, TryCatch #23 {Exception -> 0x0213, blocks: (B:23:0x0201, B:25:0x020f, B:27:0x0217, B:113:0x0248, B:115:0x024d, B:117:0x0252, B:119:0x0257, B:121:0x025c, B:123:0x0261), top: B:4:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0252 A[Catch: Exception -> 0x0213, TryCatch #23 {Exception -> 0x0213, blocks: (B:23:0x0201, B:25:0x020f, B:27:0x0217, B:113:0x0248, B:115:0x024d, B:117:0x0252, B:119:0x0257, B:121:0x025c, B:123:0x0261), top: B:4:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0257 A[Catch: Exception -> 0x0213, TryCatch #23 {Exception -> 0x0213, blocks: (B:23:0x0201, B:25:0x020f, B:27:0x0217, B:113:0x0248, B:115:0x024d, B:117:0x0252, B:119:0x0257, B:121:0x025c, B:123:0x0261), top: B:4:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025c A[Catch: Exception -> 0x0213, TryCatch #23 {Exception -> 0x0213, blocks: (B:23:0x0201, B:25:0x020f, B:27:0x0217, B:113:0x0248, B:115:0x024d, B:117:0x0252, B:119:0x0257, B:121:0x025c, B:123:0x0261), top: B:4:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0261 A[Catch: Exception -> 0x0213, TRY_LEAVE, TryCatch #23 {Exception -> 0x0213, blocks: (B:23:0x0201, B:25:0x020f, B:27:0x0217, B:113:0x0248, B:115:0x024d, B:117:0x0252, B:119:0x0257, B:121:0x025c, B:123:0x0261), top: B:4:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0270 A[Catch: Exception -> 0x026c, TryCatch #4 {Exception -> 0x026c, blocks: (B:145:0x0268, B:130:0x0270, B:132:0x0275, B:134:0x027a, B:136:0x027f, B:138:0x0284), top: B:144:0x0268 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0275 A[Catch: Exception -> 0x026c, TryCatch #4 {Exception -> 0x026c, blocks: (B:145:0x0268, B:130:0x0270, B:132:0x0275, B:134:0x027a, B:136:0x027f, B:138:0x0284), top: B:144:0x0268 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027a A[Catch: Exception -> 0x026c, TryCatch #4 {Exception -> 0x026c, blocks: (B:145:0x0268, B:130:0x0270, B:132:0x0275, B:134:0x027a, B:136:0x027f, B:138:0x0284), top: B:144:0x0268 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027f A[Catch: Exception -> 0x026c, TryCatch #4 {Exception -> 0x026c, blocks: (B:145:0x0268, B:130:0x0270, B:132:0x0275, B:134:0x027a, B:136:0x027f, B:138:0x0284), top: B:144:0x0268 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0284 A[Catch: Exception -> 0x026c, TRY_LEAVE, TryCatch #4 {Exception -> 0x026c, blocks: (B:145:0x0268, B:130:0x0270, B:132:0x0275, B:134:0x027a, B:136:0x027f, B:138:0x0284), top: B:144:0x0268 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0268 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020f A[Catch: Exception -> 0x0213, TryCatch #23 {Exception -> 0x0213, blocks: (B:23:0x0201, B:25:0x020f, B:27:0x0217, B:113:0x0248, B:115:0x024d, B:117:0x0252, B:119:0x0257, B:121:0x025c, B:123:0x0261), top: B:4:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0217 A[Catch: Exception -> 0x0213, TRY_LEAVE, TryCatch #23 {Exception -> 0x0213, blocks: (B:23:0x0201, B:25:0x020f, B:27:0x0217, B:113:0x0248, B:115:0x024d, B:117:0x0252, B:119:0x0257, B:121:0x025c, B:123:0x0261), top: B:4:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[Catch: all -> 0x0111, Exception -> 0x0115, SYNTHETIC, TryCatch #21 {Exception -> 0x0115, all -> 0x0111, blocks: (B:15:0x009c, B:17:0x0101, B:19:0x0119, B:55:0x01a9, B:49:0x01b3, B:52:0x01b8, B:53:0x01ba, B:58:0x01ae, B:77:0x01e7, B:69:0x01f3, B:74:0x01fd, B:73:0x01f8, B:80:0x01ec, B:93:0x01d0, B:88:0x01dc, B:91:0x01e1, B:96:0x01d5, B:22:0x01fe), top: B:14:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // p677yc.AbstractC30897a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo1205a() {
        FileInputStream fileInputStream;
        OutputStream outputStream;
        DataOutputStream dataOutputStream;
        int m116584g;
        BufferedReader bufferedReader;
        AbstractC20110a.a aVar;
        InputStream inputStream;
        TrafficStats.setThreadStatsTag(1001);
        if (!C26263i.m135055u().m135069I()) {
            HttpsURLConnection httpsURLConnection = null;
            r6 = null;
            InputStream inputStream2 = null;
            httpsURLConnection = null;
            try {
                try {
                    fileInputStream = new FileInputStream(new File(this.f14362e.m142269i()));
                } catch (Exception e11) {
                    e = e11;
                    fileInputStream = null;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                    outputStream = null;
                }
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://www.googleapis.com/upload/drive/v3/files?uploadType=multipart").openConnection());
                    AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) uRLConnection;
                    try {
                        httpsURLConnection2.setDoInput(true);
                        httpsURLConnection2.setDoOutput(true);
                        httpsURLConnection2.setUseCaches(false);
                        int m107385a = AbstractC20626a.m107385a(3);
                        httpsURLConnection2.setConnectTimeout(m107385a);
                        httpsURLConnection2.setReadTimeout(m107385a);
                        httpsURLConnection2.setRequestMethod("POST");
                        httpsURLConnection2.setRequestProperty("Connection", "Keep-Alive");
                        httpsURLConnection2.setRequestProperty("Authorization", "Bearer " + m150123g());
                        httpsURLConnection2.setRequestProperty("Content-Type", "multipart/related; boundary=zalo_upload_media");
                        outputStream = httpsURLConnection2.getOutputStream();
                        try {
                            dataOutputStream = new DataOutputStream(outputStream);
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("\r\n");
                                sb2.append("--");
                                sb2.append("zalo_upload_media");
                                sb2.append("\r\n");
                                sb2.append("Content-Type: application/json; charset=UTF-8");
                                sb2.append("\r\n");
                                sb2.append("\r\n");
                                sb2.append(this.f14362e.m142273m());
                                sb2.append("\r\n");
                                sb2.append("\r\n");
                                sb2.append("--");
                                sb2.append("zalo_upload_media");
                                sb2.append("\r\n");
                                sb2.append("Content-Type: image/*");
                                sb2.append("\r\n");
                                sb2.append("\r\n");
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Metadata = ");
                                sb3.append((Object) sb2);
                                dataOutputStream.writeBytes(sb2.toString());
                                m116584g = AbstractC22543l.m116584g(fileInputStream.available(), 8192);
                                byte[] bArr = new byte[m116584g];
                                int read = fileInputStream.read(bArr, 0, m116584g);
                                while (read > 0) {
                                    dataOutputStream.write(bArr, 0, m116584g);
                                    m116584g = AbstractC22543l.m116584g(fileInputStream.available(), 8192);
                                    read = fileInputStream.read(bArr, 0, m116584g);
                                }
                                dataOutputStream.writeBytes("\r\n");
                                dataOutputStream.writeBytes("--zalo_upload_media--");
                                dataOutputStream.writeBytes("\r\n");
                                int responseCode = httpsURLConnection2.getResponseCode();
                                String m142269i = this.f14362e.m142269i();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Upload file to Google Drive");
                                sb4.append(m142269i);
                                sb4.append(". Response Code: ");
                                sb4.append(responseCode);
                                if (responseCode == 200) {
                                    try {
                                        inputStream = httpsURLConnection2.getInputStream();
                                        try {
                                            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                                        } catch (IOException e12) {
                                            e = e12;
                                            bufferedReader = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bufferedReader = null;
                                        }
                                    } catch (IOException e13) {
                                        e = e13;
                                        bufferedReader = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bufferedReader = null;
                                    }
                                    try {
                                        try {
                                            StringBuilder sb5 = new StringBuilder();
                                            String str = null;
                                            while (true) {
                                                String readLine = bufferedReader.readLine();
                                                if (readLine != null) {
                                                    str = readLine;
                                                } else {
                                                    readLine = null;
                                                }
                                                if (readLine == null) {
                                                    break;
                                                } else {
                                                    sb5.append(str);
                                                }
                                            }
                                            AbstractC20110a.f98889a.mo104548a(sb5.toString(), new Object[0]);
                                            try {
                                                C7959d m41850e = C7959d.Companion.m41850e();
                                                String sb6 = sb5.toString();
                                                AbstractC19074t.m100207e(sb6, "toString(...)");
                                                m41850e.m41752T1(sb6, this.f14362e);
                                            } catch (Exception e14) {
                                                AbstractC20110a.f98889a.mo104552e(e14);
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e15) {
                                                    AbstractC20110a.f98889a.mo104552e(e15);
                                                }
                                            }
                                        } catch (IOException e16) {
                                            e = e16;
                                            inputStream2 = inputStream;
                                            try {
                                                AbstractC20110a.f98889a.mo104552e(e);
                                                if (inputStream2 != null) {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (IOException e17) {
                                                        AbstractC20110a.f98889a.mo104552e(e17);
                                                    }
                                                }
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e18) {
                                                        e = e18;
                                                        aVar = AbstractC20110a.f98889a;
                                                        aVar.mo104552e(e);
                                                        httpsURLConnection2.disconnect();
                                                        fileInputStream.close();
                                                        dataOutputStream.flush();
                                                        dataOutputStream.close();
                                                        if (outputStream != null) {
                                                        }
                                                        if (outputStream == null) {
                                                        }
                                                    }
                                                }
                                                httpsURLConnection2.disconnect();
                                                fileInputStream.close();
                                                dataOutputStream.flush();
                                                dataOutputStream.close();
                                                if (outputStream != null) {
                                                }
                                                if (outputStream == null) {
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                if (inputStream2 != null) {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (IOException e19) {
                                                        AbstractC20110a.f98889a.mo104552e(e19);
                                                    }
                                                }
                                                if (bufferedReader == null) {
                                                    try {
                                                        bufferedReader.close();
                                                        throw th;
                                                    } catch (IOException e21) {
                                                        AbstractC20110a.f98889a.mo104552e(e21);
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e22) {
                                            e = e22;
                                            aVar = AbstractC20110a.f98889a;
                                            aVar.mo104552e(e);
                                            httpsURLConnection2.disconnect();
                                            fileInputStream.close();
                                            dataOutputStream.flush();
                                            dataOutputStream.close();
                                            if (outputStream != null) {
                                            }
                                            if (outputStream == null) {
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        inputStream2 = inputStream;
                                        if (inputStream2 != null) {
                                        }
                                        if (bufferedReader == null) {
                                        }
                                    }
                                } else {
                                    C27225c.m139331f("SMLDriveUploadTask", 4, responseCode, httpsURLConnection2);
                                }
                                httpsURLConnection2.disconnect();
                                fileInputStream.close();
                                dataOutputStream.flush();
                                dataOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.flush();
                                }
                                if (outputStream == null) {
                                    outputStream.close();
                                }
                            } catch (Exception e23) {
                                e = e23;
                                httpsURLConnection = httpsURLConnection2;
                                dataOutputStream = dataOutputStream;
                                try {
                                    C27225c.m139330e("SMLDriveUploadTask", 4, e);
                                    if (httpsURLConnection != null) {
                                    }
                                    if (fileInputStream != null) {
                                    }
                                    if (dataOutputStream != 0) {
                                    }
                                    if (dataOutputStream != 0) {
                                    }
                                    if (outputStream != null) {
                                    }
                                    if (outputStream == null) {
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (httpsURLConnection != null) {
                                        try {
                                            httpsURLConnection.disconnect();
                                        } catch (Exception e24) {
                                            AbstractC20110a.f98889a.mo104552e(e24);
                                            throw th;
                                        }
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    if (dataOutputStream != 0) {
                                        dataOutputStream.flush();
                                    }
                                    if (dataOutputStream != 0) {
                                        dataOutputStream.close();
                                    }
                                    if (outputStream != null) {
                                        outputStream.flush();
                                    }
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                httpsURLConnection = httpsURLConnection2;
                                if (httpsURLConnection != null) {
                                }
                                if (fileInputStream != null) {
                                }
                                if (dataOutputStream != 0) {
                                }
                                if (dataOutputStream != 0) {
                                }
                                if (outputStream != null) {
                                }
                                if (outputStream != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e25) {
                            e = e25;
                            dataOutputStream = 0;
                        } catch (Throwable th9) {
                            th = th9;
                            dataOutputStream = 0;
                        }
                    } catch (Exception e26) {
                        e = e26;
                        outputStream = null;
                        dataOutputStream = 0;
                    } catch (Throwable th10) {
                        th = th10;
                        outputStream = null;
                        dataOutputStream = 0;
                    }
                } catch (Exception e27) {
                    e = e27;
                    outputStream = null;
                    dataOutputStream = outputStream;
                    C27225c.m139330e("SMLDriveUploadTask", 4, e);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (dataOutputStream != 0) {
                        dataOutputStream.flush();
                    }
                    if (dataOutputStream != 0) {
                        dataOutputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.flush();
                    }
                    if (outputStream == null) {
                        outputStream.close();
                    }
                } catch (Throwable th11) {
                    th = th11;
                    outputStream = null;
                    dataOutputStream = outputStream;
                    if (httpsURLConnection != null) {
                    }
                    if (fileInputStream != null) {
                    }
                    if (dataOutputStream != 0) {
                    }
                    if (dataOutputStream != 0) {
                    }
                    if (outputStream != null) {
                    }
                    if (outputStream != null) {
                    }
                    throw th;
                }
            } catch (Exception e28) {
                AbstractC20110a.f98889a.mo104552e(e28);
            }
        } else {
            throw new BackupRestoreMediaException(4, 2007, "[Upload] Interrupt process (current user is logout or changed)");
        }
    }

    @Override // p677yc.AbstractC30897a
    /* renamed from: e */
    public String mo1206e() {
        return this.f14362e.mo142271k();
    }

    @Override // p677yc.AbstractC30897a
    /* renamed from: f */
    public String mo1207f() {
        return "DriveUploadTask";
    }
}
