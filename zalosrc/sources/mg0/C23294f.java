package mg0;

import android.os.Build;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zalocloud.backupkey.DriveKeyPayload;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import hu.AbstractC20130d;
import im0.AbstractC20626a;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mg0.C23292d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p484ri.C25804a;
import p543uc.C27223a;
import p543uc.C27224b;
import p605wc.C28911c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: mg0.f */
/* loaded from: classes7.dex */
public final class C23294f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C28911c f113068a;

    /* renamed from: b */
    private final C25804a f113069b;

    /* renamed from: c */
    private final String f113070c;

    /* renamed from: mg0.f$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: mg0.f$b */
    /* loaded from: classes7.dex */
    public static abstract class b {

        /* renamed from: mg0.f$b$a */
        /* loaded from: classes7.dex */
        public static final class a extends b {

            /* renamed from: a */
            private final EnumC23289a f113071a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnumC23289a enumC23289a) {
                super(null);
                AbstractC19074t.m100208f(enumC23289a, "errorType");
                this.f113071a = enumC23289a;
            }

            /* renamed from: a */
            public final EnumC23289a m120431a() {
                return this.f113071a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f113071a == ((a) obj).f113071a;
            }

            public int hashCode() {
                return this.f113071a.hashCode();
            }

            public String toString() {
                return "Error(errorType=" + this.f113071a + ")";
            }

            public /* synthetic */ a(EnumC23289a enumC23289a, int i11, AbstractC19060k abstractC19060k) {
                this((i11 & 1) != 0 ? EnumC23289a.f113041r : enumC23289a);
            }
        }

        /* renamed from: mg0.f$b$b */
        /* loaded from: classes7.dex */
        public static final class C32899b extends b {

            /* renamed from: a */
            public static final C32899b f113072a = new C32899b();

            private C32899b() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mg0.f$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f113073t;

        /* renamed from: u */
        Object f113074u;

        /* renamed from: v */
        int f113075v;

        /* renamed from: w */
        final /* synthetic */ String f113076w;

        /* renamed from: x */
        final /* synthetic */ C23294f f113077x;

        /* renamed from: y */
        final /* synthetic */ DriveKeyPayload f113078y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, C23294f c23294f, DriveKeyPayload driveKeyPayload, Continuation continuation) {
            super(2, continuation);
            this.f113076w = str;
            this.f113077x = c23294f;
            this.f113078y = driveKeyPayload;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f113076w, this.f113077x, this.f113078y, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x015f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0160 A[PHI: r11
  0x0160: PHI (r11v22 java.lang.Object) = (r11v14 java.lang.Object), (r11v0 java.lang.Object) binds: [B:23:0x015d, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0134 -> B:11:0x013a). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            c cVar;
            Iterator it;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f113075v;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it2 = (Iterator) this.f113074u;
                String str2 = (String) this.f113073t;
                AbstractC24862s.m129228b(obj);
                String str3 = str2;
                Iterator it3 = it2;
                Object obj2 = m142578e;
                c cVar2 = this;
                if (!(((C23292d.a) obj) instanceof C23292d.a.C32897a)) {
                    return new b.a(null, 1, null);
                }
                cVar = cVar2;
                m142578e = obj2;
                it = it3;
                str = str3;
                if (it.hasNext()) {
                    String str4 = (String) it.next();
                    C23292d c23292d = new C23292d();
                    cVar.f113073t = str;
                    cVar.f113074u = it;
                    cVar.f113075v = 1;
                    Object m120406a = c23292d.m120406a(str, str4, cVar);
                    if (m120406a == m142578e) {
                        return m142578e;
                    }
                    Object obj3 = m142578e;
                    cVar2 = cVar;
                    obj = m120406a;
                    str3 = str;
                    it3 = it;
                    obj2 = obj3;
                    if (!(((C23292d.a) obj) instanceof C23292d.a.C32897a)) {
                    }
                }
                C23294f c23294f = cVar.f113077x;
                DriveKeyPayload driveKeyPayload = cVar.f113078y;
                String str5 = cVar.f113076w;
                cVar.f113073t = null;
                cVar.f113074u = null;
                cVar.f113075v = 2;
                obj = c23294f.m120429k(str, driveKeyPayload, str5, cVar);
                if (obj == m142578e) {
                    return m142578e;
                }
                return obj;
            }
            AbstractC24862s.m129228b(obj);
            URL url = new URL("https://www.googleapis.com/drive/v3/files?" + ("spaces=" + C27224b.f127988a.m139322b() + "&q=name='" + this.f113076w + "'"));
            C28911c.c m120428i = this.f113077x.m120428i();
            if (m120428i != null && m120428i.m144425c() == 0) {
                String m144424b = m120428i.m144424b();
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                int m107385a = AbstractC20626a.m107385a(3);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(m107385a);
                httpURLConnection.setReadTimeout(40000);
                httpURLConnection.setRequestProperty("Authorization", "Bearer " + m144424b);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                C19059j0 c19059j0 = new C19059j0();
                c19059j0.f94941p = "";
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        c19059j0.f94941p = readLine;
                    } else {
                        readLine = null;
                    }
                    if (readLine == null) {
                        break;
                    }
                    sb2.append((String) c19059j0.f94941p);
                }
                bufferedReader.close();
                httpURLConnection.disconnect();
                String sb3 = sb2.toString();
                AbstractC19074t.m100207e(sb3, "toString(...)");
                List m120425f = this.f113077x.m120425f(sb3, this.f113076w);
                if (!m120425f.isEmpty()) {
                    it = m120425f.iterator();
                    str = m144424b;
                    cVar = this;
                    if (it.hasNext()) {
                    }
                    C23294f c23294f2 = cVar.f113077x;
                    DriveKeyPayload driveKeyPayload2 = cVar.f113078y;
                    String str52 = cVar.f113076w;
                    cVar.f113073t = null;
                    cVar.f113074u = null;
                    cVar.f113075v = 2;
                    obj = c23294f2.m120429k(str, driveKeyPayload2, str52, cVar);
                    if (obj == m142578e) {
                    }
                } else {
                    str = m144424b;
                    cVar = this;
                    C23294f c23294f22 = cVar.f113077x;
                    DriveKeyPayload driveKeyPayload22 = cVar.f113078y;
                    String str522 = cVar.f113076w;
                    cVar.f113073t = null;
                    cVar.f113074u = null;
                    cVar.f113075v = 2;
                    obj = c23294f22.m120429k(str, driveKeyPayload22, str522, cVar);
                    if (obj == m142578e) {
                    }
                }
            } else {
                return new b.a(EnumC23289a.f113040q);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mg0.f$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113079t;

        /* renamed from: u */
        final /* synthetic */ String f113080u;

        /* renamed from: v */
        final /* synthetic */ String f113081v;

        /* renamed from: w */
        final /* synthetic */ C23294f f113082w;

        /* renamed from: x */
        final /* synthetic */ DriveKeyPayload f113083x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, C23294f c23294f, DriveKeyPayload driveKeyPayload, Continuation continuation) {
            super(2, continuation);
            this.f113080u = str;
            this.f113081v = str2;
            this.f113082w = c23294f;
            this.f113083x = driveKeyPayload;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f113080u, this.f113081v, this.f113082w, this.f113083x, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x011b: MOVE (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:284), block:B:121:0x011b */
        /* JADX WARN: Removed duplicated region for block: B:101:0x021b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01c3 A[Catch: all -> 0x011a, Exception -> 0x011e, TryCatch #7 {Exception -> 0x011e, blocks: (B:13:0x0087, B:17:0x010b, B:50:0x018d, B:38:0x0193, B:39:0x01b8, B:41:0x01c3, B:44:0x01cb, B:48:0x0197, B:84:0x01dc, B:77:0x01e4, B:82:0x01eb, B:81:0x01e8, B:69:0x01ad, B:64:0x01b5, B:91:0x01ec), top: B:12:0x0087 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01cb A[Catch: all -> 0x011a, Exception -> 0x011e, TRY_LEAVE, TryCatch #7 {Exception -> 0x011e, blocks: (B:13:0x0087, B:17:0x010b, B:50:0x018d, B:38:0x0193, B:39:0x01b8, B:41:0x01c3, B:44:0x01cb, B:48:0x0197, B:84:0x01dc, B:77:0x01e4, B:82:0x01eb, B:81:0x01e8, B:69:0x01ad, B:64:0x01b5, B:91:0x01ec), top: B:12:0x0087 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0216  */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v12, types: [java.io.OutputStream, java.io.DataOutputStream] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r7v7 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            File file;
            HttpsURLConnection httpsURLConnection;
            OutputStream outputStream;
            ?? r7;
            ?? r22;
            InputStream inputStream;
            BufferedReader bufferedReader;
            b.a aVar;
            InputStream errorStream;
            AbstractC28298d.m142578e();
            if (this.f113079t == 0) {
                AbstractC24862s.m129228b(obj);
                String str = "--";
                OutputStream outputStream2 = null;
                try {
                    try {
                        file = new File(AbstractC20130d.m104884n0(), this.f113080u);
                        file.createNewFile();
                        try {
                            URL url = new URL("https://www.googleapis.com/upload/drive/v3/files?uploadType=multipart");
                            int m107385a = AbstractC20626a.m107385a(3);
                            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                            AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                            httpsURLConnection = (HttpsURLConnection) uRLConnection;
                            try {
                                String str2 = this.f113081v;
                                httpsURLConnection.setConnectTimeout(m107385a);
                                httpsURLConnection.setReadTimeout(40000);
                                httpsURLConnection.setRequestMethod("POST");
                                httpsURLConnection.setRequestProperty("Authorization", "Bearer " + str2);
                                httpsURLConnection.setRequestProperty("Content-Type", "multipart/related; boundary=zcloud_backup_key");
                                httpsURLConnection.setDoOutput(true);
                                r7 = new DataOutputStream(httpsURLConnection.getOutputStream());
                            } catch (Exception e11) {
                                e = e11;
                                r7 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                if (file != null) {
                                    AbstractC29094b.m145339a(file.delete());
                                }
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            httpsURLConnection = null;
                            r7 = httpsURLConnection;
                            C26676b.m136954d("SMLUploadKeyToDriveZCloudUseCase", e);
                            if (r7 != 0) {
                            }
                            if (httpsURLConnection != null) {
                            }
                            if (file != null) {
                            }
                            return new b.a(null, 1, null);
                        } catch (Throwable th3) {
                            th = th3;
                            httpsURLConnection = null;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        file = null;
                        httpsURLConnection = null;
                    } catch (Throwable th4) {
                        th = th4;
                        file = null;
                        httpsURLConnection = null;
                    }
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        C23294f c23294f = this.f113082w;
                        DriveKeyPayload driveKeyPayload = this.f113083x;
                        String str3 = this.f113080u;
                        sb2.append("\r\n");
                        sb2.append("--");
                        sb2.append("zcloud_backup_key");
                        sb2.append("\r\n");
                        sb2.append("Content-Type: application/json; charset=UTF-8");
                        sb2.append("\r\n");
                        sb2.append("\r\n");
                        sb2.append(c23294f.m120427h(driveKeyPayload, str3));
                        sb2.append("\r\n");
                        sb2.append("\r\n");
                        sb2.append("--");
                        sb2.append("zcloud_backup_key");
                        sb2.append("\r\n");
                        sb2.append("Content-Type: " + c23294f.f113070c);
                        sb2.append("\r\n");
                        sb2.append("\r\n");
                        sb2.append("\r\n");
                        sb2.append("--zcloud_backup_key--");
                        sb2.append("\r\n");
                        r7.writeBytes(sb2.toString());
                        int responseCode = httpsURLConnection.getResponseCode();
                        if (responseCode != 200) {
                            ?? r12 = 403;
                            if (responseCode != 403) {
                                b.a aVar2 = new b.a(null, 1, null);
                                r7.close();
                                httpsURLConnection.disconnect();
                                file.delete();
                                return aVar2;
                            }
                            String str4 = "";
                            try {
                                try {
                                    errorStream = httpsURLConnection.getErrorStream();
                                    try {
                                        bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                    } catch (Exception e14) {
                                        e = e14;
                                        bufferedReader = null;
                                        inputStream = errorStream;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r22 = 0;
                                        r12 = errorStream;
                                        if (r12 != 0) {
                                            try {
                                                r12.close();
                                            } catch (IOException e15) {
                                                C26676b.m136954d("SMLUploadKeyToDriveZCloudUseCase", e15);
                                                throw th;
                                            }
                                        }
                                        if (r22 != 0) {
                                            r22.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    inputStream = null;
                                    bufferedReader = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r12 = 0;
                                    r22 = 0;
                                }
                                try {
                                    StringBuilder sb3 = new StringBuilder();
                                    C19059j0 c19059j0 = new C19059j0();
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine != null) {
                                            c19059j0.f94941p = readLine;
                                        } else {
                                            readLine = null;
                                        }
                                        if (readLine == null) {
                                            break;
                                        }
                                        sb3.append((String) c19059j0.f94941p);
                                    }
                                    String sb4 = sb3.toString();
                                    AbstractC19074t.m100207e(sb4, "toString(...)");
                                    if (sb4.length() > 0) {
                                        try {
                                            String string = new JSONObject(sb4).getJSONObject(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR).getJSONArray("errors").getJSONObject(0).getString("reason");
                                            AbstractC19074t.m100207e(string, "getString(...)");
                                            str4 = string;
                                        } catch (Exception e17) {
                                            C26676b.m136954d("SMLUploadKeyToDriveZCloudUseCase", e17);
                                        }
                                    }
                                    if (errorStream != null) {
                                        try {
                                            errorStream.close();
                                        } catch (IOException e18) {
                                            e = e18;
                                            C26676b.m136954d("SMLUploadKeyToDriveZCloudUseCase", e);
                                            if (C27223a.f127987a.m139319a(str4) != 40303) {
                                            }
                                            r7.close();
                                            httpsURLConnection.disconnect();
                                            file.delete();
                                            return aVar;
                                        }
                                    }
                                    bufferedReader.close();
                                } catch (Exception e19) {
                                    e = e19;
                                    inputStream = errorStream;
                                    C26676b.m136954d("SMLUploadKeyToDriveZCloudUseCase", e);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e21) {
                                            e = e21;
                                            C26676b.m136954d("SMLUploadKeyToDriveZCloudUseCase", e);
                                            if (C27223a.f127987a.m139319a(str4) != 40303) {
                                            }
                                            r7.close();
                                            httpsURLConnection.disconnect();
                                            file.delete();
                                            return aVar;
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (C27223a.f127987a.m139319a(str4) != 40303) {
                                    }
                                    r7.close();
                                    httpsURLConnection.disconnect();
                                    file.delete();
                                    return aVar;
                                }
                                if (C27223a.f127987a.m139319a(str4) != 40303) {
                                    aVar = new b.a(EnumC23289a.f113039p);
                                } else {
                                    aVar = new b.a(null, 1, null);
                                }
                                r7.close();
                                httpsURLConnection.disconnect();
                                file.delete();
                                return aVar;
                            } catch (Throwable th7) {
                                th = th7;
                                r22 = str;
                            }
                        } else {
                            b.C32899b c32899b = b.C32899b.f113072a;
                            r7.close();
                            httpsURLConnection.disconnect();
                            file.delete();
                            return c32899b;
                        }
                    } catch (Exception e22) {
                        e = e22;
                        C26676b.m136954d("SMLUploadKeyToDriveZCloudUseCase", e);
                        if (r7 != 0) {
                            r7.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        if (file != null) {
                            AbstractC29094b.m145339a(file.delete());
                        }
                        return new b.a(null, 1, null);
                    }
                } catch (Throwable th8) {
                    th = th8;
                    outputStream2 = outputStream;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C23294f(C28911c c28911c, C25804a c25804a) {
        AbstractC19074t.m100208f(c28911c, "refreshGoogleAuthToken");
        AbstractC19074t.m100208f(c25804a, "backupRestoreMediaRepository");
        this.f113068a = c28911c;
        this.f113069b = c25804a;
        this.f113070c = "text/plain";
    }

    /* renamed from: f */
    public final List m120425f(String str, String str2) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("files");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            if (AbstractC19074t.m100204b(jSONObject.optString("name"), str2)) {
                arrayList.add(jSONObject.optString("id"));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private final JSONObject m120426g(DriveKeyPayload driveKeyPayload) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", driveKeyPayload.m89738b());
        jSONObject.put("device_model", Build.MODEL);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("time", AbstractC23306f.m120579F1().mo124314i());
        jSONObject2.put("platform_type", 1);
        jSONObject2.put("version_app", CoreUtility.f89236l);
        C24848g0 c24848g0 = C24848g0.f119245a;
        jSONObject.put("info", jSONObject2.toString());
        C26676b.m136957g("SMLUploadKeyToDriveZCloudUseCase", "generateModel: " + jSONObject, null, 4, null);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, driveKeyPayload.m89737a().m89741b());
        jSONObject3.put("value", driveKeyPayload.m89737a().m89740a());
        jSONObject.put("key", jSONObject3.toString());
        return jSONObject;
    }

    /* renamed from: h */
    public final String m120427h(DriveKeyPayload driveKeyPayload, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(C27224b.f127988a.m139322b());
            jSONObject.put("parents", jSONArray);
            JSONObject m120426g = m120426g(driveKeyPayload);
            jSONObject.put("properties", new JSONObject());
            jSONObject.put("appProperties", m120426g);
            jSONObject.put("mimeType", this.f113070c);
        } catch (JSONException e11) {
            C26676b.m136954d("SMLUploadKeyToDriveZCloudUseCase", e11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Export param: ");
        sb2.append(jSONObject);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: i */
    public final C28911c.c m120428i() {
        return (C28911c.c) this.f113068a.m101509a(new C28911c.b(C25804a.m132980m(this.f113069b, false, 1, null), this.f113069b.m132996n(), this.f113069b.m132993i(), true));
    }

    /* renamed from: k */
    public final Object m120429k(String str, DriveKeyPayload driveKeyPayload, String str2, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new d(str2, str, this, driveKeyPayload, null), continuation);
    }

    /* renamed from: j */
    public final Object m120430j(DriveKeyPayload driveKeyPayload, String str, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new c(str, this, driveKeyPayload, null), continuation);
    }
}
