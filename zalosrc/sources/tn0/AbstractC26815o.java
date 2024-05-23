package tn0;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* renamed from: tn0.o */
/* loaded from: classes7.dex */
public abstract class AbstractC26815o extends AbstractC26812n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC26815o(KSerializer kSerializer) {
        super(kSerializer, null);
        AbstractC19074t.m100208f(kSerializer, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator mo137795d(Collection collection) {
        AbstractC19074t.m100208f(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int mo114053e(Collection collection) {
        AbstractC19074t.m100208f(collection, "<this>");
        return collection.size();
    }
}
