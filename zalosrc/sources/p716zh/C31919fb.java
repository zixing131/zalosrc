package p716zh;

import android.text.TextUtils;
import org.json.JSONObject;
import p683yj.AbstractC30996a;

/* renamed from: zh.fb */
/* loaded from: classes3.dex */
public class C31919fb extends AbstractC30996a {
    public C31919fb(JSONObject jSONObject) {
        super(jSONObject);
        this.f142977f = this.f142972a;
    }

    @Override // p683yj.AbstractC30996a
    /* renamed from: c */
    protected String mo150659c() {
        if (TextUtils.isEmpty(this.f142972a)) {
            return "";
        }
        return this.f142972a;
    }

    @Override // p683yj.AbstractC30996a
    /* renamed from: g */
    public int mo150663g() {
        return 1;
    }
}
