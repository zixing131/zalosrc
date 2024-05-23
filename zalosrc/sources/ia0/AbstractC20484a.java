package ia0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: ia0.a */
/* loaded from: classes6.dex */
public abstract class AbstractC20484a extends RecyclerView.AbstractC1876c0 {

    /* renamed from: I */
    private final C16719g f100729I;

    /* renamed from: ia0.a$a */
    /* loaded from: classes6.dex */
    private static final class a extends ModulesView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C16719g c16719g) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(c16719g, "module");
            super.mo69681L(c16719g);
            m88987U(c16719g.m89106L().f84708d, c16719g.m89106L().f84709e);
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
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC20484a(ViewGroup viewGroup, C16719g c16719g) {
        super(new a(r3, c16719g));
        AbstractC19074t.m100208f(viewGroup, "parent");
        AbstractC19074t.m100208f(c16719g, "module");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f100729I = c16719g;
    }

    /* renamed from: i0 */
    public final C16719g m106522i0() {
        return this.f100729I;
    }
}
