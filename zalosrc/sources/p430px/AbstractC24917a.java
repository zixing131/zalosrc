package p430px;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC1622z;

/* renamed from: px.a */
/* loaded from: classes4.dex */
public abstract class AbstractC24917a implements InterfaceC24920d {

    /* renamed from: a */
    protected InterfaceC24921e f119531a;

    /* renamed from: b */
    float f119532b;

    /* renamed from: c */
    float f119533c;

    /* renamed from: d */
    final float f119534d;

    /* renamed from: e */
    final float f119535e;

    /* renamed from: f */
    private float f119536f;

    /* renamed from: g */
    private float f119537g;

    /* renamed from: h */
    private int f119538h;

    /* renamed from: i */
    private VelocityTracker f119539i;

    /* renamed from: j */
    private boolean f119540j;

    public AbstractC24917a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f119535e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f119534d = viewConfiguration.getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:            if (r0 != 6) goto L55;     */
    @Override // p430px.InterfaceC24920d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo129587a(MotionEvent motionEvent) {
        InterfaceC24921e interfaceC24921e;
        int action = motionEvent.getAction();
        boolean z11 = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            this.f119538h = AbstractC1622z.m8276d(motionEvent, 0);
                        }
                    }
                } else {
                    float mo129589d = mo129589d(motionEvent);
                    float mo129590e = mo129590e(motionEvent);
                    float f11 = mo129589d - this.f119532b;
                    float f12 = mo129590e - this.f119533c;
                    if (!this.f119540j) {
                        if (((float) Math.sqrt((f11 * f11) + (f12 * f12))) >= this.f119534d) {
                            z11 = true;
                        }
                        this.f119540j = z11;
                    }
                    if (this.f119540j) {
                        if (motionEvent.getPointerCount() == 1) {
                            this.f119531a.mo48367a(this.f119537g, motionEvent.getRawY(), f11, f12);
                        }
                        this.f119532b = mo129589d;
                        this.f119533c = mo129590e;
                        this.f119537g = motionEvent.getRawY();
                        VelocityTracker velocityTracker = this.f119539i;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                    }
                    if (this.f119538h == -1 && (interfaceC24921e = this.f119531a) != null) {
                        interfaceC24921e.mo48371c(this.f119536f, motionEvent.getRawY(), 0.0f);
                    }
                }
            }
            if (this.f119540j && this.f119539i != null) {
                this.f119532b = mo129589d(motionEvent);
                this.f119533c = mo129590e(motionEvent);
                this.f119539i.addMovement(motionEvent);
                this.f119539i.computeCurrentVelocity(1000);
                float xVelocity = this.f119539i.getXVelocity();
                float yVelocity = this.f119539i.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f119535e) {
                    this.f119531a.mo48373d(this.f119532b, this.f119533c, -xVelocity, -yVelocity);
                }
            }
            if (this.f119531a != null) {
                this.f119537g = motionEvent.getRawY();
                if (this.f119539i != null) {
                    this.f119531a.mo48371c(this.f119536f, motionEvent.getRawY(), this.f119539i.getYVelocity());
                } else {
                    this.f119531a.mo48371c(this.f119536f, motionEvent.getRawY(), 0.0f);
                }
            }
            VelocityTracker velocityTracker2 = this.f119539i;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f119539i = null;
            }
        } else {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f119539i = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f119532b = mo129589d(motionEvent);
            this.f119533c = mo129590e(motionEvent);
            this.f119536f = motionEvent.getRawY();
            this.f119537g = motionEvent.getRawY();
            this.f119540j = false;
            this.f119538h = AbstractC1622z.m8276d(motionEvent, 0);
        }
        return true;
    }

    @Override // p430px.InterfaceC24920d
    /* renamed from: b */
    public void mo129588b(InterfaceC24921e interfaceC24921e) {
        this.f119531a = interfaceC24921e;
    }

    /* renamed from: d */
    abstract float mo129589d(MotionEvent motionEvent);

    /* renamed from: e */
    abstract float mo129590e(MotionEvent motionEvent);
}
