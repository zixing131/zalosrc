package p716zh;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zh.q6 */
/* loaded from: classes3.dex */
public class C32077q6 {

    /* renamed from: A */
    public static int f147697A;

    /* renamed from: B */
    public static int f147698B;

    /* renamed from: C */
    public static int f147699C;

    /* renamed from: D */
    public static int f147700D;

    /* renamed from: E */
    public static int f147701E;

    /* renamed from: F */
    public static int f147702F;

    /* renamed from: G */
    public static int f147703G;

    /* renamed from: H */
    public static int f147704H;

    /* renamed from: x */
    private static final int[] f147705x = {AbstractC23322a.zds_ic_device_android_line_32, AbstractC23322a.zds_ic_device_ios_line_32, AbstractC23322a.zds_ic_device_windows_line_32, AbstractC23322a.zds_ic_device_macos_line_32, AbstractC23322a.zds_ic_device_linux_line_32, AbstractC23322a.zds_ic_device_unknown_line_32};

    /* renamed from: y */
    private static final int[] f147706y;

    /* renamed from: z */
    public static int f147707z;

    /* renamed from: a */
    public String f147708a;

    /* renamed from: b */
    public String f147709b;

    /* renamed from: c */
    public String f147710c;

    /* renamed from: d */
    public String f147711d;

    /* renamed from: e */
    public volatile int f147712e;

    /* renamed from: f */
    public int f147713f;

    /* renamed from: g */
    public long f147714g;

    /* renamed from: h */
    public int f147715h;

    /* renamed from: i */
    public ContactProfile f147716i;

    /* renamed from: j */
    public int f147717j;

    /* renamed from: k */
    public String f147718k;

    /* renamed from: l */
    public int f147719l;

    /* renamed from: m */
    public String f147720m;

    /* renamed from: n */
    public int f147721n;

    /* renamed from: o */
    public boolean f147722o;

    /* renamed from: p */
    public boolean f147723p;

    /* renamed from: q */
    public String f147724q;

    /* renamed from: r */
    public int f147725r;

    /* renamed from: s */
    public String f147726s;

    /* renamed from: t */
    public String f147727t;

    /* renamed from: u */
    public long f147728u;

    /* renamed from: v */
    public List f147729v;

    /* renamed from: w */
    public List f147730w;

    /* renamed from: zh.q6$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public int f147731a;

        /* renamed from: b */
        public String f147732b;

