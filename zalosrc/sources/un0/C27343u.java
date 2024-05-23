package un0;

import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import rn0.AbstractC25935a;
import sn0.AbstractC26341h;

/* renamed from: un0.u */
/* loaded from: classes7.dex */
public final class C27343u implements KSerializer {

    /* renamed from: a */
    public static final C27343u f128626a = new C27343u();

    /* renamed from: b */
    private static final SerialDescriptor f128627b = a.f128628b;

    /* renamed from: un0.u$a */
    /* loaded from: classes7.dex */
    private static final class a implements SerialDescriptor {

        /* renamed from: b */
        public static final a f128628b = new a();

        /* renamed from: c */
        private static final String f128629c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a */
        private final /* synthetic */ SerialDescriptor f128630a = AbstractC25935a.m133620k(AbstractC25935a.m133603D(C19067n0.f94947a), C27332j.f128609a).getDescriptor();

        private a() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: b */
        public boolean mo113946b() {
            return this.f128630a.mo113946b();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: c */
        public int mo113947c(String str) {
            AbstractC19074t.m100208f(str, "name");
            return this.f128630a.mo113947c(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: d */
        public AbstractC26341h mo113948d() {
            return this.f128630a.mo113948d();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: e */
        public int mo113949e() {
            return this.f128630a.mo113949e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: f */
        public String mo113950f(int i11) {
            return this.f128630a.mo113950f(i11);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: g */
        public List mo113951g(int i11) {
            return this.f128630a.mo113951g(i11);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: h */
        public SerialDescriptor mo113952h(int i11) {
            return this.f128630a.mo113952h(i11);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: i */
        public String mo113953i() {
            return f128629c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: j */
        public List mo113954j() {
            return this.f128630a.mo113954j();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: k */
        public boolean mo113955k() {
            return this.f128630a.mo113955k();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: l */
        public boolean mo113956l(int i11) {
            return this.f128630a.mo113956l(i11);
        }
    }

    private C27343u() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        AbstractC27333k.m139935g(decoder);
        return new JsonObject((Map) AbstractC25935a.m133620k(AbstractC25935a.m133603D(C19067n0.f94947a), C27332j.f128609a).deserialize(decoder));
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonObject jsonObject) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(jsonObject, "value");
        AbstractC27333k.m139936h(encoder);
        AbstractC25935a.m133620k(AbstractC25935a.m133603D(C19067n0.f94947a), C27332j.f128609a).serialize(encoder, jsonObject);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f128627b;
    }
}
