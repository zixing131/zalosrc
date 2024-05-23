package vg;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ho0.AbstractC20110a;
import nh0.C23793c;
import org.json.JSONException;
import org.json.JSONObject;
import p133ek.AbstractC18458a;

/* renamed from: vg.v6 */
/* loaded from: classes3.dex */
public class C28212v6 {

    /* renamed from: a */
    public int f131575a;

    /* renamed from: b */
    public int f131576b;

    /* renamed from: c */
    public String f131577c;

    /* renamed from: d */
    public long f131578d;

    /* renamed from: e */
    public boolean f131579e;

    /* renamed from: f */
    public boolean f131580f;

    /* renamed from: g */
    public String f131581g;

    /* renamed from: h */
    public CharSequence f131582h;

    /* renamed from: i */
    public String f131583i;

    /* renamed from: j */
    public a f131584j;

    /* renamed from: k */
    public String f131585k;

    /* renamed from: l */
    public String f131586l;

    /* renamed from: m */
    public long f131587m;

    /* renamed from: n */
    public long f131588n;

    /* renamed from: o */
    public InterfaceC28231x7 f131589o;

    /* renamed from: p */
    public int f131590p;

    /* renamed from: q */
    public boolean f131591q;

    /* renamed from: r */
    public long f131592r;

    /* renamed from: s */
    public boolean f131593s;

    /* renamed from: t */
    public boolean f131594t;

    /* renamed from: u */
    String f131595u;

    /* renamed from: vg.v6$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public int f131596a;

        /* renamed from: b */
        public String f131597b;

        /* renamed from: c */
        public int f131598c;

        /* renamed from: d */
        public int f131599d;

        /* renamed from: e */
        public String f131600e;

        /* renamed from: f */
        public String f131601f;

        /* renamed from: g */
        public int f131602g;

        public a() {
            this.f131602g = 0;
        }

        /* renamed from: a */
        public boolean m142172a() {
            if (TextUtils.isEmpty(this.f131597b) && TextUtils.isEmpty(this.f131600e) && TextUtils.isEmpty(this.f131601f)) {
                return false;
            }
            return true;
        }

