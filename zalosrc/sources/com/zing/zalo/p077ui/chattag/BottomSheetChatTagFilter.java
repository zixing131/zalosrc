package com.zing.zalo.p077ui.chattag;

import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.chattag.BottomSheetChatTagFilter;
import com.zing.zalo.p077ui.chattag.C11838b;
import com.zing.zalo.p077ui.settings.ManageConversationLabelSetting;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.Serializable;
import java.util.List;
import me0.C23212s8;
import p162fh.C18935d;
import p210hh.C20060c;
import p363nh.C23744a;
import p649xl.C30128y1;
import p649xl.C30145z1;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import v60.InterfaceC27934f;

/* loaded from: classes5.dex */
public final class BottomSheetChatTagFilter extends BottomSheet implements InterfaceC27934f, C23744a.c {
    public static final C11833a Companion = new C11833a(null);

    /* renamed from: b1 */
    private final InterfaceC24854k f61582b1;

    /* renamed from: c1 */
    private final InterfaceC24854k f61583c1;

    /* renamed from: d1 */
    private C30145z1 f61584d1;

    /* renamed from: e1 */
    private C30128y1 f61585e1;

    /* renamed from: f1 */
    private final InterfaceC24854k f61586f1;

    /* renamed from: com.zing.zalo.ui.chattag.BottomSheetChatTagFilter$a */
    /* loaded from: classes5.dex */
    public static final class C11833a {
        private C11833a() {
        }

        public /* synthetic */ C11833a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.chattag.BottomSheetChatTagFilter$b */
    /* loaded from: classes5.dex */
    static final class C11834b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.chattag.BottomSheetChatTagFilter$b$a */
        /* loaded from: classes5.dex */
        public static final class a implements C11838b.b {

            /* renamed from: a */
            final /* synthetic */ BottomSheetChatTagFilter f61588a;

            a(BottomSheetChatTagFilter bottomSheetChatTagFilter) {
                this.f61588a = bottomSheetChatTagFilter;
            }

            @Override // com.zing.zalo.p077ui.chattag.C11838b.b
            /* renamed from: a */
            public boolean mo65757a(int i11) {
                return this.f61588a.m65747OL().m65809Mp(i11);
            }

            @Override // com.zing.zalo.p077ui.chattag.C11838b.b
            /* renamed from: b */
            public void mo65758b() {
                this.f61588a.m65747OL().m65808Jp();
            }

            @Override // com.zing.zalo.p077ui.chattag.C11838b.b
            /* renamed from: c */
            public void mo65759c(C20060c c20060c, int i11, boolean z11) {
                AbstractC19074t.m100208f(c20060c, "tagInfo");
                this.f61588a.mo65754d8(this.f61588a.m65747OL().m65812Pp(c20060c, z11));
            }
        }

        C11834b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11838b mo12V4() {
            Context m92689tK = BottomSheetChatTagFilter.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C11838b c11838b = new C11838b(m92689tK);
            c11838b.m65797V(new a(BottomSheetChatTagFilter.this));
            return c11838b;
        }
    }

    /* renamed from: com.zing.zalo.ui.chattag.BottomSheetChatTagFilter$c */
    /* loaded from: classes5.dex */
    static final class C11835c extends AbstractC19075u implements InterfaceC18494a {
        C11835c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11839c mo12V4() {
            return C11839c.Companion.m65802a(BottomSheetChatTagFilter.this.m92642L3());
        }
    }

    /* renamed from: com.zing.zalo.ui.chattag.BottomSheetChatTagFilter$d */
    /* loaded from: classes5.dex */
    static final class C11836d extends AbstractC19075u implements InterfaceC18494a {
        C11836d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11840d mo12V4() {
            return new C11840d(BottomSheetChatTagFilter.this);
        }
    }

