package bo;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONObject;

/* renamed from: bo.x0 */
/* loaded from: classes4.dex */
public class C3055x0 {

    /* renamed from: a */
    public long f12338a;

    /* renamed from: b */
    public String f12339b;

    /* renamed from: c */
    public String f12340c;

    /* renamed from: d */
    public a f12341d;

    /* renamed from: e */
    public int f12342e;

    /* renamed from: f */
    public int f12343f;

    /* renamed from: g */
    public String f12344g;

    /* renamed from: h */
    public String f12345h;

    /* renamed from: i */
    public String f12346i;

    /* renamed from: j */
    public String f12347j;

    /* renamed from: bo.x0$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        public String f12348a;

        /* renamed from: b */
        public int f12349b;

        /* renamed from: c */
        public int f12350c;

        /* renamed from: d */
        public int f12351d;

        /* renamed from: e */
        public int f12352e;

        /* renamed from: f */
        public String f12353f;

        public a(JSONObject jSONObject) {
            String str;
            int i11;
            int i12;
            int i13;
            this.f12348a = "";
            this.f12349b = 0;
            this.f12350c = 0;
            this.f12353f = "";
            if (jSONObject == null) {
                return;
            }
            try {
                if (jSONObject.isNull("gift")) {
                    str = "";
                } else {
                    str = jSONObject.getString("gift");
                }
                this.f12348a = str;
                this.f12353f = jSONObject.isNull("thumb") ? "" : jSONObject.getString("thumb");
                if (!jSONObject.isNull("width")) {
                    i11 = jSONObject.getInt("width");
                } else {
                    i11 = 0;
                }
                this.f12349b = i11;
                if (!jSONObject.isNull("height")) {
                    i12 = jSONObject.getInt("height");
                } else {
                    i12 = 0;
                }
                this.f12350c = i12;
                if (!jSONObject.isNull("sticker_cate")) {
                    i13 = jSONObject.getInt("sticker_cate");
                } else {
                    i13 = 0;
                }
                this.f12351d = i13;
                this.f12352e = jSONObject.isNull("stickerId") ? 0 : jSONObject.getInt("stickerId");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C3055x0(JSONObject jSONObject) {
        long j11;
        String str;
        String str2;
        int i11;
        int i12;
        String string;
        String str3;
        String str4;
        this.f12338a = 43200L;
        this.f12339b = "";
        this.f12340c = "";
        this.f12341d = null;
        this.f12342e = 1;
        this.f12344g = "";
        this.f12345h = "";
        this.f12346i = "";
        this.f12347j = "";
        if (jSONObject == null) {
            return;
        }
        try {
            if (!jSONObject.isNull("expireTime")) {
                j11 = jSONObject.getLong("expireTime");
            } else {
                j11 = 43200;
            }
            this.f12338a = j11;
            if (jSONObject.isNull("title")) {
                str = "";
            } else {
                str = jSONObject.getString("title");
            }
            this.f12339b = str;
            if (jSONObject.isNull("description")) {
                str2 = "";
            } else {
                str2 = jSONObject.getString("description");
            }
            this.f12340c = str2;
            if (!jSONObject.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                i11 = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            } else {
                i11 = 1;
            }
            this.f12342e = i11;
            if (!jSONObject.isNull("shape")) {
                i12 = jSONObject.getInt("shape");
            } else {
                i12 = 1;
            }
            this.f12343f = i12;
            if (!jSONObject.isNull("btn_label")) {
                string = jSONObject.getString("btn_label");
            } else {
                string = MainApplication.getAppContext().getString(AbstractC8020f0.str_find_user);
            }
            this.f12344g = string;
            if (jSONObject.isNull("btn_action")) {
                str3 = "";
            } else {
                str3 = jSONObject.getString("btn_action");
            }
            this.f12345h = str3;
            if (jSONObject.isNull("btn_data")) {
                str4 = "";
            } else {
                str4 = jSONObject.getString("btn_data");
            }
            this.f12347j = str4;
            this.f12346i = jSONObject.isNull("background") ? "" : jSONObject.getString("background");
            JSONObject jSONObject2 = jSONObject.isNull("attached") ? null : jSONObject.getJSONObject("attached");
            if (jSONObject2 != null) {
                this.f12341d = new a(jSONObject2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
