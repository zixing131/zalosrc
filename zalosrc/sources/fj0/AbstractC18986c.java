package fj0;

import android.app.Activity;
import bj0.C2826e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import xi0.C29673d;

/* renamed from: fj0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC18986c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private AbstractC18986c f94777a;

    /* renamed from: fj0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AbstractC18986c m99654a(List list) {
            Object m131205e0;
            List m131198X;
            AbstractC19074t.m100208f(list, "handlers");
            if (!list.isEmpty()) {
                m131205e0 = AbstractC25332a0.m131205e0(list);
                m131198X = AbstractC25332a0.m131198X(list, 1);
                return m99655b((AbstractC18986c) m131205e0, m131198X);
            }
            throw new IllegalArgumentException("Cannot createChain with empty handler list");
        }

        /* renamed from: b */
        public final AbstractC18986c m99655b(AbstractC18986c abstractC18986c, List list) {
            AbstractC19074t.m100208f(abstractC18986c, "firstHandler");
            AbstractC19074t.m100208f(list, "handlerChain");
            Iterator it = list.iterator();
            AbstractC18986c abstractC18986c2 = abstractC18986c;
            while (it.hasNext()) {
                AbstractC18986c abstractC18986c3 = (AbstractC18986c) it.next();
                abstractC18986c2.m99653c(abstractC18986c3);
                abstractC18986c2 = abstractC18986c3;
            }
            return abstractC18986c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fj0.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f94778s;

        /* renamed from: u */
        int f94780u;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f94778s = obj;
            this.f94780u |= Integer.MIN_VALUE;
            return AbstractC18986c.this.m99652b(null, null, null, this);
        }
    }

    /* renamed from: a */
    public abstract Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m99652b(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        b bVar;
        Object obj;
        Object m142578e;
        int i11;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f94780u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f94780u = i12 - Integer.MIN_VALUE;
                obj = bVar.f94778s;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f94780u;
                boolean z11 = true;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    AbstractC18986c abstractC18986c = this.f94777a;
                    if (abstractC18986c != null) {
                        bVar.f94780u = 1;
                        obj = abstractC18986c.mo99651a(c2826e, c29673d, activity, bVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    return AbstractC29094b.m145339a(z11);
                }
                if (!((Boolean) obj).booleanValue()) {
                    z11 = false;
                }
                return AbstractC29094b.m145339a(z11);
            }
        }
        bVar = new b(continuation);
        obj = bVar.f94778s;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f94780u;
        boolean z112 = true;
        if (i11 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return AbstractC29094b.m145339a(z112);
    }

    /* renamed from: c */
    public final void m99653c(AbstractC18986c abstractC18986c) {
        this.f94777a = abstractC18986c;
    }
}
