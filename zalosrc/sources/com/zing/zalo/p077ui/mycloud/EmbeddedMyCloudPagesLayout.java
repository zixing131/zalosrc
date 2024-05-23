package com.zing.zalo.p077ui.mycloud;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import au.AbstractC2379w;
import au.C2370r0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.InterfaceC11320c;
import com.zing.zalo.p077ui.chat.transfer.ChatOpenParam;
import com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView;
import com.zing.zalo.p077ui.mycloud.EmbeddedMyCloudPagesLayout;
import com.zing.zalo.p077ui.mycloud.InterfaceC12507a;
import com.zing.zalo.p077ui.mycloud.ScrollableTabViewLayout;
import com.zing.zalo.p077ui.mycloud.collection.CollectionDetailView;
import com.zing.zalo.p077ui.mycloud.collection.CollectionListingView;
import com.zing.zalo.p077ui.mycloud.collection.CreateNewCollectionView;
import com.zing.zalo.p077ui.mycloud.collection.PopupAddItemsToCollection;
import com.zing.zalo.p077ui.mycloud.filetab.MyCloudFileTabView;
import com.zing.zalo.p077ui.mycloud.gridtab.GridChatView;
import com.zing.zalo.p077ui.mycloud.linktab.MyCloudLinkTabView;
import com.zing.zalo.p077ui.mycloud.mediatab.MyCloudMediaTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.mycloud.textmsgtab.MyCloudTextTabView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.p077ui.zviews.RolledMediaBottomSheet;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import i40.C20275e;
import i60.C20343i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23034c6;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23211s7;
import me0.C23055e5;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import mw.EnumC23460e;
import mw.InterfaceC23456a;
import nh0.C23793c;
import org.json.JSONObject;
import p172fy.C19171b;
import p239ih.C20556f;
import p279jw.C21373a;
import p363nh.C23744a;
import p365nk.C23805a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p649xl.C29798f6;
import p649xl.C29834h6;
import p716zh.C31950hc;
import pk.C24799c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import v50.C27870vb;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class EmbeddedMyCloudPagesLayout extends FrameLayout implements C23744a.c, InterfaceC12508b {
    public static final C12479a Companion = new C12479a(null);

    /* renamed from: A */
    private final FrameLayout f65310A;

    /* renamed from: B */
    private ZaloView f65311B;

    /* renamed from: C */
    private GridChatView f65312C;

    /* renamed from: D */
    private MyCloudTextTabView f65313D;

    /* renamed from: E */
    private MyCloudMediaTabView f65314E;

    /* renamed from: F */
    private MyCloudFileTabView f65315F;

    /* renamed from: G */
    private MyCloudLinkTabView f65316G;

    /* renamed from: H */
    private MyCloudMultiSelectBottomView f65317H;

    /* renamed from: I */
    private EnumC12481c f65318I;

    /* renamed from: J */
    private InterfaceC12480b f65319J;

    /* renamed from: K */
    private InterfaceC12507a f65320K;

    /* renamed from: L */
    private boolean f65321L;

    /* renamed from: M */
    private C23805a.e f65322M;

    /* renamed from: N */
    private long f65323N;

    /* renamed from: O */
    private C8009j f65324O;

    /* renamed from: P */
    private KeyEventCallbackC17462c f65325P;

    /* renamed from: Q */
    private int f65326Q;

    /* renamed from: R */
    private int f65327R;

    /* renamed from: S */
    private final View.OnLayoutChangeListener f65328S;

    /* renamed from: T */
    private Snackbar f65329T;

    /* renamed from: U */
    private boolean f65330U;

    /* renamed from: p */
    private final InterfaceC24854k f65331p;

    /* renamed from: q */
    private final InterfaceC24854k f65332q;

    /* renamed from: r */
    private final InterfaceC24854k f65333r;

    /* renamed from: s */
    private final InterfaceC24854k f65334s;

    /* renamed from: t */
    private final C29798f6 f65335t;

    /* renamed from: u */
    private final C29834h6 f65336u;

    /* renamed from: v */
    private final FrameLayout f65337v;

    /* renamed from: w */
    private final FrameLayout f65338w;

    /* renamed from: x */
    private final FrameLayout f65339x;

    /* renamed from: y */
    private final FrameLayout f65340y;

    /* renamed from: z */
    private final FrameLayout f65341z;

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$a */
    /* loaded from: classes6.dex */
    public static final class C12479a {
        private C12479a() {
        }

        public /* synthetic */ C12479a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12480b {
        /* renamed from: a */
        void mo64291a();

        /* renamed from: b */
        void mo64292b();

        /* renamed from: c */
        void mo64293c(EnumC23460e enumC23460e);

        /* renamed from: d */
        void mo64294d(boolean z11, EnumC23460e enumC23460e);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$c */
    /* loaded from: classes6.dex */
    public static final class EnumC12481c {

        /* renamed from: p */
        public static final EnumC12481c f65342p = new EnumC12481c("STATE_CSC_CHAT_VIEW", 0);

        /* renamed from: q */
        public static final EnumC12481c f65343q = new EnumC12481c("STATE_GRID_CHAT_VIEW", 1);

        /* renamed from: r */
        public static final EnumC12481c f65344r = new EnumC12481c("STATE_TEXT_MSG_TAB", 2);

        /* renamed from: s */
        public static final EnumC12481c f65345s = new EnumC12481c("STATE_MEDIA", 3);

        /* renamed from: t */
        public static final EnumC12481c f65346t = new EnumC12481c("STATE_FILE", 4);

        /* renamed from: u */
        public static final EnumC12481c f65347u = new EnumC12481c("STATE_LINK", 5);

        /* renamed from: v */
        private static final /* synthetic */ EnumC12481c[] f65348v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f65349w;

        static {
            EnumC12481c[] m70199b = m70199b();
            f65348v = m70199b;
            f65349w = AbstractC30166b.m148796a(m70199b);
        }

        private EnumC12481c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC12481c[] m70199b() {
            return new EnumC12481c[]{f65342p, f65343q, f65344r, f65345s, f65346t, f65347u};
        }

        public static EnumC12481c valueOf(String str) {
            return (EnumC12481c) Enum.valueOf(EnumC12481c.class, str);
        }

        public static EnumC12481c[] values() {
            return (EnumC12481c[]) f65348v.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$d */
    /* loaded from: classes6.dex */
    static final class C12482d extends AbstractC19075u implements InterfaceC18494a {
        C12482d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CarouselMyCloudCollectionView mo12V4() {
            Context context = EmbeddedMyCloudPagesLayout.this.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new CarouselMyCloudCollectionView(context);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$e */
    /* loaded from: classes6.dex */
    static final class C12483e extends AbstractC19075u implements InterfaceC18494a {
        C12483e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CollectionInfoHeaderView mo12V4() {
            Context context = EmbeddedMyCloudPagesLayout.this.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new CollectionInfoHeaderView(context, EmbeddedMyCloudPagesLayout.this.f65323N);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$f */
    /* loaded from: classes6.dex */
    public static final class C12484f extends C20275e {
        C12484f() {
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$g */
    /* loaded from: classes6.dex */
    static final class C12485g extends AbstractC19075u implements InterfaceC18494a {
        C12485g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout mo12V4() {
            return new LinearLayout(EmbeddedMyCloudPagesLayout.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$h */
    /* loaded from: classes6.dex */
    public static final class C12486h implements ScrollableTabViewLayout.InterfaceC12502b {
        C12486h() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.ScrollableTabViewLayout.InterfaceC12502b
        /* renamed from: a */
        public void mo70203a(int i11, String str) {
            AbstractC19074t.m100208f(str, "tabId");
            EmbeddedMyCloudPagesLayout.m70070D1(EmbeddedMyCloudPagesLayout.this, EnumC23460e.valueOf(str), false, 2, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$i */
    /* loaded from: classes6.dex */
    public static final class C12487i implements InterfaceC23456a {
        C12487i() {
        }

        @Override // mw.InterfaceC23456a
        /* renamed from: Y */
        public void mo70061Y() {
            BaseZaloView baseZaloView;
            ZaloView zaloView = EmbeddedMyCloudPagesLayout.this.f65311B;
            if (zaloView instanceof BaseZaloView) {
                baseZaloView = (BaseZaloView) zaloView;
            } else {
                baseZaloView = null;
            }
            if (baseZaloView != null) {
                baseZaloView.mo46829Y();
            }
        }

        @Override // mw.InterfaceC23456a
        /* renamed from: a */
        public View mo70062a() {
            ZaloView zaloView = EmbeddedMyCloudPagesLayout.this.f65311B;
            if (zaloView != null) {
                return zaloView.m92656bJ();
            }
            return null;
        }

        @Override // mw.InterfaceC23456a
        /* renamed from: q3 */
        public void mo70063q3() {
            BaseZaloView baseZaloView;
            ZaloView zaloView = EmbeddedMyCloudPagesLayout.this.f65311B;
            if (zaloView instanceof BaseZaloView) {
                baseZaloView = (BaseZaloView) zaloView;
            } else {
                baseZaloView = null;
            }
            if (baseZaloView != null) {
                baseZaloView.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$j */
    /* loaded from: classes6.dex */
    public static final class C12488j implements CarouselMyCloudCollectionView.InterfaceC12466e {
        C12488j() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12466e
        /* renamed from: a */
        public void mo70009a() {
            EmbeddedMyCloudPagesLayout.this.m70128w1();
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12466e
        /* renamed from: b */
        public void mo70010b(boolean z11) {
            TransitionManager.beginDelayedTransition(EmbeddedMyCloudPagesLayout.this);
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12466e
        /* renamed from: n */
        public void mo70011n(int i11) {
            InterfaceC27218a m92676n2;
            C17487o0 mo35579p;
            InterfaceC27218a m92676n22;
            C17487o0 mo35579p2;
            int m69998k = EmbeddedMyCloudPagesLayout.this.getCarouselMyCloudCollectionView().m69998k(i11);
            if (m69998k != 0) {
                if (m69998k != 1) {
                    if (m69998k == 2) {
                        EmbeddedMyCloudPagesLayout.this.m70128w1();
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                ZaloView zaloView = EmbeddedMyCloudPagesLayout.this.f65311B;
                if (zaloView != null && (m92676n22 = zaloView.m92676n2()) != null && (mo35579p2 = m92676n22.mo35579p()) != null) {
                    mo35579p2.m93069k2(CollectionListingView.class, bundle, 1, true);
                    return;
                }
                return;
            }
            C24799c m69997j = EmbeddedMyCloudPagesLayout.this.getCarouselMyCloudCollectionView().m69997j(i11);
            EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = EmbeddedMyCloudPagesLayout.this;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("extra_collection_id", m69997j.m128824d());
            ZaloView zaloView2 = embeddedMyCloudPagesLayout.f65311B;
            if (zaloView2 != null && (m92676n2 = zaloView2.m92676n2()) != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93069k2(CollectionDetailView.class, bundle2, 1, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$k */
    /* loaded from: classes6.dex */
    public static final class AnimationAnimationListenerC12489k implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ boolean f65356a;

        /* renamed from: b */
        final /* synthetic */ EmbeddedMyCloudPagesLayout f65357b;

        AnimationAnimationListenerC12489k(boolean z11, EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
            this.f65356a = z11;
            this.f65357b = embeddedMyCloudPagesLayout;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC12480b interfaceC12480b;
            if (!this.f65356a && (interfaceC12480b = this.f65357b.f65319J) != null) {
                InterfaceC12507a interfaceC12507a = this.f65357b.f65320K;
                if (interfaceC12507a == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC12507a = null;
                }
                interfaceC12480b.mo64294d(false, interfaceC12507a.mo70284W3());
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.EmbeddedMyCloudPagesLayout$l */
    /* loaded from: classes6.dex */
    static final class C12490l extends AbstractC19075u implements InterfaceC18494a {
        C12490l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScrollableTabViewLayout mo12V4() {
            Context context = EmbeddedMyCloudPagesLayout.this.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new ScrollableTabViewLayout(context);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedMyCloudPagesLayout(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: A1 */
    private final void m70064A1(boolean z11) {
        InterfaceC12480b interfaceC12480b;
        if (this.f65317H == null && z11) {
            m70076J0();
        }
        if (z11 && (interfaceC12480b = this.f65319J) != null) {
            InterfaceC12507a interfaceC12507a = this.f65320K;
            if (interfaceC12507a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12507a = null;
            }
            interfaceC12480b.mo64294d(true, interfaceC12507a.mo70284W3());
        }
        MyCloudMultiSelectBottomView myCloudMultiSelectBottomView = this.f65317H;
        if (myCloudMultiSelectBottomView != null) {
            myCloudMultiSelectBottomView.m87775d(z11, true, new AnimationAnimationListenerC12489k(z11, this));
        }
    }

    /* renamed from: B0 */
    private final void m70065B0() {
        if (this.f65318I != EnumC12481c.f65343q) {
            return;
        }
        AbstractC23136l9.m118744r1(this.f65340y, 8);
        m70114p1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m70066B1(List list, EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, View view) {
        int m116580c;
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        m116580c = AbstractC22543l.m116580c(0, (int) (C23793c.Companion.m124321a().mo124319c() - C31950hc.f146830a.m153641s()));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dur", m116580c);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        C31950hc.f146830a.m153638L("csc_msgmenu", 0, "msg_chat_delete_undo", list, jSONObject.toString());
        Snackbar snackbar = embeddedMyCloudPagesLayout.f65329T;
        if (snackbar != null) {
            snackbar.m90655n();
        }
        embeddedMyCloudPagesLayout.m70108m1();
    }

    /* renamed from: C0 */
    private final void m70067C0() {
        if (this.f65318I != EnumC12481c.f65347u) {
            return;
        }
        AbstractC23136l9.m118744r1(this.f65339x, 8);
    }

    /* renamed from: C1 */
    private final void m70068C1(EnumC23460e enumC23460e, boolean z11) {
        InterfaceC12507a interfaceC12507a = this.f65320K;
        ChatView chatView = null;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        if (interfaceC12507a.mo70284W3() != enumC23460e && m70083Q0(enumC23460e)) {
            if (enumC23460e == EnumC23460e.f113955q) {
                getCarouselMyCloudCollectionView().setVisibility(0);
            } else {
                getCarouselMyCloudCollectionView().setVisibility(8);
            }
        }
        getTabViewLayout().m70266c(enumC23460e.m123172c());
        InterfaceC12507a interfaceC12507a2 = this.f65320K;
        if (interfaceC12507a2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a2 = null;
        }
        interfaceC12507a2.mo70281T3(enumC23460e, z11);
        InterfaceC12480b interfaceC12480b = this.f65319J;
        if (interfaceC12480b != null) {
            interfaceC12480b.mo64293c(enumC23460e);
        }
        if (this.f65321L) {
            ZaloView zaloView = this.f65311B;
            if (zaloView instanceof ChatView) {
                chatView = (ChatView) zaloView;
            }
            if (chatView != null) {
                chatView.mo60011fw();
            }
        }
    }

    /* renamed from: D0 */
    private final void m70069D0() {
        if (this.f65318I != EnumC12481c.f65345s) {
            return;
        }
        AbstractC23136l9.m118744r1(this.f65337v, 8);
    }

    /* renamed from: D1 */
    static /* synthetic */ void m70070D1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, EnumC23460e enumC23460e, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        embeddedMyCloudPagesLayout.m70068C1(enumC23460e, z11);
    }

    /* renamed from: E1 */
    private final void m70071E1() {
        AbstractC19444a.m101695c(new Runnable() { // from class: u80.s0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70073F1(EmbeddedMyCloudPagesLayout.this);
            }
        });
    }

    /* renamed from: F0 */
    private final void m70072F0() {
        if (this.f65318I != EnumC12481c.f65344r) {
            return;
        }
        AbstractC23136l9.m118744r1(this.f65341z, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m70073F1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
        Object context;
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        try {
            FrameLayout frameLayout = embeddedMyCloudPagesLayout.f65340y;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = embeddedMyCloudPagesLayout.f65326Q + embeddedMyCloudPagesLayout.getTabViewHeight();
                frameLayout.setLayoutParams(marginLayoutParams);
                FrameLayout frameLayout2 = embeddedMyCloudPagesLayout.f65341z;
                ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = embeddedMyCloudPagesLayout.f65326Q + embeddedMyCloudPagesLayout.getTabViewHeight();
                    frameLayout2.setLayoutParams(marginLayoutParams2);
                    FrameLayout frameLayout3 = embeddedMyCloudPagesLayout.f65337v;
                    ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.topMargin = embeddedMyCloudPagesLayout.f65326Q + embeddedMyCloudPagesLayout.getTabViewHeight();
                        frameLayout3.setLayoutParams(marginLayoutParams3);
                        FrameLayout frameLayout4 = embeddedMyCloudPagesLayout.f65338w;
                        ViewGroup.LayoutParams layoutParams4 = frameLayout4.getLayoutParams();
                        if (layoutParams4 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                            marginLayoutParams4.topMargin = embeddedMyCloudPagesLayout.f65326Q + embeddedMyCloudPagesLayout.getTabViewHeight();
                            frameLayout4.setLayoutParams(marginLayoutParams4);
                            FrameLayout frameLayout5 = embeddedMyCloudPagesLayout.f65339x;
                            ViewGroup.LayoutParams layoutParams5 = frameLayout5.getLayoutParams();
                            if (layoutParams5 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                                marginLayoutParams5.topMargin = embeddedMyCloudPagesLayout.f65326Q + embeddedMyCloudPagesLayout.getTabViewHeight();
                                frameLayout5.setLayoutParams(marginLayoutParams5);
                                LinearLayout headerContainer = embeddedMyCloudPagesLayout.getHeaderContainer();
                                ViewGroup.LayoutParams layoutParams6 = headerContainer.getLayoutParams();
                                if (layoutParams6 != null) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                                    marginLayoutParams6.topMargin = embeddedMyCloudPagesLayout.f65326Q;
                                    headerContainer.setLayoutParams(marginLayoutParams6);
                                    ZaloView zaloView = embeddedMyCloudPagesLayout.f65311B;
                                    int i11 = 0;
                                    if (zaloView != null && (context = zaloView.getContext()) != null && (!(context instanceof InterfaceC27218a) || (!((InterfaceC27218a) context).mo35586v2() && !((InterfaceC27218a) context).mo35576n3()))) {
                                        i11 = AbstractC23136l9.m118737p0();
                                    }
                                    RelativeLayout root = embeddedMyCloudPagesLayout.f65335t.getRoot();
                                    AbstractC19074t.m100207e(root, "getRoot(...)");
                                    ViewGroup.LayoutParams layoutParams7 = root.getLayoutParams();
                                    if (layoutParams7 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
                                        int i12 = embeddedMyCloudPagesLayout.f65327R;
                                        if (i12 > 0) {
                                            i11 = i12;
                                        }
                                        marginLayoutParams7.topMargin = i11;
                                        root.setLayoutParams(marginLayoutParams7);
                                        return;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public static final void m70074G0(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
        MyCloudLinkTabView myCloudLinkTabView;
        MyCloudFileTabView myCloudFileTabView;
        MyCloudMediaTabView myCloudMediaTabView;
        MyCloudTextTabView myCloudTextTabView;
        GridChatView gridChatView;
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        GridChatView gridChatView2 = embeddedMyCloudPagesLayout.f65312C;
        if (gridChatView2 != null && gridChatView2.m92687sJ() && (gridChatView = embeddedMyCloudPagesLayout.f65312C) != null) {
            gridChatView.m70357lM();
        }
        MyCloudTextTabView myCloudTextTabView2 = embeddedMyCloudPagesLayout.f65313D;
        if (myCloudTextTabView2 != null && myCloudTextTabView2.m92687sJ() && (myCloudTextTabView = embeddedMyCloudPagesLayout.f65313D) != null) {
            myCloudTextTabView.m70357lM();
        }
        MyCloudMediaTabView myCloudMediaTabView2 = embeddedMyCloudPagesLayout.f65314E;
        if (myCloudMediaTabView2 != null && myCloudMediaTabView2.m92687sJ() && (myCloudMediaTabView = embeddedMyCloudPagesLayout.f65314E) != null) {
            myCloudMediaTabView.m70357lM();
        }
        MyCloudFileTabView myCloudFileTabView2 = embeddedMyCloudPagesLayout.f65315F;
        if (myCloudFileTabView2 != null && myCloudFileTabView2.m92687sJ() && (myCloudFileTabView = embeddedMyCloudPagesLayout.f65315F) != null) {
            myCloudFileTabView.m70357lM();
        }
        MyCloudLinkTabView myCloudLinkTabView2 = embeddedMyCloudPagesLayout.f65316G;
        if (myCloudLinkTabView2 != null && myCloudLinkTabView2.m92687sJ() && (myCloudLinkTabView = embeddedMyCloudPagesLayout.f65316G) != null) {
            myCloudLinkTabView.m70357lM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public static final void m70075H0(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        ZaloView zaloView = embeddedMyCloudPagesLayout.f65311B;
        if (zaloView != null) {
            AbstractC19656s0.m103066i(c17945a0, zaloView);
        }
        embeddedMyCloudPagesLayout.mo70176e();
    }

    /* renamed from: J0 */
    private final void m70076J0() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        InterfaceC12507a interfaceC12507a = null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f65310A, new FrameLayout.LayoutParams(-1, -2, 80));
        }
        this.f65310A.removeAllViews();
        MyCloudMultiSelectBottomView myCloudMultiSelectBottomView = new MyCloudMultiSelectBottomView(getContext(), this.f65322M);
        InterfaceC12507a interfaceC12507a2 = this.f65320K;
        if (interfaceC12507a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC12507a = interfaceC12507a2;
        }
        myCloudMultiSelectBottomView.setListener(interfaceC12507a.mo70290b4());
        myCloudMultiSelectBottomView.setVisibility(8);
        this.f65317H = myCloudMultiSelectBottomView;
        this.f65310A.addView(myCloudMultiSelectBottomView);
    }

    /* renamed from: K0 */
    private final void m70077K0() {
        InterfaceC12507a interfaceC12507a;
        getHeaderContainer().setOrientation(1);
        getHeaderContainer().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        Button button = this.f65336u.f138006q;
        button.setIdTracking("btn_retry_sync_my_cloud_msg");
        button.setOnClickListener(new View.OnClickListener() { // from class: u80.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmbeddedMyCloudPagesLayout.m70078L0(EmbeddedMyCloudPagesLayout.this, view);
            }
        });
        InterfaceC12507a interfaceC12507a2 = this.f65320K;
        InterfaceC12507a interfaceC12507a3 = null;
        if (interfaceC12507a2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        } else {
            interfaceC12507a = interfaceC12507a2;
        }
        InterfaceC12507a interfaceC12507a4 = this.f65320K;
        if (interfaceC12507a4 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a4 = null;
        }
        InterfaceC12507a.a.m70301a(interfaceC12507a, interfaceC12507a4.mo70282U3(), false, false, 6, null);
        getHeaderContainer().addView(this.f65336u.getRoot());
        C23805a.e eVar = this.f65322M;
        C23805a.e eVar2 = C23805a.e.f115063p;
        if (eVar != eVar2) {
            InterfaceC12507a interfaceC12507a5 = this.f65320K;
            if (interfaceC12507a5 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12507a5 = null;
            }
            interfaceC12507a5.mo70299j4();
        }
        getHeaderContainer().addView(getTabViewLayout());
        if (this.f65322M == eVar2) {
            InterfaceC12507a interfaceC12507a6 = this.f65320K;
            if (interfaceC12507a6 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC12507a3 = interfaceC12507a6;
            }
            interfaceC12507a3.mo70299j4();
        }
        addView(getHeaderContainer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m70078L0(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, View view) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        InterfaceC12507a interfaceC12507a = embeddedMyCloudPagesLayout.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70287Z3();
    }

    /* renamed from: M0 */
    private final void m70079M0() {
        removeView(this.f65335t.getRoot());
        this.f65335t.f137743q.setOnTouchListener(new View.OnTouchListener() { // from class: u80.z0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m70080N0;
                m70080N0 = EmbeddedMyCloudPagesLayout.m70080N0(EmbeddedMyCloudPagesLayout.this, view, motionEvent);
                return m70080N0;
            }
        });
        AbstractC23136l9.m118744r1(this.f65335t.getRoot(), 8);
        RobotoTextView robotoTextView = this.f65335t.f137746t;
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        robotoTextView.setText(interfaceC12507a.mo70291c4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final boolean m70080N0(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        embeddedMyCloudPagesLayout.mo70176e();
        return false;
    }

    /* renamed from: O0 */
    private final void m70081O0() {
        ScrollableTabViewLayout tabViewLayout = getTabViewLayout();
        InterfaceC12507a interfaceC12507a = this.f65320K;
        InterfaceC12507a interfaceC12507a2 = interfaceC12507a;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a2 = null;
        }
        tabViewLayout.setTabList(interfaceC12507a2.mo70288a0());
        getTabViewLayout().setListener(new C12486h());
        mo70148J(true);
    }

    /* renamed from: P0 */
    private final void m70082P0() {
        addView(this.f65340y, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f65341z, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f65337v, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f65338w, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f65339x, new FrameLayout.LayoutParams(-1, -1));
        m70077K0();
        m70079M0();
        m70071E1();
    }

    /* renamed from: Q0 */
    private final boolean m70083Q0(EnumC23460e enumC23460e) {
        if ((enumC23460e == EnumC23460e.f113955q && !AbstractC23136l9.m118666N0(getCarouselMyCloudCollectionView())) || AbstractC23136l9.m118666N0(getCarouselMyCloudCollectionView())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public static final void m70089a1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        InterfaceC12507a interfaceC12507a = embeddedMyCloudPagesLayout.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70289a4(view.getHeight(), i16, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public static final void m70091b1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
        MyCloudLinkTabView myCloudLinkTabView;
        MyCloudFileTabView myCloudFileTabView;
        MyCloudMediaTabView myCloudMediaTabView;
        MyCloudTextTabView myCloudTextTabView;
        GridChatView gridChatView;
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        GridChatView gridChatView2 = embeddedMyCloudPagesLayout.f65312C;
        if (gridChatView2 != null && gridChatView2.m92687sJ() && (gridChatView = embeddedMyCloudPagesLayout.f65312C) != null) {
            gridChatView.m70326GM();
        }
        MyCloudTextTabView myCloudTextTabView2 = embeddedMyCloudPagesLayout.f65313D;
        if (myCloudTextTabView2 != null && myCloudTextTabView2.m92687sJ() && (myCloudTextTabView = embeddedMyCloudPagesLayout.f65313D) != null) {
            myCloudTextTabView.m70326GM();
        }
        MyCloudMediaTabView myCloudMediaTabView2 = embeddedMyCloudPagesLayout.f65314E;
        if (myCloudMediaTabView2 != null && myCloudMediaTabView2.m92687sJ() && (myCloudMediaTabView = embeddedMyCloudPagesLayout.f65314E) != null) {
            myCloudMediaTabView.m70326GM();
        }
        MyCloudFileTabView myCloudFileTabView2 = embeddedMyCloudPagesLayout.f65315F;
        if (myCloudFileTabView2 != null && myCloudFileTabView2.m92687sJ() && (myCloudFileTabView = embeddedMyCloudPagesLayout.f65315F) != null) {
            myCloudFileTabView.m70326GM();
        }
        MyCloudLinkTabView myCloudLinkTabView2 = embeddedMyCloudPagesLayout.f65316G;
        if (myCloudLinkTabView2 != null && myCloudLinkTabView2.m92687sJ() && (myCloudLinkTabView = embeddedMyCloudPagesLayout.f65316G) != null) {
            myCloudLinkTabView.m70326GM();
        }
    }

    private final CollectionInfoHeaderView getCollectionInfoHeaderView() {
        return (CollectionInfoHeaderView) this.f65333r.getValue();
    }

    private final LinearLayout getHeaderContainer() {
        return (LinearLayout) this.f65331p.getValue();
    }

    private final ScrollableTabViewLayout getTabViewLayout() {
        return (ScrollableTabViewLayout) this.f65334s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public static final void m70098h1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65340y, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65341z, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65337v, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65339x, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static final void m70100i1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65341z, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65337v, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65338w, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65339x, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public static final void m70102j1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65340y, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65341z, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65337v, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65338w, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m70104k1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65340y, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65341z, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65338w, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65339x, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m70106l1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65340y, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65337v, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65338w, 8);
        AbstractC23136l9.m118744r1(embeddedMyCloudPagesLayout.f65339x, 8);
    }

    /* renamed from: m1 */
    private final void m70108m1() {
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70276A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m70110n1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        HashMap hashMap;
        Object obj;
        Integer num;
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        InterfaceC12507a interfaceC12507a = null;
        embeddedMyCloudPagesLayout.f65324O = null;
        Object item = simpleAdapter.getItem(i11);
        if (item instanceof HashMap) {
            hashMap = (HashMap) item;
        } else {
            hashMap = null;
        }
        if (hashMap != null) {
            obj = hashMap.get("id");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            InterfaceC12507a interfaceC12507a2 = embeddedMyCloudPagesLayout.f65320K;
            if (interfaceC12507a2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC12507a = interfaceC12507a2;
            }
            interfaceC12507a.mo70286Y3(intValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m70112o1(ArrayList arrayList, EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout) {
        C17487o0 m92662fJ;
        AbstractC19074t.m100208f(arrayList, "$listSelectedItems");
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_BOOLEAN_FORWARD_MULTI_MESSAGES", true);
        bundle.putParcelableArrayList("EXTRA_LIST_MESSAGE_ID_FORWARDING", arrayList);
        bundle.putString("forwardMessageOwnerUid", "204278670");
        bundle.putBoolean("bol_share_in_app", true);
        bundle.putBoolean("btn_extra_show_hide_post_feed", true);
        InterfaceC12507a interfaceC12507a = embeddedMyCloudPagesLayout.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        bundle.putString("STR_SOURCE_START_VIEW", interfaceC12507a.mo70280S3());
        ZaloView zaloView = embeddedMyCloudPagesLayout.f65311B;
        if (zaloView != null && (m92662fJ = zaloView.m92662fJ()) != null) {
            m92662fJ.m93066i2(ShareView.class, bundle, 1048, 1, true);
        }
    }

    /* renamed from: p1 */
    private final void m70114p1() {
        InterfaceC27218a m92676n2;
        C17487o0 mo35579p;
        ZaloView m92996E0;
        ZaloView zaloView;
        InterfaceC27218a m92676n22;
        C17487o0 mo35579p2;
        ZaloView zaloView2 = this.f65311B;
        if (zaloView2 != null && (m92676n2 = zaloView2.m92676n2()) != null && (mo35579p = m92676n2.mo35579p()) != null && (m92996E0 = mo35579p.m92996E0("RolledMediaBottomSheet")) != null && (zaloView = this.f65311B) != null && (m92676n22 = zaloView.m92676n2()) != null && (mo35579p2 = m92676n22.mo35579p()) != null) {
            mo35579p2.mo92702G1(m92996E0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m70116q1(final EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, final MyCloudMessageItem myCloudMessageItem) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC19074t.m100208f(myCloudMessageItem, "$item");
        try {
            Context context = embeddedMyCloudPagesLayout.getContext();
            if (context == null) {
                return;
            }
            KeyEventCallbackC17462c keyEventCallbackC17462c = embeddedMyCloudPagesLayout.f65325P;
            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                keyEventCallbackC17462c.dismiss();
            }
            C16972e0.a m90932i = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String quantityString = context.getResources().getQuantityString(AbstractC7921d0.str_title_delete_message_my_cloud_v2, 1, 1);
            AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
            C16972e0 m90927d = m90932i.m90918B(quantityString).m90921E(true).m90942s(AbstractC8020f0.str_delete, new InterfaceC17463d.d() { // from class: u80.o0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    EmbeddedMyCloudPagesLayout.m70118r1(EmbeddedMyCloudPagesLayout.this, myCloudMessageItem, interfaceC17463d, i11);
                }
            }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: u80.p0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    EmbeddedMyCloudPagesLayout.m70120s1(interfaceC17463d, i11);
                }
            }).m90927d();
            embeddedMyCloudPagesLayout.f65325P = m90927d;
            if (m90927d != null) {
                m90927d.mo13822K();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m70118r1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, MyCloudMessageItem myCloudMessageItem, InterfaceC17463d interfaceC17463d, int i11) {
        List m131496e;
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC19074t.m100208f(myCloudMessageItem, "$item");
        try {
            InterfaceC12507a interfaceC12507a = embeddedMyCloudPagesLayout.f65320K;
            if (interfaceC12507a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12507a = null;
            }
            m131496e = AbstractC25366r.m131496e(myCloudMessageItem.m71033m());
            interfaceC12507a.mo70283V3(m131496e);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m70120s1(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m70122t1(final EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, List list) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC19074t.m100208f(list, "$chatContents");
        Context context = embeddedMyCloudPagesLayout.getContext();
        if (context == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(AbstractC19646n0.m102918O0(list, true));
        if (C23055e5.m118272g(false) && !C23055e5.m118270e()) {
            sb2.append("\n");
            sb2.append(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_warning_HD_video_group_saving));
        }
        new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION).m90949z(sb2).m90942s(AbstractC8020f0.str_yes, new InterfaceC17463d.d() { // from class: u80.q0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EmbeddedMyCloudPagesLayout.m70124u1(EmbeddedMyCloudPagesLayout.this, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_no, new InterfaceC17463d.d() { // from class: u80.r0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EmbeddedMyCloudPagesLayout.m70126v1(interfaceC17463d, i11);
            }
        }).m90927d().mo13822K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m70124u1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        InterfaceC12507a interfaceC12507a = embeddedMyCloudPagesLayout.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70295g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m70126v1(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public final void m70128w1() {
        C17487o0 m92662fJ;
        Bundle bundle = new Bundle();
        bundle.putInt("viewMode", 0);
        bundle.putBoolean("startCollectionDetail", true);
        bundle.putString("entryPoint", "mycloud_menuplus");
        ZaloView zaloView = this.f65311B;
        if (zaloView != null && (m92662fJ = zaloView.m92662fJ()) != null) {
            m92662fJ.m93069k2(CreateNewCollectionView.class, bundle, 2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m70130x1(final EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, final List list) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC19074t.m100208f(list, "$chatContents");
        try {
            Context context = embeddedMyCloudPagesLayout.getContext();
            if (context == null) {
                return;
            }
            C16972e0.a m90932i = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String quantityString = context.getResources().getQuantityString(AbstractC7921d0.str_title_delete_message_my_cloud_v2, list.size(), Integer.valueOf(list.size()));
            AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
            m90932i.m90918B(quantityString).m90921E(true).m90942s(AbstractC8020f0.str_delete, new InterfaceC17463d.d() { // from class: u80.l0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    EmbeddedMyCloudPagesLayout.m70132y1(EmbeddedMyCloudPagesLayout.this, list, interfaceC17463d, i11);
                }
            }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: u80.m0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    EmbeddedMyCloudPagesLayout.m70134z1(interfaceC17463d, i11);
                }
            }).m90927d().mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m70132y1(EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout, List list, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(embeddedMyCloudPagesLayout, "this$0");
        AbstractC19074t.m100208f(list, "$chatContents");
        try {
            InterfaceC12507a interfaceC12507a = embeddedMyCloudPagesLayout.f65320K;
            if (interfaceC12507a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12507a = null;
            }
            interfaceC12507a.mo70283V3(list);
            embeddedMyCloudPagesLayout.mo70176e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z0 */
    private final void m70133z0() {
        if (this.f65318I != EnumC12481c.f65346t) {
            return;
        }
        AbstractC23136l9.m118744r1(this.f65338w, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m70134z1(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: A */
    public void mo70135A(float f11) {
        TextView textView;
        ActionBar actionBar;
        getTabViewLayout().setTranslationY(f11);
        this.f65336u.getRoot().setTranslationY(f11);
        getCollectionInfoHeaderView().setTranslationY(f11);
        ZaloView zaloView = this.f65311B;
        if (zaloView != null && (actionBar = zaloView.f88760a0) != null) {
            textView = actionBar.getTitleTextView();
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setAlpha(1 - ((getCollapsableHeaderHeight() - Math.abs(f11)) / getCollapsableHeaderHeight()));
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: A0 */
    public void mo70136A0(C26365a c26365a) {
        InterfaceC27218a interfaceC27218a;
        C17487o0 m92662fJ;
        AbstractC19074t.m100208f(c26365a, "profileParam");
        C19171b c19171b = new C19171b();
        ZaloView zaloView = this.f65311B;
        if (zaloView != null && (m92662fJ = zaloView.m92662fJ()) != null) {
            interfaceC27218a = m92662fJ.m93021N0();
        } else {
            interfaceC27218a = null;
        }
        c19171b.m101508a(new C19171b.a(interfaceC27218a, c26365a, 0, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: B */
    public void mo70137B(AnimationTarget animationTarget, C17945a0 c17945a0, boolean z11, C17391z c17391z) {
        ArrayList m70900QM;
        ChatView chatView;
        int i11;
        SparseIntArray m70901RM;
        InterfaceC27218a m92676n2;
        InterfaceC11320c m60020gQ;
        AbstractC19074t.m100208f(animationTarget, "animationView");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        EnumC12481c enumC12481c = this.f65318I;
        EnumC12481c enumC12481c2 = EnumC12481c.f65345s;
        SparseArray sparseArray = null;
        if (enumC12481c == enumC12481c2) {
            MyCloudMediaTabView myCloudMediaTabView = this.f65314E;
            if (myCloudMediaTabView != null) {
                m70900QM = myCloudMediaTabView.m71015RM();
            }
            m70900QM = null;
        } else {
            GridChatView gridChatView = this.f65312C;
            if (gridChatView != null) {
                m70900QM = gridChatView.m70900QM();
            }
            m70900QM = null;
        }
        if (m70900QM == null) {
            m70900QM = new ArrayList();
        }
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        int mo70298i4 = interfaceC12507a.mo70298i4(m95029V3, m70900QM);
        ZaloView zaloView = this.f65311B;
        if (zaloView instanceof ChatView) {
            chatView = (ChatView) zaloView;
        } else {
            chatView = null;
        }
        if (chatView != null && (m60020gQ = chatView.m60020gQ()) != null && m60020gQ.mo60584Ja()) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("medialist", m70900QM);
        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 2);
        bundle.putInt("currentIndex", mo70298i4);
        bundle.putString("EXTRA_STR_CONVERSATION_ID", "204278670");
        bundle.putBoolean("EXTRA_BOL_ENABLE_REACTION", true);
        bundle.putBoolean("EXTRA_CAN_EDIT_PHOTO", c17945a0.m94871D7());
        bundle.putBoolean("extra_is_oldest_first_list", false);
        if (!m70164V0()) {
            bundle.putBoolean("extra_enable_build_original_msg", true);
        }
        if (!c17945a0.m95120e6()) {
            bundle.putInt("EXTRA_MEDIA_MODE", i11);
        }
        if (C21373a.f104231a.m110807w().m110825b()) {
            bundle.putInt("EXTRA_MY_CLOUD_VIEW_MODE", this.f65322M.ordinal());
        }
        bundle.putString("STR_LOG_CHAT_TYPE", "4");
        ViewParent parent = ((View) animationTarget).getParent();
        AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        C12484f c12484f = new C12484f();
        c12484f.m105861G(new C2370r0((ViewGroup) parent));
        c12484f.m105865K(mo70298i4);
        if (this.f65318I == enumC12481c2) {
            MyCloudMediaTabView myCloudMediaTabView2 = this.f65314E;
            if (myCloudMediaTabView2 != null) {
                m70901RM = myCloudMediaTabView2.m71016SM();
            }
            m70901RM = null;
        } else {
            GridChatView gridChatView2 = this.f65312C;
            if (gridChatView2 != null) {
                m70901RM = gridChatView2.m70901RM();
            }
            m70901RM = null;
        }
        if (m70901RM == null) {
            m70901RM = new SparseIntArray();
        }
        c12484f.m105857C(m70901RM);
        if (this.f65318I == enumC12481c2) {
            MyCloudMediaTabView myCloudMediaTabView3 = this.f65314E;
            if (myCloudMediaTabView3 != null) {
                sparseArray = myCloudMediaTabView3.m71017TM();
            }
        } else {
            GridChatView gridChatView3 = this.f65312C;
            if (gridChatView3 != null) {
                sparseArray = gridChatView3.m70902SM();
            }
        }
        if (sparseArray == null) {
            sparseArray = new SparseArray();
        }
        c12484f.m105859E(sparseArray);
        c12484f.m105887z(true);
        ZaloView zaloView2 = this.f65311B;
        if (zaloView2 != null && (m92676n2 = zaloView2.m92676n2()) != null) {
            m92676n2.mo35551H2(animationTarget, c17945a0.m94983Q3(), bundle, c12484f, 1018);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: C */
    public void mo70138C(ArrayList arrayList, String str, String str2) {
        C17487o0 m92693xK;
        AbstractC19074t.m100208f(arrayList, "listMsgId");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "jsDataLog");
        Bundle m78535kL = BottomPickerView.m78535kL();
        m78535kL.putParcelableArrayList("listMsgId", arrayList);
        m78535kL.putString("entryPoint", str);
        m78535kL.putString("jsDataLog", str2);
        ZaloView zaloView = this.f65311B;
        if (zaloView != null && (m92693xK = zaloView.m92693xK()) != null) {
            m92693xK.mo89694j2(PopupAddItemsToCollection.class, m78535kL, 0, null, 0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: D */
    public void mo70139D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            ZaloView zaloView = this.f65311B;
            if (zaloView != null) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                KeyEventCallbackC17462c m123176d = AbstractC23463h.m123176d(zaloView, context, bundle, new C12487i());
                if (m123176d != null) {
                    m123176d.mo13822K();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: E */
    public void mo70140E() {
        this.f65336u.f138009t.setVisibility(8);
        this.f65336u.f138008s.setVisibility(0);
    }

    /* renamed from: E0 */
    public final void m70141E0() {
        this.f65321L = false;
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70277A1();
        GridChatView gridChatView = this.f65312C;
        if (gridChatView != null) {
            gridChatView.m70358mM();
        }
        MyCloudTextTabView myCloudTextTabView = this.f65313D;
        if (myCloudTextTabView != null) {
            myCloudTextTabView.m70358mM();
        }
        MyCloudMediaTabView myCloudMediaTabView = this.f65314E;
        if (myCloudMediaTabView != null) {
            myCloudMediaTabView.m70358mM();
        }
        MyCloudFileTabView myCloudFileTabView = this.f65315F;
        if (myCloudFileTabView != null) {
            myCloudFileTabView.m70358mM();
        }
        MyCloudLinkTabView myCloudLinkTabView = this.f65316G;
        if (myCloudLinkTabView != null) {
            myCloudLinkTabView.m70358mM();
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: F */
    public void mo70142F(ArrayList arrayList, String str) {
        C17487o0 m92662fJ;
        AbstractC19074t.m100208f(arrayList, "listMsgId");
        AbstractC19074t.m100208f(str, "jsDataLog");
        if (arrayList.size() == 0) {
            return;
        }
        Bundle m78535kL = BottomPickerView.m78535kL();
        m78535kL.putParcelableArrayList("listMsgId", arrayList);
        m78535kL.putString("entryPoint", "mycloud_listing_menu");
        m78535kL.putString("jsDataLog", str);
        ZaloView zaloView = this.f65311B;
        if (zaloView != null && (m92662fJ = zaloView.m92662fJ()) != null) {
            m92662fJ.m93066i2(PopupAddItemsToCollection.class, m78535kL, 0, 0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: G */
    public void mo70143G() {
        getCarouselMyCloudCollectionView().setListener(new C12488j());
        getHeaderContainer().addView(getCarouselMyCloudCollectionView());
        getTabViewLayout().setBottomDividerVisibility(true);
    }

    /* renamed from: G1 */
    public void m70144G1(boolean z11, boolean z12) {
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70293e4(z11, z12);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: H */
    public void mo70145H(final C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.h0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70075H0(EmbeddedMyCloudPagesLayout.this, c17945a0);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: I */
    public boolean mo70146I(MessageId messageId) {
        ChatView chatView;
        InterfaceC27218a m92676n2;
        InterfaceC11320c m60020gQ;
        AbstractC19074t.m100208f(messageId, "messageId");
        ZaloView zaloView = this.f65311B;
        if (zaloView instanceof ChatView) {
            chatView = (ChatView) zaloView;
        } else {
            chatView = null;
        }
        if (chatView != null && (m60020gQ = chatView.m60020gQ()) != null) {
            InterfaceC11320c.a.m60848a(m60020gQ, messageId, 0L, false, C20343i.Companion.m106071a(), null, null, 54, null);
            return true;
        }
        Bundle m140776b = new C27870vb("204278670").m140781h(messageId).m140776b();
        ZaloView zaloView2 = this.f65311B;
        if (zaloView2 != null && (m92676n2 = zaloView2.m92676n2()) != null) {
            m92676n2.mo35573l4(ChatView.class, m140776b, 1, true);
            return false;
        }
        return false;
    }

    /* renamed from: I0 */
    public final void m70147I0(ZaloView zaloView) {
        ViewGroup viewGroup;
        C17487o0 m92649TI;
        this.f65311B = zaloView;
        if (zaloView != null && (m92649TI = zaloView.m92649TI()) != null) {
            ZaloView m92996E0 = m92649TI.m92996E0("GRID_CHAT_VIEW_TAG");
            if (m92996E0 != null) {
                m92649TI.mo92702G1(m92996E0, 0);
            }
            ZaloView m92996E02 = m92649TI.m92996E0("TEXT_MSG_TAB_VIEW_TAG");
            if (m92996E02 != null) {
                m92649TI.mo92702G1(m92996E02, 0);
            }
            ZaloView m92996E03 = m92649TI.m92996E0("MEDIA_TAB_VIEW_TAG");
            if (m92996E03 != null) {
                m92649TI.mo92702G1(m92996E03, 0);
            }
            ZaloView m92996E04 = m92649TI.m92996E0("FILE_VIEW_TAG");
            if (m92996E04 != null) {
                m92649TI.mo92702G1(m92996E04, 0);
            }
            ZaloView m92996E05 = m92649TI.m92996E0("LINK_TAB_VIEW_TAG");
            if (m92996E05 != null) {
                m92649TI.mo92702G1(m92996E05, 0);
            }
        }
        m70081O0();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f65335t.getRoot());
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: J */
    public void mo70148J(boolean z11) {
        m70068C1(EnumC23460e.f113955q, z11);
        mo70176e();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: K */
    public void mo70149K() {
        C17487o0 m92649TI;
        EnumC12481c enumC12481c = this.f65318I;
        EnumC12481c enumC12481c2 = EnumC12481c.f65346t;
        this.f65318I = enumC12481c2;
        boolean z11 = false;
        AbstractC23136l9.m118744r1(this.f65338w, 0);
        AbstractC19444a.m101694b(new Runnable() { // from class: u80.v0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70098h1(EmbeddedMyCloudPagesLayout.this);
            }
        }, 100L);
        MyCloudFileTabView myCloudFileTabView = this.f65315F;
        if (myCloudFileTabView == null && this.f65311B != null) {
            MyCloudFileTabView myCloudFileTabView2 = new MyCloudFileTabView();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_fake_header_height", getCollapsableHeaderHeight());
            bundle.putLong("extra_collection_id", this.f65323N);
            bundle.putSerializable("extra_view_mode", this.f65322M);
            bundle.putBoolean("extra_is_in_search_mode", this.f65321L);
            InterfaceC12507a interfaceC12507a = this.f65320K;
            InterfaceC12507a interfaceC12507a2 = null;
            if (interfaceC12507a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12507a = null;
            }
            bundle.putBoolean("extra_is_in_multi_selection_mode", interfaceC12507a.mo70297i0());
            myCloudFileTabView2.mo60305zK(bundle);
            InterfaceC12507a interfaceC12507a3 = this.f65320K;
            if (interfaceC12507a3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC12507a2 = interfaceC12507a3;
            }
            myCloudFileTabView2.m70334JM(interfaceC12507a2.mo70285X3());
            this.f65315F = myCloudFileTabView2;
            ZaloView zaloView = this.f65311B;
            if (zaloView != null && (m92649TI = zaloView.m92649TI()) != null) {
                m92649TI.m93058d2(this.f65338w.getId(), this.f65315F, 0, "FILE_VIEW_TAG", 0, false);
                return;
            }
            return;
        }
        if (myCloudFileTabView != null) {
            float collapsableHeaderTranslationY = getCollapsableHeaderTranslationY();
            if (enumC12481c == enumC12481c2) {
                z11 = true;
            }
            myCloudFileTabView.mo70328Hn(collapsableHeaderTranslationY, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: L */
    public void mo70150L(List list) {
        Context context;
        AbstractC19074t.m100208f(list, "entries");
        try {
            ZaloView zaloView = this.f65311B;
            Context context2 = null;
            if (zaloView != null) {
                context = zaloView.m92648SI();
            } else {
                context = null;
            }
            final SimpleAdapter simpleAdapter = new SimpleAdapter(context, list, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            ZaloView zaloView2 = this.f65311B;
            if (zaloView2 != null) {
                context2 = zaloView2.m92648SI();
            }
            C8009j.a aVar = new C8009j.a(context2);
            aVar.m43155d(true);
            aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: u80.f0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    EmbeddedMyCloudPagesLayout.m70110n1(EmbeddedMyCloudPagesLayout.this, simpleAdapter, interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f65324O = m43152a;
            if (m43152a != null && !m43152a.m92868m()) {
                m43152a.mo13822K();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: M */
    public void mo70151M() {
        ToastUtils.m89268p(getContext().getString(AbstractC8020f0.SOCKET_NOT_CONNECT_MSG));
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: N */
    public void mo70152N(final MyCloudMessageItem myCloudMessageItem) {
        AbstractC19074t.m100208f(myCloudMessageItem, "item");
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.j0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70116q1(EmbeddedMyCloudPagesLayout.this, myCloudMessageItem);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: O */
    public void mo70153O() {
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.e0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70091b1(EmbeddedMyCloudPagesLayout.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: P */
    public void mo70154P(String str) {
        Context m92648SI;
        AbstractC19074t.m100208f(str, "content");
        ZaloView zaloView = this.f65311B;
        if (zaloView != null && (m92648SI = zaloView.m92648SI()) != null) {
            ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119768g(m92648SI, str, new SensitiveData("clipboard_access_text_csc", "comm_csc", null, 4, null), true);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: Q */
    public void mo70155Q() {
        getHeaderContainer().addView(getCollectionInfoHeaderView());
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: R */
    public void mo70156R() {
        InterfaceC12480b interfaceC12480b = this.f65319J;
        if (interfaceC12480b != null) {
            interfaceC12480b.mo64292b();
        }
    }

    /* renamed from: R0 */
    public final boolean m70157R0() {
        GridChatView gridChatView;
        GridChatView gridChatView2 = this.f65312C;
        if (gridChatView2 != null && gridChatView2.m92687sJ() && (gridChatView = this.f65312C) != null && gridChatView.m70324EM()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: S */
    public boolean mo70158S(View view) {
        AbstractC19074t.m100208f(view, "gridItemView");
        GridChatView gridChatView = this.f65312C;
        if (gridChatView == null || !gridChatView.m92687sJ()) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        view.getLocationOnScreen(iArr);
        this.f65340y.getLocationOnScreen(iArr2);
        int i11 = iArr[1] + rect.top;
        int i12 = iArr2[1];
        int height = this.f65340y.getHeight() + i12;
        if (i11 < i12 + getTopItemTotalHeight() || i11 + rect.height() > height) {
            return false;
        }
        return true;
    }

    /* renamed from: S0 */
    public final boolean m70159S0() {
        if (this.f65318I == EnumC12481c.f65342p) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: T */
    public void mo70160T() {
        this.f65336u.f138009t.setVisibility(8);
        this.f65336u.f138008s.setVisibility(8);
    }

    /* renamed from: T0 */
    public final boolean m70161T0() {
        EnumC12481c enumC12481c = this.f65318I;
        if (enumC12481c != EnumC12481c.f65345s && enumC12481c != EnumC12481c.f65346t && enumC12481c != EnumC12481c.f65347u) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: U */
    public void mo70162U(String str, double d11, double d12) {
        Context context;
        AbstractC19074t.m100208f(str, "address");
        ZaloView zaloView = this.f65311B;
        if (zaloView != null) {
            context = zaloView.m92648SI();
        } else {
            context = null;
        }
        AbstractC23152n3.m119042f0(context, str, d11, d12);
    }

    /* renamed from: U0 */
    public final boolean m70163U0() {
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        return interfaceC12507a.mo70297i0();
    }

    /* renamed from: V0 */
    public final boolean m70164V0() {
        EnumC12481c enumC12481c = this.f65318I;
        if (enumC12481c != EnumC12481c.f65343q && enumC12481c != EnumC12481c.f65342p) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: W */
    public void mo70165W(C20556f c20556f) {
        Context context;
        AbstractC19074t.m100208f(c20556f, "file");
        try {
            ZaloView zaloView = this.f65311B;
            if (zaloView != null) {
                context = zaloView.m92648SI();
            } else {
                context = null;
            }
            AbstractC23152n3.m119036c0(context, c20556f);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: W0 */
    public final boolean m70166W0() {
        if (getCarouselMyCloudCollectionView().getAllowSlideBack() && getTabViewLayout().getAllowSlideBack()) {
            return false;
        }
        return true;
    }

    /* renamed from: X0 */
    public final void m70167X0(int i11, int i12) {
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70292d4(i11, i12);
    }

    /* renamed from: Y0 */
    public final boolean m70168Y0() {
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        return interfaceC12507a.mo70278Q();
    }

    /* renamed from: Z0 */
    public final void m70169Z0(boolean z11) {
        getCarouselMyCloudCollectionView().m69996g(z11);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: a */
    public void mo70170a(String str) {
        AbstractC19074t.m100208f(str, "newTitle");
        this.f65335t.f137745s.setText(str);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: b */
    public void mo70171b(boolean z11, boolean z12) {
        C17487o0 m92649TI;
        EnumC12481c enumC12481c = this.f65318I;
        EnumC12481c enumC12481c2 = EnumC12481c.f65343q;
        this.f65318I = enumC12481c2;
        boolean z13 = false;
        AbstractC23136l9.m118744r1(this.f65340y, 0);
        AbstractC19444a.m101694b(new Runnable() { // from class: u80.t0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70100i1(EmbeddedMyCloudPagesLayout.this);
            }
        }, 100L);
        GridChatView gridChatView = this.f65312C;
        if (gridChatView == null && this.f65311B != null) {
            GridChatView gridChatView2 = new GridChatView();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_fake_header_height", getCollapsableHeaderHeight());
            bundle.putLong("extra_collection_id", this.f65323N);
            bundle.putSerializable("extra_view_mode", this.f65322M);
            bundle.putBoolean("extra_is_in_search_mode", this.f65321L);
            InterfaceC12507a interfaceC12507a = this.f65320K;
            InterfaceC12507a interfaceC12507a2 = null;
            if (interfaceC12507a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12507a = null;
            }
            bundle.putBoolean("extra_is_in_multi_selection_mode", interfaceC12507a.mo70297i0());
            gridChatView2.mo60305zK(bundle);
            InterfaceC12507a interfaceC12507a3 = this.f65320K;
            if (interfaceC12507a3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC12507a2 = interfaceC12507a3;
            }
            gridChatView2.m70334JM(interfaceC12507a2.mo70285X3());
            this.f65312C = gridChatView2;
            ZaloView zaloView = this.f65311B;
            if (zaloView != null && (m92649TI = zaloView.m92649TI()) != null) {
                m92649TI.m93058d2(this.f65340y.getId(), this.f65312C, 0, "GRID_CHAT_VIEW_TAG", 0, false);
                return;
            }
            return;
        }
        if (z11 && gridChatView != null) {
            float collapsableHeaderTranslationY = getCollapsableHeaderTranslationY();
            if (z12 || enumC12481c == enumC12481c2) {
                z13 = true;
            }
            gridChatView.mo70328Hn(collapsableHeaderTranslationY, z13);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: c */
    public void mo70172c() {
        this.f65336u.f138009t.setVisibility(0);
        this.f65336u.f138008s.setVisibility(8);
    }

    /* renamed from: c1 */
    public final void m70173c1() {
        m70068C1(EnumC23460e.f113955q, true);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: d */
    public void mo70174d() {
        if (this.f65312C != null) {
            m70065B0();
        }
        if (this.f65313D != null) {
            m70072F0();
        }
        if (this.f65314E != null) {
            m70069D0();
        }
        if (this.f65315F != null) {
            m70133z0();
        }
        if (this.f65316G != null) {
            m70067C0();
        }
        this.f65318I = EnumC12481c.f65342p;
    }

    /* renamed from: d1 */
    public final void m70175d1() {
        m70114p1();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: e */
    public void mo70176e() {
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.c0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70074G0(EmbeddedMyCloudPagesLayout.this);
            }
        });
    }

    /* renamed from: e1 */
    public final void m70177e1() {
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70296h4();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: f */
    public void mo70178f(String str, ChatOpenParam chatOpenParam) {
        InterfaceC27218a interfaceC27218a;
        AbstractC19074t.m100208f(str, "targetThreadId");
        AbstractC19074t.m100208f(chatOpenParam, "chatOpenParam");
        ZaloView zaloView = this.f65311B;
        if (zaloView != null) {
            interfaceC27218a = zaloView.m92676n2();
        } else {
            interfaceC27218a = null;
        }
        AbstractC23211s7.m119571d(str, interfaceC27218a, chatOpenParam);
    }

    /* renamed from: f1 */
    public final void m70179f1(String str, List list) {
        AbstractC19074t.m100208f(str, "keySearch");
        AbstractC19074t.m100208f(list, "searchResults");
        this.f65321L = true;
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70279R3(str, list);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: g */
    public void mo70180g(MyCloudMessageItem myCloudMessageItem, AnimationTarget animationTarget, String str) {
        InterfaceC27218a m92676n2;
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(myCloudMessageItem, "itemMessage");
        AbstractC19074t.m100208f(animationTarget, "animationView");
        AbstractC19074t.m100208f(str, "entryPoint");
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_DATA", myCloudMessageItem);
        bundle.putLong("EXTRA_COLLECTION_ID", this.f65323N);
        bundle.putParcelable("EXTRA_ORIGINAL_VIEW_RECT", animationTarget.getAnimTargetLocationOnScreen());
        bundle.putString("EXTRA_ENTRYPOINT", str);
        ZaloView zaloView = this.f65311B;
        if (zaloView != null && (m92676n2 = zaloView.m92676n2()) != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93066i2(DetailTextMessageView.class, bundle, 0, 2, true);
        }
    }

    /* renamed from: g1 */
    public final void m70181g1() {
        GridChatView gridChatView = this.f65312C;
        if (gridChatView != null) {
            gridChatView.m70903TM();
        }
    }

    public final CarouselMyCloudCollectionView getCarouselMyCloudCollectionView() {
        return (CarouselMyCloudCollectionView) this.f65332q.getValue();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    public int getCollapsableHeaderHeight() {
        return getHeaderContainer().getMeasuredHeight() - getTabViewLayout().getMeasuredHeight();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    public float getCollapsableHeaderTranslationY() {
        C23805a.e eVar = this.f65322M;
        if (eVar == C23805a.e.f115063p) {
            return getCarouselMyCloudCollectionView().getTranslationY();
        }
        if (eVar == C23805a.e.f115064q) {
            return getCollectionInfoHeaderView().getTranslationY();
        }
        return 0.0f;
    }

    public final int getContentUITopOffset() {
        return this.f65326Q;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    public C11598e.e getCurrMyCloudChatMode() {
        ChatView chatView;
        InterfaceC11320c m60020gQ;
        ZaloView zaloView = this.f65311B;
        if (zaloView instanceof ChatView) {
            chatView = (ChatView) zaloView;
        } else {
            chatView = null;
        }
        if (chatView == null || (m60020gQ = chatView.m60020gQ()) == null) {
            return null;
        }
        return m60020gQ.getCurrMyCloudChatMode();
    }

    public View getFirstCompletelyVisibleOutCloudBubble() {
        GridChatView gridChatView;
        if (this.f65318I != EnumC12481c.f65343q || this.f65322M != C23805a.e.f115063p || (gridChatView = this.f65312C) == null) {
            return null;
        }
        return gridChatView.m70364qM();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    public int getMultiSelectBottomViewHeight() {
        MyCloudMultiSelectBottomView myCloudMultiSelectBottomView = this.f65317H;
        if (myCloudMultiSelectBottomView != null) {
            return myCloudMultiSelectBottomView.getContainerHeight();
        }
        return 0;
    }

    public final int getMultiSelectUITopOffset() {
        return this.f65327R;
    }

    public boolean getPreventTouch() {
        return this.f65330U;
    }

    public final int getTabViewHeight() {
        if (getTabViewLayout().getHeight() == 0) {
            return getContext().getResources().getDimensionPixelSize(AbstractC16802y.sub_tab_height);
        }
        return getTabViewLayout().getHeight();
    }

    public final int getTopItemTotalHeight() {
        int i11;
        int i12;
        int i13 = 0;
        if (getCarouselMyCloudCollectionView().getVisibility() == 0) {
            i11 = getCarouselMyCloudCollectionView().getHeight();
        } else {
            i11 = 0;
        }
        GridChatView gridChatView = this.f65312C;
        if (gridChatView != null && gridChatView.m92687sJ()) {
            i12 = gridChatView.m70363pM();
        } else {
            i12 = 0;
        }
        int i14 = i11 + i12;
        LinearLayout root = this.f65336u.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        if (root.getVisibility() == 0) {
            i13 = this.f65336u.getRoot().getHeight();
        }
        return i14 + i13;
    }

    public final Snackbar getUndoDeletingMessagesSnackbar() {
        return this.f65329T;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: h */
    public boolean mo70182h(C17945a0 c17945a0) {
        ChatView chatView;
        InterfaceC11320c m60020gQ;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        ZaloView zaloView = this.f65311B;
        if (zaloView instanceof ChatView) {
            chatView = (ChatView) zaloView;
        } else {
            chatView = null;
        }
        if (chatView != null && (m60020gQ = chatView.m60020gQ()) != null) {
            m60020gQ.mo60572Hc(c17945a0, "csc_msg_button");
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: i */
    public void mo70183i(String str, List list) {
        AbstractC19074t.m100208f(str, "keySearch");
        AbstractC19074t.m100208f(list, "searchResults");
        GridChatView gridChatView = this.f65312C;
        if (gridChatView != null) {
            gridChatView.m70327HM(str, list);
        }
        MyCloudTextTabView myCloudTextTabView = this.f65313D;
        if (myCloudTextTabView != null) {
            myCloudTextTabView.m70327HM(str, list);
        }
        MyCloudMediaTabView myCloudMediaTabView = this.f65314E;
        if (myCloudMediaTabView != null) {
            myCloudMediaTabView.m70327HM(str, list);
        }
        MyCloudFileTabView myCloudFileTabView = this.f65315F;
        if (myCloudFileTabView != null) {
            myCloudFileTabView.m70327HM(str, list);
        }
        MyCloudLinkTabView myCloudLinkTabView = this.f65316G;
        if (myCloudLinkTabView != null) {
            myCloudLinkTabView.m70327HM(str, list);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: j */
    public void mo70184j(C17945a0 c17945a0) {
        List m131496e;
        InterfaceC27218a m92676n2;
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        m70114p1();
        RolledMediaBottomSheet.C14964a c14964a = RolledMediaBottomSheet.Companion;
        m131496e = AbstractC25366r.m131496e(c17945a0);
        Bundle m83782b = c14964a.m83782b(m131496e);
        m83782b.putString("CONVERSATION_ID", c17945a0.mo95039W2());
        ZaloView zaloView = this.f65311B;
        if (zaloView != null && (m92676n2 = zaloView.m92676n2()) != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.mo89694j2(RolledMediaBottomSheet.class, m83782b, 0, "RolledMediaBottomSheet", 0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: k */
    public void mo70185k(String str, Bundle bundle) {
        InterfaceC27218a m92676n2;
        ZaloView zaloView = this.f65311B;
        if (zaloView != null && (m92676n2 = zaloView.m92676n2()) != null && bundle != null) {
            ZaloWebView.Companion.m87171F(m92676n2, str, bundle);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: l */
    public void mo70186l(boolean z11, String str, boolean z12) {
        ActionBar actionBar;
        ChatView chatView;
        ActionBar actionBar2;
        ChatView chatView2;
        ChatView chatView3;
        ActionBar actionBar3;
        AbstractC19074t.m100208f(str, "newTitle");
        m70064A1(z11);
        this.f65335t.f137746t.setText(str);
        ChatView chatView4 = null;
        View view = null;
        if (z11) {
            AbstractC23136l9.m118744r1(this.f65335t.getRoot(), 0);
            ZaloView zaloView = this.f65311B;
            if (zaloView != null) {
                actionBar2 = zaloView.f88760a0;
            } else {
                actionBar2 = null;
            }
            if (actionBar2 != null) {
                actionBar2.setVisibility(4);
            }
            ZaloView zaloView2 = this.f65311B;
            if (zaloView2 != null && (actionBar3 = zaloView2.f88760a0) != null) {
                actionBar3.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
            }
            ZaloView zaloView3 = this.f65311B;
            if (zaloView3 instanceof ChatView) {
                chatView2 = (ChatView) zaloView3;
            } else {
                chatView2 = null;
            }
            if (chatView2 != null) {
                chatView2.mo59916Ym();
            }
            ZaloView zaloView4 = this.f65311B;
            if (zaloView4 instanceof ChatView) {
                chatView3 = (ChatView) zaloView4;
            } else {
                chatView3 = null;
            }
            if (chatView3 != null) {
                chatView3.mo59573BB(false);
            }
            GridChatView gridChatView = this.f65312C;
            if (gridChatView != null) {
                gridChatView.mo70359nC(false, false);
            }
            MyCloudTextTabView myCloudTextTabView = this.f65313D;
            if (myCloudTextTabView != null) {
                myCloudTextTabView.mo70359nC(false, false);
            }
            MyCloudMediaTabView myCloudMediaTabView = this.f65314E;
            if (myCloudMediaTabView != null) {
                myCloudMediaTabView.mo70359nC(false, false);
            }
            MyCloudFileTabView myCloudFileTabView = this.f65315F;
            if (myCloudFileTabView != null) {
                myCloudFileTabView.mo70359nC(false, false);
            }
            MyCloudLinkTabView myCloudLinkTabView = this.f65316G;
            if (myCloudLinkTabView != null) {
                myCloudLinkTabView.mo70359nC(false, false);
            }
            ZaloView zaloView5 = this.f65311B;
            if (zaloView5 != null) {
                view = zaloView5.m92656bJ();
            }
            AbstractC2379w.m12430d(view);
        } else {
            ZaloView zaloView6 = this.f65311B;
            if (zaloView6 != null) {
                actionBar = zaloView6.f88760a0;
            } else {
                actionBar = null;
            }
            if (actionBar != null) {
                actionBar.setVisibility(0);
            }
            AbstractC23136l9.m118744r1(this.f65335t.getRoot(), 8);
            ZaloView zaloView7 = this.f65311B;
            if (zaloView7 instanceof ChatView) {
                chatView = (ChatView) zaloView7;
            } else {
                chatView = null;
            }
            if (chatView != null) {
                chatView.mo59646G9();
            }
            ZaloView zaloView8 = this.f65311B;
            if (zaloView8 instanceof ChatView) {
                chatView4 = (ChatView) zaloView8;
            }
            if (chatView4 != null) {
                chatView4.mo59580Bi();
            }
        }
        getCarouselMyCloudCollectionView().m70000w(!z11);
        if (z12) {
            setEnableTab(!z11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: m */
    public void mo70187m(final List list) {
        AbstractC19074t.m100208f(list, "chatContents");
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.k0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70122t1(EmbeddedMyCloudPagesLayout.this, list);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: n */
    public void mo70188n(final List list) {
        AbstractC19074t.m100208f(list, "chatContents");
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.g0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70130x1(EmbeddedMyCloudPagesLayout.this, list);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        getHeaderContainer().addOnLayoutChangeListener(this.f65328S);
        super.onAttachedToWindow();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 5207);
        bVar.m124119a().m124115b(this, 5210);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        getHeaderContainer().removeOnLayoutChangeListener(this.f65328S);
        super.onDetachedFromWindow();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 5207);
        bVar.m124119a().m124117e(this, 5210);
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getPreventTouch()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getPreventTouch()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: p */
    public void mo70189p(String str, ChatOpenParam chatOpenParam) {
        InterfaceC27218a interfaceC27218a;
        AbstractC19074t.m100208f(str, "targetThreadId");
        AbstractC19074t.m100208f(chatOpenParam, "chatOpenParam");
        ZaloView zaloView = this.f65311B;
        if (zaloView != null) {
            interfaceC27218a = zaloView.m92676n2();
        } else {
            interfaceC27218a = null;
        }
        AbstractC23211s7.m119574g(str, interfaceC27218a, chatOpenParam);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: q */
    public void mo70190q() {
        C17487o0 m92649TI;
        EnumC12481c enumC12481c = this.f65318I;
        EnumC12481c enumC12481c2 = EnumC12481c.f65347u;
        this.f65318I = enumC12481c2;
        boolean z11 = false;
        AbstractC23136l9.m118744r1(this.f65339x, 0);
        AbstractC19444a.m101694b(new Runnable() { // from class: u80.x0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70102j1(EmbeddedMyCloudPagesLayout.this);
            }
        }, 100L);
        MyCloudLinkTabView myCloudLinkTabView = this.f65316G;
        if (myCloudLinkTabView == null && this.f65311B != null) {
            MyCloudLinkTabView myCloudLinkTabView2 = new MyCloudLinkTabView();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_fake_header_height", getCollapsableHeaderHeight());
            bundle.putLong("extra_collection_id", this.f65323N);
            bundle.putSerializable("extra_view_mode", this.f65322M);
            bundle.putBoolean("extra_is_in_search_mode", this.f65321L);
            InterfaceC12507a interfaceC12507a = this.f65320K;
            InterfaceC12507a interfaceC12507a2 = null;
            if (interfaceC12507a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12507a = null;
            }
            bundle.putBoolean("extra_is_in_multi_selection_mode", interfaceC12507a.mo70297i0());
            myCloudLinkTabView2.mo60305zK(bundle);
            InterfaceC12507a interfaceC12507a3 = this.f65320K;
            if (interfaceC12507a3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC12507a2 = interfaceC12507a3;
            }
            myCloudLinkTabView2.m70334JM(interfaceC12507a2.mo70285X3());
            this.f65316G = myCloudLinkTabView2;
            ZaloView zaloView = this.f65311B;
            if (zaloView != null && (m92649TI = zaloView.m92649TI()) != null) {
                m92649TI.m93058d2(this.f65339x.getId(), this.f65316G, 0, "LINK_TAB_VIEW_TAG", 0, false);
                return;
            }
            return;
        }
        if (myCloudLinkTabView != null) {
            float collapsableHeaderTranslationY = getCollapsableHeaderTranslationY();
            if (enumC12481c == enumC12481c2) {
                z11 = true;
            }
            myCloudLinkTabView.mo70328Hn(collapsableHeaderTranslationY, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: r */
    public void mo70191r(boolean z11) {
        int i11;
        LinearLayout root = this.f65336u.getRoot();
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        root.setVisibility(i11);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: s */
    public void mo70192s(List list) {
        AbstractC19074t.m100208f(list, "selectedList");
        MyCloudMultiSelectBottomView myCloudMultiSelectBottomView = this.f65317H;
        if (myCloudMultiSelectBottomView != null) {
            myCloudMultiSelectBottomView.m70219v(list);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: s4 */
    public void mo70193s4(int i11) {
        ZaloView zaloView = this.f65311B;
        if (zaloView != null) {
            AbstractC23034c6.m118184v0(zaloView, AbstractC23034c6.f112029f, i11);
        }
    }

    public final void setContentUITopOffset(int i11) {
        if (this.f65326Q == i11) {
            return;
        }
        this.f65326Q = i11;
        m70071E1();
    }

    public final void setEnableTab(boolean z11) {
        getTabViewLayout().setEnableTabLayout(z11);
    }

    public final void setEventListener(InterfaceC12480b interfaceC12480b) {
        AbstractC19074t.m100208f(interfaceC12480b, "listener");
        this.f65319J = interfaceC12480b;
    }

    @Override // android.view.View, com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    public void setKeepScreenOn(boolean z11) {
        InterfaceC27218a interfaceC27218a;
        ZaloView zaloView = this.f65311B;
        if (zaloView != null) {
            interfaceC27218a = zaloView.m92676n2();
        } else {
            interfaceC27218a = null;
        }
        AbstractC23059e9.m118319H(interfaceC27218a, z11);
    }

    public final void setMultiSelectUITopOffset(int i11) {
        this.f65327R = i11;
        m70071E1();
    }

    public void setPreventTouch(boolean z11) {
        this.f65330U = z11;
    }

    public final void setUndoDeletingMessagesSnackbar(Snackbar snackbar) {
        this.f65329T = snackbar;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: u */
    public void mo70194u(final ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listSelectedItems");
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.i0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70112o1(arrayList, this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: v */
    public void mo70195v() {
        View view;
        ZaloView zaloView = this.f65311B;
        if (zaloView != null) {
            view = zaloView.m92656bJ();
        } else {
            view = null;
        }
        AbstractC2379w.m12430d(view);
        InterfaceC12480b interfaceC12480b = this.f65319J;
        if (interfaceC12480b != null) {
            interfaceC12480b.mo64291a();
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: w */
    public void mo70196w() {
        C17487o0 m92649TI;
        EnumC12481c enumC12481c = this.f65318I;
        EnumC12481c enumC12481c2 = EnumC12481c.f65344r;
        this.f65318I = enumC12481c2;
        boolean z11 = false;
        AbstractC23136l9.m118744r1(this.f65341z, 0);
        AbstractC19444a.m101694b(new Runnable() { // from class: u80.d0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70106l1(EmbeddedMyCloudPagesLayout.this);
            }
        }, 100L);
        MyCloudTextTabView myCloudTextTabView = this.f65313D;
        if (myCloudTextTabView == null && this.f65311B != null) {
            MyCloudTextTabView myCloudTextTabView2 = new MyCloudTextTabView();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_fake_header_height", getCollapsableHeaderHeight());
            bundle.putLong("extra_collection_id", this.f65323N);
            bundle.putSerializable("extra_view_mode", this.f65322M);
            bundle.putBoolean("extra_is_in_search_mode", this.f65321L);
            InterfaceC12507a interfaceC12507a = this.f65320K;
            InterfaceC12507a interfaceC12507a2 = null;
            if (interfaceC12507a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12507a = null;
            }
            bundle.putBoolean("extra_is_in_multi_selection_mode", interfaceC12507a.mo70297i0());
            myCloudTextTabView2.mo60305zK(bundle);
            InterfaceC12507a interfaceC12507a3 = this.f65320K;
            if (interfaceC12507a3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC12507a2 = interfaceC12507a3;
            }
            myCloudTextTabView2.m70334JM(interfaceC12507a2.mo70285X3());
            this.f65313D = myCloudTextTabView2;
            ZaloView zaloView = this.f65311B;
            if (zaloView != null && (m92649TI = zaloView.m92649TI()) != null) {
                m92649TI.m93058d2(this.f65341z.getId(), this.f65313D, 0, "TEXT_MSG_TAB_VIEW_TAG", 0, false);
                return;
            }
            return;
        }
        if (myCloudTextTabView != null) {
            float collapsableHeaderTranslationY = getCollapsableHeaderTranslationY();
            if (enumC12481c == enumC12481c2) {
                z11 = true;
            }
            myCloudTextTabView.mo70328Hn(collapsableHeaderTranslationY, z11);
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        InterfaceC12507a interfaceC12507a = this.f65320K;
        if (interfaceC12507a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12507a = null;
        }
        interfaceC12507a.mo70300x(i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: y */
    public void mo70197y() {
        C17487o0 m92649TI;
        EnumC12481c enumC12481c = this.f65318I;
        EnumC12481c enumC12481c2 = EnumC12481c.f65345s;
        this.f65318I = enumC12481c2;
        boolean z11 = false;
        AbstractC23136l9.m118744r1(this.f65337v, 0);
        AbstractC19444a.m101694b(new Runnable() { // from class: u80.w0
            @Override // java.lang.Runnable
            public final void run() {
                EmbeddedMyCloudPagesLayout.m70104k1(EmbeddedMyCloudPagesLayout.this);
            }
        }, 100L);
        MyCloudMediaTabView myCloudMediaTabView = this.f65314E;
        if (myCloudMediaTabView == null && this.f65311B != null) {
            MyCloudMediaTabView myCloudMediaTabView2 = new MyCloudMediaTabView();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_fake_header_height", getCollapsableHeaderHeight());
            bundle.putLong("extra_collection_id", this.f65323N);
            bundle.putSerializable("extra_view_mode", this.f65322M);
            bundle.putBoolean("extra_is_in_search_mode", this.f65321L);
            InterfaceC12507a interfaceC12507a = this.f65320K;
            InterfaceC12507a interfaceC12507a2 = null;
            if (interfaceC12507a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12507a = null;
            }
            bundle.putBoolean("extra_is_in_multi_selection_mode", interfaceC12507a.mo70297i0());
            myCloudMediaTabView2.mo60305zK(bundle);
            InterfaceC12507a interfaceC12507a3 = this.f65320K;
            if (interfaceC12507a3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC12507a2 = interfaceC12507a3;
            }
            myCloudMediaTabView2.m70334JM(interfaceC12507a2.mo70285X3());
            this.f65314E = myCloudMediaTabView2;
            ZaloView zaloView = this.f65311B;
            if (zaloView != null && (m92649TI = zaloView.m92649TI()) != null) {
                m92649TI.m93058d2(this.f65337v.getId(), this.f65314E, 0, "MEDIA_TAB_VIEW_TAG", 0, false);
                return;
            }
            return;
        }
        if (myCloudMediaTabView != null) {
            float collapsableHeaderTranslationY = getCollapsableHeaderTranslationY();
            if (enumC12481c == enumC12481c2) {
                z11 = true;
            }
            myCloudMediaTabView.mo70328Hn(collapsableHeaderTranslationY, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12508b
    /* renamed from: z */
    public void mo70198z(boolean z11, final List list) {
        String m118743r0;
        if (z11) {
            if (list == null) {
                return;
            }
            int size = list.size();
            Snackbar.C16925c c16925c = Snackbar.Companion;
            if (size > 1) {
                m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_snackbar_title_undo_deleting_multiple_items, Integer.valueOf(size));
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_snackbar_title_undo_deleting_single_item);
            }
            AbstractC19074t.m100205c(m118743r0);
            C31950hc c31950hc = C31950hc.f146830a;
            Snackbar m90669d = c16925c.m90669d(this, m118743r0, c31950hc.m153645x());
            this.f65329T = m90669d;
            if (m90669d != null) {
                m90669d.m90664z(AbstractC8020f0.str_undo, new View.OnClickListener() { // from class: u80.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EmbeddedMyCloudPagesLayout.m70066B1(list, this, view);
                    }
                });
            }
            Snackbar snackbar = this.f65329T;
            if (snackbar != null) {
                snackbar.m90641G(true);
            }
            Snackbar snackbar2 = this.f65329T;
            if (snackbar2 != null) {
                snackbar2.m90648N();
            }
            c31950hc.m153638L("csc_msgmenu", 1, "msg_chat_delete_undo_toast", list, null);
            return;
        }
        Snackbar snackbar3 = this.f65329T;
        if (snackbar3 != null && snackbar3 != null) {
            snackbar3.m90655n();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedMyCloudPagesLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedMyCloudPagesLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C12485g());
        this.f65331p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12482d());
        this.f65332q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C12483e());
        this.f65333r = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C12490l());
        this.f65334s = m129210a4;
        C29798f6 m147941c = C29798f6.m147941c(LayoutInflater.from(getContext()), this, false);
        AbstractC19074t.m100207e(m147941c, "inflate(...)");
        this.f65335t = m147941c;
        C29834h6 m148030c = C29834h6.m148030c(LayoutInflater.from(getContext()), this, false);
        AbstractC19074t.m100207e(m148030c, "inflate(...)");
        this.f65336u = m148030c;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(AbstractC6918a0.media_tab_container);
        this.f65337v = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(AbstractC6918a0.file_tab_container);
        this.f65338w = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(getContext());
        frameLayout3.setId(AbstractC6918a0.link_tab_container);
        this.f65339x = frameLayout3;
        FrameLayout frameLayout4 = new FrameLayout(getContext());
        frameLayout4.setId(AbstractC6918a0.grid_chat_view_container);
        this.f65340y = frameLayout4;
        FrameLayout frameLayout5 = new FrameLayout(getContext());
        frameLayout5.setId(AbstractC6918a0.text_msg_tab_container);
        this.f65341z = frameLayout5;
        FrameLayout frameLayout6 = new FrameLayout(getContext());
        frameLayout6.setId(AbstractC6918a0.context_menu_container);
        this.f65310A = frameLayout6;
        this.f65318I = EnumC12481c.f65342p;
        this.f65322M = C23805a.e.f115063p;
        this.f65328S = new View.OnLayoutChangeListener() { // from class: u80.n0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                EmbeddedMyCloudPagesLayout.m70089a1(EmbeddedMyCloudPagesLayout.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedMyCloudPagesLayout(Context context, C23805a.e eVar, long j11) {
        this(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(eVar, "viewMode");
        this.f65322M = eVar;
        this.f65323N = j11;
        this.f65320K = new C12522c(this, eVar, j11);
        m70082P0();
    }
}
