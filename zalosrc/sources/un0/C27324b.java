package un0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: un0.b */
/* loaded from: classes7.dex */
public final class C27324b {

    /* renamed from: a */
    private final List f128577a = new ArrayList();

    /* renamed from: a */
    public final boolean m139872a(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "element");
        this.f128577a.add(jsonElement);
        return true;
    }

    /* renamed from: b */
    public final JsonArray m139873b() {
        return new JsonArray(this.f128577a);
    }
}
