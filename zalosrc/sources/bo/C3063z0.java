package bo;

import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.social.controls.C10866e;
import me0.C23212s8;
import org.json.JSONException;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p716zh.C31868c5;

/* renamed from: bo.z0 */
/* loaded from: classes4.dex */
public class C3063z0 extends C31868c5 {

    /* renamed from: c */
    private String f12378c;

    /* renamed from: d */
    private CharSequence f12379d;

    /* renamed from: e */
    private CharSequence f12380e;

    /* renamed from: f */
    private C10866e f12381f;

    /* renamed from: g */
    private boolean f12382g;

    /* renamed from: h */
    public String f12383h;

    /* renamed from: i */
    public boolean f12384i;

    public C3063z0(double d11, double d12, String str, boolean z11) {
        super(d11, d12);
        this.f12380e = null;
        this.f12384i = false;
        this.f12378c = str;
        this.f12382g = z11;
        m14726e();
    }

    /* renamed from: e */
    public void m14726e() {
        if (TextUtils.isEmpty(this.f12378c)) {
            return;
        }
        String str = String.format("<font color=#%s>%s</font>", Integer.toHexString(C23212s8.m119606n(AbstractC21196a.TextColor2) & 16777215), MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_feed_location_prefix)) + "<a href=zm://Feed_Location>" + this.f12378c + "</a>";
        Spanned fromHtml = Html.fromHtml(str);
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
        if (spans.length > 0) {
            for (Object obj : spans) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                int spanFlags = fromHtml.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    this.f12381f = c10866e;
                    c10866e.f54832J = 10;
                    c10866e.m56375S(true);
                    this.f12381f.m56366J(false);
                    spannableString.setSpan(this.f12381f, spanStart, spanEnd, spanFlags);
                } else if (obj instanceof ForegroundColorSpan) {
                    spannableString.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
            this.f12379d = spannableString;
            return;
        }
        this.f12379d = str.replaceAll("<br/>", "\n");
    }

    /* renamed from: f */
    public String m14727f() {
        return this.f12378c;
    }

    /* renamed from: g */
    public CharSequence m14728g() {
        return this.f12379d;
    }

    /* renamed from: h */
    public C10866e m14729h() {
        return this.f12381f;
    }

    /* renamed from: i */
    public CharSequence m14730i() {
        return this.f12380e;
    }

    /* renamed from: j */
    public boolean m14731j() {
        if (m153169a() == -1.0d && m153170b() == -1.0d && TextUtils.isEmpty(m14727f())) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void m14732k(boolean z11) {
        this.f12382g = z11;
    }

    /* renamed from: l */
    public void m14733l(CharSequence charSequence) {
        this.f12380e = charSequence;
    }

    /* renamed from: m */
    public JSONObject m14734m() {
        double m153170b;
        JSONObject jSONObject = new JSONObject();
        try {
            double d11 = 0.0d;
            if (Double.isNaN(m153170b())) {
                m153170b = 0.0d;
            } else {
                m153170b = m153170b();
            }
            jSONObject.put("lon", m153170b);
            if (!Double.isNaN(m153169a())) {
                d11 = m153169a();
            }
            jSONObject.put("lat", d11);
            String str = this.f12378c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("desc", str);
            jSONObject.put("fillColor", this.f12382g);
            jSONObject.put("enableThumb", this.f12384i ? 1 : 0);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C3063z0(String str, double d11, double d12, String str2, boolean z11) {
        super(d11, d12);
        this.f12380e = null;
        this.f12384i = false;
        this.f12383h = str;
        this.f12378c = str2;
        this.f12382g = z11;
        m14726e();
    }

    public C3063z0(JSONObject jSONObject) {
        this.f12380e = null;
        this.f12384i = false;
        m153172d(jSONObject.optDouble("lon", 0.0d));
        m153171c(jSONObject.optDouble("lat", 0.0d));
        this.f12378c = jSONObject.optString("desc");
        this.f12382g = jSONObject.optBoolean("fillColor");
        this.f12384i = jSONObject.optInt("enableThumb") == 1;
        m14726e();
    }
}
