package l30;

import android.text.TextUtils;
import is.AbstractC20833z;
import is.C20830x0;
import org.json.JSONException;
import org.json.JSONObject;
import p020ak.C0884c;
import p348mi.AbstractC23309i;
import p363nh.C23744a;

/* renamed from: l30.a0 */
/* loaded from: classes5.dex */
public class C22013a0 {

    /* renamed from: p */
    public static C22013a0 f108383p;

    /* renamed from: q */
    private static int f108384q;

    /* renamed from: j */
    public a f108394j;

    /* renamed from: o */
    public C0884c f108399o;

    /* renamed from: a */
    public int f108385a = 0;

    /* renamed from: b */
    public int f108386b = 0;

    /* renamed from: c */
    public int f108387c = 0;

    /* renamed from: d */
    public int f108388d = 0;

    /* renamed from: e */
    public int f108389e = 0;

    /* renamed from: f */
    public int f108390f = 1;

    /* renamed from: g */
    public int f108391g = 1;

    /* renamed from: h */
    public int f108392h = 0;

    /* renamed from: i */
    public int f108393i = 0;

    /* renamed from: k */
    public int f108395k = 1;

    /* renamed from: l */
    public long f108396l = 86400;

    /* renamed from: m */
    public long f108397m = 10800;

    /* renamed from: n */
    public long f108398n = 86400;

    /* renamed from: l30.a0$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        public String f108400a;

        /* renamed from: b */
        public String f108401b;

        /* renamed from: c */
        public String f108402c;

        /* renamed from: d */
        public String f108403d;

        /* renamed from: e */
        public boolean f108404e;

        public a(JSONObject jSONObject) {
            this.f108404e = false;
            if (jSONObject != null) {
                if (jSONObject.has("thumb")) {
                    this.f108400a = jSONObject.optString("thumb");
                }
                if (jSONObject.has("addBtnTxt")) {
                    this.f108401b = jSONObject.optString("addBtnTxt");
                }
                if (jSONObject.has("title")) {
                    this.f108402c = jSONObject.optString("title");
                }
                if (jSONObject.has("desc")) {
                    this.f108403d = jSONObject.optString("desc");
                }
                this.f108404e = true;
            }
        }

        /* renamed from: a */
        public JSONObject m114936a() {
            if (this.f108404e) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("thumb", this.f108400a);
                    jSONObject.put("addBtnTxt", this.f108401b);
                    jSONObject.put("title", this.f108402c);
                    jSONObject.put("desc", this.f108403d);
                    return null;
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    return null;
                }
            }
            return null;
        }
    }

    private C22013a0() {
        try {
            String m122315qc = AbstractC23309i.m122315qc();
            if (!TextUtils.isEmpty(m122315qc)) {
                m114934l(new JSONObject(m122315qc));
                m114933k();
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static int m114923b() {
        return f108384q;
    }

    /* renamed from: c */
    public static synchronized C22013a0 m114924c() {
        C22013a0 c22013a0;
        synchronized (C22013a0.class) {
            try {
                if (f108383p == null) {
                    f108383p = new C22013a0();
                }
                c22013a0 = f108383p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c22013a0;
    }

    /* renamed from: d */
    public static int m114925d() {
        int m122352rc = AbstractC23309i.m122352rc();
        f108384q = m122352rc;
        return m122352rc;
    }

    /* renamed from: e */
    public static int m114926e() {
        return 86400;
    }

    /* renamed from: f */
    public static void m114927f(int i11) {
        AbstractC23309i.m120955Fx(i11);
        if (i11 != 0) {
            C20830x0.f102390a.m108871o(0);
            AbstractC20833z.m108895J();
        }
        C23744a.m124114c().m124116d(3005, new Object[0]);
    }

    /* renamed from: g */
    public static boolean m114928g() {
        return AbstractC23309i.m122417t3();
    }

    /* renamed from: i */
    public static boolean m114929i() {
        if (m114925d() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m114930j() {
        if (m114925d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m114931a() {
        this.f108394j = null;
        m114935m();
    }

    /* renamed from: h */
    public boolean m114932h(int i11) {
        switch (i11) {
            case 0:
                return this.f108386b == 1;
            case 1:
                return this.f108387c == 1;
            case 2:
                return this.f108388d == 1;
            case 3:
                return this.f108389e == 1;
            case 4:
                return this.f108390f == 1;
            case 5:
                return this.f108391g == 1;
            case 6:
                return this.f108392h == 1;
            default:
                return false;
        }
    }

    /* renamed from: k */
    public void m114933k() {
        this.f108399o = null;
        this.f108399o = C0884c.m2727a(AbstractC23309i.m122389sc());
    }

    /* renamed from: l */
    public void m114934l(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("addBtnStyle")) {
                    this.f108385a = jSONObject.optInt("addBtnStyle");
                }
                if (jSONObject.has("useLocalStoryFeed")) {
                    this.f108386b = jSONObject.optInt("useLocalStoryFeed");
                }
                if (jSONObject.has("useLocalStoryLBS")) {
                    this.f108387c = jSONObject.optInt("useLocalStoryLBS");
                }
                if (jSONObject.has("useLocalStorySearch")) {
                    this.f108388d = jSONObject.optInt("useLocalStorySearch");
                }
                if (jSONObject.has("useLocalStoryContact")) {
                    this.f108389e = jSONObject.optInt("useLocalStoryContact");
                }
                if (jSONObject.has("useLocalStoryListViewer")) {
                    this.f108390f = jSONObject.optInt("useLocalStoryListViewer");
                }
                if (jSONObject.has("useLocalStoryMessage")) {
                    this.f108391g = jSONObject.optInt("useLocalStoryMessage");
                }
                if (jSONObject.has("useLocalStoryOther")) {
                    this.f108392h = jSONObject.optInt("useLocalStoryOther");
                }
                if (jSONObject.has("usePopulateStoryAvatar")) {
                    this.f108393i = jSONObject.optInt("usePopulateStoryAvatar");
                }
                if (jSONObject.has("emptySection") && jSONObject.optJSONObject("emptySection") != null) {
                    this.f108394j = new a(jSONObject.optJSONObject("emptySection"));
                }
                if (jSONObject.has("storyFeedRefreshTime")) {
                    this.f108396l = jSONObject.optLong("storyFeedRefreshTime");
                }
                if (jSONObject.has("storyFeedDelayTime")) {
                    this.f108397m = jSONObject.optLong("storyFeedDelayTime");
                }
                if (jSONObject.has("storyFeedHiddenDuration")) {
                    this.f108398n = jSONObject.optLong("storyFeedHiddenDuration");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: m */
    public void m114935m() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("addBtnStyle", this.f108385a);
            jSONObject.put("useLocalStoryFeed", this.f108386b);
            jSONObject.put("useLocalStoryLBS", this.f108387c);
            jSONObject.put("useLocalStorySearch", this.f108388d);
            jSONObject.put("useLocalStoryContact", this.f108389e);
            jSONObject.put("useLocalStoryListViewer", this.f108390f);
            jSONObject.put("useLocalStoryMessage", this.f108391g);
            jSONObject.put("useLocalStoryOther", this.f108392h);
            jSONObject.put("usePopulateStoryAvatar", this.f108393i);
            a aVar = this.f108394j;
            if (aVar != null) {
                jSONObject.put("emptySection", aVar.m114936a());
            }
            jSONObject.put("storyFeedRefreshTime", this.f108396l);
            jSONObject.put("storyFeedDelayTime", this.f108397m);
            jSONObject.put("storyFeedHiddenDuration", this.f108398n);
            AbstractC23309i.m120918Ex(jSONObject.toString());
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
