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
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import me0.AbstractC23126l;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.l5 */
/* loaded from: classes3.dex */
public class C7129l5 extends BaseAdapter {

    /* renamed from: p */
    private ArrayList f38964p;

    /* renamed from: r */
    public HashMap f38966r;

    /* renamed from: t */
    public Context f38968t;

    /* renamed from: u */
    public LayoutInflater f38969u;

    /* renamed from: v */
    private final C23528a f38970v;

    /* renamed from: x */
    private int f38972x;

    /* renamed from: q */
    private boolean f38965q = false;

    /* renamed from: s */
    private final boolean f38967s = false;

    /* renamed from: w */
    private String f38971w = "";

    /* renamed from: y */
    private int f38973y = -1;

    /* renamed from: z */
    public boolean f38974z = false;

    /* renamed from: com.zing.zalo.adapters.l5$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public GroupAvatarView f38975a;

        /* renamed from: b */
        public TextView f38976b;

        /* renamed from: c */
        public TextView f38977c;

        /* renamed from: d */
        public CheckBox f38978d;

        /* renamed from: e */
        public View f38979e;

        /* renamed from: f */
        public TextView f38980f;

        /* renamed from: g */
        public View f38981g;

        /* renamed from: h */
        public boolean f38982h = false;
    }

    public C7129l5(Context context, ArrayList arrayList, LinkedHashMap linkedHashMap, C23528a c23528a, int i11) {
        int i12 = 0;
        this.f38966r = new HashMap();
        this.f38972x = -1;
        this.f38968t = context;
        this.f38970v = c23528a;
        this.f38964p = new ArrayList(arrayList);
        while (true) {
            if (i12 >= arrayList.size()) {
                break;
            }
            if (((InviteContactProfile) this.f38964p.get(i12)).m40372J0()) {
                this.f38964p.remove(i12);
                break;
            }
            i12++;
        }
        this.f38966r = linkedHashMap;
        this.f38969u = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f38972x = i11;
    }

    /* renamed from: a */
    public String m36302a() {
        return this.f38971w;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public boolean m36303b() {
        return false;
    }

    /* renamed from: c */
    public boolean m36304c(String str) {
        return this.f38971w.equals(str);
    }

    /* renamed from: d */
    public void m36305d(ArrayList arrayList) {
        try {
            this.f38964p = new ArrayList(arrayList);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((InviteContactProfile) this.f38964p.get(i11)).m40372J0()) {
                    this.f38964p.remove(i11);
                    return;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m36306e(boolean z11) {
        this.f38965q = z11;
    }

    /* renamed from: f */
    public void m36307f(String str) {
        this.f38971w = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f38964p;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        ArrayList arrayList = this.f38964p;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return this.f38964p.get(i11);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        return !isEnabled(i11) ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        int m119607o;
        int i12 = 0;
        if (view == null) {
            aVar = new a();
            if (getItemViewType(i11) == 0) {
                view = this.f38969u.inflate(AbstractC7409c0.add_close_friend_row, viewGroup, false);
                aVar.f38975a = (GroupAvatarView) view.findViewById(AbstractC6918a0.buddy_dp);
                aVar.f38976b = (TextView) view.findViewById(AbstractC6918a0.name);
                aVar.f38977c = (TextView) view.findViewById(AbstractC6918a0.description);
                aVar.f38978d = (CheckBox) view.findViewById(AbstractC6918a0.pick_friend_checkbox);
                aVar.f38979e = view.findViewById(AbstractC6918a0.separate_line);
            } else if (getItemViewType(i11) == 1) {
                view = this.f38969u.inflate(AbstractC7409c0.item_list_header_row_material_add_close_friend, viewGroup, false);
                aVar.f38980f = (TextView) view.findViewById(AbstractC6918a0.title_row);
                aVar.f38981g = view.findViewById(AbstractC6918a0.separate_line);
            }
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        try {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f38964p.get(i11);
            if (isEnabled(i11)) {
                aVar.f38982h = true;
                if (m36304c(inviteContactProfile.f42434r)) {
                    view.setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                } else {
                    view.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                }
                if (this.f38966r.containsKey(inviteContactProfile.f42434r)) {
                    TextView textView = aVar.f38976b;
                    if (this.f38972x != -1) {
                        m119607o = this.f38968t.getResources().getColor(this.f38972x);
                    } else {
                        m119607o = C23212s8.m119607o(this.f38968t, AbstractC16781w.ChatTextColor1);
                    }
                    textView.setTextColor(m119607o);
                } else {
                    aVar.f38976b.setTextColor(C23212s8.m119607o(this.f38968t, AbstractC16781w.ChatTextColor1));
                }
                if (inviteContactProfile.f42399a1.isEmpty()) {
                    aVar.f38976b.setText(inviteContactProfile.m40383Q(true, false));
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
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                    }
                    aVar.f38976b.setText(spannableString);
                }
                if (this.f38974z && !TextUtils.isEmpty(inviteContactProfile.f42539c2)) {
                    aVar.f38977c.setVisibility(0);
                    aVar.f38977c.setText(inviteContactProfile.f42539c2);
                } else {
                    aVar.f38977c.setVisibility(8);
                }
                if (aVar.f38975a.getViewType() > 1) {
                    aVar.f38975a.setImageOption(C23278z2.m120143n());
                } else {
                    aVar.f38975a.setImageOption(C23278z2.m120141m0());
                }
                aVar.f38975a.setScrollingMode(this.f38965q);
                aVar.f38978d.setChecked(this.f38966r.containsKey(inviteContactProfile.f42434r));
                int i15 = this.f38973y;
                if (i15 != -1) {
                    aVar.f38978d.setButtonDrawable(i15);
                }
                AbstractC23268y2.m120027a(aVar.f38975a, inviteContactProfile, this.f38965q);
            } else {
                aVar.f38982h = false;
                aVar.f38980f.setText(inviteContactProfile.f42437s);
                View view2 = aVar.f38981g;
                if (inviteContactProfile.f42407e1) {
                    i12 = 8;
                }
                view2.setVisibility(i12);
            }
        } catch (Exception e12) {
            AbstractC23126l.m118629c("ZaloListAdapter getView: " + e12.toString());
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        ContactProfile contactProfile;
        try {
            ArrayList arrayList = this.f38964p;
            if (arrayList == null || arrayList.size() <= i11 || (contactProfile = (ContactProfile) this.f38964p.get(i11)) == null) {
                return false;
            }
            if (!contactProfile.m40366G0()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return false;
    }
}
