package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: androidx.core.view.s */
/* loaded from: classes2.dex */
public final class C1598s {

    /* renamed from: a */
    private final a f6577a;

    /* renamed from: androidx.core.view.s$a */
    /* loaded from: classes2.dex */
    interface a {
        /* renamed from: a */
        boolean mo8176a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.core.view.s$b */
    /* loaded from: classes2.dex */
    static class b implements a {

        /* renamed from: a */
        private final GestureDetector f6578a;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f6578a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.C1598s.a
        /* renamed from: a */
        public boolean mo8176a(MotionEvent motionEvent) {
            return this.f6578a.onTouchEvent(motionEvent);
        }
    }

    public C1598s(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean m8175a(MotionEvent motionEvent) {
        return this.f6577a.mo8176a(motionEvent);
    }

    public C1598s(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f6577a = new b(context, onGestureListener, handler);
    }
}
