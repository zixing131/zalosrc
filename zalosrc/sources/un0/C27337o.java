package un0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;
import vn0.AbstractC28351w0;

/* renamed from: un0.o */
/* loaded from: classes7.dex */
public final class C27337o extends JsonPrimitive {

    /* renamed from: p */
    private final boolean f128618p;

    /* renamed from: q */
    private final SerialDescriptor f128619q;

    /* renamed from: r */
    private final String f128620r;

    public /* synthetic */ C27337o(Object obj, boolean z11, SerialDescriptor serialDescriptor, int i11, AbstractC19060k abstractC19060k) {
        this(obj, z11, (i11 & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: d */
    public String mo114124d() {
        return this.f128620r;
    }

    /* renamed from: e */
    public final SerialDescriptor m139942e() {
        return this.f128619q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C27337o.class != obj.getClass()) {
            return false;
        }
        C27337o c27337o = (C27337o) obj;
        if (m139943g() == c27337o.m139943g() && AbstractC19074t.m100204b(mo114124d(), c27337o.mo114124d())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m139943g() {
        return this.f128618p;
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(m139943g()) * 31) + mo114124d().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (m139943g()) {
            StringBuilder sb2 = new StringBuilder();
            AbstractC28351w0.m142792c(sb2, mo114124d());
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        return mo114124d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27337o(Object obj, boolean z11, SerialDescriptor serialDescriptor) {
        super(null);
        AbstractC19074t.m100208f(obj, "body");
        this.f128618p = z11;
        this.f128619q = serialDescriptor;
        this.f128620r = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.mo113955k()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