    public BottomSheetChatTagFilter() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(new C11836d());
        this.f61582b1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11835c());
        this.f61583c1 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C11834b());
        this.f61586f1 = m129210a3;
    }

    /* renamed from: ML */
    private final C11838b m65745ML() {
        return (C11838b) this.f61586f1.getValue();
    }

    /* renamed from: NL */
    private final C11839c m65746NL() {
        return (C11839c) this.f61583c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public final C11840d m65747OL() {
        return (C11840d) this.f61582b1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public static final void m65748PL(BottomSheetChatTagFilter bottomSheetChatTagFilter, View view) {
        C17487o0 m92693xK;
        AbstractC19074t.m100208f(bottomSheetChatTagFilter, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 2021);
        ZaloView m92650VI = bottomSheetChatTagFilter.m92650VI();
        if (m92650VI != null && (m92693xK = m92650VI.m92693xK()) != null) {
            m92693xK.m93069k2(ManageConversationLabelSetting.class, bundle, 1, true);
        }
        bottomSheetChatTagFilter.close();
    }

    /* renamed from: QL */
    private final void m65749QL() {
        m65747OL().m65814Rp();
    }

    /* renamed from: RL */
    private final void m65750RL(boolean z11) {
        C30128y1 c30128y1 = null;
        if (z11) {
            C30145z1 c30145z1 = this.f61584d1;
            if (c30145z1 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30145z1 = null;
            }
            if (AbstractC0924m0.m3270N1() == 0) {
                c30145z1.f140079u.setVisibility(0);
                c30145z1.f140076r.setVisibility(8);
            } else {
                c30145z1.f140076r.setVisibility(0);
                c30145z1.f140079u.setVisibility(8);
            }
            C30128y1 c30128y12 = this.f61585e1;
            if (c30128y12 == null) {
                AbstractC19074t.m100223u("layoutButtonViewBinding");
            } else {
                c30128y1 = c30128y12;
            }
            c30128y1.getRoot().setVisibility(8);
            return;
        }
        C30145z1 c30145z12 = this.f61584d1;
        if (c30145z12 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30145z12 = null;
        }
        c30145z12.f140076r.setVisibility(8);
        c30145z12.f140079u.setVisibility(8);
        C30128y1 c30128y13 = this.f61585e1;
        if (c30128y13 == null) {
            AbstractC19074t.m100223u("layoutButtonViewBinding");
        } else {
            c30128y1 = c30128y13;
        }
        c30128y1.getRoot().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SL */
    public static final void m65751SL(BottomSheetChatTagFilter bottomSheetChatTagFilter, View view) {
        AbstractC19074t.m100208f(bottomSheetChatTagFilter, "this$0");
        bottomSheetChatTagFilter.m65747OL().m65813Qp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object[], java.io.Serializable] */
    /* renamed from: TL */
    public static final void m65752TL(BottomSheetChatTagFilter bottomSheetChatTagFilter, View view) {
        AbstractC19074t.m100208f(bottomSheetChatTagFilter, "this$0");
        bottomSheetChatTagFilter.m65747OL().m65810Np();
        ZaloView m92650VI = bottomSheetChatTagFilter.m92650VI();
        if (m92650VI != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_LIST_TAG_SELECTED", (Serializable) C18935d.Companion.m99234a().m99230r().toArray(new C20060c[0]));
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92650VI.mo50035CK(-1, intent);
        }
        bottomSheetChatTagFilter.close();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        C23744a.Companion.m124119a().m124117e(this, 8100);
        super.mo40200KJ();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        BottomSheetLayout m90518hL = m90518hL();
        if (m90511aL() && m90518hL != null && m90518hL.getTranslationY() == m90518hL.getMinTranslationY()) {
            C30145z1 c30145z1 = this.f61584d1;
            if (c30145z1 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30145z1 = null;
            }
            if (!c30145z1.f140080v.canScrollVertically(1)) {
                C30145z1 c30145z12 = this.f61584d1;
                if (c30145z12 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c30145z12 = null;
                }
                if (c30145z12.f140080v.canScrollVertically(-1)) {
                    return m90518hL;
                }
            } else {
                return m90518hL;
            }
        }
        return null;
    }

    @Override // v60.InterfaceC27934f
    /* renamed from: VG */
    public void mo65753VG(List list) {
        AbstractC19074t.m100208f(list, "data");
        m65745ML().m65796U(list);
        m65750RL(list.isEmpty());
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: X0 */
    public boolean mo47166X0(float f11, boolean z11, float f12) {
        if (z11) {
            close();
            return true;
        }
        return super.mo47166X0(f11, false, f12);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m65749QL();
    }

    @Override // v60.InterfaceC27934f
    /* renamed from: d8 */
    public void mo65754d8(int i11) {
        boolean z11;
        String m92652XI;
        C30128y1 c30128y1 = this.f61585e1;
        if (c30128y1 == null) {
            AbstractC19074t.m100223u("layoutButtonViewBinding");
            c30128y1 = null;
        }
        Button button = c30128y1.f139989r;
        button.setIdTracking("btn_clear_all_tag_selected");
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        button.setEnabled(z11);
        button.setOnClickListener(new View.OnClickListener() { // from class: v60.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetChatTagFilter.m65751SL(BottomSheetChatTagFilter.this, view);
            }
        });
        Button button2 = c30128y1.f139988q;
        button2.setIdTracking("btn_apply_all_tag_selected");
        if (i11 > 0) {
            m92652XI = m92653YI(AbstractC8020f0.str_apply_selected, Integer.valueOf(i11));
        } else {
            m92652XI = m92652XI(AbstractC8020f0.str_apply_selected_empty);
        }
        button2.setText(m92652XI);
        button2.setOnClickListener(new View.OnClickListener() { // from class: v60.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetChatTagFilter.m65752TL(BottomSheetChatTagFilter.this, view);
            }
        });
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        C30145z1 m148763c = C30145z1.m148763c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148763c, "inflate(...)");
        this.f61584d1 = m148763c;
        C30128y1 m148717c = C30128y1.m148717c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148717c, "inflate(...)");
        this.f61585e1 = m148717c;
        C30145z1 c30145z1 = null;
        if (m148717c == null) {
            AbstractC19074t.m100223u("layoutButtonViewBinding");
            m148717c = null;
        }
        LinearLayout root = m148717c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        C24848g0 c24848g0 = C24848g0.f119245a;
        m90526uL(root, layoutParams);
        m90533zL(EnumC17017m.DETENTS);
        m90522qL(true);
        C30145z1 c30145z12 = this.f61584d1;
        if (c30145z12 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30145z12 = null;
        }
        c30145z12.f140079u.m65767e();
        C30145z1 c30145z13 = this.f61584d1;
        if (c30145z13 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30145z1 = c30145z13;
        }
        RecyclerView recyclerView = c30145z1.f140080v;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(m65745ML());
        c30145z1.f140075q.setOnClickListener(new View.OnClickListener() { // from class: v60.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetChatTagFilter.m65748PL(BottomSheetChatTagFilter.this, view);
            }
        });
        c30145z1.f140076r.setIllustration(C23212s8.m119609q(m92689tK(), AbstractC16781w.zds_il_tag_empty_spot_1_1));
        C11837a.Companion.m65784a().m65775b(m65746NL().m65800a());
    }

    @Override // v60.InterfaceC27934f
    /* renamed from: sE */
    public void mo65755sE() {
        m65745ML().m65792N();
        mo65754d8(0);
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 8100) {
            m65749QL();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        m65747OL().m65811Op(m65746NL(), null);
        C23744a.Companion.m124119a().m124115b(this, 8100);
        super.mo40210zJ(zaloActivity);
    }
}
