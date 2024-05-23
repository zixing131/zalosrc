package l80;

import android.content.Context;
import android.graphics.Typeface;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import kd0.C21697g;
import ti0.C26705d;
import ti0.C26707f;

/* renamed from: l80.c0 */
/* loaded from: classes6.dex */
public class C22126c0 extends C21697g {

    /* renamed from: f1 */
    private int f108908f1;

    /* renamed from: g1 */
    private boolean f108909g1;

    /* renamed from: h1 */
    private boolean f108910h1;

    /* renamed from: i1 */
    private boolean f108911i1;

    /* renamed from: j1 */
    private boolean f108912j1;

    /* renamed from: k1 */
    private final Context f108913k1;

    /* renamed from: l1 */
    private float f108914l1;

    public C22126c0(Context context) {
        super(context);
        this.f108909g1 = false;
        this.f108910h1 = false;
        this.f108911i1 = false;
        this.f108912j1 = false;
        this.f108913k1 = context;
        mo111964L1(m111977q1());
        m115420T1(0, true);
    }

    /* renamed from: T1 */
    private void m115420T1(int i11, boolean z11) {
        if (this.f108908f1 != i11 || z11 || this.f108909g1) {
            this.f108908f1 = i11;
            this.f108909g1 = false;
            if (C13778s1.m76960a()) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            super.mo111965M1(i11);
                            return;
                        } else {
                            super.mo111965M1(0);
                            super.mo111966N1(C13718q1.m76694c(this.f108913k1, 6));
                            return;
                        }
                    }
                    super.mo111965M1(0);
                    if (this.f108911i1) {
                        super.mo111966N1(C13718q1.m76694c(this.f108913k1, 9));
                        return;
                    } else {
                        super.mo111966N1(C13718q1.m76694c(this.f108913k1, 7));
                        return;
                    }
                }
                super.mo111965M1(0);
                if (this.f108912j1) {
                    super.mo111966N1(C13718q1.m76694c(this.f108913k1, 3));
                    return;
                } else {
                    super.mo111966N1(C13718q1.m76694c(this.f108913k1, 5));
                    return;
                }
            }
            super.mo111965M1(i11);
        }
    }

    @Override // kd0.C21697g
    /* renamed from: L1 */
    public void mo111964L1(float f11) {
        this.f108914l1 = f11;
        if (C13778s1.m76966g() && !this.f108910h1) {
            super.mo111964L1(this.f108914l1 * C13778s1.m76962c());
        } else {
            super.mo111964L1(this.f108914l1);
        }
    }

    @Override // kd0.C21697g
    /* renamed from: M1 */
    public void mo111965M1(int i11) {
        m115420T1(i11, false);
    }

    @Override // kd0.C21697g
    /* renamed from: N1 */
    public void mo111966N1(Typeface typeface) {
        if (!C13778s1.m76960a()) {
            super.mo111966N1(typeface);
            this.f108909g1 = true;
        } else if (Typeface.DEFAULT.equals(typeface)) {
            mo111965M1(0);
        } else if (Typeface.DEFAULT_BOLD.equals(typeface)) {
            mo111965M1(1);
        } else {
            super.mo111966N1(typeface);
            this.f108909g1 = true;
        }
    }

    /* renamed from: Q1 */
    public void m115421Q1(int i11) {
        new C26707f(this).m137318a(C26705d.m137293a(getContext(), i11));
    }

    /* renamed from: R1 */
    public void m115422R1() {
        this.f108910h1 = true;
        mo111964L1(this.f108914l1);
    }

    /* renamed from: S1 */
    public void m115423S1() {
        this.f108911i1 = true;
        m115420T1(this.f108908f1, true);
    }

    public C22126c0(Context context, float f11, int i11, boolean z11) {
        super(context);
        this.f108909g1 = false;
        this.f108910h1 = false;
        this.f108911i1 = false;
        this.f108912j1 = false;
        this.f108913k1 = context;
        m111962J1(i11);
        mo111964L1(f11);
        m115420T1(z11 ? 1 : 0, true);
    }
}
