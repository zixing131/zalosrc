package com.zing.zalo.p077ui.chat.contextmenu;

import ac.C0732w;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import am.C0927o;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2346f0;
import b40.C2520a;
import b40.C2526d;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import c30.C3229a;
import c30.C3255n;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.AbstractC11316a;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.chat.C11603g0;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiStickers;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent;
import com.zing.zalo.p077ui.chat.contextmenu.C11566a;
import com.zing.zalo.p077ui.chat.contextmenu.ContextMenuScrollView;
import com.zing.zalo.p077ui.chat.contextmenu.MessageContextMenuView;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.p077ui.chat.widget.popup.C11785a;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerInContextMenuView;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import com.zing.zalo.social.controls.SuggestionTimeSpan;
import com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zlottie.widget.LottieImageView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17964g1;
import dj.C17967h1;
import dj.C17969i0;
import dj.C17978l0;
import dj.C17990p0;
import dj.C18009w0;
import dj.C18013y0;
import eg0.C18427b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import if0.C20534g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kw.C21955a;
import lb0.C22423y;
import me0.AbstractC23016b;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23254w8;
import me0.AbstractC23280z4;
import me0.C23055e5;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mg.C23288a;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.C23459d;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import p019aj.C0876j;
import p056cj.C3535c;
import p105dn.EnumC18030a;
import p142ey.C18644n;
import p164fn.C19028b;
import p227i3.C20218v;
import p239ih.C20556f;
import p241ij.C20565b;
import p268ji.C21270p;
import p268ji.C21272r;
import p279jw.C21373a;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p392oh.C24261h;
import p392oh.C24265l;
import p396ol.C24302e;
import p471r3.C25630b;
import p511sw.C26394c;
import p588vw.C28644j;
import p641xd.C29583g;
import p716zh.AbstractC31990k7;
import p716zh.C31887d9;
import p716zh.C31973j5;
import p716zh.C32119t6;
import p732zy.C32592h;
import ph.C24751d;
import ph.C24753f;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import sx.EnumC26407i;
import w30.C28721i;
import w30.C28722j;
import y50.InterfaceC30793c;
import z50.C31657b;
import z50.InterfaceC31658c;

/* loaded from: classes5.dex */
public final class MessageContextMenuView extends ContentPickerPopupView implements View.OnClickListener, ChatAttachmentContainer.InterfaceC11727b, ReactionPickerView.InterfaceC13747a, InterfaceC30793c {
    public static final C11554a Companion = new C11554a(null);

    /* renamed from: t1 */
    private static final int f59695t1 = AbstractC23136l9.m118742r(348.0f);

    /* renamed from: P0 */
    private ViewGroup f59697P0;

    /* renamed from: Q0 */
    private ContextMenuScrollView f59698Q0;

    /* renamed from: R0 */
    private ViewPropertyAnimator f59699R0;

    /* renamed from: S0 */
    private ViewGroup f59700S0;

    /* renamed from: T0 */
    private AutoDismissDialogRecyclerView f59701T0;

    /* renamed from: U0 */
    private C11603g0 f59702U0;

    /* renamed from: V0 */
    private RelativeLayout f59703V0;

    /* renamed from: W0 */
    private MenuRecyclerView f59704W0;

    /* renamed from: X0 */
    private C31657b f59705X0;

    /* renamed from: Y0 */
    private ReactionPickerView f59706Y0;

    /* renamed from: Z0 */
    private C11785a f59707Z0;

    /* renamed from: a1 */
    private ChatView f59708a1;

    /* renamed from: b1 */
    private C3535c f59709b1;

    /* renamed from: c1 */
    private C17945a0 f59710c1;

    /* renamed from: d1 */
    private boolean f59711d1;

    /* renamed from: f1 */
    private String f59713f1;

    /* renamed from: g1 */
    private int f59714g1;

    /* renamed from: h1 */
    private int f59715h1;

    /* renamed from: i1 */
    private int f59716i1;

    /* renamed from: n1 */
    private Rect f59721n1;

    /* renamed from: o1 */
    private InterfaceC30793c.b f59722o1;

    /* renamed from: p1 */
    private boolean f59723p1;

    /* renamed from: q1 */
    private InterfaceC31658c f59724q1;

    /* renamed from: r1 */
    private EnumC18030a f59725r1;

    /* renamed from: s1 */
    private boolean f59726s1;

    /* renamed from: O0 */
    private final Handler f59696O0 = new HandlerC11557d(Looper.getMainLooper());

    /* renamed from: e1 */
    private ArrayList f59712e1 = new ArrayList();

    /* renamed from: j1 */
    private boolean f59717j1 = true;

    /* renamed from: k1 */
    private String f59718k1 = "";

    /* renamed from: l1 */
    private String f59719l1 = "0";

    /* renamed from: m1 */
    private int f59720m1 = -1;

    /* loaded from: classes5.dex */
    public static final class DisableNestedScrollGridLayoutManager extends GridLayoutManager {

        /* renamed from: R */
        private boolean f59727R;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisableNestedScrollGridLayoutManager(Context context, int i11) {
            super(context, i11);
            AbstractC19074t.m100208f(context, "context");
        }

