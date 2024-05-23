package z30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7035d;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import y30.C30283a;

/* renamed from: z30.d */
/* loaded from: classes5.dex */
public class C31215d extends C7035d {

    /* renamed from: B */
    static final String f144230B = "d";

    /* renamed from: A */
    private final CompoundButton.OnCheckedChangeListener f144231A;

    /* renamed from: z */
    private final View.OnClickListener f144232z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z30.d$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        C30283a.b f144233a;

        /* renamed from: b */
        CompoundButton f144234b;

        /* renamed from: c */
        TextView f144235c;

        /* renamed from: d */
        View f144236d;

        a() {
        }

        /* renamed from: a */
        void mo152098a() {
            this.f144234b.setChecked(this.f144233a.m149431d());
            this.f144234b.setEnabled(!this.f144233a.m149430c());
            this.f144236d.setEnabled(!this.f144233a.m149430c());
            this.f144235c.setText(this.f144233a.m149429b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z30.d$b */
    /* loaded from: classes5.dex */
    public static class b extends a {

        /* renamed from: e */
        RecyclingImageView f144237e;

        /* renamed from: f */
        TextView f144238f;

        /* renamed from: g */
        C23528a f144239g;

        public b(Context context) {
            this.f144239g = new C23528a(context);
        }

        @Override // z30.C31215d.a
        /* renamed from: a */
        void mo152098a() {
            super.mo152098a();
            this.f144238f.setText(((C30283a.a) this.f144233a).m149427g());
            ((C23528a) this.f144239g.m123612r(this.f144237e)).m123618x(((C30283a.a) this.f144233a).m149426f(), C23278z2.m120107Y0());
        }
    }

    public C31215d(Context context) {
        super(context, 0);
        this.f144232z = new View.OnClickListener() { // from class: z30.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C31215d.m152096m(view);
            }
        };
        this.f144231A = new CompoundButton.OnCheckedChangeListener() { // from class: z30.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                C31215d.m152097n(compoundButton, z11);
            }
        };
    }

    /* renamed from: l */
    private int m152095l(a aVar) {
        if (aVar instanceof b) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m152096m(View view) {
        try {
            a aVar = (a) view.getTag();
            C30283a.b bVar = aVar.f144233a;
            if (bVar != null && !bVar.m149430c()) {
                aVar.f144233a.m149432e(!r0.m149431d());
                aVar.mo152098a();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f144230B, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m152097n(CompoundButton compoundButton, boolean z11) {
        try {
            a aVar = (a) compoundButton.getTag();
            C30283a.b bVar = aVar.f144233a;
            if (bVar != null && !bVar.m149430c()) {
                aVar.f144233a.m149432e(z11);
                aVar.mo152098a();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f144230B, e11);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        if (getItem(i11) instanceof C30283a.a) {
            return 1;
        }
        return 0;
    }

    @Override // com.zing.zalo.adapters.C7035d, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        a aVar2;
        C30283a.b bVar = (C30283a.b) getItem(i11);
        if (view != null && m152095l((a) view.getTag()) == getItemViewType(i11)) {
            aVar2 = (a) view.getTag();
            view2 = view;
        } else {
            View inflate = LayoutInflater.from(m35954e()).inflate(AbstractC7409c0.authorization_app_permission_item, viewGroup, false);
            if (bVar instanceof C30283a.a) {
                b bVar2 = new b(m35954e());
                bVar2.f144237e = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.authorization_app_oa_avatar);
                bVar2.f144238f = (TextView) inflate.findViewById(AbstractC6918a0.authorization_app_oa_name);
                inflate.findViewById(AbstractC6918a0.ll_authorization_OA).setVisibility(0);
                aVar = bVar2;
            } else {
                aVar = new a();
            }
            aVar.f144234b = (CompoundButton) inflate.findViewById(AbstractC6918a0.authorization_app_permission_name_checkbox);
            aVar.f144235c = (TextView) inflate.findViewById(AbstractC6918a0.authorization_app_permission_name_text);
            aVar.f144236d = inflate.findViewById(AbstractC6918a0.authorization_app_permission_name_layout);
            inflate.setTag(aVar);
            aVar.f144236d.setTag(aVar);
            aVar.f144234b.setTag(aVar);
            aVar.f144236d.setOnClickListener(this.f144232z);
            aVar.f144234b.setOnCheckedChangeListener(this.f144231A);
            aVar2 = aVar;
            view2 = inflate;
        }
        aVar2.f144233a = bVar;
        aVar2.mo152098a();
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        return !((C30283a.b) getItem(i11)).m149430c();
    }
}
