package ja0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import me0.C23212s8;
import p612wk.AbstractC29069a;

/* renamed from: ja0.o */
/* loaded from: classes6.dex */
public final class C21175o extends RecyclerView.AbstractC1876c0 {

    /* renamed from: I */
    private final InterfaceC18319c f103297I;

    /* renamed from: J */
    private final TextView f103298J;

    /* renamed from: K */
    private final TextView f103299K;

    /* renamed from: L */
    private final ImageView f103300L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21175o(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.search_global_result_item_empty, viewGroup, false));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f103297I = interfaceC18319c;
        this.f103298J = (TextView) this.f7784p.findViewById(AbstractC6918a0.tvEmpty);
        this.f103299K = (TextView) this.f7784p.findViewById(AbstractC6918a0.tvEmptyDesc);
        this.f103300L = (ImageView) this.f7784p.findViewById(AbstractC6918a0.imvEmpty);
    }

    /* renamed from: i0 */
    public final void m109718i0(AbstractC29069a.d.AbstractC33038d abstractC33038d) {
        AbstractC19074t.m100208f(abstractC33038d, "data");
        if (AbstractC19074t.m100204b(abstractC33038d, AbstractC29069a.d.c.f134677b)) {
            this.f103298J.setText(AbstractC8020f0.str_empty_contact_result);
            this.f103300L.setImageResource(AbstractC16803z.illus_emptystate_list);
            this.f103299K.setVisibility(8);
            return;
        }
        if (AbstractC19074t.m100204b(abstractC33038d, AbstractC29069a.d.a.C33037d.f134675c)) {
            this.f103298J.setText(AbstractC8020f0.str_search_global_search_phone_error_1);
            this.f103300L.setImageResource(AbstractC16803z.illus_emptystate_list);
            this.f103299K.setVisibility(8);
        } else if (AbstractC19074t.m100204b(abstractC33038d, AbstractC29069a.d.a.b.f134673c) || AbstractC19074t.m100204b(abstractC33038d, AbstractC29069a.d.a.c.f134674c)) {
            this.f103298J.setText(AbstractC8020f0.str_search_global_search_phone_error_2_desc);
            this.f103300L.setImageResource(AbstractC16803z.ic_im_search_empty_phonenum_2);
            this.f103299K.setVisibility(8);
        } else if (abstractC33038d instanceof AbstractC29069a.d.a.C33036a) {
            this.f103298J.setText(((AbstractC29069a.d.a.C33036a) abstractC33038d).m145173b());
            this.f103300L.setImageDrawable(C23212s8.m119609q(this.f7784p.getContext(), AbstractC16781w.ic_search_phone_limit));
            this.f103299K.setVisibility(8);
        }
    }
}
