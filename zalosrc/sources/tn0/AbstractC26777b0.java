package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import tn0.InterfaceC26842x;

/* renamed from: tn0.b0 */
/* loaded from: classes7.dex */
public abstract class AbstractC26777b0 {

    /* renamed from: tn0.b0$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC26842x {

        /* renamed from: a */
        final /* synthetic */ KSerializer f126985a;

        a(KSerializer kSerializer) {
            this.f126985a = kSerializer;
        }

        @Override // tn0.InterfaceC26842x
        public KSerializer[] childSerializers() {
            return new KSerializer[]{this.f126985a};
        }

        @Override // qn0.InterfaceC25386a
        public Object deserialize(Decoder decoder) {
            AbstractC19074t.m100208f(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // qn0.InterfaceC25393h
        public void serialize(Encoder encoder, Object obj) {
            AbstractC19074t.m100208f(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // tn0.InterfaceC26842x
        public KSerializer[] typeParametersSerializers() {
            return InterfaceC26842x.a.m137988a(this);
        }
    }

    /* renamed from: a */
    public static final SerialDescriptor m137805a(String str, KSerializer kSerializer) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(kSerializer, "primitiveSerializer");
        return new C26773a0(str, new a(kSerializer));
    }
}
