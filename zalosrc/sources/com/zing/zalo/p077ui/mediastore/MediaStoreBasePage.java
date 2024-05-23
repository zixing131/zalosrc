package com.zing.zalo.p077ui.mediastore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SimpleAdapter;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.RecyclerView;
import au.EnumC2381y;
import au.EnumC2382z;
import ci.C3509j0;
import ci.C3526u;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.control.C7905c;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.mediastore.C12340b;
import com.zing.zalo.p077ui.mediastore.InterfaceC12370i;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.MediaStoreView;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreLinearLayoutManager;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaHeaderView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.JumpLinkSettingBottomView;
import com.zing.zalo.p077ui.zviews.RolledMediaBottomSheet;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19656s0;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23222t7;
import me0.C23250w4;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p239ih.C20556f;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p649xl.C30081v5;
import p716zh.C31944h6;
import p716zh.C31950hc;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vc0.AbstractC27964c;
import vc0.C27962a;
import vc0.C27966e;
import vc0.C27969h;
import xl0.InterfaceC30162c;
import zl0.AbstractC32226c;

@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes6.dex */
public abstract class MediaStoreBasePage<P extends InterfaceC12370i> extends SlidableZaloView implements InterfaceC12371j {
    public static final C12274a Companion = new C12274a(null);

    /* renamed from: o1 */
    private static final String f63958o1;

    /* renamed from: p1 */
    private static final int f63959p1;

    /* renamed from: P0 */
    protected C30081v5 f63960P0;

    /* renamed from: Q0 */
    private MediaStoreLinearLayoutManager f63961Q0;

    /* renamed from: R0 */
    private C7226u3 f63962R0;

    /* renamed from: S0 */
    private AbstractC11859g f63963S0;

    /* renamed from: T0 */
    private final int f63964T0 = AbstractC23222t7.f112539R;

    /* renamed from: U0 */
    private final int f63965U0;

    /* renamed from: V0 */
    private int f63966V0;

    /* renamed from: W0 */
    private boolean f63967W0;

    /* renamed from: X0 */
    private int f63968X0;

    /* renamed from: Y0 */
    private long f63969Y0;

    /* renamed from: Z0 */
    private boolean f63970Z0;

    /* renamed from: a1 */
    protected C23528a f63971a1;

    /* renamed from: b1 */
    private C27962a f63972b1;

    /* renamed from: c1 */
    private AbstractC27964c f63973c1;

    /* renamed from: d1 */
    private final InterfaceC24854k f63974d1;

    /* renamed from: e1 */
    private InterfaceC12276c f63975e1;

    /* renamed from: f1 */
    private InterfaceC12275b f63976f1;

    /* renamed from: g1 */
    private final InterfaceC24854k f63977g1;

    /* renamed from: h1 */
    private C8009j f63978h1;

    /* renamed from: i1 */
    private KeyEventCallbackC17462c f63979i1;

    /* renamed from: j1 */
    private final InterfaceC24854k f63980j1;

    /* renamed from: k1 */
    private final InterfaceC24854k f63981k1;

    /* renamed from: l1 */
    private final InterfaceC24854k f63982l1;

    /* renamed from: m1 */
    private final Handler f63983m1;

    /* renamed from: n1 */
    private Snackbar f63984n1;

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$a */
    /* loaded from: classes6.dex */
    public static final class C12274a {
        private C12274a() {
        }

