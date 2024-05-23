package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import sx.AbstractC26401c;
import sx.C26400b;
import sx.C26402d;
import sx.C26403e;

/* renamed from: com.zing.zalo.adapters.j7 */
/* loaded from: classes3.dex */
public class C7109j7 extends C7035d {

    /* renamed from: D */
    private static final String f38847D = "j7";

    /* renamed from: A */
    public LayoutInflater f38848A;

    /* renamed from: B */
    private final C23528a f38849B;

    /* renamed from: C */
    private C26400b f38850C;

    /* renamed from: z */
    public Context f38851z;

    /* renamed from: com.zing.zalo.adapters.j7$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public AvatarImageView f38852a;

        /* renamed from: b */
        public View f38853b;

        /* renamed from: c */
        public CheckBox f38854c;

        /* renamed from: d */
        public RadioButton f38855d;

        /* renamed from: e */
        public TextView f38856e;

        /* renamed from: f */
        public View f38857f;
    }

    public C7109j7(Context context, C23528a c23528a, C26400b c26400b) {
        super(context, 0);
        this.f38851z = context;
        this.f38849B = c23528a;
        this.f38848A = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f38850C = c26400b;
    }

    /* renamed from: j */
    private boolean m36201j(int i11) {
        if (i11 == getCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        return !(getItem(i11) instanceof C26403e) ? 1 : 0;
    }

    @Override // com.zing.zalo.adapters.C7035d, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        int i12;
        try {
            if (view == null) {
                aVar = new a();
                if (getItemViewType(i11) == 1) {
                    view = this.f38848A.inflate(AbstractC7409c0.layout_security_question_answer_avatar_text, viewGroup, false);
                    aVar.f38852a = (AvatarImageView) view.findViewById(AbstractC6918a0.buddy_dp);
                } else {
                    view = this.f38848A.inflate(AbstractC7409c0.layout_security_question_answer_text, viewGroup, false);
                }
                aVar.f38856e = (TextView) view.findViewById(AbstractC6918a0.name);
                aVar.f38854c = (CheckBox) view.findViewById(AbstractC6918a0.pick_friend_checkbox);
                aVar.f38855d = (RadioButton) view.findViewById(AbstractC6918a0.radio_selection);
                aVar.f38857f = view.findViewById(AbstractC6918a0.separate_line);
                aVar.f38853b = view.findViewById(AbstractC6918a0.layoutcontact);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            AbstractC26401c abstractC26401c = (AbstractC26401c) getItem(i11);
            if (getItemViewType(i11) == 1) {
                String m136146g = ((C26402d) abstractC26401c).m136146g();
                if (!TextUtils.isEmpty(m136146g)) {
                    ((C23528a) this.f38849B.m123612r(aVar.f38852a)).m123618x(m136146g, C23278z2.m120143n());
                }
            }
            aVar.f38856e.setText(abstractC26401c.m136140a());
            View view2 = aVar.f38857f;
            if (!m36201j(i11)) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            view2.setVisibility(i12);
            if (this.f38850C.m136132h()) {
                aVar.f38854c.setChecked(abstractC26401c.m136142c());
                aVar.f38854c.setVisibility(0);
                aVar.f38855d.setVisibility(8);
            } else {
                aVar.f38854c.setVisibility(8);
                aVar.f38855d.setVisibility(0);
                aVar.f38855d.setChecked(abstractC26401c.m136142c());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f38847D, e11);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    /* renamed from: k */
    public void m36202k(C26400b c26400b) {
        this.f38850C = c26400b;
    }
}
