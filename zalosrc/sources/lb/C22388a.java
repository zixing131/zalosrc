package lb;

import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import me0.AbstractC23056e6;
import org.json.JSONObject;

/* renamed from: lb.a */
/* loaded from: classes3.dex */
public class C22388a {

    /* renamed from: a */
    public long f109613a;

    /* renamed from: b */
    public String f109614b;

    /* renamed from: c */
    public String f109615c;

    /* renamed from: d */
    public int f109616d;

    /* renamed from: e */
    public a f109617e;

    /* renamed from: lb.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f109618a;

        /* renamed from: b */
        public int f109619b;

        /* renamed from: c */
        public int f109620c;

        /* renamed from: d */
        public int f109621d;

        public a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f109618a = jSONObject.optString("content");
            this.f109619b = jSONObject.optInt("notify", 0);
            this.f109620c = jSONObject.optInt("bump_thread", 0);
            this.f109621d = jSONObject.optInt("countUnread", -1);
        }

        /* renamed from: a */
        public boolean m115798a() {
            return this.f109620c == 1;
        }
    }

    public C22388a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f109613a = jSONObject.optLong("uid", 0L);
        String optString = jSONObject.optString("old_phonenum");
        this.f109614b = optString;
        this.f109615c = AbstractC23056e6.m118285k(optString);
        this.f109616d = jSONObject.optInt("show_msg_info", 0);
        this.f109617e = new a(jSONObject.optJSONObject("msg_info"));
    }

    /* renamed from: a */
    public boolean m115795a() {
        return !TextUtils.equals("" + this.f109613a, CoreUtility.f89233i);
    }

    /* renamed from: b */
    public boolean m115796b() {
        return this.f109616d == 1;
    }

    /* renamed from: c */
    public boolean m115797c() {
        if (this.f109613a != 0 && !TextUtils.isEmpty(this.f109614b) && !AbstractC23056e6.f112062a.equals(this.f109615c)) {
            return true;
        }
        return false;
    }
}
