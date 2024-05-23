package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.graphics.Canvas;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C17024o0;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.lang.ref.WeakReference;
import mi0.C23314b;
import ri0.C25807a;

/* renamed from: com.zing.zalo.zdesign.component.k0 */
/* loaded from: classes7.dex */
public final class C17014k0 extends C16719g implements InterfaceC16976f1 {

    /* renamed from: D0 */
    private C25807a f86964D0;

    /* renamed from: E0 */
    private C17024o0 f86965E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17014k0(Context context, int i11) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m91063h1();
        C17024o0 c17024o0 = this.f86965E0;
        if (c17024o0 != null) {
            c17024o0.m91152e(C23314b.m122698a(context, i11));
        }
        this.f86964D0 = new C25807a(new WeakReference(this));
    }

    /* renamed from: h1 */
    private final void m91063h1() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        this.f86965E0 = new C17024o0(context, new C17024o0.a() { // from class: com.zing.zalo.zdesign.component.j0
            @Override // com.zing.zalo.zdesign.component.C17024o0.a
            /* renamed from: a */
            public final void mo61929a() {
                C17014k0.m91064i1(C17014k0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static final void m91064i1(C17014k0 c17014k0) {
        AbstractC19074t.m100208f(c17014k0, "this$0");
        if (AbstractC19444a.m101693a()) {
            c17014k0.invalidate();
        } else {
            c17014k0.postInvalidate();
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: b1 */
    public void mo44614b1(int i11) {
        C17024o0 c17024o0;
        boolean z11;
        super.mo44614b1(i11);
        C17024o0 c17024o02 = this.f86965E0;
        if (c17024o02 != null) {
            if (i11 != 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            c17024o02.m91147K(z11);
        }
        if (i11 != 0 && (c17024o0 = this.f86965E0) != null) {
            c17024o0.m91159x();
        }
    }

    /* renamed from: j1 */
    public final void m91065j1(boolean z11) {
        C17024o0 c17024o0 = this.f86965E0;
        if (c17024o0 != null) {
            c17024o0.m91137A(z11);
        }
    }

    /* renamed from: k1 */
    public final void m91066k1(int i11) {
        C17024o0 c17024o0 = this.f86965E0;
        if (c17024o0 != null) {
            c17024o0.m91140D(i11, false);
        }
    }

    /* renamed from: l1 */
    public final void m91067l1(boolean z11) {
        C17024o0 c17024o0 = this.f86965E0;
        if (c17024o0 != null) {
            c17024o0.m91151O(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        C17024o0 c17024o0 = this.f86965E0;
        if (c17024o0 != null) {
            c17024o0.m91153i(canvas);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        int i15;
        C17024o0 c17024o0 = this.f86965E0;
        if (c17024o0 != null) {
            i15 = c17024o0.m91155s();
        } else {
            i15 = 0;
        }
        C17024o0 c17024o02 = this.f86965E0;
        if (c17024o02 != null && c17024o02.m91156t() == EnumC17026p0.CIRCLE.m91165c()) {
            m89097G0(i15, i15);
            C17024o0 c17024o03 = this.f86965E0;
            if (c17024o03 != null) {
                c17024o03.m91149M(i15, i15);
                return;
            }
            return;
        }
        m89097G0(i11, i15);
        C17024o0 c17024o04 = this.f86965E0;
        if (c17024o04 != null) {
            c17024o04.m91149M(i11, i15);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25807a c25807a = this.f86964D0;
        if (c25807a != null) {
            c25807a.m133069b(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25807a c25807a = this.f86964D0;
        if (c25807a != null) {
            c25807a.m133071d(c0708i);
        }
    }
}
