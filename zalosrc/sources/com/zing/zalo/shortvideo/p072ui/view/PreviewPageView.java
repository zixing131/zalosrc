package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9769e;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.HeadsetReceiver;
import com.zing.zalo.shortvideo.p072ui.view.PreviewPageLayout;
import com.zing.zalo.zview.ZaloView;
import e10.C18168e;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25018i2;
import q20.C25097t;
import s20.AbstractC26112n;
import v00.AbstractC27413h;

/* loaded from: classes5.dex */
public final class PreviewPageView extends AbstractC10623a {
    public static final C10353b Companion = new C10353b(null);

    /* renamed from: B0 */
    private boolean f53110B0;

    /* renamed from: C0 */
    private HeadsetReceiver f53111C0;

    /* renamed from: D0 */
    private Video f53112D0;

    /* renamed from: E0 */
    private String f53113E0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10352a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10352a f53114y = new C10352a();

        C10352a() {
            super(3, C25018i2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPagePreviewBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54695h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25018i2 m54695h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25018i2.m129851c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageView$b */
    /* loaded from: classes5.dex */
    public static final class C10353b {
        private C10353b() {
        }

        public /* synthetic */ C10353b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final PreviewPageView m54696a(Video video) {
            AbstractC19074t.m100208f(video, "video");
            PreviewPageView previewPageView = new PreviewPageView();
            previewPageView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("VIDEO", video)));
            return previewPageView;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageView$c */
    /* loaded from: classes5.dex */
    public static final class C10354c implements HeadsetReceiver.InterfaceC10075a {
        C10354c() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.receiver.HeadsetReceiver.InterfaceC10075a
        /* renamed from: a */
        public void mo53290a(boolean z11) {
            VideoLayout videoLayout;
            if (z11) {
                if (!PreviewPageView.this.f53110B0) {
                    PreviewPageView.this.f53110B0 = true;
                }
            } else if (PreviewPageView.this.f53110B0) {
                PreviewPageView.this.f53110B0 = false;
                C25018i2 c25018i2 = (C25018i2) PreviewPageView.this.m55556SK();
                if (c25018i2 != null && (videoLayout = c25018i2.f119981z) != null) {
                    videoLayout.m52615Q();
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.receiver.HeadsetReceiver.InterfaceC10075a
        /* renamed from: b */
        public void mo53291b(int[] iArr) {
            HeadsetReceiver.InterfaceC10075a.a.m53725a(this, iArr);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageView$d */
    /* loaded from: classes5.dex */
    public static final class C10355d implements PreviewPageLayout.InterfaceC10346a {
        C10355d() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.PreviewPageLayout.InterfaceC10346a
        /* renamed from: a */
        public void mo54676a() {
            SearchVideoChannelView searchVideoChannelView;
            ZaloView m92650VI = PreviewPageView.this.m92650VI();
            Video video = null;
            if (m92650VI instanceof SearchVideoChannelView) {
                searchVideoChannelView = (SearchVideoChannelView) m92650VI;
            } else {
                searchVideoChannelView = null;
            }
            if (searchVideoChannelView != null) {
                Video video2 = PreviewPageView.this.f53112D0;
                if (video2 == null) {
                    AbstractC19074t.m100223u("previewVideo");
                } else {
                    video = video2;
                }
                searchVideoChannelView.m54856dL(video);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageView$e */
    /* loaded from: classes5.dex */
    static final class C10356e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25018i2 f53117q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10356e(C25018i2 c25018i2) {
            super(1);
            this.f53117q = c25018i2;
        }

        /* renamed from: a */
        public final void m54697a(boolean z11) {
            this.f53117q.f119979x.setLoadingVisible(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54697a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageView$f */
    /* loaded from: classes5.dex */
    static final class C10357f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ VideoLayout f53118q;

        /* renamed from: r */
        final /* synthetic */ PreviewPageView f53119r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10357f(VideoLayout videoLayout, PreviewPageView previewPageView) {
            super(2);
            this.f53118q = videoLayout;
            this.f53119r = previewPageView;
        }

        /* renamed from: a */
        public final void m54698a(int i11, C9769e c9769e) {
            AbstractC19074t.m100208f(c9769e, "<anonymous parameter 1>");
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2) {
                    C25097t.f120556a.m130153n(this.f53118q.getContext(), AbstractC27413h.zch_error_play_video_failed);
                    this.f53119r.finish();
                    return;
                }
                return;
            }
            this.f53118q.m52620d0();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54698a(((Number) obj).intValue(), (C9769e) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageView$g */
    /* loaded from: classes5.dex */
    static final class C10358g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ VideoLayout f53120q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10358g(VideoLayout videoLayout) {
            super(0);
            this.f53120q = videoLayout;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54699a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54699a() {
            this.f53120q.m52620d0();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageView$h */
    /* loaded from: classes5.dex */
    static final class C10359h extends AbstractC19075u implements InterfaceC18505l {
        C10359h() {
            super(1);
        }

        /* renamed from: a */
        public final void m54700a(View view) {
            AbstractC19074t.m100208f(view, "it");
            PreviewPageView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54700a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public PreviewPageView() {
        super(C10352a.f53114y);
        this.f53111C0 = new HeadsetReceiver(new C10354c());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        AbstractC19074t.m100205c(m92642L3);
        Parcelable parcelable = m92642L3.getParcelable("VIDEO");
        AbstractC19074t.m100205c(parcelable);
        this.f53112D0 = (Video) parcelable;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        if (this.f53113E0 != null) {
            C18168e m96538b = C18168e.Companion.m96538b();
            String str = this.f53113E0;
            if (str == null) {
                AbstractC19074t.m100223u("previewId");
                str = null;
            }
            m96538b.m96512E(str);
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        VideoLayout videoLayout;
        C25018i2 c25018i2 = (C25018i2) m55556SK();
        if (c25018i2 != null && (videoLayout = c25018i2.f119981z) != null) {
            videoLayout.m52617a0();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        VideoLayout videoLayout;
        super.mo37584UJ();
        C25018i2 c25018i2 = (C25018i2) m55556SK();
        if (c25018i2 != null && (videoLayout = c25018i2.f119981z) != null) {
            videoLayout.m52624u();
        }
        HeadsetReceiver headsetReceiver = this.f53111C0;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        headsetReceiver.mo53685d(m92689tK);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        VideoLayout videoLayout;
        super.mo37712VJ();
        C25018i2 c25018i2 = (C25018i2) m55556SK();
        if (c25018i2 != null && (videoLayout = c25018i2.f119981z) != null) {
            videoLayout.m52627x();
        }
        this.f53111C0.mo53687g();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        Video video;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C25018i2 c25018i2 = (C25018i2) m55556SK();
        if (c25018i2 != null) {
            PreviewPageLayout previewPageLayout = c25018i2.f119979x;
            previewPageLayout.setCallback(new C10355d());
            Video video2 = this.f53112D0;
            if (video2 == null) {
                AbstractC19074t.m100223u("previewVideo");
                video2 = null;
            }
            previewPageLayout.m54675j(video2);
            VideoLayout videoLayout = c25018i2.f119981z;
            C18168e m96538b = C18168e.Companion.m96538b();
            Video video3 = this.f53112D0;
            if (video3 == null) {
                AbstractC19074t.m100223u("previewVideo");
                video3 = null;
            }
            String m96519z = m96538b.m96519z(video3);
            videoLayout.setPlaylistId(m96519z);
            this.f53113E0 = m96519z;
            videoLayout.setLoadingChangedAction(new C10356e(c25018i2));
            videoLayout.setPlayerEndedAction(new C10357f(videoLayout, this));
            videoLayout.setAdsShowEndedAction(new C10358g(videoLayout));
            AbstractC19074t.m100205c(videoLayout);
            C9769e.a aVar = C9769e.Companion;
            Video video4 = this.f53112D0;
            if (video4 == null) {
                AbstractC19074t.m100223u("previewVideo");
                video4 = null;
            }
            C9769e m52769a = aVar.m52769a(video4);
            Video video5 = this.f53112D0;
            if (video5 == null) {
                AbstractC19074t.m100223u("previewVideo");
                video = null;
            } else {
                video = video5;
            }
            VideoLayout.m52593h0(videoLayout, m52769a, video, false, null, null, null, 60, null);
            ImageView imageView = c25018i2.f119974s;
            AbstractC19074t.m100207e(imageView, "btnBack");
            AbstractC26112n.m134407k0(imageView, new C10359h());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        ImageView imageView;
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            C25018i2 c25018i2 = (C25018i2) m55556SK();
            if (c25018i2 != null && (imageView = c25018i2.f119974s) != null) {
                imageView.callOnClick();
            }
            return true;
        }
        return false;
    }
}