        /* renamed from: h3 */
        public final void m62733h3(boolean z11) {
            this.f59727R = z11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: w1 */
        public int mo9677w1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1894u, "recycler");
            AbstractC19074t.m100208f(c1899z, "state");
            int mo9677w1 = super.mo9677w1(i11, c1894u, c1899z);
            if (!this.f59727R) {
                return mo9677w1;
            }
            return i11;
        }
    }

    /* loaded from: classes5.dex */
    public static final class MenuRecyclerView extends RecyclerView {

        /* renamed from: V0 */
        private float f59728V0;

        /* renamed from: W0 */
        private boolean f59729W0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MenuRecyclerView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC19074t.m100208f(context, "context");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            if (z11 && (getLayoutManager() instanceof DisableNestedScrollGridLayoutManager)) {
                RecyclerView.AbstractC1888o layoutManager = getLayoutManager();
                AbstractC19074t.m100206d(layoutManager, "null cannot be cast to non-null type com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView.DisableNestedScrollGridLayoutManager");
                DisableNestedScrollGridLayoutManager disableNestedScrollGridLayoutManager = (DisableNestedScrollGridLayoutManager) layoutManager;
                boolean z12 = true;
                if (!canScrollVertically(1) && !canScrollVertically(-1)) {
                    z12 = false;
                }
                disableNestedScrollGridLayoutManager.m62733h3(z12);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (this.f59728V0 > 0.0f && !this.f59729W0 && getChildCount() > 0) {
                int height = ((int) (this.f59728V0 * getChildAt(0).getHeight())) + getPaddingBottom() + getPaddingTop();
                if (height > 0 && getMeasuredHeight() != height) {
                    this.f59729W0 = true;
                    getLayoutParams().height = height;
                    setMeasuredDimension(getMeasuredWidth(), height);
                }
            }
        }

        public final void setNumberOfRows(float f11) {
            this.f59728V0 = f11;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MenuRecyclerView(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            AbstractC19074t.m100208f(context, "context");
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$a */
    /* loaded from: classes5.dex */
    public static final class C11554a {
        private C11554a() {
        }

        public /* synthetic */ C11554a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final MessageContextMenuView m62734a(EnumC18030a enumC18030a, C17945a0 c17945a0, String str, boolean z11, int i11, int i12, int i13, InterfaceC31658c interfaceC31658c, String str2, String str3, int i14) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            Bundle bundle = new Bundle();
            bundle.putInt("window_animation_type", 2);
            bundle.putSerializable("EXTRA_CHAT_MODE", enumC18030a);
            bundle.putParcelable("EXTRA_MESSAGE_ID", c17945a0.m95029V3());
            bundle.putString("EXTRA_MESSAGE_OWNER", c17945a0.mo95039W2());
            bundle.putString("EXTRA_SOURCE_ACTION", str);
            bundle.putBoolean("EXTRA_MSG_SUPPORT", z11);
            bundle.putInt("EXTRA_CHAT_ROW_Y", i11);
            bundle.putInt("EXTRA_INDEX_IN_ROW", i12);
            bundle.putInt("EXTRA_NUMBER_OF_ITEM_IN_ROW", i13);
            bundle.putString("STR_SOURCE_START_VIEW", str2);
            bundle.putString("STR_LOG_CHAT_TYPE", str3);
            bundle.putInt("INT_LOG_MSG_INDEX", i14);
            MessageContextMenuView messageContextMenuView = new MessageContextMenuView();
            messageContextMenuView.mo60305zK(bundle);
            messageContextMenuView.f59724q1 = interfaceC31658c;
            return messageContextMenuView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$b */
    /* loaded from: classes5.dex */
    public static final class C11555b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC30793c.b f59730q;

        /* renamed from: r */
        final /* synthetic */ MessageContextMenuView f59731r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11555b(InterfaceC30793c.b bVar, MessageContextMenuView messageContextMenuView) {
            super(0);
            this.f59730q = bVar;
            this.f59731r = messageContextMenuView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m62736c() {
            AbstractC0924m0.m3821fp(true);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m62737b();
            return C24848g0.f119245a;
        }

        /* renamed from: b */
        public final void m62737b() {
            CharSequence subSequence = this.f59730q.m149762f().subSequence(this.f59730q.m149761e(), this.f59730q.m149760d());
            Context m92689tK = this.f59731r.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119768g(m92689tK, subSequence, new SensitiveData("clipboard_copy_text_highlight_csc", "comm_csc", null, 4, null), true);
            this.f59731r.dismiss();
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.contextmenu.b
                @Override // java.lang.Runnable
                public final void run() {
                    MessageContextMenuView.C11555b.m62736c();
                }
            });
            C2526d c2526d = C2526d.f10270a;
            ChatView chatView = this.f59731r.f59708a1;
            ChatView chatView2 = null;
            if (chatView == null) {
                AbstractC19074t.m100223u("mChatView");
                chatView = null;
            }
            String m60004fQ = chatView.m60004fQ();
            AbstractC19074t.m100207e(m60004fQ, "getLogChatType(...)");
            c2526d.m12679G0(m60004fQ);
            if (AbstractC2346f0.m12314a(subSequence.toString())) {
                ChatView chatView3 = this.f59731r.f59708a1;
                if (chatView3 == null) {
                    AbstractC19074t.m100223u("mChatView");
                } else {
                    chatView2 = chatView3;
                }
                String m60004fQ2 = chatView2.m60004fQ();
                AbstractC19074t.m100207e(m60004fQ2, "getLogChatType(...)");
                C2526d.m12661k("csc_select_text", m60004fQ2);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$c */
    /* loaded from: classes5.dex */
    public static final class C11556c implements C17945a0.x {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f59733q;

        C11556c(C17945a0 c17945a0) {
            this.f59733q = c17945a0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m62740c(MessageContextMenuView messageContextMenuView, C17945a0 c17945a0) {
            AbstractC19074t.m100208f(messageContextMenuView, "this$0");
            AbstractC19074t.m100208f(c17945a0, "$chatContent");
            messageContextMenuView.m62688aM(c17945a0);
            messageContextMenuView.m88272c4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m62741d(MessageContextMenuView messageContextMenuView, C17945a0 c17945a0) {
            AbstractC19074t.m100208f(messageContextMenuView, "this$0");
            AbstractC19074t.m100208f(c17945a0, "$chatContent");
            messageContextMenuView.m62688aM(c17945a0);
            messageContextMenuView.m88272c4();
        }

        @Override // dj.C17945a0.x
        /* renamed from: G */
        public void mo61268G(int i11, MessageId messageId) {
        }

        @Override // dj.C17945a0.x
        /* renamed from: H */
        public void mo61269H(MessageId messageId, boolean z11) {
            final MessageContextMenuView messageContextMenuView = MessageContextMenuView.this;
            final C17945a0 c17945a0 = this.f59733q;
            AbstractC19444a.m101697e(new Runnable() { // from class: z50.y
                @Override // java.lang.Runnable
                public final void run() {
                    MessageContextMenuView.C11556c.m62740c(MessageContextMenuView.this, c17945a0);
                }
            });
        }

        @Override // dj.C17945a0.x
        /* renamed from: m */
        public void mo61273m(int i11, MessageId messageId) {
        }

        @Override // dj.C17945a0.x
        /* renamed from: s */
        public void mo61274s(MessageId messageId, String str, boolean z11) {
            final MessageContextMenuView messageContextMenuView = MessageContextMenuView.this;
            final C17945a0 c17945a0 = this.f59733q;
            AbstractC19444a.m101697e(new Runnable() { // from class: z50.z
                @Override // java.lang.Runnable
                public final void run() {
                    MessageContextMenuView.C11556c.m62741d(MessageContextMenuView.this, c17945a0);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$d */
    /* loaded from: classes5.dex */
    public static final class HandlerC11557d extends Handler {
        HandlerC11557d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            if (message.what == 0) {
                try {
                    MessageContextMenuView.this.m62732wM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$e */
    /* loaded from: classes5.dex */
    public static final class C11558e implements InterfaceC20094a {
        C11558e() {
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
            ChatView chatView = MessageContextMenuView.this.f59708a1;
            if (chatView == null) {
                AbstractC19074t.m100223u("mChatView");
                chatView = null;
            }
            chatView.mo59713L9();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$f */
    /* loaded from: classes5.dex */
    public static final class C11559f implements InterfaceC30793c.a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC30793c.a f59736a;

        /* renamed from: b */
        final /* synthetic */ MessageContextMenuView f59737b;

        C11559f(InterfaceC30793c.a aVar, MessageContextMenuView messageContextMenuView) {
            this.f59736a = aVar;
            this.f59737b = messageContextMenuView;
        }

        @Override // y50.InterfaceC30793c.a
        /* renamed from: a */
        public boolean mo61438a(ViewGroup viewGroup, float f11, float f12) {
            AbstractC19074t.m100208f(viewGroup, "view");
            boolean mo61438a = this.f59736a.mo61438a(viewGroup, f11, f12);
            if (mo61438a) {
                ContextMenuScrollView contextMenuScrollView = this.f59737b.f59698Q0;
                if (contextMenuScrollView != null) {
                    contextMenuScrollView.m62655n();
                }
                this.f59737b.m62685XL();
            }
            return mo61438a;
        }

        @Override // y50.InterfaceC30793c.a
        /* renamed from: b */
        public boolean mo61439b(ViewGroup viewGroup, float f11, float f12) {
            AbstractC19074t.m100208f(viewGroup, "view");
            return this.f59736a.mo61439b(viewGroup, f11, f12);
        }

        @Override // y50.InterfaceC30793c.a
        /* renamed from: c */
        public boolean mo61440c(ViewGroup viewGroup, float f11, float f12) {
            Rect rect;
            ContextMenuScrollView contextMenuScrollView;
            AbstractC19074t.m100208f(viewGroup, "view");
            boolean mo61440c = this.f59736a.mo61440c(viewGroup, f11, f12);
            if (mo61440c) {
                InterfaceC30793c.b bVar = this.f59737b.f59722o1;
                if (bVar == null || (rect = this.f59737b.f59721n1) == null || (contextMenuScrollView = this.f59737b.f59698Q0) == null) {
                    return true;
                }
                contextMenuScrollView.m62653k(bVar, (int) ((rect.top + f12) - contextMenuScrollView.getScrollY()));
            }
            return mo61440c;
        }

        @Override // y50.InterfaceC30793c.a
        /* renamed from: d */
        public boolean mo61441d(ViewGroup viewGroup, float f11, float f12) {
            AbstractC19074t.m100208f(viewGroup, "view");
            boolean mo61441d = this.f59736a.mo61441d(viewGroup, f11, f12);
            if (mo61441d) {
                this.f59737b.m62679RL(0L);
            }
            return mo61441d;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$g */
    /* loaded from: classes5.dex */
    public static final class C11560g extends C11603g0 {
        C11560g(ChatView chatView, C23528a c23528a, InterfaceC23792b interfaceC23792b) {
            super(chatView, c23528a, 3, interfaceC23792b);
        }

        @Override // com.zing.zalo.p077ui.chat.C11603g0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: C */
        public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            RecyclerView.AbstractC1876c0 mo9992C = super.mo9992C(viewGroup, i11);
            AbstractC19074t.m100207e(mo9992C, "onCreateViewHolder(...)");
            try {
                View view = mo9992C.f7784p;
                if (view instanceof ChatRowMultiStickers) {
                    AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.ui.chat.chatrow.ChatRowMultiStickers");
                    ((ChatRowMultiStickers) view).m61525J4(MessageContextMenuView.this.f59715h1, MessageContextMenuView.this.f59716i1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return mo9992C;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$h */
    /* loaded from: classes5.dex */
    public static final class C11561h implements AbstractC11316a.a {
        C11561h() {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: A */
        public boolean mo60394A(String str, MessageId messageId) {
            AbstractC19074t.m100208f(str, "voiceUrl");
            AbstractC19074t.m100208f(messageId, "messageId");
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: O0 */
        public void mo60395O0(int i11, String str, MessageId messageId) {
            AbstractC19074t.m100208f(str, "voiceUrl");
            AbstractC19074t.m100208f(messageId, "messageId");
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: P0 */
        public void mo60396P0(ChatRow chatRow) {
            AbstractC19074t.m100208f(chatRow, "row");
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: Q0 */
        public void mo60397Q0() {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: R0 */
        public boolean mo60398R0() {
            if (MessageContextMenuView.this.f59725r1 == EnumC18030a.SINGLE_PAGE) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: S */
        public boolean mo60399S(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "message");
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: S0 */
        public boolean mo60400S0(String str) {
            AbstractC19074t.m100208f(str, "tipId");
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: T0 */
        public void mo60401T0() {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: h0 */
        public boolean mo60402h0(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "message");
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: i0 */
        public void mo60403i0() {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: j */
        public void mo60404j(C7853b.b bVar) {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: k */
        public void mo60405k() {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: m */
        public void mo60406m(C7853b.d dVar) {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: o */
        public void mo60407o() {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: z */
        public boolean mo60408z(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "message");
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$i */
    /* loaded from: classes5.dex */
    public static final class C11562i implements ContextMenuScrollView.InterfaceC11547c {
        C11562i() {
        }

        @Override // com.zing.zalo.p077ui.chat.contextmenu.ContextMenuScrollView.InterfaceC11547c
        public void onStart() {
            MessageContextMenuView.this.m62679RL(100L);
        }

        @Override // com.zing.zalo.p077ui.chat.contextmenu.ContextMenuScrollView.InterfaceC11547c
        public void onStop() {
            MessageContextMenuView.this.m62685XL();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$j */
    /* loaded from: classes5.dex */
    public static final class C11563j implements Animator.AnimatorListener {
        C11563j() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            MessageContextMenuView.this.m62685XL();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            MessageContextMenuView.this.m62679RL(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$k */
    /* loaded from: classes5.dex */
    public static final class C11564k extends AbstractC19075u implements InterfaceC18505l {
        C11564k() {
            super(1);
        }

        /* renamed from: a */
        public final void m62742a(C20565b c20565b) {
            AbstractC19074t.m100208f(c20565b, "item");
            MessageContextMenuView messageContextMenuView = MessageContextMenuView.this;
            messageContextMenuView.m62694gM(c20565b.f101099a, messageContextMenuView.f59713f1, MessageContextMenuView.this.f59710c1);
            if (!MessageContextMenuView.this.f59726s1) {
                MessageContextMenuView.this.dismiss();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m62742a((C20565b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$l */
    /* loaded from: classes5.dex */
    public static final class C11565l extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f59743p;

        C11565l(View view) {
            this.f59743p = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LottieImageView lottieImageView;
            AbstractC19074t.m100208f(animator, "animation");
            AbstractC23136l9.m118720j1(this.f59743p, true);
            View view = this.f59743p;
            if (view instanceof LottieImageView) {
                lottieImageView = (LottieImageView) view;
            } else {
                lottieImageView = null;
            }
            if (lottieImageView != null) {
                lottieImageView.m92155v();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            this.f59743p.setVisibility(0);
            AbstractC23136l9.m118720j1(this.f59743p, false);
        }
    }

    /* renamed from: OL */
    private final void m62676OL() {
        C24751d m126650x;
        C17945a0 c17945a0 = this.f59710c1;
        String str = null;
        if (c17945a0 != null && (m126650x = C24261h.Companion.m126656b().m126650x(c17945a0.m95029V3())) != null) {
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            C24753f m128570n = m126650x.m128570n(Integer.parseInt(str2));
            if (m128570n != null) {
                str = m128570n.m128595h();
            }
        }
        this.f59706Y0 = new ReactionPickerInContextMenuView(this.f88762c0.getContext(), -1, false, str, this, "csc_msg_bubble");
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        RelativeLayout relativeLayout = this.f59703V0;
        if (relativeLayout != null) {
            relativeLayout.addView(this.f59706Y0, marginLayoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0e8c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0e96  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0dbb  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0dd4  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03dd  */
    /* renamed from: PL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ArrayList m62677PL(C17945a0 c17945a0, C3535c c3535c, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        C20534g c20534g;
        C20565b c20565b;
        C20565b c20565b2;
        C20565b c20565b3;
        String m94939L4;
        boolean m127128x;
        MessageContextMenuView messageContextMenuView;
        int m95041W4 = c17945a0.m95041W4();
        int m95089b4 = c17945a0.m95089b4();
        int m95107d3 = c17945a0.m95107d3();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Resources m92651WI = m92651WI();
        AbstractC19074t.m100207e(m92651WI, "getResources(...)");
        C20565b m106986b = C20565b.m106986b(AbstractC6918a0.default_cm_undo, m92651WI.getString(AbstractC8020f0.str_item_cm_undo_send_msg), AbstractC23322a.zds_ic_recall_line_32, AbstractC2808b.or60);
        C20565b m106985a = C20565b.m106985a(AbstractC6918a0.default_cm_tts, m92651WI.getString(AbstractC8020f0.str_item_cm_text_to_speech), AbstractC23322a.zds_ic_speaker_line_32, AbstractC2807a.accent_purple_icon);
        C28722j c28722j = C28722j.f133241a;
        m106985a.f101107i = c28722j.m143853c();
        C20565b m106985a2 = C20565b.m106985a(AbstractC6918a0.default_cm_show_vtt, AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_to_text_show), AbstractC23322a.zds_ic_voice_to_text_line_32, AbstractC2807a.accent_blue_icon);
        C20534g c20534g2 = C20534g.f100864a;
        m106985a2.f101107i = c20534g2.m106690d();
        C20565b m106985a3 = C20565b.m106985a(AbstractC6918a0.default_cm_hide_vtt, AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_to_text_hide), AbstractC23322a.zds_ic_hide_text_line_32, AbstractC2807a.accent_blue_icon);
        C20565b m106986b2 = C20565b.m106986b(AbstractC6918a0.default_cm_copy, m92651WI.getString(AbstractC8020f0.str_copy_collection_msg), AbstractC23322a.zds_ic_copy_line_32, AbstractC2808b.f150821b60);
        C20565b m106986b3 = C20565b.m106986b(AbstractC6918a0.default_cm_forward, m92651WI.getString(AbstractC8020f0.forward), AbstractC23322a.zds_ic_share_line_32, AbstractC2808b.f150820b50);
        C20565b m106986b4 = C20565b.m106986b(AbstractC6918a0.default_cm_use_speaker_for_sound, m92651WI.getString(AbstractC8020f0.str_optionM_disableInEar), AbstractC23322a.zds_ic_speaker_line_32, AbstractC2808b.f150820b50);
        C20565b m106986b5 = C20565b.m106986b(AbstractC6918a0.default_cm_use_inear_for_sound, m92651WI.getString(AbstractC8020f0.str_optionM_enableInEar), AbstractC23322a.zds_ic_speaker_line_32, AbstractC2808b.pu50);
        C20565b m106986b6 = C20565b.m106986b(AbstractC6918a0.default_cm_view_chat_details, m92651WI.getString(AbstractC8020f0.str_item_cm_view_chat_details), AbstractC23322a.zds_ic_info_circle_line_32, AbstractC2808b.ng70);
        C20565b m106986b7 = C20565b.m106986b(AbstractC6918a0.default_cm_editphoto, m92651WI.getString(AbstractC8020f0.str_preview_photo_edit), AbstractC23322a.zds_ic_edit_text_line_32, AbstractC2808b.pu60);
        C20565b m106986b8 = C20565b.m106986b(AbstractC6918a0.default_cm_delete, m92651WI.getString(AbstractC8020f0.delete), AbstractC23322a.zds_ic_delete_line_32, AbstractC2808b.f150830r60);
        C20565b m106986b9 = C20565b.m106986b(AbstractC6918a0.default_cm_resend, m92651WI.getString(AbstractC8020f0.resend), AbstractC23322a.zds_ic_retry_line_32, AbstractC2808b.ng60);
        C20565b m106986b10 = C20565b.m106986b(AbstractC6918a0.default_cm_redownload, m92651WI.getString(AbstractC8020f0.reDownload), AbstractC23322a.zds_ic_retry_line_32, AbstractC2808b.ng60);
        C20565b m106986b11 = C20565b.m106986b(AbstractC6918a0.default_cm_resyncmsg, m92651WI.getString(AbstractC8020f0.reSyncMsg), AbstractC23322a.zds_ic_retry_line_32, AbstractC2808b.ng60);
        C20565b m106986b12 = C20565b.m106986b(AbstractC6918a0.default_cm_reply, m92651WI.getString(AbstractC8020f0.str_item_cm_reply_msg), AbstractC23322a.zds_ic_reply_line_32, AbstractC2808b.pu50);
        C20565b m106986b13 = C20565b.m106986b(AbstractC6918a0.default_cm_create_topic, m92651WI.getString(AbstractC8020f0.str_action_create_topic_cm), AbstractC23322a.zds_ic_pin_line_32, AbstractC2808b.or50);
        C20565b m106986b14 = C20565b.m106986b(AbstractC6918a0.default_cm_unpin, m92651WI.getString(AbstractC8020f0.str_unpin), AbstractC23322a.zds_ic_unpin_line_32, AbstractC2808b.or50);
        C20565b m106986b15 = C20565b.m106986b(AbstractC6918a0.default_cm_save, m92651WI.getString(AbstractC8020f0.option_save), AbstractC23322a.zds_ic_download_line_32, AbstractC2808b.gr60);
        C20565b m106986b16 = C20565b.m106986b(AbstractC6918a0.default_cm_gif, m92651WI.getString(AbstractC8020f0.option_gif), AbstractC23322a.zds_ic_gif_line_32, AbstractC2808b.f150821b60);
        C20565b m106986b17 = C20565b.m106986b(AbstractC6918a0.default_cm_sticker, m92651WI.getString(AbstractC8020f0.option_sticker), AbstractC23322a.zds_ic_sticker_line_32, AbstractC2808b.or50);
        C20565b c20565b4 = new C20565b(AbstractC6918a0.default_cm_guggy, m92651WI.getString(AbstractC8020f0.option_guggy), AbstractC16803z.icn_csc_menu_sticker_n);
        C20565b m106986b18 = C20565b.m106986b(AbstractC6918a0.default_cm_reshare, m92651WI.getString(AbstractC8020f0.str_menu_item_reshare), AbstractC23322a.zds_ic_share_line_32, AbstractC2808b.f150820b50);
        C20565b m106986b19 = C20565b.m106986b(AbstractC6918a0.default_cm_remind_chat_msg, m92651WI.getString(AbstractC8020f0.str_menu_item_remind_chat_msg), AbstractC23322a.zds_ic_clock_1_line_32, AbstractC2808b.f150831r70);
        C20565b m106986b20 = C20565b.m106986b(AbstractC6918a0.default_cm_todo, m92651WI.getString(AbstractC8020f0.str_item_cm_view_chat_todo), AbstractC23322a.zds_ic_todo_line_32, AbstractC2808b.gr60);
        C20565b m106986b21 = C20565b.m106986b(AbstractC6918a0.default_cm_select_more, m92651WI.getString(AbstractC8020f0.str_cm_select_multi), AbstractC23322a.zds_ic_bubble_multiselect_line_32, AbstractC2808b.f150822b70);
        C20565b m106985a4 = C20565b.m106985a(AbstractC6918a0.report_msg, m92651WI.getString(AbstractC8020f0.str_reportabuse), AbstractC23322a.zds_ic_warning_line_32, AbstractC2807a.support_warning);
        C20565b m106986b22 = C20565b.m106986b(AbstractC6918a0.default_cm_send_to_saved_messages, m92651WI.getString(AbstractC8020f0.str_save_msg_context_menu), AbstractC23322a.zds_ic_my_cloud_line_32, AbstractC2808b.skb60);
        C20565b m106986b23 = C20565b.m106986b(AbstractC6918a0.default_cm_quick_message, m92651WI.getString(AbstractC8020f0.str_quick_message_creating_title), AbstractC23322a.zds_ic_create_quick_reply_line_32, AbstractC2808b.f150821b60);
        C20565b m106986b24 = C20565b.m106986b(AbstractC6918a0.default_cm_add_item_to_collection, m92651WI.getString(AbstractC8020f0.str_chat_context_menu_add_item_to_collection), AbstractC23322a.zds_ic_plus_circle_line_32, AbstractC2808b.skb60);
        boolean m41013q = c3535c.m17971y0().m41013q();
        boolean m41015u = c3535c.m17971y0().m41015u();
        boolean z16 = this.f59725r1 == EnumC18030a.SINGLE_USER;
        if (!z11) {
            AbstractC19074t.m100205c(m106986b8);
            linkedHashSet.add(m106986b8);
        } else {
            boolean z17 = c17945a0.m95032V6() && (m95089b4 == 2 || m95089b4 == 3 || m95089b4 == 4);
            boolean m94981Q0 = c17945a0.m94981Q0();
            boolean z18 = (m41013q || (z16 && AbstractC0924m0.m3597Y9())) && c17945a0.m94971P0();
            boolean z19 = c17945a0.m95032V6() && c17945a0.m95099c7() && !c17945a0.m95033V7();
            if (m41015u && C21373a.f104231a.m110802n()) {
                z19 = false;
            }
            boolean z21 = AbstractC23309i.m121677Zf() && (z17 || (!c17945a0.m95032V6() && (m95107d3 == 2 || m95107d3 == 5))) && (m41013q || (z16 && C18644n.m98531l().m98558u(c3535c.m17944I0())));
            boolean z22 = (C21927m.m114302u().m114357s().m153137g(c3535c.m17944I0()) || c3535c.m17971y0().m41017x()) && !c17945a0.m95032V6();
            boolean m94927K0 = c17945a0.m94927K0();
            boolean m95033V7 = c17945a0.m95033V7();
            if (!m95033V7) {
                if (c17945a0.m95032V6()) {
                    if (c17945a0.m95180k8() || m95089b4 != 0 || c17945a0.m95139g1()) {
                        if ((c17945a0.m94871D7() || c17945a0.m95316z8() || c17945a0.m95120e6()) && (!c17945a0.m95180k8() ? !(!z17 || AbstractC23041d2.m118194A(c17945a0.m94983Q3())) : !((m95107d3 != 5 || AbstractC23041d2.m118194A(c17945a0.m94983Q3())) && m95107d3 != 3))) {
                            z12 = true;
                            z13 = false;
                            z14 = false;
                            boolean z23 = (!m95033V7 || z13 || z14 || z12) ? false : true;
                            boolean z24 = !z13 && m62690cM(c17945a0);
                            boolean m94990R0 = c17945a0.m94990R0();
                            boolean z25 = m41015u && c17945a0.m94954N0() && C21373a.f104231a.m110802n();
                            boolean z26 = !m41015u && C21373a.f104231a.m110807w().m110825b();
                            boolean z27 = !c17945a0.m95250s6();
                            boolean z28 = (C32592h.f150598a.m157755b() || m95033V7 || c17945a0.m94857B8()) ? false : true;
                            boolean z29 = z21;
                            if (c28722j.m143852b() && (m94939L4 = c17945a0.m94939L4(false)) != null) {
                                m127128x = AbstractC24341v.m127128x(m94939L4);
                                if (!m127128x) {
                                    z15 = true;
                                    boolean m106694h = c20534g2.m106694h();
                                    if (m95041W4 != 0) {
                                        if (m95041W4 != 6) {
                                            if (m95041W4 == 10) {
                                                c20565b2 = m106985a;
                                                if (z24) {
                                                    AbstractC19074t.m100205c(m106986b9);
                                                    linkedHashSet.add(m106986b9);
                                                }
                                                if (m94981Q0) {
                                                    AbstractC19074t.m100205c(m106986b12);
                                                    linkedHashSet.add(m106986b12);
                                                }
                                                if (c17945a0.m94954N0()) {
                                                    AbstractC19074t.m100205c(m106986b3);
                                                    linkedHashSet.add(m106986b3);
                                                }
                                                if (z25) {
                                                    AbstractC19074t.m100205c(m106986b22);
                                                    linkedHashSet.add(m106986b22);
                                                }
                                                if (z26) {
                                                    AbstractC19074t.m100205c(m106986b24);
                                                    linkedHashSet.add(m106986b24);
                                                }
                                                if (z19) {
                                                    AbstractC19074t.m100205c(m106986b);
                                                    linkedHashSet.add(m106986b);
                                                }
                                                if (c17945a0.m94929K2() instanceof C17949b1) {
                                                    C17969i0 m94929K2 = c17945a0.m94929K2();
                                                    AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentSticker");
                                                    C25630b m95397g = ((C17949b1) m94929K2).m95397g();
                                                    if (m95397g != null && !C3255n.m16562n().m16579w(m95397g.m132427f())) {
                                                        AbstractC19074t.m100205c(m106986b17);
                                                        linkedHashSet.add(m106986b17);
                                                    }
                                                }
                                                if (z18) {
                                                    if (c17945a0.m95179k7()) {
                                                        AbstractC19074t.m100205c(m106986b14);
                                                        linkedHashSet.add(m106986b14);
                                                    } else {
                                                        AbstractC19074t.m100205c(m106986b13);
                                                        linkedHashSet.add(m106986b13);
                                                    }
                                                }
                                                if (m94990R0) {
                                                    AbstractC19074t.m100205c(m106986b21);
                                                    linkedHashSet.add(m106986b21);
                                                }
                                                if (z22) {
                                                    AbstractC19074t.m100205c(m106985a4);
                                                    linkedHashSet.add(m106985a4);
                                                }
                                                if (z27) {
                                                    AbstractC19074t.m100205c(m106986b6);
                                                    linkedHashSet.add(m106986b6);
                                                }
                                                AbstractC19074t.m100205c(m106986b8);
                                                linkedHashSet.add(m106986b8);
                                                C24848g0 c24848g0 = C24848g0.f119245a;
                                            } else if (m95041W4 == 12) {
                                                boolean z31 = true;
                                                if (z24) {
                                                    AbstractC19074t.m100205c(m106986b9);
                                                    linkedHashSet.add(m106986b9);
                                                }
                                                if (m94981Q0) {
                                                    AbstractC19074t.m100205c(m106986b12);
                                                    linkedHashSet.add(m106986b12);
                                                }
                                                if (c17945a0.m94954N0()) {
                                                    AbstractC19074t.m100205c(m106986b3);
                                                    linkedHashSet.add(m106986b3);
                                                }
                                                if (c17945a0.m94929K2() != null && c17945a0.m94929K2().f91016u != null) {
                                                    String str = c17945a0.m94929K2().f91016u;
                                                    if (!AbstractC19074t.m100204b(str, "recommened.link")) {
                                                        if (AbstractC19074t.m100204b(str, "recommened.user")) {
                                                            if (z25) {
                                                                AbstractC19074t.m100205c(m106986b22);
                                                                linkedHashSet.add(m106986b22);
                                                            }
                                                            if (z26) {
                                                                AbstractC19074t.m100205c(m106986b24);
                                                                linkedHashSet.add(m106986b24);
                                                            }
                                                            if (z19) {
                                                                AbstractC19074t.m100205c(m106986b);
                                                                linkedHashSet.add(m106986b);
                                                            }
                                                            if (c17945a0.m94929K2() instanceof C18013y0) {
                                                                C17969i0 m94929K22 = c17945a0.m94929K2();
                                                                AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentRecommend");
                                                                C17978l0 c17978l0 = ((C18013y0) m94929K22).f91253D;
                                                                if (c17978l0 != null && ((!TextUtils.isEmpty(c17978l0.f91054b) || !TextUtils.isEmpty(c17978l0.f91053a)) && m94927K0)) {
                                                                    AbstractC19074t.m100205c(m106986b2);
                                                                    linkedHashSet.add(m106986b2);
                                                                }
                                                            }
                                                            if (z18) {
                                                                if (c17945a0.m95179k7()) {
                                                                    AbstractC19074t.m100205c(m106986b14);
                                                                    linkedHashSet.add(m106986b14);
                                                                } else {
                                                                    AbstractC19074t.m100205c(m106986b13);
                                                                    linkedHashSet.add(m106986b13);
                                                                }
                                                            }
                                                            if (m94990R0) {
                                                                AbstractC19074t.m100205c(m106986b21);
                                                                linkedHashSet.add(m106986b21);
                                                            }
                                                        } else if (AbstractC19074t.m100204b(str, "recommened.vip")) {
                                                            if (z25) {
                                                                AbstractC19074t.m100205c(m106986b22);
                                                                linkedHashSet.add(m106986b22);
                                                            }
                                                            if (z26) {
                                                                AbstractC19074t.m100205c(m106986b24);
                                                                linkedHashSet.add(m106986b24);
                                                            }
                                                            if (z19) {
                                                                AbstractC19074t.m100205c(m106986b);
                                                                linkedHashSet.add(m106986b);
                                                            }
                                                            if (m94990R0) {
                                                                AbstractC19074t.m100205c(m106986b21);
                                                                linkedHashSet.add(m106986b21);
                                                            }
                                                            if (z18) {
                                                                if (c17945a0.m95179k7()) {
                                                                    AbstractC19074t.m100205c(m106986b14);
                                                                    linkedHashSet.add(m106986b14);
                                                                } else {
                                                                    AbstractC19074t.m100205c(m106986b13);
                                                                    linkedHashSet.add(m106986b13);
                                                                }
                                                            }
                                                        } else if (TextUtils.equals(str, "recommened.stickerset")) {
                                                            if (z18) {
                                                                if (c17945a0.m95179k7()) {
                                                                    AbstractC19074t.m100205c(m106986b14);
                                                                    linkedHashSet.add(m106986b14);
                                                                } else {
                                                                    AbstractC19074t.m100205c(m106986b13);
                                                                    linkedHashSet.add(m106986b13);
                                                                }
                                                            }
                                                            if (z25) {
                                                                AbstractC19074t.m100205c(m106986b22);
                                                                linkedHashSet.add(m106986b22);
                                                            }
                                                            if (z26) {
                                                                AbstractC19074t.m100205c(m106986b24);
                                                                linkedHashSet.add(m106986b24);
                                                            }
                                                            if (m94990R0) {
                                                                AbstractC19074t.m100205c(m106986b21);
                                                                linkedHashSet.add(m106986b21);
                                                            }
                                                        } else if (m94990R0) {
                                                            AbstractC19074t.m100205c(m106986b21);
                                                            linkedHashSet.add(m106986b21);
                                                        }
                                                    } else {
                                                        if (z25) {
                                                            AbstractC19074t.m100205c(m106986b22);
                                                            linkedHashSet.add(m106986b22);
                                                        }
                                                        if (z26) {
                                                            AbstractC19074t.m100205c(m106986b24);
                                                            linkedHashSet.add(m106986b24);
                                                        }
                                                        if (z19) {
                                                            AbstractC19074t.m100205c(m106986b);
                                                            linkedHashSet.add(m106986b);
                                                        }
                                                        if (m94927K0) {
                                                            AbstractC19074t.m100205c(m106986b2);
                                                            linkedHashSet.add(m106986b2);
                                                        }
                                                        if (z18) {
                                                            if (c17945a0.m95179k7()) {
                                                                AbstractC19074t.m100205c(m106986b14);
                                                                linkedHashSet.add(m106986b14);
                                                            } else {
                                                                AbstractC19074t.m100205c(m106986b13);
                                                                linkedHashSet.add(m106986b13);
                                                            }
                                                        }
                                                        if (m94990R0) {
                                                            AbstractC19074t.m100205c(m106986b21);
                                                            linkedHashSet.add(m106986b21);
                                                        }
                                                        if (z22) {
                                                            AbstractC19074t.m100205c(m106985a4);
                                                            linkedHashSet.add(m106985a4);
                                                        }
                                                        if (z28 && z31) {
                                                            AbstractC19074t.m100205c(m106986b23);
                                                            linkedHashSet.add(m106986b23);
                                                        }
                                                        if (z15) {
                                                            c20565b2 = m106985a;
                                                        } else {
                                                            AbstractC19074t.m100205c(m106985a);
                                                            c20565b2 = m106985a;
                                                            linkedHashSet.add(c20565b2);
                                                        }
                                                        if (z27) {
                                                            AbstractC19074t.m100205c(m106986b6);
                                                            linkedHashSet.add(m106986b6);
                                                        }
                                                        AbstractC19074t.m100205c(m106986b8);
                                                        linkedHashSet.add(m106986b8);
                                                        C24848g0 c24848g02 = C24848g0.f119245a;
                                                    }
                                                }
                                                z31 = false;
                                                if (z22) {
                                                }
                                                if (z28) {
                                                    AbstractC19074t.m100205c(m106986b23);
                                                    linkedHashSet.add(m106986b23);
                                                }
                                                if (z15) {
                                                }
                                                if (z27) {
                                                }
                                                AbstractC19074t.m100205c(m106986b8);
                                                linkedHashSet.add(m106986b8);
                                                C24848g0 c24848g022 = C24848g0.f119245a;
                                            } else if (m95041W4 != 26) {
                                                if (m95041W4 != 36) {
                                                    if (m95041W4 == 2) {
                                                        if (z24) {
                                                            AbstractC19074t.m100205c(m106986b9);
                                                            linkedHashSet.add(m106986b9);
                                                        }
                                                        if (z14) {
                                                            AbstractC19074t.m100205c(m106986b10);
                                                            linkedHashSet.add(m106986b10);
                                                        }
                                                        if (z12) {
                                                            AbstractC19074t.m100205c(m106986b11);
                                                            linkedHashSet.add(m106986b11);
                                                        }
                                                        if (m94981Q0) {
                                                            AbstractC19074t.m100205c(m106986b12);
                                                            linkedHashSet.add(m106986b12);
                                                        }
                                                        if (c17945a0.m94954N0()) {
                                                            AbstractC19074t.m100205c(m106986b3);
                                                            linkedHashSet.add(m106986b3);
                                                        }
                                                        if (z25) {
                                                            AbstractC19074t.m100205c(m106986b22);
                                                            linkedHashSet.add(m106986b22);
                                                        }
                                                        if (z26) {
                                                            AbstractC19074t.m100205c(m106986b24);
                                                            linkedHashSet.add(m106986b24);
                                                        }
                                                        if (z19) {
                                                            AbstractC19074t.m100205c(m106986b);
                                                            linkedHashSet.add(m106986b);
                                                        }
                                                        if (m94927K0) {
                                                            AbstractC19074t.m100205c(m106986b2);
                                                            linkedHashSet.add(m106986b2);
                                                        }
                                                        if (z18) {
                                                            if (c17945a0.m95179k7()) {
                                                                AbstractC19074t.m100205c(m106986b14);
                                                                linkedHashSet.add(m106986b14);
                                                            } else {
                                                                AbstractC19074t.m100205c(m106986b13);
                                                                linkedHashSet.add(m106986b13);
                                                            }
                                                        }
                                                        if (z23) {
                                                            AbstractC19074t.m100205c(m106986b7);
                                                            linkedHashSet.add(m106986b7);
                                                        }
                                                        if (m94990R0) {
                                                            AbstractC19074t.m100205c(m106986b21);
                                                            linkedHashSet.add(m106986b21);
                                                        }
                                                        if (z22) {
                                                            AbstractC19074t.m100205c(m106985a4);
                                                            linkedHashSet.add(m106985a4);
                                                        }
                                                        if (z27) {
                                                            AbstractC19074t.m100205c(m106986b6);
                                                            linkedHashSet.add(m106986b6);
                                                        }
                                                        AbstractC19074t.m100205c(m106986b8);
                                                        linkedHashSet.add(m106986b8);
                                                        C24848g0 c24848g03 = C24848g0.f119245a;
                                                    } else if (m95041W4 == 3 || m95041W4 == 4) {
                                                        if (z24) {
                                                            AbstractC19074t.m100205c(m106986b9);
                                                            linkedHashSet.add(m106986b9);
                                                        }
                                                        if (z14) {
                                                            AbstractC19074t.m100205c(m106986b10);
                                                            linkedHashSet.add(m106986b10);
                                                        }
                                                        if (z12) {
                                                            AbstractC19074t.m100205c(m106986b11);
                                                            linkedHashSet.add(m106986b11);
                                                        }
                                                        if (m94981Q0) {
                                                            AbstractC19074t.m100205c(m106986b12);
                                                            linkedHashSet.add(m106986b12);
                                                        }
                                                        if (c17945a0.m94954N0()) {
                                                            AbstractC19074t.m100205c(m106986b3);
                                                            linkedHashSet.add(m106986b3);
                                                        }
                                                        if (z25) {
                                                            AbstractC19074t.m100205c(m106986b22);
                                                            linkedHashSet.add(m106986b22);
                                                        }
                                                        if (z26) {
                                                            AbstractC19074t.m100205c(m106986b24);
                                                            linkedHashSet.add(m106986b24);
                                                        }
                                                        if (z19) {
                                                            AbstractC19074t.m100205c(m106986b);
                                                            linkedHashSet.add(m106986b);
                                                        }
                                                        if (m94927K0) {
                                                            AbstractC19074t.m100205c(m106986b2);
                                                            linkedHashSet.add(m106986b2);
                                                        }
                                                        if (z18) {
                                                            if (c17945a0.m95179k7()) {
                                                                AbstractC19074t.m100205c(m106986b14);
                                                                linkedHashSet.add(m106986b14);
                                                            } else {
                                                                AbstractC19074t.m100205c(m106986b13);
                                                                linkedHashSet.add(m106986b13);
                                                            }
                                                        }
                                                        if (z23) {
                                                            m106986b15.f101100b = m92651WI.getString(AbstractC8020f0.str_save_photo_context_menu);
                                                            AbstractC19074t.m100205c(m106986b15);
                                                            linkedHashSet.add(m106986b15);
                                                        }
                                                        if (z23) {
                                                            AbstractC19074t.m100205c(m106986b7);
                                                            linkedHashSet.add(m106986b7);
                                                        }
                                                        if (m94990R0) {
                                                            AbstractC19074t.m100205c(m106986b21);
                                                            linkedHashSet.add(m106986b21);
                                                        }
                                                        if (z22) {
                                                            AbstractC19074t.m100205c(m106985a4);
                                                            linkedHashSet.add(m106985a4);
                                                        }
                                                        if (z28) {
                                                            AbstractC19074t.m100205c(m106986b23);
                                                            linkedHashSet.add(m106986b23);
                                                        }
                                                        if (z15) {
                                                            AbstractC19074t.m100205c(m106985a);
                                                            c20565b2 = m106985a;
                                                            linkedHashSet.add(c20565b2);
                                                        } else {
                                                            c20565b2 = m106985a;
                                                        }
                                                        if (z27) {
                                                            AbstractC19074t.m100205c(m106986b6);
                                                            linkedHashSet.add(m106986b6);
                                                        }
                                                        AbstractC19074t.m100205c(m106986b8);
                                                        linkedHashSet.add(m106986b8);
                                                        C24848g0 c24848g04 = C24848g0.f119245a;
                                                    } else if (m95041W4 == 18) {
                                                        c20565b2 = m106985a;
                                                        if (m94981Q0) {
                                                            AbstractC19074t.m100205c(m106986b12);
                                                            linkedHashSet.add(m106986b12);
                                                        }
                                                        if (c17945a0.m94954N0()) {
                                                            AbstractC19074t.m100205c(m106986b3);
                                                            linkedHashSet.add(m106986b3);
                                                        }
                                                        if (z25) {
                                                            AbstractC19074t.m100205c(m106986b22);
                                                            linkedHashSet.add(m106986b22);
                                                        }
                                                        if (z26) {
                                                            AbstractC19074t.m100205c(m106986b24);
                                                            linkedHashSet.add(m106986b24);
                                                        }
                                                        if (z19) {
                                                            AbstractC19074t.m100205c(m106986b);
                                                            linkedHashSet.add(m106986b);
                                                        }
                                                        if (z18) {
                                                            if (c17945a0.m95179k7()) {
                                                                AbstractC19074t.m100205c(m106986b14);
                                                                linkedHashSet.add(m106986b14);
                                                            } else {
                                                                AbstractC19074t.m100205c(m106986b13);
                                                                linkedHashSet.add(m106986b13);
                                                            }
                                                        }
                                                        if (m94990R0) {
                                                            AbstractC19074t.m100205c(m106986b21);
                                                            linkedHashSet.add(m106986b21);
                                                        }
                                                        if (z22) {
                                                            AbstractC19074t.m100205c(m106985a4);
                                                            linkedHashSet.add(m106985a4);
                                                        }
                                                        if (z27) {
                                                            AbstractC19074t.m100205c(m106986b6);
                                                            linkedHashSet.add(m106986b6);
                                                        }
                                                        AbstractC19074t.m100205c(m106986b8);
                                                        linkedHashSet.add(m106986b8);
                                                        C24848g0 c24848g05 = C24848g0.f119245a;
                                                    } else if (m95041W4 != 19) {
                                                        switch (m95041W4) {
                                                            case 21:
                                                                if (m94981Q0) {
                                                                    AbstractC19074t.m100205c(m106986b12);
                                                                    linkedHashSet.add(m106986b12);
                                                                }
                                                                if (z19) {
                                                                    AbstractC19074t.m100205c(m106986b);
                                                                    linkedHashSet.add(m106986b);
                                                                }
                                                                if (z18) {
                                                                    if (c17945a0.m95179k7()) {
                                                                        AbstractC19074t.m100205c(m106986b14);
                                                                        linkedHashSet.add(m106986b14);
                                                                    } else {
                                                                        AbstractC19074t.m100205c(m106986b13);
                                                                        linkedHashSet.add(m106986b13);
                                                                    }
                                                                }
                                                                if (z27) {
                                                                    AbstractC19074t.m100205c(m106986b6);
                                                                    linkedHashSet.add(m106986b6);
                                                                }
                                                                AbstractC19074t.m100205c(m106986b8);
                                                                linkedHashSet.add(m106986b8);
                                                                if (m94990R0) {
                                                                    AbstractC19074t.m100205c(m106986b21);
                                                                    linkedHashSet.add(m106986b21);
                                                                }
                                                                if (z22) {
                                                                    AbstractC19074t.m100205c(m106985a4);
                                                                    linkedHashSet.add(m106985a4);
                                                                }
                                                                C24848g0 c24848g06 = C24848g0.f119245a;
                                                                break;
                                                            case 22:
                                                                if (z24) {
                                                                    AbstractC19074t.m100205c(m106986b9);
                                                                    linkedHashSet.add(m106986b9);
                                                                }
                                                                if (m94981Q0) {
                                                                    AbstractC19074t.m100205c(m106986b12);
                                                                    linkedHashSet.add(m106986b12);
                                                                }
                                                                if (c17945a0.m94954N0()) {
                                                                    AbstractC19074t.m100205c(m106986b3);
                                                                    linkedHashSet.add(m106986b3);
                                                                }
                                                                if (z25) {
                                                                    AbstractC19074t.m100205c(m106986b22);
                                                                    linkedHashSet.add(m106986b22);
                                                                }
                                                                if (z26) {
                                                                    AbstractC19074t.m100205c(m106986b24);
                                                                    linkedHashSet.add(m106986b24);
                                                                }
                                                                if (z19) {
                                                                    AbstractC19074t.m100205c(m106986b);
                                                                    linkedHashSet.add(m106986b);
                                                                }
                                                                if (!m95033V7 && (!c17945a0.m95032V6() || z17)) {
                                                                    String string = m92651WI.getString(AbstractC8020f0.str_save_file_context_menu);
                                                                    AbstractC19074t.m100207e(string, "getString(...)");
                                                                    if (c17945a0.m94929K2() instanceof C17990p0) {
                                                                        C17969i0 m94929K23 = c17945a0.m94929K2();
                                                                        AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
                                                                        C17990p0 c17990p0 = (C17990p0) m94929K23;
                                                                        String str2 = !TextUtils.isEmpty(c17990p0.f91115D) ? c17990p0.f91115D : "";
                                                                        if (!AbstractC31990k7.m154226g(str2) && !AbstractC31990k7.m154225f(str2)) {
                                                                            if (AbstractC31990k7.m154228i(str2)) {
                                                                                string = m92651WI.getString(AbstractC8020f0.str_save_video_context_menu);
                                                                                AbstractC19074t.m100207e(string, "getString(...)");
                                                                            }
                                                                        } else {
                                                                            string = m92651WI.getString(AbstractC8020f0.str_save_photo_context_menu);
                                                                            AbstractC19074t.m100207e(string, "getString(...)");
                                                                        }
                                                                    }
                                                                    m106986b15.f101100b = string;
                                                                    AbstractC19074t.m100205c(m106986b15);
                                                                    linkedHashSet.add(m106986b15);
                                                                }
                                                                if (z18) {
                                                                    if (c17945a0.m95179k7()) {
                                                                        AbstractC19074t.m100205c(m106986b14);
                                                                        linkedHashSet.add(m106986b14);
                                                                    } else {
                                                                        AbstractC19074t.m100205c(m106986b13);
                                                                        linkedHashSet.add(m106986b13);
                                                                    }
                                                                }
                                                                if (m94990R0) {
                                                                    AbstractC19074t.m100205c(m106986b21);
                                                                    linkedHashSet.add(m106986b21);
                                                                }
                                                                if (z22) {
                                                                    AbstractC19074t.m100205c(m106985a4);
                                                                    linkedHashSet.add(m106985a4);
                                                                }
                                                                if (z27) {
                                                                    AbstractC19074t.m100205c(m106986b6);
                                                                    linkedHashSet.add(m106986b6);
                                                                }
                                                                AbstractC19074t.m100205c(m106986b8);
                                                                linkedHashSet.add(m106986b8);
                                                                C24848g0 c24848g07 = C24848g0.f119245a;
                                                                break;
                                                            case 23:
                                                                if (z24) {
                                                                    AbstractC19074t.m100205c(m106986b9);
                                                                    linkedHashSet.add(m106986b9);
                                                                }
                                                                if (m94981Q0) {
                                                                    AbstractC19074t.m100205c(m106986b12);
                                                                    linkedHashSet.add(m106986b12);
                                                                }
                                                                if (c17945a0.m94954N0()) {
                                                                    AbstractC19074t.m100205c(m106986b3);
                                                                    linkedHashSet.add(m106986b3);
                                                                }
                                                                if (z25) {
                                                                    AbstractC19074t.m100205c(m106986b22);
                                                                    linkedHashSet.add(m106986b22);
                                                                }
                                                                if (z26) {
                                                                    AbstractC19074t.m100205c(m106986b24);
                                                                    linkedHashSet.add(m106986b24);
                                                                }
                                                                if (z19) {
                                                                    AbstractC19074t.m100205c(m106986b);
                                                                    linkedHashSet.add(m106986b);
                                                                }
                                                                AbstractC19074t.m100205c(m106986b16);
                                                                linkedHashSet.add(m106986b16);
                                                                if (z18) {
                                                                    if (c17945a0.m95179k7()) {
                                                                        AbstractC19074t.m100205c(m106986b14);
                                                                        linkedHashSet.add(m106986b14);
                                                                    } else {
                                                                        AbstractC19074t.m100205c(m106986b13);
                                                                        linkedHashSet.add(m106986b13);
                                                                    }
                                                                }
                                                                if (m94990R0) {
                                                                    AbstractC19074t.m100205c(m106986b21);
                                                                    linkedHashSet.add(m106986b21);
                                                                }
                                                                if (z22) {
                                                                    AbstractC19074t.m100205c(m106985a4);
                                                                    linkedHashSet.add(m106985a4);
                                                                }
                                                                if (z27) {
                                                                    AbstractC19074t.m100205c(m106986b6);
                                                                    linkedHashSet.add(m106986b6);
                                                                }
                                                                AbstractC19074t.m100205c(m106986b8);
                                                                linkedHashSet.add(m106986b8);
                                                                C24848g0 c24848g08 = C24848g0.f119245a;
                                                                break;
                                                            default:
                                                                switch (m95041W4) {
                                                                    case 31:
                                                                        if (z24) {
                                                                            AbstractC19074t.m100205c(m106986b9);
                                                                            linkedHashSet.add(m106986b9);
                                                                        }
                                                                        if (m94981Q0) {
                                                                            AbstractC19074t.m100205c(m106986b12);
                                                                            linkedHashSet.add(m106986b12);
                                                                        }
                                                                        if (c17945a0.m94954N0()) {
                                                                            AbstractC19074t.m100205c(m106986b3);
                                                                            linkedHashSet.add(m106986b3);
                                                                        }
                                                                        if (z25) {
                                                                            AbstractC19074t.m100205c(m106986b22);
                                                                            linkedHashSet.add(m106986b22);
                                                                        }
                                                                        if (z26) {
                                                                            AbstractC19074t.m100205c(m106986b24);
                                                                            linkedHashSet.add(m106986b24);
                                                                        }
                                                                        if (z19) {
                                                                            AbstractC19074t.m100205c(m106986b);
                                                                            linkedHashSet.add(m106986b);
                                                                        }
                                                                        if (C3229a.f13790a.m16391e()) {
                                                                            C17969i0 m94929K24 = c17945a0.m94929K2();
                                                                            C18009w0 c18009w0 = m94929K24 instanceof C18009w0 ? (C18009w0) m94929K24 : null;
                                                                            if (c18009w0 != null && c18009w0.m95786t() == 1) {
                                                                                AbstractC19074t.m100205c(m106986b17);
                                                                                linkedHashSet.add(m106986b17);
                                                                            }
                                                                        }
                                                                        if ((!c17945a0.m95032V6() || z17) && C32119t6.m155009c().m155014e(3) != null) {
                                                                            linkedHashSet.add(c20565b4);
                                                                        }
                                                                        if (z18) {
                                                                            if (c17945a0.m95179k7()) {
                                                                                AbstractC19074t.m100205c(m106986b14);
                                                                                linkedHashSet.add(m106986b14);
                                                                            } else {
                                                                                AbstractC19074t.m100205c(m106986b13);
                                                                                linkedHashSet.add(m106986b13);
                                                                            }
                                                                        }
                                                                        if (m94990R0) {
                                                                            AbstractC19074t.m100205c(m106986b21);
                                                                            linkedHashSet.add(m106986b21);
                                                                        }
                                                                        if (z22) {
                                                                            AbstractC19074t.m100205c(m106985a4);
                                                                            linkedHashSet.add(m106985a4);
                                                                        }
                                                                        if (z27) {
                                                                            AbstractC19074t.m100205c(m106986b6);
                                                                            linkedHashSet.add(m106986b6);
                                                                        }
                                                                        AbstractC19074t.m100205c(m106986b8);
                                                                        linkedHashSet.add(m106986b8);
                                                                        C24848g0 c24848g09 = C24848g0.f119245a;
                                                                        break;
                                                                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                                                        if (m94981Q0) {
                                                                            AbstractC19074t.m100205c(m106986b12);
                                                                            linkedHashSet.add(m106986b12);
                                                                        }
                                                                        if (z27) {
                                                                            AbstractC19074t.m100205c(m106986b6);
                                                                            linkedHashSet.add(m106986b6);
                                                                        }
                                                                        if (c17945a0.m95032V6()) {
                                                                            if (z19) {
                                                                                AbstractC19074t.m100205c(m106986b);
                                                                                linkedHashSet.add(m106986b);
                                                                            }
                                                                            AbstractC19074t.m100205c(m106986b8);
                                                                            linkedHashSet.add(m106986b8);
                                                                            if (z26) {
                                                                                AbstractC19074t.m100205c(m106986b24);
                                                                                linkedHashSet.add(m106986b24);
                                                                            }
                                                                            if (m94990R0) {
                                                                                AbstractC19074t.m100205c(m106986b21);
                                                                                linkedHashSet.add(m106986b21);
                                                                            }
                                                                        } else {
                                                                            if (z19) {
                                                                                AbstractC19074t.m100205c(m106986b);
                                                                                linkedHashSet.add(m106986b);
                                                                            }
                                                                            if (m94990R0) {
                                                                                AbstractC19074t.m100205c(m106986b21);
                                                                                linkedHashSet.add(m106986b21);
                                                                            }
                                                                            AbstractC19074t.m100205c(m106986b8);
                                                                            linkedHashSet.add(m106986b8);
                                                                        }
                                                                        if (z22) {
                                                                            AbstractC19074t.m100205c(m106985a4);
                                                                            linkedHashSet.add(m106985a4);
                                                                        }
                                                                        C24848g0 c24848g010 = C24848g0.f119245a;
                                                                        break;
                                                                    case 33:
                                                                        break;
                                                                    case 34:
                                                                        if (m94981Q0) {
                                                                            AbstractC19074t.m100205c(m106986b12);
                                                                            linkedHashSet.add(m106986b12);
                                                                        }
                                                                        if (z19) {
                                                                            AbstractC19074t.m100205c(m106986b);
                                                                            linkedHashSet.add(m106986b);
                                                                        }
                                                                        if (z18) {
                                                                            if (c17945a0.m95179k7()) {
                                                                                AbstractC19074t.m100205c(m106986b14);
                                                                                linkedHashSet.add(m106986b14);
                                                                            } else {
                                                                                AbstractC19074t.m100205c(m106986b13);
                                                                                linkedHashSet.add(m106986b13);
                                                                            }
                                                                        }
                                                                        AbstractC19074t.m100205c(m106986b8);
                                                                        linkedHashSet.add(m106986b8);
                                                                        if (m94990R0) {
                                                                            AbstractC19074t.m100205c(m106986b21);
                                                                            linkedHashSet.add(m106986b21);
                                                                        }
                                                                        if (z22) {
                                                                            AbstractC19074t.m100205c(m106985a4);
                                                                            linkedHashSet.add(m106985a4);
                                                                        }
                                                                        C24848g0 c24848g011 = C24848g0.f119245a;
                                                                        break;
                                                                    default:
                                                                        if (m94981Q0) {
                                                                            AbstractC19074t.m100205c(m106986b12);
                                                                            linkedHashSet.add(m106986b12);
                                                                        }
                                                                        if (c17945a0.m94954N0()) {
                                                                            AbstractC19074t.m100205c(m106986b3);
                                                                            linkedHashSet.add(m106986b3);
                                                                        }
                                                                        if (z25) {
                                                                            AbstractC19074t.m100205c(m106986b22);
                                                                            linkedHashSet.add(m106986b22);
                                                                        }
                                                                        if (z26) {
                                                                            AbstractC19074t.m100205c(m106986b24);
                                                                            linkedHashSet.add(m106986b24);
                                                                        }
                                                                        if (z19) {
                                                                            AbstractC19074t.m100205c(m106986b);
                                                                            linkedHashSet.add(m106986b);
                                                                        }
                                                                        if (m94927K0) {
                                                                            AbstractC19074t.m100205c(m106986b2);
                                                                            linkedHashSet.add(m106986b2);
                                                                        }
                                                                        if (z18) {
                                                                            if (c17945a0.m95179k7()) {
                                                                                AbstractC19074t.m100205c(m106986b14);
                                                                                linkedHashSet.add(m106986b14);
                                                                            } else {
                                                                                AbstractC19074t.m100205c(m106986b13);
                                                                                linkedHashSet.add(m106986b13);
                                                                            }
                                                                        }
                                                                        if (m94990R0) {
                                                                            AbstractC19074t.m100205c(m106986b21);
                                                                            linkedHashSet.add(m106986b21);
                                                                        }
                                                                        if (z22) {
                                                                            AbstractC19074t.m100205c(m106985a4);
                                                                            linkedHashSet.add(m106985a4);
                                                                        }
                                                                        if (z27) {
                                                                            AbstractC19074t.m100205c(m106986b6);
                                                                            linkedHashSet.add(m106986b6);
                                                                        }
                                                                        AbstractC19074t.m100205c(m106986b8);
                                                                        linkedHashSet.add(m106986b8);
                                                                        C24848g0 c24848g012 = C24848g0.f119245a;
                                                                        break;
                                                                }
                                                        }
                                                    } else {
                                                        if (z24) {
                                                            AbstractC19074t.m100205c(m106986b9);
                                                            linkedHashSet.add(m106986b9);
                                                        }
                                                        if (m94981Q0) {
                                                            AbstractC19074t.m100205c(m106986b12);
                                                            linkedHashSet.add(m106986b12);
                                                        }
                                                        if (c17945a0.m94954N0()) {
                                                            AbstractC19074t.m100205c(m106986b3);
                                                            linkedHashSet.add(m106986b3);
                                                        }
                                                        if (z25) {
                                                            AbstractC19074t.m100205c(m106986b22);
                                                            linkedHashSet.add(m106986b22);
                                                        }
                                                        if (z26) {
                                                            AbstractC19074t.m100205c(m106986b24);
                                                            linkedHashSet.add(m106986b24);
                                                        }
                                                        if (z19) {
                                                            AbstractC19074t.m100205c(m106986b);
                                                            linkedHashSet.add(m106986b);
                                                        }
                                                        if (z18) {
                                                            if (c17945a0.m95179k7()) {
                                                                AbstractC19074t.m100205c(m106986b14);
                                                                linkedHashSet.add(m106986b14);
                                                            } else {
                                                                AbstractC19074t.m100205c(m106986b13);
                                                                linkedHashSet.add(m106986b13);
                                                            }
                                                        }
                                                        if (!m95033V7 && !c17945a0.m95288w8()) {
                                                            m106986b15.f101100b = m92651WI.getString(AbstractC8020f0.str_save_video_context_menu);
                                                            AbstractC19074t.m100205c(m106986b15);
                                                            linkedHashSet.add(m106986b15);
                                                        }
                                                        if (m94990R0) {
                                                            AbstractC19074t.m100205c(m106986b21);
                                                            linkedHashSet.add(m106986b21);
                                                        }
                                                        if (z22) {
                                                            AbstractC19074t.m100205c(m106985a4);
                                                            linkedHashSet.add(m106985a4);
                                                        }
                                                        if (z15) {
                                                            AbstractC19074t.m100205c(m106985a);
                                                            c20565b2 = m106985a;
                                                            linkedHashSet.add(c20565b2);
                                                        } else {
                                                            c20565b2 = m106985a;
                                                        }
                                                        if (z27) {
                                                            AbstractC19074t.m100205c(m106986b6);
                                                            linkedHashSet.add(m106986b6);
                                                        }
                                                        AbstractC19074t.m100205c(m106986b8);
                                                        linkedHashSet.add(m106986b8);
                                                        C24848g0 c24848g013 = C24848g0.f119245a;
                                                    }
                                                }
                                                AbstractC19074t.m100205c(m106986b8);
                                                linkedHashSet.add(m106986b8);
                                                AbstractC19074t.m100205c(m106986b21);
                                                linkedHashSet.add(m106986b21);
                                                C24848g0 c24848g014 = C24848g0.f119245a;
                                            } else {
                                                AbstractC19074t.m100205c(m106986b18);
                                                linkedHashSet.add(m106986b18);
                                                if (c17945a0.m95179k7()) {
                                                    AbstractC19074t.m100205c(m106986b14);
                                                    linkedHashSet.add(m106986b14);
                                                } else {
                                                    AbstractC19074t.m100205c(m106986b13);
                                                    linkedHashSet.add(m106986b13);
                                                }
                                                if (z27) {
                                                    AbstractC19074t.m100205c(m106986b6);
                                                    linkedHashSet.add(m106986b6);
                                                }
                                                C24848g0 c24848g015 = C24848g0.f119245a;
                                            }
                                            c20534g = c20534g2;
                                            c20565b = m106985a2;
                                        } else {
                                            if (z24) {
                                                AbstractC19074t.m100205c(m106986b9);
                                                linkedHashSet.add(m106986b9);
                                            }
                                            if (z14) {
                                                AbstractC19074t.m100205c(m106986b10);
                                                linkedHashSet.add(m106986b10);
                                            }
                                            if (z12) {
                                                AbstractC19074t.m100205c(m106986b11);
                                                linkedHashSet.add(m106986b11);
                                            }
                                            if (m94981Q0) {
                                                AbstractC19074t.m100205c(m106986b12);
                                                linkedHashSet.add(m106986b12);
                                            }
                                            if (c17945a0.m94954N0()) {
                                                AbstractC19074t.m100205c(m106986b3);
                                                linkedHashSet.add(m106986b3);
                                            }
                                            if (z25) {
                                                AbstractC19074t.m100205c(m106986b22);
                                                linkedHashSet.add(m106986b22);
                                            }
                                            if (z26) {
                                                AbstractC19074t.m100205c(m106986b24);
                                                linkedHashSet.add(m106986b24);
                                            }
                                            if (z19) {
                                                AbstractC19074t.m100205c(m106986b);
                                                linkedHashSet.add(m106986b);
                                            }
                                            if (m94927K0) {
                                                AbstractC19074t.m100205c(m106986b2);
                                                linkedHashSet.add(m106986b2);
                                            }
                                            if (z18) {
                                                if (c17945a0.m95179k7()) {
                                                    AbstractC19074t.m100205c(m106986b14);
                                                    linkedHashSet.add(m106986b14);
                                                } else {
                                                    AbstractC19074t.m100205c(m106986b13);
                                                    linkedHashSet.add(m106986b13);
                                                }
                                            }
                                            if (z23) {
                                                C20565b c20565b5 = AbstractC23309i.m121977hc() ? m106986b5 : m106986b4;
                                                AbstractC19074t.m100205c(c20565b5);
                                                linkedHashSet.add(c20565b5);
                                                m106986b15.f101100b = m92651WI.getString(AbstractC8020f0.str_save_voice_context_menu);
                                                AbstractC19074t.m100205c(m106986b15);
                                                linkedHashSet.add(m106986b15);
                                            }
                                            if (m94990R0) {
                                                AbstractC19074t.m100205c(m106986b21);
                                                linkedHashSet.add(m106986b21);
                                            }
                                            if (z22) {
                                                AbstractC19074t.m100205c(m106985a4);
                                                linkedHashSet.add(m106985a4);
                                            }
                                            if (m106694h) {
                                                C17969i0 m94929K25 = c17945a0.m94929K2();
                                                C17964g1 c17964g1 = m94929K25 instanceof C17964g1 ? (C17964g1) m94929K25 : null;
                                                String m95538p = c17964g1 != null ? c17964g1.m95538p() : null;
                                                if (m95538p != null && m95538p.length() != 0) {
                                                    AbstractC19074t.m100205c(m106985a3);
                                                    linkedHashSet.add(m106985a3);
                                                } else {
                                                    AbstractC19074t.m100205c(m106985a2);
                                                    c20565b3 = m106985a2;
                                                    linkedHashSet.add(c20565b3);
                                                    if (z27) {
                                                        AbstractC19074t.m100205c(m106986b6);
                                                        linkedHashSet.add(m106986b6);
                                                    }
                                                    AbstractC19074t.m100205c(m106986b8);
                                                    linkedHashSet.add(m106986b8);
                                                    C24848g0 c24848g016 = C24848g0.f119245a;
                                                    c20534g = c20534g2;
                                                    c20565b = c20565b3;
                                                    c20565b2 = m106985a;
                                                }
                                            }
                                            c20565b3 = m106985a2;
                                            if (z27) {
                                            }
                                            AbstractC19074t.m100205c(m106986b8);
                                            linkedHashSet.add(m106986b8);
                                            C24848g0 c24848g0162 = C24848g0.f119245a;
                                            c20534g = c20534g2;
                                            c20565b = c20565b3;
                                            c20565b2 = m106985a;
                                        }
                                    } else {
                                        c20534g = c20534g2;
                                        c20565b = m106985a2;
                                        if (z24) {
                                            AbstractC19074t.m100205c(m106986b9);
                                            linkedHashSet.add(m106986b9);
                                        }
                                        if (m94981Q0) {
                                            AbstractC19074t.m100205c(m106986b12);
                                            linkedHashSet.add(m106986b12);
                                        }
                                        if (c17945a0.m94954N0()) {
                                            AbstractC19074t.m100205c(m106986b3);
                                            linkedHashSet.add(m106986b3);
                                        }
                                        if (z25) {
                                            AbstractC19074t.m100205c(m106986b22);
                                            linkedHashSet.add(m106986b22);
                                        }
                                        if (z26) {
                                            AbstractC19074t.m100205c(m106986b24);
                                            linkedHashSet.add(m106986b24);
                                        }
                                        if (z19) {
                                            AbstractC19074t.m100205c(m106986b);
                                            linkedHashSet.add(m106986b);
                                        }
                                        if (m94927K0) {
                                            AbstractC19074t.m100205c(m106986b2);
                                            linkedHashSet.add(m106986b2);
                                        }
                                        if (z18) {
                                            if (c17945a0.m95179k7()) {
                                                AbstractC19074t.m100205c(m106986b14);
                                                linkedHashSet.add(m106986b14);
                                            } else {
                                                AbstractC19074t.m100205c(m106986b13);
                                                linkedHashSet.add(m106986b13);
                                            }
                                        }
                                        AbstractC19074t.m100205c(m106986b19);
                                        linkedHashSet.add(m106986b19);
                                        if (z29) {
                                            AbstractC19074t.m100205c(m106986b20);
                                            linkedHashSet.add(m106986b20);
                                        }
                                        if (m94990R0) {
                                            AbstractC19074t.m100205c(m106986b21);
                                            linkedHashSet.add(m106986b21);
                                        }
                                        if (z22) {
                                            AbstractC19074t.m100205c(m106985a4);
                                            linkedHashSet.add(m106985a4);
                                        }
                                        if (z28) {
                                            AbstractC19074t.m100205c(m106986b23);
                                            linkedHashSet.add(m106986b23);
                                        }
                                        if (z15) {
                                            AbstractC19074t.m100205c(m106985a);
                                            c20565b2 = m106985a;
                                            linkedHashSet.add(c20565b2);
                                        } else {
                                            c20565b2 = m106985a;
                                        }
                                        if (z27) {
                                            AbstractC19074t.m100205c(m106986b6);
                                            linkedHashSet.add(m106986b6);
                                        }
                                        AbstractC19074t.m100205c(m106986b8);
                                        linkedHashSet.add(m106986b8);
                                        C24848g0 c24848g017 = C24848g0.f119245a;
                                    }
                                    if (linkedHashSet.contains(c20565b2)) {
                                        messageContextMenuView = this;
                                    } else {
                                        messageContextMenuView = this;
                                        C28721i.f133240a.m143850c(messageContextMenuView.f59719l1);
                                    }
                                    if (linkedHashSet.contains(c20565b)) {
                                        c20534g.m106700o(messageContextMenuView.f59719l1);
                                    }
                                    return new ArrayList(linkedHashSet);
                                }
                            }
                            z15 = false;
                            boolean m106694h2 = c20534g2.m106694h();
                            if (m95041W4 != 0) {
                            }
                            if (linkedHashSet.contains(c20565b2)) {
                            }
                            if (linkedHashSet.contains(c20565b)) {
                            }
                            return new ArrayList(linkedHashSet);
                        }
                    } else {
                        z12 = false;
                        z13 = true;
                        z14 = false;
                        if (!m95033V7) {
                        }
                        if (z13) {
                        }
                        boolean m94990R02 = c17945a0.m94990R0();
                        if (m41015u) {
                        }
                        if (m41015u) {
                        }
                        boolean z272 = !c17945a0.m95250s6();
                        if (C32592h.f150598a.m157755b()) {
                        }
                        boolean z292 = z21;
                        if (c28722j.m143852b()) {
                            m127128x = AbstractC24341v.m127128x(m94939L4);
                            if (!m127128x) {
                            }
                        }
                        z15 = false;
                        boolean m106694h22 = c20534g2.m106694h();
                        if (m95041W4 != 0) {
                        }
                        if (linkedHashSet.contains(c20565b2)) {
                        }
                        if (linkedHashSet.contains(c20565b)) {
                        }
                        return new ArrayList(linkedHashSet);
                    }
                } else if ((c17945a0.m94871D7() || c17945a0.m95316z8() || c17945a0.m95120e6()) && ((m95107d3 == 5 && !AbstractC23041d2.m118194A(c17945a0.m94983Q3())) || m95107d3 == 3)) {
                    z12 = false;
                    z13 = false;
                    z14 = true;
                    if (!m95033V7) {
                    }
                    if (z13) {
                    }
                    boolean m94990R022 = c17945a0.m94990R0();
                    if (m41015u) {
                    }
                    if (m41015u) {
                    }
                    boolean z2722 = !c17945a0.m95250s6();
                    if (C32592h.f150598a.m157755b()) {
                    }
                    boolean z2922 = z21;
                    if (c28722j.m143852b()) {
                    }
                    z15 = false;
                    boolean m106694h222 = c20534g2.m106694h();
                    if (m95041W4 != 0) {
                    }
                    if (linkedHashSet.contains(c20565b2)) {
                    }
                    if (linkedHashSet.contains(c20565b)) {
                    }
                    return new ArrayList(linkedHashSet);
                }
            }
            z12 = false;
            z13 = false;
            z14 = false;
            if (!m95033V7) {
            }
            if (z13) {
            }
            boolean m94990R0222 = c17945a0.m94990R0();
            if (m41015u) {
            }
            if (m41015u) {
            }
            boolean z27222 = !c17945a0.m95250s6();
            if (C32592h.f150598a.m157755b()) {
            }
            boolean z29222 = z21;
            if (c28722j.m143852b()) {
            }
            z15 = false;
            boolean m106694h2222 = c20534g2.m106694h();
            if (m95041W4 != 0) {
            }
            if (linkedHashSet.contains(c20565b2)) {
            }
            if (linkedHashSet.contains(c20565b)) {
            }
            return new ArrayList(linkedHashSet);
        }
        c20565b2 = m106985a;
        c20534g = c20534g2;
        c20565b = m106985a2;
        if (linkedHashSet.contains(c20565b2)) {
        }
        if (linkedHashSet.contains(c20565b)) {
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: QL */
    private final C11785a m62678QL(InterfaceC30793c.b bVar) {
        List m131496e;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_collection_msg);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        C11785a.b bVar2 = new C11785a.b(m118743r0, new C11555b(bVar, this));
        ViewGroup viewGroup = this.f59697P0;
        if (viewGroup == null) {
            AbstractC19074t.m100223u("mRootView");
            viewGroup = null;
        }
        m131496e = AbstractC25366r.m131496e(bVar2);
        return new C11785a(viewGroup, m131496e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RL */
    public final void m62679RL(long j11) {
        C11785a c11785a = this.f59707Z0;
        if (c11785a != null) {
            c11785a.m65569f(j11);
        }
    }

    /* renamed from: SL */
    private final void m62680SL() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: z50.j
            @Override // java.lang.Runnable
            public final void run() {
                MessageContextMenuView.m62681TL(MessageContextMenuView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TL */
    public static final void m62681TL(final MessageContextMenuView messageContextMenuView) {
        Context context;
        MenuRecyclerView menuRecyclerView;
        ViewGroup.LayoutParams layoutParams;
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        try {
            MenuRecyclerView menuRecyclerView2 = messageContextMenuView.f59704W0;
            if (menuRecyclerView2 != null) {
                context = menuRecyclerView2.getContext();
            } else {
                context = null;
            }
            if (context != null && (menuRecyclerView = messageContextMenuView.f59704W0) != null && (layoutParams = menuRecyclerView.getLayoutParams()) != null) {
                int i11 = layoutParams.width;
                C11566a c11566a = C11566a.f59744a;
                final C11566a.a m62754j = c11566a.m62754j(messageContextMenuView.f59710c1);
                final View m62753e = c11566a.m62753e(context, i11, m62754j);
                if (m62753e == null) {
                    return;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: z50.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageContextMenuView.m62682UL(MessageContextMenuView.this, m62753e, m62754j);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UL */
    public static final void m62682UL(final MessageContextMenuView messageContextMenuView, final View view, final C11566a.a aVar) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        AbstractC19074t.m100208f(view, "$onboardView");
        AbstractC19074t.m100208f(aVar, "$type");
        ViewGroup viewGroup = messageContextMenuView.f59700S0;
        if (viewGroup == null) {
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: z50.n
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                MessageContextMenuView.m62683VL(MessageContextMenuView.this, view, aVar, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        viewGroup.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VL */
    public static final void m62683VL(final MessageContextMenuView messageContextMenuView, final View view, final C11566a.a aVar, View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        AbstractC19074t.m100208f(view, "$onboardView");
        AbstractC19074t.m100208f(aVar, "$type");
        if (!messageContextMenuView.f59723p1 && i12 != i14) {
            messageContextMenuView.f59723p1 = true;
            AbstractC19444a.m101694b(new Runnable() { // from class: z50.o
                @Override // java.lang.Runnable
                public final void run() {
                    MessageContextMenuView.m62684WL(MessageContextMenuView.this, view, aVar);
                }
            }, 250L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WL */
    public static final void m62684WL(MessageContextMenuView messageContextMenuView, View view, C11566a.a aVar) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        AbstractC19074t.m100208f(view, "$onboardView");
        AbstractC19074t.m100208f(aVar, "$type");
        messageContextMenuView.m62719uM(view, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XL */
    public final void m62685XL() {
        C11785a c11785a;
        InterfaceC30793c.b bVar = this.f59722o1;
        if (bVar != null && (c11785a = this.f59707Z0) != null) {
            c11785a.m65570o(bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* renamed from: YL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m62686YL(C17945a0 c17945a0, String str) {
        String str2;
        boolean m127120J;
        String m95283w2 = c17945a0.m95283w2(false, false);
        boolean m94893G1 = c17945a0.m94893G1(str);
        if (Build.VERSION.SDK_INT < 29) {
            if (m94893G1 && !TextUtils.equals(str, m95283w2)) {
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                String m104827E = AbstractC20130d.m104827E();
                AbstractC19074t.m100207e(m104827E, "getDownloadFolderDirectory(...)");
                String lowerCase2 = m104827E.toLowerCase(locale);
                AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
                m127120J = AbstractC24341v.m127120J(lowerCase, lowerCase2, false, 2, null);
                if (m127120J) {
                    m95283w2 = str;
                }
            }
            if (!TextUtils.equals(str, m95283w2) && c17945a0.m94893G1(m95283w2)) {
                AbstractC19074t.m100205c(m95283w2);
                if (!m94893G1) {
                    AbstractC19074t.m100205c(m95283w2);
                    c17945a0.m95147gc(m95283w2, false, false);
                    m94893G1 = true;
                }
                C17969i0 m94929K2 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
                C17990p0 c17990p0 = (C17990p0) m94929K2;
                if (m94893G1) {
                    C2526d c2526d = C2526d.f10270a;
                    MessageId m95029V3 = c17945a0.m95029V3();
                    AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                    c2526d.m12729v(m95029V3, this.f59720m1, "csc_msgmenu", this.f59719l1);
                    c17945a0.m95214o2(true, false);
                } else {
                    String m95667h = c17990p0.m95667h();
                    String str3 = c17990p0.f91115D;
                    AbstractC19074t.m100207e(str3, "mFileExt");
                    if (str3.length() > 0) {
                        str2 = "." + c17990p0.f91115D;
                    } else {
                        str2 = "";
                    }
                    String str4 = m95667h + str2;
                    boolean z11 = !TextUtils.isEmpty(c17945a0.m94929K2().f91013r);
                    C17969i0 m94929K22 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
                    String str5 = ((C17990p0) m94929K22).f91115D;
                    SensitiveData sensitiveData = new SensitiveData("gallery_save_media_from_popup_csc", "comm_csc", null, 4, null);
                    if (z11 && (AbstractC31990k7.m154226g(str5) || AbstractC31990k7.m154225f(str5))) {
                        c17945a0.m95056X9(m95283w2, str4, true, true, sensitiveData);
                    } else if (z11 && AbstractC31990k7.m154228i(str5)) {
                        c17945a0.m95093ba(m95283w2, str4, true, true, sensitiveData);
                    } else {
                        String m120300L = AbstractC23280z4.m120300L(m95283w2, str4, true, sensitiveData);
                        if (AbstractC23254w8.m119859g(m120300L)) {
                            m120300L = new C20556f(m120300L).m106843p();
                        }
                        if (m120300L != null && m120300L.length() > 0) {
                            C19067n0 c19067n0 = C19067n0.f94947a;
                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.browser_download_message_download_finished);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m120300L}, 1));
                            AbstractC19074t.m100207e(format, "format(...)");
                            ToastUtils.showMess(format);
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.browser_download_notification_download_complete));
                        }
                    }
                    C2526d.f10270a.m12689M(this.f59710c1, this.f59720m1, "csc_msgmenu", this.f59719l1);
                }
                C23744a.Companion.m124119a().m124116d(6, c17945a0.m95029V3());
            }
        }
        m95283w2 = str;
        C17969i0 m94929K23 = c17945a0.m94929K2();
        AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
        C17990p0 c17990p02 = (C17990p0) m94929K23;
        if (m94893G1) {
        }
        C23744a.Companion.m124119a().m124116d(6, c17945a0.m95029V3());
    }

    /* renamed from: ZL */
    private final void m62687ZL(C17945a0 c17945a0) {
        m88271Y();
        if (TextUtils.isEmpty(c17945a0.m94983Q3()) && C24302e.Companion.m126923n()) {
            if (!c17945a0.m94871D7() && !c17945a0.m95120e6()) {
                m62688aM(c17945a0);
                m88272c4();
                return;
            } else {
                c17945a0.m94859Bb(new C11556c(c17945a0));
                c17945a0.m94891Fa(true);
                c17945a0.m94980Pb(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94843p, false, false, 6, null), true);
                return;
            }
        }
        m62688aM(c17945a0);
        m88272c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aM */
    public final void m62688aM(final C17945a0 c17945a0) {
        SensitiveData sensitiveData = new SensitiveData("gallery_save_media_from_popup_csc", "comm_csc", null, 4, null);
        if (c17945a0.m94871D7()) {
            if (c17945a0.m94864C6()) {
                c17945a0.m95222p2(true, sensitiveData);
            } else {
                c17945a0.m95231q2(true, sensitiveData);
            }
            C2526d.f10270a.m12689M(this.f59710c1, this.f59720m1, "csc_msgmenu", this.f59719l1);
        } else if (c17945a0.m95306y8()) {
            c17945a0.m95084aa(true, sensitiveData);
            C2526d.f10270a.m12689M(this.f59710c1, this.f59720m1, "csc_msgmenu", this.f59719l1);
        } else if (c17945a0.m95276v6()) {
            C23288a c23288a = C23288a.f113033a;
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            c23288a.mo13474a(new C18427b(mo95039W2, 0, new Runnable() { // from class: z50.p
                @Override // java.lang.Runnable
                public final void run() {
                    MessageContextMenuView.m62689bM(C17945a0.this, this);
                }
            }, 2, null));
        }
        if (c17945a0.m95316z8()) {
            c17945a0.m95102ca(this.f59720m1, this.f59719l1, Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public static final void m62689bM(C17945a0 c17945a0, MessageContextMenuView messageContextMenuView) {
        boolean m127120J;
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        try {
            String m94983Q3 = c17945a0.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            m127120J = AbstractC24341v.m127120J(m94983Q3, C20131e.m104909A(), false, 2, null);
            if (m127120J) {
                c17945a0.m95194m2(m94983Q3, true);
            } else {
                messageContextMenuView.m62686YL(c17945a0, m94983Q3);
            }
        } catch (Exception e11) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: cM */
    private final boolean m62690cM(C17945a0 c17945a0) {
        if (c17945a0 != null) {
            C31973j5 m4473g = C0943w.m4462l().m4473g(c17945a0.m94853B3());
            if (m4473g != null) {
                if (!m4473g.m153764i0() || m4473g.m153742T()) {
                    return true;
                }
                return false;
            }
            if (this.f59725r1 == EnumC18030a.SINGLE_USER && !C18644n.m98531l().m98558u(c17945a0.mo95039W2())) {
                C29583g c29583g = C29583g.f136521a;
                AbstractC19074t.m100207e(c17945a0.mo95039W2(), "getOwnerId(...)");
                return !c29583g.m146999m(r4);
            }
        }
        return true;
    }

    /* renamed from: dM */
    private final void m62691dM() {
        MessageId messageId;
        EnumC18030a enumC18030a;
        Serializable serializable;
        Object parcelable;
        Bundle m92642L3 = this.f88762c0.m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_MESSAGE_ID")) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                parcelable = m92642L3.getParcelable("EXTRA_MESSAGE_ID", MessageId.class);
                messageId = (MessageId) parcelable;
            } else {
                messageId = (MessageId) m92642L3.getParcelable("EXTRA_MESSAGE_ID");
            }
            if (messageId == null) {
                AbstractC20110a.f98889a.m104564x("MessageContextMenuView").mo104551d("Message ID not found", new Object[0]);
                this.f88762c0.finish();
                return;
            }
            if (i11 >= 33) {
                serializable = m92642L3.getSerializable("EXTRA_CHAT_MODE", EnumC18030a.class);
                enumC18030a = (EnumC18030a) serializable;
            } else {
                enumC18030a = (EnumC18030a) m92642L3.getSerializable("EXTRA_CHAT_MODE");
            }
            this.f59725r1 = enumC18030a;
            C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
            if (m2635r == null) {
                AbstractC20110a.f98889a.m104564x("MessageContextMenuView").mo104551d("Chat content not found", new Object[0]);
                this.f88762c0.finish();
                return;
            }
            this.f59710c1 = m2635r;
            boolean z11 = true;
            boolean z12 = m92642L3.getBoolean("EXTRA_MSG_SUPPORT", true);
            if (!z12 || !m2635r.m95144g8() || !(!C24265l.Companion.m126709b().m126698n().isEmpty())) {
                z11 = false;
            }
            this.f59711d1 = z11;
            if (m2635r.m94929K2() instanceof C17967h1) {
                boolean z13 = this.f59711d1;
                C17969i0 m94929K2 = m2635r.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentZinstant");
                this.f59711d1 = z13 & ((C17967h1) m94929K2).m95586r();
            }
            C0876j m120584H0 = AbstractC23306f.m120584H0();
            String mo95039W2 = m2635r.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            C3535c m2634q = m120584H0.m2634q(mo95039W2);
            if (m2634q == null) {
                AbstractC20110a.f98889a.m104564x("MessageContextMenuView").mo104551d("Chat not found", new Object[0]);
                this.f88762c0.finish();
                return;
            }
            String string = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f59719l1 = string;
            this.f59720m1 = m92642L3.getInt("INT_LOG_MSG_INDEX", -1);
            this.f59712e1 = m62677PL(m2635r, m2634q, z12);
            this.f59713f1 = m92642L3.getString("EXTRA_SOURCE_ACTION");
            this.f59714g1 = m92642L3.getInt("EXTRA_CHAT_ROW_Y");
            this.f59715h1 = m92642L3.getInt("EXTRA_INDEX_IN_ROW");
            this.f59716i1 = m92642L3.getInt("EXTRA_NUMBER_OF_ITEM_IN_ROW");
            String string2 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f59718k1 = string2;
            return;
        }
        AbstractC20110a.f98889a.m104564x("MessageContextMenuView").mo104551d("Message ID not found", new Object[0]);
        this.f88762c0.finish();
    }

    /* renamed from: eM */
    private final void m62692eM(View view) {
        try {
            AbstractC19074t.m100206d(view, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f59697P0 = (ViewGroup) view;
            this.f59698Q0 = (ContextMenuScrollView) view.findViewById(AbstractC6918a0.scroll_view);
            this.f59700S0 = (ViewGroup) view.findViewById(AbstractC6918a0.popup_content_container);
            this.f59701T0 = (AutoDismissDialogRecyclerView) view.findViewById(AbstractC6918a0.chat_recycler_view);
            this.f59703V0 = (RelativeLayout) view.findViewById(AbstractC6918a0.reaction_container_view);
            this.f59704W0 = (MenuRecyclerView) view.findViewById(AbstractC6918a0.menu_list);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            dismiss();
        }
    }

    /* renamed from: fM */
    public static final MessageContextMenuView m62693fM(EnumC18030a enumC18030a, C17945a0 c17945a0, String str, boolean z11, int i11, int i12, int i13, InterfaceC31658c interfaceC31658c, String str2, String str3, int i14) {
        return Companion.m62734a(enumC18030a, c17945a0, str, z11, i11, i12, i13, interfaceC31658c, str2, str3, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public final boolean m62694gM(int i11, String str, final C17945a0 c17945a0) {
        boolean z11;
        boolean z12;
        int i12;
        ChatView chatView;
        int m132427f;
        C25630b m95397g;
        C25630b m95397g2;
        if (c17945a0 == null) {
            return false;
        }
        try {
            EnumC18030a enumC18030a = this.f59725r1;
            z11 = enumC18030a == EnumC18030a.GROUP;
            z12 = enumC18030a == EnumC18030a.SINGLE_USER;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
        if (i11 == AbstractC6918a0.default_cm_add_item_to_collection) {
            AbstractC19444a.m101695c(new Runnable() { // from class: z50.t
                @Override // java.lang.Runnable
                public final void run() {
                    MessageContextMenuView.m62695hM(C17945a0.this, this);
                }
            });
        } else if (i11 == AbstractC6918a0.default_cm_reply) {
            AbstractC19444a.m101694b(new Runnable() { // from class: z50.u
                @Override // java.lang.Runnable
                public final void run() {
                    MessageContextMenuView.m62696iM(MessageContextMenuView.this, c17945a0);
                }
            }, 300L);
        } else {
            ChatView chatView2 = null;
            if (i11 == AbstractC6918a0.default_cm_copy) {
                AbstractC23647d.m123907q("9910", str);
                ChatView chatView3 = this.f59708a1;
                if (chatView3 == null) {
                    AbstractC19074t.m100223u("mChatView");
                    chatView3 = null;
                }
                AbstractC19656s0.m103066i(c17945a0, chatView3);
                AbstractC23647d.m123893c();
                C2526d.f10270a.m12678G(this.f59710c1, this.f59720m1, "csc_msgmenu", this.f59719l1);
                if (AbstractC2346f0.m12314a(c17945a0.m95019U3()) || (c17945a0.m94977P7() && c17945a0.m94929K2() != null && AbstractC19074t.m100204b(c17945a0.m94929K2().f91016u, "recommened.user"))) {
                    ChatView chatView4 = this.f59708a1;
                    if (chatView4 == null) {
                        AbstractC19074t.m100223u("mChatView");
                    } else {
                        chatView2 = chatView4;
                    }
                    String m60004fQ = chatView2.m60004fQ();
                    AbstractC19074t.m100207e(m60004fQ, "getLogChatType(...)");
                    C2526d.m12661k("csc_msgmenu", m60004fQ);
                }
            } else if (i11 == AbstractC6918a0.default_cm_delete) {
                InterfaceC31658c interfaceC31658c = this.f59724q1;
                if (interfaceC31658c != null) {
                    interfaceC31658c.mo64163hk(c17945a0, str);
                    C2526d.f10270a.m12680H(this.f59710c1, this.f59720m1, "csc_msgmenu", this.f59719l1);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } else if (i11 == AbstractC6918a0.default_cm_resend) {
                ChatView chatView5 = this.f59708a1;
                if (chatView5 == null) {
                    AbstractC19074t.m100223u("mChatView");
                } else {
                    chatView2 = chatView5;
                }
                chatView2.m60020gQ().mo60572Hc(c17945a0, "csc_msgmenu");
                AbstractC23016b.m118009c();
            } else if (i11 == AbstractC6918a0.default_cm_editphoto) {
                AbstractC23647d.m123907q("9930", str);
                ChatView chatView6 = this.f59708a1;
                if (chatView6 == null) {
                    AbstractC19074t.m100223u("mChatView");
                } else {
                    chatView2 = chatView6;
                }
                chatView2.m60176qT(c17945a0, 1030);
                AbstractC23647d.m123893c();
            } else if (i11 == AbstractC6918a0.default_cm_redownload) {
                ChatView chatView7 = this.f59708a1;
                if (chatView7 == null) {
                    AbstractC19074t.m100223u("mChatView");
                } else {
                    chatView2 = chatView7;
                }
                chatView2.m60020gQ().mo60823w6(c17945a0);
            } else if (i11 == AbstractC6918a0.default_cm_enable_smsIntegration) {
                ChatView chatView8 = this.f59708a1;
                if (chatView8 == null) {
                    AbstractC19074t.m100223u("mChatView");
                } else {
                    chatView2 = chatView8;
                }
                chatView2.m60306zT(true);
                if (z12) {
                    AbstractC23647d.m123897g("990107");
                }
            } else if (i11 == AbstractC6918a0.default_cm_disable_smsIntegration) {
                ChatView chatView9 = this.f59708a1;
                if (chatView9 == null) {
                    AbstractC19074t.m100223u("mChatView");
                } else {
                    chatView2 = chatView9;
                }
                chatView2.m60306zT(false);
                if (z12) {
                    AbstractC23647d.m123897g("990106");
                }
            } else {
                if (i11 != AbstractC6918a0.default_cm_view_chat_details) {
                    int i13 = -1;
                    if (i11 == AbstractC6918a0.default_cm_forward) {
                        try {
                            AbstractC23647d.m123907q("9940", str);
                            if (c17945a0.m94871D7()) {
                                i12 = 8;
                            } else if (c17945a0.m95306y8()) {
                                i12 = 9;
                            } else {
                                i12 = c17945a0.m95276v6() ? 4 : -1;
                            }
                            String m40686z = new TrackingSource(c17945a0.m94847A6() ? 8 : 6).m40686z();
                            ChatView chatView10 = this.f59708a1;
                            if (chatView10 == null) {
                                AbstractC19074t.m100223u("mChatView");
                            } else {
                                chatView2 = chatView10;
                            }
                            AbstractC19646n0.m102966d0(chatView2.m92676n2(), c17945a0, false, i12, m40686z, "csc_msgmenu", this.f59719l1, this.f59720m1);
                            AbstractC23647d.m123893c();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    } else if (i11 == AbstractC6918a0.default_cm_send_to_saved_messages) {
                        m62701lM(c17945a0, i11);
                    } else if (i11 == AbstractC6918a0.default_cm_resyncmsg) {
                        ChatView chatView11 = this.f59708a1;
                        if (chatView11 == null) {
                            AbstractC19074t.m100223u("mChatView");
                        } else {
                            chatView2 = chatView11;
                        }
                        chatView2.m60020gQ().mo60823w6(c17945a0);
                    } else if (i11 == AbstractC6918a0.default_cm_undo) {
                        InterfaceC31658c interfaceC31658c2 = this.f59724q1;
                        if (interfaceC31658c2 != null) {
                            interfaceC31658c2.mo64166jm(c17945a0);
                            C2526d.f10270a.m12707c0(this.f59710c1, this.f59720m1, "csc_msgmenu", this.f59719l1);
                            C24848g0 c24848g02 = C24848g0.f119245a;
                        }
                    } else {
                        if (i11 != AbstractC6918a0.default_cm_use_speaker_for_sound && i11 != AbstractC6918a0.default_cm_use_inear_for_sound) {
                            if (i11 == AbstractC6918a0.default_cm_create_topic) {
                                ChatView chatView12 = this.f59708a1;
                                if (chatView12 == null) {
                                    AbstractC19074t.m100223u("mChatView");
                                } else {
                                    chatView2 = chatView12;
                                }
                                chatView2.m60112mP(c17945a0);
                            } else if (i11 == AbstractC6918a0.default_cm_unpin) {
                                ChatView chatView13 = this.f59708a1;
                                if (chatView13 == null) {
                                    AbstractC19074t.m100223u("mChatView");
                                } else {
                                    chatView2 = chatView13;
                                }
                                chatView2.m60207sQ(c17945a0);
                            } else if (i11 == AbstractC6918a0.default_cm_save) {
                                if (!AbstractC23034c6.m118118E()) {
                                    AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112029f, 154);
                                    this.f59726s1 = true;
                                } else {
                                    m62687ZL(c17945a0);
                                    if (z12) {
                                        AbstractC23647d.m123897g("990104");
                                    } else if (z11) {
                                        AbstractC23647d.m123897g("1090104");
                                    }
                                }
                                C24848g0 c24848g03 = C24848g0.f119245a;
                            } else if (i11 == AbstractC6918a0.default_cm_gif) {
                                final C31887d9 m155014e = C32119t6.m155009c().m155014e(1);
                                if (m155014e != null) {
                                    AbstractC19444a.m101694b(new Runnable() { // from class: z50.v
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MessageContextMenuView.m62697jM(MessageContextMenuView.this, m155014e);
                                        }
                                    }, 300L);
                                }
                                if (z12) {
                                    AbstractC23647d.m123897g("990101");
                                } else if (z11) {
                                    AbstractC23647d.m123897g("1090101");
                                }
                            } else if (i11 == AbstractC6918a0.default_cm_sticker) {
                                C17969i0 m94929K2 = c17945a0.m94929K2();
                                C18009w0 c18009w0 = m94929K2 instanceof C18009w0 ? (C18009w0) m94929K2 : null;
                                if (c18009w0 != null && c18009w0.m95786t() == 1) {
                                    C2520a.f10235a.m12629k("icon_context_menu");
                                    m132427f = -10;
                                } else {
                                    C17969i0 m94929K22 = c17945a0.m94929K2();
                                    C17949b1 c17949b1 = m94929K22 instanceof C17949b1 ? (C17949b1) m94929K22 : null;
                                    m132427f = (c17949b1 == null || (m95397g = c17949b1.m95397g()) == null) ? -1 : m95397g.m132427f();
                                }
                                C17969i0 m94929K23 = c17945a0.m94929K2();
                                C18009w0 c18009w02 = m94929K23 instanceof C18009w0 ? (C18009w0) m94929K23 : null;
                                if (c18009w02 == null || c18009w02.m95786t() != 1) {
                                    C17969i0 m94929K24 = c17945a0.m94929K2();
                                    C17949b1 c17949b12 = m94929K24 instanceof C17949b1 ? (C17949b1) m94929K24 : null;
                                    if (c17949b12 != null && (m95397g2 = c17949b12.m95397g()) != null) {
                                        i13 = m95397g2.m132432j();
                                    }
                                } else {
                                    i13 = -10;
                                }
                                if (i13 > 0 && !C28644j.m143233Y().m143312x0(i13)) {
                                    try {
                                        if (C3255n.m16560k()) {
                                            if (C23055e5.m118273h(false, 1, null)) {
                                                if (C3255n.m16562n().m16580x(m132427f)) {
                                                    ((C21272r) C21272r.Companion.m122672a()).m110181j(2);
                                                    C21270p.Companion.m110161b().m110152Z(2, 6, "6_1", i13);
                                                    ChatView chatView14 = this.f59708a1;
                                                    if (chatView14 == null) {
                                                        AbstractC19074t.m100223u("mChatView");
                                                    } else {
                                                        chatView2 = chatView14;
                                                    }
                                                    C11603g0 m59834TP = chatView2.m59834TP();
                                                    if (m59834TP != null) {
                                                        m59834TP.m64560e2(m132427f);
                                                        C24848g0 c24848g04 = C24848g0.f119245a;
                                                    }
                                                } else {
                                                    int[] iArr = {i13, 1};
                                                    ChatView chatView15 = this.f59708a1;
                                                    if (chatView15 == null) {
                                                        AbstractC19074t.m100223u("mChatView");
                                                    } else {
                                                        chatView2 = chatView15;
                                                    }
                                                    chatView2.mo60056iu(400, iArr);
                                                }
                                            } else {
                                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                                            }
                                        } else {
                                            int m40666e = TrackingSource.m40666e();
                                            String m40669h = TrackingSource.m40669h(m40666e);
                                            AbstractC19074t.m100207e(m40669h, "genSourceParamChat(...)");
                                            ChatView chatView16 = this.f59708a1;
                                            if (chatView16 == null) {
                                                AbstractC19074t.m100223u("mChatView");
                                            } else {
                                                chatView2 = chatView16;
                                            }
                                            AbstractC23152n3.m119066r0(chatView2.m92676n2(), i13, "", m40666e, m40669h, 1);
                                        }
                                    } catch (Exception e13) {
                                        e13.printStackTrace();
                                    }
                                } else {
                                    ((C21272r) C21272r.Companion.m122672a()).m110181j(2);
                                    C21270p.Companion.m110161b().m110152Z(2, 7, "7_1", i13);
                                    ChatView chatView17 = this.f59708a1;
                                    if (chatView17 == null) {
                                        AbstractC19074t.m100223u("mChatView");
                                    } else {
                                        chatView2 = chatView17;
                                    }
                                    C11603g0 m59834TP2 = chatView2.m59834TP();
                                    if (m59834TP2 != null) {
                                        m59834TP2.m64560e2(m132427f);
                                        C24848g0 c24848g05 = C24848g0.f119245a;
                                    }
                                }
                                if (z12) {
                                    AbstractC23647d.m123897g("990103");
                                } else if (z11) {
                                    AbstractC23647d.m123897g("1090103");
                                }
                            } else if (i11 == AbstractC6918a0.default_cm_guggy) {
                                final C31887d9 m155014e2 = C32119t6.m155009c().m155014e(3);
                                if (m155014e2 != null) {
                                    AbstractC19444a.m101694b(new Runnable() { // from class: z50.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MessageContextMenuView.m62699kM(MessageContextMenuView.this, m155014e2);
                                        }
                                    }, 300L);
                                }
                                if (z12) {
                                    AbstractC23647d.m123897g("990108");
                                } else if (z11) {
                                    AbstractC23647d.m123897g("1090106");
                                }
                            } else if (i11 == AbstractC6918a0.default_cm_reshare) {
                                ChatView chatView18 = this.f59708a1;
                                if (chatView18 == null) {
                                    AbstractC19074t.m100223u("mChatView");
                                } else {
                                    chatView2 = chatView18;
                                }
                                chatView2.m59947bU(c17945a0);
                            } else if (i11 == AbstractC6918a0.default_cm_remind_chat_msg) {
                                String str2 = c17945a0.m94946M3().size() > 0 ? ((SuggestionTimeSpan) c17945a0.m94946M3().get(0)).f54804t : "";
                                C17945a0 c17945a02 = this.f59710c1;
                                if (c17945a02 != null && c17945a02.m94847A6()) {
                                    AbstractC23647d.m123897g("77709007");
                                } else {
                                    AbstractC23647d.m123897g("77709006");
                                }
                                ChatView chatView19 = this.f59708a1;
                                if (chatView19 == null) {
                                    AbstractC19074t.m100223u("mChatView");
                                    chatView = null;
                                } else {
                                    chatView = chatView19;
                                }
                                chatView.m59608DT(c17945a0, false, 4, str2, "csc_msgmenu");
                            } else if (i11 == AbstractC6918a0.default_cm_todo) {
                                InterfaceC31658c interfaceC31658c3 = this.f59724q1;
                                if (interfaceC31658c3 != null) {
                                    interfaceC31658c3.mo64102F6(c17945a0);
                                    C24848g0 c24848g06 = C24848g0.f119245a;
                                }
                            } else if (i11 == AbstractC6918a0.default_cm_select_more) {
                                ChatView chatView20 = this.f59708a1;
                                if (chatView20 == null) {
                                    AbstractC19074t.m100223u("mChatView");
                                } else {
                                    chatView2 = chatView20;
                                }
                                chatView2.m60020gQ().mo60791ro(c17945a0);
                                C2526d.f10270a.m12701Z(this.f59710c1, this.f59720m1, "csc_msgmenu", this.f59719l1);
                            } else if (i11 == AbstractC6918a0.report_msg) {
                                ChatView chatView21 = this.f59708a1;
                                if (chatView21 == null) {
                                    AbstractC19074t.m100223u("mChatView");
                                    chatView21 = null;
                                }
                                chatView21.m60020gQ().mo60787r3(c17945a0);
                                ChatView chatView22 = this.f59708a1;
                                if (chatView22 == null) {
                                    AbstractC19074t.m100223u("mChatView");
                                } else {
                                    chatView2 = chatView22;
                                }
                                chatView2.mo60240ul(407);
                            } else if (i11 == AbstractC6918a0.default_cm_original_msg) {
                                if (c17945a0.m94898G6()) {
                                    ChatView chatView23 = this.f59708a1;
                                    if (chatView23 == null) {
                                        AbstractC19074t.m100223u("mChatView");
                                    } else {
                                        chatView2 = chatView23;
                                    }
                                    chatView2.m60020gQ().mo60778p3(c17945a0);
                                }
                            } else if (i11 != AbstractC6918a0.default_cm_message_details_tool) {
                                if (i11 == AbstractC6918a0.default_cm_quick_message) {
                                    ChatView chatView24 = this.f59708a1;
                                    if (chatView24 == null) {
                                        AbstractC19074t.m100223u("mChatView");
                                    } else {
                                        chatView2 = chatView24;
                                    }
                                    chatView2.m60020gQ().mo60845zd(c17945a0);
                                } else if (i11 == AbstractC6918a0.default_cm_tts) {
                                    ChatView chatView25 = this.f59708a1;
                                    if (chatView25 == null) {
                                        AbstractC19074t.m100223u("mChatView");
                                    } else {
                                        chatView2 = chatView25;
                                    }
                                    chatView2.m60020gQ().mo60648Uh(c17945a0);
                                } else if (i11 == AbstractC6918a0.default_cm_hide_vtt) {
                                    ChatView chatView26 = this.f59708a1;
                                    if (chatView26 == null) {
                                        AbstractC19074t.m100223u("mChatView");
                                    } else {
                                        chatView2 = chatView26;
                                    }
                                    chatView2.m60020gQ().mo60712ef(c17945a0, false);
                                } else if (i11 == AbstractC6918a0.default_cm_show_vtt) {
                                    ChatView chatView27 = this.f59708a1;
                                    if (chatView27 == null) {
                                        AbstractC19074t.m100223u("mChatView");
                                    } else {
                                        chatView2 = chatView27;
                                    }
                                    chatView2.m60020gQ().mo60712ef(c17945a0, true);
                                }
                            }
                        }
                        ChatView chatView28 = this.f59708a1;
                        if (chatView28 == null) {
                            AbstractC19074t.m100223u("mChatView");
                        } else {
                            chatView2 = chatView28;
                        }
                        chatView2.m60049iP(c17945a0);
                        C23744a.Companion.m124119a().m124116d(6021, new Object[0]);
                    }
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return false;
                }
                ChatView chatView29 = this.f59708a1;
                if (chatView29 == null) {
                    AbstractC19074t.m100223u("mChatView");
                } else {
                    chatView2 = chatView29;
                }
                chatView2.m59791QU(c17945a0, false, "csc_msgmenu");
                if (z12) {
                    AbstractC23647d.m123897g("990100");
                } else if (z11) {
                    AbstractC23647d.m123897g("1090100");
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public static final void m62695hM(C17945a0 c17945a0, MessageContextMenuView messageContextMenuView) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(c17945a0.m95029V3());
        arrayList2.add(c17945a0);
        C23459d.m123159f(C23459d.f113954a, messageContextMenuView.f88762c0, arrayList, "csc_msgmenu", C21955a.f108070a.m114643j(arrayList2), false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final void m62696iM(MessageContextMenuView messageContextMenuView, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        try {
            AbstractC23647d.m123906p("1000401");
            ChatView chatView = messageContextMenuView.f59708a1;
            if (chatView == null) {
                AbstractC19074t.m100223u("mChatView");
                chatView = null;
            }
            chatView.m60101lT(c17945a0);
            AbstractC23647d.m123893c();
            C2526d.f10270a.m12716j0(messageContextMenuView.f59710c1, messageContextMenuView.f59720m1, "csc_msgmenu", messageContextMenuView.f59719l1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public static final void m62697jM(MessageContextMenuView messageContextMenuView, C31887d9 c31887d9) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        ChatView chatView = messageContextMenuView.f59708a1;
        ChatView chatView2 = null;
        if (chatView == null) {
            AbstractC19074t.m100223u("mChatView");
            chatView = null;
        }
        chatView.mo59989ek();
        ChatView chatView3 = messageContextMenuView.f59708a1;
        if (chatView3 == null) {
            AbstractC19074t.m100223u("mChatView");
            chatView3 = null;
        }
        chatView3.mo60133na();
        ChatView chatView4 = messageContextMenuView.f59708a1;
        if (chatView4 == null) {
            AbstractC19074t.m100223u("mChatView");
            chatView4 = null;
        }
        chatView4.mo59706Ka(1);
        ChatView chatView5 = messageContextMenuView.f59708a1;
        if (chatView5 == null) {
            AbstractC19074t.m100223u("mChatView");
        } else {
            chatView2 = chatView5;
        }
        chatView2.m60020gQ().mo60626Qb(true, c31887d9, "", 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public static final void m62699kM(MessageContextMenuView messageContextMenuView, C31887d9 c31887d9) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        ChatView chatView = messageContextMenuView.f59708a1;
        ChatView chatView2 = null;
        if (chatView == null) {
            AbstractC19074t.m100223u("mChatView");
            chatView = null;
        }
        chatView.mo59989ek();
        ChatView chatView3 = messageContextMenuView.f59708a1;
        if (chatView3 == null) {
            AbstractC19074t.m100223u("mChatView");
            chatView3 = null;
        }
        chatView3.mo60133na();
        ChatView chatView4 = messageContextMenuView.f59708a1;
        if (chatView4 == null) {
            AbstractC19074t.m100223u("mChatView");
            chatView4 = null;
        }
        chatView4.mo59706Ka(1);
        ChatView chatView5 = messageContextMenuView.f59708a1;
        if (chatView5 == null) {
            AbstractC19074t.m100223u("mChatView");
        } else {
            chatView2 = chatView5;
        }
        chatView2.m60020gQ().mo60626Qb(true, c31887d9, "", 4);
    }

    /* renamed from: lM */
    private final void m62701lM(C17945a0 c17945a0, int i11) {
        int i12;
        List m131496e;
        if (c17945a0 != null) {
            try {
                if (c17945a0.m94871D7()) {
                    i12 = 8;
                } else if (c17945a0.m95306y8()) {
                    i12 = 9;
                } else if (c17945a0.m95276v6()) {
                    i12 = 4;
                } else {
                    i12 = -1;
                }
                AbstractC23112j7.m118566y0(EnumC26407i.f125516r);
                m131496e = AbstractC25366r.m131496e(c17945a0);
                AbstractC19646n0.m102970e0(m131496e, i12, new C11558e());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m62703mM(Runnable runnable, MessageContextMenuView messageContextMenuView) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        runnable.run();
        messageContextMenuView.m62685XL();
    }

    /* renamed from: nM */
    private final void m62705nM() {
        try {
            C17945a0 c17945a0 = this.f59710c1;
            if (c17945a0 == null) {
                return;
            }
            C11318b m60525a = C11318b.Companion.m60525a();
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            if (m60525a.m60515j(mo95039W2)) {
                C0876j m120584H0 = AbstractC23306f.m120584H0();
                String mo95039W22 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                C3535c m2634q = m120584H0.m2634q(mo95039W22);
                if (m2634q != null) {
                    C3535c c3535c = new C3535c(m2634q.m17971y0(), false);
                    this.f59709b1 = c3535c;
                    ViewPropertyAnimator viewPropertyAnimator = null;
                    C26394c.m136024c(c3535c, c17945a0, false, 2, null);
                    ViewGroup viewGroup = this.f59697P0;
                    if (viewGroup == null) {
                        AbstractC19074t.m100223u("mRootView");
                        viewGroup = null;
                    }
                    viewGroup.setOnClickListener(new View.OnClickListener() { // from class: z50.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MessageContextMenuView.m62713rM(MessageContextMenuView.this, view);
                        }
                    });
                    ViewGroup viewGroup2 = this.f59700S0;
                    if (viewGroup2 != null) {
                        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: z50.r
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MessageContextMenuView.m62715sM(MessageContextMenuView.this, view);
                            }
                        });
                    }
                    ViewGroup viewGroup3 = this.f59700S0;
                    if (viewGroup3 != null) {
                        viewGroup3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: z50.s
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                                MessageContextMenuView.m62707oM(MessageContextMenuView.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
                            }
                        });
                    }
                    ChatView chatView = this.f59708a1;
                    if (chatView == null) {
                        AbstractC19074t.m100223u("mChatView");
                        chatView = null;
                    }
                    C11560g c11560g = new C11560g(chatView, new C23528a(getContext()), AbstractC23306f.m120579F1());
                    this.f59702U0 = c11560g;
                    c11560g.m9999J(true);
                    c11560g.m60474F0(new C11561h());
                    c11560g.m60475G0(this);
                    C3535c c3535c2 = this.f59709b1;
                    if (c3535c2 != null) {
                        c11560g.m64563k2(c3535c2);
                    }
                    c11560g.m64561h2();
                    AutoDismissDialogRecyclerView autoDismissDialogRecyclerView = this.f59701T0;
                    if (autoDismissDialogRecyclerView != null) {
                        autoDismissDialogRecyclerView.setPopupDialog(this);
                        final Context context = this.f88762c0.getContext();
                        autoDismissDialogRecyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.zing.zalo.ui.chat.contextmenu.MessageContextMenuView$setup$7$1
                            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
                            /* renamed from: y */
                            public boolean mo9758y() {
                                return false;
                            }
                        });
                        autoDismissDialogRecyclerView.setAdapter(this.f59702U0);
                    }
                    RelativeLayout relativeLayout = this.f59703V0;
                    if (relativeLayout != null) {
                        relativeLayout.setOnClickListener(this);
                    }
                    if (this.f59711d1) {
                        m62676OL();
                    }
                    ContextMenuScrollView contextMenuScrollView = this.f59698Q0;
                    if (contextMenuScrollView != null) {
                        contextMenuScrollView.setGestureScrollEventListener(new C11562i());
                    }
                    ContextMenuScrollView contextMenuScrollView2 = this.f59698Q0;
                    if (contextMenuScrollView2 != null) {
                        viewPropertyAnimator = contextMenuScrollView2.animate();
                    }
                    this.f59699R0 = viewPropertyAnimator;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.setListener(new C11563j());
                    }
                    m62717tM();
                    return;
                }
                throw new Exception("Current chat is null");
            }
            throw new IllegalArgumentException("Invalid thread id".toString());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m62707oM(final MessageContextMenuView messageContextMenuView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator translationY;
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        if (i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) {
            return;
        }
        ContextMenuScrollView contextMenuScrollView = messageContextMenuView.f59698Q0;
        if (contextMenuScrollView != null && contextMenuScrollView.canScrollVertically(1)) {
            final ContextMenuScrollView contextMenuScrollView2 = messageContextMenuView.f59698Q0;
            if (contextMenuScrollView2 != null) {
                if (contextMenuScrollView2.getTranslationY() != 0.0f && (viewPropertyAnimator = messageContextMenuView.f59699R0) != null && (translationY = viewPropertyAnimator.translationY(0.0f)) != null) {
                    translationY.start();
                }
                contextMenuScrollView2.post(new Runnable() { // from class: z50.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageContextMenuView.m62709pM(ContextMenuScrollView.this);
                    }
                });
                return;
            }
            return;
        }
        ViewGroup viewGroup = messageContextMenuView.f59697P0;
        if (viewGroup == null) {
            AbstractC19074t.m100223u("mRootView");
            viewGroup = null;
        }
        viewGroup.post(new Runnable() { // from class: z50.k
            @Override // java.lang.Runnable
            public final void run() {
                MessageContextMenuView.m62711qM(MessageContextMenuView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public static final void m62709pM(ContextMenuScrollView contextMenuScrollView) {
        AbstractC19074t.m100208f(contextMenuScrollView, "$it");
        contextMenuScrollView.fullScroll(130);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: Exception -> 0x002c, TRY_ENTER, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0005, B:7:0x000a, B:10:0x000f, B:12:0x0016, B:14:0x001e, B:15:0x002a, B:16:0x0041, B:19:0x0060, B:20:0x0064, B:22:0x006a, B:24:0x006e, B:25:0x0073, B:26:0x0080, B:28:0x0090, B:30:0x0094, B:32:0x00a0, B:34:0x00a4, B:36:0x00b0, B:42:0x0083, B:44:0x0087, B:45:0x002f, B:47:0x0033), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0005, B:7:0x000a, B:10:0x000f, B:12:0x0016, B:14:0x001e, B:15:0x002a, B:16:0x0041, B:19:0x0060, B:20:0x0064, B:22:0x006a, B:24:0x006e, B:25:0x0073, B:26:0x0080, B:28:0x0090, B:30:0x0094, B:32:0x00a0, B:34:0x00a4, B:36:0x00b0, B:42:0x0083, B:44:0x0087, B:45:0x002f, B:47:0x0033), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0005, B:7:0x000a, B:10:0x000f, B:12:0x0016, B:14:0x001e, B:15:0x002a, B:16:0x0041, B:19:0x0060, B:20:0x0064, B:22:0x006a, B:24:0x006e, B:25:0x0073, B:26:0x0080, B:28:0x0090, B:30:0x0094, B:32:0x00a0, B:34:0x00a4, B:36:0x00b0, B:42:0x0083, B:44:0x0087, B:45:0x002f, B:47:0x0033), top: B:2:0x0005 }] */
    /* renamed from: qM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m62711qM(MessageContextMenuView messageContextMenuView) {
        AutoDismissDialogRecyclerView autoDismissDialogRecyclerView;
        int i11;
        ViewPropertyAnimator translationY;
        int i12;
        int i13;
        int contentTop;
        int i14;
        ViewGroup viewGroup;
        int i15;
        float translationY2;
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        try {
            ContextMenuScrollView contextMenuScrollView = messageContextMenuView.f59698Q0;
            if (contextMenuScrollView == null || (autoDismissDialogRecyclerView = messageContextMenuView.f59701T0) == null) {
                return;
            }
            if (autoDismissDialogRecyclerView.getChildCount() > 0) {
                View childAt = autoDismissDialogRecyclerView.getChildAt(0);
                if (childAt instanceof ChatRow) {
                    i13 = AbstractC23136l9.m118644C0(childAt).top;
                    contentTop = ((ChatRow) childAt).getBubbleTop();
                } else if (childAt instanceof ChatRowWebContent) {
                    i13 = AbstractC23136l9.m118644C0(childAt).top;
                    contentTop = ((ChatRowWebContent) childAt).getContentTop();
                } else {
                    i12 = 0;
                    i11 = messageContextMenuView.f59714g1 - i12;
                    int bottom = contextMenuScrollView.getBottom() + ((int) contextMenuScrollView.getTranslationY());
                    int top = contextMenuScrollView.getTop() + ((int) contextMenuScrollView.getTranslationY());
                    i14 = bottom + i11;
                    viewGroup = messageContextMenuView.f59697P0;
                    ViewGroup viewGroup2 = null;
                    if (viewGroup == null) {
                        AbstractC19074t.m100223u("mRootView");
                        viewGroup = null;
                    }
                    if (i14 <= viewGroup.getHeight()) {
                        ViewGroup viewGroup3 = messageContextMenuView.f59697P0;
                        if (viewGroup3 == null) {
                            AbstractC19074t.m100223u("mRootView");
                        } else {
                            viewGroup2 = viewGroup3;
                        }
                        i15 = viewGroup2.getHeight() - contextMenuScrollView.getHeight();
                        translationY2 = contextMenuScrollView.getTranslationY();
                    } else if (top + i11 < 0) {
                        i15 = -top;
                        translationY2 = contextMenuScrollView.getTranslationY();
                    }
                    i11 = i15 - ((int) translationY2);
                }
                i12 = i13 + contentTop;
                i11 = messageContextMenuView.f59714g1 - i12;
                int bottom2 = contextMenuScrollView.getBottom() + ((int) contextMenuScrollView.getTranslationY());
                int top2 = contextMenuScrollView.getTop() + ((int) contextMenuScrollView.getTranslationY());
                i14 = bottom2 + i11;
                viewGroup = messageContextMenuView.f59697P0;
                ViewGroup viewGroup22 = null;
                if (viewGroup == null) {
                }
                if (i14 <= viewGroup.getHeight()) {
                }
                i11 = i15 - ((int) translationY2);
            } else {
                i11 = 0;
            }
            if (i11 != 0) {
                if (messageContextMenuView.f59717j1) {
                    messageContextMenuView.f59717j1 = false;
                    contextMenuScrollView.setTranslationY(contextMenuScrollView.getTranslationY() + i11);
                    return;
                }
                ViewPropertyAnimator viewPropertyAnimator = messageContextMenuView.f59699R0;
                if (viewPropertyAnimator != null && (translationY = viewPropertyAnimator.translationY(contextMenuScrollView.getTranslationY() + i11)) != null) {
                    translationY.start();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public static final void m62713rM(MessageContextMenuView messageContextMenuView, View view) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        messageContextMenuView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m62715sM(MessageContextMenuView messageContextMenuView, View view) {
        AbstractC19074t.m100208f(messageContextMenuView, "this$0");
        messageContextMenuView.dismiss();
    }

    /* renamed from: tM */
    private final void m62717tM() {
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C31657b c31657b = new C31657b(this.f59712e1, new C11564k());
        this.f59705X0 = c31657b;
        c31657b.m152374N(4);
        int size = this.f59712e1.size();
        if (size >= 4) {
            ReactionPickerView reactionPickerView = this.f59706Y0;
            if (reactionPickerView != null) {
                i11 = reactionPickerView.getReactionBarWidth();
            } else {
                i11 = f59695t1;
            }
        } else {
            i11 = (f59695t1 * size) / 4;
        }
        int min = Math.min(i11, AbstractC23136l9.m118766z(m92689tK()));
        MenuRecyclerView menuRecyclerView = this.f59704W0;
        if (menuRecyclerView != null) {
            menuRecyclerView.getLayoutParams().width = min;
            ViewGroup.LayoutParams layoutParams = menuRecyclerView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = ChatRow.f57201L5;
            }
            menuRecyclerView.setNumberOfRows(Math.min((size + 3) / 4, 3.5f));
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            menuRecyclerView.setLayoutManager(new DisableNestedScrollGridLayoutManager(m92689tK, Math.min(size, 4)));
            menuRecyclerView.setHasFixedSize(true);
            menuRecyclerView.setAdapter(this.f59705X0);
        }
    }

    /* renamed from: uM */
    private final void m62719uM(View view, C11566a.a aVar) {
        C11566a.f59744a.m62755k(view, 450L, new C11565l(view));
        if (aVar == C11566a.a.f59747q) {
            AbstractC0924m0.m3791ep(AbstractC0924m0.m4192s6() + 1);
            C2526d c2526d = C2526d.f10270a;
            ChatView chatView = this.f59708a1;
            if (chatView == null) {
                AbstractC19074t.m100223u("mChatView");
                chatView = null;
            }
            String m60004fQ = chatView.m60004fQ();
            AbstractC19074t.m100207e(m60004fQ, "getLogChatType(...)");
            c2526d.m12681H0(m60004fQ);
        }
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m62691dM();
        C2526d.f10270a.m12699X(this.f59710c1, this.f59720m1, this.f59718k1, this.f59719l1);
    }

    @Override // y50.InterfaceC30793c
    /* renamed from: G3 */
    public boolean mo61421G3() {
        AutoDismissDialogRecyclerView autoDismissDialogRecyclerView = this.f59701T0;
        if (autoDismissDialogRecyclerView == null || !autoDismissDialogRecyclerView.m62641b2()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
    /* renamed from: G8 */
    public void mo62725G8(C24753f c24753f, String str) {
        AbstractC19074t.m100208f(c24753f, "rType");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19646n0.m102899I(c24753f, this.f59710c1, 0, true);
        C17945a0 c17945a0 = this.f59710c1;
        if (c17945a0 != null) {
            C0732w.Companion.m1189a().m1187q("reaction_send", "csc_msg_bubble", null, C22423y.m115854e(c24753f.m128595h(), c17945a0, false, 4, null));
        }
    }

    @Override // y50.InterfaceC30793c
    /* renamed from: K0 */
    public void mo61422K0(InterfaceC30793c.b bVar) {
        AbstractC19074t.m100208f(bVar, "content");
        this.f59722o1 = bVar;
        if (bVar != null) {
            this.f59707Z0 = m62678QL(bVar);
            AutoDismissDialogRecyclerView autoDismissDialogRecyclerView = this.f59701T0;
            if (autoDismissDialogRecyclerView != null) {
                autoDismissDialogRecyclerView.m62642c2();
            }
        }
    }

    @Override // y50.InterfaceC30793c
    /* renamed from: K2 */
    public void mo61423K2(InterfaceC30793c.b bVar) {
        AbstractC19074t.m100208f(bVar, "content");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C11603g0 c11603g0 = this.f59702U0;
        if (c11603g0 != null) {
            c11603g0.m64556Z1();
        }
        m62679RL(0L);
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
    /* renamed from: Rp */
    public void mo62726Rp() {
        AbstractC19646n0.m103004m2(this.f59710c1, true);
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
    /* renamed from: WE */
    public void mo62727WE(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        try {
            dismiss();
            C17945a0 c17945a0 = this.f59710c1;
            if (c17945a0 != null) {
                C23744a.Companion.m124119a().m124116d(75, c17945a0.m95029V3(), str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView
    public void dismiss() {
        m62679RL(0L);
        super.dismiss();
    }

    @Override // com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer.InterfaceC11727b
    /* renamed from: e4 */
    public void mo60381e4(ChatAttachmentContainer.C11728c c11728c) {
        AbstractC19074t.m100208f(c11728c, "mediaItem");
        dismiss();
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    protected View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.message_context_menu_layout, viewGroup, false);
        AbstractC19074t.m100205c(inflate);
        m62692eM(inflate);
        m62705nM();
        m62680SL();
        return inflate;
    }

    @Override // y50.InterfaceC30793c
    /* renamed from: i1 */
    public void mo61427i1() {
        m62679RL(0L);
        this.f59722o1 = null;
        this.f59707Z0 = null;
        this.f59721n1 = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: jL */
    public void mo62729jL(WindowManager.LayoutParams layoutParams) {
        AbstractC19074t.m100208f(layoutParams, "attrs");
        super.mo62729jL(layoutParams);
        layoutParams.height = -1;
        layoutParams.dimAmount = 0.75f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        try {
            if (view.getId() == AbstractC6918a0.reaction_container_view) {
                dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        C17945a0 c17945a0;
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 154) {
            this.f59726s1 = false;
            if (AbstractC23034c6.m118118E() && (c17945a0 = this.f59710c1) != null) {
                m62687ZL(c17945a0);
            }
            dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C11603g0 c11603g0 = this.f59702U0;
        if (c11603g0 != null) {
            c11603g0.m64557a2();
        }
        C11603g0 c11603g02 = this.f59702U0;
        if (c11603g02 != null) {
            c11603g02.m10008p();
        }
        m62685XL();
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
    /* renamed from: p2 */
    public void mo62730p2() {
        dismiss();
    }

    @Override // y50.InterfaceC30793c
    public void setMoveTextSelectHandleController(InterfaceC30793c.a aVar) {
        ContextMenuScrollView contextMenuScrollView;
        if (aVar == null) {
            AutoDismissDialogRecyclerView autoDismissDialogRecyclerView = this.f59701T0;
            if (autoDismissDialogRecyclerView != null) {
                autoDismissDialogRecyclerView.setMoveTextSelectHandleController(null);
                return;
            }
            return;
        }
        AutoDismissDialogRecyclerView autoDismissDialogRecyclerView2 = this.f59701T0;
        if (autoDismissDialogRecyclerView2 != null && (contextMenuScrollView = this.f59698Q0) != null) {
            Rect rect = new Rect();
            autoDismissDialogRecyclerView2.getDrawingRect(rect);
            contextMenuScrollView.offsetDescendantRectToMyCoords(autoDismissDialogRecyclerView2, rect);
            this.f59721n1 = rect;
        }
        AutoDismissDialogRecyclerView autoDismissDialogRecyclerView3 = this.f59701T0;
        if (autoDismissDialogRecyclerView3 != null) {
            autoDismissDialogRecyclerView3.setMoveTextSelectHandleController(new C11559f(aVar, this));
        }
    }

    @Override // y50.InterfaceC30793c
    public void setOnFirstReleaseAfterSelectingNewTextListener(final Runnable runnable) {
        if (runnable == null) {
            AutoDismissDialogRecyclerView autoDismissDialogRecyclerView = this.f59701T0;
            if (autoDismissDialogRecyclerView != null) {
                autoDismissDialogRecyclerView.setOnFirstReleaseAfterSelectingNewTextListener(null);
                return;
            }
            return;
        }
        AutoDismissDialogRecyclerView autoDismissDialogRecyclerView2 = this.f59701T0;
        if (autoDismissDialogRecyclerView2 != null) {
            autoDismissDialogRecyclerView2.setOnFirstReleaseAfterSelectingNewTextListener(new Runnable() { // from class: z50.m
                @Override // java.lang.Runnable
                public final void run() {
                    MessageContextMenuView.m62703mM(runnable, this);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer.InterfaceC11727b
    /* renamed from: ti */
    public void mo60382ti(ChatAttachmentContainer.C11728c c11728c) {
        AbstractC19074t.m100208f(c11728c, "mediaItem");
    }

    @Override // com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer.InterfaceC11727b
    /* renamed from: um */
    public void mo60383um(ChatAttachmentContainer.C11728c c11728c) {
        AbstractC19074t.m100208f(c11728c, "mediaItem");
    }

    /* renamed from: vM */
    public final void m62731vM() {
        try {
            if (m92674mJ() && !m92681pJ()) {
                this.f59696O0.sendEmptyMessageDelayed(0, 100L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessageContextMenuView", e11);
        }
    }

    /* renamed from: wM */
    public final void m62732wM() {
        try {
            C11603g0 c11603g0 = this.f59702U0;
            if (c11603g0 != null) {
                c11603g0.m64561h2();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ChatView) {
            this.f59708a1 = (ChatView) m92650VI;
        } else {
            finish();
        }
    }
}
