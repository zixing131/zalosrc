package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import nn0.AbstractC23900i;
import nn0.AbstractC23902k;
import nn0.InterfaceC23898g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29103k;

/* renamed from: androidx.core.view.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1599s0 {

    /* renamed from: androidx.core.view.s0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC29103k implements InterfaceC18509p {

        /* renamed from: r */
        int f6579r;

        /* renamed from: s */
        private /* synthetic */ Object f6580s;

        /* renamed from: t */
        final /* synthetic */ View f6581t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, Continuation continuation) {
            super(2, continuation);
            this.f6581t = view;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(this.f6581t, continuation);
            aVar.f6580s = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AbstractC23900i abstractC23900i;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f6579r;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC23900i = (AbstractC23900i) this.f6580s;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                abstractC23900i = (AbstractC23900i) this.f6580s;
                View view = this.f6581t;
                this.f6580s = abstractC23900i;
                this.f6579r = 1;
                if (abstractC23900i.mo124992a(view, this) == m142578e) {
                    return m142578e;
                }
            }
            View view2 = this.f6581t;
            if (view2 instanceof ViewGroup) {
                InterfaceC23898g m8169b = AbstractC1595r0.m8169b((ViewGroup) view2);
                this.f6580s = null;
                this.f6579r = 2;
                if (abstractC23900i.m124995e(m8169b, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC23900i abstractC23900i, Continuation continuation) {
            return ((a) mo238a(abstractC23900i, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final InterfaceC23898g m8177a(View view) {
        InterfaceC23898g m125013b;
        AbstractC19074t.m100208f(view, "<this>");
        m125013b = AbstractC23902k.m125013b(new a(view, null));
        return m125013b;
    }
}
