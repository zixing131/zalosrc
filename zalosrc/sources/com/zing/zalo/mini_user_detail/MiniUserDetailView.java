package com.zing.zalo.mini_user_detail;

import ac.C0697c0;
import ac.C0708i;
import ag0.AbstractC0837p0;
import am.AbstractC0906d0;
import am.C0927o;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.graphics.C1421e;
import androidx.recyclerview.widget.C1929v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.mini_user_detail.MiniUserDetailView;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetBlockView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.GroupInCommonView;
import com.zing.zalo.p077ui.zviews.MutualFeedView;
import com.zing.zalo.uicontrol.recyclerview.ZRecyclerView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22021e0;
import l30.C22033k0;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.C23212s8;
import on0.AbstractC24342w;
import p142ey.C18635e;
import p142ey.C18644n;
import p172fy.C19171b;
import p219hw.C20133a;
import p219hw.C20152p;
import p219hw.InterfaceC20148l;
import p219hw.InterfaceC20149m;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p558uu.InterfaceC27367c;
import p649xl.C29818g8;
import p716zh.C31901e8;
import p716zh.C31980jc;
import p716zh.C32002l4;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import v50.C27870vb;

/* loaded from: classes4.dex */
public final class MiniUserDetailView extends BaseZaloView implements ZaloView.InterfaceC17421f, InterfaceC20149m, C23744a.c {
    public static final C9028a Companion = new C9028a(null);

    /* renamed from: M0 */
    private C29818g8 f48358M0;

    /* renamed from: N0 */
    private C23528a f48359N0;

    /* renamed from: O0 */
    private ContactProfile f48360O0;

    /* renamed from: P0 */
    private InterfaceC20148l f48361P0;

    /* renamed from: Q0 */
    private C20133a f48362Q0;

    /* renamed from: S0 */
    private int f48364S0;

    /* renamed from: T0 */
    public LinearLayoutManager f48365T0;

    /* renamed from: W0 */
    private final int f48368W0;

    /* renamed from: Y0 */
    private int f48370Y0;

    /* renamed from: Z0 */
    private boolean f48371Z0;

    /* renamed from: a1 */
    private AbstractC22055v0.l f48372a1;

    /* renamed from: b1 */
    private boolean f48373b1;

    /* renamed from: c1 */
    private boolean f48374c1;

    /* renamed from: R0 */
    private String f48363R0 = "";

    /* renamed from: U0 */
    private int f48366U0 = 1;

    /* renamed from: V0 */
    private final int f48367V0 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: X0 */
    private final int f48369X0 = AbstractC23136l9.m118722k0() - AbstractC23136l9.m118742r(60.0f);

    /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$a */
    /* loaded from: classes4.dex */
    public static final class C9028a {
        private C9028a() {
        }

        public /* synthetic */ C9028a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$b */
    /* loaded from: classes4.dex */
    public static final class C9029b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f48376b;

        C9029b(String str) {
            this.f48376b = str;
        }

