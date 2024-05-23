package fb0;

import android.view.View;
import androidx.core.graphics.C1421e;
import androidx.core.view.C1492a1;
import androidx.core.view.C1580n1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: fb0.c */
/* loaded from: classes6.dex */
public final class C18867c extends C1492a1.b {

    /* renamed from: c */
    private final View f94195c;

    /* renamed from: d */
    private final int f94196d;

    /* renamed from: e */
    private final int f94197e;

    public /* synthetic */ C18867c(View view, int i11, int i12, int i13, int i14, AbstractC19060k abstractC19060k) {
        this(view, i11, i12, (i14 & 8) != 0 ? 0 : i13);
    }

    @Override // androidx.core.view.C1492a1.b
    /* renamed from: b */
    public void mo7529b(C1492a1 c1492a1) {
        AbstractC19074t.m100208f(c1492a1, "animation");
        this.f94195c.setTranslationX(0.0f);
        this.f94195c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.C1492a1.b
    /* renamed from: e */
    public C1580n1 mo7531e(C1580n1 c1580n1, List list) {
        AbstractC19074t.m100208f(c1580n1, "insets");
        AbstractC19074t.m100208f(list, "runningAnimations");
        C1421e m8054f = c1580n1.m8054f(this.f94197e);
        AbstractC19074t.m100207e(m8054f, "getInsets(...)");
        C1421e m8054f2 = c1580n1.m8054f(this.f94196d);
        AbstractC19074t.m100207e(m8054f2, "getInsets(...)");
        AbstractC19074t.m100207e(C1421e.m7229a(C1421e.m7232d(m8054f, m8054f2), C1421e.f6229e), "let(...)");
        this.f94195c.setTranslationX(r5.f6230a - r5.f6232c);
        this.f94195c.setTranslationY(r5.f6231b - r5.f6233d);
        return c1580n1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18867c(View view, int i11, int i12, int i13) {
        super(i13);
        AbstractC19074t.m100208f(view, "view");
        this.f94195c = view;
        this.f94196d = i11;
        this.f94197e = i12;
        if ((i11 & i12) != 0) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values".toString());
        }
    }
}
