package com.zing.zalo.calendar.adapters;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import ge.C19411c;
import ge.C19419k;
import java.util.ArrayList;
import java.util.Calendar;
import kd0.C21692b;
import kd0.C21693c;
import kd0.C21697g;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;

/* loaded from: classes3.dex */
public class GroupCalendarAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    Context f40332r;

    /* renamed from: s */
    ArrayList f40333s;

    /* renamed from: t */
    boolean f40334t;

    /* renamed from: u */
    final int f40335u;

    /* renamed from: v */
    final int f40336v;

    /* renamed from: w */
    final int f40337w;

    /* renamed from: x */
    final int f40338x;

    /* renamed from: y */
    String f40339y = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_cap);

    /* loaded from: classes3.dex */
    public class AddMoreModulesView extends ModulesView implements InterfaceC7422c {

        /* renamed from: K */
        C22126c0 f40340K;

        /* renamed from: L */
        C22126c0 f40341L;

        public AddMoreModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_bg_calendar_with_press_state));
            C21693c c21693c = new C21693c(context);
            C16718f m89027K = c21693c.m89106L().m89027K(true);
            int i11 = AbstractC23222t7.f112539R;
            m89027K.m89028L(i11, i11);
            c21693c.m111929z1(6);
            c21693c.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_add_item));
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89046b0(AbstractC23222t7.f112586t).m89027K(true).m89047c0(AbstractC23222t7.f112552c).m89028L(-1, -2).m89054h0(c21693c);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40340K = c22126c0;
            c22126c0.m89106L().m89028L(-2, -2);
            this.f40340K.mo111964L1(AbstractC23222t7.f112586t);
            this.f40340K.m111962J1(GroupCalendarAdapter.this.f40335u);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f40341L = c22126c02;
            c22126c02.m89106L().m89023G(this.f40340K).m89036T(AbstractC23222t7.f112556e).m89028L(-2, -2);
            this.f40341L.mo111964L1(AbstractC23222t7.f112582r);
            this.f40341L.m111962J1(GroupCalendarAdapter.this.f40336v);
            c16716d.m89001g1(this.f40340K);
            c16716d.m89001g1(this.f40341L);
            mo69681L(c21693c);
            mo69681L(c16716d);
        }

        @Override // com.zing.zalo.calendar.adapters.GroupCalendarAdapter.InterfaceC7422c
        /* renamed from: v */
        public void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11) {
            if (!(abstractC7424e instanceof C7420a)) {
                return;
            }
            int i12 = ((C7420a) abstractC7424e).f40365b;
            if (i12 != 1) {
                if (i12 == 2) {
                    this.f40340K.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_calendar_create_new_anniversary));
                    this.f40341L.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_anni_event_hint));
                    return;
                }
                return;
            }
            this.f40340K.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_calendar_create_new_reminder));
            this.f40341L.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_reminder_hint));
        }
    }

    /* loaded from: classes3.dex */
    public class EventModulesView extends ModulesView implements InterfaceC7422c {

        /* renamed from: K */
        C22126c0 f40343K;

        /* renamed from: L */
        C22126c0 f40344L;

        /* renamed from: M */
        C22126c0 f40345M;

        public EventModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_bg_calendar_with_press_state));
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40343K = c22126c0;
            C16718f m89029M = c22126c0.m89106L().m89027K(true).m89029M(15);
            int i11 = AbstractC23222t7.f112539R;
            m89029M.m89028L(i11, i11);
            this.f40343K.m111961I1(Layout.Alignment.ALIGN_CENTER);
            this.f40343K.mo111964L1(AbstractC23222t7.f112514B);
            this.f40343K.m111962J1(GroupCalendarAdapter.this.f40335u);
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89029M(12).m89027K(true).m89046b0(AbstractC23222t7.f112586t).m89047c0(AbstractC23222t7.f112552c).m89028L(-1, -2).m89054h0(this.f40343K);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f40344L = c22126c02;
            c22126c02.m89106L().m89028L(-1, -2);
            this.f40344L.mo111964L1(AbstractC23222t7.f112586t);
            this.f40344L.m111962J1(GroupCalendarAdapter.this.f40335u);
            this.f40344L.m111953A1(1);
            C22126c0 c22126c03 = this.f40344L;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c03.m111980v1(truncateAt);
            C22126c0 c22126c04 = new C22126c0(context);
            this.f40345M = c22126c04;
            c22126c04.m89106L().m89048d0(AbstractC23222t7.f112554d).m89028L(-1, -2).m89023G(this.f40344L);
            this.f40345M.mo111964L1(AbstractC23222t7.f112582r);
            this.f40345M.m111962J1(GroupCalendarAdapter.this.f40336v);
            this.f40345M.m111953A1(1);
            this.f40345M.m111980v1(truncateAt);
            c16716d.m89001g1(this.f40344L);
            c16716d.m89001g1(this.f40345M);
            mo69681L(this.f40343K);
            mo69681L(c16716d);
        }

        @Override // com.zing.zalo.calendar.adapters.GroupCalendarAdapter.InterfaceC7422c
        /* renamed from: v */
        public void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11) {
            C7423d c7423d;
            C19411c c19411c;
            String m119223V;
            String m119199J;
            String str;
            if (!(abstractC7424e instanceof C7423d) || (c19411c = (c7423d = (C7423d) abstractC7424e).f40368b) == null) {
                return;
            }
            this.f40344L.m111959G1(c19411c.f96286z);
            if (c7423d.f40369c == 1) {
                StringBuilder sb2 = new StringBuilder();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(c19411c.f96262b);
                sb2.append(AbstractC23160o0.m119246e0(calendar, false));
                if (c19411c.f96266f != 1) {
                    sb2.append(" ");
                    sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_at_time));
                    sb2.append(" ");
                    sb2.append(AbstractC23160o0.m119202K0(calendar.getTimeInMillis(), true));
                }
                if (AbstractC23160o0.m119247e1(c19411c.f96262b)) {
                    sb2.append(" - ");
                    sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_happening));
                } else {
                    sb2.append(" - ");
                    sb2.append(AbstractC23160o0.m119245e(c19411c.f96262b));
                }
                this.f40345M.m111959G1(sb2.toString());
            } else if (c19411c.f96266f == 1) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(c19411c.f96262b);
                C22126c0 c22126c0 = this.f40345M;
                if (c19411c.f96272l == 0) {
                    m119199J = AbstractC23160o0.m119191F(calendar2, true, true);
                } else {
                    m119199J = AbstractC23160o0.m119199J(calendar2, true, true, true);
                }
                c22126c0.m111959G1(m119199J);
            } else {
                C22126c0 c22126c02 = this.f40345M;
                if (c19411c.f96272l == 0) {
                    m119223V = AbstractC23160o0.m119213Q(c19411c.f96262b, true);
                } else {
                    m119223V = AbstractC23160o0.m119223V(c19411c.f96262b, true);
                }
                c22126c02.m111959G1(m119223V);
            }
            C22126c0 c22126c03 = this.f40343K;
            C19411c.b bVar = c19411c.f96282v;
            if (bVar != null) {
                str = bVar.f96314a;
            } else {
                str = "";
            }
            c22126c03.m111959G1(str);
        }
    }

    /* loaded from: classes3.dex */
    public class HintHeaderModulesView extends ModulesView implements InterfaceC7422c {
        public HintHeaderModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            C21693c c21693c = new C21693c(context);
            c21693c.m89106L().m89026J(true).m89028L(-2, -2).m89036T(AbstractC23222t7.f112594x);
            c21693c.mo111926w1(AbstractC16803z.illus_reminder);
            C21697g c21697g = new C21697g(context);
            c21697g.m89106L().m89028L(-2, -2).m89023G(c21693c).m89026J(true).m89034R(AbstractC23222t7.f112538Q).m89035S(AbstractC23222t7.f112538Q).m89036T(AbstractC23222t7.f112572m).m89033Q(AbstractC23222t7.f112588u);
            c21697g.mo111964L1(AbstractC23222t7.f112580q);
            c21697g.m111962J1(GroupCalendarAdapter.this.f40336v);
            c21697g.m111961I1(Layout.Alignment.ALIGN_CENTER);
            if (GroupCalendarAdapter.this.f40334t) {
                c21697g.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_community_calendar));
            } else {
                c21697g.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_calendar_hint_header_subtitle));
            }
            mo69681L(c21693c);
            mo69681L(c21697g);
        }

        @Override // com.zing.zalo.calendar.adapters.GroupCalendarAdapter.InterfaceC7422c
        /* renamed from: v */
        public void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11) {
        }
    }

    /* loaded from: classes3.dex */
    public class LabelModulesView extends ModulesView implements InterfaceC7422c {

        /* renamed from: K */
        C22126c0 f40348K;

        public LabelModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            int i11 = AbstractC23222t7.f112586t;
            setPadding(i11, i11, i11, i11);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40348K = c22126c0;
            c22126c0.mo111964L1(AbstractC23222t7.f112580q);
            this.f40348K.m111962J1(GroupCalendarAdapter.this.f40335u);
            this.f40348K.mo111965M1(1);
            this.f40348K.m111982x1(false);
            this.f40348K.m89106L().m89028L(-1, -2).m89029M(12);
            mo69681L(this.f40348K);
        }

        @Override // com.zing.zalo.calendar.adapters.GroupCalendarAdapter.InterfaceC7422c
        /* renamed from: v */
        public void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11) {
            if (!(abstractC7424e instanceof C7426g)) {
                return;
            }
            C7426g c7426g = (C7426g) abstractC7424e;
            if (!TextUtils.isEmpty(c7426g.f40371b)) {
                this.f40348K.m111959G1(c7426g.f40371b);
            } else {
                this.f40348K.m111959G1("");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class LoadingModulesView extends ModulesView implements InterfaceC7422c {

        /* renamed from: K */
        C21692b f40350K;

        /* renamed from: L */
        C22126c0 f40351L;

        /* renamed from: M */
        C22126c0 f40352M;

        /* renamed from: N */
        C16716d f40353N;

        public LoadingModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            int i11 = AbstractC23222t7.f112586t;
            setPadding(i11, i11, i11, i11);
            setGravity(3);
            this.f40353N = new C16716d(context);
            C21692b c21692b = new C21692b(context);
            this.f40350K = c21692b;
            C16718f m89106L = c21692b.m89106L();
            int i12 = AbstractC23222t7.f112586t;
            m89106L.m89028L(i12, i12).m89035S(AbstractC23222t7.f112562h).m89029M(12);
            this.f40350K.m111908h1(AbstractC23136l9.m118665N(context, AbstractC16803z.video_loading_big));
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40351L = c22126c0;
            c22126c0.mo111964L1(AbstractC23222t7.f112580q);
            this.f40351L.m111962J1(GroupCalendarAdapter.this.f40336v);
            this.f40351L.mo111965M1(0);
            this.f40351L.m111982x1(false);
            this.f40351L.m89106L().m89028L(-2, -2).m89054h0(this.f40350K).m89029M(12);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f40352M = c22126c02;
            c22126c02.mo111964L1(AbstractC23222t7.f112580q);
            this.f40352M.m111962J1(GroupCalendarAdapter.this.f40337w);
            this.f40352M.mo111965M1(1);
            this.f40352M.m111982x1(false);
            this.f40352M.m89106L().m89028L(-2, -2).m89054h0(this.f40351L).m89029M(12);
            this.f40352M.m111959G1(" " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
            this.f40353N.m89001g1(this.f40350K);
            this.f40353N.m89001g1(this.f40351L);
            this.f40353N.m89001g1(this.f40352M);
            mo69681L(this.f40353N);
        }

        @Override // com.zing.zalo.calendar.adapters.GroupCalendarAdapter.InterfaceC7422c
        /* renamed from: v */
        public void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11) {
            if (!(abstractC7424e instanceof C7427h)) {
                return;
            }
            int i12 = ((C7427h) abstractC7424e).f40372b;
            if (i12 != 1) {
                if (i12 != 2) {
                    setVisibility(8);
                    this.f40353N.mo44614b1(8);
                    return;
                } else {
                    this.f40353N.mo44614b1(0);
                    this.f40350K.mo44614b1(8);
                    this.f40351L.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_loading_content_failed));
                    this.f40352M.mo44614b1(0);
                    return;
                }
            }
            this.f40353N.mo44614b1(0);
            this.f40350K.mo44614b1(0);
            this.f40351L.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_loading_content));
            this.f40352M.mo44614b1(8);
        }
    }

    /* loaded from: classes3.dex */
    public class SeeMoreModulesView extends ModulesView implements InterfaceC7422c {
        public SeeMoreModulesView(Context context) {
            super(context);
            m88987U(-1, AbstractC23136l9.m118655I(AbstractC16802y.chat_seemore_item_height));
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_contact_bg));
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.m89106L().m89028L(-2, -2).m89046b0(AbstractC23222t7.f112586t).m89027K(true);
            c22126c0.mo111964L1(AbstractC23222t7.f112580q);
            c22126c0.m111962J1(GroupCalendarAdapter.this.f40336v);
            c22126c0.mo111965M1(1);
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_see_all));
            C21693c c21693c = new C21693c(context);
            c21693c.m89106L().m89034R(AbstractC23136l9.m118742r(4.0f)).m89027K(true).m89028L(-2, -2).m89054h0(c22126c0);
            c21693c.mo111926w1(AbstractC16803z.icn_more_small);
            mo69681L(c22126c0);
            mo69681L(c21693c);
        }

        @Override // com.zing.zalo.calendar.adapters.GroupCalendarAdapter.InterfaceC7422c
        /* renamed from: v */
        public void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11) {
        }
    }

    /* loaded from: classes3.dex */
    public class SeparatorModulesView extends ModulesView implements InterfaceC7422c {
        public SeparatorModulesView(Context context) {
            super(context);
            m88987U(-1, AbstractC23222t7.f112566j);
            setBackgroundColor(GroupCalendarAdapter.this.f40338x);
        }

        @Override // com.zing.zalo.calendar.adapters.GroupCalendarAdapter.InterfaceC7422c
        /* renamed from: v */
        public void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11) {
        }
    }

    /* loaded from: classes3.dex */
    public class SuggestionHeaderModulesView extends ModulesView implements InterfaceC7422c {
        public SuggestionHeaderModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89032P(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, 0).m89046b0(AbstractC23222t7.f112548a).m89047c0(AbstractC23222t7.f112548a).m89048d0(AbstractC23222t7.f112548a).m89028L(-1, -2);
            c16716d.m89087B0(AbstractC16803z.bg_rounded_top_6dp_gray_with_stroke);
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_suggestion_label));
            c22126c0.mo111964L1(AbstractC23222t7.f112582r);
            c22126c0.mo111965M1(1);
            c22126c0.m111962J1(GroupCalendarAdapter.this.f40335u);
            C16718f m89106L = c22126c0.m89106L();
            int i11 = AbstractC23222t7.f112586t;
            int i12 = AbstractC23222t7.f112572m;
            m89106L.m89042Z(i11, i12, i12, i12).m89028L(-1, -2);
            c16716d.m89001g1(c22126c0);
            mo69681L(c16716d);
        }

        @Override // com.zing.zalo.calendar.adapters.GroupCalendarAdapter.InterfaceC7422c
        /* renamed from: v */
        public void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11) {
        }
    }

    /* loaded from: classes3.dex */
    public class SuggestionModulesView extends ModulesView implements InterfaceC7422c {

        /* renamed from: K */
        C16716d f40358K;

        /* renamed from: L */
        C16716d f40359L;

        /* renamed from: M */
        C22126c0 f40360M;

        /* renamed from: N */
        C22126c0 f40361N;

        /* renamed from: O */
        C22126c0 f40362O;

        /* renamed from: P */
        C22126c0 f40363P;

        public SuggestionModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            C16716d c16716d = new C16716d(context);
            this.f40358K = c16716d;
            C16718f m89048d0 = c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23222t7.f112548a).m89047c0(AbstractC23222t7.f112548a).m89044a0(0).m89048d0(0);
            int i11 = AbstractC23222t7.f112586t;
            m89048d0.m89032P(i11, 0, i11, 0);
            C16716d c16716d2 = new C16716d(context);
            this.f40359L = c16716d2;
            c16716d2.m89106L().m89028L(-1, -2);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f40360M = c22126c0;
            C16718f m89029M = c22126c0.m89106L().m89027K(true).m89029M(15);
            int i12 = AbstractC23222t7.f112539R;
            m89029M.m89028L(i12, i12);
            this.f40360M.m111961I1(Layout.Alignment.ALIGN_CENTER);
            this.f40360M.mo111964L1(AbstractC23222t7.f112514B);
            this.f40360M.m111962J1(GroupCalendarAdapter.this.f40335u);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f40363P = c22126c02;
            c22126c02.m89106L().m89042Z(AbstractC23222t7.f112586t, AbstractC23222t7.f112562h, AbstractC23222t7.f112586t, AbstractC23222t7.f112562h).m89035S(AbstractC23222t7.f112586t).m89027K(true).m89017A(Boolean.TRUE).m89028L(-2, -2);
            this.f40363P.m111959G1(GroupCalendarAdapter.this.f40339y);
            AbstractC23022b5.m118023a(this.f40363P, AbstractC8915g0.btnType3_small);
            C16716d c16716d3 = new C16716d(context);
            c16716d3.m89106L().m89029M(12).m89046b0(AbstractC23222t7.f112586t).m89027K(true).m89047c0(AbstractC23222t7.f112552c).m89028L(-1, -2).m89054h0(this.f40360M).m89049e0(this.f40363P);
            C22126c0 c22126c03 = new C22126c0(context);
            this.f40361N = c22126c03;
            c22126c03.m89106L().m89028L(-1, -2);
            this.f40361N.mo111964L1(AbstractC23222t7.f112586t);
            this.f40361N.m111962J1(GroupCalendarAdapter.this.f40335u);
            this.f40361N.m111953A1(1);
            C22126c0 c22126c04 = this.f40361N;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c04.m111980v1(truncateAt);
            C22126c0 c22126c05 = new C22126c0(context);
            this.f40362O = c22126c05;
            c22126c05.m89106L().m89048d0(AbstractC23222t7.f112554d).m89028L(-1, -2).m89023G(this.f40361N);
            this.f40362O.mo111964L1(AbstractC23222t7.f112582r);
            this.f40362O.m111962J1(GroupCalendarAdapter.this.f40336v);
            this.f40362O.m111953A1(1);
            this.f40362O.m111980v1(truncateAt);
            this.f40362O.mo44614b1(8);
            c16716d3.m89001g1(this.f40361N);
            c16716d3.m89001g1(this.f40362O);
            this.f40359L.m89001g1(this.f40360M);
            this.f40359L.m89001g1(this.f40363P);
            this.f40359L.m89001g1(c16716d3);
            this.f40358K.m89001g1(this.f40359L);
            mo69681L(this.f40358K);
        }

        @Override // com.zing.zalo.calendar.adapters.GroupCalendarAdapter.InterfaceC7422c
        /* renamed from: v */
        public void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11) {
            C7431l c7431l;
            C19419k c19419k;
            if (!(abstractC7424e instanceof C7431l) || (c19419k = (c7431l = (C7431l) abstractC7424e).f40374b) == null) {
                return;
            }
            if (c7431l.f40375c) {
                this.f40358K.m89106L().m89044a0(AbstractC23222t7.f112548a).m89033Q(AbstractC23222t7.f112572m);
                this.f40358K.m89087B0(AbstractC16803z.bg_rounded_btm_6dp_with_stroke);
                this.f40359L.m89087B0(AbstractC16803z.bg_white_rounded_btm_6dp_with_press_state);
            } else {
                this.f40358K.m89106L().m89044a0(0).m89033Q(0);
                this.f40358K.m89087B0(AbstractC16803z.bg_stroke_cline_0_5);
                this.f40359L.m89087B0(AbstractC16803z.stencils_bg_calendar_with_press_state);
            }
            this.f40361N.m111959G1(c19419k.f96345c);
            this.f40360M.m111959G1(c19419k.f96346d);
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$a */
    /* loaded from: classes3.dex */
    public static class C7420a extends AbstractC7424e {

        /* renamed from: b */
        public int f40365b;

        public C7420a(int i11) {
            super(4);
            this.f40365b = i11;
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$b */
    /* loaded from: classes3.dex */
    public class C7421b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        ModulesView f40366I;

        public C7421b(ModulesView modulesView) {
            super(modulesView);
            this.f40366I = modulesView;
        }

        /* renamed from: i0 */
        public void m37669i0(int i11) {
            AbstractC7424e m37664L = GroupCalendarAdapter.this.m37664L(i11);
            ViewParent viewParent = this.f40366I;
            if (viewParent instanceof InterfaceC7422c) {
                ((InterfaceC7422c) viewParent).mo37668v(m37664L, i11, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7422c {
        /* renamed from: v */
        void mo37668v(AbstractC7424e abstractC7424e, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$d */
    /* loaded from: classes3.dex */
    public static class C7423d extends AbstractC7424e {

        /* renamed from: b */
        public C19411c f40368b;

        /* renamed from: c */
        public int f40369c;

        public C7423d(C19411c c19411c, int i11) {
            super(1);
            this.f40368b = c19411c;
            this.f40369c = i11;
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$e */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7424e {

        /* renamed from: a */
        private final int f40370a;

        protected AbstractC7424e(int i11) {
            this.f40370a = i11;
        }

        /* renamed from: b */
        public int m37671b() {
            return this.f40370a;
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$f */
    /* loaded from: classes3.dex */
    public static class C7425f extends AbstractC7424e {
        public C7425f() {
            super(8);
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$g */
    /* loaded from: classes3.dex */
    public static class C7426g extends AbstractC7424e {

        /* renamed from: b */
        public String f40371b;

        public C7426g(String str) {
            super(5);
            this.f40371b = str;
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$h */
    /* loaded from: classes3.dex */
    public static class C7427h extends AbstractC7424e {

        /* renamed from: b */
        public int f40372b;

        public C7427h(int i11) {
            super(9);
            this.f40372b = i11;
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$i */
    /* loaded from: classes3.dex */
    public static class C7428i extends AbstractC7424e {

        /* renamed from: b */
        public int f40373b;

        public C7428i(int i11) {
            super(6);
            this.f40373b = i11;
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$j */
    /* loaded from: classes3.dex */
    public static class C7429j extends AbstractC7424e {
        public C7429j() {
            super(7);
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$k */
    /* loaded from: classes3.dex */
    public static class C7430k extends AbstractC7424e {
        public C7430k() {
            super(3);
        }
    }

    /* renamed from: com.zing.zalo.calendar.adapters.GroupCalendarAdapter$l */
    /* loaded from: classes3.dex */
    public static class C7431l extends AbstractC7424e {

        /* renamed from: b */
        public C19419k f40374b;

        /* renamed from: c */
        public boolean f40375c;

        public C7431l(C19419k c19419k) {
            super(2);
            this.f40375c = false;
            this.f40374b = c19419k;
        }
    }

    public GroupCalendarAdapter(Context context, ArrayList arrayList, boolean z11) {
        this.f40332r = context;
        this.f40335u = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f40336v = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f40337w = C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor);
        this.f40338x = C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor);
        this.f40334t = z11;
        m37667O(arrayList);
    }

    /* renamed from: L */
    public AbstractC7424e m37664L(int i11) {
        if (i11 >= 0 && i11 < this.f40333s.size()) {
            return (AbstractC7424e) this.f40333s.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(C7421b c7421b, int i11) {
        try {
            c7421b.m37669i0(i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public C7421b mo9992C(ViewGroup viewGroup, int i11) {
        switch (i11) {
            case 1:
                return new C7421b(new EventModulesView(viewGroup.getContext()));
            case 2:
                return new C7421b(new SuggestionModulesView(viewGroup.getContext()));
            case 3:
                return new C7421b(new SuggestionHeaderModulesView(viewGroup.getContext()));
            case 4:
                return new C7421b(new AddMoreModulesView(viewGroup.getContext()));
            case 5:
                return new C7421b(new LabelModulesView(viewGroup.getContext()));
            case 6:
                return new C7421b(new SeeMoreModulesView(viewGroup.getContext()));
            case 7:
                return new C7421b(new SeparatorModulesView(viewGroup.getContext()));
            case 8:
                return new C7421b(new HintHeaderModulesView(viewGroup.getContext()));
            case 9:
                return new C7421b(new LoadingModulesView(viewGroup.getContext()));
            default:
                return new C7421b(new ModulesView(viewGroup.getContext()));
        }
    }

    /* renamed from: O */
    public void m37667O(ArrayList arrayList) {
        if (arrayList == null) {
            this.f40333s = new ArrayList();
        } else {
            this.f40333s = new ArrayList(arrayList);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f40333s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 >= 0 && i11 < this.f40333s.size()) {
            return ((AbstractC7424e) this.f40333s.get(i11)).f40370a;
        }
        return 0;
    }
}
