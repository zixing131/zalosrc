package kotlinx.serialization.json;

import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import qn0.InterfaceC25392g;
import un0.C27344v;

@InterfaceC25392g(with = C27344v.class)
/* loaded from: classes7.dex */
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return C27344v.f128631a;
        }
    }

    public /* synthetic */ JsonPrimitive(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: d */
    public abstract String mo114124d();

    public String toString() {
        return mo114124d();
    }

    private JsonPrimitive() {
        super(null);
    }
}
