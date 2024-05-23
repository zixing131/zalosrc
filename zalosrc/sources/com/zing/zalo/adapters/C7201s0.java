package com.zing.zalo.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7201s0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23126l;
import me0.AbstractC23268y2;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.s0 */
/* loaded from: classes3.dex */
public class C7201s0 extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    private final View f39462A;

    /* renamed from: B */
    private final View f39463B;

    /* renamed from: D */
    a f39465D;

    /* renamed from: r */
    private ArrayList f39467r;

    /* renamed from: t */
    public HashMap f39469t;

    /* renamed from: u */
    public Context f39470u;

    /* renamed from: v */
    public LayoutInflater f39471v;

    /* renamed from: w */
    private final C23528a f39472w;

    /* renamed from: y */
    public int f39474y;

    /* renamed from: s */
    public boolean f39468s = false;

    /* renamed from: x */
    public String f39473x = "";

    /* renamed from: z */
    public int f39475z = -1;

    /* renamed from: C */
    public boolean f39464C = true;

    /* renamed from: E */
    Map f39466E = new HashMap();

    /* renamed from: com.zing.zalo.adapters.s0$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: bD */
        boolean mo36650bD(ContactProfile contactProfile);
    }

    /* renamed from: com.zing.zalo.adapters.s0$b */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public GroupAvatarView f39476I;

        /* renamed from: J */
        public TextView f39477J;

        /* renamed from: K */
        public CheckBox f39478K;

        /* renamed from: L */
        public View f39479L;

        /* renamed from: M */
        public TextView f39480M;

        /* renamed from: N */
        public TextView f39481N;

        /* renamed from: O */
        public View f39482O;

        /* renamed from: P */
        public RecyclingImageView f39483P;

        /* renamed from: Q */
        public TextView f39484Q;

        /* renamed from: R */
        public View f39485R;

        /* renamed from: S */
        public TextView f39486S;

        public b(View view, int i11) {
            super(view);
            if (i11 == 0) {
                this.f39476I = (GroupAvatarView) view.findViewById(AbstractC6918a0.buddy_dp);
                this.f39477J = (TextView) view.findViewById(AbstractC6918a0.name);
                this.f39478K = (CheckBox) view.findViewById(AbstractC6918a0.pick_friend_checkbox);
                this.f39479L = view.findViewById(AbstractC6918a0.separate_line);
                this.f39480M = (TextView) view.findViewById(AbstractC6918a0.btn_send);
                return;
            }
            if (i11 == 1) {
                this.f39481N = (TextView) view.findViewById(AbstractC6918a0.title_row);
                this.f39482O = view.findViewById(AbstractC6918a0.separate_line);
            } else if (i11 == 3) {
                this.f39477J = (TextView) view.findViewById(AbstractC6918a0.name);
                this.f39483P = (RecyclingImageView) view.findViewById(AbstractC6918a0.image);
                this.f39482O = view.findViewById(AbstractC6918a0.separate_line);
            } else if (i11 == 4) {
                this.f39484Q = (TextView) view.findViewById(AbstractC6918a0.tvCount);
                this.f39485R = view.findViewById(AbstractC6918a0.separate_line1);
                this.f39486S = (TextView) view.findViewById(AbstractC6918a0.tvTitleSeeMore);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public /* synthetic */ void m36652k0(ContactProfile contactProfile, View view) {
            a aVar = C7201s0.this.f39465D;
            if (aVar != null && aVar.mo36650bD(contactProfile)) {
                Map map = C7201s0.this.f39466E;
                String str = contactProfile.f42434r;
                map.put(str, str);
                TextView textView = this.f39480M;
                textView.setText(textView.getResources().getString(AbstractC8020f0.say_hi_box_action_sent));
                this.f39480M.setEnabled(false);
                C7201s0.this.m10008p();
            }
        }

        /* renamed from: j0 */
        public void m36653j0(final ContactProfile contactProfile, int i11) {
            int i12;
            int i13 = 8;
            try {
                if (i11 == 0) {
                    if (C7201s0.this.f39473x.equals(contactProfile.f42434r)) {
                        this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                    } else {
                        this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                    }
                    if (C7201s0.this.f39464C) {
                        this.f39477J.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC21196a.TextColor1));
                        this.f39478K.setVisibility(0);
                        this.f39480M.setVisibility(8);
                    } else {
                        this.f39477J.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC21196a.TextColor1));
                        this.f39478K.setVisibility(8);
                        this.f39480M.setVisibility(0);
                        Resources resources = this.f39480M.getResources();
                        if (!C7201s0.this.f39466E.containsKey(contactProfile.f42434r)) {
                            i12 = AbstractC8020f0.say_hi_box_action_send;
                        } else {
                            i12 = AbstractC8020f0.say_hi_box_action_sent;
                        }
                        this.f39480M.setText(resources.getString(i12));
                        this.f39480M.setEnabled(!C7201s0.this.f39466E.containsKey(contactProfile.f42434r));
                        this.f39480M.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.t0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7201s0.b.this.m36652k0(contactProfile, view);
                            }
                        });
                    }
                    if (contactProfile.f42399a1.isEmpty()) {
                        this.f39477J.setText(contactProfile.m40383Q(true, false));
                    } else {
                        SpannableString spannableString = new SpannableString(contactProfile.m40383Q(true, false).trim());
                        for (int i14 = 0; i14 < contactProfile.f42399a1.size() - 1; i14 += 2) {
                            try {
                                if (((Integer) contactProfile.f42399a1.get(i14)).intValue() >= 0) {
                                    int i15 = i14 + 1;
                                    if (((Integer) contactProfile.f42399a1.get(i15)).intValue() > ((Integer) contactProfile.f42399a1.get(i14)).intValue()) {
                                        spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i14)).intValue(), ((Integer) contactProfile.f42399a1.get(i15)).intValue(), 33);
                                    }
                                }
                            } catch (Exception e11) {
                                AbstractC20110a.m104539h(e11);
                            }
                        }
                        this.f39477J.setText(spannableString);
                    }
                    C7201s0 c7201s0 = C7201s0.this;
                    if (c7201s0.f39464C) {
                        this.f39478K.setChecked(c7201s0.f39469t.containsKey(contactProfile.f42434r));
                        int i16 = C7201s0.this.f39475z;
                        if (i16 != -1) {
                            this.f39478K.setButtonDrawable(i16);
                        }
                    }
                    AbstractC23268y2.m120027a(this.f39476I, contactProfile, C7201s0.this.f39468s);
                    return;
                }
                if (i11 == 1) {
                    this.f39481N.setText(contactProfile.f42437s);
                    View view = this.f39482O;
                    if (!contactProfile.f42407e1) {
                        i13 = 0;
                    }
                    view.setVisibility(i13);
                    return;
                }
                if (i11 == 3) {
                    View view2 = this.f39482O;
                    if (!contactProfile.f42407e1) {
                        i13 = 0;
                    }
                    view2.setVisibility(i13);
                    if (contactProfile.f42434r.equals("-1")) {
                        this.f39477J.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_lable_share_group_new));
                        this.f39483P.setImageResource(AbstractC16803z.ic_creategroup_line_24_sharesheet_placeholder);
                    } else if (contactProfile.f42434r.equals("-2")) {
                        this.f39477J.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_lable_share_story));
                        this.f39483P.setImageResource(AbstractC16803z.ic_broadcast_to_story);
                    } else if (contactProfile.f42434r.equals("-3")) {
                        this.f39477J.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_lable_share_timeline));
                        this.f39483P.setImageResource(AbstractC16803z.ic_broadcast_to_timeline);
                    }
                }
            } catch (Exception e12) {
                AbstractC23126l.m118629c("ZaloListAdapter getView: " + e12.toString());
            }
        }
    }

    public C7201s0(View view, View view2, ArrayList arrayList, LinkedHashMap linkedHashMap, C23528a c23528a, int i11, a aVar) {
        int i12 = 0;
        this.f39469t = new HashMap();
        this.f39474y = -1;
        this.f39470u = view.getContext();
        this.f39462A = view;
        this.f39463B = view2;
        this.f39472w = c23528a;
        this.f39467r = new ArrayList(arrayList);
        while (true) {
            if (i12 >= arrayList.size()) {
                break;
            }
            if (((ContactProfile) this.f39467r.get(i12)).m40372J0()) {
                this.f39467r.remove(i12);
                break;
            }
            i12++;
        }
        this.f39469t = linkedHashMap;
        this.f39471v = (LayoutInflater) this.f39470u.getSystemService("layout_inflater");
        this.f39474y = i11;
        this.f39465D = aVar;
    }

    /* renamed from: L */
    public Object m36646L(int i11) {
        if (i11 >= 0 && i11 < this.f39467r.size()) {
            return this.f39467r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        if (i11 >= 1 && i11 < this.f39467r.size() + 1) {
            bVar.m36653j0((ContactProfile) this.f39467r.get(i11 - 1), mo10005m(i11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 == 2) {
            return new b(this.f39462A, i11);
        }
        if (i11 == 6) {
            return new b(this.f39463B, i11);
        }
        if (i11 == 1) {
            return new b(this.f39471v.inflate(AbstractC7409c0.item_list_header_row_material, viewGroup, false), i11);
        }
        if (i11 == 4) {
            return new b(this.f39471v.inflate(AbstractC7409c0.item_see_more_global_search, viewGroup, false), i11);
        }
        if (i11 == 3) {
            return new b(this.f39471v.inflate(AbstractC7409c0.share_item_destinations_view, viewGroup, false), i11);
        }
        if (i11 == 5) {
            return new b(this.f39471v.inflate(AbstractC7409c0.seperate_list_global_search, viewGroup, false), i11);
        }
        if (i11 == 7) {
            return new b(this.f39471v.inflate(AbstractC7409c0.item_empty_share_view, viewGroup, false), i11);
        }
        return new b(this.f39471v.inflate(AbstractC7409c0.share_event_box_item, viewGroup, false), i11);
    }

    /* renamed from: O */
    public void m36649O(List list) {
        try {
            this.f39467r = new ArrayList(list);
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (((ContactProfile) this.f39467r.get(i11)).m40372J0()) {
                    this.f39467r.remove(i11);
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        int i11;
        ArrayList arrayList = this.f39467r;
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            i11 = 0;
        }
        return i11 + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        int i12;
        String str;
        if (i11 < 1) {
            return 2;
        }
        if (i11 >= mo10003k() - 1) {
            return 6;
        }
        ArrayList arrayList = this.f39467r;
        if (arrayList != null && arrayList.size() > (i12 = i11 - 1)) {
            ContactProfile contactProfile = (ContactProfile) this.f39467r.get(i12);
            if (contactProfile != null && (str = contactProfile.f42434r) != null && !str.equals("-8")) {
                if (contactProfile.f42434r.equals("-9")) {
                    return 7;
                }
                if (!contactProfile.f42434r.equals("-4") && !contactProfile.f42434r.equals("-5") && !contactProfile.f42434r.equals("-6") && !contactProfile.f42434r.equals("-7")) {
                    if (contactProfile.f42434r.startsWith("-")) {
                        return 3;
                    }
                    if (contactProfile.m40366G0()) {
                        return 0;
                    }
                } else {
                    return 4;
                }
            } else {
                return 5;
            }
        }
        return 1;
    }
}
