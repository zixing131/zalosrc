package p096d9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p015a9.InterfaceC0662b;
import p096d9.AbstractC17837d;
import p096d9.AbstractC17839f;
import p229i5.AbstractC20280a;
import p229i5.AbstractC20290k;
import p342m6.AbstractC22894m;
import p673y8.InterfaceC30821i;

/* renamed from: d9.c */
/* loaded from: classes.dex */
public class C17836c {

    /* renamed from: d */
    private static final Pattern f90119d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f90120e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f90121a;

    /* renamed from: b */
    private final InterfaceC0662b f90122b;

    /* renamed from: c */
    private final C17838e f90123c = new C17838e();

    public C17836c(Context context, InterfaceC0662b interfaceC0662b) {
        this.f90121a = context;
        this.f90122b = interfaceC0662b;
    }

    /* renamed from: a */
    private static String m94088a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m94089b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.3");
            return jSONObject;
        } catch (JSONException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* renamed from: c */
    private static JSONObject m94090c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* renamed from: f */
    private String m94091f() {
        try {
            Context context = this.f90121a;
            byte[] m105897a = AbstractC20280a.m105897a(context, context.getPackageName());
            if (m105897a == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not get fingerprint hash for package: ");
                sb2.append(this.f90121a.getPackageName());
                return null;
            }
            return AbstractC20290k.m105937b(m105897a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No such package: ");
            sb3.append(this.f90121a.getPackageName());
            return null;
        }
    }

    /* renamed from: g */
    private URL m94092g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e11) {
            throw new FirebaseInstallationsException(e11.getMessage(), FirebaseInstallationsException.EnumC6581a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m94093h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m94094i(int i11) {
        return i11 >= 200 && i11 < 300;
    }

    /* renamed from: j */
    private static void m94095j() {
    }

    /* renamed from: k */
    private static void m94096k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(m94100o(httpURLConnection))) {
            m94088a(str, str2, str3);
        }
    }

    /* renamed from: l */
    private HttpURLConnection m94097l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f90121a.getPackageName());
            InterfaceC30821i interfaceC30821i = (InterfaceC30821i) this.f90122b.get();
            if (interfaceC30821i != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) AbstractC22894m.m117599a(interfaceC30821i.mo149903a()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m94091f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6581a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m94098m(String str) {
        AbstractC4205o.m19713b(f90119d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    /* renamed from: n */
    private AbstractC17837d m94099n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f90120e));
        AbstractC17839f.a m94114a = AbstractC17839f.m94114a();
        AbstractC17837d.a m94107a = AbstractC17837d.m94107a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m94107a.mo94080f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m94107a.mo94077c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m94107a.mo94078d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m94114a.mo94086c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m94114a.mo94087d(m94098m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m94107a.mo94076b(m94114a.mo94084a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m94107a.mo94079e(AbstractC17837d.b.OK).mo94075a();
    }

    /* renamed from: o */
    private static String m94100o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f90120e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th2;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    /* renamed from: p */
    private AbstractC17839f m94101p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f90120e));
        AbstractC17839f.a m94114a = AbstractC17839f.m94114a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m94114a.mo94086c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m94114a.mo94087d(m94098m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m94114a.mo94085b(AbstractC17839f.b.OK).mo94084a();
    }

    /* renamed from: q */
    private void m94102q(HttpURLConnection httpURLConnection, String str, String str2) {
        m94104s(httpURLConnection, m94093h(m94089b(str, str2)));
    }

    /* renamed from: r */
    private void m94103r(HttpURLConnection httpURLConnection) {
        m94104s(httpURLConnection, m94093h(m94090c()));
    }

    /* renamed from: s */
    private static void m94104s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* renamed from: d */
    public AbstractC17837d m94105d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC17837d m94099n;
        if (this.f90123c.m94112b()) {
            URL m94092g = m94092g(String.format("projects/%s/installations", str3));
            for (int i11 = 0; i11 <= 1; i11++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection m94097l = m94097l(m94092g, str);
                try {
                    try {
                        m94097l.setRequestMethod("POST");
                        m94097l.setDoOutput(true);
                        if (str5 != null) {
                            m94097l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                        }
                        m94102q(m94097l, str2, str4);
                        responseCode = m94097l.getResponseCode();
                        this.f90123c.m94113f(responseCode);
                    } catch (Throwable th2) {
                        m94097l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        throw th2;
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (m94094i(responseCode)) {
                    m94099n = m94099n(m94097l);
                } else {
                    m94096k(m94097l, str4, str, str3);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            m94095j();
                            m94099n = AbstractC17837d.m94107a().mo94079e(AbstractC17837d.b.BAD_CONFIG).mo94075a();
                        }
                        m94097l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC6581a.TOO_MANY_REQUESTS);
                    }
                }
                m94097l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m94099n;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6581a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6581a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC17839f m94106e(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC17839f m94101p;
        if (this.f90123c.m94112b()) {
            URL m94092g = m94092g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i11 = 0; i11 <= 1; i11++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection m94097l = m94097l(m94092g, str);
                try {
                    try {
                        m94097l.setRequestMethod("POST");
                        m94097l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        m94097l.setDoOutput(true);
                        m94103r(m94097l);
                        responseCode = m94097l.getResponseCode();
                        this.f90123c.m94113f(responseCode);
                    } catch (IOException | AssertionError unused) {
                    }
                    if (m94094i(responseCode)) {
                        m94101p = m94101p(m94097l);
                    } else {
                        m94096k(m94097l, null, str, str3);
                        if (responseCode != 401 && responseCode != 404) {
                            if (responseCode != 429) {
                                if (responseCode < 500 || responseCode >= 600) {
                                    m94095j();
                                    m94101p = AbstractC17839f.m94114a().mo94085b(AbstractC17839f.b.BAD_CONFIG).mo94084a();
                                }
                            } else {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC6581a.TOO_MANY_REQUESTS);
                            }
                        } else {
                            m94101p = AbstractC17839f.m94114a().mo94085b(AbstractC17839f.b.AUTH_ERROR).mo94084a();
                        }
                    }
                    return m94101p;
                } finally {
                    m94097l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6581a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6581a.UNAVAILABLE);
    }
}
