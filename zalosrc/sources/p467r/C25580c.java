package p467r;

import org.json.JSONObject;
import p562v.AbstractC27389b;
import p562v.AbstractC27392e;

/* renamed from: r.c */
/* loaded from: classes2.dex */
public class C25580c {

    /* renamed from: a */
    private final EnumC25586i f122268a;

    /* renamed from: b */
    private final EnumC25586i f122269b;

    /* renamed from: c */
    private final boolean f122270c;

    /* renamed from: d */
    private final EnumC25583f f122271d;

    /* renamed from: e */
    private final EnumC25585h f122272e;

    private C25580c(EnumC25583f enumC25583f, EnumC25585h enumC25585h, EnumC25586i enumC25586i, EnumC25586i enumC25586i2, boolean z11) {
        this.f122271d = enumC25583f;
        this.f122272e = enumC25585h;
        this.f122268a = enumC25586i;
        if (enumC25586i2 == null) {
            this.f122269b = EnumC25586i.NONE;
        } else {
            this.f122269b = enumC25586i2;
        }
        this.f122270c = z11;
    }

    /* renamed from: a */
    public static C25580c m132139a(EnumC25583f enumC25583f, EnumC25585h enumC25585h, EnumC25586i enumC25586i, EnumC25586i enumC25586i2, boolean z11) {
        AbstractC27392e.m140336b(enumC25583f, "CreativeType is null");
        AbstractC27392e.m140336b(enumC25585h, "ImpressionType is null");
        AbstractC27392e.m140336b(enumC25586i, "Impression owner is null");
        AbstractC27392e.m140339e(enumC25586i, enumC25583f, enumC25585h);
        return new C25580c(enumC25583f, enumC25585h, enumC25586i, enumC25586i2, z11);
    }

    /* renamed from: b */
    public boolean m132140b() {
        return EnumC25586i.NATIVE == this.f122268a;
    }

    /* renamed from: c */
    public boolean m132141c() {
        return EnumC25586i.NATIVE == this.f122269b;
    }

    /* renamed from: d */
    public JSONObject m132142d() {
        JSONObject jSONObject = new JSONObject();
        AbstractC27389b.m140321f(jSONObject, "impressionOwner", this.f122268a);
        AbstractC27389b.m140321f(jSONObject, "mediaEventsOwner", this.f122269b);
        AbstractC27389b.m140321f(jSONObject, "creativeType", this.f122271d);
        AbstractC27389b.m140321f(jSONObject, "impressionType", this.f122272e);
        AbstractC27389b.m140321f(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f122270c));
        return jSONObject;
    }
}
