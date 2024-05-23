package com.zing.zalo.p077ui.moduleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class DecorModuleView<T extends C16719g> extends ModulesView {

    /* renamed from: K */
    private final C16719g f64510K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecorModuleView(Context context, C16719g c16719g) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c16719g, "module");
        this.f64510K = c16719g;
        super.mo69681L(c16719g);
        super.m88987U(c16719g.m89106L().f84708d, c16719g.m89106L().f84709e);
    }

    @Override // com.zing.zalo.uidrawing.ModulesView
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Void mo69681L(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "module");
        throw new UnsupportedOperationException("DecorModuleView accepts only one module initially.");
    }

    @Override // com.zing.zalo.uidrawing.ModulesView
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void mo69682M(List list) {
        AbstractC19074t.m100208f(list, "modules");
        throw new UnsupportedOperationException("DecorModuleView accepts only one module initially.");
    }

    @Override // com.zing.zalo.uidrawing.ModulesView
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void mo44090O() {
        throw new UnsupportedOperationException("Cannot remove module from DecorModuleView.");
    }

    public final T getModule() {
        return (T) this.f64510K;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecorModuleView(Context context, AttributeSet attributeSet, int i11, C16719g c16719g) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c16719g, "module");
        this.f64510K = c16719g;
        super.mo69681L(c16719g);
        super.m88987U(c16719g.m89106L().f84708d, c16719g.m89106L().f84709e);
    }
}
