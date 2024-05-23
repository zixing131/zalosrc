package z30;

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
import com.zing.zalo.thirdparty.model.AuthorisedApp;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;

/* renamed from: z30.a */
/* loaded from: classes5.dex */
public class C31212a extends C7035d {

    /* renamed from: B */
    private static final String f144220B = "a";

    /* renamed from: A */
    private final C23528a f144221A;

    /* renamed from: z */
    private final LayoutInflater f144222z;

    /* renamed from: z30.a$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        public int f144223a;

        /* renamed from: b */
        public RecyclingImageView f144224b;

        /* renamed from: c */
        public TextView f144225c;

        /* renamed from: d */
        public TextView f144226d;

        /* renamed from: e */
        public View f144227e;

        /* renamed from: f */
        public TextView f144228f;

        /* renamed from: g */
        public boolean f144229g = false;
    }

    public C31212a(Context context) {
        super(context, -1);
        this.f144222z = LayoutInflater.from(context);
        this.f144221A = new C23528a(context);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        return ((AuthorisedApp) getItem(i11)).m56633n() ? 1 : 0;
    }

    @Override // com.zing.zalo.adapters.C7035d, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            aVar = new a();
            if (getItemViewType(i11) == 0) {
                view = this.f144222z.inflate(AbstractC7409c0.authorised_app_row, viewGroup, false);
                aVar.f144224b = (RecyclingImageView) view.findViewById(AbstractC6918a0.authorised_app_row_logo);
                aVar.f144225c = (TextView) view.findViewById(AbstractC6918a0.authorised_app_row_name);
                aVar.f144226d = (TextView) view.findViewById(AbstractC6918a0.authorised_app_row_company);
                aVar.f144227e = view.findViewById(AbstractC6918a0.separate_line);
                aVar.f144223a = 0;
            } else if (getItemViewType(i11) == 1) {
                view = this.f144222z.inflate(AbstractC7409c0.item_list_header_row, viewGroup, false);
                aVar.f144228f = (TextView) view.findViewById(AbstractC6918a0.title_row);
                aVar.f144223a = 1;
            }
            if (view != null) {
                view.setTag(aVar);
            }
        } else {
            aVar = (a) view.getTag();
        }
        try {
            AuthorisedApp authorisedApp = (AuthorisedApp) getItem(i11);
            if (aVar.f144223a == 1) {
                aVar.f144228f.setText(authorisedApp.m56623d());
            } else {
                ((C23528a) this.f144221A.m123612r(aVar.f144224b)).m123618x(authorisedApp.m56622c(), C23278z2.m120107Y0());
                aVar.f144225c.setText(authorisedApp.m56623d());
                aVar.f144226d.setText(authorisedApp.m56621b());
                Drawable m119609q = C23212s8.m119609q(aVar.f144224b.getContext(), AbstractC16781w.default_avatar);
                if (m119609q != null && this.f144221A.m123593S(i11, view, viewGroup, authorisedApp.m56622c())) {
                    ((C23528a) this.f144221A.m123612r(aVar.f144224b)).m123615u(m119609q);
                } else {
                    ((C23528a) this.f144221A.m123612r(aVar.f144224b)).m123618x(authorisedApp.m56622c(), C23278z2.m120107Y0());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f144220B, e11);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        return !((AuthorisedApp) getItem(i11)).m56633n();
    }
}
