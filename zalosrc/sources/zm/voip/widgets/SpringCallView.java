package zm.voip.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.zing.zalo.p077ui.custom.floating.FloatingController;
import kg.C21709f;
import zm.voip.widgets.SpringCallView;

/* loaded from: classes7.dex */
public class SpringCallView extends FrameLayout implements FloatingController.InterfaceC11856a {

    /* renamed from: F */
    static float f150106F = 1000.0f;

    /* renamed from: A */
    private float f150107A;

    /* renamed from: B */
    private boolean f150108B;

    /* renamed from: C */
    public boolean f150109C;

    /* renamed from: D */
    public boolean f150110D;

    /* renamed from: E */
    private InterfaceC32503a f150111E;

    /* renamed from: p */
    public FloatingController f150112p;

    /* renamed from: q */
    private final int f150113q;

    /* renamed from: r */
    public int f150114r;

    /* renamed from: s */
    public int f150115s;

    /* renamed from: t */
    public int f150116t;

    /* renamed from: u */
    public int f150117u;

    /* renamed from: v */
    public int f150118v;

    /* renamed from: w */
    private final int[] f150119w;

    /* renamed from: x */
    public boolean f150120x;

    /* renamed from: y */
    private boolean f150121y;

    /* renamed from: z */
    private float f150122z;

    /* renamed from: zm.voip.widgets.SpringCallView$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC32503a {
        /* renamed from: a */
        void mo157152a();

