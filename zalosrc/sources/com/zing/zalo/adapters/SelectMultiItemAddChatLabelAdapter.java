package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.SelectMultiItemAddChatLabelAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.message.MsgItemInfoModulesView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import dg0.AbstractC17930e;
import dg0.InterfaceC17929d;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p461qu.AbstractC25495a;
import p716zh.C32020m7;
import vg.C28203u6;

/* loaded from: classes3.dex */
public final class SelectMultiItemAddChatLabelAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    private int f38276A;

    /* renamed from: B */
    private Drawable f38277B;

    /* renamed from: C */
    private Drawable f38278C;

    /* renamed from: r */
    private final Context f38279r;

    /* renamed from: s */
    private HashSet f38280s;

    /* renamed from: t */
    private final boolean f38281t;

    /* renamed from: u */
    private ArrayList f38282u;

    /* renamed from: v */
    private AtomicInteger f38283v;

    /* renamed from: w */
    private AtomicInteger f38284w;

    /* renamed from: x */
    private AtomicInteger f38285x;

    /* renamed from: y */
    private int f38286y;

    /* renamed from: z */
    private int f38287z;

    /* loaded from: classes3.dex */
    public final class ContactModulesView extends MsgItemInfoModulesView {

        /* renamed from: K */
        private C22129e f38288K;

        /* renamed from: L */
        private C3977j f38289L;

        /* renamed from: M */
        private C22126c0 f38290M;

        /* renamed from: N */
        private C22126c0 f38291N;

        /* renamed from: O */
        private C21691a f38292O;

        /* renamed from: P */
        private C21693c f38293P;

        /* renamed from: Q */
        final /* synthetic */ SelectMultiItemAddChatLabelAdapter f38294Q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactModulesView(SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter, Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f38294Q = selectMultiItemAddChatLabelAdapter;
            m88987U(-1, -2);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_contact_bg));
            this.f38289L = new C3977j(context);
            C16716d c16716d = new C16716d(context);
            C16718f m89106L = c16716d.m89106L();
            int i11 = AbstractC23222t7.f112539R;
            m89106L.m89028L(i11, i11).m89032P(AbstractC23222t7.f112586t, AbstractC23222t7.f112562h, AbstractC23222t7.f112586t, AbstractC23222t7.f112562h);
            this.f38288K = new C22129e(context, AbstractC23136l9.m118655I(AbstractC16802y.avt_M));
            C21693c c21693c = new C21693c(context);
            this.f38293P = c21693c;
            c21693c.mo111926w1(AbstractC16803z.ic_oa_verify);
            C16718f m89028L = this.f38293P.m89106L().m89028L(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            Boolean bool = Boolean.TRUE;
            m89028L.m89072y(bool).m89017A(bool);
            this.f38293P.m111929z1(5);
            c16716d.m89001g1(this.f38288K);
            c16716d.m89001g1(this.f38293P);
            C21691a c21691a = new C21691a(context);
            this.f38292O = c21691a;
            C16718f m89027K = c21691a.m89106L().m89017A(bool).m89034R(AbstractC23222t7.f112558f).m89035S(AbstractC23222t7.f112586t).m89027K(true);
            int i12 = AbstractC23222t7.f112514B;
            m89027K.m89028L(i12, i12);
            this.f38292O.m111906k1(selectMultiItemAddChatLabelAdapter.m35834V());
            this.f38292O.m111905j1(selectMultiItemAddChatLabelAdapter.m35830R());
            this.f38292O.mo89093E0(false);
            C16716d c16716d2 = new C16716d(context);
            c16716d2.m89106L().m89054h0(c16716d).m89049e0(this.f38292O).m89027K(true).m89029M(12).m89028L(-1, -2);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f38290M = c22126c0;
            c22126c0.m89106L().m89028L(-1, -2);
            this.f38290M.m111953A1(1);
            C22126c0 c22126c02 = this.f38290M;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c02.m111980v1(truncateAt);
            this.f38290M.mo111964L1(AbstractC23222t7.f112586t);
            this.f38290M.m111962J1(selectMultiItemAddChatLabelAdapter.m35832T());
            C22126c0 c22126c03 = new C22126c0(context);
            this.f38291N = c22126c03;
            c22126c03.m89106L().m89023G(this.f38290M).m89028L(-1, -2);
            this.f38291N.m111953A1(1);
            this.f38291N.m111980v1(truncateAt);
            this.f38291N.mo111964L1(AbstractC23222t7.f112582r);
            this.f38291N.m111962J1(selectMultiItemAddChatLabelAdapter.m35831S());
            c16716d2.m89001g1(this.f38290M);
            c16716d2.m89001g1(this.f38291N);
            mo69681L(c16716d);
            mo69681L(this.f38292O);
            mo69681L(c16716d2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: X */
        public static final void m35841X(final SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter) {
            AbstractC19074t.m100208f(selectMultiItemAddChatLabelAdapter, "this$0");
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.adapters.m7
                @Override // java.lang.Runnable
                public final void run() {
                    SelectMultiItemAddChatLabelAdapter.ContactModulesView.m35842Y(SelectMultiItemAddChatLabelAdapter.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y */
        public static final void m35842Y(SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter) {
            AbstractC19074t.m100208f(selectMultiItemAddChatLabelAdapter, "this$0");
            selectMultiItemAddChatLabelAdapter.f38285x.set(selectMultiItemAddChatLabelAdapter.f38285x.get() + 1);
            if (selectMultiItemAddChatLabelAdapter.f38284w.get() > 0 && selectMultiItemAddChatLabelAdapter.f38284w.get() != selectMultiItemAddChatLabelAdapter.f38283v.get()) {
                selectMultiItemAddChatLabelAdapter.f38285x.set(0);
            }
            selectMultiItemAddChatLabelAdapter.f38284w.set(selectMultiItemAddChatLabelAdapter.f38283v.get());
            selectMultiItemAddChatLabelAdapter.f38283v.set(0);
            selectMultiItemAddChatLabelAdapter.m10008p();
        }

        public final C22129e getAvatarModule() {
            return this.f38288K;
        }

        public final C21691a getCbPick() {
            return this.f38292O;
        }

        public final C3977j getDumpChatImageView() {
            return this.f38289L;
        }

        public final C22126c0 getSubTitle() {
            return this.f38291N;
        }

        public final C22126c0 getTitle() {
            return this.f38290M;
        }

        public final C21693c getVerifiedIcon() {
            return this.f38293P;
        }

        public final void setAvatarModule(C22129e c22129e) {
            AbstractC19074t.m100208f(c22129e, "<set-?>");
            this.f38288K = c22129e;
        }

        public final void setCbPick(C21691a c21691a) {
            AbstractC19074t.m100208f(c21691a, "<set-?>");
            this.f38292O = c21691a;
        }

        public final void setDumpChatImageView(C3977j c3977j) {
            AbstractC19074t.m100208f(c3977j, "<set-?>");
            this.f38289L = c3977j;
        }

        public final void setSubTitle(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38291N = c22126c0;
        }

        public final void setTitle(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38290M = c22126c0;
        }

        public final void setVerifiedIcon(C21693c c21693c) {
            AbstractC19074t.m100208f(c21693c, "<set-?>");
            this.f38293P = c21693c;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:3:0x0005, B:7:0x000a, B:9:0x0016, B:12:0x0033, B:14:0x005f, B:16:0x006c, B:17:0x007e, B:19:0x008c, B:20:0x0092, B:22:0x0098, B:24:0x00a0, B:29:0x00ad, B:33:0x0020), top: B:2:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
        @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
        /* renamed from: w */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
            ContactProfile m141800i;
            boolean z12;
            AbstractC19074t.m100208f(c32020m7, "msgItem");
            try {
                ContactProfile contactProfile = c32020m7.f147411b;
                if (contactProfile == null) {
                    return;
                }
                C22126c0 c22126c0 = this.f38290M;
                SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter = this.f38294Q;
                int i12 = 0;
                String m40383Q = contactProfile.m40383Q(true, false);
                if (m40383Q != null) {
                    if (m40383Q.length() == 0) {
                    }
                    c22126c0.m111959G1(m40383Q);
                    this.f38291N.mo44614b1(8);
                    this.f38288K.m115433q1(contactProfile);
                    this.f38292O.mo89091D0(this.f38294Q.f38280s.contains(contactProfile.f42434r));
                    if (this.f38294Q.f38283v.get() == 1 && this.f38294Q.f38285x.get() < 5) {
                        InterfaceC17929d m94550a = AbstractC17930e.Companion.m94550a();
                        final SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter2 = this.f38294Q;
                        m94550a.mo94531e(new Runnable() { // from class: com.zing.zalo.adapters.l7
                            @Override // java.lang.Runnable
                            public final void run() {
                                SelectMultiItemAddChatLabelAdapter.ContactModulesView.m35841X(SelectMultiItemAddChatLabelAdapter.this);
                            }
                        }, 500L);
                    }
                    C21693c c21693c = this.f38293P;
                    m141800i = C28203u6.m141800i(C28203u6.f131407a, contactProfile.f42434r, false, 2, null);
                    if (m141800i == null) {
                        z12 = m141800i.m40359B0();
                    } else {
                        z12 = false;
                    }
                    if (!contactProfile.m40384Q0() && (AbstractC25495a.m132081f(contactProfile.f42434r) || AbstractC25495a.m132084i(contactProfile.f42434r) || !z12)) {
                        i12 = 8;
                    }
                    c21693c.mo44614b1(i12);
                }
                AbstractC19646n0.m103016p2(contactProfile);
                selectMultiItemAddChatLabelAdapter.f38283v.set(selectMultiItemAddChatLabelAdapter.f38283v.get() + 1);
                c22126c0.m111959G1(m40383Q);
                this.f38291N.mo44614b1(8);
                this.f38288K.m115433q1(contactProfile);
                this.f38292O.mo89091D0(this.f38294Q.f38280s.contains(contactProfile.f42434r));
                if (this.f38294Q.f38283v.get() == 1) {
                    InterfaceC17929d m94550a2 = AbstractC17930e.Companion.m94550a();
                    final SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter22 = this.f38294Q;
                    m94550a2.mo94531e(new Runnable() { // from class: com.zing.zalo.adapters.l7
                        @Override // java.lang.Runnable
                        public final void run() {
                            SelectMultiItemAddChatLabelAdapter.ContactModulesView.m35841X(SelectMultiItemAddChatLabelAdapter.this);
                        }
                    }, 500L);
                }
                C21693c c21693c2 = this.f38293P;
                m141800i = C28203u6.m141800i(C28203u6.f131407a, contactProfile.f42434r, false, 2, null);
                if (m141800i == null) {
                }
                if (!contactProfile.m40384Q0()) {
                    i12 = 8;
                }
                c21693c2.mo44614b1(i12);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class LabelModulesView extends MsgItemInfoModulesView {

        /* renamed from: K */
        private C16719g f38295K;

        /* renamed from: L */
        private C22126c0 f38296L;

        /* renamed from: M */
        private C16716d f38297M;

        /* renamed from: N */
        private C22126c0 f38298N;

        /* renamed from: O */
        private C21691a f38299O;

        /* renamed from: P */
        final /* synthetic */ SelectMultiItemAddChatLabelAdapter f38300P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelModulesView(SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter, Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f38300P = selectMultiItemAddChatLabelAdapter;
            m88987U(-1, -2);
            C16719g c16719g = new C16719g(context);
            this.f38295K = c16719g;
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SearchBackgroundColor));
            this.f38295K.m89106L().m89028L(-1, AbstractC23222t7.f112572m).m89036T(AbstractC23222t7.f112562h);
            C16716d c16716d = new C16716d(context);
            this.f38297M = c16716d;
            C16718f m89028L = c16716d.m89106L().m89028L(-2, -2);
            Boolean bool = Boolean.TRUE;
            m89028L.m89017A(bool).m89027K(true).m89023G(this.f38295K).m89036T(AbstractC23222t7.f112562h).m89033Q(AbstractC23222t7.f112552c).m89034R(AbstractC23222t7.f112586t).m89035S(AbstractC23222t7.f112586t);
            this.f38297M.mo44614b1(8);
            C21691a c21691a = new C21691a(context);
            this.f38299O = c21691a;
            C16718f m89027K = c21691a.m89106L().m89017A(bool).m89034R(AbstractC23222t7.f112566j).m89027K(true);
            int i11 = AbstractC23222t7.f112514B;
            m89027K.m89028L(i11, i11);
            this.f38299O.m111906k1(selectMultiItemAddChatLabelAdapter.m35834V());
            this.f38299O.m111905j1(selectMultiItemAddChatLabelAdapter.m35830R());
            this.f38299O.mo89093E0(false);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f38298N = c22126c0;
            c22126c0.mo111964L1(AbstractC23222t7.f112580q);
            this.f38298N.m111962J1(selectMultiItemAddChatLabelAdapter.m35831S());
            this.f38298N.m111982x1(false);
            this.f38298N.m111958F1(AbstractC8020f0.select_all);
            this.f38298N.m89106L().m89028L(-2, -2).m89027K(true).m89029M(12).m89049e0(this.f38299O);
            this.f38297M.m89001g1(this.f38299O);
            this.f38297M.m89001g1(this.f38298N);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f38296L = c22126c02;
            c22126c02.mo111964L1(AbstractC23222t7.f112582r);
            this.f38296L.m111962J1(selectMultiItemAddChatLabelAdapter.m35831S());
            this.f38296L.mo111965M1(1);
            this.f38296L.m111982x1(false);
            this.f38296L.m89106L().m89028L(-1, -2).m89029M(12).m89036T(AbstractC23222t7.f112576o).m89033Q(AbstractC23222t7.f112552c).m89034R(AbstractC23222t7.f112586t).m89023G(this.f38295K).m89049e0(this.f38297M);
            mo69681L(this.f38295K);
            mo69681L(this.f38297M);
            mo69681L(this.f38296L);
        }

        public final C16716d getSelectAllModule() {
            return this.f38297M;
        }

        public final C22126c0 getSelectAllText() {
            return this.f38298N;
        }

        public final C21691a getSelectCb() {
            return this.f38299O;
        }

        public final C16719g getSeparateSectionHeader() {
            return this.f38295K;
        }

        public final C22126c0 getTitleRow() {
            return this.f38296L;
        }

        public final void setSelectAllModule(C16716d c16716d) {
            AbstractC19074t.m100208f(c16716d, "<set-?>");
            this.f38297M = c16716d;
        }

        public final void setSelectAllText(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38298N = c22126c0;
        }

        public final void setSelectCb(C21691a c21691a) {
            AbstractC19074t.m100208f(c21691a, "<set-?>");
            this.f38299O = c21691a;
        }

        public final void setSeparateSectionHeader(C16719g c16719g) {
            AbstractC19074t.m100208f(c16719g, "<set-?>");
            this.f38295K = c16719g;
        }

        public final void setTitleRow(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f38296L = c22126c0;
        }

        @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
        /* renamed from: w */
        public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
            int i12;
            AbstractC19074t.m100208f(c32020m7, "msgItem");
            ContactProfile contactProfile = c32020m7.f147411b;
            if (contactProfile == null) {
                return;
            }
            this.f38296L.m111959G1(contactProfile.mo2475c());
            C16719g c16719g = this.f38295K;
            if (c32020m7.f147416g) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            c16719g.mo44614b1(i12);
            this.f38297M.mo44614b1(8);
        }
    }

    /* loaded from: classes3.dex */
    public final class SeeMoreModuleView extends MsgItemInfoModulesView {

        /* renamed from: K */
        private final C16719g f38301K;

        /* renamed from: L */
        private final C16716d f38302L;

        /* renamed from: M */
        private final C16719g f38303M;

        /* renamed from: N */
        private final C22126c0 f38304N;

        /* renamed from: O */
        final /* synthetic */ SelectMultiItemAddChatLabelAdapter f38305O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SeeMoreModuleView(SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter, Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f38305O = selectMultiItemAddChatLabelAdapter;
            C16719g c16719g = new C16719g(context);
            c16719g.m89106L().m89028L(-1, 1);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            this.f38301K = c16719g;
            C16716d c16716d = new C16716d(context);
            C16718f m89106L = c16716d.m89106L();
            m89106L.m89028L(-1, AbstractC23222t7.f112539R);
            int i11 = AbstractC23222t7.f112586t;
            m89106L.f84716l = i11;
            m89106L.f84718n = i11;
            m89106L.m89023G(c16719g);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_contact_bg));
            this.f38302L = c16716d;
            C16719g c16719g2 = new C16719g(context);
            C16718f m89106L2 = c16719g2.m89106L();
            m89106L2.m89028L(-1, 1);
            m89106L2.m89023G(c16716d);
            c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            this.f38303M = c16719g2;
            C22126c0 c22126c0 = new C22126c0(context);
            C16718f m89106L3 = c22126c0.m89106L();
            m89106L3.m89028L(-1, -2);
            m89106L3.m89027K(true);
            c22126c0.mo111964L1(AbstractC23222t7.f112582r);
            c22126c0.mo111965M1(1);
            c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.cM1));
            c22126c0.m111953A1(1);
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.label_see_full_search_result));
            this.f38304N = c22126c0;
            c16716d.m89001g1(c22126c0);
            mo69681L(c16719g);
            mo69681L(c16716d);
            mo69681L(c16719g2);
        }

        @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
        /* renamed from: w */
        public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
            AbstractC19074t.m100208f(c32020m7, "msgItem");
        }
    }

    /* renamed from: com.zing.zalo.adapters.SelectMultiItemAddChatLabelAdapter$a */
    /* loaded from: classes3.dex */
    public final class C6997a extends C6998b {

        /* renamed from: I */
        private MsgItemInfoModulesView f38306I;

        /* renamed from: J */
        final /* synthetic */ SelectMultiItemAddChatLabelAdapter f38307J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6997a(SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f38307J = selectMultiItemAddChatLabelAdapter;
            this.f38306I = (MsgItemInfoModulesView) view;
        }

        @Override // com.zing.zalo.adapters.SelectMultiItemAddChatLabelAdapter.C6998b
        /* renamed from: i0 */
        public void mo35844i0(int i11) {
            Object obj = this.f38307J.f38282u.get(i11);
            SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter = this.f38307J;
            C32020m7 c32020m7 = (C32020m7) obj;
            MsgItemInfoModulesView msgItemInfoModulesView = this.f38306I;
            AbstractC19074t.m100205c(c32020m7);
            msgItemInfoModulesView.mo35843w(c32020m7, i11, selectMultiItemAddChatLabelAdapter.f38281t);
        }
    }

    /* renamed from: com.zing.zalo.adapters.SelectMultiItemAddChatLabelAdapter$b */
    /* loaded from: classes3.dex */
    public static class C6998b extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6998b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: i0 */
        public void mo35844i0(int i11) {
        }
    }

    public SelectMultiItemAddChatLabelAdapter(Context context, HashSet hashSet) {
        AbstractC19074t.m100208f(context, "mContext");
        AbstractC19074t.m100208f(hashSet, "mUidSelected");
        this.f38279r = context;
        this.f38280s = hashSet;
        this.f38282u = new ArrayList();
        this.f38283v = new AtomicInteger(0);
        this.f38284w = new AtomicInteger(0);
        this.f38285x = new AtomicInteger(0);
        this.f38286y = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f38287z = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f38276A = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        this.f38277B = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_unchecked);
        this.f38278C = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_checked);
    }

    /* renamed from: R */
    public final Drawable m35830R() {
        return this.f38278C;
    }

    /* renamed from: S */
    public final int m35831S() {
        return this.f38287z;
    }

    /* renamed from: T */
    public final int m35832T() {
        return this.f38286y;
    }

    /* renamed from: U */
    public final C32020m7 m35833U(int i11) {
        if (i11 >= 0 && i11 < this.f38282u.size()) {
            return (C32020m7) this.f38282u.get(i11);
        }
        return null;
    }

    /* renamed from: V */
    public final Drawable m35834V() {
        return this.f38277B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo9990A(C6998b c6998b, int i11) {
        AbstractC19074t.m100208f(c6998b, "holder");
        try {
            c6998b.mo35844i0(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public C6998b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (i11 != 1) {
            if (i11 != 6) {
                if (i11 == 41) {
                    return new C6997a(this, new SeeMoreModuleView(this, this.f38279r));
                }
                return new C6998b(new View(this.f38279r));
            }
            return new C6997a(this, new LabelModulesView(this, this.f38279r));
        }
        return new C6997a(this, new ContactModulesView(this, this.f38279r));
    }

    /* renamed from: Y */
    public final void m35837Y() {
        this.f38285x.set(0);
        this.f38283v.set(0);
        this.f38284w.set(0);
    }

    /* renamed from: Z */
    public final void m35838Z(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "mData");
        this.f38282u = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38282u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C32020m7) this.f38282u.get(i11)).f147410a;
    }
}
