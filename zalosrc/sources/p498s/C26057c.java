package p498s;

import org.json.JSONException;
import org.json.JSONObject;
import p562v.AbstractC27390c;
import p562v.AbstractC27392e;

/* renamed from: s.c */
/* loaded from: classes2.dex */
public final class C26057c {

    /* renamed from: a */
    private final boolean f124219a;

    /* renamed from: b */
    private final Float f124220b;

    /* renamed from: c */
    private final boolean f124221c;

    /* renamed from: d */
    private final EnumC26056b f124222d;

    private C26057c(boolean z11, Float f11, boolean z12, EnumC26056b enumC26056b) {
        this.f124219a = z11;
        this.f124220b = f11;
        this.f124221c = z12;
        this.f124222d = enumC26056b;
    }

    /* renamed from: b */
    public static C26057c m134160b(float f11, boolean z11, EnumC26056b enumC26056b) {
        AbstractC27392e.m140336b(enumC26056b, "Position is null");
        return new C26057c(true, Float.valueOf(f11), z11, enumC26056b);
    }

    /* renamed from: c */
    public static C26057c m134161c(boolean z11, EnumC26056b enumC26056b) {
        AbstractC27392e.m140336b(enumC26056b, "Position is null");
        return new C26057c(false, null, z11, enumC26056b);
    }

    /* renamed from: a */
    public JSONObject m134162a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f124219a);
            if (this.f124219a) {
                jSONObject.put("skipOffset", this.f124220b);
            }
            jSONObject.put("autoPlay", this.f124221c);
            jSONObject.put("position", this.f124222d);
        } catch (JSONException e11) {
            AbstractC27390c.m140333b("VastProperties: JSON error", e11);
        }
        return jSONObject;
    }
}
