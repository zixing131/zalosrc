package sx;

import android.text.TextUtils;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import me0.AbstractC23136l9;
import org.json.JSONObject;

/* renamed from: sx.j */
/* loaded from: classes.dex */
public class C26408j {

    /* renamed from: a */
    public a f125526a;

    /* renamed from: b */
    public b f125527b;

    /* renamed from: c */
    public e f125528c;

    /* renamed from: d */
    boolean f125529d;

    /* renamed from: sx.j$b */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }
    }

    /* renamed from: sx.j$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public int f125538a;

        /* renamed from: b */
        public String f125539b;

        /* renamed from: c */
        public int f125540c;

        /* renamed from: d */
        public double f125541d;

        /* renamed from: e */
        public String f125542e;

        /* renamed from: f */
        public String f125543f;

        /* renamed from: g */
        public long f125544g;

        /* renamed from: h */
        public long f125545h;

        /* renamed from: i */
        public String f125546i;

        /* renamed from: j */
        public String f125547j;

        /* renamed from: k */
        public boolean f125548k;

        public c(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                this.f125538a = jSONObject.optInt("id", 0);
                this.f125539b = jSONObject.optString("name");
                this.f125540c = jSONObject.optInt("enable", 0);
                this.f125541d = jSONObject.optDouble("version", 0.0d);
                this.f125542e = jSONObject.optString("thumb_url", "");
                this.f125543f = jSONObject.optString("pkg_url", "");
                this.f125544g = jSONObject.optLong("start_time", 0L);
                this.f125545h = jSONObject.optLong("expired_time", 0L);
                this.f125546i = jSONObject.optString("zip_check_sum", "");
                this.f125547j = jSONObject.optString("folder_check_sum");
                this.f125548k = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: a */
        public boolean m136204a() {
            if (System.currentTimeMillis() <= this.f125544g + this.f125545h) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m136205b() {
            return this.f125540c == 1;
        }

        /* renamed from: c */
        public boolean m136206c(c cVar) {
            if (this.f125538a != cVar.f125538a) {
                return true;
            }
            double d11 = this.f125541d;
            double d12 = cVar.f125541d;
            if (d11 == d12) {
                if (m136208e(cVar)) {
                    return false;
                }
                if ((this.f125540c != cVar.f125540c || this.f125544g != cVar.f125544g || this.f125545h != cVar.f125545h) && TextUtils.equals(this.f125543f, cVar.f125543f) && TextUtils.equals(this.f125546i, cVar.f125546i)) {
                    return true;
                }
                return false;
            }
            if (d11 > d12) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean m136207d() {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f125540c == 1) {
                long j11 = this.f125544g;
                if (currentTimeMillis >= j11 && currentTimeMillis <= j11 + this.f125545h) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public boolean m136208e(c cVar) {
            if (this.f125538a == cVar.f125538a && this.f125541d == cVar.f125541d && this.f125540c == cVar.f125540c && this.f125544g == cVar.f125544g && this.f125545h == cVar.f125545h && TextUtils.equals(this.f125542e, cVar.f125542e) && TextUtils.equals(this.f125543f, cVar.f125543f) && TextUtils.equals(this.f125546i, cVar.f125546i) && TextUtils.equals(this.f125547j, cVar.f125547j)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: sx.j$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        String f125549a;

        /* renamed from: b */
        String f125550b;

        d() {
        }

        d(JSONObject jSONObject) {
            this.f125549a = jSONObject.optString("name");
            this.f125550b = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        }
    }

    /* renamed from: sx.j$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        public String f125560a;

        /* renamed from: b */
        public String f125561b;

        f(JSONObject jSONObject) {
            this.f125560a = jSONObject.optString("tabbar_button_normal");
            this.f125561b = jSONObject.optString("tabbar_button_selected");
        }
    }

    public C26408j() {
        this.f125529d = false;
        this.f125528c = new e();
        this.f125526a = new a();
        this.f125527b = new b();
    }

    /* renamed from: a */
    public boolean m136203a() {
        return this.f125529d;
    }

    /* renamed from: sx.j$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public int f125530a;

        /* renamed from: b */
        public double f125531b;

        /* renamed from: c */
        public String f125532c;

        /* renamed from: d */
        public long f125533d;

        /* renamed from: e */
        public long f125534e;

        /* renamed from: f */
        public int f125535f;

        /* renamed from: g */
        d f125536g;

        a() {
            this.f125530a = -1;
            this.f125531b = 0.0d;
            this.f125536g = new d();
        }

        a(JSONObject jSONObject) {
            this.f125530a = jSONObject.optInt("id");
            this.f125531b = jSONObject.optDouble("version");
            this.f125532c = jSONObject.optString("name");
            this.f125533d = jSONObject.optLong("schema");
            this.f125534e = jSONObject.optLong("revision");
            this.f125535f = jSONObject.optInt("encryption", 0);
            this.f125536g = new d(jSONObject.optJSONObject("provider"));
        }
    }

    /* renamed from: sx.j$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: h */
        public static final String[] f125551h;

        /* renamed from: i */
        public static final int f125552i;

        /* renamed from: a */
        public int f125553a;

        /* renamed from: b */
        public int f125554b;

        /* renamed from: c */
        public int f125555c;

        /* renamed from: d */
        public int f125556d;

        /* renamed from: e */
        public int f125557e;

        /* renamed from: f */
        public String f125558f;

        /* renamed from: g */
        public f[] f125559g;

        static {
            String[] strArr = {"message", "contact", "group", "timeline", "discover"};
            f125551h = strArr;
            f125552i = strArr.length;
        }

        public e() {
            this.f125559g = new f[f125552i];
            this.f125553a = AbstractC23136l9.m118639A(AbstractC16801x.title_tab_main);
            this.f125554b = AbstractC23136l9.m118639A(AbstractC16801x.title_tab_main);
            this.f125555c = 7;
            this.f125556d = 7;
            this.f125557e = AbstractC23136l9.m118639A(AbstractC16801x.white);
        }

        e(JSONObject jSONObject) {
            this();
            String optString = jSONObject.optString("font_weight");
            String optString2 = jSONObject.optString("selected_font_weight");
            this.f125555c = AbstractC23136l9.m118682V0(optString);
            this.f125556d = AbstractC23136l9.m118682V0(optString2);
            this.f125557e = AbstractC23136l9.m118768z1(jSONObject.optString("background_color"), AbstractC23136l9.m118639A(AbstractC16801x.white));
            this.f125558f = jSONObject.optString("background_image");
            this.f125559g = new f[f125552i];
            JSONObject optJSONObject = jSONObject.optJSONObject("items");
            if (optJSONObject != null) {
                for (int i11 = 0; i11 < f125552i; i11++) {
                    this.f125559g[i11] = new f(optJSONObject.optJSONObject(f125551h[i11]));
                }
            }
        }
    }

    public C26408j(String str) {
        this.f125529d = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f125526a = new a(jSONObject.optJSONObject("manifest"));
            this.f125527b = new b();
            this.f125528c = new e(jSONObject.optJSONObject("tabBar"));
            this.f125529d = true;
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f125529d = false;
        }
    }
}
