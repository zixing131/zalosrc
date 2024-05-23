package com.zing.zalo.p077ui.chat;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.chathead.ChatHeadUI.PopupFragment.UpArrowLayout;
import com.zing.zalo.p077ui.chat.ChatFrameLayout;
import com.zing.zalo.p077ui.chat.widget.BackToLastChatView;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.p077ui.chat.widget.banners.ChatSettingBanner;
import com.zing.zalo.p077ui.chat.widget.banners.MediaDownloadStatusView;
import com.zing.zalo.p077ui.chat.widget.banners.NotifyCallSettingBanner;
import com.zing.zalo.p077ui.chat.widget.banners.UserSafetyWarningBannerModulesView;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatBottomOverlayContainerView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.JumpDownFloatingView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.MentionJumpFloatingView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.ReactJumpFloatingView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.UnreadJumpFloatingView;
import com.zing.zalo.p077ui.chat.widget.jumpbutton.WhereLeftJumpFloatingView;
import com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView;
import com.zing.zalo.p077ui.chat.widget.search.ChatSearchBarView;
import com.zing.zalo.p077ui.moduleview.csc.FloatingPromoteTrendingStickerModulesView;
import com.zing.zalo.p077ui.moduleview.csc.SuggestLinkModulesView;
import com.zing.zalo.p077ui.mycloud.EmbeddedMyCloudPagesLayout;
import com.zing.zalo.p077ui.mycloud.MyCloudQuotaBanner;
import com.zing.zalo.p077ui.widget.C13804v0;
import com.zing.zalo.p077ui.widget.E2eeWarningBanner;
import com.zing.zalo.p077ui.widget.FileDownloadBannerView;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton;
import com.zing.zalo.p077ui.widget.recyclerview.TouchListView;
import com.zing.zalo.p077ui.widget.textview.AnimTypingTextView;
import com.zing.zalo.pinboard.PinTopicBanner;
import com.zing.zalo.report_v2.module.ReportTypeMsgAttachView;
import com.zing.zalo.uicontrol.AbstractPushToTalkControl;
import com.zing.zalo.uicontrol.PushToTalkControl;
import com.zing.zalo.uicontrol.PushToTalkSpeechToText;
import df0.C17911a;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p266jg.AbstractC21244b;
import p348mi.AbstractC23309i;
import p365nk.C23805a;
import p394oj.C24277c;
import p405ov.C24559a;

/* loaded from: classes5.dex */
public class ChatFrameLayout extends FrameLayout implements Drawable.Callback {

    /* renamed from: J0 */
    private static final SparseIntArray f56654J0 = new SparseIntArray();

    /* renamed from: K0 */
    public static final int f56655K0 = AbstractC23136l9.m118742r(42.0f);

    /* renamed from: L0 */
    private static final Handler f56656L0 = new Handler(Looper.getMainLooper());

    /* renamed from: A */
    public View f56657A;

    /* renamed from: A0 */
    private final C13804v0 f56658A0;

    /* renamed from: B */
    public View f56659B;

    /* renamed from: B0 */
    private int f56660B0;

    /* renamed from: C */
    public View f56661C;

    /* renamed from: C0 */
    private int f56662C0;

    /* renamed from: D */
    public View f56663D;

    /* renamed from: D0 */
    private boolean f56664D0;

    /* renamed from: E */
    public View f56665E;

    /* renamed from: E0 */
    private int f56666E0;

    /* renamed from: F */
    public View f56667F;

    /* renamed from: F0 */
    ChatFrameLayout f56668F0;

    /* renamed from: G */
    public View f56669G;

    /* renamed from: G0 */
    private int f56670G0;

    /* renamed from: H */
    public View f56671H;

    /* renamed from: H0 */
    Rect f56672H0;

    /* renamed from: I */
    public View f56673I;

    /* renamed from: I0 */
    private ImageView f56674I0;

    /* renamed from: J */
    public View f56675J;

    /* renamed from: K */
    public View f56676K;

    /* renamed from: L */
    public View f56677L;

    /* renamed from: M */
    public View f56678M;

    /* renamed from: N */
    public View f56679N;

    /* renamed from: O */
    private View f56680O;

    /* renamed from: P */
    public View f56681P;

    /* renamed from: Q */
    public View f56682Q;

    /* renamed from: R */
    public View f56683R;

    /* renamed from: S */
    public UserSafetyWarningBannerModulesView f56684S;

    /* renamed from: T */
    public View f56685T;

    /* renamed from: U */
    public View f56686U;

    /* renamed from: V */
    public View f56687V;

    /* renamed from: W */
    public View f56688W;

    /* renamed from: a0 */
    private View f56689a0;

    /* renamed from: b0 */
    public View f56690b0;

    /* renamed from: c0 */
    public View f56691c0;

    /* renamed from: d0 */
    public View f56692d0;

    /* renamed from: e0 */
    public View f56693e0;

    /* renamed from: f0 */
    public View f56694f0;

    /* renamed from: g0 */
    public View f56695g0;

    /* renamed from: h0 */
    public View f56696h0;

    /* renamed from: i0 */
    public View f56697i0;

    /* renamed from: j0 */
    public View f56698j0;

    /* renamed from: k0 */
    private View f56699k0;

    /* renamed from: l0 */
    public View f56700l0;

    /* renamed from: m0 */
    public View f56701m0;

    /* renamed from: n0 */
    public View f56702n0;

    /* renamed from: o0 */
    public View f56703o0;

    /* renamed from: p */
    private int f56704p;

    /* renamed from: p0 */
    public View f56705p0;

    /* renamed from: q */
    private int f56706q;

    /* renamed from: q0 */
    public FloatingPromoteTrendingStickerModulesView f56707q0;

    /* renamed from: r */
    private final AbstractC2379w.a f56708r;

    /* renamed from: r0 */
    public View f56709r0;

    /* renamed from: s */
    private boolean f56710s;

    /* renamed from: s0 */
    public View f56711s0;

    /* renamed from: t */
    private InterfaceC11268a f56712t;

    /* renamed from: t0 */
    public View f56713t0;

    /* renamed from: u */
    private View f56714u;

    /* renamed from: u0 */
    public ChatBottomOverlayContainerView f56715u0;

    /* renamed from: v */
    private View f56716v;

    /* renamed from: v0 */
    public EmbeddedMyCloudPagesLayout f56717v0;

    /* renamed from: w */
    private View f56718w;

    /* renamed from: w0 */
    public BackToLastChatView f56719w0;

    /* renamed from: x */
    public View f56720x;

    /* renamed from: x0 */
    public View f56721x0;

    /* renamed from: y */
    private View f56722y;

    /* renamed from: y0 */
    private int f56723y0;

    /* renamed from: z */
    public View f56724z;

    /* renamed from: z0 */
    private Drawable f56725z0;

    /* renamed from: com.zing.zalo.ui.chat.ChatFrameLayout$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11268a {
        /* renamed from: y1 */
        void mo59220y1(int i11);

