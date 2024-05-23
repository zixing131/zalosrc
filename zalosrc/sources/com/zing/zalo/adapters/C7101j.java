package com.zing.zalo.adapters;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import au.C2343e;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23028c0;
import me0.AbstractC23126l;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: com.zing.zalo.adapters.j */
/* loaded from: classes3.dex */
public class C7101j extends BaseAdapter {

    /* renamed from: q */
    ArrayList f38808q;

    /* renamed from: t */
    public Context f38811t;

    /* renamed from: u */
    private final a f38812u;

    /* renamed from: v */
    public LayoutInflater f38813v;

    /* renamed from: p */
    private final String f38807p = getClass().getSimpleName();

    /* renamed from: r */
    private boolean f38809r = false;

    /* renamed from: s */
    private String f38810s = "";

    /* renamed from: com.zing.zalo.adapters.j$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: N */
        boolean mo36191N(String str);

        Context getContext();
    }

    /* renamed from: com.zing.zalo.adapters.j$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public ImageView f38814a;

        /* renamed from: b */
        public TextView f38815b;

        /* renamed from: c */
        public TextView f38816c;

        /* renamed from: d */
        public CheckBox f38817d;

        /* renamed from: e */
        public View f38818e;

        /* renamed from: f */
        public TextView f38819f;

        /* renamed from: g */
        public View f38820g;

        /* renamed from: h */
        public boolean f38821h = false;
    }

    public C7101j(a aVar, ArrayList arrayList) {
        this.f38811t = aVar.getContext();
        this.f38808q = new ArrayList(arrayList);
        this.f38813v = (LayoutInflater) this.f38811t.getSystemService("layout_inflater");
        this.f38812u = aVar;
    }

    /* renamed from: a */
    public String m36186a() {
        return this.f38810s;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public boolean m36187b(String str) {
        return this.f38810s.equals(str);
    }

    /* renamed from: c */
    public void m36188c(ArrayList arrayList) {
        this.f38808q = new ArrayList(arrayList);
    }

    /* renamed from: d */
    public void m36189d(String str) {
        this.f38810s = str;
    }

    /* renamed from: e */
    public void m36190e(boolean z11) {
        this.f38809r = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f38808q;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f38808q.get(i11);
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
        View view2;
        b bVar;
        int i12 = 0;
        if (view == null) {
            bVar = new b();
            if (getItemViewType(i11) == 0) {
                view2 = this.f38813v.inflate(AbstractC7409c0.sms_invite_row, viewGroup, false);
                bVar.f38814a = (ImageView) view2.findViewById(AbstractC6918a0.buddy_dp);
                bVar.f38815b = (TextView) view2.findViewById(AbstractC6918a0.name);
                bVar.f38816c = (TextView) view2.findViewById(AbstractC6918a0.phone);
                bVar.f38817d = (CheckBox) view2.findViewById(AbstractC6918a0.pick_friend_checkbox);
                bVar.f38818e = view2.findViewById(AbstractC6918a0.separate_line);
            } else {
                view2 = this.f38813v.inflate(AbstractC7409c0.item_list_header_row_material, viewGroup, false);
                bVar.f38819f = (TextView) view2.findViewById(AbstractC6918a0.title_row);
                bVar.f38820g = view2.findViewById(AbstractC6918a0.separate_line);
            }
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        try {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f38808q.get(i11);
            if (isEnabled(i11)) {
                bVar.f38821h = true;
                if (m36187b(inviteContactProfile.f42455y)) {
                    view2.setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                } else {
                    view2.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                }
                TextView textView = bVar.f38815b;
                textView.setTextColor(C23212s8.m119607o(textView.getContext(), AbstractC21196a.TextColor1));
                if (inviteContactProfile.f42399a1.isEmpty()) {
                    bVar.f38815b.setText(inviteContactProfile.m40383Q(true, false));
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
                    bVar.f38815b.setText(spannableString);
                }
                bVar.f38814a.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(inviteContactProfile.m40383Q(true, false)), C2343e.m12307a(inviteContactProfile.f42455y, true)));
                a aVar = this.f38812u;
                if (aVar != null) {
                    bVar.f38817d.setChecked(aVar.mo36191N(inviteContactProfile.f42455y));
                }
                if (inviteContactProfile.f42455y.length() > 0) {
                    bVar.f38816c.setText(inviteContactProfile.f42455y);
                    bVar.f38816c.setVisibility(0);
                } else {
                    bVar.f38816c.setVisibility(8);
                }
            } else {
                bVar.f38821h = false;
                bVar.f38819f.setText(inviteContactProfile.m40383Q(true, false));
                View view3 = bVar.f38820g;
                if (inviteContactProfile.f42407e1) {
                    i12 = 8;
                }
                view3.setVisibility(i12);
            }
        } catch (Exception e12) {
            AbstractC23126l.m118629c(this.f38807p + e12.toString());
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        try {
            ArrayList arrayList = this.f38808q;
            if (arrayList != null && arrayList.size() > i11) {
                return ((InviteContactProfile) this.f38808q.get(i11)).m40366G0();
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }
}
