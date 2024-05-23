package com.zing.zalo.p077ui.searchglobal;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import ag0.InterfaceC0806b1;
import ai.C0862b;
import ai.InterfaceC0861a;
import am.AbstractC0924m0;
import am.C0927o;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.core.os.AbstractC1438d;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.searchglobal.SearchGlobalView;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalPreStateLayout;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalResultLayout;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalTextInputLayout;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.MyInfoView;
import com.zing.zalo.p077ui.zviews.StrangerMessagesView;
import com.zing.zalo.p077ui.zviews.VipMessagesView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dj.C17945a0;
import ea0.C18316b;
import ea0.C18328f;
import ea0.C18333g1;
import ea0.InterfaceC18319c;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import ga0.AbstractRunnableC19355q1;
import ga0.C19308b;
import ga0.C19314d;
import ga0.C19315d0;
import ga0.C19318e0;
import ga0.C19319e1;
import ga0.C19322f1;
import ga0.C19325g1;
import ga0.C19335k;
import ga0.C19342m0;
import ga0.C19348o0;
import ga0.C19353q;
import gg0.AbstractC19444a;
import gw.C19669z;
import ha0.C19955h;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jn0.AbstractC21317c;
import kn.AbstractC21777d;
import kotlin.NoWhenBranchMatchedException;
import l30.AbstractC22055v0;
import l30.C22033k0;
import me0.AbstractC23034c6;
import me0.AbstractC23059e9;
import me0.AbstractC23074g2;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23195r2;
import me0.C23013a7;
import me0.C23024b7;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONObject;
import p006a0.C0012a;
import p042bx.AbstractC3152g;
import p056cj.AbstractC3552t;
import p056cj.C3549q;
import p056cj.C3550r;
import p056cj.C3551s;
import p056cj.C3553u;
import p131ei.C18434b;
import p140ev.C18620i;
import p172fy.C19171b;
import p239ih.C20556f;
import p266jg.AbstractC21244b;
import p304ks.AbstractC21935u;
import p304ks.C21916c;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p578vk.AbstractC28275a;
import p578vk.C28276b;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29076h;
import p612wk.AbstractC29080l;
import p612wk.C29070b;
import p716zh.C31862c;
import p716zh.C31874cb;
import p716zh.C31877d;
import p716zh.C31980jc;
import p716zh.C32002l4;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import sa0.C26203c;
import sm.C26323a;
import sy.AbstractC26412d;
import th.AbstractC26681b;
import tk.InterfaceC26722a;
import u00.C26939u;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.AbstractC28207v1;
import vg.C28212v6;
import vg.C28213v7;

/* loaded from: classes6.dex */
public final class SearchGlobalView extends BaseZaloView implements C23744a.c, InterfaceC18319c, InterfaceC0733x {

    /* renamed from: v1 */
    private static int f67229v1;

    /* renamed from: w1 */
    private static boolean f67230w1;

    /* renamed from: M0 */
    private SearchGlobalPreStateLayout f67232M0;

    /* renamed from: N0 */
    private SearchGlobalResultLayout f67233N0;

    /* renamed from: O0 */
    private View f67234O0;

    /* renamed from: P0 */
    private boolean f67235P0 = true;

    /* renamed from: Q0 */
    private boolean f67236Q0 = true;

    /* renamed from: R0 */
    private boolean f67237R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f67238S0;

    /* renamed from: T0 */
    private AbstractC29069a f67239T0;

    /* renamed from: U0 */
    private int f67240U0;

    /* renamed from: V0 */
    private final Handler f67241V0;

    /* renamed from: W0 */
    private final Runnable f67242W0;

    /* renamed from: X0 */
    private boolean f67243X0;

    /* renamed from: Y0 */
    private boolean f67244Y0;

    /* renamed from: Z0 */
    private final InterfaceC24854k f67245Z0;

    /* renamed from: a1 */
    private final InterfaceC24854k f67246a1;

    /* renamed from: b1 */
    private final InterfaceC24854k f67247b1;

    /* renamed from: c1 */
    private EditText f67248c1;

    /* renamed from: d1 */
    private ImageView f67249d1;

    /* renamed from: e1 */
    private int f67250e1;

    /* renamed from: f1 */
    private boolean f67251f1;

    /* renamed from: g1 */
    private boolean f67252g1;

    /* renamed from: h1 */
    private ActionBarMenuItem f67253h1;

    /* renamed from: i1 */
    private C13306b f67254i1;

    /* renamed from: j1 */
    private ShowcaseView f67255j1;

    /* renamed from: k1 */
    private FrameLayout f67256k1;

    /* renamed from: l1 */
    private final C13020n f67257l1;

    /* renamed from: m1 */
    private C8009j f67258m1;

    /* renamed from: n1 */
    private C19348o0 f67259n1;

    /* renamed from: o1 */
    private AbstractRunnableC19355q1 f67260o1;

    /* renamed from: p1 */
    private final C19325g1 f67261p1;

    /* renamed from: q1 */
    private boolean f67262q1;

    /* renamed from: r1 */
    private String f67263r1;

    /* renamed from: s1 */
    private final HashSet f67264s1;

    /* renamed from: t1 */
    private final C13024r f67265t1;

    /* renamed from: u1 */
    private final Map f67266u1;
    public static final C13007a Companion = new C13007a(null);

    /* renamed from: x1 */
    private static byte f67231x1 = 1;

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$a */
    /* loaded from: classes6.dex */
    public static final class C13007a {
        private C13007a() {
        }

        public /* synthetic */ C13007a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m73192a() {
            return SearchGlobalView.f67229v1;
        }

        /* renamed from: b */
        public final void m73193b(int i11) {
            SearchGlobalView.f67229v1 = i11;
        }

