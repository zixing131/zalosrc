package p170fv;

import android.graphics.Color;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: fv.d */
/* loaded from: classes4.dex */
public final class C19150d extends AbstractC19147a {

    /* renamed from: h */
    private final int f95189h;

    /* renamed from: i */
    private int f95190i;

    public C19150d(JSONObject jSONObject) {
        super(jSONObject);
        String str;
        int valueOf;
        this.f95189h = -1728053248;
        m100486r(3);
        if (jSONObject != null) {
            str = jSONObject.optString("backgroundColor", "");
        } else {
            str = null;
        }
        try {
            m100485q(m100473e());
            if (TextUtils.isEmpty(str)) {
                valueOf = -1728053248;
            } else {
                valueOf = Integer.valueOf(Color.parseColor(str));
            }
            m100481m(valueOf);
        } catch (IllegalArgumentException unused) {
            m100481m(Integer.valueOf(this.f95189h));
        }
        m100482n(jSONObject != null ? jSONObject.optInt("confirmToExit", 0) : 0);
        m100484p(jSONObject != null ? jSONObject.optString("dialogMessage", "") : null);
        this.f95190i = m100495t(jSONObject != null ? jSONObject.optInt("floatingAnchor", 1) : 1);
    }

    /* renamed from: s */
    public final int m100494s() {
        return this.f95190i;
    }

    /* renamed from: t */
    public final int m100495t(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        if (i11 != 3) {
            return i11 != 4 ? 1 : 4;
        }
        return 3;
    }
}
