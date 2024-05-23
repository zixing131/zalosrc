package ja0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13058o;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p612wk.AbstractC29069a;

/* renamed from: ja0.w */
/* loaded from: classes6.dex */
public class C21191w extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final InterfaceC18319c f103334I;

    /* renamed from: J */
    private AbstractC29069a.i f103335J;

    /* renamed from: K */
    private final TextView f103336K;

    /* renamed from: ja0.w$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21191w(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(C13058o.Companion.m73343a(viewGroup, true));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f103334I = interfaceC18319c;
        View findViewById = this.f7784p.findViewById(AbstractC6918a0.text);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f103336K = (TextView) findViewById;
    }

    /* renamed from: i0 */
    public final void m109748i0(AbstractC29069a.i iVar) {
        AbstractC19074t.m100208f(iVar, "data");
        this.f103335J = iVar;
        CharSequence m145185d = iVar.m145185d();
        if (m145185d == null) {
            CharSequence text = this.f103336K.getResources().getText(iVar.m145183b());
            m145185d = ((Object) text) + " (" + iVar.m145184c() + ")";
        }
        this.f103336K.setText(m145185d);
    }
}
