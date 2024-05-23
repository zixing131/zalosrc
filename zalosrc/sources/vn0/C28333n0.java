package vn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import un0.AbstractC27323a;
import un0.C27325c;
import un0.C27343u;

/* renamed from: vn0.n0 */
/* loaded from: classes7.dex */
final class C28333n0 extends C28325j0 {

    /* renamed from: g */
    private String f132072g;

    /* renamed from: h */
    private boolean f132073h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28333n0(AbstractC27323a abstractC27323a, InterfaceC18505l interfaceC18505l) {
        super(abstractC27323a, interfaceC18505l);
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(interfaceC18505l, "nodeConsumer");
        this.f132073h = true;
    }

    @Override // vn0.C28325j0, vn0.AbstractC28312d
    /* renamed from: q0 */
    public JsonElement mo142691q0() {
        return new JsonObject(m142722v0());
    }

    @Override // vn0.C28325j0, vn0.AbstractC28312d
    /* renamed from: u0 */
    public void mo142693u0(String str, JsonElement jsonElement) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(jsonElement, "element");
        if (this.f132073h) {
            if (jsonElement instanceof JsonPrimitive) {
                this.f132072g = ((JsonPrimitive) jsonElement).mo114124d();
                this.f132073h = false;
                return;
            } else {
                if (!(jsonElement instanceof JsonObject)) {
                    if (jsonElement instanceof JsonArray) {
                        throw AbstractC28309b0.m142639d(C27325c.f128578a.getDescriptor());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw AbstractC28309b0.m142639d(C27343u.f128626a.getDescriptor());
            }
        }
        Map m142722v0 = m142722v0();
        String str2 = this.f132072g;
        if (str2 == null) {
            AbstractC19074t.m100223u("tag");
            str2 = null;
        }
        m142722v0.put(str2, jsonElement);
        this.f132073h = true;
    }
}
