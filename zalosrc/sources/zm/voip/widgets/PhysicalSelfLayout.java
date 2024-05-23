package zm.voip.widgets;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.zing.zalo.p077ui.custom.floating.FloatingController;
import kg.C21709f;
import uo0.C27352b;

/* loaded from: classes7.dex */
public class PhysicalSelfLayout extends FrameLayout implements FloatingController.InterfaceC11856a {

    /* renamed from: A */
    static float f150070A = 1000.0f;

    /* renamed from: p */
    public FloatingController f150071p;

    /* renamed from: q */
    private final int f150072q;

    /* renamed from: r */
    public C27352b f150073r;

    /* renamed from: s */
    public int f150074s;

    /* renamed from: t */
    public boolean f150075t;

    /* renamed from: u */
    public boolean f150076u;

    /* renamed from: v */
    private boolean f150077v;

    /* renamed from: w */
    private float f150078w;

    /* renamed from: x */
    private float f150079x;

    /* renamed from: y */
    private InterfaceC32498b f150080y;

    /* renamed from: z */
    private InterfaceC32497a f150081z;

    /* renamed from: zm.voip.widgets.PhysicalSelfLayout$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC32497a {
        /* renamed from: a */
        void mo142941a(float f11, float f12);
    }

    /* renamed from: zm.voip.widgets.PhysicalSelfLayout$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC32498b {
        /* renamed from: a */
        void mo142944a();
    }

    public PhysicalSelfLayout(Context context) {
        super(context);
        this.f150071p = new FloatingController(getContext(), this, 1000);
        this.f150072q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f150074s = 3;
        this.f150075t = false;
        this.f150076u = false;
        this.f150078w = 0.0f;
        this.f150079x = 0.0f;
        this.f150073r = new C27352b();
        this.f150071p.m65900t(r5.f128640a, r5.f128641b, r5.f128642c, r5.f128643d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
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
        int i14;
        double m112038j = c21709f2.m112038j();
        double m112038j2 = c21709f.m112038j();
        if (m112038j2 > 1500.0d) {
            i11 = this.f150073r.f128642c;
        } else if (Math.abs(m112038j2) > 1500.0d) {
            i11 = this.f150073r.f128640a;
        } else {
            double m112033d = c21709f.m112033d();
            C27352b c27352b = this.f150073r;
            int i15 = c27352b.f128640a;
            int i16 = c27352b.f128642c;
            if (m112033d > (i15 + i16) / 2.0f) {
                d11 = i16;
            } else {
                d11 = i15;
            }
            if (m112038j <= 2000.0d) {
                i12 = this.f150073r.f128643d;
            } else if (Math.abs(m112038j) > 2000.0d) {
                i12 = this.f150073r.f128641b;
            } else {
                double m112033d2 = c21709f2.m112033d();
                C27352b c27352b2 = this.f150073r;
                int i17 = c27352b2.f128643d;
                if (m112033d2 > i17 / 2.0f) {
                    d12 = i17;
                    if (d11 == 0.0d) {
                        if (d12 == 0.0d) {
                            this.f150074s = 3;
                        } else {
                            this.f150074s = 5;
                        }
                    } else if (d12 == 0.0d) {
                        this.f150074s = 2;
                    } else {
                        this.f150074s = 4;
                    }
                    i13 = this.f150074s;
                    if (i13 == 2 && i13 != 3) {
                        if (!this.f150076u) {
                            i14 = this.f150073r.f128643d;
                        } else {
                            i14 = this.f150073r.f128645f;
                        }
                    } else if (!this.f150076u) {
                        i14 = this.f150073r.f128641b;
                    } else {
                        i14 = this.f150073r.f128644e;
                    }
                    double d13 = i14;
                    c21709f.m112046s(d11);
                    c21709f2.m112046s(d13);
                }
                i12 = c27352b2.f128641b;
            }
            d12 = i12;
            if (d11 == 0.0d) {
            }
            i13 = this.f150074s;
            if (i13 == 2) {
            }
            if (!this.f150076u) {
            }
            double d132 = i14;
            c21709f.m112046s(d11);
            c21709f2.m112046s(d132);
        }
        d11 = i11;
        if (m112038j <= 2000.0d) {
        }
        d12 = i12;
        if (d11 == 0.0d) {
        }
        i13 = this.f150074s;
        if (i13 == 2) {
        }
        if (!this.f150076u) {
        }
        double d1322 = i14;
        c21709f.m112046s(d11);
        c21709f2.m112046s(d1322);
    }

    /* renamed from: a */
    public void m157380a(float f11, float f12, boolean z11, boolean z12) {
        double d11;
        double d12;
        if (z11) {
            if (z12) {
                float m65891h = this.f150071p.m65891h();
                int i11 = this.f150073r.f128640a;
                if (m65891h > i11 / 2.0f) {
                    d11 = 0.0d;
                } else {
                    d11 = i11;
                }
                float m65892i = this.f150071p.m65892i();
                int i12 = this.f150073r.f128643d;
                if (m65892i > i12 / 2.0f) {
                    d12 = i12;
                } else {
                    d12 = 0.0d;
                }
                if (d11 == 0.0d) {
                    if (d12 == 0.0d) {
                        this.f150074s = 3;
                    } else {
                        this.f150074s = 5;
                    }
                } else if (d12 == 0.0d) {
                    this.f150074s = 2;
                } else {
                    this.f150074s = 4;
                }
            }
            this.f150071p.m65898r(f11, f12);
            this.f150081z.mo142941a(f11, f12);
            return;
        }
        this.f150071p.m65897q(f11, f12);
    }

    /* renamed from: b */
    public void m157381b(float f11, float f12) {
        m157382c(f11, f12, 0);
    }

    /* renamed from: c */
    public void m157382c(float f11, float f12, int i11) {
        animate().translationX(f11).translationY(f12).setDuration(i11).start();
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: d */
    public void mo65912d(C21709f c21709f, C21709f c21709f2) {
        this.f150081z.mo142941a((float) c21709f.m112033d(), (float) c21709f2.m112033d());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f150071p.m65895m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f150071p.m65894l();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f150080y != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        if (Math.hypot(rawX - this.f150078w, rawY - this.f150079x) > this.f150072q) {
                            this.f150077v = true;
                        }
                    }
                } else if (!this.f150077v) {
                    this.f150080y.mo142944a();
                }
            } else {
                this.f150077v = false;
                this.f150078w = motionEvent.getRawX();
                this.f150079x = motionEvent.getRawY();
            }
        }
        FloatingController floatingController = this.f150071p;
        floatingController.m65901u(floatingController.m65893k());
        if (this.f150075t) {
            this.f150071p.m65896n(motionEvent);
        }
        return true;
    }

    public void setAnimationUpdateListener(InterfaceC32497a interfaceC32497a) {
        this.f150081z = interfaceC32497a;
    }

    public void setOnClickListener(InterfaceC32498b interfaceC32498b) {
        this.f150080y = interfaceC32498b;
    }

    public void setThreshold(C27352b c27352b) {
        this.f150073r = c27352b;
        this.f150071p.m65900t(c27352b.f128640a, c27352b.f128641b, c27352b.f128642c, c27352b.f128643d);
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
            pointF = new PointF(f150070A, 0.0f);
            if (this.f150071p.m65891h() < this.f150073r.f128642c / 2.0f) {
                pointF.x = -f150070A;
            }
        }
        return pointF;
    }
}
