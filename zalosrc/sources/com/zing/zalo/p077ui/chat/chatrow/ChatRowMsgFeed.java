package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.InterfaceC2946a1;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.feed.components.FeedItemBase;
import com.zing.zalo.feed.components.FeedItemLinkModulesView;
import com.zing.zalo.feed.components.FeedItemMemory;
import com.zing.zalo.feed.components.FeedItemPhotoModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.components.FeedItemStickerModulesView;
import com.zing.zalo.feed.components.FeedItemTextModuleView;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16719g;
import dj.C17945a0;
import is.AbstractC20826v0;
import is.C20791e;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p399op.C24390b;
import p509sp.C26361j;
import vg.C28100j3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowMsgFeed extends ChatRowHasCaption implements InterfaceC10867f {

    /* renamed from: b8 */
    public static final int f58119b8 = AbstractC23136l9.m118742r(40.0f);

    /* renamed from: B7 */
    private C3000l0 f58120B7;

    /* renamed from: C7 */
    C3020p0 f58121C7;

    /* renamed from: D7 */
    private final int f58122D7;

    /* renamed from: E7 */
    private View f58123E7;

    /* renamed from: F7 */
    private final ViewGroup f58124F7;

    /* renamed from: G7 */
    private FeedItemTextModuleView f58125G7;

    /* renamed from: H7 */
    private FeedItemStickerModulesView f58126H7;

    /* renamed from: I7 */
    private FeedItemPhotoModuleView f58127I7;

    /* renamed from: J7 */
    private FeedItemPhotoMultiModuleView f58128J7;

    /* renamed from: K7 */
    private FeedItemLinkModulesView f58129K7;

    /* renamed from: L7 */
    private FeedItemVideo f58130L7;

    /* renamed from: M7 */
    private FeedItemMemory f58131M7;

    /* renamed from: N7 */
    private final InterfaceC2259a f58132N7;

    /* renamed from: O7 */
    private final InterfaceC10867f f58133O7;

    /* renamed from: P7 */
    int f58134P7;

    /* renamed from: Q7 */
    int f58135Q7;

    /* renamed from: R7 */
    int f58136R7;

    /* renamed from: S7 */
    int f58137S7;

    /* renamed from: T7 */
    int f58138T7;

    /* renamed from: U7 */
    int f58139U7;

    /* renamed from: V7 */
    View.OnClickListener f58140V7;

    /* renamed from: W7 */
    C16719g.c f58141W7;

    /* renamed from: X7 */
    View.OnClickListener f58142X7;

    /* renamed from: Y7 */
    C16719g.c f58143Y7;

    /* renamed from: Z7 */
    View.OnLayoutChangeListener f58144Z7;

    /* renamed from: a8 */
    private final View.OnLongClickListener f58145a8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowMsgFeed$a */
    /* loaded from: classes5.dex */
    public class ViewOnClickListenerC11375a implements View.OnClickListener {
        ViewOnClickListenerC11375a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                ChatRowMsgFeed chatRowMsgFeed = ChatRowMsgFeed.this;
                if (chatRowMsgFeed.f58121C7 != null) {
                    InterfaceC11530v delegate = chatRowMsgFeed.getDelegate();
                    ChatRowMsgFeed chatRowMsgFeed2 = ChatRowMsgFeed.this;
                    delegate.mo62093m4(chatRowMsgFeed2.f58121C7, chatRowMsgFeed2.m61471I4());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowMsgFeed$b */
    /* loaded from: classes5.dex */
    public class C11376b implements C16719g.c {
        C11376b() {
        }

        @Override // com.zing.zalo.uidrawing.C16719g.c
        /* renamed from: y */
        public void mo929y(C16719g c16719g) {
            try {
                ChatRowMsgFeed chatRowMsgFeed = ChatRowMsgFeed.this;
                if (chatRowMsgFeed.f58121C7 != null) {
                    InterfaceC11530v delegate = chatRowMsgFeed.getDelegate();
                    ChatRowMsgFeed chatRowMsgFeed2 = ChatRowMsgFeed.this;
                    delegate.mo62093m4(chatRowMsgFeed2.f58121C7, chatRowMsgFeed2.m61471I4());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowMsgFeed$c */
    /* loaded from: classes5.dex */
    public class ViewOnClickListenerC11377c implements View.OnClickListener {
        ViewOnClickListenerC11377c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                ChatRowMsgFeed chatRowMsgFeed = ChatRowMsgFeed.this;
                if (chatRowMsgFeed.f58121C7 != null) {
                    chatRowMsgFeed.getDelegate().mo62033B4(ChatRowMsgFeed.this.f58121C7.m14465A());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowMsgFeed$d */
    /* loaded from: classes5.dex */
    public class C11378d implements C16719g.c {
        C11378d() {
        }

        @Override // com.zing.zalo.uidrawing.C16719g.c
        /* renamed from: y */
        public void mo929y(C16719g c16719g) {
            try {
                ChatRowMsgFeed chatRowMsgFeed = ChatRowMsgFeed.this;
                if (chatRowMsgFeed.f58121C7 != null) {
                    chatRowMsgFeed.getDelegate().mo62033B4(ChatRowMsgFeed.this.f58121C7.m14465A());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ChatRowMsgFeed(Context context) {
        super(context);
        this.f58122D7 = 0;
        this.f58132N7 = null;
        this.f58133O7 = this;
        this.f58140V7 = new ViewOnClickListenerC11375a();
        this.f58141W7 = new C11376b();
        this.f58142X7 = new ViewOnClickListenerC11377c();
        this.f58143Y7 = new C11378d();
        ViewOnLongClickListenerC11495l0 viewOnLongClickListenerC11495l0 = new View.OnLongClickListener() { // from class: com.zing.zalo.ui.chat.chatrow.l0
            public /* synthetic */ ViewOnLongClickListenerC11495l0() {
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m61468K4;
                m61468K4 = ChatRowMsgFeed.this.m61468K4(view);
                return m61468K4;
            }
        };
        this.f58145a8 = viewOnLongClickListenerC11495l0;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f58124F7 = frameLayout;
        addView(frameLayout);
        frameLayout.setOnLongClickListener(viewOnLongClickListenerC11495l0);
    }

    /* renamed from: A4 */
    private void m61459A4(View view) {
        this.f58124F7.addView(view, new ViewGroup.LayoutParams(-1, -1));
        View view2 = new View(getContext());
        this.f58123E7 = view2;
        view2.setOnClickListener(this.f58140V7);
        this.f58123E7.setOnLongClickListener(this.f58145a8);
        int m118659K = AbstractC23136l9.m118659K(AbstractC16802y.ava1) + (AbstractC23136l9.m118659K(AbstractC16802y.chat_feed_avatar_margin) * 2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 48;
        layoutParams.setMargins(0, m118659K, 0, 0);
        this.f58124F7.addView(this.f58123E7, layoutParams);
    }

    /* renamed from: B4 */
    private void m61460B4() {
        try {
            if (this.f58129K7 == null) {
                FeedItemLinkModulesView feedItemLinkModulesView = new FeedItemLinkModulesView(getContext());
                this.f58129K7 = feedItemLinkModulesView;
                feedItemLinkModulesView.mo43705j0(getContext(), 6);
                m61459A4(this.f58129K7);
            }
            this.f58129K7.m43696Y(this.f58120B7, 0, getDelegate().mo62075b(), this.f58132N7, this.f58133O7);
            this.f58129K7.m43697a0(this.f58120B7);
            this.f58129K7.m43800B0(this.f58120B7, 0, getContext(), getDelegate().mo62075b(), this.f58132N7, this.f58133O7);
            this.f58129K7.setOnProfileClickListener(this.f58143Y7);
            this.f58129K7.setOpenFeedDetailListener(this.f58140V7);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C4 */
    private void m61461C4() {
        try {
            if (this.f58131M7 == null) {
                FeedItemMemory feedItemMemory = new FeedItemMemory(getContext());
                this.f58131M7 = feedItemMemory;
                feedItemMemory.mo43688p(getContext(), 6);
                m61459A4(this.f58131M7);
            }
            this.f58131M7.setChatRowMsgFeedWidth(getBubbleMaxWidth());
            FeedItemBase.m43679x(this.f58131M7, this.f58120B7);
            this.f58131M7.setFeedCallback(this.f58132N7);
            FeedItemBase.m43657B(this.f58131M7, this.f58120B7, 0, getDelegate().mo62075b(), this.f58133O7);
            FeedItemBase.m43658C(this.f58131M7, this.f58120B7);
            FeedItemBase.m43660F(this.f58131M7, this.f58120B7, 0, getContext(), this.f58132N7, this.f58133O7, false, null);
            this.f58131M7.m43837W(this.f58121C7, getDelegate().mo62075b());
            FeedItemBase.m43664J(this.f58131M7, this.f58142X7);
            FeedItemBase.m43661G(this.f58131M7, this.f58140V7);
            if (this.f58144Z7 == null) {
                this.f58144Z7 = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.chat.chatrow.k0
                    public /* synthetic */ ViewOnLayoutChangeListenerC11491k0() {
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                        ChatRowMsgFeed.this.m61467J4(view, i11, i12, i13, i14, i15, i16, i17, i18);
                    }
                };
            }
            this.f58131M7.setZinstantLayoutChangedListener(this.f58144Z7);
            this.f58136R7 = this.f58131M7.getZinstantLayoutHeight();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D4 */
    private void m61462D4(int i11) {
        InterfaceC2946a1 interfaceC2946a1;
        try {
            if (this.f58128J7 == null) {
                FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView = new FeedItemPhotoMultiModuleView(getContext());
                this.f58128J7 = feedItemPhotoMultiModuleView;
                feedItemPhotoMultiModuleView.mo43705j0(getContext(), 6);
                m61459A4(this.f58128J7);
            }
            this.f58128J7.m43696Y(this.f58120B7, 0, getDelegate().mo62075b(), this.f58132N7, this.f58133O7);
            this.f58128J7.m43697a0(this.f58120B7);
            this.f58128J7.mo43698b0(this.f58120B7, 0, getContext(), this.f58132N7, this.f58133O7, false, null, getDelegate().mo62075b());
            this.f58128J7.m43983g1(this.f58120B7, 0, null, getDelegate().mo62075b(), 0, 0, null, this.f58132N7, i11);
            this.f58128J7.setOnProfileClickListener(this.f58143Y7);
            this.f58128J7.setOpenFeedDetailListener(this.f58140V7);
            if (C20791e.f102159a.m108488d() && C26361j.f125215a.m135700f(this.f58120B7)) {
                interfaceC2946a1 = C24390b.f117764a.m127571b(this.f58120B7.m14322a0().f12057p, this.f58120B7.m14322a0().f12023C.f12108Q, false);
            } else {
                interfaceC2946a1 = null;
            }
            this.f58128J7.m43882z0(interfaceC2946a1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E4 */
    private void m61463E4() {
        InterfaceC2946a1 interfaceC2946a1;
        try {
            if (this.f58127I7 == null) {
                FeedItemPhotoModuleView feedItemPhotoModuleView = new FeedItemPhotoModuleView(getContext());
                this.f58127I7 = feedItemPhotoModuleView;
                feedItemPhotoModuleView.mo43705j0(getContext(), 6);
                m61459A4(this.f58127I7);
            }
            this.f58127I7.m43696Y(this.f58120B7, 0, getDelegate().mo62075b(), this.f58132N7, this.f58133O7);
            this.f58127I7.m43697a0(this.f58120B7);
            this.f58127I7.mo43698b0(this.f58120B7, 0, getContext(), this.f58132N7, this.f58133O7, false, null, getDelegate().mo62075b());
            this.f58127I7.m43936W0(this.f58120B7, 0, 0, null, getDelegate().mo62075b(), null, this.f58132N7);
            this.f58127I7.setOnProfileClickListener(this.f58143Y7);
            this.f58127I7.setOnGroupPhotoClickListener(this.f58141W7);
            this.f58127I7.setOpenFeedDetailListener(this.f58140V7);
            if (C20791e.f102159a.m108488d() && C26361j.f125215a.m135700f(this.f58120B7)) {
                interfaceC2946a1 = C24390b.f117764a.m127571b(this.f58120B7.m14322a0().f12057p, this.f58120B7.m14322a0().f12023C.f12108Q, false);
            } else {
                interfaceC2946a1 = null;
            }
            this.f58127I7.m43882z0(interfaceC2946a1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F4 */
    private void m61464F4() {
        try {
            if (this.f58126H7 == null) {
                FeedItemStickerModulesView feedItemStickerModulesView = new FeedItemStickerModulesView(getContext());
                this.f58126H7 = feedItemStickerModulesView;
                feedItemStickerModulesView.mo43705j0(getContext(), 6);
                m61459A4(this.f58126H7);
            }
            this.f58126H7.m43696Y(this.f58120B7, 0, getDelegate().mo62075b(), this.f58132N7, this.f58133O7);
            this.f58126H7.m43697a0(this.f58120B7);
            this.f58126H7.mo43698b0(this.f58120B7, 0, getContext(), this.f58132N7, this.f58133O7, false, null, getDelegate().mo62075b());
            this.f58126H7.m44092o0(this.f58120B7, 0, getDelegate().mo62075b(), this.f58132N7, "CHAT_MSG_FEED_");
            this.f58126H7.setOnProfileClickListener(this.f58143Y7);
            this.f58126H7.setOpenFeedDetailListener(this.f58140V7);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: G4 */
    private void m61465G4() {
        try {
            if (this.f58125G7 == null) {
                FeedItemTextModuleView feedItemTextModuleView = new FeedItemTextModuleView(getContext());
                this.f58125G7 = feedItemTextModuleView;
                feedItemTextModuleView.mo43705j0(getContext(), 6);
                m61459A4(this.f58125G7);
            }
            this.f58125G7.m43696Y(this.f58120B7, 0, getDelegate().mo62075b(), this.f58132N7, this.f58133O7);
            this.f58125G7.m43697a0(this.f58120B7);
            this.f58125G7.mo43698b0(this.f58120B7, 0, getContext(), this.f58132N7, this.f58133O7, false, null, getDelegate().mo62075b());
            this.f58125G7.setOnProfileClickListener(this.f58143Y7);
            this.f58125G7.setOpenFeedDetailListener(this.f58140V7);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: H4 */
    private void m61466H4() {
        try {
            if (this.f58130L7 == null) {
                FeedItemVideo feedItemVideo = new FeedItemVideo(getContext());
                this.f58130L7 = feedItemVideo;
                feedItemVideo.mo43688p(getContext(), 6);
                m61459A4(this.f58130L7);
            }
            FeedItemBase.m43679x(this.f58130L7, this.f58120B7);
            FeedItemBase.m43657B(this.f58130L7, this.f58120B7, 0, getDelegate().mo62075b(), this.f58133O7);
            FeedItemBase.m43658C(this.f58130L7, this.f58120B7);
            FeedItemBase.m43660F(this.f58130L7, this.f58120B7, 0, getContext(), this.f58132N7, this.f58133O7, false, null);
            this.f58130L7.mo43897w0(this.f58120B7, 0, getDelegate().mo62075b(), getContext(), this.f58133O7, this.f58132N7);
            FeedItemBase.m43664J(this.f58130L7, this.f58142X7);
            FeedItemBase.m43666L(this.f58130L7, this.f58140V7);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J4 */
    public /* synthetic */ void m61467J4(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        FeedItemMemory feedItemMemory = this.f58131M7;
        if (feedItemMemory != null && this.f58136R7 != feedItemMemory.getZinstantLayoutHeight()) {
            m61119v3(false);
        }
    }

    /* renamed from: K4 */
    public /* synthetic */ boolean m61468K4(View view) {
        getDelegate().mo62090j4(view, null);
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        ViewGroup viewGroup = this.f58124F7;
        int i13 = 0;
        if (viewGroup != null) {
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f58135Q7 = this.f58124F7.getMeasuredWidth();
            this.f58134P7 = this.f58124F7.getMeasuredHeight();
            this.f58124F7.getLayoutParams().width = this.f58124F7.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = this.f58124F7.getLayoutParams();
            i13 = this.f58134P7;
            layoutParams.height = i13;
        }
        if (mo61163l4()) {
            i13 += getTextHeight() + ChatRow.f57201L5;
        }
        c28227x3.f131649b = i13;
        c28227x3.f131648a = i12;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        C3020p0 c3020p0;
        super.mo60953C3(c17945a0, c28769a, z11);
        try {
            C3000l0 m95205n3 = c17945a0.m95205n3();
            this.f58120B7 = m95205n3;
            if (m95205n3 != null) {
                c3020p0 = m95205n3.m14322a0();
            } else {
                c3020p0 = null;
            }
            this.f58121C7 = c3020p0;
            C3000l0 c3000l0 = this.f58120B7;
            if (c3000l0 != null && c3020p0 != null) {
                c3020p0.f12067z = AbstractC20826v0.m108771M(c3000l0.m14322a0().f12058q);
                return;
            }
            throw new IllegalArgumentException("Feed item is null");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.social.controls.InterfaceC10867f
    /* renamed from: Fj */
    public void mo43564Fj(String str, double d11, double d12) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        try {
            int i12 = this.f58121C7.f12058q;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 6) {
                            if (i12 != 7) {
                                if (i12 != 17) {
                                    if (i12 != 22) {
                                        if (i12 != 24) {
                                            AbstractC23350e.m122774d("ChatRowFeed", "Unsupported feed type: " + this.f58120B7.m14322a0().f12058q);
                                        }
                                    } else {
                                        m61461C4();
                                    }
                                } else {
                                    m61466H4();
                                }
                            }
                            m61460B4();
                        } else {
                            m61464F4();
                        }
                    } else {
                        m61462D4(i11);
                    }
                } else {
                    m61463E4();
                }
            } else {
                m61465G4();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: I4 */
    boolean m61471I4() {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.m95208n8()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return mo61163l4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: M */
    public boolean mo60989M(C17945a0 c17945a0, C28769a c28769a) {
        if (m61471I4() && super.mo60989M(c17945a0, c28769a)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Q */
    public boolean mo61007Q(boolean z11, boolean z12) {
        if (m61471I4() && super.mo61007Q(z11, z12)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: S0 */
    public int mo61017S0(int i11, int i12, int i13, boolean z11) {
        if (!m61471I4()) {
            return ((i11 + i12) - i13) / 2;
        }
        return super.mo61017S0(i11, i12, i13, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: S1 */
    public boolean mo61018S1(C17945a0 c17945a0, C28769a c28769a) {
        if (m61471I4() && super.mo61018S1(c17945a0, c28769a)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: T */
    public boolean mo61021T(C28769a c28769a) {
        if (m61471I4() && super.mo61021T(c28769a)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y */
    public boolean mo61034Y(boolean z11, int i11) {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: b4 */
    protected boolean mo61424b4() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        if (mo61163l4()) {
            this.f58139U7 = this.f58134P7 + i12;
            this.f58138T7 = getBubblePaddingLeft() + i11;
            this.f58137S7 = this.f58139U7 + ChatRow.f57201L5;
        }
        ViewGroup viewGroup = this.f58124F7;
        if (viewGroup != null) {
            viewGroup.layout(i11, i12, i13, this.f58134P7 + i12);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        if (m61471I4()) {
            return super.getBubbleMaxWidth();
        }
        return AbstractC23136l9.m118681V() - (f58119b8 * 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58138T7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58137S7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        return super.mo61075j3(motionEvent, i11, f11, f12);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        if (m61471I4()) {
            return c17945a0.m95019U3();
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowBase
    public void setPositionTag(int i11) {
        super.setPositionTag(i11);
        ViewGroup viewGroup = this.f58124F7;
        if (viewGroup != null) {
            viewGroup.setTag(Integer.valueOf(i11));
        }
        View view = this.f58123E7;
        if (view != null) {
            view.setTag(Integer.valueOf(i11));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        if (mo61163l4()) {
            canvas.drawLine(this.f57530u0 + getBubblePaddingLeft(), this.f58139U7, this.f57536v0 - getBubblePaddingRight(), this.f58139U7, ChatRow.f57255z5);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58135Q7 = 0;
        this.f58134P7 = 0;
    }

    @Override // com.zing.zalo.social.controls.InterfaceC10867f
    /* renamed from: wo */
    public void mo43565wo(C10866e c10866e, String str) {
        try {
            if (this.f58121C7 != null) {
                getDelegate().mo62033B4(this.f58121C7.m14465A());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.social.controls.InterfaceC10861a
    /* renamed from: yf */
    public void mo43566yf(C28100j3 c28100j3) {
    }
}
