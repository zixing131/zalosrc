package l80;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.uidrawing.C16716d;
import kd0.C21693c;

/* renamed from: l80.b0 */
/* loaded from: classes6.dex */
public class C22124b0 extends C16716d {

    /* renamed from: M0 */
    public C22126c0 f108888M0;

    /* renamed from: N0 */
    private final C21693c f108889N0;

    /* renamed from: O0 */
    private final C21693c f108890O0;

    /* renamed from: P0 */
    private int f108891P0;

    /* renamed from: Q0 */
    private final Context f108892Q0;

    public C22124b0(Context context) {
        super(context);
        this.f108891P0 = 0;
        this.f108892Q0 = context;
        C21693c c21693c = new C21693c(context);
        this.f108889N0 = c21693c;
        c21693c.m89106L().m89027K(true);
        c21693c.mo44614b1(8);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f108888M0 = c22126c0;
        c22126c0.m89106L().m89028L(-2, -2).m89054h0(c21693c).m89027K(true);
        this.f108888M0.mo44614b1(0);
        C21693c c21693c2 = new C21693c(context);
        this.f108890O0 = c21693c2;
        c21693c2.m89106L().m89054h0(this.f108888M0).m89027K(true);
        c21693c2.mo44614b1(8);
        m89001g1(c21693c);
        m89001g1(this.f108888M0);
        m89001g1(c21693c2);
    }

    /* renamed from: o1 */
    public C22126c0 m115398o1() {
        return this.f108888M0;
    }

    /* renamed from: p1 */
    public void m115399p1(int i11) {
        this.f108891P0 = i11;
        this.f108889N0.m89106L().m89047c0(this.f108891P0);
        this.f108890O0.m89106L().m89046b0(this.f108891P0);
    }

    /* renamed from: q1 */
    public void m115400q1(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int width;
        int width2;
        if (drawable != null) {
            if (drawable.getBounds() == null) {
                width2 = drawable.getIntrinsicWidth();
            } else {
                width2 = drawable.getBounds().width();
            }
            this.f108889N0.m89106L().m89035S((-width2) - this.f108891P0);
            this.f108889N0.mo111925v1(drawable);
            this.f108889N0.mo44614b1(0);
            this.f108888M0.m89106L().m89034R(width2 + this.f108891P0);
        } else {
            this.f108889N0.mo44614b1(8);
            this.f108888M0.m89106L().m89034R(0);
        }
        if (drawable3 != null) {
            if (drawable3.getBounds() == null) {
                width = drawable3.getIntrinsicWidth();
            } else {
                width = drawable3.getBounds().width();
            }
            this.f108890O0.m89106L().m89034R((-width) - this.f108891P0);
            this.f108890O0.mo111925v1(drawable3);
            this.f108890O0.mo44614b1(0);
            this.f108888M0.m89106L().m89035S(width + this.f108891P0);
            return;
        }
        this.f108890O0.mo44614b1(8);
        this.f108888M0.m89106L().m89035S(0);
    }

    /* renamed from: r1 */
    public void m115401r1(int i11, int i12, int i13, int i14) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4 = null;
        if (i11 != 0) {
            drawable = AbstractC1388a.m6964f(this.f108892Q0, i11);
        } else {
            drawable = null;
        }
        if (i12 != 0) {
            drawable2 = AbstractC1388a.m6964f(this.f108892Q0, i12);
        } else {
            drawable2 = null;
        }
        if (i13 != 0) {
            drawable3 = AbstractC1388a.m6964f(this.f108892Q0, i13);
        } else {
            drawable3 = null;
        }
        if (i14 != 0) {
            drawable4 = AbstractC1388a.m6964f(this.f108892Q0, i14);
        }
        m115402s1(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: s1 */
    public void m115402s1(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            this.f108889N0.m89106L().m89035S((-drawable.getIntrinsicWidth()) - this.f108891P0);
            this.f108889N0.mo111925v1(drawable);
            this.f108889N0.mo44614b1(0);
            this.f108888M0.m89106L().m89034R(drawable.getIntrinsicWidth() + this.f108891P0);
        } else {
            this.f108889N0.mo44614b1(8);
            this.f108888M0.m89106L().m89034R(0);
        }
        if (drawable3 != null) {
            this.f108890O0.m89106L().m89034R((-drawable3.getIntrinsicWidth()) - this.f108891P0);
            this.f108890O0.mo111925v1(drawable3);
            this.f108890O0.mo44614b1(0);
            this.f108888M0.m89106L().m89035S(drawable3.getIntrinsicWidth() + this.f108891P0);
            return;
        }
        this.f108890O0.mo44614b1(8);
        this.f108888M0.m89106L().m89035S(0);
    }

    /* renamed from: t1 */
    public void m115403t1(int i11, int i12) {
        C21693c c21693c = this.f108890O0;
        if (c21693c != null) {
            c21693c.m89106L().m89028L(i11, i12);
        }
    }

    /* renamed from: u1 */
    public void m115404u1(TextUtils.TruncateAt truncateAt) {
        C22126c0 c22126c0 = this.f108888M0;
        if (c22126c0 != null) {
            c22126c0.m111980v1(truncateAt);
        }
    }

    /* renamed from: v1 */
    public void m115405v1(int i11) {
        C22126c0 c22126c0 = this.f108888M0;
        if (c22126c0 != null) {
            c22126c0.m111953A1(i11);
        }
    }

    /* renamed from: w1 */
    public void m115406w1(CharSequence charSequence) {
        C22126c0 c22126c0 = this.f108888M0;
        if (c22126c0 != null) {
            c22126c0.m111959G1(charSequence);
        }
    }

    /* renamed from: x1 */
    public void m115407x1(int i11) {
        C22126c0 c22126c0 = this.f108888M0;
        if (c22126c0 != null) {
            c22126c0.m111962J1(i11);
        }
    }

    /* renamed from: y1 */
    public void m115408y1(int i11) {
        C22126c0 c22126c0 = this.f108888M0;
        if (c22126c0 != null) {
            c22126c0.mo111965M1(i11);
        }
    }
}