        /* renamed from: d */
        public static final void m48293d(MiniUserDetailView miniUserDetailView, String str) {
            AbstractC19074t.m100208f(miniUserDetailView, "this$0");
            AbstractC19074t.m100208f(str, "$uid");
            C20133a c20133a = miniUserDetailView.f48362Q0;
            if (c20133a == null) {
                AbstractC19074t.m100223u("miniUserDetailAdapter");
                c20133a = null;
            }
            c20133a.m105088r0(str);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            AbstractC19444a.m101695c(new Runnable() { // from class: hw.c0

                /* renamed from: q */
                public final /* synthetic */ String f99456q;

                public /* synthetic */ RunnableC20138c0(String str) {
                    r2 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MiniUserDetailView.C9029b.m48293d(MiniUserDetailView.this, r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$c */
    /* loaded from: classes4.dex */
    public static final class C9030c extends RecyclerView.AbstractC1887n {
        C9030c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            rect.set(MiniUserDetailView.this.f48367V0, 0, MiniUserDetailView.this.f48367V0, 0);
        }
    }

    /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$d */
    /* loaded from: classes4.dex */
    public static final class C9031d extends RecyclerView.AbstractC1892s {
        C9031d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                MiniUserDetailView.this.f48370Y0++;
                MiniUserDetailView.this.m48252ZM();
            }
        }
    }

    /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$e */
    /* loaded from: classes4.dex */
    public static final class C9032e extends AbstractC19075u implements InterfaceC18509p {
        C9032e() {
            super(2);
        }

        /* renamed from: a */
        public final void m48294a(ContactProfile contactProfile, String str) {
            AbstractC19074t.m100208f(contactProfile, "cp");
            AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            MiniUserDetailView.m48245QM(MiniUserDetailView.this, contactProfile, str, null, 4, null);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m48294a((ContactProfile) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$f */
    /* loaded from: classes4.dex */
    public static final class C9033f extends AbstractC19075u implements InterfaceC18510q {
        C9033f() {
            super(3);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m48295a((ContactProfile) obj, ((Boolean) obj2).booleanValue(), (String) obj3);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m48295a(ContactProfile contactProfile, boolean z11, String str) {
            AbstractC19074t.m100208f(contactProfile, "cp");
            AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            MiniUserDetailView.this.m48244PM(contactProfile, str, Boolean.valueOf(z11));
        }
    }

    /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$g */
    /* loaded from: classes4.dex */
    public static final class C9034g extends AbstractC19075u implements InterfaceC18505l {
        C9034g() {
            super(1);
        }

        /* renamed from: a */
        public final void m48296a(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "cp");
            MiniUserDetailView.this.m48275xM(contactProfile);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48296a((ContactProfile) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$h */
    /* loaded from: classes4.dex */
    public static final class C9035h extends AbstractC19075u implements InterfaceC18505l {
        C9035h() {
            super(1);
        }

        /* renamed from: a */
        public final void m48297a(String str) {
            AbstractC19074t.m100208f(str, "uid");
            MiniUserDetailView.this.m48240JM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48297a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$i */
    /* loaded from: classes4.dex */
    public static final class C9036i extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.mini_user_detail.MiniUserDetailView$i$a */
        /* loaded from: classes4.dex */
        public static final class a implements AbstractC22055v0.g {

            /* renamed from: a */
            final /* synthetic */ MiniUserDetailView f48384a;

            /* renamed from: b */
            final /* synthetic */ C31980jc f48385b;

            a(MiniUserDetailView miniUserDetailView, C31980jc c31980jc) {
                this.f48384a = miniUserDetailView;
                this.f48385b = c31980jc;
            }

            /* renamed from: c */
            public static final void m48300c(MiniUserDetailView miniUserDetailView, C31980jc c31980jc) {
                AbstractC19074t.m100208f(miniUserDetailView, "this$0");
                AbstractC19074t.m100208f(c31980jc, "$userStory");
                C20133a c20133a = miniUserDetailView.f48362Q0;
                if (c20133a == null) {
                    AbstractC19074t.m100223u("miniUserDetailAdapter");
                    c20133a = null;
                }
                String str = c31980jc.f147023p;
                AbstractC19074t.m100207e(str, "uid");
                c20133a.m105088r0(str);
            }

            @Override // l30.AbstractC22055v0.g
            /* renamed from: O */
            public void mo46561O() {
            }

            @Override // l30.AbstractC22055v0.g
            /* renamed from: a */
            public void mo46562a(String str, C22033k0.g gVar) {
                AbstractC19074t.m100208f(str, "msg");
                AbstractC19074t.m100208f(gVar, "errorCode");
                if (this.f48384a.m92672lJ()) {
                    ToastUtils.showMess(str);
                    AbstractC19444a.m101695c(new Runnable() { // from class: hw.d0

                        /* renamed from: q */
                        public final /* synthetic */ C31980jc f99460q;

                        public /* synthetic */ RunnableC20140d0(C31980jc c31980jc) {
                            r2 = c31980jc;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MiniUserDetailView.C9036i.a.m48300c(MiniUserDetailView.this, r2);
                        }
                    });
                }
            }
        }

        C9036i() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: a */
        public void mo48298a(AbstractC22055v0.j jVar) {
            AbstractC19074t.m100208f(jVar, "storyPopulateBehavior");
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            AbstractC19074t.m100208f(c31980jc, "userStory");
            try {
                c31980jc.m153811A(true);
                MiniUserDetailView miniUserDetailView = MiniUserDetailView.this;
                AbstractC22055v0.m115123M(c31980jc, miniUserDetailView, 0, i11, null, new a(miniUserDetailView, c31980jc));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: AM */
    public static final void m48232AM(MiniUserDetailView miniUserDetailView, ContactProfile contactProfile, C19059j0 c19059j0, InterfaceC17463d interfaceC17463d, int i11) {
        boolean z11;
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        AbstractC19074t.m100208f(contactProfile, "$it");
        AbstractC19074t.m100208f(c19059j0, "$checkBox");
        interfaceC17463d.dismiss();
        InterfaceC20148l interfaceC20148l = miniUserDetailView.f48361P0;
        if (interfaceC20148l == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC20148l = null;
        }
        CheckBox checkBox = (CheckBox) c19059j0.f94941p;
        if (checkBox != null) {
            z11 = checkBox.isChecked();
        } else {
            z11 = false;
        }
        interfaceC20148l.mo105121B0(contactProfile, z11);
    }

    /* renamed from: BM */
    public static final void m48233BM(MiniUserDetailView miniUserDetailView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        interfaceC17463d.dismiss();
        miniUserDetailView.f48360O0 = null;
    }

    /* renamed from: CM */
    public static final void m48234CM(MiniUserDetailView miniUserDetailView) {
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        C20133a c20133a = miniUserDetailView.f48362Q0;
        if (c20133a == null) {
            AbstractC19074t.m100223u("miniUserDetailAdapter");
            c20133a = null;
        }
        c20133a.m105086p0(miniUserDetailView.m48239HM(miniUserDetailView.f48364S0));
    }

    /* renamed from: DM */
    public static final void m48235DM(MiniUserDetailView miniUserDetailView, Object[] objArr) {
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        AbstractC19074t.m100208f(objArr, "$args");
        C20133a c20133a = miniUserDetailView.f48362Q0;
        if (c20133a == null) {
            AbstractC19074t.m100223u("miniUserDetailAdapter");
            c20133a = null;
        }
        Object obj = objArr[0];
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = objArr[1];
        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.String");
        c20133a.m105084m0((String) obj, (String) obj2);
    }

    /* renamed from: EM */
    private final void m48236EM(String str) {
        C22021e0.m114963p().m114988k(new C9029b(str), true);
    }

    /* renamed from: FM */
    private final String m48237FM(ContactProfile contactProfile, boolean z11) {
        String m40385R;
        if (contactProfile != null && (m40385R = contactProfile.m40385R(true, false, z11)) != null) {
            if (m40385R.length() > 40) {
                String substring = m40385R.substring(0, 40);
                AbstractC19074t.m100207e(substring, "substring(...)");
                return substring + "...";
            }
            return m40385R;
        }
        return "";
    }

    /* renamed from: GM */
    static /* synthetic */ String m48238GM(MiniUserDetailView miniUserDetailView, ContactProfile contactProfile, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return miniUserDetailView.m48237FM(contactProfile, z11);
    }

    /* renamed from: HM */
    private final List m48239HM(int i11) {
        List m131185M0;
        boolean m127137G0;
        ArrayList arrayList = new ArrayList();
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    C21927m.m114302u().m114329e(arrayList, this.f48371Z0, new HashSet());
                }
            } else {
                C21927m.m114302u().m114335h(arrayList, this.f48371Z0, new HashSet());
            }
        } else {
            C18635e mo98465a = C18644n.m98531l().mo98465a(null, true);
            AbstractC19074t.m100207e(mo98465a, "getsortedZaloList(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : mo98465a) {
                ContactProfile contactProfile = (ContactProfile) obj;
                if (!AbstractC25495a.m132086k(contactProfile.f42434r) && !C21927m.m114302u().m114345m(contactProfile.f42434r)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            String str = ((ContactProfile) obj2).f42434r;
            AbstractC19074t.m100207e(str, "uid");
            m127137G0 = AbstractC24342w.m127137G0(str, '-', false, 2, null);
            if (!m127137G0) {
                arrayList3.add(obj2);
            }
        }
        m131185M0 = AbstractC25332a0.m131185M0(arrayList3);
        return m131185M0;
    }

    /* renamed from: JM */
    public final void m48240JM(String str) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: hw.w

            /* renamed from: p */
            public final /* synthetic */ String f99524p;

            /* renamed from: q */
            public final /* synthetic */ MiniUserDetailView f99525q;

            public /* synthetic */ RunnableC20159w(String str2, MiniUserDetailView this) {
                r1 = str2;
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MiniUserDetailView.m48241KM(r1, r2);
            }
        });
    }

    /* renamed from: KM */
    public static final void m48241KM(String str, MiniUserDetailView miniUserDetailView) {
        AbstractC19074t.m100208f(str, "$uid");
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        AbstractC19444a.m101695c(new Runnable() { // from class: hw.s

            /* renamed from: q */
            public final /* synthetic */ String f99517q;

            /* renamed from: r */
            public final /* synthetic */ int f99518r;

            public /* synthetic */ RunnableC20155s(String str2, int i11) {
                r2 = str2;
                r3 = i11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MiniUserDetailView.m48242LM(MiniUserDetailView.this, r2, r3);
            }
        });
    }

    /* renamed from: LM */
    public static final void m48242LM(MiniUserDetailView miniUserDetailView, String str, int i11) {
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        AbstractC19074t.m100208f(str, "$uid");
        C20133a c20133a = miniUserDetailView.f48362Q0;
        if (c20133a == null) {
            AbstractC19074t.m100223u("miniUserDetailAdapter");
            c20133a = null;
        }
        c20133a.m105087q0(str, i11);
    }

    /* renamed from: OM */
    private final void m48243OM() {
        String str;
        if (!TextUtils.isEmpty(this.f48363R0)) {
            C20133a c20133a = this.f48362Q0;
            if (c20133a == null) {
                AbstractC19074t.m100223u("miniUserDetailAdapter");
                c20133a = null;
            }
            int mo10003k = c20133a.mo10003k();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= mo10003k) {
                    break;
                }
                C20133a c20133a2 = this.f48362Q0;
                if (c20133a2 == null) {
                    AbstractC19074t.m100223u("miniUserDetailAdapter");
                    c20133a2 = null;
                }
                ContactProfile m105070X = c20133a2.m105070X(i12);
                if (m105070X != null) {
                    str = m105070X.f42434r;
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str, this.f48363R0)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            m48279IM().m9721B2(i11, this.f48368W0);
        }
    }

    /* renamed from: PM */
    public final void m48244PM(ContactProfile contactProfile, String str, Boolean bool) {
        this.f48360O0 = contactProfile;
        this.f48374c1 = C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r);
        switch (str.hashCode()) {
            case -1772492900:
                if (str.equals("MiniUserDetail_ManageBlock")) {
                    m48253aN(contactProfile);
                    return;
                }
                return;
            case -304745605:
                if (str.equals("MiniUserDetail_Message")) {
                    m48280MM(contactProfile);
                    return;
                }
                return;
            case -112564939:
                if (str.equals("MiniUserDetail_DeleteFriend")) {
                    this.f48373b1 = true;
                    showDialog(this.f48366U0);
                    return;
                }
                return;
            case 354520933:
                if (str.equals("MiniUserDetail_Avatar")) {
                    if (AbstractC22055v0.m115118H(contactProfile.f42434r)) {
                        this.f48373b1 = true;
                        String str2 = contactProfile.f42434r;
                        AbstractC19074t.m100207e(str2, "uid");
                        m48289fN(str2);
                        return;
                    }
                    m48288eN(contactProfile);
                    return;
                }
                return;
            case 579825864:
                if (str.equals("MiniUserDetail_CommonGroup")) {
                    String str3 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str3, "uid");
                    m48282UM(str3, contactProfile.m40383Q(true, false));
                    return;
                }
                return;
            case 844397044:
                if (str.equals("MiniUserDetail_ChangeAlias")) {
                    m48291wM(contactProfile);
                    return;
                }
                return;
            case 1026913227:
                if (str.equals("MiniUserDetail_MarkAsCloseFriend") && bool != null) {
                    m48246RM(contactProfile, bool.booleanValue());
                    return;
                }
                return;
            case 1256689630:
                if (str.equals("MiniUserDetail_MutualFeed")) {
                    m48285bN(contactProfile);
                    return;
                }
                return;
            case 1716935575:
                if (str.equals("MiniUserDetail_Name")) {
                    m48288eN(contactProfile);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: QM */
    static /* synthetic */ void m48245QM(MiniUserDetailView miniUserDetailView, ContactProfile contactProfile, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bool = null;
        }
        miniUserDetailView.m48244PM(contactProfile, str, bool);
    }

    /* renamed from: RM */
    private final void m48246RM(ContactProfile contactProfile, boolean z11) {
        InterfaceC20148l interfaceC20148l = null;
        if (!z11) {
            InterfaceC20148l interfaceC20148l2 = this.f48361P0;
            if (interfaceC20148l2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC20148l = interfaceC20148l2;
            }
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            interfaceC20148l.mo105122Eg(str);
            return;
        }
        InterfaceC20148l interfaceC20148l3 = this.f48361P0;
        if (interfaceC20148l3 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC20148l = interfaceC20148l3;
        }
        String str2 = contactProfile.f42434r;
        AbstractC19074t.m100207e(str2, "uid");
        interfaceC20148l.mo105123un(str2);
    }

    /* renamed from: SM */
    public static final void m48247SM(MiniUserDetailView miniUserDetailView, C1421e c1421e) {
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        AbstractC19074t.m100208f(c1421e, "it");
        C29818g8 c29818g8 = miniUserDetailView.f48358M0;
        C29818g8 c29818g82 = null;
        if (c29818g8 == null) {
            AbstractC19074t.m100223u("binding");
            c29818g8 = null;
        }
        ViewGroup.LayoutParams layoutParams = c29818g8.f137874q.getLayoutParams();
        AbstractC19074t.m100207e(layoutParams, "getLayoutParams(...)");
        layoutParams.height = c1421e.f6233d;
        C29818g8 c29818g83 = miniUserDetailView.f48358M0;
        if (c29818g83 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29818g82 = c29818g83;
        }
        c29818g82.f137874q.setLayoutParams(layoutParams);
    }

    /* renamed from: TM */
    public static final void m48248TM(MiniUserDetailView miniUserDetailView, View view) {
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        miniUserDetailView.finish();
    }

    /* renamed from: VM */
    private final void m48249VM(List list) {
        AbstractC19444a.m101697e(new Runnable() { // from class: hw.t

            /* renamed from: q */
            public final /* synthetic */ List f99520q;

            public /* synthetic */ RunnableC20156t(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MiniUserDetailView.m48250WM(MiniUserDetailView.this, r2);
            }
        });
    }

    /* renamed from: WM */
    public static final void m48250WM(MiniUserDetailView miniUserDetailView, List list) {
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        AbstractC19074t.m100208f(list, "$newList");
        C20133a c20133a = miniUserDetailView.f48362Q0;
        C20133a c20133a2 = null;
        if (c20133a == null) {
            AbstractC19074t.m100223u("miniUserDetailAdapter");
            c20133a = null;
        }
        c20133a.m105086p0(list);
        C20133a c20133a3 = miniUserDetailView.f48362Q0;
        if (c20133a3 == null) {
            AbstractC19074t.m100223u("miniUserDetailAdapter");
        } else {
            c20133a2 = c20133a3;
        }
        c20133a2.m10008p();
    }

    /* renamed from: XM */
    private final void m48251XM(View view) {
        SystemUI m89439b = SystemUI.Companion.m89439b(view);
        m89439b.m89427V(0);
        m89439b.m89426U(Boolean.FALSE);
        view.setTag(new Object());
    }

    /* renamed from: ZM */
    public final void m48252ZM() {
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1054h("contacts_tab_friend_profile", "subtab_position", Integer.valueOf(this.f48364S0 + 1));
        bVar.m1054h("contacts_tab_friend_profile", "total_profile_count", Integer.valueOf(this.f48370Y0));
    }

    /* renamed from: aN */
    private final void m48253aN(ContactProfile contactProfile) {
        if (contactProfile != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_CONTACT_PROFILE", contactProfile.m40373K());
            bundle.putInt("EXTRA_ENTRY_SCREEN", BottomSheetBlockView.EnumC11169b.f56206u.m58496c());
            InterfaceC27218a m92676n2 = m92676n2();
            AbstractC19074t.m100205c(m92676n2);
            m92676n2.mo35573l4(BottomSheetBlockView.class, bundle, 1, true);
        }
    }

    /* renamed from: cN */
    public static final void m48254cN(MiniUserDetailView miniUserDetailView, String str) {
        int i11;
        SystemUI m89489a;
        C1421e m89432r;
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        AbstractC19074t.m100208f(str, "$msg");
        Snackbar.C16925c c16925c = Snackbar.Companion;
        View m92691vK = miniUserDetailView.m92691vK();
        AbstractC19074t.m100207e(m92691vK, "requireView(...)");
        Snackbar m90669d = c16925c.m90669d(m92691vK, str, -1);
        View m92656bJ = miniUserDetailView.m92656bJ();
        if (m92656bJ != null && (m89489a = AbstractC16768f.m89489a(m92656bJ)) != null && (m89432r = m89489a.m89432r()) != null) {
            i11 = m89432r.f6233d;
        } else {
            i11 = 0;
        }
        m90669d.m90645K(i11).m90648N();
    }

    /* renamed from: dN */
    public static final void m48256dN(boolean z11, MiniUserDetailView miniUserDetailView, String str) {
        AbstractC19074t.m100208f(miniUserDetailView, "this$0");
        AbstractC19074t.m100208f(str, "$uid");
        C20133a c20133a = null;
        if (z11) {
            C20133a c20133a2 = miniUserDetailView.f48362Q0;
            if (c20133a2 == null) {
                AbstractC19074t.m100223u("miniUserDetailAdapter");
            } else {
                c20133a = c20133a2;
            }
            c20133a.m105077e0(str);
            return;
        }
        C20133a c20133a3 = miniUserDetailView.f48362Q0;
        if (c20133a3 == null) {
            AbstractC19074t.m100223u("miniUserDetailAdapter");
        } else {
            c20133a = c20133a3;
        }
        c20133a.m105085o0(str);
    }

    /* renamed from: xM */
    public final void m48275xM(ContactProfile contactProfile) {
        if (contactProfile != null && contactProfile.f42367P0 == null) {
            InterfaceC20148l interfaceC20148l = this.f48361P0;
            if (interfaceC20148l == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC20148l = null;
            }
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            interfaceC20148l.mo105124x0(str);
        }
    }

    /* renamed from: yM */
    private final C0708i m48276yM(String str, int i11) {
        C0708i c0708i = new C0708i();
        c0708i.m1075f("friend_uid", str);
        c0708i.m1072c("option", i11);
        return c0708i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* renamed from: zM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final KeyEventCallbackC17462c m48277zM() {
        boolean z11;
        Object obj;
        String str;
        C31901e8 m2800f;
        String m153297j;
        ContactProfile contactProfile = this.f48360O0;
        if (contactProfile == null) {
            return null;
        }
        if (m92648SI() != null) {
            Context m92648SI = m92648SI();
            AbstractC19074t.m100205c(m92648SI);
            if (AbstractC23034c6.m118167n(m92648SI, AbstractC23034c6.f112032i) == 0 && C8937j0.m47663l("phonebook_delete_in_profile_card") && (str = contactProfile.f42455y) != null && str.length() != 0 && (m2800f = AbstractC0906d0.m2800f(getContext(), contactProfile.f42455y)) != null && (m153297j = m2800f.m153297j()) != null && m153297j.length() != 0) {
                z11 = true;
                String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hint_delete_contact_dialog, m48238GM(this, contactProfile, false, 2, null));
                AbstractC19074t.m100207e(m118746s0, "getString(...)");
                C19059j0 c19059j0 = new C19059j0();
                if (z11) {
                    Context m92689tK = m92689tK();
                    AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                    CheckBox checkBox = new CheckBox(m92689tK);
                    c19059j0.f94941p = checkBox;
                    checkBox.setTextColor(C23212s8.m119606n(AbstractC2807a.TextColor1));
                    String m118282h = AbstractC23056e6.m118282h(contactProfile.f42455y, AbstractC23309i.m121704a5(), false);
                    if (m118282h == null || m118282h.length() == 0 || AbstractC19074t.m100204b(m118282h, AbstractC23056e6.f112062a)) {
                        m118282h = contactProfile.f42455y;
                    }
                    String str2 = m48237FM(contactProfile, false) + " (" + m118282h + ")";
                    ((CheckBox) c19059j0.f94941p).setText(AbstractC23217t2.m119658j(AbstractC23136l9.m118746s0(AbstractC8020f0.str_delete_from_phonebook_single, str2), str2, C23212s8.m119607o(getContext(), AbstractC2807a.TextColor1), 7));
                }
                Context m92689tK2 = m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                C16972e0.a aVar = new C16972e0.a(m92689tK2);
                aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
                aVar.m90918B(m118746s0);
                aVar.m90921E(true);
                obj = c19059j0.f94941p;
                if (obj != null) {
                    aVar.m90924a((CheckBox) obj);
                }
                aVar.m90947x("FRIEND_PROFILE_DELETE_FRIEND_DIALOG");
                String str3 = contactProfile.f42434r;
                AbstractC19074t.m100207e(str3, "uid");
                aVar.m90946w(m48276yM(str3, 1));
                aVar.m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger);
                String string = m92651WI().getString(AbstractC8020f0.str_btn_delete_contact_dialog);
                AbstractC19074t.m100207e(string, "getString(...)");
                aVar.m90943t(string, new InterfaceC17463d.d() { // from class: hw.z

                    /* renamed from: q */
                    public final /* synthetic */ ContactProfile f99529q;

                    /* renamed from: r */
                    public final /* synthetic */ C19059j0 f99530r;

                    public /* synthetic */ C20162z(ContactProfile contactProfile2, C19059j0 c19059j02) {
                        r2 = contactProfile2;
                        r3 = c19059j02;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        MiniUserDetailView.m48232AM(MiniUserDetailView.this, r2, r3, interfaceC17463d, i11);
                    }
                });
                aVar.m90937n("FRIEND_PROFILE_DELETE_FRIEND_DIALOG");
                String str4 = contactProfile2.f42434r;
                AbstractC19074t.m100207e(str4, "uid");
                aVar.m90936m(m48276yM(str4, 2));
                aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
                String string2 = m92651WI().getString(AbstractC8020f0.str_cancel);
                AbstractC19074t.m100207e(string2, "getString(...)");
                aVar.m90934k(string2, new InterfaceC17463d.d() { // from class: hw.a0
                    public /* synthetic */ C20134a0() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        MiniUserDetailView.m48233BM(MiniUserDetailView.this, interfaceC17463d, i11);
                    }
                });
                return aVar.m90927d();
            }
        }
        z11 = false;
        String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hint_delete_contact_dialog, m48238GM(this, contactProfile2, false, 2, null));
        AbstractC19074t.m100207e(m118746s02, "getString(...)");
        C19059j0 c19059j02 = new C19059j0();
        if (z11) {
        }
        Context m92689tK22 = m92689tK();
        AbstractC19074t.m100207e(m92689tK22, "requireContext(...)");
        C16972e0.a aVar2 = new C16972e0.a(m92689tK22);
        aVar2.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar2.m90918B(m118746s02);
        aVar2.m90921E(true);
        obj = c19059j02.f94941p;
        if (obj != null) {
        }
        aVar2.m90947x("FRIEND_PROFILE_DELETE_FRIEND_DIALOG");
        String str32 = contactProfile2.f42434r;
        AbstractC19074t.m100207e(str32, "uid");
        aVar2.m90946w(m48276yM(str32, 1));
        aVar2.m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger);
        String string3 = m92651WI().getString(AbstractC8020f0.str_btn_delete_contact_dialog);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar2.m90943t(string3, new InterfaceC17463d.d() { // from class: hw.z

            /* renamed from: q */
            public final /* synthetic */ ContactProfile f99529q;

            /* renamed from: r */
            public final /* synthetic */ C19059j0 f99530r;

            public /* synthetic */ C20162z(ContactProfile contactProfile2, C19059j0 c19059j022) {
                r2 = contactProfile2;
                r3 = c19059j022;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                MiniUserDetailView.m48232AM(MiniUserDetailView.this, r2, r3, interfaceC17463d, i11);
            }
        });
        aVar2.m90937n("FRIEND_PROFILE_DELETE_FRIEND_DIALOG");
        String str42 = contactProfile2.f42434r;
        AbstractC19074t.m100207e(str42, "uid");
        aVar2.m90936m(m48276yM(str42, 2));
        aVar2.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        String string22 = m92651WI().getString(AbstractC8020f0.str_cancel);
        AbstractC19074t.m100207e(string22, "getString(...)");
        aVar2.m90934k(string22, new InterfaceC17463d.d() { // from class: hw.a0
            public /* synthetic */ C20134a0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                MiniUserDetailView.m48233BM(MiniUserDetailView.this, interfaceC17463d, i11);
            }
        });
        return aVar2.m90927d();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        int i11;
        super.mo37111CJ(bundle);
        this.f48359N0 = new C23528a(m92648SI());
        C21927m m114302u = C21927m.m114302u();
        AbstractC19074t.m100207e(m114302u, "getInstance(...)");
        C18644n m98531l = C18644n.m98531l();
        AbstractC19074t.m100207e(m98531l, "getInstance(...)");
        this.f48361P0 = new C20152p(this, m114302u, m98531l);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("profile_uid");
        } else {
            str = null;
        }
        this.f48363R0 = String.valueOf(str);
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("type_list");
        } else {
            i11 = 0;
        }
        this.f48364S0 = i11;
        C0697c0.Companion.m1048b().m1043u("contacts_tab_friend_profile");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == this.f48366U0) {
            return m48277zM();
        }
        return null;
    }