        public a(JSONObject jSONObject) {
            this.f147731a = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 4);
            this.f147732b = jSONObject.optString("text", "");
        }
    }

    /* renamed from: zh.q6$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public String f147733a;

        /* renamed from: b */
        public String f147734b;

        public b(JSONObject jSONObject) {
            this.f147733a = jSONObject.optString("key", "");
            this.f147734b = jSONObject.optString("value", "");
        }
    }

    static {
        int i11 = AbstractC23322a.zds_ic_leave_line_24;
        f147706y = new int[]{i11, i11, AbstractC23322a.zds_ic_warning_line_24, i11, AbstractC23322a.zds_ic_plus_circle_line_24, AbstractC23322a.zds_ic_close_circle_line_24};
        f147707z = 4;
        f147697A = 0;
        f147698B = 1;
        f147699C = 2;
        f147700D = 3;
        f147701E = 4;
        f147702F = 5;
        f147703G = 1;
        f147704H = 2;
    }

    public C32077q6() {
        this.f147712e = 0;
        this.f147713f = 6;
        this.f147715h = f147697A;
        this.f147717j = f147704H;
        this.f147720m = "";
        this.f147721n = 0;
        this.f147722o = true;
        this.f147723p = true;
        this.f147725r = 0;
        this.f147726s = "";
        this.f147727t = "";
        this.f147728u = 0L;
    }

    /* renamed from: a */
    public static C32077q6 m154729a(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C32077q6 c32077q6 = new C32077q6();
        c32077q6.f147713f = jSONObject.optInt("os_type", 6);
        c32077q6.f147717j = jSONObject.optInt("type_list", f147704H);
        try {
            c32077q6.f147721n = c32077q6.m154733e();
            if (jSONObject.isNull("device_name")) {
                str = "";
            } else {
                str = jSONObject.getString("device_name");
            }
            c32077q6.f147708a = str;
            if (TextUtils.isEmpty(str)) {
                c32077q6.f147708a = m154731c(c32077q6.f147713f);
            }
            if (jSONObject.isNull(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) {
                str2 = "";
            } else {
                str2 = jSONObject.getString(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
            }
            c32077q6.f147711d = str2;
            if (jSONObject.isNull("confirm_msg")) {
                str3 = "";
            } else {
                str3 = jSONObject.getString("confirm_msg");
            }
            c32077q6.f147710c = str3;
            if (jSONObject.isNull("action_text")) {
                str4 = "";
            } else {
                str4 = jSONObject.getString("action_text");
            }
            c32077q6.f147718k = str4;
            if (jSONObject.isNull("sk")) {
                str5 = "";
            } else {
                str5 = jSONObject.getString("sk");
            }
            c32077q6.f147709b = str5;
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        c32077q6.f147714g = jSONObject.optLong("timestamp");
        c32077q6.f147719l = jSONObject.optInt("platform_type");
        c32077q6.f147712e = jSONObject.optInt("action_button", -1);
        c32077q6.f147720m = jSONObject.optString("device_id", "");
        if ((c32077q6.f147712e == 1 && TextUtils.isEmpty(c32077q6.f147709b)) || c32077q6.f147712e == -1) {
            c32077q6.m154737i();
        }
        if (TextUtils.isEmpty(c32077q6.f147718k)) {
            c32077q6.m154736h();
        }
        return c32077q6;
    }

    /* renamed from: b */
    public static C32077q6 m154730b(JSONObject jSONObject) {
        C32077q6 m154729a = m154729a(jSONObject);
        m154729a.f147724q = jSONObject.toString();
        JSONObject optJSONObject = jSONObject.optJSONObject("label");
        if (optJSONObject != null) {
            m154729a.f147725r = optJSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
            m154729a.f147726s = optJSONObject.optString("text", "");
        }
        m154729a.f147727t = jSONObject.optString("login_method", "");
        m154729a.f147728u = jSONObject.optLong("last_active", 0L);
        JSONArray optJSONArray = jSONObject.optJSONArray("details");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            m154729a.f147729v = new ArrayList();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                if (optJSONObject2 != null) {
                    m154729a.f147729v.add(new b(optJSONObject2));
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("action_list");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            m154729a.f147730w = new ArrayList();
            for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i12);
                if (optJSONObject3 != null) {
                    m154729a.f147730w.add(new a(optJSONObject3));
                }
            }
        }
        return m154729a;
    }

    /* renamed from: c */
    public static String m154731c(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "Unknown" : "Linux" : "MacOS" : "Windows" : "IOS" : "Android";
    }

    /* renamed from: d */
    public static int m154732d(int i11) {
        if (i11 < 0 && i11 >= f147706y.length) {
            return 0;
        }
        return f147706y[i11];
    }

    /* renamed from: e */
    public int m154733e() {
        int i11 = this.f147713f - 1;
        if (i11 < 0 || i11 >= f147705x.length) {
            i11 = 5;
        }
        return f147705x[i11];
    }

    /* renamed from: f */
    public int m154734f() {
        int i11 = this.f147719l;
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return 1;
        }
        if (i11 != 20) {
            switch (i11) {
                case 23:
                case 24:
                case 25:
                    break;
                default:
                    switch (i11) {
                        case 31:
                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            return 3;
                        default:
                            return 0;
                    }
            }
        }
        return 2;
    }

    /* renamed from: g */
    public boolean m154735g() {
        return this.f147725r == 1;
    }

    /* renamed from: h */
    public void m154736h() {
        if (this.f147712e == 1) {
            this.f147718k = AbstractC23136l9.m118743r0(AbstractC8020f0.logout_title);
        } else if (this.f147712e == 0) {
            this.f147718k = AbstractC23136l9.m118743r0(AbstractC8020f0.str_logged_out);
        }
    }

    /* renamed from: i */
    public void m154737i() {
        this.f147712e = 0;
        m154736h();
    }

    public C32077q6(int i11) {
        this();
        this.f147715h = i11;
    }
}
