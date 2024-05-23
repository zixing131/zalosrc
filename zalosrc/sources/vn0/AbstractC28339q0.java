package vn0;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import qn0.C25390e;
import qn0.InterfaceC25386a;
import qn0.InterfaceC25393h;
import sn0.AbstractC26337d;
import sn0.AbstractC26338e;
import sn0.AbstractC26341h;
import tn0.AbstractC26776b;
import tn0.AbstractC26786e0;
import un0.AbstractC27323a;
import un0.AbstractC27331i;
import un0.InterfaceC27327e;
import un0.InterfaceC27329g;

/* renamed from: vn0.q0 */
/* loaded from: classes7.dex */
public abstract class AbstractC28339q0 {
    /* renamed from: b */
    public static final void m142763b(AbstractC26341h abstractC26341h) {
        AbstractC19074t.m100208f(abstractC26341h, "kind");
        if (!(abstractC26341h instanceof AbstractC26341h.b)) {
            if (!(abstractC26341h instanceof AbstractC26338e)) {
                if (!(abstractC26341h instanceof AbstractC26337d)) {
                    return;
                } else {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
                }
            }
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
    }

    /* renamed from: c */
    public static final String m142764c(SerialDescriptor serialDescriptor, AbstractC27323a abstractC27323a) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        AbstractC19074t.m100208f(abstractC27323a, "json");
        for (Annotation annotation : serialDescriptor.mo113954j()) {
            if (annotation instanceof InterfaceC27327e) {
                return ((InterfaceC27327e) annotation).discriminator();
            }
        }
        return abstractC27323a.m139869f().m139886c();
    }

    /* renamed from: d */
    public static final Object m142765d(InterfaceC27329g interfaceC27329g, InterfaceC25386a interfaceC25386a) {
        String str;
        JsonPrimitive m139917n;
        AbstractC19074t.m100208f(interfaceC27329g, "<this>");
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        if ((interfaceC25386a instanceof AbstractC26776b) && !interfaceC27329g.mo139897d().m139869f().m139895l()) {
            String m142764c = m142764c(interfaceC25386a.getDescriptor(), interfaceC27329g.mo139897d());
            JsonElement mo139898g = interfaceC27329g.mo139898g();
            SerialDescriptor descriptor = interfaceC25386a.getDescriptor();
            if (mo139898g instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) mo139898g;
                JsonElement jsonElement = (JsonElement) jsonObject.get(m142764c);
                if (jsonElement != null && (m139917n = AbstractC27331i.m139917n(jsonElement)) != null) {
                    str = m139917n.mo114124d();
                } else {
                    str = null;
                }
                InterfaceC25386a mo131581c = ((AbstractC26776b) interfaceC25386a).mo131581c(interfaceC27329g, str);
                if (mo131581c != null) {
                    return AbstractC28353x0.m142797b(interfaceC27329g.mo139897d(), m142764c, jsonObject, mo131581c);
                }
                m142766e(str, jsonObject);
                throw new KotlinNothingValueException();
            }
            throw AbstractC28309b0.m142640e(-1, "Expected " + AbstractC19061k0.m100169b(JsonObject.class) + " as the serialized body of " + descriptor.mo113953i() + ", but had " + AbstractC19061k0.m100169b(mo139898g.getClass()));
        }
        return interfaceC25386a.deserialize(interfaceC27329g);
    }

    /* renamed from: e */
    public static final Void m142766e(String str, JsonObject jsonObject) {
        String str2;
        AbstractC19074t.m100208f(jsonObject, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw AbstractC28309b0.m142641f(-1, "Polymorphic serializer was not found for " + str2, jsonObject.toString());
    }

    /* renamed from: f */
    public static final void m142767f(InterfaceC25393h interfaceC25393h, InterfaceC25393h interfaceC25393h2, String str) {
        if (!(interfaceC25393h instanceof C25390e) || !AbstractC26786e0.m137817a(interfaceC25393h2.getDescriptor()).contains(str)) {
            return;
        }
        String mo113953i = interfaceC25393h.getDescriptor().mo113953i();
        throw new IllegalStateException(("Sealed class '" + interfaceC25393h2.getDescriptor().mo113953i() + "' cannot be serialized as base class '" + mo113953i + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
    }
}
