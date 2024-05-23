package zm.voip.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.C1598s;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p667y2.C30268e;

/* loaded from: classes7.dex */
public final class HandleTapRecyclerView extends RecyclerView {

    /* renamed from: V0 */
    private C1598s f150040V0;

    /* renamed from: W0 */
    private View.OnClickListener f150041W0;

    /* renamed from: zm.voip.widgets.HandleTapRecyclerView$a */
    /* loaded from: classes7.dex */
    public final class C32494a extends GestureDetector.SimpleOnGestureListener {
        public C32494a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
            View.OnClickListener onClickListener = HandleTapRecyclerView.this.f150041W0;
            if (onClickListener != null) {
                onClickListener.onClick(HandleTapRecyclerView.this);
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandleTapRecyclerView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: b2 */
    public final void m157368b2(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "onClickListener");
        this.f150041W0 = onClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        this.f150040V0.m8175a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandleTapRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public /* synthetic */ HandleTapRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleTapRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f150040V0 = new C1598s(context, new C32494a());
    }
}