        /* renamed from: z3 */
        void mo59221z3(int i11);
    }

    public ChatFrameLayout(Context context) {
        super(context);
        this.f56704p = 0;
        this.f56706q = 0;
        this.f56708r = new AbstractC2379w.a();
        this.f56710s = false;
        this.f56723y0 = 0;
        this.f56666E0 = 0;
        this.f56668F0 = this;
        this.f56670G0 = 0;
        this.f56672H0 = new Rect();
        this.f56674I0 = null;
        this.f56725z0 = new ColorDrawable(C23212s8.m119607o(context, AbstractC16781w.CSCPrimaryBackground));
        setWillNotDraw(false);
        this.f56658A0 = new C13804v0(this);
        SparseIntArray sparseIntArray = f56654J0;
        sparseIntArray.append(AbstractC6918a0.floating_tip_promote_trending_sticker, 0);
        sparseIntArray.append(AbstractC6918a0.csc_bottom_overlay_container, 1);
        sparseIntArray.append(AbstractC6918a0.typing_message, 2);
        sparseIntArray.append(AbstractC6918a0.chat_attachment_container_view, 3);
        sparseIntArray.append(AbstractC6918a0.chat_layout_group_topic, 4);
        sparseIntArray.append(AbstractC6918a0.chat_layout_function_privacy_old, 5);
        sparseIntArray.append(AbstractC6918a0.viewstubChatSettingsBanner, 6);
        sparseIntArray.append(AbstractC6918a0.viewstubNotifyCallSettingBanner, 7);
        sparseIntArray.append(AbstractC6918a0.layoutHistoryLoading, 8);
        sparseIntArray.append(AbstractC6918a0.chat_return_call_layout, 9);
        sparseIntArray.append(AbstractC6918a0.chat_sticky_music_player, 10);
        sparseIntArray.append(AbstractC6918a0.live_location_bar, 11);
        sparseIntArray.append(AbstractC6918a0.chat_live_streaming_noti_bar, 12);
        sparseIntArray.append(AbstractC6918a0.view_quick_action_top, 13);
        sparseIntArray.append(AbstractC6918a0.chat_layout_function_privacy, 14);
        sparseIntArray.append(AbstractC6918a0.chat_themes_id, 15);
        sparseIntArray.append(AbstractC6918a0.zalo_action_bar, 16);
        sparseIntArray.append(AbstractC6918a0.trending_search_view, 17);
        sparseIntArray.append(AbstractC6918a0.search_inline_listview, 18);
        sparseIntArray.append(AbstractC6918a0.suggest_header_view, 19);
        sparseIntArray.append(AbstractC6918a0.btn_reaction_jump, 20);
        sparseIntArray.append(AbstractC6918a0.btn_new_msg_jump, 21);
        sparseIntArray.append(AbstractC6918a0.btn_mention_jump, 22);
        sparseIntArray.append(AbstractC6918a0.btn_unread_file_jump, 23);
        sparseIntArray.append(AbstractC6918a0.chat_push_to_talk_control, 24);
        sparseIntArray.append(AbstractC6918a0.live_emoji_button, 25);
        sparseIntArray.append(AbstractC6918a0.live_emoji_cleaner, 26);
        sparseIntArray.append(AbstractC6918a0.chat_input_bar_container, 27);
        sparseIntArray.append(AbstractC6918a0.btn_jump_down, 28);
        sparseIntArray.append(AbstractC6918a0.chat_compose_panel, 29);
        sparseIntArray.append(AbstractC6918a0.csc_embedded_media_store_layout, 30);
        sparseIntArray.append(AbstractC6918a0.chat_search_toolbar, 31);
        sparseIntArray.append(AbstractC6918a0.viewstubE2eeWarningBanner, 32);
        sparseIntArray.append(AbstractC6918a0.viewReportAttachMsgTypeBanner, 33);
        sparseIntArray.append(AbstractC6918a0.my_cloud_quota_banner, 34);
        if (Build.VERSION.SDK_INT >= 30) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: v50.f
                public /* synthetic */ ViewOnApplyWindowInsetsListenerC27631f() {
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets m59145e0;
                    m59145e0 = ChatFrameLayout.this.m59145e0(view, windowInsets);
                    return m59145e0;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m59138A0(int i11, int i12, FrameLayout.LayoutParams layoutParams, int i13, int i14, int i15, int i16, Rect rect) {
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24 = layoutParams.gravity;
        if (i24 == -1) {
            i24 = 51;
        }
        int i25 = i24 & 112;
        int i26 = i24 & 7;
        if (i26 != 1) {
            if (i26 != 5) {
                i19 = layoutParams.leftMargin;
                if (i25 == 16) {
                    if (i25 != 48) {
                        if (i25 != 80) {
                            i23 = layoutParams.topMargin;
                        } else {
                            i21 = (i16 - i14) - i12;
                            i22 = layoutParams.bottomMargin;
                        }
                    } else {
                        i23 = layoutParams.topMargin;
                    }
                    rect.left = i19;
                    rect.top = i23;
                    rect.right = i19 + i11;
                    rect.bottom = i23 + i12;
                }
                i21 = (((i16 - i14) - i12) / 2) + layoutParams.topMargin;
                i22 = layoutParams.bottomMargin;
                i23 = i21 - i22;
                rect.left = i19;
                rect.top = i23;
                rect.right = i19 + i11;
                rect.bottom = i23 + i12;
            }
            i17 = i15 - i11;
            i18 = layoutParams.rightMargin;
        } else {
            i17 = (((i15 - i13) - i11) / 2) + layoutParams.leftMargin;
            i18 = layoutParams.rightMargin;
        }
        i19 = i17 - i18;
        if (i25 == 16) {
        }
        i23 = i21 - i22;
        rect.left = i19;
        rect.top = i23;
        rect.right = i19 + i11;
        rect.bottom = i23 + i12;
    }

    /* renamed from: c0 */
    private boolean m59142c0(View view) {
        return view == this.f56665E || view == this.f56671H || view == this.f56675J || view == this.f56676K;
    }

    /* renamed from: d0 */
    private boolean m59144d0(View view) {
        return view == this.f56673I || view == this.f56667F || view == this.f56677L || view == this.f56669G;
    }

    /* renamed from: e0 */
    public /* synthetic */ WindowInsets m59145e0(View view, WindowInsets windowInsets) {
        WindowInsets rootWindowInsets;
        int ime;
        boolean isVisible;
        rootWindowInsets = getRootWindowInsets();
        if (rootWindowInsets != null) {
            ime = WindowInsets.Type.ime();
            isVisible = rootWindowInsets.isVisible(ime);
            if (isVisible != this.f56710s) {
                requestLayout();
            }
        }
        return windowInsets;
    }

    /* renamed from: f0 */
    public /* synthetic */ void m59146f0() {
        this.f56712t.mo59221z3(this.f56706q);
    }

    /* renamed from: g0 */
    public /* synthetic */ void m59147g0() {
        this.f56712t.mo59220y1(this.f56706q);
    }

    private int getMeasuredActionBarHeight() {
        View view = this.f56714u;
        if (view != null && view.getVisibility() != 8) {
            return this.f56714u.getMeasuredHeight();
        }
        return 0;
    }

    private int getMeasuredFooterBannersHeight() {
        int i11;
        View view = this.f56657A;
        if (view != null && view.getVisibility() != 8) {
            i11 = this.f56657A.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        View view2 = this.f56661C;
        if (view2 != null && view2.getVisibility() != 8) {
            i11 += this.f56661C.getMeasuredHeight();
        }
        View view3 = this.f56701m0;
        if (view3 != null && view3.getVisibility() != 8) {
            i11 += this.f56701m0.getMeasuredHeight();
        }
        View view4 = this.f56659B;
        if (view4 != null && view4.getVisibility() != 8) {
            i11 += this.f56659B.getMeasuredHeight();
        }
        View view5 = this.f56678M;
        if (view5 != null && view5.getVisibility() != 8) {
            i11 += this.f56678M.getMeasuredHeight();
        }
        View view6 = this.f56718w;
        if (view6 != null && view6.getVisibility() != 8) {
            return i11 + this.f56718w.getMeasuredHeight();
        }
        return i11;
    }

    private int getMeasuredHeaderBannersHeight() {
        int i11;
        View view = this.f56686U;
        int i12 = 0;
        if (view != null && view.getVisibility() != 8) {
            i11 = this.f56686U.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        View view2 = this.f56687V;
        if (view2 != null && view2.getVisibility() != 8) {
            i11 += this.f56687V.getMeasuredHeight();
        }
        View view3 = this.f56683R;
        if (view3 != null && view3.getVisibility() != 8) {
            i11 += this.f56683R.getMeasuredHeight();
        }
        UserSafetyWarningBannerModulesView userSafetyWarningBannerModulesView = this.f56684S;
        if (userSafetyWarningBannerModulesView != null && userSafetyWarningBannerModulesView.getVisibility() != 8) {
            i11 += this.f56684S.getMeasuredHeight();
        }
        View view4 = this.f56685T;
        if (view4 != null && view4.getVisibility() != 8) {
            i11 += this.f56685T.getMeasuredHeight();
        }
        View view5 = this.f56690b0;
        if (view5 != null && view5.getVisibility() != 8) {
            i11 += this.f56690b0.getMeasuredHeight();
        }
        View view6 = this.f56693e0;
        if (view6 != null && view6.getVisibility() != 8) {
            i11 += this.f56693e0.getMeasuredHeight();
        }
        View view7 = this.f56700l0;
        if (view7 != null && view7.getVisibility() != 8) {
            i11 += this.f56700l0.getMeasuredHeight();
        }
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = this.f56717v0;
        if (embeddedMyCloudPagesLayout != null && embeddedMyCloudPagesLayout.getVisibility() != 8) {
            i11 += this.f56717v0.getTabViewHeight();
        }
        View view8 = this.f56703o0;
        if (view8 != null && view8.getVisibility() != 8) {
            i12 = this.f56703o0.getMeasuredHeight();
        }
        int max = Math.max(i11, i12);
        View view9 = this.f56682Q;
        if (view9 != null && view9.getVisibility() != 8) {
            max += this.f56682Q.getMeasuredHeight();
        }
        View view10 = this.f56721x0;
        if (view10 != null && view10.getVisibility() != 8) {
            return max + this.f56721x0.getMeasuredHeight();
        }
        return max;
    }

    private int getMeasuredJumpDownButtonsHeight() {
        int i11;
        View view = this.f56665E;
        if (view != null && view.getVisibility() != 8) {
            i11 = this.f56665E.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        View view2 = this.f56671H;
        if (view2 != null && view2.getVisibility() != 8) {
            i11 += this.f56671H.getMeasuredHeight();
        }
        View view3 = this.f56675J;
        if (view3 != null && view3.getVisibility() != 8) {
            i11 += this.f56675J.getMeasuredHeight();
        }
        View view4 = this.f56676K;
        if (view4 != null && view4.getVisibility() != 8) {
            return i11 + this.f56676K.getMeasuredHeight();
        }
        return i11;
    }

    private int getMeasuredListMessageTop() {
        int measuredActionBarHeight = getMeasuredActionBarHeight();
        View view = this.f56686U;
        if (view != null && view.getVisibility() != 8) {
            measuredActionBarHeight += this.f56686U.getMeasuredHeight();
        }
        View view2 = this.f56687V;
        if (view2 != null && view2.getVisibility() != 8) {
            measuredActionBarHeight += this.f56687V.getMeasuredHeight();
        }
        View view3 = this.f56682Q;
        if (view3 != null && view3.getVisibility() != 8) {
            measuredActionBarHeight += this.f56682Q.getMeasuredHeight();
        }
        UserSafetyWarningBannerModulesView userSafetyWarningBannerModulesView = this.f56684S;
        if (userSafetyWarningBannerModulesView != null && userSafetyWarningBannerModulesView.getVisibility() != 8) {
            measuredActionBarHeight += this.f56684S.getMeasuredHeight();
        }
        View view4 = this.f56685T;
        if (view4 != null && view4.getVisibility() != 8) {
            measuredActionBarHeight += this.f56685T.getMeasuredHeight();
        }
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = this.f56717v0;
        if (embeddedMyCloudPagesLayout != null && embeddedMyCloudPagesLayout.getVisibility() != 8) {
            measuredActionBarHeight += this.f56717v0.getTabViewHeight();
        }
        View view5 = this.f56688W;
        if (view5 != null && view5.getVisibility() != 8) {
            measuredActionBarHeight += this.f56688W.getMeasuredHeight();
        }
        View view6 = this.f56721x0;
        if (view6 != null && view6.getVisibility() != 8) {
            return measuredActionBarHeight + this.f56721x0.getMeasuredHeight();
        }
        return measuredActionBarHeight;
    }

    /* renamed from: h0 */
    public /* synthetic */ void m59148h0() {
        ChatBottomOverlayContainerView chatBottomOverlayContainerView = this.f56715u0;
        if (chatBottomOverlayContainerView != null) {
            removeView(chatBottomOverlayContainerView);
            this.f56715u0.m65359k();
            this.f56715u0 = null;
        }
    }

    /* renamed from: i0 */
    private String m59149i0() {
        try {
            C1580n1 m7824M = AbstractC1579n0.m7824M(this);
            if (m7824M != null) {
                return "imeVisible: " + m7824M.m8065r(C1580n1.m.m8114b()) + "/ApiKeyboardHeight: " + m7824M.m8054f(C1580n1.m.m8114b()).f6233d;
            }
            return "none";
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "none";
        }
    }

    /* renamed from: j0 */
    private void m59150j0() {
        try {
            getLocationInWindow(this.f56708r.f9928c);
            getLocationOnScreen(this.f56708r.f9927b);
            C24559a.m127933c("[KeyboardInfo]", "\nmVisibleRect= " + this.f56708r.f9926a + "\nmLocationOnScreen= (" + this.f56708r.f9927b[0] + "," + this.f56708r.f9927b[1] + ")\nmLocationInWindow= (" + this.f56708r.f9928c[0] + "," + this.f56708r.f9928c[1] + ")\nmUsableHeight= " + this.f56708r.f9929d + "\nmKeyboardHeight= " + this.f56708r.f9930e + "\nmTopInset= " + this.f56708r.f9931f + "\nmBottomInset= " + this.f56708r.f9932g + "\nmPaddingBottom=" + this.f56723y0 + "\nrootViewWidth: " + getRootView().getWidth() + ", rootViewHeight: " + getRootView().getHeight() + "\nApiKeyboard: " + m59149i0());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k0 */
    private void m59151k0() {
        boolean z11;
        int i11;
        try {
            AbstractC2379w.m12429c(this, this.f56708r, AbstractC23309i.m122007i5(getContext()));
            int i12 = this.f56708r.f9930e;
            if (i12 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f56704p != i12) {
                post(new Runnable() { // from class: v50.c
                    public /* synthetic */ RunnableC27586c() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatFrameLayout.this.requestLayout();
                    }
                });
                return;
            }
            if ((i12 != this.f56706q || !this.f56710s) && z11) {
                this.f56710s = true;
                if (AbstractC23136l9.m118666N0(this.f56718w)) {
                    this.f56718w.setVisibility(8);
                }
                this.f56706q = i12;
                AbstractC23309i.m120984Gp(i12);
                if ((getContext() instanceof Activity) && (i11 = this.f56723y0) > 0 && i11 != this.f56706q) {
                    setPaddingBottom(AbstractC23309i.m122007i5(getContext()));
                }
                if (this.f56712t != null) {
                    post(new Runnable() { // from class: v50.d
                        public /* synthetic */ RunnableC27601d() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatFrameLayout.this.m59146f0();
                        }
                    });
                    m59150j0();
                    return;
                }
                return;
            }
            if (this.f56710s && !z11) {
                this.f56710s = false;
                this.f56706q = i12;
                if (this.f56712t != null) {
                    post(new Runnable() { // from class: v50.e
                        public /* synthetic */ RunnableC27616e() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatFrameLayout.this.m59147g0();
                        }
                    });
                    m59150j0();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatFrameLayout", e11);
        }
    }

    /* renamed from: l0 */
    private void m59152l0(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f56665E.getLayoutParams();
        int measuredWidth = this.f56665E.getMeasuredWidth();
        int measuredHeight = this.f56665E.getMeasuredHeight();
        m59138A0(measuredWidth, measuredHeight, layoutParams, i11, i12, i13, i14, this.f56672H0);
        Rect rect = this.f56672H0;
        int i19 = rect.left;
        int i21 = rect.right;
        if (this.f56680O != null) {
            i18 = i15;
            if (i16 != 0 && i16 < i18 && i17 > i19) {
                i18 = i16;
            }
        } else {
            i18 = 0;
        }
        int measuredChatInputBarHeight = ((i18 - getMeasuredChatInputBarHeight()) - layoutParams.bottomMargin) - getMeasuredFooterBannersHeight();
        this.f56665E.layout(i19, measuredChatInputBarHeight, i21, measuredHeight + measuredChatInputBarHeight);
    }

    /* renamed from: m0 */
    private void m59153m0(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f56676K.getLayoutParams();
        int measuredWidth = this.f56676K.getMeasuredWidth();
        int measuredHeight = this.f56676K.getMeasuredHeight();
        m59138A0(measuredWidth, measuredHeight, layoutParams, i11, i12, i13, i14, this.f56672H0);
        Rect rect = this.f56672H0;
        int i19 = rect.left;
        int i21 = rect.right;
        if (this.f56680O != null) {
            i18 = i15;
            if (i16 != 0 && i16 < i18 && i17 > i19) {
                i18 = i16;
            }
        } else {
            i18 = 0;
        }
        int measuredChatInputBarHeight = ((i18 - getMeasuredChatInputBarHeight()) - layoutParams.bottomMargin) - getMeasuredFooterBannersHeight();
        this.f56676K.layout(i19, measuredChatInputBarHeight, i21, measuredHeight + measuredChatInputBarHeight);
    }

    /* renamed from: n0 */
    private void m59154n0(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f56675J.getLayoutParams();
        int measuredWidth = this.f56675J.getMeasuredWidth();
        int measuredHeight = this.f56675J.getMeasuredHeight();
        m59138A0(measuredWidth, measuredHeight, layoutParams, i11, i12, i13, i14, this.f56672H0);
        Rect rect = this.f56672H0;
        int i19 = rect.left;
        int i21 = rect.right;
        if (this.f56680O != null) {
            i18 = i15;
            if (i16 != 0 && i16 < i18 && i17 > i19) {
                i18 = i16;
            }
        } else {
            i18 = 0;
        }
        int measuredChatInputBarHeight = ((i18 - getMeasuredChatInputBarHeight()) - layoutParams.bottomMargin) - getMeasuredFooterBannersHeight();
        View view = this.f56671H;
        if (view != null && view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f56671H.getLayoutParams();
            measuredChatInputBarHeight -= (this.f56671H.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        this.f56675J.layout(i19, measuredChatInputBarHeight, i21, measuredHeight + measuredChatInputBarHeight);
    }

    /* renamed from: o0 */
    private void m59155o0(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f56671H.getLayoutParams();
        int measuredWidth = this.f56671H.getMeasuredWidth();
        int measuredHeight = this.f56671H.getMeasuredHeight();
        m59138A0(measuredWidth, measuredHeight, layoutParams, i11, i12, i13, i14, this.f56672H0);
        Rect rect = this.f56672H0;
        int i19 = rect.left;
        int i21 = rect.right;
        if (this.f56680O != null) {
            i18 = i15;
            if (i16 != 0 && i16 < i18 && i17 > i19) {
                i18 = i16;
            }
        } else {
            i18 = 0;
        }
        int measuredChatInputBarHeight = ((i18 - getMeasuredChatInputBarHeight()) - layoutParams.bottomMargin) - getMeasuredFooterBannersHeight();
        this.f56671H.layout(i19, measuredChatInputBarHeight, i21, measuredHeight + measuredChatInputBarHeight);
    }

    /* renamed from: A */
    public View m59156A() {
        View suggestLinkModulesView = new SuggestLinkModulesView(getContext());
        suggestLinkModulesView.setId(AbstractC6918a0.suggest_link_copied_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 85;
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        layoutParams.setMargins(m118742r, m118742r, m118742r, m118742r);
        addView(suggestLinkModulesView, layoutParams);
        this.f56701m0 = suggestLinkModulesView;
        return suggestLinkModulesView;
    }

    /* renamed from: B */
    public View m59157B(C24277c c24277c) {
        View liveEmojiButton = new LiveEmojiButton(getContext(), c24277c);
        liveEmojiButton.setId(AbstractC6918a0.live_emoji_button);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LiveEmojiButton.f70632d0, LiveEmojiButton.f70633e0);
        layoutParams.gravity = 5;
        addView(liveEmojiButton, layoutParams);
        this.f56698j0 = liveEmojiButton;
        return liveEmojiButton;
    }

    /* renamed from: B0 */
    public View m59158B0() {
        View view = this.f56699k0;
        if (view != null) {
            view.setVisibility(0);
            return this.f56699k0;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setId(AbstractC6918a0.live_emoji_cleaner);
        imageView.setImageResource(AbstractC16803z.btn_flyemoji_close);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(50.0f), AbstractC23136l9.m118742r(50.0f));
        layoutParams.gravity = 49;
        addView(imageView, layoutParams);
        this.f56699k0 = imageView;
        return imageView;
    }

    /* renamed from: C */
    public View m59159C() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.live_location_bar, (ViewGroup) this, false);
        addView(inflate, new FrameLayout.LayoutParams(-1, -2));
        this.f56700l0 = inflate;
        return inflate;
    }

    /* renamed from: C0 */
    public View m59160C0() {
        View view = this.f56722y;
        if (view != null) {
            view.setVisibility(0);
            return this.f56722y;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.stub_chat_loading_history, (ViewGroup) null);
        addView(inflate, new FrameLayout.LayoutParams(-2, -2));
        this.f56722y = inflate;
        return inflate;
    }

    /* renamed from: D */
    public View m59161D() {
        MediaDownloadStatusView mediaDownloadStatusView = new MediaDownloadStatusView(getContext());
        mediaDownloadStatusView.setId(AbstractC6918a0.chat_group_download_id);
        addView(mediaDownloadStatusView, new FrameLayout.LayoutParams(-1, -2));
        this.f56695g0 = mediaDownloadStatusView;
        return mediaDownloadStatusView;
    }

    /* renamed from: D0 */
    public View m59162D0() {
        View view = this.f56689a0;
        if (view != null) {
            view.setVisibility(0);
            return this.f56689a0;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.stub_chat_loading_history, (ViewGroup) null);
        addView(inflate, new FrameLayout.LayoutParams(-2, -2));
        this.f56689a0 = inflate;
        return inflate;
    }

    /* renamed from: E */
    public View m59163E() {
        View newMultiPhotoSuggestView = new NewMultiPhotoSuggestView(getContext());
        newMultiPhotoSuggestView.setId(AbstractC6918a0.new_multi_photo_suggest_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.rightMargin = AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_margin_right);
        addView(newMultiPhotoSuggestView, layoutParams);
        this.f56697i0 = newMultiPhotoSuggestView;
        return newMultiPhotoSuggestView;
    }

    /* renamed from: E0 */
    public UserSafetyWarningBannerModulesView m59164E0() {
        if (this.f56684S == null) {
            UserSafetyWarningBannerModulesView userSafetyWarningBannerModulesView = new UserSafetyWarningBannerModulesView(getContext());
            this.f56684S = userSafetyWarningBannerModulesView;
            userSafetyWarningBannerModulesView.setId(AbstractC6918a0.chat_layout_function_privacy);
        }
        if (this.f56684S.getParent() == null) {
            addView(this.f56684S);
        }
        this.f56684S.setVisibility(0);
        return this.f56684S;
    }

    /* renamed from: F */
    public View m59165F() {
        if (this.f56713t0 == null) {
            this.f56713t0 = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_multi_selection_bottom_view, (ViewGroup) this, false);
            addView(this.f56713t0, new FrameLayout.LayoutParams(-1, -2));
        }
        return this.f56713t0;
    }

    /* renamed from: F0 */
    public View m59166F0() {
        if (this.f56683R == null) {
            this.f56683R = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.layout_function_privacy, (ViewGroup) null);
        }
        if (this.f56683R.getParent() == null) {
            addView(this.f56683R, new FrameLayout.LayoutParams(-1, -2));
        }
        this.f56683R.setVisibility(0);
        return this.f56683R;
    }

    /* renamed from: G */
    public ChatSettingBanner m59167G() {
        ChatSettingBanner chatSettingBanner = new ChatSettingBanner(getContext());
        chatSettingBanner.setId(AbstractC6918a0.viewstubChatSettingsBanner);
        addView(chatSettingBanner, new FrameLayout.LayoutParams(-1, -2));
        this.f56686U = chatSettingBanner;
        return chatSettingBanner;
    }

    /* renamed from: H */
    public NotifyCallSettingBanner m59168H() {
        NotifyCallSettingBanner notifyCallSettingBanner = new NotifyCallSettingBanner(getContext());
        notifyCallSettingBanner.setId(AbstractC6918a0.viewstubNotifyCallSettingBanner);
        addView(notifyCallSettingBanner, new FrameLayout.LayoutParams(-1, -2));
        this.f56687V = notifyCallSettingBanner;
        return notifyCallSettingBanner;
    }

    /* renamed from: I */
    public View m59169I() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.stub_page_menu_layout, (ViewGroup) this, false);
        inflate.setMinimumHeight(AbstractC23136l9.m118659K(AbstractC16802y.min_height_input_row));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 83;
        inflate.setLayoutParams(layoutParams);
        addView(inflate);
        this.f56696h0 = inflate;
        return inflate;
    }

    /* renamed from: J */
    public View m59170J() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.stub_chat_page_query_sending_state, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, AbstractC23136l9.m118742r(10.0f));
        addView(inflate, layoutParams);
        this.f56720x = inflate;
        return inflate;
    }

    /* renamed from: K */
    public PinTopicBanner m59171K() {
        PinTopicBanner pinTopicBanner = new PinTopicBanner(getContext());
        pinTopicBanner.setId(AbstractC6918a0.chat_layout_group_topic);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(AbstractC23136l9.m118655I(AbstractC16802y.grouptopicbanner_margin_lr), AbstractC23222t7.f112556e, AbstractC23136l9.m118655I(AbstractC16802y.grouptopicbanner_margin_lr), 0);
        addView(pinTopicBanner, layoutParams);
        this.f56682Q = pinTopicBanner;
        return pinTopicBanner;
    }

    /* renamed from: L */
    public AbstractPushToTalkControl m59172L() {
        AbstractPushToTalkControl pushToTalkControl;
        if (C17911a.f90436a.m94496f()) {
            pushToTalkControl = new PushToTalkSpeechToText(getContext());
        } else {
            pushToTalkControl = new PushToTalkControl(getContext());
        }
        pushToTalkControl.setId(AbstractC6918a0.chat_push_to_talk_control);
        addView(pushToTalkControl, new FrameLayout.LayoutParams(-1, -1));
        this.f56702n0 = pushToTalkControl;
        return pushToTalkControl;
    }

    /* renamed from: M */
    public QuickActionViewLayout m59173M(int i11) {
        m59213w0();
        QuickActionViewLayout quickActionViewLayout = new QuickActionViewLayout(getContext(), i11);
        this.f56709r0 = quickActionViewLayout;
        addView(quickActionViewLayout);
        return quickActionViewLayout;
    }

    /* renamed from: N */
    public QuickActionViewLayout m59174N(int i11) {
        m59215x0();
        QuickActionViewLayout quickActionViewLayout = new QuickActionViewLayout(getContext(), i11);
        this.f56703o0 = quickActionViewLayout;
        quickActionViewLayout.setId(AbstractC6918a0.view_quick_action_top);
        addView(this.f56703o0);
        return quickActionViewLayout;
    }

    /* renamed from: O */
    public ReportTypeMsgAttachView m59175O() {
        ReportTypeMsgAttachView reportTypeMsgAttachView = new ReportTypeMsgAttachView(getContext());
        reportTypeMsgAttachView.setId(AbstractC6918a0.viewReportAttachMsgTypeBanner);
        addView(reportTypeMsgAttachView, new FrameLayout.LayoutParams(-1, -2));
        this.f56721x0 = reportTypeMsgAttachView;
        return reportTypeMsgAttachView;
    }

    /* renamed from: P */
    public ViewGroup m59176P() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(AbstractC6918a0.chat_request_location_fragment_container);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: Q */
    public View m59177Q() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.sticky_music_player_layout_reuse, (ViewGroup) this, false);
        inflate.setId(AbstractC6918a0.chat_return_call_layout);
        addView(inflate, new FrameLayout.LayoutParams(-1, -2));
        this.f56691c0 = inflate;
        return inflate;
    }

    /* renamed from: R */
    public View m59178R() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_search_toolbar_layout, (ViewGroup) null);
        inflate.setId(AbstractC6918a0.search_toolbar_layout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        addView(inflate, layoutParams);
        this.f56678M = inflate;
        return inflate;
    }

    /* renamed from: S */
    public View m59179S() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.sticky_music_player_layout, (ViewGroup) this, false);
        inflate.setId(AbstractC6918a0.chat_sticky_music_player);
        addView(inflate, new FrameLayout.LayoutParams(-1, -2));
        this.f56690b0 = inflate;
        return inflate;
    }

    /* renamed from: T */
    public View m59180T() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.sticky_noti_live_streaming_layout, (ViewGroup) this, false);
        inflate.setId(AbstractC6918a0.chat_live_streaming_noti_bar);
        addView(inflate, new FrameLayout.LayoutParams(-1, -2));
        this.f56693e0 = inflate;
        return inflate;
    }

    /* renamed from: U */
    public View m59181U() {
        if (this.f56711s0 == null) {
            this.f56711s0 = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_toolbar_multi_selection, (ViewGroup) this, false);
            addView(this.f56711s0, new FrameLayout.LayoutParams(-1, -2));
        }
        return this.f56711s0;
    }

    /* renamed from: V */
    public ChatSearchBarView m59182V() {
        ChatSearchBarView chatSearchBarView = (ChatSearchBarView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_search_bar_layout, (ViewGroup) this, false);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        chatSearchBarView.setId(AbstractC6918a0.chat_search_toolbar);
        addView(chatSearchBarView, layoutParams);
        this.f56692d0 = chatSearchBarView;
        return chatSearchBarView;
    }

    /* renamed from: W */
    public void m59183W(boolean z11) {
        this.f56664D0 = z11;
        this.f56660B0 = (this.f56668F0.getWidth() - this.f56658A0.m77064c()) / 2;
        this.f56662C0 = (this.f56668F0.getHeight() - this.f56658A0.m77063b()) / 2;
        this.f56668F0.invalidate();
    }

    /* renamed from: X */
    public AnimTypingTextView m59184X() {
        AnimTypingTextView animTypingTextView = new AnimTypingTextView(getContext());
        animTypingTextView.setId(AbstractC6918a0.typing_message);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        addView(animTypingTextView, layoutParams);
        this.f56681P = animTypingTextView;
        return animTypingTextView;
    }

    /* renamed from: Y */
    public void m59185Y() {
        View view = this.f56699k0;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: Z */
    public void m59186Z() {
        View view = this.f56722y;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: a0 */
    public void m59187a0() {
        View view = this.f56689a0;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i11 = view != null ? f56654J0.get(view.getId(), -1) : -1;
            if (i11 < 0) {
                super.addView(view, layoutParams);
                return;
            }
            int i12 = -1;
            for (int i13 = childCount - 1; i13 >= 0; i13--) {
                if (f56654J0.get(getChildAt(i13).getId(), -1) > i11) {
                    i12 = i13;
                }
            }
            if (i12 >= 0) {
                super.addView(view, i12, layoutParams);
                return;
            } else {
                super.addView(view, layoutParams);
                return;
            }
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b0 */
    public boolean m59188b0() {
        View view = this.f56716v;
        if (view != null && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m59189e(View view, View view2, ViewGroup.LayoutParams layoutParams) {
        addView(view, layoutParams);
        this.f56714u = view2;
    }

    /* renamed from: f */
    public BackToLastChatView m59190f() {
        if (this.f56719w0 == null) {
            BackToLastChatView backToLastChatView = new BackToLastChatView(getContext());
            this.f56719w0 = backToLastChatView;
            backToLastChatView.setId(AbstractC6918a0.csc_back_to_last_chat_layout);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = AbstractC23222t7.f112566j;
            this.f56719w0.setLayoutParams(layoutParams);
            addView(this.f56719w0);
        }
        return this.f56719w0;
    }

    /* renamed from: g */
    public MyCloudQuotaBanner m59191g() {
        MyCloudQuotaBanner myCloudQuotaBanner = new MyCloudQuotaBanner(getContext());
        this.f56718w = myCloudQuotaBanner;
        myCloudQuotaBanner.setId(AbstractC6918a0.my_cloud_quota_banner);
        addView(this.f56718w, new FrameLayout.LayoutParams(-1, -2));
        return (MyCloudQuotaBanner) this.f56718w;
    }

    public ImageView getFullscreenView() {
        if (this.f56674I0 == null) {
            ImageView imageView = new ImageView(getContext());
            this.f56674I0 = imageView;
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f56674I0.setLayerType(1, null);
            addView(this.f56674I0);
        }
        return this.f56674I0;
    }

    public Drawable getImageBackground() {
        return this.f56725z0;
    }

    public View getLiveEmojiCloseButton() {
        return this.f56699k0;
    }

    public int getMeasuredChatInputBarHeight() {
        if (m59188b0()) {
            return this.f56716v.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: h */
    public ChatBottomOverlayContainerView m59192h() {
        if (this.f56715u0 == null) {
            ChatBottomOverlayContainerView chatBottomOverlayContainerView = new ChatBottomOverlayContainerView(getContext());
            this.f56715u0 = chatBottomOverlayContainerView;
            chatBottomOverlayContainerView.setId(AbstractC6918a0.csc_bottom_overlay_container);
            this.f56715u0.m65354d((TouchListView) this.f56680O);
            this.f56715u0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            addView(this.f56715u0);
        }
        return this.f56715u0;
    }

    /* renamed from: i */
    public JumpDownFloatingView m59193i() {
        JumpDownFloatingView jumpDownFloatingView = (JumpDownFloatingView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_btn_jump_down, (ViewGroup) null);
        jumpDownFloatingView.setId(AbstractC6918a0.btn_jump_down);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f));
        layoutParams.gravity = 85;
        addView(jumpDownFloatingView, layoutParams);
        this.f56665E = jumpDownFloatingView;
        return jumpDownFloatingView;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        this.f56668F0.invalidate();
    }

    /* renamed from: j */
    public MentionJumpFloatingView m59194j() {
        MentionJumpFloatingView mentionJumpFloatingView = (MentionJumpFloatingView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_btn_jump_mention, (ViewGroup) null);
        mentionJumpFloatingView.setId(AbstractC6918a0.btn_mention_jump);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f));
        layoutParams.gravity = 85;
        addView(mentionJumpFloatingView, layoutParams);
        this.f56676K = mentionJumpFloatingView;
        return mentionJumpFloatingView;
    }

    /* renamed from: k */
    public View m59195k() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_btn_jump_mention_down, (ViewGroup) null);
        inflate.setId(AbstractC6918a0.btn_mention_down_jump);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, -AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(8.0f));
        layoutParams.gravity = 85;
        addView(inflate, layoutParams);
        this.f56675J = inflate;
        return inflate;
    }

    /* renamed from: l */
    public View m59196l() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_btn_jump_mention_up, (ViewGroup) null);
        inflate.setId(AbstractC6918a0.btn_mention_up_jump);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, -AbstractC23136l9.m118742r(2.0f), 0);
        layoutParams.gravity = 53;
        addView(inflate, layoutParams);
        this.f56673I = inflate;
        return inflate;
    }

    /* renamed from: m */
    public UnreadJumpFloatingView m59197m() {
        UnreadJumpFloatingView unreadJumpFloatingView = (UnreadJumpFloatingView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_btn_jump_first_unread, (ViewGroup) null);
        unreadJumpFloatingView.setId(AbstractC6918a0.btn_unread_jump);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, -AbstractC23136l9.m118742r(2.0f), 0);
        layoutParams.gravity = 53;
        addView(unreadJumpFloatingView, layoutParams);
        this.f56667F = unreadJumpFloatingView;
        return unreadJumpFloatingView;
    }

    /* renamed from: n */
    public View m59198n() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_btn_jump_new_msg, (ViewGroup) null);
        inflate.setId(AbstractC6918a0.btn_new_msg_jump);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, -AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(8.0f));
        layoutParams.gravity = 85;
        addView(inflate, layoutParams);
        this.f56671H = inflate;
        return inflate;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        int i12;
        Bitmap bitmap;
        try {
            Drawable drawable = this.f56725z0;
            if (drawable != null) {
                boolean z11 = true;
                if (drawable instanceof ColorDrawable) {
                    if (this.f56723y0 != 0 && this.f56706q == 0) {
                        canvas.save();
                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - this.f56723y0);
                    } else {
                        z11 = false;
                    }
                    this.f56725z0.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.f56725z0.draw(canvas);
                    if (this.f56723y0 != 0 && z11) {
                        canvas.restore();
                    }
                } else {
                    if ((drawable instanceof BitmapDrawable) && ((bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled())) {
                        this.f56725z0 = new ColorDrawable(ChatView.f56727K4);
                        if (this.f56723y0 != 0 && this.f56706q == 0) {
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - this.f56723y0);
                        } else {
                            z11 = false;
                        }
                        this.f56725z0.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        this.f56725z0.draw(canvas);
                        if (this.f56723y0 != 0 && z11) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                    float measuredWidth = getMeasuredWidth() / this.f56725z0.getIntrinsicWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (getContext() instanceof Activity) {
                        i11 = this.f56706q;
                    } else {
                        i11 = 0;
                    }
                    float max = Math.max(measuredWidth, (measuredHeight + i11) / this.f56725z0.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.f56725z0.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.f56725z0.getIntrinsicHeight() * max);
                    int measuredWidth2 = (getMeasuredWidth() - ceil) / 2;
                    int measuredHeight2 = getMeasuredHeight() - ceil2;
                    if (getContext() instanceof Activity) {
                        i12 = this.f56706q;
                    } else {
                        i12 = 0;
                    }
                    int i13 = (measuredHeight2 + i12) / 2;
                    if (!(getContext() instanceof Activity) && this.f56723y0 != 0) {
                        canvas.save();
                        canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    } else if (this.f56723y0 != 0 && this.f56706q == 0 && ((getContext() instanceof Activity) || this.f56666E0 == getMeasuredHeight())) {
                        canvas.save();
                        canvas.clipRect(0, 0, ceil, getMeasuredHeight() - this.f56723y0);
                    } else {
                        z11 = false;
                    }
                    this.f56725z0.setBounds(measuredWidth2, i13, ceil + measuredWidth2, ceil2 + i13);
                    this.f56725z0.draw(canvas);
                    if (this.f56723y0 != 0 && z11) {
                        canvas.restore();
                    }
                }
                if (this.f56664D0) {
                    this.f56658A0.m77067f(this.f56660B0, this.f56662C0);
                    this.f56658A0.m77062a(canvas);
                    return;
                }
                return;
            }
            super.onDraw(canvas);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatFrameLayout", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x02b8, code lost:            if (r27.f56680O != null) goto L570;     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x05ff, code lost:            if (r2.getVisibility() == 8) goto L896;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ac, code lost:            if (r27.f56680O != null) goto L570;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ae, code lost:            r8 = r14;     */
    /* JADX WARN: Removed duplicated region for block: B:388:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x063b  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int measuredHeight;
        int i24;
        int i25;
        UserSafetyWarningBannerModulesView userSafetyWarningBannerModulesView;
        View view;
        View view2;
        View view3;
        View view4;
        int measuredHeight2;
        View view5;
        int i26;
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout;
        View view6;
        View view7;
        View view8;
        int top;
        int i27;
        int height;
        int i28;
        int i29;
        int i31;
        View view9;
        int i32;
        int i33;
        int i34;
        int measuredJumpDownButtonsHeight;
        int i35;
        int childCount = getChildCount();
        int measuredListMessageTop = getMeasuredListMessageTop();
        int measuredActionBarHeight = getMeasuredActionBarHeight();
        View view10 = this.f56680O;
        int i36 = 8;
        if (view10 == null || view10.getVisibility() == 8) {
            i15 = 0;
        } else {
            View view11 = this.f56680O;
            view11.layout(0, measuredListMessageTop - this.f56670G0, view11.getMeasuredWidth(), this.f56680O.getMeasuredHeight() + measuredListMessageTop);
            int bottom = this.f56670G0 + this.f56680O.getBottom();
            ChatBottomOverlayContainerView chatBottomOverlayContainerView = this.f56715u0;
            i15 = bottom - ((chatBottomOverlayContainerView == null || chatBottomOverlayContainerView.m65357h()) ? this.f56680O.getPaddingBottom() : 0);
        }
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout2 = this.f56717v0;
        if (embeddedMyCloudPagesLayout2 != null && embeddedMyCloudPagesLayout2.getVisibility() != 8) {
            EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout3 = this.f56717v0;
            embeddedMyCloudPagesLayout3.layout(0, measuredListMessageTop - this.f56670G0, embeddedMyCloudPagesLayout3.getMeasuredWidth(), measuredListMessageTop + this.f56717v0.getMeasuredHeight());
        }
        FloatingPromoteTrendingStickerModulesView floatingPromoteTrendingStickerModulesView = this.f56707q0;
        if (floatingPromoteTrendingStickerModulesView == null || floatingPromoteTrendingStickerModulesView.getVisibility() == 8) {
            i16 = 0;
            i17 = 0;
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f56707q0.getLayoutParams();
            int measuredWidth = this.f56707q0.getMeasuredWidth();
            int measuredHeight3 = this.f56707q0.getMeasuredHeight();
            m59138A0(measuredWidth, measuredHeight3, layoutParams, i11, i12, i13, i14, this.f56672H0);
            Rect rect = this.f56672H0;
            int i37 = rect.left;
            int i38 = rect.right;
            View view12 = this.f56680O;
            if (view12 != null) {
                i35 = view12.getBottom();
                View view13 = this.f56724z;
                if (view13 != null && view13.getVisibility() == 0) {
                    i35 += this.f56724z.getMeasuredHeight();
                }
            } else {
                i35 = 0;
            }
            int i39 = i35 - (measuredHeight3 + layoutParams.bottomMargin);
            this.f56707q0.layout(i37, i39, i38, i39 + measuredHeight3);
            i17 = i38;
            i16 = i39;
        }
        View view14 = this.f56665E;
        if (view14 != null && view14.getVisibility() != 8) {
            m59152l0(i11, i12, i13, i14, i15, i16, i17);
        }
        View view15 = this.f56671H;
        if (view15 != null && view15.getVisibility() != 8) {
            m59155o0(i11, i12, i13, i14, i15, i16, i17);
        }
        View view16 = this.f56675J;
        if (view16 != null && view16.getVisibility() != 8) {
            m59154n0(i11, i12, i13, i14, i15, i16, i17);
        }
        View view17 = this.f56676K;
        if (view17 != null && view17.getVisibility() != 8) {
            m59153m0(i11, i12, i13, i14, i15, i16, i17);
        }
        int i41 = 0;
        while (i41 < childCount) {
            View childAt = getChildAt(i41);
            if (childAt == null || childAt.getVisibility() == i36 || childAt == this.f56680O || childAt == this.f56707q0 || m59142c0(childAt)) {
                i18 = i41;
                i19 = childCount;
                i21 = i16;
            } else {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight4 = childAt.getMeasuredHeight();
                i18 = i41;
                i19 = childCount;
                i21 = i16;
                m59138A0(measuredWidth2, measuredHeight4, layoutParams2, i11, i12, i13, i14, this.f56672H0);
                Rect rect2 = this.f56672H0;
                int i42 = rect2.left;
                int i43 = rect2.top;
                if (childAt == this.f56716v || childAt == this.f56696h0 || childAt == this.f56678M || childAt == this.f56713t0) {
                    View view18 = this.f56680O;
                    if (view18 != null && view18.getMeasuredHeight() > 0) {
                        int bottom2 = this.f56680O.getBottom();
                        View view19 = this.f56724z;
                        if (view19 != null && view19.getVisibility() == 0) {
                            bottom2 += this.f56724z.getMeasuredHeight();
                        }
                        i43 = bottom2;
                        View view20 = this.f56663D;
                        if (view20 != null && view20.getVisibility() == 0) {
                            measuredHeight = this.f56663D.getMeasuredHeight();
                            i43 += measuredHeight;
                        }
                    } else {
                        if (getContext() instanceof Activity) {
                            if (this.f56708r.f9929d > 0 && getMeasuredHeight() >= this.f56708r.f9929d) {
                                i22 = ((i14 - i12) - measuredHeight4) - layoutParams2.bottomMargin;
                                i23 = this.f56723y0;
                            } else {
                                i22 = (i14 - i12) - measuredHeight4;
                                i23 = layoutParams2.bottomMargin;
                            }
                        } else {
                            i22 = ((i14 - i12) - measuredHeight4) - layoutParams2.bottomMargin;
                            i23 = this.f56704p;
                            if (i23 <= 0) {
                                i23 = this.f56723y0;
                            }
                        }
                        i43 = i22 - i23;
                    }
                    childAt.layout(i42, i43, i42 + measuredWidth2, i43 + measuredHeight4);
                } else {
                    if (childAt != this.f56681P) {
                        View view21 = this.f56720x;
                        if (childAt == view21) {
                            if (this.f56680O != null) {
                                i43 = i15;
                            }
                            i43 -= measuredHeight4;
                            i28 = AbstractC23136l9.m118742r(10.0f);
                        } else {
                            if (childAt == this.f56722y) {
                                if (this.f56680O != null) {
                                    i43 = i15;
                                }
                                int i44 = i43 - measuredHeight4;
                                if (view21 != null && view21.getVisibility() != 8) {
                                    i44 -= AbstractC23136l9.m118742r(10.0f);
                                }
                                i43 = i44 - AbstractC23136l9.m118742r(10.0f);
                                i29 = (((i13 - i11) - measuredWidth2) / 2) + layoutParams2.leftMargin;
                                i31 = layoutParams2.rightMargin;
                            } else {
                                if (childAt == this.f56659B) {
                                    View view22 = this.f56680O;
                                    if (view22 != null) {
                                        i43 = view22.getBottom();
                                    }
                                } else if (childAt == this.f56661C) {
                                    View view23 = this.f56657A;
                                    if (view23 != null) {
                                        i43 = view23.getTop();
                                    }
                                } else {
                                    if (childAt == this.f56657A) {
                                        View view24 = this.f56680O;
                                        if (view24 != null) {
                                            i43 = view24.getBottom();
                                        }
                                        View view25 = this.f56659B;
                                        if (view25 != null && view25.getVisibility() != 8) {
                                            measuredJumpDownButtonsHeight = this.f56659B.getMeasuredHeight();
                                            i43 -= measuredJumpDownButtonsHeight;
                                        }
                                    } else if (childAt == this.f56697i0) {
                                        View view26 = this.f56680O;
                                        if (view26 != null) {
                                            i43 = view26.getBottom();
                                        }
                                        measuredJumpDownButtonsHeight = getMeasuredJumpDownButtonsHeight();
                                        i43 -= measuredJumpDownButtonsHeight;
                                    } else if (childAt == this.f56698j0) {
                                        int m118742r = AbstractC23136l9.m118742r(14.0f);
                                        float bottom3 = this.f56714u != null ? r2.getBottom() + m118742r : 0.0f;
                                        if (this.f56680O != null) {
                                            i43 = (i21 == 0 || i21 >= i15 || i17 <= i42) ? i15 : i21;
                                        }
                                        int measuredJumpDownButtonsHeight2 = i43 - getMeasuredJumpDownButtonsHeight();
                                        View view27 = this.f56697i0;
                                        if (view27 != null && view27.getVisibility() == 0) {
                                            measuredJumpDownButtonsHeight2 -= NewMultiPhotoSuggestView.f61183c0;
                                        }
                                        i43 = measuredJumpDownButtonsHeight2 - (measuredHeight4 + m118742r);
                                        i42 -= m118742r;
                                        float f11 = i43;
                                        float f12 = f11 - bottom3;
                                        ((LiveEmojiButton) this.f56698j0).m76402m(m118742r, m118742r + (this.f56714u != null ? r4.getBottom() : 0), i42, f11, f12);
                                    } else if (childAt == this.f56699k0) {
                                        View view28 = this.f56714u;
                                        if (view28 != null) {
                                            i43 = view28.getBottom() + AbstractC23136l9.m118742r(14.0f);
                                        }
                                    } else if (childAt != this.f56679N) {
                                        if (childAt == this.f56724z) {
                                            View view29 = this.f56680O;
                                            if (view29 != null && view29.getMeasuredHeight() > 0) {
                                                i43 = this.f56680O.getBottom();
                                            } else {
                                                top = this.f56716v.getTop();
                                                i43 = top - measuredHeight4;
                                            }
                                        } else {
                                            View view30 = this.f56688W;
                                            if (childAt != view30) {
                                                View view31 = this.f56686U;
                                                if (childAt == view31) {
                                                    i43 += measuredActionBarHeight;
                                                    if (view30 != null && view30.getVisibility() != 8) {
                                                        height = this.f56688W.getMeasuredHeight();
                                                        i43 += height;
                                                    }
                                                } else if (childAt == this.f56687V) {
                                                    i43 += measuredActionBarHeight;
                                                    if (view30 != null && view30.getVisibility() != 8) {
                                                        height = this.f56688W.getMeasuredHeight();
                                                        i43 += height;
                                                    }
                                                } else {
                                                    View view32 = this.f56683R;
                                                    if (childAt == view32) {
                                                        i43 += measuredActionBarHeight;
                                                        if (view31 != null) {
                                                            int visibility = view31.getVisibility();
                                                            i34 = 8;
                                                            if (visibility != 8) {
                                                                i43 += this.f56686U.getMeasuredHeight();
                                                            }
                                                        } else {
                                                            i34 = 8;
                                                        }
                                                        View view33 = this.f56688W;
                                                        if (view33 != null && view33.getVisibility() != i34) {
                                                            height = this.f56688W.getMeasuredHeight();
                                                            i43 += height;
                                                        }
                                                    } else if (childAt == this.f56684S) {
                                                        i43 += measuredActionBarHeight;
                                                        if (view31 != null) {
                                                            int visibility2 = view31.getVisibility();
                                                            i33 = 8;
                                                            if (visibility2 != 8) {
                                                                i43 += this.f56686U.getMeasuredHeight();
                                                            }
                                                        } else {
                                                            i33 = 8;
                                                        }
                                                        View view34 = this.f56688W;
                                                        if (view34 != null && view34.getVisibility() != i33) {
                                                            i43 += this.f56688W.getMeasuredHeight();
                                                        }
                                                        View view35 = this.f56687V;
                                                        if (view35 != null && view35.getVisibility() != i33) {
                                                            height = this.f56687V.getMeasuredHeight();
                                                            i43 += height;
                                                        }
                                                    } else if (childAt != this.f56721x0) {
                                                        if (childAt == this.f56685T) {
                                                            i43 += measuredActionBarHeight;
                                                            if (view31 != null) {
                                                                int visibility3 = view31.getVisibility();
                                                                i32 = 8;
                                                                if (visibility3 != 8) {
                                                                    i43 += this.f56686U.getMeasuredHeight();
                                                                }
                                                            } else {
                                                                i32 = 8;
                                                            }
                                                            View view36 = this.f56683R;
                                                            if (view36 != null && view36.getVisibility() != i32) {
                                                                i43 += this.f56683R.getMeasuredHeight();
                                                            }
                                                            UserSafetyWarningBannerModulesView userSafetyWarningBannerModulesView2 = this.f56684S;
                                                            if (userSafetyWarningBannerModulesView2 != null && userSafetyWarningBannerModulesView2.getVisibility() != i32) {
                                                                i43 += this.f56684S.getMeasuredHeight();
                                                            }
                                                            View view37 = this.f56688W;
                                                            if (view37 != null && view37.getVisibility() != i32) {
                                                                i43 += this.f56688W.getMeasuredHeight();
                                                            }
                                                            View view38 = this.f56687V;
                                                            if (view38 != null && view38.getVisibility() != i32) {
                                                                height = this.f56687V.getMeasuredHeight();
                                                                i43 += height;
                                                            }
                                                        } else if (childAt == this.f56682Q || childAt == this.f56705p0) {
                                                            int i45 = i43 + measuredActionBarHeight;
                                                            if (view32 != null) {
                                                                i24 = 8;
                                                                if (view32.getVisibility() != 8) {
                                                                    i25 = this.f56683R.getMeasuredHeight();
                                                                    userSafetyWarningBannerModulesView = this.f56684S;
                                                                    if (userSafetyWarningBannerModulesView != null && userSafetyWarningBannerModulesView.getVisibility() != i24) {
                                                                        i25 += this.f56684S.getMeasuredHeight();
                                                                    }
                                                                    view = this.f56685T;
                                                                    if (view != null && view.getVisibility() != i24) {
                                                                        i25 += this.f56685T.getMeasuredHeight();
                                                                    }
                                                                    if (this.f56690b0 == null) {
                                                                        View view39 = this.f56693e0;
                                                                        int i46 = view39 != null ? 8 : 8;
                                                                        if (this.f56700l0 == null) {
                                                                            View view40 = this.f56686U;
                                                                            if (view40 != null && view40.getVisibility() != i46) {
                                                                                measuredHeight2 = this.f56686U.getMeasuredHeight();
                                                                                i25 += measuredHeight2;
                                                                            }
                                                                            view5 = this.f56687V;
                                                                            if (view5 != null) {
                                                                                i26 = 8;
                                                                                if (view5.getVisibility() != 8) {
                                                                                    i25 += this.f56687V.getMeasuredHeight();
                                                                                }
                                                                            } else {
                                                                                i26 = 8;
                                                                            }
                                                                            embeddedMyCloudPagesLayout = this.f56717v0;
                                                                            if (embeddedMyCloudPagesLayout != null && embeddedMyCloudPagesLayout.getVisibility() != i26) {
                                                                                i25 += this.f56717v0.getTabViewHeight();
                                                                            }
                                                                            view6 = this.f56688W;
                                                                            if (view6 != null && view6.getVisibility() != i26) {
                                                                                i25 += this.f56688W.getMeasuredHeight();
                                                                            }
                                                                            view7 = this.f56703o0;
                                                                            if (view7 != null && view7.getVisibility() == 0 && i25 > 0) {
                                                                                i25 = Math.max(i25, this.f56703o0.getHeight());
                                                                            }
                                                                            i43 = i45 + i25;
                                                                            if (childAt == this.f56705p0 && (view8 = this.f56682Q) != null && view8.getVisibility() == 0) {
                                                                                measuredHeight = this.f56682Q.getMeasuredHeight();
                                                                                i43 += measuredHeight;
                                                                            }
                                                                        }
                                                                    }
                                                                    view2 = this.f56690b0;
                                                                    if (view2 != null) {
                                                                        i25 += view2.getMeasuredHeight();
                                                                    }
                                                                    view3 = this.f56693e0;
                                                                    if (view3 != null && view3.getVisibility() != 8) {
                                                                        i25 += this.f56693e0.getMeasuredHeight();
                                                                    }
                                                                    view4 = this.f56700l0;
                                                                    if (view4 != null) {
                                                                        measuredHeight2 = view4.getMeasuredHeight();
                                                                        i25 += measuredHeight2;
                                                                    }
                                                                    view5 = this.f56687V;
                                                                    if (view5 != null) {
                                                                    }
                                                                    embeddedMyCloudPagesLayout = this.f56717v0;
                                                                    if (embeddedMyCloudPagesLayout != null) {
                                                                        i25 += this.f56717v0.getTabViewHeight();
                                                                    }
                                                                    view6 = this.f56688W;
                                                                    if (view6 != null) {
                                                                        i25 += this.f56688W.getMeasuredHeight();
                                                                    }
                                                                    view7 = this.f56703o0;
                                                                    if (view7 != null) {
                                                                        i25 = Math.max(i25, this.f56703o0.getHeight());
                                                                    }
                                                                    i43 = i45 + i25;
                                                                    if (childAt == this.f56705p0) {
                                                                        measuredHeight = this.f56682Q.getMeasuredHeight();
                                                                        i43 += measuredHeight;
                                                                    }
                                                                }
                                                            } else {
                                                                i24 = 8;
                                                            }
                                                            i25 = 0;
                                                            userSafetyWarningBannerModulesView = this.f56684S;
                                                            if (userSafetyWarningBannerModulesView != null) {
                                                                i25 += this.f56684S.getMeasuredHeight();
                                                            }
                                                            view = this.f56685T;
                                                            if (view != null) {
                                                                i25 += this.f56685T.getMeasuredHeight();
                                                            }
                                                            if (this.f56690b0 == null) {
                                                            }
                                                            view2 = this.f56690b0;
                                                            if (view2 != null) {
                                                            }
                                                            view3 = this.f56693e0;
                                                            if (view3 != null) {
                                                                i25 += this.f56693e0.getMeasuredHeight();
                                                            }
                                                            view4 = this.f56700l0;
                                                            if (view4 != null) {
                                                            }
                                                            view5 = this.f56687V;
                                                            if (view5 != null) {
                                                            }
                                                            embeddedMyCloudPagesLayout = this.f56717v0;
                                                            if (embeddedMyCloudPagesLayout != null) {
                                                            }
                                                            view6 = this.f56688W;
                                                            if (view6 != null) {
                                                            }
                                                            view7 = this.f56703o0;
                                                            if (view7 != null) {
                                                            }
                                                            i43 = i45 + i25;
                                                            if (childAt == this.f56705p0) {
                                                            }
                                                        } else {
                                                            EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout4 = this.f56717v0;
                                                            if (childAt == embeddedMyCloudPagesLayout4) {
                                                                embeddedMyCloudPagesLayout4.setContentUITopOffset(i43 + measuredActionBarHeight);
                                                            } else if (m59144d0(childAt)) {
                                                                i43 = i43 + measuredActionBarHeight + getMeasuredHeaderBannersHeight() + AbstractC23136l9.m118742r(12.0f);
                                                                if (childAt == this.f56673I && (view9 = this.f56667F) != null && view9.getVisibility() != 8) {
                                                                    i43 += this.f56667F.getMeasuredHeight() + AbstractC23136l9.m118742r(8.0f);
                                                                }
                                                                if (childAt == this.f56677L) {
                                                                    View view41 = this.f56667F;
                                                                    if (view41 != null && view41.getVisibility() != 8) {
                                                                        i43 += this.f56667F.getMeasuredHeight() + AbstractC23136l9.m118742r(8.0f);
                                                                    }
                                                                    View view42 = this.f56673I;
                                                                    if (view42 != null && view42.getVisibility() != 8) {
                                                                        height = this.f56673I.getMeasuredHeight() + AbstractC23136l9.m118742r(8.0f);
                                                                        i43 += height;
                                                                    }
                                                                }
                                                            } else if (childAt == this.f56689a0) {
                                                                i43 = i43 + measuredActionBarHeight + getMeasuredHeaderBannersHeight() + AbstractC23136l9.m118742r(12.0f);
                                                                i29 = (((i13 - i11) - measuredWidth2) / 2) + layoutParams2.leftMargin;
                                                                i31 = layoutParams2.rightMargin;
                                                            } else {
                                                                if (childAt == this.f56719w0) {
                                                                    i43 = i43 + measuredActionBarHeight + getMeasuredHeaderBannersHeight();
                                                                    height = AbstractC23136l9.m118742r(8.0f);
                                                                } else {
                                                                    View view43 = this.f56690b0;
                                                                    if (childAt == view43) {
                                                                        i43 += measuredActionBarHeight;
                                                                        View view44 = this.f56693e0;
                                                                        if (view44 != null && view44.getVisibility() != 8) {
                                                                            i43 = i43 + this.f56693e0.getMeasuredHeight() + AbstractC23136l9.m118742r(2.0f);
                                                                        }
                                                                        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout5 = this.f56717v0;
                                                                        if (embeddedMyCloudPagesLayout5 != null && embeddedMyCloudPagesLayout5.getVisibility() != 8) {
                                                                            i43 += this.f56717v0.getTabViewHeight();
                                                                        }
                                                                        View view45 = this.f56691c0;
                                                                        if (view45 != null) {
                                                                            height = view45.getMeasuredHeight();
                                                                        }
                                                                    } else if (childAt == this.f56700l0) {
                                                                        i43 += measuredActionBarHeight;
                                                                        View view46 = this.f56693e0;
                                                                        if (view46 != null && view46.getVisibility() != 8) {
                                                                            i43 = i43 + this.f56693e0.getMeasuredHeight() + AbstractC23136l9.m118742r(2.0f);
                                                                        }
                                                                        View view47 = this.f56691c0;
                                                                        if (view47 != null) {
                                                                            i43 += view47.getMeasuredHeight();
                                                                        }
                                                                        View view48 = this.f56690b0;
                                                                        if (view48 != null) {
                                                                            height = view48.getMeasuredHeight();
                                                                        }
                                                                    } else if (childAt != this.f56693e0) {
                                                                        View view49 = this.f56691c0;
                                                                        if (childAt == view49) {
                                                                            i43 += measuredActionBarHeight;
                                                                            EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout6 = this.f56717v0;
                                                                            if (embeddedMyCloudPagesLayout6 != null && embeddedMyCloudPagesLayout6.getVisibility() != 8) {
                                                                                height = this.f56717v0.getTabViewHeight();
                                                                            }
                                                                        } else if (childAt == this.f56695g0) {
                                                                            i43 += measuredActionBarHeight;
                                                                            if (view43 != null) {
                                                                                i43 += view43.getMeasuredHeight();
                                                                                View view50 = this.f56691c0;
                                                                                if (view50 != null) {
                                                                                    i43 += view50.getMeasuredHeight();
                                                                                }
                                                                            }
                                                                            View view51 = this.f56700l0;
                                                                            if (view51 != null) {
                                                                                height = view51.getMeasuredHeight();
                                                                            }
                                                                        } else if (childAt != this.f56694f0) {
                                                                            if (childAt == this.f56703o0) {
                                                                                i43 += measuredActionBarHeight;
                                                                                if (view49 != null) {
                                                                                    height = view49.getMeasuredHeight();
                                                                                }
                                                                            } else {
                                                                                if (childAt == this.f56701m0) {
                                                                                    View view52 = this.f56680O;
                                                                                    if (view52 != null) {
                                                                                        i43 = view52.getBottom();
                                                                                    }
                                                                                    i27 = layoutParams2.bottomMargin;
                                                                                } else if (childAt == this.f56709r0) {
                                                                                    View view53 = this.f56680O;
                                                                                    if (view53 != null) {
                                                                                        i43 = view53.getBottom();
                                                                                    }
                                                                                    View view54 = this.f56724z;
                                                                                    if (view54 != null && view54.getVisibility() == 0) {
                                                                                        i43 += this.f56724z.getMeasuredHeight();
                                                                                    }
                                                                                    if (m59188b0()) {
                                                                                        height = this.f56716v.getHeight();
                                                                                    }
                                                                                } else if (childAt == this.f56715u0) {
                                                                                    View view55 = this.f56680O;
                                                                                    if (view55 != null) {
                                                                                        i43 = view55.getBottom();
                                                                                    }
                                                                                    i27 = layoutParams2.bottomMargin;
                                                                                } else if (childAt == this.f56663D) {
                                                                                    View view56 = this.f56680O;
                                                                                    if (view56 != null && view56.getMeasuredHeight() > 0) {
                                                                                        i43 = this.f56680O.getBottom();
                                                                                    } else {
                                                                                        top = this.f56716v.getTop();
                                                                                        i43 = top - measuredHeight4;
                                                                                    }
                                                                                } else if (childAt == this.f56718w && m59188b0()) {
                                                                                    top = this.f56716v.getTop();
                                                                                    i43 = top - measuredHeight4;
                                                                                }
                                                                                i28 = measuredHeight4 + i27;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i43 += height;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i43 += measuredActionBarHeight;
                                        }
                                    }
                                    childAt.layout(i42, i43, i42 + measuredWidth2, i43 + measuredHeight4);
                                }
                                i43 -= measuredHeight4;
                            }
                            i42 = i29 - i31;
                        }
                        i43 -= i28;
                    }
                    childAt.layout(i42, i43, i42 + measuredWidth2, i43 + measuredHeight4);
                }
            }
            i41 = i18 + 1;
            i16 = i21;
            childCount = i19;
            i36 = 8;
        }
        m59151k0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:            if (r20.f56708r.f9929d != r8) goto L231;     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0046, code lost:            if (r0 <= 0) goto L231;     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00d6 A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013d A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015b A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179 A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0197 A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b5 A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c6 A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dd A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0240 A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025e A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027f A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a3 A[Catch: Exception -> 0x0386, IllegalStateException -> 0x038a, TryCatch #2 {IllegalStateException -> 0x038a, Exception -> 0x0386, blocks: (B:7:0x000a, B:9:0x0019, B:10:0x001b, B:12:0x0036, B:14:0x003e, B:17:0x0094, B:19:0x009b, B:21:0x00a1, B:22:0x00b7, B:24:0x00bd, B:26:0x00f9, B:28:0x00fd, B:30:0x0103, B:31:0x0119, B:33:0x011d, B:35:0x0123, B:36:0x0139, B:38:0x013d, B:40:0x0143, B:41:0x0157, B:43:0x015b, B:45:0x0161, B:46:0x0175, B:48:0x0179, B:50:0x017f, B:51:0x0193, B:53:0x0197, B:55:0x019d, B:56:0x01b1, B:58:0x01b5, B:60:0x01bb, B:61:0x01c2, B:63:0x01c6, B:65:0x01cc, B:66:0x01d9, B:68:0x01dd, B:70:0x01e3, B:71:0x01f7, B:73:0x01fb, B:75:0x0201, B:76:0x0215, B:78:0x021b, B:80:0x0221, B:81:0x023c, B:83:0x0240, B:85:0x0246, B:86:0x025a, B:88:0x025e, B:90:0x0264, B:91:0x027b, B:93:0x027f, B:95:0x0285, B:96:0x029c, B:98:0x02a3, B:103:0x02b5, B:105:0x02b9, B:107:0x02bd, B:109:0x02c1, B:111:0x02c5, B:113:0x02c9, B:115:0x02cd, B:117:0x02d1, B:119:0x02d5, B:121:0x02d9, B:123:0x02dd, B:125:0x02e1, B:127:0x02e5, B:129:0x02e9, B:131:0x02ed, B:133:0x02f1, B:136:0x02f6, B:138:0x02fc, B:139:0x030d, B:141:0x0311, B:144:0x0324, B:145:0x031d, B:146:0x032c, B:148:0x0330, B:150:0x035c, B:152:0x0366, B:154:0x0375, B:161:0x00d6, B:163:0x00da, B:165:0x00e0, B:168:0x0044, B:170:0x0048, B:173:0x004e, B:175:0x0056, B:177:0x0062, B:179:0x0068, B:181:0x006e, B:183:0x0072, B:185:0x007f, B:187:0x008b, B:188:0x008e), top: B:6:0x000a }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        View findViewById;
        int i15;
        View view;
        int i16;
        int i17;
        int max;
        View view2;
        int i18;
        View view3;
        int i19;
        View view4;
        View view5;
        View view6;
        View view7;
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout;
        View view8;
        UserSafetyWarningBannerModulesView userSafetyWarningBannerModulesView;
        View view9;
        View view10;
        View view11;
        View view12;
        View view13;
        int childCount;
        int i21;
        int i22;
        int i23;
        int i24;
        if (getChildCount() > 0) {
            try {
                int size = View.MeasureSpec.getSize(i11);
                int size2 = View.MeasureSpec.getSize(i12);
                setMeasuredDimension(size, size2);
                if (this.f56666E0 < size2) {
                    this.f56666E0 = size2;
                }
                AbstractC2379w.m12429c(this, this.f56708r, AbstractC23309i.m122007i5(getContext()));
                int i25 = this.f56708r.f9930e;
                this.f56704p = i25;
                if (getContext() instanceof Activity) {
                    if (i25 > AbstractC23136l9.m118742r(20.0f)) {
                    }
                    i13 = this.f56723y0;
                } else {
                    if (i25 > 0) {
                        i14 = size2 - i25;
                        if (getRootView() != null && (findViewById = getRootView().findViewById(AbstractC6918a0.zalo_view_container)) != null && findViewById.getMeasuredWidth() > 0 && findViewById.getMeasuredHeight() > 0 && (findViewById instanceof UpArrowLayout)) {
                            Point pointTo = ((UpArrowLayout) findViewById).getPointTo();
                            if (AbstractC23136l9.m118685X() == 1) {
                                int i26 = pointTo.y;
                                int i27 = i14 + i26;
                                int i28 = this.f56708r.f9926a.bottom;
                                if (i27 > i28) {
                                    i14 = i28 - i26;
                                }
                            }
                        }
                        i15 = i14;
                        view = this.f56714u;
                        if (view == null && view.getVisibility() != 8) {
                            measureChildWithMargins(this.f56714u, i11, 0, i12, 0);
                            i16 = this.f56714u.getMeasuredHeight();
                        } else {
                            i16 = 0;
                        }
                        if (m59188b0()) {
                            measureChildWithMargins(this.f56716v, i11, 0, i12, 0);
                            max = Math.max(this.f56716v.getMeasuredHeight(), 0);
                        } else {
                            View view14 = this.f56678M;
                            if (view14 != null && view14.getVisibility() != 8) {
                                measureChildWithMargins(this.f56678M, i11, 0, i12, 0);
                                max = Math.max(this.f56678M.getMeasuredHeight(), 0);
                            } else {
                                i17 = 0;
                                view2 = this.f56724z;
                                if (view2 == null && view2.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56724z, i11, 0, i12, 0);
                                    i18 = this.f56724z.getMeasuredHeight();
                                } else {
                                    i18 = 0;
                                }
                                view3 = this.f56682Q;
                                if (view3 == null && view3.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56682Q, i11, 0, i12, 0);
                                    i19 = this.f56682Q.getMeasuredHeight();
                                } else {
                                    i19 = 0;
                                }
                                view4 = this.f56686U;
                                if (view4 != null && view4.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56686U, i11, 0, i12, 0);
                                    i19 += this.f56686U.getMeasuredHeight();
                                }
                                view5 = this.f56687V;
                                if (view5 != null && view5.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56687V, i11, 0, i12, 0);
                                    i19 += this.f56687V.getMeasuredHeight();
                                }
                                view6 = this.f56688W;
                                if (view6 != null && view6.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56688W, i11, 0, i12, 0);
                                    i19 += this.f56688W.getMeasuredHeight();
                                }
                                view7 = this.f56721x0;
                                if (view7 != null && view7.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56721x0, i11, 0, i12, 0);
                                    i19 += this.f56721x0.getMeasuredHeight();
                                }
                                embeddedMyCloudPagesLayout = this.f56717v0;
                                if (embeddedMyCloudPagesLayout != null && embeddedMyCloudPagesLayout.getVisibility() != 8) {
                                    i19 += this.f56717v0.getTabViewHeight();
                                }
                                view8 = this.f56683R;
                                if (view8 != null && view8.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56683R, i11, 0, i12, 0);
                                }
                                userSafetyWarningBannerModulesView = this.f56684S;
                                if (userSafetyWarningBannerModulesView != null && userSafetyWarningBannerModulesView.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56684S, i11, 0, i12, 0);
                                    i19 += this.f56684S.getMeasuredHeight();
                                }
                                view9 = this.f56685T;
                                if (view9 != null && view9.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56685T, i11, 0, i12, 0);
                                    i19 += this.f56685T.getMeasuredHeight();
                                }
                                view10 = this.f56709r0;
                                if (view10 != null && view10.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56709r0, i11, 0, View.MeasureSpec.makeMeasureSpec(f56655K0, Integer.MIN_VALUE), 0);
                                    i18 += this.f56709r0.getMeasuredHeight();
                                }
                                view11 = this.f56663D;
                                if (view11 != null && view11.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56663D, i11, 0, i12, 0);
                                    i18 += this.f56663D.getMeasuredHeight();
                                }
                                view12 = this.f56718w;
                                if (view12 != null && view12.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56718w, i11, 0, i12, 0);
                                    i17 = Math.max(this.f56718w.getMeasuredHeight(), i17);
                                }
                                view13 = this.f56713t0;
                                if (view13 != null && view13.getVisibility() != 8) {
                                    measureChildWithMargins(this.f56713t0, i11, 0, i12, 0);
                                    i17 = Math.max(this.f56713t0.getMeasuredHeight(), i17);
                                }
                                childCount = getChildCount();
                                i21 = 0;
                                while (i21 < childCount) {
                                    View childAt = getChildAt(i21);
                                    if (childAt.getVisibility() != 8 && childAt != this.f56724z && childAt != this.f56686U && childAt != this.f56682Q && childAt != this.f56683R && childAt != this.f56684S && childAt != this.f56685T && childAt != this.f56714u && childAt != this.f56709r0 && childAt != this.f56713t0 && childAt != this.f56688W && childAt != this.f56687V && childAt != this.f56663D && childAt != this.f56721x0 && childAt != this.f56718w && childAt != this.f56716v && childAt != this.f56678M) {
                                        if (childAt == this.f56680O) {
                                            childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(Math.max((((i15 - i16) - i17) - i18) - i19, 0), 1073741824));
                                        } else if (childAt == this.f56702n0) {
                                            if (AbstractC21244b.m110054d(getContext())) {
                                                i24 = size2;
                                            } else {
                                                AbstractC2379w.a aVar = this.f56708r;
                                                i24 = aVar.f9929d + aVar.f9931f;
                                            }
                                            childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(i24, 1073741824));
                                        } else {
                                            if (childAt == this.f56692d0) {
                                                i22 = i21;
                                                i23 = childCount;
                                                measureChildWithMargins(childAt, i11, 0, View.MeasureSpec.makeMeasureSpec(Math.min(AbstractC23136l9.m118742r(320.0f), Math.max((i15 - i17) - i18, 0)), Integer.MIN_VALUE), 0);
                                            } else {
                                                i22 = i21;
                                                i23 = childCount;
                                                if (childAt == this.f56717v0) {
                                                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(Math.max((i15 - i17) - i18, 0), 1073741824));
                                                } else {
                                                    measureChildWithMargins(childAt, i11, 0, i12, 0);
                                                }
                                            }
                                            i21 = i22 + 1;
                                            childCount = i23;
                                        }
                                    }
                                    i22 = i21;
                                    i23 = childCount;
                                    i21 = i22 + 1;
                                    childCount = i23;
                                }
                            }
                        }
                        i17 = max;
                        view2 = this.f56724z;
                        if (view2 == null) {
                        }
                        i18 = 0;
                        view3 = this.f56682Q;
                        if (view3 == null) {
                        }
                        i19 = 0;
                        view4 = this.f56686U;
                        if (view4 != null) {
                            measureChildWithMargins(this.f56686U, i11, 0, i12, 0);
                            i19 += this.f56686U.getMeasuredHeight();
                        }
                        view5 = this.f56687V;
                        if (view5 != null) {
                            measureChildWithMargins(this.f56687V, i11, 0, i12, 0);
                            i19 += this.f56687V.getMeasuredHeight();
                        }
                        view6 = this.f56688W;
                        if (view6 != null) {
                            measureChildWithMargins(this.f56688W, i11, 0, i12, 0);
                            i19 += this.f56688W.getMeasuredHeight();
                        }
                        view7 = this.f56721x0;
                        if (view7 != null) {
                            measureChildWithMargins(this.f56721x0, i11, 0, i12, 0);
                            i19 += this.f56721x0.getMeasuredHeight();
                        }
                        embeddedMyCloudPagesLayout = this.f56717v0;
                        if (embeddedMyCloudPagesLayout != null) {
                            i19 += this.f56717v0.getTabViewHeight();
                        }
                        view8 = this.f56683R;
                        if (view8 != null) {
                            measureChildWithMargins(this.f56683R, i11, 0, i12, 0);
                        }
                        userSafetyWarningBannerModulesView = this.f56684S;
                        if (userSafetyWarningBannerModulesView != null) {
                            measureChildWithMargins(this.f56684S, i11, 0, i12, 0);
                            i19 += this.f56684S.getMeasuredHeight();
                        }
                        view9 = this.f56685T;
                        if (view9 != null) {
                            measureChildWithMargins(this.f56685T, i11, 0, i12, 0);
                            i19 += this.f56685T.getMeasuredHeight();
                        }
                        view10 = this.f56709r0;
                        if (view10 != null) {
                            measureChildWithMargins(this.f56709r0, i11, 0, View.MeasureSpec.makeMeasureSpec(f56655K0, Integer.MIN_VALUE), 0);
                            i18 += this.f56709r0.getMeasuredHeight();
                        }
                        view11 = this.f56663D;
                        if (view11 != null) {
                            measureChildWithMargins(this.f56663D, i11, 0, i12, 0);
                            i18 += this.f56663D.getMeasuredHeight();
                        }
                        view12 = this.f56718w;
                        if (view12 != null) {
                            measureChildWithMargins(this.f56718w, i11, 0, i12, 0);
                            i17 = Math.max(this.f56718w.getMeasuredHeight(), i17);
                        }
                        view13 = this.f56713t0;
                        if (view13 != null) {
                            measureChildWithMargins(this.f56713t0, i11, 0, i12, 0);
                            i17 = Math.max(this.f56713t0.getMeasuredHeight(), i17);
                        }
                        childCount = getChildCount();
                        i21 = 0;
                        while (i21 < childCount) {
                        }
                    }
                    i13 = this.f56723y0;
                    if (i13 > 0) {
                        i14 = size2 - i13;
                        i15 = i14;
                        view = this.f56714u;
                        if (view == null) {
                        }
                        i16 = 0;
                        if (m59188b0()) {
                        }
                        i17 = max;
                        view2 = this.f56724z;
                        if (view2 == null) {
                        }
                        i18 = 0;
                        view3 = this.f56682Q;
                        if (view3 == null) {
                        }
                        i19 = 0;
                        view4 = this.f56686U;
                        if (view4 != null) {
                        }
                        view5 = this.f56687V;
                        if (view5 != null) {
                        }
                        view6 = this.f56688W;
                        if (view6 != null) {
                        }
                        view7 = this.f56721x0;
                        if (view7 != null) {
                        }
                        embeddedMyCloudPagesLayout = this.f56717v0;
                        if (embeddedMyCloudPagesLayout != null) {
                        }
                        view8 = this.f56683R;
                        if (view8 != null) {
                        }
                        userSafetyWarningBannerModulesView = this.f56684S;
                        if (userSafetyWarningBannerModulesView != null) {
                        }
                        view9 = this.f56685T;
                        if (view9 != null) {
                        }
                        view10 = this.f56709r0;
                        if (view10 != null) {
                        }
                        view11 = this.f56663D;
                        if (view11 != null) {
                        }
                        view12 = this.f56718w;
                        if (view12 != null) {
                        }
                        view13 = this.f56713t0;
                        if (view13 != null) {
                        }
                        childCount = getChildCount();
                        i21 = 0;
                        while (i21 < childCount) {
                        }
                    }
                    i15 = size2;
                    view = this.f56714u;
                    if (view == null) {
                    }
                    i16 = 0;
                    if (m59188b0()) {
                    }
                    i17 = max;
                    view2 = this.f56724z;
                    if (view2 == null) {
                    }
                    i18 = 0;
                    view3 = this.f56682Q;
                    if (view3 == null) {
                    }
                    i19 = 0;
                    view4 = this.f56686U;
                    if (view4 != null) {
                    }
                    view5 = this.f56687V;
                    if (view5 != null) {
                    }
                    view6 = this.f56688W;
                    if (view6 != null) {
                    }
                    view7 = this.f56721x0;
                    if (view7 != null) {
                    }
                    embeddedMyCloudPagesLayout = this.f56717v0;
                    if (embeddedMyCloudPagesLayout != null) {
                    }
                    view8 = this.f56683R;
                    if (view8 != null) {
                    }
                    userSafetyWarningBannerModulesView = this.f56684S;
                    if (userSafetyWarningBannerModulesView != null) {
                    }
                    view9 = this.f56685T;
                    if (view9 != null) {
                    }
                    view10 = this.f56709r0;
                    if (view10 != null) {
                    }
                    view11 = this.f56663D;
                    if (view11 != null) {
                    }
                    view12 = this.f56718w;
                    if (view12 != null) {
                    }
                    view13 = this.f56713t0;
                    if (view13 != null) {
                    }
                    childCount = getChildCount();
                    i21 = 0;
                    while (i21 < childCount) {
                    }
                }
            } catch (IllegalStateException unused) {
                super.onMeasure(i11, i12);
            } catch (Exception unused2) {
                super.onMeasure(i11, i12);
            }
        } else {
            super.onMeasure(i11, i12);
        }
    }

    /* renamed from: p */
    public ReactJumpFloatingView m59199p(boolean z11) {
        ReactJumpFloatingView reactJumpFloatingView;
        if (z11) {
            reactJumpFloatingView = (ReactJumpFloatingView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_btn_jump_reacted_msg_large, (ViewGroup) null);
        } else {
            reactJumpFloatingView = (ReactJumpFloatingView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_btn_jump_reacted_msg, (ViewGroup) null);
        }
        reactJumpFloatingView.setId(AbstractC6918a0.btn_reaction_jump);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (z11) {
            layoutParams.setMargins(0, 0, AbstractC23136l9.m118742r(8.0f), 0);
        } else {
            layoutParams.setMargins(0, 0, -AbstractC23136l9.m118742r(2.0f), 0);
        }
        layoutParams.gravity = 53;
        addView(reactJumpFloatingView, layoutParams);
        this.f56677L = reactJumpFloatingView;
        return reactJumpFloatingView;
    }

    /* renamed from: p0 */
    public void m59200p0() {
        BackToLastChatView backToLastChatView = this.f56719w0;
        if (backToLastChatView != null) {
            removeView(backToLastChatView);
            this.f56719w0 = null;
        }
    }

    /* renamed from: q */
    public WhereLeftJumpFloatingView m59201q() {
        WhereLeftJumpFloatingView whereLeftJumpFloatingView = (WhereLeftJumpFloatingView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.chat_btn_jump_where_left, (ViewGroup) null);
        whereLeftJumpFloatingView.setId(AbstractC6918a0.btn_where_left_jump);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, AbstractC23136l9.m118742r(8.0f), 0);
        layoutParams.gravity = 53;
        addView(whereLeftJumpFloatingView, layoutParams);
        this.f56669G = whereLeftJumpFloatingView;
        return whereLeftJumpFloatingView;
    }

    /* renamed from: q0 */
    public void m59202q0(boolean z11) {
        ChatBottomOverlayContainerView chatBottomOverlayContainerView = this.f56715u0;
        if (chatBottomOverlayContainerView != null) {
            chatBottomOverlayContainerView.m65356g(z11);
            if (z11) {
                this.f56715u0.m65358j(new Runnable() { // from class: v50.g
                    public /* synthetic */ RunnableC27646g() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatFrameLayout.this.m59148h0();
                    }
                });
                return;
            }
            removeView(this.f56715u0);
            this.f56715u0.m65359k();
            this.f56715u0 = null;
        }
    }

    /* renamed from: r */
    public ChatAttachmentContainer m59203r() {
        ChatAttachmentContainer chatAttachmentContainer = new ChatAttachmentContainer(getContext(), true);
        chatAttachmentContainer.setId(AbstractC6918a0.chat_attachment_container_view);
        chatAttachmentContainer.setPadding(0, 0, 0, 0);
        chatAttachmentContainer.setGravity(17);
        chatAttachmentContainer.setVisibility(8);
        AbstractC23136l9.m118693a1(chatAttachmentContainer, AbstractC16803z.chat_attachment_bg);
        addView(chatAttachmentContainer, new FrameLayout.LayoutParams(-1, -2));
        this.f56724z = chatAttachmentContainer;
        return chatAttachmentContainer;
    }

    /* renamed from: r0 */
    public void m59204r0() {
        FloatingPromoteTrendingStickerModulesView floatingPromoteTrendingStickerModulesView = this.f56707q0;
        if (floatingPromoteTrendingStickerModulesView != null) {
            removeView(floatingPromoteTrendingStickerModulesView);
            this.f56707q0 = null;
        }
    }

    /* renamed from: s */
    public void m59205s(View view) {
        addView(view, new FrameLayout.LayoutParams(-1, -2));
        this.f56716v = view;
    }

    /* renamed from: s0 */
    public void m59206s0() {
        View view = this.f56698j0;
        if (view != null) {
            removeView(view);
            this.f56698j0 = null;
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        f56656L0.postAtTime(runnable, drawable, j11);
    }

    public void setImageBackground(Drawable drawable) {
        if (this.f56725z0 != drawable) {
            this.f56725z0 = drawable;
            this.f56668F0.invalidate();
        }
    }

    public void setListMsgTranslateY(int i11) {
        this.f56670G0 = i11;
    }

    public void setOnKeyboardListener(InterfaceC11268a interfaceC11268a) {
        this.f56712t = interfaceC11268a;
    }

    public void setPaddingBottom(int i11) {
        this.f56723y0 = i11;
    }

    /* renamed from: t0 */
    public void m59207t0() {
        View view = this.f56713t0;
        if (view != null) {
            removeView(view);
            this.f56713t0 = null;
        }
    }

    /* renamed from: u */
    public void m59208u(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, layoutParams);
        this.f56680O = view;
    }

    /* renamed from: u0 */
    public void m59209u0() {
        UserSafetyWarningBannerModulesView userSafetyWarningBannerModulesView = this.f56684S;
        if (userSafetyWarningBannerModulesView != null) {
            removeView(userSafetyWarningBannerModulesView);
            this.f56684S = null;
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        f56656L0.removeCallbacks(runnable, drawable);
    }

    /* renamed from: v */
    public View m59210v() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.sticky_chat_theme_layout, (ViewGroup) this, false);
        inflate.setId(AbstractC6918a0.chat_themes_id);
        addView(inflate, new FrameLayout.LayoutParams(-1, -1));
        this.f56694f0 = inflate;
        return inflate;
    }

    /* renamed from: v0 */
    public void m59211v0() {
        View view = this.f56683R;
        if (view != null) {
            removeView(view);
            this.f56683R = null;
        }
    }

    /* renamed from: w */
    public E2eeWarningBanner m59212w() {
        E2eeWarningBanner e2eeWarningBanner = new E2eeWarningBanner(getContext());
        e2eeWarningBanner.setId(AbstractC6918a0.viewstubE2eeWarningBanner);
        addView(e2eeWarningBanner, new FrameLayout.LayoutParams(-1, -2));
        this.f56688W = e2eeWarningBanner;
        return e2eeWarningBanner;
    }

    /* renamed from: w0 */
    public void m59213w0() {
        View view = this.f56709r0;
        if (view != null) {
            removeView(view);
            this.f56709r0 = null;
        }
    }

    /* renamed from: x */
    public EmbeddedMyCloudPagesLayout m59214x() {
        try {
            if (this.f56717v0 == null) {
                EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = new EmbeddedMyCloudPagesLayout(getContext(), C23805a.e.f115063p, 0L);
                this.f56717v0 = embeddedMyCloudPagesLayout;
                embeddedMyCloudPagesLayout.setId(AbstractC6918a0.csc_embedded_media_store_layout);
                this.f56717v0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                addView(this.f56717v0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return this.f56717v0;
    }

    /* renamed from: x0 */
    public void m59215x0() {
        View view = this.f56703o0;
        if (view != null) {
            removeView(view);
            this.f56703o0 = null;
        }
    }

    /* renamed from: y */
    public View m59216y() {
        View findViewById = findViewById(AbstractC6918a0.layout_banner_file_downloaded);
        if (findViewById == null) {
            findViewById = FileDownloadBannerView.m75714u(getContext());
            findViewById.setId(AbstractC6918a0.layout_banner_file_downloaded);
            addView(findViewById);
        }
        this.f56705p0 = findViewById;
        return findViewById;
    }

    /* renamed from: y0 */
    public void m59217y0() {
        View view = this.f56721x0;
        if (view != null) {
            removeView(view);
            this.f56721x0 = null;
        }
    }

    /* renamed from: z */
    public FloatingPromoteTrendingStickerModulesView m59218z() {
        if (this.f56707q0 == null) {
            FloatingPromoteTrendingStickerModulesView floatingPromoteTrendingStickerModulesView = new FloatingPromoteTrendingStickerModulesView(getContext());
            this.f56707q0 = floatingPromoteTrendingStickerModulesView;
            floatingPromoteTrendingStickerModulesView.setId(AbstractC6918a0.floating_tip_promote_trending_sticker);
            addView(this.f56707q0);
        }
        return this.f56707q0;
    }

    /* renamed from: z0 */
    public void m59219z0() {
        View view = this.f56711s0;
        if (view != null) {
            removeView(view);
            this.f56711s0 = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i11 = view != null ? f56654J0.get(view.getId(), -1) : -1;
            if (i11 < 0) {
                super.addView(view);
                return;
            }
            int i12 = -1;
            for (int i13 = childCount - 1; i13 >= 0; i13--) {
                if (f56654J0.get(getChildAt(i13).getId(), -1) > i11) {
                    i12 = i13;
                }
            }
            if (i12 >= 0) {
                super.addView(view, i12);
                return;
            } else {
                super.addView(view);
                return;
            }
        }
        super.addView(view);
    }
}
