package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.core.content.pm.AbstractC1393a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C6723g;
import com.google.firebase.remoteconfig.internal.C6729m;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p229i5.AbstractC20280a;
import p229i5.AbstractC20290k;

/* loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h */
    private static final Pattern f36951h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    private final Context f36952a;

    /* renamed from: b */
    private final String f36953b;

    /* renamed from: c */
    private final String f36954c;

    /* renamed from: d */
    private final String f36955d;

    /* renamed from: e */
    private final String f36956e;

    /* renamed from: f */
    private final long f36957f;

    /* renamed from: g */
    private final long f36958g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j11, long j12) {
        this.f36952a = context;
        this.f36953b = str;
        this.f36954c = str2;
        this.f36955d = m34343f(str);
        this.f36956e = str3;
        this.f36957f = j11;
        this.f36958g = j12;
    }

    /* renamed from: a */
    private boolean m34339a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: b */
    private String m34340b(long j11) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j11));
    }

    /* renamed from: c */
    private JSONObject m34341c(String str, String str2, Map map, Long l11) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f36953b);
            Locale locale = this.f36952a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i11 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i11));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f36952a.getPackageManager().getPackageInfo(this.f36952a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(AbstractC1393a.m7000a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f36952a.getPackageName());
            hashMap.put("sdkVersion", "21.3.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l11 != null) {
                hashMap.put("firstOpenTime", m34340b(l11.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    /* renamed from: e */
    private static C6723g m34342e(JSONObject jSONObject, Date date) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            C6723g.b m34391d = C6723g.m34381j().m34391d(date);
            String str = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                m34391d = m34391d.m34389b(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                m34391d = m34391d.m34390c(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                m34391d = m34391d.m34392e(jSONObject3);
            }
            if (jSONObject.has("templateVersion")) {
                str = jSONObject.getString("templateVersion");
            }
            if (str != null) {
                m34391d.m34393f(Long.parseLong(str));
            }
            return m34391d.m34388a();
        } catch (JSONException e11) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e11);
        }
    }

    /* renamed from: f */
    private static String m34343f(String str) {
        Matcher matcher = f36951h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: g */
    private JSONObject m34344g(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    /* renamed from: h */
    private String m34345h(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    /* renamed from: i */
    private String m34346i() {
        try {
            Context context = this.f36952a;
            byte[] m105897a = AbstractC20280a.m105897a(context, context.getPackageName());
            if (m105897a == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not get fingerprint hash for package: ");
                sb2.append(this.f36952a.getPackageName());
                return null;
            }
            return AbstractC20290k.m105937b(m105897a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No such package: ");
            sb3.append(this.f36952a.getPackageName());
            return null;
        }
    }

    /* renamed from: j */
    private void m34347j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f36954c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f36952a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m34346i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: k */
    private void m34348k(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: l */
    private void m34349l(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: m */
    private void m34350m(HttpURLConnection httpURLConnection, String str, String str2, Map map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f36957f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f36958g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        m34347j(httpURLConnection, str2);
        m34348k(httpURLConnection, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public HttpURLConnection m34351d() {
        try {
            return (HttpURLConnection) new URL(m34345h(this.f36955d, this.f36956e)).openConnection();
        } catch (IOException e11) {
            throw new FirebaseRemoteConfigException(e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public C6729m.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l11, Date date) throws FirebaseRemoteConfigException {
        m34350m(httpURLConnection, str3, str2, map2);
        try {
            try {
                m34349l(httpURLConnection, m34341c(str, str2, map, l11).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject m34344g = m34344g(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    C6723g m34342e = m34342e(m34344g, date);
                    if (!m34339a(m34344g)) {
                        return C6729m.a.m34423a(date, m34342e);
                    }
                    return C6729m.a.m34424b(m34342e, headerField);
                }
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            } catch (IOException | JSONException e11) {
                throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e11);
            }
        } finally {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
        }
    }
}
