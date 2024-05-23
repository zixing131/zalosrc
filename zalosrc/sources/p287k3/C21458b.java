package p287k3;

import android.os.Bundle;
import com.adtima.Adtima;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import org.json.JSONObject;
import p227i3.AbstractC20198b;
import p227i3.AbstractC20202f;
import p227i3.C20199c;

/* renamed from: k3.b */
/* loaded from: classes2.dex */
public class C21458b {

    /* renamed from: a */
    private static final String f104475a = "b";

    /* renamed from: b */
    private static C21458b f104476b;

    private C21458b() {
    }

    /* renamed from: a */
    private String m111027a(Bundle bundle) {
        if (bundle != null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bundle.getString("sdkVer"));
                sb2.append(",");
                sb2.append(bundle.getString("siteId"));
                sb2.append(",");
                sb2.append(bundle.getString("appId"));
                sb2.append(",");
                sb2.append(bundle.getString("templateVer"));
                sb2.append(",");
                sb2.append("android");
                Adtima.m18326d(f104475a, "buildCacheParam: " + ((Object) sb2));
                if (sb2.length() > 0) {
                    return m111031b(sb2.toString());
                }
            } catch (Exception e11) {
                Adtima.m18329e(f104475a, "buildCacheParam", e11);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C21458b m111028d() {
        if (f104476b == null) {
            f104476b = new C21458b();
        }
        return f104476b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:            r6 = p287k3.C21458b.f104475a;        r8 = new java.lang.StringBuilder();        r8.append("Response ");        r8.append(r1);        r8.append(" with REDIRECT too deep");     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m111029e(HttpURLConnection httpURLConnection, String str, int i11) {
        String str2;
        StringBuilder sb2;
        String str3;
        StringBuilder sb3;
        boolean z11 = false;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                if (responseCode != 302 && responseCode != 301 && responseCode != 303) {
                    str2 = f104475a;
                    sb2 = new StringBuilder();
                    sb2.append("Response ");
                    sb2.append(responseCode);
                    sb2.append(" with NOT HTTP_OK of ");
                    sb2.append(str);
                    Adtima.m18328e(str2, sb2.toString());
                    return false;
                }
                int i12 = i11 - 1;
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField != null && headerField.length() != 0) {
                    Adtima.m18326d(f104475a, "Response " + responseCode + " with REDIRECT of " + str + "\n-->> " + headerField);
                    return m111029e((HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(headerField).openConnection())), headerField, i12);
                }
                str2 = f104475a;
                sb2 = new StringBuilder();
                sb2.append("Response ");
                sb2.append(responseCode);
                sb2.append(" with INVALID url");
                Adtima.m18328e(str2, sb2.toString());
                return false;
            }
            z11 = true;
            str3 = f104475a;
            sb3 = new StringBuilder();
            sb3.append("Response ");
            sb3.append(responseCode);
            sb3.append(" with HTTP_OK of ");
            sb3.append(str);
            Adtima.m18326d(str3, sb3.toString());
            return z11;
        } catch (Exception e11) {
            Adtima.m18329e(f104475a, "redirectIfNeed with endpoint " + str, e11);
            return false;
        }
    }

    /* renamed from: f */
    private String m111030f(Bundle bundle) {
        if (bundle != null) {
            try {
                if (C20199c.m105336g().m105346l() && AbstractC20202f.f99832q0) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str : bundle.keySet()) {
                        jSONObject.put(str, bundle.getString(str));
                    }
                    if (jSONObject.length() > 0) {
                        return m111031b(jSONObject.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        sb2.append(str2);
                        sb2.append("=");
                        sb2.append(URLEncoder.encode(string, "UTF-8"));
                        sb2.append("&");
                    }
                    if (sb2.toString() != null) {
                        return sb2.toString();
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(f104475a, "buildParamsRequest", e11);
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m111031b(String str) {
        try {
            return URLEncoder.encode(AbstractC20198b.m105331g(str, true), "UTF-8");
        } catch (Exception e11) {
            Adtima.m18329e(f104475a, "buildEncRequestData", e11);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v14 java.lang.String, still in use, count: 2, list:
          (r10v14 java.lang.String) from 0x00a8: IF  (r10v14 java.lang.String) != (null java.lang.String)  -> B:33:0x00aa A[HIDDEN]
          (r10v14 java.lang.String) from 0x00aa: PHI (r10v13 java.lang.String) = (r10v12 java.lang.String), (r10v14 java.lang.String) binds: [B:36:0x00b6, B:32:0x00a8] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        */
    /* renamed from: c */
    public java.lang.String m111032c(java.lang.String r6, android.os.Bundle r7, p287k3.EnumC21457a r8, int r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p287k3.C21458b.m111032c(java.lang.String, android.os.Bundle, k3.a, int, boolean, boolean):java.lang.String");
    }
}
