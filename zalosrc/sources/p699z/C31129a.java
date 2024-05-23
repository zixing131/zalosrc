package p699z;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import com.zing.zalo.BuildConfig;
import hh0.AbstractC20066d;
import ih0.C20558b;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.AbstractC20216t;
import p327lm.AbstractC22527g;
import p327lm.C22523c;

/* renamed from: z.a */
/* loaded from: classes2.dex */
public class C31129a {

    /* renamed from: a */
    private boolean f143384a = false;

    /* renamed from: b */
    private boolean f143385b = true;

    /* renamed from: c */
    private String f143386c;

    /* renamed from: d */
    private String f143387d;

    /* renamed from: e */
    private String f143388e;

    /* renamed from: f */
    private String f143389f;

    /* renamed from: g */
    private String f143390g;

    /* renamed from: h */
    private String f143391h;

    /* renamed from: i */
    private String f143392i;

    /* renamed from: j */
    private String f143393j;

    /* renamed from: k */
    private String f143394k;

    /* renamed from: l */
    private String f143395l;

    /* renamed from: m */
    private String f143396m;

    /* renamed from: n */
    private String f143397n;

    /* renamed from: o */
    private String f143398o;

    /* renamed from: p */
    private String f143399p;

    /* renamed from: q */
    private String f143400q;

    /* renamed from: z.a$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f143401p;

        /* renamed from: q */
        final /* synthetic */ Context f143402q;

        /* renamed from: r */
        final /* synthetic */ JSONObject f143403r;

        /* renamed from: s */
        final /* synthetic */ b f143404s;

        a(String str, Context context, JSONObject jSONObject, b bVar) {
            this.f143401p = str;
            this.f143402q = context;
            this.f143403r = jSONObject;
            this.f143404s = bVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:28|(2:29|30)|(10:32|34|35|(6:37|38|39|(2:41|(4:48|49|50|(1:52)(1:54)))|55|56)|59|38|39|(0)|55|56)|61|34|35|(0)|59|38|39|(0)|55|56) */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #2 {Exception -> 0x007a, blocks: (B:35:0x006f, B:37:0x0075), top: B:34:0x006f }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[Catch: Exception -> 0x00bb, TryCatch #1 {Exception -> 0x00bb, blocks: (B:39:0x007c, B:41:0x0082, B:44:0x0090, B:46:0x0096, B:48:0x009c, B:50:0x00a0, B:52:0x00ac), top: B:38:0x007c }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            int i11;
            String str;
            String string;
            C20558b c20558b = new C20558b(C20558b.a.POST, C31129a.this.f143384a ? "http://dev.plugin.zaloapp.com/m/sdk/adtima/follow/token" : "https://wg.zaloapp.com/m/sdk/adtima/follow/token");
            c20558b.m106850b(AbstractC20216t.f99969a, this.f143401p);
            JSONObject m151211h = C31129a.this.m151211h(this.f143402q);
            if (m151211h != null) {
                try {
                    c20558b.m106850b("deviceInfo", m151211h.toString());
                } catch (Exception unused) {
                }
            }
            JSONObject jSONObject = this.f143403r;
            if (jSONObject != null) {
                try {
                    c20558b.m106850b("extraParam", jSONObject.toString());
                } catch (Exception unused2) {
                }
            }
            JSONObject m106851c = c20558b.m106851c();
            if (m106851c == null) {
                b bVar = this.f143404s;
                if (bVar != null) {
                    bVar.onCompleted(-1002, "Network error", null);
                    return;
                }
                return;
            }
            if (this.f143404s != null) {
                JSONObject jSONObject2 = new JSONObject();
                if (m106851c.has("err")) {
                    i11 = m106851c.getInt("err");
                    if (m106851c.has("msg")) {
                        str = m106851c.getString("msg");
                        if (m106851c.has("data")) {
                            jSONObject2 = m106851c.getJSONObject("data");
                            if (C31129a.this.f143385b && jSONObject2 != null && jSONObject2.has("link") && (string = jSONObject2.getString("link")) != null) {
                                if (C31129a.this.m151206e(BuildConfig.APPLICATION_ID, this.f143402q.getPackageManager())) {
                                    jSONObject2.remove("link");
                                    C31129a.this.m151204b(this.f143402q, string);
                                } else {
                                    i11 = -1001;
                                    str = "Zalo not installed";
                                }
                            }
                        }
                        this.f143404s.onCompleted(i11, str, jSONObject2);
                    }
                    str = "";
                    if (m106851c.has("data")) {
                    }
                    this.f143404s.onCompleted(i11, str, jSONObject2);
                }
                i11 = -1;
                if (m106851c.has("msg")) {
                }
                str = "";
                if (m106851c.has("data")) {
                }
                this.f143404s.onCompleted(i11, str, jSONObject2);
            }
        }
    }

    /* renamed from: z.a$b */
    /* loaded from: classes2.dex */
    public interface b {
        void onCompleted(int i11, String str, JSONObject jSONObject);
    }

    /* renamed from: a */
    private void m151203a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            this.f143399p = packageName;
            this.f143386c = "android";
            this.f143387d = Build.VERSION.RELEASE;
            this.f143388e = "4.0.1015";
            this.f143390g = URLEncoder.encode(String.valueOf(applicationInfo.loadLabel(packageManager)), "UTF-8");
            this.f143391h = packageInfo.versionName;
            this.f143394k = Settings.Secure.getString(context.getContentResolver(), "android_id");
            this.f143395l = Build.SERIAL;
            this.f143396m = Build.MODEL;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.f143397n = point.x + "x" + point.y;
            this.f143398o = AbstractC20066d.m104296o(context);
            this.f143389f = AbstractC20066d.m104286e(context);
            this.f143400q = AbstractC20066d.m104284c(context);
            this.f143392i = AbstractC22527g.m116531a(context, "android.permission.READ_PHONE_STATE") ? ((TelephonyManager) context.getSystemService("phone")).getSimOperator() : "";
            this.f143393j = C22523c.m116498g().m116503d();
            String.valueOf(packageInfo.versionCode);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m151204b(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (m151206e(BuildConfig.APPLICATION_ID, context.getPackageManager())) {
                intent.setPackage(BuildConfig.APPLICATION_ID);
            }
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m151206e(String str, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public void m151210c(Context context, String str, JSONObject jSONObject, b bVar) {
        m151203a(context);
        try {
            new Thread(new a(str, context, jSONObject, bVar)).start();
        } catch (Exception e11) {
            if (bVar != null) {
                bVar.onCompleted(-1, "Client Exception " + e11.getMessage(), null);
            }
        }
    }

    /* renamed from: h */
    public JSONObject m151211h(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f143389f = AbstractC20066d.m104286e(context);
            jSONObject.put("pkg", this.f143399p);
            jSONObject.put("pl", this.f143386c);
            jSONObject.put("osv", this.f143387d);
            jSONObject.put("sdkv", this.f143388e);
            jSONObject.put("an", this.f143390g);
            jSONObject.put("av", this.f143391h);
            jSONObject.put("dId", this.f143393j);
            jSONObject.put("aId", this.f143394k);
            jSONObject.put("ser", this.f143395l);
            jSONObject.put("mod", this.f143396m);
            jSONObject.put("ss", this.f143397n);
            jSONObject.put("mac", this.f143398o);
            jSONObject.put("conn", this.f143389f);
            jSONObject.put("mno", this.f143392i);
            jSONObject.put("adId", this.f143400q);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
