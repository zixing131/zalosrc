package p430px;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: px.c */
/* loaded from: classes4.dex */
public class C24919c extends AbstractC24918b {

    /* renamed from: m */
    protected final ScaleGestureDetector f119543m;

    /* renamed from: px.c$a */
    /* loaded from: classes4.dex */
    class a implements ScaleGestureDetector.OnScaleGestureListener {
        a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C24919c.this.f119531a.mo48369b(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C24919c(Context context) {
        super(context);
        this.f119543m = new ScaleGestureDetector(context, new a());
    }

    @Override // p430px.AbstractC24918b, p430px.AbstractC24917a, p430px.InterfaceC24920d
    /* renamed from: a */
    public boolean mo129587a(MotionEvent motionEvent) {
        this.f119543m.onTouchEvent(motionEvent);
        return super.mo129587a(motionEvent);
    }

    @Override // p430px.InterfaceC24920d
    /* renamed from: c */
    public boolean mo129591c() {
        return this.f119543m.isInProgress();
    }
}
