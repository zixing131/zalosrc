package dj;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import hu.AbstractC20130d;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import mm0.AbstractC23352g;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: dj.p0 */
/* loaded from: classes3.dex */
public class C17990p0 extends C17969i0 implements InterfaceC17973j1 {

    /* renamed from: B */
    public long f91113B;

    /* renamed from: C */
    public String f91114C;

    /* renamed from: D */
    public String f91115D;

    /* renamed from: E */
    public String f91116E;

    /* renamed from: F */
    public boolean f91117F;

    /* renamed from: G */
    public String f91118G;

    /* renamed from: H */
    public String f91119H;

    /* renamed from: I */
    public int f91120I;

    /* renamed from: J */
    public int f91121J;

    /* renamed from: K */
    public long f91122K;

    /* renamed from: L */
    public int f91123L;

    /* renamed from: M */
    public String f91124M;

    /* renamed from: N */
    public int f91125N;

    /* renamed from: O */
    public long f91126O;

    /* renamed from: P */
    public long f91127P;

    public C17990p0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f91115D = "";
        this.f91116E = "";
        this.f91118G = "";
        this.f91119H = "";
        this.f91123L = 1;
        this.f91124M = "";
        this.f91125N = 0;
        this.f91127P = 0L;
        m95665l();
    }

    /* renamed from: l */
    private void m95665l() {
        String str;
        String str2;
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                if (jSONObject.has("fileSize")) {
                    str = "fdata";
                    str2 = "fType";
                    this.f91113B = AbstractC18069a.m96087f(jSONObject, "fileSize");
                } else {
                    str = "fdata";
                    str2 = "fType";
                }
                if (jSONObject.has("checksum")) {
                    this.f91114C = AbstractC18069a.m96089h(jSONObject, "checksum");
                }
                if (jSONObject.has("fileExt")) {
                    this.f91115D = AbstractC18069a.m96089h(jSONObject, "fileExt");
                }
                if (jSONObject.has("fileUrlToRenew")) {
                    this.f91118G = AbstractC18069a.m96089h(jSONObject, "fileUrlToRenew");
                }
                if (jSONObject.has("thumbUrlToRenew")) {
                    this.f91119H = AbstractC18069a.m96089h(jSONObject, "thumbUrlToRenew");
                }
                if (jSONObject.has("thumbLocalPath")) {
                    this.f91116E = AbstractC18069a.m96089h(jSONObject, "thumbLocalPath");
                }
                if (jSONObject.has("tWidth")) {
                    this.f91120I = AbstractC18069a.m96085d(jSONObject, "tWidth");
                }
                if (jSONObject.has("tHeight")) {
                    this.f91121J = AbstractC18069a.m96085d(jSONObject, "tHeight");
                }
                if (jSONObject.has("thumbSize")) {
                    this.f91126O = AbstractC18069a.m96087f(jSONObject, "thumbSize");
                }
                if (jSONObject.has("duration")) {
                    this.f91122K = AbstractC18069a.m96085d(jSONObject, "duration");
                }
                String str3 = str2;
                if (jSONObject.has(str3)) {
                    this.f91123L = AbstractC18069a.m96085d(jSONObject, str3);
                }
                String str4 = str;
                if (jSONObject.has(str4)) {
                    String m96089h = AbstractC18069a.m96089h(jSONObject, str4);
                    this.f91124M = m96089h;
                    if (!TextUtils.isEmpty(m96089h)) {
                        JSONObject jSONObject2 = new JSONObject(this.f91124M);
                        if (jSONObject2.has("total")) {
                            this.f91125N = AbstractC18069a.m96085d(jSONObject2, "total");
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // dj.InterfaceC17973j1
    /* renamed from: a */
    public String mo95470a() {
        return this.f91118G;
    }

    /* renamed from: g */
    public String m95666g() {
        if (TextUtils.isEmpty(this.f91114C)) {
            return "";
        }
        return AbstractC20130d.m104873h0(false) + AbstractC23352g.m122788d(this.f91114C) + ".jpg";
    }

    /* renamed from: h */
    public String m95667h() {
        if (this.f91115D.isEmpty()) {
            return this.f91011p;
        }
        String str = this.f91011p;
        int lastIndexOf = str.lastIndexOf(this.f91115D);
        if (lastIndexOf > 0 && this.f91115D.length() + lastIndexOf == this.f91011p.length()) {
            return this.f91011p.substring(0, lastIndexOf - 1);
        }
        return str;
    }

    /* renamed from: i */
    public String m95668i() {
        String str = "";
        if (this.f91123L != 2) {
            return "";
        }
        if (this.f91113B > 0) {
            str = "" + AbstractC23041d2.m118226y(this.f91113B);
        }
        if (this.f91125N > 0) {
            return str + " • " + String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_folder_items), Integer.valueOf(this.f91125N));
        }
        return str;
    }

    /* renamed from: j */
    public String m95669j() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileSize", String.valueOf(this.f91113B));
            jSONObject.put("checksum", this.f91114C);
            jSONObject.put("fileExt", this.f91115D);
            jSONObject.put("tWidth", this.f91120I);
            jSONObject.put("tHeight", this.f91121J);
            jSONObject.put("duration", this.f91122K);
            jSONObject.put("fType", this.f91123L);
            jSONObject.put("fdata", this.f91124M);
            long j11 = this.f91126O;
            if (j11 > 0) {
                jSONObject.put("thumbSize", j11);
            }
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: k */
    public boolean m95670k() {
        return this.f91123L == 2;
    }

    /* renamed from: m */
    public void m95671m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fileSize", String.valueOf(this.f91113B));
            jSONObject.put("checksum", this.f91114C);
            jSONObject.put("fileExt", this.f91115D);
            jSONObject.put("fileUrlToRenew", this.f91118G);
            jSONObject.put("thumbLocalPath", this.f91116E);
            jSONObject.put("thumbUrlToRenew", this.f91119H);
            int i11 = this.f91120I;
            if (i11 > 0 && this.f91121J > 0) {
                jSONObject.put("tWidth", i11);
                jSONObject.put("tHeight", this.f91121J);
            }
            long j11 = this.f91122K;
            if (j11 > 0) {
                jSONObject.put("duration", j11);
            }
            jSONObject.put("fType", this.f91123L);
            jSONObject.put("fdata", this.f91124M);
            long j12 = this.f91126O;
            if (j12 > 0) {
                jSONObject.put("thumbSize", j12);
            }
            this.f91017v = jSONObject.toString();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public C17990p0(JSONObject jSONObject) {
        super(jSONObject);
        this.f91115D = "";
        this.f91116E = "";
        this.f91118G = "";
        this.f91119H = "";
        this.f91123L = 1;
        this.f91124M = "";
        this.f91125N = 0;
        this.f91127P = 0L;
        m95665l();
    }
}
