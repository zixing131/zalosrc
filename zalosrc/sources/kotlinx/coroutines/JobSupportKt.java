package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class JobSupportKt {

    /* renamed from: a */
    private static final Symbol f105927a = new Symbol("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final Symbol f105928b = new Symbol("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    private static final Symbol f105929c = new Symbol("COMPLETING_RETRY");

    /* renamed from: d */
    private static final Symbol f105930d = new Symbol("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    private static final Symbol f105931e = new Symbol("SEALED");

    /* renamed from: f */
    private static final Empty f105932f = new Empty(false);

    /* renamed from: g */
    private static final Empty f105933g = new Empty(true);

    /* renamed from: g */
    public static final Object m112859g(Object obj) {
        if (obj instanceof Incomplete) {
            return new IncompleteStateBox((Incomplete) obj);
        }
        return obj;
    }

    /* renamed from: h */
    public static final Object m112860h(Object obj) {
        IncompleteStateBox incompleteStateBox;
        Incomplete incomplete;
        if (obj instanceof IncompleteStateBox) {
            incompleteStateBox = (IncompleteStateBox) obj;
        } else {
            incompleteStateBox = null;
        }
        if (incompleteStateBox != null && (incomplete = incompleteStateBox.f105889a) != null) {
            return incomplete;
        }
        return obj;
    }
}
