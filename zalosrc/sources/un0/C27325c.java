package un0;

import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import rn0.AbstractC25935a;
import sn0.AbstractC26341h;

/* renamed from: un0.c */
/* loaded from: classes7.dex */
public final class C27325c implements KSerializer {

    /* renamed from: a */
    public static final C27325c f128578a = new C27325c();

    /* renamed from: b */
    private static final SerialDescriptor f128579b = a.f128580b;

    /* renamed from: un0.c$a */
    /* loaded from: classes7.dex */
    private static final class a implements SerialDescriptor {

        /* renamed from: b */
        public static final a f128580b = new a();

        /* renamed from: c */
        private static final String f128581c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a */
        private final /* synthetic */ SerialDescriptor f128582a = AbstractC25935a.m133617h(C27332j.f128609a).getDescriptor();

        private a() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: b */
        public boolean mo113946b() {
            return this.f128582a.mo113946b();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: c */
        public int mo113947c(String str) {
            AbstractC19074t.m100208f(str, "name");
            return this.f128582a.mo113947c(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: d */
        public AbstractC26341h mo113948d() {
            return this.f128582a.mo113948d();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: e */
        public int mo113949e() {
            return this.f128582a.mo113949e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: f */
        public String mo113950f(int i11) {
            return this.f128582a.mo113950f(i11);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: g */
        public List mo113951g(int i11) {
            return this.f128582a.mo113951g(i11);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: h */
        public SerialDescriptor mo113952h(int i11) {
            return this.f128582a.mo113952h(i11);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: i */
        public String mo113953i() {
            return f128581c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: j */
        public List mo113954j() {
            return this.f128582a.mo113954j();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: k */
        public boolean mo113955k() {
            return this.f128582a.mo113955k();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: l */
        public boolean mo113956l(int i11) {
            return this.f128582a.mo113956l(i11);
        }
    }

    private C27325c() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a */
    public JsonArray deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        AbstractC27333k.m139935g(decoder);
        return new JsonArray((List) AbstractC25935a.m133617h(C27332j.f128609a).deserialize(decoder));
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: b */
    public void serialize(Encoder encoder, JsonArray jsonArray) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(jsonArray, "value");
        AbstractC27333k.m139936h(encoder);
        AbstractC25935a.m133617h(C27332j.f128609a).serialize(encoder, jsonArray);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f128579b;
    }
}
