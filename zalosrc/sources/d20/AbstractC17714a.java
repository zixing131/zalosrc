package d20;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b10.AbstractC2487f;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: d20.a */
/* loaded from: classes5.dex */
public abstract class AbstractC17714a extends RecyclerView.AbstractC1876c0 {

    /* renamed from: I */
    private final View f89798I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC17714a(View view) {
        super(view);
        AbstractC19074t.m100208f(view, "view");
        this.f89798I = view;
    }

    /* renamed from: i0 */
    public abstract void mo93789i0(AbstractC2487f abstractC2487f);

    /* renamed from: j0 */
    public void m93790j0(AbstractC2487f abstractC2487f, List list) {
        AbstractC19074t.m100208f(abstractC2487f, "data");
        AbstractC19074t.m100208f(list, "payloads");
    }
}
