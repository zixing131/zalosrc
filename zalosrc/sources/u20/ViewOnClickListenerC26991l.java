package u20;

import android.os.SystemClock;
import android.view.View;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19071q;
import pm0.C24848g0;

/* renamed from: u20.l */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC26991l implements View.OnClickListener {
    public static final b Companion = new b(null);

    /* renamed from: p */
    private final InterfaceC18505l f127630p;

    /* renamed from: q */
    private long f127631q;

    /* renamed from: u20.l$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C19071q implements InterfaceC18505l {
        a(Object obj) {
            super(1, obj, View.OnClickListener.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }

        /* renamed from: h */
        public final void m139104h(View view) {
            ((View.OnClickListener) this.f94922q).onClick(view);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139104h((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: u20.l$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public ViewOnClickListenerC26991l(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        this.f127630p = interfaceC18505l;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f127631q >= 1000) {
            this.f127631q = elapsedRealtime;
            this.f127630p.mo205i9(view);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC26991l(View.OnClickListener onClickListener) {
        this(new a(onClickListener));
        AbstractC19074t.m100208f(onClickListener, "listener");
    }
}
