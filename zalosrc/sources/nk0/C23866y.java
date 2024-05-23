package nk0;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.TextUtils;
import com.zing.zalo.zinstant.utils.AbstractC17192d;
import com.zing.zalo.zinstant.zom.node.ZOMImage;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import sj0.C26293r;

/* renamed from: nk0.y */
/* loaded from: classes7.dex */
public class C23866y extends AbstractC23825g0 {

    /* renamed from: H */
    private final C26293r f115216H;

    /* renamed from: I */
    private int f115217I;

    /* renamed from: J */
    private final Rect f115218J;

    public C23866y(C23855s0 c23855s0, ZOMImage zOMImage) {
        super(c23855s0, zOMImage);
        this.f115217I = 0;
        this.f115218J = new Rect();
        C26293r c26293r = new C26293r(this, false);
        this.f115216H = c26293r;
        c26293r.m135338L(zOMImage.getImageType(), mo124504a1(), AbstractC17192d.m91799a(zOMImage.mImageScaleType), zOMImage.mIsUsePlaceholder, zOMImage.mTintColor, 0, zOMImage.mIsUseStateLoading, zOMImage.mTransitionType, zOMImage.mKeepState, this.f115122w);
        c26293r.setCallback(m131031z());
        m124672h2();
        m124675k2();
    }

    /* renamed from: h2 */
    private void m124672h2() {
        if (((ZOMImage) m131007J()).mTintColor != this.f115217I && (((ZOMImage) m131007J()).mTintColor != 0 || this.f115217I != 0)) {
            this.f115217I = ((ZOMImage) m131007J()).mTintColor;
            this.f115216H.setColorFilter(((ZOMImage) m131007J()).mTintColor, PorterDuff.Mode.SRC_ATOP);
        }
        this.f115216H.setAlpha(m131021p());
    }

    /* renamed from: i2 */
    private void m124673i2() {
        C26293r c26293r = this.f115216H;
        if (c26293r != null) {
            c26293r.m135357t0();
        }
    }

    /* renamed from: j2 */
    private void m124674j2() {
        C26293r c26293r = this.f115216H;
        if (c26293r != null) {
            c26293r.m135358v0();
        }
    }

    /* renamed from: k2 */
    private void m124675k2() {
        ZOMRect zOMRect = ((ZOMImage) m131007J()).mAfterPaddingNode;
        this.f115218J.set(zOMRect.left, zOMRect.top, zOMRect.right, zOMRect.bottom);
        this.f115216H.setBounds(0, 0, this.f115218J.width(), this.f115218J.height());
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: S0 */
    public void mo124501S0() {
        super.mo124501S0();
        C26293r c26293r = this.f115216H;
        if (c26293r != null) {
            c26293r.m135339Q();
        }
    }

    @Override // nk0.AbstractC23825g0
    /* renamed from: a1 */
    public String mo124504a1() {
        String mo124504a1 = super.mo124504a1();
        if (TextUtils.isEmpty(mo124504a1)) {
            return ((ZOMImage) m131007J()).getSrc();
        }
        return mo124504a1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: j0 */
    public void mo124435j0(Canvas canvas) {
        canvas.save();
        Rect rect = this.f115218J;
        canvas.translate(rect.left, rect.top);
        super.mo124435j0(canvas);
        C26293r c26293r = this.f115216H;
        if (c26293r != null) {
            c26293r.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: l2 */
    void m124676l2() {
        ZOMImage zOMImage = (ZOMImage) m131007J();
        this.f115216H.m135345g0(((ZOMImage) m131007J()).getImageType(), mo124504a1(), AbstractC17192d.m91799a(zOMImage.mImageScaleType), zOMImage.mIsUsePlaceholder, zOMImage.mTintColor, 0, zOMImage.mIsUseStateLoading, zOMImage.mTransitionType, zOMImage.mKeepState, this.f115122w);
        m124672h2();
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: n0 */
    public void mo124436n0() {
        super.mo124436n0();
        this.f115216H.setAlpha(m131021p());
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onPause() {
        super.onPause();
        C26293r c26293r = this.f115216H;
        if (c26293r != null) {
            m131028w().m116438g(new RunnableC23864x(c26293r), null, false);
        }
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onStop() {
        super.onStop();
        C26293r c26293r = this.f115216H;
        if (c26293r != null) {
            m131028w().m116438g(new RunnableC23862w(c26293r), null, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qk0.AbstractC25310f
    /* renamed from: q0 */
    public void mo124669q0() {
        super.mo124669q0();
        if (m131015Y()) {
            m124673i2();
        } else {
            m124674j2();
        }
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: t0 */
    public void mo124514t0() {
        super.mo124514t0();
        C26293r c26293r = this.f115216H;
        if (c26293r != null) {
            m131028w().m116438g(new RunnableC23862w(c26293r), null, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: u0 */
    public void mo124517u0() {
        super.mo124517u0();
        m124676l2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: v0 */
    public void mo124443v0() {
        super.mo124443v0();
        m124675k2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qk0.AbstractC25310f
    /* renamed from: w0 */
    public void mo124670w0() {
        super.mo124670w0();
        m124674j2();
    }
}
