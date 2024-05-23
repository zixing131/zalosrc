package p227i3;

import android.os.Bundle;
import com.adtima.Adtima;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import org.json.JSONObject;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p196h3.InterfaceC19744f;
import p287k3.C21458b;
import p287k3.EnumC21457a;
import p313l3.AbstractC22011d;

/* renamed from: i3.r */
/* loaded from: classes2.dex */
public final class C20214r {

    /* renamed from: a */
    private static final String f99959a = "r";

    /* renamed from: b */
    private static C20214r f99960b;

    /* renamed from: i3.r$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f99961p;

        /* renamed from: q */
        final /* synthetic */ Bundle f99962q;

        /* renamed from: r */
        final /* synthetic */ int f99963r;

        /* renamed from: s */
        final /* synthetic */ boolean f99964s;

        a(InterfaceC19744f interfaceC19744f, String str, Bundle bundle, int i11, boolean z11) {
            this.f99961p = str;
            this.f99962q = bundle;
            this.f99963r = i11;
            this.f99964s = z11;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onCancel() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPreExecute() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public String doInBackground() {
            return C20214r.this.m105495q(this.f99961p, this.f99962q, this.f99963r, this.f99964s);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(String str) {
        }
    }

    private C20214r() {
    }

    /* renamed from: a */
    private Bundle m105486a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3 = null;
        if (bundle == null) {
            return null;
        }
        try {
            bundle2 = new Bundle(bundle);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            bundle2.putString("platform", "android");
            bundle2.putString("timestamp", String.valueOf(System.currentTimeMillis()));
            if (!C20199c.m105336g().m105346l() || !AbstractC20202f.f99832q0) {
                bundle2.putString("signature", AbstractC22011d.m114906g(bundle2));
            }
            return bundle2;
        } catch (Exception e12) {
            e = e12;
            bundle3 = bundle2;
            Adtima.m18329e(f99959a, "attachAdsParams", e);
            return bundle3;
        }
    }

    /* renamed from: b */
    public static C20214r m105487b() {
        if (f99960b == null) {
            f99960b = new C20214r();
        }
        return f99960b;
    }

    /* renamed from: e */
    private String m105489e(String str, Bundle bundle, int i11) {
        C21458b m111028d;
        EnumC21457a enumC21457a;
        try {
            m111028d = C21458b.m111028d();
        } catch (Exception e11) {
            Adtima.m18329e(f99959a, "sendRequest", e11);
        }
        if (i11 != 2) {
            if (i11 == 1) {
                enumC21457a = EnumC21457a.POST;
            }
            return null;
        }
        enumC21457a = EnumC21457a.GET;
        return m111028d.m111032c(str, bundle, enumC21457a, AbstractC20202f.f99806d0, true, false);
    }

    /* renamed from: g */
    private String m105490g(String str, Bundle bundle, int i11, boolean z11) {
        try {
            return m105495q(str, bundle, i11, z11);
        } catch (Exception e11) {
            Adtima.m18329e(f99959a, "doSync", e11);
            return null;
        }
    }

    /* renamed from: i */
    private void m105491i(String str, Bundle bundle, int i11, InterfaceC19744f interfaceC19744f, boolean z11) {
        C0009d.m11g(new a(interfaceC19744f, str, bundle, i11, z11));
    }

