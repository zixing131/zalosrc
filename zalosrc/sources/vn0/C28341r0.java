package vn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mn0.InterfaceC23364b;
import sn0.AbstractC26337d;
import sn0.AbstractC26338e;
import sn0.AbstractC26341h;
import sn0.AbstractC26342i;
import wn0.InterfaceC29114d;

/* renamed from: vn0.r0 */
/* loaded from: classes7.dex */
public final class C28341r0 implements InterfaceC29114d {

    /* renamed from: a */
    private final boolean f132087a;

    /* renamed from: b */
    private final String f132088b;

    public C28341r0(boolean z11, String str) {
        AbstractC19074t.m100208f(str, "discriminator");
        this.f132087a = z11;
        this.f132088b = str;
    }

    /* renamed from: d */
    private final void m142769d(SerialDescriptor serialDescriptor, InterfaceC23364b interfaceC23364b) {
        int mo113949e = serialDescriptor.mo113949e();
        for (int i11 = 0; i11 < mo113949e; i11++) {
            String mo113950f = serialDescriptor.mo113950f(i11);
            if (AbstractC19074t.m100204b(mo113950f, this.f132088b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC23364b + " has property '" + mo113950f + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* renamed from: e */
    private final void m142770e(SerialDescriptor serialDescriptor, InterfaceC23364b interfaceC23364b) {
        AbstractC26341h mo113948d = serialDescriptor.mo113948d();
        if (!(mo113948d instanceof AbstractC26337d) && !AbstractC19074t.m100204b(mo113948d, AbstractC26341h.a.f125054a)) {
            if (this.f132087a) {
                return;
            }
            if (!AbstractC19074t.m100204b(mo113948d, AbstractC26342i.b.f125057a) && !AbstractC19074t.m100204b(mo113948d, AbstractC26342i.c.f125058a) && !(mo113948d instanceof AbstractC26338e) && !(mo113948d instanceof AbstractC26341h.b)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + interfaceC23364b.mo100163c() + " of kind " + mo113948d + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + interfaceC23364b.mo100163c() + " can't be registered as a subclass for polymorphic serialization because its kind " + mo113948d + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // wn0.InterfaceC29114d
    /* renamed from: a */
    public void mo142771a(InterfaceC23364b interfaceC23364b, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        AbstractC19074t.m100208f(interfaceC18505l, "defaultSerializerProvider");
    }

    @Override // wn0.InterfaceC29114d
    /* renamed from: b */
    public void mo142772b(InterfaceC23364b interfaceC23364b, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        AbstractC19074t.m100208f(interfaceC18505l, "defaultDeserializerProvider");
    }

    @Override // wn0.InterfaceC29114d
    /* renamed from: c */
    public void mo142773c(InterfaceC23364b interfaceC23364b, InterfaceC23364b interfaceC23364b2, KSerializer kSerializer) {
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        AbstractC19074t.m100208f(interfaceC23364b2, "actualClass");
        AbstractC19074t.m100208f(kSerializer, "actualSerializer");
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        m142770e(descriptor, interfaceC23364b2);
        if (!this.f132087a) {
            m142769d(descriptor, interfaceC23364b2);
        }
    }
}
