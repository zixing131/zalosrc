package com.google.android.gms.internal.ads;

import android.content.Context;
import android.provider.Settings;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p229i5.AbstractC20282c;
import p229i5.C20288i;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class xk0 {

    /* renamed from: c */
    private static boolean f30491c = false;

    /* renamed from: d */
    private static boolean f30492d = false;

    /* renamed from: g */
    public static final /* synthetic */ int f30495g = 0;

    /* renamed from: a */
    private final List f30496a;

    /* renamed from: b */
    private static final Object f30490b = new Object();

    /* renamed from: e */
    private static final InterfaceC20285f f30493e = C20288i.m105926d();

    /* renamed from: f */
    private static final Set f30494f = new HashSet(Arrays.asList(new String[0]));

    public xk0(String str) {
        List asList;
        if (!m27903l()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.f30496a = asList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m27898a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m27910s(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(AbstractC20282c.m105908a(bArr));
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m27899b(int i11, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i11);
        jsonWriter.endObject();
        m27910s(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: i */
    public static void m27900i() {
        synchronized (f30490b) {
            f30491c = false;
            f30492d = false;
            yk0.zzj("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: j */
    public static void m27901j(boolean z11) {
        synchronized (f30490b) {
            f30491c = true;
            f30492d = z11;
        }
    }

    /* renamed from: k */
    public static boolean m27902k(Context context) {
        if (!((Boolean) AbstractC5074uy.f29077a.m24091e()).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            yk0.zzk("Fail to determine debug setting.", e11);
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m27903l() {
        boolean z11;
        synchronized (f30490b) {
            try {
                z11 = false;
                if (f30491c && f30492d) {
                    z11 = true;
                }
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: m */
    public static boolean m27904m() {
        boolean z11;
        synchronized (f30490b) {
            z11 = f30491c;
        }
        return z11;
    }

    /* renamed from: n */
    private static synchronized void m27905n(String str) {
        synchronized (xk0.class) {
            try {
                yk0.zzi("GMA Debug BEGIN");
                int i11 = 0;
                while (i11 < str.length()) {
                    int i12 = i11 + 4000;
                    yk0.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i11, Math.min(i12, str.length())))));
                    i11 = i12;
                }
                yk0.zzi("GMA Debug FINISH");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    private final void m27906o(String str, wk0 wk0Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f30493e.mo105913a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f30496a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            wk0Var.mo26348a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e11) {
            yk0.zzh("unable to log", e11);
        }
        m27905n(stringWriter.toString());
    }

    /* renamed from: p */
    private final void m27907p(final String str) {
        m27906o("onNetworkRequestError", new wk0() { // from class: com.google.android.gms.internal.ads.tk0
            @Override // com.google.android.gms.internal.ads.wk0
            /* renamed from: a */
            public final void mo26348a(JsonWriter jsonWriter) {
                String str2 = str;
                int i11 = xk0.f30495g;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    /* renamed from: q */
    private final void m27908q(final String str, final String str2, final Map map, final byte[] bArr) {
        m27906o("onNetworkRequest", new wk0() { // from class: com.google.android.gms.internal.ads.uk0
            @Override // com.google.android.gms.internal.ads.wk0
            /* renamed from: a */
            public final void mo26348a(JsonWriter jsonWriter) {
                xk0.m27898a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    /* renamed from: r */
    private final void m27909r(final Map map, final int i11) {
        m27906o("onNetworkResponse", new wk0() { // from class: com.google.android.gms.internal.ads.sk0
            @Override // com.google.android.gms.internal.ads.wk0
            /* renamed from: a */
            public final void mo26348a(JsonWriter jsonWriter) {
                xk0.m27899b(i11, map, jsonWriter);
            }
        });
    }

    /* renamed from: s */
    private static void m27910s(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f30494f.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    yk0.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    /* renamed from: c */
    public final void m27911c(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (!m27903l()) {
            return;
        }
        if (httpURLConnection.getRequestProperties() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getRequestProperties());
        }
        m27908q(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
    }

    /* renamed from: d */
    public final void m27912d(String str, String str2, Map map, byte[] bArr) {
        if (!m27903l()) {
            return;
        }
        m27908q(str, "GET", map, bArr);
    }

    /* renamed from: e */
    public final void m27913e(HttpURLConnection httpURLConnection, int i11) {
        HashMap hashMap;
        if (!m27903l()) {
            return;
        }
        String str = null;
        if (httpURLConnection.getHeaderFields() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getHeaderFields());
        }
        m27909r(hashMap, i11);
        if (i11 >= 200 && i11 < 300) {
            return;
        }
        try {
            str = httpURLConnection.getResponseMessage();
        } catch (IOException e11) {
            yk0.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e11.getMessage())));
        }
        m27907p(str);
    }

    /* renamed from: f */
    public final void m27914f(Map map, int i11) {
        if (!m27903l()) {
            return;
        }
        m27909r(map, i11);
        if (i11 >= 200 && i11 < 300) {
            return;
        }
        m27907p(null);
    }

    /* renamed from: g */
    public final void m27915g(String str) {
        if (!m27903l() || str == null) {
            return;
        }
        m27916h(str.getBytes());
    }

    /* renamed from: h */
    public final void m27916h(final byte[] bArr) {
        m27906o("onNetworkResponseBody", new wk0() { // from class: com.google.android.gms.internal.ads.vk0
            @Override // com.google.android.gms.internal.ads.wk0
            /* renamed from: a */
            public final void mo26348a(JsonWriter jsonWriter) {
                byte[] bArr2 = bArr;
                int i11 = xk0.f30495g;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String m105908a = AbstractC20282c.m105908a(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(m105908a);
                } else {
                    String m26104g = rk0.m26104g(m105908a);
                    if (m26104g != null) {
                        jsonWriter.name("bodydigest").value(m26104g);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
