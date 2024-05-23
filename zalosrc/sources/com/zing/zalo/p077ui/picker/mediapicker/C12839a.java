package com.zing.zalo.p077ui.picker.mediapicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import au.C2370r0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.mediapicker.model.CameraEmptyItem;
import com.zing.zalo.data.mediapicker.model.CameraPhotoItem;
import com.zing.zalo.data.mediapicker.model.CameraVideoItem;
import com.zing.zalo.data.mediapicker.model.InlineBannerItem;
import com.zing.zalo.data.mediapicker.model.MediaEmptyItem;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.StoragePermissionDenyItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.picker.mediapicker.C12839a;
import com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerCameraContainer;
import com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerInlineBannerView;
import com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerMediaView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.animation.AnimationTarget;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import i40.C20275e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23202r9;
import me0.AbstractC23244v8;
import me0.AbstractC23280z4;
import me0.C23212s8;
import ml.C23343a;
import on0.AbstractC24342w;
import p269jj.C21275a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p649xl.C30100w7;
import p649xl.C30117x7;
import p649xl.C30134y7;
import sj.C26275a;
import vc0.C27962a;
import zh0.AbstractC32212c;

/* renamed from: com.zing.zalo.ui.picker.mediapicker.a */
/* loaded from: classes6.dex */
public final class C12839a extends RecyclerView.AbstractC1880g implements AbstractC11859g.c {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final List f66704A;

    /* renamed from: B */
    private int f66705B;

    /* renamed from: C */
    private boolean f66706C;

    /* renamed from: D */
    private boolean f66707D;

    /* renamed from: E */
    private boolean f66708E;

    /* renamed from: F */
    private boolean f66709F;

    /* renamed from: G */
    private int f66710G;

    /* renamed from: r */
    private final Context f66711r;

    /* renamed from: s */
    private final C21275a f66712s;

    /* renamed from: t */
    private RecyclerView f66713t;

    /* renamed from: u */
    private boolean f66714u;

    /* renamed from: v */
    private boolean f66715v;

    /* renamed from: w */
    private boolean f66716w;

    /* renamed from: x */
    private b f66717x;

    /* renamed from: y */
    private c f66718y;

    /* renamed from: z */
    private C20275e f66719z;

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: a */
        boolean mo72310a();
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$c */
    /* loaded from: classes6.dex */
    public interface c {
        /* renamed from: En */
        void mo72182En(MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e);

        /* renamed from: J6 */
        void mo72187J6(int[] iArr);

        /* renamed from: Md */
        void mo72194Md(MediaItem mediaItem, boolean z11, int i11, boolean z12);

        /* renamed from: q7 */
        void mo72244q7(MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e);

        /* renamed from: t2 */
        void mo72246t2();

        /* renamed from: w1 */
        void mo72249w1(View view);

        /* renamed from: wH */
        int mo72250wH(MediaItem mediaItem);

