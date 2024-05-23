package c10;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.net.URLDecoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import sn0.AbstractC26340g;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

/* renamed from: c10.a */
/* loaded from: classes5.dex */
public final class C3196a {

    /* renamed from: a */
    private final Object f13679a;

    /* renamed from: b */
    private final String f13680b;

    /* renamed from: c */
    private final String f13681c;

    /* renamed from: d */
    private final String f13682d;

    public C3196a(Object obj, String str, String str2, String str3) {
        AbstractC19074t.m100208f(str2, "sourceId");
        AbstractC19074t.m100208f(str3, "sourceInfo");
        this.f13679a = obj;
        this.f13680b = str;
        this.f13681c = str2;
        this.f13682d = str3;
    }

    /* renamed from: a */
    public final Object m16267a() {
        return this.f13679a;
    }

    /* renamed from: b */
    public final String m16268b() {
        return this.f13680b;
    }

    /* renamed from: c */
    public final String m16269c() {
        return this.f13681c;
    }

    /* renamed from: d */
    public final String m16270d() {
        return this.f13682d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3196a)) {
            return false;
        }
        C3196a c3196a = (C3196a) obj;
        return AbstractC19074t.m100204b(this.f13679a, c3196a.f13679a) && AbstractC19074t.m100204b(this.f13680b, c3196a.f13680b) && AbstractC19074t.m100204b(this.f13681c, c3196a.f13681c) && AbstractC19074t.m100204b(this.f13682d, c3196a.f13682d);
    }

    public int hashCode() {
        Object obj = this.f13679a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f13680b;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f13681c.hashCode()) * 31) + this.f13682d.hashCode();
    }

    public String toString() {
        return "ActionPayload(data=" + this.f13679a + ", fallback=" + this.f13680b + ", sourceId=" + this.f13681c + ", sourceInfo=" + this.f13682d + ")";
    }

    /* renamed from: c10.a$a */
    /* loaded from: classes5.dex */
    public static final class a implements KSerializer {

        /* renamed from: a */
        private final InterfaceC18505l f13683a;

        /* renamed from: b */
        private final SerialDescriptor f13684b;

        public a(InterfaceC18505l interfaceC18505l) {
            this.f13683a = interfaceC18505l;
            String name = C3196a.class.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            this.f13684b = AbstractC26340g.m135541c(name, new SerialDescriptor[0], null, 4, null);
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3196a deserialize(Decoder decoder) {
            Object obj;
            String str;
            Object m51733n;
            String m51743x;
            AbstractC19074t.m100208f(decoder, "decoder");
            JsonObject m139916m = AbstractC27331i.m139916m(((InterfaceC27329g) decoder).mo139898g());
            JsonObject m51733n2 = AbstractC9465b.m51733n(m139916m, "action_common_payload");
            InterfaceC18505l interfaceC18505l = this.f13683a;
            String str2 = null;
            if (interfaceC18505l != null && m51733n2 != null) {
                obj = interfaceC18505l.mo205i9(m51733n2);
            } else {
                obj = null;
            }
            if (m51733n2 != null && (m51743x = AbstractC9465b.m51743x(m51733n2, "back_nav_link")) != null) {
                str2 = URLDecoder.decode(m51743x);
            }
            JsonObject m51733n3 = AbstractC9465b.m51733n(m139916m, "source");
            Object obj2 = "";
            if (m51733n3 == null || (str = AbstractC9465b.m51743x(m51733n3, "id")) == null) {
                str = "";
            }
            if (m51733n3 != null && (m51733n = AbstractC9465b.m51733n(m51733n3, "info")) != null) {
                obj2 = m51733n;
            }
            return new C3196a(obj, str2, str, obj2.toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, C3196a c3196a) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(c3196a, "value");
            throw new IllegalStateException(new UnsupportedOperationException().toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f13684b;
        }

        public /* synthetic */ a(InterfaceC18505l interfaceC18505l, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? null : interfaceC18505l);
        }
    }
}
