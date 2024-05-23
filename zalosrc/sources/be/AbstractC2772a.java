package be;

import hm0.C20096c;
import ho0.AbstractC20110a;
import java.util.Locale;
import jm0.InterfaceC21299i;
import org.json.JSONObject;
import p248iy.AbstractC20887g;

/* renamed from: be.a */
/* loaded from: classes3.dex */
public abstract class AbstractC2772a {

    /* renamed from: a */
    protected byte[] f10936a;

    /* renamed from: b */
    protected int f10937b;

    /* renamed from: d */
    protected int f10939d;

    /* renamed from: e */
    protected long f10940e;

    /* renamed from: f */
    protected int f10941f;

    /* renamed from: h */
    protected int f10943h;

    /* renamed from: i */
    protected int f10944i;

    /* renamed from: j */
    protected String f10945j;

    /* renamed from: k */
    protected short f10946k;

    /* renamed from: l */
    protected int f10947l;

    /* renamed from: c */
    protected long f10938c = 0;

    /* renamed from: g */
    String f10942g = "";

    /* renamed from: m */
    public int f10948m = 0;

    /* renamed from: n */
    protected int f10949n = 0;

    /* renamed from: o */
    protected int f10950o = 0;

    /* renamed from: p */
    int f10951p = 0;

    /* renamed from: q */
    public int f10952q = 0;

    /* renamed from: r */
    public InterfaceC21299i f10953r = new a();

    /* renamed from: be.a$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC21299i {
        a() {
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC20110a.m104535d("upload chunk: %s", c20096c);
            if (c20096c.m104491c() != -17 && c20096c.m104491c() != -18 && c20096c.m104491c() != -19 && c20096c.m104491c() != -20 && c20096c.m104491c() != -69 && c20096c.m104491c() != -70) {
                AbstractC2772a.this.f10949n = 2;
            } else {
                AbstractC2772a.this.f10948m = c20096c.m104491c();
                AbstractC2772a.this.f10949n = 6;
            }
            AbstractC2772a abstractC2772a = AbstractC2772a.this;
            abstractC2772a.f10950o++;
            if (abstractC2772a.f10946k == 761 && abstractC2772a.f10941f != -1) {
                AbstractC20887g.m109237o(240319001);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            try {
                AbstractC20110a.m104535d("upload chunk: %s", jSONObject);
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                int i11 = jSONObject2.getInt("error_code");
                if (i11 != 0 && i11 != 1) {
                    AbstractC2772a abstractC2772a = AbstractC2772a.this;
                    abstractC2772a.f10948m = i11;
                    abstractC2772a.f10949n = 6;
                    return;
                }
                JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("data"));
                if (jSONObject3.has("isNew") && jSONObject3.getInt("isNew") == 1) {
                    AbstractC2772a abstractC2772a2 = AbstractC2772a.this;
                    if (abstractC2772a2.f10951p == 1) {
                        abstractC2772a2.f10949n = 5;
                        abstractC2772a2.f10951p = 0;
                        return;
                    }
                }
                if (jSONObject3.has("isNew") && jSONObject3.getInt("isNew") == 1) {
                    AbstractC2772a.this.f10951p = 1;
                }
                if ((jSONObject3.has("isFinish") && jSONObject3.getBoolean("isFinish")) || jSONObject3.optBoolean("isFinishTsFile")) {
                    AbstractC2772a abstractC2772a3 = AbstractC2772a.this;
                    abstractC2772a3.f10949n = 4;
                    abstractC2772a3.f10942g = jSONObject.toString();
                    AbstractC2772a abstractC2772a4 = AbstractC2772a.this;
                    if (abstractC2772a4.f10946k == 761 && abstractC2772a4.f10941f != -1) {
                        AbstractC20887g.m109245w(240319001);
                        return;
                    }
                    return;
                }
                if ((jSONObject3.has("isFinish") && !jSONObject3.getBoolean("isFinish")) || (jSONObject3.has("isFinishTsFile") && !jSONObject3.getBoolean("isFinishTsFile"))) {
                    AbstractC2772a.this.f10949n = 3;
                } else {
                    AbstractC2772a.this.f10949n = 2;
                }
            } catch (Exception e11) {
                AbstractC2772a.this.f10949n = 2;
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    public AbstractC2772a(byte[] bArr, int i11, int i12, long j11, int i13, String str, int i14, String str2, short s7, int i15) {
        this.f10947l = -1;
        this.f10936a = bArr;
        this.f10937b = i11;
        this.f10939d = i12;
        this.f10940e = j11;
        this.f10941f = i13;
        this.f10943h = Integer.parseInt(str);
        this.f10944i = i14;
        this.f10945j = str2;
        this.f10946k = s7;
        this.f10947l = i15;
    }

    /* renamed from: a */
    public abstract void mo13330a();

    /* renamed from: b */
    public String m13331b() {
        return this.f10942g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public String m13332c() {
        try {
            return String.format(Locale.getDefault(), "fileId(%d) chunk(%d/%d)", Integer.valueOf(this.f10939d), Integer.valueOf(this.f10937b), Integer.valueOf(this.f10941f));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public byte[] m13333d() {
        return this.f10936a;
    }

    /* renamed from: e */
    public int m13334e() {
        return this.f10949n;
    }
}