        public String toString() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f131596a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f131597b);
                jSONObject2.put("width", this.f131598c);
                jSONObject2.put("height", this.f131599d);
                if (!TextUtils.isEmpty(this.f131600e)) {
                    jSONObject2.put("assetFilePath", this.f131600e);
                }
                if (!TextUtils.isEmpty(this.f131601f)) {
                    jSONObject2.put("pngResourceName", this.f131601f);
                }
                int i11 = this.f131602g;
                if (i11 != 0) {
                    jSONObject2.put("pngResourceTintColor", i11);
                }
                jSONObject.put("content", jSONObject2);
                return jSONObject.toString();
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }

        public a(JSONObject jSONObject) {
            this.f131602g = 0;
            try {
                if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                    this.f131596a = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                }
                if (jSONObject.has("content")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("content");
                    if (optJSONObject.has(ZMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                        this.f131597b = optJSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                    }
                    if (optJSONObject.has("width")) {
                        this.f131598c = optJSONObject.optInt("width");
                    }
                    if (optJSONObject.has("height")) {
                        this.f131599d = optJSONObject.optInt("height");
                    }
                    if (optJSONObject.has("assetFilePath")) {
                        this.f131600e = optJSONObject.optString("assetFilePath");
                    }
                    if (optJSONObject.has("pngResourceName")) {
                        this.f131601f = optJSONObject.optString("pngResourceName");
                    }
                    if (optJSONObject.has("pngResourceTintColor")) {
                        this.f131602g = optJSONObject.optInt("pngResourceTintColor");
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C28212v6() {
        this.f131582h = "";
        this.f131590p = 0;
        this.f131591q = false;
        this.f131592r = 0L;
        this.f131593s = false;
        this.f131594t = false;
        this.f131595u = "";
    }

    /* renamed from: i */
    private void m142161i(JSONObject jSONObject) {
        String str;
        a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        try {
            if (jSONObject.has("id")) {
                str = "forwardEvent";
                this.f131578d = jSONObject.optLong("id");
            } else {
                str = "forwardEvent";
            }
            if (jSONObject.has("showTip")) {
                if (jSONObject.optInt("showTip") == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f131579e = z13;
            }
            if (jSONObject.has("showReddot")) {
                if (jSONObject.optInt("showReddot") == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f131580f = z12;
            }
            if (jSONObject.has("tip")) {
                this.f131581g = jSONObject.optString("tip");
            }
            if (jSONObject.has("subTip")) {
                this.f131582h = jSONObject.optString("subTip");
            }
            if (jSONObject.has("tipIcon")) {
                this.f131584j = new a(jSONObject.optJSONObject("tipIcon"));
            }
            if (jSONObject.has("icon")) {
                this.f131585k = jSONObject.optString("icon");
            }
            if (jSONObject.has("startTime")) {
                this.f131587m = jSONObject.optLong("startTime");
            }
            if (jSONObject.has("endTime")) {
                this.f131588n = jSONObject.optLong("endTime");
            }
            if (jSONObject.has("tipType")) {
                this.f131590p = jSONObject.optInt("tipType");
            }
            if (jSONObject.has("tipDuration")) {
                this.f131592r = jSONObject.optLong("tipDuration");
            }
            if (jSONObject.has("groupId")) {
                this.f131586l = jSONObject.optString("groupId");
            }
            if (jSONObject.has("attach")) {
                this.f131589o = InterfaceC28231x7.Companion.m142189a(this.f131577c, jSONObject.optJSONObject("attach"));
            }
            String str2 = str;
            if (jSONObject.has(str2)) {
                if (jSONObject.optInt(str2) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f131591q = z11;
            }
            if (this.f131590p == 1 && this.f131592r > 0) {
                this.f131593s = true;
            }
            this.f131594t = jSONObject.optBoolean("tipHasShown");
            this.f131583i = jSONObject.optString("textResourceName");
            if (!m142166e() && ((aVar = this.f131584j) == null || !aVar.m142172a())) {
                this.f131579e = false;
            }
            if (jSONObject.has("version")) {
                this.f131576b = jSONObject.optInt("version");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public JSONObject m142162a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f131578d);
            jSONObject.put("showTip", this.f131579e ? 1 : 0);
            jSONObject.put("showReddot", this.f131580f ? 1 : 0);
            jSONObject.put("tip", this.f131581g);
            jSONObject.put("subTip", this.f131582h);
            if (this.f131584j != null) {
                jSONObject.put("tipIcon", new JSONObject(this.f131584j.toString()));
            }
            jSONObject.put("icon", this.f131585k);
            jSONObject.put("startTime", this.f131587m);
            jSONObject.put("endTime", this.f131588n);
            jSONObject.put("tipType", this.f131590p);
            jSONObject.put("tipDuration", this.f131592r);
            jSONObject.put("tipHasShown", this.f131594t);
            jSONObject.put("groupId", this.f131586l);
            if (!TextUtils.isEmpty(this.f131583i)) {
                jSONObject.put("textResourceName", this.f131583i);
            }
            InterfaceC28231x7 interfaceC28231x7 = this.f131589o;
            if (interfaceC28231x7 != null) {
                jSONObject.put("attach", interfaceC28231x7.mo141472a());
            }
            jSONObject.put("version", this.f131576b);
            jSONObject.put("forwardEvent", this.f131591q ? 1 : 0);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public JSONObject m142163b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("showTip", this.f131579e ? 1 : 0);
            jSONObject.put("showReddot", this.f131580f ? 1 : 0);
            if (this.f131595u != null) {
                jSONObject.put("content", new JSONObject(this.f131595u));
            }
            jSONObject.put("tipType", this.f131590p);
            jSONObject.put("tipDuration", this.f131592r);
            return jSONObject;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: c */
    public String m142164c() {
        return AbstractC28025b8.m141455k(this.f131577c);
    }

    /* renamed from: d */
    public boolean m142165d() {
        if (this.f131575a != 1) {
            return false;
        }
        if (this.f131588n >= C23793c.m124316k().mo124311f()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean m142166e() {
        if (TextUtils.isEmpty(this.f131581g) && TextUtils.isEmpty(this.f131583i) && TextUtils.isEmpty(this.f131582h)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m142167f() {
        if (this.f131575a == 1) {
            long j11 = this.f131587m;
            if (j11 <= 0) {
                return false;
            }
            long j12 = this.f131588n;
            if (j12 <= 0 || j11 > j12) {
                return false;
            }
            long mo124311f = C23793c.m124316k().mo124311f();
            if (this.f131587m > mo124311f || mo124311f > this.f131588n) {
                return false;
            }
            return true;
        }
        if (!this.f131579e && !this.f131580f) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean m142168g() {
        boolean z11;
        a aVar;
        if (this.f131579e && (m142166e() || ((aVar = this.f131584j) != null && aVar.m142172a()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = this.f131580f;
        boolean z13 = !TextUtils.isEmpty(this.f131585k);
        if (!m142165d() && (z11 || z12 || z13)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public boolean m142169h() {
        boolean z11;
        a aVar;
        if (this.f131579e && (m142166e() || ((aVar = this.f131584j) != null && aVar.m142172a()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = this.f131580f;
        boolean z13 = !TextUtils.isEmpty(this.f131585k);
        if (!m142167f()) {
            return false;
        }
        if (!z11 && !z12 && !z13) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void m142170j(JSONObject jSONObject) {
        boolean z11;
        if (jSONObject.has("id")) {
            this.f131578d = jSONObject.optLong("id");
        }
        boolean z12 = false;
        if (jSONObject.has("showTip")) {
            if (jSONObject.optInt("showTip") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f131579e = z11;
        }
        if (jSONObject.has("showReddot")) {
            if (jSONObject.optInt("showReddot") == 1) {
                z12 = true;
            }
            this.f131580f = z12;
        }
        if (jSONObject.has("content")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("content");
            this.f131595u = jSONObject.optString("content");
            if (optJSONObject != null) {
                String str = "vi";
                if (!TextUtils.equals(AbstractC18458a.f93019a, "vi")) {
                    str = "en";
                }
                this.f131581g = optJSONObject.optString(str);
            }
        }
        if (jSONObject.has("startTime")) {
            this.f131587m = jSONObject.optLong("startTime");
        }
        if (jSONObject.has("endTime")) {
            this.f131588n = jSONObject.optLong("endTime");
        }
        if (jSONObject.has("tipType")) {
            this.f131590p = jSONObject.optInt("tipType");
        }
        if (jSONObject.has("tipDuration")) {
            this.f131592r = jSONObject.optLong("tipDuration");
        }
        if (this.f131590p == 1 && this.f131592r > 0) {
            this.f131593s = true;
        }
    }

    /* renamed from: k */
    public void m142171k(int i11) {
        this.f131590p = i11;
        if (i11 == 0) {
            this.f131593s = false;
        }
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tipCat", this.f131577c);
            jSONObject.put("category", this.f131575a);
            jSONObject.put("tipData", m142162a());
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public C28212v6(JSONObject jSONObject) {
        this.f131582h = "";
        this.f131590p = 0;
        this.f131591q = false;
        this.f131592r = 0L;
        this.f131593s = false;
        this.f131594t = false;
        this.f131595u = "";
        try {
            this.f131575a = jSONObject.optInt("category", 1);
            if (jSONObject.has("tipCat")) {
                this.f131577c = jSONObject.optString("tipCat");
            }
            if (jSONObject.has("tipData")) {
                m142161i(jSONObject.optJSONObject("tipData"));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C28212v6(JSONObject jSONObject, String str) {
        this.f131582h = "";
        this.f131590p = 0;
        this.f131591q = false;
        this.f131592r = 0L;
        this.f131593s = false;
        this.f131594t = false;
        this.f131595u = "";
        try {
            this.f131577c = str;
            m142170j(jSONObject);
            this.f131575a = 0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C28212v6(String str) {
        this.f131582h = "";
        this.f131590p = 0;
        this.f131591q = false;
        this.f131592r = 0L;
        this.f131593s = false;
        this.f131594t = false;
        this.f131595u = "";
        this.f131581g = str;
        this.f131579e = true;
        this.f131575a = 0;
    }
}
