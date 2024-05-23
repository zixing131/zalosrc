package p227i3;

import am.C0925n;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.Display;
import com.adtima.Adtima;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p178g3.AbstractC19207b;
import p178g3.AbstractC19210e;
import p313l3.AbstractC22008a;
import p313l3.AbstractC22009b;
import p313l3.AbstractC22011d;
import p327lm.C22522b;
import p327lm.C22523c;
import p667y2.C30267d;

/* renamed from: i3.i */
/* loaded from: classes2.dex */
public final class C20205i {

    /* renamed from: K */
    public static final String f99854K = "i";

    /* renamed from: L */
    private static C20205i f99855L;

    /* renamed from: A */
    public String f99856A;

    /* renamed from: B */
    public String f99857B;

    /* renamed from: C */
    public String f99858C;

    /* renamed from: D */
    public String f99859D;

    /* renamed from: E */
    public String f99860E;

    /* renamed from: F */
    public String f99861F;

    /* renamed from: G */
    public String f99862G;

    /* renamed from: H */
    public String f99863H;

    /* renamed from: I */
    public String f99864I;

    /* renamed from: J */
    private long f99865J;

    /* renamed from: a */
    public String f99866a;

    /* renamed from: b */
    public String f99867b;

    /* renamed from: c */
    public String f99868c;

    /* renamed from: d */
    public String f99869d;

    /* renamed from: e */
    public String f99870e;

    /* renamed from: f */
    public String f99871f;

    /* renamed from: g */
    public String f99872g;

    /* renamed from: h */
    public String f99873h;

    /* renamed from: i */
    public String f99874i;

    /* renamed from: j */
    public String f99875j;

    /* renamed from: k */
    public String f99876k;

    /* renamed from: l */
    public String f99877l;

    /* renamed from: m */
    public String f99878m;

    /* renamed from: n */
    public String f99879n;

    /* renamed from: o */
    public String f99880o;

    /* renamed from: p */
    public String f99881p;

    /* renamed from: q */
    public String f99882q;

    /* renamed from: r */
    public String f99883r;

    /* renamed from: s */
    public String f99884s;

    /* renamed from: t */
    public String f99885t;

    /* renamed from: u */
    public String f99886u;

    /* renamed from: v */
    public String f99887v;

    /* renamed from: w */
    public String f99888w;

    /* renamed from: x */
    public String f99889x;

    /* renamed from: y */
    public String f99890y;

    /* renamed from: z */
    public String f99891z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.i$a */
    /* loaded from: classes2.dex */
    public class a implements C22523c.a {
        a(C20205i c20205i) {
        }

