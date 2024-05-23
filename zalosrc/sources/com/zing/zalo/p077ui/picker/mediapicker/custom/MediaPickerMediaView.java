package com.zing.zalo.p077ui.picker.mediapicker.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import cg.AbstractC3460h;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerMediaView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17067v;
import com.zing.zalo.zdesign.component.EnumC17065u;
import com.zing.zalo.zdesign.component.EnumC17069w;
import com.zing.zalo.zdesign.component.EnumC17071x;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.animation.AnimationTarget;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import id0.C20518d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kd0.C21693c;
import l80.C22124b0;
import l80.C22126c0;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23280z4;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p559uv.C27373c;
import p716zh.C32050o7;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import th.AbstractC26689j;
import ui0.C27280g;
import zl0.AbstractC32232i;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MediaPickerMediaView extends ModulesView {

    /* renamed from: K */
    private int f66779K;

    /* renamed from: L */
    private final boolean f66780L;

    /* renamed from: M */
    private MediaItem f66781M;

    /* renamed from: N */
    private C21693c f66782N;

    /* renamed from: O */
    private final InterfaceC24854k f66783O;

    /* renamed from: P */
    private C21693c f66784P;

    /* renamed from: Q */
    private C17067v f66785Q;

    /* renamed from: R */
    private C22126c0 f66786R;

    /* renamed from: S */
    private C22126c0 f66787S;

    /* renamed from: T */
    private C22124b0 f66788T;

    /* renamed from: U */
    private C22126c0 f66789U;

    /* renamed from: V */
    private C16716d f66790V;

    /* renamed from: W */
    private C22126c0 f66791W;

    /* renamed from: a0 */
    private Runnable f66792a0;

    /* renamed from: b0 */
    private final C23528a f66793b0;

    /* renamed from: c0 */
    private InterfaceC12853a f66794c0;

    /* renamed from: d0 */
    private String f66795d0;

    /* renamed from: e0 */
    private boolean f66796e0;

    /* renamed from: f0 */
    private boolean f66797f0;

    /* renamed from: g0 */
    private boolean f66798g0;

    /* renamed from: h0 */
    private final Handler f66799h0;

    /* renamed from: i0 */
    private final int f66800i0;

    /* renamed from: j0 */
    private float f66801j0;

    /* renamed from: k0 */
    private float f66802k0;

    /* renamed from: l0 */
    private boolean f66803l0;

    /* renamed from: m0 */
    private final Runnable f66804m0;

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerMediaView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12853a {
        /* renamed from: a */
        boolean mo72434a();

        /* renamed from: b */
        void mo72435b(MediaItem mediaItem);

        /* renamed from: c */
        void mo72436c(MediaItem mediaItem, boolean z11, boolean z12);

        /* renamed from: d */
        void mo72437d(AnimationTarget animationTarget, MediaItem mediaItem, C16719g c16719g);
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerMediaView$b */
    /* loaded from: classes6.dex */
    public static final class C12854b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C21693c f66805l1;

        /* renamed from: m1 */
        final /* synthetic */ MediaPickerMediaView f66806m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f66807n1;

        /* renamed from: o1 */
        final /* synthetic */ MediaItem f66808o1;

        /* renamed from: p1 */
        final /* synthetic */ boolean f66809p1;

        C12854b(C21693c c21693c, MediaPickerMediaView mediaPickerMediaView, boolean z11, MediaItem mediaItem, boolean z12) {
            this.f66805l1 = c21693c;
            this.f66806m1 = mediaPickerMediaView;
            this.f66807n1 = z11;
            this.f66808o1 = mediaItem;
            this.f66809p1 = z12;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            InterfaceC12853a moduleViewItemListener;
            int i11;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            try {
                if (this.f66805l1.m89133b0() != null && AbstractC19074t.m100204b(this.f66805l1.m89133b0(), str)) {
                    if (c3979l != null && c3979l.m18839c() != null) {
                        Bitmap m18839c = c3979l.m18839c();
                        this.f66806m1.getDumbThumbImageView().setImageInfo(c3979l, false);
                        this.f66806m1.f66798g0 = true;
                        if (this.f66807n1) {
                            this.f66805l1.mo111924u1(m18839c);
                        } else {
                            this.f66805l1.mo111924u1(m18839c);
                            C21693c c21693c = this.f66805l1;
                            C20518d c20518d = new C20518d();
                            if (this.f66809p1) {
                                i11 = 30;
                            } else {
                                i11 = 200;
                            }
                            c20518d.m106593j(i11);
                            c21693c.m89135c1(c20518d);
                        }
                        MediaItem mediaItem = this.f66808o1;
                        MediaPickerMediaView mediaPickerMediaView = this.f66806m1;
                        mediaItem.m41155l1(m18839c.getWidth());
                        mediaItem.m41151j1(m18839c.getHeight());
                        if (mediaItem.m41168r0() == null) {
                            mediaItem.m41133Y0(new AtomicBoolean(true));
                            mediaPickerMediaView.m72478A0();
                            return;
                        }
                        return;
                    }
                    MediaItem mediaItem2 = this.f66808o1;
                    MediaPickerMediaView mediaPickerMediaView2 = this.f66806m1;
                    if (mediaItem2.m41168r0() == null) {
                        mediaItem2.m41133Y0(new AtomicBoolean(false));
                        mediaPickerMediaView2.m72507z0();
                        if (mediaItem2.m41173u0() && (moduleViewItemListener = mediaPickerMediaView2.getModuleViewItemListener()) != null) {
                            moduleViewItemListener.mo72436c(mediaItem2, false, true);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerMediaView$c */
    /* loaded from: classes6.dex */
    static final class C12855c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f66810q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12855c(Context context) {
            super(0);
            this.f66810q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3977j mo12V4() {
            return new C3977j(this.f66810q);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerMediaView$d */
    /* loaded from: classes6.dex */
    public static final class C12856d extends C21693c {

        /* renamed from: W0 */
        private final InterfaceC24854k f66811W0;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerMediaView$d$a */
        /* loaded from: classes6.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {
            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Paint mo12V4() {
                Paint paint = new Paint();
                C12856d c12856d = C12856d.this;
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(C23212s8.m119607o(c12856d.getContext(), AbstractC16781w.ItemSeparatorColor));
                paint.setStrokeWidth(AbstractC23222t7.f112548a);
                return paint;
            }
        }

        C12856d(Context context) {
            super(context);
            InterfaceC24854k m129210a;
            m129210a = AbstractC24856m.m129210a(new a());
            this.f66811W0 = m129210a;
        }

        /* renamed from: B1 */
        public final Paint m72511B1() {
            return (Paint) this.f66811W0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
        /* renamed from: o0 */
        public void mo44775o0(Canvas canvas) {
            AbstractC19074t.m100208f(canvas, "canvas");
            super.mo44775o0(canvas);
            if (MediaPickerMediaView.this.f66798g0) {
                C21693c c21693c = MediaPickerMediaView.this.f66782N;
                AbstractC19074t.m100205c(c21693c);
                float m89114P = c21693c.m89114P();
                AbstractC19074t.m100205c(MediaPickerMediaView.this.f66782N);
                canvas.drawRect(0.0f, 0.0f, m89114P, r0.m89112O(), m72511B1());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerMediaView$e */
    /* loaded from: classes6.dex */
    public static final class C12857e implements C16719g.e {

        /* renamed from: a */
        private boolean f66814a;

        /* renamed from: b */
        private boolean f66815b;

        /* renamed from: c */
        private boolean f66816c;

        /* renamed from: d */
        private int f66817d;

        /* renamed from: e */
        private int f66818e;

        /* renamed from: g */
        private boolean f66820g;

        /* renamed from: h */
        private boolean f66821h;

        /* renamed from: l */
        final /* synthetic */ C12856d f66825l;

        /* renamed from: f */
        private int f66819f = -1;

        /* renamed from: i */
        private final float f66822i = AbstractC32232i.m155454b(0.4f, true);

        /* renamed from: j */
        private final float f66823j = AbstractC32232i.m155454b(0.4f, false);

        C12857e(C12856d c12856d) {
            this.f66825l = c12856d;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
        @Override // com.zing.zalo.uidrawing.C16719g.e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo16937a(C16719g c16719g, MotionEvent motionEvent) {
            boolean z11;
            int m116584g;
            int m116584g2;
            boolean z12;
            boolean z13;
            int i11;
            boolean z14;
            boolean z15;
            MediaItem mediaItem;
            InterfaceC12853a moduleViewItemListener;
            int i12;
            AbstractC19074t.m100208f(c16719g, "module");
            try {
                InterfaceC12853a moduleViewItemListener2 = MediaPickerMediaView.this.getModuleViewItemListener();
                if (moduleViewItemListener2 != null) {
                    z11 = moduleViewItemListener2.mo72434a();
                } else {
                    z11 = false;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (!MediaPickerMediaView.this.f66797f0 && !z11) {
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 && !this.f66816c && !this.f66815b) {
                        this.f66815b = true;
                        this.f66817d = (int) motionEvent.getX();
                        this.f66818e = (int) motionEvent.getY();
                        this.f66814a = false;
                    } else {
                        int i13 = 2;
                        if (actionMasked != 1 && actionMasked != 6) {
                            if (actionMasked == 2) {
                                float x11 = motionEvent.getX();
                                float y11 = motionEvent.getY();
                                int i14 = ((int) x11) - this.f66817d;
                                int i15 = ((int) y11) - this.f66818e;
                                if (this.f66815b && !this.f66816c) {
                                    this.f66819f = -1;
                                    if (Math.abs(i15) >= this.f66823j) {
                                        if (i15 > 0) {
                                            i12 = 1;
                                        } else {
                                            i12 = 0;
                                        }
                                        this.f66819f = i12;
                                    } else if (Math.abs(i14) >= this.f66822i * 3) {
                                        if (i14 <= 0) {
                                            i13 = 3;
                                        }
                                        this.f66819f = i13;
                                    } else {
                                        z13 = false;
                                        i11 = this.f66819f;
                                        if (i11 != 1) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        this.f66820g = z14;
                                        if (i11 != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        this.f66821h = z15;
                                        if (z13 && !z14 && !z15) {
                                            this.f66815b = false;
                                            this.f66816c = true;
                                            this.f66817d = (int) motionEvent.getX();
                                            this.f66818e = (int) motionEvent.getY();
                                            if (!this.f66814a && MediaPickerMediaView.this.m72503u0()) {
                                                this.f66814a = true;
                                                mediaItem = MediaPickerMediaView.this.f66781M;
                                                if (mediaItem != null && (moduleViewItemListener = MediaPickerMediaView.this.getModuleViewItemListener()) != null) {
                                                    moduleViewItemListener.mo72435b(mediaItem);
                                                }
                                            }
                                        }
                                    }
                                    z13 = true;
                                    i11 = this.f66819f;
                                    if (i11 != 1) {
                                    }
                                    this.f66820g = z14;
                                    if (i11 != 0) {
                                    }
                                    this.f66821h = z15;
                                    if (z13) {
                                        this.f66815b = false;
                                        this.f66816c = true;
                                        this.f66817d = (int) motionEvent.getX();
                                        this.f66818e = (int) motionEvent.getY();
                                        if (!this.f66814a) {
                                            this.f66814a = true;
                                            mediaItem = MediaPickerMediaView.this.f66781M;
                                            if (mediaItem != null) {
                                                moduleViewItemListener.mo72435b(mediaItem);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.f66816c = false;
                        this.f66815b = false;
                        if (!this.f66814a && !this.f66820g && !this.f66821h) {
                            int m89114P = this.f66825l.m89114P();
                            int m89112O = this.f66825l.m89112O();
                            m116584g = AbstractC22543l.m116584g(m89114P / 2, AbstractC23222t7.f112549a0);
                            m116584g2 = AbstractC22543l.m116584g(m89112O / 2, AbstractC23222t7.f112549a0);
                            if (MediaPickerMediaView.this.f66785Q != null && motionEvent.getX() > m116584g && motionEvent.getY() < m116584g2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!AbstractC23280z4.m120328g0(MediaPickerMediaView.this.getPhotoType()) && z12) {
                                C17067v c17067v = MediaPickerMediaView.this.f66785Q;
                                if (c17067v != null) {
                                    AbstractC19074t.m100205c(MediaPickerMediaView.this.f66785Q);
                                    c17067v.mo89091D0(!r9.m89141i0());
                                }
                            } else {
                                MediaPickerMediaView mediaPickerMediaView = MediaPickerMediaView.this;
                                mediaPickerMediaView.m72505w0(c16719g, mediaPickerMediaView.f66781M);
                            }
                        }
                        this.f66814a = false;
                    }
                } else {
                    this.f66815b = false;
                    this.f66816c = false;
                    this.f66814a = false;
                }
                return true;
            }
            this.f66815b = false;
            this.f66816c = false;
            this.f66814a = false;
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerMediaView$f */
    /* loaded from: classes6.dex */
    public static final class C12858f extends SimpleAnimationTarget {

        /* renamed from: q */
        final /* synthetic */ C16719g f66827q;

        C12858f(C16719g c16719g) {
            this.f66827q = c16719g;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            int[] iArr = new int[2];
            MediaPickerMediaView.this.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            C16719g c16719g = this.f66827q;
            rect.left = iArr[0] + c16719g.m89096G();
            rect.top = iArr[1] + c16719g.m89098H();
            rect.right = rect.left + c16719g.m89114P();
            rect.bottom = rect.top + c16719g.m89112O();
            return rect;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerMediaView(Context context, int i11, boolean z11) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f66779K = i11;
        this.f66780L = z11;
        m129210a = AbstractC24856m.m129210a(new C12855c(context));
        this.f66783O = m129210a;
        this.f66793b0 = new C23528a(context);
        this.f66799h0 = new Handler(Looper.getMainLooper());
        this.f66800i0 = ViewConfiguration.get(context).getScaledTouchSlop();
        m72500r0();
        this.f66804m0 = new Runnable() { // from class: n90.b
            @Override // java.lang.Runnable
            public final void run() {
                MediaPickerMediaView.m72504v0(MediaPickerMediaView.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public final void m72478A0() {
        String m17440h;
        C27373c c27373c;
        VideoBlendingParam videoBlendingParam;
        int i11;
        int i12;
        C16716d c16716d = this.f66790V;
        int i13 = 8;
        if (c16716d != null) {
            c16716d.mo44614b1(8);
        }
        C21693c c21693c = this.f66782N;
        if (c21693c != null) {
            c21693c.mo44614b1(0);
        }
        MediaItem mediaItem = this.f66781M;
        if (mediaItem != null) {
            if (!AbstractC23280z4.m120328g0(this.f66779K)) {
                C17067v c17067v = this.f66785Q;
                if (c17067v != null) {
                    c17067v.mo44614b1(0);
                    c17067v.mo89091D0(mediaItem.m41173u0());
                    String str = this.f66795d0;
                    if (str == null) {
                        str = "";
                    }
                    c17067v.m91352t1(str);
                }
                C21693c c21693c2 = this.f66784P;
                if (c21693c2 != null) {
                    if (mediaItem.m41173u0()) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    c21693c2.mo44614b1(i12);
                }
            } else {
                C17067v c17067v2 = this.f66785Q;
                if (c17067v2 != null) {
                    c17067v2.mo44614b1(8);
                }
                C21693c c21693c3 = this.f66784P;
                if (c21693c3 != null) {
                    c21693c3.mo44614b1(8);
                }
            }
            C22126c0 c22126c0 = this.f66789U;
            if (c22126c0 != null) {
                if (mediaItem.m41163p0()) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                c22126c0.mo44614b1(i11);
            }
            C22124b0 c22124b0 = this.f66788T;
            if (c22124b0 != null) {
                if (mediaItem instanceof VideoItem) {
                    c22124b0.mo44614b1(0);
                    C22126c0 c22126c02 = c22124b0.f108888M0;
                    if (c22126c02 != null) {
                        VideoItem videoItem = (VideoItem) mediaItem;
                        if (videoItem.m41205A1()) {
                            Serializable m41217x1 = videoItem.m41217x1();
                            if (m41217x1 instanceof C27373c) {
                                c27373c = (C27373c) m41217x1;
                            } else {
                                c27373c = null;
                            }
                            if (c27373c == null || (videoBlendingParam = c27373c.f128947T) == null || (m17440h = AbstractC3460h.m17439g(videoBlendingParam.f48265Q)) == null) {
                                m17440h = AbstractC3460h.m17440h(videoItem.m41213t1());
                            }
                        } else {
                            m17440h = AbstractC3460h.m17440h(videoItem.m41213t1());
                        }
                        c22126c02.m111959G1(m17440h);
                    }
                    if (AbstractC26689j.f126436b) {
                        if (((VideoItem) mediaItem).m41205A1()) {
                            c22124b0.f108888M0.m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.media_grid_duration_text_color));
                            Context context = getContext();
                            AbstractC19074t.m100207e(context, "getContext(...)");
                            c22124b0.m115400q1(C27280g.m139659b(context, AbstractC23322a.zds_ic_scissor_solid_16, AbstractC16801x.white), null, null, null);
                            c22124b0.m115399p1(AbstractC23222t7.f112558f);
                        } else {
                            c22124b0.f108888M0.m111962J1(-1);
                            c22124b0.m115401r1(0, 0, 0, 0);
                            c22124b0.m115399p1(0);
                        }
                    }
                } else {
                    c22124b0.mo44614b1(8);
                    c22124b0.f108888M0.m111959G1("");
                }
            }
            C22126c0 c22126c03 = this.f66787S;
            if (c22126c03 != null) {
                long j11 = C32050o7.m154655h().f147588f;
                if (j11 > 0 && mediaItem.m41095C() >= j11) {
                    i13 = 0;
                }
                c22126c03.mo44614b1(i13);
            }
        }
    }

    /* renamed from: B0 */
    private final void m72479B0() {
        removeCallbacks(this.f66804m0);
        postDelayed(this.f66804m0, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3977j getDumbThumbImageView() {
        return (C3977j) this.f66783O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m72495m0(MediaPickerMediaView mediaPickerMediaView, String str, C24003n c24003n, C21693c c21693c, boolean z11, MediaItem mediaItem, boolean z12) {
        AbstractC19074t.m100208f(mediaPickerMediaView, "this$0");
        AbstractC19074t.m100208f(str, "$thumbUrl");
        AbstractC19074t.m100208f(c24003n, "$imageOptions");
        AbstractC19074t.m100208f(c21693c, "$thumb");
        AbstractC19074t.m100208f(mediaItem, "$mediaItem");
        ((C23528a) mediaPickerMediaView.f66793b0.m123612r(mediaPickerMediaView.getDumbThumbImageView())).m123579C(str, c24003n, new C12854b(c21693c, mediaPickerMediaView, z11, mediaItem, z12).m125764I1(200));
        mediaPickerMediaView.f66792a0 = null;
    }

    /* renamed from: n0 */
    private final void m72496n0() {
        removeCallbacks(this.f66804m0);
    }

    /* renamed from: o0 */
    private final void m72497o0() {
        MediaItem mediaItem;
        InterfaceC12853a interfaceC12853a;
        if (m72503u0() && (mediaItem = this.f66781M) != null && (interfaceC12853a = this.f66794c0) != null) {
            interfaceC12853a.mo72435b(mediaItem);
        }
    }

    /* renamed from: p0 */
    private final String m72498p0(MediaItem mediaItem) {
        if (this.f66779K == 11) {
            return mediaItem.m41141e0();
        }
        String m120364z = AbstractC23280z4.m120364z(mediaItem);
        AbstractC19074t.m100207e(m120364z, "getPhotoThumbCache(...)");
        return m120364z;
    }

    /* renamed from: q0 */
    private final void m72499q0() {
        String str;
        boolean z11;
        if (!AbstractC23280z4.m120328g0(this.f66779K)) {
            C17067v c17067v = this.f66785Q;
            if (c17067v != null) {
                c17067v.mo44614b1(8);
                MediaItem mediaItem = this.f66781M;
                if (mediaItem != null) {
                    z11 = mediaItem.m41173u0();
                } else {
                    z11 = false;
                }
                c17067v.mo89091D0(z11);
            }
            C21693c c21693c = this.f66784P;
            if (c21693c != null) {
                c21693c.mo44614b1(8);
            }
            C22126c0 c22126c0 = this.f66789U;
            if (c22126c0 != null) {
                c22126c0.mo44614b1(8);
            }
            C22126c0 c22126c02 = this.f66787S;
            if (c22126c02 != null) {
                c22126c02.mo44614b1(8);
            }
        } else {
            C17067v c17067v2 = this.f66785Q;
            if (c17067v2 != null) {
                c17067v2.mo44614b1(8);
            }
            C21693c c21693c2 = this.f66784P;
            if (c21693c2 != null) {
                c21693c2.mo44614b1(8);
            }
        }
        C22124b0 c22124b0 = this.f66788T;
        if (c22124b0 != null) {
            c22124b0.mo44614b1(8);
            C22126c0 c22126c03 = c22124b0.f108888M0;
            MediaItem mediaItem2 = this.f66781M;
            if (mediaItem2 instanceof VideoItem) {
                AbstractC19074t.m100206d(mediaItem2, "null cannot be cast to non-null type com.zing.zalo.data.mediapicker.model.VideoItem");
                str = AbstractC3460h.m17440h(((VideoItem) mediaItem2).m41213t1());
            } else {
                str = "";
            }
            c22126c03.m111959G1(str);
        }
    }

    /* renamed from: r0 */
    private final void m72500r0() {
        m88987U(-1, -2);
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.ImagePlaceHolderColor));
        setGravity(15);
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_gallery_broken_image);
        int m118659K = AbstractC23136l9.m118659K(AbstractC16802y.label_margin_right_bottom);
        int m118659K2 = AbstractC23136l9.m118659K(AbstractC16802y.label_padding_horizontal_in_xml);
        int m118659K3 = AbstractC23136l9.m118659K(AbstractC16802y.label_padding_vertical_in_xml);
        int m118659K4 = AbstractC23136l9.m118659K(AbstractC16802y.label_padding_horizontal);
        int m118659K5 = AbstractC23136l9.m118659K(AbstractC16802y.label_padding);
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-1, -2).m89022F(1.0f).m89029M(15);
        c16716d.mo44614b1(8);
        c16716d.mo89109M0(new C16719g.c() { // from class: n90.d
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MediaPickerMediaView.m72501s0(MediaPickerMediaView.this, c16719g);
            }
        });
        C21693c c21693c = new C21693c(getContext());
        c21693c.m111929z1(5);
        c21693c.mo111925v1(m118665N);
        c21693c.m89106L().m89028L(-2, -2);
        c16716d.m89001g1(c21693c);
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.mo111964L1(AbstractC23136l9.m118659K(AbstractC16802y.label_text_size));
        c22126c0.mo111965M1(0);
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor2));
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_grid_error_media));
        c22126c0.m111982x1(false);
        c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
        c22126c0.m89106L().m89069v(c21693c).m89023G(c21693c).m89036T(AbstractC23136l9.m118659K(AbstractC16802y.label_padding_error));
        c16716d.m89001g1(c22126c0);
        this.f66791W = c22126c0;
        mo69681L(c16716d);
        this.f66790V = c16716d;
        C12856d c12856d = new C12856d(getContext());
        c12856d.m111929z1(5);
        c12856d.m89106L().m89028L(-1, -2).m89022F(1.0f);
        c12856d.mo89109M0(null);
        c12856d.m89113O0(new C12857e(c12856d));
        mo69681L(c12856d);
        this.f66782N = c12856d;
        C22126c0 c22126c02 = new C22126c0(getContext());
        c22126c02.m89087B0(AbstractC16803z.media_preview_grid_bg_video_duration);
        c22126c02.mo111964L1(AbstractC23136l9.m118659K(AbstractC16802y.label_text_size));
        c22126c02.mo111965M1(0);
        c22126c02.m111962J1(AbstractC23136l9.m118641B(c22126c02.getContext(), AbstractC16801x.label_duration_text_color));
        c22126c02.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_label_gif));
        c22126c02.m111982x1(false);
        c22126c02.m89106L().m89028L(-2, -2).m89019C(this.f66782N).m89067t(this.f66782N).m89035S(m118659K).m89033Q(m118659K).m89042Z(m118659K2, m118659K3, m118659K2, m118659K3);
        c22126c02.mo44614b1(8);
        mo69681L(c22126c02);
        this.f66789U = c22126c02;
        C21693c c21693c2 = new C21693c(getContext());
        c21693c2.m89087B0(AbstractC16801x.black_40);
        c21693c2.mo44614b1(8);
        c21693c2.m89106L().m89028L(-1, -2).m89022F(1.0f);
        c21693c2.mo44614b1(8);
        mo69681L(c21693c2);
        this.f66784P = c21693c2;
        C22124b0 c22124b0 = new C22124b0(getContext());
        c22124b0.m89087B0(AbstractC16803z.media_preview_grid_bg_video_duration);
        c22124b0.f108888M0.mo111964L1(AbstractC23136l9.m118659K(AbstractC16802y.label_text_size));
        c22124b0.f108888M0.mo111965M1(0);
        c22124b0.f108888M0.m111962J1(-1);
        c22124b0.f108888M0.m111982x1(false);
        c22124b0.f108888M0.m89106L().f84720p = AbstractC23222t7.f112552c;
        c22124b0.m89106L().m89028L(-2, -2).m89019C(this.f66782N).m89067t(this.f66782N).m89035S(m118659K).m89033Q(m118659K).m89042Z(m118659K2, m118659K3, m118659K2, m118659K3);
        c22124b0.mo44614b1(8);
        mo69681L(c22124b0);
        this.f66788T = c22124b0;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C17067v c17067v = new C17067v(context, EnumC17071x.MEDIUM);
        C16718f m89106L = c17067v.m89106L();
        Boolean bool = Boolean.TRUE;
        m89106L.m89018B(bool).m89017A(bool).m89036T(AbstractC23222t7.f112566j).m89035S(AbstractC23222t7.f112566j);
        c17067v.m91351s1(EnumC17069w.IMAGE);
        c17067v.m91349q1(EnumC17065u.NUMBER);
        c17067v.mo89107L0(new C16719g.b() { // from class: n90.e
            @Override // com.zing.zalo.uidrawing.C16719g.b
            /* renamed from: a */
            public final void mo945a(C16719g c16719g, boolean z11) {
                MediaPickerMediaView.m72502t0(MediaPickerMediaView.this, c16719g, z11);
            }
        });
        mo69681L(c17067v);
        this.f66785Q = c17067v;
        if (this.f66780L) {
            C22126c0 c22126c03 = new C22126c0(getContext());
            c22126c03.m89087B0(AbstractC16803z.bg_new_label);
            c22126c03.mo111964L1(AbstractC23136l9.m118659K(AbstractC16802y.label_new_text_size));
            c22126c03.mo111965M1(0);
            c22126c03.m111962J1(AbstractC23136l9.m118641B(c22126c03.getContext(), AbstractC16801x.label_duration_text_color));
            c22126c03.m111959G1(c22126c03.getContext().getString(AbstractC8020f0.str_label_new));
            c22126c03.m111982x1(false);
            c22126c03.m89106L().m89026J(true).m89036T(AbstractC23222t7.f112566j * 2).m89042Z(m118659K4, m118659K5, m118659K4, m118659K5);
            c22126c03.mo44614b1(8);
            mo69681L(c22126c03);
            this.f66787S = c22126c03;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m72501s0(MediaPickerMediaView mediaPickerMediaView, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaPickerMediaView, "this$0");
        AbstractC19074t.m100208f(c16719g, "module");
        mediaPickerMediaView.m72505w0(c16719g, mediaPickerMediaView.f66781M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static final void m72502t0(MediaPickerMediaView mediaPickerMediaView, C16719g c16719g, boolean z11) {
        InterfaceC12853a interfaceC12853a;
        int i11;
        AbstractC19074t.m100208f(mediaPickerMediaView, "this$0");
        C21693c c21693c = mediaPickerMediaView.f66784P;
        if (c21693c != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c21693c.mo44614b1(i11);
        }
        MediaItem mediaItem = mediaPickerMediaView.f66781M;
        if (mediaItem != null && (interfaceC12853a = mediaPickerMediaView.f66794c0) != null) {
            interfaceC12853a.mo72436c(mediaItem, z11, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public final boolean m72503u0() {
        InterfaceC12853a interfaceC12853a = this.f66794c0;
        if ((interfaceC12853a == null || !interfaceC12853a.mo72434a()) && !AbstractC23280z4.m120328g0(this.f66779K)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m72504v0(MediaPickerMediaView mediaPickerMediaView) {
        AbstractC19074t.m100208f(mediaPickerMediaView, "this$0");
        mediaPickerMediaView.m72497o0();
        mediaPickerMediaView.mo88988c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public final void m72505w0(C16719g c16719g, MediaItem mediaItem) {
        InterfaceC12853a interfaceC12853a = this.f66794c0;
        if (interfaceC12853a != null) {
            interfaceC12853a.mo72437d(new C12858f(c16719g), mediaItem, c16719g);
        }
    }

    /* renamed from: x0 */
    private final void m72506x0() {
        Runnable runnable = this.f66792a0;
        if (runnable != null) {
            this.f66799h0.removeCallbacks(runnable);
        }
        this.f66792a0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public final void m72507z0() {
        int i11;
        C16716d c16716d = this.f66790V;
        if (c16716d != null) {
            c16716d.mo44614b1(0);
        }
        C22126c0 c22126c0 = this.f66791W;
        if (c22126c0 != null) {
            if (this.f66781M instanceof VideoItem) {
                i11 = AbstractC8020f0.str_media_grid_error_video;
            } else {
                i11 = AbstractC8020f0.str_media_grid_error_photo_gif;
            }
            c22126c0.m111958F1(i11);
        }
        C21693c c21693c = this.f66782N;
        if (c21693c != null) {
            c21693c.mo44614b1(8);
        }
        C17067v c17067v = this.f66785Q;
        if (c17067v != null) {
            c17067v.mo44614b1(8);
        }
        C22126c0 c22126c02 = this.f66786R;
        if (c22126c02 != null) {
            c22126c02.mo44614b1(8);
        }
        C22124b0 c22124b0 = this.f66788T;
        if (c22124b0 != null) {
            c22124b0.mo44614b1(8);
        }
        C22126c0 c22126c03 = this.f66789U;
        if (c22126c03 != null) {
            c22126c03.mo44614b1(8);
        }
        C21693c c21693c2 = this.f66784P;
        if (c21693c2 != null) {
            c21693c2.mo44614b1(8);
        }
        C22126c0 c22126c04 = this.f66787S;
        if (c22126c04 != null) {
            c22126c04.mo44614b1(8);
        }
    }

    public final InterfaceC12853a getModuleViewItemListener() {
        return this.f66794c0;
    }

    public final int getPhotoType() {
        return this.f66779K;
    }

    public final String getSelectedIndex() {
        return this.f66795d0;
    }

    /* renamed from: l0 */
    public final void m72508l0(final MediaItem mediaItem, final boolean z11, int i11) {
        Boolean bool;
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        setTag(format);
        this.f66781M = mediaItem;
        this.f66797f0 = z11;
        if (mediaItem.m41168r0() != null) {
            AtomicBoolean m41168r0 = mediaItem.m41168r0();
            if (m41168r0 != null) {
                bool = Boolean.valueOf(m41168r0.get());
            } else {
                bool = null;
            }
            if (AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
                m72478A0();
            } else {
                m72507z0();
            }
        } else {
            m72499q0();
            m72506x0();
        }
        final String m72498p0 = m72498p0(mediaItem);
        final C24003n m120073H0 = C23278z2.m120073H0();
        final C21693c c21693c = this.f66782N;
        if (c21693c != null && m72498p0.length() > 0) {
            c21693c.m89129Y0(m72498p0);
            c21693c.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.chat_icloud_default));
            this.f66798g0 = false;
            final boolean m125696L2 = C23999j.m125696L2(m72498p0, m120073H0);
            Runnable runnable = new Runnable() { // from class: n90.c
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPickerMediaView.m72495m0(MediaPickerMediaView.this, m72498p0, m120073H0, c21693c, m125696L2, mediaItem, z11);
                }
            };
            if (z11 && !m125696L2) {
                if (z11 && AbstractC23280z4.m120325f()) {
                    if (!this.f66796e0) {
                        runnable.run();
                        return;
                    } else {
                        this.f66792a0 = runnable;
                        this.f66799h0.postDelayed(runnable, 100L);
                        return;
                    }
                }
                return;
            }
            runnable.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m72496n0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:            if (r0 != 3) goto L20;     */
    @Override // com.zing.zalo.uidrawing.ModulesView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f66803l0 && (Math.abs(motionEvent.getX() - this.f66801j0) > this.f66800i0 || Math.abs(motionEvent.getY() - this.f66802k0) > this.f66800i0)) {
                        m72496n0();
                        this.f66803l0 = true;
                    }
                }
            }
            m72496n0();
        } else {
            this.f66801j0 = motionEvent.getX();
            this.f66802k0 = motionEvent.getY();
            this.f66803l0 = false;
            m72479B0();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBeingDragged(boolean z11) {
        this.f66796e0 = z11;
    }

    public final void setModuleViewItemListener(InterfaceC12853a interfaceC12853a) {
        this.f66794c0 = interfaceC12853a;
    }

    public final void setPhotoType(int i11) {
        this.f66779K = i11;
    }

    public final void setSelectedIndex(String str) {
        this.f66795d0 = str;
    }

    /* renamed from: y0 */
    public final void m72509y0() {
        try {
            if (this.f66781M != null) {
                C21693c c21693c = this.f66782N;
                if (c21693c != null) {
                    c21693c.mo111924u1(null);
                    c21693c.m89129Y0(null);
                }
                m72499q0();
                m72506x0();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
