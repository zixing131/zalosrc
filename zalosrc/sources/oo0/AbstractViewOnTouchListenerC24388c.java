package oo0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: oo0.c */
/* loaded from: classes7.dex */
public abstract class AbstractViewOnTouchListenerC24388c implements View.OnTouchListener {

    /* renamed from: p */
    private final GestureDetector f117759p;

    /* renamed from: oo0.c$a */
    /* loaded from: classes7.dex */
    private final class a extends GestureDetector.SimpleOnGestureListener {
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
                        AbstractViewOnTouchListenerC24388c.this.mo127549f();
                    } else {
                        AbstractViewOnTouchListenerC24388c.this.mo127548e();
                    }
                } else {
                    if (Math.abs(y11) <= 150.0f || Math.abs(f12) <= 100.0f) {
                        return false;
                    }
                    if (y11 > 0.0f) {
                        AbstractViewOnTouchListenerC24388c.this.mo127547d();
                    } else {
                        AbstractViewOnTouchListenerC24388c.this.mo127550g();
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
            AbstractViewOnTouchListenerC24388c.this.mo127544a();
            return true;
        }

        private a() {
        }
    }

    public AbstractViewOnTouchListenerC24388c(Context context) {
        this.f117759p = new GestureDetector(context, new a());
    }

    /* renamed from: a */
    public abstract void mo127544a();

    /* renamed from: b */
    public abstract void mo127545b();

    /* renamed from: c */
    public abstract void mo127546c();

    /* renamed from: d */
    public abstract void mo127547d();

    /* renamed from: e */
    public abstract void mo127548e();

    /* renamed from: f */
    public abstract void mo127549f();

    /* renamed from: g */
    public abstract void mo127550g();

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                mo127545b();
            }
        } else {
            mo127546c();
        }
        return this.f117759p.onTouchEvent(motionEvent);
    }
}
