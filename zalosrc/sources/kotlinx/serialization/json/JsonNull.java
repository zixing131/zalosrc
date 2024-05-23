package kotlinx.serialization.json;

import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import kotlinx.serialization.KSerializer;
import pm0.AbstractC24856m;
import pm0.EnumC24858o;
import pm0.InterfaceC24854k;
import qn0.InterfaceC25392g;
import un0.C27341s;

@InterfaceC25392g(with = C27341s.class)
/* loaded from: classes7.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();

    /* renamed from: p */
    private static final String f107669p = "null";

    /* renamed from: q */
    private static final /* synthetic */ InterfaceC24854k f107670q;

    /* renamed from: kotlinx.serialization.json.JsonNull$a */
    /* loaded from: classes7.dex */
    static final class C21903a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C21903a f107671q = new C21903a();

        C21903a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final KSerializer mo12V4() {
            return C27341s.f128623a;
        }
    }

    static {
        InterfaceC24854k m129211b;
        m129211b = AbstractC24856m.m129211b(EnumC24858o.f119258q, C21903a.f107671q);
        f107670q = m129211b;
    }

    private JsonNull() {
        super(null);
    }

    /* renamed from: e */
    private final /* synthetic */ KSerializer m114123e() {
        return (KSerializer) f107670q.getValue();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: d */
    public String mo114124d() {
        return f107669p;
    }

    public final KSerializer serializer() {
        return m114123e();
    }
}
