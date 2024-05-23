package mg0;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zalocloud.backupkey.DriveKeyPayload;
import com.zing.zalo.zalocloud.backupkey.SecureOption;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import im0.AbstractC20626a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONObject;
import p484ri.C25804a;
import p543uc.C27224b;
import p605wc.C28911c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: mg0.e */
/* loaded from: classes7.dex */
public final class C23293e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C28911c f113061a;

    /* renamed from: b */
    private final C25804a f113062b;

    /* renamed from: mg0.e$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: mg0.e$b */
    /* loaded from: classes7.dex */
    public static abstract class b {

        /* renamed from: mg0.e$b$a */
        /* loaded from: classes7.dex */
        public static final class a extends b {

            /* renamed from: a */
            private final EnumC23289a f113063a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnumC23289a enumC23289a) {
                super(null);
                AbstractC19074t.m100208f(enumC23289a, "errorType");
                this.f113063a = enumC23289a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f113063a == ((a) obj).f113063a;
            }

            public int hashCode() {
                return this.f113063a.hashCode();
            }

            public String toString() {
                return "Error(errorType=" + this.f113063a + ")";
            }

            public /* synthetic */ a(EnumC23289a enumC23289a, int i11, AbstractC19060k abstractC19060k) {
                this((i11 & 1) != 0 ? EnumC23289a.f113041r : enumC23289a);
            }
        }

        /* renamed from: mg0.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32898b extends b {

            /* renamed from: a */
            private final SecureOption f113064a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32898b(SecureOption secureOption) {
                super(null);
                AbstractC19074t.m100208f(secureOption, "secureOption");
                this.f113064a = secureOption;
            }

            /* renamed from: a */
            public final SecureOption m120418a() {
                return this.f113064a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32898b) && AbstractC19074t.m100204b(this.f113064a, ((C32898b) obj).f113064a);
            }

            public int hashCode() {
                return this.f113064a.hashCode();
            }

            public String toString() {
                return "Success(secureOption=" + this.f113064a + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: mg0.e$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113065t;

        /* renamed from: v */
        final /* synthetic */ String f113067v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation continuation) {
            super(2, continuation);
            this.f113067v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f113067v, continuation);
        }

        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0094: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:149), block:B:51:0x0094 */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            HttpURLConnection httpURLConnection;
            HttpURLConnection httpURLConnection2;
            AbstractC28298d.m142578e();
            if (this.f113065t == 0) {
                AbstractC24862s.m129228b(obj);
                int i11 = 1;
                HttpURLConnection httpURLConnection3 = null;
                byte b11 = 0;
                byte b12 = 0;
                byte b13 = 0;
                byte b14 = 0;
                byte b15 = 0;
                byte b16 = 0;
                byte b17 = 0;
                byte b18 = 0;
                byte b19 = 0;
                byte b21 = 0;
                try {
                    try {
                        URL url = new URL(C23293e.this.m120414g(this.f113067v));
                        C28911c.c m120415h = C23293e.this.m120415h();
                        if (m120415h != null && m120415h.m144425c() == 0) {
                            String m144424b = m120415h.m144424b();
                            int m107385a = AbstractC20626a.m107385a(3);
                            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                            AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            httpURLConnection = (HttpURLConnection) uRLConnection;
                            try {
                                httpURLConnection.setDoInput(true);
                                httpURLConnection.setConnectTimeout(m107385a);
                                httpURLConnection.setReadTimeout(40000);
                                httpURLConnection.setRequestMethod("GET");
                                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                                httpURLConnection.setRequestProperty("Authorization", "Bearer " + m144424b);
                                if (httpURLConnection.getResponseCode() == 200) {
                                    Scanner scanner = new Scanner(httpURLConnection.getInputStream());
                                    StringBuilder sb2 = new StringBuilder();
                                    while (scanner.hasNextLine()) {
                                        sb2.append(scanner.nextLine());
                                    }
                                    scanner.close();
                                    String sb3 = sb2.toString();
                                    AbstractC19074t.m100207e(sb3, "toString(...)");
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("jsonResponse = ");
                                    sb4.append(sb3);
                                    String m120412e = C23293e.this.m120412e(sb3, this.f113067v);
                                    if (m120412e != null) {
                                        DriveKeyPayload m120413f = C23293e.this.m120413f(m120412e, m144424b, "appProperties");
                                        if (m120413f == null) {
                                            m120413f = C23293e.this.m120413f(m120412e, m144424b, "properties");
                                        }
                                        if (m120413f == null) {
                                            b.a aVar = new b.a(b18 == true ? 1 : 0, i11, b17 == true ? 1 : 0);
                                            httpURLConnection.disconnect();
                                            return aVar;
                                        }
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append("result = ");
                                        sb5.append(m120413f);
                                        if (!AbstractC19074t.m100204b(m120413f.m89738b(), CoreUtility.f89233i)) {
                                            b.a aVar2 = new b.a(b16 == true ? 1 : 0, i11, b15 == true ? 1 : 0);
                                            httpURLConnection.disconnect();
                                            return aVar2;
                                        }
                                        b.C32898b c32898b = new b.C32898b(m120413f.m89737a());
                                        httpURLConnection.disconnect();
                                        return c32898b;
                                    }
                                    b.a aVar3 = new b.a(b21 == true ? 1 : 0, i11, b19 == true ? 1 : 0);
                                    httpURLConnection.disconnect();
                                    return aVar3;
                                }
                                b.a aVar4 = new b.a(b14 == true ? 1 : 0, i11, b13 == true ? 1 : 0);
                                httpURLConnection.disconnect();
                                return aVar4;
                            } catch (Exception e11) {
                                e = e11;
                                e.getMessage();
                                b.a aVar5 = new b.a(b12 == true ? 1 : 0, i11, b11 == true ? 1 : 0);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return aVar5;
                            }
                        }
                        return new b.a(EnumC23289a.f113040q);
                    } catch (Exception e12) {
                        e = e12;
                        httpURLConnection = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (httpURLConnection3 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection3 = httpURLConnection2;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C23293e(C28911c c28911c, C25804a c25804a) {
        AbstractC19074t.m100208f(c28911c, "refreshGoogleAuthToken");
        AbstractC19074t.m100208f(c25804a, "backupRestoreMediaRepository");
        this.f113061a = c28911c;
        this.f113062b = c25804a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final String m120412e(String str, String str2) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("files");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            if (AbstractC19074t.m100204b(jSONObject.optString("name"), str2)) {
                return jSONObject.optString("id");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final DriveKeyPayload m120413f(String str, String str2, String str3) {
        String str4 = "";
        try {
            String m120416j = m120416j(str, str2, str3);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("response = ");
            sb2.append(m120416j);
            JSONObject optJSONObject = new JSONObject(m120416j).optJSONObject(str3);
            if (optJSONObject == null) {
                return null;
            }
            String optString = optJSONObject.optString("user_id", "");
            if (optString == null) {
                optString = "";
            }
            String optString2 = optJSONObject.optString("key");
            if (optString2 == null) {
                optString2 = "";
            }
            JSONObject jSONObject = new JSONObject(optString2);
            String optString3 = jSONObject.optString("value");
            if (optString3 != null) {
                str4 = optString3;
            }
            int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            C26676b.m136957g("SMLRestoreKeyFromDriveZCloudUseCase", "getDriveKeyPayload: userId = " + optString + ", deviceModel = " + optJSONObject.optString("device_model") + ", info = " + optJSONObject.optString("info"), null, 4, null);
            return new DriveKeyPayload(optString, new SecureOption(optInt, str4));
        } catch (Exception e11) {
            C26676b.m136954d("SMLRestoreKeyFromDriveZCloudUseCase", e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final String m120414g(String str) {
        return "https://www.googleapis.com/drive/v3/files?spaces=" + C27224b.f127988a.m139322b() + "&q=name='" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final C28911c.c m120415h() {
        return (C28911c.c) this.f113061a.m101509a(new C28911c.b(C25804a.m132980m(this.f113062b, false, 1, null), this.f113062b.m132996n(), this.f113062b.m132993i(), true));
    }

    /* renamed from: j */
    private final String m120416j(String str, String str2, String str3) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(("https://www.googleapis.com/drive/v3/files/" + str) + "?fields=" + str3).openConnection());
        AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("Authorization", "Bearer " + str2);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb2 = new StringBuilder();
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                sb2.append(readLine);
            }
            bufferedReader.close();
            inputStream.close();
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            return sb3;
        }
        throw new IOException("HTTP request failed with response code: " + responseCode);
    }

    /* renamed from: i */
    public final Object m120417i(String str, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new c(str, null), continuation);
    }
}
