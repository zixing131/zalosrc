package kotlinx.serialization.json;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gn0.InterfaceC19517a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlinx.serialization.KSerializer;
import qm0.AbstractC25332a0;
import qn0.InterfaceC25392g;
import un0.C27343u;
import vn0.AbstractC28351w0;

@InterfaceC25392g(with = C27343u.class)
/* loaded from: classes7.dex */
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, InterfaceC19517a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: p */
    private final Map f107672p;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return C27343u.f128626a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.serialization.json.JsonObject$a */
    /* loaded from: classes7.dex */
    public static final class C21904a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C21904a f107673q = new C21904a();

        C21904a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(Map.Entry entry) {
            AbstractC19074t.m100208f(entry, "<name for destructuring parameter 0>");
            String str = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            AbstractC28351w0.m142792c(sb2, str);
            sb2.append(':');
            sb2.append(jsonElement);
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonObject(Map map) {
        super(null);
        AbstractC19074t.m100208f(map, "content");
        this.f107672p = map;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement compute(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfAbsent(String str, Function<? super String, ? extends JsonElement> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfPresent(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return m114126d((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return m114127e((JsonElement) obj);
    }

    /* renamed from: d */
    public boolean m114126d(String str) {
        AbstractC19074t.m100208f(str, "key");
        return this.f107672p.containsKey(str);
    }

    /* renamed from: e */
    public boolean m114127e(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "value");
        return this.f107672p.containsValue(jsonElement);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, JsonElement>> entrySet() {
        return m114129k();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return AbstractC19074t.m100204b(this.f107672p, obj);
    }

    /* renamed from: g */
    public JsonElement m114128g(String str) {
        AbstractC19074t.m100208f(str, "key");
        return (JsonElement) this.f107672p.get(str);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return m114128g((String) obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f107672p.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f107672p.isEmpty();
    }

    /* renamed from: k */
    public Set m114129k() {
        return this.f107672p.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m114130l();
    }

    /* renamed from: l */
    public Set m114130l() {
        return this.f107672p.keySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement merge(String str, JsonElement jsonElement, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: n */
    public int m114131n() {
        return this.f107672p.size();
    }

    /* renamed from: p */
    public Collection m114132p() {
        return this.f107672p.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement put(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement putIfAbsent(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: r */
    public JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement replace(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m114131n();
    }

    public String toString() {
        String m131214n0;
        m131214n0 = AbstractC25332a0.m131214n0(this.f107672p.entrySet(), ",", "{", "}", 0, null, C21904a.f107673q, 24, null);
        return m131214n0;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<JsonElement> values() {
        return m114132p();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, JsonElement jsonElement, JsonElement jsonElement2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
