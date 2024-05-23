package p489rn;

import android.view.View;
import android.widget.RelativeLayout;
import com.zing.p058v4.view.AbstractC6881a;
import is.C20801j;
import java.util.Map;

/* renamed from: rn.c2 */
/* loaded from: classes4.dex */
public abstract class AbstractC25856c2 extends AbstractC6881a {

    /* renamed from: r */
    protected float f123370r;

    /* renamed from: s */
    protected int f123371s;

    /* renamed from: t */
    protected int f123372t;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public View mo133439A(Map map, int i11) {
        View view = (View) map.get(Integer.valueOf(i11));
        if (view != null) {
            if ((i11 > 0 && i11 != mo35335g() - 1) || (i11 == 0 && mo35335g() == 1)) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            } else if (i11 == mo35335g() - 1 || (i11 == 0 && mo35335g() > 1)) {
                view.setLayoutParams(new RelativeLayout.LayoutParams((int) Math.floor(C20801j.m108538f()), -1));
            }
        }
        return view;
    }

    /* renamed from: B */
    public void m133440B(int i11) {
        this.f123372t = i11;
    }

    /* renamed from: C */
    public void m133441C(int i11) {
        this.f123371s = i11;
    }

    /* renamed from: D */
    public void m133442D(float f11) {
        this.f123370r = f11;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public abstract int mo35335g();

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: j */
    public float mo35338j(int i11) {
        if ((i11 == 0 || i11 == mo35335g() - 1) && mo35335g() > 1) {
            return C20801j.m108538f();
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public void mo133443w(int i11, View view) {
        if (i11 == 0 && mo35335g() == 1) {
            view.setPadding(C20801j.m108537e(), 0, C20801j.m108537e(), 0);
            return;
        }
        if (i11 == 0) {
            view.setPadding(C20801j.m108537e(), 0, C20801j.m108533a(), 0);
        } else if (i11 == mo35335g() - 1) {
            view.setPadding(C20801j.m108533a(), 0, C20801j.m108537e(), 0);
        } else {
            view.setPadding(C20801j.m108533a(), 0, C20801j.m108533a(), 0);
        }
    }

    /* renamed from: x */
    public int m133444x() {
        int i11 = this.f123372t;
        if (i11 <= 0) {
            return C20801j.m108533a();
        }
        return i11;
    }

    /* renamed from: y */
    public int m133445y() {
        int i11 = this.f123371s;
        if (i11 <= 0) {
            return C20801j.m108537e();
        }
        return i11;
    }

    /* renamed from: z */
    public float m133446z() {
        float f11 = this.f123370r;
        if (f11 <= 0.0f) {
            return C20801j.m108538f();
        }
        return f11;
    }
}
