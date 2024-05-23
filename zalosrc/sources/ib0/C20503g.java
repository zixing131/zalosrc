package ib0;

import android.os.Handler;
import android.text.Layout;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ib0.C20500d;
import kd0.C21697g;
import ld0.C22448a;
import me0.AbstractC23093i;
import nb0.C23671b;

/* renamed from: ib0.g */
/* loaded from: classes6.dex */
public class C20503g extends C22448a {

    /* renamed from: b */
    Runnable f100759b;

    /* renamed from: c */
    Handler f100760c;

    /* renamed from: d */
    boolean f100761d;

    /* renamed from: e */
    boolean f100762e;

    /* renamed from: f */
    C20500d.a f100763f;

    /* renamed from: g */
    C23671b f100764g;

    /* renamed from: h */
    boolean f100765h = false;

    public C20503g(boolean z11) {
        this.f100761d = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m106541e(C21697g c21697g) {
        this.f100765h = true;
        this.f100764g.m124003c(c21697g.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m106542f(C21697g c21697g) {
        KeyEventCallbackC17462c m118462o;
        this.f100765h = true;
        if (this.f100761d) {
            if (!AbstractC23093i.m118471x() && (m118462o = AbstractC23093i.m118462o(c21697g.getContext(), c21697g.m111973m1().toString())) != null) {
                m118462o.mo13822K();
                return;
            }
            return;
        }
        if (this.f100762e) {
            this.f100763f.mo70938e();
        }
    }

    @Override // ld0.C22448a, ld0.InterfaceC22449b
    /* renamed from: b */
    public boolean mo56523b(final C21697g c21697g, Spanned spanned, MotionEvent motionEvent) {
        int m89088C;
        int m89090D;
        int action;
        try {
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            m89088C = x11 - c21697g.m89088C();
            m89090D = y11 - c21697g.m89090D();
            action = motionEvent.getAction();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (action != 0) {
            if (action == 1 || action == 3) {
                Handler handler = this.f100760c;
                if (handler != null) {
                    handler.removeCallbacks(this.f100759b);
                }
                C23671b c23671b = this.f100764g;
                if (c23671b != null) {
                    c23671b.m124004d(this.f100763f);
                    this.f100764g.f114668q = false;
                    c21697g.invalidate();
                }
                if (motionEvent.getAction() == 1 && !this.f100765h) {
                    C23671b c23671b2 = this.f100764g;
                    if (c23671b2 != null) {
                        c23671b2.m124002b(c21697g.getContext());
                    } else {
                        C20500d.a aVar = this.f100763f;
                        if (aVar != null) {
                            aVar.mo35613d();
                        }
                    }
                    return true;
                }
            }
            if (!super.mo56523b(c21697g, spanned, motionEvent)) {
                return false;
            }
            return true;
        }
        this.f100764g = null;
        this.f100765h = false;
        Layout m111975o1 = c21697g.m111975o1();
        int offsetForHorizontal = m111975o1.getOffsetForHorizontal(m111975o1.getLineForVertical(m89090D), m89088C);
        C23671b[] c23671bArr = (C23671b[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, C23671b.class);
        if (c23671bArr != null && c23671bArr.length > 0) {
            C23671b c23671b3 = c23671bArr[0];
            this.f100764g = c23671b3;
            if (c23671b3 == null || c23671b3.f114669r > offsetForHorizontal || offsetForHorizontal >= c23671b3.f114670s) {
                this.f100764g = null;
            }
            C23671b c23671b4 = this.f100764g;
            if (c23671b4 != null && c23671b4.f114671t) {
                this.f100759b = new Runnable() { // from class: ib0.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20503g.this.m106541e(c21697g);
                    }
                };
                Handler handler2 = new Handler();
                this.f100760c = handler2;
                handler2.postDelayed(this.f100759b, ViewConfiguration.getLongPressTimeout());
                this.f100764g.f114668q = true;
                c21697g.invalidate();
                return true;
            }
        }
        if (this.f100761d || this.f100762e) {
            this.f100759b = new Runnable() { // from class: ib0.f
                @Override // java.lang.Runnable
                public final void run() {
                    C20503g.this.m106542f(c21697g);
                }
            };
            Handler handler3 = new Handler();
            this.f100760c = handler3;
            handler3.postDelayed(this.f100759b, ViewConfiguration.getLongPressTimeout());
        }
        return true;
    }

    /* renamed from: g */
    public void m106543g(C20500d.a aVar) {
        this.f100763f = aVar;
    }

    public C20503g(boolean z11, boolean z12) {
        this.f100761d = z11;
        this.f100762e = z12;
    }
}
