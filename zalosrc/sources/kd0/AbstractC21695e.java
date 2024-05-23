package kd0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;

/* renamed from: kd0.e */
/* loaded from: classes4.dex */
public abstract class AbstractC21695e extends C16719g {

    /* renamed from: D0 */
    protected View f105343D0;

    /* renamed from: E0 */
    protected int f105344E0;

    /* renamed from: F0 */
    protected int f105345F0;

    public AbstractC21695e(Context context, View view) {
        super(context);
        this.f105343D0 = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: S0 */
    public void mo89118S0(ViewGroup viewGroup) {
        super.mo89118S0(viewGroup);
        m111941g1(this.f84784q);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: b1 */
    public void mo44614b1(int i11) {
        super.mo44614b1(i11);
        this.f105343D0.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: e0 */
    public void mo89137e0() {
        super.mo89137e0();
        this.f105343D0.setVisibility(8);
    }

    /* renamed from: g1 */
    void m111941g1(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.addView(this.f105343D0);
    }

    /* renamed from: h1 */
    void m111942h1(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(this.f105343D0);
    }

    /* renamed from: i1 */
    public View m111943i1() {
        return this.f105343D0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: m */
    public void mo89147m() {
        m111942h1(this.f84784q);
        super.mo89147m();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: p0 */
    public void mo44848p0(int i11, int i12, int i13, int i14) {
        super.mo44848p0(i11, i12, i13, i14);
        this.f105343D0.layout(m89096G(), m89098H(), (m89096G() + i13) - i11, (m89098H() + i14) - i12);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        super.mo44180q0(i11, i12, i13, i14);
        int m89016r = C16718f.m89016r(i11, m89106L().m89057j(), m89106L().m89053h());
        int m89016r2 = C16718f.m89016r(i13, m89106L().m89055i(), m89106L().m89051g());
        if (this.f105344E0 == 0) {
            this.f105344E0 = m89016r;
        }
        if (this.f105345F0 == 0) {
            this.f105345F0 = m89016r2;
        }
        if (i12 != 1073741824) {
            if (i12 == Integer.MIN_VALUE) {
                m89016r = Math.min(m89016r, this.f105344E0);
            } else {
                m89016r = this.f105344E0;
            }
        }
        if (i14 != 1073741824) {
            if (i14 == Integer.MIN_VALUE) {
                m89016r2 = Math.min(m89016r2, this.f105345F0);
            } else {
                m89016r2 = this.f105345F0;
            }
        }
        this.f105343D0.measure(View.MeasureSpec.makeMeasureSpec(m89016r, i12), View.MeasureSpec.makeMeasureSpec(m89016r2, i14));
        if (i12 != 1073741824) {
            m89016r = this.f105343D0.getMeasuredWidth();
        }
        if (i14 != 1073741824) {
            m89016r2 = this.f105343D0.getMeasuredHeight();
        }
        m89097G0(m89016r, m89016r2);
    }
}
