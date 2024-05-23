package ms;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7035d;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23999j;
import p402os.C24546a;

/* renamed from: ms.f */
/* loaded from: classes4.dex */
public class C23440f extends C7035d {

    /* renamed from: B */
    private static final String f113871B = "f";

    /* renamed from: A */
    private final C23528a f113872A;

    /* renamed from: z */
    private final LayoutInflater f113873z;

    /* renamed from: ms.f$a */
    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a */
        public RecyclingImageView f113874a;

        /* renamed from: b */
        public TextView f113875b;

        /* renamed from: c */
        public TextView f113876c;

        /* renamed from: d */
        public View f113877d;

        private a() {
        }
    }

    public C23440f(Context context) {
        super(context, -1);
        this.f113873z = LayoutInflater.from(context);
        this.f113872A = new C23528a(context);
    }

    @Override // com.zing.zalo.adapters.C7035d, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        if (view == null) {
            aVar = new a();
            view2 = this.f113873z.inflate(AbstractC7409c0.game_manage_item, viewGroup, false);
            aVar.f113874a = (RecyclingImageView) view2.findViewById(AbstractC6918a0.row_logo);
            aVar.f113875b = (TextView) view2.findViewById(AbstractC6918a0.row_name);
            aVar.f113876c = (TextView) view2.findViewById(AbstractC6918a0.row_status);
            aVar.f113877d = view2.findViewById(AbstractC6918a0.row_status_icon);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        try {
            C24546a c24546a = (C24546a) getItem(i11);
            aVar.f113875b.setText(c24546a.m127875f());
            if (c24546a.m127881l()) {
                aVar.f113877d.setVisibility(0);
            } else {
                aVar.f113877d.setVisibility(8);
            }
            Drawable m119609q = C23212s8.m119609q(aVar.f113874a.getContext(), AbstractC16781w.default_avatar);
            if (this.f113872A.m123593S(i11, view2, viewGroup, c24546a.m127874e()) && !C23999j.m125696L2(c24546a.m127874e(), C23278z2.m120107Y0())) {
                ((C23528a) this.f113872A.m123612r(aVar.f113874a)).m123615u(m119609q);
            } else {
                ((C23528a) this.f113872A.m123612r(aVar.f113874a)).m123618x(c24546a.m127874e(), C23278z2.m120107Y0());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f113871B, e11);
        }
        return view2;
    }
}
