package fb0;

import android.view.View;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1492a1;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1551g0;
import fn0.AbstractC19074t;
import java.util.List;
import p227i3.C20218v;

/* renamed from: fb0.b */
/* loaded from: classes6.dex */
public final class C18866b extends C1492a1.b implements InterfaceC1551g0 {

    /* renamed from: c */
    private final int f94190c;

    /* renamed from: d */
    private final int f94191d;

    /* renamed from: e */
    private View f94192e;

    /* renamed from: f */
    private C1580n1 f94193f;

    /* renamed from: g */
    private boolean f94194g;

    public C18866b(int i11, int i12) {
        super(1);
        this.f94190c = i11;
        this.f94191d = i12;
        if ((i11 & i12) == 0) {
        } else {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values".toString());
        }
    }

    @Override // androidx.core.view.C1492a1.b
    /* renamed from: b */
    public void mo7529b(C1492a1 c1492a1) {
        View view;
        AbstractC19074t.m100208f(c1492a1, "animation");
        if (this.f94194g && (c1492a1.m7522c() & this.f94191d) != 0) {
            this.f94194g = false;
            if (this.f94193f != null && (view = this.f94192e) != null) {
                AbstractC19074t.m100205c(view);
                C1580n1 c1580n1 = this.f94193f;
                AbstractC19074t.m100205c(c1580n1);
                AbstractC1579n0.m7879j(view, c1580n1);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1551g0
    /* renamed from: c */
    public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
        int i11;
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        AbstractC19074t.m100208f(c1580n1, "windowInsets");
        this.f94192e = view;
        this.f94193f = c1580n1;
        if (this.f94194g) {
            i11 = this.f94190c;
        } else {
            i11 = this.f94190c | this.f94191d;
        }
        C1421e m8054f = c1580n1.m8054f(i11);
        AbstractC19074t.m100207e(m8054f, "getInsets(...)");
        view.setPadding(m8054f.f6230a, m8054f.f6231b, m8054f.f6232c, m8054f.f6233d);
        C1580n1 c1580n12 = C1580n1.f6524b;
        AbstractC19074t.m100207e(c1580n12, "CONSUMED");
        return c1580n12;
    }

    @Override // androidx.core.view.C1492a1.b
    /* renamed from: d */
    public void mo7530d(C1492a1 c1492a1) {
        AbstractC19074t.m100208f(c1492a1, "animation");
        if ((c1492a1.m7522c() & this.f94191d) != 0) {
            this.f94194g = true;
        }
    }

    @Override // androidx.core.view.C1492a1.b
    /* renamed from: e */
    public C1580n1 mo7531e(C1580n1 c1580n1, List list) {
        AbstractC19074t.m100208f(c1580n1, "insets");
        AbstractC19074t.m100208f(list, "runningAnims");
        return c1580n1;
    }
}
