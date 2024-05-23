package p549uj;

import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: uj.a */
/* loaded from: classes3.dex */
public abstract class AbstractC27282a {

    /* renamed from: a */
    private String f128352a;

    /* renamed from: b */
    private String f128353b;

    /* renamed from: c */
    private String f128354c;

    /* renamed from: d */
    protected int f128355d;

    /* renamed from: e */
    private a f128356e;

    /* renamed from: f */
    private boolean f128357f;

    /* renamed from: g */
    private String f128358g;

    /* renamed from: uj.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f128359a;

        /* renamed from: b */
        public String f128360b;

        /* renamed from: c */
        public String f128361c;

        /* renamed from: d */
        public String f128362d;

        /* renamed from: e */
        public String f128363e;

        public a(String str) {
            JSONObject jSONObject;
            try {
                if (!TextUtils.isEmpty(str)) {
                    JSONArray jSONArray = new JSONArray(str);
                    if (jSONArray.length() > 0 && (jSONObject = jSONArray.getJSONObject(0)) != null) {
                        this.f128363e = AbstractC18069a.m96089h(jSONObject, "content");
                        if (jSONObject.has("popup")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("popup");
                            this.f128359a = AbstractC18069a.m96089h(jSONObject2, "title");
                            this.f128360b = AbstractC18069a.m96089h(jSONObject2, "desc");
                            this.f128361c = "";
                            this.f128362d = "";
                            if (jSONObject2.has("buttons")) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("buttons");
                                if (jSONObject3.has("ok")) {
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("ok");
                                    if (jSONObject4.has("label")) {
                                        this.f128361c = AbstractC18069a.m96089h(jSONObject4, "label");
                                    }
                                }
                                if (TextUtils.isEmpty(this.f128361c)) {
                                    this.f128361c = "Yes";
                                }
                                if (jSONObject3.has("cancel")) {
                                    JSONObject jSONObject5 = jSONObject3.getJSONObject("cancel");
                                    if (jSONObject5.has("label")) {
                                        this.f128362d = AbstractC18069a.m96089h(jSONObject5, "label");
                                    }
                                }
                                if (TextUtils.isEmpty(this.f128362d)) {
                                    this.f128362d = "No";
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: a */
        public boolean m139677a() {
            if (!TextUtils.isEmpty(this.f128359a) && !TextUtils.isEmpty(this.f128360b)) {
                return true;
            }
            return false;
        }
    }

    public AbstractC27282a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("menu_id")) {
                this.f128352a = AbstractC18069a.m96089h(jSONObject, "menu_id");
            }
            if (jSONObject.has("menu_type")) {
                this.f128355d = AbstractC18069a.m96085d(jSONObject, "menu_type");
            }
            if (jSONObject.has("name")) {
                this.f128353b = AbstractC18069a.m96089h(jSONObject, "name");
            }
            if (jSONObject.has("is_tracking")) {
                this.f128357f = AbstractC18069a.m96083b(jSONObject, "is_tracking");
            }
            if (jSONObject.has("id_tracking")) {
                this.f128358g = AbstractC18069a.m96089h(jSONObject, "id_tracking");
            }
            if (jSONObject.has("data")) {
                this.f128354c = AbstractC18069a.m96089h(jSONObject, "data");
            }
            if (jSONObject.has("data_popup")) {
                String m96089h = AbstractC18069a.m96089h(jSONObject, "data_popup");
                if (!TextUtils.isEmpty(m96089h)) {
                    this.f128356e = new a(m96089h);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public String m139669a() {
        return this.f128354c;
    }

    /* renamed from: b */
    public String m139670b() {
        return this.f128352a;
    }

    /* renamed from: c */
    public int m139671c() {
        return this.f128355d;
    }

    /* renamed from: d */
    public String m139672d() {
        return this.f128353b;
    }

    /* renamed from: e */
    public a m139673e() {
        return this.f128356e;
    }

    /* renamed from: f */
    public String m139674f() {
        String str = this.f128358g;
        return str == null ? "" : str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002b A[RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m139675g() {
        boolean z11 = false;
        try {
            int i11 = this.f128355d;
            if (i11 != 10 && i11 != 11 && i11 != 20 && i11 != 21) {
                if (i11 != 30) {
                    switch (i11) {
                        case 40:
                        case 43:
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                        case 42:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            return true;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                            if (TextUtils.isEmpty(this.f128354c)) {
                                return false;
                            }
                            return true;
                        default:
                            switch (i11) {
                                case 51:
                                case 54:
                                    break;
                                case 52:
                                case 53:
                                    break;
                                default:
                                    return false;
                            }
                    }
                } else {
                    if (TextUtils.isEmpty(this.f128354c)) {
                        return false;
                    }
                    try {
                        z11 = TextUtils.isEmpty(AbstractC18069a.m96089h(new JSONObject(this.f128354c), "android"));
                        return !z11;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return false;
                    }
                }
            }
            return !TextUtils.isEmpty(this.f128354c);
        } catch (Exception e12) {
            e12.printStackTrace();
            return z11;
        }
    }

    /* renamed from: h */
    public boolean m139676h() {
        return this.f128357f;
    }
}
