package com.zing.zalo.p077ui.custom.floating;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16803z;
import gg0.AbstractC19444a;
import kd0.C21693c;
import kg.C21709f;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public class MiniMenuFloatingView extends FloatingView {

    /* renamed from: c0 */
    private static final int f61799c0 = AbstractC23136l9.m118742r(50.0f);

    /* renamed from: d0 */
    private static final int f61800d0 = AbstractC23136l9.m118742r(30.0f);

    /* renamed from: V */
    private final float f61801V;

    /* renamed from: W */
    View.OnClickListener f61802W;

    /* renamed from: a0 */
    public int f61803a0;

    /* renamed from: b0 */
    private boolean f61804b0;

    public MiniMenuFloatingView(Context context, int i11, int i12) {
        super(context);
        this.f61801V = AbstractC23136l9.m118742r(22.0f);
        this.f61803a0 = 1;
        this.f61804b0 = false;
        setup(i11);
        this.f61803a0 = i12;
        setLayoutParams(new ViewGroup.LayoutParams(f61799c0, f61800d0));
    }

    /* renamed from: b0 */
    private void m65920b0() {
        View view = (View) getParent();
        if (view == null) {
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int i11 = width - f61799c0;
        int i12 = height - f61800d0;
        if (this.f61792O != 0 || this.f61794Q != 0 || this.f61793P != i11 || this.f61795R != i12) {
            this.f61792O = 0;
            this.f61794Q = 0;
            this.f61793P = i11;
            this.f61795R = i12;
            float f11 = 0;
            this.f61797T.m65900t(f11, f11, i11, i12);
            m65921c0();
        }
    }

    /* renamed from: c0 */
    private void m65921c0() {
        int i11 = this.f61803a0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        m65922d0(this.f61793P, this.f61795R);
                        return;
                    }
                    return;
                }
                m65922d0(0.0f, this.f61795R);
                return;
            }
            m65922d0(this.f61793P, 0.0f);
            return;
        }
        m65922d0(0.0f, 0.0f);
    }

    /* renamed from: d0 */
    private void m65922d0(float f11, float f12) {
        this.f61797T.m65902v(f11, f12);
        m65919a0(f11, f12);
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: A */
    public void mo65911A(C21709f c21709f, C21709f c21709f2) {
        double d11;
        double d12;
        double m112038j = c21709f2.m112038j();
        double m112038j2 = c21709f.m112038j();
        double m65892i = this.f61797T.m65892i();
        double d13 = 0.0d;
        if (m112038j2 > 1500.0d) {
            d11 = this.f61793P;
        } else {
            if (Math.abs(m112038j2) <= 1500.0d) {
                double m112033d = c21709f.m112033d();
                int i11 = this.f61793P;
                if (m112033d > i11 / 2) {
                    d11 = i11;
                }
            }
            d11 = 0.0d;
        }
        if (Math.abs(m112038j) > 2000.0d) {
            d12 = m112038j * this.f61795R;
        } else {
            d12 = m112038j / 10.0d;
        }
        double d14 = m65892i + ((int) d12);
        if (d14 >= 0.0d) {
            int i12 = this.f61795R;
            if (d14 > i12) {
                d13 = i12;
            } else {
                d13 = d14;
            }
        }
        c21709f.m112046s(d11);
        c21709f2.m112046s(d13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.custom.floating.FloatingView
    /* renamed from: X */
    public void mo65918X() {
        super.mo65918X();
        C21693c c21693c = new C21693c(getContext());
        c21693c.m89106L().m89025I(true).m89028L(-1, -1);
        c21693c.m111929z1(6);
        c21693c.mo111926w1(AbstractC16803z.icn_header_close_white_mini);
        mo69681L(c21693c);
        m65921c0();
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.floating.a
            @Override // java.lang.Runnable
            public final void run() {
                MiniMenuFloatingView.this.requestLayout();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: d */
    public void mo65912d(C21709f c21709f, C21709f c21709f2) {
        float m112033d = (float) c21709f.m112033d();
        float m112033d2 = (float) c21709f2.m112033d();
        if (!c21709f.m112040m() && this.f61797T.m65890g() != 2) {
            if (m112033d < 0.0f) {
                c21709f.m112045r(0.0f, false);
                m112033d = 0.0f;
            } else {
                int i11 = this.f61793P;
                if (m112033d > i11) {
                    m112033d = i11;
                    c21709f.m112045r(m112033d, false);
                }
            }
            if (Math.abs(c21709f.m112038j()) < 1500.0d) {
                if (c21709f.m112034f() == 0.0d) {
                    int i12 = this.f61793P;
                    if (m112033d > i12 / 2) {
                        c21709f.m112046s(i12);
                    }
                }
                if (c21709f.m112034f() == this.f61793P && m112033d < r1 / 2) {
                    c21709f.m112046s(0.0d);
                }
            }
        } else {
            this.f61797T.m65899s(2);
        }
        m65919a0(m112033d, m112033d2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.ModulesView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m65920b0();
    }

    @Override // com.zing.zalo.uidrawing.ModulesView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        this.f61804b0 = this.f61797T.m65896n(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                setAlpha(this.f61796S);
                if (!this.f61804b0 && (onClickListener = this.f61802W) != null) {
                    onClickListener.onClick(this);
                }
            }
        } else {
            setAlpha((float) (this.f61796S * 0.75d));
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setButtonCloseClickListener(View.OnClickListener onClickListener) {
        this.f61802W = onClickListener;
    }

    public void setup(int i11) {
        float f11 = this.f61801V;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f11, f11, f11, f11, f11, f11, f11, f11}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setAntiAlias(true);
        setBackground(shapeDrawable);
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: z */
    public PointF mo65914z(PointF pointF) {
        if (pointF == null || (pointF.x == 0.0f && pointF.y == 0.0f)) {
            pointF = new PointF(FloatingView.f61787U, 0.0f);
            if (this.f61797T.m65891h() < this.f61793P / 2) {
                pointF.x = -FloatingView.f61787U;
            }
        }
        return pointF;
    }
}