        public /* synthetic */ C12274a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m68934a() {
            return MediaStoreBasePage.f63958o1;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12275b {
        /* renamed from: F3 */
        void mo68935F3(boolean z11);

        /* renamed from: I0 */
        void mo68936I0(EnumC2382z enumC2382z);

        /* renamed from: M3 */
        NestedScrollViewParent mo68937M3();

        /* renamed from: S3 */
        void mo68938S3(boolean z11);

        /* renamed from: n4 */
        void mo68939n4(int i11, boolean z11, boolean z12);

        /* renamed from: o4 */
        void mo68940o4(boolean z11);

        /* renamed from: p4 */
        int mo68941p4();

        /* renamed from: q4 */
        void mo68942q4(boolean z11);

        /* renamed from: r4 */
        void mo68943r4(MediaStoreItem mediaStoreItem);

        /* renamed from: s4 */
        void mo68944s4(EnumC2382z enumC2382z);

        /* renamed from: t4 */
        int mo68945t4();

        /* renamed from: u4 */
        String mo68946u4();
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC12276c {
        /* renamed from: a */
        void mo68947a();

        /* renamed from: b */
        void mo68948b(List list);

        /* renamed from: c */
        void mo68949c(boolean z11);

        /* renamed from: d */
        void mo68950d(boolean z11, int i11, int i12, View view);
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$d */
    /* loaded from: classes6.dex */
    public static final class C12277d implements C27966e.b {
        C12277d() {
        }

        @Override // vc0.C27966e.b
        /* renamed from: a */
        public void mo68951a(int i11) {
            AbstractC27964c abstractC27964c = MediaStoreBasePage.this.f63973c1;
            if (abstractC27964c != null) {
                abstractC27964c.m140957h();
            }
        }

        @Override // vc0.C27966e.b
        /* renamed from: b */
        public void mo68952b(int i11) {
            AbstractC27964c abstractC27964c = MediaStoreBasePage.this.f63973c1;
            if (abstractC27964c != null) {
                abstractC27964c.m140958i(MediaStoreBasePage.this.m68863EM().mo69082v());
            }
            if (MediaStoreBasePage.this.m68933zM() >= 2) {
                AbstractC23647d.m123897g("10015060");
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$e */
    /* loaded from: classes6.dex */
    public static final class C12278e extends RecyclerView.AbstractC1887n {
        C12278e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            MediaStoreBasePage.this.mo68875KM(rect, view, recyclerView, c1899z);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$f */
    /* loaded from: classes6.dex */
    public static final class C12279f extends RecyclerView.AbstractC1892s {
        C12279f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            MediaStoreBasePage.this.mo68899YM(recyclerView, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            MediaStoreBasePage.this.mo68901ZM(i11, i12);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$g */
    /* loaded from: classes6.dex */
    public static final class C12280g extends C1923p {

        /* renamed from: q */
        final /* synthetic */ int f63988q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12280g(int i11, Context context) {
            super(context);
            this.f63988q = i11;
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: B */
        protected int mo10618B() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: u */
        public int mo10622u(View view, int i11) {
            AbstractC19074t.m100208f(view, "view");
            RecyclerView.AbstractC1888o m10233e = m10233e();
            if (m10233e != null && m10233e.mo9758y()) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                return mo10620s((m10233e.m10135l(view) - this.f63988q) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, m10233e.m10130j(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, m10233e.getPaddingTop(), m10233e.getHeight() - m10233e.getPaddingBottom(), i11);
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: x */
        public int mo10624x(int i11) {
            int m116584g;
            m116584g = AbstractC22543l.m116584g(50, super.mo10624x(i11));
            return m116584g;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$h */
    /* loaded from: classes6.dex */
    public static final class C12281h implements MediaStoreMediaHeaderView.InterfaceC12353a {
        C12281h() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaHeaderView.InterfaceC12353a
        /* renamed from: a */
        public void mo36872a(C7906d c7906d, boolean z11, int i11) {
            AbstractC19074t.m100208f(c7906d, "albumItem");
            int m68853AM = MediaStoreBasePage.this.m68853AM();
            MediaStoreBasePage.this.m68863EM().mo69079uD(z11, MediaStoreBasePage.this.m68851xM(m68853AM), m68853AM);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$i */
    /* loaded from: classes6.dex */
    public static final class C12282i extends AbstractC11859g {

        /* renamed from: U */
        final /* synthetic */ MediaStoreBasePage f63990U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12282i(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, MediaStoreBasePage mediaStoreBasePage, RecyclerView recyclerView) {
            super(recyclerView, stateListDrawable, drawable, stateListDrawable2, drawable2);
            this.f63990U = mediaStoreBasePage;
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: d0 */
        protected void mo46064d0() {
            InterfaceC12275b m68929yM = this.f63990U.m68929yM();
            if (m68929yM != null) {
                m68929yM.mo68935F3(false);
            }
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: f0 */
        protected void mo46066f0() {
            this.f63990U.mo68923ui();
            InterfaceC12275b m68929yM = this.f63990U.m68929yM();
            if (m68929yM != null) {
                m68929yM.mo68935F3(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$j */
    /* loaded from: classes6.dex */
    public static final class C12283j extends AbstractC19075u implements InterfaceC18494a {
        C12283j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final MediaStoreView.MediaStoreMultiSelectionBottomView.InterfaceC12317a mo12V4() {
            return MediaStoreBasePage.this.m68863EM().mo69071iB();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$k */
    /* loaded from: classes6.dex */
    public static final class C12284k extends AbstractC19075u implements InterfaceC18494a {
        C12284k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC12370i mo12V4() {
            InterfaceC12370i mo68889UM = MediaStoreBasePage.this.mo68889UM();
            MediaStoreBasePage.this.getLifecycle().mo9335a(mo68889UM);
            return mo68889UM;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$l */
    /* loaded from: classes6.dex */
    public static final class C12285l extends AbstractC19075u implements InterfaceC18494a {
        C12285l() {
            super(0);
        }

        /* renamed from: c */
        public static final void m68956c(MediaStoreBasePage mediaStoreBasePage) {
            AbstractC19074t.m100208f(mediaStoreBasePage, "this$0");
            C7226u3 m68868IM = mediaStoreBasePage.m68868IM();
            if (m68868IM != null) {
                m68868IM.m10008p();
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b */
        public final Runnable mo12V4() {
            return new Runnable() { // from class: com.zing.zalo.ui.mediastore.c
                public /* synthetic */ RunnableC12341c() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreBasePage.C12285l.m68956c(MediaStoreBasePage.this);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$m */
    /* loaded from: classes6.dex */
    public static final class C12286m extends AbstractC19075u implements InterfaceC18494a {
        C12286m() {
            super(0);
        }

        /* renamed from: c */
        public static final void m68959c(MediaStoreBasePage mediaStoreBasePage) {
            AbstractC19074t.m100208f(mediaStoreBasePage, "this$0");
            mediaStoreBasePage.m68870JM().f139657q.setVisibility(8);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b */
        public final Runnable mo12V4() {
            return new Runnable() { // from class: com.zing.zalo.ui.mediastore.d
                public /* synthetic */ RunnableC12359d() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreBasePage.C12286m.m68959c(MediaStoreBasePage.this);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$n */
    /* loaded from: classes6.dex */
    public static final class C12287n extends AbstractC19075u implements InterfaceC18494a {
        C12287n() {
            super(0);
        }

        /* renamed from: c */
        public static final void m68962c(MediaStoreBasePage mediaStoreBasePage) {
            AbstractC19074t.m100208f(mediaStoreBasePage, "this$0");
            C7226u3 m68868IM = mediaStoreBasePage.m68868IM();
            if (m68868IM != null) {
                m68868IM.m36799I0(false);
            }
            C7226u3 m68868IM2 = mediaStoreBasePage.m68868IM();
            if (m68868IM2 != null) {
                m68868IM2.m10008p();
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b */
        public final Runnable mo12V4() {
            return new Runnable() { // from class: com.zing.zalo.ui.mediastore.e
                public /* synthetic */ RunnableC12360e() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreBasePage.C12287n.m68962c(MediaStoreBasePage.this);
                }
            };
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreBasePage$o */
    /* loaded from: classes6.dex */
    public static final class C12288o extends Snackbar.AbstractC16924b {
        C12288o() {
        }

        @Override // com.zing.zalo.zdesign.component.Snackbar.AbstractC16924b
        /* renamed from: a */
        public void mo49166a(Snackbar snackbar, int i11) {
            MediaStoreBasePage.this.m68863EM().mo69049Kr(false);
            MediaStoreBasePage.this.m68863EM().mo69056RE();
        }
    }

    static {
        String simpleName = MediaStoreBasePage.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f63958o1 = simpleName;
        f63959p1 = AbstractC23222t7.f112565i0;
    }

    public MediaStoreBasePage() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        int i11 = AbstractC23222t7.f112540S;
        this.f63965U0 = i11;
        this.f63966V0 = i11;
        this.f63967W0 = true;
        this.f63968X0 = -1;
        m129210a = AbstractC24856m.m129210a(new C12284k());
        this.f63974d1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12283j());
        this.f63977g1 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C12286m());
        this.f63980j1 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C12287n());
        this.f63981k1 = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C12285l());
        this.f63982l1 = m129210a5;
        this.f63983m1 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: x70.n
            public /* synthetic */ C29436n() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m68823LM;
                m68823LM = MediaStoreBasePage.m68823LM(MediaStoreBasePage.this, message);
                return m68823LM;
            }
        });
    }

    /* renamed from: A */
    private final void m68818A() {
        m68863EM().mo69035A();
    }

    /* renamed from: BM */
    private final int m68819BM() {
        MediaStoreLinearLayoutManager mediaStoreLinearLayoutManager = this.f63961Q0;
        if (mediaStoreLinearLayoutManager != null) {
            return mediaStoreLinearLayoutManager.m9745c2();
        }
        return 0;
    }

    /* renamed from: FM */
    private final Runnable m68820FM() {
        return (Runnable) this.f63982l1.getValue();
    }

    /* renamed from: GM */
    private final Runnable m68821GM() {
        return (Runnable) this.f63980j1.getValue();
    }

    /* renamed from: HM */
    private final Runnable m68822HM() {
        return (Runnable) this.f63981k1.getValue();
    }

    /* renamed from: LM */
    public static final boolean m68823LM(MediaStoreBasePage mediaStoreBasePage, Message message) {
        AbstractC19074t.m100208f(mediaStoreBasePage, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        int i11 = message.what;
        if (i11 != 1234) {
            if (i11 == 1235) {
                mediaStoreBasePage.mo49315c4();
                return false;
            }
            return false;
        }
        mediaStoreBasePage.mo46829Y();
        return false;
    }

    /* renamed from: OM */
    private final void m68824OM() {
        MediaStoreMediaHeaderView mediaStoreMediaHeaderView = m68870JM().f139659s;
        AbstractC19074t.m100207e(mediaStoreMediaHeaderView, "stickyHeaderContainer");
        MediaStoreMediaHeaderView.m69467b0(mediaStoreMediaHeaderView, false, false, 2, null);
        m68870JM().f139659s.setHeaderListener(new C12281h());
    }

    /* renamed from: PM */
    private final C27962a m68825PM(C27966e.b bVar) {
        NestedScrollViewParent nestedScrollViewParent;
        C27962a m140944x = new C27962a().m140946z(new C27966e(new C27966e.a() { // from class: x70.l
            public /* synthetic */ C29430l() {
            }

            @Override // vc0.C27966e.a
            /* renamed from: a */
            public final void mo115544a(int i11, int i12, float f11, float f12, boolean z11, int i13) {
                MediaStoreBasePage.m68826QM(MediaStoreBasePage.this, i11, i12, f11, f12, z11, i13);
            }
        }, bVar)).m140944x(true);
        InterfaceC12275b interfaceC12275b = this.f63976f1;
        if (interfaceC12275b != null) {
            nestedScrollViewParent = interfaceC12275b.mo68937M3();
        } else {
            nestedScrollViewParent = null;
        }
        C27962a m140945y = m140944x.m140945y(nestedScrollViewParent);
        AbstractC19074t.m100207e(m140945y, "withScrollViewParent(...)");
        return m140945y;
    }

    /* renamed from: QM */
    public static final void m68826QM(MediaStoreBasePage mediaStoreBasePage, int i11, int i12, float f11, float f12, boolean z11, int i13) {
        AbstractC19074t.m100208f(mediaStoreBasePage, "this$0");
        AbstractC27964c abstractC27964c = mediaStoreBasePage.f63973c1;
        if (abstractC27964c != null) {
            abstractC27964c.m140960k(i11, i12, f11, f12, z11);
        }
    }

    /* renamed from: RM */
    private final void m68827RM() {
        MediaStoreLinearLayoutManager mediaStoreLinearLayoutManager = new MediaStoreLinearLayoutManager(this.f72421L0.m92648SI());
        this.f63961Q0 = mediaStoreLinearLayoutManager;
        mediaStoreLinearLayoutManager.m9723C2(1);
    }

    /* renamed from: TM */
    public static final void m68828TM(MediaStoreBasePage mediaStoreBasePage) {
        AbstractC19074t.m100208f(mediaStoreBasePage, "this$0");
        mediaStoreBasePage.m68863EM().mo69043H0();
    }

    /* renamed from: XM */
    private final boolean m68829XM() {
        AbstractC11859g abstractC11859g = this.f63963S0;
        if (abstractC11859g != null) {
            return abstractC11859g.m114868x();
        }
        return false;
    }

    /* renamed from: aN */
    private final void m68830aN() {
        C17487o0 mo35579p;
        ZaloView m92996E0;
        InterfaceC27218a m92676n2;
        C17487o0 mo35579p2;
        InterfaceC27218a m92676n22 = m92676n2();
        if (m92676n22 != null && (mo35579p = m92676n22.mo35579p()) != null && (m92996E0 = mo35579p.m92996E0("RolledMediaBottomSheet")) != null && (m92676n2 = m92676n2()) != null && (mo35579p2 = m92676n2.mo35579p()) != null) {
            mo35579p2.mo92702G1(m92996E0, 0);
        }
    }

    /* renamed from: hN */
    public static final void m68833hN(List list, MediaStoreBasePage mediaStoreBasePage, View view) {
        int m116580c;
        AbstractC19074t.m100208f(mediaStoreBasePage, "this$0");
        m116580c = AbstractC22543l.m116580c(0, (int) (C23793c.Companion.m124321a().mo124319c() - C31950hc.f146830a.m153641s()));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dur", m116580c);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63958o1, e11);
        }
        C31950hc.f146830a.m153638L("chat_storedmedia", 0, "msg_chat_delete_undo", list, jSONObject.toString());
        Snackbar snackbar = mediaStoreBasePage.f63984n1;
        if (snackbar != null) {
            snackbar.m90655n();
        }
        mediaStoreBasePage.m68818A();
    }

    /* renamed from: i2 */
    private final void m68834i2() {
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable);
        AbstractC19074t.m100206d(m118665N, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        StateListDrawable stateListDrawable = (StateListDrawable) m118665N;
        Drawable m118665N2 = AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent);
        Drawable m118665N3 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable);
        AbstractC19074t.m100206d(m118665N3, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        C12282i c12282i = new C12282i(stateListDrawable, m118665N2, (StateListDrawable) m118665N3, AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent), this, m68870JM().f139658r);
        c12282i.m65929g0((RobotoTextView) m68870JM().getRoot().findViewById(AbstractC6918a0.bubble_date));
        this.f63963S0 = c12282i;
    }

    /* renamed from: iN */
    public static final void m68836iN(MediaStoreBasePage mediaStoreBasePage, View view) {
        AbstractC19074t.m100208f(mediaStoreBasePage, "this$0");
        mediaStoreBasePage.m68863EM().mo69043H0();
    }

    /* renamed from: jN */
    private final void m68838jN(int i11, int i12) {
        boolean z11 = true;
        this.f63968X0 = (m68846qe() - 1) - m68819BM();
        C7226u3 c7226u3 = this.f63962R0;
        if (c7226u3 != null) {
            if (Math.abs(i12) < f63959p1) {
                z11 = false;
            }
            c7226u3.m36796F0(z11);
        }
        if (C23250w4.f112644a.m119843q()) {
            this.f63983m1.removeCallbacks(m68822HM());
            this.f63983m1.postDelayed(m68822HM(), 100L);
        }
        if (i11 != 0 || i12 != 0) {
            mo68854Aa();
        }
        View m68924vM = m68924vM(0);
        InterfaceC12276c interfaceC12276c = this.f63975e1;
        if (interfaceC12276c != null) {
            interfaceC12276c.mo68950d(m68829XM(), i11, i12, m68924vM);
        }
    }

    /* renamed from: pM */
    private final void m68844pM(AbstractC27964c.a aVar) {
        this.f63973c1 = m68895WM(aVar);
        C27962a m68825PM = m68825PM(new C12277d());
        this.f63972b1 = m68825PM;
        if (m68825PM != null) {
            m68870JM().f139658r.m9825D(m68825PM);
        }
    }

    /* renamed from: qM */
    private final void m68845qM() {
        m68870JM().f139658r.m9816A(new C12278e());
    }

    /* renamed from: qe */
    private final int m68846qe() {
        C7226u3 c7226u3 = this.f63962R0;
        if (c7226u3 != null) {
            return c7226u3.mo10003k();
        }
        return 0;
    }

    /* renamed from: rM */
    private final void m68847rM() {
        m68870JM().f139658r.m9826E(new C12279f());
    }

    /* renamed from: sM */
    private final boolean m68848sM(int i11, int i12, boolean z11) {
        boolean z12;
        C12280g c12280g;
        mo68914k1();
        if (!z11) {
            m68877ME(i11, i12);
            return false;
        }
        int m68853AM = i11 - m68853AM();
        if (Math.abs(m68853AM) <= 20) {
            m68870JM().f139658r.mo9854S1(i11);
            return true;
        }
        if (Math.abs(m68853AM) <= 100) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            c12280g = new C12280g(i12, getContext());
        } else {
            c12280g = null;
        }
        if (z12 && c12280g != null) {
            c12280g.m10244p(i11);
            MediaStoreLinearLayoutManager mediaStoreLinearLayoutManager = this.f63961Q0;
            if (mediaStoreLinearLayoutManager != null) {
                mediaStoreLinearLayoutManager.m10090H1(c12280g);
            }
            return true;
        }
        m68877ME(i11, i12);
        return false;
    }

    /* renamed from: tM */
    static /* synthetic */ boolean m68849tM(MediaStoreBasePage mediaStoreBasePage, int i11, int i12, boolean z11, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                z11 = true;
            }
            return mediaStoreBasePage.m68848sM(i11, i12, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkScrollOrSmoothScrollToIndex");
    }

    /* renamed from: uM */
    public static final void m68850uM(MediaStoreBasePage mediaStoreBasePage, SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(mediaStoreBasePage, "this$0");
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        mediaStoreBasePage.f63978h1 = null;
        InterfaceC12370i m68863EM = mediaStoreBasePage.m68863EM();
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100207e(item, "getItem(...)");
        m68863EM.mo69041DG(item);
    }

    /* renamed from: xM */
    public final C7905c m68851xM(int i11) {
        C7226u3 c7226u3 = this.f63962R0;
        if (c7226u3 != null) {
            return c7226u3.m36812h0(i11);
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: AC */
    public void mo68852AC(MediaStoreItem mediaStoreItem, boolean z11) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        AbstractC27964c abstractC27964c = this.f63973c1;
        if (abstractC27964c != null) {
            abstractC27964c.m140961l(mediaStoreItem.m40616y(), z11);
        }
    }

    /* renamed from: AM */
    public final int m68853AM() {
        MediaStoreLinearLayoutManager mediaStoreLinearLayoutManager = this.f63961Q0;
        if (mediaStoreLinearLayoutManager != null) {
            return mediaStoreLinearLayoutManager.m9740Y1();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Aa */
    public void mo68854Aa() {
        C7906d c7906d;
        try {
            int m68853AM = m68853AM();
            C7905c m68851xM = m68851xM(m68853AM);
            this.f63969Y0 = 0L;
            if (m68851xM != null) {
                c7906d = m68851xM.m40794m();
            } else {
                c7906d = null;
            }
            if (c7906d != null && c7906d.m40826o()) {
                this.f63970Z0 = true;
                C7906d.b m40819h = c7906d.m40819h();
                if (m40819h != null && m40819h.m40842b() != this.f63969Y0) {
                    m68870JM().f139659s.m69469X(c7906d, m68863EM().mo69068fj(), m68853AM);
                    this.f63969Y0 = m40819h.m40842b();
                }
            } else {
                this.f63970Z0 = false;
            }
            m68908fN(this.f63970Z0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: An */
    public void mo68855An(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "logChatType");
        AbstractC19074t.m100208f(str3, "entryPoint");
        m92649TI().m93060e2(0, JumpLinkSettingBottomView.Companion.m81043a(str, str2, str3), "JumpLinkSettingBottomView", 0, true);
    }

    /* renamed from: B7 */
    public final void m68856B7() {
        m68863EM().mo69052Lo(true);
        AbstractC23647d.m123897g("10015054");
    }

    /* renamed from: BH */
    public final boolean m68857BH() {
        return m68863EM().mo69037BH();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Bo */
    public boolean mo68858Bo() {
        return m92677nJ();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: C2 */
    public C23528a mo68859C2() {
        return m68862DM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m68905dN(new C23528a(this.f72421L0.m92648SI()));
        m68863EM().mo69051Lk(C12369h.Companion.m69542a(m92642L3()), bundle);
    }

    /* renamed from: CM */
    public final MediaStoreLinearLayoutManager m68860CM() {
        return this.f63961Q0;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Cz */
    public void mo68861Cz(MediaStoreItem mediaStoreItem, int i11) {
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        try {
            C7226u3 c7226u3 = this.f63962R0;
            if (c7226u3 != null) {
                c7226u3.m10010r(i11, mediaStoreItem);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: DM */
    protected final C23528a m68862DM() {
        C23528a c23528a = this.f63971a1;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    /* renamed from: EM */
    public InterfaceC12370i m68863EM() {
        return (InterfaceC12370i) this.f63974d1.getValue();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Eb */
    public void mo68864Eb() {
        C8009j c8009j = this.f63978h1;
        if (c8009j != null && c8009j.m92868m()) {
            c8009j.dismiss();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Ed */
    public void mo68865Ed(boolean z11, boolean z12, boolean z13) {
        try {
            C7226u3 c7226u3 = this.f63962R0;
            if (c7226u3 != null) {
                c7226u3.m36804O0(z11, false);
                c7226u3.m36803M0(z12, false);
                if (z13) {
                    mo68923ui();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30081v5 m148608c = C30081v5.m148608c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148608c, "inflate(...)");
        m68910gN(m148608c);
        m68863EM().mo69063b3();
        return m68870JM().getRoot();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: H2 */
    public void mo68866H2(AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35551H2(animationTarget, str, bundle, interfaceC30162c, i11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: H8 */
    public void mo68867H8(Bundle bundle) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(bundle, "bundle");
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.mo89694j2(RolledMediaBottomSheet.class, bundle, 0, "RolledMediaBottomSheet", 0, true);
        }
    }

    /* renamed from: IM */
    public final C7226u3 m68868IM() {
        return this.f63962R0;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Ib */
    public void mo68869Ib() {
        AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112029f, 155);
    }

    /* renamed from: JM */
    public final C30081v5 m68870JM() {
        C30081v5 c30081v5 = this.f63960P0;
        if (c30081v5 != null) {
            return c30081v5;
        }
        AbstractC19074t.m100223u("viewBinding");
        return null;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Jw */
    public void mo68871Jw(C7906d c7906d, boolean z11, int i11, boolean z12) {
        C7226u3 c7226u3;
        AbstractC19074t.m100208f(c7906d, "section");
        try {
            mo68917nz(c7906d, z12);
            while (true) {
                if (-1 < i11) {
                    C7905c m68851xM = m68851xM(i11);
                    if (m68851xM != null && m68851xM.m40798q() == 1) {
                        break;
                    } else {
                        i11--;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1 && (c7226u3 = this.f63962R0) != null) {
                c7226u3.m10010r(i11, Boolean.valueOf(z12));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Jy */
    public final boolean m68872Jy(int i11) {
        return m68863EM().mo69047Jy(i11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: K1 */
    public void mo68873K1(boolean z11) {
        MediaStoreMediaHeaderView mediaStoreMediaHeaderView = m68870JM().f139659s;
        AbstractC19074t.m100207e(mediaStoreMediaHeaderView, "stickyHeaderContainer");
        MediaStoreMediaHeaderView.m69467b0(mediaStoreMediaHeaderView, z11, false, 2, null);
        C7226u3 c7226u3 = this.f63962R0;
        if (c7226u3 != null) {
            c7226u3.m36794D0(z11);
        }
        mo68923ui();
        mo68885S9();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: KA */
    public void mo68874KA(Bundle bundle) {
        C17487o0 mo35579p;
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.mo89694j2(MediaStoreView.class, bundle, 0, null, 1, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        this.f63978h1 = null;
        this.f63979i1 = null;
    }

    /* renamed from: KM */
    public void mo68875KM(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int i11;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        int m9817A0 = recyclerView.m9817A0(view);
        int m10253b = c1899z.m10253b();
        if (m10253b > 0 && m9817A0 == m10253b - 1) {
            InterfaceC12275b interfaceC12275b = this.f63976f1;
            if (interfaceC12275b != null) {
                i11 = interfaceC12275b.mo68941p4();
            } else {
                i11 = 0;
            }
            rect.bottom = i11;
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: LB */
    public void mo68876LB(MediaStoreItem mediaStoreItem, boolean z11) {
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        C7226u3 c7226u3 = this.f63962R0;
        if (c7226u3 != null) {
            c7226u3.m36807X(mediaStoreItem, z11, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    /* renamed from: ME */
    public final void m68877ME(int i11, int i12) {
        MediaStoreLinearLayoutManager mediaStoreLinearLayoutManager = this.f63961Q0;
        if (mediaStoreLinearLayoutManager != null) {
            mediaStoreLinearLayoutManager.m9721B2(i11, i12);
        }
    }

    /* renamed from: MM */
    public final void m68878MM() {
        AbstractC11859g abstractC11859g = this.f63963S0;
        if (abstractC11859g != null) {
            abstractC11859g.mo65930u();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Ms */
    public void mo68879Ms(C3526u c3526u, EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "typeSearch");
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: NF */
    public void mo68880NF(String str, EnumC2382z enumC2382z, int i11) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        int m68853AM = m68853AM();
        int m68819BM = m68819BM();
        if (m68853AM < 0 || m68853AM > m68819BM || m68853AM > m68819BM) {
            return;
        }
        while (true) {
            C7905c m68851xM = m68851xM(m68819BM);
            if (m68851xM != null && m68851xM.m40792k() > 0) {
                C3509j0.m17722h(str, i11, enumC2382z, m68851xM.m40792k() + m68851xM.m40789h().size());
                return;
            } else if (m68819BM != m68853AM) {
                m68819BM--;
            } else {
                return;
            }
        }
    }

    /* renamed from: NM */
    public C7226u3 mo68881NM(C7226u3.b bVar) {
        AbstractC19074t.m100208f(bVar, "createMSPageAdapterParams");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C7226u3 c7226u3 = new C7226u3(m92689tK, this, bVar);
        c7226u3.m36797G0(m68863EM().mo69044Hi());
        return c7226u3;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Oi */
    public void mo68882Oi() {
        m68830aN();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Op */
    public void mo68883Op(String str, List list, C12340b.b bVar) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(list, "itemList");
        AbstractC19074t.m100208f(bVar, "listener");
        Context context = getContext();
        if (context != null) {
            KeyEventCallbackC17462c m69423d = C12340b.m69423d(context, str, list, bVar);
            this.f63979i1 = m69423d;
            if (m69423d != null) {
                m69423d.mo13822K();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: RA */
    public void mo68884RA(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Context m92648SI = m92648SI();
        if (m92648SI != null) {
            ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119768g(m92648SI, str, new SensitiveData("clipboard_copy_text_media_store", "media_store", null, 4, null), true);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: S9 */
    public void mo68885S9() {
        AbstractC11859g abstractC11859g = this.f63963S0;
        if (abstractC11859g != null) {
            abstractC11859g.m114859H(this.f63966V0, this.f63964T0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m68878MM();
    }

    /* renamed from: SM */
    public void m68886SM() {
        MultiStateView multiStateView = m68870JM().f139657q;
        multiStateView.setEnableSwapStateAnim(false);
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: x70.m
            public /* synthetic */ C29433m() {
            }

            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                MediaStoreBasePage.m68828TM(MediaStoreBasePage.this);
            }
        });
        mo68928yF(0, MultiStateView.EnumC15914e.LOADING);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Sw */
    public void mo68887Sw() {
        if (this.f63968X0 >= 0 && m68829XM()) {
            int m68846qe = m68846qe();
            MediaStoreLinearLayoutManager mediaStoreLinearLayoutManager = this.f63961Q0;
            if (mediaStoreLinearLayoutManager != null) {
                mediaStoreLinearLayoutManager.mo9756v1((m68846qe - 1) - this.f63968X0);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Tb */
    public void mo68888Tb() {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f63979i1;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            keyEventCallbackC17462c.dismiss();
        }
    }

    /* renamed from: UM */
    public abstract InterfaceC12370i mo68889UM();

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f63978h1;
        if (c8009j != null) {
            c8009j.dismiss();
        }
        this.f63978h1 = null;
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f63979i1;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
        }
        this.f63979i1 = null;
        m68925wM();
    }

    /* renamed from: VM */
    public void mo68890VM(AbstractC27964c.a aVar, C7226u3.b bVar) {
        AbstractC19074t.m100208f(aVar, "dragSelectionListener");
        AbstractC19074t.m100208f(bVar, "createMSPageAdapterParams");
        this.f63962R0 = mo68881NM(bVar);
        m68827RM();
        RecyclerView recyclerView = m68870JM().f139658r;
        recyclerView.setItemAnimator(null);
        recyclerView.setBackgroundColor(0);
        recyclerView.setVisibility(0);
        recyclerView.setLayoutManager(this.f63961Q0);
        recyclerView.setAdapter(this.f63962R0);
        recyclerView.setOverScrollMode(2);
        m68845qM();
        m68847rM();
        m68844pM(aVar);
        recyclerView.setMotionEventSplittingEnabled(false);
        m68834i2();
    }

    /* renamed from: Vh */
    public final void m68891Vh(InterfaceC12275b interfaceC12275b) {
        m68863EM().mo69060Vh(interfaceC12275b);
        this.f63976f1 = interfaceC12275b;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: W */
    public void mo68892W(C20556f c20556f) {
        AbstractC19074t.m100208f(c20556f, "file");
        AbstractC23152n3.m119036c0(this.f72421L0.m92648SI(), c20556f);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: W9 */
    public void mo68893W9(MultiStateView.EnumC15915f enumC15915f, int i11) {
        try {
            this.f63983m1.removeCallbacks(m68821GM());
            if (i11 > 0) {
                m68870JM().f139657q.setVisibility(8);
            } else if (MultiStateView.EnumC15915f.NON_ERROR == enumC15915f) {
                m68870JM().f139657q.setVisibility(8);
            } else {
                MultiStateView multiStateView = m68870JM().f139657q;
                multiStateView.setVisibility(0);
                multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                multiStateView.setErrorType(enumC15915f);
                Button buttonRetry = m68870JM().f139657q.getButtonRetry();
                if (buttonRetry != null) {
                    buttonRetry.setOnClickListener(new View.OnClickListener() { // from class: x70.p
                        public /* synthetic */ ViewOnClickListenerC29442p() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MediaStoreBasePage.m68836iN(MediaStoreBasePage.this, view);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: WB */
    public void mo68894WB(EnumC2382z enumC2382z, List list, int i11, boolean z11, boolean z12, EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC19074t.m100208f(list, "sectionList");
        AbstractC19074t.m100208f(enumC2381y, "mediaLayoutMode");
        C7226u3 c7226u3 = this.f63962R0;
        if (c7226u3 != null) {
            c7226u3.m36793C0(enumC2382z, list, i11, z11, z12, enumC2381y);
        }
        mo68923ui();
    }

    /* renamed from: WM */
    public C27969h m68895WM(AbstractC27964c.a aVar) {
        AbstractC19074t.m100208f(aVar, "dragSelectionListener");
        return new C27969h(m68870JM().f139658r, aVar);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Wi */
    public int mo68896Wi() {
        int[] iArr = new int[2];
        m68870JM().getRoot().getLocationInWindow(iArr);
        int m155405d = iArr[1] - AbstractC32226c.m155405d(m92676n2());
        if (m68870JM().f139659s.isShown()) {
            return m155405d + m68870JM().f139659s.getHeight();
        }
        return m155405d;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Wj */
    public void mo68897Wj(String str) {
        AbstractC19074t.m100208f(str, "title");
        m68870JM().f139657q.setErrorTitleString(str);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Wv */
    public boolean mo68898Wv() {
        C7226u3 c7226u3 = this.f63962R0;
        if (c7226u3 != null) {
            return c7226u3.m36806U();
        }
        return true;
    }

    /* renamed from: YM */
    public void mo68899YM(RecyclerView recyclerView, int i11) {
        try {
            if (i11 == 0) {
                C7226u3 c7226u3 = this.f63962R0;
                if (c7226u3 != null) {
                    c7226u3.m36796F0(false);
                }
                this.f63983m1.removeCallbacks(m68822HM());
                this.f63983m1.post(m68822HM());
                return;
            }
            C7226u3 c7226u32 = this.f63962R0;
            if (c7226u32 != null) {
                c7226u32.m36799I0(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Yj */
    public void mo68900Yj(long j11) {
        this.f63983m1.removeMessages(1234);
        this.f63983m1.sendEmptyMessageDelayed(1234, j11);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m68863EM().mo69050L();
    }

    /* renamed from: ZM */
    public void mo68901ZM(int i11, int i12) {
        try {
            if (m68819BM() >= m68846qe() - 3) {
                m68863EM().mo69070gv();
            }
            m68838jN(i11, i12);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: bN */
    public final void m68902bN() {
        int i11;
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.height_ms_sticky_header_view);
        InterfaceC12275b interfaceC12275b = this.f63976f1;
        if (interfaceC12275b != null) {
            i11 = interfaceC12275b.mo68945t4();
        } else {
            i11 = 0;
        }
        m68877ME(0, m118655I + i11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: c3 */
    public void mo68903c3(boolean z11) {
        if (z11) {
            mo46829Y();
        } else {
            mo49315c4();
        }
    }

    /* renamed from: cN */
    public final void m68904cN() {
        int i11;
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.height_ms_sticky_header_view);
        InterfaceC12275b interfaceC12275b = this.f63976f1;
        if (interfaceC12275b != null) {
            i11 = interfaceC12275b.mo68945t4();
        } else {
            i11 = 0;
        }
        m68849tM(this, 0, m118655I + i11, false, 5, null);
        AbstractC23647d.m123897g("10015052");
    }

    /* renamed from: dN */
    protected final void m68905dN(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f63971a1 = c23528a;
    }

    /* renamed from: dg */
    public final void m68906dg() {
        m68863EM().mo69066dg();
    }

    /* renamed from: eN */
    public void m68907eN(InterfaceC12276c interfaceC12276c) {
        m68863EM().mo69039CA(interfaceC12276c);
        this.f63975e1 = interfaceC12276c;
    }

    /* renamed from: fN */
    public void m68908fN(boolean z11) {
        int i11;
        MediaStoreMediaHeaderView mediaStoreMediaHeaderView = m68870JM().f139659s;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        mediaStoreMediaHeaderView.setVisibility(i11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: g6 */
    public void mo68909g6(String str, int i11, String str2, int i12) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "sourceParam");
        InterfaceC27218a m92692wK = this.f72421L0.m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        C31944h6.m153526K(m92692wK, str, i11, str2, i12);
    }

    /* renamed from: gN */
    protected final void m68910gN(C30081v5 c30081v5) {
        AbstractC19074t.m100208f(c30081v5, "<set-?>");
        this.f63960P0 = c30081v5;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: gb */
    public void mo68911gb() {
        C7226u3 c7226u3 = this.f63962R0;
        if (c7226u3 != null) {
            c7226u3.m36805Q0();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: ge */
    public void mo68912ge(AbstractC27964c.a aVar, C7226u3.b bVar) {
        AbstractC19074t.m100208f(aVar, "dragSelectionListener");
        AbstractC19074t.m100208f(bVar, "createMSPageAdapterParams");
        m68824OM();
        m68886SM();
        mo68890VM(aVar, bVar);
        m68870JM().getRoot().setMotionEventSplittingEnabled(false);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return m68863EM().getTrackingKey();
    }

    /* renamed from: iB */
    public final MediaStoreView.MediaStoreMultiSelectionBottomView.InterfaceC12317a m68913iB() {
        return (MediaStoreView.MediaStoreMultiSelectionBottomView.InterfaceC12317a) this.f63977g1.getValue();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: k1 */
    public void mo68914k1() {
        m68870JM().f139658r.m9866X1();
        C27962a c27962a = this.f63972b1;
        if (c27962a != null && c27962a.m140937k()) {
            c27962a.m140942t();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: ks */
    public void mo68915ks() {
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: l1 */
    public void mo68916l1(int i11) {
        int i12;
        AbstractC27964c abstractC27964c = this.f63973c1;
        if (abstractC27964c != null) {
            abstractC27964c.m140959j(i11);
        }
        C27962a c27962a = this.f63972b1;
        if (c27962a != null) {
            int m118716i0 = AbstractC23136l9.m118716i0(getContext());
            InterfaceC12275b interfaceC12275b = this.f63976f1;
            int i13 = 0;
            if (interfaceC12275b != null) {
                i12 = interfaceC12275b.mo68941p4();
            } else {
                i12 = 0;
            }
            c27962a.m140943w((m118716i0 - i12) - AbstractC23222t7.f112586t);
            InterfaceC12275b interfaceC12275b2 = this.f63976f1;
            if (interfaceC12275b2 != null) {
                i13 = interfaceC12275b2.mo68945t4();
            }
            c27962a.m140935A(i13 + AbstractC23136l9.m118655I(AbstractC16802y.height_ms_sticky_header_view) + AbstractC23222t7.f112586t);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: nz */
    public void mo68917nz(C7906d c7906d, boolean z11) {
        C7906d m40794m;
        AbstractC19074t.m100208f(c7906d, "section");
        try {
            C7905c m68851xM = m68851xM(m68853AM());
            if (m68851xM != null && (m40794m = m68851xM.m40794m()) != null && m40794m.m40826o() && c7906d == m68851xM.m40794m()) {
                m68870JM().f139659s.m69470a0(m68863EM().mo69068fj(), z11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: on */
    public boolean mo68918on() {
        return m92672lJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        m68863EM().onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        m68863EM().onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: pI */
    public void mo68919pI(C7906d c7906d, int i11) {
        AbstractC19074t.m100208f(c7906d, "section");
        int i12 = i11;
        while (true) {
            if (-1 < i12) {
                try {
                    C7905c m68851xM = m68851xM(i12);
                    if (m68851xM != null && m68851xM.m40798q() == 1) {
                        break;
                    } else {
                        i12--;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            } else {
                i12 = i11;
                break;
            }
        }
        int i13 = i12 + 1;
        int size = c7906d.m40823l().size();
        for (int i14 = i13; i14 < size; i14++) {
            C7905c m68851xM2 = m68851xM(i14);
            if (m68851xM2 != null) {
                if (m68851xM2.m40798q() == 2 || m68851xM2.m40798q() == 9 || m68851xM2.m40798q() == 8) {
                    i11 = i14;
                }
                if (m68851xM2.m40798q() == 1) {
                    break;
                }
            }
        }
        C7226u3 c7226u3 = this.f63962R0;
        if (c7226u3 != null) {
            c7226u3.m10013u(i13, i11 + 1);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: q8 */
    public void mo68920q8(Bundle bundle, int i11) {
        AbstractC19074t.m100208f(bundle, "bundle");
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        AbstractC19656s0.m103072o(m92692wK, bundle, i11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: rD */
    public void mo68921rD() {
        this.f63983m1.removeCallbacks(m68821GM());
        this.f63983m1.postDelayed(m68821GM(), 200L);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: s2 */
    public void mo68922s2(int i11) {
        C27962a c27962a = this.f63972b1;
        if (c27962a != null) {
            c27962a.m140940r(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: ui */
    public void mo68923ui() {
        this.f63983m1.removeCallbacks(m68820FM());
        this.f63983m1.post(m68820FM());
    }

    /* renamed from: vM */
    public final View m68924vM(int i11) {
        MediaStoreLinearLayoutManager mediaStoreLinearLayoutManager = this.f63961Q0;
        if (mediaStoreLinearLayoutManager != null) {
            return mediaStoreLinearLayoutManager.mo9732P(i11);
        }
        return null;
    }

    /* renamed from: wM */
    public final void m68925wM() {
        C31950hc c31950hc = C31950hc.f146830a;
        if (c31950hc.m153634E()) {
            c31950hc.m153640o();
        }
        mo68931z(false, null);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: x0 */
    public boolean mo68926x0() {
        return m92687sJ();
    }

    /* renamed from: xh */
    public final boolean m68927xh() {
        return m68863EM().mo69084xh();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: yF */
    public void mo68928yF(int i11, MultiStateView.EnumC15914e enumC15914e) {
        AbstractC19074t.m100208f(enumC15914e, "state");
        MultiStateView multiStateView = m68870JM().f139657q;
        multiStateView.setVisibility(i11);
        multiStateView.setState(enumC15914e);
    }

    /* renamed from: yM */
    public final InterfaceC12275b m68929yM() {
        return this.f63976f1;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: ys */
    public void mo68930ys(long j11) {
        this.f63983m1.removeMessages(1234);
        this.f63983m1.sendEmptyMessageDelayed(1235, j11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: z */
    public void mo68931z(boolean z11, List list) {
        String m118743r0;
        m68863EM().mo69049Kr(z11);
        if (z11) {
            if (list == null) {
                return;
            }
            int size = list.size();
            Snackbar.C16925c c16925c = Snackbar.Companion;
            View m92691vK = m92690uK().m92691vK();
            AbstractC19074t.m100207e(m92691vK, "requireView(...)");
            if (size > 1) {
                m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_snackbar_title_undo_deleting_multiple_items, Integer.valueOf(size));
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_snackbar_title_undo_deleting_single_item);
            }
            AbstractC19074t.m100205c(m118743r0);
            C31950hc c31950hc = C31950hc.f146830a;
            Snackbar m90669d = c16925c.m90669d(m92691vK, m118743r0, c31950hc.m153645x());
            this.f63984n1 = m90669d;
            if (m90669d != null) {
                m90669d.m90664z(AbstractC8020f0.str_undo, new View.OnClickListener() { // from class: x70.k

                    /* renamed from: p */
                    public final /* synthetic */ List f135996p;

                    /* renamed from: q */
                    public final /* synthetic */ MediaStoreBasePage f135997q;

                    public /* synthetic */ ViewOnClickListenerC29427k(List list2, MediaStoreBasePage this) {
                        r1 = list2;
                        r2 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaStoreBasePage.m68833hN(r1, r2, view);
                    }
                });
            }
            Snackbar snackbar = this.f63984n1;
            if (snackbar != null) {
                snackbar.m90641G(true);
            }
            Snackbar snackbar2 = this.f63984n1;
            if (snackbar2 != null) {
                snackbar2.m90640F(new C12288o());
            }
            Snackbar snackbar3 = this.f63984n1;
            if (snackbar3 != null) {
                snackbar3.m90648N();
            }
            c31950hc.m153638L("chat_storedmedia", 1, "msg_chat_delete_undo_toast", list2, null);
            return;
        }
        Snackbar snackbar4 = this.f63984n1;
        if (snackbar4 != null) {
            snackbar4.m90655n();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: z6 */
    public void mo68932z6(List list) {
        AbstractC19074t.m100208f(list, "entries");
        SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), list, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43155d(true);
        aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: x70.o

            /* renamed from: q */
            public final /* synthetic */ SimpleAdapter f136072q;

            public /* synthetic */ C29439o(SimpleAdapter simpleAdapter2) {
                r2 = simpleAdapter2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                MediaStoreBasePage.m68850uM(MediaStoreBasePage.this, r2, interfaceC17463d, i11);
            }
        });
        C8009j m43152a = aVar.m43152a();
        this.f63978h1 = m43152a;
        if (m43152a != null && !m43152a.m92868m()) {
            m43152a.mo13822K();
        }
    }

    /* renamed from: zM */
    public int m68933zM() {
        AbstractC27964c abstractC27964c = this.f63973c1;
        if (abstractC27964c != null) {
            return abstractC27964c.m140954e();
        }
        return 0;
    }
}
