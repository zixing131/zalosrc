package ui0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: ui0.e */
/* loaded from: classes7.dex */
public abstract class AbstractViewOnTouchListenerC27278e implements View.OnTouchListener {

    /* renamed from: p */
    private final GestureDetector f128335p;

    /* renamed from: ui0.e$b */
    /* loaded from: classes7.dex */
    private final class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            try {
                float y11 = motionEvent2.getY() - motionEvent.getY();
                float x11 = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x11) > Math.abs(y11)) {
                    if (Math.abs(x11) <= 150.0f || Math.abs(f11) <= 100.0f) {
                        return false;
                    }
                    if (x11 > 0.0f) {
                        AbstractViewOnTouchListenerC27278e.this.mo55521f();
                    } else {
                        AbstractViewOnTouchListenerC27278e.this.mo55520e();
                    }
                } else {
                    if (Math.abs(y11) <= 150.0f || Math.abs(f12) <= 100.0f) {
                        return false;
                    }
                    if (y11 > 0.0f) {
                        AbstractViewOnTouchListenerC27278e.this.mo55519d();
                    } else {
                        AbstractViewOnTouchListenerC27278e.this.mo55522g();
                    }
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            AbstractViewOnTouchListenerC27278e.this.mo55516a();
            return true;
        }
    }

    public AbstractViewOnTouchListenerC27278e(Context context) {
        this.f128335p = new GestureDetector(context, new b());
    }

    /* renamed from: a */
    public abstract void mo55516a();

    /* renamed from: b */
    public abstract void mo55517b();

    /* renamed from: c */
    public abstract void mo55518c();

    /* renamed from: d */
    public abstract void mo55519d();

    /* renamed from: e */
    public abstract void mo55520e();

    /* renamed from: f */
    public abstract void mo55521f();

    /* renamed from: g */
    public abstract void mo55522g();

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                mo55517b();
            }
        } else {
            mo55518c();
        }
        return this.f128335p.onTouchEvent(motionEvent);
    }
}
