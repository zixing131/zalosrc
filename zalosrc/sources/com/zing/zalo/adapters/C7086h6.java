package com.zing.zalo.adapters;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7086h6;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.zview.AbstractC17466e;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;

/* renamed from: com.zing.zalo.adapters.h6 */
/* loaded from: classes3.dex */
public class C7086h6 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f38731r;

    /* renamed from: u */
    a f38734u;

    /* renamed from: x */
    View f38737x;

    /* renamed from: y */
    View f38738y;

    /* renamed from: s */
    boolean f38732s = false;

    /* renamed from: t */
    boolean f38733t = true;

    /* renamed from: v */
    public boolean f38735v = false;

    /* renamed from: w */
    public String f38736w = "";

    /* renamed from: z */
    ArrayList f38739z = new ArrayList();

    /* renamed from: com.zing.zalo.adapters.h6$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: P */
        void mo36144P(ContactProfile contactProfile);

        /* renamed from: T1 */
        boolean mo36145T1(String str);

        /* renamed from: Z1 */
        void mo36146Z1(ContactProfile contactProfile);

        /* renamed from: w */
        void mo36147w(ContactProfile contactProfile);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.h6$b */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public GroupAvatarView f38740I;

        /* renamed from: J */
        public TextView f38741J;

        /* renamed from: K */
        public TextView f38742K;

        /* renamed from: L */
        public TextView f38743L;

        /* renamed from: M */
        public TextView f38744M;

        /* renamed from: N */
        public View f38745N;

        /* renamed from: O */
        public CheckBox f38746O;

        /* renamed from: P */
        public TextView f38747P;

        /* renamed from: Q */
        public View f38748Q;

        /* renamed from: R */
        public TextView f38749R;

        /* renamed from: S */
        public RecyclingImageView f38750S;

        public b(View view, int i11) {
            super(view);
            if (i11 == 1) {
                this.f38740I = (GroupAvatarView) view.findViewById(AbstractC6918a0.img_avt);
                this.f38741J = (TextView) view.findViewById(AbstractC6918a0.name);
                this.f38742K = (TextView) view.findViewById(AbstractC6918a0.description);
                this.f38743L = (TextView) view.findViewById(AbstractC6918a0.btn_send);
                this.f38746O = (CheckBox) view.findViewById(AbstractC6918a0.pick_friend_checkbox);
                return;
            }
            if (i11 == 2) {
                this.f38744M = (TextView) view.findViewById(AbstractC6918a0.title_row);
                this.f38745N = view.findViewById(AbstractC6918a0.separate_line);
            } else if (i11 == 3) {
                this.f38747P = (TextView) view.findViewById(AbstractC6918a0.tvCount);
                this.f38748Q = view.findViewById(AbstractC6918a0.separate_line1);
                this.f38749R = (TextView) view.findViewById(AbstractC6918a0.tvTitleSeeMore);
            } else if (i11 == 4) {
                this.f38741J = (TextView) view.findViewById(AbstractC6918a0.name);
                this.f38750S = (RecyclingImageView) view.findViewById(AbstractC6918a0.image);
                this.f38745N = view.findViewById(AbstractC6918a0.separate_line);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public /* synthetic */ void m36152n0(ContactProfile contactProfile, View view) {
            a aVar = C7086h6.this.f38734u;
            if (aVar != null) {
                aVar.mo36144P(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o0 */
        public /* synthetic */ void m36153o0(ContactProfile contactProfile, View view) {
            C7086h6 c7086h6 = C7086h6.this;
            if (c7086h6.f38734u != null && c7086h6.f38733t) {
                c7086h6.f38739z.add(contactProfile.f42434r);
                this.f38743L.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_say_hi_box_action_sent));
                TextView textView = this.f38743L;
                textView.setTypeface(C13718q1.m76694c(textView.getContext(), 5));
                TextView textView2 = this.f38743L;
                textView2.setTextColor(C23212s8.m119607o(textView2.getContext(), AbstractC21196a.TextColor2));
                AbstractC23136l9.m118693a1(this.f38743L, AbstractC17466e.transparent);
                this.f38743L.setEnabled(false);
                C7086h6.this.f38734u.mo36146Z1(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p0 */
        public /* synthetic */ void m36154p0(ContactProfile contactProfile, View view) {
            a aVar = C7086h6.this.f38734u;
            if (aVar != null) {
                aVar.mo36147w(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q0 */
        public /* synthetic */ void m36155q0(ContactProfile contactProfile, View view) {
            a aVar = C7086h6.this.f38734u;
            if (aVar != null) {
                aVar.mo36147w(contactProfile);
            }
        }

        /* renamed from: m0 */
        public void m36156m0(int i11, int i12) {
            int i13;
            try {
                List list = C7086h6.this.f38731r;
                if (list != null) {
                    final ContactProfile contactProfile = (ContactProfile) list.get(i11);
                    int i14 = 8;
                    if (i12 == 1) {
                        if (!TextUtils.isEmpty(C7086h6.this.f38736w) && C7086h6.this.f38736w.equals(contactProfile.f42434r)) {
                            this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                        } else {
                            this.f7784p.setBackgroundResource(AbstractC16803z.stencils_bg_white_with_press_state);
                        }
                        TextView textView = this.f38741J;
                        textView.setTextColor(C23212s8.m119607o(textView.getContext(), AbstractC21196a.TextColor1));
                        if (contactProfile.f42399a1.isEmpty()) {
                            this.f38741J.setText(contactProfile.m40383Q(true, false));
                        } else {
                            SpannableString spannableString = new SpannableString(contactProfile.m40383Q(true, false).trim());
                            for (int i15 = 0; i15 < contactProfile.f42399a1.size() - 1; i15 += 2) {
                                try {
                                    if (((Integer) contactProfile.f42399a1.get(i15)).intValue() >= 0) {
                                        int i16 = i15 + 1;
                                        if (((Integer) contactProfile.f42399a1.get(i16)).intValue() > ((Integer) contactProfile.f42399a1.get(i15)).intValue()) {
                                            spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i15)).intValue(), ((Integer) contactProfile.f42399a1.get(i16)).intValue(), 33);
                                        }
                                    }
                                } catch (Exception e11) {
                                    AbstractC20110a.m104539h(e11);
                                }
                            }
                            this.f38741J.setText(spannableString);
                        }
                        AbstractC23268y2.m120027a(this.f38740I, contactProfile, C7086h6.this.f38732s);
                        if (C7086h6.this.f38735v) {
                            this.f38743L.setVisibility(8);
                            a aVar = C7086h6.this.f38734u;
                            if (aVar != null) {
                                this.f38746O.setChecked(aVar.mo36145T1(contactProfile.f42434r));
                                this.f38746O.setVisibility(0);
                                this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.i6
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C7086h6.b.this.m36152n0(contactProfile, view);
                                    }
                                });
                                return;
                            }
                            this.f38746O.setVisibility(8);
                            return;
                        }
                        this.f7784p.setOnClickListener(null);
                        this.f38743L.setVisibility(0);
                        this.f38746O.setVisibility(8);
                        Resources resources = this.f38743L.getResources();
                        if (!C7086h6.this.f38739z.contains(contactProfile.f42434r)) {
                            i13 = AbstractC8020f0.say_hi_box_action_send;
                        } else {
                            i13 = AbstractC8020f0.str_say_hi_box_action_sent;
                        }
                        this.f38743L.setText(resources.getString(i13));
                        this.f38743L.setEnabled(!C7086h6.this.f38739z.contains(contactProfile.f42434r));
                        if (C7086h6.this.f38739z.contains(contactProfile.f42434r)) {
                            TextView textView2 = this.f38743L;
                            textView2.setTextColor(C23212s8.m119607o(textView2.getContext(), AbstractC21196a.TextColor2));
                            AbstractC23136l9.m118693a1(this.f38743L, AbstractC17466e.transparent);
                            TextView textView3 = this.f38743L;
                            textView3.setTypeface(C13718q1.m76694c(textView3.getContext(), 5));
                        } else {
                            TextView textView4 = this.f38743L;
                            textView4.setTextColor(AbstractC23136l9.m118645D(textView4.getContext(), AbstractC16801x.bg_btn_type2_text));
                            AbstractC23136l9.m118693a1(this.f38743L, AbstractC16803z.bg_btn_type2_medium);
                            TextView textView5 = this.f38743L;
                            textView5.setTypeface(C13718q1.m76694c(textView5.getContext(), 7));
                        }
                        this.f38743L.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.j6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7086h6.b.this.m36153o0(contactProfile, view);
                            }
                        });
                        return;
                    }
                    if (i12 == 2) {
                        this.f38744M.setText(contactProfile.f42437s);
                        View view = this.f38745N;
                        if (!contactProfile.f42407e1) {
                            i14 = 0;
                        }
                        view.setVisibility(i14);
                        return;
                    }
                    if (i12 == 3) {
                        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.k6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C7086h6.b.this.m36154p0(contactProfile, view2);
                            }
                        });
                        return;
                    }
                    if (i12 == 4) {
                        View view2 = this.f38745N;
                        if (!contactProfile.f42407e1) {
                            i14 = 0;
                        }
                        view2.setVisibility(i14);
                        if (contactProfile.f42434r.equals("-1")) {
                            TextView textView6 = this.f38741J;
                            textView6.setText(textView6.getContext().getResources().getString(AbstractC8020f0.str_lable_share_group_new));
                            this.f38750S.setImageResource(AbstractC16803z.ic_creategroup_line_24_sharesheet_placeholder);
                        } else if (contactProfile.f42434r.equals("-2")) {
                            TextView textView7 = this.f38741J;
                            textView7.setText(textView7.getContext().getResources().getString(AbstractC8020f0.str_lable_share_story));
                            this.f38750S.setImageResource(AbstractC16803z.ic_broadcast_to_story);
                        } else if (contactProfile.f42434r.equals("-3")) {
                            TextView textView8 = this.f38741J;
                            textView8.setText(textView8.getContext().getResources().getString(AbstractC8020f0.str_lable_share_timeline));
                            this.f38750S.setImageResource(AbstractC16803z.ic_broadcast_to_timeline);
                        }
                        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.l6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                C7086h6.b.this.m36155q0(contactProfile, view3);
                            }
                        });
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    public C7086h6(a aVar, View view, View view2) {
        this.f38734u = aVar;
        this.f38737x = view;
        this.f38738y = view2;
    }

    /* renamed from: L */
    public ArrayList m36137L() {
        return this.f38739z;
    }

    /* renamed from: M */
    public List m36138M() {
        return this.f38731r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        if (i11 >= 1 && i11 < this.f38731r.size() + 1) {
            bVar.m36156m0(i11 - 1, mo10005m(i11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i11 == 0) {
            return new b(this.f38737x, i11);
        }
        if (i11 == 6) {
            return new b(this.f38738y, i11);
        }
        if (i11 == 2) {
            return new b(from.inflate(AbstractC7409c0.item_list_header_row_material, viewGroup, false), i11);
        }
        if (i11 == 3) {
            return new b(from.inflate(AbstractC7409c0.item_see_more_global_search, viewGroup, false), i11);
        }
        if (i11 == 4) {
            return new b(from.inflate(AbstractC7409c0.share_item_destinations_view, viewGroup, false), i11);
        }
        if (i11 == 5) {
            return new b(from.inflate(AbstractC7409c0.seperate_list_global_search, viewGroup, false), i11);
        }
        if (i11 == 7) {
            return new b(from.inflate(AbstractC7409c0.item_empty_share_view, viewGroup, false), i11);
        }
        return new b(from.inflate(AbstractC7409c0.share_item_normal_view, viewGroup, false), i11);
    }

    /* renamed from: P */
    public void m36141P(ArrayList arrayList) {
        if (arrayList != null) {
            this.f38739z = arrayList;
        }
    }

    /* renamed from: Q */
    public void m36142Q(List list) {
        this.f38731r = new ArrayList(list);
    }

    /* renamed from: R */
    public void m36143R(boolean z11) {
        this.f38732s = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        int i11;
        List list = this.f38731r;
        if (list != null) {
            i11 = list.size();
        } else {
            i11 = 0;
        }
        return i11 + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 < 1) {
            return 0;
        }
        if (i11 >= mo10003k() - 1) {
            return 6;
        }
        int i12 = i11 - 1;
        if (i12 < this.f38731r.size()) {
            ContactProfile contactProfile = (ContactProfile) this.f38731r.get(i12);
            if (contactProfile.f42434r.equals("-8")) {
                return 5;
            }
            if (contactProfile.f42434r.equals("-9")) {
                return 7;
            }
            if (!contactProfile.f42434r.equals("-4") && !contactProfile.f42434r.equals("-5") && !contactProfile.f42434r.equals("-6") && !contactProfile.f42434r.equals("-7")) {
                if (contactProfile.f42434r.startsWith("-")) {
                    return 4;
                }
                if (!contactProfile.m40366G0()) {
                    return 2;
                }
            } else {
                return 3;
            }
        }
        return 1;
    }
}
