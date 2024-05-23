package com.zing.zalo.p077ui.picker.gallerypicker;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ag0.InterfaceC0806b1;
import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.vectordrawable.graphics.drawable.C2040d;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import cg.AbstractC3460h;
import com.androidquery.util.C3979l;
import com.showingphotolib.view.AnimationLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.videos.C7760a;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.picker.landingpage.LandingPageView;
import com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView;
import com.zing.zalo.p077ui.zviews.PreviewUpdateAvatarView;
import com.zing.zalo.p077ui.zviews.PreviewUpdateCoverView;
import com.zing.zalo.p077ui.zviews.RotatableZaloView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.animation.AnimationTarget;
import dg0.AbstractC17927b;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import i40.C20275e;
import i90.AbstractC20435a;
import i90.C20446l;
import i90.C20447m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import m90.EnumC22962a;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23171p0;
import me0.AbstractC23222t7;
import me0.AbstractC23237v1;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import me0.C23212s8;
import me0.C23278z2;
import np.InterfaceC23923b;
import p193h0.AbstractC19694b;
import p239ih.C20551a;
import p262jb.AbstractC21196a;
import p307kv.AbstractC21954k;
import p322lf.AbstractC22470k;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23999j;
import p500s1.C26086a;
import p500s1.C26087b;
import p500s1.C26088c;
import p509sp.C26361j;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import p649xl.C29778e4;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sh.InterfaceC26248a;
import th.AbstractC26689j;
import wh0.C29046a;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public final class GalleryPickerView extends RotatableZaloView implements InterfaceC0733x, InterfaceC23923b {
    public static final C12680a Companion = new C12680a(null);

    /* renamed from: T0 */
    private final InterfaceC24854k f66045T0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C20446l.class), new C12693n(new C12692m(this)), new C12694o());

    /* renamed from: U0 */
    private final InterfaceC24854k f66046U0;

    /* renamed from: V0 */
    private MediaPickerView f66047V0;

    /* renamed from: W0 */
    private C20275e f66048W0;

    /* renamed from: X0 */
    private AnimationLayout f66049X0;

    /* renamed from: Y0 */
    private LandingPageView f66050Y0;

    /* renamed from: Z0 */
    private C2040d f66051Z0;

    /* renamed from: a1 */
    private C2040d f66052a1;

    /* renamed from: b1 */
    private int f66053b1;

    /* renamed from: c1 */
    private int f66054c1;

    /* renamed from: d1 */
    private String f66055d1;

    /* renamed from: e1 */
    private boolean f66056e1;

    /* renamed from: f1 */
    private EnumC22962a f66057f1;

    /* renamed from: g1 */
    private boolean f66058g1;

    /* renamed from: h1 */
    private SensitiveData f66059h1;

    /* renamed from: i1 */
    private boolean f66060i1;

    /* renamed from: j1 */
    private boolean f66061j1;

    /* renamed from: k1 */
    private boolean f66062k1;

    /* renamed from: l1 */
    private String f66063l1;

    /* renamed from: m1 */
    private final Handler f66064m1;

    /* renamed from: n1 */
    private InterfaceC12681b f66065n1;

    /* renamed from: o1 */
    private long f66066o1;

    /* renamed from: p1 */
    private int f66067p1;

    /* renamed from: q1 */
    private String f66068q1;

    /* renamed from: r1 */
    private C29778e4 f66069r1;

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$a */
    /* loaded from: classes6.dex */
    public static final class C12680a {
        private C12680a() {
        }

        public /* synthetic */ C12680a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final List m71478a(Intent intent) {
            ArrayList arrayList = new ArrayList();
            if (intent != null) {
                try {
                    Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("result_selected_items");
                    if (parcelableArrayExtra != null) {
                        for (Parcelable parcelable : parcelableArrayExtra) {
                            if (parcelable instanceof MediaItem) {
                                arrayList.add(parcelable);
                            }
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12681b {
        /* renamed from: dl */
        void mo39091dl(Intent intent);

        /* renamed from: y9 */
        void mo39092y9();
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$c */
    /* loaded from: classes6.dex */
    static final class C12682c extends AbstractC19075u implements InterfaceC18494a {
        C12682c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(GalleryPickerView.this.m92648SI());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$d */
    /* loaded from: classes6.dex */
    public static final class C12683d implements MediaPickerView.InterfaceC12784b {

        /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$d$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f66072a;

            static {
                int[] iArr = new int[EnumC22962a.values().length];
                try {
                    iArr[EnumC22962a.f111693q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC22962a.f111696t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f66072a = iArr;
            }
        }

        C12683d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m71485l(MediaItem mediaItem, final GalleryPickerView galleryPickerView) {
            AbstractC19074t.m100208f(mediaItem, "$item");
            AbstractC19074t.m100208f(galleryPickerView, "this$0");
            final ArrayList arrayList = new ArrayList();
            if (mediaItem.m41159n0()) {
                arrayList.add(mediaItem);
            }
            galleryPickerView.mo70710wy(new Runnable() { // from class: i90.i
                @Override // java.lang.Runnable
                public final void run() {
                    GalleryPickerView.C12683d.m71486m(arrayList, galleryPickerView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static final void m71486m(List list, GalleryPickerView galleryPickerView) {
            InterfaceC12681b interfaceC12681b;
            AbstractC19074t.m100208f(list, "$resultList");
            AbstractC19074t.m100208f(galleryPickerView, "this$0");
            boolean z11 = false;
            MediaItem[] mediaItemArr = (MediaItem[]) list.toArray(new MediaItem[0]);
            if (mediaItemArr.length == 0) {
                z11 = true;
            }
            if (!z11) {
                Intent intent = new Intent();
                intent.putExtra("result_selected_items", mediaItemArr);
                intent.setExtrasClassLoader(MainApplication.Companion.m35500c().getClassLoader());
                galleryPickerView.mo50035CK(-1, intent);
                if (AbstractC23280z4.m120328g0(galleryPickerView.f66053b1) && (interfaceC12681b = galleryPickerView.f66065n1) != null) {
                    interfaceC12681b.mo39091dl(intent);
                }
            }
            galleryPickerView.finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:            if (r0.m72197ON(r3) != false) goto L43;     */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m71487n(GalleryPickerView galleryPickerView, MediaItem mediaItem, AnimationTarget animationTarget, C20275e c20275e) {
            AbstractC19074t.m100208f(galleryPickerView, "this$0");
            AbstractC19074t.m100208f(mediaItem, "$photo");
            try {
                if (AbstractC23280z4.m120328g0(galleryPickerView.f66053b1)) {
                    int i11 = galleryPickerView.f66053b1;
                    if (i11 == 1) {
                        galleryPickerView.m71463sN(mediaItem.mo41081Q(), mediaItem.mo41083a0());
                    } else if (i11 == 2) {
                        galleryPickerView.m71465tN(mediaItem.mo41081Q(), mediaItem.mo41083a0());
                    } else if (i11 == 5) {
                        galleryPickerView.m71467uN(1, 3006, mediaItem);
                    } else if (i11 == 6) {
                        galleryPickerView.m71467uN(3, 3007, mediaItem);
                    } else if (i11 == 7) {
                        galleryPickerView.m71467uN(4, 3001, mediaItem);
                    } else {
                        if (i11 != 17 && i11 != 23) {
                            if (i11 != 28) {
                                if (i11 != 25) {
                                    if (i11 != 26) {
                                        GalleryPickerView.m71409BN(galleryPickerView, null, 1, null);
                                    }
                                } else if (galleryPickerView.f66062k1) {
                                    galleryPickerView.m71451jN(galleryPickerView.f66063l1, mediaItem);
                                } else {
                                    GalleryPickerView.m71409BN(galleryPickerView, null, 1, null);
                                }
                            } else {
                                Intent intent = new Intent();
                                intent.putExtra("EXTRA_PHOTO_PATH", mediaItem.mo41081Q());
                                intent.setExtrasClassLoader(MainApplication.Companion.m35500c().getClassLoader());
                                galleryPickerView.mo50035CK(-1, intent);
                                galleryPickerView.finish();
                            }
                        }
                        GalleryPickerView.m71409BN(galleryPickerView, null, 1, null);
                    }
                } else {
                    if (!galleryPickerView.m71441aN().m106471a0()) {
                        MediaPickerView mediaPickerView = galleryPickerView.f66047V0;
                        AbstractC19074t.m100205c(mediaPickerView);
                    }
                    galleryPickerView.m71469vN(mediaItem, animationTarget, c20275e);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static final void m71488o(GalleryPickerView galleryPickerView, View view) {
            AbstractC19074t.m100208f(galleryPickerView, "this$0");
            TextView titleTextView = galleryPickerView.f88760a0.getTitleTextView();
            if (titleTextView != null) {
                titleTextView.performClick();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public static final void m71489p(VideoItem videoItem, int i11, C12683d c12683d, MediaItem mediaItem) {
            AbstractC19074t.m100208f(videoItem, "$videoItem");
            AbstractC19074t.m100208f(c12683d, "this$0");
            AbstractC19074t.m100208f(mediaItem, "$video");
            if (AbstractC3460h.m17438f(videoItem.mo41081Q(), i11) > AbstractC26689j.m137108q(i11)) {
                videoItem.m41209E1(true);
            }
            c12683d.m71490k(mediaItem);
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: a */
        public void mo71306a(String str) {
            AbstractC19074t.m100208f(str, "title");
            GalleryPickerView galleryPickerView = GalleryPickerView.this;
            if (galleryPickerView.f88760a0 != null) {
                if (AbstractC23280z4.m120332i0(galleryPickerView.f66053b1) && AbstractC19074t.m100204b(str, AbstractC23136l9.m118743r0(AbstractC8020f0.media_picker_all))) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_photos_select_gallery);
                    AbstractC19074t.m100207e(str, "getString(...)");
                }
                GalleryPickerView.this.f88760a0.setTitle(str + " ");
                if (GalleryPickerView.this.m71441aN().m106473e0() && GalleryPickerView.this.f66066o1 != -1 && GalleryPickerView.this.f66068q1.length() > 0) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43855x8da581);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    GalleryPickerView galleryPickerView2 = GalleryPickerView.this;
                    ActionBar actionBar = galleryPickerView2.f88760a0;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format(m118743r0, Arrays.copyOf(new Object[]{galleryPickerView2.f66068q1}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    actionBar.setSubtitle(format);
                    ActionBar actionBar2 = GalleryPickerView.this.f88760a0;
                    actionBar2.setSubTitleColor(C23212s8.m119607o(actionBar2.getContext(), AbstractC21196a.TextColor2));
                    TextView subtitleTextView = GalleryPickerView.this.f88760a0.getSubtitleTextView();
                    if (subtitleTextView != null) {
                        final GalleryPickerView galleryPickerView3 = GalleryPickerView.this;
                        subtitleTextView.setOnClickListener(new View.OnClickListener() { // from class: i90.g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                GalleryPickerView.C12683d.m71488o(GalleryPickerView.this, view);
                            }
                        });
                    }
                }
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: b */
        public void mo71307b(final MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e, String str, String str2) {
            AbstractC19074t.m100208f(mediaItem, "video");
            AbstractC19074t.m100208f(str, "msgSnackBar");
            AbstractC19074t.m100208f(str2, "paramLogMediaItemOverSize");
            try {
                if (!AbstractC23280z4.m120328g0(GalleryPickerView.this.f66053b1)) {
                    GalleryPickerView.this.m71471wN((VideoItem) mediaItem, animationTarget, c20275e);
                    return;
                }
                if (AbstractC26689j.f126436b) {
                    final VideoItem videoItem = (VideoItem) mediaItem;
                    int i12 = a.f66072a[GalleryPickerView.this.f66057f1.ordinal()];
                    final int i13 = 2;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            MediaPickerView mediaPickerView = GalleryPickerView.this.f66047V0;
                            if (mediaPickerView != null && mediaPickerView.m72190LN()) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                        } else {
                            i13 = 3;
                        }
                    }
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: i90.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            GalleryPickerView.C12683d.m71489p(VideoItem.this, i13, this, mediaItem);
                        }
                    });
                    return;
                }
                m71490k(mediaItem);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: c */
        public void mo71308c(List list) {
            AbstractC19074t.m100208f(list, "selectedItems");
            GalleryPickerView.m71409BN(GalleryPickerView.this, null, 1, null);
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: d */
        public void mo71309d(View view) {
            if (GalleryPickerView.this.m71441aN().m106475g0() || GalleryPickerView.this.m71441aN().m106474f0()) {
                GalleryPickerView.this.m71454mD();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: e */
        public void mo71310e(final MediaItem mediaItem, final AnimationTarget animationTarget, int i11, final C20275e c20275e) {
            AbstractC19074t.m100208f(mediaItem, "photo");
            final GalleryPickerView galleryPickerView = GalleryPickerView.this;
            AbstractC17927b.Companion.m94536b().mo94527a("IS_PROCESSING_PHOTO_CLICKED_GALLERY_PICKER_VIEW", new Runnable() { // from class: i90.e
                @Override // java.lang.Runnable
                public final void run() {
                    GalleryPickerView.C12683d.m71487n(GalleryPickerView.this, mediaItem, animationTarget, c20275e);
                }
            }, 500L);
        }

        /* renamed from: k */
        public final void m71490k(final MediaItem mediaItem) {
            AbstractC19074t.m100208f(mediaItem, "item");
            InterfaceC0806b1 m2237f = AbstractC0837p0.Companion.m2237f();
            final GalleryPickerView galleryPickerView = GalleryPickerView.this;
            m2237f.mo2040a(new Runnable() { // from class: i90.h
                @Override // java.lang.Runnable
                public final void run() {
                    GalleryPickerView.C12683d.m71485l(MediaItem.this, galleryPickerView);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$e */
    /* loaded from: classes6.dex */
    public static final class C12684e implements MediaPickerView.InterfaceC12790d {
        C12684e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m71492c(GalleryPickerView galleryPickerView) {
            AbstractC19074t.m100208f(galleryPickerView, "this$0");
            galleryPickerView.m71450j1();
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12790d
        /* renamed from: a */
        public void mo71493a() {
            Handler handler = GalleryPickerView.this.f66064m1;
            final GalleryPickerView galleryPickerView = GalleryPickerView.this;
            handler.post(new Runnable() { // from class: i90.j
                @Override // java.lang.Runnable
                public final void run() {
                    GalleryPickerView.C12684e.m71492c(GalleryPickerView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$f */
    /* loaded from: classes6.dex */
    public static final class C12685f implements MediaPickerView.InterfaceC12793e {
        C12685f() {
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12793e
        /* renamed from: a */
        public void mo71311a() {
            ActionBar actionBar = GalleryPickerView.this.f88760a0;
            if (actionBar != null && actionBar.getTitleTextView() != null) {
                GalleryPickerView.this.m71453lN();
                GalleryPickerView.this.m71435UM();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12793e
        /* renamed from: b */
        public void mo71312b() {
            ActionBar actionBar = GalleryPickerView.this.f88760a0;
            if (actionBar != null && actionBar.getTitleTextView() != null) {
                GalleryPickerView.this.m71455mN();
                GalleryPickerView.this.m71435UM();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$g */
    /* loaded from: classes6.dex */
    public static final class C12686g implements InterfaceC7761b.c {
        C12686g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m71495f(GalleryPickerView galleryPickerView, String str) {
            AbstractC19074t.m100208f(galleryPickerView, "this$0");
            AbstractC19074t.m100208f(str, "$outputPath");
            galleryPickerView.m71449iN(str);
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: a */
        public void mo39571a(int i11) {
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: b */
        public void mo39572b(InterfaceC7761b interfaceC7761b) {
            if (interfaceC7761b != null) {
                AbstractC20110a.f98889a.m104564x("[VideoCompress]").mo104556o(8, "[GalleryPickerView] onError: " + interfaceC7761b.mo39539c() + ", errorCode=" + interfaceC7761b.mo39541e() + ", curTime: " + System.currentTimeMillis(), new Object[0]);
                C0815e1.m2075D().m2111i(interfaceC7761b);
            }
            GalleryPickerView.this.mo49315c4();
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: c */
        public void mo39573c(InterfaceC7761b interfaceC7761b) {
            AbstractC19074t.m100208f(interfaceC7761b, "task");
            AbstractC20110a.f98889a.m104564x("[VideoCompress]").mo104556o(8, "[GalleryPickerView] onStartProcessing: " + interfaceC7761b.mo39539c() + ", curTime: " + System.currentTimeMillis(), new Object[0]);
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: d */
        public void mo39574d(InterfaceC7761b interfaceC7761b, final String str) {
            AbstractC19074t.m100208f(interfaceC7761b, "task");
            AbstractC19074t.m100208f(str, "outputPath");
            AbstractC20110a.f98889a.m104564x("[VideoCompress]").mo104556o(8, "[GalleryPickerView] onFinished: " + interfaceC7761b.mo39539c() + ", curTime: " + System.currentTimeMillis(), new Object[0]);
            C0815e1.m2075D().m2111i(interfaceC7761b);
            AbstractC21954k.a aVar = AbstractC21954k.Companion;
            final GalleryPickerView galleryPickerView = GalleryPickerView.this;
            aVar.m114607G(new Runnable() { // from class: i90.k
                @Override // java.lang.Runnable
                public final void run() {
                    GalleryPickerView.C12686g.m71495f(GalleryPickerView.this, str);
                }
            });
            GalleryPickerView.this.mo49315c4();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$h */
    /* loaded from: classes6.dex */
    public static final class C12687h implements LandingPageView.InterfaceC12717p {
        C12687h() {
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: a */
        public void mo71313a(C3979l c3979l) {
            AbstractC19074t.m100208f(c3979l, "drawable");
            C20275e c20275e = GalleryPickerView.this.f66048W0;
            if (c20275e != null) {
                c20275e.m105864J(c3979l);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: b */
        public void mo71314b(SparseIntArray sparseIntArray) {
            AbstractC19074t.m100208f(sparseIntArray, "map");
            C20275e c20275e = GalleryPickerView.this.f66048W0;
            if (c20275e != null) {
                c20275e.m105856B(sparseIntArray);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: c */
        public void mo71315c(int i11) {
            C20275e c20275e = GalleryPickerView.this.f66048W0;
            if (c20275e != null) {
                c20275e.m105866L(i11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: d */
        public void mo71316d(int i11) {
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: e */
        public void mo71317e() {
            C20275e c20275e = GalleryPickerView.this.f66048W0;
            if (c20275e != null) {
                c20275e.m105877m(GalleryPickerView.this.f66049X0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$i */
    /* loaded from: classes6.dex */
    public static final class C12688i implements AnimationLayout.OnEventListener {

        /* renamed from: p */
        final /* synthetic */ InterfaceC27218a f66077p;

        /* renamed from: q */
        final /* synthetic */ GalleryPickerView f66078q;

        C12688i(InterfaceC27218a interfaceC27218a, GalleryPickerView galleryPickerView) {
            this.f66077p = interfaceC27218a;
            this.f66078q = galleryPickerView;
        }

        @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
        public void onBeforeExpanding(int i11) {
            if (AnimationLayout.isTypeShowFullscreen(i11) && !this.f66077p.mo35576n3()) {
                this.f66078q.m71441aN().m106477i0(this.f66078q.m92676n2());
            }
        }

        @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
        public void onExpanded(int i11) {
            this.f66078q.m71420GN();
        }

        @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
        public void onShrunk() {
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$j */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC12689j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: p */
        final /* synthetic */ View f66079p;

        /* renamed from: q */
        final /* synthetic */ GalleryPickerView f66080q;

        ViewTreeObserverOnGlobalLayoutListenerC12689j(View view, GalleryPickerView galleryPickerView) {
            this.f66079p = view;
            this.f66080q = galleryPickerView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f66079p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f66080q.m71450j1();
            MediaPickerView mediaPickerView = this.f66080q.f66047V0;
            if (mediaPickerView != null) {
                mediaPickerView.m72247uN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$k */
    /* loaded from: classes6.dex */
    public static final class C12690k extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f66081p;

        C12690k(Runnable runnable) {
            this.f66081p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            Runnable runnable = this.f66081p;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$l */
    /* loaded from: classes6.dex */
    public static final class C12691l extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f66082p;

        C12691l(Runnable runnable) {
            this.f66082p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            Runnable runnable = this.f66082p;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            Runnable runnable = this.f66082p;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$m */
    /* loaded from: classes6.dex */
    public static final class C12692m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f66083q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12692m(ZaloView zaloView) {
            super(0);
            this.f66083q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f66083q;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$n */
    /* loaded from: classes6.dex */
    public static final class C12693n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f66084q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12693n(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f66084q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f66084q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.GalleryPickerView$o */
    /* loaded from: classes6.dex */
    static final class C12694o extends AbstractC19075u implements InterfaceC18494a {
        C12694o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C20447m(GalleryPickerView.this, null, 2, null);
        }
    }

    public GalleryPickerView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C12682c());
        this.f66046U0 = m129210a;
        this.f66053b1 = -1;
        this.f66055d1 = "";
        this.f66057f1 = EnumC22962a.f111694r;
        this.f66063l1 = "";
        this.f66064m1 = new Handler(Looper.getMainLooper());
        this.f66066o1 = -1L;
        this.f66067p1 = -1;
        this.f66068q1 = "";
    }

    /* renamed from: AN */
    private final void m71407AN(Intent intent) {
        InterfaceC12681b interfaceC12681b;
        boolean z11;
        ArrayList m106468V = m71441aN().m106468V(this.f66047V0, m71410C2());
        if (this.f66061j1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("flag_share_multi_photo", true);
            bundle.putBoolean("bol_extra_photo_hd", true);
            bundle.putString("imagePathUri", "");
            bundle.putBoolean("flag_share_multi_photo", true);
            bundle.putBoolean("EXTRA_FROM_ACTION_LIST_MEDIA_PICKER", true);
            bundle.putParcelableArrayList("extra_share_multi_photo_from_media_item_list", m106468V);
            m92693xK().m93066i2(ShareView.class, bundle, 0, 1, true);
        } else {
            boolean z12 = false;
            MediaItem[] mediaItemArr = (MediaItem[]) m106468V.toArray(new MediaItem[0]);
            if (this.f66066o1 != -1 && this.f66067p1 != -1) {
                if (mediaItemArr.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    for (MediaItem mediaItem : mediaItemArr) {
                        mediaItem.m41092A0(this.f66066o1);
                        mediaItem.m41179z0(this.f66067p1);
                    }
                }
            }
            if (mediaItemArr.length == 0) {
                z12 = true;
            }
            if (!z12) {
                if (intent == null) {
                    intent = new Intent();
                }
                intent.putExtra("result_album_name", this.f66068q1);
                intent.putExtra("result_selected_items", mediaItemArr);
                intent.setExtrasClassLoader(MainApplication.Companion.m35500c().getClassLoader());
                mo50035CK(-1, intent);
                if (AbstractC23280z4.m120328g0(this.f66053b1) && (interfaceC12681b = this.f66065n1) != null) {
                    interfaceC12681b.mo39091dl(intent);
                }
            }
        }
        finish();
    }

    /* renamed from: BN */
    static /* synthetic */ void m71409BN(GalleryPickerView galleryPickerView, Intent intent, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            intent = null;
        }
        galleryPickerView.m71407AN(intent);
    }

    /* renamed from: C2 */
    private final C23528a m71410C2() {
        return (C23528a) this.f66046U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public static final void m71412CN(GalleryPickerView galleryPickerView, View view) {
        AbstractC19074t.m100208f(galleryPickerView, "this$0");
        MediaPickerView mediaPickerView = galleryPickerView.f66047V0;
        if (mediaPickerView != null) {
            ActionBar actionBar = galleryPickerView.f88760a0;
            AbstractC19074t.m100207e(actionBar, "mActionBar");
            mediaPickerView.m72229gP(actionBar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public static final void m71414DN(GalleryPickerView galleryPickerView, View view) {
        AbstractC19074t.m100208f(galleryPickerView, "this$0");
        InterfaceC12681b interfaceC12681b = galleryPickerView.f66065n1;
        if (interfaceC12681b != null) {
            interfaceC12681b.mo39092y9();
        }
        galleryPickerView.finish();
    }

    /* renamed from: EN */
    private final void m71416EN(InterfaceC27218a interfaceC27218a) {
        CameraInputParams m106444c;
        int i11;
        AbstractC23237v1.m119715c("camera-open");
        int i12 = this.f66053b1;
        if (i12 != 5) {
            if (i12 != 25) {
                if (i12 != 26) {
                    m106444c = AbstractC20435a.m106444c(i12);
                    m106444c.f41138w0 = new SensitiveData("timeline_comment_feed", "social_timeline", null, 4, null);
                    C29046a.f134547b = "GalleryPickerView.REQUEST_TAKE_PHOTO_COMMENT";
                    i11 = 3009;
                } else {
                    m106444c = AbstractC20435a.m106443b(i12);
                    m106444c.f41138w0 = new SensitiveData("action_pick_media", "action_common", null, 4, null);
                    C29046a.f134547b = "GalleryPickerView.REQUEST_ACTION_PICK_MEDIA_TAKE_VIDEO";
                    i11 = 3014;
                }
            } else {
                m106444c = AbstractC20435a.m106442a(i12);
                m106444c.f41138w0 = new SensitiveData("action_pick_media", "action_common", null, 4, null);
                C29046a.f134547b = "GalleryPickerView.PHOTO_SINGLE_ACTION_PICK_MEDIA";
                i11 = 3013;
            }
        } else {
            m106444c = AbstractC20435a.m106444c(i12);
            m106444c.f41138w0 = new SensitiveData("csc_change_background", "comm_csc", null, 4, null);
            C29046a.f134547b = "GalleryPickerView.PHOTO_CHAT_BACKGROUND";
            i11 = 3008;
        }
        ZaloCameraView m116167s = AbstractC22470k.m116167s(interfaceC27218a, i11, 1, m106444c);
        if (m116167s != null) {
            m116167s.f40833A1 = true;
        }
    }

    /* renamed from: FN */
    private final void m71418FN(ZaloView zaloView) {
        try {
            if (zaloView.m92679oJ()) {
                m92649TI().m93077o2(zaloView);
            }
            View m92656bJ = zaloView.m92656bJ();
            if (m92656bJ != null) {
                m92656bJ.bringToFront();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public final void m71420GN() {
        try {
            m71436VM().f137653q.setBackgroundColor(-16777216);
            m92649TI().m93058d2(AbstractC6918a0.container_gallery_picker, this.f66050Y0, 0, "LANDING_PAGE_VIEW_TAG", 0, false);
            LandingPageView landingPageView = this.f66050Y0;
            if (landingPageView != null) {
                m71418FN(landingPageView);
                MediaPickerView mediaPickerView = this.f66047V0;
                if (mediaPickerView != null) {
                    mediaPickerView.m72224aP(true);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: HN */
    private final void m71422HN() {
        ZaloView m92996E0 = m92649TI().m92996E0("MEDIA_PICKER_VIEW_TAG");
        if (m92996E0 instanceof MediaPickerView) {
            this.f66047V0 = (MediaPickerView) m92996E0;
        }
    }

    /* renamed from: TM */
    private final void m71434TM(MediaItem mediaItem) {
        MediaPickerView mediaPickerView = this.f66047V0;
        if (mediaPickerView != null) {
            mediaPickerView.m72183HM(mediaItem);
            mediaPickerView.m72202Pq();
            mediaPickerView.m72232hP();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public final void m71435UM() {
        TextView titleTextView = this.f88760a0.getTitleTextView();
        AbstractC19074t.m100205c(titleTextView);
        Object obj = titleTextView.getCompoundDrawables()[2];
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type androidx.vectordrawable.graphics.drawable.Animatable2Compat");
        InterfaceC2038b interfaceC2038b = (InterfaceC2038b) obj;
        if (interfaceC2038b.isRunning()) {
            interfaceC2038b.stop();
        }
        interfaceC2038b.start();
    }

    /* renamed from: VM */
    private final C29778e4 m71436VM() {
        C29778e4 c29778e4 = this.f66069r1;
        AbstractC19074t.m100205c(c29778e4);
        return c29778e4;
    }

    /* renamed from: WM */
    private final MediaPickerView.InterfaceC12784b m71437WM() {
        return new C12683d();
    }

    /* renamed from: XM */
    private final MediaPickerView.InterfaceC12790d m71438XM() {
        return new C12684e();
    }

    /* renamed from: YM */
    private final MediaPickerView.InterfaceC12793e m71439YM() {
        return new C12685f();
    }

    /* renamed from: ZM */
    public static final List m71440ZM(Intent intent) {
        return Companion.m71478a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public final C20446l m71441aN() {
        return (C20446l) this.f66045T0.getValue();
    }

    /* renamed from: bN */
    private final void m71442bN(int i11, Intent intent) {
        C27373c c27373c;
        if (i11 == -1 && intent != null && intent.hasExtra("EXTRA_VIDEO_INFO")) {
            Serializable serializableExtra = intent.getSerializableExtra("EXTRA_VIDEO_INFO");
            if (serializableExtra instanceof C27373c) {
                c27373c = (C27373c) serializableExtra;
            } else {
                c27373c = null;
            }
            if (c27373c != null) {
                if (!c27373c.f128943P) {
                    String m140220E = c27373c.m140220E();
                    AbstractC19074t.m100205c(m140220E);
                    m71449iN(m140220E);
                    return;
                }
                long time = new Date().getTime();
                mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                C7760a c7760a = C7760a.f41634a;
                String m104830F0 = AbstractC20130d.m104830F0();
                AbstractC19074t.m100207e(m104830F0, "getVideoFeedExternalStorageDirectory(...)");
                VideoBlendingParam videoBlendingParam = c27373c.f128947T;
                AbstractC19074t.m100205c(videoBlendingParam);
                InterfaceC26248a.a.m134974a(c7760a, time, m104830F0, videoBlendingParam, new C12686g(), AbstractC23280z4.m120291C(this.f66053b1), null, 32, null);
            }
        }
    }

    /* renamed from: cN */
    private final void m71443cN(int i11, int i12, Intent intent) {
        m71441aN().m106477i0(m92676n2());
        LandingPageView landingPageView = this.f66050Y0;
        if (landingPageView != null && landingPageView.m92674mJ()) {
            landingPageView.onActivityResult(i11, i12, intent);
        }
    }

    /* renamed from: dN */
    private final void m71444dN() {
        if (AbstractC23280z4.m120334j0(this.f66053b1) && !this.f66060i1) {
            ViewGroup.LayoutParams layoutParams = m71436VM().f137654r.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, 0);
            m71436VM().f137654r.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: eN */
    private final void m71445eN(int i11, Intent intent, String str, String str2, String str3, String str4) {
        MediaPickerView mediaPickerView;
        MediaItem mediaItem;
        String stringExtra;
        if (i11 == -1 && intent != null) {
            String stringExtra2 = intent.getStringExtra(str);
            if (stringExtra2 != null && stringExtra2.length() != 0 && (mediaPickerView = this.f66047V0) != null) {
                if (mediaPickerView != null) {
                    mediaItem = mediaPickerView.m72243pN(stringExtra2);
                } else {
                    mediaItem = null;
                }
                if (mediaItem != null && (stringExtra = intent.getStringExtra(str2)) != null && stringExtra.length() != 0) {
                    mediaItem.m41124T0(stringExtra);
                    String stringExtra3 = intent.getStringExtra("EXTRA_CAMERA_LOG");
                    if (stringExtra3 == null) {
                        stringExtra3 = "";
                    }
                    mediaItem.m41099E0(stringExtra3);
                    boolean booleanExtra = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", true);
                    boolean booleanExtra2 = intent.getBooleanExtra(str3, false);
                    String stringExtra4 = intent.getStringExtra(str4);
                    Intent intent2 = new Intent();
                    intent2.putExtra("EXTRA_SHOULD_PUSH_FEED", booleanExtra);
                    intent2.putExtra(str3, booleanExtra2);
                    intent2.putExtra(str4, stringExtra4);
                    m71407AN(intent2);
                    return;
                }
                return;
            }
            return;
        }
        m71441aN().m106464P(this.f66047V0);
        m71441aN().m106478o0(this.f66047V0, true);
    }

    /* renamed from: fN */
    private final void m71446fN(int i11, Intent intent) {
        MediaPickerView mediaPickerView;
        MediaItem mediaItem;
        String stringExtra;
        String stringExtra2;
        if (i11 == -1 && intent != null) {
            String stringExtra3 = intent.getStringExtra("extra_result_original_path");
            if (stringExtra3 != null && stringExtra3.length() != 0 && (mediaPickerView = this.f66047V0) != null) {
                if (mediaPickerView != null) {
                    mediaItem = mediaPickerView.m72243pN(stringExtra3);
                } else {
                    mediaItem = null;
                }
                if (mediaItem != null && (stringExtra = intent.getStringExtra("extra_result_output_path")) != null && stringExtra.length() != 0) {
                    mediaItem.m41124T0(stringExtra);
                    if (intent.hasExtra("extra_result_camera_log") && (stringExtra2 = intent.getStringExtra("extra_result_camera_log")) != null && stringExtra2.length() != 0) {
                        mediaItem.m41099E0(stringExtra2);
                    }
                    m71409BN(this, null, 1, null);
                    return;
                }
                return;
            }
            return;
        }
        m71441aN().m106464P(this.f66047V0);
        m71441aN().m106478o0(this.f66047V0, true);
    }

    /* renamed from: gN */
    private final void m71447gN(int i11, Intent intent) {
        String stringExtra;
        MediaPickerView mediaPickerView;
        MediaItem mediaItem;
        if (i11 == -1 && intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (stringExtra = intent.getStringExtra("extra_result_original_path")) != null && stringExtra.length() != 0 && (mediaPickerView = this.f66047V0) != null) {
                    if (mediaPickerView != null) {
                        mediaItem = mediaPickerView.m72243pN(stringExtra);
                    } else {
                        mediaItem = null;
                    }
                    if (mediaItem != null) {
                        String string = extras.getString("extra_result_output_path");
                        if (string != null && string.length() != 0 && AbstractC23041d2.m118194A(string)) {
                            mediaItem.m41124T0(string);
                        }
                        m71409BN(this, null, 1, null);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: hN */
    private final void m71448hN(int i11, boolean z11, List list, List list2) {
        try {
            m71441aN().m106480x0(this.f66047V0, list, list2);
            if (i11 == -1) {
                m71409BN(this, null, 1, null);
            } else {
                m71441aN().m106479w0(this.f66047V0, z11);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public final void m71449iN(String str) {
        int m3769e3;
        int i11;
        int i12;
        MediaItem m120329h = AbstractC23280z4.m120329h(str);
        AbstractC19074t.m100207e(m120329h, "generateMediaItemFromPhotoPath(...)");
        if (this.f66057f1 == EnumC22962a.f111694r) {
            m3769e3 = AbstractC0924m0.m4306w3();
        } else {
            m3769e3 = AbstractC0924m0.m3769e3();
        }
        MediaPickerView mediaPickerView = this.f66047V0;
        if (mediaPickerView != null) {
            i11 = mediaPickerView.m72239mN();
        } else {
            i11 = 0;
        }
        if (i11 < m3769e3) {
            m120329h.m41124T0(str);
            m120329h.m41140d1(true);
            m71434TM(m120329h);
            if (AbstractC23280z4.m120328g0(this.f66053b1)) {
                m71409BN(this, null, 1, null);
                return;
            }
            return;
        }
        if (this.f66053b1 == 16) {
            i12 = AbstractC8020f0.str_upload_photo_video_reach_limit;
        } else {
            i12 = AbstractC8020f0.str_uploadphoto_reachlimit;
        }
        String m92652XI = m92652XI(i12);
        C19067n0 c19067n0 = C19067n0.f94947a;
        AbstractC19074t.m100205c(m92652XI);
        String format = String.format(m92652XI, Arrays.copyOf(new Object[]{Integer.valueOf(m3769e3)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        ToastUtils.showMess(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public final void m71450j1() {
        String m118743r0;
        String str;
        boolean z11;
        try {
            if (m92648SI() != null && m92674mJ()) {
                if (this.f88760a0 != null) {
                    boolean z12 = false;
                    if (AbstractC23280z4.m120334j0(this.f66053b1)) {
                        if (AbstractC23280z4.m120332i0(this.f66053b1)) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.media_picker_all);
                            AbstractC19074t.m100205c(m118743r0);
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_photos_select_gallery);
                            AbstractC19074t.m100205c(m118743r0);
                        }
                        if (AbstractC23280z4.m120332i0(this.f66053b1)) {
                            InterfaceC27218a m92676n2 = m92676n2();
                            if (m92676n2 != null && m92676n2.mo35576n3()) {
                                this.f88760a0.setOccupyStatusBar(true);
                            } else if (this.f88760a0.getOccupyStatusBar() && !this.f66060i1) {
                                this.f88760a0.setOccupyStatusBar(false);
                            }
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_index_setting_picture_des);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    }
                    MediaPickerView mediaPickerView = this.f66047V0;
                    if (mediaPickerView != null) {
                        if (mediaPickerView == null || (str = mediaPickerView.m72223aN()) == null) {
                            str = "";
                        }
                        if (AbstractC23280z4.m120332i0(this.f66053b1) && AbstractC19074t.m100204b(AbstractC23136l9.m118743r0(AbstractC8020f0.media_picker_all), str)) {
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_photos_select_gallery);
                            AbstractC19074t.m100207e(str, "getString(...)");
                        }
                        if (this.f88760a0.getTitle() == null || !AbstractC19074t.m100204b(this.f88760a0.getTitle(), str)) {
                            this.f88760a0.setTitle(str + " ");
                        }
                        C2040d c2040d = this.f66051Z0;
                        if (c2040d != null) {
                            z11 = c2040d.isRunning();
                        } else {
                            z11 = false;
                        }
                        C2040d c2040d2 = this.f66052a1;
                        if (c2040d2 != null) {
                            z12 = c2040d2.isRunning();
                        }
                        if (!z11 && !z12) {
                            TextView titleTextView = this.f88760a0.getTitleTextView();
                            if (titleTextView != null) {
                                titleTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AbstractC19694b.m103336d(m92689tK(), AbstractC16803z.icn_arrow_dropdown), (Drawable) null);
                            }
                            TextView titleTextView2 = this.f88760a0.getTitleTextView();
                            if (titleTextView2 != null) {
                                titleTextView2.setCompoundDrawablePadding(AbstractC23222t7.f112562h);
                            }
                        }
                        TextView titleTextView3 = this.f88760a0.getTitleTextView();
                        if (titleTextView3 != null) {
                            titleTextView3.setOnClickListener(new View.OnClickListener() { // from class: i90.b
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    GalleryPickerView.m71412CN(GalleryPickerView.this, view);
                                }
                            });
                        }
                    } else if (this.f88760a0.getTitle() == null || !AbstractC19074t.m100204b(this.f88760a0.getTitle(), m118743r0)) {
                        this.f88760a0.setTitle(m118743r0 + " ");
                    }
                    if (this.f66065n1 != null) {
                        this.f88760a0.getBackButtonImage().setOnClickListener(new View.OnClickListener() { // from class: i90.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                GalleryPickerView.m71414DN(GalleryPickerView.this, view);
                            }
                        });
                    }
                    Bundle m92642L3 = m92642L3();
                    if (m92642L3 != null && m92642L3.containsKey("EXTRA_SUBTITLE_ACTIONBAR")) {
                        ActionBar actionBar = this.f88760a0;
                        actionBar.setSubTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC21196a.TextColor2));
                        this.f88760a0.setSubtitle(m92642L3.getString("EXTRA_SUBTITLE_ACTIONBAR"));
                    }
                }
                if (this.f66056e1) {
                    AbstractC32226c.m155413l(this, this.f88760a0);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public final void m71451jN(String str, MediaItem mediaItem) {
        String mo41081Q = mediaItem.mo41081Q();
        String mo41083a0 = mediaItem.mo41083a0();
        if (C20551a.m106806a(mo41081Q)) {
            CameraInputParams m39197g = CameraInputParams.m39197g(mo41081Q, mo41083a0, str);
            AbstractC19074t.m100207e(m39197g, "newActionPickerMediaOpenCropInputParams(...)");
            AbstractC22470k.m116167s(m92676n2(), 3012, 1, m39197g);
            return;
        }
        ToastUtils.m89273u();
    }

    /* renamed from: kN */
    private final void m71452kN(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                String stringExtra = intent.getStringExtra("extra_result_output_path");
                if (stringExtra != null && stringExtra.length() != 0) {
                    String m120303O = AbstractC23280z4.m120303O(stringExtra, Environment.DIRECTORY_DCIM, AbstractC23041d2.m118212k(stringExtra), false, false, false, this.f66059h1);
                    if (m120303O != null && m120303O.length() != 0) {
                        stringExtra = m120303O;
                    }
                    m71449iN(stringExtra);
                    return;
                }
                return;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return;
            }
        }
        m71441aN().m106464P(this.f66047V0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public final void m71453lN() {
        if (this.f66051Z0 == null) {
            this.f66051Z0 = C2040d.m11045b(m92689tK(), AbstractC16803z.avd_arrow_collapse);
        }
        TextView titleTextView = this.f88760a0.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f66051Z0, (Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mD */
    public final void m71454mD() {
        try {
            if (!AbstractC22470k.m116151c()) {
                return;
            }
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                String[] m118177s = AbstractC23034c6.m118177s();
                AbstractC19074t.m100207e(m118177s, "getCaptureCameraPermissions(...)");
                if (AbstractC23034c6.m118167n(m92676n2.getContext(), m118177s) != 0) {
                    AbstractC23034c6.m118186w0(m92676n2, m118177s, 142);
                } else if (AbstractC23238v2.m119727l()) {
                    m71416EN(m92676n2);
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public final void m71455mN() {
        if (this.f66052a1 == null) {
            this.f66052a1 = C2040d.m11045b(m92689tK(), AbstractC16803z.avd_arrow_dropdown);
        }
        TextView titleTextView = this.f88760a0.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f66052a1, (Drawable) null);
        }
    }

    /* renamed from: nN */
    private final void m71456nN() {
        EnumC22962a enumC22962a;
        SensitiveData sensitiveData;
        Object parcelable;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f66067p1 = m92642L3.getInt("extra_album_action", -1);
            this.f66066o1 = m92642L3.getLong("extra_album_id", -1L);
            String string = m92642L3.getString("extra_album_name", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f66068q1 = string;
            this.f66053b1 = m92642L3.getInt("extra_photo_type", -1);
            this.f66054c1 = m92642L3.getInt("extra_max_selected_items", 0);
            String string2 = m92642L3.getString("extra_message_reach_limit", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f66055d1 = string2;
            this.f66056e1 = m92642L3.getBoolean("extra_open_from_camera", false);
            Serializable serializable = m92642L3.getSerializable("extra_media_picker_source");
            if (serializable instanceof EnumC22962a) {
                enumC22962a = (EnumC22962a) serializable;
            } else {
                enumC22962a = null;
            }
            if (enumC22962a == null) {
                enumC22962a = EnumC22962a.f111694r;
            }
            this.f66057f1 = enumC22962a;
            this.f66061j1 = m92642L3.getBoolean("extra_send_from_action_list_media_picker", false);
            this.f66058g1 = m92642L3.getBoolean("extra_enable_inline_banner", false);
            this.f66062k1 = m92642L3.getBoolean("extra_action_pick_media_edit_view_enable", false);
            String string3 = m92642L3.getString("extra_action_pick_media_edit_view_aspect_ratio", "");
            AbstractC19074t.m100207e(string3, "getString(...)");
            this.f66063l1 = string3;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = m92642L3.getParcelable("EXTRA_SENSITIVE_DATA", SensitiveData.class);
                sensitiveData = (SensitiveData) parcelable;
            } else {
                sensitiveData = (SensitiveData) m92642L3.getParcelable("EXTRA_SENSITIVE_DATA");
            }
            this.f66059h1 = sensitiveData;
            this.f66060i1 = m92642L3.getBoolean("extra_open_from_dev_tool", false);
            if (this.f66056e1) {
                m71441aN().m106477i0(m92676n2());
            }
        }
    }

    /* renamed from: oN */
    private final void m71457oN() {
        LandingPageView landingPageView = this.f66050Y0;
        if (landingPageView != null) {
            landingPageView.m71704hP(new LandingPageView.InterfaceC12718q() { // from class: i90.d
                @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12718q
                /* renamed from: a */
                public final void mo71513a(int i11, boolean z11, List list, List list2) {
                    GalleryPickerView.m71458pN(GalleryPickerView.this, i11, z11, list, list2);
                }
            });
            landingPageView.m71703gP(new C12687h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public static final void m71458pN(GalleryPickerView galleryPickerView, int i11, boolean z11, List list, List list2) {
        AbstractC19074t.m100208f(galleryPickerView, "this$0");
        AbstractC19074t.m100208f(list, "selectedList");
        AbstractC19074t.m100208f(list2, "modifiedList");
        galleryPickerView.m71473xN();
        galleryPickerView.m71448hN(i11, z11, list, list2);
        galleryPickerView.m71450j1();
    }

    /* renamed from: qN */
    private final void m71459qN() {
        MediaPickerView mediaPickerView = this.f66047V0;
        if (mediaPickerView != null) {
            mediaPickerView.m72219XO(m71439YM());
            mediaPickerView.m72217WO(m71438XM());
            mediaPickerView.m72208SO(m71437WM());
        }
    }

    /* renamed from: rN */
    private final void m71461rN() {
        try {
            if (this.f66047V0 == null) {
                this.f66047V0 = new MediaPickerView();
            }
            Bundle m72257b = MediaPickerView.Companion.m72257b(this.f66053b1, this.f66057f1, this.f66058g1, this.f66056e1, true, false, false, m71441aN().m106467U(), this.f66054c1, this.f66055d1, this.f66059h1);
            MediaPickerView mediaPickerView = this.f66047V0;
            AbstractC19074t.m100205c(mediaPickerView);
            mediaPickerView.mo60305zK(m72257b);
            m92649TI().m93060e2(AbstractC6918a0.container_media_picker, this.f66047V0, "MEDIA_PICKER_VIEW_TAG", 0, false);
            m71444dN();
            m71459qN();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public final void m71463sN(String str, String str2) {
        if (C20551a.m106806a(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("STR_EXTRA_IMG_PATH", str);
            bundle.putString("STR_EXTRA_IMG_CACHE_URL", str2);
            m92692wK().mo35579p().m93066i2(PreviewUpdateAvatarView.class, bundle, 3000, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public final void m71465tN(String str, String str2) {
        if (C20551a.m106806a(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("STR_EXTRA_IMG_PATH", str);
            bundle.putString("STR_EXTRA_IMG_CACHE_URL", str2);
            m92692wK().mo35579p().m93066i2(PreviewUpdateCoverView.class, bundle, 3005, 1, true);
            return;
        }
        ToastUtils.m89273u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public final void m71467uN(int i11, int i12, MediaItem mediaItem) {
        String mo41081Q = mediaItem.mo41081Q();
        String mo41083a0 = mediaItem.mo41083a0();
        if (C20551a.m106806a(mo41081Q)) {
            AbstractC22470k.m116167s(m92676n2(), i12, 1, AbstractC20435a.m106445d(mo41081Q, mo41083a0, i11));
        } else {
            ToastUtils.m89273u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public final void m71469vN(MediaItem mediaItem, AnimationTarget animationTarget, C20275e c20275e) {
        boolean z11;
        String str;
        try {
            List m106465R = m71441aN().m106465R(this.f66047V0);
            List m106469Y = m71441aN().m106469Y(this.f66047V0);
            int m120299K = AbstractC23280z4.m120299K(m106465R, mediaItem);
            int i11 = this.f66053b1;
            EnumC22962a enumC22962a = this.f66057f1;
            MediaPickerView mediaPickerView = this.f66047V0;
            if (mediaPickerView != null) {
                z11 = mediaPickerView.m72190LN();
            } else {
                z11 = false;
            }
            MediaPickerView mediaPickerView2 = this.f66047V0;
            if (mediaPickerView2 == null || (str = mediaPickerView2.m72223aN()) == null) {
                str = "";
            }
            Bundle m71644lP = LandingPageView.m71644lP(i11, enumC22962a, m120299K, 0, z11, "", "", str, "chat_gallery_viewfull");
            AbstractC19074t.m100207e(m71644lP, "setupViewArgs(...)");
            this.f66050Y0 = new LandingPageView(m71644lP, m106465R, m106469Y);
            m71457oN();
            if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(m92686rK())) {
                this.f66048W0 = c20275e;
                String m120361x = AbstractC23280z4.m120361x(mediaItem);
                AbstractC19074t.m100207e(m120361x, "getPhotoPathCache(...)");
                C3979l m125676A2 = C23999j.m125676A2(m120361x, AbstractC23006a0.m117875E(), C23278z2.m120110a());
                if (m125676A2 == null) {
                    m125676A2 = m71410C2().m123605k(AbstractC23280z4.m120364z(mediaItem), AbstractC23006a0.m117883M(), C23278z2.m120110a());
                }
                if (this.f66049X0 != null && animationTarget != null && m125676A2 != null && m125676A2.m18839c() != null) {
                    C20275e c20275e2 = this.f66048W0;
                    if (c20275e2 != null) {
                        c20275e2.m105864J(m125676A2);
                    }
                    AnimationLayout animationLayout = this.f66049X0;
                    if (animationLayout != null) {
                        animationLayout.expand(animationTarget, m125676A2);
                        return;
                    }
                    return;
                }
                m71420GN();
                return;
            }
            m71420GN();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public final void m71471wN(VideoItem videoItem, AnimationTarget animationTarget, C20275e c20275e) {
        try {
            AbstractC23647d.m123897g("9177110");
            C7853b.Companion.m40150a().m40136j1();
            m71469vN(videoItem, animationTarget, c20275e);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0009, B:10:0x0019, B:15:0x002a, B:18:0x0017), top: B:1:0x0000 }] */
    /* renamed from: xN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m71473xN() {
        int i11;
        MediaPickerView mediaPickerView;
        try {
            if (this.f66050Y0 != null) {
                C20275e c20275e = this.f66048W0;
                if (c20275e != null) {
                    AbstractC19074t.m100205c(c20275e);
                    if (!c20275e.m105878o()) {
                        i11 = 0;
                        m92649TI().mo92702G1(this.f66050Y0, i11);
                        this.f66050Y0 = null;
                        mediaPickerView = this.f66047V0;
                        if (mediaPickerView == null) {
                            mediaPickerView.m72224aP(false);
                            return;
                        }
                        return;
                    }
                }
                i11 = AbstractC10919t.fadeout;
                m92649TI().mo92702G1(this.f66050Y0, i11);
                this.f66050Y0 = null;
                mediaPickerView = this.f66047V0;
                if (mediaPickerView == null) {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        actionBarMenu.m92750r();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f66069r1 = C29778e4.m147889c(layoutInflater, viewGroup, false);
        m92637BK(true);
        RelativeLayout root = m71436VM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        float f11;
        int i11;
        int m118713h0;
        int i12 = this.f66053b1;
        if (i12 == 8) {
            if (z11) {
                i11 = AbstractC23136l9.m118713h0();
            } else {
                i11 = 0;
            }
            if (z11) {
                m118713h0 = 0;
            } else {
                m118713h0 = AbstractC23136l9.m118713h0();
            }
            View m92656bJ = this.f72421L0.m92656bJ();
            AbstractC19074t.m100205c(m92656bJ);
            m92656bJ.setTranslationY(i11);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(m92656bJ, "translationY", m118713h0));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new C26087b());
            animatorSet.addListener(new C12690k(runnable));
            return animatorSet;
        }
        if (AbstractC23280z4.m120334j0(i12)) {
            int m118713h02 = AbstractC23136l9.m118713h0();
            RelativeLayout root = m71436VM().getRoot();
            float f12 = 0.0f;
            if (z11) {
                f11 = m118713h02;
            } else {
                f11 = 0.0f;
            }
            root.setTranslationY(f11);
            AnimatorSet animatorSet2 = new AnimatorSet();
            RelativeLayout root2 = m71436VM().getRoot();
            float[] fArr = new float[1];
            if (z11) {
                f12 = m118713h02;
            }
            fArr[0] = f12;
            animatorSet2.play(ObjectAnimator.ofFloat(root2, "translationY", fArr));
            if (z11) {
                animatorSet2.setInterpolator(new C26088c());
                animatorSet2.setDuration(225L);
            } else {
                animatorSet2.setInterpolator(new C26086a());
                animatorSet2.setDuration(200L);
            }
            animatorSet2.addListener(new C12691l(runnable));
            return animatorSet2;
        }
        return super.mo39022HJ(z11, runnable);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f66069r1 = null;
        AnimationLayout animationLayout = this.f66049X0;
        if (animationLayout != null) {
            animationLayout.detachFromActivity();
        }
        MediaPickerView mediaPickerView = this.f66047V0;
        if (mediaPickerView != null) {
            MediaPickerView.m72109SM(mediaPickerView, null, 1, null);
            MediaPickerView.m72107QM(mediaPickerView, null, 1, null);
            MediaPickerView.m72101KO(mediaPickerView, null, 1, null);
            mediaPickerView.m72193MO();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (!m71441aN().m106473e0() && !m71441aN().m106474f0()) {
            return super.mo37488Li();
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        LandingPageView landingPageView = this.f66050Y0;
        if (landingPageView != null && landingPageView.m92674mJ()) {
            return landingPageView.mo37491QJ(i11);
        }
        if (i11 == 16908332 && m71441aN().m106473e0() && m71441aN().m106470Z(this.f66047V0)) {
            finish();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        try {
            bundle.putLong("album_id", this.f66066o1);
            bundle.putInt("album_action", this.f66067p1);
            bundle.putString("album_name", this.f66068q1);
            bundle.putInt("photo_type", this.f66053b1);
            bundle.putBoolean("open_from_camera", this.f66056e1);
            bundle.putSerializable("media_picker_source", this.f66057f1);
            bundle.putBoolean("send_from_action_list_media_picker", this.f66061j1);
            bundle.putBoolean("enable_inline_banner", this.f66058g1);
            bundle.putBoolean("action_pick_media_edit_view_enable", this.f66062k1);
            bundle.putString("action_pick_media_edit_view_aspect_ratio", this.f66063l1);
            bundle.putBoolean("open_from_dev_tool", this.f66060i1);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitleAlignCenter(true);
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
            this.f88760a0.setBackgroundColor(C23212s8.m119607o(m92689tK(), AbstractC16781w.HeaderFormColor));
            this.f88760a0.setTitleColor(C23212s8.m119607o(m92689tK(), AbstractC21196a.TextColor1));
        }
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        return C26361j.f125215a.m135697c(this);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GalleryPickerView";
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView
    /* renamed from: hM */
    protected RotatableZaloView.EnumC14966b mo39050hM() {
        return m71441aN().m106466S();
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView
    /* renamed from: lM */
    protected boolean mo39058lM() {
        return m71441aN().m106472b0();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0010. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0021 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:12:0x0017, B:17:0x001d, B:19:0x0021, B:20:0x0025, B:21:0x0034, B:22:0x0038, B:23:0x0047), top: B:2:0x0002 }] */
    @Override // com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 != 2001 && i11 != 2002) {
                if (i11 != 3000) {
                    if (i11 != 3001) {
                        switch (i11) {
                            case 3005:
                                m71445eN(i12, intent, "EXTRA_ORIGINAL_PATH", "EXTRA_CROPPED_PATH", "EXTRA_IS_ERROR", "EXTRA_ERROR_MSG");
                                break;
                            case 3006:
                            case 3007:
                                break;
                            case 3008:
                            case 3009:
                                m71452kN(i12, intent);
                                break;
                            default:
                                switch (i11) {
                                    case 3011:
                                        m71447gN(i12, intent);
                                        break;
                                    case 3012:
                                        break;
                                    case 3013:
                                        break;
                                    case 3014:
                                        m71442bN(i12, intent);
                                        break;
                                    default:
                                        return;
                                }
                        }
                    }
                    m71446fN(i12, intent);
                } else {
                    m71445eN(i12, intent, "EXTRA_ORIGINAL_PATH", "EXTRA_CROPPED_PATH", "EXTRA_IS_ERROR", "EXTRA_ERROR_MSG");
                }
            } else {
                m71443cN(i11, i12, intent);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        View m92691vK = m92691vK();
        AbstractC19074t.m100207e(m92691vK, "requireView(...)");
        m92691vK.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC12689j(m92691vK, this));
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            try {
                LandingPageView landingPageView = this.f66050Y0;
                if (landingPageView != null && landingPageView.m92674mJ()) {
                    return landingPageView.onKeyUp(i11, keyEvent);
                }
                InterfaceC12681b interfaceC12681b = this.f66065n1;
                if (interfaceC12681b != null) {
                    interfaceC12681b.mo39092y9();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        if (m71441aN().m106473e0() && m71441aN().m106470Z(this.f66047V0)) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        InterfaceC27218a m92676n2;
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 142) {
            try {
                String[] m118177s = AbstractC23034c6.m118177s();
                AbstractC19074t.m100207e(m118177s, "getCaptureCameraPermissions(...)");
                if (AbstractC23034c6.m118167n(m92686rK(), m118177s) == 0 && (m92676n2 = m92676n2()) != null) {
                    m71416EN(m92676n2);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        EnumC22962a enumC22962a;
        super.mo37135xJ(bundle);
        if (bundle == null) {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 == null) {
                finish();
            } else {
                m71441aN().m106476h0(C12695a.Companion.m71511a(m92642L3));
                m71456nN();
                m71461rN();
            }
        } else {
            this.f66067p1 = bundle.getInt("album_action", -1);
            this.f66066o1 = bundle.getLong("album_id", -1L);
            String string = bundle.getString("album_name", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f66068q1 = string;
            this.f66053b1 = bundle.getInt("photo_type", -1);
            this.f66056e1 = bundle.getBoolean("open_from_camera", false);
            this.f66058g1 = bundle.getBoolean("enable_inline_banner", false);
            Serializable serializable = bundle.getSerializable("media_picker_source");
            LandingPageView landingPageView = null;
            if (serializable instanceof EnumC22962a) {
                enumC22962a = (EnumC22962a) serializable;
            } else {
                enumC22962a = null;
            }
            if (enumC22962a == null) {
                enumC22962a = EnumC22962a.f111694r;
            }
            this.f66057f1 = enumC22962a;
            this.f66061j1 = bundle.getBoolean("send_from_action_list_media_picker", false);
            this.f66062k1 = bundle.getBoolean("action_pick_media_edit_view_enable", false);
            String string2 = bundle.getString("action_pick_media_edit_view_aspect_ratio", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f66063l1 = string2;
            this.f66060i1 = bundle.getBoolean("open_from_dev_tool", false);
            if (this.f66047V0 == null) {
                m71422HN();
                m71444dN();
                m71459qN();
                m71441aN().m106463O(this.f66047V0);
            }
            ZaloView m92996E0 = m92649TI().m92996E0("LANDING_PAGE_VIEW_TAG");
            if (m92996E0 instanceof LandingPageView) {
                landingPageView = (LandingPageView) m92996E0;
            }
            this.f66050Y0 = landingPageView;
            m71457oN();
        }
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && !m92676n2.mo35576n3()) {
            AnimationLayout animationLayout = new AnimationLayout(m92648SI());
            animationLayout.setOnEventListener(new C12688i(m92676n2, this));
            this.f66049X0 = animationLayout;
        }
    }

    /* renamed from: yN */
    public final void m71476yN() {
        if (!m92681pJ() && !m92677nJ()) {
            finish();
        }
    }

    /* renamed from: zN */
    public final void m71477zN(InterfaceC12681b interfaceC12681b) {
        AbstractC19074t.m100208f(interfaceC12681b, "galleryPickerListener");
        this.f66065n1 = interfaceC12681b;
    }
}
