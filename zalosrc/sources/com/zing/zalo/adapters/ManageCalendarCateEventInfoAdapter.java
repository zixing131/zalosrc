package com.zing.zalo.adapters;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.AbstractC17466e;
import ee.C18408p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ge.C19410b;
import ge.C19423o;
import java.util.ArrayList;
import kd0.C21692b;
import kd0.C21696f;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p716zh.C31982k;

/* loaded from: classes3.dex */
public final class ManageCalendarCateEventInfoAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final Context f38111r;

    /* renamed from: s */
    private final C23528a f38112s;

    /* renamed from: t */
    private final boolean f38113t;

    /* renamed from: u */
    private ArrayList f38114u;

    /* renamed from: v */
    public InterfaceC6972g f38115v;

    /* renamed from: w */
    private C6971f f38116w;

    /* loaded from: classes3.dex */
    public static final class AddEventModulesView extends ModulesView implements InterfaceC6968c {

        /* renamed from: K */
        private C22122a0 f38117K;

        /* renamed from: L */
        private C22126c0 f38118L;

        /* renamed from: M */
        private C16719g f38119M;

        public AddEventModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_comment_bg));
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89028L(-1, -2);
            C22122a0 c22122a0 = new C22122a0(context);
            C16718f m89106L = c22122a0.m89106L();
            int i11 = AbstractC23222t7.f112539R;
            C16718f m89027K = m89106L.m89028L(i11, i11).m89035S(AbstractC23222t7.f112576o).m89036T(AbstractC23222t7.f112562h).m89033Q(AbstractC23222t7.f112562h).m89034R(AbstractC23222t7.f112586t).m89027K(true);
            Boolean bool = Boolean.TRUE;
            m89027K.m89073z(bool);
            this.f38117K = c22122a0;
            C16716d c16716d2 = new C16716d(context);
            c16716d2.m89106L().m89028L(-1, -1).m89054h0(this.f38117K);
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.mo111964L1(AbstractC23222t7.f112584s);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c22126c0.m89106L().m89028L(-1, -2).m89027K(true);
            this.f38118L = c22126c0;
            C16719g c16719g = new C16719g(context);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            c16719g.m89106L().m89028L(-1, AbstractC23222t7.f112548a).m89072y(bool);
            this.f38119M = c16719g;
            c16716d2.m89001g1(this.f38118L);
            c16716d2.m89001g1(this.f38119M);
            c16716d.m89001g1(this.f38117K);
            c16716d.m89001g1(c16716d2);
            mo69681L(c16716d);
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6968c
        /* renamed from: E */
        public void mo35727E(C31982k c31982k, int i11, boolean z11) {
            AbstractC19074t.m100208f(c31982k, "item");
            this.f38117K.mo111926w1(AbstractC16803z.icn_add_item);
            this.f38118L.m111959G1(c31982k.f147042d);
        }

        public final C22122a0 getIvAvatar() {
            return this.f38117K;
        }

        public final C22126c0 getTvTitle() {
            return this.f38118L;
        }

        public final C16719g getUnderline() {
            return this.f38119M;
        }

        public final void setIvAvatar(C22122a0 c22122a0) {
            AbstractC19074t.m100208f(c22122a0, "<set-?>");
            this.f38117K = c22122a0;
        }

        public final void setTvTitle(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38118L = c22126c0;
        }

        public final void setUnderline(C16719g c16719g) {
            AbstractC19074t.m100208f(c16719g, "<set-?>");
            this.f38119M = c16719g;
        }
    }

    /* loaded from: classes3.dex */
    public static final class HeaderModuleView extends ModulesView implements InterfaceC6968c {

        /* renamed from: K */
        private C22126c0 f38120K;

        /* renamed from: L */
        private C16719g f38121L;

        public HeaderModuleView(Context context) {
            super(context);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC17466e.white));
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.mo111964L1(AbstractC23222t7.f112584s);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
            c22126c0.m89106L().m89028L(-1, -2).m89042Z(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
            this.f38120K = c22126c0;
            C16719g c16719g = new C16719g(this.f84675p);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            c16719g.m89106L().m89028L(-1, AbstractC23222t7.f112550b).m89023G(this.f38120K);
            this.f38121L = c16719g;
            mo69681L(this.f38120K);
            mo69681L(this.f38121L);
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6968c
        /* renamed from: E */
        public void mo35727E(C31982k c31982k, int i11, boolean z11) {
            AbstractC19074t.m100208f(c31982k, "item");
            this.f38120K.m111959G1(c31982k.f147042d);
        }

        public final C22126c0 getMContent() {
            return this.f38120K;
        }

        public final C16719g getMSeparate() {
            return this.f38121L;
        }

        public final void setMContent(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38120K = c22126c0;
        }

        public final void setMSeparate(C16719g c16719g) {
            AbstractC19074t.m100208f(c16719g, "<set-?>");
            this.f38121L = c16719g;
        }
    }

    /* loaded from: classes3.dex */
    public static final class LabelModulesView extends ModulesView implements InterfaceC6968c {

        /* renamed from: K */
        private C16719g f38122K;

        /* renamed from: L */
        private C22126c0 f38123L;

        public LabelModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
            C16719g c16719g = new C16719g(context);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
            c16719g.m89106L().m89028L(-1, AbstractC23222t7.f112566j);
            this.f38122K = c16719g;
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.mo111964L1(AbstractC23222t7.f112580q);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.SectionTitleColor1));
            c22126c0.mo111965M1(1);
            c22126c0.m111982x1(false);
            c22126c0.m89106L().m89028L(-1, -2).m89029M(12).m89036T(AbstractC23222t7.f112582r).m89033Q(AbstractC23222t7.f112582r).m89034R(AbstractC23222t7.f112586t).m89023G(this.f38122K);
            this.f38123L = c22126c0;
            mo69681L(this.f38122K);
            mo69681L(this.f38123L);
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6968c
        /* renamed from: E */
        public void mo35727E(C31982k c31982k, int i11, boolean z11) {
            AbstractC19074t.m100208f(c31982k, "item");
            if (!(c31982k instanceof C6969d)) {
                return;
            }
            this.f38123L.m111959G1(c31982k.f147042d);
            if (((C6969d) c31982k).m35732a()) {
                this.f38122K.mo44614b1(0);
            } else {
                this.f38122K.mo44614b1(8);
            }
        }

        public final C16719g getSeparateLineHeader() {
            return this.f38122K;
        }

        public final C22126c0 getTitleRow() {
            return this.f38123L;
        }

        public final void setSeparateLineHeader(C16719g c16719g) {
            AbstractC19074t.m100208f(c16719g, "<set-?>");
            this.f38122K = c16719g;
        }

        public final void setTitleRow(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38123L = c22126c0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class LearnMoreModulesView extends ModulesView implements InterfaceC6968c {

        /* renamed from: K */
        private C22126c0 f38124K;

        /* renamed from: L */
        private C16719g f38125L;

        public LearnMoreModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.mo111964L1(AbstractC23222t7.f112576o);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor));
            c22126c0.m111982x1(false);
            c22126c0.m89106L().m89028L(-1, -2).m89029M(12).m89033Q(AbstractC23222t7.f112576o).m89035S(AbstractC23222t7.f112586t).m89034R(AbstractC23222t7.f112586t);
            this.f38124K = c22126c0;
            C16719g c16719g = new C16719g(context);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            c16719g.m89106L().m89028L(-1, AbstractC23222t7.f112548a).m89034R(AbstractC23222t7.f112586t).m89023G(this.f38124K);
            this.f38125L = c16719g;
            mo69681L(this.f38124K);
            mo69681L(this.f38125L);
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6968c
        /* renamed from: E */
        public void mo35727E(C31982k c31982k, int i11, boolean z11) {
            AbstractC19074t.m100208f(c31982k, "item");
            if (!(c31982k instanceof C6970e)) {
                return;
            }
            this.f38124K.m111959G1(c31982k.f147042d);
            this.f38125L.mo44614b1(0);
        }

        public final C16719g getDividerLine() {
            return this.f38125L;
        }

        public final C22126c0 getTitleRow() {
            return this.f38124K;
        }

        public final void setDividerLine(C16719g c16719g) {
            AbstractC19074t.m100208f(c16719g, "<set-?>");
            this.f38125L = c16719g;
        }

        public final void setTitleRow(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38124K = c22126c0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class LoadingModulesView extends ModulesView implements InterfaceC6968c {

        /* renamed from: K */
        private C21692b f38126K;

        public LoadingModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC17466e.transparent));
            C21692b c21692b = new C21692b(context);
            C16718f m89106L = c21692b.m89106L();
            int i11 = AbstractC23222t7.f112586t;
            m89106L.m89028L(i11, i11).m89036T(AbstractC23222t7.f112566j).m89033Q(AbstractC23222t7.f112566j).m89025I(true);
            this.f38126K = c21692b;
            mo69681L(c21692b);
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6968c
        /* renamed from: E */
        public void mo35727E(C31982k c31982k, int i11, boolean z11) {
            AbstractC19074t.m100208f(c31982k, "item");
        }

        public final C21692b getLoading() {
            return this.f38126K;
        }

        public final void setLoading(C21692b c21692b) {
            AbstractC19074t.m100208f(c21692b, "<set-?>");
            this.f38126K = c21692b;
        }
    }

    /* loaded from: classes3.dex */
    public final class OAEventModulesView extends ModulesView implements InterfaceC6968c {

        /* renamed from: K */
        private C22122a0 f38127K;

        /* renamed from: L */
        private C22126c0 f38128L;

        /* renamed from: M */
        private C22126c0 f38129M;

        /* renamed from: N */
        private C16719g f38130N;

        /* renamed from: O */
        private C22122a0 f38131O;

        /* renamed from: P */
        final /* synthetic */ ManageCalendarCateEventInfoAdapter f38132P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAEventModulesView(ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter, Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f38132P = manageCalendarCateEventInfoAdapter;
            m88987U(-1, -2);
            setPadding(AbstractC23222t7.f112586t, 0, 0, 0);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_comment_bg));
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89028L(-1, -2).m89029M(12);
            C22122a0 c22122a0 = new C22122a0(context);
            C16718f m89106L = c22122a0.m89106L();
            int i11 = AbstractC23222t7.f112539R;
            C16718f m89027K = m89106L.m89028L(i11, i11).m89035S(AbstractC23222t7.f112586t).m89036T(AbstractC23222t7.f112562h).m89033Q(AbstractC23222t7.f112562h).m89027K(true);
            Boolean bool = Boolean.TRUE;
            m89027K.m89073z(bool);
            this.f38127K = c22122a0;
            C22122a0 c22122a02 = new C22122a0(context);
            C16718f m89106L2 = c22122a02.m89106L();
            int i12 = AbstractC23222t7.f112539R;
            m89106L2.m89028L(i12, i12).m89047c0(AbstractC23222t7.f112582r).m89046b0(AbstractC23222t7.f112582r).m89044a0(AbstractC23222t7.f112582r).m89048d0(AbstractC23222t7.f112582r).m89017A(bool).m89027K(true);
            this.f38131O = c22122a02;
            C16716d c16716d2 = new C16716d(context);
            c16716d2.m89106L().m89028L(-1, -2).m89027K(true).m89035S(AbstractC23222t7.f112586t).m89054h0(this.f38127K).m89049e0(this.f38131O);
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.mo111964L1(AbstractC23222t7.f112584s);
            c22126c0.mo111965M1(1);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c22126c0.m111953A1(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            c22126c0.m89106L().m89028L(-1, -2).m89073z(bool);
            this.f38128L = c22126c0;
            C22126c0 c22126c02 = new C22126c0(context);
            c22126c02.mo111964L1(AbstractC23222t7.f112580q);
            c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            c22126c02.m111953A1(1);
            c22126c02.m111980v1(truncateAt);
            c22126c02.m89106L().m89028L(-1, -2).m89023G(this.f38128L).m89073z(bool);
            this.f38129M = c22126c02;
            C16719g c16719g = new C16719g(context);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            c16719g.m89106L().m89028L(-1, AbstractC23222t7.f112548a).m89072y(bool).m89054h0(this.f38127K);
            this.f38130N = c16719g;
            c16716d2.m89001g1(this.f38128L);
            c16716d2.m89001g1(this.f38129M);
            c16716d.m89001g1(this.f38127K);
            c16716d.m89001g1(this.f38131O);
            c16716d.m89001g1(c16716d2);
            c16716d.m89001g1(this.f38130N);
            mo69681L(c16716d);
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6968c
        /* renamed from: E */
        public void mo35727E(C31982k c31982k, int i11, boolean z11) {
            C19423o c19423o;
            AbstractC19074t.m100208f(c31982k, "item");
            this.f38129M.mo44614b1(8);
            int i12 = c31982k.f147039a;
            if (i12 != 1) {
                if (i12 == 2 && (c19423o = c31982k.f147040b) != null) {
                    ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = this.f38132P;
                    this.f38130N.mo44614b1(8);
                    this.f38131O.mo44614b1(8);
                    this.f38127K.m115375G1(manageCalendarCateEventInfoAdapter.f38112s, c19423o.f96366c, C23278z2.m120143n());
                    this.f38128L.m111959G1(c19423o.f96365b);
                    if (!TextUtils.isEmpty(c19423o.f96367d)) {
                        C22126c0 c22126c0 = this.f38129M;
                        c22126c0.mo44614b1(0);
                        c22126c0.m111959G1(c19423o.f96367d);
                        return;
                    }
                    return;
                }
                return;
            }
            C19410b c19410b = c31982k.f147041c;
            if (c19410b != null) {
                this.f38127K.m115375G1(this.f38132P.f38112s, c19410b.f96256e, C23278z2.m120106Y());
                this.f38128L.m111959G1(c19410b.f96253b);
                C22126c0 c22126c02 = this.f38129M;
                c22126c02.mo44614b1(0);
                c22126c02.m111959G1(c19410b.f96258g);
                this.f38131O.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_menu_more));
            }
        }

        public final C22122a0 getIvAvatar() {
            return this.f38127K;
        }

        public final C22122a0 getIvIcon() {
            return this.f38131O;
        }

        public final C22126c0 getTvSubtitle() {
            return this.f38129M;
        }

        public final C22126c0 getTvTitle() {
            return this.f38128L;
        }

        public final C16719g getUnderline() {
            return this.f38130N;
        }

        public final void setIvAvatar(C22122a0 c22122a0) {
            AbstractC19074t.m100208f(c22122a0, "<set-?>");
            this.f38127K = c22122a0;
        }

        public final void setIvIcon(C22122a0 c22122a0) {
            AbstractC19074t.m100208f(c22122a0, "<set-?>");
            this.f38131O = c22122a0;
        }

        public final void setTvSubtitle(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38129M = c22126c0;
        }

        public final void setTvTitle(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38128L = c22126c0;
        }

        public final void setUnderline(C16719g c16719g) {
            AbstractC19074t.m100208f(c16719g, "<set-?>");
            this.f38130N = c16719g;
        }
    }

    /* loaded from: classes3.dex */
    public final class OAEventSuggestModulesView extends ModulesView implements InterfaceC6968c {

        /* renamed from: K */
        private C22122a0 f38133K;

        /* renamed from: L */
        private C22126c0 f38134L;

        /* renamed from: M */
        private C21696f f38135M;

        /* renamed from: N */
        private C16716d f38136N;

        /* renamed from: O */
        private C31982k f38137O;

        /* renamed from: P */
        private int f38138P;

        public OAEventSuggestModulesView(Context context) {
            super(context);
            this.f38138P = -1;
            m88987U(-1, -2);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC17466e.white));
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89028L(-1, -2).m89048d0(AbstractC23222t7.f112562h).m89046b0(AbstractC23222t7.f112586t).m89047c0(AbstractC23222t7.f112586t).m89044a0(AbstractC23222t7.f112562h);
            C22122a0 c22122a0 = new C22122a0(context);
            C16718f m89106L = c22122a0.m89106L();
            int i11 = AbstractC23222t7.f112539R;
            C16718f m89035S = m89106L.m89028L(i11, i11).m89035S(AbstractC23222t7.f112576o);
            Boolean bool = Boolean.TRUE;
            m89035S.m89073z(bool).m89027K(true);
            this.f38133K = c22122a0;
            C21696f c21696f = new C21696f(context);
            c21696f.m89106L().m89028L(-2, -2).m89042Z(AbstractC23222t7.f112586t, 0, 0, 0).m89029M(15).m89017A(bool).m89027K(true);
            this.f38135M = c21696f;
            C16716d c16716d2 = new C16716d(context);
            c16716d2.m89106L().m89028L(-2, -2).m89029M(15).m89017A(bool).m89027K(true);
            c16716d2.m89001g1(this.f38135M);
            this.f38136N = c16716d2;
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.mo111964L1(AbstractC23222t7.f112584s);
            c22126c0.mo111965M1(1);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c22126c0.m111953A1(1);
            c22126c0.m111980v1(TextUtils.TruncateAt.END);
            c22126c0.m89106L().m89028L(-2, -2).m89049e0(this.f38136N).m89054h0(this.f38133K).m89027K(true);
            this.f38134L = c22126c0;
            c16716d.m89001g1(this.f38133K);
            c16716d.m89001g1(this.f38136N);
            c16716d.m89001g1(this.f38134L);
            mo69681L(c16716d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: X */
        public static final void m35730X(ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter, C19410b c19410b, OAEventSuggestModulesView oAEventSuggestModulesView, C16719g c16719g) {
            AbstractC19074t.m100208f(manageCalendarCateEventInfoAdapter, "this$0");
            AbstractC19074t.m100208f(c19410b, "$this_apply");
            AbstractC19074t.m100208f(oAEventSuggestModulesView, "this$1");
            C6971f m35721N = manageCalendarCateEventInfoAdapter.m35721N();
            if (m35721N != null) {
                m35721N.mo35734b(c19410b);
            }
            oAEventSuggestModulesView.f38135M.mo89091D0(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y */
        public static final void m35731Y(ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter, C19410b c19410b, C16719g c16719g) {
            AbstractC19074t.m100208f(manageCalendarCateEventInfoAdapter, "this$0");
            AbstractC19074t.m100208f(c19410b, "$this_apply");
            C6971f m35721N = manageCalendarCateEventInfoAdapter.m35721N();
            if (m35721N != null) {
                m35721N.mo35733a(c19410b);
            }
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6968c
        /* renamed from: E */
        public void mo35727E(C31982k c31982k, int i11, boolean z11) {
            AbstractC19074t.m100208f(c31982k, "item");
            this.f38137O = c31982k;
            final C19410b c19410b = c31982k.f147041c;
            if (c19410b != null) {
                final ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = ManageCalendarCateEventInfoAdapter.this;
                this.f38135M.mo89091D0(c19410b.f96255d);
                this.f38135M.mo89093E0(false);
                if (c19410b.f96255d) {
                    this.f38136N.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.j3
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            ManageCalendarCateEventInfoAdapter.OAEventSuggestModulesView.m35730X(ManageCalendarCateEventInfoAdapter.this, c19410b, this, c16719g);
                        }
                    });
                } else {
                    this.f38136N.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.k3
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            ManageCalendarCateEventInfoAdapter.OAEventSuggestModulesView.m35731Y(ManageCalendarCateEventInfoAdapter.this, c19410b, c16719g);
                        }
                    });
                }
                this.f38133K.m115375G1(manageCalendarCateEventInfoAdapter.f38112s, c19410b.f96256e, C23278z2.m120106Y());
                this.f38134L.m111959G1(c19410b.f96253b);
            }
        }

        public final C31982k getData() {
            return this.f38137O;
        }

        public final C22122a0 getIvAvatar() {
            return this.f38133K;
        }

        public final int getPosition() {
            return this.f38138P;
        }

        public final C22126c0 getTvTitle() {
            return this.f38134L;
        }

        public final void setData(C31982k c31982k) {
            this.f38137O = c31982k;
        }

        public final void setIvAvatar(C22122a0 c22122a0) {
            AbstractC19074t.m100208f(c22122a0, "<set-?>");
            this.f38133K = c22122a0;
        }

        public final void setPosition(int i11) {
            this.f38138P = i11;
        }

        public final void setTvTitle(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38134L = c22126c0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PersonalSettingModuleView extends ModulesView implements InterfaceC6968c {

        /* renamed from: K */
        private C21696f f38140K;

        /* renamed from: L */
        private C22126c0 f38141L;

        /* renamed from: M */
        private C22126c0 f38142M;

        /* renamed from: N */
        private C16719g f38143N;

        public PersonalSettingModuleView(Context context) {
            super(context);
            m88987U(-1, -2);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_comment_bg));
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89028L(-1, -2).m89048d0(AbstractC23222t7.f112576o).m89044a0(AbstractC23222t7.f112576o).m89046b0(AbstractC23222t7.f112586t).m89047c0(AbstractC23222t7.f112586t);
            C21696f c21696f = new C21696f(context);
            c21696f.m89106L().m89028L(-2, -2).m89017A(Boolean.TRUE).m89034R(AbstractC23136l9.m118742r(8.0f));
            c21696f.mo89099H0(false);
            c21696f.mo44614b1(8);
            this.f38140K = c21696f;
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.mo111964L1(AbstractC23222t7.f112586t);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c22126c0.m89106L().m89028L(-1, -2).m89049e0(this.f38140K);
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_unmute_calendar_thread));
            this.f38141L = c22126c0;
            C22126c0 c22126c02 = new C22126c0(context);
            c22126c02.mo111964L1(AbstractC23222t7.f112582r);
            c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            c22126c02.m89106L().m89028L(-1, -2).m89023G(this.f38141L).m89049e0(this.f38140K);
            this.f38142M = c22126c02;
            c16716d.m89001g1(this.f38140K);
            c16716d.m89001g1(this.f38141L);
            c16716d.m89001g1(this.f38142M);
            C16719g c16719g = new C16719g(context);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            c16719g.m89106L().m89028L(-1, AbstractC23222t7.f112548a).m89034R(AbstractC23222t7.f112586t).m89023G(c16716d);
            this.f38143N = c16719g;
            mo69681L(c16716d);
            mo69681L(this.f38143N);
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6968c
        /* renamed from: E */
        public void mo35727E(C31982k c31982k, int i11, boolean z11) {
            AbstractC19074t.m100208f(c31982k, "item");
            if (!(c31982k instanceof C6973h)) {
                return;
            }
            C6973h c6973h = (C6973h) c31982k;
            int i12 = c6973h.f38148e;
            int i13 = 8;
            if (i12 != 1) {
                if (i12 == 2) {
                    this.f38141L.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_calendar_shortcut));
                    this.f38140K.mo44614b1(8);
                    this.f38142M.mo44614b1(8);
                }
            } else {
                this.f38140K.mo44614b1(0);
                this.f38142M.mo44614b1(0);
                C18408p.a aVar = C18408p.Companion;
                if (aVar.m97553s()) {
                    this.f38140K.mo89091D0(false);
                    long m97548j = aVar.m97548j();
                    if (m97548j != -1) {
                        this.f38142M.m111959G1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_hidden_fake_thread_calendar_until, AbstractC23160o0.m119307z0(m97548j)));
                    } else {
                        this.f38142M.mo44614b1(8);
                    }
                } else {
                    this.f38140K.mo89091D0(true);
                    this.f38142M.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_enabled_fake_thread_calendar));
                }
            }
            C16719g c16719g = this.f38143N;
            if (c6973h.f38149f) {
                i13 = 0;
            }
            c16719g.mo44614b1(i13);
        }

        public final C16719g getDividerLine() {
            return this.f38143N;
        }

        public final C21696f getMSwitch() {
            return this.f38140K;
        }

        public final C22126c0 getTvSubtitle() {
            return this.f38142M;
        }

        public final C22126c0 getTvTitle() {
            return this.f38141L;
        }

        public final void setDividerLine(C16719g c16719g) {
            AbstractC19074t.m100208f(c16719g, "<set-?>");
            this.f38143N = c16719g;
        }

        public final void setMSwitch(C21696f c21696f) {
            AbstractC19074t.m100208f(c21696f, "<set-?>");
            this.f38140K = c21696f;
        }

        public final void setTvSubtitle(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38142M = c22126c0;
        }

        public final void setTvTitle(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38141L = c22126c0;
        }
    }

    /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$a */
    /* loaded from: classes3.dex */
    public final class C6966a extends C6967b {

        /* renamed from: I */
        private final ModulesView f38144I;

        /* renamed from: J */
        final /* synthetic */ ManageCalendarCateEventInfoAdapter f38145J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6966a(ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter, ModulesView modulesView) {
            super(modulesView);
            AbstractC19074t.m100208f(modulesView, "itemView");
            this.f38145J = manageCalendarCateEventInfoAdapter;
            this.f38144I = modulesView;
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.C6967b, com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6968c
        /* renamed from: E */
        public void mo35727E(C31982k c31982k, int i11, boolean z11) {
            AbstractC19074t.m100208f(c31982k, "item");
            ViewParent viewParent = this.f38144I;
            if (viewParent instanceof InterfaceC6968c) {
                ((InterfaceC6968c) viewParent).mo35727E(c31982k, i11, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$b */
    /* loaded from: classes3.dex */
    public static class C6967b extends RecyclerView.AbstractC1876c0 implements InterfaceC6968c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6967b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: E */
        public abstract void mo35727E(C31982k c31982k, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$c */
    /* loaded from: classes3.dex */
    private interface InterfaceC6968c {
        /* renamed from: E */
        void mo35727E(C31982k c31982k, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$d */
    /* loaded from: classes3.dex */
    public static final class C6969d extends C31982k {

        /* renamed from: e */
        private boolean f38146e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6969d(String str, boolean z11) {
            super(4, null, null, str);
            AbstractC19074t.m100205c(str);
            this.f38146e = z11;
        }

        /* renamed from: a */
        public final boolean m35732a() {
            return this.f38146e;
        }
    }

    /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$e */
    /* loaded from: classes3.dex */
    public static final class C6970e extends C31982k {
        public static final a Companion = new a(null);

        /* renamed from: e */
        private int f38147e;

        /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$e$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C6970e(int i11) {
            super(8, null, null, r0);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            this.f38147e = i11;
        }
    }

    /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$f */
    /* loaded from: classes3.dex */
    public static class C6971f {
        /* renamed from: a */
        public void mo35733a(C19410b c19410b) {
            AbstractC19074t.m100208f(c19410b, "eventInfo");
        }

        /* renamed from: b */
        public abstract void mo35734b(C19410b c19410b);
    }

    /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$g */
    /* loaded from: classes3.dex */
    public interface InterfaceC6972g {
        /* renamed from: a */
        void mo35735a();
    }

    /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$h */
    /* loaded from: classes3.dex */
    public static final class C6973h extends C31982k {
        public static final a Companion = new a(null);

        /* renamed from: e */
        public int f38148e;

        /* renamed from: f */
        public boolean f38149f;

        /* renamed from: com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter$h$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public C6973h(int i11, boolean z11) {
            super(6, null, null, "");
            this.f38148e = i11;
            this.f38149f = z11;
        }
    }

    public ManageCalendarCateEventInfoAdapter(Context context, C23528a c23528a) {
        AbstractC19074t.m100208f(context, "mContext");
        AbstractC19074t.m100208f(c23528a, "mAQ");
        this.f38111r = context;
        this.f38112s = c23528a;
        this.f38114u = new ArrayList();
    }

    /* renamed from: M */
    public final C31982k m35720M(int i11) {
        if (i11 >= 0 && i11 < this.f38114u.size()) {
            return (C31982k) this.f38114u.get(i11);
        }
        return null;
    }

    /* renamed from: N */
    public final C6971f m35721N() {
        return this.f38116w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(C6967b c6967b, int i11) {
        AbstractC19074t.m100208f(c6967b, "holder");
        try {
            C31982k c31982k = (C31982k) this.f38114u.get(i11);
            AbstractC19074t.m100205c(c31982k);
            c6967b.mo35727E(c31982k, i11, this.f38113t);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public C6967b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        switch (i11) {
            case 0:
                return new C6966a(this, new HeaderModuleView(this.f38111r));
            case 1:
            case 2:
                return new C6966a(this, new OAEventModulesView(this, this.f38111r));
            case 3:
                return new C6966a(this, new OAEventSuggestModulesView(this.f38111r));
            case 4:
                return new C6966a(this, new LabelModulesView(this.f38111r));
            case 5:
                return new C6966a(this, new LoadingModulesView(this.f38111r));
            case 6:
                return new C6966a(this, new PersonalSettingModuleView(this.f38111r));
            case 7:
                return new C6966a(this, new AddEventModulesView(this.f38111r));
            case 8:
                return new C6966a(this, new LearnMoreModulesView(this.f38111r));
            default:
                return new C6966a(this, new ModulesView(this.f38111r));
        }
    }

    /* renamed from: Q */
    public final void m35724Q(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "mData");
        this.f38114u = arrayList;
    }

    /* renamed from: R */
    public final void m35725R(C6971f c6971f) {
        this.f38116w = c6971f;
    }

    /* renamed from: S */
    public final void m35726S(InterfaceC6972g interfaceC6972g) {
        this.f38115v = interfaceC6972g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38114u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C31982k) this.f38114u.get(i11)).f147039a;
    }
}
