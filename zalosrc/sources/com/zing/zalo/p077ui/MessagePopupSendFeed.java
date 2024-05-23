package com.zing.zalo.p077ui;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import bo.InterfaceC2946a1;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7074g5;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.FeedContentMessagePopup;
import com.zing.zalo.feed.components.FeedItemMusicModuleView;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.p077ui.MessagePopupSendFeed;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;
import com.zing.zalo.p077ui.widget.ViewPagerFakeDragFixed;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import ho0.AbstractC20110a;
import is.C20791e;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p554up.C27353a;
import p588vw.C28652r;
import vg.C28020b3;
import vg.C28023b6;
import vg.C28203u6;
import y90.EnumC30861e;
import z90.AbstractC31727b;
import zl0.AbstractC32226c;

/* loaded from: classes5.dex */
public class MessagePopupSendFeed extends ZaloView implements TextWatcher, ZaloView.InterfaceC17421f, KeyboardFrameLayout.InterfaceC13508a, View.OnClickListener, View.OnFocusChangeListener, View.OnLayoutChangeListener {

    /* renamed from: Z0 */
    public static InterfaceC10867f f55328Z0;

    /* renamed from: A0 */
    View f55330A0;

    /* renamed from: B0 */
    View f55331B0;

    /* renamed from: C0 */
    View f55332C0;

    /* renamed from: D0 */
    ImageButton f55333D0;

    /* renamed from: E0 */
    AppCompatImageView f55334E0;

    /* renamed from: F0 */
    RedDotImageButton f55335F0;

    /* renamed from: G0 */
    StickerPanelView f55336G0;

    /* renamed from: H0 */
    KeyboardFrameLayout f55337H0;

    /* renamed from: I0 */
    ViewPagerFakeDragFixed f55338I0;

    /* renamed from: J0 */
    SlidingTabLayout f55339J0;

    /* renamed from: K0 */
    RobotoTextView f55340K0;

    /* renamed from: M0 */
    C7074g5 f55342M0;

    /* renamed from: O0 */
    C27353a f55344O0;

    /* renamed from: w0 */
    Handler f55353w0;

    /* renamed from: y0 */
    ActionEditText f55355y0;

    /* renamed from: z0 */
    View f55356z0;

    /* renamed from: X0 */
    static ArrayList f55326X0 = new ArrayList();

    /* renamed from: Y0 */
    static int f55327Y0 = 0;

    /* renamed from: a1 */
    static boolean f55329a1 = false;

    /* renamed from: x0 */
    boolean f55354x0 = false;

    /* renamed from: L0 */
    int f55341L0 = 1;

    /* renamed from: N0 */
    protected InterfaceC2946a1 f55343N0 = null;

    /* renamed from: P0 */
    int f55345P0 = -1;

    /* renamed from: Q0 */
    int f55346Q0 = -1;

    /* renamed from: R0 */
    int f55347R0 = -1;

    /* renamed from: S0 */
    int f55348S0 = -1;

    /* renamed from: T0 */
    final Runnable f55349T0 = new RunnableC10952a();

    /* renamed from: U0 */
    int f55350U0 = 0;

    /* renamed from: V0 */
    final Runnable f55351V0 = new RunnableC10953b();

    /* renamed from: W0 */
    final Runnable f55352W0 = new RunnableC10954c();

