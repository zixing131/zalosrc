package mv;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.MainApplication;

/* renamed from: mv.h */
/* loaded from: classes4.dex */
public class C23455h implements RecyclerView.InterfaceC1891r {

    /* renamed from: j */
    private static final int f113936j = ViewConfiguration.get(MainApplication.getAppContext()).getScaledTouchSlop();

    /* renamed from: a */
    private final a f113937a;

    /* renamed from: b */
    private float f113938b;

    /* renamed from: c */
    private float f113939c;

    /* renamed from: d */
    private VelocityTracker f113940d;

    /* renamed from: e */
    private boolean f113941e;

    /* renamed from: f */
    private boolean f113942f;

    /* renamed from: g */
    private View f113943g;

    /* renamed from: h */
    private float f113944h;

    /* renamed from: i */
    private boolean f113945i;

    /* renamed from: mv.h$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo123156a(View view, int i11);
    }

    public C23455h(a aVar) {
        this.f113937a = aVar;
    }

    /* renamed from: b */
    private void m123153b(View view) {
        if (view != null) {
            view.animate().translationY(0.0f).alpha(1.0f).setDuration(300L).setListener(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: a */
    public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float f11 = 0.0f;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return;
                }
            } else {
                VelocityTracker velocityTracker = this.f113940d;
                if (velocityTracker != null && this.f113943g != null) {
                    velocityTracker.addMovement(motionEvent);
                    if (this.f113941e) {
                        float y11 = (motionEvent.getY() - this.f113939c) / 2.0f;
                        if (y11 <= 0.0f) {
                            f11 = y11;
                        }
                        if (f11 != this.f113943g.getTranslationY()) {
                            this.f113943g.setTranslationY(f11);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        VelocityTracker velocityTracker2 = this.f113940d;
        if (velocityTracker2 != null && this.f113943g != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f113940d.computeCurrentVelocity(1000);
            float yVelocity = this.f113940d.getYVelocity();
            float abs = Math.abs(yVelocity);
            if (this.f113941e) {
                if ((abs >= 200.0f && yVelocity < 0.0f) || Math.abs(this.f113943g.getTranslationY()) >= (this.f113944h / 0.5f) * 0.3f) {
                    a aVar = this.f113937a;
                    if (aVar != null && (view = this.f113943g) != null) {
                        aVar.mo123156a(view, recyclerView.m9820B0(view));
                    }
                } else if (this.f113943g.getTranslationY() != 0.0f) {
                    m123153b(this.f113943g);
                }
            }
            m123155f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: c */
    public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z11;
        boolean z12 = false;
        if (this.f113937a == null) {
            return false;
        }
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return false;
                        }
                    } else {
                        VelocityTracker velocityTracker = this.f113940d;
                        if (velocityTracker == null || this.f113943g == null) {
                            return false;
                        }
                        velocityTracker.addMovement(motionEvent);
                        double atan = Math.atan(Math.abs((motionEvent.getY() - this.f113939c) / (motionEvent.getX() - this.f113938b)));
                        float abs = Math.abs(motionEvent.getY() - this.f113939c);
                        int i11 = f113936j;
                        if (abs > i11 && Math.abs(atan) > 0.7853981633974483d && !this.f113942f && !this.f113945i) {
                            try {
                                this.f113941e = true;
                                z11 = true;
                            } catch (Exception e11) {
                                e = e11;
                                z12 = true;
                                e.printStackTrace();
                                return z12;
                            }
                        } else {
                            z11 = false;
                        }
                        try {
                            if (Math.abs(motionEvent.getX() - this.f113938b) > i11 && Math.abs(atan) <= 0.7853981633974483d) {
                                if (!this.f113941e) {
                                    this.f113942f = true;
                                    return false;
                                }
                            }
                            return z11;
                        } catch (Exception e12) {
                            e = e12;
                            z12 = z11;
                            e.printStackTrace();
                            return z12;
                        }
                    }
                }
                if (!this.f113942f && this.f113941e) {
                    return true;
                }
                m123155f();
                return false;
            }
            View m9893m0 = recyclerView.m9893m0(motionEvent.getX(), motionEvent.getY());
            this.f113943g = m9893m0;
            if (m9893m0 == null) {
                return false;
            }
            this.f113938b = motionEvent.getX();
            this.f113939c = motionEvent.getY();
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f113940d = obtain;
            obtain.addMovement(motionEvent);
            this.f113944h = this.f113943g.getHeight() * 0.5f;
            return false;
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* renamed from: d */
    public void m123154d(boolean z11) {
        this.f113945i = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: e */
    public void mo954e(boolean z11) {
    }

    /* renamed from: f */
    void m123155f() {
        VelocityTracker velocityTracker = this.f113940d;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f113940d = null;
        }
        this.f113939c = 0.0f;
        this.f113938b = 0.0f;
        this.f113941e = false;
        this.f113942f = false;
    }
}
