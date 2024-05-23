package oo0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC1622z;
import p430px.InterfaceC24921e;

/* renamed from: oo0.a */
/* loaded from: classes7.dex */
public class C24386a {

    /* renamed from: a */
    protected InterfaceC24921e f117749a;

    /* renamed from: b */
    float f117750b;

    /* renamed from: c */
    float f117751c;

    /* renamed from: d */
    final float f117752d;

    /* renamed from: e */
    final float f117753e;

    /* renamed from: f */
    private float f117754f;

    /* renamed from: g */
    private float f117755g;

    /* renamed from: h */
    private int f117756h;

    /* renamed from: i */
    private VelocityTracker f117757i;

    /* renamed from: j */
    private boolean f117758j;

    public C24386a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f117753e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f117752d = viewConfiguration.getScaledTouchSlop();
    }

    /* renamed from: a */
    float m127540a(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    /* renamed from: b */
    float m127541b(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:            if (r0 != 6) goto L55;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m127542c(MotionEvent motionEvent) {
        InterfaceC24921e interfaceC24921e;
        int action = motionEvent.getAction();
        boolean z11 = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            this.f117756h = AbstractC1622z.m8276d(motionEvent, 0);
                        }
                    }
                } else {
                    float m127540a = m127540a(motionEvent);
                    float m127541b = m127541b(motionEvent);
                    float f11 = m127540a - this.f117750b;
                    float f12 = m127541b - this.f117751c;
                    if (!this.f117758j) {
                        if (((float) Math.sqrt((f11 * f11) + (f12 * f12))) >= this.f117752d) {
                            z11 = true;
                        }
                        this.f117758j = z11;
                    }
                    if (this.f117758j) {
                        if (motionEvent.getPointerCount() == 1) {
                            this.f117749a.mo48367a(this.f117755g, motionEvent.getRawY(), f11, f12);
                        }
                        this.f117750b = m127540a;
                        this.f117751c = m127541b;
                        this.f117755g = motionEvent.getRawY();
                        VelocityTracker velocityTracker = this.f117757i;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                    }
                    if (this.f117756h == -1 && (interfaceC24921e = this.f117749a) != null) {
                        interfaceC24921e.mo48371c(this.f117754f, motionEvent.getRawY(), 0.0f);
                    }
                }
            }
            if (this.f117758j && this.f117757i != null) {
                this.f117750b = m127540a(motionEvent);
                this.f117751c = m127541b(motionEvent);
                this.f117757i.addMovement(motionEvent);
                this.f117757i.computeCurrentVelocity(1000);
                float xVelocity = this.f117757i.getXVelocity();
                float yVelocity = this.f117757i.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f117753e) {
                    this.f117749a.mo48373d(this.f117750b, this.f117751c, -xVelocity, -yVelocity);
                }
            }
            if (this.f117749a != null) {
                this.f117755g = motionEvent.getRawY();
                if (this.f117757i != null) {
                    this.f117749a.mo48371c(this.f117754f, motionEvent.getRawY(), this.f117757i.getYVelocity());
                } else {
                    this.f117749a.mo48371c(this.f117754f, motionEvent.getRawY(), 0.0f);
                }
            }
            VelocityTracker velocityTracker2 = this.f117757i;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f117757i = null;
            }
        } else {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f117757i = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f117750b = m127540a(motionEvent);
            this.f117751c = m127541b(motionEvent);
            this.f117754f = motionEvent.getRawY();
            this.f117755g = motionEvent.getRawY();
            this.f117758j = false;
            this.f117756h = AbstractC1622z.m8276d(motionEvent, 0);
        }
        return true;
    }

    /* renamed from: d */
    public void m127543d(InterfaceC24921e interfaceC24921e) {
        this.f117749a = interfaceC24921e;
    }
}
