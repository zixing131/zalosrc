package tn0;

import fn0.AbstractC19074t;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;
import mn0.InterfaceC23364b;

/* renamed from: tn0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC26779c {
    /* renamed from: a */
    public static final Void m137807a(String str, InterfaceC23364b interfaceC23364b) {
        String str2;
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        String str3 = "in the scope of '" + interfaceC23364b.mo100163c() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + interfaceC23364b.mo100163c() + "' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '" + str + "' explicitly in a corresponding SerializersModule.";
        }
        throw new SerializationException(str2);
    }

    /* renamed from: b */
    public static final Void m137808b(InterfaceC23364b interfaceC23364b, InterfaceC23364b interfaceC23364b2) {
        AbstractC19074t.m100208f(interfaceC23364b, "subClass");
        AbstractC19074t.m100208f(interfaceC23364b2, "baseClass");
        String mo100163c = interfaceC23364b.mo100163c();
        if (mo100163c == null) {
            mo100163c = String.valueOf(interfaceC23364b);
        }
        m137807a(mo100163c, interfaceC23364b2);
        throw new KotlinNothingValueException();
    }
}
