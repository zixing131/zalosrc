package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.QuickCreateGroupAdapter;
import com.zing.zalo.control.InviteContactMask;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C24003n;
import p716zh.C32141v0;

/* loaded from: classes3.dex */
public class QuickCreateGroupAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: C */
    InterfaceC6993d f38242C;

    /* renamed from: D */
    int f38243D;

    /* renamed from: E */
    int f38244E;

    /* renamed from: F */
    int f38245F;

    /* renamed from: G */
    int f38246G;

    /* renamed from: H */
    Drawable f38247H;

    /* renamed from: I */
    Drawable f38248I;

    /* renamed from: r */
    Context f38249r;

    /* renamed from: s */
    C23528a f38250s;

    /* renamed from: v */
    public HashSet f38253v;

    /* renamed from: w */
    boolean f38254w;

    /* renamed from: x */
    int f38255x;

    /* renamed from: t */
    public boolean f38251t = false;

    /* renamed from: u */
    final ArrayList f38252u = new ArrayList();

    /* renamed from: y */
    int f38256y = 0;

    /* renamed from: z */
    public boolean f38257z = false;

    /* renamed from: A */
    public boolean f38240A = false;

    /* renamed from: B */
    public boolean f38241B = false;

    /* loaded from: classes3.dex */
    public class ContactModulesView extends ModulesView implements InterfaceC6992c {

        /* renamed from: K */
        C21693c f38258K;

        /* renamed from: L */
        C3977j f38259L;

        /* renamed from: M */
        C22126c0 f38260M;

        /* renamed from: N */
        C22126c0 f38261N;

        /* renamed from: O */
        C21691a f38262O;

        public ContactModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_contact_bg));
            this.f38259L = new C3977j(context);
            C21693c c21693c = new C21693c(context);
            this.f38258K = c21693c;
            C16718f m89106L = c21693c.m89106L();
            int i11 = AbstractC23222t7.f112539R;
            m89106L.m89028L(i11, i11).m89032P(AbstractC23222t7.f112586t, AbstractC23222t7.f112562h, AbstractC23222t7.f112586t, AbstractC23222t7.f112562h);
            C21691a c21691a = new C21691a(context);
            this.f38262O = c21691a;
            C16718f m89027K = c21691a.m89106L().m89017A(Boolean.TRUE).m89034R(AbstractC23222t7.f112558f).m89035S(AbstractC23222t7.f112586t).m89027K(true);
            int i12 = AbstractC23222t7.f112514B;
            m89027K.m89028L(i12, i12);
            this.f38262O.m111906k1(QuickCreateGroupAdapter.this.f38247H);
            this.f38262O.m111905j1(QuickCreateGroupAdapter.this.f38248I);
            this.f38262O.mo89093E0(false);
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89054h0(this.f38258K).m89049e0(this.f38262O).m89027K(true).m89029M(12).m89028L(-1, -2);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f38260M = c22126c0;
            c22126c0.m89106L().m89028L(-1, -2);
            this.f38260M.m111953A1(1);
            C22126c0 c22126c02 = this.f38260M;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c02.m111980v1(truncateAt);
            this.f38260M.mo111964L1(AbstractC23222t7.f112586t);
            this.f38260M.m111962J1(QuickCreateGroupAdapter.this.f38243D);
            C22126c0 c22126c03 = new C22126c0(context);
            this.f38261N = c22126c03;
            c22126c03.m89106L().m89023G(this.f38260M).m89028L(-1, -2);
            this.f38261N.m111953A1(1);
            this.f38261N.m111980v1(truncateAt);
            this.f38261N.mo111964L1(AbstractC23222t7.f112582r);
            this.f38261N.m111962J1(QuickCreateGroupAdapter.this.f38244E);
            c16716d.m89001g1(this.f38260M);
            c16716d.m89001g1(this.f38261N);
            mo69681L(this.f38258K);
            mo69681L(this.f38262O);
            mo69681L(c16716d);
        }

        @Override // com.zing.zalo.adapters.QuickCreateGroupAdapter.InterfaceC6992c
        /* renamed from: I */
        public void mo35820I(C32141v0 c32141v0, int i11, boolean z11) {
            InviteContactProfile inviteContactProfile;
            boolean z12;
            if (c32141v0 == null || (inviteContactProfile = c32141v0.f148234a) == null) {
                return;
            }
            InviteContactMask inviteContactMask = inviteContactProfile.f42540d2;
            if (inviteContactMask != null && inviteContactMask.f42537s == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f38260M.mo44614b1(0);
            if (z12) {
                if (TextUtils.isEmpty(inviteContactProfile.f42540d2.f42536r)) {
                    this.f38260M.mo44614b1(8);
                }
                this.f38260M.m111959G1(inviteContactProfile.f42540d2.f42536r);
            } else {
                SpannableString spannableString = new SpannableString(inviteContactProfile.m40383Q(true, false).trim());
                for (int i12 = 0; i12 < inviteContactProfile.f42399a1.size() - 1; i12 += 2) {
                    try {
                        if (((Integer) inviteContactProfile.f42399a1.get(i12)).intValue() >= 0) {
                            int i13 = i12 + 1;
                            if (((Integer) inviteContactProfile.f42399a1.get(i13)).intValue() > ((Integer) inviteContactProfile.f42399a1.get(i12)).intValue()) {
                                spannableString.setSpan(new StyleSpan(1), ((Integer) inviteContactProfile.f42399a1.get(i12)).intValue(), ((Integer) inviteContactProfile.f42399a1.get(i13)).intValue(), 33);
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                this.f38260M.m111959G1(spannableString);
            }
            this.f38261N.m111962J1(QuickCreateGroupAdapter.this.f38244E);
            if (z12) {
                this.f38261N.m111959G1("");
                this.f38261N.mo44614b1(8);
            } else {
                InviteContactMask inviteContactMask2 = inviteContactProfile.f42540d2;
                if (inviteContactMask2 != null && !TextUtils.isEmpty(inviteContactMask2.f42536r)) {
                    this.f38261N.m111959G1(inviteContactProfile.f42540d2.f42536r);
                    this.f38261N.mo44614b1(0);
                    this.f38261N.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC16781w.AppPrimaryColor));
                } else if (QuickCreateGroupAdapter.this.f38255x >= 0 && c32141v0.f148236c == 2) {
                    this.f38261N.m111959G1(AbstractC23160o0.m119224V0(inviteContactProfile.m40402e0(), true, Calendar.getInstance(), Calendar.getInstance(), true));
                    this.f38261N.mo44614b1(0);
                } else if (c32141v0.f148236c == 5) {
                    if (!TextUtils.isEmpty(c32141v0.f148237d)) {
                        this.f38261N.m111959G1(c32141v0.f148237d);
                        this.f38261N.mo44614b1(0);
                    } else {
                        this.f38261N.mo44614b1(8);
                    }
                } else if (!TextUtils.isEmpty(inviteContactProfile.f42436r1)) {
                    this.f38261N.m111959G1(inviteContactProfile.f42436r1);
                    this.f38261N.mo44614b1(0);
                } else if (!TextUtils.isEmpty(inviteContactProfile.f42439s1)) {
                    this.f38261N.m111959G1(inviteContactProfile.f42439s1);
                    this.f38261N.mo44614b1(0);
                } else if (!TextUtils.isEmpty(inviteContactProfile.f42460z1) && AbstractC23309i.m122577xf()) {
                    String m40360C = inviteContactProfile.m40360C();
                    String m40371J = inviteContactProfile.m40371J();
                    String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.prefix_username), inviteContactProfile.f42460z1);
                    if (!TextUtils.isEmpty(m40360C) && !TextUtils.isEmpty(m40371J) && !m40360C.equals(m40371J)) {
                        format = String.format("%s • %s", m40371J, format);
                    }
                    this.f38261N.m111959G1(format);
                    this.f38261N.mo44614b1(0);
                } else if (!TextUtils.isEmpty(inviteContactProfile.f42541e2)) {
                    this.f38261N.m111959G1(inviteContactProfile.f42541e2);
                    this.f38261N.mo44614b1(0);
                } else {
                    this.f38261N.m111959G1("");
                    this.f38261N.mo44614b1(8);
                }
            }
            this.f38262O.mo89091D0(QuickCreateGroupAdapter.this.f38253v.contains(inviteContactProfile.f42434r));
            if (z12) {
                this.f38258K.setTag(1090453505, inviteContactProfile.f42434r);
                this.f38258K.mo111925v1(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.default_avatar2));
                return;
            }
            String str = inviteContactProfile.f42446v;
            C24003n m120143n = C23278z2.m120143n();
            if (TextUtils.isEmpty(str)) {
                this.f38258K.setTag(1090453505, inviteContactProfile.f42434r);
                this.f38258K.mo111925v1(m120143n.f116261b);
                return;
            }
            if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(inviteContactProfile.f42434r)) {
                String m40418n0 = inviteContactProfile.m40418n0();
                int m12307a = C2343e.m12307a(inviteContactProfile.f42434r, false);
                this.f38258K.setTag(1090453505, inviteContactProfile.f42446v + inviteContactProfile.f42434r);
                this.f38258K.mo111925v1(C16640q2.m88404a().mo88412f(m40418n0, m12307a));
                return;
            }
            AbstractC23268y2.m120033g(QuickCreateGroupAdapter.this.f38250s, this.f38259L, this.f38258K, str, m120143n, z11);
        }
    }

    /* loaded from: classes3.dex */
    public class LabelModulesView extends ModulesView implements InterfaceC6992c {

        /* renamed from: K */
        C16719g f38264K;

        /* renamed from: L */
        C22126c0 f38265L;

        /* renamed from: M */
        C16716d f38266M;

        /* renamed from: N */
        C22126c0 f38267N;

        /* renamed from: O */
        C21691a f38268O;

        public LabelModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            C16719g c16719g = new C16719g(context);
            this.f38264K = c16719g;
            c16719g.mo89161z0(QuickCreateGroupAdapter.this.f38246G);
            this.f38264K.m89106L().m89028L(-1, 1).m89034R(AbstractC23222t7.f112586t).m89036T(AbstractC23222t7.f112562h);
            C16716d c16716d = new C16716d(context);
            this.f38266M = c16716d;
            C16718f m89028L = c16716d.m89106L().m89028L(-2, -2);
            Boolean bool = Boolean.TRUE;
            m89028L.m89017A(bool).m89027K(true).m89023G(this.f38264K).m89036T(AbstractC23222t7.f112562h).m89033Q(AbstractC23222t7.f112552c).m89034R(AbstractC23222t7.f112586t).m89035S(AbstractC23222t7.f112586t);
            this.f38266M.mo44614b1(8);
            C21691a c21691a = new C21691a(context);
            this.f38268O = c21691a;
            C16718f m89027K = c21691a.m89106L().m89017A(bool).m89034R(AbstractC23222t7.f112566j).m89027K(true);
            int i11 = AbstractC23222t7.f112514B;
            m89027K.m89028L(i11, i11);
            this.f38268O.m111906k1(QuickCreateGroupAdapter.this.f38247H);
            this.f38268O.m111905j1(QuickCreateGroupAdapter.this.f38248I);
            this.f38268O.mo89093E0(false);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f38267N = c22126c0;
            c22126c0.mo111964L1(AbstractC23222t7.f112580q);
            this.f38267N.m111962J1(QuickCreateGroupAdapter.this.f38244E);
            this.f38267N.m111982x1(false);
            this.f38267N.m111958F1(AbstractC8020f0.select_all);
            this.f38267N.m89106L().m89028L(-2, -2).m89027K(true).m89029M(12).m89049e0(this.f38268O);
            this.f38266M.m89001g1(this.f38268O);
            this.f38266M.m89001g1(this.f38267N);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f38265L = c22126c02;
            c22126c02.mo111964L1(AbstractC23222t7.f112580q);
            this.f38265L.m111962J1(QuickCreateGroupAdapter.this.f38245F);
            this.f38265L.mo111965M1(1);
            this.f38265L.m111982x1(false);
            this.f38265L.m89106L().m89028L(-1, -2).m89029M(12).m89036T(AbstractC23222t7.f112576o).m89033Q(AbstractC23222t7.f112552c).m89034R(AbstractC23222t7.f112586t).m89023G(this.f38264K).m89049e0(this.f38266M);
            mo69681L(this.f38264K);
            mo69681L(this.f38266M);
            mo69681L(this.f38265L);
        }

        /* renamed from: W */
        public /* synthetic */ void m35822W(InviteContactProfile inviteContactProfile, C16719g c16719g) {
            InterfaceC6993d interfaceC6993d = QuickCreateGroupAdapter.this.f38242C;
            if (interfaceC6993d != null) {
                interfaceC6993d.mo35823a(inviteContactProfile);
            }
        }

        @Override // com.zing.zalo.adapters.QuickCreateGroupAdapter.InterfaceC6992c
        /* renamed from: I */
        public void mo35820I(C32141v0 c32141v0, int i11, boolean z11) {
            int i12;
            C6995f c6995f = (C6995f) c32141v0;
            this.f38265L.m111959G1(c6995f.f38273e);
            InviteContactProfile inviteContactProfile = c32141v0.f148234a;
            if (inviteContactProfile != null) {
                this.f38268O.mo89091D0(inviteContactProfile.f42543g2);
                C16716d c16716d = this.f38266M;
                if (inviteContactProfile.f42542f2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                c16716d.mo44614b1(i12);
                this.f38266M.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.m5

                    /* renamed from: q */
                    public final /* synthetic */ InviteContactProfile f39045q;

                    public /* synthetic */ C7140m5(InviteContactProfile inviteContactProfile2) {
                        r2 = inviteContactProfile2;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        QuickCreateGroupAdapter.LabelModulesView.this.m35822W(r2, c16719g);
                    }
                });
            } else {
                this.f38266M.mo44614b1(8);
            }
            if (c6995f.f38274f) {
                this.f38264K.mo44614b1(0);
            } else {
                this.f38264K.mo44614b1(8);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.QuickCreateGroupAdapter$a */
    /* loaded from: classes3.dex */
    public static class C6990a extends C6991b {

        /* renamed from: I */
        ModulesView f38270I;

        public C6990a(ModulesView modulesView) {
            super(modulesView);
            this.f38270I = modulesView;
        }

        @Override // com.zing.zalo.adapters.QuickCreateGroupAdapter.C6991b, com.zing.zalo.adapters.QuickCreateGroupAdapter.InterfaceC6992c
        /* renamed from: I */
        public void mo35820I(C32141v0 c32141v0, int i11, boolean z11) {
            ViewParent viewParent = this.f38270I;
            if (viewParent instanceof InterfaceC6992c) {
                ((InterfaceC6992c) viewParent).mo35820I(c32141v0, i11, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.QuickCreateGroupAdapter$b */
    /* loaded from: classes3.dex */
    public static class C6991b extends RecyclerView.AbstractC1876c0 implements InterfaceC6992c {
        public C6991b(View view) {
            super(view);
        }

        /* renamed from: I */
        public void mo35820I(C32141v0 c32141v0, int i11, boolean z11) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.QuickCreateGroupAdapter$c */
    /* loaded from: classes3.dex */
    private interface InterfaceC6992c {
        /* renamed from: I */
        void mo35820I(C32141v0 c32141v0, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.QuickCreateGroupAdapter$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC6993d {
        /* renamed from: a */
        void mo35823a(InviteContactProfile inviteContactProfile);
    }

    /* renamed from: com.zing.zalo.adapters.QuickCreateGroupAdapter$e */
    /* loaded from: classes3.dex */
    public class C6994e extends C6991b {

        /* renamed from: I */
        TextView f38271I;

        public C6994e(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(AbstractC6918a0.num_friend);
            this.f38271I = textView;
            textView.setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(75.0f));
        }

        @Override // com.zing.zalo.adapters.QuickCreateGroupAdapter.C6991b, com.zing.zalo.adapters.QuickCreateGroupAdapter.InterfaceC6992c
        /* renamed from: I */
        public void mo35820I(C32141v0 c32141v0, int i11, boolean z11) {
            int i12;
            this.f38271I.setVisibility(0);
            QuickCreateGroupAdapter quickCreateGroupAdapter = QuickCreateGroupAdapter.this;
            if (quickCreateGroupAdapter.f38254w) {
                int i13 = quickCreateGroupAdapter.f38256y;
                if (i13 == 0) {
                    this.f38271I.setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(32.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(75.0f));
                    this.f38271I.setText(AbstractC8020f0.str_empty_search_result);
                    return;
                }
                if (i13 == 1) {
                    this.f38271I.setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(75.0f));
                    QuickCreateGroupAdapter quickCreateGroupAdapter2 = QuickCreateGroupAdapter.this;
                    if (quickCreateGroupAdapter2.f38257z) {
                        this.f38271I.setText(AbstractC8020f0.str_search_result_stranger);
                        return;
                    }
                    if (quickCreateGroupAdapter2.f38240A) {
                        this.f38271I.setText(AbstractC8020f0.str_search_result_stranger_new_chat);
                        return;
                    } else if (quickCreateGroupAdapter2.f38241B) {
                        this.f38271I.setText(AbstractC8020f0.str_search_result_nonzalo);
                        return;
                    } else {
                        this.f38271I.setVisibility(8);
                        return;
                    }
                }
                this.f38271I.setVisibility(8);
                return;
            }
            int i14 = quickCreateGroupAdapter.f38255x;
            if (i14 != QuickCreateGroupView.f76612M2 && i14 != QuickCreateGroupView.f76613N2) {
                TextView textView = this.f38271I;
                String string = quickCreateGroupAdapter.f38249r.getString(AbstractC8020f0.str_refix_number_of_friend);
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(QuickCreateGroupAdapter.this.f38256y);
                QuickCreateGroupAdapter quickCreateGroupAdapter3 = QuickCreateGroupAdapter.this;
                int i15 = quickCreateGroupAdapter3.f38256y;
                Context context = quickCreateGroupAdapter3.f38249r;
                if (i15 > 1) {
                    i12 = AbstractC8020f0.str_more_s;
                } else {
                    i12 = AbstractC8020f0.str_single_form;
                }
                objArr[1] = context.getString(i12);
                textView.setText(String.format(string, objArr));
                return;
            }
            this.f38271I.setText(quickCreateGroupAdapter.f38249r.getString(AbstractC8020f0.str_swipe_left_to_see_more_contacts));
        }
    }

    /* renamed from: com.zing.zalo.adapters.QuickCreateGroupAdapter$f */
    /* loaded from: classes3.dex */
    public static class C6995f extends C32141v0 {

        /* renamed from: e */
        public String f38273e;

        /* renamed from: f */
        public boolean f38274f;

        public C6995f(String str) {
            super(1, null);
            this.f38274f = false;
            this.f38273e = str;
        }

        public C6995f(String str, InviteContactProfile inviteContactProfile) {
            super(1, inviteContactProfile);
            this.f38274f = false;
            this.f38273e = str;
        }
    }

    /* renamed from: com.zing.zalo.adapters.QuickCreateGroupAdapter$g */
    /* loaded from: classes3.dex */
    public static class C6996g extends C32141v0 {

        /* renamed from: e */
        public int f38275e;

        public C6996g(int i11) {
            super(4, null);
            this.f38275e = i11;
        }
    }

    public QuickCreateGroupAdapter(Context context, HashSet hashSet, boolean z11, int i11) {
        this.f38249r = context;
        this.f38253v = hashSet;
        this.f38250s = new C23528a(context);
        this.f38254w = z11;
        this.f38255x = i11;
        this.f38243D = C23212s8.m119607o(this.f38249r, AbstractC21196a.TextColor1);
        this.f38245F = C23212s8.m119607o(this.f38249r, AbstractC21196a.TextColor1);
        this.f38244E = C23212s8.m119607o(this.f38249r, AbstractC21196a.TextColor2);
        this.f38246G = C23212s8.m119607o(this.f38249r, AbstractC16781w.ItemSeparatorColor);
        this.f38247H = AbstractC23136l9.m118665N(this.f38249r, AbstractC16803z.icn_form_radio_unchecked);
        this.f38248I = AbstractC23136l9.m118665N(this.f38249r, AbstractC16803z.icn_form_radio_checked);
    }

    /* renamed from: L */
    public InviteContactProfile m35813L(int i11) {
        if (i11 >= 0 && i11 < this.f38252u.size()) {
            return ((C32141v0) this.f38252u.get(i11)).f148234a;
        }
        return null;
    }

    /* renamed from: M */
    public C32141v0 m35814M(int i11) {
        if (i11 >= 0 && i11 < this.f38252u.size()) {
            return (C32141v0) this.f38252u.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public void mo9990A(C6991b c6991b, int i11) {
        try {
            c6991b.mo35820I(m35814M(i11), i11, this.f38251t);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public C6991b mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return new C6991b(new View(viewGroup.getContext()));
                        }
                        return new C6991b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_see_more_global_search, viewGroup, false));
                    }
                    return new C6991b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.seperate_list_global_search, viewGroup, false));
                }
                return new C6994e(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.count_num_friend_changable_height_view, viewGroup, false));
            }
            return new C6990a(new LabelModulesView(viewGroup.getContext()));
        }
        return new C6990a(new ContactModulesView(viewGroup.getContext()));
    }

    /* renamed from: P */
    public void m35817P(InterfaceC6993d interfaceC6993d) {
        this.f38242C = interfaceC6993d;
    }

    /* renamed from: Q */
    public void m35818Q(ArrayList arrayList) {
        this.f38252u.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C32141v0 c32141v0 = (C32141v0) it.next();
            if (c32141v0.f148235b == 0) {
                if (!TextUtils.equals(c32141v0.f148234a.f42434r, CoreUtility.f89233i)) {
                    this.f38252u.add(c32141v0);
                }
            } else {
                this.f38252u.add(c32141v0);
            }
        }
    }

    /* renamed from: R */
    public void m35819R(int i11) {
        this.f38256y = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38252u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C32141v0) this.f38252u.get(i11)).f148235b;
    }
}
