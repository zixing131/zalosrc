package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import bo.AbstractC2959d;
import bo.C2954c;
import bo.C2969f;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.FeedItemSocialAlbumVideo;
import com.zing.zalo.p077ui.widget.DumpChatImageView;
import com.zing.zalo.upload.video.C16727a;
import com.zing.zalo.videoplayer.VideoThumbnailView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.VideoController;
import com.zing.zalo.zmedia.view.ViewOnClickListenerC17374o;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zview.animation.AnimationTarget;
import fn0.AbstractC19074t;
import hf0.AbstractC20049k;
import hf0.C20040b;
import ho0.AbstractC20110a;
import is.AbstractC20809n;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.C23278z2;
import p227i3.C20218v;
import p348mi.C23307g;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import vg.C28075g8;
import vg.C28227x3;

/* loaded from: classes4.dex */
public final class FeedItemSocialAlbumVideo extends RelativeLayout implements C20040b.c, AnimationTarget {

    /* renamed from: A */
    private boolean f44671A;

    /* renamed from: B */
    private View.OnClickListener f44672B;

    /* renamed from: C */
    private View.OnClickListener f44673C;

    /* renamed from: p */
    public ZVideoView f44674p;

    /* renamed from: q */
    public DumpChatImageView f44675q;

    /* renamed from: r */
    public VideoThumbnailView f44676r;

    /* renamed from: s */
    public View f44677s;

    /* renamed from: t */
    private C17391z f44678t;

    /* renamed from: u */
    private int f44679u;

    /* renamed from: v */
    private C3020p0 f44680v;

    /* renamed from: w */
    private Handler f44681w;

    /* renamed from: x */
    private int f44682x;

    /* renamed from: y */
    private int f44683y;

