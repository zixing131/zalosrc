package kotlinx.serialization.json;

import fn0.AbstractC19058j;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlinx.serialization.KSerializer;
import qm0.AbstractC25332a0;
import qn0.InterfaceC25392g;
import un0.C27325c;

@InterfaceC25392g(with = C27325c.class)
/* loaded from: classes7.dex */
public final class JsonArray extends JsonElement implements List<JsonElement>, InterfaceC19517a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: p */
    private final List f107668p;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return C27325c.f128578a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonArray(List list) {
        super(null);
        AbstractC19074t.m100208f(list, "content");
        this.f107668p = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i11, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return m114118d((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        return this.f107668p.containsAll(collection);
    }

    /* renamed from: d */
    public boolean m114118d(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "element");
        return this.f107668p.contains(jsonElement);
    }

    @Override // java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JsonElement get(int i11) {
        return (JsonElement) this.f107668p.get(i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return AbstractC19074t.m100204b(this.f107668p, obj);
    }

    /* renamed from: g */
    public int m114120g() {
        return this.f107668p.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f107668p.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return m114121k((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f107668p.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f107668p.iterator();
    }

    /* renamed from: k */
    public int m114121k(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "element");
        return this.f107668p.indexOf(jsonElement);
    }

    /* renamed from: l */
    public int m114122l(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "element");
        return this.f107668p.lastIndexOf(jsonElement);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return m114122l((JsonElement) obj);
    }

    @Override // java.util.List
    public ListIterator<JsonElement> listIterator() {
        return this.f107668p.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement set(int i11, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m114120g();
    }

    @Override // java.util.List
    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<JsonElement> subList(int i11, int i12) {
        return this.f107668p.subList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC19058j.m100166a(this);
    }

    public String toString() {
        String m131214n0;
        m131214n0 = AbstractC25332a0.m131214n0(this.f107668p, ",", "[", "]", 0, null, null, 56, null);
        return m131214n0;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<JsonElement> listIterator(int i11) {
        return this.f107668p.listIterator(i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "array");
        return AbstractC19058j.m100167b(this, objArr);
    }
}
