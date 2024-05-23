package p716zh;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: zh.w8 */
/* loaded from: classes3.dex */
public class C32163w8 {

    /* renamed from: a */
    public boolean f148288a;

    /* renamed from: b */
    public long f148289b;

    /* renamed from: c */
    public long f148290c;

    /* renamed from: d */
    private long f148291d;

    /* renamed from: e */
    public int f148292e;

    /* renamed from: f */
    public int f148293f;

    /* renamed from: g */
    private boolean f148294g;

    /* renamed from: h */
    private long f148295h;

    /* renamed from: i */
    private long f148296i;

    /* renamed from: j */
    private long f148297j;

    /* renamed from: k */
    public boolean f148298k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zh.w8$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public static C32163w8 f148299a = new C32163w8();
    }

    /* renamed from: a */
    public static C32163w8 m155135a() {
        return a.f148299a;
    }

    /* renamed from: b */
    public long m155136b() {
        return this.f148291d;
    }

    /* renamed from: c */
    public long m155137c() {
        return this.f148297j;
    }

    /* renamed from: d */
    public long m155138d() {
        return this.f148295h;
    }

    /* renamed from: e */
    public long m155139e() {
        return this.f148296i;
    }

    /* renamed from: f */
    public boolean m155140f() {
        return this.f148294g;
    }

    /* renamed from: g */
    public void m155141g() {
        boolean z11;
        boolean z12;
        String m121824db = AbstractC23309i.m121824db();
        if (!TextUtils.isEmpty(m121824db)) {
            try {
                JSONObject jSONObject = new JSONObject(m121824db);
                boolean z13 = false;
                if (jSONObject.optInt("setting_feature") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f148288a = z11;
                this.f148289b = jSONObject.optLong("time_retry_default", 1800000L);
                this.f148290c = jSONObject.optLong("time_retry_long", 86400000L);
                this.f148291d = jSONObject.optLong("limit_sending_time", 86400000L);
                this.f148293f = jSONObject.optInt("max_page", 5);
                this.f148292e = jSONObject.optInt("limit_sending_msg", 1000);
                if (jSONObject.optInt("move_bottom_failed_msg") == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f148294g = z12;
                this.f148295h = jSONObject.optInt("warning_notif_time", 900000);
                this.f148297j = jSONObject.optInt("warning_delta_time", 300000);
                this.f148296i = jSONObject.optInt("warning_spam_time", 3600000);
                if (jSONObject.optInt("popup_failed_msg") == 1) {
                    z13 = true;
                }
                this.f148298k = z13;
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    private C32163w8() {
        this.f148288a = true;
        this.f148289b = 1800000L;
        this.f148290c = 86400000L;
        this.f148291d = 86400000L;
        this.f148292e = 1000;
        this.f148293f = 5;
        this.f148294g = true;
        this.f148295h = 900000L;
        this.f148296i = 3600000L;
        this.f148297j = 300000L;
        this.f148298k = true;
        m155141g();
    }
}
