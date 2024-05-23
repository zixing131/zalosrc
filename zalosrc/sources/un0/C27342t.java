package un0;

import fn0.AbstractC19074t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: un0.t */
/* loaded from: classes7.dex */
public final class C27342t {

    /* renamed from: a */
    private final Map f128625a = new LinkedHashMap();

    /* renamed from: a */
    public final JsonObject m139948a() {
        return new JsonObject(this.f128625a);
    }

    /* renamed from: b */
    public final JsonElement m139949b(String str, JsonElement jsonElement) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(jsonElement, "element");
        return (JsonElement) this.f128625a.put(str, jsonElement);
    }
}
