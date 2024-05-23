package p543uc;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import me0.C23055e5;

/* renamed from: uc.f */
/* loaded from: classes3.dex */
public final class C27228f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f127990a;

    /* renamed from: b */
    private List f127991b;

    /* renamed from: uc.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C27228f(String str, List list) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(list, "listDriveIdDelete");
        this.f127990a = str;
        this.f127991b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0175 A[Catch: Exception -> 0x0186, TryCatch #6 {Exception -> 0x0186, blocks: (B:64:0x0170, B:57:0x0175, B:59:0x017d), top: B:63:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d A[Catch: Exception -> 0x0186, TRY_LEAVE, TryCatch #6 {Exception -> 0x0186, blocks: (B:64:0x0170, B:57:0x0175, B:59:0x017d), top: B:63:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m139339a() {
        OutputStream outputStream;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection;
        int responseCode;
        if (this.f127991b.isEmpty()) {
            return false;
        }
        HttpURLConnection httpURLConnection2 = null;
        if (C23055e5.m118273h(false, 1, null)) {
            try {
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://www.googleapis.com/batch/drive/v3").openConnection());
                    AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    httpURLConnection = (HttpURLConnection) uRLConnection;
                    try {
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                        httpURLConnection.setRequestProperty("Content-Type", "multipart/mixed; boundary=zalo_upload_media");
                        httpURLConnection.setRequestProperty("Authorization", "Bearer " + this.f127990a);
                        httpURLConnection.setConnectTimeout(60000);
                        httpURLConnection.setReadTimeout(60000);
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            dataOutputStream = new DataOutputStream(outputStream);
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("\r\n");
                                int size = this.f127991b.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    String str = (String) this.f127991b.get(i11);
                                    sb2.append("--");
                                    sb2.append("zalo_upload_media");
                                    sb2.append("\r\n");
                                    sb2.append("Content-Type: application/http");
                                    sb2.append("\r\n");
                                    sb2.append("content-id: ");
                                    i11++;
                                    sb2.append(i11);
                                    sb2.append("\r\n");
                                    sb2.append("content-transfer-encoding: binary");
                                    sb2.append("\r\n");
                                    sb2.append("\r\n");
                                    sb2.append("DELETE ");
                                    sb2.append("https://www.googleapis.com/drive/v3/files");
                                    sb2.append("/");
                                    sb2.append(str);
                                    sb2.append("\r\n");
                                    sb2.append("Authorization: ");
                                    sb2.append("Bearer ");
                                    sb2.append(this.f127990a);
                                    sb2.append("\r\n");
                                }
                                sb2.append("--");
                                sb2.append("zalo_upload_media");
                                sb2.append("--");
                                sb2.append("\r\n");
                                dataOutputStream.writeBytes(sb2.toString());
                                dataOutputStream.flush();
                                responseCode = httpURLConnection.getResponseCode();
                            } catch (Exception e11) {
                                e = e11;
                                httpURLConnection2 = httpURLConnection;
                                try {
                                    C27225c.m139330e("SMLMultDriveFileDel", 6, e);
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    if (outputStream != null) {
                                        outputStream.flush();
                                        outputStream.close();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.flush();
                                        AbstractC19074t.m100205c(outputStream);
                                        outputStream.close();
                                    }
                                    return false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (httpURLConnection2 != null) {
                                        try {
                                            httpURLConnection2.disconnect();
                                        } catch (Exception unused) {
                                            throw th;
                                        }
                                    }
                                    if (outputStream != null) {
                                        outputStream.flush();
                                        outputStream.close();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.flush();
                                        AbstractC19074t.m100205c(outputStream);
                                        outputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                httpURLConnection2 = httpURLConnection;
                                if (httpURLConnection2 != null) {
                                }
                                if (outputStream != null) {
                                }
                                if (dataOutputStream != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            dataOutputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            dataOutputStream = null;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        outputStream = null;
                        dataOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        outputStream = null;
                        dataOutputStream = null;
                    }
                } catch (Exception e14) {
                    e = e14;
                    outputStream = null;
                    dataOutputStream = null;
                } catch (Throwable th6) {
                    th = th6;
                    outputStream = null;
                    dataOutputStream = null;
                }
            } catch (Exception unused2) {
            }
            if (responseCode != 200 && responseCode != 204) {
                C27225c.m139331f("SMLMultDriveFileDel", 6, responseCode, httpURLConnection);
                httpURLConnection.disconnect();
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
                dataOutputStream.flush();
                AbstractC19074t.m100205c(outputStream);
                outputStream.close();
                return false;
            }
            try {
                httpURLConnection.disconnect();
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
                dataOutputStream.flush();
                AbstractC19074t.m100205c(outputStream);
                outputStream.close();
            } catch (Exception unused3) {
            }
            return true;
        }
        throw new BackupRestoreMediaException(6, 2006, "[SMLMultDriveFileDel] Network not available!");
    }
}
