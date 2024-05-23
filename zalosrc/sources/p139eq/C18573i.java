package p139eq;

import android.content.Context;
import android.graphics.Canvas;
import fn0.AbstractC19074t;
import l80.C22126c0;
import p166fq.C19117n;

/* renamed from: eq.i */
/* loaded from: classes4.dex */
public final class C18573i extends C22126c0 {

    /* renamed from: m1 */
    private boolean f93327m1;

    /* renamed from: n1 */
    private final C19117n f93328n1;

    /* renamed from: o1 */
    private String f93329o1;

    public C18573i(Context context) {
        super(context);
        this.f93327m1 = true;
        this.f93328n1 = new C19117n(this);
        this.f93329o1 = "";
    }

    /* renamed from: V1 */
    private final void m98037V1() {
        this.f93328n1.m100369n(-1);
    }

    /* renamed from: W1 */
    private final void m98038W1() {
        if (!this.f93328n1.m100367h()) {
            this.f93328n1.m100370o();
        }
    }

    /* renamed from: U1 */
    public final void m98039U1(boolean z11) {
        this.f93327m1 = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd0.C21697g, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        if (this.f93327m1) {
            if (this.f93328n1.m100366g()) {
                canvas.translate(-this.f93328n1.m100365f(), 0.0f);
            }
            super.mo44775o0(canvas);
            if (this.f93328n1.m100368m()) {
                canvas.translate(this.f93328n1.m100364e(), 0.0f);
                super.mo44775o0(canvas);
                return;
            }
            return;
        }
        super.mo44775o0(canvas);
    }

    @Override // kd0.C21697g, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        if (this.f93327m1) {
            super.mo44180q0(0, Integer.MIN_VALUE, i13, i14);
            if (m111975o1() != null && m111975o1().getWidth() > i11) {
                if (!AbstractC19074t.m100204b(this.f93329o1, m111973m1()) || this.f93328n1.m100367h()) {
                    this.f93329o1 = m111973m1().toString();
                    m98037V1();
                    return;
                }
                return;
            }
            m98038W1();
            return;
        }
        super.mo44180q0(i11, i12, i13, i14);
    }
}
