package l80;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import lb0.C22405g;
import me0.AbstractC23136l9;
import p392oh.C24261h;
import ph.C24751d;
import th.AbstractC26682c;

/* renamed from: l80.l */
/* loaded from: classes6.dex */
public class C22137l extends C16719g {

    /* renamed from: D0 */
    int f109020D0;

    /* renamed from: E0 */
    int f109021E0;

    /* renamed from: F0 */
    C22405g f109022F0;

    /* renamed from: G0 */
    String f109023G0;

    /* renamed from: H0 */
    MessageId f109024H0;

    /* renamed from: I0 */
    int f109025I0;

    /* renamed from: J0 */
    int f109026J0;

    /* renamed from: K0 */
    C22405g.c f109027K0;

    /* renamed from: L0 */
    public boolean f109028L0;

    /* renamed from: M0 */
    ModulesView f109029M0;

    /* renamed from: N0 */
    Handler f109030N0;

    /* renamed from: O0 */
    int f109031O0;

    /* renamed from: l80.l$a */
    /* loaded from: classes6.dex */
    class a implements C22405g.c {
        a() {
        }

        @Override // lb0.C22405g.c
        /* renamed from: a */
        public void mo61132a() {
            C22137l.this.invalidate();
        }
    }

    public C22137l(Context context, ModulesView modulesView, int i11) {
        super(context);
        this.f109027K0 = new a();
        this.f109029M0 = modulesView;
        this.f109031O0 = i11;
        m115466j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m115463k1(C24751d c24751d) {
        boolean z11;
        this.f109022F0.m115822G(c24751d);
        this.f109022F0.m115816A();
        if (c24751d != null && c24751d.m128575s()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f109028L0 = z11;
        if (z11) {
            requestLayout();
            mo44614b1(0);
        } else {
            mo44614b1(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m115464l1() {
        final C24751d m126632A = C24261h.m126630v().m126632A(this.f109023G0, this.f109024H0);
        this.f109030N0.post(new Runnable() { // from class: l80.k
            @Override // java.lang.Runnable
            public final void run() {
                C22137l.this.m115463k1(m126632A);
            }
        });
    }

    /* renamed from: i1 */
    public C24751d m115465i1() {
        C22405g c22405g = this.f109022F0;
        if (c22405g != null) {
            return c22405g.m115837l();
        }
        return null;
    }

    /* renamed from: j1 */
    void m115466j1() {
        try {
            this.f109030N0 = new Handler(Looper.getMainLooper());
            this.f109020D0 = AbstractC23136l9.m118742r(12.0f);
            this.f109021E0 = AbstractC23136l9.m118742r(3.0f);
            C22405g c22405g = new C22405g(getContext(), this.f109027K0);
            this.f109022F0 = c22405g;
            c22405g.m115818C();
            C22405g c22405g2 = this.f109022F0;
            c22405g2.f109692w = false;
            c22405g2.f109693x = false;
            c22405g2.m115827L(this.f109020D0);
            this.f109022F0.m115826K(-1);
            this.f109022F0.m115825J(this.f109021E0);
            this.f109022F0.m115820E(AbstractC26682c.m137039c(getContext()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m1 */
    public void m115467m1() {
        boolean z11;
        try {
            if (this.f109024H0 == null) {
                m115468n1();
                requestLayout();
                return;
            }
            C24751d m126650x = C24261h.m126630v().m126650x(this.f109024H0);
            if (m126650x == null) {
                C24261h.m126630v().m126651y().mo13474a(new Runnable() { // from class: l80.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22137l.this.m115464l1();
                    }
                });
            }
            this.f109022F0.m115822G(m126650x);
            this.f109022F0.m115816A();
            if (m126650x != null && m126650x.m128575s()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f109028L0 = z11;
            if (z11) {
                mo44614b1(0);
                requestLayout();
            } else {
                mo44614b1(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n1 */
    public void m115468n1() {
        try {
            this.f109023G0 = "";
            this.f109024H0 = null;
            this.f109028L0 = false;
            mo44614b1(8);
            this.f109022F0.m115822G(null);
            this.f109022F0.m115816A();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        super.mo44775o0(canvas);
        if (this.f109022F0 != null) {
            canvas.save();
            canvas.translate(this.f109025I0, this.f109026J0);
            this.f109022F0.m115829d(canvas);
            canvas.restore();
        }
    }

    /* renamed from: o1 */
    public void m115469o1(int i11, int i12) {
        try {
            this.f109020D0 = i11;
            this.f109021E0 = i12;
            C22405g c22405g = this.f109022F0;
            if (c22405g != null) {
                c22405g.m115827L(i11);
                this.f109022F0.m115825J(this.f109021E0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p1 */
    public void m115470p1(String str, MessageId messageId) {
        this.f109023G0 = str;
        this.f109024H0 = messageId;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        int i15;
        if (m89144k0()) {
            C22405g c22405g = this.f109022F0;
            int i16 = 0;
            if (c22405g != null) {
                i15 = c22405g.m115841p() + (this.f109025I0 * 2);
            } else {
                i15 = 0;
            }
            C22405g c22405g2 = this.f109022F0;
            if (c22405g2 != null) {
                i16 = c22405g2.m115831f() + (this.f109026J0 * 2);
            }
            m89097G0(i15, i16);
            return;
        }
        super.mo44180q0(i11, i12, i13, i14);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: x0 */
    public void mo89158x0(float f11) {
        super.mo89158x0(f11);
        C22405g c22405g = this.f109022F0;
        if (c22405g != null) {
            c22405g.m115819D((int) (f11 * 255.0f));
        }
    }
}