        @Override // p327lm.C22523c.a
        /* renamed from: a */
        public void mo99243a(String str) {
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        C30267d.m149339A().m149363t(str);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: i3.i$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractRunnableC0008c {
        b() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a */
        public AdvertisingIdClient.Info doInBackground() {
            try {
                if (!AbstractC22008a.m114893a("com.google.android.gms.common.GoogleApiAvailability")) {
                    Adtima.m18328e("GetAAID", "No class GooglePlayServicesUtil");
                } else if (C4070a.m19196p().mo19200i(Adtima.SharedContext) == 0) {
                    return AdvertisingIdClient.getAdvertisingIdInfo(Adtima.SharedContext);
                }
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | NoClassDefFoundError | RuntimeException | Exception unused) {
            }
            return null;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b */
        public void onPostExecute(AdvertisingIdClient.Info info) {
            if (info != null) {
                try {
                    C20205i.this.f99872g = info.getId();
                    C20205i c20205i = C20205i.this;
                    String str = c20205i.f99872g;
                    if (str == null) {
                        str = "";
                    }
                    c20205i.f99872g = str;
                    if (str.length() != 0) {
                        C30267d.m149339A().m149353j(C20205i.this.f99872g);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: i3.i$c */
    /* loaded from: classes2.dex */
    public class c extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f99893p;

        c(String str) {
            this.f99893p = str;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            C20205i c20205i;
            try {
                if (!AbstractC22009b.m114896c() || !AbstractC22009b.m114897d(Adtima.SharedContext)) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    Uri m114894a = AbstractC22009b.m114894a(Adtima.SharedContext, "ssstone.aac");
                    if (m114894a == null) {
                        c20205i = C20205i.this;
                    } else {
                        if (!AbstractC22009b.m114898e(Adtima.SharedContext, m114894a)) {
                            return null;
                        }
                        c20205i = C20205i.this;
                    }
                    c20205i.m105358g(Adtima.SharedContext, this.f99893p);
                    return null;
                }
                try {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "ssstone.aac");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(this.f99893p.getBytes());
                    fileOutputStream.close();
                    return null;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(83:1|(1:3)|4|(2:203|(1:207))|8|(1:10)|11|(1:202)(1:15)|16|(2:197|(1:201))|20|(1:22)|23|(1:196)(1:27)|28|(1:195)|32|(1:34)|35|(2:190|(1:194))|39|(1:41)|42|(1:189)(1:46)|47|(1:188)(1:51)|52|(1:187)(1:56)|57|(2:58|59)|(2:60|61)|(2:63|64)|65|(2:66|67)|69|70|71|72|73|74|(1:78)|79|(1:83)|84|(1:88)|89|(5:(39:94|95|(36:100|101|102|103|105|106|(1:108)(1:172)|109|110|112|113|(1:115)(1:169)|116|117|119|120|121|122|123|124|(2:126|(1:128))|130|131|132|133|134|(1:136)(1:(1:158)(1:159))|137|139|140|142|143|(1:145)(1:153)|146|147|148)|176|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148)|(37:97|100|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148)|146|147|148)|177|95|176|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(89:1|(1:3)|4|(2:203|(1:207))|8|(1:10)|11|(1:202)(1:15)|16|(2:197|(1:201))|20|(1:22)|23|(1:196)(1:27)|28|(1:195)|32|(1:34)|35|(2:190|(1:194))|39|(1:41)|42|(1:189)(1:46)|47|(1:188)(1:51)|52|(1:187)(1:56)|57|58|59|(2:60|61)|63|64|65|(2:66|67)|69|70|71|72|73|74|(1:78)|79|(1:83)|84|(1:88)|89|(39:94|95|(36:100|101|102|103|105|106|(1:108)(1:172)|109|110|112|113|(1:115)(1:169)|116|117|119|120|121|122|123|124|(2:126|(1:128))|130|131|132|133|134|(1:136)(1:(1:158)(1:159))|137|139|140|142|143|(1:145)(1:153)|146|147|148)|176|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148)|177|95|(37:97|100|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148)|176|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(90:1|(1:3)|4|(2:203|(1:207))|8|(1:10)|11|(1:202)(1:15)|16|(2:197|(1:201))|20|(1:22)|23|(1:196)(1:27)|28|(1:195)|32|(1:34)|35|(2:190|(1:194))|39|(1:41)|42|(1:189)(1:46)|47|(1:188)(1:51)|52|(1:187)(1:56)|57|58|59|(2:60|61)|63|64|65|66|67|69|70|71|72|73|74|(1:78)|79|(1:83)|84|(1:88)|89|(39:94|95|(36:100|101|102|103|105|106|(1:108)(1:172)|109|110|112|113|(1:115)(1:169)|116|117|119|120|121|122|123|124|(2:126|(1:128))|130|131|132|133|134|(1:136)(1:(1:158)(1:159))|137|139|140|142|143|(1:145)(1:153)|146|147|148)|176|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148)|177|95|(37:97|100|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148)|176|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(91:1|(1:3)|4|(2:203|(1:207))|8|(1:10)|11|(1:202)(1:15)|16|(2:197|(1:201))|20|(1:22)|23|(1:196)(1:27)|28|(1:195)|32|(1:34)|35|(2:190|(1:194))|39|(1:41)|42|(1:189)(1:46)|47|(1:188)(1:51)|52|(1:187)(1:56)|57|58|59|60|61|63|64|65|66|67|69|70|71|72|73|74|(1:78)|79|(1:83)|84|(1:88)|89|(39:94|95|(36:100|101|102|103|105|106|(1:108)(1:172)|109|110|112|113|(1:115)(1:169)|116|117|119|120|121|122|123|124|(2:126|(1:128))|130|131|132|133|134|(1:136)(1:(1:158)(1:159))|137|139|140|142|143|(1:145)(1:153)|146|147|148)|176|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148)|177|95|(37:97|100|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148)|176|101|102|103|105|106|(0)(0)|109|110|112|113|(0)(0)|116|117|119|120|121|122|123|124|(0)|130|131|132|133|134|(0)(0)|137|139|140|142|143|(0)(0)|146|147|148|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x033a, code lost:            r14.f99861F = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0320, code lost:            r14.f99860E = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0317, code lost:            r14.f99859D = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02f2, code lost:            r14.f99858C = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02cf, code lost:            r14.f99857B = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0297, code lost:            r14.f99856A = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0277, code lost:            r14.f99891z = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0249, code lost:            r14.f99890y = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0242, code lost:            r14.f99889x = "portrait";     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x022c, code lost:            r14.f99888w = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x020b, code lost:            r14.f99886u = "";     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021c A[Catch: Exception -> 0x0223, TryCatch #15 {Exception -> 0x0223, blocks: (B:106:0x020d, B:108:0x021c, B:172:0x0221), top: B:105:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023a A[Catch: Exception -> 0x0242, TryCatch #16 {Exception -> 0x0242, blocks: (B:113:0x022e, B:115:0x023a, B:169:0x023f), top: B:112:0x022e }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a3 A[Catch: Exception -> 0x02cf, TryCatch #0 {Exception -> 0x02cf, blocks: (B:124:0x0299, B:126:0x02a3, B:128:0x02aa), top: B:123:0x0299 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x032f A[Catch: Exception -> 0x033a, TRY_LEAVE, TryCatch #11 {Exception -> 0x033a, blocks: (B:143:0x0322, B:153:0x032f), top: B:142:0x0322 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023f A[Catch: Exception -> 0x0242, TRY_LEAVE, TryCatch #16 {Exception -> 0x0242, blocks: (B:113:0x022e, B:115:0x023a, B:169:0x023f), top: B:112:0x022e }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0221 A[Catch: Exception -> 0x0223, TRY_LEAVE, TryCatch #15 {Exception -> 0x0223, blocks: (B:106:0x020d, B:108:0x021c, B:172:0x0221), top: B:105:0x020d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C20205i() {
        TelephonyManager telephonyManager;
        DisplayManager displayManager;
        String sb2;
        String str;
        String str2;
        m105382z();
        this.f99866a = "0";
        String m105363s = m105363s();
        this.f99867b = m105363s;
        if (m105363s == null) {
            this.f99867b = "";
        }
        Context context = Adtima.SharedContext;
        C30267d m149339A = C30267d.m149339A();
        String m149360q = m149339A.m149360q();
        this.f99868c = m149360q;
        if (m149360q == null || m149360q.length() == 0) {
            String m105361p = m105361p();
            this.f99868c = m105361p;
            if (m105361p != null && m105361p.length() != 0) {
                m149339A.m149359p(this.f99868c);
            }
        }
        if (this.f99868c == null) {
            this.f99868c = "";
        }
        String str3 = this.f99868c;
        this.f99869d = (str3 == null || str3.length() == 0) ? "" : AbstractC22011d.m114920u(this.f99868c);
        String m149368y = m149339A.m149368y();
        this.f99870e = m149368y;
        if (m149368y == null || m149368y.length() == 0) {
            String m105362r = m105362r();
            this.f99870e = m105362r;
            if (m105362r != null && m105362r.length() != 0) {
                m149339A.m149367x(this.f99870e);
            }
        }
        if (this.f99870e == null) {
            this.f99870e = "";
        }
        String str4 = this.f99870e;
        this.f99871f = (str4 == null || str4.length() == 0) ? "" : AbstractC22011d.m114920u(this.f99870e);
        String m149351h = m149339A.m149351h();
        this.f99872g = m149351h;
        if (m149351h == null || m149351h.length() == 0) {
            m105360l();
        }
        if (this.f99872g == null) {
            this.f99872g = "";
        }
        String m149341C = m149339A.m149341C();
        this.f99873h = m149341C;
        if (m149341C == null || m149341C.length() == 0) {
            String m105365v = m105365v();
            this.f99873h = m105365v;
            if (m105365v != null && m105365v.length() != 0) {
                m149339A.m149369z(this.f99873h);
            }
        }
        if (this.f99873h == null) {
            this.f99873h = "";
        }
        String str5 = this.f99873h;
        this.f99874i = (str5 == null || str5.length() == 0) ? "" : AbstractC22011d.m114920u(this.f99873h);
        String str6 = this.f99873h;
        String replace = (str6 == null || str6.length() == 0) ? "" : this.f99873h.replace(":", "");
        this.f99875j = replace;
        this.f99876k = (replace == null || replace.length() == 0) ? "" : AbstractC22011d.m114920u(this.f99875j);
        try {
            this.f99877l = Build.MODEL.replace(" ", "_");
        } catch (Exception unused) {
            this.f99877l = "";
        }
        try {
            this.f99878m = Build.MANUFACTURER.replace(" ", "_");
        } catch (Exception unused2) {
            this.f99878m = "";
        }
        try {
            this.f99879n = Build.BRAND.replace(" ", "_");
        } catch (Exception unused3) {
            this.f99879n = "";
        }
        this.f99880o = String.valueOf(Build.VERSION.SDK_INT);
        try {
            this.f99881p = m105366w();
        } catch (Exception unused4) {
            this.f99881p = "";
        }
        try {
            this.f99882q = String.valueOf(AbstractC20216t.m105523d(context));
            this.f99883r = String.valueOf(AbstractC20216t.m105521b(context));
        } catch (Exception unused5) {
        }
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(String.format("%s=%s", "OS", this.f99866a));
            String str7 = this.f99873h;
            if (str7 != null && str7.length() != 0) {
                sb3.append("|");
                sb3.append(String.format("%s=%s", "MC", this.f99873h));
            }
            String str8 = this.f99870e;
            if (str8 != null && str8.length() != 0) {
                sb3.append("|");
                sb3.append(String.format("%s=%s", "IM", this.f99870e));
            }
            String str9 = this.f99868c;
            if (str9 != null && str9.length() != 0) {
                sb3.append("|");
                sb3.append(String.format("%s=%s", "ID", this.f99868c));
            }
            sb2 = sb3.toString();
        } catch (Exception unused6) {
        }
        try {
            if (sb2 != null && sb2.length() != 0) {
                str = Base64.encodeToString(sb2.getBytes("UTF-8"), 0);
                this.f99884s = str;
                if (sb2 != null && sb2.length() != 0) {
                    str2 = AbstractC22011d.m114920u(sb2);
                    this.f99885t = str2;
                    this.f99886u = Build.DEVICE.replace(" ", "_");
                    if ((context.getResources().getConfiguration().screenLayout & 15) < 3) {
                        this.f99887v = "tablet";
                    } else {
                        this.f99887v = "phone";
                    }
                    this.f99888w = Build.VERSION.RELEASE.replace(" ", "_");
                    if (context.getResources().getConfiguration().orientation != 2) {
                        this.f99889x = "landscape";
                    } else {
                        this.f99889x = "portrait";
                    }
                    this.f99890y = Build.CPU_ABI;
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                    this.f99891z = ((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1024) + "";
                    this.f99856A = context.getResources().getDisplayMetrics().densityDpi + "dpi";
                    displayManager = (DisplayManager) context.getSystemService("display");
                    if (displayManager != null) {
                        Display[] displays = displayManager.getDisplays();
                        if (displays.length > 0) {
                            Display display = displays[0];
                            Point point = new Point();
                            display.getSize(point);
                            this.f99857B = point.x + "x" + point.y;
                        }
                    }
                    this.f99858C = ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4) + "%";
                    int intExtra = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("status", -1);
                    this.f99859D = intExtra != 5 ? "full" : intExtra == 2 ? "charging" : "unplugged";
                    this.f99860E = AbstractC19207b.m100799e(context);
                    telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager.getSimState() != 5) {
                        this.f99861F = telephonyManager.getSimOperatorName().replace(" ", "_");
                    }
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    this.f99862G = packageInfo.versionName;
                    this.f99863H = packageInfo.versionCode + "";
                    this.f99864I = context.getPackageName();
                    return;
                }
                str2 = "";
                this.f99885t = str2;
                this.f99886u = Build.DEVICE.replace(" ", "_");
                if ((context.getResources().getConfiguration().screenLayout & 15) < 3) {
                }
                this.f99888w = Build.VERSION.RELEASE.replace(" ", "_");
                if (context.getResources().getConfiguration().orientation != 2) {
                }
                this.f99890y = Build.CPU_ABI;
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                this.f99891z = ((statFs2.getBlockSizeLong() * statFs2.getBlockCountLong()) / 1024) + "";
                this.f99856A = context.getResources().getDisplayMetrics().densityDpi + "dpi";
                displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                }
                this.f99858C = ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4) + "%";
                int intExtra2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("status", -1);
                this.f99859D = intExtra2 != 5 ? "full" : intExtra2 == 2 ? "charging" : "unplugged";
                this.f99860E = AbstractC19207b.m100799e(context);
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager.getSimState() != 5) {
                }
                PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                this.f99862G = packageInfo2.versionName;
                this.f99863H = packageInfo2.versionCode + "";
                this.f99864I = context.getPackageName();
                return;
            }
            if (sb2 != null) {
                str2 = AbstractC22011d.m114920u(sb2);
                this.f99885t = str2;
                this.f99886u = Build.DEVICE.replace(" ", "_");
                if ((context.getResources().getConfiguration().screenLayout & 15) < 3) {
                }
                this.f99888w = Build.VERSION.RELEASE.replace(" ", "_");
                if (context.getResources().getConfiguration().orientation != 2) {
                }
                this.f99890y = Build.CPU_ABI;
                StatFs statFs22 = new StatFs(Environment.getDataDirectory().getPath());
                this.f99891z = ((statFs22.getBlockSizeLong() * statFs22.getBlockCountLong()) / 1024) + "";
                this.f99856A = context.getResources().getDisplayMetrics().densityDpi + "dpi";
                displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                }
                this.f99858C = ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4) + "%";
                int intExtra22 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("status", -1);
                this.f99859D = intExtra22 != 5 ? "full" : intExtra22 == 2 ? "charging" : "unplugged";
                this.f99860E = AbstractC19207b.m100799e(context);
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager.getSimState() != 5) {
                }
                PackageInfo packageInfo22 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                this.f99862G = packageInfo22.versionName;
                this.f99863H = packageInfo22.versionCode + "";
                this.f99864I = context.getPackageName();
                return;
            }
            PackageInfo packageInfo222 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f99862G = packageInfo222.versionName;
            this.f99863H = packageInfo222.versionCode + "";
            this.f99864I = context.getPackageName();
            return;
        } catch (Exception unused7) {
            return;
        }
        str = "";
        this.f99884s = str;
        str2 = "";
        this.f99885t = str2;
        this.f99886u = Build.DEVICE.replace(" ", "_");
        if ((context.getResources().getConfiguration().screenLayout & 15) < 3) {
        }
        this.f99888w = Build.VERSION.RELEASE.replace(" ", "_");
        if (context.getResources().getConfiguration().orientation != 2) {
        }
        this.f99890y = Build.CPU_ABI;
        StatFs statFs222 = new StatFs(Environment.getDataDirectory().getPath());
        this.f99891z = ((statFs222.getBlockSizeLong() * statFs222.getBlockCountLong()) / 1024) + "";
        this.f99856A = context.getResources().getDisplayMetrics().densityDpi + "dpi";
        displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
        }
        this.f99858C = ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4) + "%";
        int intExtra222 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("status", -1);
        this.f99859D = intExtra222 != 5 ? "full" : intExtra222 == 2 ? "charging" : "unplugged";
        this.f99860E = AbstractC19207b.m100799e(context);
        telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() != 5) {
        }
    }

    /* renamed from: f */
    private String m105357f(HashMap hashMap, String str) {
        if (hashMap != null) {
            try {
                if (hashMap.containsKey(str)) {
                    return hashMap.get(str).toString();
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: g */
    public void m105358g(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", "ssstone");
                contentValues.put("mime_type", "audio/aac");
                contentValues.put("document_id", str);
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                Uri insert = context.getContentResolver().insert(MediaStore.Files.getContentUri("external"), contentValues);
                Adtima.m18328e("ADTIMA", "writeToExternal : " + insert.getPath());
                try {
                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
                    openOutputStream.write(str.getBytes());
                    openOutputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                MediaScannerConnection.scanFile(context, new String[]{insert.getPath()}, null, null);
                return;
            }
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            File file = new File(externalStoragePublicDirectory, "ssstone.aac");
            if (file.createNewFile()) {
                try {
                    Adtima.m18328e("ADTIMA", "writeToExternal : " + file.getPath());
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.close();
                    return;
                } catch (IOException e12) {
                    e12.printStackTrace();
                    return;
                }
            }
            return;
        } catch (Exception e13) {
            Adtima.m18329e(f99854K, "createExternalFile", e13);
        }
        Adtima.m18329e(f99854K, "createExternalFile", e13);
    }

    /* renamed from: l */
    private void m105360l() {
        C0009d.m11g(new b());
    }

    /* renamed from: p */
    private String m105361p() {
        try {
            return Settings.Secure.getString(Adtima.SharedContext.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: r */
    private String m105362r() {
        if (AbstractC19210e.m100805a("android.permission.READ_PHONE_STATE")) {
            return ((TelephonyManager) Adtima.SharedContext.getSystemService("phone")).getDeviceId();
        }
        return null;
    }

    /* renamed from: s */
    private String m105363s() {
        if (!AbstractC19210e.m100805a("android.permission.ACCESS_WIFI_STATE")) {
            return null;
        }
        int ipAddress = ((WifiManager) Adtima.SharedContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        return String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
    }

    /* renamed from: t */
    public static C20205i m105364t() {
        if (f99855L == null) {
            f99855L = new C20205i();
        }
        return f99855L;
    }

    /* renamed from: v */
    private String m105365v() {
        if (AbstractC19210e.m100805a("android.permission.ACCESS_WIFI_STATE")) {
            return ((WifiManager) Adtima.SharedContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        return null;
    }

    /* renamed from: w */
    private String m105366w() {
        String str = "";
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
            Matcher matcher = Pattern.compile("(\\d+)").matcher(randomAccessFile.readLine());
            while (matcher.find()) {
                str = matcher.group(1);
            }
            randomAccessFile.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    public String m105367a(int i11, String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.replace("__DURATION__", String.valueOf(i11));
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m105368b(String str, int i11) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.replace("__ADTEMPLATE__", String.valueOf(i11));
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public String m105369c(String str, String str2) {
        if (str2 == null) {
            return str2;
        }
        try {
            if (str2.length() != 0 && str != null && str.length() != 0) {
                return str2.replace("__ERROR_CODE__", str);
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: d */
    public String m105370d(String str, String str2, boolean z11) {
        if (str != null) {
            try {
                if (str.length() != 0 && str2 != null && str2.length() != 0) {
                    return str.replace("__ZONE_ID__", str2).replace("__ZONE_STATUS_CODE__", z11 ? "AD_FILL" : "AD_NO_FILL");
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public String m105371e(String str, HashMap hashMap) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.replace("__OS__", this.f99866a).replace("__IP__", this.f99867b).replace("__ANDROIDID1__", this.f99868c).replace("__ANDROIDID__", this.f99869d).replace("__IMEI__", this.f99871f).replace("__AAID__", this.f99872g).replace("__MAC1__", this.f99874i).replace("__MAC__", this.f99876k).replace("__Z_ANDROIDID__", this.f99868c).replace("__Z_MAC__", this.f99873h).replace("__Z_MAC_NC__", this.f99875j).replace("__Z_IMEI__", this.f99870e).replace("__Z_AAID__", this.f99872g).replace("__CONTENTID__", m105357f(hashMap, "__CONTENTID__")).replace("__MODEL__", this.f99877l).replace("__MANUFACTURER__", this.f99878m).replace("__BRAND__", this.f99879n).replace("__VERSION__", this.f99880o).replace("__RAM__", this.f99881p).replace("__SWIDTH__", this.f99882q).replace("__SHEIGHT__", this.f99883r).replace("__MOBILEID1__", this.f99884s).replace("__MOBILEID__", this.f99885t).replace("__UNIQUEID0__", this.f99868c).replace("__UNIQUEID01__", this.f99869d).replace("__KIND__", m105357f(hashMap, "__KIND__")).replace("__PRICE__", m105357f(hashMap, "__PRICE__")).replace("__FEEDBACK_ID__", m105357f(hashMap, "__FEEDBACK_ID__")).replace("__PERFORMANCE__", m105357f(hashMap, "__PERFORMANCE__")).replace("__ERROR_CODE_PAGE__", m105357f(hashMap, "__ERROR_CODE_PAGE__"));
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: i */
    public void m105372i(String str) {
        try {
            Adtima.m18328e(f99854K, "doUpdateFileData: " + str);
            C0009d.m11g(new c(str));
        } catch (Exception e11) {
            Adtima.m18329e(f99854K, "doUpdateFileData", e11);
        }
    }

    /* renamed from: j */
    public boolean m105373j() {
        try {
            if (m105376n() != null) {
                Adtima.m18328e(f99854K, "mExpiredTime: " + this.f99865J);
                if (this.f99865J - System.currentTimeMillis() > 0) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: k */
    public String m105374k(String str, String str2) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    String replace = str.replace("__OS__", this.f99866a).replace("__IP__", this.f99867b).replace("__ANDROIDID1__", this.f99868c).replace("__ANDROIDID__", this.f99869d).replace("__IMEI__", this.f99871f).replace("__AAID__", this.f99872g).replace("__MAC1__", this.f99874i).replace("__MAC__", this.f99876k).replace("__Z_ANDROIDID__", this.f99868c).replace("__Z_MAC__", this.f99873h).replace("__Z_MAC_NC__", this.f99875j).replace("__Z_IMEI__", this.f99870e).replace("__Z_AAID__", this.f99872g);
                    if (str2 == null) {
                        str2 = "";
                    }
                    return replace.replace("__CONTENTID__", str2).replace("__MODEL__", this.f99877l).replace("__MANUFACTURER__", this.f99878m).replace("__BRAND__", this.f99879n).replace("__VERSION__", this.f99880o).replace("__RAM__", this.f99881p).replace("__SWIDTH__", this.f99882q).replace("__SHEIGHT__", this.f99883r).replace("__MOBILEID1__", this.f99884s).replace("__MOBILEID__", this.f99885t).replace("__UNIQUEID0__", this.f99868c).replace("__UNIQUEID01__", this.f99869d);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: m */
    public void m105375m(String str) {
        try {
            Adtima.m18328e(f99854K, "setAdtimaDeviceID: " + str);
            C30267d.m149339A().m149357n(str);
            m105372i(str);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0002, B:6:0x000e, B:8:0x0018, B:10:0x001e, B:11:0x002d, B:12:0x0044, B:14:0x0049, B:16:0x004f, B:18:0x007f, B:23:0x0034), top: B:2:0x0002 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m105376n() {
        String m149358o;
        String str;
        StringBuilder sb2;
        String m105325a;
        try {
            m149358o = C30267d.m149339A().m149358o();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m149358o == null) {
            m149358o = AbstractC22009b.m114899f(Adtima.SharedContext, "ssstone");
            if (m149358o != null && !m149358o.equals("")) {
                str = f99854K;
                sb2 = new StringBuilder();
                sb2.append("getAdtimaDeviceID from external: ");
                sb2.append(m149358o);
            }
            if (m149358o != null && !m149358o.equals("")) {
                this.f99865J = Long.parseLong(m149358o.substring(0, m149358o.indexOf("|")));
                m105325a = AbstractC20198b.m105325a("==" + m149358o.substring(m149358o.indexOf("|") + 1), true);
                if (m105325a != null) {
                    C20217u.m105538N0().m105606m0(m105325a);
                    return m105325a;
                }
            }
            return null;
        }
        str = f99854K;
        sb2 = new StringBuilder();
        sb2.append("getAdtimaDeviceID from cache: ");
        sb2.append(m149358o);
        Adtima.m18328e(str, sb2.toString());
        if (m149358o != null) {
            this.f99865J = Long.parseLong(m149358o.substring(0, m149358o.indexOf("|")));
            m105325a = AbstractC20198b.m105325a("==" + m149358o.substring(m149358o.indexOf("|") + 1), true);
            if (m105325a != null) {
            }
        }
        return null;
    }

    /* renamed from: o */
    public String m105377o(String str, String str2) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.replace("__FEEDBACK_ID__", str2);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: q */
    public String m105378q(String str, String str2) {
        if (str2 == null) {
            return str2;
        }
        try {
            if (str2.length() != 0 && str != null && str.length() != 0) {
                return str2.replace("[ERRORCODE]", str);
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: u */
    public JSONObject m105379u() {
        Exception e11;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e12) {
            e11 = e12;
            jSONObject = null;
        }
        try {
            String m105586O0 = C20217u.m105538N0().m105586O0();
            if (!m105586O0.equals("")) {
                jSONObject.put("2uld", m105586O0);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mod", this.f99877l);
            jSONObject2.put(C0925n.f3421p, this.f99886u);
            jSONObject2.put(AbstractC20216t.f99969a, this.f99887v);
            jSONObject2.put("sn", "android");
            jSONObject2.put("sv", this.f99888w);
            jSONObject2.put("ori", this.f99889x);
            jSONObject.put("d3vInf", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("aId", this.f99868c);
            jSONObject3.put("cpu", this.f99890y);
            jSONObject3.put("ram", this.f99881p);
            jSONObject3.put("storage", this.f99891z);
            jSONObject3.put("btLvl", this.f99858C);
            jSONObject3.put("btSt4te", this.f99859D);
            jSONObject.put("hwInf", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("status", this.f99860E);
            jSONObject4.put("carrier", this.f99861F);
            jSONObject.put("nwInf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("ver", this.f99862G);
            jSONObject5.put("build", this.f99863H);
            jSONObject5.put("bi", this.f99864I);
            jSONObject.put("aInf", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("px", this.f99857B);
            jSONObject6.put("den", this.f99856A);
            jSONObject.put("scInf", jSONObject6);
            jSONObject.put("zuid", C20217u.m105538N0().m105590Q0());
        } catch (Exception e13) {
            e11 = e13;
            Adtima.m18329e(f99854K, "getJsonDI", e11);
            return jSONObject;
        }
        return jSONObject;
    }

    /* renamed from: x */
    public String m105380x() {
        String str;
        try {
            str = C22523c.m116498g().m116503d();
        } catch (Exception unused) {
            str = "";
        }
        if (str != null) {
            if (str.length() != 0) {
                C30267d.m149339A().m149363t(str);
                return (str != null || str.length() == 0) ? "_unknown_device_id_" : str;
            }
        }
        str = C30267d.m149339A().m149364u();
        C22523c.m116498g().m116504e(new a(this));
        if (str != null) {
        }
    }

    /* renamed from: y */
    public String m105381y() {
        try {
            return C22523c.m116498g().m116508j();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: z */
    public void m105382z() {
        String str;
        Bundle bundle;
        Object obj;
        try {
            Context context = Adtima.SharedContext;
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (Exception unused) {
            }
            if (!bundle.containsKey("com.zing.zalo.zalosdk.appID")) {
                if (bundle.containsKey("appID")) {
                    obj = bundle.get("appID");
                }
                str = "";
                C22523c.m116498g().m116509l(context, new C22522b(context), str);
            }
            obj = bundle.get("com.zing.zalo.zalosdk.appID");
            str = (String) obj;
            C22523c.m116498g().m116509l(context, new C22522b(context), str);
        } catch (Exception unused2) {
        }
    }
}
