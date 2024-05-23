package com.zing.zalo.p077ui.chat.chatrow;

import ag0.C0814e0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.core.graphics.AbstractC1406a;
import androidx.core.graphics.EnumC1407b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContentPlus;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.ZaloZinstantRootLayout;
import dj.C17945a0;
import dj.C17967h1;
import dj.C17969i0;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import hn0.AbstractC20104d;
import java.util.ArrayList;
import java.util.List;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import nk0.C23855s0;
import on0.AbstractC24341v;
import p348mi.AbstractC23309i;
import p409oz.C24585b;
import pj0.C24779e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import vg.AbstractRunnableC28185s6;
import vg.C28203u6;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowWebContentPlus extends ChatRowWebContent {

    /* renamed from: A0 */
    private ImageButton f59049A0;

    /* renamed from: B0 */
    private View f59050B0;

    /* renamed from: C0 */
    private String f59051C0;

    /* renamed from: D0 */
    private Drawable f59052D0;

    /* renamed from: E0 */
    private RobotoTextView f59053E0;

    /* renamed from: F0 */
    private ZAppCompatImageView f59054F0;

    /* renamed from: G0 */
    private View f59055G0;

    /* renamed from: H0 */
    private ZAppCompatImageView f59056H0;

    /* renamed from: I0 */
    private RobotoTextView f59057I0;

    /* renamed from: J0 */
    private RobotoTextView f59058J0;

    /* renamed from: K0 */
    private boolean f59059K0;

    /* renamed from: L0 */
    private PhotoToggleButton f59060L0;

    /* renamed from: M0 */
    private final InterfaceC24854k f59061M0;

    /* renamed from: N0 */
    private ChatRowWebContent.C11447h.a f59062N0;

    /* renamed from: m0 */
    private RelativeLayout f59063m0;

    /* renamed from: n0 */
    private GroupAvatarView f59064n0;

    /* renamed from: o0 */
    private ViewStub f59065o0;

    /* renamed from: p0 */
    private RobotoTextView f59066p0;

    /* renamed from: q0 */
    private AppCompatImageView f59067q0;

    /* renamed from: r0 */
    private boolean f59068r0;

    /* renamed from: s0 */
    private Paint f59069s0;

    /* renamed from: t0 */
    private final int f59070t0;

    /* renamed from: u0 */
    private final int f59071u0;

    /* renamed from: v0 */
    private final float f59072v0;

    /* renamed from: w0 */
    private final int f59073w0;

    /* renamed from: x0 */
    private final float f59074x0;

    /* renamed from: y0 */
    private int f59075y0;

    /* renamed from: z0 */
    private ChatRowWebContent.C11447h.a f59076z0;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContentPlus$a */
    /* loaded from: classes5.dex */
    public static final class C11449a extends AbstractRunnableC28185s6 {

        /* renamed from: A */
        final /* synthetic */ C17945a0 f59077A;

        /* renamed from: B */
        final /* synthetic */ ChatRowWebContentPlus f59078B;

        /* renamed from: z */
        final /* synthetic */ GroupAvatarView f59079z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11449a(GroupAvatarView groupAvatarView, C17945a0 c17945a0, ChatRowWebContentPlus chatRowWebContentPlus, List list) {
            super(groupAvatarView, list, 1050);
            this.f59079z = groupAvatarView;
            this.f59077A = c17945a0;
            this.f59078B = chatRowWebContentPlus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m61898h(ArrayList arrayList, C17945a0 c17945a0, GroupAvatarView groupAvatarView, ChatRowWebContentPlus chatRowWebContentPlus) {
            AbstractC19074t.m100208f(arrayList, "$profiles");
            AbstractC19074t.m100208f(c17945a0, "$chatContent");
            AbstractC19074t.m100208f(groupAvatarView, "$it");
            AbstractC19074t.m100208f(chatRowWebContentPlus, "this$0");
            if (arrayList.size() > 0) {
                boolean z11 = false;
                Object obj = arrayList.get(0);
                AbstractC19074t.m100207e(obj, "get(...)");
                ContactProfile contactProfile = (ContactProfile) obj;
                if (AbstractC19074t.m100204b(contactProfile.f42434r, c17945a0.m94862C4())) {
                    groupAvatarView.setStrokeDisableColor(AbstractC22055v0.m115162v(chatRowWebContentPlus.getContext()));
                    if ((!c17945a0.m94847A6()) && AbstractC22055v0.m115116F(contactProfile.f42434r, chatRowWebContentPlus.m61845M())) {
                        z11 = true;
                    }
                    groupAvatarView.m75736i(z11, AbstractC22055v0.m115115E(contactProfile.f42434r, chatRowWebContentPlus.m61845M()));
                    groupAvatarView.setStateLoadingStory(AbstractC22055v0.m115112B(contactProfile.f42434r));
                    groupAvatarView.m75731c(contactProfile);
                }
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(final ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "profiles");
            final C17945a0 c17945a0 = this.f59077A;
            final GroupAvatarView groupAvatarView = this.f59079z;
            final ChatRowWebContentPlus chatRowWebContentPlus = this.f59078B;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.d2
                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowWebContentPlus.C11449a.m61898h(arrayList, c17945a0, groupAvatarView, chatRowWebContentPlus);
                }
            });
        }
    }

    public ChatRowWebContentPlus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        this.f59069s0 = new Paint();
        this.f59070t0 = ChatRow.f57237l6;
        this.f59071u0 = ChatRow.f57217T5 + AbstractC23136l9.m118742r(8.0f);
        float m118742r = AbstractC23136l9.m118742r(2.0f);
        this.f59072v0 = m118742r;
        this.f59073w0 = AbstractC23136l9.m118742r(6.0f);
        this.f59074x0 = AbstractC23136l9.m118742r(10.0f);
        this.f59051C0 = "";
        m129210a = AbstractC24856m.m129210a(new C11461c2(this));
        this.f59061M0 = m129210a;
        this.f59069s0.setStyle(Paint.Style.STROKE);
        this.f59069s0.setStrokeWidth(m118742r);
        this.f59069s0.setColor(C23212s8.m119607o(getContext(), AbstractC16781w.ReceiverBubbleChatBorderHighlight));
        this.f59062N0 = new ChatRowWebContent.C11447h.a() { // from class: com.zing.zalo.ui.chat.chatrow.a2
            @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent.C11447h.a
            /* renamed from: a */
            public final void mo61863a() {
                ChatRowWebContentPlus.m61877J0(ChatRowWebContentPlus.this);
            }
        };
    }

    /* renamed from: A0 */
    private final boolean m61868A0(boolean z11, boolean z12) {
        int mo62101s4 = this.f57166E.mo62101s4();
        if (mo62101s4 == 2) {
            return true;
        }
        if (mo62101s4 != 3 && (z11 || z12 || m61876I0())) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    private final boolean m61869B0(C28769a c28769a, boolean z11) {
        if (this.f57166E.mo62101s4() != 2 && (c28769a.f133310f || z11)) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    private final String m61870C0() {
        if (m61882P0()) {
            long m95260t4 = getMessage().m95260t4();
            if (m95260t4 > 0) {
                if (m95260t4 < 60000) {
                    postInvalidateDelayed(m95260t4 % 1000);
                } else {
                    postInvalidateDelayed(m95260t4 % 60000);
                }
                String m119278p = AbstractC23160o0.m119278p(m95260t4);
                AbstractC19074t.m100207e(m119278p, "formatTimeDurationCeil(...)");
                return m119278p;
            }
            return "";
        }
        return "";
    }

    /* renamed from: D0 */
    private final void m61871D0(Canvas canvas) {
        if (this.f59068r0) {
            RelativeLayout relativeLayout = this.f59063m0;
            RelativeLayout relativeLayout2 = null;
            if (relativeLayout == null) {
                AbstractC19074t.m100223u("contentContainerView");
                relativeLayout = null;
            }
            float left = relativeLayout.getLeft();
            RelativeLayout relativeLayout3 = this.f59063m0;
            if (relativeLayout3 == null) {
                AbstractC19074t.m100223u("contentContainerView");
                relativeLayout3 = null;
            }
            float top = relativeLayout3.getTop();
            RelativeLayout relativeLayout4 = this.f59063m0;
            if (relativeLayout4 == null) {
                AbstractC19074t.m100223u("contentContainerView");
                relativeLayout4 = null;
            }
            float right = relativeLayout4.getRight();
            RelativeLayout relativeLayout5 = this.f59063m0;
            if (relativeLayout5 == null) {
                AbstractC19074t.m100223u("contentContainerView");
            } else {
                relativeLayout2 = relativeLayout5;
            }
            canvas.drawRect(left, top, right, relativeLayout2.getBottom(), getBgHighlightPaint());
        }
    }

    /* renamed from: E0 */
    private final void m61872E0() {
        View view;
        if (this.f59064n0 == null) {
            ViewStub viewStub = (ViewStub) findViewById(AbstractC6918a0.vs_avt_view);
            this.f59065o0 = viewStub;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            GroupAvatarView groupAvatarView = (GroupAvatarView) view;
            this.f59064n0 = groupAvatarView;
            if (groupAvatarView != null) {
                groupAvatarView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.chat.chatrow.b2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ChatRowWebContentPlus.m61873F0(ChatRowWebContentPlus.this, view2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public static final void m61873F0(ChatRowWebContentPlus chatRowWebContentPlus, View view) {
        String str;
        AbstractC19074t.m100208f(chatRowWebContentPlus, "this$0");
        Rect rect = new Rect();
        GroupAvatarView groupAvatarView = chatRowWebContentPlus.f59064n0;
        AbstractC19074t.m100205c(groupAvatarView);
        groupAvatarView.getGlobalVisibleRect(rect);
        InterfaceC11530v interfaceC11530v = chatRowWebContentPlus.f57166E;
        if (interfaceC11530v != null) {
            C17945a0 message = chatRowWebContentPlus.getMessage();
            if (message != null) {
                str = message.m94862C4();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            interfaceC11530v.mo62072Z3(str, rect);
        }
    }

    /* renamed from: G0 */
    private final void m61874G0() {
        if (this.f59067q0 == null) {
            View findViewById = findViewById(AbstractC6918a0.vs_key_view);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f59067q0 = (AppCompatImageView) ((ViewStub) findViewById).inflate();
        }
    }

    /* renamed from: H0 */
    private final void m61875H0() {
        if (this.f59066p0 == null) {
            View findViewById = findViewById(AbstractC6918a0.vs_sender_name);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f59066p0 = (RobotoTextView) ((ViewStub) findViewById).inflate().findViewById(AbstractC6918a0.tvt_sender_name);
        }
    }

    /* renamed from: I0 */
    private final boolean m61876I0() {
        if (getMessage() != null && AbstractC19074t.m100204b(getMessage(), this.f57166E.mo62038F4())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public static final void m61877J0(ChatRowWebContentPlus chatRowWebContentPlus) {
        AbstractC19074t.m100208f(chatRowWebContentPlus, "this$0");
        chatRowWebContentPlus.m61880N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public static final void m61878K0(ChatRowWebContentPlus chatRowWebContentPlus, View view) {
        AbstractC19074t.m100208f(chatRowWebContentPlus, "this$0");
        chatRowWebContentPlus.m61880N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m61879L0(ChatRowWebContentPlus chatRowWebContentPlus, View view) {
        AbstractC19074t.m100208f(chatRowWebContentPlus, "this$0");
        chatRowWebContentPlus.m61881O0();
    }

    /* renamed from: N0 */
    private final void m61880N0() {
        InterfaceC11530v interfaceC11530v = this.f57166E;
        if (interfaceC11530v != null) {
            interfaceC11530v.mo62034C4(this);
        }
    }

    /* renamed from: O0 */
    private final void m61881O0() {
        InterfaceC11530v interfaceC11530v = this.f57166E;
        if (interfaceC11530v != null) {
            interfaceC11530v.mo62085h4(this.f59011O);
        }
    }

    /* renamed from: P0 */
    private final boolean m61882P0() {
        if (this.f57166E.mo62101s4() != 2 && this.f59018V && (m61876I0() || this.f57166E.mo62101s4() == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: Q0 */
    private final void m61883Q0(C23855s0 c23855s0) {
        int i11;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object obj;
        if (this.f59007K == null) {
            return;
        }
        C24779e m124650y = c23855s0.m124650y();
        if (m124650y != null) {
            i11 = m124650y.m128796b();
        } else {
            i11 = 0;
        }
        View view = this.f59055G0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = i11;
        }
        RobotoTextView robotoTextView = this.f59058J0;
        if (robotoTextView != null) {
            obj = robotoTextView.getLayoutParams();
        } else {
            obj = null;
        }
        if (obj instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) obj;
        }
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = i11;
        }
    }

    /* renamed from: R0 */
    private final void m61884R0(C28769a c28769a) {
        int i11;
        Drawable m62615u = AbstractC11531v0.Companion.m62615u();
        if (m62615u != null) {
            m62615u.setAlpha(255);
        }
        PhotoToggleButton photoToggleButton = this.f59060L0;
        if (photoToggleButton != null) {
            photoToggleButton.setChecked(c28769a.f133329y);
        }
        PhotoToggleButton photoToggleButton2 = this.f59060L0;
        if (photoToggleButton2 != null) {
            if (m61895z0()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            photoToggleButton2.setVisibility(i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014f  */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m61885S0(C17945a0 c17945a0) {
        boolean z11;
        boolean m61868A0;
        PorterDuffColorFilter porterDuffColorFilter;
        Drawable drawable = null;
        if (c17945a0.m95043W6() && c17945a0.m95196m4() == -1 && !c17945a0.m95219o8()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 != null && (m94929K2 instanceof C17967h1)) {
                this.f59075y0 = ((C17967h1) m94929K2).f90999Y;
            }
            setRetryClickListener(this.f59062N0);
            this.f59059K0 = false;
            byte m95089b4 = (byte) c17945a0.m95089b4();
            boolean z12 = true;
            if (m95089b4 == 1) {
                if (this.f59075y0 != 2 && C0814e0.m2059e(c17945a0.m95029V3())) {
                    String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.sending_message_state);
                    AbstractC19074t.m100207e(string, "getString(...)");
                    this.f59051C0 = string;
                    this.f59052D0 = AbstractC11531v0.Companion.m62502H1();
                    z12 = false;
                    m61868A0 = m61868A0(this.f59059K0, this.f57166E.mo62079c4(c17945a0.m95029V3()).f133312h);
                    if (!z12) {
                    }
                    if (!m61868A0) {
                    }
                } else {
                    this.f59059K0 = true;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message_state);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    this.f59051C0 = m118743r0;
                    this.f59052D0 = AbstractC11531v0.Companion.m62515M();
                    m61868A0 = m61868A0(this.f59059K0, this.f57166E.mo62079c4(c17945a0.m95029V3()).f133312h);
                    if (!z12) {
                        ImageButton imageButton = this.f59049A0;
                        if (imageButton != null) {
                            imageButton.setVisibility(0);
                        }
                    } else {
                        ImageButton imageButton2 = this.f59049A0;
                        if (imageButton2 != null) {
                            imageButton2.setVisibility(8);
                        }
                    }
                    if (!m61868A0) {
                        ZAppCompatImageView zAppCompatImageView = this.f59054F0;
                        if (zAppCompatImageView != null) {
                            zAppCompatImageView.setImageDrawable(this.f59052D0);
                        }
                        RobotoTextView robotoTextView = this.f59053E0;
                        if (robotoTextView != null) {
                            robotoTextView.setText(this.f59051C0);
                        }
                        View view = this.f59050B0;
                        if (view != null) {
                            drawable = view.getBackground();
                        }
                        if (drawable != null) {
                            if (this.f59059K0) {
                                porterDuffColorFilter = new PorterDuffColorFilter(C23212s8.m119607o(getContext(), AbstractC16781w.ChatStateBackgroundColor2), PorterDuff.Mode.SRC_OVER);
                            } else {
                                porterDuffColorFilter = new PorterDuffColorFilter(C23212s8.m119607o(getContext(), AbstractC16781w.ChatStateBackgroundColor1), PorterDuff.Mode.SRC_OVER);
                            }
                            drawable.setColorFilter(porterDuffColorFilter);
                        }
                        View view2 = this.f59050B0;
                        if (view2 != null) {
                            view2.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    View view3 = this.f59050B0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
            } else if (m95089b4 == 0) {
                String string2 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.error_message_state);
                AbstractC19074t.m100207e(string2, "getString(...)");
                this.f59051C0 = string2;
                this.f59052D0 = AbstractC11531v0.Companion.m62515M();
                if (this.f57166E.mo62101s4() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f59059K0 = true;
                z12 = z11;
                m61868A0 = m61868A0(this.f59059K0, this.f57166E.mo62079c4(c17945a0.m95029V3()).f133312h);
                if (!z12) {
                }
                if (!m61868A0) {
                }
            } else {
                if (m95089b4 == 2) {
                    String string3 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.deliveried_message_state);
                    AbstractC19074t.m100207e(string3, "getString(...)");
                    this.f59051C0 = string3;
                    this.f59052D0 = AbstractC11531v0.Companion.m62505I1();
                } else if (m95089b4 == 3) {
                    String string4 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.receive_message_state);
                    AbstractC19074t.m100207e(string4, "getString(...)");
                    this.f59051C0 = string4;
                    this.f59052D0 = AbstractC11531v0.Companion.m62617u1();
                } else if (m95089b4 == 4) {
                    if (AbstractC23309i.m121490Ud() && this.f57166E.mo62106x4()) {
                        String string5 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.seen_message_state);
                        AbstractC19074t.m100207e(string5, "getString(...)");
                        this.f59051C0 = string5;
                        this.f59052D0 = AbstractC11531v0.Companion.m62614t1();
                    } else {
                        String string6 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.receive_message_state);
                        AbstractC19074t.m100207e(string6, "getString(...)");
                        this.f59051C0 = string6;
                        this.f59052D0 = AbstractC11531v0.Companion.m62617u1();
                    }
                } else {
                    this.f59052D0 = null;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.retry_message_state);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    this.f59051C0 = m118743r02;
                }
                z12 = false;
                m61868A0 = m61868A0(this.f59059K0, this.f57166E.mo62079c4(c17945a0.m95029V3()).f133312h);
                if (!z12) {
                }
                if (!m61868A0) {
                }
            }
        } else {
            this.f59059K0 = false;
            this.f59051C0 = "";
            this.f59052D0 = null;
            View view4 = this.f59050B0;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            ImageButton imageButton3 = this.f59049A0;
            if (imageButton3 != null) {
                imageButton3.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m61886T0() {
        String m61870C0;
        int i11;
        ViewGroup.LayoutParams layoutParams;
        String m94967O4 = getMessage().m94967O4();
        AbstractC19074t.m100205c(m94967O4);
        if (m94967O4.length() > 0) {
            C28769a mo62079c4 = this.f57166E.mo62079c4(getMessage().m95029V3());
            AbstractC19074t.m100207e(mo62079c4, "provideChatBubbleData(...)");
            if (m61869B0(mo62079c4, this.f59059K0)) {
                ViewGroup.LayoutParams layoutParams2 = null;
                if (this.f59018V) {
                    ZAppCompatImageView zAppCompatImageView = this.f59056H0;
                    if (zAppCompatImageView != null) {
                        zAppCompatImageView.setImageDrawable(AbstractC11531v0.Companion.m62610s0(getMessage().m95268u4()));
                    }
                    ZAppCompatImageView zAppCompatImageView2 = this.f59056H0;
                    if (zAppCompatImageView2 != null) {
                        layoutParams = zAppCompatImageView2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams3.setMarginEnd((int) this.f59072v0);
                    layoutParams3.setMarginStart((int) this.f59072v0);
                    ZAppCompatImageView zAppCompatImageView3 = this.f59056H0;
                    if (zAppCompatImageView3 != null) {
                        zAppCompatImageView3.setVisibility(0);
                    }
                    i11 = 0;
                } else {
                    ZAppCompatImageView zAppCompatImageView4 = this.f59056H0;
                    if (zAppCompatImageView4 != null) {
                        zAppCompatImageView4.setVisibility(8);
                    }
                    i11 = this.f59073w0;
                }
                RobotoTextView robotoTextView = this.f59057I0;
                if (robotoTextView != null) {
                    robotoTextView.setText(m94967O4);
                }
                RobotoTextView robotoTextView2 = this.f59057I0;
                if (robotoTextView2 != null) {
                    layoutParams2 = robotoTextView2.getLayoutParams();
                }
                AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams2).setMarginStart(i11);
                View view = this.f59055G0;
                if (view != null) {
                    view.setVisibility(0);
                }
                m61870C0 = m61870C0();
                if (m61870C0.length() <= 0) {
                    RobotoTextView robotoTextView3 = this.f59058J0;
                    if (robotoTextView3 != null) {
                        robotoTextView3.setText(m61870C0);
                    }
                    RobotoTextView robotoTextView4 = this.f59058J0;
                    if (robotoTextView4 != null) {
                        robotoTextView4.setVisibility(0);
                        return;
                    }
                    return;
                }
                RobotoTextView robotoTextView5 = this.f59058J0;
                if (robotoTextView5 != null) {
                    robotoTextView5.setVisibility(8);
                    return;
                }
                return;
            }
        }
        View view2 = this.f59055G0;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        m61870C0 = m61870C0();
        if (m61870C0.length() <= 0) {
        }
    }

    private final Paint getBgHighlightPaint() {
        return (Paint) this.f59061M0.getValue();
    }

    private static /* synthetic */ void getZDataState$annotations() {
    }

    /* renamed from: v0 */
    private final void m61891v0(boolean z11) {
        int i11;
        ZaloZinstantRootLayout zaloZinstantRootLayout = this.f59007K;
        if (zaloZinstantRootLayout != null && (zaloZinstantRootLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f59007K.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (z11) {
                layoutParams2.addRule(17, AbstractC6918a0.vs_avt_view);
                layoutParams2.removeRule(11);
                layoutParams2.removeRule(9);
                layoutParams2.setMarginEnd(AbstractC23136l9.m118742r(0.0f));
                layoutParams2.setMarginStart(AbstractC23136l9.m118742r(0.0f));
                layoutParams2.topMargin = AbstractC23136l9.m118742r(-4.5f);
                return;
            }
            if (this.f59011O.m95032V6()) {
                layoutParams2.addRule(11, -1);
                layoutParams2.removeRule(9);
                layoutParams2.removeRule(17);
                layoutParams2.setMarginEnd(ChatRow.f57239n6);
                layoutParams2.setMarginStart(AbstractC23136l9.m118742r(0.0f));
                layoutParams2.topMargin = AbstractC23136l9.m118742r(0.0f);
                return;
            }
            layoutParams2.addRule(9, -1);
            layoutParams2.removeRule(11);
            layoutParams2.removeRule(17);
            if (m61895z0()) {
                i11 = this.f59071u0;
            } else {
                i11 = 0;
            }
            layoutParams2.setMarginEnd(AbstractC23136l9.m118742r(0.0f));
            layoutParams2.setMarginStart(this.f59070t0 + i11);
            layoutParams2.topMargin = AbstractC23136l9.m118742r(0.0f);
        }
    }

    /* renamed from: w0 */
    private final void m61892w0(C17945a0 c17945a0) {
        List m131496e;
        GroupAvatarView groupAvatarView = this.f59064n0;
        if (groupAvatarView != null) {
            m131496e = AbstractC25366r.m131496e(c17945a0.m94862C4());
            new C11449a(groupAvatarView, c17945a0, this, m131496e).m141750b();
        }
    }

    /* renamed from: x0 */
    private final void m61893x0(C17945a0 c17945a0) {
        AppCompatImageView appCompatImageView;
        int i11 = this.f57166E.mo62079c4(c17945a0.m95029V3()).f133319o;
        if (i11 != 1) {
            if (i11 == 2 && (appCompatImageView = this.f59067q0) != null) {
                appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_grpadmin_sliverkey_sm));
                return;
            }
            return;
        }
        AppCompatImageView appCompatImageView2 = this.f59067q0;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_grpadmin_masterkey_sm));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:            if (r11 == null) goto L30;     */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m61894y0(C17945a0 c17945a0) {
        String str;
        String m127113C;
        int i11;
        boolean z11;
        RobotoTextView robotoTextView = this.f59066p0;
        if (robotoTextView != null) {
            robotoTextView.setMaxWidth(Math.max(ChatRow.f57234i6, this.f59007K.getWidth()));
        }
        Drawable drawable = null;
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, c17945a0.m94862C4(), false, 2, null);
        if (m141800i != null) {
            C19059j0 c19059j0 = new C19059j0();
            int i12 = 1;
            String m40383Q = m141800i.m40383Q(true, false);
            c19059j0.f94941p = m40383Q;
            if (m40383Q != null) {
                AbstractC19074t.m100205c(m40383Q);
                int length = m40383Q.length() - 1;
                int i13 = 0;
                boolean z12 = false;
                while (i13 <= length) {
                    if (!z12) {
                        i11 = i13;
                    } else {
                        i11 = length;
                    }
                    if (AbstractC19074t.m100209g(m40383Q.charAt(i11), 32) <= 0) {
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
                str = m40383Q.subSequence(i13, length + 1).toString();
            }
            str = "";
            String str2 = str;
            c19059j0.f94941p = str2;
            AbstractC19074t.m100207e(str2, "element");
            m127113C = AbstractC24341v.m127113C(str2, '\n', ' ', false, 4, null);
            c19059j0.f94941p = m127113C;
            RobotoTextView robotoTextView2 = this.f59066p0;
            if (robotoTextView2 != null) {
                robotoTextView2.setText(m127113C);
                Drawable m118665N = AbstractC23136l9.m118665N(robotoTextView2.getContext(), AbstractC16803z.bg_sender_name_chat_row);
                if (m118665N != null) {
                    if (AbstractC23309i.m120887E2() == 1) {
                        m118665N.setColorFilter(AbstractC1406a.m7128a(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC16781w.ReceiverBubbleChatNormal), EnumC1407b.SRC_IN));
                        m118665N.setAlpha(178);
                    } else {
                        m118665N.setColorFilter(AbstractC1406a.m7128a(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC16781w.ChatStateBackgroundColor1), EnumC1407b.SRC_IN));
                    }
                    drawable = m118665N;
                }
                robotoTextView2.setBackground(drawable);
                if (AbstractC23309i.m120887E2() == 1 && getMessage() != null) {
                    i12 = this.f57166E.mo62079c4(getMessage().m95029V3()).f133307c;
                }
                robotoTextView2.setTextColor(i12);
            }
        }
    }

    /* renamed from: z0 */
    private final boolean m61895z0() {
        if (this.f57166E.mo62086i0() && getMessage().m94990R0() && m61846S()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent
    /* renamed from: D */
    protected void mo61843D(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.save();
        RelativeLayout relativeLayout = this.f59063m0;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            AbstractC19074t.m100223u("contentContainerView");
            relativeLayout = null;
        }
        float left = relativeLayout.getLeft() + this.f59007K.getLeft();
        RelativeLayout relativeLayout3 = this.f59063m0;
        if (relativeLayout3 == null) {
            AbstractC19074t.m100223u("contentContainerView");
        } else {
            relativeLayout2 = relativeLayout3;
        }
        canvas.translate(left, relativeLayout2.getTop() + this.f59007K.getTop());
        this.f59017U.m115829d(canvas);
        canvas.restore();
    }

    /* renamed from: M0 */
    public final void m61896M0() {
        if (getMessage() != null && getMessage().m94990R0() && m61846S()) {
            C28769a mo62079c4 = this.f57166E.mo62079c4(getMessage().m95029V3());
            AbstractC19074t.m100207e(mo62079c4, "provideChatBubbleData(...)");
            boolean z11 = !mo62079c4.f133329y;
            if (z11 && !this.f57166E.mo62045J0() && this.f57166E.mo62078c3() <= 0) {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_select_max_messages_prompt, Integer.valueOf(AbstractC23309i.m120819C8())));
                return;
            }
            if (z11 && this.f57166E.mo62045J0() && this.f57166E.mo62035D1() <= 0) {
                this.f57166E.mo62060Q1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_report_attachment_msg_reach_limit, Integer.valueOf(C24585b.Companion.m128049a().m128037o())));
                return;
            }
            if (z11) {
                this.f57166E.mo62099r3(getMessage());
            } else {
                this.f57166E.mo62050K3(getMessage());
            }
            mo62079c4.f133329y = z11;
            Drawable m62615u = AbstractC11531v0.Companion.m62615u();
            if (m62615u != null) {
                m62615u.setAlpha(255);
            }
            PhotoToggleButton photoToggleButton = this.f59060L0;
            if (photoToggleButton != null) {
                photoToggleButton.setChecked(z11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent, android.view.View
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        m61871D0(canvas);
        super.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent
    /* renamed from: g0 */
    public void mo61849g0(C23855s0 c23855s0) {
        AbstractC19074t.m100208f(c23855s0, "zinstantRoot");
        super.mo61849g0(c23855s0);
        m61883Q0(c23855s0);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent
    protected int getContainerWidth() {
        C17967h1 c17967h1;
        Number number;
        int min;
        int m104528d;
        C17969i0 m94929K2 = this.f59011O.m94929K2();
        if (m94929K2 instanceof C17967h1) {
            c17967h1 = (C17967h1) m94929K2;
        } else {
            c17967h1 = null;
        }
        if (c17967h1 != null) {
            number = Double.valueOf(c17967h1.f90990P);
        } else {
            number = 0;
        }
        double doubleValue = number.doubleValue();
        int i11 = getResources().getConfiguration().orientation;
        int min2 = Math.min(AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
        int max = Math.max(AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
        if (i11 != 2) {
            min2 = this.f59005I;
        }
        if (i11 == 2 && doubleValue >= 1.0d) {
            min = this.f59005I;
        } else {
            min = Math.min(min2, max);
        }
        m104528d = AbstractC20104d.m104528d((min - this.f59070t0) * doubleValue);
        return m104528d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent
    public int getReactionHeartLeft() {
        int reactionHeartLeft = super.getReactionHeartLeft();
        RelativeLayout relativeLayout = this.f59063m0;
        if (relativeLayout == null) {
            AbstractC19074t.m100223u("contentContainerView");
            relativeLayout = null;
        }
        return reactionHeartLeft + relativeLayout.getLeft();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent
    public int getReactionHeartTop() {
        int reactionHeartTop = super.getReactionHeartTop();
        RelativeLayout relativeLayout = this.f59063m0;
        if (relativeLayout == null) {
            AbstractC19074t.m100223u("contentContainerView");
            relativeLayout = null;
        }
        return reactionHeartTop + relativeLayout.getTop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent
    public int getReactionLeft() {
        int reactionLeft = super.getReactionLeft();
        RelativeLayout relativeLayout = this.f59063m0;
        if (relativeLayout == null) {
            AbstractC19074t.m100223u("contentContainerView");
            relativeLayout = null;
        }
        return reactionLeft + relativeLayout.getTop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent
    public int getReactionTop() {
        int reactionTop = super.getReactionTop();
        RelativeLayout relativeLayout = this.f59063m0;
        if (relativeLayout == null) {
            AbstractC19074t.m100223u("contentContainerView");
            relativeLayout = null;
        }
        return reactionTop + relativeLayout.getTop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f59049A0 = (ImageButton) findViewById(AbstractC6918a0.btn_retry_sending);
        this.f59050B0 = findViewById(AbstractC6918a0.layout_state);
        this.f59054F0 = (ZAppCompatImageView) findViewById(AbstractC6918a0.icon_state);
        this.f59053E0 = (RobotoTextView) findViewById(AbstractC6918a0.text_state);
        this.f59055G0 = findViewById(AbstractC6918a0.layout_time);
        this.f59056H0 = (ZAppCompatImageView) findViewById(AbstractC6918a0.icon_ttl);
        this.f59057I0 = (RobotoTextView) findViewById(AbstractC6918a0.text_time);
        this.f59058J0 = (RobotoTextView) findViewById(AbstractC6918a0.count_down_time);
        this.f59060L0 = (PhotoToggleButton) findViewById(AbstractC6918a0.select_checkbox);
        ImageButton imageButton = this.f59049A0;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.chat.chatrow.y1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatRowWebContentPlus.m61878K0(ChatRowWebContentPlus.this, view);
                }
            });
        }
        View view = this.f59050B0;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.chat.chatrow.z1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatRowWebContentPlus.m61879L0(ChatRowWebContentPlus.this, view2);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent
    public void setChatContent(C17945a0 c17945a0) {
        boolean z11;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        super.setChatContent(c17945a0);
        C28769a mo62079c4 = this.f57166E.mo62079c4(c17945a0.m95029V3());
        AbstractC19074t.m100207e(mo62079c4, "provideChatBubbleData(...)");
        if (!mo62079c4.f133313i && !mo62079c4.f133314j) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f59068r0 = z11;
        View findViewById = findViewById(AbstractC6918a0.content_container_view);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f59063m0 = (RelativeLayout) findViewById;
        if (mo62079c4.f133321q) {
            m61872E0();
            AbstractC23136l9.m118744r1(this.f59064n0, 0);
            m61892w0(c17945a0);
            if (c17945a0.m94847A6()) {
                m61875H0();
                AbstractC23136l9.m118744r1(this.f59066p0, 0);
                m61894y0(c17945a0);
                int i11 = mo62079c4.f133319o;
                if (i11 == 1 || i11 == 2) {
                    m61874G0();
                    AbstractC23136l9.m118744r1(this.f59067q0, 0);
                    m61893x0(c17945a0);
                }
            }
        } else {
            AbstractC23136l9.m118744r1(this.f59064n0, 8);
            AbstractC23136l9.m118744r1(this.f59066p0, 8);
            AbstractC23136l9.m118744r1(this.f59067q0, 8);
        }
        m61891v0(mo62079c4.f133321q);
        m61885S0(c17945a0);
        m61886T0();
        m61884R0(mo62079c4);
    }

    public final void setRetryFailMessage(ChatRowWebContent.C11447h.a aVar) {
        this.f59076z0 = aVar;
    }
}
