package vn0;

import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import qn0.InterfaceC25386a;
import un0.AbstractC27323a;
import un0.C27337o;

/* renamed from: vn0.x0 */
/* loaded from: classes7.dex */
public abstract class AbstractC28353x0 {
    /* renamed from: a */
    public static final Object m142796a(AbstractC27323a abstractC27323a, JsonElement jsonElement, InterfaceC25386a interfaceC25386a) {
        Decoder c28315e0;
        AbstractC19074t.m100208f(abstractC27323a, "<this>");
        AbstractC19074t.m100208f(jsonElement, "element");
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        if (jsonElement instanceof JsonObject) {
            c28315e0 = new C28323i0(abstractC27323a, (JsonObject) jsonElement, null, null, 12, null);
        } else if (jsonElement instanceof JsonArray) {
            c28315e0 = new C28327k0(abstractC27323a, (JsonArray) jsonElement);
        } else if ((jsonElement instanceof C27337o) || AbstractC19074t.m100204b(jsonElement, JsonNull.INSTANCE)) {
            c28315e0 = new C28315e0(abstractC27323a, (JsonPrimitive) jsonElement);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return c28315e0.mo113972k(interfaceC25386a);
    }

    /* renamed from: b */
    public static final Object m142797b(AbstractC27323a abstractC27323a, String str, JsonObject jsonObject, InterfaceC25386a interfaceC25386a) {
        AbstractC19074t.m100208f(abstractC27323a, "<this>");
        AbstractC19074t.m100208f(str, "discriminator");
        AbstractC19074t.m100208f(jsonObject, "element");
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        return new C28323i0(abstractC27323a, jsonObject, str, interfaceC25386a.getDescriptor()).mo113972k(interfaceC25386a);
    }
}
