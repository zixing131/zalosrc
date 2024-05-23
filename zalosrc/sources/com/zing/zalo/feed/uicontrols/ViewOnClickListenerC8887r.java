package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bo.C3051w0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23047d8;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23099i5;
import me0.C23212s8;
import p084cs.AbstractC17569c;
import p084cs.C17567a;
import p084cs.C17570d;
import p109ds.C18062a;
import p109ds.C18063b;
import p109ds.C18064c;
import p167fs.C19140e;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p691yr.AbstractC31062l;
import p691yr.AbstractC31064n;
import p691yr.C31060j;
import p691yr.C31063m;
import p726zr.C32546b;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26707f;
import ti0.C26708g;

/* renamed from: com.zing.zalo.feed.uicontrols.r */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC8887r implements View.OnClickListener {

    /* renamed from: A */
    C18063b f47522A;

    /* renamed from: B */
    C22126c0 f47523B;

    /* renamed from: C */
    C18064c f47524C;

    /* renamed from: D */
    C22126c0 f47525D;

    /* renamed from: E */
    private final C13704p1 f47526E = new C13704p1(1);

    /* renamed from: F */
    boolean f47527F = true;

    /* renamed from: G */
    public boolean f47528G = false;

    /* renamed from: H */
    a f47529H;

    /* renamed from: p */
    public View f47530p;

    /* renamed from: q */
    public TextView f47531q;

    /* renamed from: r */
    public RelativeLayout f47532r;

    /* renamed from: s */
    FeedLikeButtonModulesView f47533s;

    /* renamed from: t */
    RobotoTextView f47534t;

    /* renamed from: u */
    public RelativeLayout f47535u;

    /* renamed from: v */
    RecyclingImageView f47536v;

    /* renamed from: w */
    public LinearLayout f47537w;

    /* renamed from: x */
    View f47538x;

    /* renamed from: y */
    ModulesView f47539y;

    /* renamed from: z */
    C16716d f47540z;

    /* renamed from: com.zing.zalo.feed.uicontrols.r$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        boolean mo47428a(ItemAlbumMobile itemAlbumMobile);

        /* renamed from: b */
        InterfaceC27218a mo47429b();

        /* renamed from: c */
        void mo47430c(View view, int i11);

        /* renamed from: d */
        void mo47431d();
    }

    public ViewOnClickListenerC8887r(LinearLayout linearLayout, a aVar) {
        this.f47529H = aVar;
        m47422j(linearLayout);
    }

    /* renamed from: c */
    private void m47407c(Context context) {
        C26703b m137293a = C26705d.m137293a(context, AbstractC2814h.t_xsmall_m);
        if (this.f47540z == null) {
            C16716d c16716d = new C16716d(context);
            this.f47540z = c16716d;
            c16716d.m89106L().m89060k0(-2).m89030N(-2).m89027K(true).m89073z(Boolean.TRUE);
            this.f47540z.mo44614b1(8);
        }
        if (this.f47522A == null) {
            C18063b c18063b = new C18063b(context);
            this.f47522A = c18063b;
            c18063b.m89106L().m89027K(true);
        }
        C18064c c18064c = new C18064c(context);
        this.f47524C = c18064c;
        c18064c.m89106L().m89028L(-2, -2).m89027K(true);
        if (this.f47523B == null) {
            C22126c0 c22126c0 = new C22126c0(context);
            this.f47523B = c22126c0;
            c22126c0.m89106L().m89034R(AbstractC23222t7.f112562h).m89027K(true).m89029M(12);
            new C26707f(this.f47523B).m137318a(m137293a);
            this.f47523B.m111962J1(C23212s8.m119606n(AbstractC2807a.constant_white));
        }
        this.f47526E.m76614d(this.f47523B.m111977q1(), false);
        this.f47526E.setTypeface(this.f47523B.m111978r1());
        if (this.f47525D == null) {
            C22126c0 c22126c02 = new C22126c0(context);
            this.f47525D = c22126c02;
            c22126c02.m89106L().m89060k0(-2).m89030N(-2).m89027K(true).m89035S(AbstractC23222t7.f112582r);
            new C26707f(this.f47525D).m137318a(m137293a);
            this.f47525D.m111962J1(C23212s8.m119606n(AbstractC2807a.constant_white));
        }
        this.f47539y.mo44090O();
        this.f47540z.m89001g1(this.f47522A);
        this.f47540z.m89001g1(this.f47524C);
        this.f47540z.m89001g1(this.f47523B);
        this.f47539y.mo69681L(this.f47540z);
        this.f47539y.mo69681L(this.f47525D);
        this.f47540z.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.uicontrols.p
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ViewOnClickListenerC8887r.this.m47411k(c16719g);
            }
        });
        this.f47525D.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.uicontrols.q
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ViewOnClickListenerC8887r.this.m47412l(c16719g);
            }
        });
        m47410i();
    }

    /* renamed from: f */
    private void m47408f(boolean z11, C32546b c32546b) {
        List m150943l;
        C18063b c18063b = this.f47522A;
        if (c18063b == null) {
            return;
        }
        if (z11) {
            if (c32546b != null) {
                m150943l = c32546b.m157606b();
            } else {
                m150943l = C31060j.f143193a.m150943l();
            }
            c18063b.m96028o1(m150943l);
            return;
        }
        c18063b.m96028o1(new ArrayList());
    }

    /* renamed from: g */
    private void m47409g(int i11, boolean z11, C3051w0 c3051w0, C32546b c32546b) {
        C18064c c18064c = this.f47524C;
        if (c18064c == null) {
            return;
        }
        if (i11 <= 0 && !z11) {
            c18064c.m96030p1(new ArrayList());
        } else {
            this.f47524C.m96030p1(new C18062a().m96027b(z11, i11, c3051w0, c32546b, C31063m.a.f143210p));
        }
    }

    /* renamed from: i */
    private void m47410i() {
        C16719g c16719g;
        if (this.f47522A != null && this.f47524C != null) {
            if (C31060j.m150913U()) {
                this.f47524C.mo44614b1(0);
                this.f47522A.mo44614b1(8);
                c16719g = this.f47524C;
            } else {
                this.f47522A.mo44614b1(0);
                this.f47524C.mo44614b1(8);
                c16719g = this.f47522A;
            }
            C22126c0 c22126c0 = this.f47523B;
            if (c22126c0 != null) {
                c22126c0.m89106L().m89054h0(c16719g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m47411k(C16719g c16719g) {
        a aVar = this.f47529H;
        if (aVar != null) {
            aVar.mo47431d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m47412l(C16719g c16719g) {
        onClick(this.f47535u);
    }

    /* renamed from: p */
    private void m47413p(Context context) {
        RelativeLayout relativeLayout = this.f47535u;
        if (relativeLayout != null && this.f47536v != null) {
            relativeLayout.setOnClickListener(this);
            AbstractC31062l m150961a = C31063m.f143208a.m150961a(context, C31063m.a.f143210p);
            this.f47535u.setBackground(AbstractC31064n.m150965a(m150961a));
            this.f47536v.setImageDrawable(m150961a.m150959c());
        }
    }

    /* renamed from: q */
    private void m47414q(Context context) {
        RelativeLayout relativeLayout = this.f47532r;
        if (relativeLayout != null && this.f47533s != null && this.f47534t != null) {
            relativeLayout.setOnClickListener(this);
            RelativeLayout relativeLayout2 = this.f47532r;
            C31060j c31060j = C31060j.f143193a;
            C31063m.a aVar = C31063m.a.f143210p;
            relativeLayout2.setBackground(c31060j.m150941g(0, context, aVar));
            this.f47533s.m47306V(10, AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
            this.f47533s.m47308X(false, 0);
            new C26708g(this.f47534t).m137319a(C19140e.f95172a.m100454d(context));
            this.f47534t.setTextColor(c31060j.m150933J(0, context, aVar));
        }
    }

    /* renamed from: r */
    private void m47415r(boolean z11, boolean z12) {
        C22126c0 c22126c0 = this.f47525D;
        if (c22126c0 != null) {
            if (z11 && !z12) {
                c22126c0.m89106L().m89017A(Boolean.FALSE).m89073z(Boolean.TRUE);
            } else {
                c22126c0.m89106L().m89073z(Boolean.FALSE).m89017A(Boolean.TRUE);
            }
        }
    }

    /* renamed from: s */
    private void m47416s(ItemAlbumMobile itemAlbumMobile) {
        boolean z11;
        int m118475a = C23099i5.m118475a(itemAlbumMobile.f42561L);
        int m118475a2 = C23099i5.m118475a(itemAlbumMobile.f42560K);
        C22126c0 c22126c0 = this.f47525D;
        boolean z12 = true;
        if (c22126c0 != null) {
            if (m118475a > 0) {
                this.f47525D.m111959G1(AbstractC23136l9.m118698c0().getQuantityString(AbstractC7921d0.str_reaction_comment, m118475a, Integer.valueOf(m118475a)));
                this.f47525D.mo44614b1(0);
            } else {
                c22126c0.mo44614b1(8);
            }
        }
        if (m118475a > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m118475a2 <= 0) {
            z12 = false;
        }
        m47415r(z11, z12);
    }

    /* renamed from: u */
    private void m47417u(Context context, ItemAlbumMobile itemAlbumMobile) {
        List arrayList;
        String str;
        int i11;
        C3051w0 c3051w0 = itemAlbumMobile.f42562M;
        C32546b c32546b = itemAlbumMobile.f42563N;
        C17570d c17570d = new C17570d(context);
        int m118475a = C23099i5.m118475a(itemAlbumMobile.f42560K);
        if (c3051w0 != null) {
            arrayList = AbstractC20826v0.m108792W0(c3051w0.f12301a);
        } else {
            arrayList = new ArrayList();
        }
        String m93559b = AbstractC17569c.Companion.m93559b(c17570d, itemAlbumMobile.f42552E.equals("1"), arrayList, m118475a, 10);
        C22126c0 c22126c0 = this.f47525D;
        if (c22126c0 != null) {
            str = c22126c0.m111973m1().toString();
        } else {
            str = "";
        }
        float measureText = this.f47526E.measureText(m93559b);
        float measureText2 = this.f47526E.measureText(str);
        if (c32546b != null) {
            i11 = c32546b.m157606b().size();
        } else {
            i11 = 0;
        }
        C17567a c17567a = new C17567a();
        c17567a.m93550a(this.f47526E, c17570d, measureText, measureText2, itemAlbumMobile.f42552E.equals("1"), m118475a);
        this.f47523B.m111959G1(c17567a.m93551c(10, i11, m93559b));
    }

    /* renamed from: w */
    private void m47418w(ItemAlbumMobile itemAlbumMobile) {
        boolean z11;
        int m118475a = C23099i5.m118475a(itemAlbumMobile.f42560K);
        boolean equals = itemAlbumMobile.f42552E.equals("1");
        if (!equals && m118475a <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        C3051w0 c3051w0 = itemAlbumMobile.f42562M;
        C32546b c32546b = itemAlbumMobile.f42563N;
        if (C31060j.m150913U()) {
            m47409g(m118475a, equals, c3051w0, c32546b);
        } else {
            m47408f(z11, c32546b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m47419d(Context context, ItemAlbumMobile itemAlbumMobile) {
        Resources resources;
        CharSequence m40500I;
        this.f47533s.m47308X(false, 0);
        if (itemAlbumMobile != null) {
            try {
                if (context != null) {
                    resources = context.getResources();
                } else {
                    resources = MainApplication.getAppContext().getResources();
                }
                m40500I = itemAlbumMobile.m40500I(this.f47529H.mo47429b());
            } catch (Exception e11) {
                e11.printStackTrace();
                if (itemAlbumMobile.f42556G.length() > 0) {
                    this.f47531q.setText(C28652r.m143349v().m143354E(AbstractC23047d8.m118261m(itemAlbumMobile.f42556G)));
                }
            }
            if (m40500I.length() <= 0 && !itemAlbumMobile.m40506Q()) {
                if (!this.f47528G) {
                    this.f47530p.setVisibility(8);
                }
                this.f47531q.setVisibility(8);
                if (!this.f47529H.mo47428a(itemAlbumMobile)) {
                    m47420e(itemAlbumMobile, context);
                    return;
                }
                return;
            }
            Iterator it = itemAlbumMobile.m40530q().iterator();
            while (it.hasNext()) {
                C10866e c10866e = (C10866e) it.next();
                c10866e.m56377U(resources.getColor(AbstractC16801x.cTime1));
                c10866e.m56365I(this.f47529H.mo47429b());
            }
            if (itemAlbumMobile.m40506Q() && itemAlbumMobile.m40533u() != null) {
                Iterator it2 = itemAlbumMobile.m40533u().iterator();
                while (it2.hasNext()) {
                    C10866e c10866e2 = (C10866e) it2.next();
                    c10866e2.m56377U(resources.getColor(AbstractC16801x.cTime1));
                    C10866e.m56358d(c10866e2, this.f47529H.mo47429b(), itemAlbumMobile.f42595r, itemAlbumMobile.f42593q, itemAlbumMobile.f42599t, itemAlbumMobile.m40501J());
                }
            }
            this.f47530p.setVisibility(0);
            if (this.f47527F) {
                this.f47531q.setVisibility(0);
            }
            this.f47531q.setText(m40500I);
            this.f47531q.scrollTo(0, 0);
            this.f47531q.setMovementMethod(CustomMovementMethod.m56305e());
            if (!this.f47529H.mo47428a(itemAlbumMobile)) {
            }
        } else {
            this.f47533s.setVisibility(0);
            this.f47534t.setVisibility(0);
            this.f47535u.setVisibility(0);
        }
    }

    /* renamed from: e */
    public void m47420e(ItemAlbumMobile itemAlbumMobile, Context context) {
        int i11;
        if (itemAlbumMobile.f42552E.equals("1")) {
            C32546b c32546b = itemAlbumMobile.f42563N;
            if (c32546b != null) {
                i11 = c32546b.m157605a();
            } else {
                i11 = 1;
            }
            this.f47533s.m47308X(true, i11);
            FeedLikeButtonModulesView feedLikeButtonModulesView = this.f47533s;
            int i12 = AbstractC23222t7.f112594x;
            feedLikeButtonModulesView.m47307W(i12, i12);
            this.f47532r.setPadding(AbstractC23222t7.f112576o, AbstractC23222t7.f112558f, AbstractC23222t7.f112576o, AbstractC23222t7.f112558f);
            RelativeLayout relativeLayout = this.f47532r;
            C31060j c31060j = C31060j.f143193a;
            C31063m.a aVar = C31063m.a.f143210p;
            relativeLayout.setBackground(c31060j.m150941g(i11, context, aVar));
            this.f47534t.setTextColor(c31060j.m150933J(i11, context, aVar));
            this.f47534t.setText(c31060j.m150931H(i11, context));
        } else {
            this.f47533s.m47308X(false, 0);
            FeedLikeButtonModulesView feedLikeButtonModulesView2 = this.f47533s;
            int i13 = AbstractC23222t7.f112514B;
            feedLikeButtonModulesView2.m47307W(i13, i13);
            this.f47532r.setPadding(AbstractC23222t7.f112572m, AbstractC23222t7.f112556e, AbstractC23222t7.f112572m, AbstractC23222t7.f112556e);
            RelativeLayout relativeLayout2 = this.f47532r;
            C31060j c31060j2 = C31060j.f143193a;
            C31063m.a aVar2 = C31063m.a.f143210p;
            relativeLayout2.setBackground(c31060j2.m150941g(0, context, aVar2));
            this.f47534t.setTextColor(c31060j2.m150933J(0, context, aVar2));
            this.f47534t.setText(c31060j2.m150931H(0, context));
        }
        this.f47535u.setVisibility(0);
        this.f47532r.setVisibility(0);
    }

    /* renamed from: h */
    public void m47421h() {
        try {
            TextView textView = this.f47531q;
            if (textView != null) {
                textView.setMovementMethod(null);
                this.f47531q = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    void m47422j(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        this.f47537w = (LinearLayout) linearLayout.findViewById(AbstractC6918a0.layoutImageFunction);
        this.f47530p = linearLayout.findViewById(AbstractC6918a0.seperatorView);
        this.f47531q = (TextView) linearLayout.findViewById(AbstractC6918a0.tvDescription);
        this.f47532r = (RelativeLayout) linearLayout.findViewById(AbstractC6918a0.btn_like);
        this.f47533s = (FeedLikeButtonModulesView) linearLayout.findViewById(AbstractC6918a0.btn_like_icon);
        this.f47534t = (RobotoTextView) linearLayout.findViewById(AbstractC6918a0.btn_like_text);
        m47414q(context);
        this.f47535u = (RelativeLayout) linearLayout.findViewById(AbstractC6918a0.btn_comment);
        this.f47536v = (RecyclingImageView) linearLayout.findViewById(AbstractC6918a0.btn_comment_icon);
        m47413p(context);
        this.f47538x = linearLayout.findViewById(AbstractC6918a0.layout_like_description_container);
        this.f47539y = (ModulesView) linearLayout.findViewById(AbstractC6918a0.layout_like_desc);
        m47407c(linearLayout.getContext());
    }

    /* renamed from: m */
    public void m47423m(Context context) {
        TextView textView = this.f47531q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (!this.f47528G) {
            this.f47530p.setVisibility(8);
        }
        this.f47535u.setVisibility(8);
        this.f47532r.setVisibility(8);
        m47427v(context, null);
    }

    /* renamed from: n */
    public void m47424n(boolean z11) {
        TextView textView;
        this.f47527F = z11;
        if (!z11 && (textView = this.f47531q) != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: o */
    public void m47425o() {
        this.f47537w.setVisibility(4);
        if (!this.f47528G) {
            this.f47530p.setVisibility(8);
        }
        this.f47532r.setVisibility(4);
        this.f47535u.setVisibility(4);
        this.f47538x.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        int id2 = view.getId();
        if (!view.isShown()) {
            return;
        }
        if (id2 != AbstractC6918a0.btn_comment && id2 != AbstractC6918a0.btn_like) {
            if (id2 == AbstractC6918a0.layout_like_description_container && (aVar = this.f47529H) != null) {
                aVar.mo47431d();
                return;
            }
            return;
        }
        a aVar2 = this.f47529H;
        if (aVar2 != null) {
            aVar2.mo47430c(view, view.getId());
        }
        RelativeLayout relativeLayout = this.f47535u;
        if (relativeLayout != null) {
            relativeLayout.clearFocus();
        }
    }

    /* renamed from: t */
    public void m47426t(Configuration configuration) {
        try {
            if (configuration.orientation == 2) {
                TextView textView = this.f47531q;
                if (textView != null) {
                    textView.setMaxLines(2);
                }
                AbstractC23647d.m123906p("17800");
                AbstractC23647d.m123893c();
                return;
            }
            TextView textView2 = this.f47531q;
            if (textView2 != null) {
                textView2.setMaxLines(5);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    public void m47427v(Context context, ItemAlbumMobile itemAlbumMobile) {
        boolean z11;
        int i11;
        int i12 = 8;
        try {
            if (itemAlbumMobile != null) {
                int m118475a = C23099i5.m118475a(itemAlbumMobile.f42560K);
                int m118475a2 = C23099i5.m118475a(itemAlbumMobile.f42561L);
                boolean z12 = true;
                if (m118475a > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (m118475a2 <= 0) {
                    z12 = false;
                }
                m47416s(itemAlbumMobile);
                m47418w(itemAlbumMobile);
                m47417u(context, itemAlbumMobile);
                C16716d c16716d = this.f47540z;
                if (m118475a > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                AbstractC23022b5.m118028f(c16716d, i11);
                View view = this.f47538x;
                if (z11 || z12) {
                    i12 = 0;
                }
                AbstractC23136l9.m118744r1(view, i12);
            } else {
                this.f47538x.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
