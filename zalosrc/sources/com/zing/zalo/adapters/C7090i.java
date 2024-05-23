package com.zing.zalo.adapters;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23126l;
import me0.AbstractC23268y2;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;

/* renamed from: com.zing.zalo.adapters.i */
/* loaded from: classes3.dex */
public class C7090i extends BaseAdapter {

    /* renamed from: p */
    ArrayList f38756p;

    /* renamed from: r */
    private final a f38758r;

    /* renamed from: t */
    public InterfaceC27218a f38760t;

    /* renamed from: u */
    public LayoutInflater f38761u;

    /* renamed from: v */
    private final C23528a f38762v;

    /* renamed from: q */
    private boolean f38757q = false;

    /* renamed from: s */
    private String f38759s = "";

    /* renamed from: com.zing.zalo.adapters.i$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: N */
        boolean mo36161N(String str);

        /* renamed from: n2 */
        InterfaceC27218a m36162n2();
    }

    /* renamed from: com.zing.zalo.adapters.i$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public GroupAvatarView f38763a;

        /* renamed from: b */
        public TextView f38764b;

        /* renamed from: c */
        public CheckBox f38765c;

        /* renamed from: d */
        public TextView f38766d;

        /* renamed from: e */
        public View f38767e;

        /* renamed from: f */
        public boolean f38768f = false;
    }

    public C7090i(a aVar, ArrayList arrayList, C23528a c23528a) {
        this.f38760t = aVar.m36162n2();
        this.f38762v = c23528a;
        this.f38756p = new ArrayList(arrayList);
        this.f38761u = (LayoutInflater) this.f38760t.getContext().getSystemService("layout_inflater");
        this.f38758r = aVar;
    }

    /* renamed from: a */
    public String m36157a() {
        return this.f38759s;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public void m36158b(ArrayList arrayList) {
        this.f38756p = new ArrayList(arrayList);
    }

    /* renamed from: c */
    public void m36159c(boolean z11) {
        this.f38757q = z11;
    }

    /* renamed from: d */
    public void m36160d(String str) {
        this.f38759s = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f38756p;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f38756p.get(i11);
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
                view = this.f38761u.inflate(AbstractC7409c0.add_close_friend_row, viewGroup, false);
                bVar.f38763a = (GroupAvatarView) view.findViewById(AbstractC6918a0.buddy_dp);
                bVar.f38764b = (TextView) view.findViewById(AbstractC6918a0.name);
                bVar.f38765c = (CheckBox) view.findViewById(AbstractC6918a0.pick_friend_checkbox);
            } else if (getItemViewType(i11) == 1) {
                view = this.f38761u.inflate(AbstractC7409c0.item_list_header_row_material_add_close_friend, viewGroup, false);
                bVar.f38766d = (TextView) view.findViewById(AbstractC6918a0.title_row);
                bVar.f38767e = view.findViewById(AbstractC6918a0.separate_line);
            }
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        try {
            ContactProfile contactProfile = (ContactProfile) this.f38756p.get(i11);
            if (isEnabled(i11)) {
                bVar.f38768f = true;
                if (contactProfile.f42399a1.isEmpty()) {
                    bVar.f38764b.setText(contactProfile.m40383Q(true, false));
                } else {
                    SpannableString spannableString = new SpannableString(contactProfile.m40383Q(true, false).trim());
                    while (i12 < contactProfile.f42399a1.size() - 1) {
                        try {
                            if (((Integer) contactProfile.f42399a1.get(i12)).intValue() >= 0) {
                                int i13 = i12 + 1;
                                if (((Integer) contactProfile.f42399a1.get(i13)).intValue() > ((Integer) contactProfile.f42399a1.get(i12)).intValue()) {
                                    spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i12)).intValue(), ((Integer) contactProfile.f42399a1.get(i13)).intValue(), 33);
                                }
                            }
                            i12 += 2;
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                    }
                    bVar.f38764b.setText(spannableString);
                }
                a aVar = this.f38758r;
                if (aVar != null) {
                    bVar.f38765c.setChecked(aVar.mo36161N(contactProfile.f42434r));
                }
                AbstractC23268y2.m120027a(bVar.f38763a, contactProfile, this.f38757q);
            } else {
                bVar.f38768f = false;
                bVar.f38766d.setText(contactProfile.m40383Q(true, false));
                View view2 = bVar.f38767e;
                if (contactProfile.f42407e1) {
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
        try {
            ArrayList arrayList = this.f38756p;
            if (arrayList != null && arrayList.size() > i11) {
                return ((InviteContactProfile) this.f38756p.get(i11)).m40366G0();
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }
}
