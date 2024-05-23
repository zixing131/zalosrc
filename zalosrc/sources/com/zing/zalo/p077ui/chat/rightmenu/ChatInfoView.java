package com.zing.zalo.p077ui.chat.rightmenu;

import ae.C0766k;
import ag0.C0815e1;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import b90.EnumC2667d;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView;
import com.zing.zalo.p077ui.custom.ViewOnTouchListenerC11852c;
import com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$ChatSettingModuleView;
import com.zing.zalo.p077ui.moduleview.chatinfo.ChatInfoModuleViews$SettingHorizontalModuleView;
import com.zing.zalo.p077ui.widget.ChatInfoHighLightSettingView;
import com.zing.zalo.p077ui.widget.DimHightLightView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.ProgressDialogView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19055h0;
import fn0.C19059j0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i60.C20338d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23201r8;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p056cj.C3535c;
import p241ij.C20568e;
import p266jg.AbstractC21244b;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p649xl.C30077v1;
import p649xl.C30094w1;
import p716zh.C31862c;
import p716zh.C31973j5;
import p716zh.C32002l4;
import th.C26688i;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26708g;
import ue0.AbstractC27241b;
import ue0.C27240a;
import ui0.C27280g;
import zc0.C31784b;

/* loaded from: classes5.dex */
public class ChatInfoView extends BaseZaloView implements InterfaceC11707d, View.OnClickListener, C23744a.c {
    public static final C11698b Companion = new C11698b(null);

    /* renamed from: M0 */
    private C3535c f60833M0;

    /* renamed from: N0 */
    private ChatInfoAdapter f60834N0;

    /* renamed from: O0 */
    private C23528a f60835O0;

    /* renamed from: P0 */
    private boolean f60836P0;

    /* renamed from: R0 */
    private KeyEventCallbackC17462c f60838R0;

    /* renamed from: S0 */
    private C30094w1 f60839S0;

    /* renamed from: T0 */
    private C30077v1 f60840T0;

    /* renamed from: U0 */
    public InterfaceC11706c f60841U0;

    /* renamed from: V0 */
    private int f60842V0;

    /* renamed from: W0 */
    private InterfaceC11697a f60843W0;

    /* renamed from: X0 */
    private boolean f60844X0;

    /* renamed from: Y0 */
    private boolean f60845Y0;

    /* renamed from: d1 */
    private C8009j f60850d1;

    /* renamed from: e1 */
    private ChatInfoAdapter.InterfaceC11689d f60851e1;

    /* renamed from: f1 */
    private DimHightLightView f60852f1;

    /* renamed from: Q0 */
    private final Handler f60837Q0 = new Handler(Looper.getMainLooper());

    /* renamed from: Z0 */
    private int f60846Z0 = -1;