        /* renamed from: xG */
        void mo72252xG(MediaItem mediaItem, int i11);
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$d */
    /* loaded from: classes6.dex */
    public static final class d extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final MediaPickerCameraContainer f66720I;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$d$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m72420a(ViewGroup viewGroup, int i11, boolean z11) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new d(new MediaPickerCameraContainer(context, i11, z11));
            }
        }

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$d$b */
        /* loaded from: classes6.dex */
        public static final class b implements MediaPickerCameraContainer.InterfaceC12842a {

            /* renamed from: a */
            final /* synthetic */ c f66721a;

            b(c cVar) {
                this.f66721a = cVar;
            }

            @Override // com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerCameraContainer.InterfaceC12842a
            /* renamed from: w1 */
            public void mo72421w1(View view) {
                c cVar = this.f66721a;
                if (cVar != null) {
                    cVar.mo72249w1(view);
                }
                AbstractC23309i.m121459Tj(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MediaPickerCameraContainer mediaPickerCameraContainer) {
            super(mediaPickerCameraContainer);
            AbstractC19074t.m100208f(mediaPickerCameraContainer, "cameraView");
            this.f66720I = mediaPickerCameraContainer;
        }

        /* renamed from: i0 */
        public final void m72419i0(MediaItem mediaItem, c cVar) {
            AbstractC19074t.m100208f(mediaItem, "mediaItem");
            MediaPickerCameraContainer mediaPickerCameraContainer = this.f66720I;
            mediaPickerCameraContainer.m72452a(mediaItem);
            mediaPickerCameraContainer.setItemListener(new b(cVar));
            if (!mediaPickerCameraContainer.m72453b() || AbstractC32212c.m155335e(this.f7784p.getContext())) {
                return;
            }
            int[] iArr = {mediaPickerCameraContainer.getWidth(), mediaPickerCameraContainer.getHeight()};
            if (cVar != null) {
                cVar.mo72187J6(iArr);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$e */
    /* loaded from: classes6.dex */
    public static final class e extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C30100w7 f66722I;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$e$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final e m72423a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C30100w7 m148651c = C30100w7.m148651c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148651c, "inflate(...)");
                return new e(m148651c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C30100w7 c30100w7) {
            super(c30100w7.getRoot());
            AbstractC19074t.m100208f(c30100w7, "binding");
            this.f66722I = c30100w7;
        }

        /* renamed from: i0 */
        public final void m72422i0() {
            this.f66722I.f139793r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_picker_empty_gallery));
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$f */
    /* loaded from: classes6.dex */
    public static final class f extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C30117x7 f66723I;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$f$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final f m72425a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C30117x7 m148690c = C30117x7.m148690c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148690c, "inflate(...)");
                return new f(m148690c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C30117x7 c30117x7) {
            super(c30117x7.getRoot());
            AbstractC19074t.m100208f(c30117x7, "binding");
            this.f66723I = c30117x7;
        }

        /* renamed from: i0 */
        public final void m72424i0(int i11, View.OnClickListener onClickListener) {
            String m118743r0;
            int m127172a0;
            if (AbstractC23280z4.m120350r0(i11)) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_gallery_openvideocamera);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_gallery_opencamera);
            }
            AbstractC19074t.m100205c(m118743r0);
            SpannableString spannableString = new SpannableString(m118743r0);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C23212s8.m119607o(this.f66723I.getRoot().getContext(), AbstractC16781w.AppPrimaryColor));
                m127172a0 = AbstractC24342w.m127172a0(m118743r0, '\n', 0, false, 6, null);
                spannableString.setSpan(foregroundColorSpan, m127172a0 + 1, m118743r0.length(), 33);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            C30117x7 c30117x7 = this.f66723I;
            c30117x7.f139909s.setText(spannableString);
            c30117x7.f139908r.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$g */
    /* loaded from: classes6.dex */
    public static final class g extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final MediaPickerInlineBannerView f66724I;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$g$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final g m72428a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                return new g(new MediaPickerInlineBannerView(viewGroup));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MediaPickerInlineBannerView mediaPickerInlineBannerView) {
            super(mediaPickerInlineBannerView);
            AbstractC19074t.m100208f(mediaPickerInlineBannerView, "inlineBannerView");
            this.f66724I = mediaPickerInlineBannerView;
        }

        /* renamed from: i0 */
        public final void m72426i0(MediaItem mediaItem, View.OnClickListener onClickListener) {
            AbstractC19074t.m100208f(mediaItem, "mediaItem");
            AbstractC19074t.m100208f(onClickListener, "onClickListener");
            MediaPickerInlineBannerView mediaPickerInlineBannerView = this.f66724I;
            mediaPickerInlineBannerView.setInlineBannerItem(mediaItem);
            mediaPickerInlineBannerView.setActionListener(onClickListener);
        }

        /* renamed from: j0 */
        public final MediaPickerInlineBannerView m72427j0() {
            return this.f66724I;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$h */
    /* loaded from: classes6.dex */
    public static final class h extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final MediaPickerMediaView f66725I;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$h$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final h m72431a(ViewGroup viewGroup, int i11, boolean z11) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new h(new MediaPickerMediaView(context, i11, z11));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MediaPickerMediaView mediaPickerMediaView) {
            super(mediaPickerMediaView);
            AbstractC19074t.m100208f(mediaPickerMediaView, "mediaView");
            this.f66725I = mediaPickerMediaView;
        }

        /* renamed from: i0 */
        public final void m72429i0(MediaItem mediaItem, int i11, int i12, String str, boolean z11, boolean z12, MediaPickerMediaView.InterfaceC12853a interfaceC12853a) {
            AbstractC19074t.m100208f(mediaItem, "mediaItem");
            AbstractC19074t.m100208f(str, "index");
            AbstractC19074t.m100208f(interfaceC12853a, "itemListener");
            MediaPickerMediaView mediaPickerMediaView = this.f66725I;
            mediaPickerMediaView.setBeingDragged(z11);
            mediaPickerMediaView.setPhotoType(i11);
            mediaPickerMediaView.setSelectedIndex(str);
            mediaPickerMediaView.m72508l0(mediaItem, z12, i12);
            mediaPickerMediaView.setModuleViewItemListener(interfaceC12853a);
        }

        /* renamed from: j0 */
        public final MediaPickerMediaView m72430j0() {
            return this.f66725I;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$i */
    /* loaded from: classes6.dex */
    public static final class i extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C30134y7 f66726I;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$i$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final i m72433a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C30134y7 m148734c = C30134y7.m148734c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148734c, "inflate(...)");
                return new i(m148734c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C30134y7 c30134y7) {
            super(c30134y7.getRoot());
            AbstractC19074t.m100208f(c30134y7, "binding");
            this.f66726I = c30134y7;
        }

        /* renamed from: i0 */
        public final void m72432i0(View.OnClickListener onClickListener) {
            this.f66726I.f140020q.setOnClickListener(onClickListener);
            this.f66726I.f140021r.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$j */
    /* loaded from: classes6.dex */
    public static final class j extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ MediaItem f66727p;

        /* renamed from: q */
        final /* synthetic */ C12839a f66728q;

        j(MediaItem mediaItem, C12839a c12839a) {
            this.f66727p = mediaItem;
            this.f66728q = c12839a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            MediaItem mediaItem = this.f66727p;
            AbstractC19074t.m100206d(mediaItem, "null cannot be cast to non-null type com.zing.zalo.data.mediapicker.model.InlineBannerItem");
            C26275a m41091s1 = ((InlineBannerItem) mediaItem).m41091s1();
            C23343a.m122749b(this.f66728q.f66712s, m41091s1.m135171g(), m41091s1.m135170f());
            this.f66728q.f66704A.remove(0);
            this.f66728q.m10008p();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$k */
    /* loaded from: classes6.dex */
    public static final class k implements MediaPickerMediaView.InterfaceC12853a {

        /* renamed from: b */
        final /* synthetic */ int f66730b;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.a$k$a */
        /* loaded from: classes6.dex */
        public static final class a extends C20275e {

            /* renamed from: A */
            final /* synthetic */ int f66731A;

            /* renamed from: z */
            final /* synthetic */ C12839a f66732z;

            a(C12839a c12839a, int i11) {
                this.f66732z = c12839a;
                this.f66731A = i11;
            }

            @Override // i40.C20275e
            /* renamed from: e */
            public String mo72438e(int i11) {
                if (AbstractC23280z4.m120327g(this.f66732z.m72401Z(), 10, 19, 11)) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(i11 + this.f66731A)}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    return format;
                }
                C19067n0 c19067n02 = C19067n0.f94947a;
                String format2 = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(i11 + 1 + this.f66731A)}, 1));
                AbstractC19074t.m100207e(format2, "format(...)");
                return format2;
            }

            @Override // i40.C20275e
            /* renamed from: h */
            public int mo36887h(int i11) {
                return i11;
            }
        }

        k(int i11) {
            this.f66730b = i11;
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerMediaView.InterfaceC12853a
        /* renamed from: a */
        public boolean mo72434a() {
            return C12839a.this.m72403b0();
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerMediaView.InterfaceC12853a
        /* renamed from: b */
        public void mo72435b(MediaItem mediaItem) {
            AbstractC19074t.m100208f(mediaItem, "item");
            c m72399X = C12839a.this.m72399X();
            if (m72399X != null) {
                m72399X.mo72252xG(mediaItem, this.f66730b);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerMediaView.InterfaceC12853a
        /* renamed from: c */
        public void mo72436c(MediaItem mediaItem, boolean z11, boolean z12) {
            AbstractC19074t.m100208f(mediaItem, "item");
            c m72399X = C12839a.this.m72399X();
            if (m72399X != null) {
                m72399X.mo72194Md(mediaItem, z11, this.f66730b, z12);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerMediaView.InterfaceC12853a
        /* renamed from: d */
        public void mo72437d(AnimationTarget animationTarget, MediaItem mediaItem, C16719g c16719g) {
            try {
                boolean m72405d0 = C12839a.this.m72405d0();
                C12839a c12839a = C12839a.this;
                c12839a.f66719z = new a(c12839a, m72405d0 ? 1 : 0);
                C20275e c20275e = C12839a.this.f66719z;
                if (c20275e != null) {
                    c20275e.m105861G(new C2370r0(C12839a.this.f66713t));
                }
                if (AbstractC23280z4.m120327g(C12839a.this.m72401Z(), 10, 11, 19, 9)) {
                    C20275e c20275e2 = C12839a.this.f66719z;
                    if (c20275e2 != null) {
                        c20275e2.m105865K(this.f66730b + (m72405d0 ? 1 : 0));
                    }
                } else {
                    C20275e c20275e3 = C12839a.this.f66719z;
                    if (c20275e3 != null) {
                        c20275e3.m105865K((this.f66730b - 1) + (m72405d0 ? 1 : 0));
                    }
                }
                if (mediaItem instanceof VideoItem) {
                    c m72399X = C12839a.this.m72399X();
                    if (m72399X != null) {
                        m72399X.mo72244q7(mediaItem, animationTarget, this.f66730b, C12839a.this.f66719z);
                        return;
                    }
                    return;
                }
                c m72399X2 = C12839a.this.m72399X();
                if (m72399X2 != null) {
                    m72399X2.mo72182En(mediaItem, animationTarget, this.f66730b, C12839a.this.f66719z);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C12839a(Context context, C21275a c21275a, int i11, AbstractC19060k abstractC19060k) {
        this(context, c21275a);
        if ((i11 & 2) != 0) {
            c21275a = AbstractC23306f.m120583H();
            AbstractC19074t.m100207e(c21275a, "provideCommonRepo(...)");
        }
    }

    /* renamed from: T */
    private final void m72390T() {
        Parcelable cameraPhotoItem;
        if (AbstractC23280z4.m120307S(this.f66705B)) {
            this.f66708E = true;
            List list = this.f66704A;
            if (AbstractC23280z4.m120350r0(this.f66705B)) {
                cameraPhotoItem = new CameraVideoItem();
            } else {
                cameraPhotoItem = new CameraPhotoItem();
            }
            list.add(0, cameraPhotoItem);
        }
    }

    /* renamed from: U */
    private final void m72391U() {
        Parcelable mediaEmptyItem;
        List list = this.f66704A;
        if (AbstractC23280z4.m120307S(this.f66705B)) {
            mediaEmptyItem = new CameraEmptyItem();
        } else {
            mediaEmptyItem = new MediaEmptyItem();
        }
        list.add(mediaEmptyItem);
    }

    /* renamed from: V */
    private final void m72392V() {
        boolean z11;
        C26275a m122751d;
        if (Build.VERSION.SDK_INT >= 34 && AbstractC23034c6.m118124J(MainApplication.Companion.m35500c())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f66714u && !z11 && (m122751d = C23343a.m122751d(this.f66712s, this.f66710G)) != null) {
            this.f66709F = true;
            this.f66704A.add(0, new InlineBannerItem(m122751d));
        }
    }

    /* renamed from: W */
    private final void m72393W() {
        this.f66704A.add(new StoragePermissionDenyItem());
    }

    /* renamed from: g0 */
    private final void m72394g0(List list) {
        this.f66704A.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m72395h0(C12839a c12839a, RecyclerView.AbstractC1876c0 abstractC1876c0, MediaItem mediaItem, View view) {
        AbstractC19074t.m100208f(c12839a, "this$0");
        AbstractC19074t.m100208f(abstractC1876c0, "$holder");
        AbstractC19074t.m100208f(mediaItem, "$mediaItem");
        c12839a.f66709F = false;
        g gVar = (g) abstractC1876c0;
        AbstractC23202r9.m119543k(gVar.m72427j0(), gVar.m72427j0().getHeight(), new j(mediaItem, c12839a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m72396i0(C12839a c12839a, View view) {
        AbstractC19074t.m100208f(c12839a, "this$0");
        c cVar = c12839a.f66718y;
        if (cVar != null) {
            cVar.mo72249w1(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m72397j0(C12839a c12839a, View view) {
        AbstractC19074t.m100208f(c12839a, "this$0");
        c cVar = c12839a.f66718y;
        if (cVar != null) {
            cVar.mo72246t2();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: w0 */
    private final void m72398w0(MediaItem mediaItem, int i11) {
        ?? r02 = this.f66708E;
        int i12 = r02;
        if (this.f66709F) {
            i12 = r02 + 1;
        }
        mediaItem.m41135Z0(i11 - i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(final RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        boolean z11;
        c cVar;
        String str;
        int mo72250wH;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        final MediaItem mediaItem = (MediaItem) this.f66704A.get(i11);
        try {
            if (abstractC1876c0 instanceof g) {
                ((g) abstractC1876c0).m72426i0(mediaItem, new View.OnClickListener() { // from class: l90.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C12839a.m72395h0(C12839a.this, abstractC1876c0, mediaItem, view);
                    }
                });
                return;
            }
            if (abstractC1876c0 instanceof d) {
                ((d) abstractC1876c0).m72419i0(mediaItem, this.f66718y);
                return;
            }
            if (abstractC1876c0 instanceof h) {
                boolean m72402a0 = m72402a0();
                if (!this.f66706C && !m72402a0) {
                    z11 = false;
                    cVar = this.f66718y;
                    str = "";
                    if (cVar != null && (mo72250wH = cVar.mo72250wH(mediaItem)) != -1) {
                        str = String.valueOf(mo72250wH);
                    }
                    m72398w0(mediaItem, i11);
                    ((h) abstractC1876c0).m72429i0(mediaItem, this.f66705B, i11, str, m72402a0, z11, new k(i11));
                    return;
                }
                z11 = true;
                cVar = this.f66718y;
                str = "";
                if (cVar != null) {
                    str = String.valueOf(mo72250wH);
                }
                m72398w0(mediaItem, i11);
                ((h) abstractC1876c0).m72429i0(mediaItem, this.f66705B, i11, str, m72402a0, z11, new k(i11));
                return;
            }
            if (abstractC1876c0 instanceof e) {
                ((e) abstractC1876c0).m72422i0();
            } else if (abstractC1876c0 instanceof f) {
                ((f) abstractC1876c0).m72424i0(this.f66705B, new View.OnClickListener() { // from class: l90.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C12839a.m72396i0(C12839a.this, view);
                    }
                });
            } else if (abstractC1876c0 instanceof i) {
                ((i) abstractC1876c0).m72432i0(new View.OnClickListener() { // from class: l90.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C12839a.m72397j0(C12839a.this, view);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        boolean z11;
        AbstractC19074t.m100208f(viewGroup, "parent");
        switch (i11) {
            case 1:
                return g.Companion.m72428a(viewGroup);
            case 2:
                if (this.f66716w && this.f66705B != 5 && AbstractC23034c6.m118114C(this.f66711r, "android.permission.CAMERA")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return d.Companion.m72420a(viewGroup, this.f66705B, z11);
            case 3:
                return h.Companion.m72431a(viewGroup, this.f66705B, this.f66715v);
            case 4:
                return e.Companion.m72423a(viewGroup);
            case 5:
                return f.Companion.m72425a(viewGroup);
            case 6:
                return i.Companion.m72433a(viewGroup);
            default:
                throw new ClassCastException("Unknown viewType " + i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: H */
    public void mo9997H(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        super.mo9997H(abstractC1876c0);
        if (abstractC1876c0 instanceof h) {
            ((h) abstractC1876c0).m72430j0().m72509y0();
        }
    }

    /* renamed from: X */
    public final c m72399X() {
        return this.f66718y;
    }

    /* renamed from: Y */
    public final MediaItem m72400Y(String str) {
        for (MediaItem mediaItem : this.f66704A) {
            if (AbstractC19074t.m100204b(mediaItem.mo41081Q(), str)) {
                return mediaItem;
            }
        }
        return null;
    }

    /* renamed from: Z */
    public final int m72401Z() {
        return this.f66705B;
    }

    /* renamed from: a0 */
    public final boolean m72402a0() {
        b bVar = this.f66717x;
        if (bVar != null) {
            return bVar.mo72310a();
        }
        return false;
    }

    /* renamed from: b0 */
    public final boolean m72403b0() {
        return this.f66707D;
    }

    /* renamed from: c0 */
    public final boolean m72404c0() {
        return this.f66708E;
    }

    /* renamed from: d0 */
    public final boolean m72405d0() {
        return this.f66709F;
    }

    /* renamed from: e0 */
    public final boolean m72406e0(int i11) {
        if (this.f66704A.size() <= 0) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) this.f66704A.get(i11);
        if (!(mediaItem instanceof InlineBannerItem) && !(mediaItem instanceof MediaEmptyItem) && !(mediaItem instanceof CameraEmptyItem) && !(mediaItem instanceof StoragePermissionDenyItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public final boolean m72407f0() {
        return this.f66706C;
    }

    @Override // com.zing.zalo.p077ui.custom.AbstractC11859g.c
    /* renamed from: g */
    public String mo36810g(int i11) {
        MediaItem mediaItem = (MediaItem) this.f66704A.get(i11);
        if (mediaItem.m41111M() == 3) {
            String m119738b = AbstractC23244v8.m119738b(AbstractC23160o0.m119305y0(mediaItem.m41095C()));
            AbstractC19074t.m100207e(m119738b, "capitalize(...)");
            return m119738b;
        }
        return "";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f66704A.size();
    }

    /* renamed from: k0 */
    public final void m72408k0(int i11, int i12, boolean z11, int i13) {
        boolean z12;
        int i14;
        int i15;
        if (i11 >= 0 && i12 < this.f66704A.size()) {
            if (i13 != C27962a.f130366F && i11 != i12) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                i14 = i11;
            } else {
                i14 = i12;
            }
            if (z12) {
                i11 = i12;
            }
            if (z12) {
                i15 = 1;
            } else {
                i15 = -1;
            }
            while (true) {
                MediaItem mediaItem = (MediaItem) this.f66704A.get(i14);
                c cVar = this.f66718y;
                if (cVar != null) {
                    cVar.mo72194Md(mediaItem, z11, i14, true);
                }
                i14 += i15;
                if (!z12 || i14 > i11) {
                    if (z12 || i14 < i11) {
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    /* renamed from: l0 */
    public final void m72409l0(b bVar) {
        this.f66717x = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        MediaItem mediaItem = (MediaItem) this.f66704A.get(i11);
        if (mediaItem instanceof InlineBannerItem) {
            return 1;
        }
        if ((mediaItem instanceof CameraPhotoItem) || (mediaItem instanceof CameraVideoItem)) {
            return 2;
        }
        if (mediaItem instanceof MediaEmptyItem) {
            return 4;
        }
        if (mediaItem instanceof CameraEmptyItem) {
            return 5;
        }
        if (mediaItem instanceof StoragePermissionDenyItem) {
            return 6;
        }
        return 3;
    }

    /* renamed from: m0 */
    public final void m72410m0(boolean z11) {
        this.f66714u = z11;
    }

    /* renamed from: o0 */
    public final void m72411o0(boolean z11) {
        this.f66707D = z11;
    }

    /* renamed from: p0 */
    public final void m72412p0(c cVar) {
        this.f66718y = cVar;
    }

    /* renamed from: q0 */
    public final void m72413q0(int i11) {
        this.f66710G = i11;
    }

    /* renamed from: r0 */
    public final void m72414r0(List list) {
        boolean m118127M;
        this.f66704A.clear();
        if (AbstractC23280z4.m120316a0(this.f66705B)) {
            m118127M = AbstractC23034c6.m118128N();
        } else if (AbstractC23280z4.m120350r0(this.f66705B)) {
            m118127M = AbstractC23034c6.m118129O();
        } else {
            m118127M = AbstractC23034c6.m118127M();
        }
        if (!m118127M) {
            m72393W();
            return;
        }
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            m72394g0(list);
            m72390T();
            m72392V();
            return;
        }
        m72391U();
    }

    /* renamed from: s0 */
    public final void m72415s0(int i11) {
        this.f66705B = i11;
    }

    /* renamed from: t0 */
    public final void m72416t0(boolean z11) {
        this.f66706C = z11;
    }

    /* renamed from: u0 */
    public final void m72417u0(boolean z11) {
        this.f66715v = z11;
    }

    /* renamed from: v0 */
    public final void m72418v0(boolean z11) {
        this.f66716w = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: z */
    public void mo10018z(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        super.mo10018z(recyclerView);
        this.f66713t = recyclerView;
    }

    public C12839a(Context context, C21275a c21275a) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c21275a, "commonRepo");
        this.f66711r = context;
        this.f66712s = c21275a;
        this.f66704A = new ArrayList();
        this.f66705B = -1;
        this.f66710G = -1;
        m9999J(true);
    }
}