    /* renamed from: z */
    private boolean f44684z;

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumVideo$a */
    /* loaded from: classes4.dex */
    public static final class ViewOnClickListenerC8130a implements View.OnClickListener {
        ViewOnClickListenerC8130a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener mVideoViewListener;
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            if (FeedItemSocialAlbumVideo.this.m44070r() && (mVideoViewListener = FeedItemSocialAlbumVideo.this.getMVideoViewListener()) != null) {
                mVideoViewListener.onClick(view);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumVideo$b */
    /* loaded from: classes4.dex */
    public static final class C8131b extends C23999j {
        C8131b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            if (c3979l != null) {
                try {
                    FeedItemSocialAlbumVideo.this.getMVideoView().setLoadingViewImageInfo(c3979l);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumVideo$c */
    /* loaded from: classes4.dex */
    public static final class C8132c implements ZVideoView.InterfaceC17345q {
        C8132c() {
        }

        @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
        /* renamed from: D */
        public void mo44076D(int i11) {
            if (i11 == 0 || i11 == 5 || i11 == 6) {
                FeedItemSocialAlbumVideo.this.getMVideoView().m92421n0(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumVideo$d */
    /* loaded from: classes4.dex */
    public static final class C8133d implements IMediaPlayer.OnCompletionListener {
        C8133d() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
        public void onVideoCompletion(IMediaPlayer iMediaPlayer) {
            String str;
            try {
                VideoController videoController = FeedItemSocialAlbumVideo.this.getMVideoView().getVideoController();
                if (videoController != null) {
                    videoController.m92303b0();
                }
                FeedItemSocialAlbumVideo.this.getMVideoView().m92421n0(true);
                VideoController videoController2 = FeedItemSocialAlbumVideo.this.getMVideoView().getVideoController();
                if (videoController2 != null) {
                    videoController2.m92305g();
                }
                C17391z mVideo = FeedItemSocialAlbumVideo.this.getMVideo();
                if (mVideo != null) {
                    str = mVideo.f88618a;
                } else {
                    str = null;
                }
                AbstractC20049k.m104118l(str, 1);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumVideo$e */
    /* loaded from: classes4.dex */
    public static final class C8134e implements IMediaPlayer.OnInfoListener {
        C8134e() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
            if (iMediaPlayer != null && i11 == 3) {
                FeedItemSocialAlbumVideo.this.getMVideoView().setVolume(0.0f);
                VideoController videoController = FeedItemSocialAlbumVideo.this.getMVideoView().getVideoController();
                if (videoController != null) {
                    videoController.m92305g();
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumVideo$f */
    /* loaded from: classes4.dex */
    public static final class C8135f implements C16727a.c {

        /* renamed from: b */
        final /* synthetic */ C23528a f44691b;

        C8135f(C23528a c23528a) {
            this.f44691b = c23528a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m44078c(FeedItemSocialAlbumVideo feedItemSocialAlbumVideo, C23528a c23528a) {
            AbstractC19074t.m100208f(feedItemSocialAlbumVideo, "this$0");
            AbstractC19074t.m100208f(c23528a, "$aQuery");
            feedItemSocialAlbumVideo.m44056b(c23528a);
        }

        @Override // com.zing.zalo.upload.video.C16727a.c
        /* renamed from: a */
        public void mo44079a(boolean z11) {
            if (z11) {
                final FeedItemSocialAlbumVideo feedItemSocialAlbumVideo = FeedItemSocialAlbumVideo.this;
                final C23528a c23528a = this.f44691b;
                feedItemSocialAlbumVideo.post(new Runnable() { // from class: com.zing.zalo.feed.components.z3
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedItemSocialAlbumVideo.C8135f.m44078c(FeedItemSocialAlbumVideo.this, c23528a);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumVideo$g */
    /* loaded from: classes4.dex */
    public static final class ViewOnClickListenerC8136g implements View.OnClickListener {
        ViewOnClickListenerC8136g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener mVideoViewListener;
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            if (FeedItemSocialAlbumVideo.this.m44070r() && (mVideoViewListener = FeedItemSocialAlbumVideo.this.getMVideoViewListener()) != null) {
                mVideoViewListener.onClick(view);
            }
        }
    }

    public FeedItemSocialAlbumVideo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44671A = true;
        this.f44672B = new ViewOnClickListenerC8136g();
    }

    /* renamed from: v */
    private final void m44052v() {
        Handler handler = this.f44681w;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.zing.zalo.feed.components.y3
                @Override // java.lang.Runnable
                public final void run() {
                    FeedItemSocialAlbumVideo.m44053w(FeedItemSocialAlbumVideo.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m44053w(FeedItemSocialAlbumVideo feedItemSocialAlbumVideo) {
        AbstractC19074t.m100208f(feedItemSocialAlbumVideo, "this$0");
        try {
            C17391z c17391z = feedItemSocialAlbumVideo.f44678t;
            if (c17391z != null) {
                c17391z.f88629l = 1;
            }
            feedItemSocialAlbumVideo.getMVideoView().setZVideo(feedItemSocialAlbumVideo.f44678t);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: A */
    public final void m44054A() {
        RecyclingImageView loadingView = getMVideoView().getLoadingView();
        if (loadingView != null) {
            loadingView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        RecyclingImageView loadingView2 = getMVideoView().getLoadingView();
        if (loadingView2 != null) {
            loadingView2.setImageDrawable(AbstractC23170p.m119358p(getContext()));
        }
    }

    /* renamed from: B */
    public final void m44055B(C3000l0 c3000l0, int i11, C23528a c23528a) {
        C3020p0 m14324b0;
        AbstractC19074t.m100208f(c23528a, "aQuery");
        if (c3000l0 != null) {
            try {
                m14324b0 = c3000l0.m14324b0(i11);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return;
            }
        } else {
            m14324b0 = null;
        }
        this.f44680v = m14324b0;
        if (m14324b0 == null) {
            return;
        }
        C16727a.m89188i().m89195g(c3000l0, this.f44680v, new C8135f(c23528a));
        m44056b(c23528a);
    }

    /* renamed from: b */
    public final void m44056b(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "aQuery");
        int i11 = this.f44679u;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 == 4) {
                        m44057c(c23528a);
                        return;
                    }
                    return;
                }
                m44059e(c23528a);
                return;
            }
            m44062i(c23528a);
            return;
        }
        m44061g(c23528a);
    }

    /* renamed from: c */
    public final void m44057c(C23528a c23528a) {
        String str;
        AbstractC19074t.m100208f(c23528a, "aQuery");
        C17391z m44063j = m44063j();
        this.f44678t = m44063j;
        if (m44063j == null) {
            return;
        }
        if (m44063j != null) {
            str = m44063j.f88622e;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        setLayoutParamsVideoView(getPhotoInfo());
        m44054A();
        m44072u(str, c23528a);
        m44052v();
        m44075z();
    }

    @Override // hf0.C20040b.c
    /* renamed from: d */
    public void mo44058d(int i11, int i12) {
    }

    /* renamed from: e */
    public final void m44059e(C23528a c23528a) {
        String str;
        AbstractC19074t.m100208f(c23528a, "aQuery");
        C17391z m44063j = m44063j();
        this.f44678t = m44063j;
        if (m44063j == null) {
            return;
        }
        if (m44063j != null) {
            str = m44063j.f88622e;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        getMVideoThumbnailView().setRatio(1.0f);
        m44071s(str, c23528a);
        boolean z11 = true;
        getMVideoThumbnailView().setDrawPlayIcon(true);
        if (m44070r()) {
            C3020p0 c3020p0 = this.f44680v;
            if (c3020p0 == null || !c3020p0.f12027G) {
                z11 = false;
            }
            setVisibilityVideoProcessing(z11);
            return;
        }
        setVisibilityVideoProcessing(false);
    }

    @Override // hf0.C20040b.c
    /* renamed from: f */
    public boolean mo44060f() {
        C17391z c17391z;
        try {
            if ((getLayoutMode() == 0 || getLayoutMode() == 4) && (c17391z = this.f44678t) != null) {
                AbstractC19074t.m100205c(c17391z);
                if (c17391z.m92539d(ZMediaPlayerSettings.getVideoConfig(1))) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: g */
    public final void m44061g(C23528a c23528a) {
        String str;
        AbstractC19074t.m100208f(c23528a, "aQuery");
        C17391z m44063j = m44063j();
        this.f44678t = m44063j;
        if (m44063j == null) {
            return;
        }
        if (m44063j != null) {
            str = m44063j.f88622e;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        setLayoutParamsVideoView(getPhotoInfo());
        m44054A();
        m44072u(str, c23528a);
        m44052v();
        m44075z();
        boolean z11 = false;
        if (m44070r()) {
            C3020p0 c3020p0 = this.f44680v;
            if (c3020p0 != null && c3020p0.f12027G) {
                z11 = true;
            }
            setVisibilityVideoProcessing(z11);
            return;
        }
        setVisibilityVideoProcessing(false);
    }

    public final ArrayList<C2954c> getAlbumItemsList() {
        C3025q0 c3025q0;
        C3020p0 c3020p0 = this.f44680v;
        if (c3020p0 != null) {
            c3025q0 = c3020p0.f12023C;
        } else {
            c3025q0 = null;
        }
        if (c3025q0 != null) {
            return c3025q0.f12107P;
        }
        return new ArrayList<>();
    }

    public final C2954c getAlbumVideo() {
        ArrayList<C2954c> albumItemsList = getAlbumItemsList();
        if (albumItemsList != null && albumItemsList.size() == 1) {
            return albumItemsList.get(0);
        }
        return null;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        return getVideoCoords();
    }

    @Override // hf0.C20040b.c
    public int getDataPosition() {
        Object tag = getTag(AbstractC6918a0.id_video_data_index);
        if (tag != null && (tag instanceof Integer)) {
            return ((Number) tag).intValue();
        }
        return -1;
    }

    public final int getMAvailableHeight() {
        return this.f44683y;
    }

    public final int getMAvailableWidth() {
        return this.f44682x;
    }

    public final DumpChatImageView getMDumpView() {
        DumpChatImageView dumpChatImageView = this.f44675q;
        if (dumpChatImageView != null) {
            return dumpChatImageView;
        }
        AbstractC19074t.m100223u("mDumpView");
        return null;
    }

    public final C3020p0 getMFeedItem() {
        return this.f44680v;
    }

    public final Handler getMHandlerUI() {
        return this.f44681w;
    }

    public final boolean getMInitialized() {
        return this.f44684z;
    }

    public final int getMModeLayout() {
        return this.f44679u;
    }

    public final C17391z getMVideo() {
        return this.f44678t;
    }

    public final View getMVideoProcessingView() {
        View view = this.f44677s;
        if (view != null) {
            return view;
        }
        AbstractC19074t.m100223u("mVideoProcessingView");
        return null;
    }

    public final VideoThumbnailView getMVideoThumbnailView() {
        VideoThumbnailView videoThumbnailView = this.f44676r;
        if (videoThumbnailView != null) {
            return videoThumbnailView;
        }
        AbstractC19074t.m100223u("mVideoThumbnailView");
        return null;
    }

    public final ZVideoView getMVideoView() {
        ZVideoView zVideoView = this.f44674p;
        if (zVideoView != null) {
            return zVideoView;
        }
        AbstractC19074t.m100223u("mVideoView");
        return null;
    }

    public final View.OnClickListener getMVideoViewListener() {
        return this.f44673C;
    }

    @Override // hf0.C20040b.c
    public ZVideoView getNewVideoView() {
        return getMVideoView();
    }

    public final C23307g getPhotoInfo() {
        C2954c albumVideo;
        C28227x3 c28227x3;
        int i11;
        C28227x3 m14010a;
        C28227x3 m14010a2;
        if (m44069q() && (albumVideo = getAlbumVideo()) != null && albumVideo.m13988c() == 1 && (albumVideo.m13986a() instanceof C2969f)) {
            AbstractC2959d m13986a = albumVideo.m13986a();
            if (m13986a != null) {
                c28227x3 = m13986a.m14010a();
            } else {
                c28227x3 = null;
            }
            if (c28227x3 != null) {
                AbstractC2959d m13986a2 = albumVideo.m13986a();
                int i12 = -1;
                if (m13986a2 != null && (m14010a2 = m13986a2.m14010a()) != null) {
                    i11 = m14010a2.f131648a;
                } else {
                    i11 = -1;
                }
                AbstractC2959d m13986a3 = albumVideo.m13986a();
                if (m13986a3 != null && (m14010a = m13986a3.m14010a()) != null) {
                    i12 = m14010a.f131649b;
                }
                if (i11 > 0 && i12 > 0) {
                    return new C23307g(i11, i12);
                }
            }
        }
        return null;
    }

    public final boolean getReleaseWhenDetached() {
        return this.f44671A;
    }

    public C17391z getVideo() {
        return this.f44678t;
    }

    public final Rect getVideoCoords() {
        View videoDisplayView = getVideoDisplayView();
        Rect rect = new Rect();
        int[] iArr = new int[2];
        videoDisplayView.getLocationInWindow(iArr);
        int i11 = iArr[0];
        rect.left = i11;
        rect.top = iArr[1];
        rect.right = i11 + videoDisplayView.getWidth();
        rect.bottom = rect.top + videoDisplayView.getHeight();
        return rect;
    }

    public final View getVideoDisplayView() {
        if (this.f44679u == 0) {
            return getMVideoView();
        }
        return getMVideoThumbnailView();
    }

    public final View.OnClickListener getVideoViewListener() {
        return this.f44672B;
    }

    /* renamed from: i */
    public final void m44062i(C23528a c23528a) {
        String str;
        int i11;
        int i12;
        AbstractC19074t.m100208f(c23528a, "aQuery");
        C17391z m44063j = m44063j();
        this.f44678t = m44063j;
        if (m44063j == null) {
            return;
        }
        if (m44063j != null) {
            str = m44063j.f88622e;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        C23307g photoInfo = getPhotoInfo();
        if (photoInfo != null && (i11 = photoInfo.f113474a) > 0 && (i12 = photoInfo.f113475b) > 0) {
            getMVideoThumbnailView().setRatio(AbstractC20809n.m108592z(i11, i12));
        } else {
            getMVideoThumbnailView().setRatio(1.0f);
        }
        m44071s(str, c23528a);
        getMVideoThumbnailView().setDrawPlayIcon(true);
    }

    /* renamed from: j */
    public final C17391z m44063j() {
        if (!m44069q()) {
            return null;
        }
        return AbstractC20826v0.m108787U(this.f44680v, 0);
    }

    /* renamed from: k */
    public final void m44064k(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        try {
            Object systemService = context.getSystemService("layout_inflater");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            LayoutInflater layoutInflater = (LayoutInflater) systemService;
            this.f44679u = i11;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        if (i11 == 4) {
                            m44065l(layoutInflater, context);
                        }
                    } else {
                        m44066m(layoutInflater, context);
                    }
                } else {
                    m44068p(layoutInflater, context);
                }
            } else {
                m44067n(layoutInflater, context);
            }
            this.f44684z = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public final void m44065l(LayoutInflater layoutInflater, Context context) {
        ViewOnClickListenerC17374o viewOnClickListenerC17374o;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(context, "context");
        layoutInflater.inflate(AbstractC7409c0.feed_item_social_album_details_video, this);
        View findViewById = findViewById(AbstractC6918a0.zaloVideoViewBig);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        setMVideoView((ZVideoView) findViewById);
        VideoController videoController = getMVideoView().getVideoController();
        if (videoController != null) {
            viewOnClickListenerC17374o = videoController.f88210s;
        } else {
            viewOnClickListenerC17374o = null;
        }
        if (viewOnClickListenerC17374o != null) {
            viewOnClickListenerC17374o.f88566d0 = AbstractC16803z.icn_csc_play_big_selector;
        }
        if (viewOnClickListenerC17374o != null) {
            viewOnClickListenerC17374o.f88567e0 = AbstractC16803z.icn_csc_play_big_selector;
        }
        if (videoController != null) {
            videoController.m92304c0();
        }
        setMDumpView(new DumpChatImageView(context));
        setMVideoThumbnailView(new VideoThumbnailView(context, null));
        setMVideoProcessingView(new View(context, null));
    }

    /* renamed from: m */
    public final void m44066m(LayoutInflater layoutInflater, Context context) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(context, "context");
        layoutInflater.inflate(AbstractC7409c0.feed_item_social_album_profile_video, this);
        View findViewById = findViewById(AbstractC6918a0.imvMediaThumb);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        setMVideoThumbnailView((VideoThumbnailView) findViewById);
        View findViewById2 = findViewById(AbstractC6918a0.vVideoProcessing);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        setMVideoProcessingView(findViewById2);
        View findViewById3 = findViewById(AbstractC6918a0.profile_feed_video_thumb_group);
        ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = AbstractC20814p0.m108611J();
        layoutParams.height = AbstractC20814p0.m108611J();
        findViewById3.setLayoutParams(layoutParams);
        View findViewById4 = getMVideoProcessingView().findViewById(AbstractC6918a0.pbVideoProcessing);
        AbstractC19074t.m100206d(findViewById4, "null cannot be cast to non-null type android.widget.ProgressBar");
        ((ProgressBar) findViewById4).setIndeterminateDrawable(AbstractC23136l9.m118665N(context, AbstractC16803z.video_loading_small));
        setMDumpView(new DumpChatImageView(context));
        setMVideoView(new ZVideoView(context, null));
    }

    /* renamed from: n */
    public final void m44067n(LayoutInflater layoutInflater, Context context) {
        ViewOnClickListenerC17374o viewOnClickListenerC17374o;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(context, "context");
        layoutInflater.inflate(AbstractC7409c0.feed_item_video_content, this);
        View findViewById = findViewById(AbstractC6918a0.zaloVideoViewBig);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        setMVideoView((ZVideoView) findViewById);
        ViewGroup.LayoutParams layoutParams = getMVideoView().getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        getMVideoView().setLayoutParams(layoutParams2);
        View findViewById2 = findViewById(AbstractC6918a0.vVideoProcessing);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        setMVideoProcessingView(findViewById2);
        VideoController videoController = getMVideoView().getVideoController();
        if (videoController != null) {
            viewOnClickListenerC17374o = videoController.f88210s;
        } else {
            viewOnClickListenerC17374o = null;
        }
        if (viewOnClickListenerC17374o != null) {
            viewOnClickListenerC17374o.f88566d0 = AbstractC16803z.icn_csc_play_big_selector;
        }
        if (viewOnClickListenerC17374o != null) {
            viewOnClickListenerC17374o.f88567e0 = AbstractC16803z.icn_csc_play_big_selector;
        }
        if (videoController != null) {
            videoController.m92304c0();
        }
        setMDumpView(new DumpChatImageView(context));
        setMVideoThumbnailView(new VideoThumbnailView(context, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f44671A && this.f44684z) {
            m44073x();
        }
    }

    /* renamed from: p */
    public final void m44068p(LayoutInflater layoutInflater, Context context) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(context, "context");
        layoutInflater.inflate(AbstractC7409c0.feed_item_social_album_timeline_group_video, this);
        View findViewById = findViewById(AbstractC6918a0.imvMediaThumb);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        setMVideoThumbnailView((VideoThumbnailView) findViewById);
        setMDumpView(new DumpChatImageView(context));
        setMVideoView(new ZVideoView(context, null));
        setMVideoProcessingView(new View(context, null));
    }

    /* renamed from: q */
    public final boolean m44069q() {
        C2954c c2954c;
        ArrayList<C2954c> albumItemsList = getAlbumItemsList();
        if (albumItemsList != null && albumItemsList.size() == 1) {
            c2954c = albumItemsList.get(0);
        } else {
            c2954c = null;
        }
        if (c2954c == null || c2954c.m13988c() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m44070r() {
        C3020p0 c3020p0 = this.f44680v;
        if (c3020p0 == null || c3020p0 == null || c3020p0.f12027G) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void m44071s(String str, C23528a c23528a) {
        AbstractC19074t.m100208f(str, "thumb");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        getMVideoThumbnailView().setImageDrawable(AbstractC23170p.m119358p(getContext()));
        C24003n m120126f0 = C23278z2.m120126f0();
        m120126f0.f116284y = true;
        ((C23528a) c23528a.m123612r(getMVideoThumbnailView())).m123618x(str, m120126f0);
        getMVideoThumbnailView().setOnClickListener(new ViewOnClickListenerC8130a());
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    @Override // hf0.C20040b.c
    public void setCurrentVideoView(boolean z11) {
    }

    public final void setLayoutParamsVideoView(C23307g c23307g) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (c23307g != null && (i11 = c23307g.f113474a) > 0 && (i12 = c23307g.f113475b) > 0 && (i13 = this.f44682x) > 0 && (i14 = this.f44683y) > 0) {
            float f11 = (i11 * 1.0f) / i12;
            float f12 = (i13 * 1.0f) / i14;
            getMVideoView().setUseVideoRatio(false);
            getMVideoView().setVideoPlayerMode(1);
            if (f11 < f12) {
                i15 = this.f44682x;
                i16 = this.f44683y;
            } else {
                i15 = this.f44682x;
                i16 = (int) (i15 / f11);
            }
            ViewGroup.LayoutParams layoutParams = getMVideoView().getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i15;
            }
            if (layoutParams != null) {
                layoutParams.height = i16;
            }
            getMVideoView().setLayoutParams(layoutParams);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = getMVideoView().getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = -1;
        }
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
        }
        getMVideoView().setLayoutParams(layoutParams2);
        getMVideoView().setUseVideoRatio(true);
        getMVideoView().setVideoPlayerMode(0);
    }

    public final void setMAvailableHeight(int i11) {
        this.f44683y = i11;
    }

    public final void setMAvailableWidth(int i11) {
        this.f44682x = i11;
    }

    public final void setMDumpView(DumpChatImageView dumpChatImageView) {
        AbstractC19074t.m100208f(dumpChatImageView, "<set-?>");
        this.f44675q = dumpChatImageView;
    }

    public final void setMFeedItem(C3020p0 c3020p0) {
        this.f44680v = c3020p0;
    }

    public final void setMHandlerUI(Handler handler) {
        this.f44681w = handler;
    }

    public final void setMInitialized(boolean z11) {
        this.f44684z = z11;
    }

    public final void setMModeLayout(int i11) {
        this.f44679u = i11;
    }

    public final void setMVideo(C17391z c17391z) {
        this.f44678t = c17391z;
    }

    public final void setMVideoProcessingView(View view) {
        AbstractC19074t.m100208f(view, "<set-?>");
        this.f44677s = view;
    }

    public final void setMVideoThumbnailView(VideoThumbnailView videoThumbnailView) {
        AbstractC19074t.m100208f(videoThumbnailView, "<set-?>");
        this.f44676r = videoThumbnailView;
    }

    public final void setMVideoView(ZVideoView zVideoView) {
        AbstractC19074t.m100208f(zVideoView, "<set-?>");
        this.f44674p = zVideoView;
    }

    public final void setMVideoViewListener(View.OnClickListener onClickListener) {
        this.f44673C = onClickListener;
    }

    public final void setOnVideoViewClickListener(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "listener");
        this.f44673C = onClickListener;
    }

    public final void setReleaseWhenDetached(boolean z11) {
        this.f44671A = z11;
    }

    public final void setShouldReleaseWhenDetached(boolean z11) {
        this.f44671A = z11;
    }

    public final void setVideoViewListener(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "<set-?>");
        this.f44672B = onClickListener;
    }

    public final void setVisibilityVideoProcessing(boolean z11) {
        int i11;
        View mVideoProcessingView = getMVideoProcessingView();
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        mVideoProcessingView.setVisibility(i11);
    }

    /* renamed from: u */
    public final void m44072u(String str, C23528a c23528a) {
        AbstractC19074t.m100208f(str, "thumb");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        ((C23528a) c23528a.m123612r(getMDumpView())).m123579C(str, C23278z2.m120126f0(), new C8131b());
    }

    /* renamed from: x */
    public final void m44073x() {
        getMVideoView().m92429s0();
        getMVideoView().m92412f0(true);
    }

    /* renamed from: y */
    public final void m44074y(int i11, int i12) {
        this.f44682x = i11;
        this.f44683y = i12;
    }

    /* renamed from: z */
    public final void m44075z() {
        getMVideoView().setSkipShowControlWhenStart(true);
        ZVideoView mVideoView = getMVideoView();
        ZMediaPlayerSettings.PlayConfig playConfig = ZMediaPlayerSettings.getPlayConfig(3);
        if (playConfig != null) {
            playConfig.setSilent(false);
        } else {
            playConfig = null;
        }
        mVideoView.setPlayConfig(playConfig);
        getMVideoView().setOnPlayerStateChangedListener(new C8132c());
        VideoController videoController = getMVideoView().getVideoController();
        if (videoController != null) {
            videoController.setViewMode(1);
        }
        VideoController videoController2 = getMVideoView().getVideoController();
        if (videoController2 != null) {
            videoController2.setOnFullScreenClickListener(this.f44672B);
        }
        VideoController videoController3 = getMVideoView().getVideoController();
        if (videoController3 != null) {
            videoController3.setPlayListener(this.f44672B);
        }
        getMVideoView().setOnCompletionListener(new C8133d());
        getMVideoView().setOnInfoListener(new C8134e());
        getMVideoView().setAudioFocusControl(C28075g8.m141538e());
        if (!getMVideoView().isPlaying()) {
            int currentState = getMVideoView().getCurrentState();
            if (currentState == 0 || currentState == 5 || currentState == 6) {
                getMVideoView().m92421n0(true);
            }
            VideoController videoController4 = getMVideoView().getVideoController();
            if (videoController4 != null) {
                videoController4.m92306h(true);
            }
        }
    }
}
