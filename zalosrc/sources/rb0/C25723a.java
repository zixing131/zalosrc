package rb0;

import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import fn0.AbstractC19074t;

/* renamed from: rb0.a */
/* loaded from: classes6.dex */
public final class C25723a extends Scroller {

    /* renamed from: a */
    private int f122767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25723a(Context context, int i11) {
        super(context, new DecelerateInterpolator());
        AbstractC19074t.m100208f(context, "context");
        this.f122767a = i11;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i11, int i12, int i13, int i14, int i15) {
        super.startScroll(i11, i12, i13, i14, this.f122767a);
    }
}
