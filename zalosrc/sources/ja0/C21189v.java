package ja0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import p612wk.AbstractC29069a;

/* renamed from: ja0.v */
/* loaded from: classes6.dex */
public final class C21189v extends RecyclerView.AbstractC1876c0 {

    /* renamed from: I */
    private final InterfaceC18319c f103327I;

    /* renamed from: J */
    private final View f103328J;

    /* renamed from: K */
    private final View f103329K;

    /* renamed from: L */
    private final View f103330L;

    /* renamed from: M */
    private final TextView f103331M;

    /* renamed from: N */
    private AbstractC29069a f103332N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21189v(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.search_global_result_item_footer, viewGroup, false));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f103327I = interfaceC18319c;
        this.f103328J = this.f7784p.findViewById(AbstractC6918a0.layout_loading);
        View findViewById = this.f7784p.findViewById(AbstractC6918a0.layout_error);
        this.f103329K = findViewById;
        this.f103330L = this.f7784p.findViewById(AbstractC6918a0.layout_summary);
        this.f103331M = (TextView) this.f7784p.findViewById(AbstractC6918a0.tv_summary);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: ja0.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21189v.m109746j0(C21189v.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m109746j0(C21189v c21189v, View view) {
        AbstractC19074t.m100208f(c21189v, "this$0");
        InterfaceC18319c interfaceC18319c = c21189v.f103327I;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: k0 */
    public final void m109747k0(AbstractC29069a.g gVar) {
        AbstractC19074t.m100208f(gVar, "data");
        this.f103332N = gVar;
        if (gVar instanceof AbstractC29069a.g.b) {
            this.f103328J.setVisibility(0);
            this.f103329K.setVisibility(8);
            this.f103330L.setVisibility(8);
            return;
        }
        if (gVar instanceof AbstractC29069a.g.a) {
            this.f103329K.setVisibility(0);
            this.f103328J.setVisibility(8);
            this.f103330L.setVisibility(8);
        } else {
            if (gVar instanceof AbstractC29069a.g.d) {
                this.f103331M.setText(((AbstractC29069a.g.d) gVar).m145180b());
                this.f103330L.setVisibility(0);
                this.f103329K.setVisibility(8);
                this.f103328J.setVisibility(8);
                return;
            }
            if (gVar instanceof AbstractC29069a.g.c) {
                this.f103330L.setVisibility(8);
                this.f103329K.setVisibility(8);
                this.f103328J.setVisibility(8);
            }
        }
    }
}
