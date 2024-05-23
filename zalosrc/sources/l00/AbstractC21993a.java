package l00;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1928u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l00.a */
/* loaded from: classes4.dex */
public abstract class AbstractC21993a extends AbstractC21994b {

    /* renamed from: H */
    private float f108310H;

    /* renamed from: I */
    private int f108311I;

    /* renamed from: J */
    private boolean f108312J;

    /* renamed from: K */
    private int f108313K;

    public AbstractC21993a(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        super(recyclerView, stateListDrawable, drawable, stateListDrawable2, drawable2, i11, i12, i13);
        this.f108313K = 1;
        this.f108311I = 5;
    }

    /* renamed from: N */
    private boolean m114831N(int i11) {
        if (i11 >= 0 && i11 < this.f108341u.getAdapter().mo10003k()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private void m114832O(float f11, int i11) {
        if (i11 != 0) {
            this.f108341u.scrollBy(0, i11);
            return;
        }
        if (f11 != 0.0f && !m114837T()) {
            if (f11 >= this.f108340t - this.f108324d || m114836S()) {
                this.f108341u.m9837K1(r2.getAdapter().mo10003k() - 1);
                return;
            }
            return;
        }
        this.f108341u.m9837K1(0);
    }

    /* renamed from: P */
    private boolean m114833P(float f11) {
        int i11;
        int m114840W;
        try {
            RecyclerView.AbstractC1888o layoutManager = this.f108341u.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int m9740Y1 = linearLayoutManager.m9740Y1();
                int m9745c2 = linearLayoutManager.m9745c2();
                if (m9740Y1 >= 0 && m9745c2 >= 0) {
                    View mo9732P = linearLayoutManager.mo9732P(m9740Y1);
                    View mo9732P2 = linearLayoutManager.mo9732P(m9745c2);
                    if (mo9732P != null && mo9732P2 != null) {
                        AbstractC1928u m10644b = AbstractC1928u.m10644b(layoutManager, linearLayoutManager.m9750h());
                        i11 = Math.abs(m10644b.mo10646d(mo9732P2) - m10644b.mo10649g(mo9732P)) / m114840W(Math.abs(m9745c2 - m9740Y1) + 1);
                    }
                    return false;
                }
                i11 = 0;
                if (i11 <= 0 || (m114840W = m114840W(this.f108341u.getAdapter().mo10003k())) == 0) {
                    return false;
                }
                int m114834Q = (int) ((((m114840W * i11) - this.f108340t) + m114834Q()) * f11);
                int i12 = (m114834Q / i11) * this.f108313K;
                int i13 = -(m114834Q % i11);
                if (!m114831N(i12)) {
                    return false;
                }
                linearLayoutManager.m9721B2(i12, i13);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: Q */
    private int m114834Q() {
        RecyclerView recyclerView = this.f108341u;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop() + this.f108341u.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: R */
    private boolean m114835R(float f11) {
        if (Math.abs(f11 - this.f108335o) > this.f108311I) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m114836S() {
        if (this.f108334n + (this.f108333m / 2) >= this.f108340t - this.f108324d) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m114837T() {
        if (this.f108334n - (this.f108333m / 2) <= this.f108323c) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private void m114838U() {
    }

    /* renamed from: V */
    private void m114839V() {
    }

    /* renamed from: W */
    private int m114840W(int i11) {
        return (int) Math.ceil(i11 / this.f108313K);
    }

    @Override // l00.AbstractC21994b
    /* renamed from: C */
    protected void mo114841C(int i11, int i12) {
        int i13 = this.f108340t;
        int i14 = ((int) (i13 - (this.f108323c + this.f108324d))) - this.f108333m;
        int m114834Q = (i12 - i13) + m114834Q();
        if (m114834Q != 0 && i14 != 0) {
            this.f108334n = (int) ((i14 * (i11 / m114834Q)) + (this.f108333m / 2.0f) + this.f108323c);
        }
    }

    @Override // l00.AbstractC21994b
    /* renamed from: M */
    protected void mo114842M(float f11) {
        int i11;
        float m114862m = m114862m(f11);
        int[] m114865t = m114865t();
        int i12 = (int) (m114865t[0] + this.f108323c);
        m114865t[0] = i12;
        int i13 = (int) (m114865t[1] - this.f108324d);
        m114865t[1] = i13;
        float max = Math.max(i12, Math.min(i13, m114862m));
        int i14 = m114865t[1];
        int i15 = m114865t[0];
        int i16 = i14 - i15;
        if (i16 == 0 || (i11 = i16 - this.f108333m) == 0) {
            return;
        }
        float f12 = (max - this.f108310H) - i15;
        float f13 = i11;
        if (!m114833P(Math.max(0.0f, Math.min(f12, f13)) / f13)) {
            int m114843X = m114843X(this.f108335o, max, m114865t, this.f108340t, this.f108333m);
            if (m114843X == 0) {
                return;
            } else {
                m114832O(max, m114843X);
            }
        }
        this.f108335o = max;
    }

    /* renamed from: X */
    protected int m114843X(float f11, float f12, int[] iArr, int i11, int i12) {
        int i13;
        int i14;
        int computeVerticalScrollOffset = this.f108341u.computeVerticalScrollOffset();
        int computeVerticalScrollRange = this.f108341u.computeVerticalScrollRange();
        if (computeVerticalScrollRange == 0 || (i13 = iArr[1] - iArr[0]) == 0 || (i14 = i13 - i12) == 0) {
            return 0;
        }
        int m114834Q = (computeVerticalScrollRange - i11) + m114834Q();
        int i15 = (int) (((f12 - f11) / i14) * m114834Q);
        int i16 = computeVerticalScrollOffset + i15;
        if (i16 <= m114834Q && i16 >= 0) {
            return i15;
        }
        if (i16 > m114834Q) {
            return m114834Q - computeVerticalScrollOffset;
        }
        return -computeVerticalScrollOffset;
    }

    /* renamed from: Y */
    public void m114844Y(int i11) {
        this.f108313K = i11;
    }

    @Override // l00.AbstractC21994b, androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: a */
    public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 || !m114868x() || this.f108345y != 2 || m114835R(motionEvent.getY())) {
            super.mo951a(recyclerView, motionEvent);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    this.f108310H = 0.0f;
                }
            } else if (m114868x()) {
                this.f108310H = motionEvent.getY() - (this.f108334n - (this.f108333m / 2));
                this.f108335o = motionEvent.getY();
            }
            if (this.f108312J && !m114868x()) {
                this.f108312J = false;
                m114839V();
            }
        }
    }

    @Override // l00.AbstractC21994b, androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: c */
    public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean mo953c = super.mo953c(recyclerView, motionEvent);
        if (motionEvent.getAction() == 0 && m114868x()) {
            this.f108310H = motionEvent.getY() - (this.f108334n - (this.f108333m / 2));
            this.f108335o = motionEvent.getY();
        }
        if (m114868x()) {
            this.f108312J = true;
            m114838U();
        }
        return mo953c;
    }
}
