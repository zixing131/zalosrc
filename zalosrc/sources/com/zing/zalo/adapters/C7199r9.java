package com.zing.zalo.adapters;

import ac.C0708i;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import java.util.ArrayList;
import java.util.List;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23304d;

/* renamed from: com.zing.zalo.adapters.r9 */
/* loaded from: classes3.dex */
public class C7199r9 extends BaseAdapter {

    /* renamed from: p */
    List f39430p;

    /* renamed from: q */
    Context f39431q;

    /* renamed from: r */
    LayoutInflater f39432r;

    /* renamed from: s */
    c f39433s;

    /* renamed from: com.zing.zalo.adapters.r9$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public TextView f39434a;
    }

    /* renamed from: com.zing.zalo.adapters.r9$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public TrackingRelativeLayout f39435a;

        /* renamed from: b */
        public TextView f39436b;

        /* renamed from: c */
        public CompoundButton f39437c;

        /* renamed from: d */
        public View f39438d;

        /* renamed from: e */
        public View f39439e;

        /* renamed from: f */
        public f f39440f;

        /* renamed from: g */
        public View f39441g;
    }

    /* renamed from: com.zing.zalo.adapters.r9$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: b2 */
        void mo36612b2(int i11, boolean z11);

        /* renamed from: c2 */
        void mo36613c2(int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.r9$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        final int f39442a;

        public d(int i11) {
            this.f39442a = i11;
        }

        /* renamed from: a */
        public int m36614a() {
            return this.f39442a;
        }
    }

    /* renamed from: com.zing.zalo.adapters.r9$e */
    /* loaded from: classes3.dex */
    public static class e extends d {

        /* renamed from: b */
        int f39443b;

        public e(int i11) {
            super(1);
            this.f39443b = i11;
        }

        /* renamed from: b */
        public int m36615b() {
            return this.f39443b;
        }
    }

    /* renamed from: com.zing.zalo.adapters.r9$f */
    /* loaded from: classes3.dex */
    public static class f extends d {

        /* renamed from: b */
        public final int f39444b;

        /* renamed from: c */
        int f39445c;

        /* renamed from: d */
        boolean f39446d;

        /* renamed from: e */
        boolean f39447e;

        /* renamed from: f */
        public boolean f39448f;

        /* renamed from: g */
        boolean f39449g;

        /* renamed from: h */
        boolean f39450h;

        public f(int i11, int i12) {
            super(0);
            this.f39446d = true;
            this.f39447e = true;
            this.f39448f = false;
            this.f39444b = i11;
            this.f39445c = i12;
        }

        /* renamed from: b */
        public int m36616b() {
            return this.f39444b;
        }

        /* renamed from: c */
        public int m36617c() {
            return this.f39445c;
        }

        /* renamed from: d */
        public boolean m36618d() {
            return this.f39450h;
        }

        /* renamed from: e */
        public boolean m36619e() {
            return this.f39449g;
        }

        /* renamed from: f */
        public boolean m36620f() {
            return this.f39446d;
        }

        /* renamed from: g */
        public boolean m36621g() {
            return this.f39447e;
        }

        /* renamed from: h */
        public void m36622h(boolean z11) {
            this.f39447e = z11;
        }

        /* renamed from: i */
        public void m36623i(boolean z11) {
            this.f39446d = z11;
        }

        /* renamed from: j */
        public void m36624j(boolean z11, boolean z12) {
            this.f39449g = z11;
            this.f39450h = z12;
        }
    }

    public C7199r9(Context context, c cVar) {
        this.f39431q = context;
        this.f39432r = LayoutInflater.from(context);
        this.f39433s = cVar;
    }

    /* renamed from: c */
    private C0708i m36606c(int i11) {
        C0708i c0708i = new C0708i();
        c0708i.m1072c("settingId", i11);
        return c0708i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m36607f(f fVar, CompoundButton compoundButton, boolean z11) {
        c cVar = this.f39433s;
        if (cVar != null) {
            cVar.mo36612b2(fVar.m36616b(), z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m36608g(f fVar, View view) {
        c cVar = this.f39433s;
        if (cVar != null) {
            cVar.mo36613c2(fVar.m36616b(), fVar.m36621g());
        }
    }

    /* renamed from: d */
    public d m36609d(int i11) {
        List list = this.f39430p;
        if (list == null) {
            return null;
        }
        return (d) list.get(i11);
    }

    /* renamed from: e */
    public int m36610e(int i11) {
        if (this.f39430p == null) {
            return -1;
        }
        for (int i12 = 0; i12 < this.f39430p.size(); i12++) {
            d dVar = (d) this.f39430p.get(i12);
            if ((dVar instanceof f) && ((f) dVar).m36616b() == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.f39430p;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f39430p.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        d dVar;
        try {
            List list = this.f39430p;
            if (list == null || (dVar = (d) list.get(i11)) == null) {
                return -1;
            }
            return dVar.m36614a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        b bVar;
        int i12;
        d m36609d = m36609d(i11);
        boolean z11 = true;
        int i13 = 8;
        if (m36609d.m36614a() == 0) {
            if (view == null) {
                view = this.f39432r.inflate(AbstractC7409c0.chat_info_setting_item, (ViewGroup) null);
                bVar = new b();
                bVar.f39435a = (TrackingRelativeLayout) view.findViewById(AbstractC6918a0.chat_info_setting_item_row);
                bVar.f39436b = (TextView) view.findViewById(AbstractC6918a0.setting_text_primary);
                bVar.f39437c = (CompoundButton) view.findViewById(AbstractC6918a0.setting_switch);
                bVar.f39438d = view.findViewById(AbstractC6918a0.setting_bottom_divider);
                bVar.f39439e = view.findViewById(AbstractC6918a0.setting_ic_next);
                bVar.f39441g = view.findViewById(AbstractC6918a0.numnotification);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            final f fVar = (f) m36609d;
            bVar.f39440f = fVar;
            bVar.f39439e.setVisibility(8);
            bVar.f39436b.setText(fVar.m36617c());
            if (fVar.m36616b() == 7) {
                TextView textView = bVar.f39436b;
                textView.setTextColor(C23212s8.m119607o(textView.getContext(), AbstractC7354t0.NotificationColor1));
            } else {
                TextView textView2 = bVar.f39436b;
                textView2.setTextColor(C23212s8.m119607o(textView2.getContext(), AbstractC21196a.TextColor1));
            }
            bVar.f39437c.setOnCheckedChangeListener(null);
            if (fVar.m36619e()) {
                bVar.f39437c.setVisibility(0);
                bVar.f39437c.setChecked(fVar.m36618d());
                if (!fVar.m36621g()) {
                    bVar.f39437c.setEnabled(false);
                } else {
                    bVar.f39437c.setEnabled(true);
                    bVar.f39437c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.adapters.p9
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                            C7199r9.this.m36607f(fVar, compoundButton, z12);
                        }
                    });
                }
            } else {
                bVar.f39437c.setVisibility(8);
            }
            View view2 = bVar.f39441g;
            if (fVar.f39448f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            view2.setVisibility(i12);
            View view3 = bVar.f39438d;
            if (fVar.m36620f()) {
                i13 = 0;
            }
            view3.setVisibility(i13);
            if (bVar.f39435a != null) {
                C0708i m36606c = m36606c(fVar.m36616b());
                if (fVar.m36616b() == 38) {
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    if (contactProfile == null || !contactProfile.m40357A0()) {
                        z11 = false;
                    }
                    m36606c.m1076g("isBusinessAccount", z11);
                }
                bVar.f39435a.setIdTracking("profile_menu_setting");
                bVar.f39435a.setTrackingExtraData(m36606c);
                bVar.f39435a.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.q9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        C7199r9.this.m36608g(fVar, view4);
                    }
                });
                return view;
            }
            return view;
        }
        if (m36609d.m36614a() == 1) {
            if (view == null) {
                view = this.f39432r.inflate(AbstractC7409c0.chat_info_setting_header, (ViewGroup) null);
                aVar = new a();
                aVar.f39434a = (TextView) view.findViewById(AbstractC6918a0.setting_header_label);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            String string = this.f39431q.getString(((e) m36609d).m36615b());
            if (!TextUtils.isEmpty(string)) {
                aVar.f39434a.setVisibility(0);
                aVar.f39434a.setText(string);
                return view;
            }
            aVar.f39434a.setVisibility(8);
            return view;
        }
        if (m36609d.m36614a() == 2 && view == null) {
            return this.f39432r.inflate(AbstractC7409c0.chat_info_setting_divider_section, (ViewGroup) null);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    /* renamed from: h */
    public void m36611h(List list) {
        if (list != null) {
            this.f39430p = new ArrayList(list);
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        try {
            d m36609d = m36609d(i11);
            if (m36609d != null) {
                if (m36609d.m36614a() == 1) {
                    return false;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.isEnabled(i11);
    }
}
