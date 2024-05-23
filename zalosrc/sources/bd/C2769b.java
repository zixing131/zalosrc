package bd;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.backuprestore.media.exception.DriveAuthException;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import me0.C23055e5;
import p320ld.C22447s;
import p543uc.C27224b;
import p543uc.C27225c;
import si.C26263i;
import vi.C28258d;

/* renamed from: bd.b */
/* loaded from: classes3.dex */
public final class C2769b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f10916a;

    /* renamed from: b */
    private final ArrayList f10917b;

    /* renamed from: c */
    private boolean f10918c;

    /* renamed from: bd.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C2769b(String str) {
        AbstractC19074t.m100208f(str, "token");
        this.f10917b = new ArrayList();
        this.f10916a = str;
    }

    /* renamed from: a */
    private final String m13307a(String str) {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://www.googleapis.com/drive/v3/files");
        sb2.append("?pageSize=");
        if (this.f10918c) {
            i11 = 1;
        } else {
            i11 = 1000;
        }
        sb2.append(i11);
        sb2.append("&");
        sb2.append("spaces=appDataFolder");
        sb2.append("&");
        sb2.append("q=");
        sb2.append(C27224b.f127988a.m139323c());
        if (!TextUtils.isEmpty(str)) {
            sb2.append("&");
            sb2.append("pageToken=");
            sb2.append(str);
        }
        sb2.append("&fields=nextPageToken,files(id,mimeType,properties,size,kind,name),incompleteSearch");
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m13308c(String str) {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        String str2;
        HttpURLConnection httpURLConnection = null;
        ArrayList arrayList = null;
        InputStreamReader inputStreamReader2 = null;
        httpURLConnection = null;
        if (C22447s.m116049n0()) {
            if (!C23055e5.m118270e()) {
                throw new BackupRestoreMediaException(2, ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4, "[SMLDriveGetListTask] No WIFI!");
            }
        } else if (!C23055e5.m118273h(false, 1, null)) {
            throw new BackupRestoreMediaException(2, 2006, "[SMLDriveGetListTask] Network not available!");
        }
        TrafficStats.setThreadStatsTag(1001);
        try {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(m13307a(str)).openConnection());
                AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnection;
                try {
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.setDoOutput(false);
                    httpURLConnection2.setRequestMethod("GET");
                    int m107385a = AbstractC20626a.m107385a(3);
                    httpURLConnection2.setConnectTimeout(m107385a);
                    httpURLConnection2.setReadTimeout(m107385a);
                    httpURLConnection2.setRequestProperty("Authorization", "Bearer " + this.f10916a);
                    int responseCode = httpURLConnection2.getResponseCode();
                    AbstractC20110a.f98889a.mo104548a("getListFileofPagewithToken responseCode: " + responseCode, new Object[0]);
                    if (responseCode == 200) {
                        inputStream = httpURLConnection2.getInputStream();
                        try {
                            inputStreamReader = new InputStreamReader(inputStream);
                        } catch (Exception e11) {
                            e = e11;
                            inputStreamReader = null;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStreamReader = null;
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
                            C28258d m142297a = C28258d.Companion.m142297a(stringBuffer2);
                            try {
                                httpURLConnection2.disconnect();
                                bufferedReader.close();
                            } catch (IOException e12) {
                                AbstractC20110a.f98889a.mo104552e(e12);
                            }
                            if (m142297a != null) {
                                arrayList = m142297a.m142295a();
                            }
                            if (arrayList != null) {
                                this.f10917b.addAll(m142297a.m142295a());
                                if (!this.f10918c && !TextUtils.isEmpty(m142297a.m142296b())) {
                                    if (!C26263i.m135055u().m135069I()) {
                                        m13308c(m142297a.m142296b());
                                    } else {
                                        throw new InterruptedException("Thread interrupt while getting list file from drive");
                                    }
                                } else if (this.f10918c) {
                                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                                    if (this.f10917b.size() > 0) {
                                        str2 = "YES";
                                    } else {
                                        str2 = "NO";
                                    }
                                    aVar.mo104548a("checkServer - server valid ? " + str2, new Object[0]);
                                } else {
                                    AbstractC20110a.f98889a.mo104548a("Number of file on Drive = (%d) files", Integer.valueOf(this.f10917b.size()));
                                }
                            }
                            inputStreamReader2 = inputStreamReader;
                        } catch (Exception e13) {
                            e = e13;
                            httpURLConnection = httpURLConnection2;
                            try {
                                C27225c.m139330e("SMLDriveGetListTask", 2, e);
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e14) {
                                        AbstractC20110a.f98889a.mo104552e(e14);
                                    }
                                }
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (Exception e15) {
                                        AbstractC20110a.f98889a.mo104552e(e15);
                                    }
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e16) {
                                        AbstractC20110a.f98889a.mo104552e(e16);
                                    }
                                }
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (Exception e17) {
                                        AbstractC20110a.f98889a.mo104552e(e17);
                                    }
                                }
                                if (inputStream == null) {
                                    try {
                                        inputStream.close();
                                        throw th;
                                    } catch (IOException e18) {
                                        AbstractC20110a.f98889a.mo104552e(e18);
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                            }
                            if (inputStreamReader != null) {
                            }
                            if (inputStream == null) {
                            }
                        }
                    } else {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (IOException e19) {
                            AbstractC20110a.f98889a.mo104552e(e19);
                        }
                        C27225c.m139331f("SMLDriveGetListTask", 2, responseCode, httpURLConnection2);
                        inputStream = null;
                    }
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception e21) {
                        AbstractC20110a.f98889a.mo104552e(e21);
                    }
                    if (inputStreamReader2 != null) {
                        try {
                            inputStreamReader2.close();
                        } catch (Exception e22) {
                            AbstractC20110a.f98889a.mo104552e(e22);
                        }
                    }
                } catch (Exception e23) {
                    e = e23;
                    inputStream = null;
                    inputStreamReader = null;
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                    inputStreamReader = null;
                }
            } catch (Exception e24) {
                e = e24;
                inputStream = null;
                inputStreamReader = null;
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
                inputStreamReader = null;
            }
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e25) {
            AbstractC20110a.f98889a.mo104552e(e25);
        }
    }

    /* renamed from: b */
    public ArrayList m13309b() {
        if (!TextUtils.isEmpty(this.f10916a)) {
            m13308c(null);
            return this.f10917b;
        }
        throw new DriveAuthException(2, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, "Get list Drive failed: invalid token");
    }

    public C2769b(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "token");
        this.f10917b = new ArrayList();
        this.f10916a = str;
        this.f10918c = z11;
    }
}
