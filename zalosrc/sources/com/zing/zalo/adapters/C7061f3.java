package com.zing.zalo.adapters;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.InviteContactMask;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23309i;

/* renamed from: com.zing.zalo.adapters.f3 */
/* loaded from: classes3.dex */
public class C7061f3 extends BaseAdapter {

    /* renamed from: p */
    ArrayList f38580p;

    /* renamed from: q */
    public String f38581q = "";

    /* renamed from: r */
    public boolean f38582r = false;

    /* renamed from: s */
    private final LayoutInflater f38583s;

    /* renamed from: t */
    private final HashSet f38584t;

    /* renamed from: u */
    private final HashSet f38585u;

    /* renamed from: v */
    private final HashMap f38586v;

    /* renamed from: w */
    final int f38587w;

    /* renamed from: x */
    final int f38588x;

    /* renamed from: com.zing.zalo.adapters.f3$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public GroupAvatarView f38589a;

        /* renamed from: b */
        public TextView f38590b;

        /* renamed from: c */
        public TextView f38591c;

        /* renamed from: d */
        public CheckBox f38592d;

        /* renamed from: e */
        public View f38593e;

        /* renamed from: f */
        public TextView f38594f;

        /* renamed from: g */
        public View f38595g;

        /* renamed from: h */
        public boolean f38596h = false;