        /* renamed from: c */
        public final void m73194c(C17487o0 c17487o0, Bundle bundle, int i11, int i12, boolean z11) {
            AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
            AbstractC19074t.m100208f(bundle, "extras");
            c17487o0.m93066i2(SearchGlobalView.class, bundle, i11, i12, z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$b */
    /* loaded from: classes6.dex */
    static final class C13008b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13008b f67267q = new C13008b();

        C13008b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < 20; i11++) {
                arrayList.add(375L);
            }
            for (int i12 = 0; i12 < 10; i12++) {
                arrayList.add(500L);
            }
            for (int i13 = 0; i13 < 5; i13++) {
                arrayList.add(750L);
            }
            for (int i14 = 0; i14 < 3; i14++) {
                arrayList.add(1000L);
            }
            arrayList.add(2000L);
            arrayList.add(3000L);
            arrayList.add(5000L);
            return arrayList;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$c */
    /* loaded from: classes6.dex */
    public static final class C13009c implements AbstractC22055v0.g {

        /* renamed from: b */
        final /* synthetic */ String f67269b;

        C13009c(String str) {
            this.f67269b = str;
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
            if (!SearchGlobalView.this.mo60294yp()) {
                SearchGlobalResultLayout searchGlobalResultLayout = SearchGlobalView.this.f67233N0;
                if (searchGlobalResultLayout == null) {
                    AbstractC19074t.m100223u("resultLayout");
                    searchGlobalResultLayout = null;
                }
                searchGlobalResultLayout.m73400f(this.f67269b);
            }
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            AbstractC19074t.m100208f(str, "msg");
            AbstractC19074t.m100208f(gVar, "errorCode");
            if (SearchGlobalView.this.m92672lJ()) {
                ToastUtils.showMess(str);
                SearchGlobalView.this.f67262q1 = false;
            }
            mo46561O();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$d */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC13010d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: p */
        final /* synthetic */ RobotoTextView f67270p;

        ViewTreeObserverOnGlobalLayoutListenerC13010d(RobotoTextView robotoTextView) {
            this.f67270p = robotoTextView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                ViewTreeObserver viewTreeObserver = this.f67270p.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                int measuredWidth = this.f67270p.getMeasuredWidth();
                this.f67270p.getPaint().setSubpixelText(true);
                C13007a c13007a = SearchGlobalView.Companion;
                c13007a.m73193b(this.f67270p.getPaint().breakText("abcd.fghij.klmlo.pqrst.uvw.xyz.abcde.fghij.FGHI .pqrst.uvw.QPT abc def ghi jkl mno pqr xyz abcd ABDR", true, measuredWidth, null));
                c13007a.m73193b((c13007a.m73192a() * 4) / 5);
                this.f67270p.setVisibility(8);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$e */
    /* loaded from: classes6.dex */
    public static final class C13011e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C18316b f67271q;

        /* renamed from: r */
        final /* synthetic */ SearchGlobalView f67272r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13011e(C18316b c18316b, SearchGlobalView searchGlobalView) {
            super(0);
            this.f67271q = c18316b;
            this.f67272r = searchGlobalView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m73198d(final SearchGlobalView searchGlobalView) {
            AbstractC19074t.m100208f(searchGlobalView, "this$0");
            C23024b7.f111993a.m118075x(searchGlobalView.f67261p1);
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.searchglobal.b
                @Override // java.lang.Runnable
                public final void run() {
                    SearchGlobalView.C13011e.m73199e(SearchGlobalView.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m73199e(SearchGlobalView searchGlobalView) {
            AbstractC19074t.m100208f(searchGlobalView, "this$0");
            searchGlobalView.m73158qO();
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m73200c();
            return C24848g0.f119245a;
        }

        /* renamed from: c */
        public final void m73200c() {
            if ((this.f67271q.m97245a() instanceof AbstractC29069a.a) && (this.f67271q.m97248d() instanceof C20556f)) {
                this.f67272r.m73183W((C20556f) this.f67271q.m97248d());
                InterfaceC0806b1 m2237f = AbstractC0837p0.Companion.m2237f();
                final SearchGlobalView searchGlobalView = this.f67272r;
                m2237f.mo2040a(new Runnable() { // from class: com.zing.zalo.ui.searchglobal.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchGlobalView.C13011e.m73198d(SearchGlobalView.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$f */
    /* loaded from: classes6.dex */
    public static final class C13012f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C18316b f67273q;

        /* renamed from: r */
        final /* synthetic */ SearchGlobalView f67274r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13012f(C18316b c18316b, SearchGlobalView searchGlobalView) {
            super(0);
            this.f67273q = c18316b;
            this.f67274r = searchGlobalView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m73201a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m73201a() {
            SearchGlobalView.m73177xO(this.f67274r, new C26365a.b((String) this.f67273q.m97247c(), C32002l4.Companion.m154287a(8)).m135743b(), 0, 2, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$g */
    /* loaded from: classes6.dex */
    static final class C13013g extends AbstractC19075u implements InterfaceC18494a {
        C13013g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m73202a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m73202a() {
            SearchGlobalView.this.f67261p1.m101243v().m142524l(true);
            SearchGlobalView.this.m73158qO();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$h */
    /* loaded from: classes6.dex */
    public static final class C13014h implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f67277b;

        C13014h(String str) {
            this.f67277b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m73204d(String str, SearchGlobalView searchGlobalView) {
            AbstractC19074t.m100208f(str, "$uid");
            AbstractC19074t.m100208f(searchGlobalView, "this$0");
            C21927m.m114302u().m114346m0(str);
            if (Build.VERSION.SDK_INT >= 25) {
                C26939u.m138770q().m138782m(str);
            }
            C19669z.Companion.m103232a().m103198O0();
            searchGlobalView.mo205i9(new C18316b("ACTION_FORCE_RELOAD_RESULT_UI", null, null, null, 14, null));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            SearchGlobalView.this.mo49315c4();
            ToastUtils.showMess(c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            SearchGlobalView.this.mo49315c4();
            final SearchGlobalView searchGlobalView = SearchGlobalView.this;
            final String str = this.f67277b;
            searchGlobalView.mo70710wy(new Runnable() { // from class: ea0.v0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchGlobalView.C13014h.m73204d(str, searchGlobalView);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$i */
    /* loaded from: classes6.dex */
    public static final class C13015i extends AbstractC18391a {
        C13015i() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            SearchGlobalView.this.m73186hO();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$j */
    /* loaded from: classes6.dex */
    public static final class C13016j extends ZdsActionBar.AbstractC16987c {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18494a f67279a;

        C13016j(InterfaceC18494a interfaceC18494a) {
            this.f67279a = interfaceC18494a;
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            this.f67279a.mo12V4();
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            this.f67279a.mo12V4();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$k */
    /* loaded from: classes6.dex */
    static final class C13017k extends AbstractC19075u implements InterfaceC18494a {
        C13017k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m73205a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m73205a() {
            String str;
            SearchGlobalView.this.m73189tN(true);
            SearchGlobalView.this.f67261p1.m101198X("2");
            if (TextUtils.isEmpty(SearchGlobalView.this.m73066E2())) {
                str = "3000116";
            } else {
                str = "3000125";
            }
            AbstractC23647d.m123906p(str);
            AbstractC23647d.m123893c();
            C19955h.f98250a.m103731u(SearchGlobalView.this.f67261p1, "5");
            if (!SearchGlobalView.this.m92681pJ() && !SearchGlobalView.this.m92677nJ()) {
                SearchGlobalView.this.finish();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$l */
    /* loaded from: classes6.dex */
    public static final class C13018l implements InterfaceC18319c {
        C13018l() {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C18316b mo205i9(C18316b c18316b) {
            AbstractC19074t.m100208f(c18316b, "action");
            if (!AbstractC19074t.m100204b(c18316b.m97246b(), "ACTION_SUBMIT_LIST_RESULT")) {
                return SearchGlobalView.this.mo205i9(c18316b);
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$m */
    /* loaded from: classes6.dex */
    static final class C13019m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$m$a */
        /* loaded from: classes6.dex */
        public static final class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ SearchGlobalView f67283p;

            a(SearchGlobalView searchGlobalView) {
                this.f67283p = searchGlobalView;
            }

            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ping ");
                sb2.append(currentTimeMillis);
                if (this.f67283p.f67243X0) {
                    AbstractC3152g.m15868a().postDelayed(this, 150L);
                }
            }
        }

        C13019m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(SearchGlobalView.this);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$n */
    /* loaded from: classes6.dex */
    public static final class C13020n implements InterfaceC13567b1.a {
        C13020n() {
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            if (c31862c == null || str == null || str2 == null) {
                return;
            }
            SearchGlobalView.this.m73184XN(c31862c, str, str2);
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$o */
    /* loaded from: classes6.dex */
    static final class C13021o extends AbstractC19075u implements InterfaceC18494a {
        C13021o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            Bundle m92642L3;
            Bundle m92642L32 = SearchGlobalView.this.m92642L3();
            boolean z11 = true;
            if ((m92642L32 == null || !m92642L32.getBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT")) && ((m92642L3 = SearchGlobalView.this.m92642L3()) == null || !m92642L3.getBoolean("from_dynamic_shortcut"))) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$p */
    /* loaded from: classes6.dex */
    public static final class C13022p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ AbstractC29069a f67287r;

        /* renamed from: s */
        final /* synthetic */ AbstractC3552t f67288s;

        /* renamed from: t */
        final /* synthetic */ int f67289t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13022p(AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t, int i11) {
            super(1);
            this.f67287r = abstractC29069a;
            this.f67288s = abstractC3552t;
            this.f67289t = i11;
        }

        /* renamed from: a */
        public final void m73209a(int i11) {
            SearchGlobalView.this.m73102UN(this.f67287r, this.f67288s, this.f67289t, i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m73209a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$q */
    /* loaded from: classes6.dex */
    static final class C13023q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13023q f67290q = new C13023q();

        C13023q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            List m131506n;
            m131506n = AbstractC25368s.m131506n("", "a", "z", "za", "vk", "zalo", "index", "inde", "gia", "iphone", "tro", "stk", "nhom", "bao");
            return m131506n;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.SearchGlobalView$r */
    /* loaded from: classes6.dex */
    public static final class C13024r implements C17945a0.x {
        C13024r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m73212b(SearchGlobalView searchGlobalView, MessageId messageId) {
            AbstractC19074t.m100208f(searchGlobalView, "this$0");
            AbstractC19074t.m100208f(messageId, "$messageId");
            searchGlobalView.m73191wO(messageId);
        }

        @Override // dj.C17945a0.x
        /* renamed from: G */
        public void mo61268G(int i11, final MessageId messageId) {
            AbstractC19074t.m100208f(messageId, "messageId");
            final SearchGlobalView searchGlobalView = SearchGlobalView.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: ea0.w0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchGlobalView.C13024r.m73212b(SearchGlobalView.this, messageId);
                }
            });
        }

        @Override // dj.C17945a0.x
        /* renamed from: H */
        public void mo61269H(MessageId messageId, boolean z11) {
        }

        @Override // dj.C17945a0.x
        /* renamed from: m */
        public void mo61273m(int i11, MessageId messageId) {
            AbstractC19074t.m100208f(messageId, "messageId");
        }

        @Override // dj.C17945a0.x
        /* renamed from: s */
        public void mo61274s(MessageId messageId, String str, boolean z11) {
        }
    }

    public SearchGlobalView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(new C13021o());
        this.f67238S0 = m129210a;
        this.f67240U0 = -1;
        this.f67241V0 = new Handler(Looper.getMainLooper());
        this.f67242W0 = new Runnable() { // from class: ea0.g0
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalView.m73117cO(SearchGlobalView.this);
            }
        };
        m129210a2 = AbstractC24856m.m129210a(C13008b.f67267q);
        this.f67245Z0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C13023q.f67290q);
        this.f67246a1 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C13019m());
        this.f67247b1 = m129210a4;
        this.f67252g1 = true;
        this.f67257l1 = new C13020n();
        this.f67261p1 = new C19325g1();
        this.f67264s1 = new HashSet();
        this.f67265t1 = new C13024r();
        this.f67266u1 = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public static final void m73058AN(SearchGlobalView searchGlobalView, AbstractC29069a.m mVar, int i11) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        new C19314d(searchGlobalView, new C18316b("Search.Result.ClickItem", mVar, Integer.valueOf(i11), null, 8, null), searchGlobalView.m73066E2(), C18620i.f93690g0).m101441i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public static final void m73060BN(SearchGlobalView searchGlobalView, AbstractC29069a.s.q qVar, int i11) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(qVar, "$seeMore");
        new C19342m0(searchGlobalView, new C18316b("Search.Result.ClickItemSeeMore", qVar, Integer.valueOf(i11), null, 8, null), searchGlobalView.m73066E2()).m101441i();
    }

    /* renamed from: Bt */
    private final void m73061Bt(String str) {
        m73189tN(true);
        C18333g1.f92667a.m97298v(this, str, 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public static final void m73063CN(final SearchGlobalView searchGlobalView) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        C23024b7.f111993a.m118075x(searchGlobalView.f67261p1);
        AbstractC19444a.m101695c(new Runnable() { // from class: ea0.d0
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalView.m73065DN(SearchGlobalView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public static final void m73065DN(SearchGlobalView searchGlobalView) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        searchGlobalView.mo205i9(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E2 */
    public final String m73066E2() {
        return this.f67261p1.m101211f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public static final void m73068EN(final SearchGlobalView searchGlobalView, C18316b c18316b) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(c18316b, "$action");
        C23024b7.f111993a.m118075x(searchGlobalView.f67261p1);
        AbstractC19444a.m101695c(new Runnable() { // from class: ea0.i0
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalView.m73070FN(SearchGlobalView.this);
            }
        });
        C19955h.f98250a.m103730s(searchGlobalView.f67261p1, (InterfaceC26722a) c18316b.m97245a(), ((Number) c18316b.m97247c()).intValue(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public static final void m73070FN(SearchGlobalView searchGlobalView) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        searchGlobalView.mo205i9(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
    }

    /* renamed from: G1 */
    private final void m73071G1(String str) {
        C18333g1.f92667a.m97295q(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public static final void m73073GN(final SearchGlobalView searchGlobalView, C18316b c18316b) {
        AbstractC3552t abstractC3552t;
        int i11;
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(c18316b, "$action");
        C23024b7.f111993a.m118075x(searchGlobalView.f67261p1);
        AbstractC19444a.m101695c(new Runnable() { // from class: ea0.f0
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalView.m73075HN(SearchGlobalView.this);
            }
        });
        Object m97248d = c18316b.m97248d();
        if (m97248d instanceof AbstractC3552t) {
            abstractC3552t = (AbstractC3552t) m97248d;
        } else {
            abstractC3552t = null;
        }
        if (abstractC3552t instanceof C3551s) {
            i11 = 10;
        } else if (abstractC3552t instanceof C3549q) {
            i11 = 9;
        } else if ((abstractC3552t instanceof C3550r) || abstractC3552t == null) {
            i11 = 1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C19955h.f98250a.m103730s(searchGlobalView.f67261p1, (InterfaceC26722a) c18316b.m97245a(), ((Number) c18316b.m97247c()).intValue(), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HN */
    public static final void m73075HN(SearchGlobalView searchGlobalView) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        searchGlobalView.mo205i9(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public static final void m73077IN(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$dispatchAction");
        interfaceC18494a.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JN */
    public static final void m73079JN(SearchGlobalView searchGlobalView, C18316b c18316b) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(c18316b, "$action");
        searchGlobalView.m73191wO((MessageId) c18316b.m97248d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public static final void m73081KN() {
        ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LN */
    public static final void m73083LN(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$dispatchAction");
        interfaceC18494a.mo12V4();
    }

    /* renamed from: MN */
    private final boolean m73085MN() {
        return this.f67261p1.m101243v().m142520h();
    }

    /* renamed from: NN */
    private final void m73087NN() {
        try {
            C24861r.a aVar = C24861r.f119264q;
            SearchGlobalResultLayout searchGlobalResultLayout = this.f67233N0;
            if (searchGlobalResultLayout == null) {
                AbstractC19074t.m100223u("resultLayout");
                searchGlobalResultLayout = null;
            }
            C18316b mo205i9 = searchGlobalResultLayout.mo205i9(new C18316b("SGResultLayout:ACTION_PERFORM_CLICK_ON_FIRST_RESULT_ITEM", Integer.valueOf(this.f67261p1.m101207d()), null, null, 12, null));
            if (mo205i9 == null || !AbstractC19074t.m100204b(mo205i9.m97245a(), Boolean.TRUE)) {
                m73189tN(false);
            }
            C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public static final void m73089ON(SearchGlobalView searchGlobalView, String str) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        if (!searchGlobalView.mo60294yp()) {
            SearchGlobalResultLayout searchGlobalResultLayout = null;
            if (str != null) {
                SearchGlobalResultLayout searchGlobalResultLayout2 = searchGlobalView.f67233N0;
                if (searchGlobalResultLayout2 == null) {
                    AbstractC19074t.m100223u("resultLayout");
                } else {
                    searchGlobalResultLayout = searchGlobalResultLayout2;
                }
                searchGlobalResultLayout.m73400f(str);
                return;
            }
            SearchGlobalResultLayout searchGlobalResultLayout3 = searchGlobalView.f67233N0;
            if (searchGlobalResultLayout3 == null) {
                AbstractC19074t.m100223u("resultLayout");
            } else {
                searchGlobalResultLayout = searchGlobalResultLayout3;
            }
            searchGlobalResultLayout.m73399e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PN */
    public static final void m73091PN(SearchGlobalView searchGlobalView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        try {
            ContactProfile m101203b = searchGlobalView.f67261p1.m101203b();
            if (m101203b != null) {
                String str = m101203b.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                if (str.length() > 0) {
                    String str2 = m101203b.f42434r;
                    AbstractC19074t.m100207e(str2, "uid");
                    Bundle m140776b = new C27870vb(str2).m140780g(m101203b).m140776b();
                    InterfaceC27218a m92676n2 = searchGlobalView.f72421L0.m92676n2();
                    if (m92676n2 != null) {
                        m92676n2.mo35573l4(ChatView.class, m140776b, 1, true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QN */
    public static final void m73093QN(SimpleAdapter simpleAdapter, SearchGlobalView searchGlobalView, AbstractC29069a.o oVar, InterfaceC17463d interfaceC17463d, int i11) {
        Integer num;
        AbstractC19074t.m100208f(simpleAdapter, "$adapterMenuRemoveHiddenChat");
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(oVar, "$selectingItem");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<*, *>");
        Object obj = ((HashMap) item).get("id");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        int i12 = AbstractC8020f0.str_remove_uid_hide_message;
        if (num != null && num.intValue() == i12) {
            searchGlobalView.f67239T0 = oVar;
            searchGlobalView.showDialog(14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RN */
    public static final void m73095RN(SearchGlobalView searchGlobalView, AbstractC29069a.o oVar, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(oVar, "$selectingItem");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        searchGlobalView.mo46829Y();
        String mo2478b = oVar.m145198e().mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        AbstractC23195r2.m119522i(mo2478b, new C13014h(mo2478b));
    }

    /* renamed from: Rt */
    private final void m73096Rt(AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t, int i11, List list) {
        this.f67258m1 = C18333g1.f92667a.m97284A(this, list, new C13022p(abstractC29069a, abstractC3552t, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SN */
    public static final void m73098SN(SearchGlobalView searchGlobalView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        new C19353q(searchGlobalView, searchGlobalView.m73066E2(), null, AbstractC29069a.p.a.f134715c, 0, true).m101442j();
    }

    /* renamed from: TN */
    private final void m73100TN(AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t, int i11) {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            List list = null;
            if (!(abstractC3552t instanceof C3549q)) {
                if (abstractC3552t instanceof C3551s) {
                    if (!AbstractC19074t.m100204b(((C3551s) abstractC3552t).m18046a(), "recommened.user")) {
                        list = AbstractC25368s.m131506n(Integer.valueOf(AbstractC8020f0.share), Integer.valueOf(AbstractC8020f0.str_media_store_copy_link));
                    }
                } else if (abstractC3552t instanceof C3550r) {
                    if (abstractC29069a instanceof AbstractC29069a.e) {
                        list = AbstractC25368s.m131506n(Integer.valueOf(AbstractC8020f0.share), Integer.valueOf(AbstractC8020f0.str_view_original_msg));
                    } else if (abstractC29069a instanceof AbstractC29069a.j) {
                        list = AbstractC25368s.m131506n(Integer.valueOf(AbstractC8020f0.share), Integer.valueOf(AbstractC8020f0.str_media_store_copy_link), Integer.valueOf(AbstractC8020f0.str_view_original_msg));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                m73096Rt(abstractC29069a, abstractC3552t, i11, list);
            }
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UN */
    public final void m73102UN(final AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t, final int i11, int i12) {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            if (i12 == AbstractC8020f0.share) {
                m73139lE(abstractC29069a, abstractC3552t);
            } else if (i12 == AbstractC8020f0.str_media_store_copy_link) {
                if (abstractC3552t instanceof C3551s) {
                    m73071G1(((C3551s) abstractC3552t).m18051f());
                } else if (abstractC3552t instanceof C3550r) {
                    String m95090b5 = ((C3550r) abstractC3552t).m18045a().m40599m().m95090b5();
                    AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                    m73071G1(m95090b5);
                }
            } else if (i12 != AbstractC8020f0.str_media_store_download_file && i12 == AbstractC8020f0.str_view_original_msg) {
                if (abstractC29069a instanceof AbstractC29069a.a) {
                    C3553u m18037d = ((AbstractC29069a.a) abstractC29069a).m145142f().m18037d();
                    m73174wk(m18037d.m18055d(), MessageId.Companion.m41063a(m18037d.m18052a(), m18037d.m18053b(), m18037d.m18055d(), m18037d.m18056e()), null, null);
                } else if (abstractC29069a instanceof AbstractC29069a.e) {
                    String mo95039W2 = ((AbstractC29069a.e) abstractC29069a).m145174b().m40599m().mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    m73174wk(mo95039W2, ((AbstractC29069a.e) abstractC29069a).m145174b().m40571M(), null, null);
                } else if (abstractC29069a instanceof AbstractC29069a.j) {
                    String mo95039W22 = ((AbstractC29069a.j) abstractC29069a).m145186b().m40599m().mo95039W2();
                    AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                    m73174wk(mo95039W22, ((AbstractC29069a.j) abstractC29069a).m145186b().m40571M(), null, null);
                }
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.e0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchGlobalView.m73104VN(SearchGlobalView.this, abstractC29069a, i11);
                }
            });
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public static final void m73104VN(final SearchGlobalView searchGlobalView, AbstractC29069a abstractC29069a, int i11) {
        AbstractC19074t.m100208f(searchGlobalView, "$this_runCatching");
        AbstractC19074t.m100208f(abstractC29069a, "$data");
        C23024b7.f111993a.m118075x(searchGlobalView.f67261p1);
        AbstractC19444a.m101695c(new Runnable() { // from class: ea0.l0
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalView.m73106WN(SearchGlobalView.this);
            }
        });
        C19955h.f98250a.m103730s(searchGlobalView.f67261p1, abstractC29069a, i11, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WN */
    public static final void m73106WN(SearchGlobalView searchGlobalView) {
        AbstractC19074t.m100208f(searchGlobalView, "$this_runCatching");
        searchGlobalView.mo205i9(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
    }

    /* renamed from: XM */
    private final void m73107XM(String str) {
        boolean z11;
        ActionBarMenuItem actionBarMenuItem;
        int length = AbstractC28025b8.f130826C.length;
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = AbstractC28025b8.f130826C[i11];
            if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (AbstractC19074t.m100204b(str2, "tip.globalsearch.qr") && (actionBarMenuItem = this.f67253h1) != null) {
                    actionBarMenuItem.setEnableNoti(z11);
                }
            }
        }
    }

    /* renamed from: YM */
    private final void m73108YM(String str) {
        try {
            C13306b m73185hN = m73185hN();
            if (m73185hN != null && !m73185hN.m74707p()) {
                Iterator it = AbstractC28025b8.m141457m(AbstractC28025b8.f130826C).iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    final C28212v6 c28212v6 = (C28212v6) it.next();
                    if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131579e && (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, c28212v6.f131577c))) {
                        String str2 = c28212v6.f131577c;
                        AbstractC19074t.m100207e(str2, "tipCat");
                        View m73141lN = m73141lN(str2);
                        if (m73141lN != null && !z11 && m73141lN.isShown()) {
                            this.f67255j1 = new ShowcaseView(m73141lN.getContext());
                            C26203c m134769a = C26203c.m134769a(m73141lN.getContext());
                            m134769a.m134770b(c28212v6, m73141lN.getContext());
                            m134769a.f124524o = m73141lN;
                            ShowcaseView showcaseView = this.f67255j1;
                            AbstractC19074t.m100205c(showcaseView);
                            showcaseView.setConfigs(m134769a);
                            ShowcaseView showcaseView2 = this.f67255j1;
                            AbstractC19074t.m100205c(showcaseView2);
                            showcaseView2.setShowcaseId(c28212v6.f131577c);
                            ShowcaseView showcaseView3 = this.f67255j1;
                            AbstractC19074t.m100205c(showcaseView3);
                            showcaseView3.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: ea0.h0
                                @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                                /* renamed from: a */
                                public final void mo39159a(ShowcaseView showcaseView4, int i11, int i12, boolean z12) {
                                    SearchGlobalView.m73110ZM(SearchGlobalView.this, c28212v6, showcaseView4, i11, i12, z12);
                                }
                            });
                            if (this.f67256k1 == null) {
                                this.f67256k1 = new FrameLayout(this.f72421L0.m92689tK());
                            }
                            View m92656bJ = this.f72421L0.m92656bJ();
                            if (m92656bJ != null && (m92656bJ instanceof FrameLayout)) {
                                ((FrameLayout) m92656bJ).addView(this.f67256k1, new FrameLayout.LayoutParams(-1, -1));
                            }
                            C13306b c13306b = this.f67254i1;
                            if (c13306b != null) {
                                c13306b.m74687C(this.f67256k1);
                            }
                            ShowcaseView showcaseView4 = this.f67255j1;
                            AbstractC19074t.m100205c(showcaseView4);
                            showcaseView4.setShowcaseManager(m73185hN);
                            ShowcaseView showcaseView5 = this.f67255j1;
                            AbstractC19074t.m100205c(showcaseView5);
                            showcaseView5.m74637r();
                            z11 = true;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YN */
    private final void m73109YN(String str, String str2) {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            if (!TextUtils.isEmpty(str)) {
                C31877d c31877d = new C31877d();
                Bundle bundle = c31877d.f146417c;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSerializable("EXTRA_SOURCE_OPEN_MA", C18620i.f93683Z);
                c31877d.f146417c = bundle;
                AbstractC28207v1.m141994i3(str, 4, m92676n2(), this, str2, c31877d);
            }
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public static final void m73110ZM(SearchGlobalView searchGlobalView, C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        if (showcaseView == searchGlobalView.f67255j1) {
            searchGlobalView.f67255j1 = null;
        }
        FrameLayout frameLayout = searchGlobalView.f67256k1;
        if (frameLayout != null) {
            AbstractC19074t.m100205c(frameLayout);
            if (frameLayout.getParent() != null) {
                FrameLayout frameLayout2 = searchGlobalView.f67256k1;
                AbstractC19074t.m100205c(frameLayout2);
                ViewParent parent = frameLayout2.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(searchGlobalView.f67256k1);
            }
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZN */
    public static final void m73111ZN(SearchGlobalView searchGlobalView) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        searchGlobalView.m73108YM("tip.any");
        searchGlobalView.m73107XM("tip.any");
    }

    /* renamed from: aN */
    private final boolean m73112aN() {
        return AbstractC21777d.m112310a(this.f72421L0.m92693xK(), this.f72421L0.m92642L3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aO */
    public static final boolean m73113aO(SearchGlobalView searchGlobalView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        if (!AbstractC29069a.Companion.m145171a(i11, 2) && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        searchGlobalView.m73087NN();
        return true;
    }

    /* renamed from: bN */
    private final void m73114bN(boolean z11) {
        if (z11) {
            this.f67261p1.m101244v0(true);
        }
        m73158qO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bO */
    public static final void m73115bO(SearchGlobalView searchGlobalView, View view) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        searchGlobalView.m73189tN(true);
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        bundle.putInt("extra_src", 5);
        searchGlobalView.f67261p1.m101198X("3");
        AbstractC26412d.a aVar = AbstractC26412d.Companion;
        InterfaceC27218a m92676n2 = searchGlobalView.m92676n2();
        AbstractC19074t.m100205c(m92676n2);
        aVar.m136233E(m92676n2, bundle, 0);
        AbstractC28025b8.m141442M("tip.globalsearch.qr");
        C19955h.f98250a.m103731u(searchGlobalView.f67261p1, "4");
        AbstractC23647d.m123906p("300016");
        AbstractC23647d.m123893c();
    }

    /* renamed from: cN */
    static /* synthetic */ void m73116cN(SearchGlobalView searchGlobalView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        searchGlobalView.m73114bN(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cO */
    public static final void m73117cO(SearchGlobalView searchGlobalView) {
        String m73133iN;
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        try {
            if (searchGlobalView.f67244Y0) {
                m73133iN = searchGlobalView.m73136jN();
            } else {
                m73133iN = searchGlobalView.m73133iN();
            }
            if (m73133iN != searchGlobalView.m73066E2()) {
                searchGlobalView.m73145mO(searchGlobalView.m73066E2());
                searchGlobalView.m73148nO(m73133iN);
                searchGlobalView.m73134iO(m73133iN);
            }
            if (searchGlobalView.f67244Y0) {
                searchGlobalView.m73154pO();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C19955h.f98250a.m103728o(searchGlobalView.f67261p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public static final void m73119dN(SearchGlobalView searchGlobalView) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        if (!searchGlobalView.mo60294yp()) {
            SearchGlobalResultLayout searchGlobalResultLayout = searchGlobalView.f67233N0;
            if (searchGlobalResultLayout == null) {
                AbstractC19074t.m100223u("resultLayout");
                searchGlobalResultLayout = null;
            }
            searchGlobalResultLayout.m73399e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dO */
    public static final void m73120dO(boolean z11) {
        if (AbstractC23309i.m122601y2() == 1) {
            C21916c.m114210e().m114214d(1);
        }
        if (!z11) {
            C28213v7.f131603a.m142176d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public static final void m73122eN(SearchGlobalView searchGlobalView, String str) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(str, "$tipCat");
        searchGlobalView.m73108YM(str);
        searchGlobalView.m73107XM(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eO */
    public static final void m73123eO(SearchGlobalView searchGlobalView) {
        EditText editText;
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        if (!searchGlobalView.f72421L0.m92677nJ() && !searchGlobalView.f72421L0.m92681pJ() && (editText = searchGlobalView.f67248c1) != null) {
            if (searchGlobalView.f67252g1) {
                editText.clearFocus();
                AbstractC2379w.m12432f(searchGlobalView.f67248c1);
            } else {
                searchGlobalView.f67252g1 = true;
            }
        }
    }

    /* renamed from: fN */
    private final List m73125fN() {
        return (List) this.f67245Z0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fO */
    public static final void m73126fO() {
        C28213v7.f131603a.m142174b();
    }

    /* renamed from: gE */
    private final void m73127gE(String str, AbstractC29080l abstractC29080l, AbstractC29076h abstractC29076h, String str2, String str3, int i11, long j11, int i12) {
        C18333g1.f92667a.m97299x(this, str, abstractC29080l, abstractC29076h, str2, str3, i11, j11, i12);
    }

    /* renamed from: gN */
    private final Runnable m73129gN() {
        return (Runnable) this.f67247b1.getValue();
    }

    /* renamed from: gO */
    static /* synthetic */ void m73130gO(SearchGlobalView searchGlobalView, String str, AbstractC29080l abstractC29080l, AbstractC29076h abstractC29076h, String str2, String str3, int i11, long j11, int i12, int i13, Object obj) {
        searchGlobalView.m73127gE(str, abstractC29080l, (i13 & 4) != 0 ? null : abstractC29076h, str2, str3, i11, j11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:            r7 = on0.AbstractC24341v.m127114D(r1, "\n", " ", false, 4, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:            r0 = on0.AbstractC24341v.m127114D(r7, "\r", " ", false, 4, null);     */
    /* renamed from: iN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String m73133iN() {
        Editable text;
        String m127114D;
        String m127114D2;
        CharSequence m127168X0;
        EditText editText = this.f67248c1;
        if (editText != null && (text = editText.getText()) != null && (r1 = text.toString()) != null && m127114D != null && m127114D2 != null) {
            m127168X0 = AbstractC24342w.m127168X0(m127114D2);
            String obj = m127168X0.toString();
            if (obj != null) {
                return obj;
            }
        }
        return "";
    }

    /* renamed from: iO */
    private final void m73134iO(String str) {
        if (str.length() > 0) {
            m73142lO(1);
            m73161rO();
            return;
        }
        m73142lO(0);
        AbstractRunnableC19355q1 abstractRunnableC19355q1 = this.f67260o1;
        if (abstractRunnableC19355q1 != null) {
            abstractRunnableC19355q1.m101436c();
        }
        this.f67260o1 = null;
    }

    /* renamed from: jN */
    private final String m73136jN() {
        return (String) m73138kN().get(AbstractC21317c.f103810p.mo110373e(m73138kN().size()));
    }

    /* renamed from: kN */
    private final List m73138kN() {
        return (List) this.f67246a1.getValue();
    }

    /* renamed from: lE */
    private final void m73139lE(AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t) {
        C18333g1.f92667a.m97301z(this, abstractC29069a, abstractC3552t);
    }

    /* renamed from: lN */
    private final View m73141lN(String str) {
        if (AbstractC19074t.m100204b(str, "tip.globalsearch.qr")) {
            return this.f67253h1;
        }
        return null;
    }

    /* renamed from: lO */
    private final void m73142lO(int i11) {
        if (i11 != this.f67240U0) {
            View view = null;
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f67240U0 = 1;
                    SearchGlobalPreStateLayout searchGlobalPreStateLayout = this.f67232M0;
                    if (searchGlobalPreStateLayout == null) {
                        AbstractC19074t.m100223u("preStateLayout");
                        searchGlobalPreStateLayout = null;
                    }
                    searchGlobalPreStateLayout.setVisibility(8);
                    SearchGlobalResultLayout searchGlobalResultLayout = this.f67233N0;
                    if (searchGlobalResultLayout == null) {
                        AbstractC19074t.m100223u("resultLayout");
                    } else {
                        view = searchGlobalResultLayout;
                    }
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            this.f67240U0 = 0;
            SearchGlobalResultLayout searchGlobalResultLayout2 = this.f67233N0;
            if (searchGlobalResultLayout2 == null) {
                AbstractC19074t.m100223u("resultLayout");
                searchGlobalResultLayout2 = null;
            }
            searchGlobalResultLayout2.setVisibility(8);
            SearchGlobalPreStateLayout searchGlobalPreStateLayout2 = this.f67232M0;
            if (searchGlobalPreStateLayout2 == null) {
                AbstractC19074t.m100223u("preStateLayout");
            } else {
                view = searchGlobalPreStateLayout2;
            }
            view.setVisibility(0);
            mo205i9(new C18316b("ACTION_CLEAR_SEARCH_RESULT_STATE", null, null, null, 14, null));
        }
    }

    /* renamed from: mN */
    private final void m73144mN(String str) {
        C31980jc m115161u;
        try {
            if (AbstractC22055v0.m115114D(str, AbstractC21244b.m110054d(getContext())) && (m115161u = AbstractC22055v0.m115161u(str)) != null) {
                this.f67262q1 = true;
                m115161u.f147030w = true;
                this.f67263r1 = str;
                AbstractC22055v0.m115123M(m115161u, this, 1011, 347, null, new C13009c(str));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mO */
    private final void m73145mO(String str) {
        this.f67261p1.m101228n0(str);
    }

    /* renamed from: nN */
    private final void m73147nN(final AbstractC29069a abstractC29069a, final int i11, final View view) {
        HashMap m131406k;
        HashMap m131406k2;
        C8009j c8009j;
        HashMap m131406k3;
        int i12;
        boolean z11;
        try {
            String m73066E2 = m73066E2();
            int length = m73066E2.length() - 1;
            int i13 = 0;
            boolean z12 = false;
            while (i13 <= length) {
                if (!z12) {
                    i12 = i13;
                } else {
                    i12 = length;
                }
                if (AbstractC19074t.m100209g(m73066E2.charAt(i12), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i13++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            m73066E2.subSequence(i13, length + 1).toString();
            ArrayList arrayList = new ArrayList();
            if ((abstractC29069a instanceof AbstractC29069a.e) || (abstractC29069a instanceof AbstractC29069a.j)) {
                m131406k = AbstractC25363p0.m131406k(AbstractC24866w.m129235a("name", AbstractC23136l9.m118743r0(AbstractC8020f0.share)), AbstractC24866w.m129235a("id", Integer.valueOf(AbstractC8020f0.share)));
                arrayList.add(m131406k);
            }
            if (abstractC29069a instanceof AbstractC29069a.j) {
                m131406k3 = AbstractC25363p0.m131406k(AbstractC24866w.m129235a("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_copy_link)), AbstractC24866w.m129235a("id", Integer.valueOf(AbstractC8020f0.str_media_store_copy_link)));
                arrayList.add(m131406k3);
            } else if (abstractC29069a instanceof AbstractC29069a.e) {
                arrayList.add(!((AbstractC29069a.e) abstractC29069a).m145174b().m40582Z() ? AbstractC25363p0.m131406k(AbstractC24866w.m129235a("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_download_file)), AbstractC24866w.m129235a("id", Integer.valueOf(AbstractC8020f0.str_media_store_download_file))) : AbstractC25363p0.m131406k(AbstractC24866w.m129235a("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_open_file)), AbstractC24866w.m129235a("id", Integer.valueOf(AbstractC8020f0.str_media_store_open_file))));
            }
            m131406k2 = AbstractC25363p0.m131406k(AbstractC24866w.m129235a("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_original_msg)), AbstractC24866w.m129235a("id", Integer.valueOf(AbstractC8020f0.str_view_original_msg)));
            arrayList.add(m131406k2);
            if (!arrayList.isEmpty()) {
                final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43155d(true);
                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: ea0.c0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                        SearchGlobalView.m73150oN(simpleAdapter, abstractC29069a, this, view, i11, interfaceC17463d, i14);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f67258m1 = m43152a;
                if (m43152a != null && !m43152a.m92868m() && (c8009j = this.f67258m1) != null) {
                    c8009j.mo13822K();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nO */
    private final void m73148nO(String str) {
        this.f67261p1.m101204b0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public static final void m73150oN(SimpleAdapter simpleAdapter, final AbstractC29069a abstractC29069a, final SearchGlobalView searchGlobalView, View view, final int i11, InterfaceC17463d interfaceC17463d, int i12) {
        int intValue;
        Object obj;
        C17487o0 mo35579p;
        C17487o0 mo35579p2;
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        AbstractC19074t.m100208f(abstractC29069a, "$dataItem");
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(view, "$v");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        try {
            interfaceC17463d.dismiss();
            Object item = simpleAdapter.getItem(i12);
            AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
            Object obj2 = ((HashMap) item).get("id");
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
            intValue = ((Integer) obj2).intValue();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (intValue == AbstractC8020f0.share) {
            if (abstractC29069a instanceof AbstractC29069a.j) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("bol_share_in_app", true);
                bundle.putBoolean("bol_extra_is_forwarding", true);
                bundle.putParcelable("forwardMessageId", ((AbstractC29069a.j) abstractC29069a).m145186b().m40571M());
                bundle.putString("STR_LOG_CHAT_TYPE", "0");
                bundle.putString("STR_SOURCE_START_VIEW", "chat_storedmedia");
                InterfaceC27218a m92676n2 = searchGlobalView.f72421L0.m92676n2();
                if (m92676n2 != null && (mo35579p2 = m92676n2.mo35579p()) != null) {
                    mo35579p2.m93069k2(ShareView.class, bundle, 1, true);
                }
                AbstractC23647d.m123897g("1001514");
            } else if (abstractC29069a instanceof AbstractC29069a.e) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("bol_share_in_app", true);
                bundle2.putBoolean("bol_extra_is_forwarding", true);
                bundle2.putParcelable("forwardMessageId", ((AbstractC29069a.e) abstractC29069a).m145174b().m40571M());
                bundle2.putString("STR_LOG_CHAT_TYPE", "0");
                bundle2.putString("STR_SOURCE_START_VIEW", "chat_storedmedia");
                InterfaceC27218a m92676n22 = searchGlobalView.f72421L0.m92676n2();
                if (m92676n22 != null && (mo35579p = m92676n22.mo35579p()) != null) {
                    mo35579p.m93069k2(ShareView.class, bundle2, 1, true);
                }
                AbstractC23647d.m123897g("1001525");
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.j0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchGlobalView.m73153pN(SearchGlobalView.this, abstractC29069a, i11);
                }
            });
            return;
        }
        MediaStoreItem mediaStoreItem = null;
        ClipboardManager clipboardManager = null;
        if (intValue == AbstractC8020f0.str_media_store_copy_link) {
            if (abstractC29069a instanceof AbstractC29069a.j) {
                Context m92648SI = searchGlobalView.m92648SI();
                if (m92648SI != null) {
                    obj = m92648SI.getSystemService("clipboard");
                } else {
                    obj = null;
                }
                if (obj instanceof ClipboardManager) {
                    clipboardManager = (ClipboardManager) obj;
                }
                if (clipboardManager != null) {
                    try {
                        C0012a c0012a = new C0012a(clipboardManager, new SensitiveData("clipboard_access_text_global_search", "global_search", null, 4, null));
                        String m95090b5 = ((AbstractC29069a.j) abstractC29069a).m145186b().m40599m().m95090b5();
                        AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                        ClipData newPlainText = ClipData.newPlainText(m95090b5, m95090b5);
                        AbstractC19074t.m100207e(newPlainText, "newPlainText(...)");
                        c0012a.m16c(newPlainText);
                        if (AbstractC26681b.f126359d) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_copied));
                        }
                    } catch (SensitiveDataException unused) {
                        if (AbstractC26681b.f126359d) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sensitive_clipboard_block_title));
                        }
                    }
                    C19955h.f98250a.m103730s(searchGlobalView.f67261p1, abstractC29069a, i11, 0);
                    return;
                }
                return;
            }
            return;
        }
        if (intValue != AbstractC8020f0.str_media_store_download_file && intValue != AbstractC8020f0.str_media_store_open_file) {
            if (intValue == AbstractC8020f0.str_view_original_msg) {
                if (abstractC29069a instanceof AbstractC29069a.e) {
                    mediaStoreItem = ((AbstractC29069a.e) abstractC29069a).m145174b();
                } else if (abstractC29069a instanceof AbstractC29069a.j) {
                    mediaStoreItem = ((AbstractC29069a.j) abstractC29069a).m145186b();
                }
                if (mediaStoreItem != null) {
                    try {
                        C17945a0 m40599m = mediaStoreItem.m40599m();
                        String mo95039W2 = m40599m.mo95039W2();
                        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                        Bundle m140776b = new C27870vb(mo95039W2).m140781h(m40599m.m95029V3()).m140776b();
                        InterfaceC27218a m92676n23 = searchGlobalView.f72421L0.m92676n2();
                        if (m92676n23 != null) {
                            m92676n23.mo35573l4(ChatView.class, m140776b, 1, true);
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    }
                }
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchGlobalView.m73160rN(SearchGlobalView.this, abstractC29069a, i11);
                    }
                });
                return;
            }
            return;
        }
        view.performClick();
        return;
        e11.printStackTrace();
    }

    /* renamed from: oO */
    public static final void m73151oO(C17487o0 c17487o0, Bundle bundle, int i11, int i12, boolean z11) {
        Companion.m73194c(c17487o0, bundle, i11, i12, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public static final void m73153pN(final SearchGlobalView searchGlobalView, AbstractC29069a abstractC29069a, int i11) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(abstractC29069a, "$dataItem");
        C23024b7.f111993a.m118075x(searchGlobalView.f67261p1);
        AbstractC19444a.m101695c(new Runnable() { // from class: ea0.n0
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalView.m73157qN(SearchGlobalView.this);
            }
        });
        C19955h.f98250a.m103730s(searchGlobalView.f67261p1, abstractC29069a, i11, 0);
    }

    /* renamed from: pO */
    private final void m73154pO() {
        long longValue = ((Number) m73125fN().get(AbstractC21317c.f103810p.mo110373e(m73125fN().size()))).longValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("spamSearch delay ");
        sb2.append(longValue);
        AbstractC19444a.m101694b(this.f67242W0, longValue);
    }

    /* renamed from: q2 */
    private final void m73155q2(C26365a c26365a, int i11) {
        C18333g1.f92667a.m97292L(this, c26365a, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public static final void m73157qN(SearchGlobalView searchGlobalView) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        searchGlobalView.mo205i9(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qO */
    public final void m73158qO() {
        if (mo60294yp()) {
            return;
        }
        C19348o0 c19348o0 = this.f67259n1;
        if (c19348o0 != null) {
            c19348o0.m101436c();
        }
        C19348o0 c19348o02 = new C19348o0(this, null, 2, 0 == true ? 1 : 0);
        c19348o02.m101442j();
        this.f67259n1 = c19348o02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public static final void m73160rN(final SearchGlobalView searchGlobalView, AbstractC29069a abstractC29069a, int i11) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        AbstractC19074t.m100208f(abstractC29069a, "$dataItem");
        C23024b7.f111993a.m118075x(searchGlobalView.f67261p1);
        AbstractC19444a.m101695c(new Runnable() { // from class: ea0.m0
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalView.m73163sN(SearchGlobalView.this);
            }
        });
        C19955h.f98250a.m103730s(searchGlobalView.f67261p1, abstractC29069a, i11, 0);
    }

    /* renamed from: rO */
    private final void m73161rO() {
        if (mo60294yp()) {
            return;
        }
        AbstractRunnableC19355q1 abstractRunnableC19355q1 = this.f67260o1;
        if (abstractRunnableC19355q1 != null) {
            abstractRunnableC19355q1.m101436c();
        }
        C19319e1 c19319e1 = new C19319e1(this, m73066E2(), null, 0, null, false, 60, null);
        c19319e1.m101442j();
        this.f67260o1 = c19319e1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public static final void m73163sN(SearchGlobalView searchGlobalView) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        searchGlobalView.mo205i9(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
    }

    /* renamed from: sO */
    private final void m73164sO(boolean z11) {
        if (z11) {
            for (C17945a0 c17945a0 : this.f67264s1) {
                MessageId m95029V3 = c17945a0.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                m73182F5(m95029V3);
                c17945a0.m94859Bb(this.f67265t1);
            }
            return;
        }
        Iterator it = this.f67264s1.iterator();
        while (it.hasNext()) {
            ((C17945a0) it.next()).m94997R9(this.f67265t1);
        }
        this.f67264s1.clear();
    }

    /* renamed from: tO */
    static /* synthetic */ void m73166tO(SearchGlobalView searchGlobalView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        searchGlobalView.m73164sO(z11);
    }

    /* renamed from: uN */
    public static /* synthetic */ void m73168uN(SearchGlobalView searchGlobalView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        searchGlobalView.m73189tN(z11);
    }

    /* renamed from: uO */
    private final void m73169uO() {
    }

    /* renamed from: vN */
    private final void m73171vN(View view) {
        View findViewById = view.findViewById(AbstractC6918a0.preStateLayout);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f67232M0 = (SearchGlobalPreStateLayout) findViewById;
        View findViewById2 = view.findViewById(AbstractC6918a0.resultLayout);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f67233N0 = (SearchGlobalResultLayout) findViewById2;
        View findViewById3 = view.findViewById(AbstractC6918a0.search_content);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f67234O0 = findViewById3;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout = this.f67232M0;
        SearchGlobalResultLayout searchGlobalResultLayout = null;
        if (searchGlobalPreStateLayout == null) {
            AbstractC19074t.m100223u("preStateLayout");
            searchGlobalPreStateLayout = null;
        }
        searchGlobalPreStateLayout.setActionResponder(this);
        SearchGlobalResultLayout searchGlobalResultLayout2 = this.f67233N0;
        if (searchGlobalResultLayout2 == null) {
            AbstractC19074t.m100223u("resultLayout");
        } else {
            searchGlobalResultLayout = searchGlobalResultLayout2;
        }
        searchGlobalResultLayout.setActionResponder(this);
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.dummyMeasuringTextView);
        ViewTreeObserver viewTreeObserver = robotoTextView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC13010d(robotoTextView));
        }
        m73142lO(0);
        m73158qO();
    }

    /* renamed from: vO */
    private final void m73172vO(C17945a0 c17945a0, boolean z11) {
        if (z11) {
            this.f67264s1.add(c17945a0);
            c17945a0.m94859Bb(this.f67265t1);
        } else {
            this.f67264s1.remove(c17945a0);
            c17945a0.m94997R9(this.f67265t1);
        }
    }

    /* renamed from: wk */
    private final void m73174wk(String str, MessageId messageId, Integer num, String str2) {
        C18333g1.f92667a.m97291K(this, str, messageId, num, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public static final void m73176xN(SearchGlobalView searchGlobalView) {
        EditText editText;
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        if (!searchGlobalView.m92677nJ() && !searchGlobalView.m92681pJ() && (editText = searchGlobalView.f67248c1) != null) {
            AbstractC2379w.m12432f(editText);
        }
    }

    /* renamed from: xO */
    static /* synthetic */ void m73177xO(SearchGlobalView searchGlobalView, C26365a c26365a, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        searchGlobalView.m73155q2(c26365a, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public static final void m73179yN(SearchGlobalView searchGlobalView, String str) {
        EditText editText;
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        if (!searchGlobalView.mo60294yp() && (editText = searchGlobalView.f67248c1) != null) {
            searchGlobalView.f67261p1.m101216h0("7");
            editText.setText(str);
            editText.setSelection(editText.getText().length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public static final void m73181zN(SearchGlobalView searchGlobalView, AbstractC28275a.g gVar) {
        AbstractC19074t.m100208f(searchGlobalView, "this$0");
        new C19315d0(searchGlobalView, searchGlobalView.m73066E2(), gVar, 0, true).m101442j();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        boolean z11;
        int i11;
        long currentTimeMillis;
        String string;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        String str2 = "0";
        if (m92642L3 == null || (str = m92642L3.getString("EXTRA_OPEN_SOURCE_POSITION")) == null) {
            str = "0";
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null && (string = m92642L32.getString("EXTRA_OPEN_SOURCE_ACTION")) != null) {
            str2 = string;
        }
        if (bundle != null) {
            z11 = bundle.getBoolean("EXTRA_FIRST_TIME_OPEN_SEARCH", true);
        } else {
            z11 = true;
        }
        this.f67235P0 = z11;
        Bundle m92642L33 = m92642L3();
        if (m92642L33 != null) {
            i11 = m92642L33.getInt("HINT_SEARCH");
        } else {
            i11 = 0;
        }
        this.f67250e1 = i11;
        C19325g1 c19325g1 = this.f67261p1;
        if (bundle != null) {
            currentTimeMillis = bundle.getLong("EXTRA_SEARCH_START_SESSION_TIME", System.currentTimeMillis());
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        c19325g1.m101252z0(currentTimeMillis);
        this.f67261p1.m101174B0(str);
        this.f67261p1.m101176C0(str2);
        m92637BK(true);
        f67230w1 = m92692wK().mo35576n3();
        if (this.f67235P0) {
            C19955h.f98250a.m103729q(this.f67261p1, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        Object obj;
        final AbstractC29069a.o oVar;
        final AbstractC29069a.o oVar2;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 100) {
                switch (i11) {
                    case 13:
                        AbstractC29069a abstractC29069a = this.f67239T0;
                        if (abstractC29069a instanceof AbstractC29069a.o) {
                            oVar = (AbstractC29069a.o) abstractC29069a;
                        } else {
                            oVar = null;
                        }
                        if (oVar == null) {
                            return null;
                        }
                        this.f67239T0 = null;
                        ArrayList arrayList = new ArrayList();
                        HashMap hashMap = new HashMap();
                        String string = m92689tK().getString(AbstractC8020f0.str_remove_uid_hide_message);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        hashMap.put("name", string);
                        hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_remove_uid_hide_message));
                        arrayList.add(hashMap);
                        final SimpleAdapter simpleAdapter = new SimpleAdapter(m92689tK(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                        C8009j.a aVar = new C8009j.a(m92689tK());
                        aVar.m43172u(oVar.m145201h().toString());
                        aVar.m43173v(100);
                        aVar.m43155d(true);
                        aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: ea0.x
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                SearchGlobalView.m73093QN(simpleAdapter, this, oVar, interfaceC17463d, i12);
                            }
                        });
                        return aVar.m43152a();
                    case 14:
                        AbstractC29069a abstractC29069a2 = this.f67239T0;
                        if (abstractC29069a2 instanceof AbstractC29069a.o) {
                            oVar2 = (AbstractC29069a.o) abstractC29069a2;
                        } else {
                            oVar2 = null;
                        }
                        if (oVar2 == null) {
                            return null;
                        }
                        this.f67239T0 = null;
                        C8009j.a aVar2 = new C8009j.a(m92689tK());
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_confirm_remove_uid_hidden_chat);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{oVar2.m145201h().toString()}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        aVar2.m43162k(format);
                        aVar2.m43159h(3);
                        aVar2.m43169r(AbstractC8020f0.str_btn_confirm_unhidden_chat, new InterfaceC17463d.d() { // from class: ea0.y
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                SearchGlobalView.m73095RN(SearchGlobalView.this, oVar2, interfaceC17463d, i12);
                            }
                        });
                        aVar2.m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b());
                        aVar2.m43155d(false);
                        return aVar2.m43152a();
                    case 15:
                        C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar3.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), new InterfaceC17463d.d() { // from class: ea0.u
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                SearchGlobalView.m73098SN(SearchGlobalView.this, interfaceC17463d, i12);
                            }
                        });
                        return aVar3.m43152a();
                    default:
                        return null;
                }
            }
            C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
            aVar4.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f67261p1.m101233q()).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), new InterfaceC17463d.d() { // from class: ea0.w
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    SearchGlobalView.m73091PN(SearchGlobalView.this, interfaceC17463d, i12);
                }
            }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
            return aVar4.m43152a();
        }
        C19335k c19335k = new C19335k(this, new C18316b("ACTION_ON_CREATE_DIALOG_SETTING", Integer.valueOf(i11), null, null, 12, null), m73066E2());
        c19335k.m101441i();
        C18316b m101289w = c19335k.m101289w();
        if (m101289w != null) {
            obj = m101289w.m97245a();
        } else {
            obj = null;
        }
        if (!(obj instanceof KeyEventCallbackC17462c)) {
            return null;
        }
        return (KeyEventCallbackC17462c) obj;
    }

    /* renamed from: F5 */
    public final void m73182F5(MessageId messageId) {
        Object obj;
        AbstractC19074t.m100208f(messageId, "messageId");
        if (this.f67261p1.m101207d() == AbstractC29080l.g.f134887b.m145312a() || this.f67261p1.m101207d() == AbstractC29080l.a.f134882b.m145312a()) {
            SearchGlobalResultLayout searchGlobalResultLayout = this.f67233N0;
            C18328f c18328f = null;
            if (searchGlobalResultLayout != null) {
                if (searchGlobalResultLayout == null) {
                    AbstractC19074t.m100223u("resultLayout");
                    searchGlobalResultLayout = null;
                }
                C18316b mo205i9 = searchGlobalResultLayout.mo205i9(new C18316b("SGResultLayout:ACTION_GET_FOCUSED_ADAPTER", Integer.valueOf(this.f67261p1.m101207d()), null, null, 12, null));
                if (mo205i9 != null) {
                    obj = mo205i9.m97245a();
                } else {
                    obj = null;
                }
                if (obj instanceof C18328f) {
                    c18328f = (C18328f) obj;
                }
            }
            if (c18328f != null) {
                C18333g1.f92667a.m97288F(c18328f, messageId);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.search_global_view, viewGroup, false);
        AbstractC19074t.m100205c(inflate);
        m73171vN(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C19322f1.m101124a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        try {
            C19955h.f98250a.m103727m(this.f67261p1);
            m73189tN(true);
            AbstractRunnableC19355q1 abstractRunnableC19355q1 = this.f67260o1;
            if (abstractRunnableC19355q1 != null) {
                abstractRunnableC19355q1.m101436c();
            }
            AbstractC0924m0.m3881hp(System.currentTimeMillis());
            this.f67244Y0 = false;
            this.f67243X0 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 91);
        bVar.m124119a().m124117e(this, 3002);
        bVar.m124119a().m124117e(this, 7000);
        bVar.m124119a().m124117e(this, 44);
        bVar.m124119a().m124117e(this, 6020);
        bVar.m124119a().m124117e(this, 6);
        bVar.m124119a().m124117e(this, 7001);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            Context context = m87077NK.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            SearchGlobalTextInputLayout searchGlobalTextInputLayout = new SearchGlobalTextInputLayout(context, null, 0, 6, null);
            m87077NK.setCustomMiddleItem(searchGlobalTextInputLayout);
            this.f67248c1 = searchGlobalTextInputLayout.getSearchEditText();
            this.f67249d1 = searchGlobalTextInputLayout.getClearTextButton();
            EditText editText = this.f67248c1;
            if (editText != null) {
                editText.setImeOptions(2);
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ea0.k
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                        boolean m73113aO;
                        m73113aO = SearchGlobalView.m73113aO(SearchGlobalView.this, textView, i11, keyEvent);
                        return m73113aO;
                    }
                });
                editText.addTextChangedListener(new C13015i());
                Editable text = editText.getText();
                AbstractC19074t.m100207e(text, "getText(...)");
                if (text.length() > 0) {
                    ImageView imageView = this.f67249d1;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    m73186hO();
                } else {
                    ImageView imageView2 = this.f67249d1;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                }
            }
            m87077NK.setLeadingFunctionCallback(new C13016j(new C13017k()));
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: ea0.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchGlobalView.m73115bO(SearchGlobalView.this, view);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putLong("EXTRA_SEARCH_START_SESSION_TIME", this.f67261p1.m101251z());
        bundle.putBoolean("EXTRA_FIRST_TIME_OPEN_SEARCH", false);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 3002);
        bVar.m124119a().m124115b(this, 3003);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f67258m1;
        if (c8009j != null) {
            c8009j.dismiss();
        }
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 3002);
        bVar.m124119a().m124117e(this, 3003);
    }

    /* renamed from: W */
    public final void m73183W(C20556f c20556f) {
        AbstractC19074t.m100208f(c20556f, "fileWrapper");
        C18333g1.f92667a.m97297u(this, c20556f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, final boolean z12) {
        C17487o0 m92662fJ;
        super.mo37122XJ(z11, z12);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(32);
        }
        if (z11) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.p0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchGlobalView.m73120dO(z12);
                }
            });
            if ((!z12 || this.f72421L0.m92683qJ() || !this.f72421L0.mo60294yp()) && ((m92662fJ = m92662fJ()) == null || !m92662fJ.m93002G0() || !this.f72421L0.m92683qJ())) {
                if (!this.f67251f1) {
                    this.f67251f1 = true;
                } else {
                    AbstractC19444a.m101694b(new Runnable() { // from class: ea0.q0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchGlobalView.m73123eO(SearchGlobalView.this);
                        }
                    }, 50L);
                }
            }
            if (!this.f67237R0) {
                this.f67237R0 = true;
                C19319e1 c19319e1 = new C19319e1(new C13018l(), ".", null, 0, null, false, 60, null);
                c19319e1.m101442j();
                this.f67260o1 = c19319e1;
                return;
            }
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.r0
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalView.m73126fO();
            }
        });
    }

    /* renamed from: XN */
    public final void m73184XN(C31862c c31862c, String str, String str2) {
        boolean z11;
        AbstractC19074t.m100208f(c31862c, "acItemInfo");
        AbstractC19074t.m100208f(str, "actionType");
        AbstractC19074t.m100208f(str2, "actionData");
        try {
            if (c31862c.m153153e()) {
                m73187jO(c31862c);
                z11 = true;
            } else {
                z11 = false;
            }
            if (!TextUtils.isEmpty(str)) {
                if (AbstractC19074t.m100204b(str, "action.window.close")) {
                    if (!z11) {
                        m73187jO(c31862c);
                        return;
                    }
                    return;
                }
                m73109YN(str, str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SearchGlobalView";
    }

    /* renamed from: hN */
    public final C13306b m73185hN() {
        if (this.f67254i1 == null) {
            this.f67254i1 = new C13306b(this.f72421L0.getContext());
        }
        return this.f67254i1;
    }

    /* renamed from: hO */
    public final void m73186hO() {
        this.f67242W0.run();
    }

    /* renamed from: jO */
    public final void m73187jO(C31862c c31862c) {
        Object m129218b;
        AbstractC19074t.m100208f(c31862c, "acItemInfo");
        try {
            C24861r.a aVar = C24861r.f119264q;
            C18434b.Companion.m97695b().m97691w(c31862c);
            m73116cN(this, false, 1, null);
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    /* renamed from: kO */
    public final void m73188kO(ZaloView zaloView, C18316b c18316b, String[] strArr) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(c18316b, "action");
        AbstractC19074t.m100208f(strArr, "permissionsToRequest");
        int generateViewId = View.generateViewId();
        this.f67266u1.put(Integer.valueOf(generateViewId), c18316b);
        AbstractC23034c6.m118184v0(zaloView, strArr, generateViewId);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        final String str;
        super.onActivityResult(i11, i12, intent);
        if (i11 != 1011) {
            if (i11 != 1085) {
                if (i11 == 10010 && i12 == -1) {
                    C18333g1.f92667a.m97296r(intent, new C13013g());
                    return;
                }
                return;
            }
            if (i12 == -1) {
                mo205i9(new C18316b("ACTION_START_SEARCH_TASK", null, null, null, 14, null));
                return;
            }
            return;
        }
        if (!mo60294yp()) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 == null || !m92676n2.mo35576n3()) {
                if (this.f67262q1) {
                    str = this.f67263r1;
                } else {
                    str = null;
                }
                this.f67262q1 = false;
                this.f67263r1 = null;
                AbstractC19444a.m101694b(new Runnable() { // from class: ea0.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchGlobalView.m73089ON(SearchGlobalView.this, str);
                    }
                }, 200L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:            if (r0 == null) goto L33;     */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        String str;
        String str2;
        Editable text;
        String obj;
        int i12;
        boolean z11;
        if (i11 == 4) {
            if (this.f72421L0.m92649TI().m93012K0() != null) {
                ZaloView m93012K0 = this.f72421L0.m92649TI().m93012K0();
                AbstractC19074t.m100205c(m93012K0);
                if (m93012K0.onKeyUp(i11, keyEvent)) {
                    return true;
                }
            }
            this.f67261p1.m101198X("2");
            EditText editText = this.f67248c1;
            if (editText != null && (text = editText.getText()) != null && (obj = text.toString()) != null) {
                int length = obj.length() - 1;
                int i13 = 0;
                boolean z12 = false;
                while (i13 <= length) {
                    if (!z12) {
                        i12 = i13;
                    } else {
                        i12 = length;
                    }
                    if (AbstractC19074t.m100209g(obj.charAt(i12), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i13++;
                        }
                    } else {
                        if (!z11) {
                            break;
                        }
                        length--;
                    }
                }
                str = obj.subSequence(i13, length + 1).toString();
            }
            str = "";
            if (TextUtils.isEmpty(str)) {
                str2 = "3000116";
            } else {
                str2 = "3000125";
            }
            AbstractC23647d.m123906p(str2);
            AbstractC23647d.m123893c();
            if (m73112aN()) {
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:            m73190wN(r0);     */
    @Override // com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        try {
            C18316b c18316b = (C18316b) this.f67266u1.get(Integer.valueOf(i11));
            this.f67266u1.remove(Integer.valueOf(i11));
            if (c18316b != null) {
                int length = iArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    } else if (iArr[i12] == -1) {
                        if (i12 == -1) {
                        }
                    } else {
                        i12++;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        Object obj;
        ClipboardManager clipboardManager;
        ClipData m15b;
        ClipData.Item itemAt;
        super.onResume();
        C19325g1 c19325g1 = this.f67261p1;
        c19325g1.m101238s0(true);
        c19325g1.m101240t0(true);
        if (C19322f1.f95940C) {
            try {
                this.f67261p1.m101206c0("");
                Context context = getContext();
                if (context != null) {
                    obj = context.getSystemService("clipboard");
                } else {
                    obj = null;
                }
                if (obj instanceof ClipboardManager) {
                    clipboardManager = (ClipboardManager) obj;
                } else {
                    clipboardManager = null;
                }
                if (clipboardManager != null && (m15b = new C0012a(clipboardManager, new SensitiveData("clipboard_access_text_global_search", "global_search", null, 4, null)).m15b()) != null && (itemAt = m15b.getItemAt(0)) != null && itemAt.getText() != null) {
                    this.f67261p1.m101206c0(itemAt.getText().toString());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        this.f72827B0.post(new Runnable() { // from class: ea0.o0
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalView.m73111ZN(SearchGlobalView.this);
            }
        });
        if (this.f67243X0) {
            m73129gN().run();
        }
        m73166tO(this, false, 1, null);
    }

    /* renamed from: tN */
    public final void m73189tN(boolean z11) {
        EditText editText = this.f67248c1;
        if (editText != null) {
            if (z11) {
                editText.clearFocus();
            }
            AbstractC2379w.m12430d(editText);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0028. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0a20 A[Catch: Exception -> 0x09f0, TryCatch #0 {Exception -> 0x09f0, blocks: (B:523:0x09a7, B:525:0x09c2, B:529:0x09d4, B:550:0x09e7, B:535:0x09ed, B:540:0x09f3, B:542:0x0a20, B:543:0x0a54, B:546:0x0a33), top: B:522:0x09a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0a33 A[Catch: Exception -> 0x09f0, TryCatch #0 {Exception -> 0x09f0, blocks: (B:523:0x09a7, B:525:0x09c2, B:529:0x09d4, B:550:0x09e7, B:535:0x09ed, B:540:0x09f3, B:542:0x0a20, B:543:0x0a54, B:546:0x0a33), top: B:522:0x09a7 }] */
    @Override // en0.InterfaceC18505l
    /* renamed from: wN, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C18316b mo205i9(final C18316b c18316b) {
        String str;
        C17487o0 m92662fJ;
        String m18051f;
        C17487o0 m92662fJ2;
        Object m129218b;
        C17945a0 m145141e;
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        str = "";
        SearchGlobalResultLayout searchGlobalResultLayout = null;
        SearchGlobalResultLayout searchGlobalResultLayout2 = null;
        SearchGlobalResultLayout searchGlobalResultLayout3 = null;
        r15 = null;
        switch (m97246b.hashCode()) {
            case -2063018791:
                if (!m97246b.equals("Search.HideIme")) {
                    return null;
                }
                m73168uN(this, false, 1, null);
                return null;
            case -1956766579:
                if (!m97246b.equals("HandleActionCompactMessageItem:ACTION_OPEN_FILE")) {
                    return null;
                }
                final C13011e c13011e = new C13011e(c18316b, this);
                if (AbstractC19444a.m101693a()) {
                    c13011e.mo12V4();
                    return null;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: ea0.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchGlobalView.m73077IN(InterfaceC18494a.this);
                    }
                });
                return null;
            case -1954112920:
                if (m97246b.equals("Search.PreState.GetZinstantDelegate")) {
                    return new C18316b("Search.PreState.GetZinstantDelegate", this.f67257l1, null, null, 12, null);
                }
                return null;
            case -1905588127:
                if (!m97246b.equals("Search.PreState.ClickItem")) {
                    return null;
                }
                Object m97245a = c18316b.m97245a();
                if (m97245a instanceof AbstractC28275a.b) {
                    if (m73085MN()) {
                        return null;
                    }
                    if (((AbstractC28275a.b) c18316b.m97245a()).m142475c() instanceof ContactProfile) {
                        Object m97247c = c18316b.m97247c();
                        Integer num = m97247c instanceof Integer ? (Integer) m97247c : null;
                        new C19315d0(this, m73066E2(), (InterfaceC26722a) c18316b.m97245a(), num != null ? num.intValue() : 0, true).m101442j();
                        return null;
                    }
                    if (!(((AbstractC28275a.b) c18316b.m97245a()).m142475c() instanceof C0862b)) {
                        return null;
                    }
                    new C19314d(this, c18316b, m73066E2(), C18620i.f93669L).m101441i();
                    return null;
                }
                if (m97245a instanceof AbstractC28275a.h) {
                    if (m73085MN()) {
                        return null;
                    }
                    this.f67261p1.m101216h0("4");
                    EditText editText = this.f67248c1;
                    if (editText == null) {
                        return null;
                    }
                    editText.setText(((AbstractC28275a.h) c18316b.m97245a()).m142483a());
                    editText.setSelection(editText.getText().length());
                    return null;
                }
                if (AbstractC19074t.m100204b(m97245a, AbstractC28275a.v.f131933c) || AbstractC19074t.m100204b(m97245a, AbstractC28275a.w.f131934c)) {
                    m73168uN(this, false, 1, null);
                    this.f67252g1 = false;
                    if (m73085MN()) {
                        m73169uO();
                    }
                    C18333g1.f92667a.m97285C(this, this.f67261p1.m101243v().m142517e());
                    return null;
                }
                if (!AbstractC19074t.m100204b(m97245a, AbstractC28275a.m.f131927a) && !AbstractC19074t.m100204b(m97245a, AbstractC28275a.f.d.f131906a)) {
                    return null;
                }
                m73168uN(this, false, 1, null);
                if (m73085MN()) {
                    m73169uO();
                }
                this.f67252g1 = false;
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 == null) {
                    return null;
                }
                m92676n2.mo35573l4(PreStateManagementView.class, AbstractC1438d.m7340a(), 1, true);
                C24848g0 c24848g0 = C24848g0.f119245a;
                return null;
            case -1898143184:
                if (m97246b.equals("GET_BOUND_ZALO_VIEW")) {
                    return new C18316b("RETURN_RESULT", this, null, null, 12, null);
                }
                return null;
            case -1761939502:
                if (!m97246b.equals("ACTION_OPEN_ZALO_VIDEO")) {
                    return null;
                }
                Object m97245a2 = c18316b.m97245a();
                if (m97245a2 != null && !(m97245a2 instanceof String)) {
                    return null;
                }
                AbstractC28207v1.m141989h3("action.open.channel_home", 2, m92676n2(), this, (String) c18316b.m97245a(), null, null, null, null);
                return null;
            case -1710800710:
                if (!m97246b.equals("HandleActionCompactMessageItem:ACTION_DISPATCH_DOWNLOAD_FILE_PROGRESS") || !(c18316b.m97245a() instanceof Integer) || !(c18316b.m97247c() instanceof AbstractC29069a.a) || !(c18316b.m97248d() instanceof MessageId)) {
                    return null;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: ea0.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchGlobalView.m73079JN(SearchGlobalView.this, c18316b);
                    }
                });
                return null;
            case -1666117543:
                if (!m97246b.equals("HandleActionCompactMessageItem:ACTION_OPEN_RECOMMENED_CONTACT") || !(c18316b.m97245a() instanceof AbstractC29069a.a) || !(c18316b.m97247c() instanceof String)) {
                    return null;
                }
                final C13012f c13012f = new C13012f(c18316b, this);
                if (AbstractC19444a.m101693a()) {
                    c13012f.mo12V4();
                    return null;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: ea0.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchGlobalView.m73083LN(InterfaceC18494a.this);
                    }
                });
                return null;
            case -1659355660:
                if (!m97246b.equals("Search.Result.LongClickItem") || !(c18316b.m97245a() instanceof AbstractC29069a) || !(c18316b.m97247c() instanceof Integer)) {
                    return null;
                }
                if (((c18316b.m97245a() instanceof AbstractC29069a.e) || (c18316b.m97245a() instanceof AbstractC29069a.j)) && (c18316b.m97248d() instanceof View)) {
                    m73147nN((AbstractC29069a) c18316b.m97245a(), ((Number) c18316b.m97247c()).intValue(), (View) c18316b.m97248d());
                    return null;
                }
                if ((c18316b.m97245a() instanceof AbstractC29069a.a) && (c18316b.m97248d() instanceof AbstractC3552t)) {
                    m73100TN((AbstractC29069a) c18316b.m97245a(), (AbstractC3552t) c18316b.m97248d(), ((Number) c18316b.m97247c()).intValue());
                    return null;
                }
                if (!(c18316b.m97245a() instanceof AbstractC29069a.o) || !C23013a7.f111966a.m117999i(((AbstractC29069a.o) c18316b.m97245a()).m145200g(), 1)) {
                    return null;
                }
                this.f67239T0 = (AbstractC29069a) c18316b.m97245a();
                showDialog(13);
                return null;
            case -1425683498:
                if (!m97246b.equals("ACTION_OPEN_STRANGER_BOX_VIEW") || (m92662fJ = this.f72421L0.m92662fJ()) == null) {
                    return null;
                }
                m92662fJ.m93069k2(StrangerMessagesView.class, AbstractC1438d.m7341b(AbstractC24866w.m129235a("SHOW_WITH_FLAGS", 33554432)), 1, true);
                C24848g0 c24848g02 = C24848g0.f119245a;
                return null;
            case -1348631392:
                if (!m97246b.equals("ACTION_OPEN_CHAT_VIEW") || !(c18316b.m97245a() instanceof Bundle) || !(c18316b.m97247c() instanceof ContactProfile)) {
                    return null;
                }
                AbstractC23059e9.m118318G(3);
                Object m97245a3 = c18316b.m97245a();
                if (!AbstractC19074t.m100204b(c18316b.m97248d(), Boolean.TRUE)) {
                    ((Bundle) m97245a3).putInt("SHOW_WITH_FLAGS", 33554432);
                    this.f67261p1.m101198X("1");
                }
                Bundle bundle = (Bundle) m97245a3;
                bundle.putBoolean("extra_open_from_search", true);
                bundle.putString("STR_SOURCE_START_VIEW", "global_search");
                InterfaceC27218a m92676n22 = this.f72421L0.m92676n2();
                if (m92676n22 == null) {
                    return null;
                }
                m92676n22.mo35573l4(ChatView.class, bundle, 1, true);
                C24848g0 c24848g03 = C24848g0.f119245a;
                return null;
            case -1340198752:
                if (m97246b.equals("ACTION_GET_SEARCH_GLOBAL_CURRENT_MODE")) {
                    return new C18316b("ACTION_GET_SEARCH_GLOBAL_CURRENT_MODE", Integer.valueOf(this.f67240U0), null, null, 12, null);
                }
                return null;
            case -1313479647:
                if (!m97246b.equals("ACTION_SHOW_LOADING_VIEW")) {
                    return null;
                }
                if (c18316b.m97245a() instanceof String) {
                    this.f72421L0.mo78950cq((CharSequence) c18316b.m97245a());
                    return null;
                }
                this.f72421L0.mo46829Y();
                return null;
            case -1167406192:
                if (!m97246b.equals("Search.Result.ClickItem")) {
                    return null;
                }
                if ((c18316b.m97245a() instanceof InterfaceC26722a) && (((c18316b.m97245a() instanceof AbstractC29069a.o) || (c18316b.m97245a() instanceof AbstractC29069a.k)) && (c18316b.m97247c() instanceof Integer))) {
                    new C19315d0(this, m73066E2(), (InterfaceC26722a) c18316b.m97245a(), ((Number) c18316b.m97247c()).intValue(), true).m101442j();
                    return null;
                }
                if ((c18316b.m97245a() instanceof InterfaceC26722a) && (c18316b.m97247c() instanceof AbstractC29069a.p) && (c18316b.m97248d() instanceof Integer)) {
                    if (AbstractC19074t.m100204b(c18316b.m97247c(), AbstractC29069a.p.c.f134717a)) {
                        InterfaceC0861a m118067o = C23024b7.f111993a.m118067o((InterfaceC26722a) c18316b.m97245a());
                        if (m118067o == null) {
                            return null;
                        }
                        String mo2478b = m118067o.mo2478b();
                        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                        m73144mN(mo2478b);
                        return null;
                    }
                    new C19353q(this, m73066E2(), (InterfaceC26722a) c18316b.m97245a(), (AbstractC29069a.p) c18316b.m97247c(), ((Number) c18316b.m97248d()).intValue(), true).m101442j();
                    return null;
                }
                if ((c18316b.m97245a() instanceof AbstractC29069a.j) && (c18316b.m97247c() instanceof Integer)) {
                    try {
                        String m95090b5 = ((AbstractC29069a.j) c18316b.m97245a()).m145186b().m40599m().m95090b5();
                        AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                        if (m95090b5.length() <= 0) {
                            return null;
                        }
                        String m73066E2 = m73066E2();
                        int length = m73066E2.length() - 1;
                        int i11 = 0;
                        boolean z11 = false;
                        while (i11 <= length) {
                            boolean z12 = AbstractC19074t.m100209g(m73066E2.charAt(!z11 ? i11 : length), 32) <= 0;
                            if (z11) {
                                if (!z12) {
                                    m73066E2.subSequence(i11, length + 1).toString();
                                    Bundle bundle2 = new Bundle();
                                    String m95090b52 = ((AbstractC29069a.j) c18316b.m97245a()).m145186b().m40599m().m95090b5();
                                    AbstractC19074t.m100207e(m95090b52, "getUrl(...)");
                                    String m95090b53 = new C24329j("(?i)^(http://|https://).*").m127018f(m95090b52) ? "https://" + ((AbstractC29069a.j) c18316b.m97245a()).m145186b().m40599m().m95090b5() : ((AbstractC29069a.j) c18316b.m97245a()).m145186b().m40599m().m95090b5();
                                    AbstractC19074t.m100205c(m95090b53);
                                    ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
                                    InterfaceC27218a m92692wK = this.f72421L0.m92692wK();
                                    AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
                                    c15403a.m87171F(m92692wK, m95090b53, bundle2);
                                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.q
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            SearchGlobalView.m73068EN(SearchGlobalView.this, c18316b);
                                        }
                                    });
                                    return null;
                                }
                                length--;
                            } else if (z12) {
                                i11++;
                            } else {
                                z11 = true;
                            }
                        }
                        m73066E2.subSequence(i11, length + 1).toString();
                        Bundle bundle22 = new Bundle();
                        String m95090b522 = ((AbstractC29069a.j) c18316b.m97245a()).m145186b().m40599m().m95090b5();
                        AbstractC19074t.m100207e(m95090b522, "getUrl(...)");
                        if (new C24329j("(?i)^(http://|https://).*").m127018f(m95090b522)) {
                        }
                        AbstractC19074t.m100205c(m95090b53);
                        ZaloWebView.C15403a c15403a2 = ZaloWebView.Companion;
                        InterfaceC27218a m92692wK2 = this.f72421L0.m92692wK();
                        AbstractC19074t.m100207e(m92692wK2, "requireZaloActivity(...)");
                        c15403a2.m87171F(m92692wK2, m95090b53, bundle22);
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchGlobalView.m73068EN(SearchGlobalView.this, c18316b);
                            }
                        });
                        return null;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return null;
                    }
                }
                if ((c18316b.m97245a() instanceof AbstractC29069a.v) && (c18316b.m97247c() instanceof Integer)) {
                    new C19335k(this, c18316b, m73066E2()).m101441i();
                    return null;
                }
                if ((c18316b.m97245a() instanceof AbstractC29069a.m) && (c18316b.m97247c() instanceof Integer)) {
                    new C19314d(this, c18316b, m73066E2(), C18620i.f93668K).m101441i();
                    return null;
                }
                if ((c18316b.m97245a() instanceof AbstractC29069a.a) && (c18316b.m97247c() instanceof Integer)) {
                    Object m97245a4 = c18316b.m97245a();
                    Object m97248d = c18316b.m97248d();
                    if (m97248d instanceof C3551s) {
                        if (AbstractC19074t.m100204b(((C3551s) c18316b.m97248d()).m18046a(), "recommened.user")) {
                            new C19308b(this, new C18316b("HandleActionCompactMessageItem:ACTION_CHECK_AND_OPEN_RECOMMENED_CONTACT", m97245a4, null, null, 12, null), m73066E2()).m101442j();
                        } else {
                            AbstractC3552t m18035b = ((AbstractC29069a.a) m97245a4).m145142f().m18035b();
                            C3551s c3551s = m18035b instanceof C3551s ? (C3551s) m18035b : null;
                            if (c3551s != null && (m18051f = c3551s.m18051f()) != null) {
                                str = m18051f;
                            }
                            if (!new C24329j("(?i)^(http://|https://).*").m127018f(str)) {
                                str = "https://" + str;
                            }
                            m73061Bt(str);
                        }
                    } else if (m97248d instanceof C3549q) {
                        new C19308b(this, new C18316b("HandleActionCompactMessageItem:ACTION_CHECK_DOWNLOAD_AND_OPEN_FILE", m97245a4, c18316b.m97248d(), null, 8, null), m73066E2()).m101442j();
                    } else if (m97248d == null) {
                        C3553u m18037d = ((AbstractC29069a.a) m97245a4).m145142f().m18037d();
                        m73174wk(m18037d.m18055d(), MessageId.Companion.m41063a(m18037d.m18052a(), m18037d.m18053b(), m18037d.m18055d(), m18037d.m18056e()), Integer.valueOf(this.f67261p1.m101237s()), m73066E2());
                        C24848g0 c24848g04 = C24848g0.f119245a;
                    }
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchGlobalView.m73073GN(SearchGlobalView.this, c18316b);
                        }
                    });
                    return null;
                }
                if (!(c18316b.m97245a() instanceof AbstractC29069a.f) || !(c18316b.m97247c() instanceof AbstractC29080l)) {
                    return null;
                }
                AbstractRunnableC19355q1 abstractRunnableC19355q1 = this.f67260o1;
                C19319e1 c19319e1 = abstractRunnableC19355q1 instanceof C19319e1 ? (C19319e1) abstractRunnableC19355q1 : null;
                if (c19319e1 == null || c19319e1.isCancelled()) {
                    return null;
                }
                new C19318e0(c19319e1, new C18316b("ACTION_HANDLE_TAB_RELOAD", c18316b.m97245a(), c18316b.m97247c(), null, 8, null), m73066E2(), c19319e1.m101106o()).m101442j();
                return null;
            case -1095971772:
                if (!m97246b.equals("Search.HideImeClearFocus")) {
                    return null;
                }
                m73189tN(true);
                return null;
            case -1080206567:
                if (!m97246b.equals("Search.PreState.SetIsScrollable") || !(c18316b.m97245a() instanceof Boolean)) {
                    return null;
                }
                SearchGlobalPreStateLayout searchGlobalPreStateLayout = this.f67232M0;
                if (searchGlobalPreStateLayout == null) {
                    AbstractC19074t.m100223u("preStateLayout");
                    searchGlobalPreStateLayout = null;
                }
                searchGlobalPreStateLayout.setRecyclerViewScrollable(((Boolean) c18316b.m97245a()).booleanValue());
                return null;
            case -1014509722:
                if (!m97246b.equals("ACTION_OPEN_OA_VIEW") || c18316b.m97245a() != null || (m92662fJ2 = this.f72421L0.m92662fJ()) == null) {
                    return null;
                }
                m92662fJ2.m93069k2(VipMessagesView.class, AbstractC1438d.m7341b(AbstractC24866w.m129235a("SHOW_WITH_FLAGS", 33554432)), 1, true);
                C24848g0 c24848g05 = C24848g0.f119245a;
                return null;
            case -904156603:
                if (!m97246b.equals("Search.PreState.LongClickItem")) {
                    return null;
                }
                m73169uO();
                return null;
            case -899125093:
                if (!m97246b.equals("HandleActionCompactMessageItem:ACTION_SHOW_ERROR_GENERAL_MESSAGE")) {
                    return null;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: ea0.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchGlobalView.m73081KN();
                    }
                });
                return null;
            case -726927665:
                if (!m97246b.equals("ACTION_OPEN_MY_INFO_VIEW") || !(c18316b.m97245a() instanceof Bundle)) {
                    return null;
                }
                ((Bundle) c18316b.m97245a()).putString("extra_entry_point_flow", C32002l4.Companion.m154287a(8).m154277l());
                C17487o0 m92662fJ3 = this.f72421L0.m92662fJ();
                if (m92662fJ3 == null) {
                    return null;
                }
                m92662fJ3.m93069k2(MyInfoView.class, (Bundle) c18316b.m97245a(), 1, true);
                C24848g0 c24848g06 = C24848g0.f119245a;
                return null;
            case -677165960:
                if (!m97246b.equals("Search.PreState.DeleteItem")) {
                    return null;
                }
                Object m97245a5 = c18316b.m97245a();
                if (m97245a5 instanceof AbstractC28275a.g) {
                    C19348o0 c19348o0 = new C19348o0(this, new C18316b("Search.Task.UpdatePreStateSettingFunction", c18316b.m97245a(), Boolean.TRUE, null, 8, null));
                    this.f67259n1 = c19348o0;
                    c19348o0.m101442j();
                    C24848g0 c24848g07 = C24848g0.f119245a;
                    return null;
                }
                if (m97245a5 instanceof AbstractC28275a.h) {
                    C19348o0 c19348o02 = new C19348o0(this, new C18316b("Search.Task.UpdatePreStateSettingFunction", c18316b.m97245a(), Boolean.TRUE, null, 8, null));
                    this.f67259n1 = c19348o02;
                    c19348o02.m101442j();
                    C24848g0 c24848g08 = C24848g0.f119245a;
                    return null;
                }
                if (!(m97245a5 instanceof AbstractC28275a.n)) {
                    return null;
                }
                C19348o0 c19348o03 = new C19348o0(this, new C18316b("Search.Task.UpdatePreStateSettingFunction", c18316b.m97245a(), Boolean.TRUE, null, 8, null));
                this.f67259n1 = c19348o03;
                c19348o03.m101442j();
                C24848g0 c24848g09 = C24848g0.f119245a;
                return null;
            case -439268792:
                if (!m97246b.equals("ACTION_REQUEST_PERMISSION") || !(c18316b.m97245a() instanceof Object[]) || !(c18316b.m97247c() instanceof C18316b)) {
                    return null;
                }
                try {
                    Object m97247c2 = c18316b.m97247c();
                    AbstractC19074t.m100206d(m97247c2, "null cannot be cast to non-null type com.zing.zalo.ui.searchglobal.Action<kotlin.Any>");
                    Object m97245a6 = c18316b.m97245a();
                    AbstractC19074t.m100206d(m97245a6, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    m73188kO(this, (C18316b) m97247c2, (String[]) m97245a6);
                    return null;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return null;
                }
            case -434738901:
                if (!m97246b.equals("ACTION_CLEAR_SEARCH_RESULT_STATE")) {
                    return null;
                }
                new C19342m0(this, c18316b, m73066E2()).m101442j();
                mo205i9(new C18316b("ACTION_RESULT_RESET_TAB_INDEX", null, null, null, 14, null));
                return null;
            case -406700693:
                if (!m97246b.equals("ACTION_OPEN_OPEN_DEV_TOOL") || !(c18316b.m97245a() instanceof String)) {
                    return null;
                }
                C26323a.f124999a.m135470b((String) c18316b.m97245a(), this);
                return null;
            case -223529488:
                if (!m97246b.equals("Search.PreState.SubmitList") || !(c18316b.m97245a() instanceof C28276b)) {
                    return null;
                }
                SearchGlobalPreStateLayout searchGlobalPreStateLayout2 = this.f67232M0;
                if (searchGlobalPreStateLayout2 == null) {
                    AbstractC19074t.m100223u("preStateLayout");
                    searchGlobalPreStateLayout2 = null;
                }
                searchGlobalPreStateLayout2.m73394c(((C28276b) c18316b.m97245a()).m142508a());
                if (!this.f67236Q0) {
                    return null;
                }
                this.f67236Q0 = false;
                if (this.f67251f1) {
                    AbstractC19444a.m101694b(new Runnable() { // from class: ea0.s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchGlobalView.m73176xN(SearchGlobalView.this);
                        }
                    }, 50L);
                    return null;
                }
                this.f67251f1 = true;
                return null;
            case -94086492:
                if (!m97246b.equals("Search.ProcessZinstantSocketCommonAction")) {
                    return null;
                }
                Object m97245a7 = c18316b.m97245a();
                if (m97245a7 != null && !(m97245a7 instanceof String)) {
                    return null;
                }
                Object m97247c3 = c18316b.m97247c();
                if (m97247c3 != null && !(m97247c3 instanceof String)) {
                    return null;
                }
                Object m97248d2 = c18316b.m97248d();
                if (m97248d2 != null && !(m97248d2 instanceof AbstractC28207v1.h0)) {
                    return null;
                }
                Object m97245a8 = c18316b.m97245a();
                Object m97247c4 = c18316b.m97247c();
                if (AbstractC19074t.m100204b("action.open.mp", m97245a8)) {
                    m97247c4 = C18620i.Companion.m98406a((String) m97247c4, C18620i.f93691h0);
                }
                AbstractC28207v1.m141989h3((String) m97245a8, 2, m92676n2(), this, (String) m97247c4, (AbstractC28207v1.h0) c18316b.m97248d(), null, null, null);
                return null;
            case -48330172:
                if (!m97246b.equals("HIDE_KEYBOARD")) {
                    return null;
                }
                m73189tN(true);
                return null;
            case -20103104:
                if (m97246b.equals("Search.PreState.IsEditorState")) {
                    return new C18316b("Search.PreState.IsEditorState", Boolean.valueOf(m73085MN()), null, null, 12, null);
                }
                return null;
            case 63657359:
                if (!m97246b.equals("ACTION_OPEN_SEARCH_FIELD") || !(c18316b.m97245a() instanceof ContactProfile)) {
                    return null;
                }
                f67231x1 = (byte) 2;
                return null;
            case 105276481:
                if (!m97246b.equals("ACTION_SHOW_DIALOG") || !(c18316b.m97245a() instanceof Integer)) {
                    return null;
                }
                AbstractC2364o0.m12373p(this, ((Number) c18316b.m97245a()).intValue());
                return null;
            case 206844118:
                if (!m97246b.equals("Search.PreState.ToggleEditorState")) {
                    return null;
                }
                m73169uO();
                return null;
            case 241870710:
                if (!m97246b.equals("ACTION_START_SEARCH_TASK")) {
                    return null;
                }
                m73161rO();
                return null;
            case 299236870:
                if (!m97246b.equals("ACTION_DISMISS_LOADING_VIEW")) {
                    return null;
                }
                this.f72421L0.mo49315c4();
                return null;
            case 331885989:
                if (!m97246b.equals("SGResultLayout:ACTION_RESULT_TAB_INDEX_CHANGED") || !(c18316b.m97245a() instanceof Integer) || !(c18316b.m97247c() instanceof Integer)) {
                    return null;
                }
                this.f67261p1.m101202a0(((Number) c18316b.m97245a()).intValue());
                this.f67261p1.m101200Z(((Number) c18316b.m97247c()).intValue());
                return null;
            case 332076525:
                if (!m97246b.equals("ACTION_FORCE_RELOAD_RESULT_UI")) {
                    return null;
                }
                m73161rO();
                return null;
            case 338356488:
                if (!m97246b.equals("ACTION_CLICK_ITEM_FILE") || !(c18316b.m97245a() instanceof AbstractC29069a.e) || !(c18316b.m97247c() instanceof Boolean) || !(c18316b.m97248d() instanceof Integer)) {
                    return null;
                }
                C19955h.f98250a.m103730s(this.f67261p1, (InterfaceC26722a) c18316b.m97245a(), ((Number) c18316b.m97248d()).intValue(), 1);
                return null;
            case 344436733:
                if (!m97246b.equals("ACTION_OPEN_PROFILE") || !(c18316b.m97245a() instanceof C26365a)) {
                    return null;
                }
                InterfaceC27218a m92676n23 = this.f72421L0.m92676n2();
                C17487o0 mo35579p = m92676n23 != null ? m92676n23.mo35579p() : null;
                if (mo35579p == null) {
                    return null;
                }
                new C19171b().m101508a(new C19171b.a(mo35579p.m93021N0(), (C26365a) c18316b.m97245a(), 0, 1));
                return null;
            case 346572025:
                if (m97246b.equals("GET_BOUND_ACTIVITY")) {
                    return new C18316b("RETURN_RESULT", m92648SI(), null, null, 12, null);
                }
                return null;
            case 565459737:
                if (!m97246b.equals("ACTION_RESULT_SET_CURRENT_TAB")) {
                    return null;
                }
                SearchGlobalResultLayout searchGlobalResultLayout4 = this.f67233N0;
                if (searchGlobalResultLayout4 == null) {
                    AbstractC19074t.m100223u("resultLayout");
                } else {
                    searchGlobalResultLayout = searchGlobalResultLayout4;
                }
                return searchGlobalResultLayout.mo205i9(c18316b);
            case 578359972:
                if (m97246b.equals("Search.Lifecycle")) {
                    return new C18316b(c18316b.m97246b(), getLifecycle(), null, null, 12, null);
                }
                return null;
            case 790525063:
                if (!m97246b.equals("Search.ProcessZinstantFeatureCommonAction")) {
                    return null;
                }
                Object m97245a9 = c18316b.m97245a();
                String str2 = m97245a9 instanceof String ? (String) m97245a9 : null;
                Object m97247c5 = c18316b.m97247c();
                String str3 = m97247c5 instanceof String ? (String) m97247c5 : null;
                str = str3 != null ? str3 : "";
                try {
                    C24861r.a aVar = C24861r.f119264q;
                    m129218b = C24861r.m129218b(new JSONObject(str));
                } catch (Throwable th2) {
                    C24861r.a aVar2 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                }
                if (C24861r.m129223g(m129218b)) {
                    m129218b = null;
                }
                JSONObject jSONObject = (JSONObject) m129218b;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -2145997531:
                            if (!str2.equals("action.globalsearch.search_result.miniapp")) {
                                return null;
                            }
                            if ((c18316b.m97248d() instanceof AbstractC29069a.h) && (((AbstractC29069a.h) c18316b.m97248d()).m145181a() instanceof AbstractC29069a.z)) {
                                String optString = jSONObject != null ? jSONObject.optString("uid") : null;
                                Iterator it = ((AbstractC29069a.z) ((AbstractC29069a.h) c18316b.m97248d()).m145181a()).m145234d().m145165c().iterator();
                                int i12 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i12 = -1;
                                    } else if (!AbstractC19074t.m100204b(((AbstractC29069a.m) it.next()).m145192b().mo2478b(), optString)) {
                                        i12++;
                                    }
                                }
                                final AbstractC29069a.m mVar = i12 != -1 ? (AbstractC29069a.m) ((AbstractC29069a.z) ((AbstractC29069a.h) c18316b.m97248d()).m145181a()).m145234d().m145165c().get(i12) : null;
                                final int max = Math.max(0, ((AbstractC29069a.h) c18316b.m97248d()).m145182b()) + i12;
                                if (mVar != null) {
                                    AbstractC19444a.m101697e(new Runnable() { // from class: ea0.n
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            SearchGlobalView.m73058AN(SearchGlobalView.this, mVar, max);
                                        }
                                    });
                                }
                            }
                            return new C18316b(c18316b.m97246b(), Boolean.TRUE, null, null, 12, null);
                        case -1238638365:
                            if (!str2.equals("action.globalsearch.search_result.seemore")) {
                                return null;
                            }
                            if ((c18316b.m97248d() instanceof AbstractC29069a.h) && (((AbstractC29069a.h) c18316b.m97248d()).m145181a() instanceof AbstractC29069a.z)) {
                                final int max2 = Math.max(0, ((AbstractC29069a.h) c18316b.m97248d()).m145182b()) + ((AbstractC29069a.z) ((AbstractC29069a.h) c18316b.m97248d()).m145181a()).m145234d().m145166d();
                                final AbstractC29069a.s.q qVar = new AbstractC29069a.s.q(AbstractC29080l.h.f134888b, AbstractC29069a.s.m.f134745b, true, false);
                                AbstractC19444a.m101697e(new Runnable() { // from class: ea0.o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SearchGlobalView.m73060BN(SearchGlobalView.this, qVar, max2);
                                    }
                                });
                            }
                            return new C18316b(c18316b.m97246b(), Boolean.TRUE, null, null, 12, null);
                        case 1260005534:
                            if (!str2.equals("action.globalsearch.prestate.click_oa")) {
                                return null;
                            }
                            if (c18316b.m97248d() instanceof AbstractC28275a.a0) {
                                String optString2 = jSONObject != null ? jSONObject.optString("uid") : null;
                                if (optString2 != null) {
                                    for (final AbstractC28275a.g gVar : ((AbstractC28275a.a0) c18316b.m97248d()).m142469d()) {
                                        if (AbstractC19074t.m100204b(gVar.m142475c().mo2478b(), optString2)) {
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                if (gVar != null) {
                                    AbstractC19444a.m101697e(new Runnable() { // from class: ea0.m
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            SearchGlobalView.m73181zN(SearchGlobalView.this, gVar);
                                        }
                                    });
                                }
                            }
                            return new C18316b(c18316b.m97246b(), Boolean.TRUE, null, null, 12, null);
                        case 1522565683:
                            if (!str2.equals("action.globalsearch.search")) {
                                return null;
                            }
                            final String optString3 = jSONObject != null ? jSONObject.optString("query") : null;
                            if (optString3 != null) {
                                AbstractC19444a.m101697e(new Runnable() { // from class: ea0.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SearchGlobalView.m73179yN(SearchGlobalView.this, optString3);
                                    }
                                });
                            }
                            return new C18316b(c18316b.m97246b(), Boolean.TRUE, null, null, 12, null);
                        default:
                            return null;
                    }
                }
                return new C18316b(c18316b.m97246b(), Boolean.TRUE, null, null, 12, null);
            case 866207848:
                if (m97246b.equals("Search.GetSearchSessionData")) {
                    return new C18316b("Search.GetSearchSessionData", this.f67261p1, null, null, 12, null);
                }
                return null;
            case 961448216:
                if (!m97246b.equals("Search.RefreshRecentSearch")) {
                    return null;
                }
                m73158qO();
                return null;
            case 1067115615:
                if (!m97246b.equals("ACTION_RESULT_RESET_TAB_INDEX")) {
                    return null;
                }
                SearchGlobalResultLayout searchGlobalResultLayout5 = this.f67233N0;
                if (searchGlobalResultLayout5 == null) {
                    AbstractC19074t.m100223u("resultLayout");
                } else {
                    searchGlobalResultLayout3 = searchGlobalResultLayout5;
                }
                return searchGlobalResultLayout3.mo205i9(c18316b);
            case 1398441864:
                if (!m97246b.equals("ACTION_OPEN_FILE") || !(c18316b.m97245a() instanceof AbstractC29069a.e) || !(c18316b.m97247c() instanceof C20556f)) {
                    return null;
                }
                try {
                    String m73066E22 = m73066E2();
                    int length2 = m73066E22.length() - 1;
                    int i13 = 0;
                    boolean z13 = false;
                    while (i13 <= length2) {
                        boolean z14 = AbstractC19074t.m100209g(m73066E22.charAt(!z13 ? i13 : length2), 32) <= 0;
                        if (z13) {
                            if (!z14) {
                                m73066E22.subSequence(i13, length2 + 1).toString();
                                AbstractC23152n3.m119036c0(this.f72421L0.m92648SI(), (C20556f) c18316b.m97247c());
                                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.p
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SearchGlobalView.m73063CN(SearchGlobalView.this);
                                    }
                                });
                                return null;
                            }
                            length2--;
                        } else if (z14) {
                            i13++;
                        } else {
                            z13 = true;
                        }
                    }
                    m73066E22.subSequence(i13, length2 + 1).toString();
                    AbstractC23152n3.m119036c0(this.f72421L0.m92648SI(), (C20556f) c18316b.m97247c());
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchGlobalView.m73063CN(SearchGlobalView.this);
                        }
                    });
                    return null;
                } catch (Exception e13) {
                    AbstractC23350e.m122778h(e13);
                    return null;
                }
            case 1437396170:
                if (m97246b.equals("SGResultLayout:ACTION_GET_ADAPTER_PARAM")) {
                    return new C18316b("SGResultLayout:ACTION_GET_ADAPTER_PARAM", m73066E2(), null, null, 12, null);
                }
                return null;
            case 1517742221:
                if (!m97246b.equals("Search.Result.ToggleUploadDownloadCallback")) {
                    return null;
                }
                Object m97245a10 = c18316b.m97245a();
                AbstractC29069a.a aVar3 = m97245a10 instanceof AbstractC29069a.a ? (AbstractC29069a.a) m97245a10 : null;
                if (aVar3 == null || (m145141e = aVar3.m145141e()) == null) {
                    return null;
                }
                m73172vO(m145141e, AbstractC19074t.m100204b(c18316b.m97247c(), Boolean.TRUE));
                return null;
            case 1523681309:
                if (!m97246b.equals("ACTION_RESULT_JUMP_TO_TARGET")) {
                    return null;
                }
                SearchGlobalResultLayout searchGlobalResultLayout6 = this.f67233N0;
                if (searchGlobalResultLayout6 == null) {
                    AbstractC19074t.m100223u("resultLayout");
                } else {
                    searchGlobalResultLayout2 = searchGlobalResultLayout6;
                }
                return searchGlobalResultLayout2.mo205i9(c18316b);
            case 1575976074:
                if (!m97246b.equals("ACTION_VIEW_PROFILE_FRIEND_SUGGEST") || !(c18316b.m97245a() instanceof C31874cb)) {
                    return null;
                }
                AbstractC23074g2.m118382h((C31874cb) c18316b.m97245a(), this.f72421L0.m92662fJ(), 0, C32002l4.Companion.m154287a(8));
                return null;
            case 1576917232:
                if (!m97246b.equals("ACTION_ON_PAGE_SCROLL_REACH_BOTTOM") || !(c18316b.m97245a() instanceof C29070b) || !(c18316b.m97247c() instanceof AbstractC29080l) || !C19318e0.Companion.m101097f((AbstractC29080l) c18316b.m97247c())) {
                    return null;
                }
                if (((C29070b) c18316b.m97245a()).m145235a() < Math.max(0, r0.m145236b() - 25)) {
                    return null;
                }
                AbstractRunnableC19355q1 abstractRunnableC19355q12 = this.f67260o1;
                C19319e1 c19319e12 = abstractRunnableC19355q12 instanceof C19319e1 ? (C19319e1) abstractRunnableC19355q12 : null;
                if (c19319e12 == null || c19319e12.isCancelled()) {
                    return null;
                }
                new C19318e0(c19319e12, new C18316b("ACTION_HANDLE_LOAD_MORE", c18316b.m97245a(), c18316b.m97247c(), null, 8, null), m73066E2(), c19319e12.m101106o()).m101442j();
                return null;
            case 1716726920:
                if (!m97246b.equals("ACTION_OPEN_FRIEND_OPTION_AFTER_ADDED") || !(c18316b.m97245a() instanceof ContactProfile)) {
                    return null;
                }
                AbstractC21935u.m114523M(this.f72421L0.m92662fJ(), (ContactProfile) c18316b.m97245a());
                return null;
            case 1883681944:
                if (!m97246b.equals("Search.Result.ClickItemSeeMore")) {
                    return null;
                }
                if (AbstractC19444a.m101693a()) {
                    new C19342m0(this, c18316b, m73066E2()).m101441i();
                    return null;
                }
                throw new IllegalStateException("Action " + c18316b.m97246b() + " is required to be invoked on MainThread");
            case 1887550944:
                if (!m97246b.equals("ACTION_SUBMIT_LIST_RESULT")) {
                    return null;
                }
                SearchGlobalResultLayout searchGlobalResultLayout7 = this.f67233N0;
                if (searchGlobalResultLayout7 == null) {
                    AbstractC19074t.m100223u("resultLayout");
                    searchGlobalResultLayout7 = null;
                }
                searchGlobalResultLayout7.mo205i9(c18316b);
                return null;
            case 1917340633:
                if (!m97246b.equals("ACTION_CLICK_ITEM_SEE_MORE_COMPACT_MESSAGE") || !(c18316b.m97245a() instanceof AbstractC29069a.a)) {
                    return null;
                }
                m73130gO(this, m73066E2(), AbstractC29080l.g.f134887b, null, ((AbstractC29069a.a) c18316b.m97245a()).m145142f().m18037d().m18055d(), ((AbstractC29069a.a) c18316b.m97245a()).m145150n(), this.f67261p1.m101247x().m145291s().mo145251y0().m145178d(), this.f67261p1.m101251z(), this.f67261p1.m101235r(), 4, null);
                return null;
            default:
                return null;
        }
    }

    /* renamed from: wO */
    public final void m73191wO(MessageId messageId) {
        Object obj;
        AbstractC19074t.m100208f(messageId, "messageId");
        if (this.f67261p1.m101207d() == AbstractC29080l.g.f134887b.m145312a() || this.f67261p1.m101207d() == AbstractC29080l.a.f134882b.m145312a()) {
            SearchGlobalResultLayout searchGlobalResultLayout = this.f67233N0;
            C18328f c18328f = null;
            if (searchGlobalResultLayout == null) {
                AbstractC19074t.m100223u("resultLayout");
                searchGlobalResultLayout = null;
            }
            C18316b mo205i9 = searchGlobalResultLayout.mo205i9(new C18316b("SGResultLayout:ACTION_GET_FOCUSED_ADAPTER", Integer.valueOf(this.f67261p1.m101207d()), null, null, 12, null));
            if (mo205i9 != null) {
                obj = mo205i9.m97245a();
            } else {
                obj = null;
            }
            if (obj instanceof C18328f) {
                c18328f = (C18328f) obj;
            }
            if (c18328f != null) {
                C18333g1.f92667a.m97287E(c18328f, messageId);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        boolean z11;
        List m131505m;
        Integer num;
        Object[] objArr2;
        boolean z12;
        AbstractC19074t.m100208f(objArr, "args");
        try {
            if (i11 != 6) {
                if (i11 != 44) {
                    int[] iArr = null;
                    ZaloView zaloView = null;
                    if (i11 != 91) {
                        if (i11 != 6020) {
                            if (i11 != 3002) {
                                if (i11 != 3003) {
                                    if (i11 != 7000) {
                                        if (i11 == 7001) {
                                            try {
                                                if (objArr.length >= 2) {
                                                    Object obj = objArr[0];
                                                    if ((obj instanceof String) && (objArr[1] instanceof Integer) && AbstractC19074t.m100204b(obj, this.f67261p1.m101211f())) {
                                                        C19325g1 c19325g1 = this.f67261p1;
                                                        Object obj2 = objArr[1];
                                                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                                                        c19325g1.m101226m0(((Integer) obj2).intValue());
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e11) {
                                                e11.printStackTrace();
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    if (objArr.length == 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if ((!z12) && (objArr[0] instanceof C18316b)) {
                                        m73158qO();
                                        return;
                                    }
                                    return;
                                }
                                if (!mo60294yp()) {
                                    C17487o0 m92662fJ = m92662fJ();
                                    if (m92662fJ != null) {
                                        zaloView = m92662fJ.m93012K0();
                                    }
                                    if (zaloView == this) {
                                        C18333g1.f92667a.m97294o();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            AbstractC19444a.m101695c(new Runnable() { // from class: ea0.a0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SearchGlobalView.m73119dN(SearchGlobalView.this);
                                }
                            });
                            return;
                        }
                        m73114bN(true);
                        return;
                    }
                    if (objArr.length == 3) {
                        Object obj3 = objArr[0];
                        if (obj3 instanceof Integer) {
                            num = (Integer) obj3;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            int intValue = num.intValue();
                            Object obj4 = objArr[1];
                            if (obj4 instanceof Object[]) {
                                objArr2 = (Object[]) obj4;
                            } else {
                                objArr2 = null;
                            }
                            if (objArr2 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj5 : objArr2) {
                                    if (obj5 instanceof String) {
                                        arrayList.add(obj5);
                                    }
                                }
                                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                if (strArr != null) {
                                    Object obj6 = objArr[2];
                                    if (obj6 instanceof int[]) {
                                        iArr = (int[]) obj6;
                                    }
                                    if (iArr == null) {
                                        return;
                                    }
                                    onRequestPermissionsResult(intValue, strArr, iArr);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    Object obj7 = objArr[0];
                    AbstractC19074t.m100206d(obj7, "null cannot be cast to non-null type kotlin.String");
                    final String str = (String) obj7;
                    String[] strArr2 = AbstractC28025b8.f130826C;
                    AbstractC19074t.m100207e(strArr2, "ARR_SEARCH_GLOBAL_TIPS");
                    m131505m = AbstractC25368s.m131505m(Arrays.copyOf(strArr2, strArr2.length));
                    if (m131505m.contains(str)) {
                        this.f72827B0.post(new Runnable() { // from class: ea0.b0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchGlobalView.m73122eN(SearchGlobalView.this, str);
                            }
                        });
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
            }
            try {
                if (objArr.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    Object obj8 = objArr[0];
                    if (obj8 instanceof MessageId) {
                        AbstractC19074t.m100206d(obj8, "null cannot be cast to non-null type com.zing.zalo.data.entity.chat.message.MessageId");
                        m73182F5((MessageId) obj8);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e13) {
                AbstractC20110a.f98889a.mo104552e(e13);
                return;
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
        e14.printStackTrace();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 91);
        bVar.m124119a().m124115b(this, 3002);
        bVar.m124119a().m124115b(this, 7000);
        bVar.m124119a().m124115b(this, 6020);
        bVar.m124119a().m124115b(this, 44);
        bVar.m124119a().m124115b(this, 6);
        bVar.m124119a().m124115b(this, 7001);
    }
}
