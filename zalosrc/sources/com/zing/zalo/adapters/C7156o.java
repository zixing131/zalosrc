package com.zing.zalo.adapters;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23126l;
import me0.AbstractC23268y2;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.o */
/* loaded from: classes3.dex */
public class C7156o extends BaseAdapter {

    /* renamed from: p */
    ArrayList f39147p;

    /* renamed from: q */
    public boolean f39148q = false;

    /* renamed from: r */
    public String f39149r = "";

    /* renamed from: s */
    public Context f39150s;

    /* renamed from: t */
    private final a f39151t;

    /* renamed from: u */
    public LayoutInflater f39152u;

    /* renamed from: v */
    private final C23528a f39153v;

    /* renamed from: com.zing.zalo.adapters.o$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: N */
        boolean mo36391N(String str);

        Context getContext();
    }

    /* renamed from: com.zing.zalo.adapters.o$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public GroupAvatarView f39154a;

        /* renamed from: b */
        public TextView f39155b;

        /* renamed from: c */
        public CheckBox f39156c;

        /* renamed from: d */
        public View f39157d;

        /* renamed from: e */
        public TextView f39158e;

        /* renamed from: f */
        public View f39159f;

        /* renamed from: g */
        public boolean f39160g = false;
    }

    public C7156o(a aVar, ArrayList arrayList, C23528a c23528a) {
        this.f39150s = aVar.getContext();
        this.f39153v = c23528a;
        this.f39147p = new ArrayList(arrayList);
        this.f39152u = (LayoutInflater) this.f39150s.getSystemService("layout_inflater");
        this.f39151t = aVar;
    }

    /* renamed from: a */
    public void m36390a(ArrayList arrayList) {
        this.f39147p = new ArrayList(arrayList);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f39147p;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f39147p.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        return !isEnabled(i11) ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        b bVar;
        int i12 = 0;
        if (view == null) {
            bVar = new b();
            if (getItemViewType(i11) == 0) {
                view = this.f39152u.inflate(AbstractC7409c0.invite_group_row, viewGroup, false);
                bVar.f39154a = (GroupAvatarView) view.findViewById(AbstractC6918a0.buddy_dp);
                bVar.f39155b = (TextView) view.findViewById(AbstractC6918a0.name);
                bVar.f39156c = (CheckBox) view.findViewById(AbstractC6918a0.pick_friend_checkbox);
                bVar.f39157d = view.findViewById(AbstractC6918a0.separate_line);
            } else if (getItemViewType(i11) == 1) {
                view = this.f39152u.inflate(AbstractC7409c0.item_list_header_row_material, viewGroup, false);
                bVar.f39158e = (TextView) view.findViewById(AbstractC6918a0.title_row);
                bVar.f39159f = view.findViewById(AbstractC6918a0.separate_line);
            }
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        try {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f39147p.get(i11);
            if (isEnabled(i11)) {
                bVar.f39160g = true;
                if (this.f39149r.equals(inviteContactProfile.f42434r)) {
                    view.setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                } else {
                    view.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                }
                TextView textView = bVar.f39155b;
                textView.setTextColor(C23212s8.m119607o(textView.getContext(), AbstractC21196a.TextColor1));
                if (inviteContactProfile.f42399a1.isEmpty()) {
                    bVar.f39155b.setText(inviteContactProfile.m40383Q(true, false));
                } else {
                    SpannableString spannableString = new SpannableString(inviteContactProfile.m40383Q(true, false).trim());
                    while (i12 < inviteContactProfile.f42399a1.size() - 1) {
                        try {
                            if (((Integer) inviteContactProfile.f42399a1.get(i12)).intValue() >= 0) {
                                int i13 = i12 + 1;
                                if (((Integer) inviteContactProfile.f42399a1.get(i13)).intValue() > ((Integer) inviteContactProfile.f42399a1.get(i12)).intValue()) {
                                    spannableString.setSpan(new StyleSpan(1), ((Integer) inviteContactProfile.f42399a1.get(i12)).intValue(), ((Integer) inviteContactProfile.f42399a1.get(i13)).intValue(), 33);
                                }
                            }
                            i12 += 2;
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                    }
                    bVar.f39155b.setText(spannableString);
                }
                a aVar = this.f39151t;
                if (aVar != null) {
                    bVar.f39156c.setChecked(aVar.mo36391N(inviteContactProfile.f42434r));
                }
                AbstractC23268y2.m120027a(bVar.f39154a, inviteContactProfile, this.f39148q);
            } else {
                bVar.f39160g = false;
                bVar.f39158e.setText(inviteContactProfile.f42437s);
                View view2 = bVar.f39159f;
                if (inviteContactProfile.f42407e1) {
                    i12 = 8;
                }
                view2.setVisibility(i12);
            }
        } catch (Exception e12) {
            AbstractC23126l.m118629c("ChooseMultiFriendListAdapter getView: " + e12.toString());
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        try {
            ArrayList arrayList = this.f39147p;
            if (arrayList != null && arrayList.size() > i11) {
                return ((InviteContactProfile) this.f39147p.get(i11)).m40366G0();
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }
}
