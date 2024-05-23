package com.zing.zalo.adapters;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import cd0.C3430i;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import l30.AbstractC22055v0;
import l30.C22013a0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p266jg.AbstractC21244b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23999j;
import p461qu.AbstractC25495a;
import p716zh.C31980jc;
import vg.C28203u6;

/* renamed from: com.zing.zalo.adapters.m4 */
/* loaded from: classes3.dex */
public class C7139m4 extends BaseAdapter {

    /* renamed from: p */
    ArrayList f39028p;

    /* renamed from: q */
    boolean f39029q = false;

    /* renamed from: r */
    Context f39030r;

    /* renamed from: s */
    LayoutInflater f39031s;

    /* renamed from: t */
    C23528a f39032t;

    /* renamed from: u */
    AbstractC22055v0.l f39033u;

    /* renamed from: v */
    a f39034v;

    /* renamed from: com.zing.zalo.adapters.m4$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo36346a(ContactProfile contactProfile);
    }

    /* renamed from: com.zing.zalo.adapters.m4$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public GroupAvatarView f39035a;

        /* renamed from: b */
        public TextView f39036b;

        /* renamed from: c */
        public ImageView f39037c;

        /* renamed from: d */
        public View f39038d;

        /* renamed from: e */
        public TextView f39039e;

        /* renamed from: f */
        public View f39040f;

        /* renamed from: g */
        public boolean f39041g = false;

        /* renamed from: h */
        public C3430i f39042h;

