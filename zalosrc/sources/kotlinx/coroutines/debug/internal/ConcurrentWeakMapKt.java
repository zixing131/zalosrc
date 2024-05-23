package kotlinx.coroutines.debug.internal;

import fn0.AbstractC19074t;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes7.dex */
public final class ConcurrentWeakMapKt {

    /* renamed from: a */
    private static final Symbol f106349a = new Symbol("REHASH");

    /* renamed from: b */
    private static final Marked f106350b = new Marked(null);

    /* renamed from: c */
    private static final Marked f106351c = new Marked(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final Marked m113231d(Object obj) {
        if (obj == null) {
            return f106350b;
        }
        if (AbstractC19074t.m100204b(obj, Boolean.TRUE)) {
            return f106351c;
        }
        return new Marked(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final Void m113232e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
