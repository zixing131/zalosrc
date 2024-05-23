package p683yj;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: yj.a */
/* loaded from: classes3.dex */
public abstract class AbstractC30996a {

    /* renamed from: a */
    protected String f142972a;

    /* renamed from: b */
    protected String f142973b;

    /* renamed from: c */
    protected int f142974c;

    /* renamed from: d */
    protected boolean f142975d;

    /* renamed from: e */
    protected boolean f142976e;

    /* renamed from: f */
    protected String f142977f;

    /* renamed from: g */
    protected int f142978g;

    public AbstractC30996a(String str, int i11) {
        this.f142973b = "";
        this.f142978g = 0;
        this.f142972a = str;
        this.f142974c = i11;
        this.f142975d = false;
        this.f142976e = true;
        this.f142977f = "";
    }

    /* renamed from: a */
    public boolean m150657a() {
        return this.f142976e;
    }

    /* renamed from: b */
    public String m150658b() {
        if (!TextUtils.isEmpty(this.f142973b)) {
            return this.f142973b;
        }
        String mo150659c = mo150659c();
        this.f142973b = mo150659c;
        return mo150659c;
    }

    /* renamed from: c */
    protected abstract String mo150659c();

    /* renamed from: d */
    public int m150660d() {
        return this.f142978g;
    }

    /* renamed from: e */
    public String m150661e() {
        return this.f142972a;
    }

    /* renamed from: f */
    public String m150662f() {
        return this.f142977f;
    }

    /* renamed from: g */
    public abstract int mo150663g();

    /* renamed from: h */
    public int m150664h() {
        return this.f142974c;
    }

    /* renamed from: i */
    public boolean m150665i() {
        return this.f142975d;
    }

    /* renamed from: j */
    public void m150666j(boolean z11) {
        this.f142976e = z11;
    }

    /* renamed from: k */
    public void m150667k(String str) {
        this.f142977f = str;
    }

    public AbstractC30996a(JSONObject jSONObject) {
        this.f142972a = "";
        this.f142973b = "";
        this.f142977f = "";
        this.f142978g = 0;
        try {
            if (jSONObject.has("kwd")) {
                this.f142972a = jSONObject.getString("kwd");
            }
            if (jSONObject.has("version")) {
                this.f142974c = jSONObject.getInt("version");
            }
            this.f142975d = jSONObject.optInt("suggest_after_send", 0) == 1;
            int optInt = jSONObject.optInt("auto_send_text", 0);
            this.f142978g = optInt;
            if (optInt < 0 || optInt > 2) {
                this.f142978g = 0;
            }
            this.f142976e = true;
            this.f142977f = "";
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