        /* renamed from: i */
        public View f39043i;
    }

    public C7139m4(Context context, ArrayList arrayList, ListView listView, C23528a c23528a) {
        this.f39030r = context;
        this.f39032t = c23528a;
        this.f39028p = new ArrayList(arrayList);
        this.f39031s = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m36338e(ContactProfile contactProfile, View view) {
        a aVar = this.f39034v;
        if (aVar != null) {
            aVar.mo36346a(contactProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m36339f(C31980jc c31980jc, b bVar, View view) {
        AbstractC22055v0.l lVar = this.f39033u;
        if (lVar != null) {
            lVar.mo47172c(c31980jc, bVar.f39042h, 333);
            AbstractC23647d.m123906p("4915410");
            AbstractC23647d.m123893c();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: c */
    public ArrayList m36340c() {
        return this.f39028p;
    }

    /* renamed from: d */
    public boolean m36341d(int i11) {
        try {
            return ((ContactProfile) getItem(i11)).f42403c1;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public void m36342g(a aVar) {
        this.f39034v = aVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f39028p;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f39028p.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        if (isEnabled(i11)) {
            if (m36341d(i11)) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        final b bVar;
        int i12;
        ViewStub viewStub;
        int i13;
        String str;
        String m141808b;
        boolean z11 = true;
        if (view == null) {
            bVar = new b();
            if (getItemViewType(i11) != 0 && getItemViewType(i11) != 1) {
                if (getItemViewType(i11) == 2) {
                    view = this.f39031s.inflate(AbstractC7409c0.item_list_header_row_material, viewGroup, false);
                    bVar.f39039e = (TextView) view.findViewById(AbstractC6918a0.title_row);
                    bVar.f39040f = view.findViewById(AbstractC6918a0.separate_line);
                }
            } else {
                view = this.f39031s.inflate(AbstractC7409c0.vip_follow_item_row, (ViewGroup) null);
                GroupAvatarView groupAvatarView = (GroupAvatarView) view.findViewById(AbstractC6918a0.buddy_dp);
                bVar.f39035a = groupAvatarView;
                groupAvatarView.setStrokeDisableColor(AbstractC22055v0.m115162v(groupAvatarView.getContext()));
                bVar.f39036b = (TextView) view.findViewById(AbstractC6918a0.name);
                bVar.f39037c = (ImageView) view.findViewById(AbstractC6918a0.ic_isFollow);
                bVar.f39038d = view.findViewById(AbstractC6918a0.separate_line);
                bVar.f39043i = view.findViewById(AbstractC6918a0.ic_VipStatus);
            }
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        try {
            final ContactProfile contactProfile = (ContactProfile) getItem(i11);
            if (isEnabled(i11)) {
                if (!m36341d(i11)) {
                    view.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                } else {
                    view.setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                }
                bVar.f39041g = true;
                if (contactProfile.f42399a1.isEmpty()) {
                    bVar.f39036b.setText(contactProfile.f42437s);
                } else {
                    SpannableString spannableString = new SpannableString(contactProfile.f42437s.trim());
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
                    bVar.f39036b.setText(spannableString);
                }
                AbstractC23136l9.m118741q1(contactProfile, bVar.f39037c);
                GroupAvatarView groupAvatarView2 = bVar.f39035a;
                groupAvatarView2.setImageDrawable(C23212s8.m119609q(groupAvatarView2.getContext(), AbstractC16781w.default_avatar));
                C28203u6 c28203u6 = C28203u6.f131407a;
                ContactProfile m141811g = c28203u6.m141811g(contactProfile.f42434r);
                if (m141811g == null || !m141811g.m40359B0()) {
                    z11 = false;
                }
                View view2 = bVar.f39043i;
                try {
                    if (!z11 && !AbstractC25495a.m132078c(contactProfile.f42434r) && !AbstractC25495a.m132086k(contactProfile.f42434r)) {
                        i13 = 8;
                        view2.setVisibility(i13);
                        bVar.f39035a.setStateLoadingStory(AbstractC22055v0.m115112B(contactProfile.f42434r));
                        bVar.f39035a.m75736i(AbstractC22055v0.m115116F(contactProfile.f42434r, AbstractC21244b.m110054d(this.f39030r)), AbstractC22055v0.m115115E(contactProfile.f42434r, AbstractC21244b.m110054d(this.f39030r)));
                        bVar.f39035a.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.k4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                C7139m4.this.m36338e(contactProfile, view3);
                            }
                        });
                        str = contactProfile.f42446v;
                        if (str == null && !str.equals("")) {
                            if (this.f39029q) {
                                if (C23999j.m125696L2(contactProfile.f42446v, C23278z2.m120143n())) {
                                }
                            }
                            bVar.f39035a.m75732d(contactProfile.f42446v);
                        } else {
                            m141808b = c28203u6.m141808b(contactProfile.f42434r);
                            if (!m141808b.equals("") && (!this.f39029q || C23999j.m125696L2(m141808b, C23278z2.m120143n()))) {
                                bVar.f39035a.m75732d(m141808b);
                            }
                        }
                    }
                    bVar.f39035a.setStateLoadingStory(AbstractC22055v0.m115112B(contactProfile.f42434r));
                    bVar.f39035a.m75736i(AbstractC22055v0.m115116F(contactProfile.f42434r, AbstractC21244b.m110054d(this.f39030r)), AbstractC22055v0.m115115E(contactProfile.f42434r, AbstractC21244b.m110054d(this.f39030r)));
                    bVar.f39035a.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.k4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            C7139m4.this.m36338e(contactProfile, view3);
                        }
                    });
                    str = contactProfile.f42446v;
                    if (str == null) {
                    }
                    m141808b = c28203u6.m141808b(contactProfile.f42434r);
                    if (!m141808b.equals("")) {
                        bVar.f39035a.m75732d(m141808b);
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                i13 = 0;
                view2.setVisibility(i13);
            } else {
                bVar.f39041g = false;
                bVar.f39039e.setText(contactProfile.f42437s);
                View view3 = bVar.f39040f;
                if (contactProfile.f42407e1) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                view3.setVisibility(i12);
            }
            C3430i c3430i = bVar.f39042h;
            if (c3430i != null) {
                c3430i.f14376p.setVisibility(8);
            }
            if (C22013a0.m114928g() && C22013a0.m114924c().m114932h(3)) {
                final C31980jc m115161u = AbstractC22055v0.m115161u(contactProfile.f42434r);
                if (AbstractC22055v0.m115113C(m115161u)) {
                    if (bVar.f39042h == null && (viewStub = (ViewStub) view.findViewById(AbstractC6918a0.stub_story_populate)) != null) {
                        C3430i m17229k = C3430i.m17229k(viewStub.inflate());
                        bVar.f39042h = m17229k;
                        m17229k.m17193f(2);
                    }
                    C3430i c3430i2 = bVar.f39042h;
                    if (c3430i2 != null) {
                        c3430i2.f14376p.setVisibility(0);
                        bVar.f39042h.mo17230p(m115161u, this.f39032t);
                        bVar.f39042h.f14376p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.l4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                C7139m4.this.m36339f(m115161u, bVar, view4);
                            }
                        });
                    }
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    /* renamed from: h */
    public void m36343h(ArrayList arrayList) {
        this.f39028p = new ArrayList(arrayList);
    }

    /* renamed from: i */
    public void m36344i(boolean z11) {
        this.f39029q = z11;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        try {
            ArrayList arrayList = this.f39028p;
            if (arrayList != null && arrayList.size() > i11) {
                return ((ContactProfile) this.f39028p.get(i11)).m40366G0();
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: j */
    public void m36345j(AbstractC22055v0.l lVar) {
        this.f39033u = lVar;
    }
}
