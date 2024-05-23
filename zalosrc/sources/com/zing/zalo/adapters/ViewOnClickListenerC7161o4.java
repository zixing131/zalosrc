package com.zing.zalo.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.C2343e;
import ck.C3565f;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p056cj.C3544l;
import p142ey.C18644n;
import p304ks.C21927m;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23999j;
import p379o3.C24003n;

/* renamed from: com.zing.zalo.adapters.o4 */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC7161o4 extends BaseAdapter implements View.OnClickListener {

    /* renamed from: p */
    private final Context f39194p;

    /* renamed from: q */
    private final C23528a f39195q;

    /* renamed from: r */
    private final LayoutInflater f39196r;

    /* renamed from: s */
    private List f39197s;

    /* renamed from: t */
    private boolean f39198t;

    /* renamed from: u */
    private b f39199u;

    /* renamed from: v */
    private f f39200v;

    /* renamed from: com.zing.zalo.adapters.o4$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        public TextView f39201a;

        /* renamed from: b */
        public View f39202b;

        private a() {
        }
    }

    /* renamed from: com.zing.zalo.adapters.o4$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: n */
        void mo36435n(int i11);
    }

    /* renamed from: com.zing.zalo.adapters.o4$c */
    /* loaded from: classes3.dex */
    private static class c {

        /* renamed from: a */
        public AvatarImageView f39203a;

        /* renamed from: b */
        public LinearLayout f39204b;

        /* renamed from: c */
        public TextView f39205c;

        /* renamed from: d */
        public TextView f39206d;

        /* renamed from: e */
        public TextView f39207e;

        /* renamed from: f */
        public RecyclingImageView f39208f;

        private c() {
        }
    }

    /* renamed from: com.zing.zalo.adapters.o4$d */
    /* loaded from: classes3.dex */
    private static class d {

        /* renamed from: a */
        public AvatarImageView f39209a;

        /* renamed from: b */
        public TextView f39210b;

        /* renamed from: c */
        public TextView f39211c;

        /* renamed from: d */
        public TextView f39212d;

        private d() {
        }
    }

    /* renamed from: com.zing.zalo.adapters.o4$e */
    /* loaded from: classes3.dex */
    private static class e {

        /* renamed from: a */
        public AvatarImageView f39213a;

        /* renamed from: b */
        public TextView f39214b;

        /* renamed from: c */
        public TextView f39215c;

        /* renamed from: d */
        public TextView f39216d;

        /* renamed from: e */
        public TextView f39217e;

        private e() {
        }
    }

    /* renamed from: com.zing.zalo.adapters.o4$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: pr */
        void mo36436pr(ContactProfile contactProfile, int i11);
    }

    /* renamed from: com.zing.zalo.adapters.o4$g */
    /* loaded from: classes3.dex */
    private static class g {

        /* renamed from: a */
        public AvatarImageView f39218a;

        /* renamed from: b */
        public TextView f39219b;

        /* renamed from: c */
        public TextView f39220c;

        /* renamed from: d */
        public TextView f39221d;

        /* renamed from: e */
        public TextView f39222e;

        private g() {
        }
    }

    public ViewOnClickListenerC7161o4(Context context, C23528a c23528a, List list) {
        this.f39194p = context;
        this.f39196r = LayoutInflater.from(context);
        this.f39195q = c23528a;
        this.f39197s = list;
    }

    /* renamed from: a */
    public void m36431a(List list) {
        if (list == null) {
            this.f39197s = new ArrayList();
        } else {
            this.f39197s = new ArrayList(list);
        }
    }

    /* renamed from: b */
    public void m36432b(b bVar) {
        this.f39199u = bVar;
    }

    /* renamed from: c */
    public void m36433c(f fVar) {
        this.f39200v = fVar;
    }

    /* renamed from: d */
    public void m36434d(boolean z11) {
        this.f39198t = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.f39197s;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f39197s.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        C3544l c3544l = (C3544l) this.f39197s.get(i11);
        if (c3544l.m18014d() == 0) {
            if (c3544l.m18011a() == null || !c3544l.m18011a().m40387S0()) {
                return 1;
            }
            return 2;
        }
        if (c3544l.m18014d() == 1) {
            return 3;
        }
        if (c3544l.m18014d() == 2) {
            if (!c3544l.m18012b().m18121j()) {
                return 4;
            }
            return 7;
        }
        if (c3544l.m18014d() == 3) {
            return 5;
        }
        if (c3544l.m18014d() == 4) {
            return 6;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        d dVar;
        c cVar;
        g gVar;
        e eVar;
        Resources resources;
        int i12;
        try {
            int itemViewType = getItemViewType(i11);
            int i13 = 8;
            byte b11 = 0;
            byte b12 = 0;
            byte b13 = 0;
            byte b14 = 0;
            if (itemViewType == 1) {
                if (view == null) {
                    view = this.f39196r.inflate(AbstractC7409c0.user_nearby_row, viewGroup, false);
                    eVar = new e();
                    eVar.f39213a = (AvatarImageView) view.findViewById(AbstractC6918a0.img_avatar);
                    eVar.f39214b = (TextView) view.findViewById(AbstractC6918a0.tv_name);
                    eVar.f39215c = (TextView) view.findViewById(AbstractC6918a0.tv_age);
                    eVar.f39216d = (TextView) view.findViewById(AbstractC6918a0.tv_distance);
                    eVar.f39217e = (TextView) view.findViewById(AbstractC6918a0.tv_status);
                    view.setTag(eVar);
                    view.setOnClickListener(this);
                } else {
                    eVar = (e) view.getTag();
                }
                view.setTag(AbstractC6918a0.position, Integer.valueOf(i11));
                C3544l c3544l = (C3544l) this.f39197s.get(i11);
                if (c3544l.m18014d() == 0) {
                    ContactProfile m18011a = c3544l.m18011a();
                    C24003n m120143n = C18644n.m98531l().m98558u(m18011a.f42434r) ? C23278z2.m120143n() : C23278z2.m120156u();
                    AvatarImageView avatarImageView = eVar.f39213a;
                    avatarImageView.setImageDrawable(C23212s8.m119609q(avatarImageView.getContext(), AbstractC16781w.default_avatar));
                    if (!TextUtils.isEmpty(m18011a.f42446v)) {
                        if (C23302b.f113247a.m120523d(m18011a.f42446v) && !CoreUtility.f89233i.equals(m18011a.f42434r)) {
                            eVar.f39213a.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m18011a.m40383Q(true, false)), C2343e.m12307a(m18011a.f42434r, false)));
                        } else if (!this.f39198t || C23999j.m125696L2(m18011a.f42446v, m120143n)) {
                            ((C23528a) this.f39195q.m123612r(eVar.f39213a)).m123618x(m18011a.f42446v, m120143n);
                        }
                    }
                    if (m18011a.m40358B().length() > 0 && !m18011a.m40358B().equalsIgnoreCase("null")) {
                        eVar.f39216d.setVisibility(0);
                        eVar.f39216d.setText(m18011a.m40358B());
                    } else {
                        eVar.f39216d.setVisibility(8);
                    }
                    eVar.f39215c.setVisibility(0);
                    if (m18011a.m40387S0()) {
                        Drawable drawable = this.f39194p.getResources().getDrawable(AbstractC16803z.ic_lbspage);
                        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                        eVar.f39215c.setCompoundDrawables(drawable, null, null, null);
                        eVar.f39215c.setText("");
                    } else {
                        if (m18011a.f42449w == 1) {
                            resources = this.f39194p.getResources();
                            i12 = AbstractC16803z.ic_nu;
                        } else {
                            resources = this.f39194p.getResources();
                            i12 = AbstractC16803z.ic_nam;
                        }
                        Drawable drawable2 = resources.getDrawable(i12);
                        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
                        eVar.f39215c.setCompoundDrawables(drawable2, null, null, null);
                        TextView textView = eVar.f39215c;
                        int i14 = m18011a.f42398a0;
                        textView.setText((i14 <= 0 || i14 >= 100) ? "" : String.valueOf(i14));
                    }
                    eVar.f39214b.setText(m18011a.m40383Q(true, false));
                    AbstractC23136l9.m118711g1(this.f39194p, m18011a, eVar.f39214b);
                    String str = m18011a.f42458z;
                    if (str != null && !str.equals("")) {
                        eVar.f39217e.setVisibility(0);
                        eVar.f39217e.setText(m18011a.f42458z);
                    } else {
                        eVar.f39217e.setVisibility(8);
                    }
                }
            } else if (itemViewType == 2) {
                if (view == null) {
                    view = this.f39196r.inflate(AbstractC7409c0.user_oa_nearby_row, viewGroup, false);
                    gVar = new g();
                    gVar.f39218a = (AvatarImageView) view.findViewById(AbstractC6918a0.img_avatar);
                    gVar.f39219b = (TextView) view.findViewById(AbstractC6918a0.tv_name);
                    gVar.f39220c = (TextView) view.findViewById(AbstractC6918a0.tv_status);
                    gVar.f39221d = (TextView) view.findViewById(AbstractC6918a0.tv_tag);
                    TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.btn_follow);
                    gVar.f39222e = textView2;
                    textView2.setOnClickListener(this);
                    view.setTag(gVar);
                    view.setOnClickListener(this);
                } else {
                    gVar = (g) view.getTag();
                }
                view.setTag(AbstractC6918a0.position, Integer.valueOf(i11));
                gVar.f39222e.setTag(AbstractC6918a0.position, Integer.valueOf(i11));
                C3544l c3544l2 = (C3544l) this.f39197s.get(i11);
                if (c3544l2.m18014d() == 0) {
                    ContactProfile m18011a2 = c3544l2.m18011a();
                    C24003n m120143n2 = C18644n.m98531l().m98558u(m18011a2.f42434r) ? C23278z2.m120143n() : C23278z2.m120156u();
                    AvatarImageView avatarImageView2 = gVar.f39218a;
                    avatarImageView2.setImageDrawable(C23212s8.m119609q(avatarImageView2.getContext(), AbstractC16781w.default_avatar));
                    if (!TextUtils.isEmpty(m18011a2.f42446v)) {
                        if (C23302b.f113247a.m120523d(m18011a2.f42446v) && !CoreUtility.f89233i.equals(m18011a2.f42434r)) {
                            gVar.f39218a.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m18011a2.m40383Q(true, false)), C2343e.m12307a(m18011a2.f42434r, false)));
                        } else if (!this.f39198t || C23999j.m125696L2(m18011a2.f42446v, m120143n2)) {
                            ((C23528a) this.f39195q.m123612r(gVar.f39218a)).m123618x(m18011a2.f42446v, m120143n2);
                        }
                    }
                    gVar.f39219b.setText(m18011a2.m40383Q(true, false));
                    AbstractC23136l9.m118711g1(this.f39194p, m18011a2, gVar.f39219b);
                    String str2 = m18011a2.f42458z;
                    if (str2 != null && !str2.equals("")) {
                        gVar.f39220c.setVisibility(0);
                        gVar.f39220c.setText(m18011a2.f42458z);
                    } else {
                        gVar.f39220c.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(m18011a2.f42346I0)) {
                        gVar.f39221d.setText(m18011a2.f42346I0);
                        gVar.f39221d.setVisibility(0);
                    } else {
                        gVar.f39221d.setVisibility(8);
                    }
                    TextView textView3 = gVar.f39222e;
                    if (m18011a2.f42349J0 && !C21927m.m114302u().m114318P(m18011a2.f42434r)) {
                        i13 = 0;
                    }
                    textView3.setVisibility(i13);
                }
            } else if (itemViewType == 3) {
                if (view == null) {
                    view = this.f39196r.inflate(AbstractC7409c0.nearby_action_row, viewGroup, false);
                }
                view.setOnClickListener(this);
                view.setTag(AbstractC6918a0.position, Integer.valueOf(i11));
            } else if (itemViewType == 7) {
                if (view == null) {
                    cVar = new c();
                    view = this.f39196r.inflate(AbstractC7409c0.oa_place_nearby_row, viewGroup, false);
                    cVar.f39203a = (AvatarImageView) view.findViewById(AbstractC6918a0.img_avatar);
                    cVar.f39204b = (LinearLayout) view.findViewById(AbstractC6918a0.ln_status);
                    cVar.f39205c = (TextView) view.findViewById(AbstractC6918a0.tv_name);
                    cVar.f39206d = (TextView) view.findViewById(AbstractC6918a0.tv_distance);
                    cVar.f39207e = (TextView) view.findViewById(AbstractC6918a0.tv_status);
                    cVar.f39208f = (RecyclingImageView) view.findViewById(AbstractC6918a0.img_icon_status);
                    view.setTag(cVar);
                    view.setOnClickListener(this);
                } else {
                    cVar = (c) view.getTag();
                }
                view.setTag(AbstractC6918a0.position, Integer.valueOf(i11));
                C3544l c3544l3 = (C3544l) this.f39197s.get(i11);
                if (c3544l3.m18014d() == 2) {
                    C3565f m18012b = c3544l3.m18012b();
                    if (!this.f39198t || C23999j.m125696L2(m18012b.m18113b(), C23278z2.m120143n())) {
                        ((C23528a) this.f39195q.m123612r(cVar.f39203a)).m123618x(m18012b.m18113b(), C23278z2.m120143n());
                    }
                    cVar.f39205c.setText(m18012b.m18114c());
                    cVar.f39206d.setText(m18012b.m18115d());
                    if (TextUtils.isEmpty(m18012b.m18120i())) {
                        cVar.f39204b.setVisibility(8);
                        cVar.f39205c.setMaxWidth(Integer.MAX_VALUE);
                    } else {
                        cVar.f39205c.setMaxWidth(AbstractC23136l9.m118742r(160.0f));
                        cVar.f39204b.setVisibility(0);
                        cVar.f39207e.setText(m18012b.m18120i());
                    }
                    ((C23528a) this.f39195q.m123612r(cVar.f39208f)).m123616v(m18012b.m18116e());
                }
            } else if (itemViewType == 4) {
                if (view == null) {
                    dVar = new d();
                    view = this.f39196r.inflate(AbstractC7409c0.other_place_nearby_row, viewGroup, false);
                    dVar.f39209a = (AvatarImageView) view.findViewById(AbstractC6918a0.img_avatar);
                    dVar.f39210b = (TextView) view.findViewById(AbstractC6918a0.tv_name);
                    dVar.f39211c = (TextView) view.findViewById(AbstractC6918a0.tv_distance);
                    dVar.f39212d = (TextView) view.findViewById(AbstractC6918a0.tv_address);
                    view.setTag(dVar);
                    view.setOnClickListener(this);
                } else {
                    dVar = (d) view.getTag();
                }
                view.setTag(AbstractC6918a0.position, Integer.valueOf(i11));
                C3544l c3544l4 = (C3544l) this.f39197s.get(i11);
                if (c3544l4.m18014d() == 2) {
                    C3565f m18012b2 = c3544l4.m18012b();
                    if (!this.f39198t || C23999j.m125696L2(m18012b2.m18113b(), C23278z2.m120069F0())) {
                        ((C23528a) this.f39195q.m123612r(dVar.f39209a)).m123618x(m18012b2.m18113b(), C23278z2.m120069F0());
                    }
                    dVar.f39210b.setText(m18012b2.m18114c());
                    dVar.f39211c.setText(m18012b2.m18115d());
                    dVar.f39212d.setText(m18012b2.m18112a());
                }
            } else if (itemViewType == 5) {
                if (view == null) {
                    aVar = new a();
                    view = this.f39196r.inflate(AbstractC7409c0.nearby_header_row, viewGroup, false);
                    aVar.f39201a = (TextView) view.findViewById(AbstractC6918a0.tv_text);
                    aVar.f39202b = view.findViewById(AbstractC6918a0.separate_line);
                    view.setTag(aVar);
                } else {
                    aVar = (a) view.getTag();
                }
                if (i11 == 0) {
                    aVar.f39202b.setVisibility(8);
                }
                C3544l c3544l5 = (C3544l) this.f39197s.get(i11);
                if (c3544l5.m18014d() == 3) {
                    aVar.f39201a.setText(c3544l5.m18013c());
                }
            } else if (itemViewType == 6) {
                if (view == null) {
                    view = this.f39196r.inflate(AbstractC7409c0.nearby_action_row, viewGroup, false);
                }
                view.setOnClickListener(this);
                view.setTag(AbstractC6918a0.position, Integer.valueOf(i11));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        f fVar;
        try {
            int intValue = ((Integer) view.getTag(AbstractC6918a0.position)).intValue();
            if (view.getId() == AbstractC6918a0.btn_follow && (fVar = this.f39200v) != null) {
                fVar.mo36436pr(((C3544l) this.f39197s.get(intValue)).m18011a(), intValue);
                return;
            }
            b bVar = this.f39199u;
            if (bVar != null) {
                bVar.mo36435n(intValue);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