    @Override // p219hw.InterfaceC20149m
    /* renamed from: Fm */
    public void mo48278Fm(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "uid");
        mo70710wy(new Runnable() { // from class: hw.b0

            /* renamed from: p */
            public final /* synthetic */ boolean f99450p;

            /* renamed from: q */
            public final /* synthetic */ MiniUserDetailView f99451q;

            /* renamed from: r */
            public final /* synthetic */ String f99452r;

            public /* synthetic */ RunnableC20136b0(boolean z112, MiniUserDetailView this, String str2) {
                r1 = z112;
                r2 = this;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MiniUserDetailView.m48256dN(r1, r2, r3);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29818g8 m147987c = C29818g8.m147987c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147987c, "inflate(...)");
        this.f48358M0 = m147987c;
        m48281NM();
        C29818g8 c29818g8 = this.f48358M0;
        if (c29818g8 == null) {
            AbstractC19074t.m100223u("binding");
            c29818g8 = null;
        }
        RelativeLayout root = c29818g8.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C0697c0.Companion.m1048b().m1035h("contacts_tab_friend_profile");
    }

    /* renamed from: IM */
    public final LinearLayoutManager m48279IM() {
        LinearLayoutManager linearLayoutManager = this.f48365T0;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        AbstractC19074t.m100223u("mLinearLayoutManager");
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 6200);
        bVar.m124119a().m124117e(this, 6201);
        bVar.m124119a().m124117e(this, 6202);
        bVar.m124119a().m124117e(this, 6203);
    }

