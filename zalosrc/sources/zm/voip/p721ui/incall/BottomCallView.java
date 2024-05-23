package zm.voip.p721ui.incall;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes7.dex */
public class BottomCallView extends RelativeLayout {

    /* renamed from: p */
    private InterfaceC32380a f149338p;

    /* renamed from: zm.voip.ui.incall.BottomCallView$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC32380a {
        /* renamed from: a */
        void mo142927a();
    }

    public BottomCallView(Context context) {
        super(context);
        m156443a();
    }

    /* renamed from: a */
    void m156443a() {
        setBackgroundColor(-1728053248);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC32380a interfaceC32380a = this.f149338p;
        if (interfaceC32380a != null) {
            interfaceC32380a.mo142927a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (motionEvent.getAction() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        requestDisallowInterceptTouchEvent(z11);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setBottomCallViewPresenter(InterfaceC32380a interfaceC32380a) {
        this.f149338p = interfaceC32380a;
    }
}