        /* renamed from: b */
        void mo157153b();
    }

    /* renamed from: zm.voip.widgets.SpringCallView$b */
    /* loaded from: classes7.dex */
    public enum EnumC32504b {
        SCALE_TO_NORMAL,
        SCALE_UP
    }

    public SpringCallView(Context context) {
        super(context);
        this.f150112p = new FloatingController(getContext(), this, 1000);
        this.f150113q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f150114r = 0;
        this.f150115s = 0;
        this.f150116t = 0;
        this.f150117u = 0;
        this.f150118v = 1;
        this.f150119w = new int[]{0, 1, 2, 3};
        this.f150120x = false;
        this.f150122z = 0.0f;
        this.f150107A = 0.0f;
        this.f150109C = false;
        this.f150110D = false;
    }

    /* renamed from: c */
    private boolean m157405c(int i11) {
        if (this.f150119w[i11] != i11) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m157406e(ValueAnimator valueAnimator) {
        if (!this.f150110D) {
            m157408b(this.f150118v, true, false, false);
        }
    }

    /* renamed from: k */
    private void m157407k(EnumC32504b enumC32504b, boolean z11, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        long j11 = 0;
        if (enumC32504b == EnumC32504b.SCALE_UP && (getScaleX() != 1.5f || getScaleY() != 1.5f)) {
            ViewPropertyAnimator updateListener = animate().scaleX(1.5f).scaleY(1.5f).setUpdateListener(animatorUpdateListener);
            if (z11) {
                j11 = 300;
            }
            updateListener.setDuration(j11).start();
            return;
        }
        if (enumC32504b == EnumC32504b.SCALE_TO_NORMAL) {
            if (getScaleX() != 1.0f || getScaleY() != 1.0f) {
                ViewPropertyAnimator updateListener2 = animate().scaleX(1.0f).scaleY(1.0f).setUpdateListener(animatorUpdateListener);
                if (z11) {
                    j11 = 300;
                }
                updateListener2.setDuration(j11).start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo65911A(C21709f c21709f, C21709f c21709f2) {
        double d11;
        int i11;
        int i12;
        double d12;
        int i13;
        double m112038j = c21709f2.m112038j();
        double m112038j2 = c21709f.m112038j();
        if (m112038j2 > 1500.0d) {
            i11 = this.f150115s;
        } else if (Math.abs(m112038j2) > 1500.0d) {
            i11 = this.f150114r;
        } else {
            double m112033d = c21709f.m112033d();
            int i14 = this.f150114r;
            int i15 = this.f150115s;
            if (m112033d > (i14 + i15) / 2.0f) {
                d11 = i15;
            } else {
                d11 = i14;
            }
            if (m112038j <= 2000.0d) {
                i12 = this.f150117u;
            } else if (Math.abs(m112038j) > 2000.0d) {
                i12 = this.f150116t;
            } else {
                double m112033d2 = c21709f2.m112033d();
                int i16 = this.f150117u;
                if (m112033d2 > i16 / 2.0f) {
                    d12 = i16;
                    if (this.f150108B) {
                        if (d11 == 0.0d) {
                            if (d12 == this.f150116t) {
                                if (!this.f150109C) {
                                    this.f150118v = 1;
                                }
                            } else {
                                if (!this.f150109C) {
                                    this.f150118v = 3;
                                }
                                i13 = this.f150117u;
                                d12 = i13;
                            }
                        } else if (d12 == this.f150116t) {
                            if (!this.f150109C) {
                                this.f150118v = 0;
                            }
                        } else {
                            if (!this.f150109C) {
                                this.f150118v = 2;
                            }
                            i13 = this.f150117u;
                            d12 = i13;
                        }
                    }
                    if (m157405c(this.f150118v)) {
                        int i17 = this.f150119w[this.f150118v];
                        this.f150118v = i17;
                        m157408b(i17, false, true, false);
                        return;
                    } else {
                        c21709f.m112046s(d11);
                        c21709f2.m112046s(d12);
                        return;
                    }
                }
                i12 = this.f150116t;
            }
            d12 = i12;
            if (this.f150108B) {
            }
            if (m157405c(this.f150118v)) {
            }
        }
        d11 = i11;
        if (m112038j <= 2000.0d) {
        }
        d12 = i12;
        if (this.f150108B) {
        }
        if (m157405c(this.f150118v)) {
        }
    }

    /* renamed from: b */
    public void m157408b(int i11, boolean z11, boolean z12, boolean z13) {
        if (z13) {
            m157407k(EnumC32504b.SCALE_TO_NORMAL, true, null);
        }
        int i12 = this.f150119w[i11];
        this.f150118v = i12;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        m157411h(this.f150115s, this.f150117u, z11, z12);
                        return;
                    }
                    return;
                }
                m157411h(this.f150114r, this.f150117u, z11, z12);
                return;
            }
            m157411h(this.f150115s, this.f150116t, z11, z12);
            return;
        }
        m157411h(this.f150114r, this.f150116t, z11, z12);
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: d */
    public void mo65912d(C21709f c21709f, C21709f c21709f2) {
        m157412i((float) c21709f.m112033d(), (float) c21709f2.m112033d());
    }

    /* renamed from: f */
    public void m157409f(int i11, int i12) {
        this.f150119w[i11] = i12;
    }

    /* renamed from: g */
    public void m157410g(EnumC32504b enumC32504b, boolean z11) {
        m157407k(enumC32504b, z11, new ValueAnimator.AnimatorUpdateListener() { // from class: ep0.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SpringCallView.this.m157406e(valueAnimator);
            }
        });
    }

    /* renamed from: h */
    public void m157411h(float f11, float f12, boolean z11, boolean z12) {
        double d11;
        double d12;
        if (z11) {
            if (z12) {
                float m65891h = this.f150112p.m65891h();
                int i11 = this.f150114r;
                if (m65891h > i11 / 2.0f) {
                    d11 = 0.0d;
                } else {
                    d11 = i11;
                }
                float m65892i = this.f150112p.m65892i();
                int i12 = this.f150117u;
                if (m65892i > i12 / 2.0f) {
                    d12 = i12;
                } else {
                    d12 = 0.0d;
                }
                if (d11 == 0.0d) {
                    if (d12 == 0.0d) {
                        this.f150118v = 1;
                    } else {
                        this.f150118v = 3;
                    }
                } else if (d12 == 0.0d) {
                    this.f150118v = 0;
                } else {
                    this.f150118v = 2;
                }
            }
            this.f150112p.m65898r(f11, f12);
            m157412i(f11, f12);
            return;
        }
        this.f150112p.m65897q(f11, f12);
    }

    /* renamed from: i */
    public void m157412i(float f11, float f12) {
        if (getScaleX() != 1.0f || getScaleY() != 1.0f) {
            float scaleX = (getScaleX() - 1.0f) * getWidth() * 0.5f;
            float scaleY = (getScaleY() - 1.0f) * getHeight() * 0.5f;
            int i11 = this.f150118v;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            f11 -= scaleX;
                        }
                    } else {
                        f11 += scaleX;
                    }
                    f12 -= scaleY;
                } else {
                    f11 -= scaleX;
                }
            } else {
                f11 += scaleX;
            }
            f12 += scaleY;
        }
        setTranslationX(f11);
        setTranslationY(f12);
    }

    /* renamed from: j */
    public void m157413j(int i11, int i12, int i13, int i14) {
        this.f150108B = true;
        if (this.f150114r != i11 || this.f150116t != i12 || this.f150115s != i13 || this.f150117u != i14) {
            this.f150114r = i11;
            this.f150116t = i12;
            this.f150115s = i13;
            this.f150117u = i14;
            this.f150112p.m65900t(i11, i12, i13, i14);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f150112p.m65895m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f150112p.m65894l();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f150120x) {
            return false;
        }
        this.f150109C = false;
        if (this.f150111E != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        this.f150110D = false;
                    } else {
                        this.f150110D = true;
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        if (Math.hypot(rawX - this.f150122z, rawY - this.f150107A) > this.f150113q) {
                            this.f150121y = true;
                        }
                    }
                } else {
                    this.f150110D = false;
                    if (this.f150121y) {
                        this.f150111E.mo157153b();
                    } else {
                        this.f150111E.mo157152a();
                    }
                }
            } else {
                this.f150110D = true;
                this.f150121y = false;
                this.f150122z = motionEvent.getRawX();
                this.f150107A = motionEvent.getRawY();
            }
        }
        FloatingController floatingController = this.f150112p;
        floatingController.m65901u(floatingController.m65893k());
        if (this.f150120x) {
            this.f150112p.m65896n(motionEvent);
        }
        return true;
    }

    public void setOnTouchListener(InterfaceC32503a interfaceC32503a) {
        this.f150111E = interfaceC32503a;
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: x */
    public PointF mo65913x(float f11, float f12, MotionEvent motionEvent) {
        return null;
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: z */
    public PointF mo65914z(PointF pointF) {
        if (pointF == null || (pointF.x == 0.0f && pointF.y == 0.0f)) {
            pointF = new PointF(f150106F, 0.0f);
            if (this.f150112p.m65891h() < this.f150115s / 2.0f) {
                pointF.x = -f150106F;
            }
        }
        return pointF;
    }
}