    /* renamed from: MM */
    public void m48280MM(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        try {
            if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                AbstractC23059e9.m118318G(3);
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
                Intent intent = new Intent();
                intent.putExtras(m140776b);
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    m92676n2.mo35573l4(ChatView.class, intent.getExtras(), 1, true);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: NM */
    public void m48281NM() {
        this.f48371Z0 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        C29818g8 c29818g8 = this.f48358M0;
        C20133a c20133a = null;
        if (c29818g8 == null) {
            AbstractC19074t.m100223u("binding");
            c29818g8 = null;
        }
        ZRecyclerView zRecyclerView = c29818g8.f137876s;
        m48284YM(new LinearLayoutManager(zRecyclerView.getContext(), 0, false));
        zRecyclerView.setLayoutManager(m48279IM());
        zRecyclerView.setScaleType(1);
        zRecyclerView.setMinScale(0.77f);
        zRecyclerView.m9816A(new C9030c());
        zRecyclerView.m9826E(new C9031d());
        C20133a c20133a2 = new C20133a(this.f48369X0);
        c20133a2.m105081j0(new C9032e());
        c20133a2.m105082k0(new C9033f());
        c20133a2.m105078g0(new C9034g());
        c20133a2.m105080i0(new C9035h());
        this.f48362Q0 = c20133a2;
        zRecyclerView.setAdapter(c20133a2);
        C20133a c20133a3 = this.f48362Q0;
        if (c20133a3 == null) {
            AbstractC19074t.m100223u("miniUserDetailAdapter");
        } else {
            c20133a = c20133a3;
        }
        c20133a.m105086p0(m48239HM(this.f48364S0));
        new C1929v().mo10397b(zRecyclerView);
    }

    /* renamed from: UM */
    public void m48282UM(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", str);
        bundle.putString("extra_display_name", str2);
        bundle.putString("STR_SOURCE_START_VIEW", "711370");
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35581q(GroupInCommonView.class, bundle, 1, 1, true);
        }
    }

    @Override // p219hw.InterfaceC20149m
    /* renamed from: Ud */
    public void mo48283Ud() {
        C18644n.m98524E();
        List m48239HM = m48239HM(this.f48364S0);
        if (!this.f48373b1) {
            int size = m48239HM.size();
            C20133a c20133a = this.f48362Q0;
            C20133a c20133a2 = null;
            if (c20133a == null) {
                AbstractC19074t.m100223u("miniUserDetailAdapter");
                c20133a = null;
            }
            if (size == c20133a.mo10003k()) {
                ContactProfile contactProfile = this.f48360O0;
                if (contactProfile != null && this.f48374c1 != C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                    C20133a c20133a3 = this.f48362Q0;
                    if (c20133a3 == null) {
                        AbstractC19074t.m100223u("miniUserDetailAdapter");
                    } else {
                        c20133a2 = c20133a3;
                    }
                    String str = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    c20133a2.m105083l0(str);
                    return;
                }
                return;
            }
        }
        if (!m48239HM.isEmpty()) {
            m48249VM(m48239HM);
        } else {
            finish();
        }
        this.f48373b1 = false;
    }

    /* renamed from: YM */
    public final void m48284YM(LinearLayoutManager linearLayoutManager) {
        AbstractC19074t.m100208f(linearLayoutManager, "<set-?>");
        this.f48365T0 = linearLayoutManager;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m48251XM(view);
        m48243OM();
        AbstractC16768f.m89489a(view).m89430n(new InterfaceC27367c() { // from class: hw.x
            public /* synthetic */ C20160x() {
            }

            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                MiniUserDetailView.m48247SM(MiniUserDetailView.this, c1421e);
            }
        });
        C29818g8 c29818g8 = this.f48358M0;
        if (c29818g8 == null) {
            AbstractC19074t.m100223u("binding");
            c29818g8 = null;
        }
        RelativeLayout root = c29818g8.getRoot();
        m48252ZM();
        root.setOnClickListener(new View.OnClickListener() { // from class: hw.y
            public /* synthetic */ ViewOnClickListenerC20161y() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MiniUserDetailView.m48248TM(MiniUserDetailView.this, view2);
            }
        });
    }

    /* renamed from: bN */
    public void m48285bN(ContactProfile contactProfile) {
        Bundle bundle = new Bundle();
        if (contactProfile != null) {
            bundle.putString("uid", contactProfile.f42434r);
            bundle.putString("avt", contactProfile.f42446v);
            bundle.putString("dpn", contactProfile.f42437s);
            bundle.putString("cover", contactProfile.f42324B);
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35573l4(MutualFeedView.class, bundle, 1, true);
            }
        }
    }

    @Override // p219hw.InterfaceC20149m
    /* renamed from: ca */
    public void mo48286ca(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C20133a c20133a = this.f48362Q0;
        if (c20133a == null) {
            AbstractC19074t.m100223u("miniUserDetailAdapter");
            c20133a = null;
        }
        c20133a.m105089s0(str);
    }

    @Override // p219hw.InterfaceC20149m
    /* renamed from: e0 */
    public void mo48287e0(String str) {
        AbstractC19074t.m100208f(str, "msg");
        AbstractC19444a.m101697e(new Runnable() { // from class: hw.r

            /* renamed from: q */
            public final /* synthetic */ String f99515q;

            public /* synthetic */ RunnableC20154r(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MiniUserDetailView.m48254cN(MiniUserDetailView.this, r2);
            }
        });
    }

    /* renamed from: eN */
    public void m48288eN(ContactProfile contactProfile) {
        C17487o0 c17487o0;
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        try {
            if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                C21927m.m114302u().m114330e0(contactProfile.f42434r, new TrackingSource(49));
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    c17487o0 = m92676n2.mo35579p();
                } else {
                    c17487o0 = null;
                }
                C26365a m135743b = new C26365a.b(contactProfile.f42434r, C32002l4.Companion.m154287a(9)).m135739F("3250").m135743b();
                if (c17487o0 != null) {
                    new C19171b().m101508a(new C19171b.a(m92676n2(), m135743b, 0, 1));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fN */
    public void m48289fN(String str) {
        AbstractC22055v0.l lVar;
        AbstractC19074t.m100208f(str, "uid");
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        if (m115161u != null && (lVar = this.f48372a1) != null) {
            m115161u.m153811A(true);
            lVar.mo47172c(m115161u, null, 363);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "contacts_tab_friend_profile";
    }

    @Override // p219hw.InterfaceC20149m
    /* renamed from: k */
    public ZaloView mo48290k() {
        return this;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String stringExtra;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1 && i12 == -1 && intent != null && (stringExtra = intent.getStringExtra("uid")) != null && stringExtra.length() != 0) {
            C20133a c20133a = this.f48362Q0;
            C20133a c20133a2 = null;
            if (c20133a == null) {
                AbstractC19074t.m100223u("miniUserDetailAdapter");
                c20133a = null;
            }
            Integer m105068V = c20133a.m105068V(stringExtra);
            int intExtra = intent.getIntExtra("group_size", -1);
            if (intExtra > -1 && stringExtra.length() > 0 && m105068V != null && m105068V.intValue() != intExtra) {
                C20133a c20133a3 = this.f48362Q0;
                if (c20133a3 == null) {
                    AbstractC19074t.m100223u("miniUserDetailAdapter");
                } else {
                    c20133a2 = c20133a3;
                }
                c20133a2.m105087q0(stringExtra, intExtra);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo48283Ud();
    }

    /* renamed from: wM */
    public void m48291wM(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        Bundle m37139a = ChangeAliasBottomSheetView.Companion.m37139a(contactProfile.f42434r, contactProfile.f42437s, 708, new SensitiveData("phonebook_update_alias_in_profile_card", "phonebook_update", null, 4, null));
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(FrameLayoutKeepBtmSheetZaloView.class, m37139a, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        switch (i11) {
            case 6200:
                mo70710wy(new Runnable() { // from class: hw.u
                    public /* synthetic */ RunnableC20157u() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MiniUserDetailView.m48234CM(MiniUserDetailView.this);
                    }
                });
                return;
            case 6201:
                m48249VM(m48239HM(this.f48364S0));
                return;
            case 6202:
                mo70710wy(new Runnable() { // from class: hw.v

                    /* renamed from: q */
                    public final /* synthetic */ Object[] f99523q;

                    public /* synthetic */ RunnableC20158v(Object[] objArr2) {
                        r2 = objArr2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MiniUserDetailView.m48235DM(MiniUserDetailView.this, r2);
                    }
                });
                return;
            case 6203:
                Object obj = objArr2[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                m48236EM((String) obj);
                return;
            default:
                return;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f48372a1 = new C9036i();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 6200);
        bVar.m124119a().m124115b(this, 6201);
        bVar.m124119a().m124115b(this, 6202);
        bVar.m124119a().m124115b(this, 6203);
    }
}
