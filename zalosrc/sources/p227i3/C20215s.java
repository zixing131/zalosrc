package p227i3;

import android.content.Context;
import android.os.Bundle;
import com.adtima.Adtima;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p009a3.C0096a;
import p009a3.C0097b;
import p178g3.C19206a;
import p178g3.C19212g;
import p313l3.AbstractC22009b;
import p313l3.AbstractC22011d;
import p667y2.C30266c;
import p667y2.C30270g;
import p667y2.C30271h;
import p667y2.C30272i;

/* renamed from: i3.s */
/* loaded from: classes2.dex */
public final class C20215s {

    /* renamed from: b */
    public static final String f99966b = "s";

    /* renamed from: c */
    private static C20215s f99967c;

    /* renamed from: a */
    private Context f99968a = Adtima.SharedContext;

    /* renamed from: c */
    private String m105506c(String str) {
        if (str != null && str.length() != 0) {
            String replace = str.replace("##templatePath##", "file://" + C19212g.m100811q().m100824n());
            if (str.contains("adtima-end")) {
                return replace;
            }
        }
        return null;
    }

    /* renamed from: e */
    private HashMap m105507e(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!str.contains(".css") && !str.contains(".html") && !str.contains(".json")) {
                    C20214r.m105487b().m105500j(str, str2);
                    if (!new File(str2).exists()) {
                        hashMap2.put(str, str2);
                    }
                }
                String m105504s = C20214r.m105487b().m105504s(str, null, 2);
                if (m105504s != null && m105504s.length() != 0 && m105506c(m105504s) != null && C20214r.m105487b().m105502n(m105504s, str2)) {
                }
                hashMap2.put(str, str2);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99966b, "retryDownload", e11);
        }
        return hashMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:            r1 = r5.f463d.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:            if (r1.hasNext() == false) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:            r2 = (java.lang.String) r1.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:            if (new java.io.File(r2).exists() != false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:            r2 = p313l3.AbstractC22009b.m114895b(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:            if (r2 == null) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:            if (r2.length() == 0) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:            if (r2.contains("adtima") != false) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008c, code lost:            r5 = r5.f464e.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:            if (r5.hasNext() == false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:            if (new java.io.File((java.lang.String) r5.next()).exists() != false) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:            return true;     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m105508j(C0097b c0097b) {
        String m114895b;
        String m114895b2;
        try {
            if (new File(c0097b.f461b).exists() && (m114895b = AbstractC22009b.m114895b(c0097b.f461b)) != null && m114895b.length() != 0 && m114895b.contains("adtima")) {
                Iterator it = c0097b.f462c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (!new File(str).exists() || (m114895b2 = AbstractC22009b.m114895b(str)) == null || m114895b2.length() == 0 || !m114895b2.contains("adtima")) {
                        break;
                    }
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99966b, "checksumLocalConfig", e11);
        }
        return false;
    }

    /* renamed from: k */
    public static C20215s m105509k() {
        if (f99967c == null) {
            f99967c = new C20215s();
        }
        return f99967c;
    }

    /* renamed from: a */
    public C0097b m105510a(String str, int i11, int i12, String str2) {
        try {
            String m100794a = C19206a.m100793b().m100794a();
            String m105381y = C20205i.m105364t().m105381y();
            Bundle bundle = new Bundle();
            bundle.putString("deviceId", str);
            bundle.putString("sdkVer", String.valueOf(i11));
            bundle.putString("sdkName", Adtima.SDK_VERSION_NAME);
            bundle.putString("sdkBuild", Adtima.SDK_BUILD_NUMBER);
            bundle.putString("templateVer", String.valueOf(i12));
            bundle.putString("appId", this.f99968a.getPackageName());
            bundle.putString("appVer", m100794a);
            bundle.putString("zaloSdkVer", m105381y);
            if (str2 != null && str2.trim().length() > 0) {
                bundle.putString("siteId", str2);
            }
            if (i12 == 1) {
                AbstractC20202f.f99806d0 = AbstractC20202f.f99804c0;
            }
            String m105503p = C20214r.m105487b().m105503p(AbstractC20206j.m105390f(), bundle, 2);
            if (!AbstractC22011d.m114918s(m105503p)) {
                m105503p = C20217u.m105538N0().m105605m(m105503p);
            }
            if (m105503p != null && m105503p.length() != 0) {
                JSONObject jSONObject = new JSONObject(m105503p);
                if (jSONObject.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) == 0) {
                    return C0097b.m437d(jSONObject.optJSONObject("data"));
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99966b, "getServerConfig", e11);
        }
        return null;
    }

    /* renamed from: b */
    public String m105511b(int i11, C0097b c0097b) {
        StringBuilder sb2;
        try {
            if (i11 < 58) {
                sb2 = new StringBuilder();
                sb2.append(this.f99968a.getFilesDir().getAbsolutePath());
                sb2.append("/template");
            } else {
                sb2 = new StringBuilder();
                sb2.append(this.f99968a.getFilesDir().getAbsolutePath());
                sb2.append("/zad_");
                sb2.append(Adtima.SDK_VERSION_CODE);
                sb2.append("_");
                sb2.append(c0097b.f460a);
            }
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    public ArrayList m105512d(int i11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("id", i11 + "");
            String m105504s = C20214r.m105487b().m105504s(AbstractC20206j.m105395k(), bundle, 2);
            if (!AbstractC22011d.m114918s(m105504s)) {
                m105504s = C20217u.m105538N0().m105605m(m105504s);
            }
            if (m105504s != null && m105504s.length() != 0) {
                JSONObject jSONObject = new JSONObject(m105504s);
                if (jSONObject.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) == 0) {
                    return C0096a.m431c(jSONObject.optJSONArray("data"));
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99966b, "getServerConfig", e11);
        }
        return null;
    }

    /* renamed from: f */
    public boolean m105513f() {
        C30272i.m149393g(this.f99968a).m98584c();
        return C30266c.m149335e(this.f99968a).m98584c();
    }

    /* renamed from: g */
    public boolean m105514g(C0097b c0097b) {
        if (c0097b != null) {
            try {
                if (m105508j(c0097b)) {
                    return true;
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99966b, "checkDownloadNeed", e11);
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean m105515h(C0097b c0097b, C0097b c0097b2) {
        if (c0097b != null) {
            try {
                if (m105508j(c0097b)) {
                    if (c0097b2 != null) {
                        if (c0097b.f460a != c0097b2.f460a) {
                        }
                    }
                    return false;
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99966b, "checkDownloadNeed", e11);
            }
        }
        return true;
    }

    /* renamed from: i */
    public boolean m105516i() {
        C30271h.m149387f(this.f99968a).m98584c();
        return C30270g.m149382e(this.f99968a).m98584c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:            if (p227i3.C20214r.m105487b().m105502n(r4, r3) != false) goto L18;     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m105517l(C0097b c0097b) {
        HashMap hashMap;
        ArrayList arrayList;
        String m105506c;
        ArrayList arrayList2;
        String m105506c2;
        if (c0097b == null) {
            return false;
        }
        try {
            C0097b c0097b2 = new C0097b();
            c0097b2.f460a = c0097b.f460a;
            C19212g.f95657d = c0097b.f460a;
            HashMap hashMap2 = new HashMap();
            String str = C19212g.m100811q().m100823m() + new File(c0097b.f461b).getName();
            c0097b2.f461b = str;
            Adtima.m18328e(f99966b, "localMapFile: " + str);
            String m105504s = C20214r.m105487b().m105504s(c0097b.f461b, null, 2);
            if (m105504s != null) {
                if (m105504s.length() != 0) {
                    String m105506c3 = m105506c(m105504s);
                    if (m105506c3 == null) {
                    }
                }
            }
            hashMap2.put(c0097b.f461b, str);
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < c0097b.f462c.size(); i11++) {
                String str2 = C19212g.m100811q().m100820j() + new File((String) c0097b.f462c.get(i11)).getName();
                arrayList3.add(str2);
                String m105504s2 = C20214r.m105487b().m105504s((String) c0097b.f462c.get(i11), null, 2);
                if (m105504s2 != null && m105504s2.length() != 0 && (m105506c2 = m105506c(m105504s2)) != null) {
                    if (!C20214r.m105487b().m105502n(m105506c2, str2)) {
                        arrayList2 = c0097b.f462c;
                        hashMap2.put(arrayList2.get(i11), str2);
                    }
                }
                arrayList2 = c0097b.f462c;
                hashMap2.put(arrayList2.get(i11), str2);
            }
            c0097b2.f462c = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            for (int i12 = 0; i12 < c0097b.f463d.size(); i12++) {
                String str3 = C19212g.m100811q().m100821k() + new File((String) c0097b.f463d.get(i12)).getName();
                arrayList4.add(str3);
                String m105504s3 = C20214r.m105487b().m105504s((String) c0097b.f463d.get(i12), null, 2);
                if (m105504s3 != null && m105504s3.length() != 0 && (m105506c = m105506c(m105504s3)) != null) {
                    if (!C20214r.m105487b().m105502n(m105506c, str3)) {
                        arrayList = c0097b.f463d;
                        hashMap2.put(arrayList.get(i12), str3);
                    }
                }
                arrayList = c0097b.f463d;
                hashMap2.put(arrayList.get(i12), str3);
            }
            c0097b2.f463d = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            for (int i13 = 0; i13 < c0097b.f464e.size(); i13++) {
                String str4 = C19212g.m100811q().m100822l() + new File((String) c0097b.f464e.get(i13)).getName();
                arrayList5.add(str4);
                C20214r.m105487b().m105500j((String) c0097b.f464e.get(i13), str4);
                if (!new File(str4).exists()) {
                    hashMap2.put(c0097b.f464e.get(i13), str4);
                }
            }
            c0097b2.f464e = arrayList5;
            if (hashMap2.size() != 0) {
                int i14 = 0;
                while (true) {
                    String str5 = f99966b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("downloadServerConfig - missed file, retry download #");
                    i14++;
                    sb2.append(i14);
                    Adtima.m18328e(str5, sb2.toString());
                    hashMap = m105507e(hashMap2);
                    if (hashMap.size() == 0) {
                        break;
                    }
                    if (i14 >= 3) {
                        break;
                    }
                    hashMap2 = hashMap;
                }
            }
            hashMap = hashMap2;
            c0097b2.f465f = c0097b.f465f;
            if (hashMap.size() == 0) {
                m105513f();
                return C30266c.m149335e(this.f99968a).m149336f(c0097b2);
            }
            Adtima.m18328e(f99966b, "downloadServerConfig - download failed after retry");
            return false;
        } catch (Exception e11) {
            Adtima.m18329e(f99966b, "downloadServerConfig", e11);
            return false;
        }
    }

    /* renamed from: m */
    public C0097b m105518m() {
        try {
            return C30266c.m149335e(this.f99968a).m149337g();
        } catch (Exception e11) {
            Adtima.m18329e(f99966b, "getLocalConfig", e11);
            return null;
        }
    }

    /* renamed from: n */
    public C0097b m105519n() {
        try {
            return C30270g.m149382e(this.f99968a).m149384g();
        } catch (Exception e11) {
            Adtima.m18329e(f99966b, "getTempLocalConfig", e11);
            return null;
        }
    }
}