    /* renamed from: a1 */
    private final Runnable f60847a1 = new Runnable() { // from class: h60.q
        public /* synthetic */ RunnableC19899q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ChatInfoView.m65127JM(ChatInfoView.this);
        }
    };

    /* renamed from: b1 */
    private final View.OnClickListener f60848b1 = new View.OnClickListener() { // from class: h60.r
        public /* synthetic */ ViewOnClickListenerC19900r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ChatInfoView.m65126IM(ChatInfoView.this, view);
        }
    };

    /* renamed from: c1 */
    private final View.OnClickListener f60849c1 = new View.OnClickListener() { // from class: h60.s
        public /* synthetic */ ViewOnClickListenerC19901s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ChatInfoView.m65125HM(ChatInfoView.this, view);
        }
    };

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11697a {

        /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoView$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static /* synthetic */ void m65203a(InterfaceC11697a interfaceC11697a, String str, String str2, String str3, String str4, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 1) != 0) {
                        str = "";
                    }
                    if ((i11 & 2) != 0) {
                        str2 = "";
                    }
                    if ((i11 & 4) != 0) {
                        str3 = "";
                    }
                    if ((i11 & 8) != 0) {
                        str4 = "";
                    }
                    interfaceC11697a.mo64157fg(str, str2, str3, str4);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertActionLogByChatMode");
            }
        }

        /* renamed from: Bb */
        void mo64096Bb(int i11, String str, int i12, String str2, boolean z11, int i13, String... strArr);

        /* renamed from: Fb */
        boolean mo64103Fb(int i11, boolean z11);

        /* renamed from: Gk */
        void mo64106Gk(String str);

        /* renamed from: Hg */
        void mo64107Hg();

        /* renamed from: P3 */
        void mo64121P3(boolean z11, boolean z12);

        /* renamed from: V */
        void mo64137V(int i11);

        /* renamed from: Wk */
        void mo64140Wk(C31973j5 c31973j5);

        /* renamed from: db */
        void mo64153db();

        /* renamed from: fg */
        void mo64157fg(String str, String str2, String str3, String str4);

        /* renamed from: l4 */
        void mo64170l4(C31862c c31862c, String str, String str2);

        /* renamed from: ok */
        void mo64177ok(int i11);

        /* renamed from: p8 */
        void mo64178p8();

        /* renamed from: vi */
        void mo64192vi(boolean z11);

        /* renamed from: xk */
        void mo64195xk(String str);
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoView$b */
    /* loaded from: classes5.dex */
    public static final class C11698b {
        private C11698b() {
        }

        public /* synthetic */ C11698b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoView$c */
    /* loaded from: classes5.dex */
    public static final class C11699c implements ChatInfoAdapter.InterfaceC11689d {
        C11699c() {
        }

        @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11689d
        /* renamed from: P1 */
        public void mo65109P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
            AbstractC19074t.m100208f(quickActionViewLayout, "view");
            AbstractC19074t.m100208f(c31862c, "actionItemInfo");
            if (!c31862c.f146315h) {
                ChatInfoView.this.m65178ZM(c31862c);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11689d
        /* renamed from: P3 */
        public void mo65110P3(boolean z11, boolean z12) {
            if (ChatInfoView.this.f60843W0 != null) {
                InterfaceC11697a interfaceC11697a = ChatInfoView.this.f60843W0;
                AbstractC19074t.m100205c(interfaceC11697a);
                interfaceC11697a.mo64121P3(z11, z12);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11689d
        /* renamed from: Q3 */
        public void mo65111Q3() {
            try {
                if (ChatInfoView.this.f60843W0 != null) {
                    InterfaceC11697a interfaceC11697a = ChatInfoView.this.f60843W0;
                    AbstractC19074t.m100205c(interfaceC11697a);
                    interfaceC11697a.mo64106Gk("rmenu");
                    AbstractC23647d.m123897g("10300111");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11689d
        /* renamed from: R3 */
        public void mo65112R3(C31862c c31862c, String str, String str2) {
            AbstractC19074t.m100208f(c31862c, "actionItemInfo");
            AbstractC19074t.m100208f(str, "actionType");
            AbstractC19074t.m100208f(str2, "actionData");
            ChatInfoView.this.m65200wM().mo65222Rm(c31862c, str, str2);
        }

        @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11689d
        /* renamed from: S3 */
        public void mo65113S3(int i11) {
            try {
                if (ChatInfoView.this.f60843W0 != null) {
                    InterfaceC11697a interfaceC11697a = ChatInfoView.this.f60843W0;
                    AbstractC19074t.m100205c(interfaceC11697a);
                    interfaceC11697a.mo64137V(i11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoView$d */
    /* loaded from: classes5.dex */
    public static final class C11700d extends RecyclerView.AbstractC1892s {
        C11700d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0 && ChatInfoView.this.m65201xM() >= 0) {
                ChatInfoView.this.m65150qM(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoView$e */
    /* loaded from: classes5.dex */
    public static final class C11701e extends ZdsActionBar.AbstractC16987c {
        C11701e() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            ChatInfoView.this.m65200wM().mo65241mk();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoView$f */
    /* loaded from: classes5.dex */
    public static final class C11702f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f60857b;

        C11702f(int i11) {
            this.f60857b = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            if (ChatInfoView.this.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            if (ChatInfoView.this.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(this.f60857b));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.ChatInfoView$g */
    /* loaded from: classes5.dex */
    public static final class C11703g extends ClickableSpan {

        /* renamed from: q */
        final /* synthetic */ String f60859q;

        /* renamed from: r */
        final /* synthetic */ ChatInfoView f60860r;

        public C11703g(String str, ChatInfoView chatInfoView) {
            this.f60859q = str;
            this.f60860r = chatInfoView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            AbstractC23211s7.m119563C(this.f60859q, this.f60860r.f72421L0.m92662fJ(), C32002l4.Companion.m154288b(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 19), null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(ChatInfoView.this.getContext(), AbstractC2807a.cta_link));
        }
    }

    /* renamed from: BM */
    public static final boolean m65121BM(ChatInfoView chatInfoView, RecyclerView recyclerView, int i11, View view) {
        ChatInfoAdapter.C11690e c11690e;
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        ChatInfoAdapter chatInfoAdapter = chatInfoView.f60834N0;
        if (chatInfoAdapter != null) {
            c11690e = chatInfoAdapter.m65087N(i11);
        } else {
            c11690e = null;
        }
        return chatInfoView.m65129LM(c11690e);
    }

    /* renamed from: CM */
    public static final void m65122CM(ChatInfoView chatInfoView, RecyclerView recyclerView, int i11, View view) {
        ChatInfoAdapter.C11690e c11690e;
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        InterfaceC11706c m65200wM = chatInfoView.m65200wM();
        ChatInfoAdapter chatInfoAdapter = chatInfoView.f60834N0;
        if (chatInfoAdapter != null) {
            c11690e = chatInfoAdapter.m65087N(i11);
        } else {
            c11690e = null;
        }
        m65200wM.mo65247um(c11690e);
    }

    /* renamed from: DM */
    private final void m65123DM(int i11) {
        InterfaceC11706c c11710g;
        this.f60842V0 = i11;
        C3535c c3535c = null;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 6) {
                        c11710g = new C11705b(this);
                    } else {
                        c11710g = new C11708e(this);
                    }
                } else {
                    c11710g = new C11709f(this, null, 2, null);
                }
            } else {
                c11710g = new C11711h(this);
            }
        } else {
            c11710g = new C11710g(this);
        }
        m65169SM(c11710g);
        InterfaceC11706c m65200wM = m65200wM();
        C3535c c3535c2 = this.f60833M0;
        if (c3535c2 == null) {
            AbstractC19074t.m100223u("mCurrentChat");
        } else {
            c3535c = c3535c2;
        }
        m65200wM.mo65244o4(c3535c);
        if (this.f60843W0 != null) {
            InterfaceC11706c m65200wM2 = m65200wM();
            InterfaceC11697a interfaceC11697a = this.f60843W0;
            AbstractC19074t.m100205c(interfaceC11697a);
            m65200wM2.mo65215I7(interfaceC11697a);
        }
    }

    /* renamed from: FM */
    public static final void m65124FM(ChatInfoView chatInfoView, View view) {
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        chatInfoView.m65200wM().mo65246rl();
        InterfaceC11697a interfaceC11697a = chatInfoView.f60843W0;
        if (interfaceC11697a != null) {
            AbstractC19074t.m100205c(interfaceC11697a);
            interfaceC11697a.mo64096Bb(2, "rmenu", 0, "rmenu_ava_camera", false, 2, new String[0]);
        }
    }

    /* renamed from: HM */
    public static final void m65125HM(ChatInfoView chatInfoView, View view) {
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        try {
            chatInfoView.m65200wM().mo65254lk();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: IM */
    public static final void m65126IM(ChatInfoView chatInfoView, View view) {
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        chatInfoView.m65200wM().mo65253Ql(view instanceof RobotoTextView);
    }

    /* renamed from: JM */
    public static final void m65127JM(ChatInfoView chatInfoView) {
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        try {
            if (!chatInfoView.m92677nJ()) {
                chatInfoView.m65200wM().mo65245o5(new Runnable() { // from class: h60.u
                    public /* synthetic */ RunnableC19903u() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatInfoView.m65128KM(ChatInfoView.this);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: KM */
    public static final void m65128KM(ChatInfoView chatInfoView) {
        ChatInfoAdapter chatInfoAdapter;
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        if (!chatInfoView.m65150qM(false) && chatInfoView.f60845Y0 && (chatInfoAdapter = chatInfoView.f60834N0) != null) {
            chatInfoView.f60845Y0 = false;
            if (chatInfoAdapter != null && chatInfoAdapter.m65088O() > 0) {
                C30077v1 c30077v1 = chatInfoView.f60840T0;
                if (c30077v1 == null) {
                    AbstractC19074t.m100223u("mainBinding");
                    c30077v1 = null;
                }
                c30077v1.f139618s.m9837K1(chatInfoAdapter.mo10003k() - 1);
            }
        }
    }

    /* renamed from: LM */
    private final boolean m65129LM(ChatInfoAdapter.C11690e c11690e) {
        if (c11690e == null || c11690e.m65115b() != 1) {
            return false;
        }
        int m65118d = ((ChatInfoAdapter.C11692g) c11690e).m65118d();
        InterfaceC11697a interfaceC11697a = this.f60843W0;
        if (interfaceC11697a != null) {
            AbstractC19074t.m100205c(interfaceC11697a);
            interfaceC11697a.mo64177ok(m65118d);
        }
        return true;
    }

    /* renamed from: MA */
    private final void m65130MA() {
        this.f60846Z0 = -1;
    }

    /* renamed from: OM */
    private final int m65131OM(C3535c c3535c, boolean z11) {
        String m17944I0 = c3535c.m17944I0();
        if (AbstractC25495a.m132079d(m17944I0)) {
            if (C26688i.f126427a.m137069c() && C25489b.f122105a.m132048j(m17944I0) != null) {
                return 6;
            }
            return 2;
        }
        if (AbstractC25495a.m132078c(m17944I0)) {
            return 4;
        }
        if (!c3535c.m17971y0().m41017x() && !z11) {
            return 1;
        }
        return 3;
    }

    /* renamed from: QM */
    public static final void m65132QM(ChatInfoView chatInfoView) {
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        chatInfoView.m65137dN(true, chatInfoView.m65153yM(chatInfoView.m65200wM().mo65237im(), chatInfoView.m65200wM().mo65237im()));
    }

    /* renamed from: RM */
    private final void m65133RM(int i11, int i12) {
        C30077v1 c30077v1 = this.f60840T0;
        if (c30077v1 == null) {
            return;
        }
        if (c30077v1 == null) {
            try {
                AbstractC19074t.m100223u("mainBinding");
                c30077v1 = null;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c30077v1.f139618s.getLayoutManager();
        AbstractC19074t.m100205c(linearLayoutManager);
        linearLayoutManager.m9721B2(i11, i12);
    }

    /* renamed from: aN */
    public static final void m65134aN(SimpleAdapter simpleAdapter, C31862c c31862c, ChatInfoView chatInfoView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        Object obj = ((HashMap) item).get("id");
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) obj).intValue() == AbstractC6918a0.menu_delete) {
            C0815e1.m2075D().m2092K(c31862c, "action.window.close", 3);
            chatInfoView.m65200wM().mo65210B3(c31862c);
        }
    }

    /* renamed from: cN */
    public static final void m65135cN(String str, String str2, String str3, ChatInfoView chatInfoView, int i11, int i12, String str4) {
        AbstractC19074t.m100208f(str2, "$reportType");
        AbstractC19074t.m100208f(str3, "$objectId");
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11702f(i11));
        c0766k.mo1787ya(str, str2, str3, "", i12, str4);
    }

    /* renamed from: dN */
    private final void m65137dN(boolean z11, Rect rect) {
        try {
            if (z11 && rect != null) {
                if (this.f60852f1 == null) {
                    DimHightLightView dimHightLightView = new DimHightLightView(getContext());
                    this.f60852f1 = dimHightLightView;
                    AbstractC19074t.m100205c(dimHightLightView);
                    dimHightLightView.setElevation(m92651WI().getDimension(AbstractC17454d.width_shadow_action_bar));
                }
                C30077v1 c30077v1 = this.f60840T0;
                if (c30077v1 == null) {
                    AbstractC19074t.m100223u("mainBinding");
                    c30077v1 = null;
                }
                FrameLayout root = c30077v1.getRoot();
                AbstractC19074t.m100205c(root);
                root.addView(this.f60852f1, new ViewGroup.LayoutParams(-1, -1));
                DimHightLightView dimHightLightView2 = this.f60852f1;
                AbstractC19074t.m100205c(dimHightLightView2);
                dimHightLightView2.setVisibility(0);
                DimHightLightView dimHightLightView3 = this.f60852f1;
                AbstractC19074t.m100205c(dimHightLightView3);
                dimHightLightView3.m75684i(rect, 1000L);
                DimHightLightView dimHightLightView4 = this.f60852f1;
                AbstractC19074t.m100205c(dimHightLightView4);
                dimHightLightView4.setAlpha(0.0f);
                DimHightLightView dimHightLightView5 = this.f60852f1;
                AbstractC19074t.m100205c(dimHightLightView5);
                dimHightLightView5.animate().alpha(1.0f).setDuration(150L).start();
                return;
            }
            DimHightLightView dimHightLightView6 = this.f60852f1;
            if (dimHightLightView6 != null) {
                AbstractC19074t.m100205c(dimHightLightView6);
                dimHightLightView6.m75681c();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: h60.v.<init>(fn0.j0, com.zing.zalo.ui.chat.rightmenu.ChatInfoView, int, fn0.h0, com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter, int, int, boolean, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: qM */
    public final boolean m65150qM(boolean r14) {
        /*
            r13 = this;
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            r1 = 0
            int r2 = r13.f60846Z0     // Catch: java.lang.Exception -> L34
            if (r2 < 0) goto Lb9
            com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter r8 = r13.f60834N0     // Catch: java.lang.Exception -> L34
            if (r8 == 0) goto Lb9
            int r6 = r8.m65089P(r2)     // Catch: java.lang.Exception -> L34
            fn0.h0 r7 = new fn0.h0     // Catch: java.lang.Exception -> L34
            r7.<init>()     // Catch: java.lang.Exception -> L34
            r7.f94931p = r6     // Catch: java.lang.Exception -> L34
            fn0.j0 r4 = new fn0.j0     // Catch: java.lang.Exception -> L34
            r4.<init>()     // Catch: java.lang.Exception -> L34
            if (r6 < 0) goto Lb9
            com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$e r2 = r8.m65087N(r6)     // Catch: java.lang.Exception -> L34
            java.lang.String r3 = "null cannot be cast to non-null type com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter.ChatSettingItem"
            fn0.AbstractC19074t.m100206d(r2, r3)     // Catch: java.lang.Exception -> L34
            com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter$g r2 = (com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.C11692g) r2     // Catch: java.lang.Exception -> L34
            boolean r2 = r2.f60825p     // Catch: java.lang.Exception -> L34
            if (r2 == 0) goto L37
            int r2 = com.zing.zalo.AbstractC16802y.section_divider_line     // Catch: java.lang.Exception -> L34
            int r2 = me0.AbstractC23136l9.m118655I(r2)     // Catch: java.lang.Exception -> L34
            r12 = r2
            goto L38
        L34:
            r14 = move-exception
            goto Lb6
        L37:
            r12 = 0
        L38:
            xl.v1 r2 = r13.f60840T0     // Catch: java.lang.Exception -> L34
            r3 = 0
            java.lang.String r5 = "mainBinding"
            if (r2 != 0) goto L43
            fn0.AbstractC19074t.m100223u(r5)     // Catch: java.lang.Exception -> L34
            r2 = r3
        L43:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f139618s     // Catch: java.lang.Exception -> L34
            androidx.recyclerview.widget.RecyclerView$o r2 = r2.getLayoutManager()     // Catch: java.lang.Exception -> L34
            fn0.AbstractC19074t.m100206d(r2, r0)     // Catch: java.lang.Exception -> L34
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2     // Catch: java.lang.Exception -> L34
            int r9 = r2.m9737T1()     // Catch: java.lang.Exception -> L34
            xl.v1 r2 = r13.f60840T0     // Catch: java.lang.Exception -> L34
            if (r2 != 0) goto L5a
            fn0.AbstractC19074t.m100223u(r5)     // Catch: java.lang.Exception -> L34
            r2 = r3
        L5a:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f139618s     // Catch: java.lang.Exception -> L34
            androidx.recyclerview.widget.RecyclerView$o r2 = r2.getLayoutManager()     // Catch: java.lang.Exception -> L34
            fn0.AbstractC19074t.m100206d(r2, r0)     // Catch: java.lang.Exception -> L34
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2     // Catch: java.lang.Exception -> L34
            int r10 = r2.m9741Z1()     // Catch: java.lang.Exception -> L34
            int r0 = r9 + 3
            r2 = 1
            if (r6 >= r0) goto L77
            int r0 = r6 + (-3)
            int r0 = ln0.AbstractC22541j.m116564c(r1, r0)     // Catch: java.lang.Exception -> L34
            r7.f94931p = r0     // Catch: java.lang.Exception -> L34
            goto L88
        L77:
            int r0 = r10 + (-3)
            if (r6 <= r0) goto L88
            int r0 = r6 + 3
            int r11 = r8.mo10003k()     // Catch: java.lang.Exception -> L34
            int r11 = r11 - r2
            int r0 = ln0.AbstractC22541j.m116568g(r0, r11)     // Catch: java.lang.Exception -> L34
            r7.f94931p = r0     // Catch: java.lang.Exception -> L34
        L88:
            if (r14 != 0) goto L99
            xl.v1 r0 = r13.f60840T0     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto L92
            fn0.AbstractC19074t.m100223u(r5)     // Catch: java.lang.Exception -> L34
            r0 = r3
        L92:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f139618s     // Catch: java.lang.Exception -> L34
            int r11 = r7.f94931p     // Catch: java.lang.Exception -> L34
            r0.mo9854S1(r11)     // Catch: java.lang.Exception -> L34
        L99:
            xl.v1 r0 = r13.f60840T0     // Catch: java.lang.Exception -> La1
            if (r0 != 0) goto La4
            fn0.AbstractC19074t.m100223u(r5)     // Catch: java.lang.Exception -> La1
            goto La5
        La1:
            r14 = move-exception
            r1 = 1
            goto Lb6
        La4:
            r3 = r0
        La5:
            android.widget.FrameLayout r0 = r3.getRoot()     // Catch: java.lang.Exception -> La1
            h60.v r1 = new h60.v     // Catch: java.lang.Exception -> La1
            r3 = r1
            r5 = r13
            r11 = r14
            r3.<init>()     // Catch: java.lang.Exception -> La1
            r0.post(r1)     // Catch: java.lang.Exception -> La1
            r1 = 1
            goto Lb9
        Lb6:
            mm0.AbstractC23350e.m122778h(r14)
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView.m65150qM(boolean):boolean");
    }

    /* renamed from: rM */
    public static final void m65151rM(C19059j0 c19059j0, ChatInfoView chatInfoView, int i11, C19055h0 c19055h0, ChatInfoAdapter chatInfoAdapter, int i12, int i13, boolean z11, int i14) {
        View view;
        int i15;
        AbstractC19074t.m100208f(c19059j0, "$view");
        AbstractC19074t.m100208f(chatInfoView, "this$0");
        AbstractC19074t.m100208f(c19055h0, "$scrollPosition");
        AbstractC19074t.m100208f(chatInfoAdapter, "$this_apply");
        C30077v1 c30077v1 = chatInfoView.f60840T0;
        C30077v1 c30077v12 = null;
        if (c30077v1 == null) {
            AbstractC19074t.m100223u("mainBinding");
            c30077v1 = null;
        }
        RecyclerView.AbstractC1888o layoutManager = c30077v1.f139618s.getLayoutManager();
        if (layoutManager != null) {
            view = layoutManager.mo9732P(i11);
        } else {
            view = null;
        }
        c19059j0.f94941p = view;
        int i16 = c19055h0.f94931p;
        if ((i16 == i11 && i16 != chatInfoAdapter.mo10003k() - 1 && c19055h0.f94931p != 0) || ((i12 <= (i15 = c19055h0.f94931p) && i15 <= i13) || z11)) {
            View view2 = (View) c19059j0.f94941p;
            C30077v1 c30077v13 = chatInfoView.f60840T0;
            if (c30077v13 == null) {
                AbstractC19074t.m100223u("mainBinding");
            } else {
                c30077v12 = c30077v13;
            }
            ChatInfoHighLightSettingView chatInfoHighLightSettingView = c30077v12.f139616q;
            AbstractC19074t.m100207e(chatInfoHighLightSettingView, "hightLightView");
            chatInfoView.m65152tM(view2, chatInfoHighLightSettingView, i14);
            chatInfoView.m65130MA();
        }
    }

    /* renamed from: tM */
    private final void m65152tM(View view, ChatInfoHighLightSettingView chatInfoHighLightSettingView, int i11) {
        if (view == null) {
            return;
        }
        int[] iArr = new int[2];
        C30077v1 c30077v1 = this.f60840T0;
        if (c30077v1 == null) {
            AbstractC19074t.m100223u("mainBinding");
            c30077v1 = null;
        }
        c30077v1.getRoot().getLocationOnScreen(iArr);
        chatInfoHighLightSettingView.setMYGlobalView(iArr[1]);
        chatInfoHighLightSettingView.setOffset(i11);
        chatInfoHighLightSettingView.mo75614e(view);
    }

    /* renamed from: yM */
    private final Rect m65153yM(int i11, int i12) {
        if (this.f60840T0 != null || i11 < 0 || i12 < 0) {
            return null;
        }
        try {
            Rect rect = new Rect();
            C30077v1 c30077v1 = this.f60840T0;
            if (c30077v1 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v1 = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c30077v1.f139618s.getLayoutManager();
            int[] iArr = new int[2];
            C30077v1 c30077v12 = this.f60840T0;
            if (c30077v12 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v12 = null;
            }
            c30077v12.f139618s.getLocationOnScreen(iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            C30077v1 c30077v13 = this.f60840T0;
            if (c30077v13 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v13 = null;
            }
            int left = i13 - c30077v13.f139618s.getLeft();
            C30077v1 c30077v14 = this.f60840T0;
            if (c30077v14 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v14 = null;
            }
            int right = left + c30077v14.f139618s.getRight();
            int i15 = iArr[1];
            C30077v1 c30077v15 = this.f60840T0;
            if (c30077v15 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v15 = null;
            }
            int top = i15 - c30077v15.f139618s.getTop();
            C30077v1 c30077v16 = this.f60840T0;
            if (c30077v16 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v16 = null;
            }
            int bottom = top + c30077v16.f139618s.getBottom();
            AbstractC19074t.m100205c(linearLayoutManager);
            View mo9732P = linearLayoutManager.mo9732P(i11);
            View mo9732P2 = linearLayoutManager.mo9732P(i12);
            if (mo9732P != null) {
                int[] iArr2 = new int[2];
                mo9732P.getLocationOnScreen(iArr2);
                int i16 = iArr2[0];
                rect.left = i16;
                rect.top = iArr2[1];
                rect.right = (i16 - mo9732P.getLeft()) + mo9732P.getRight();
            } else {
                if (mo9732P2 == null) {
                    return null;
                }
                rect.left = i13;
                rect.top = i14;
                rect.right = right;
            }
            if (mo9732P2 != null) {
                int[] iArr3 = new int[2];
                mo9732P2.getLocationOnScreen(iArr3);
                rect.bottom = (iArr3[1] - mo9732P2.getTop()) + mo9732P2.getBottom();
            } else {
                rect.bottom = bottom;
            }
            if (rect.left < i13) {
                rect.left = i13;
            }
            if (rect.top < i14) {
                rect.top = i14;
            }
            if (rect.right > right) {
                rect.right = right;
            }
            if (rect.bottom > bottom) {
                rect.bottom = bottom;
            }
            return rect;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: AM */
    public void mo65154AM() {
        try {
            this.f60851e1 = new C11699c();
            C23528a c23528a = this.f60835O0;
            C30077v1 c30077v1 = null;
            if (c23528a == null) {
                AbstractC19074t.m100223u("mAQuery");
                c23528a = null;
            }
            ChatInfoAdapter.InterfaceC11689d interfaceC11689d = this.f60851e1;
            if (interfaceC11689d == null) {
                AbstractC19074t.m100223u("adapterListener");
                interfaceC11689d = null;
            }
            C30094w1 c30094w1 = this.f60839S0;
            if (c30094w1 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w1 = null;
            }
            ChatInfoAdapter chatInfoAdapter = new ChatInfoAdapter(this, c23528a, interfaceC11689d, c30094w1.getRoot());
            this.f60834N0 = chatInfoAdapter;
            C3535c c3535c = this.f60833M0;
            if (c3535c == null) {
                AbstractC19074t.m100223u("mCurrentChat");
                c3535c = null;
            }
            chatInfoAdapter.f60779v = c3535c;
            C30077v1 c30077v12 = this.f60840T0;
            if (c30077v12 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v12 = null;
            }
            c30077v12.f139618s.setLayoutManager(new LinearLayoutManager(getContext()) { // from class: com.zing.zalo.ui.chat.rightmenu.ChatInfoView$initData$2
                public ChatInfoView$initData$2(Context context) {
                    super(context);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
                /* renamed from: q1 */
                public boolean mo10150q1(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
                    AbstractC19074t.m100208f(recyclerView, "parent");
                    AbstractC19074t.m100208f(view, "child");
                    AbstractC19074t.m100208f(rect, "rect");
                    return false;
                }
            });
            C30077v1 c30077v13 = this.f60840T0;
            if (c30077v13 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v13 = null;
            }
            c30077v13.f139618s.setAdapter(this.f60834N0);
            C30077v1 c30077v14 = this.f60840T0;
            if (c30077v14 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v14 = null;
            }
            C31784b.m152808a(c30077v14.f139618s).m152809b(new C31784b.d() { // from class: h60.m
                public /* synthetic */ C19895m() {
                }

                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    ChatInfoView.m65122CM(ChatInfoView.this, recyclerView, i11, view);
                }
            });
            C30077v1 c30077v15 = this.f60840T0;
            if (c30077v15 == null) {
                AbstractC19074t.m100223u("mainBinding");
            } else {
                c30077v1 = c30077v15;
            }
            C31784b.m152808a(c30077v1.f139618s).m152810c(new C31784b.e() { // from class: h60.o
                public /* synthetic */ C19897o() {
                }

                @Override // zc0.C31784b.e
                /* renamed from: T3 */
                public final boolean mo81113T3(RecyclerView recyclerView, int i11, View view) {
                    boolean m65121BM;
                    m65121BM = ChatInfoView.m65121BM(ChatInfoView.this, recyclerView, i11, view);
                    return m65121BM;
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: Ac */
    public void mo65155Ac(ZCloudQuotaUsage zCloudQuotaUsage) {
        AbstractC19074t.m100208f(zCloudQuotaUsage, "cloudQuotaUsage");
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: Bk */
    public void mo65156Bk(boolean z11) {
        int i11;
        int i12;
        C30094w1 c30094w1 = this.f60839S0;
        C30094w1 c30094w12 = null;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        RobotoTextView robotoTextView = c30094w1.f139753t;
        if (z11) {
            i11 = AbstractC16803z.icn_edit_24;
        } else {
            i11 = 0;
        }
        robotoTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i11, 0);
        if (z11) {
            i12 = AbstractC23222t7.f112528I;
        } else {
            i12 = 0;
        }
        C30094w1 c30094w13 = this.f60839S0;
        if (c30094w13 == null) {
            AbstractC19074t.m100223u("headerBinding");
        } else {
            c30094w12 = c30094w13;
        }
        c30094w12.f139753t.setPadding(i12, 0, 0, 0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f60835O0 = new C23528a(m92648SI());
    }

    /* renamed from: Du */
    public final void m65157Du() {
        m65200wM().mo65243nm();
    }

    /* renamed from: EM */
    public void mo65158EM() {
        try {
            C30077v1 c30077v1 = null;
            View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.chat_info_header_v3, (ViewGroup) null);
            C30094w1 m148636a = C30094w1.m148636a(inflate);
            AbstractC19074t.m100207e(m148636a, "bind(...)");
            this.f60839S0 = m148636a;
            if (m148636a == null) {
                AbstractC19074t.m100223u("headerBinding");
                m148636a = null;
            }
            m148636a.f139752s.setOnClickListener(this.f60849c1);
            C30094w1 c30094w1 = this.f60839S0;
            if (c30094w1 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w1 = null;
            }
            c30094w1.f139750q.setOnClickListener(this);
            C30094w1 c30094w12 = this.f60839S0;
            if (c30094w12 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w12 = null;
            }
            c30094w12.f139753t.setOnClickListener(this.f60848b1);
            C30094w1 c30094w13 = this.f60839S0;
            if (c30094w13 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w13 = null;
            }
            c30094w13.f139751r.setVisibility(8);
            C30094w1 c30094w14 = this.f60839S0;
            if (c30094w14 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w14 = null;
            }
            c30094w14.f139757x.setVisibility(8);
            C30094w1 c30094w15 = this.f60839S0;
            if (c30094w15 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w15 = null;
            }
            c30094w15.f139757x.setImageDrawable(AbstractC23136l9.m118665N(inflate.getContext(), AbstractC16803z.ic_oa_verify));
            mo65156Bk(false);
            C30094w1 c30094w16 = this.f60839S0;
            if (c30094w16 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w16 = null;
            }
            c30094w16.f139756w.setVisibility(8);
            C30094w1 c30094w17 = this.f60839S0;
            if (c30094w17 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w17 = null;
            }
            c30094w17.f139756w.setOnClickListener(new View.OnClickListener() { // from class: h60.p
                public /* synthetic */ ViewOnClickListenerC19898p() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatInfoView.m65124FM(ChatInfoView.this, view);
                }
            });
            C30077v1 c30077v12 = this.f60840T0;
            if (c30077v12 == null) {
                AbstractC19074t.m100223u("mainBinding");
            } else {
                c30077v1 = c30077v12;
            }
            c30077v1.f139618s.m9826E(new C11700d());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: F0 */
    public final void m65159F0(String str, String str2) {
        try {
            InterfaceC11706c m65200wM = m65200wM();
            AbstractC19074t.m100205c(str);
            AbstractC19074t.m100205c(str2);
            m65200wM.mo65212F0(str, str2);
        } catch (NumberFormatException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: G0 */
    public void mo65160G0() {
        try {
            if (this.f72826A0 == null) {
                this.f72826A0 = new ProgressDialogView();
            }
            this.f72826A0.mo43041MK(true);
            this.f72826A0.m83097WK(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f72826A0.mo83093TK(m92649TI());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C27240a m139381b = AbstractC27241b.m139381b("10000017");
        long m139378c = m139381b.m139378c();
        View inflate = layoutInflater.inflate(AbstractC7409c0.chat_info_fragment, viewGroup, false);
        C30077v1 m148596a = C30077v1.m148596a(inflate);
        AbstractC19074t.m100207e(m148596a, "bind(...)");
        this.f60840T0 = m148596a;
        m139381b.m139376a(m139378c);
        if (m92692wK().mo35576n3()) {
            this.f60836P0 = true;
            mo65158EM();
            mo65154AM();
            mo65183d0();
            m65172VM(true);
            m65177YM(true);
        }
        return inflate;
    }

    /* renamed from: GM */
    public final void m65161GM() {
        if (!this.f60836P0) {
            AbstractC27241b.m139382c("10000001");
            this.f60836P0 = true;
            mo65158EM();
            mo65154AM();
            AbstractC27241b.m139380a("10000001");
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: Ht */
    public void mo65162Ht(boolean z11, boolean z12) {
        int i11;
        Handler handler = this.f60837Q0;
        C30094w1 c30094w1 = this.f60839S0;
        C30094w1 c30094w12 = null;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        ProgressBar progressBar = c30094w1.f139759z.f138654q;
        int i12 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC2364o0.m12371n(handler, progressBar, i11);
        Handler handler2 = this.f60837Q0;
        C30094w1 c30094w13 = this.f60839S0;
        if (c30094w13 == null) {
            AbstractC19074t.m100223u("headerBinding");
        } else {
            c30094w12 = c30094w13;
        }
        AppCompatImageView appCompatImageView = c30094w12.f139750q;
        if (z12) {
            i12 = 0;
        }
        AbstractC2364o0.m12371n(handler2, appCompatImageView, i12);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: K6 */
    public void mo65163K6() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        this.f60843W0 = null;
        this.f60837Q0.removeCallbacks(this.f60847a1);
    }

    /* renamed from: MM */
    public final void m65164MM() {
        ChatInfoAdapter chatInfoAdapter = this.f60834N0;
        if (chatInfoAdapter != null) {
            chatInfoAdapter.m10008p();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: Mv */
    public void mo65165Mv(EnumC2667d enumC2667d) {
        AbstractC19074t.m100208f(enumC2667d, "state");
    }

    /* renamed from: NM */
    public final void m65166NM(C3535c c3535c, boolean z11) {
        AbstractC19074t.m100208f(c3535c, "chat");
        int m65131OM = m65131OM(c3535c, z11);
        if (m65131OM != this.f60842V0) {
            m65123DM(m65131OM);
            if (m92672lJ() && this.f60844X0) {
                m65200wM().mo65242nj();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C11701e());
            Button leadingButton = m87077NK.getLeadingButton();
            if (leadingButton != null) {
                AbstractC23201r8.m119531a(leadingButton, AbstractC8020f0.tb_btn_home);
            }
        }
    }

    /* renamed from: PM */
    public final void m65167PM() {
        if (m65200wM().mo65237im() > 0) {
            m65133RM(m65200wM().mo65237im(), 300);
        }
        mo78955kl(new Runnable() { // from class: h60.n
            public /* synthetic */ RunnableC19896n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatInfoView.m65132QM(ChatInfoView.this);
            }
        }, 300L);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: QC */
    public boolean mo65168QC() {
        return this.f60844X0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 9);
        bVar.m124119a().m124117e(this, 6019);
    }

    /* renamed from: SM */
    public final void m65169SM(InterfaceC11706c interfaceC11706c) {
        AbstractC19074t.m100208f(interfaceC11706c, "<set-?>");
        this.f60841U0 = interfaceC11706c;
    }

    /* renamed from: TM */
    public final void m65170TM(C3535c c3535c, boolean z11, InterfaceC11697a interfaceC11697a) {
        AbstractC19074t.m100208f(c3535c, "chat");
        AbstractC19074t.m100208f(interfaceC11697a, "listener");
        this.f60833M0 = c3535c;
        this.f60843W0 = interfaceC11697a;
        m65123DM(m65131OM(c3535c, z11));
    }

    /* renamed from: UM */
    public final void m65171UM() {
        this.f60836P0 = true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f60838R0;
        if (keyEventCallbackC17462c != null) {
            AbstractC19074t.m100205c(keyEventCallbackC17462c);
            if (keyEventCallbackC17462c.m92868m()) {
                KeyEventCallbackC17462c keyEventCallbackC17462c2 = this.f60838R0;
                AbstractC19074t.m100205c(keyEventCallbackC17462c2);
                keyEventCallbackC17462c2.dismiss();
            }
        }
    }

    /* renamed from: VM */
    public final void m65172VM(boolean z11) {
        int i11;
        C30077v1 c30077v1 = this.f60840T0;
        if (c30077v1 != null) {
            if (c30077v1 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v1 = null;
            }
            RecyclerView recyclerView = c30077v1.f139618s;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            recyclerView.setVisibility(i11);
        }
    }

    /* renamed from: WM */
    public final void m65173WM(boolean z11) {
        this.f60845Y0 = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: Ws */
    public void mo65174Ws(List list) {
        AbstractC19074t.m100208f(list, "items");
        ChatInfoAdapter chatInfoAdapter = this.f60834N0;
        if (chatInfoAdapter != null) {
            chatInfoAdapter.m65092S(list);
        }
    }

    /* renamed from: XM */
    public final void m65175XM(C31862c c31862c, boolean z11) {
        m65200wM().mo65214Fh(c31862c, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: Xt */
    public void mo65176Xt(C31973j5 c31973j5, String str) {
        AbstractC19074t.m100208f(c31973j5, "group");
        AbstractC19074t.m100208f(str, "uploadPath");
        C30094w1 c30094w1 = this.f60839S0;
        C30094w1 c30094w12 = null;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        c30094w1.f139752s.setImageOption(C23278z2.m120141m0());
        if (str.length() > 0) {
            C30094w1 c30094w13 = this.f60839S0;
            if (c30094w13 == null) {
                AbstractC19074t.m100223u("headerBinding");
            } else {
                c30094w12 = c30094w13;
            }
            c30094w12.f139752s.m75732d(str);
            return;
        }
        if (c31973j5.m153786t0()) {
            C30094w1 c30094w14 = this.f60839S0;
            if (c30094w14 == null) {
                AbstractC19074t.m100223u("headerBinding");
            } else {
                c30094w12 = c30094w14;
            }
            c30094w12.f139752s.m75732d(c31973j5.m153756e());
            return;
        }
        if (c31973j5.m153747Y()) {
            C30094w1 c30094w15 = this.f60839S0;
            if (c30094w15 == null) {
                AbstractC19074t.m100223u("headerBinding");
            } else {
                c30094w12 = c30094w15;
            }
            c30094w12.f139752s.setImageResource(AbstractC16803z.ic_ava_community);
            return;
        }
        C30094w1 c30094w16 = this.f60839S0;
        if (c30094w16 == null) {
            AbstractC19074t.m100223u("headerBinding");
        } else {
            c30094w12 = c30094w16;
        }
        c30094w12.f139752s.setImageResource(AbstractC16803z.ic_ava_group);
    }

    /* renamed from: YM */
    public final void m65177YM(boolean z11) {
        boolean z12;
        try {
            if (this.f60844X0 != z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f60844X0 = z11;
            if (z12 && z11 && this.f60836P0) {
                m65200wM().mo65242nj();
            }
            if (this.f60844X0) {
                m65202zM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: ZM */
    public final void m65178ZM(C31862c c31862c) {
        if (c31862c != null) {
            C8009j c8009j = this.f60850d1;
            if (c8009j != null) {
                AbstractC19074t.m100205c(c8009j);
                if (c8009j.m92868m()) {
                    C8009j c8009j2 = this.f60850d1;
                    AbstractC19074t.m100205c(c8009j2);
                    c8009j2.dismiss();
                }
            }
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.delete));
            hashMap.put("id", Integer.valueOf(AbstractC6918a0.menu_delete));
            arrayList.add(hashMap);
            SimpleAdapter simpleAdapter = new SimpleAdapter(m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar = new C8009j.a(m92648SI());
            aVar.m43172u("");
            aVar.m43173v(100);
            aVar.m43155d(true);
            aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: h60.w

                /* renamed from: p */
                public final /* synthetic */ SimpleAdapter f98099p;

                /* renamed from: q */
                public final /* synthetic */ C31862c f98100q;

                /* renamed from: r */
                public final /* synthetic */ ChatInfoView f98101r;

                public /* synthetic */ C19905w(SimpleAdapter simpleAdapter2, C31862c c31862c2, ChatInfoView this) {
                    r1 = simpleAdapter2;
                    r2 = c31862c2;
                    r3 = this;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChatInfoView.m65134aN(r1, r2, r3, interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f60850d1 = m43152a;
            if (m43152a != null) {
                AbstractC19074t.m100205c(m43152a);
                m43152a.mo13822K();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: Zk */
    public void mo65179Zk(boolean z11, String str, String str2) {
        int i11;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "ownerName");
        C30094w1 c30094w1 = this.f60839S0;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        c30094w1.f139751r.setVisibility(0);
        StringBuilder sb2 = new StringBuilder();
        C30094w1 c30094w12 = this.f60839S0;
        if (c30094w12 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w12 = null;
        }
        Context context = c30094w12.f139751r.getContext();
        if (z11) {
            i11 = AbstractC8020f0.str_community_of;
        } else {
            i11 = AbstractC8020f0.str_group_of;
        }
        sb2.append(context.getString(i11));
        sb2.append(" ");
        int length = sb2.length();
        sb2.append(str2);
        int length2 = sb2.length();
        C30094w1 c30094w13 = this.f60839S0;
        if (c30094w13 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w13 = null;
        }
        c30094w13.f139751r.setPadding(0, 0, 0, 0);
        SpannableString spannableString = new SpannableString(sb2);
        spannableString.setSpan(new StyleSpan(1), length, length2, 33);
        spannableString.setSpan(new C11703g(str, this), length, length2, 33);
        C30094w1 c30094w14 = this.f60839S0;
        if (c30094w14 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w14 = null;
        }
        c30094w14.f139751r.setOnTouchListener(new ViewOnTouchListenerC11852c(spannableString));
        C30094w1 c30094w15 = this.f60839S0;
        if (c30094w15 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w15 = null;
        }
        c30094w15.f139751r.setText(spannableString);
        C30094w1 c30094w16 = this.f60839S0;
        if (c30094w16 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w16 = null;
        }
        c30094w16.f139751r.setBackgroundResource(0);
        C30094w1 c30094w17 = this.f60839S0;
        if (c30094w17 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w17 = null;
        }
        RobotoTextView robotoTextView = c30094w17.f139751r;
        AbstractC19074t.m100207e(robotoTextView, "chatContactDesc");
        C26708g c26708g = new C26708g(robotoTextView);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        c26708g.m137319a(C26705d.m137293a(m92689tK, AbstractC2814h.t_small));
        C30094w1 c30094w18 = this.f60839S0;
        if (c30094w18 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w18 = null;
        }
        c30094w18.f139751r.setTextColor(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        Drawable m139658a = C27280g.m139658a(m92689tK2, AbstractC23322a.zds_oic_oa_star_check_color_24);
        if (m139658a != null) {
            int i12 = AbstractC23222t7.f112586t;
            m139658a.setBounds(0, 0, i12, i12);
            C30094w1 c30094w19 = this.f60839S0;
            if (c30094w19 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w19 = null;
            }
            c30094w19.f139751r.setCompoundDrawablePadding(AbstractC23222t7.f112556e);
            C30094w1 c30094w110 = this.f60839S0;
            if (c30094w110 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w110 = null;
            }
            c30094w110.f139751r.setCompoundDrawables(null, null, m139658a, null);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: a3 */
    public Context mo65180a3() {
        Context context = getContext();
        if (context == null) {
            return MainApplication.Companion.m35500c();
        }
        return context;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: h60.t.<init>(java.lang.String, java.lang.String, java.lang.String, com.zing.zalo.ui.chat.rightmenu.ChatInfoView, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: bN */
    public final void m65181bN(java.lang.String r10) {
        /*
            r9 = this;
            com.zing.zalo.zview.dialog.c r0 = r9.f60838R0
            if (r0 == 0) goto L15
            fn0.AbstractC19074t.m100205c(r0)
            boolean r0 = r0.m92868m()
            if (r0 == 0) goto L15
            com.zing.zalo.zview.dialog.c r0 = r9.f60838R0
            fn0.AbstractC19074t.m100205c(r0)
            r0.dismiss()
        L15:
            int r0 = com.zing.zalo.AbstractC8020f0.profile_reportabuseconfirm
            int r6 = com.zing.zalo.AbstractC8020f0.profile_reportabusedone
            java.lang.String r3 = "15"
            com.zing.zalo.ui.chat.rightmenu.c r1 = r9.m65200wM()
            java.lang.String r4 = r1.mo65211B7()
            bn.t1 r7 = new bn.t1
            android.content.Context r1 = r9.getContext()
            r7.<init>(r1)
            h60.t r8 = new h60.t
            r1 = r8
            r2 = r10
            r5 = r9
            r1.<init>()
            bn.t1 r10 = r7.m13865e(r8)
            java.lang.String r0 = me0.AbstractC23136l9.m118743r0(r0)
            int r1 = com.zing.zalo.AbstractC8020f0.str_yes
            java.lang.String r1 = me0.AbstractC23136l9.m118743r0(r1)
            int r2 = com.zing.zalo.AbstractC8020f0.str_no
            java.lang.String r2 = me0.AbstractC23136l9.m118743r0(r2)
            bn.t1 r10 = r10.m13862b(r0, r1, r2)
            bn.t1$a r10 = r10.m13861a()
            r9.f60838R0 = r10
            if (r10 == 0) goto L57
            r10.mo13822K()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView.m65181bN(java.lang.String):void");
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: ce */
    public void mo65182ce() {
        ChatInfoAdapter chatInfoAdapter = this.f60834N0;
        if (chatInfoAdapter != null) {
            chatInfoAdapter.f60780w = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: d0 */
    public void mo65183d0() {
        try {
            if (this.f60836P0) {
                this.f60837Q0.post(this.f60847a1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: db */
    public void mo65184db(boolean z11, CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "desc");
        Handler handler = this.f60837Q0;
        C30094w1 c30094w1 = this.f60839S0;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        RobotoTextView robotoTextView = c30094w1.f139751r;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC2364o0.m12371n(handler, robotoTextView, i11);
        if (charSequence.length() > 0) {
            C30094w1 c30094w12 = this.f60839S0;
            if (c30094w12 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w12 = null;
            }
            c30094w12.f139751r.setText(charSequence);
            C30094w1 c30094w13 = this.f60839S0;
            if (c30094w13 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w13 = null;
            }
            c30094w13.f139751r.setCompoundDrawables(null, null, null, null);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: dh */
    public int mo65185dh() {
        return this.f60846Z0;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: fg */
    public void mo65186fg(C20096c c20096c, boolean z11) {
        AbstractC19074t.m100208f(c20096c, "errorMessage");
        if (m92672lJ() && this.f60844X0) {
            AbstractC23161o1.m119321f(c20096c, z11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: hf */
    public void mo65187hf(CharSequence charSequence, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "name");
        C30094w1 c30094w1 = this.f60839S0;
        C30094w1 c30094w12 = null;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        c30094w1.f139753t.setText(charSequence);
        if (charSequence.length() == 0) {
            C30094w1 c30094w13 = this.f60839S0;
            if (c30094w13 == null) {
                AbstractC19074t.m100223u("headerBinding");
            } else {
                c30094w12 = c30094w13;
            }
            RobotoTextView robotoTextView = c30094w12.f139753t;
            if (z11) {
                i11 = AbstractC8020f0.str_set_community_name;
            } else {
                i11 = AbstractC8020f0.str_update_group_name_hint;
            }
            robotoTextView.setHint(AbstractC23136l9.m118743r0(i11));
            return;
        }
        C30094w1 c30094w14 = this.f60839S0;
        if (c30094w14 == null) {
            AbstractC19074t.m100223u("headerBinding");
        } else {
            c30094w12 = c30094w14;
        }
        c30094w12.f139753t.setHint("");
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: iA */
    public void mo65188iA(boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: iv */
    public void mo65189iv() {
        try {
            ProgressDialogView progressDialogView = this.f72826A0;
            if (progressDialogView != null && progressDialogView.m92672lJ()) {
                this.f72826A0.dismiss();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: jp */
    public void mo65190jp(String str) {
        AbstractC19074t.m100208f(str, "avt");
        C30094w1 c30094w1 = this.f60839S0;
        C3535c c3535c = null;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        c30094w1.f139752s.setImageOption(C23278z2.m120143n());
        C30094w1 c30094w12 = this.f60839S0;
        if (c30094w12 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w12 = null;
        }
        c30094w12.f139752s.m75732d(str);
        C30094w1 c30094w13 = this.f60839S0;
        if (c30094w13 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w13 = null;
        }
        c30094w13.f139752s.setStrokeDisableColor(AbstractC22055v0.m115162v(getContext()));
        C30094w1 c30094w14 = this.f60839S0;
        if (c30094w14 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w14 = null;
        }
        GroupAvatarView groupAvatarView = c30094w14.f139752s;
        C3535c c3535c2 = this.f60833M0;
        if (c3535c2 == null) {
            AbstractC19074t.m100223u("mCurrentChat");
            c3535c2 = null;
        }
        groupAvatarView.setStateLoadingStory(AbstractC22055v0.m115112B(c3535c2.m17944I0()));
        C30094w1 c30094w15 = this.f60839S0;
        if (c30094w15 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w15 = null;
        }
        GroupAvatarView groupAvatarView2 = c30094w15.f139752s;
        C3535c c3535c3 = this.f60833M0;
        if (c3535c3 == null) {
            AbstractC19074t.m100223u("mCurrentChat");
            c3535c3 = null;
        }
        boolean m115116F = AbstractC22055v0.m115116F(c3535c3.m17944I0(), AbstractC21244b.m110054d(getContext()));
        C3535c c3535c4 = this.f60833M0;
        if (c3535c4 == null) {
            AbstractC19074t.m100223u("mCurrentChat");
            c3535c4 = null;
        }
        groupAvatarView2.m75736i(m115116F, AbstractC22055v0.m115115E(c3535c4.m17944I0(), AbstractC21244b.m110054d(getContext())));
        C23302b c23302b = C23302b.f113247a;
        C3535c c3535c5 = this.f60833M0;
        if (c3535c5 == null) {
            AbstractC19074t.m100223u("mCurrentChat");
            c3535c5 = null;
        }
        if (c23302b.m120523d(c3535c5.m17971y0().f42895s)) {
            C30094w1 c30094w16 = this.f60839S0;
            if (c30094w16 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w16 = null;
            }
            GroupAvatarView groupAvatarView3 = c30094w16.f139752s;
            C3535c c3535c6 = this.f60833M0;
            if (c3535c6 == null) {
                AbstractC19074t.m100223u("mCurrentChat");
                c3535c6 = null;
            }
            groupAvatarView3.setShortDpnAvt(c3535c6.m17971y0().m40998a().m40418n0());
            C30094w1 c30094w17 = this.f60839S0;
            if (c30094w17 == null) {
                AbstractC19074t.m100223u("headerBinding");
                c30094w17 = null;
            }
            GroupAvatarView groupAvatarView4 = c30094w17.f139752s;
            C3535c c3535c7 = this.f60833M0;
            if (c3535c7 == null) {
                AbstractC19074t.m100223u("mCurrentChat");
            } else {
                c3535c = c3535c7;
            }
            groupAvatarView4.setUidForGenColor(c3535c.m17944I0());
        }
    }

    /* renamed from: ld */
    public final void m65191ld(int i11) {
        this.f60846Z0 = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:21:0x000e, B:9:0x001b, B:11:0x0023, B:12:0x002d), top: B:20:0x000e }] */
    @Override // com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i11, int i12, Intent intent) {
        String stringExtra;
        if (i11 != 1039) {
            if (i11 == 1051 && i12 == -1) {
                if (intent != null) {
                    try {
                        stringExtra = intent.getStringExtra("nickname");
                        if (stringExtra == null) {
                        }
                        if (stringExtra.length() > 50) {
                            stringExtra = stringExtra.substring(0, 50);
                            AbstractC19074t.m100207e(stringExtra, "substring(...)");
                        }
                        m65200wM().mo65225Vb(stringExtra);
                        return;
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        return;
                    }
                }
                stringExtra = "";
                if (stringExtra.length() > 50) {
                }
                m65200wM().mo65225Vb(stringExtra);
                return;
            }
            return;
        }
        if (i12 == 2001) {
            m65200wM().mo65246rl();
            AbstractC23647d.m123897g("1591011");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, "view");
        if (view.getId() == AbstractC6918a0.btn_retry_upload_avatar) {
            m65200wM().mo65213Fg();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 9);
        bVar.m124119a().m124115b(this, 6019);
    }

    /* renamed from: r4 */
    public final void m65192r4() {
        try {
            C30077v1 c30077v1 = this.f60840T0;
            if (c30077v1 != null) {
                if (c30077v1 == null) {
                    AbstractC19074t.m100223u("mainBinding");
                    c30077v1 = null;
                }
                c30077v1.f139618s.m9837K1(0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: rz */
    public void mo65193rz(boolean z11) {
        int i11;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C26703b m137293a = C26705d.m137293a(m92689tK, AbstractC2814h.t_xxsmall_m);
        C30094w1 c30094w1 = this.f60839S0;
        C30094w1 c30094w12 = null;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        RobotoTextView robotoTextView = c30094w1.f139751r;
        AbstractC19074t.m100207e(robotoTextView, "chatContactDesc");
        new C26708g(robotoTextView).m137319a(m137293a);
        C30094w1 c30094w13 = this.f60839S0;
        if (c30094w13 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w13 = null;
        }
        c30094w13.f139751r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_community));
        C30094w1 c30094w14 = this.f60839S0;
        if (c30094w14 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w14 = null;
        }
        c30094w14.f139751r.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.chat_community_badge_icon));
        C30094w1 c30094w15 = this.f60839S0;
        if (c30094w15 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w15 = null;
        }
        c30094w15.f139751r.setBackgroundResource(AbstractC16803z.bg_community_badge_right_menu);
        C30094w1 c30094w16 = this.f60839S0;
        if (c30094w16 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w16 = null;
        }
        c30094w16.f139751r.setPadding(AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(2.0f));
        C30094w1 c30094w17 = this.f60839S0;
        if (c30094w17 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w17 = null;
        }
        c30094w17.f139751r.setCompoundDrawables(null, null, null, null);
        Handler handler = this.f60837Q0;
        C30094w1 c30094w18 = this.f60839S0;
        if (c30094w18 == null) {
            AbstractC19074t.m100223u("headerBinding");
        } else {
            c30094w12 = c30094w18;
        }
        RobotoTextView robotoTextView2 = c30094w12.f139751r;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC2364o0.m12371n(handler, robotoTextView2, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: sI */
    public void mo65194sI(boolean z11) {
        int i11;
        Handler handler = this.f60837Q0;
        C30094w1 c30094w1 = this.f60839S0;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        AppCompatImageView appCompatImageView = c30094w1.f139757x;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC2364o0.m12371n(handler, appCompatImageView, i11);
    }

    /* renamed from: sM */
    public final void m65195sM() {
        C30077v1 c30077v1 = this.f60840T0;
        if (c30077v1 != null) {
            if (c30077v1 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v1 = null;
            }
            c30077v1.f139616q.setVisibility(8);
        }
    }

    /* renamed from: uM */
    public final View m65196uM(int i11) {
        C30077v1 c30077v1 = this.f60840T0;
        if (c30077v1 == null) {
            return null;
        }
        if (c30077v1 == null) {
            AbstractC19074t.m100223u("mainBinding");
            c30077v1 = null;
        }
        int childCount = c30077v1.f139618s.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            C30077v1 c30077v12 = this.f60840T0;
            if (c30077v12 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v12 = null;
            }
            View childAt = c30077v12.f139618s.getChildAt(i12);
            if (childAt instanceof ChatInfoModuleViews$ChatSettingModuleView) {
                ChatInfoAdapter.C11690e c11690e = ((ChatInfoModuleViews$ChatSettingModuleView) childAt).f64564V;
                if (c11690e instanceof ChatInfoAdapter.C11692g) {
                    AbstractC19074t.m100206d(c11690e, "null cannot be cast to non-null type com.zing.zalo.ui.chat.rightmenu.ChatInfoAdapter.ChatSettingItem");
                    if (((ChatInfoAdapter.C11692g) c11690e).m65118d() == i11) {
                        return childAt;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: v9 */
    public void mo65197v9(CloudQuotaUsage cloudQuotaUsage) {
        AbstractC19074t.m100208f(cloudQuotaUsage, "cloudQuotaUsage");
    }

    /* renamed from: vM */
    public final View m65198vM(int i11) {
        C30077v1 c30077v1 = this.f60840T0;
        if (c30077v1 == null) {
            return null;
        }
        if (c30077v1 == null) {
            AbstractC19074t.m100223u("mainBinding");
            c30077v1 = null;
        }
        int childCount = c30077v1.f139618s.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            C30077v1 c30077v12 = this.f60840T0;
            if (c30077v12 == null) {
                AbstractC19074t.m100223u("mainBinding");
                c30077v12 = null;
            }
            View childAt = c30077v12.f139618s.getChildAt(i12);
            if ((childAt instanceof ChatInfoModuleViews$SettingHorizontalModuleView) && ((ChatInfoModuleViews$SettingHorizontalModuleView) childAt).m69700V(i11) != null) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: vb */
    public void mo65199vb(boolean z11) {
        int i11;
        Handler handler = this.f60837Q0;
        C30094w1 c30094w1 = this.f60839S0;
        if (c30094w1 == null) {
            AbstractC19074t.m100223u("headerBinding");
            c30094w1 = null;
        }
        AppCompatImageView appCompatImageView = c30094w1.f139756w;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC2364o0.m12371n(handler, appCompatImageView, i11);
    }

    /* renamed from: wM */
    public final InterfaceC11706c m65200wM() {
        InterfaceC11706c interfaceC11706c = this.f60841U0;
        if (interfaceC11706c != null) {
            return interfaceC11706c;
        }
        AbstractC19074t.m100223u("chatInfoPresenter");
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        boolean z11;
        boolean z12;
        AbstractC19074t.m100208f(objArr, "args");
        try {
            if (i11 != 9) {
                if (i11 == 6019) {
                    if (objArr.length == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        C3535c c3535c = this.f60833M0;
                        if (c3535c == null) {
                            AbstractC19074t.m100223u("mCurrentChat");
                            c3535c = null;
                        }
                        if (AbstractC19074t.m100204b(c3535c.m17944I0(), objArr[0])) {
                            mo65183d0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.ui.chat.transfer.EventMessageUndoParam");
                C20338d c20338d = (C20338d) obj;
                MessageId m106047e = c20338d.m106047e();
                C20568e m106048f = c20338d.m106048f();
                if (m106047e != null) {
                    m65200wM().mo65233fb(m106047e, m106048f);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xM */
    public final int m65201xM() {
        return this.f60846Z0;
    }

    /* renamed from: zM */
    public final void m65202zM() {
        m65200wM().mo65217N8();
    }
}
