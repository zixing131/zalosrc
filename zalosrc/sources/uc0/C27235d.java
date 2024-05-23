package uc0;

import android.view.View;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.uicontrol.draggableview.DraggableView;
import p337m1.C22712c;

/* renamed from: uc0.d */
/* loaded from: classes4.dex */
public class C27235d extends C22712c.c {

    /* renamed from: a */
    private DraggableView f128000a;

    /* renamed from: b */
    private View f128001b;

    public C27235d(DraggableView draggableView, View view) {
        this.f128000a = draggableView;
        this.f128001b = view;
    }

    /* renamed from: n */
    private void m139348n(float f11) {
        if (f11 < 0.0f && f11 <= -1500.0f) {
            this.f128000a.m88299e();
            return;
        }
        if (f11 > 0.0f && f11 >= 1500.0f) {
            this.f128000a.m88300f();
        } else if (AbstractC1579n0.m7844W(this.f128001b) < (this.f128000a.getWidth() * 0.6d) - (this.f128001b.getWidth() * AbstractC1579n0.m7826N(this.f128001b))) {
            this.f128000a.m88299e();
        } else {
            this.f128000a.m88314x();
        }
    }

    /* renamed from: o */
    private void m139349o(float f11) {
        if (f11 < 0.0f && f11 <= -1000.0f) {
            if (this.f128000a.m88309p()) {
                this.f128000a.m88301g();
                return;
            } else {
                this.f128000a.m88313w();
                return;
            }
        }
        if (f11 > 0.0f && f11 >= 1000.0f) {
            this.f128000a.m88314x();
            return;
        }
        if (this.f128000a.m88310q()) {
            if (this.f128000a.m88309p() && this.f128000a.f83696E - this.f128001b.getTop() > 100) {
                this.f128000a.m88301g();
                return;
            } else {
                this.f128000a.m88313w();
                return;
            }
        }
        this.f128000a.m88314x();
    }

    @Override // p337m1.C22712c.c
    /* renamed from: a */
    public int mo8626a(View view, int i11, int i12) {
        int left = this.f128001b.getLeft();
        if ((this.f128000a.m88307m() && this.f128000a.m88308n() && Math.abs(i12) > 5) || (this.f128000a.m88307m() && !this.f128000a.m88308n())) {
            int width = this.f128000a.getWidth();
            DraggableView draggableView = this.f128000a;
            if (i11 > width - draggableView.f83699H) {
                return draggableView.getWidth() - this.f128000a.f83699H;
            }
            return i11;
        }
        return left;
    }

    @Override // p337m1.C22712c.c
    /* renamed from: b */
    public int mo8627b(View view, int i11, int i12) {
        int i13;
        int top = this.f128001b.getTop();
        if (!this.f128000a.m88307m()) {
            top = this.f128001b.getTop() + i12;
        }
        if ((this.f128000a.m88307m() && this.f128000a.m88308n() && Math.abs(i12) >= 15) || (!this.f128000a.m88311r() && !this.f128000a.m88307m())) {
            int i14 = -this.f128001b.getMeasuredHeight();
            float height = this.f128000a.getHeight();
            float height2 = this.f128001b.getHeight();
            DraggableView draggableView = this.f128000a;
            top = Math.min(Math.max(i11, i14), (int) ((((height - (height2 * draggableView.f83728v)) - (draggableView.f83729w - (this.f128001b.getPaddingBottom() * this.f128000a.f83728v))) - DraggableView.f83691h0) - r2.getPaddingBottom()));
        }
        DraggableView draggableView2 = this.f128000a;
        if (!draggableView2.f83721g0 && top < (i13 = draggableView2.f83696E)) {
            return i13;
        }
        return top;
    }

    @Override // p337m1.C22712c.c
    /* renamed from: k */
    public void mo8634k(View view, int i11, int i12, int i13, int i14) {
        this.f128000a.m88315y(i11, i12, i13, i14);
    }

    @Override // p337m1.C22712c.c
    /* renamed from: l */
    public void mo8635l(View view, float f11, float f12) {
        super.mo8635l(view, f11, f12);
        if (this.f128000a.m88307m() && !this.f128000a.m88308n()) {
            m139348n(f11);
        } else {
            m139349o(f12);
        }
    }

    @Override // p337m1.C22712c.c
    /* renamed from: m */
    public boolean mo8636m(View view, int i11) {
        if (view.equals(this.f128001b) && this.f128000a.f83720f0) {
            return true;
        }
        return false;
    }
}
