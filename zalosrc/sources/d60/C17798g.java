package d60;

import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: d60.g */
/* loaded from: classes5.dex */
public final class C17798g {

    /* renamed from: b */
    private long f90015b;

    /* renamed from: c */
    private long f90016c;

    /* renamed from: d */
    private long f90017d;

    /* renamed from: e */
    private long f90018e;

    /* renamed from: h */
    private long f90021h;

    /* renamed from: i */
    private long f90022i;

    /* renamed from: j */
    private long f90023j;

    /* renamed from: l */
    private boolean f90025l;

    /* renamed from: a */
    private String f90014a = "";

    /* renamed from: f */
    private boolean f90019f = true;

    /* renamed from: g */
    private boolean f90020g = true;

    /* renamed from: k */
    private int f90024k = -1;

    /* renamed from: a */
    public final boolean m94013a() {
        return this.f90025l;
    }

    /* renamed from: b */
    public final String m94014b() {
        return this.f90014a;
    }

    /* renamed from: c */
    public final boolean m94015c() {
        return (this.f90015b == 0 || this.f90016c == 0 || this.f90017d == 0 || this.f90018e == 0) ? false : true;
    }

    /* renamed from: d */
    public final void m94016d(boolean z11) {
        this.f90019f = z11;
    }

    /* renamed from: e */
    public final void m94017e(long j11) {
        this.f90017d = j11;
    }

    /* renamed from: f */
    public final void m94018f(long j11) {
        this.f90021h = j11;
    }

    /* renamed from: g */
    public final void m94019g(boolean z11) {
        this.f90020g = z11;
    }

    /* renamed from: h */
    public final void m94020h(long j11) {
        this.f90023j = j11;
    }

    /* renamed from: i */
    public final void m94021i(long j11) {
        this.f90016c = j11;
    }

    /* renamed from: j */
    public final void m94022j(long j11) {
        this.f90022i = j11;
    }

    /* renamed from: k */
    public final void m94023k(int i11) {
        this.f90024k = i11;
    }

    /* renamed from: l */
    public final void m94024l(long j11) {
        this.f90018e = j11;
    }

    /* renamed from: m */
    public final void m94025m(long j11) {
        this.f90015b = j11;
    }

    /* renamed from: n */
    public final void m94026n(boolean z11) {
        this.f90025l = z11;
    }

    /* renamed from: o */
    public final void m94027o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f90014a = str;
    }

    /* renamed from: p */
    public final String m94028p() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f90014a);
            jSONObject.put("ts_open_csc", this.f90015b);
            jSONObject.put("ts_load_msg", this.f90016c);
            jSONObject.put("ts_load_msg_done", this.f90017d);
            jSONObject.put("ts_msg_visible", this.f90018e);
            jSONObject.put("load_1st", this.f90019f);
            jSONObject.put("has_jump_msg", this.f90020g);
            jSONObject.put("src_msg_visible", 1);
            long j11 = this.f90021h;
            if (j11 > 0) {
                jSONObject.put("ts_get_offline_threads", j11);
            }
            long j12 = this.f90022i;
            if (j12 > 0) {
                jSONObject.put("ts_load_msg_preview_done", j12);
            }
            long j13 = this.f90023j;
            if (j13 > 0) {
                jSONObject.put("ts_insert_msg_preview_done", j13);
            }
            int i11 = this.f90024k;
            if (i11 >= 0) {
                jSONObject.put("is_loading_visible_gap", i11);
            }
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100205c(jSONObject2);
            return jSONObject2;
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }
}
