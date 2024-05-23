package un0;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import pm0.C24848g0;
import sn0.AbstractC26337d;
import sn0.AbstractC26340g;
import sn0.C26334a;

/* renamed from: un0.j */
/* loaded from: classes7.dex */
public final class C27332j implements KSerializer {

    /* renamed from: a */
    public static final C27332j f128609a = new C27332j();

    /* renamed from: b */
    private static final SerialDescriptor f128610b = AbstractC26340g.m135542d("kotlinx.serialization.json.JsonElement", AbstractC26337d.b.f125036a, new SerialDescriptor[0], a.f128611q);

    /* renamed from: un0.j$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f128611q = new a();

        /* renamed from: un0.j$a$a */
        /* loaded from: classes7.dex */
        public static final class C32994a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32994a f128612q = new C32994a();

            C32994a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final SerialDescriptor mo12V4() {
                return C27344v.f128631a.getDescriptor();
            }
        }

        /* renamed from: un0.j$a$b */
        /* loaded from: classes7.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f128613q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final SerialDescriptor mo12V4() {
                return C27341s.f128623a.getDescriptor();
            }
        }

        /* renamed from: un0.j$a$c */
        /* loaded from: classes7.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final c f128614q = new c();

            c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final SerialDescriptor mo12V4() {
                return C27338p.f128621a.getDescriptor();
            }
        }

        /* renamed from: un0.j$a$d */
        /* loaded from: classes7.dex */
        public static final class d extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final d f128615q = new d();

            d() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final SerialDescriptor mo12V4() {
                return C27343u.f128626a.getDescriptor();
            }
        }

        /* renamed from: un0.j$a$e */
        /* loaded from: classes7.dex */
        public static final class e extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final e f128616q = new e();

            e() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final SerialDescriptor mo12V4() {
                return C27325c.f128578a.getDescriptor();
            }
        }

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m139923a(C26334a c26334a) {
            SerialDescriptor m139934f;
            SerialDescriptor m139934f2;
            SerialDescriptor m139934f3;
            SerialDescriptor m139934f4;
            SerialDescriptor m139934f5;
            AbstractC19074t.m100208f(c26334a, "$this$buildSerialDescriptor");
            m139934f = AbstractC27333k.m139934f(C32994a.f128612q);
            C26334a.m135524b(c26334a, "JsonPrimitive", m139934f, null, false, 12, null);
            m139934f2 = AbstractC27333k.m139934f(b.f128613q);
            C26334a.m135524b(c26334a, "JsonNull", m139934f2, null, false, 12, null);
            m139934f3 = AbstractC27333k.m139934f(c.f128614q);
            C26334a.m135524b(c26334a, "JsonLiteral", m139934f3, null, false, 12, null);
            m139934f4 = AbstractC27333k.m139934f(d.f128615q);
            C26334a.m135524b(c26334a, "JsonObject", m139934f4, null, false, 12, null);
            m139934f5 = AbstractC27333k.m139934f(e.f128616q);
            C26334a.m135524b(c26334a, "JsonArray", m139934f5, null, false, 12, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139923a((C26334a) obj);
            return C24848g0.f119245a;
        }
    }

    private C27332j() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a */
    public JsonElement deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return AbstractC27333k.m139932d(decoder).mo139898g();
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: b */
    public void serialize(Encoder encoder, JsonElement jsonElement) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(jsonElement, "value");
        AbstractC27333k.m139936h(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.mo113987j(C27344v.f128631a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            encoder.mo113987j(C27343u.f128626a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.mo113987j(C27325c.f128578a, jsonElement);
        }
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f128610b;
    }
}
