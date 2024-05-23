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

/* renamed from: ms.b */
/* loaded from: classes4.dex */
public class C23436b extends C7035d {

    /* renamed from: C */
    static final String f113849C = "b";

    /* renamed from: A */
    C23528a f113850A;

    /* renamed from: B */
    a f113851B;

    /* renamed from: z */
    LayoutInflater f113852z;

    /* renamed from: ms.b$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: Vu */
        void mo79797Vu(C24546a c24546a);
    }

    /* renamed from: ms.b$b */
    /* loaded from: classes4.dex */
    private static class b {

        /* renamed from: a */
        public RecyclingImageView f113853a;

        /* renamed from: b */
        public TextView f113854b;

        /* renamed from: c */
        public TextView f113855c;

        /* renamed from: d */
        public View f113856d;

        private b() {
        }
    }

    public C23436b(Context context) {
        super(context, -1);
        this.f113852z = LayoutInflater.from(context);
        this.f113850A = new C23528a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m123098k(View view) {
        if (this.f113851B != null && (view.getTag() instanceof C24546a)) {
            this.f113851B.mo79797Vu((C24546a) view.getTag());
        }
    }

    @Override // com.zing.zalo.adapters.C7035d, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        if (view == null) {
            bVar = new b();
            view2 = this.f113852z.inflate(AbstractC7409c0.game_manage_block_apps_item, viewGroup, false);
            bVar.f113853a = (RecyclingImageView) view2.findViewById(AbstractC6918a0.row_logo);
            bVar.f113854b = (TextView) view2.findViewById(AbstractC6918a0.row_name);
            bVar.f113855c = (TextView) view2.findViewById(AbstractC6918a0.row_status);
            View findViewById = view2.findViewById(AbstractC6918a0.unblock_btn);
            bVar.f113856d = findViewById;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: ms.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C23436b.this.m123098k(view3);
                }
            });
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        try {
            C24546a c24546a = (C24546a) getItem(i11);
            bVar.f113856d.setTag(c24546a);
            bVar.f113854b.setText(c24546a.m127875f());
            if (c24546a.m127881l()) {
                bVar.f113856d.setVisibility(0);
            } else {
                bVar.f113856d.setVisibility(8);
            }
            Drawable m119609q = C23212s8.m119609q(bVar.f113853a.getContext(), AbstractC16781w.default_avatar);
            if (this.f113850A.m123593S(i11, view2, viewGroup, c24546a.m127874e()) && !C23999j.m125696L2(c24546a.m127874e(), C23278z2.m120107Y0())) {
                ((C23528a) this.f113850A.m123612r(bVar.f113853a)).m123615u(m119609q);
            } else {
                ((C23528a) this.f113850A.m123612r(bVar.f113853a)).m123618x(c24546a.m127874e(), C23278z2.m120107Y0());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f113849C, e11);
        }
        return view2;
    }

    /* renamed from: l */
    public void m123099l(a aVar) {
        this.f113851B = aVar;
    }
}
