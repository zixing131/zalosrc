package zm.voip.p721ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class StickerPanelView extends FrameLayout {

    /* renamed from: p */
    private InterfaceC32379a f149337p;

    /* renamed from: zm.voip.ui.StickerPanelView$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC32379a {
        /* renamed from: a */
        void mo142943a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        super.dispatchTouchEvent(motionEvent);
        InterfaceC32379a interfaceC32379a = this.f149337p;
        if (interfaceC32379a != null) {
            interfaceC32379a.mo142943a();
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        AbstractC19074t.m100208f(motionEvent, "ev");
        if (motionEvent.getAction() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        requestDisallowInterceptTouchEvent(z11);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setStickerPanelListener(InterfaceC32379a interfaceC32379a) {
        this.f149337p = interfaceC32379a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPanelView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
    }
}
