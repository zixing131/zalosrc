package com.zing.zalo.adapters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7145n;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: com.zing.zalo.adapters.n */
/* loaded from: classes3.dex */
public class C7145n extends BaseAdapter {

    /* renamed from: t */
    LayoutInflater f39057t;

    /* renamed from: u */
    Context f39058u;

    /* renamed from: v */
    a f39059v;

    /* renamed from: p */
    public int f39053p = 0;

    /* renamed from: q */
    public int f39054q = 0;

    /* renamed from: r */
    boolean f39055r = false;

    /* renamed from: w */
    d f39060w = null;

    /* renamed from: s */
    List f39056s = new ArrayList();

    /* renamed from: com.zing.zalo.adapters.n$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo36357a(int i11);

        /* renamed from: b */
        void mo36358b(int i11, boolean z11);

        /* renamed from: c */
        void mo36359c(int i11);
    }

    /* renamed from: com.zing.zalo.adapters.n$c */
    /* loaded from: classes3.dex */
    static class c {

        /* renamed from: a */
        public TextView f39079a;

        /* renamed from: b */
        public CompoundButton f39080b;

        /* renamed from: c */
        public View f39081c;

        /* renamed from: d */
        public View f39082d;

        c() {
        }
    }

    /* renamed from: com.zing.zalo.adapters.n$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a5 */
        void mo36366a5();
    }

    /* renamed from: com.zing.zalo.adapters.n$e */
    /* loaded from: classes3.dex */
    static class e {

        /* renamed from: a */
        public TextView f39083a;

        e() {
        }
    }

    /* renamed from: com.zing.zalo.adapters.n$f */
    /* loaded from: classes3.dex */
    static class f {

        /* renamed from: a */
        public TextView f39084a;

        /* renamed from: b */
        public View f39085b;

        /* renamed from: c */
        public View f39086c;

        /* renamed from: d */
        public TextView f39087d;

        /* renamed from: e */
        public ImageView f39088e;

        /* renamed from: f */
        public ImageView f39089f;

        f() {
        }
    }

    /* renamed from: com.zing.zalo.adapters.n$g */
    /* loaded from: classes3.dex */
    public static class g implements a {
        @Override // com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
        }

        @Override // com.zing.zalo.adapters.C7145n.a
        /* renamed from: b */
        public void mo36358b(int i11, boolean z11) {
        }

        @Override // com.zing.zalo.adapters.C7145n.a
        /* renamed from: c */
        public void mo36359c(int i11) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.n$h */
    /* loaded from: classes3.dex */
    static class h {

        /* renamed from: a */
        public TextView f39090a;

        /* renamed from: b */
        public ImageView f39091b;

        /* renamed from: c */
        public View f39092c;

        h() {
        }
    }

    /* renamed from: com.zing.zalo.adapters.n$i */
    /* loaded from: classes3.dex */
    static class i {

        /* renamed from: a */
        public TextView f39093a;

        /* renamed from: b */
        public View f39094b;

        /* renamed from: c */
        public ImageView f39095c;

        /* renamed from: d */
        public LinearLayout f39096d;

        i() {
        }
    }

    /* renamed from: com.zing.zalo.adapters.n$j */
    /* loaded from: classes3.dex */
    static class j {

        /* renamed from: a */
        public TextView f39097a;

        /* renamed from: b */
        public View f39098b;

        /* renamed from: c */
        public View f39099c;

        /* renamed from: d */
        public View f39100d;

        /* renamed from: e */
        public View f39101e;

        /* renamed from: f */
        public View f39102f;

        j() {
        }
    }

    public C7145n(Context context, a aVar) {
        this.f39057t = LayoutInflater.from(context);
        this.f39058u = context;
        this.f39059v = aVar;
    }

    /* renamed from: f */
    public /* synthetic */ void m36350f(int i11, View view) {
        try {
            a aVar = this.f39059v;
            if (aVar != null) {
                aVar.mo36357a(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m36351g(b bVar, CompoundButton compoundButton, boolean z11) {
        a aVar = this.f39059v;
        if (aVar != null) {
            aVar.mo36358b(bVar.m36361a(), z11);
        }
    }

    /* renamed from: h */
    public /* synthetic */ void m36352h(b bVar, View view) {
        a aVar = this.f39059v;
        if (aVar != null) {
            aVar.mo36359c(bVar.m36361a());
        }
    }

    /* renamed from: d */
    public b m36353d(int i11) {
        List list = this.f39056s;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            return (b) this.f39056s.get(i11);
        }
        return null;
    }

    /* renamed from: e */
    View.OnClickListener m36354e(int i11) {
        return new View.OnClickListener() { // from class: com.zing.zalo.adapters.m

            /* renamed from: q */
            public final /* synthetic */ int f38993q;

            public /* synthetic */ ViewOnClickListenerC7134m(int i112) {
                r2 = i112;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7145n.this.m36350f(r2, view);
            }
        };
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.f39056s;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f39056s.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        return m36353d(i11).m36362b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0348, code lost:            r10 = r8.f39057t.inflate(com.zing.zalo.AbstractC7409c0.webview_share_popup_item, (android.view.ViewGroup) null);        r11 = new com.zing.zalo.adapters.C7145n.i();        r11.f39094b = r10.findViewById(com.zing.zalo.AbstractC6918a0.chat_menu_popup_item_divider);        r11.f39093a = (android.widget.TextView) r10.findViewById(com.zing.zalo.AbstractC6918a0.share_text_item);        r11.f39095c = (android.widget.ImageView) r10.findViewById(com.zing.zalo.AbstractC6918a0.icon_share_web_popup);        r11.f39096d = (android.widget.LinearLayout) r10.findViewById(com.zing.zalo.AbstractC6918a0.item_webview_share_popup);        r10.setTag(r11);     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View getView(int i11, View view, ViewGroup viewGroup) {
        e eVar;
        h hVar;
        c cVar;
        j jVar;
        f fVar;
        c cVar2;
        try {
            if (i11 < getCount()) {
                b m36353d = m36353d(i11);
                int m36362b = m36353d.m36362b();
                if (m36362b == 0) {
                    if (view == null) {
                        view = this.f39057t.inflate(AbstractC7409c0.chat_menu_popup_item, (ViewGroup) null);
                        cVar2 = new c();
                        cVar2.f39079a = (TextView) view.findViewById(AbstractC6918a0.setting_text_primary);
                        cVar2.f39080b = (CompoundButton) view.findViewById(AbstractC6918a0.setting_switch);
                        cVar2.f39081c = view.findViewById(AbstractC6918a0.setting_ic_next);
                        cVar2.f39082d = view.findViewById(AbstractC6918a0.chat_menu_popup_item_divider);
                        view.setTag(cVar2);
                    } else {
                        cVar2 = (c) view.getTag();
                    }
                    cVar2.f39079a.setText(m36353d.f39068h);
                    cVar2.f39080b.setOnCheckedChangeListener(null);
                    if (m36353d.f39069i) {
                        cVar2.f39080b.setVisibility(0);
                        cVar2.f39080b.setChecked(m36353d.f39070j);
                        cVar2.f39080b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.adapters.k

                            /* renamed from: b */
                            public final /* synthetic */ C7145n.b f38917b;

                            public /* synthetic */ C7112k(C7145n.b m36353d2) {
                                r2 = m36353d2;
                            }

                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                                C7145n.this.m36351g(r2, compoundButton, z11);
                            }
                        });
                    } else {
                        cVar2.f39080b.setVisibility(8);
                    }
                    view.setOnClickListener(m36354e(m36353d2.m36361a()));
                    cVar2.f39081c.setVisibility(8);
                    cVar2.f39079a.setTextColor(m36353d2.f39063c);
                    cVar2.f39082d.setVisibility(m36353d2.f39071k ? 0 : 8);
                } else if (m36362b == 1) {
                    if (view == null) {
                        view = this.f39057t.inflate(AbstractC7409c0.privacy_menu_popup_item, (ViewGroup) null);
                        fVar = new f();
                        fVar.f39084a = (TextView) view.findViewById(AbstractC6918a0.setting_text_primary);
                        fVar.f39085b = view.findViewById(AbstractC6918a0.chat_menu_popup_item_divider);
                        fVar.f39087d = (TextView) view.findViewById(AbstractC6918a0.setting_text_hint_below);
                        fVar.f39088e = (ImageView) view.findViewById(AbstractC6918a0.icon_selected);
                        fVar.f39089f = (ImageView) view.findViewById(AbstractC6918a0.setting_ic_list);
                        fVar.f39086c = view.findViewById(AbstractC6918a0.setting_ic_next);
                        view.setTag(fVar);
                    } else {
                        fVar = (f) view.getTag();
                    }
                    view.setOnClickListener(m36354e(m36353d2.m36361a()));
                    fVar.f39084a.setText(m36353d2.f39068h);
                    fVar.f39084a.setTextColor(m36353d2.f39063c);
                    fVar.f39087d.setText(m36353d2.f39072l);
                    fVar.f39087d.setTextColor(m36353d2.f39065e);
                    fVar.f39086c.setVisibility(8);
                    fVar.f39088e.setImageResource(m36353d2.f39073m ? AbstractC16803z.btn_radio_on_holo_light : AbstractC16803z.btn_radio_off_holo_light);
                    fVar.f39089f.setVisibility(m36353d2.f39074n ? 0 : 8);
                    fVar.f39089f.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.l

                        /* renamed from: q */
                        public final /* synthetic */ C7145n.b f38954q;

                        public /* synthetic */ ViewOnClickListenerC7123l(C7145n.b m36353d2) {
                            r2 = m36353d2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C7145n.this.m36352h(r2, view2);
                        }
                    });
                    fVar.f39085b.setVisibility(m36353d2.f39071k ? 0 : 8);
                } else if (m36362b == 2) {
                    if (view == null) {
                        view = this.f39057t.inflate(AbstractC7409c0.webview_menu_popup_item, (ViewGroup) null);
                        jVar = new j();
                        jVar.f39097a = (TextView) view.findViewById(AbstractC6918a0.setting_text_primary);
                        jVar.f39098b = view.findViewById(AbstractC6918a0.chat_menu_popup_item_divider);
                        jVar.f39100d = view.findViewById(AbstractC6918a0.web_back);
                        jVar.f39101e = view.findViewById(AbstractC6918a0.web_refresh);
                        jVar.f39102f = view.findViewById(AbstractC6918a0.web_forward);
                        jVar.f39099c = view.findViewById(AbstractC6918a0.web_controller_layout);
                        view.setTag(jVar);
                    } else {
                        jVar = (j) view.getTag();
                    }
                    if (i11 < getCount() - 1) {
                        jVar.f39099c.setVisibility(8);
                        jVar.f39097a.setVisibility(0);
                    } else {
                        jVar.f39099c.setVisibility(0);
                        jVar.f39097a.setVisibility(8);
                    }
                    TextView textView = jVar.f39097a;
                    if (textView != null) {
                        textView.setText(m36353d2.f39068h);
                        jVar.f39097a.setOnClickListener(m36354e(m36353d2.m36361a()));
                        if (getCount() == 1) {
                            jVar.f39097a.setBackgroundResource(AbstractC16803z.stencils_bg_menu_item_popup);
                        } else if (i11 == 0) {
                            jVar.f39097a.setBackgroundResource(AbstractC16803z.stencils_bg_menu_item_popup_top);
                        } else if (i11 == getCount() - 1) {
                            jVar.f39097a.setBackgroundResource(AbstractC16803z.stencils_bg_menu_item_popup_bottom);
                        }
                    }
                    jVar.f39098b.setVisibility(m36353d2.f39071k ? 0 : 8);
                    View view2 = jVar.f39100d;
                    if (view2 != null) {
                        view2.setEnabled(m36353d2.f39075o);
                        jVar.f39100d.setOnClickListener(m36354e(7));
                    }
                    View view3 = jVar.f39101e;
                    if (view3 != null) {
                        if (!m36353d2.f39077q) {
                            ((ImageButton) view3).setImageResource(AbstractC16803z.btn_navigation_refresh);
                        } else {
                            ((ImageButton) view3).setImageResource(AbstractC16803z.btn_stop);
                        }
                        jVar.f39101e.setOnClickListener(m36354e(8));
                    }
                    View view4 = jVar.f39102f;
                    if (view4 != null) {
                        view4.setEnabled(m36353d2.f39076p);
                        jVar.f39102f.setOnClickListener(m36354e(9));
                    }
                } else {
                    if (m36362b != 3 && m36362b != 4) {
                        if (m36362b == 5) {
                            if (view == null) {
                                view = this.f39057t.inflate(AbstractC7409c0.right_aligned_menu_popup_item, viewGroup, false);
                                cVar = new c();
                                cVar.f39079a = (TextView) view.findViewById(AbstractC6918a0.setting_text_primary);
                                view.setTag(cVar);
                            } else {
                                cVar = (c) view.getTag();
                            }
                            cVar.f39079a.setText(m36353d2.f39068h);
                            cVar.f39079a.setTextColor(m36353d2.f39073m ? m36353d2.f39062b : m36353d2.f39063c);
                            view.setOnClickListener(m36354e(m36353d2.m36361a()));
                        } else if (m36362b == 6) {
                            if (view == null) {
                                view = this.f39057t.inflate(AbstractC7409c0.sticker_menu_popup_item, (ViewGroup) null);
                                hVar = new h();
                                hVar.f39090a = (TextView) view.findViewById(AbstractC6918a0.lable_menu);
                                hVar.f39091b = (ImageView) view.findViewById(AbstractC6918a0.icon_menu);
                                hVar.f39092c = view.findViewById(AbstractC6918a0.chat_menu_popup_item_divider);
                                view.setTag(hVar);
                            } else {
                                hVar = (h) view.getTag();
                            }
                            if (hVar != null) {
                                hVar.f39092c.setVisibility(m36353d2.f39071k ? 0 : 8);
                                hVar.f39090a.setText(m36353d2.f39068h);
                                hVar.f39091b.setImageResource(m36353d2.f39078r);
                            }
                            view.setOnClickListener(m36354e(m36353d2.m36361a()));
                        } else if (m36362b == 7) {
                            if (view == null) {
                                view = this.f39057t.inflate(AbstractC7409c0.landing_page_edit_more_menu_popup_item, viewGroup, false);
                                eVar = new e();
                                eVar.f39083a = (TextView) view.findViewById(AbstractC6918a0.landing_page_edit_more_label);
                                view.setTag(eVar);
                            } else {
                                eVar = (e) view.getTag();
                            }
                            eVar.f39083a.setText(m36353d2.f39068h);
                            eVar.f39083a.setCompoundDrawablesRelativeWithIntrinsicBounds(m36353d2.f39078r, 0, 0, 0);
                            eVar.f39083a.setCompoundDrawablePadding(AbstractC23222t7.f112586t);
                            view.setOnClickListener(m36354e(m36353d2.m36361a()));
                        }
                    }
                    i iVar = (i) view.getTag();
                    if (iVar.f39096d != null) {
                        if (getCount() == 1) {
                            iVar.f39096d.setBackgroundResource(AbstractC16803z.stencils_bg_menu_item_popup);
                        } else if (i11 == 0) {
                            iVar.f39096d.setBackgroundResource(AbstractC16803z.stencils_bg_menu_item_popup_top);
                        } else if (i11 == getCount() - 1) {
                            iVar.f39096d.setBackgroundResource(AbstractC16803z.stencils_bg_menu_item_popup_bottom);
                        }
                    }
                    iVar.f39094b.setVisibility(m36353d2.f39071k ? 0 : 8);
                    iVar.f39093a.setText(m36353d2.f39068h);
                    iVar.f39095c.setImageResource(m36353d2.f39078r);
                    view.setOnClickListener(m36354e(m36353d2.m36361a()));
                }
                view.measure(0, 0);
                if (view.getMeasuredHeight() > 0) {
                    this.f39053p = (getCount() * view.getMeasuredHeight()) + ((getCount() - 1) * AbstractC23136l9.m118742r(1.0f));
                }
                if (this.f39060w != null) {
                    this.f39054q = Math.max(this.f39054q, view.getMeasuredWidth());
                    if (i11 == this.f39056s.size() - 1 && !this.f39055r) {
                        this.f39060w.mo36366a5();
                        view.requestLayout();
                        this.f39055r = true;
                    }
                }
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

    /* renamed from: i */
    public void m36355i(d dVar) {
        this.f39060w = dVar;
    }

    /* renamed from: j */
    public void m36356j(List list) {
        if (list != null) {
            this.f39056s = new ArrayList(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.zing.zalo.adapters.n$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        Context f39061a;

        /* renamed from: b */
        public ColorStateList f39062b;

        /* renamed from: c */
        public ColorStateList f39063c;

        /* renamed from: d */
        public ColorStateList f39064d;

        /* renamed from: e */
        public ColorStateList f39065e;

        /* renamed from: f */
        public int f39066f;

        /* renamed from: g */
        public final int f39067g;

        /* renamed from: h */
        public String f39068h;

        /* renamed from: i */
        public boolean f39069i;

        /* renamed from: j */
        public boolean f39070j;

        /* renamed from: k */
        public boolean f39071k;

        /* renamed from: l */
        public String f39072l;

        /* renamed from: m */
        public boolean f39073m;

        /* renamed from: n */
        public boolean f39074n;

        /* renamed from: o */
        public boolean f39075o;

        /* renamed from: p */
        public boolean f39076p;

        /* renamed from: q */
        public boolean f39077q;

        /* renamed from: r */
        public int f39078r;

        public b(Context context, int i11, int i12, String str, int i13) {
            this.f39066f = i11;
            this.f39067g = i12;
            this.f39068h = str;
            this.f39071k = true;
            this.f39078r = i13;
            m36360c(context);
        }

        /* renamed from: c */
        private void m36360c(Context context) {
            ColorStateList m118645D = AbstractC23136l9.m118645D(context, C23212s8.m119610r(AbstractC16781w.AppPrimaryColor));
            Objects.requireNonNull(m118645D);
            this.f39062b = m118645D;
            ColorStateList m118645D2 = AbstractC23136l9.m118645D(context, C23212s8.m119610r(AbstractC21196a.TextColor1));
            Objects.requireNonNull(m118645D2);
            this.f39063c = m118645D2;
            ColorStateList m118645D3 = AbstractC23136l9.m118645D(context, C23212s8.m119610r(AbstractC16781w.AppPrimaryColor));
            Objects.requireNonNull(m118645D3);
            this.f39064d = m118645D3;
            ColorStateList m118645D4 = AbstractC23136l9.m118645D(context, C23212s8.m119610r(AbstractC16781w.PlaceholderColor2));
            Objects.requireNonNull(m118645D4);
            this.f39065e = m118645D4;
        }

        /* renamed from: a */
        public int m36361a() {
            return this.f39067g;
        }

        /* renamed from: b */
        public int m36362b() {
            return this.f39066f;
        }

        /* renamed from: d */
        public void m36363d(int i11) {
            this.f39063c = AbstractC23136l9.m118645D(this.f39061a, i11);
        }

        /* renamed from: e */
        public void m36364e(String str) {
            this.f39072l = str;
        }

        /* renamed from: f */
        public void m36365f(boolean z11, boolean z12) {
            this.f39069i = z11;
            this.f39070j = z12;
        }

        public b(Context context, int i11, int i12, String str, String str2) {
            this.f39066f = i11;
            this.f39067g = i12;
            this.f39068h = str;
            this.f39071k = true;
            this.f39072l = str2;
            m36360c(context);
        }

        public b(Context context, int i11, int i12, String str, String str2, boolean z11) {
            this.f39061a = context;
            this.f39066f = i11;
            this.f39067g = i12;
            this.f39068h = str;
            this.f39071k = z11;
            this.f39072l = str2;
            m36360c(context);
        }
    }
}