    /* renamed from: k */
    private String m105492k(Bundle bundle) {
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
                Adtima.m18326d(f99959a, "buildCacheParam: " + ((Object) sb2));
                if (sb2.length() > 0) {
                    return m105497d(sb2.toString());
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99959a, "buildParamsRequest", e11);
            }
        }
        return null;
    }

    /* renamed from: l */
    private String m105493l(String str, Bundle bundle, int i11, boolean z11) {
        C21458b m111028d;
        EnumC21457a enumC21457a;
        try {
            m111028d = C21458b.m111028d();
        } catch (Exception e11) {
            Adtima.m18329e(f99959a, "sendRequest", e11);
        }
        if (i11 != 2) {
            if (i11 == 1) {
                enumC21457a = EnumC21457a.POST;
            }
            return null;
        }
        enumC21457a = EnumC21457a.GET;
        return m111028d.m111032c(str, bundle, enumC21457a, AbstractC20202f.f99808e0, false, z11);
    }

    /* renamed from: o */
    private String m105494o(Bundle bundle) {
        if (bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.getString(str));
                }
                if (jSONObject.length() > 0) {
                    return m105497d(jSONObject.toString());
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99959a, "buildParamsRequest", e11);
            }
        }
        return null;
    }

    /* renamed from: q */
    public String m105495q(String str, Bundle bundle, int i11, boolean z11) {
        try {
            Bundle m105486a = m105486a(bundle);
            return AbstractC20202f.f99833r ? m105498f(str, m105486a, i11, AbstractC20202f.f99808e0, false, z11) : m105493l(str, m105486a, i11, z11);
        } catch (Exception e11) {
            Adtima.m18329e(f99959a, "sendRequest", e11);
            return null;
        }
    }

    /* renamed from: r */
    private String m105496r(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder();
        if (bundle != null) {
            try {
                for (String str : bundle.keySet()) {
                    String string = bundle.getString(str);
                    sb2.append(str);
                    sb2.append("=");
                    sb2.append(URLEncoder.encode(string, "UTF-8"));
                    sb2.append("&");
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99959a, "buildParamsRequest", e11);
            }
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public String m105497d(String str) {
        try {
            return AbstractC20198b.m105331g(str, true);
        } catch (Exception e11) {
            Adtima.m18329e(f99959a, "buildEncRequestData", e11);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v5 java.lang.String, still in use, count: 2, list:
          (r12v5 java.lang.String) from 0x00df: IF  (r12v5 java.lang.String) != (null java.lang.String)  -> B:27:0x00e1 A[HIDDEN]
          (r12v5 java.lang.String) from 0x00e1: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v5 java.lang.String) binds: [B:30:0x00ed, B:26:0x00df] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9 A[Catch: Exception -> 0x0019, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0014, B:6:0x0022, B:7:0x0028, B:9:0x003c, B:12:0x0048, B:14:0x004c, B:16:0x0052, B:18:0x006a, B:19:0x0089, B:20:0x00c7, B:21:0x00cd, B:25:0x00db, B:27:0x00e1, B:28:0x00e5, B:32:0x00f3, B:34:0x00f9, B:39:0x010b, B:41:0x0115, B:44:0x0120, B:46:0x0123, B:48:0x012a, B:62:0x0098, B:63:0x00a0, B:65:0x00a6, B:67:0x00b4, B:70:0x001e), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: Exception -> 0x0019, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0014, B:6:0x0022, B:7:0x0028, B:9:0x003c, B:12:0x0048, B:14:0x004c, B:16:0x0052, B:18:0x006a, B:19:0x0089, B:20:0x00c7, B:21:0x00cd, B:25:0x00db, B:27:0x00e1, B:28:0x00e5, B:32:0x00f3, B:34:0x00f9, B:39:0x010b, B:41:0x0115, B:44:0x0120, B:46:0x0123, B:48:0x012a, B:62:0x0098, B:63:0x00a0, B:65:0x00a6, B:67:0x00b4, B:70:0x001e), top: B:2:0x0009 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String m105498f(java.lang.String r16, android.os.Bundle r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p227i3.C20214r.m105498f(java.lang.String, android.os.Bundle, int, int, boolean, boolean):java.lang.String");
    }

    /* renamed from: h */
    public void m105499h(String str, Bundle bundle, int i11, InterfaceC19744f interfaceC19744f) {
        C20199c.m105336g().m105345j(str);
        m105491i(str, bundle, i11, interfaceC19744f, true);
    }

    /* renamed from: j */
    public boolean m105500j(String str, String str2) {
        try {
            URL url = new URL(str);
            File file = new File(str2);
            InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.close();
                    inputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99959a, "downloadBinarySync", e11);
            return false;
        }
    }

    /* renamed from: m */
    public void m105501m(String str, Bundle bundle, int i11) {
        m105491i(str, bundle, i11, null, false);
    }

    /* renamed from: n */
    public boolean m105502n(String str, String str2) {
        boolean z11 = false;
        try {
            File file = new File(str2);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
            z11 = true;
            Adtima.m18328e(f99959a, "Copied: " + str2);
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return z11;
        }
    }

    /* renamed from: p */
    public String m105503p(String str, Bundle bundle, int i11) {
        try {
            Bundle m105486a = m105486a(bundle);
            return AbstractC20202f.f99833r ? m105498f(str, m105486a, i11, AbstractC20202f.f99806d0, true, false) : m105489e(str, m105486a, i11);
        } catch (Exception e11) {
            Adtima.m18329e(f99959a, "sendRequestConfigSync", e11);
            return null;
        }
    }

    /* renamed from: s */
    public String m105504s(String str, Bundle bundle, int i11) {
        C20199c.m105336g().m105345j(str);
        return m105490g(str, bundle, i11, false);
    }

    /* renamed from: t */
    public String m105505t(String str, Bundle bundle, int i11) {
        C20199c.m105336g().m105345j(str);
        return m105490g(str, bundle, i11, true);
    }
}
