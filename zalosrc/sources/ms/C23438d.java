package ms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7035d;
import mm0.AbstractC23350e;
import p402os.C24547b;

/* renamed from: ms.d */
/* loaded from: classes4.dex */
public class C23438d extends C7035d {

    /* renamed from: F */
    static final String f113857F = "d";

    /* renamed from: A */
    ViewGroup f113858A;

    /* renamed from: B */
    d f113859B;

    /* renamed from: C */
    c f113860C;

    /* renamed from: D */
    private final View.OnClickListener f113861D;

    /* renamed from: E */
    private final CompoundButton.OnCheckedChangeListener f113862E;

    /* renamed from: z */
    LayoutInflater f113863z;

    /* renamed from: ms.d$a */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (C23438d.this.f113859B != null && (view.getTag() instanceof e)) {
                    C23438d.this.f113859B.mo87276a(((e) view.getTag()).f113866a);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C23438d.f113857F, e11);
            }
        }
    }

    /* renamed from: ms.d$b */
    /* loaded from: classes4.dex */
    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            try {
                if (C23438d.this.f113860C != null && (compoundButton.getTag() instanceof e)) {
                    C23438d.this.f113860C.mo87295a(((e) compoundButton.getTag()).f113866a, z11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C23438d.f113857F, e11);
            }
        }
    }

    /* renamed from: ms.d$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        void mo87295a(C24547b c24547b, boolean z11);
    }

    /* renamed from: ms.d$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: a */
        void mo87276a(C24547b c24547b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ms.d$e */
    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a */
        C24547b f113866a;

        /* renamed from: b */
        TextView f113867b;

        /* renamed from: c */
        CompoundButton f113868c;

        /* renamed from: d */
        View f113869d;

        /* renamed from: e */
        View f113870e;

        e() {
        }
    }

    public C23438d(Context context, ViewGroup viewGroup) {
        super(context, -1);
        this.f113861D = new a();
        this.f113862E = new b();
        this.f113863z = LayoutInflater.from(context);
        this.f113858A = viewGroup;
    }

    @Override // com.zing.zalo.adapters.C7035d, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        View view2;
        e eVar;
        int i12 = 0;
        if (view == null) {
            eVar = new e();
            view2 = this.f113863z.inflate(AbstractC7409c0.game_manage_detail_permission_item, viewGroup, false);
            eVar.f113867b = (TextView) view2.findViewById(AbstractC6918a0.authorization_app_permission_title);
            eVar.f113868c = (CompoundButton) view2.findViewById(AbstractC6918a0.authorization_app_permission_checkbox);
            eVar.f113869d = view2.findViewById(AbstractC6918a0.authorization_app_permission_layout);
            eVar.f113870e = view2.findViewById(AbstractC6918a0.authorization_app_permission_separate_line);
            eVar.f113869d.setTag(eVar);
            eVar.f113868c.setTag(eVar);
            view2.setTag(eVar);
            eVar.f113868c.setOnCheckedChangeListener(this.f113862E);
            eVar.f113869d.setOnClickListener(this.f113861D);
        } else {
            view2 = view;
            eVar = (e) view.getTag();
        }
        try {
            C24547b c24547b = (C24547b) getItem(i11);
            eVar.f113866a = c24547b;
            eVar.f113867b.setText(c24547b.m127896b());
            eVar.f113868c.setChecked(c24547b.m127898d());
            eVar.f113869d.setEnabled(c24547b.m127897c());
            eVar.f113868c.setEnabled(c24547b.m127897c());
            View view3 = eVar.f113870e;
            if (i11 == getCount() - 1) {
                i12 = 8;
            }
            view3.setVisibility(i12);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f113857F, e11);
        }
        return view2;
    }

    /* renamed from: j */
    public void m123100j(c cVar) {
        this.f113860C = cVar;
    }

    /* renamed from: k */
    public void m123101k(d dVar) {
        this.f113859B = dVar;
    }

    /* renamed from: l */
    public void m123102l() {
        int i11 = 0;
        while (true) {
            try {
                if (i11 < this.f113858A.getChildCount()) {
                    if (i11 >= getCount()) {
                        break;
                    }
                    getView(i11, this.f113858A.getChildAt(i11), this.f113858A);
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f113857F, e11);
                return;
            }
        }
        if (i11 > -1) {
            ViewGroup viewGroup = this.f113858A;
            viewGroup.removeViews(i11, viewGroup.getChildCount() - i11);
            return;
        }
        for (int childCount = this.f113858A.getChildCount(); childCount < getCount(); childCount++) {
            this.f113858A.addView(getView(childCount, null, this.f113858A));
        }
    }
}
