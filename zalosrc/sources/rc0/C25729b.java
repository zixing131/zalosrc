package rc0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.zview.AbstractC17452c;
import zl0.AbstractC32232i;

/* renamed from: rc0.b */
/* loaded from: classes6.dex */
public class C25729b implements InterfaceC25728a {

    /* renamed from: p */
    View f122840p;

    /* renamed from: t */
    Paint f122844t;

    /* renamed from: q */
    boolean f122841q = false;

    /* renamed from: r */
    boolean f122842r = false;

    /* renamed from: s */
    boolean f122843s = false;

    /* renamed from: u */
    int f122845u = AbstractC32232i.m155453a(3.0f);

    /* renamed from: v */
    int f122846v = AbstractC32232i.m155453a(12.0f);

    /* renamed from: w */
    int f122847w = AbstractC32232i.m155453a(4.0f);

    /* renamed from: x */
    int f122848x = AbstractC32232i.m155453a(4.0f);

    public C25729b(View view) {
        this.f122840p = view;
        Paint paint = new Paint(1);
        this.f122844t = paint;
        paint.setColor(AbstractC1388a.m6961c(view.getContext(), AbstractC17452c.cNotify1));
    }

    /* renamed from: a */
    public void m132815a(Canvas canvas, int i11) {
        try {
            if (this.f122841q) {
                if (this.f122842r) {
                    int i12 = this.f122848x;
                    canvas.drawCircle(i12 + r1, this.f122847w + r1, this.f122845u, this.f122844t);
                }
                if (this.f122843s) {
                    canvas.drawCircle((i11 - r0) + this.f122848x, this.f122847w + r0, this.f122845u, this.f122844t);
                } else {
                    canvas.drawCircle(i11 - r0, this.f122846v, this.f122845u, this.f122844t);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    void m132816b() {
        View view = this.f122840p;
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: c */
    public void m132817c(boolean z11) {
        this.f122842r = z11;
    }

    /* renamed from: d */
    public void m132818d(int i11) {
        this.f122844t.setColor(i11);
    }

    /* renamed from: e */
    public void m132819e(int i11) {
        this.f122848x = i11;
    }

    /* renamed from: f */
    public void m132820f(int i11) {
        this.f122847w = i11;
    }

    /* renamed from: g */
    public void m132821g(boolean z11) {
        this.f122843s = z11;
    }

    @Override // rc0.InterfaceC25728a
    public void setEnableNoti(boolean z11) {
        this.f122841q = z11;
        m132816b();
    }

    @Override // rc0.InterfaceC25728a
    public void setRadiusNoti(int i11) {
        this.f122845u = i11;
    }

    @Override // rc0.InterfaceC25728a
    public void setRedDotMargin(int i11) {
        this.f122846v = i11;
    }
}
