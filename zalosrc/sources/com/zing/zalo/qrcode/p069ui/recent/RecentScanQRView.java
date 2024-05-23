package com.zing.zalo.qrcode.p069ui.recent;

import ac.C0708i;
import android.R;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import androidx.core.view.C1580n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.zviews.ModalBottomSheet;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.qrcode.p069ui.recent.RecentScanQRView;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.utils.systemui.C16766d;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.utils.systemui.SystemUIUtils;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17452c;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23169o9;
import me0.C23212s8;
import me0.C23283z7;
import mj0.AbstractC23322a;
import p363nh.C23744a;
import p374ny.AbstractC23957a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import py.C24931e;
import py.C24942n;
import py.InterfaceC24933f;
import py.InterfaceC24935g;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class RecentScanQRView extends SlidableZaloView implements InterfaceC24935g, InterfaceC18319c {

    /* renamed from: Q0 */
    private RecyclerView f48863Q0;

    /* renamed from: R0 */
    private FrameLayout f48864R0;

    /* renamed from: S0 */
    private View f48865S0;

    /* renamed from: T0 */
    private View f48866T0;

    /* renamed from: V0 */
    private int[] f48868V0;

    /* renamed from: W0 */
    private SystemUIUtils.C16759a f48869W0;

    /* renamed from: Y0 */
    private InterfaceC18494a f48871Y0;

    /* renamed from: Z0 */
    private TransitionDrawable f48872Z0;

    /* renamed from: a1 */
    private TransitionDrawable f48873a1;

    /* renamed from: b1 */
    private boolean f48874b1;

    /* renamed from: c1 */
    private boolean f48875c1;

    /* renamed from: d1 */
    private Snackbar f48876d1;

    /* renamed from: e1 */
    private C16972e0 f48877e1;

    /* renamed from: P0 */
    private InterfaceC24933f f48862P0 = new C24942n(this);

    /* renamed from: U0 */
    private final C24931e f48867U0 = new C24931e();

    /* renamed from: X0 */
    private InterfaceC18494a f48870X0 = C9208a.f48878q;

    /* renamed from: com.zing.zalo.qrcode.ui.recent.RecentScanQRView$a */
    /* loaded from: classes4.dex */
    static final class C9208a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9208a f48878q = new C9208a();

        C9208a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49161a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49161a() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.recent.RecentScanQRView$b */
    /* loaded from: classes4.dex */
    static final class C9209b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9209b f48879q = new C9209b();

        C9209b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49162a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49162a() {
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.recent.RecentScanQRView$c */
    /* loaded from: classes4.dex */
    static final class C9210c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ BaseZaloActivity f48880q;

        /* renamed from: r */
        final /* synthetic */ RecentScanQRView f48881r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9210c(BaseZaloActivity baseZaloActivity, RecentScanQRView recentScanQRView) {
            super(0);
            this.f48880q = baseZaloActivity;
            this.f48881r = recentScanQRView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49163a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49163a() {
            this.f48880q.m56680B3(null);
            this.f48881r.f48862P0.mo129624Z2();
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.recent.RecentScanQRView$d */
    /* loaded from: classes4.dex */
    static final class C9211d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ AbstractC23957a.b f48882q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9211d(AbstractC23957a.b bVar) {
            super(0);
            this.f48882q = bVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49164a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49164a() {
            C23744a.Companion.m124119a().m124116d(6066, this.f48882q.m125364b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.recent.RecentScanQRView$e */
    /* loaded from: classes4.dex */
    public static final class C9212e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48883q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9212e(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48883q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49165a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49165a() {
            this.f48883q.mo12V4();
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.recent.RecentScanQRView$f */
    /* loaded from: classes4.dex */
    public static final class C9213f extends ZdsActionBar.AbstractC16987c {
        C9213f() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            RecentScanQRView.this.f48862P0.mo129626cm();
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            RecentScanQRView.this.f48862P0.mo129626cm();
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.recent.RecentScanQRView$g */
    /* loaded from: classes4.dex */
    public static final class ViewOnLayoutChangeListenerC9214g implements View.OnLayoutChangeListener {

        /* renamed from: q */
        final /* synthetic */ FrameLayout f48886q;

        public ViewOnLayoutChangeListenerC9214g(FrameLayout frameLayout) {
            this.f48886q = frameLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            AbstractC19074t.m100208f(view, "view");
            view.removeOnLayoutChangeListener(this);
            RecyclerView recyclerView = RecentScanQRView.this.f48863Q0;
            if (recyclerView != null) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), this.f48886q.getHeight());
            }
            this.f48886q.setTranslationY(r1.getHeight());
            this.f48886q.animate().translationY(0.0f).setDuration(175L).setInterpolator(new DecelerateInterpolator(1.78f)).withLayer();
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.recent.RecentScanQRView$h */
    /* loaded from: classes4.dex */
    public static final class C9215h extends Snackbar.AbstractC16924b {
        C9215h() {
        }

        @Override // com.zing.zalo.zdesign.component.Snackbar.AbstractC16924b
        /* renamed from: a */
        public void mo49166a(Snackbar snackbar, int i11) {
            RecentScanQRView.this.f48876d1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m49099BM(RecentScanQRView recentScanQRView) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        if (recentScanQRView.m49101GM()) {
            recentScanQRView.m49123cN();
            recentScanQRView.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m49100DM(RecentScanQRView recentScanQRView) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        Snackbar snackbar = recentScanQRView.f48876d1;
        if (snackbar != null) {
            snackbar.m90655n();
        }
    }

    /* renamed from: GM */
    private final boolean m49101GM() {
        return !mo60294yp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m49102HM(RecentScanQRView recentScanQRView, View view) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        recentScanQRView.f48862P0.mo129625aj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m49103IM(RecentScanQRView recentScanQRView, View view) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        recentScanQRView.f48862P0.mo129618D6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m49104JM(RecentScanQRView recentScanQRView, View view) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        recentScanQRView.f48862P0.mo129626cm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m49105KM(RecentScanQRView recentScanQRView) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        recentScanQRView.f48862P0.mo129628g1();
    }

    /* renamed from: LM */
    private final void m49106LM(InterfaceC18494a interfaceC18494a) {
        if (m49148FM()) {
            interfaceC18494a.mo12V4();
        } else {
            m49144CM(new C9212e(interfaceC18494a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m49107MM(RecentScanQRView recentScanQRView, boolean z11) {
        boolean z12;
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        recentScanQRView.f48875c1 = z11;
        if (!recentScanQRView.f48874b1 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        recentScanQRView.m49109OM(z12, true);
    }

    /* renamed from: NM */
    private final void m49108NM(InterfaceC18494a interfaceC18494a) {
        if (this.f48871Y0 == null) {
            this.f48871Y0 = interfaceC18494a;
            this.f48862P0.mo129617C3();
            this.f48862P0.mo129623U0();
        }
    }

    /* renamed from: OM */
    private final void m49109OM(boolean z11, boolean z12) {
        final Button trailingButton;
        int i11;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null && (trailingButton = m87077NK.getTrailingButton()) != null) {
            if ((trailingButton.getVisibility() == 0 && !z11) || (trailingButton.getVisibility() != 0 && z11)) {
                if (!z12) {
                    if (z11) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    trailingButton.setVisibility(i11);
                    return;
                }
                if (z11) {
                    trailingButton.animate().alpha(1.0f).setDuration(120L).withStartAction(new Runnable() { // from class: py.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            RecentScanQRView.m49110PM(Button.this);
                        }
                    }).withLayer().start();
                } else {
                    trailingButton.animate().alpha(0.0f).setDuration(120L).withEndAction(new Runnable() { // from class: py.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            RecentScanQRView.m49111QM(Button.this);
                        }
                    }).withLayer().start();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m49110PM(Button button) {
        AbstractC19074t.m100208f(button, "$it");
        button.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m49111QM(Button button) {
        AbstractC19074t.m100208f(button, "$it");
        button.setVisibility(8);
    }

    /* renamed from: RM */
    private final void m49112RM(boolean z11) {
        Drawable drawable;
        Object m129218b;
        Drawable drawable2;
        Object m129218b2;
        Drawable drawable3;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK == null) {
            return;
        }
        Drawable drawable4 = null;
        if (this.f48872Z0 == null && m87077NK.getBackground() != null) {
            try {
                C24861r.a aVar = C24861r.f119264q;
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                TypedArray obtainStyledAttributes = m92689tK.obtainStyledAttributes(AbstractC2814h.WhiteZdsActionBar_AppType, new int[]{R.attr.background});
                AbstractC19074t.m100207e(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
                if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsActionBar_android_background)) {
                    drawable3 = obtainStyledAttributes.getDrawable(AbstractC2815i.ZdsActionBar_android_background);
                } else {
                    drawable3 = null;
                }
                obtainStyledAttributes.recycle();
                m129218b2 = C24861r.m129218b(drawable3);
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            Throwable m129221e = C24861r.m129221e(m129218b2);
            if (m129221e != null) {
                AbstractC20110a.f98889a.mo104552e(m129221e);
            }
            if (C24861r.m129223g(m129218b2)) {
                m129218b2 = null;
            }
            Drawable drawable5 = (Drawable) m129218b2;
            if (drawable5 != null) {
                this.f48872Z0 = new TransitionDrawable(new Drawable[]{m87077NK.getBackground(), drawable5});
            }
        }
        if (this.f48873a1 == null) {
            View divider = m87077NK.getDivider();
            if (divider != null) {
                drawable = divider.getBackground();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                try {
                    C24861r.a aVar3 = C24861r.f119264q;
                    Context m92689tK2 = m92689tK();
                    AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                    TypedArray obtainStyledAttributes2 = m92689tK2.obtainStyledAttributes(AbstractC2814h.WhiteZdsActionBar_AppType, new int[]{AbstractC2807a.headerDividerColor});
                    AbstractC19074t.m100207e(obtainStyledAttributes2, "obtainStyledAttributes(resourceId, attrs)");
                    if (obtainStyledAttributes2.hasValue(AbstractC2815i.ZdsActionBar_headerDividerColor)) {
                        drawable2 = obtainStyledAttributes2.getDrawable(AbstractC2815i.ZdsActionBar_headerDividerColor);
                    } else {
                        drawable2 = null;
                    }
                    obtainStyledAttributes2.recycle();
                    if (drawable2 == null) {
                        drawable2 = C23212s8.m119609q(m87077NK.getContext(), AbstractC2807a.header_white_divider);
                    }
                    m129218b = C24861r.m129218b(drawable2);
                } catch (Throwable th3) {
                    C24861r.a aVar4 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th3));
                }
                Throwable m129221e2 = C24861r.m129221e(m129218b);
                if (m129221e2 != null) {
                    AbstractC20110a.f98889a.mo104552e(m129221e2);
                }
                if (C24861r.m129223g(m129218b)) {
                    m129218b = null;
                }
                Drawable drawable6 = (Drawable) m129218b;
                if (drawable6 != null) {
                    Drawable[] drawableArr = new Drawable[2];
                    View divider2 = m87077NK.getDivider();
                    if (divider2 != null) {
                        drawable4 = divider2.getBackground();
                    }
                    drawableArr[0] = drawable4;
                    drawableArr[1] = drawable6;
                    this.f48873a1 = new TransitionDrawable(drawableArr);
                }
            }
        }
        if (z11) {
            TransitionDrawable transitionDrawable = this.f48872Z0;
            if (transitionDrawable != null) {
                m87077NK.setBackground(transitionDrawable);
                View divider3 = m87077NK.getDivider();
                if (divider3 != null) {
                    divider3.setBackground(this.f48873a1);
                }
                TransitionDrawable transitionDrawable2 = this.f48872Z0;
                if (transitionDrawable2 != null) {
                    transitionDrawable2.startTransition(200);
                }
                TransitionDrawable transitionDrawable3 = this.f48873a1;
                if (transitionDrawable3 != null) {
                    transitionDrawable3.startTransition(200);
                }
            } else {
                Context m92689tK3 = m92689tK();
                AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
                m87077NK.m91006f(m92689tK3, AbstractC2814h.WhiteZdsActionBar_AppType);
            }
            m87077NK.setLeadingFunctionCallback(new C9213f());
            m87077NK.setLeadingType(ZdsActionBar.EnumC16988d.CLOSE.m91015c());
            m87077NK.setLeadingButton1Color(C23212s8.m119607o(m92689tK(), AbstractC2807a.icon_01));
            String string = m87077NK.getResources().getString(AbstractC8020f0.str_delete);
            AbstractC19074t.m100207e(string, "getString(...)");
            m87077NK.setMiddleTitle(string);
            m87077NK.setMiddleTitleTextColor(C23212s8.m119607o(m92689tK(), AbstractC2807a.text_01));
            SystemUIUtils.C16759a c16759a = this.f48869W0;
            if (c16759a != null) {
                boolean m119603k = C23212s8.m119603k();
                Boolean bool = Boolean.TRUE;
                Boolean valueOf = Boolean.valueOf(m119603k);
                Boolean bool2 = Boolean.FALSE;
                c16759a.m89464c(new C16766d(bool, valueOf, null, null, null, bool2, bool2, 0, 28, null));
            }
            this.f48874b1 = true;
            m49109OM(false, true);
            return;
        }
        TransitionDrawable transitionDrawable4 = this.f48872Z0;
        if (transitionDrawable4 != null) {
            m87077NK.setBackground(transitionDrawable4);
            View divider4 = m87077NK.getDivider();
            if (divider4 != null) {
                divider4.setBackground(this.f48873a1);
            }
            TransitionDrawable transitionDrawable5 = this.f48872Z0;
            if (transitionDrawable5 != null) {
                transitionDrawable5.reverseTransition(200);
            }
            TransitionDrawable transitionDrawable6 = this.f48873a1;
            if (transitionDrawable6 != null) {
                transitionDrawable6.reverseTransition(200);
            }
        } else {
            Context m92689tK4 = m92689tK();
            AbstractC19074t.m100207e(m92689tK4, "requireContext(...)");
            m87077NK.m91006f(m92689tK4, AbstractC2814h.BlueZdsActionBar_AppType_Default);
        }
        mo39896OK();
        m87077NK.setLeadingType(ZdsActionBar.EnumC16988d.BACK.m91015c());
        m87077NK.setLeadingButton1Color(AbstractC23136l9.m118641B(m92689tK(), AbstractC2808b.wht_a100));
        String string2 = m87077NK.getResources().getString(AbstractC8020f0.str_recently_scanned);
        AbstractC19074t.m100207e(string2, "getString(...)");
        m87077NK.setMiddleTitle(string2);
        m87077NK.setMiddleTitleTextColor(C23212s8.m119607o(m92689tK(), AbstractC2807a.text_04));
        SystemUIUtils.C16759a c16759a2 = this.f48869W0;
        if (c16759a2 != null) {
            Boolean bool3 = Boolean.TRUE;
            Boolean bool4 = Boolean.FALSE;
            c16759a2.m89464c(new C16766d(bool3, bool4, null, null, null, bool4, bool4, 0, 28, null));
        }
        this.f48874b1 = false;
        m49109OM(!this.f48875c1, true);
    }

    /* renamed from: SM */
    private final void m49113SM(boolean z11) {
        if (z11) {
            FrameLayout frameLayout = this.f48864R0;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                if (AbstractC1579n0.m7865e0(frameLayout) && !frameLayout.isLayoutRequested()) {
                    RecyclerView recyclerView = this.f48863Q0;
                    if (recyclerView != null) {
                        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), frameLayout.getHeight());
                    }
                    frameLayout.setTranslationY(frameLayout.getHeight());
                    frameLayout.animate().translationY(0.0f).setDuration(175L).setInterpolator(new DecelerateInterpolator(1.78f)).withLayer();
                    return;
                }
                frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC9214g(frameLayout));
                return;
            }
            return;
        }
        final FrameLayout frameLayout2 = this.f48864R0;
        if (frameLayout2 != null) {
            frameLayout2.animate().translationY(frameLayout2.getHeight()).setDuration(175L).withEndAction(new Runnable() { // from class: py.d0
                @Override // java.lang.Runnable
                public final void run() {
                    RecentScanQRView.m49114TM(frameLayout2, this);
                }
            }).withLayer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:            r4 = qm0.AbstractC25358n.m131363K(r4, 3);     */
    /* renamed from: TM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m49114TM(FrameLayout frameLayout, RecentScanQRView recentScanQRView) {
        int i11;
        Integer m131363K;
        AbstractC19074t.m100208f(frameLayout, "$footer");
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        frameLayout.setTranslationY(0.0f);
        frameLayout.setVisibility(8);
        RecyclerView recyclerView = recentScanQRView.f48863Q0;
        if (recyclerView != null) {
            int[] iArr = recentScanQRView.f48868V0;
            if (iArr != null && m131363K != null) {
                i11 = m131363K.intValue();
            } else {
                i11 = 0;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m49115UM(RecentScanQRView recentScanQRView, boolean z11) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        recentScanQRView.m49112RM(z11);
        recentScanQRView.m49113SM(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m49116VM(final RecentScanQRView recentScanQRView, int i11, boolean z11) {
        String string;
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        C16972e0 c16972e0 = recentScanQRView.f48877e1;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        Context context = recentScanQRView.getContext();
        if (context == null) {
            return;
        }
        int i12 = 1;
        if (i11 == 1) {
            string = context.getResources().getString(AbstractC8020f0.str_delete_this_qr_code);
            AbstractC19074t.m100205c(string);
        } else {
            string = context.getResources().getString(AbstractC8020f0.str_delete_x_qr_codes, Integer.valueOf(i11));
            AbstractC19074t.m100205c(string);
        }
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90949z(string);
        aVar.m90921E(true);
        aVar.m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger);
        aVar.m90942s(AbstractC8020f0.str_delete, new InterfaceC17463d.d() { // from class: py.r
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                RecentScanQRView.m49117WM(RecentScanQRView.this, interfaceC17463d, i13);
            }
        });
        aVar.m90947x("scan_qr_recent_delete");
        C0708i c0708i = new C0708i();
        if (z11) {
            i12 = 2;
        }
        c0708i.m1072c("delete_type", i12);
        c0708i.m1072c("total_qr_delete", i11);
        aVar.m90946w(c0708i);
        aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        aVar.m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: py.s
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                RecentScanQRView.m49118XM(interfaceC17463d, i13);
            }
        });
        C16972e0 m90927d = aVar.m90927d();
        recentScanQRView.f48877e1 = m90927d;
        if (m90927d != null) {
            m90927d.m92855F(new InterfaceC17463d.e() { // from class: py.t
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                /* renamed from: Tv */
                public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                    RecentScanQRView.m49119YM(RecentScanQRView.this, interfaceC17463d);
                }
            });
        }
        C16972e0 c16972e02 = recentScanQRView.f48877e1;
        if (c16972e02 != null) {
            c16972e02.mo13822K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public static final void m49117WM(RecentScanQRView recentScanQRView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        recentScanQRView.f48862P0.mo129631o7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public static final void m49118XM(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public static final void m49119YM(RecentScanQRView recentScanQRView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        recentScanQRView.f48862P0.mo129622O7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:            r2 = qm0.AbstractC25358n.m131363K(r2, 3);     */
    /* renamed from: ZM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m49120ZM(final RecentScanQRView recentScanQRView, int i11, boolean z11) {
        String string;
        Integer m131363K;
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        Snackbar snackbar = recentScanQRView.f48876d1;
        if (snackbar != null && snackbar != null) {
            snackbar.m90655n();
        }
        View m120373f = C23283z7.m120373f(recentScanQRView, recentScanQRView.m92676n2());
        if (m120373f != null) {
            int i12 = 0;
            if (i11 <= 1) {
                string = m120373f.getResources().getString(AbstractC8020f0.str_qr_code_deleted);
                AbstractC19074t.m100205c(string);
            } else {
                string = m120373f.getResources().getString(AbstractC8020f0.str_x_qr_code_deleted, Integer.valueOf(i11));
                AbstractC19074t.m100205c(string);
            }
            Snackbar m90669d = Snackbar.Companion.m90669d(m120373f, string, 3000);
            int[] iArr = recentScanQRView.f48868V0;
            if (iArr != null && m131363K != null) {
                i12 = m131363K.intValue();
            }
            Snackbar m90640F = m90669d.m90645K(i12 + AbstractC23136l9.m118712h(m120373f.getContext(), 16.0f)).m90642H(Integer.MAX_VALUE).m90640F(new C9215h());
            recentScanQRView.f48876d1 = m90640F;
            if (z11 && m90640F != null) {
                m90640F.m90664z(AbstractC8020f0.str_undo, new View.OnClickListener() { // from class: py.w
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RecentScanQRView.m49121aN(RecentScanQRView.this, view);
                    }
                });
            }
            Snackbar snackbar2 = recentScanQRView.f48876d1;
            if (snackbar2 != null) {
                snackbar2.m90648N();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public static final void m49121aN(RecentScanQRView recentScanQRView, View view) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        recentScanQRView.f48862P0.mo129633rg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public static final void m49122bN(RecentScanQRView recentScanQRView, List list) {
        AbstractC19074t.m100208f(recentScanQRView, "this$0");
        AbstractC19074t.m100208f(list, "$list");
        recentScanQRView.f48867U0.m10635O(list);
    }

    /* renamed from: cN */
    private final void m49123cN() {
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f48862P0.mo995Nd(null, null);
    }

    /* renamed from: CM */
    public void m49144CM(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f48870X0 = interfaceC18494a;
        m49154Zg();
    }

    @Override // py.InterfaceC24935g
    /* renamed from: Ca */
    public void mo49145Ca(Long l11) {
        ScanQRUIUtils.f49155a.m49621H(this.f48867U0, l11);
    }

    @Override // py.InterfaceC24935g
    /* renamed from: Dw */
    public void mo49146Dw(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: py.x
            @Override // java.lang.Runnable
            public final void run() {
                RecentScanQRView.m49107MM(RecentScanQRView.this, z11);
            }
        });
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: EM, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        if (AbstractC19074t.m100204b(m97246b, "QR.RecentScanQR.ClickItem")) {
            if (c18316b.m97245a() instanceof AbstractC23957a.b) {
                this.f48862P0.mo129632r9((AbstractC23957a.b) c18316b.m97245a());
                return null;
            }
            return null;
        }
        if (AbstractC19074t.m100204b(m97246b, "QR.RecentScanQR.LongClickItem") && (c18316b.m97245a() instanceof AbstractC23957a.b)) {
            this.f48862P0.mo129627d9((AbstractC23957a.b) c18316b.m97245a());
            return null;
        }
        return null;
    }

    /* renamed from: FM */
    public boolean m49148FM() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92662fJ.m93018M0() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bf, code lost:            r5 = qm0.AbstractC25358n.m131363K(r11, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ce, code lost:            r7 = qm0.AbstractC25358n.m131363K(r11, 2);     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dd, code lost:            r9 = qm0.AbstractC25358n.m131363K(r11, 3);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010a, code lost:            r2 = qm0.AbstractC25358n.m131363K(r11, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:            r5 = qm0.AbstractC25358n.m131363K(r11, 2);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0126, code lost:            r11 = qm0.AbstractC25358n.m131363K(r11, 3);     */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer m131363K;
        Integer m131363K2;
        Integer m131363K3;
        Integer m131363K4;
        Integer m131363K5;
        Integer m131363K6;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(C23212s8.m119607o(layoutInflater.getContext(), AbstractC2807a.page_background_02));
        linearLayout.setFocusable(true);
        linearLayout.setClickable(true);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
            AbstractC19074t.m100205c(m92676n2);
            iArr = scanQRUIUtils.m49636s(m92676n2);
        } else {
            iArr = null;
        }
        this.f48868V0 = iArr;
        Context context = linearLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        ZdsActionBar zdsActionBar = new ZdsActionBar(context);
        Context context2 = zdsActionBar.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zdsActionBar.m91006f(context2, AbstractC2814h.BlueZdsActionBar_AppType_Default);
        String string = zdsActionBar.getResources().getString(AbstractC8020f0.str_recently_scanned);
        AbstractC19074t.m100207e(string, "getString(...)");
        zdsActionBar.setMiddleTitle(string);
        zdsActionBar.setId(AbstractC6918a0.zds_action_bar);
        zdsActionBar.setLeadingType(ZdsActionBar.EnumC16988d.BACK.m91015c());
        zdsActionBar.setTrailingType(ZdsActionBar.EnumC16990f.ICON.m91019c());
        Context context3 = zdsActionBar.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        Drawable m139659b = C27280g.m139659b(context3, AbstractC23322a.zds_ic_delete_line_24, AbstractC16801x.white);
        if (m139659b != null) {
            zdsActionBar.setTrailingIconButton(m139659b);
            Button trailingButton = zdsActionBar.getTrailingButton();
            if (trailingButton != null) {
                trailingButton.setVisibility(8);
            }
        }
        linearLayout.addView(zdsActionBar);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        linearLayout.addView(frameLayout, -1, -1);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
        recyclerView.setId(AbstractC6918a0.recyclerView);
        recyclerView.setClipToPadding(false);
        if (iArr != null && m131363K6 != null) {
            i11 = m131363K6.intValue();
        } else {
            i11 = 0;
        }
        if (iArr != null && m131363K5 != null) {
            i12 = m131363K5.intValue();
        } else {
            i12 = 0;
        }
        if (iArr != null && m131363K4 != null) {
            i13 = m131363K4.intValue();
        } else {
            i13 = 0;
        }
        recyclerView.setPadding(i11, 0, i12, i13);
        frameLayout.addView(recyclerView, -1, -1);
        FrameLayout frameLayout2 = new FrameLayout(linearLayout.getContext());
        frameLayout2.setVisibility(8);
        frameLayout2.setBackgroundColor(C23212s8.m119607o(linearLayout.getContext(), AbstractC2807a.ui_background));
        if (iArr != null && m131363K3 != null) {
            i14 = m131363K3.intValue();
        } else {
            i14 = 0;
        }
        if (iArr != null && m131363K2 != null) {
            i15 = m131363K2.intValue();
        } else {
            i15 = 0;
        }
        if (iArr != null && m131363K != null) {
            i16 = m131363K.intValue();
        } else {
            i16 = 0;
        }
        frameLayout2.setPadding(i14, 0, i15, i16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.f48864R0 = frameLayout2;
        int m118712h = AbstractC23136l9.m118712h(linearLayout.getContext(), 8.0f);
        Context context4 = linearLayout.getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        Button button = new Button(context4);
        button.m90539c(AbstractC2814h.ButtonSmall_TertiaryNeutral);
        button.setText(AbstractC8020f0.select_all);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        layoutParams2.setMargins(m118712h, m118712h, AbstractC23136l9.m118712h(linearLayout.getContext(), 56.0f), m118712h);
        button.setOnClickListener(new View.OnClickListener() { // from class: py.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentScanQRView.m49102HM(RecentScanQRView.this, view);
            }
        });
        FrameLayout frameLayout3 = this.f48864R0;
        if (frameLayout3 != null) {
            frameLayout3.addView(button, layoutParams2);
        }
        this.f48865S0 = button;
        Context context5 = linearLayout.getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        Button button2 = new Button(context5);
        button2.m90539c(AbstractC2814h.ButtonMedium_TertiaryDanger);
        button2.setSupportiveIcon(AbstractC23322a.zds_ic_delete_line_24);
        button2.setEnabled(false);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16 | AbstractC1602t.m8182b(8388613, linearLayout.getLayoutDirection());
        layoutParams3.setMargins(m118712h, m118712h, m118712h, m118712h);
        button2.setOnClickListener(new View.OnClickListener() { // from class: py.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentScanQRView.m49103IM(RecentScanQRView.this, view);
            }
        });
        FrameLayout frameLayout4 = this.f48864R0;
        if (frameLayout4 != null) {
            frameLayout4.addView(button2, layoutParams3);
        }
        this.f48866T0 = button2;
        Context context6 = linearLayout.getContext();
        AbstractC19074t.m100207e(context6, "getContext(...)");
        Divider divider = new Divider(context6);
        divider.setOrientation(0);
        divider.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout5 = this.f48864R0;
        if (frameLayout5 != null) {
            frameLayout5.addView(divider);
        }
        return linearLayout;
    }

    @Override // py.InterfaceC24935g
    /* renamed from: Gb */
    public void mo49149Gb(final int i11, final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: py.e0
            @Override // java.lang.Runnable
            public final void run() {
                RecentScanQRView.m49116VM(RecentScanQRView.this, i11, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        long j11;
        C23169o9 c23169o9 = C23169o9.f112346a;
        if (z11) {
            j11 = 400;
        } else {
            j11 = 325;
        }
        return C23169o9.m119340b(c23169o9, this, z11, runnable, false, j11, 4, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        this.f48862P0.mo129634t2();
        super.mo37484JJ();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: py.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecentScanQRView.m49104JM(RecentScanQRView.this, view);
                }
            });
        }
    }

    @Override // py.InterfaceC24935g
    /* renamed from: PB */
    public void mo49150PB() {
        AbstractC19444a.m101697e(new Runnable() { // from class: py.v
            @Override // java.lang.Runnable
            public final void run() {
                RecentScanQRView.m49100DM(RecentScanQRView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: PK */
    public void mo46028PK() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f48862P0.mo129620M2();
    }

    @Override // py.InterfaceC24935g
    /* renamed from: Ta */
    public void mo49151Ta(boolean z11) {
        View view = this.f48865S0;
        if (view != null) {
            view.setEnabled(z11);
        }
    }

    @Override // py.InterfaceC24935g
    /* renamed from: Wd */
    public void mo49152Wd(final int i11, final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: py.u
            @Override // java.lang.Runnable
            public final void run() {
                RecentScanQRView.m49120ZM(RecentScanQRView.this, i11, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        super.mo37122XJ(z11, z12);
        InterfaceC24933f interfaceC24933f = this.f48862P0;
        boolean z16 = false;
        if (z11 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z11 && z12) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z11 && !z12) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z11 && z12) {
            z16 = true;
        }
        interfaceC24933f.mo129630n2(z13, z14, z15, z16);
        if (!z11 && z12) {
            InterfaceC18494a interfaceC18494a = this.f48870X0;
            this.f48870X0 = C9209b.f48879q;
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: YJ */
    public void mo49153YJ(boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        super.mo49153YJ(z11, z12);
        InterfaceC24933f interfaceC24933f = this.f48862P0;
        boolean z16 = false;
        if (z11 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z11 && z12) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z11 && !z12) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z11 && z12) {
            z16 = true;
        }
        interfaceC24933f.mo129629j2(z13, z14, z15, z16);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        BaseZaloActivity baseZaloActivity;
        int i11;
        C1421e m8055g;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        int i12 = 0;
        int i13 = 0;
        C16766d c16766d = new C16766d(bool, bool2, null, null, null, bool2, bool2, 0, 28, null);
        BaseZaloActivity baseZaloActivity2 = null;
        this.f48869W0 = SystemUIUtils.m89446k(this, c16766d, null, 2, null);
        SystemUI m89489a = AbstractC16768f.m89489a(view);
        int m118712h = AbstractC23136l9.m118712h(m92689tK(), 32.0f);
        C1580n1 m7824M = AbstractC1579n0.m7824M(view);
        if (m7824M != null && (m8055g = m7824M.m8055g(C1580n1.m.m8116d())) != null) {
            i12 = m8055g.f6233d;
        }
        if (m118712h < i12) {
            if (C23212s8.m119603k()) {
                i11 = AbstractC16801x.black_33;
            } else {
                i11 = AbstractC17452c.statusBarColor;
            }
            i13 = Integer.valueOf(AbstractC23136l9.m118639A(i11));
        }
        m89489a.m89427V(i13);
        m89489a.m89426U(Boolean.valueOf(C23212s8.m119603k()));
        this.f48863Q0 = (RecyclerView) view.findViewById(AbstractC6918a0.recyclerView);
        this.f48867U0.m129613R(this);
        RecyclerView recyclerView = this.f48863Q0;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f48867U0);
        }
        RecyclerView recyclerView2 = this.f48863Q0;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(m92689tK()));
        }
        this.f48862P0.mo129619L();
        Context m92648SI = m92648SI();
        if (m92648SI instanceof BaseZaloActivity) {
            baseZaloActivity = (BaseZaloActivity) m92648SI;
        } else {
            baseZaloActivity = null;
        }
        if (baseZaloActivity != null) {
            if (m49148FM() && !baseZaloActivity.m56696x3()) {
                baseZaloActivity2 = baseZaloActivity;
            }
            if (baseZaloActivity2 != null) {
                baseZaloActivity2.m56680B3(new C9210c(baseZaloActivity2, this));
                AbstractC19444a.m101695c(new Runnable() { // from class: py.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecentScanQRView.m49105KM(RecentScanQRView.this);
                    }
                });
            }
        }
        this.f48862P0.mo129624Z2();
        AbstractC19444a.m101695c(new Runnable() { // from class: py.y
            @Override // java.lang.Runnable
            public final void run() {
                RecentScanQRView.m49105KM(RecentScanQRView.this);
            }
        });
    }

    /* renamed from: Zg */
    public void m49154Zg() {
        AbstractC19444a.m101697e(new Runnable() { // from class: py.f0
            @Override // java.lang.Runnable
            public final void run() {
                RecentScanQRView.m49099BM(RecentScanQRView.this);
            }
        });
    }

    @Override // py.InterfaceC24935g
    /* renamed from: Zm */
    public void mo49155Zm(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: py.c0
            @Override // java.lang.Runnable
            public final void run() {
                RecentScanQRView.m49115UM(RecentScanQRView.this, z11);
            }
        });
    }

    @Override // py.InterfaceC24935g
    /* renamed from: a1 */
    public void mo49156a1() {
        InterfaceC18494a interfaceC18494a = this.f48871Y0;
        if (interfaceC18494a == null) {
            return;
        }
        this.f48871Y0 = null;
        m49106LM(interfaceC18494a);
    }

    @Override // py.InterfaceC24935g
    /* renamed from: bu */
    public void mo49157bu(final List list) {
        AbstractC19074t.m100208f(list, "list");
        AbstractC19444a.m101695c(new Runnable() { // from class: py.o
            @Override // java.lang.Runnable
            public final void run() {
                RecentScanQRView.m49122bN(RecentScanQRView.this, list);
            }
        });
    }

    @Override // py.InterfaceC24935g
    /* renamed from: ed */
    public void mo49158ed(boolean z11) {
        View view = this.f48866T0;
        if (view != null) {
            view.setEnabled(z11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "RecentScanQRView";
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:            if (r5.booleanValue() != false) goto L24;     */
    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        boolean z11;
        ModalBottomSheet modalBottomSheet;
        BottomSheet bottomSheet;
        if (i11 == 4 && m49101GM()) {
            ZaloView m93012K0 = m92649TI().m93012K0();
            Boolean bool = null;
            if (m93012K0 instanceof ModalBottomSheet) {
                modalBottomSheet = (ModalBottomSheet) m93012K0;
            } else {
                modalBottomSheet = null;
            }
            if (modalBottomSheet != null) {
                modalBottomSheet.m81928iM();
            } else {
                ZaloView m93012K02 = m92649TI().m93012K0();
                if (m93012K02 instanceof BottomSheet) {
                    bottomSheet = (BottomSheet) m93012K02;
                } else {
                    bottomSheet = null;
                }
                if (bottomSheet != null) {
                    bottomSheet.close();
                } else {
                    if (this.f48874b1) {
                        this.f48862P0.mo129626cm();
                        bool = Boolean.TRUE;
                    }
                    if (bool != null) {
                    }
                }
            }
            z11 = true;
            if (i11 == 4 && !z11 && m49101GM()) {
                m49123cN();
            }
            if (z11 && !super.onKeyUp(i11, keyEvent)) {
                return false;
            }
            return true;
        }
        z11 = false;
        if (i11 == 4) {
            m49123cN();
        }
        if (z11) {
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f48862P0.mo129621N0();
    }

    @Override // py.InterfaceC24935g
    /* renamed from: pH */
    public void mo49159pH(AbstractC23957a.b bVar) {
        AbstractC19074t.m100208f(bVar, "item");
        m49108NM(new C9211d(bVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: wJ */
    public boolean mo49160wJ() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:            r5 = qm0.AbstractC25358n.m131363K(r8, 2);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:            r6 = qm0.AbstractC25358n.m131363K(r8, 3);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:            r4 = qm0.AbstractC25358n.m131363K(r8, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:            r2 = qm0.AbstractC25358n.m131363K(r8, 2);     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:            r8 = qm0.AbstractC25358n.m131363K(r8, 3);     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:            r4 = qm0.AbstractC25358n.m131363K(r8, 0);     */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: yJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo46830yJ(WindowInsets windowInsets) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        Integer m131363K;
        Integer m131363K2;
        Integer m131363K3;
        int i14;
        int i15;
        int i16;
        Integer m131363K4;
        Integer m131363K5;
        Integer m131363K6;
        super.mo46830yJ(windowInsets);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            iArr = ScanQRUIUtils.f49155a.m49636s(m92676n2);
        } else {
            iArr = null;
        }
        this.f48868V0 = iArr;
        RecyclerView recyclerView = this.f48863Q0;
        if (recyclerView != null) {
            if (iArr != null && m131363K6 != null) {
                i14 = m131363K6.intValue();
            } else {
                i14 = 0;
            }
            if (iArr != null && m131363K5 != null) {
                i15 = m131363K5.intValue();
            } else {
                i15 = 0;
            }
            if (iArr != null && m131363K4 != null) {
                i16 = m131363K4.intValue();
            } else {
                i16 = 0;
            }
            recyclerView.setPadding(i14, 0, i15, i16);
        }
        FrameLayout frameLayout = this.f48864R0;
        if (frameLayout != null) {
            if (iArr != null && m131363K3 != null) {
                i11 = m131363K3.intValue();
            } else {
                i11 = 0;
            }
            if (iArr != null && m131363K2 != null) {
                i12 = m131363K2.intValue();
            } else {
                i12 = 0;
            }
            if (iArr != null && m131363K != null) {
                i13 = m131363K.intValue();
            } else {
                i13 = 0;
            }
            frameLayout.setPadding(i11, 0, i12, i13);
        }
    }
}
