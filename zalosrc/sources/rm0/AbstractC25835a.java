package rm0;

import fn0.AbstractC19074t;
import java.util.Map;
import qm0.AbstractC25344g;

/* renamed from: rm0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC25835a extends AbstractC25344g {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return m133203e((Map.Entry) obj);
    }

    /* renamed from: e */
    public final boolean m133203e(Map.Entry entry) {
        AbstractC19074t.m100208f(entry, "element");
        return mo133204g(entry);
    }

    /* renamed from: g */
    public abstract boolean mo133204g(Map.Entry entry);

    /* renamed from: j */
    public abstract /* bridge */ boolean mo133205j(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo133205j((Map.Entry) obj);
    }
}