    /* renamed from: com.zing.zalo.ui.MessagePopupSendFeed$a */
    /* loaded from: classes5.dex */
    class RunnableC10952a implements Runnable {
        RunnableC10952a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MessagePopupSendFeed.this.f55355y0.getText().length() > 0) {
                    ActionEditText actionEditText = MessagePopupSendFeed.this.f55355y0;
                    if (actionEditText != null) {
                        actionEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                        MessagePopupSendFeed.this.f55355y0.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
                    }
                    MessagePopupSendFeed messagePopupSendFeed = MessagePopupSendFeed.this;
                    messagePopupSendFeed.f55353w0.postDelayed(messagePopupSendFeed.f55349T0, 50L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.MessagePopupSendFeed$b */
    /* loaded from: classes5.dex */
    class RunnableC10953b implements Runnable {
        RunnableC10953b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((RelativeLayout) MessagePopupSendFeed.this.f55356z0).setGravity(80);
            MessagePopupSendFeed.this.m56919cL();
        }
    }

    /* renamed from: com.zing.zalo.ui.MessagePopupSendFeed$c */
    /* loaded from: classes5.dex */
    class RunnableC10954c implements Runnable {
        RunnableC10954c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePopupSendFeed messagePopupSendFeed = MessagePopupSendFeed.this;
            if (messagePopupSendFeed.f55350U0 != 2) {
                ViewGroup.LayoutParams layoutParams = messagePopupSendFeed.f55332C0.getLayoutParams();
                MessagePopupSendFeed messagePopupSendFeed2 = MessagePopupSendFeed.this;
                layoutParams.height = messagePopupSendFeed2.f55345P0;
                messagePopupSendFeed2.f55337H0.setPaddingBottom(0);
                MessagePopupSendFeed.this.f55337H0.requestLayout();
                ((RelativeLayout) MessagePopupSendFeed.this.f55356z0).setGravity(17);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.MessagePopupSendFeed$d */
    /* loaded from: classes5.dex */
    public class C10955d extends AbstractC31727b {
        C10955d() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            char charAt;
            try {
                ActionEditText actionEditText = MessagePopupSendFeed.this.f55355y0;
                if (actionEditText != null && (3000 - actionEditText.length()) - str.length() >= 0) {
                    StringBuilder sb2 = new StringBuilder();
                    int selectionEnd = MessagePopupSendFeed.this.f55355y0.getSelectionEnd();
                    StringBuffer stringBuffer = new StringBuffer(MessagePopupSendFeed.this.f55355y0.getText().toString());
                    if (selectionEnd == MessagePopupSendFeed.this.f55355y0.getText().length() && AbstractC23309i.m121379Rd() == 1) {
                        if (selectionEnd > 0 && (charAt = MessagePopupSendFeed.this.f55355y0.getText().toString().charAt(selectionEnd - 1)) != '\t' && charAt != '\n' && charAt != ' ') {
                            sb2.append(" ");
                            sb2.append(str);
                        }
                        if (selectionEnd == MessagePopupSendFeed.this.f55355y0.getText().length()) {
                            if (sb2.length() == 0) {
                                sb2.append(str);
                                sb2.append(" ");
                            } else {
                                sb2.append(" ");
                            }
                        }
                        if (sb2.length() > 0 && sb2.toString().trim().equals(str)) {
                            str = sb2.toString();
                        }
                        ActionEditText actionEditText2 = MessagePopupSendFeed.this.f55355y0;
                        if (actionEditText2 != null && (3000 - actionEditText2.length()) - str.length() >= 0) {
                            stringBuffer.insert(selectionEnd, str);
                            MessagePopupSendFeed.this.f55355y0.setText(stringBuffer.toString());
                            MessagePopupSendFeed.this.f55355y0.setSelection(selectionEnd + str.length());
                            return;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 3000));
                        return;
                    }
                    stringBuffer.insert(selectionEnd, str);
                    MessagePopupSendFeed.this.f55355y0.setText(stringBuffer.toString());
                    MessagePopupSendFeed.this.f55355y0.setSelection(selectionEnd + str.length());
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 3000));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            try {
                if (i11 == 0) {
                    MessagePopupSendFeed messagePopupSendFeed = MessagePopupSendFeed.this;
                    messagePopupSendFeed.f55353w0.postDelayed(messagePopupSendFeed.f55349T0, 400L);
                } else if (i11 == 1 || i11 == 3) {
                    MessagePopupSendFeed messagePopupSendFeed2 = MessagePopupSendFeed.this;
                    messagePopupSendFeed2.f55353w0.removeCallbacks(messagePopupSendFeed2.f55349T0);
                    ActionEditText actionEditText = MessagePopupSendFeed.this.f55355y0;
                    if (actionEditText != null) {
                        actionEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                        MessagePopupSendFeed.this.f55355y0.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OK */
    public void m56901OK(InterfaceC2946a1 interfaceC2946a1) {
        if (interfaceC2946a1.mo13947I().equals(interfaceC2946a1.mo13947I())) {
            this.f55343N0 = interfaceC2946a1;
            m56912wt(interfaceC2946a1);
        }
    }

    /* renamed from: QK */
    private void m56902QK(int i11) {
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142417p, 0, false, true, null, null, false, 0, C28020b3.f130648a.m141208y("STICKER_PANEL_", m92676n2()), false, 1, AbstractC16781w.indicator_bg_color, false, i11, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f55336G0 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f55336G0, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m56903RK();
        }
    }

    /* renamed from: RK */
    private void m56903RK() {
        this.f55336G0.m72709oO(new C10955d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TK */
    public /* synthetic */ void m56904TK() {
        try {
            Rect rect = new Rect();
            AppCompatImageView appCompatImageView = this.f55334E0;
            appCompatImageView.getHitRect(rect);
            rect.top -= 20;
            rect.bottom += 20;
            rect.left -= 20;
            rect.right += 20;
            TouchDelegate touchDelegate = new TouchDelegate(rect, appCompatImageView);
            if (View.class.isInstance(appCompatImageView.getParent())) {
                ((View) appCompatImageView.getParent()).setTouchDelegate(touchDelegate);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UK */
    public /* synthetic */ boolean m56905UK(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6 && i11 != 4) {
            return false;
        }
        m56918ZK();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VK */
    public /* synthetic */ void m56906VK(InterfaceC2946a1 interfaceC2946a1) {
        try {
            ViewPagerFakeDragFixed viewPagerFakeDragFixed = this.f55338I0;
            if (viewPagerFakeDragFixed != null && viewPagerFakeDragFixed.getChildCount() > 0) {
                Object tag = this.f55338I0.getChildAt(0).getTag();
                if (tag instanceof C7074g5.b) {
                    FrameLayout frameLayout = ((C7074g5.b) tag).f38674a;
                    if (frameLayout.getChildCount() > 0) {
                        View childAt = frameLayout.getChildAt(0);
                        if (childAt instanceof FeedItemMusicModuleView) {
                            ((FeedItemMusicModuleView) childAt).m43882z0(interfaceC2946a1);
                            ((FeedItemMusicModuleView) childAt).setFeedMusicCallback(null);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: WK */
    private void m56907WK() {
        m56908XK();
    }

    /* renamed from: XK */
    private void m56908XK() {
        this.f55344O0.m139983W().m9219j(this, new InterfaceC1764d0() { // from class: h40.f1
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                MessagePopupSendFeed.this.m56901OK((InterfaceC2946a1) obj);
            }
        });
    }

    /* renamed from: YK */
    private void m56909YK() {
        ArrayList arrayList;
        C3025q0 c3025q0;
        SongInfo songInfo;
        if (C20791e.f102159a.m108488d() && (arrayList = f55326X0) != null && !arrayList.isEmpty()) {
            Iterator it = f55326X0.iterator();
            while (it.hasNext()) {
                C3020p0 c3020p0 = ((FeedContentMessagePopup) it.next()).f42531p;
                if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && (songInfo = c3025q0.f12108Q) != null) {
                    this.f55344O0.m139997p0(c3020p0.f12057p, songInfo, c3020p0.f12027G);
                }
            }
        }
    }

    /* renamed from: aL */
    private void m56910aL(ZaloView zaloView, boolean z11) {
        if (zaloView != null) {
            try {
                C17487o0 m92649TI = m92649TI();
                if (z11) {
                    m92649TI.m93077o2(zaloView);
                    if (zaloView.m92656bJ() != null) {
                        zaloView.m92656bJ().bringToFront();
                    }
                } else {
                    m92649TI.m93045X0(zaloView);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: bL */
    private void m56911bL() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f55336G0 = (StickerPanelView) m92996E0;
        }
        if (this.f55336G0 != null) {
            m56903RK();
        }
    }

    /* renamed from: wt */
    private void m56912wt(final InterfaceC2946a1 interfaceC2946a1) {
        Iterator it = f55326X0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FeedContentMessagePopup feedContentMessagePopup = (FeedContentMessagePopup) it.next();
            C3020p0 c3020p0 = feedContentMessagePopup.f42531p;
            if (c3020p0 != null && c3020p0.f12057p.equals(interfaceC2946a1.mo13947I())) {
                feedContentMessagePopup.f42533r = interfaceC2946a1;
                break;
            }
        }
        this.f55353w0.post(new Runnable() { // from class: h40.g1
            @Override // java.lang.Runnable
            public final void run() {
                MessagePopupSendFeed.this.m56906VK(interfaceC2946a1);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        f55327Y0 = 0;
        this.f55353w0 = new Handler(Looper.getMainLooper());
        m56915PK();
        m56907WK();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle == null) {
            AbstractC23647d.m123906p("16100");
            AbstractC23647d.m123893c();
        }
        View inflate = layoutInflater.inflate(AbstractC7409c0.popup_send_msg_feed, (ViewGroup) null);
        m56916SK(inflate);
        if (f55326X0 == null) {
            f55326X0 = new ArrayList();
        }
        m56909YK();
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        f55329a1 = false;
        ArrayList arrayList = f55326X0;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    /* renamed from: Ka */
    public void m56913Ka(int i11) {
        this.f55350U0 = i11;
        int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
        try {
            int i12 = this.f55350U0;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        m56919cL();
                        ((RelativeLayout) this.f55356z0).setGravity(80);
                        AbstractC2379w.m12430d(this.f55355y0);
                        this.f55335F0.setImageResource(AbstractC16803z.icn_emoji_o);
                        this.f55337H0.setPaddingBottom(m122007i5);
                        this.f55337H0.requestLayout();
                        if (this.f55336G0 == null) {
                            m56902QK(m122007i5);
                        } else {
                            C23744a.m124114c().m124116d(8006, Integer.valueOf(m122007i5));
                        }
                        m56910aL(this.f55336G0, true);
                        return;
                    }
                    return;
                }
                m56919cL();
                ((RelativeLayout) this.f55356z0).setGravity(80);
                m56910aL(this.f55336G0, false);
                this.f55335F0.setImageResource(AbstractC16803z.icn_emoji);
                this.f55337H0.setPaddingBottom(m122007i5);
                this.f55337H0.requestLayout();
                AbstractC2379w.m12432f(this.f55355y0);
                return;
            }
            this.f55332C0.getLayoutParams().height = this.f55345P0;
            ((RelativeLayout) this.f55356z0).setGravity(17);
            AbstractC2379w.m12430d(this.f55355y0);
            m56910aL(this.f55336G0, false);
            this.f55335F0.setImageResource(AbstractC16803z.icn_emoji);
            this.f55337H0.setPaddingBottom(0);
            this.f55337H0.requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: NK */
    public void m56914NK() {
        AbstractC2379w.m12430d(this.f55355y0);
        ArrayList arrayList = f55326X0;
        if (arrayList != null) {
            arrayList.clear();
        }
        f55329a1 = false;
        this.f88762c0.finish();
    }

    /* renamed from: PK */
    void m56915PK() {
        this.f55344O0 = (C27353a) new C1802w0(this, new C27353a.e(this, null)).m9378a(C27353a.class);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        f55329a1 = false;
        super.mo13886RJ();
    }

    /* renamed from: SK */
    void m56916SK(View view) {
        if (f55326X0.size() <= 0) {
            m56914NK();
            return;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(AbstractC6918a0.btn_close_dialog);
        this.f55334E0 = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
        ((LinearLayout) view.findViewById(AbstractC6918a0.msgpop_top)).post(new Runnable() { // from class: h40.d1
            @Override // java.lang.Runnable
            public final void run() {
                MessagePopupSendFeed.this.m56904TK();
            }
        });
        this.f55340K0 = (RobotoTextView) view.findViewById(AbstractC6918a0.display_name);
        ActionEditText actionEditText = (ActionEditText) view.findViewById(AbstractC6918a0.chatinput_text);
        this.f55355y0 = actionEditText;
        actionEditText.setHint(" " + ((Object) this.f55355y0.getHint()));
        this.f55355y0.setMaxLines(4);
        this.f55355y0.addTextChangedListener(this);
        this.f55355y0.setOnFocusChangeListener(this);
        this.f55355y0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: h40.e1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m56905UK;
                m56905UK = MessagePopupSendFeed.this.m56905UK(textView, i11, keyEvent);
                return m56905UK;
            }
        });
        this.f55355y0.setOnClickListener(this);
        RedDotImageButton redDotImageButton = (RedDotImageButton) view.findViewById(AbstractC6918a0.imgEmoSticker);
        this.f55335F0 = redDotImageButton;
        redDotImageButton.setOnClickListener(this);
        this.f55356z0 = view.findViewById(AbstractC6918a0.layoutPopupRoot);
        View findViewById = view.findViewById(AbstractC6918a0.msgpop_top);
        this.f55330A0 = findViewById;
        findViewById.addOnLayoutChangeListener(this);
        View findViewById2 = view.findViewById(AbstractC6918a0.layoutPopupTextMode);
        this.f55331B0 = findViewById2;
        findViewById2.addOnLayoutChangeListener(this);
        View findViewById3 = view.findViewById(AbstractC6918a0.layoutPopupBody);
        this.f55332C0 = findViewById3;
        findViewById3.addOnLayoutChangeListener(this);
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) view.findViewById(AbstractC6918a0.keyboard_frame_layout);
        this.f55337H0 = keyboardFrameLayout;
        keyboardFrameLayout.setOnClickListener(this);
        this.f55337H0.setTopViewGroup(this.f55356z0);
        ArrayList<View> arrayList = new ArrayList<>();
        View findViewById4 = view.findViewById(AbstractC6918a0.sticker_panel_container);
        if (findViewById4 != null) {
            arrayList.add(findViewById4);
        }
        this.f55337H0.setBottomViewsGroup(arrayList);
        this.f55337H0.setOnKeyboardListener(this);
        ImageButton imageButton = (ImageButton) view.findViewById(AbstractC6918a0.chatinput_send);
        this.f55333D0 = imageButton;
        imageButton.setOnClickListener(this);
        m56920dL();
        ViewPagerFakeDragFixed viewPagerFakeDragFixed = (ViewPagerFakeDragFixed) view.findViewById(AbstractC6918a0.viewpager);
        this.f55338I0 = viewPagerFakeDragFixed;
        viewPagerFakeDragFixed.setDrawingCacheEnabled(true);
        this.f55338I0.setAlwaysDrawnWithCacheEnabled(true);
        this.f55338I0.setDrawingCacheQuality(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
        int color = this.f88762c0.m92651WI().getColor(AbstractC16801x.circle_indicator_active);
        this.f55342M0 = new C7074g5(getContext(), f55326X0, f55328Z0);
        if (this.f55338I0.getAdapter() == null) {
            this.f55338I0.setAdapter(this.f55342M0);
        }
        this.f55338I0.setCurrentItem(f55326X0.size() - 1);
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) view.findViewById(AbstractC6918a0.sliding_tabs);
        this.f55339J0 = slidingTabLayout;
        slidingTabLayout.setViewPager(this.f55338I0);
        this.f55339J0.setSelectedIndicatorColors(color);
        this.f55339J0.setEnableDivider(true);
        this.f55339J0.setDividerColors(0);
        try {
            ArrayList arrayList2 = f55326X0;
            if (arrayList2 != null && arrayList2.size() > 0) {
                C3020p0 c3020p0 = ((FeedContentMessagePopup) f55326X0.get(f55327Y0)).f42531p;
                ContactProfile contactProfile = new ContactProfile(c3020p0.f12022B.f12280b);
                contactProfile.f42437s = c3020p0.f12022B.f12282d;
                this.f55340K0.setText(String.format(this.f88762c0.m92652XI(AbstractC8020f0.title_popup_send_feed), contactProfile.m40385R(true, true, true)));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        f55329a1 = false;
        if (!(this.f88762c0.m92662fJ().m93012K0() instanceof MessagePopupSendFeed)) {
            m56914NK();
        }
    }

    /* renamed from: Vf */
    void m56917Vf() {
        try {
            this.f55355y0.setVisibility(0);
            this.f55355y0.requestFocus();
            this.f55341L0 = 2;
            this.f55333D0.setImageResource(AbstractC16803z.btn_send);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (this.f88762c0.m92676n2() != null && this.f88762c0.m92676n2().getWindow() != null) {
                this.f88762c0.m92676n2().mo35554O(18);
            }
            ActionEditText actionEditText = this.f55355y0;
            if (actionEditText != null) {
                actionEditText.requestFocus();
            }
        }
    }

    /* renamed from: ZK */
    void m56918ZK() {
        String str;
        ArrayList arrayList;
        try {
            ActionEditText actionEditText = this.f55355y0;
            if (actionEditText != null) {
                str = actionEditText.getText().toString().trim();
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str) && (arrayList = f55326X0) != null && !arrayList.isEmpty()) {
                FeedContentMessagePopup feedContentMessagePopup = (FeedContentMessagePopup) f55326X0.get(f55327Y0);
                String str2 = feedContentMessagePopup.f42531p.f12022B.f12280b;
                ContactProfile m141816n = C28203u6.f131407a.m141816n(str2, null);
                if (TextUtils.isEmpty(m141816n.f42437s) || TextUtils.isEmpty(m141816n.f42446v)) {
                    C3047v0 c3047v0 = feedContentMessagePopup.f42531p.f12022B;
                    m141816n.f42437s = c3047v0.f12282d;
                    m141816n.f42446v = c3047v0.f12283e;
                }
                AbstractC23112j7.m118540l0(m141816n.f42434r, str, feedContentMessagePopup.f42531p);
                C28023b6.m141250h0().m141293J(str2);
                m56914NK();
                m141816n.f42437s = feedContentMessagePopup.f42531p.f12022B.f12282d;
                ToastUtils.showMess(true, String.format(this.f88762c0.m92652XI(AbstractC8020f0.str_sent_message_success_to), m141816n.m40385R(true, true, true)));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        try {
            String trim = this.f55355y0.getText().toString().trim();
            if (trim.length() > 3000) {
                this.f55355y0.setText(trim.substring(0, 3000));
                this.f55355y0.setSelection(3000);
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 3000));
            }
            C28652r.m143349v().m143362X(editable, this.f55355y0.getTextSize());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    /* renamed from: cL */
    void m56919cL() {
        if (this.f55348S0 == -1) {
            this.f55348S0 = this.f55346Q0 + this.f55345P0 + this.f55347R0;
        }
        int m118719j0 = (AbstractC23136l9.m118719j0(this.f88762c0.getContext()) - AbstractC23309i.m122007i5(this.f88762c0.getContext())) - AbstractC32226c.m155405d(this.f88762c0.m92676n2());
        if (this.f55348S0 > m118719j0) {
            this.f55332C0.getLayoutParams().height = this.f55345P0 - (this.f55348S0 - m118719j0);
            this.f55332C0.requestLayout();
        }
    }

    /* renamed from: dL */
    void m56920dL() {
        if (this.f55355y0 != null) {
            try {
                int i11 = this.f55341L0;
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f55333D0.setImageResource(AbstractC16803z.btn_send);
                    }
                } else {
                    this.f55333D0.setImageResource(AbstractC16803z.btn_send_disable);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: oi */
    void m56921oi() {
        try {
            this.f55355y0.setVisibility(0);
            this.f55355y0.requestFocus();
            this.f55341L0 = 1;
            this.f55333D0.setImageResource(AbstractC16803z.btn_send_disable);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_close_dialog) {
            AbstractC23647d.m123897g("49140001");
            m56914NK();
            return;
        }
        if (id2 == AbstractC6918a0.chatinput_text) {
            if (!this.f55354x0) {
                m56913Ka(1);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.imgEmoSticker) {
            if (this.f55350U0 == 2 && !this.f55354x0) {
                m56913Ka(1);
                return;
            } else {
                m56913Ka(2);
                return;
            }
        }
        if (id2 == AbstractC6918a0.keyboard_frame_layout) {
            m56914NK();
            return;
        }
        if (id2 == AbstractC6918a0.chatinput_send) {
            try {
                AbstractC23647d.m123907q("16300", "");
                if (this.f55341L0 == 2) {
                    m56918ZK();
                }
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z11) {
        if (z11) {
            if (!this.f55354x0) {
                m56913Ka(1);
            }
        } else if (f55329a1) {
            m56913Ka(this.f55350U0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            StickerPanelView stickerPanelView = this.f55336G0;
            if (stickerPanelView != null && !stickerPanelView.m92679oJ()) {
                m56913Ka(0);
                return true;
            }
            m56914NK();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.msgpop_top) {
            if (this.f55346Q0 == -1) {
                this.f55346Q0 = this.f55330A0.getHeight();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.layoutPopupTextMode) {
            if (this.f55347R0 == -1) {
                this.f55347R0 = this.f55331B0.getHeight();
            }
            if (this.f55347R0 != this.f55331B0.getHeight()) {
                this.f55347R0 = this.f55331B0.getHeight();
                int height = this.f55332C0.getHeight();
                this.f55345P0 = height;
                this.f55348S0 = this.f55346Q0 + height + this.f55347R0;
                m56919cL();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.layoutPopupBody && this.f55345P0 == -1) {
            this.f55345P0 = this.f55332C0.getHeight();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        f55329a1 = true;
        super.onResume();
        ArrayList arrayList = f55326X0;
        if (arrayList != null && arrayList.size() > 0) {
            this.f55342M0.m36109w(f55326X0);
            this.f55338I0.setAdapter(this.f55342M0);
            this.f55338I0.setCurrentItem(f55327Y0);
            this.f55339J0.m75891d();
            this.f55339J0.getTabStrip().m75896b(0);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        if (TextUtils.isEmpty(charSequence)) {
            m56921oi();
            return;
        }
        m56917Vf();
        if (charSequence.length() > 3000) {
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 3000));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null) {
            m56911bL();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: y1 */
    public void mo37136y1(int i11) {
        try {
            this.f55354x0 = false;
            this.f55353w0.post(this.f55352W0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: z3 */
    public void mo37138z3(int i11) {
        this.f55354x0 = true;
        this.f55353w0.post(this.f55351V0);
    }
}
