package wg0;

import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import wg0.AbstractC28981d;

/* renamed from: wg0.e */
/* loaded from: classes7.dex */
public abstract class AbstractC28982e {
    /* renamed from: a */
    public static final boolean m144700a(AbstractC28981d abstractC28981d, AbstractC28981d abstractC28981d2) {
        AbstractC19074t.m100208f(abstractC28981d, "<this>");
        boolean z11 = false;
        if (AbstractC19074t.m100204b(abstractC28981d, abstractC28981d2)) {
            return false;
        }
        if (abstractC28981d2 == null || abstractC28981d.m144695b() != abstractC28981d2.m144695b()) {
            return true;
        }
        AbstractC28981d.f fVar = AbstractC28981d.f.f134110d;
        if (AbstractC19074t.m100204b(abstractC28981d, fVar)) {
            z11 = AbstractC19074t.m100204b(abstractC28981d2, fVar);
        } else if (abstractC28981d instanceof AbstractC28981d.d) {
            z11 = abstractC28981d2 instanceof AbstractC28981d.d;
        } else if (abstractC28981d instanceof AbstractC28981d.b) {
            z11 = abstractC28981d2 instanceof AbstractC28981d.b;
        } else if (abstractC28981d instanceof AbstractC28981d.a) {
            if ((abstractC28981d2 instanceof AbstractC28981d.a) && ((AbstractC28981d.a) abstractC28981d).m144699f() == ((AbstractC28981d.a) abstractC28981d2).m144699f()) {
                z11 = true;
            }
        } else if (abstractC28981d instanceof AbstractC28981d.c) {
            z11 = abstractC28981d2 instanceof AbstractC28981d.c;
        } else if (abstractC28981d instanceof AbstractC28981d.e) {
            z11 = abstractC28981d2 instanceof AbstractC28981d.e;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return !z11;
    }
}