        /* renamed from: i */
        public TextView f38597i;
    }

    public C7061f3(Context context, ArrayList arrayList, HashSet hashSet, HashSet hashSet2, HashMap hashMap) {
        this.f38580p = new ArrayList(arrayList);
        this.f38584t = hashSet;
        this.f38583s = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f38585u = hashSet2;
        this.f38586v = hashMap;
        this.f38587w = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f38588x = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
    }

    /* renamed from: a */
    public void m36062a(ArrayList arrayList) {
        this.f38580p = new ArrayList(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void m36063b(HashSet hashSet) {
        this.f38585u.clear();
        this.f38585u.addAll(hashSet);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f38580p;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        ArrayList arrayList = this.f38580p;
        if (arrayList != null && i11 < arrayList.size()) {
            return this.f38580p.get(i11);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        InviteContactProfile inviteContactProfile = (InviteContactProfile) getItem(i11);
        if (inviteContactProfile != null) {
            return inviteContactProfile.m40366G0() ? 1 : 0;
        }
        return 2;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        boolean z11;
        int i12 = 0;
        try {
            if (view == null) {
                aVar = new a();
                int itemViewType = getItemViewType(i11);
                if (itemViewType != 0) {
                    if (itemViewType == 1) {
                        view = this.f38583s.inflate(AbstractC7409c0.invite_user_to_group_row, viewGroup, false);
                        aVar.f38589a = (GroupAvatarView) view.findViewById(AbstractC6918a0.buddy_dp);
                        aVar.f38590b = (TextView) view.findViewById(AbstractC6918a0.name);
                        aVar.f38591c = (TextView) view.findViewById(AbstractC6918a0.description);
                        aVar.f38592d = (CheckBox) view.findViewById(AbstractC6918a0.pick_friend_checkbox);
                        aVar.f38593e = view.findViewById(AbstractC6918a0.separate_line);
                        aVar.f38597i = (TextView) view.findViewById(AbstractC6918a0.state);
                        view.setTag(aVar);
                    }
                } else {
                    view = this.f38583s.inflate(AbstractC7409c0.invite_group_section_header_row, viewGroup, false);
                    aVar.f38594f = (TextView) view.findViewById(AbstractC6918a0.title_row);
                    aVar.f38595g = view.findViewById(AbstractC6918a0.separate_line);
                    aVar.f38592d = (CheckBox) view.findViewById(AbstractC6918a0.pick_friend_checkbox);
                    view.setTag(aVar);
                }
            } else {
                aVar = (a) view.getTag();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (view == null) {
            return null;
        }
        InviteContactProfile inviteContactProfile = (InviteContactProfile) getItem(i11);
        int itemViewType2 = getItemViewType(i11);
        if (itemViewType2 != 0) {
            if (itemViewType2 == 1) {
                aVar.f38596h = true;
                if (!TextUtils.isEmpty(this.f38581q) && this.f38581q.equals(inviteContactProfile.f42434r)) {
                    view.setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                } else {
                    view.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                }
                InviteContactMask inviteContactMask = inviteContactProfile.f42540d2;
                if (inviteContactMask != null && inviteContactMask.f42537s == 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aVar.f38590b.setTextColor(this.f38587w);
                aVar.f38590b.setVisibility(0);
                if (z11) {
                    if (TextUtils.isEmpty(inviteContactProfile.f42540d2.f42536r)) {
                        aVar.f38590b.setVisibility(8);
                    }
                    aVar.f38590b.setText(inviteContactProfile.f42540d2.f42536r);
                } else if (inviteContactProfile.f42399a1.isEmpty()) {
                    aVar.f38590b.setText(inviteContactProfile.m40383Q(true, false));
                } else {
                    SpannableString spannableString = new SpannableString(inviteContactProfile.m40383Q(true, false).trim());
                    for (int i13 = 0; i13 < inviteContactProfile.f42399a1.size() - 1; i13 += 2) {
                        try {
                            if (((Integer) inviteContactProfile.f42399a1.get(i13)).intValue() >= 0) {
                                int i14 = i13 + 1;
                                if (((Integer) inviteContactProfile.f42399a1.get(i14)).intValue() > ((Integer) inviteContactProfile.f42399a1.get(i13)).intValue()) {
                                    spannableString.setSpan(new StyleSpan(1), ((Integer) inviteContactProfile.f42399a1.get(i13)).intValue(), ((Integer) inviteContactProfile.f42399a1.get(i14)).intValue(), 33);
                                }
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                    aVar.f38590b.setText(spannableString);
                }
                aVar.f38591c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                aVar.f38591c.setTextColor(this.f38588x);
                String str = "";
                if (z11) {
                    aVar.f38591c.setText("");
                    aVar.f38591c.setVisibility(8);
                } else {
                    InviteContactMask inviteContactMask2 = inviteContactProfile.f42540d2;
                    if (inviteContactMask2 != null && !TextUtils.isEmpty(inviteContactMask2.f42536r)) {
                        aVar.f38591c.setText(inviteContactProfile.f42540d2.f42536r);
                        aVar.f38591c.setVisibility(0);
                        TextView textView = aVar.f38591c;
                        textView.setTextColor(C23212s8.m119607o(textView.getContext(), AbstractC16781w.AppPrimaryColor));
                    } else if (!TextUtils.isEmpty(inviteContactProfile.f42436r1)) {
                        aVar.f38591c.setText(inviteContactProfile.f42436r1);
                        aVar.f38591c.setVisibility(0);
                    } else if (!TextUtils.isEmpty(inviteContactProfile.f42439s1)) {
                        aVar.f38591c.setText(inviteContactProfile.f42439s1);
                        aVar.f38591c.setVisibility(0);
                    } else if (!TextUtils.isEmpty(inviteContactProfile.f42460z1) && AbstractC23309i.m122577xf()) {
                        String m40360C = inviteContactProfile.m40360C();
                        String m40371J = inviteContactProfile.m40371J();
                        String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.prefix_username), inviteContactProfile.f42460z1);
                        if (!TextUtils.isEmpty(m40360C) && !TextUtils.isEmpty(m40371J) && !m40360C.equals(m40371J)) {
                            aVar.f38591c.setCompoundDrawablesWithIntrinsicBounds(AbstractC16803z.icn_contact_phonecontact, 0, 0, 0);
                            format = String.format("%s • %s", m40371J, format);
                        }
                        aVar.f38591c.setText(format);
                        aVar.f38591c.setVisibility(0);
                    } else if (!TextUtils.isEmpty(inviteContactProfile.f42541e2)) {
                        aVar.f38591c.setText(inviteContactProfile.f42541e2);
                        aVar.f38591c.setVisibility(0);
                    } else {
                        aVar.f38591c.setText("");
                        aVar.f38591c.setVisibility(8);
                    }
                }
                if (inviteContactProfile.m40381O0()) {
                    HashMap hashMap = this.f38586v;
                    if (hashMap != null && hashMap.containsKey(inviteContactProfile.f42434r)) {
                        str = (String) this.f38586v.get(inviteContactProfile.f42434r);
                    }
                } else {
                    str = inviteContactProfile.f42434r;
                }
                if (this.f38585u.contains(str)) {
                    aVar.f38597i.setVisibility(0);
                    aVar.f38597i.setText(AbstractC8020f0.str_invite_group_row_joined);
                    aVar.f38592d.setVisibility(8);
                } else {
                    aVar.f38597i.setVisibility(8);
                    aVar.f38592d.setVisibility(0);
                    aVar.f38592d.setChecked(this.f38584t.contains(inviteContactProfile.f42434r));
                }
                if (z11) {
                    aVar.f38589a.setImageResource(AbstractC16803z.default_avatar2);
                } else {
                    AbstractC23268y2.m120027a(aVar.f38589a, inviteContactProfile, this.f38582r);
                }
            }
        } else {
            aVar.f38596h = false;
            aVar.f38594f.setText(inviteContactProfile.f42437s);
            View view2 = aVar.f38595g;
            if (i11 == 0) {
                i12 = 8;
            }
            view2.setVisibility(i12);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        String str;
        InviteContactProfile inviteContactProfile = (InviteContactProfile) getItem(i11);
        if (inviteContactProfile != null && getItemViewType(i11) == 1) {
            if (inviteContactProfile.m40381O0()) {
                HashMap hashMap = this.f38586v;
                if (hashMap != null && hashMap.containsKey(inviteContactProfile.f42434r)) {
                    str = (String) this.f38586v.get(inviteContactProfile.f42434r);
                } else {
                    str = "";
                }
            } else {
                str = inviteContactProfile.f42434r;
            }
            return !this.f38585u.contains(str);
        }
        return false;
    }
}
