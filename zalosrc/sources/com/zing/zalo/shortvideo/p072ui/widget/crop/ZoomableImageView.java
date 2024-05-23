package com.zing.zalo.shortvideo.p072ui.widget.crop;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p667y2.C30268e;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes5.dex */
public final class ZoomableImageView extends AppCompatImageView {

    /* renamed from: A */
    private boolean f54255A;

    /* renamed from: B */
    private boolean f54256B;

    /* renamed from: C */
    private C10739i f54257C;

    /* renamed from: D */
    private SizeF f54258D;

    /* renamed from: E */
    private SizeF f54259E;

    /* renamed from: F */
    private SizeF f54260F;

    /* renamed from: G */
    private SizeF f54261G;

    /* renamed from: H */
    private SizeF f54262H;

    /* renamed from: I */
    private ScaleGestureDetector f54263I;

    /* renamed from: J */
    private GestureDetector f54264J;

    /* renamed from: K */
    private GestureDetector.OnDoubleTapListener f54265K;

    /* renamed from: L */
    private View.OnTouchListener f54266L;

    /* renamed from: M */
    private InterfaceC10735e f54267M;

    /* renamed from: N */
    private RectF f54268N;

    /* renamed from: O */
    private float f54269O;

    /* renamed from: p */
    private Matrix f54270p;

    /* renamed from: q */
    private Matrix f54271q;

    /* renamed from: r */
    private EnumC10737g f54272r;

    /* renamed from: s */
    private float f54273s;

    /* renamed from: t */
    private float f54274t;

    /* renamed from: u */
    private float f54275u;

    /* renamed from: v */
    private float f54276v;

    /* renamed from: w */
    private float[] f54277w;

    /* renamed from: x */
    private RunnableC10733c f54278x;

    /* renamed from: y */
    private final PointF f54279y;

    /* renamed from: z */
    private ImageView.ScaleType f54280z;

    /* loaded from: classes5.dex */
    public static final class SavedState extends View.BaseSavedState {

        /* renamed from: p */
        private final float f54281p;

        /* renamed from: q */
        private final float[] f54282q;

        /* renamed from: r */
        private final SizeF f54283r;

        /* renamed from: s */
        private final SizeF f54284s;

        /* renamed from: t */
        private final boolean f54285t;
        public static final C10730b Companion = new C10730b(null);
        public static final Parcelable.Creator<SavedState> CREATOR = new C10729a();

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$SavedState$a */
        /* loaded from: classes5.dex */
        public static final class C10729a implements Parcelable.Creator {
            C10729a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$SavedState$b */
        /* loaded from: classes5.dex */
        public static final class C10730b {
            private C10730b() {
            }

            public /* synthetic */ C10730b(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable, float f11, float[] fArr, SizeF sizeF, SizeF sizeF2, boolean z11) {
            super(parcelable);
            AbstractC19074t.m100208f(parcelable, "superState");
            AbstractC19074t.m100208f(fArr, "matrix");
            AbstractC19074t.m100208f(sizeF, "prevMatchViewSize");
            AbstractC19074t.m100208f(sizeF2, "prevViewSize");
            this.f54281p = f11;
            this.f54282q = fArr;
            this.f54283r = sizeF;
            this.f54284s = sizeF2;
            this.f54285t = z11;
        }

        /* renamed from: a */
        public final float m55889a() {
            return this.f54281p;
        }

        /* renamed from: b */
        public final boolean m55890b() {
            return this.f54285t;
        }

        /* renamed from: c */
        public final float[] m55891c() {
            return this.f54282q;
        }

        /* renamed from: d */
        public final SizeF m55892d() {
            return this.f54283r;
        }

        /* renamed from: e */
        public final SizeF m55893e() {
            return this.f54284s;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            super.writeToParcel(parcel, i11);
            parcel.writeFloat(this.f54281p);
            parcel.writeFloatArray(this.f54282q);
            parcel.writeParcelable(this.f54283r, i11);
            parcel.writeParcelable(this.f54284s, i11);
            parcel.writeInt(this.f54285t ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel parcel) {
            super(parcel);
            AbstractC19074t.m100208f(parcel, "source");
            this.f54281p = parcel.readFloat();
            float[] createFloatArray = parcel.createFloatArray();
            AbstractC19074t.m100205c(createFloatArray);
            this.f54282q = createFloatArray;
            Parcelable readParcelable = parcel.readParcelable(SizeF.class.getClassLoader());
            AbstractC19074t.m100205c(readParcelable);
            this.f54283r = (SizeF) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(SizeF.class.getClassLoader());
            AbstractC19074t.m100205c(readParcelable2);
            this.f54284s = (SizeF) readParcelable2;
            this.f54285t = parcel.readInt() == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$a */
    /* loaded from: classes5.dex */
    public final class C10731a {

        /* renamed from: a */
        public Scroller f54286a;

        /* renamed from: b */
        private OverScroller f54287b;

        /* renamed from: c */
        private boolean f54288c;

        /* renamed from: d */
        final /* synthetic */ ZoomableImageView f54289d;

        public C10731a(ZoomableImageView zoomableImageView, Context context) {
            AbstractC19074t.m100208f(context, "context");
            this.f54289d = zoomableImageView;
            this.f54288c = false;
            this.f54287b = new OverScroller(context);
        }

        /* renamed from: a */
        public final boolean m55896a() {
            if (this.f54288c) {
                return m55901f().computeScrollOffset();
            }
            this.f54287b.computeScrollOffset();
            return this.f54287b.computeScrollOffset();
        }

        /* renamed from: b */
        public final void m55897b(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            if (this.f54288c) {
                m55901f().fling(i11, i12, i13, i14, i15, i16, i17, i18);
            } else {
                this.f54287b.fling(i11, i12, i13, i14, i15, i16, i17, i18);
            }
        }

        /* renamed from: c */
        public final void m55898c(boolean z11) {
            if (this.f54288c) {
                m55901f().forceFinished(z11);
            } else {
                this.f54287b.forceFinished(z11);
            }
        }

        /* renamed from: d */
        public final int m55899d() {
            if (this.f54288c) {
                return m55901f().getCurrX();
            }
            return this.f54287b.getCurrX();
        }

        /* renamed from: e */
        public final int m55900e() {
            if (this.f54288c) {
                return m55901f().getCurrY();
            }
            return this.f54287b.getCurrY();
        }

        /* renamed from: f */
        public final Scroller m55901f() {
            Scroller scroller = this.f54286a;
            if (scroller != null) {
                return scroller;
            }
            AbstractC19074t.m100223u("scroller");
            return null;
        }

        /* renamed from: g */
        public final boolean m55902g() {
            if (this.f54288c) {
                return m55901f().isFinished();
            }
            return this.f54287b.isFinished();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$b */
    /* loaded from: classes5.dex */
    private final class RunnableC10732b implements Runnable {

        /* renamed from: p */
        private final float f54290p;

        /* renamed from: q */
        private final boolean f54291q;

        /* renamed from: r */
        private final long f54292r;

        /* renamed from: s */
        private final float f54293s;

        /* renamed from: t */
        private final float f54294t;

        /* renamed from: u */
        private final float f54295u;

        /* renamed from: v */
        private final AccelerateDecelerateInterpolator f54296v = new AccelerateDecelerateInterpolator();

        /* renamed from: w */
        private final PointF f54297w;

        /* renamed from: x */
        private final PointF f54298x;

        public RunnableC10732b(float f11, float f12, float f13, boolean z11) {
            this.f54290p = f11;
            this.f54291q = z11;
            ZoomableImageView.this.f54272r = EnumC10737g.f54310t;
            this.f54292r = System.currentTimeMillis();
            this.f54293s = ZoomableImageView.this.getCurrentZoom();
            PointF m55865O = ZoomableImageView.this.m55865O(f12, f13, false);
            float f14 = m55865O.x;
            this.f54294t = f14;
            float f15 = m55865O.y;
            this.f54295u = f15;
            this.f54297w = ZoomableImageView.this.m55864N(f14, f15);
            float f16 = 2;
            this.f54298x = new PointF(ZoomableImageView.this.f54259E.m55843c() / f16, ZoomableImageView.this.f54259E.m55841a() / f16);
        }

        /* renamed from: a */
        private final double m55903a(float f11) {
            float f12 = this.f54293s;
            return (f12 + (f11 * (this.f54290p - f12))) / ZoomableImageView.this.getCurrentZoom();
        }

        /* renamed from: b */
        private final float m55904b() {
            return this.f54296v.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f54292r)) / 300.0f));
        }

        /* renamed from: c */
        private final void m55905c(float f11) {
            PointF pointF = this.f54297w;
            float f12 = pointF.x;
            PointF pointF2 = this.f54298x;
            float f13 = f12 + ((pointF2.x - f12) * f11);
            float f14 = pointF.y;
            float f15 = f14 + (f11 * (pointF2.y - f14));
            PointF m55864N = ZoomableImageView.this.m55864N(this.f54294t, this.f54295u);
            Matrix matrix = ZoomableImageView.this.f54270p;
            if (matrix == null) {
                AbstractC19074t.m100223u("imgMatrix");
                matrix = null;
            }
            matrix.postTranslate(f13 - m55864N.x, f15 - m55864N.y);
        }

        @Override // java.lang.Runnable
        public void run() {
            float m55904b = m55904b();
            ZoomableImageView.this.m55860I(m55903a(m55904b), this.f54294t, this.f54295u, this.f54291q);
            m55905c(m55904b);
            ZoomableImageView.this.m55854A();
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            Matrix matrix = zoomableImageView.f54270p;
            if (matrix == null) {
                AbstractC19074t.m100223u("imgMatrix");
                matrix = null;
            }
            zoomableImageView.setImageMatrix(matrix);
            InterfaceC10735e imageMoveListener = ZoomableImageView.this.getImageMoveListener();
            if (imageMoveListener != null) {
                imageMoveListener.mo55840a();
            }
            if (m55904b < 1.0f) {
                ZoomableImageView.this.m55884y(this);
            } else {
                ZoomableImageView.this.f54272r = EnumC10737g.f54306p;
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$c */
    /* loaded from: classes5.dex */
    private final class RunnableC10733c implements Runnable {

        /* renamed from: p */
        private C10731a f54300p;

        /* renamed from: q */
        private int f54301q;

        /* renamed from: r */
        private int f54302r;

        public RunnableC10733c(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            ZoomableImageView.this.f54272r = EnumC10737g.f54309s;
            Context context = ZoomableImageView.this.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            this.f54300p = new C10731a(ZoomableImageView.this, context);
            Matrix matrix = ZoomableImageView.this.f54270p;
            float[] fArr = null;
            if (matrix == null) {
                AbstractC19074t.m100223u("imgMatrix");
                matrix = null;
            }
            float[] fArr2 = ZoomableImageView.this.f54277w;
            if (fArr2 == null) {
                AbstractC19074t.m100223u("matrix");
                fArr2 = null;
            }
            matrix.getValues(fArr2);
            float[] fArr3 = ZoomableImageView.this.f54277w;
            if (fArr3 == null) {
                AbstractC19074t.m100223u("matrix");
                fArr3 = null;
            }
            int i17 = (int) fArr3[2];
            float[] fArr4 = ZoomableImageView.this.f54277w;
            if (fArr4 == null) {
                AbstractC19074t.m100223u("matrix");
            } else {
                fArr = fArr4;
            }
            int i18 = (int) fArr[5];
            if (ZoomableImageView.this.getImageWidth() > ZoomableImageView.this.f54259E.m55843c()) {
                i13 = (int) (ZoomableImageView.this.f54259E.m55843c() - ZoomableImageView.this.getImageWidth());
                i14 = 0;
            } else {
                i13 = i17;
                i14 = i13;
            }
            if (ZoomableImageView.this.getImageHeight() > ZoomableImageView.this.f54259E.m55841a()) {
                i15 = (int) (ZoomableImageView.this.f54259E.m55841a() - ZoomableImageView.this.getImageHeight());
                i16 = 0;
            } else {
                i15 = i18;
                i16 = i15;
            }
            C10731a c10731a = this.f54300p;
            if (c10731a != null) {
                c10731a.m55897b(i17, i18, i11, i12, i13, i14, i15, i16);
            }
            this.f54301q = i17;
            this.f54302r = i18;
        }

        /* renamed from: a */
        public final void m55906a() {
            if (this.f54300p != null) {
                ZoomableImageView.this.f54272r = EnumC10737g.f54306p;
                C10731a c10731a = this.f54300p;
                if (c10731a != null) {
                    c10731a.m55898c(true);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC10735e imageMoveListener = ZoomableImageView.this.getImageMoveListener();
            if (imageMoveListener != null) {
                imageMoveListener.mo55840a();
            }
            C10731a c10731a = this.f54300p;
            Matrix matrix = null;
            if (c10731a != null && c10731a.m55902g()) {
                this.f54300p = null;
                return;
            }
            C10731a c10731a2 = this.f54300p;
            if (c10731a2 != null) {
                ZoomableImageView zoomableImageView = ZoomableImageView.this;
                if (c10731a2.m55896a()) {
                    int m55899d = c10731a2.m55899d();
                    int m55900e = c10731a2.m55900e();
                    int i11 = m55899d - this.f54301q;
                    int i12 = m55900e - this.f54302r;
                    this.f54301q = m55899d;
                    this.f54302r = m55900e;
                    Matrix matrix2 = zoomableImageView.f54270p;
                    if (matrix2 == null) {
                        AbstractC19074t.m100223u("imgMatrix");
                        matrix2 = null;
                    }
                    matrix2.postTranslate(i11, i12);
                    zoomableImageView.m55855B();
                    Matrix matrix3 = zoomableImageView.f54270p;
                    if (matrix3 == null) {
                        AbstractC19074t.m100223u("imgMatrix");
                    } else {
                        matrix = matrix3;
                    }
                    zoomableImageView.setImageMatrix(matrix);
                    zoomableImageView.m55884y(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$d */
    /* loaded from: classes5.dex */
    public final class C10734d extends GestureDetector.SimpleOnGestureListener {
        public C10734d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean z11;
            AbstractC19074t.m100208f(motionEvent, "event");
            GestureDetector.OnDoubleTapListener doubleTapListener = ZoomableImageView.this.getDoubleTapListener();
            if (doubleTapListener != null) {
                z11 = doubleTapListener.onDoubleTap(motionEvent);
            } else {
                z11 = false;
            }
            if (ZoomableImageView.this.f54272r == EnumC10737g.f54306p) {
                ZoomableImageView.this.m55884y(new RunnableC10732b(ZoomableImageView.this.getCurrentZoom() == ZoomableImageView.this.f54273s ? ZoomableImageView.this.f54274t : ZoomableImageView.this.f54273s, motionEvent.getX(), motionEvent.getY(), false));
                return true;
            }
            return z11;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
            GestureDetector.OnDoubleTapListener doubleTapListener = ZoomableImageView.this.getDoubleTapListener();
            if (doubleTapListener != null) {
                return doubleTapListener.onDoubleTapEvent(motionEvent);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            AbstractC19074t.m100208f(motionEvent2, "e2");
            RunnableC10733c runnableC10733c = ZoomableImageView.this.f54278x;
            if (runnableC10733c != null) {
                runnableC10733c.m55906a();
            }
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.f54278x = new RunnableC10733c((int) f11, (int) f12);
            RunnableC10733c runnableC10733c2 = ZoomableImageView.this.f54278x;
            if (runnableC10733c2 != null) {
                ZoomableImageView.this.m55884y(runnableC10733c2);
            }
            return super.onFling(motionEvent, motionEvent2, f11, f12);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
            ZoomableImageView.this.performLongClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
            GestureDetector.OnDoubleTapListener doubleTapListener = ZoomableImageView.this.getDoubleTapListener();
            if (doubleTapListener != null) {
                return doubleTapListener.onSingleTapConfirmed(motionEvent);
            }
            return ZoomableImageView.this.performClick();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$e */
    /* loaded from: classes5.dex */
    public interface InterfaceC10735e {
        /* renamed from: a */
        void mo55840a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$f */
    /* loaded from: classes5.dex */
    public final class C10736f extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C10736f() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            AbstractC19074t.m100208f(scaleGestureDetector, "detector");
            ZoomableImageView.this.m55860I(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            InterfaceC10735e imageMoveListener = ZoomableImageView.this.getImageMoveListener();
            if (imageMoveListener != null) {
                imageMoveListener.mo55840a();
                return true;
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            AbstractC19074t.m100208f(scaleGestureDetector, "detector");
            ZoomableImageView.this.f54272r = EnumC10737g.f54308r;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            AbstractC19074t.m100208f(scaleGestureDetector, "detector");
            super.onScaleEnd(scaleGestureDetector);
            ZoomableImageView.this.f54272r = EnumC10737g.f54306p;
            float currentZoom = ZoomableImageView.this.getCurrentZoom();
            boolean z11 = true;
            if (ZoomableImageView.this.getCurrentZoom() > ZoomableImageView.this.f54274t) {
                currentZoom = ZoomableImageView.this.f54274t;
            } else if (ZoomableImageView.this.getCurrentZoom() < ZoomableImageView.this.f54273s) {
                currentZoom = ZoomableImageView.this.f54273s;
            } else {
                z11 = false;
            }
            float f11 = currentZoom;
            if (z11) {
                ZoomableImageView zoomableImageView = ZoomableImageView.this;
                float f12 = 2;
                ZoomableImageView.this.m55884y(new RunnableC10732b(f11, zoomableImageView.f54259E.m55843c() / f12, ZoomableImageView.this.f54259E.m55841a() / f12, true));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$g */
    /* loaded from: classes5.dex */
    public static final class EnumC10737g {

        /* renamed from: p */
        public static final EnumC10737g f54306p = new EnumC10737g(Image.SCALE_TYPE_NONE, 0);

        /* renamed from: q */
        public static final EnumC10737g f54307q = new EnumC10737g("DRAG", 1);

        /* renamed from: r */
        public static final EnumC10737g f54308r = new EnumC10737g("ZOOM", 2);

        /* renamed from: s */
        public static final EnumC10737g f54309s = new EnumC10737g("FLING", 3);

        /* renamed from: t */
        public static final EnumC10737g f54310t = new EnumC10737g("ANIMATE_ZOOM", 4);

        /* renamed from: u */
        private static final /* synthetic */ EnumC10737g[] f54311u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f54312v;

        static {
            EnumC10737g[] m55907b = m55907b();
            f54311u = m55907b;
            f54312v = AbstractC30166b.m148796a(m55907b);
        }

        private EnumC10737g(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC10737g[] m55907b() {
            return new EnumC10737g[]{f54306p, f54307q, f54308r, f54309s, f54310t};
        }

        public static EnumC10737g valueOf(String str) {
            return (EnumC10737g) Enum.valueOf(EnumC10737g.class, str);
        }

        public static EnumC10737g[] values() {
            return (EnumC10737g[]) f54311u.clone();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$h */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10738h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54313a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f54313a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.ZoomableImageView$i */
    /* loaded from: classes5.dex */
    public final class C10739i {

        /* renamed from: a */
        private float f54314a;

        /* renamed from: b */
        private float f54315b;

        /* renamed from: c */
        private float f54316c;

        /* renamed from: d */
        private ImageView.ScaleType f54317d;

        /* renamed from: e */
        final /* synthetic */ ZoomableImageView f54318e;

        public C10739i(ZoomableImageView zoomableImageView, float f11, float f12, float f13, ImageView.ScaleType scaleType) {
            AbstractC19074t.m100208f(scaleType, "scaleType");
            this.f54318e = zoomableImageView;
            this.f54314a = f11;
            this.f54315b = f12;
            this.f54316c = f13;
            this.f54317d = scaleType;
        }

        /* renamed from: a */
        public final float m55908a() {
            return this.f54315b;
        }

        /* renamed from: b */
        public final float m55909b() {
            return this.f54316c;
        }

        /* renamed from: c */
        public final float m55910c() {
            return this.f54314a;
        }

        /* renamed from: d */
        public final ImageView.ScaleType m55911d() {
            return this.f54317d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableImageView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f54279y = new PointF();
        this.f54258D = new SizeF(0.0f, 0.0f, 3, null);
        this.f54259E = new SizeF(0.0f, 0.0f, 3, null);
        this.f54260F = new SizeF(0.0f, 0.0f, 3, null);
        this.f54261G = new SizeF(0.0f, 0.0f, 3, null);
        this.f54262H = new SizeF(0.0f, 0.0f, 3, null);
        this.f54268N = new RectF();
        m55863M(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m55854A() {
        m55855B();
        Matrix matrix = this.f54270p;
        float[] fArr = null;
        if (matrix == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix = null;
        }
        float[] fArr2 = this.f54277w;
        if (fArr2 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr2 = null;
        }
        matrix.getValues(fArr2);
        if (getImageWidth() < this.f54259E.m55843c()) {
            float[] fArr3 = this.f54277w;
            if (fArr3 == null) {
                AbstractC19074t.m100223u("matrix");
                fArr3 = null;
            }
            fArr3[2] = (this.f54259E.m55843c() - getImageWidth()) / 2;
        }
        if (getImageHeight() < this.f54259E.m55841a()) {
            float[] fArr4 = this.f54277w;
            if (fArr4 == null) {
                AbstractC19074t.m100223u("matrix");
                fArr4 = null;
            }
            fArr4[5] = (this.f54259E.m55841a() - getImageHeight()) / 2;
        }
        Matrix matrix2 = this.f54270p;
        if (matrix2 == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix2 = null;
        }
        float[] fArr5 = this.f54277w;
        if (fArr5 == null) {
            AbstractC19074t.m100223u("matrix");
        } else {
            fArr = fArr5;
        }
        matrix2.setValues(fArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m55855B() {
        Matrix matrix = this.f54270p;
        Matrix matrix2 = null;
        if (matrix == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix = null;
        }
        float[] fArr = this.f54277w;
        if (fArr == null) {
            AbstractC19074t.m100223u("matrix");
            fArr = null;
        }
        matrix.getValues(fArr);
        float[] fArr2 = this.f54277w;
        if (fArr2 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr2 = null;
        }
        float f11 = fArr2[2];
        float[] fArr3 = this.f54277w;
        if (fArr3 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr3 = null;
        }
        float f12 = fArr3[5];
        float m55857D = m55857D(f11, this.f54259E.m55843c(), getImageWidth());
        float m55857D2 = m55857D(f12, this.f54259E.m55841a(), getImageHeight());
        if (m55857D != 0.0f || m55857D2 != 0.0f) {
            Matrix matrix3 = this.f54270p;
            if (matrix3 == null) {
                AbstractC19074t.m100223u("imgMatrix");
            } else {
                matrix2 = matrix3;
            }
            matrix2.postTranslate(m55857D, m55857D2);
        }
    }

    /* renamed from: C */
    private final float m55856C(float f11, float f12, float f13) {
        if (f13 <= f12) {
            return 0.0f;
        }
        return f11;
    }

    /* renamed from: D */
    private final float m55857D(float f11, float f12, float f13) {
        float f14;
        float f15;
        if (f13 <= f12) {
            f15 = f12 - f13;
            f14 = 0.0f;
        } else {
            f14 = f12 - f13;
            f15 = 0.0f;
        }
        if (f11 < f14) {
            return (-f11) + f14;
        }
        if (f11 > f15) {
            return (-f11) + f15;
        }
        return 0.0f;
    }

    /* renamed from: F */
    private final void m55858F(boolean z11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    /* renamed from: H */
    private final void m55859H() {
        if (this.f54259E.m55841a() != 0.0f && this.f54259E.m55843c() != 0.0f) {
            Matrix matrix = this.f54270p;
            float[] fArr = null;
            if (matrix == null) {
                AbstractC19074t.m100223u("imgMatrix");
                matrix = null;
            }
            float[] fArr2 = this.f54277w;
            if (fArr2 == null) {
                AbstractC19074t.m100223u("matrix");
                fArr2 = null;
            }
            matrix.getValues(fArr2);
            Matrix matrix2 = this.f54271q;
            if (matrix2 == null) {
                AbstractC19074t.m100223u("prevMatrix");
                matrix2 = null;
            }
            float[] fArr3 = this.f54277w;
            if (fArr3 == null) {
                AbstractC19074t.m100223u("matrix");
            } else {
                fArr = fArr3;
            }
            matrix2.setValues(fArr);
            this.f54262H.m55846f(this.f54261G.m55841a());
            this.f54262H.m55847g(this.f54261G.m55843c());
            this.f54260F.m55846f(this.f54259E.m55841a());
            this.f54260F.m55847g(this.f54259E.m55843c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m55860I(double d11, float f11, float f12, boolean z11) {
        float f13;
        float f14;
        if (z11) {
            f13 = this.f54275u;
            f14 = this.f54276v;
        } else {
            f13 = this.f54273s;
            f14 = this.f54274t;
        }
        float f15 = this.f54269O;
        float f16 = ((float) d11) * f15;
        this.f54269O = f16;
        if (f16 > f14) {
            this.f54269O = f14;
            d11 = f14 / f15;
        } else if (f16 < f13) {
            this.f54269O = f13;
            d11 = f13 / f15;
        }
        Matrix matrix = this.f54270p;
        if (matrix == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix = null;
        }
        float f17 = (float) d11;
        matrix.postScale(f17, f17, f11, f12);
        m55854A();
    }

    /* renamed from: J */
    private final int m55861J(int i11, int i12, int i13) {
        if (i11 != Integer.MIN_VALUE) {
            if (i11 == 0) {
                return i13;
            }
            return i12;
        }
        return Math.min(i13, i12);
    }

    /* renamed from: L */
    public static /* synthetic */ void m55862L(ZoomableImageView zoomableImageView, float f11, float f12, float f13, ImageView.ScaleType scaleType, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 0.5f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.5f;
        }
        if ((i11 & 8) != 0 && (scaleType = zoomableImageView.f54280z) == null) {
            AbstractC19074t.m100223u("imageScaleType");
            scaleType = null;
        }
        zoomableImageView.m55888K(f11, f12, f13, scaleType);
    }

    /* renamed from: M */
    private final void m55863M(Context context) {
        super.setClickable(true);
        this.f54263I = new ScaleGestureDetector(context, new C10736f());
        this.f54264J = new GestureDetector(context, new C10734d());
        this.f54270p = new Matrix();
        this.f54271q = new Matrix();
        this.f54277w = new float[9];
        this.f54269O = 1.0f;
        this.f54280z = ImageView.ScaleType.CENTER_CROP;
        this.f54273s = 1.0f;
        this.f54274t = 5.0f;
        this.f54275u = 1.0f * 0.75f;
        this.f54276v = 5.0f * 1.25f;
        Matrix matrix = this.f54270p;
        if (matrix == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix = null;
        }
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f54272r = EnumC10737g.f54306p;
        this.f54256B = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final PointF m55864N(float f11, float f12) {
        Matrix matrix = this.f54270p;
        float[] fArr = null;
        if (matrix == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix = null;
        }
        float[] fArr2 = this.f54277w;
        if (fArr2 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr2 = null;
        }
        matrix.getValues(fArr2);
        float intrinsicWidth = f11 / getDrawable().getIntrinsicWidth();
        float intrinsicHeight = f12 / getDrawable().getIntrinsicHeight();
        float[] fArr3 = this.f54277w;
        if (fArr3 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr3 = null;
        }
        float imageWidth = fArr3[2] + (getImageWidth() * intrinsicWidth);
        float[] fArr4 = this.f54277w;
        if (fArr4 == null) {
            AbstractC19074t.m100223u("matrix");
        } else {
            fArr = fArr4;
        }
        return new PointF(imageWidth, fArr[5] + (getImageHeight() * intrinsicHeight));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final PointF m55865O(float f11, float f12, boolean z11) {
        Matrix matrix = this.f54270p;
        float[] fArr = null;
        if (matrix == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix = null;
        }
        float[] fArr2 = this.f54277w;
        if (fArr2 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr2 = null;
        }
        matrix.getValues(fArr2);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float[] fArr3 = this.f54277w;
        if (fArr3 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr3 = null;
        }
        float f13 = fArr3[2];
        float[] fArr4 = this.f54277w;
        if (fArr4 == null) {
            AbstractC19074t.m100223u("matrix");
        } else {
            fArr = fArr4;
        }
        float f14 = fArr[5];
        float imageWidth = ((f11 - f13) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f12 - f14) * intrinsicHeight) / getImageHeight();
        if (z11) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    /* renamed from: P */
    private final void m55866P(int i11, float f11, float f12, float f13, float f14, float f15, int i12) {
        float[] fArr = null;
        if (f13 < f15) {
            float[] fArr2 = this.f54277w;
            if (fArr2 == null) {
                AbstractC19074t.m100223u("matrix");
                fArr2 = null;
            }
            float f16 = i12;
            float[] fArr3 = this.f54277w;
            if (fArr3 == null) {
                AbstractC19074t.m100223u("matrix");
            } else {
                fArr = fArr3;
            }
            fArr2[i11] = (f15 - (f16 * fArr[0])) * 0.5f;
            return;
        }
        if (f11 > 0.0f) {
            float[] fArr4 = this.f54277w;
            if (fArr4 == null) {
                AbstractC19074t.m100223u("matrix");
            } else {
                fArr = fArr4;
            }
            fArr[i11] = -((f13 - f15) / 2);
            return;
        }
        float f17 = 2;
        float abs = (Math.abs(f11) + (f14 / f17)) / f12;
        float[] fArr5 = this.f54277w;
        if (fArr5 == null) {
            AbstractC19074t.m100223u("matrix");
        } else {
            fArr = fArr5;
        }
        fArr[i11] = -((abs * f13) - (f15 / f17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageHeight() {
        return this.f54261G.m55841a() * this.f54269O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageWidth() {
        return this.f54261G.m55843c() * this.f54269O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m55884y(Runnable runnable) {
        postOnAnimation(runnable);
    }

    /* renamed from: z */
    private final void m55885z() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f11 = intrinsicWidth;
            float m55843c = this.f54259E.m55843c() / f11;
            float f12 = intrinsicHeight;
            float m55841a = this.f54259E.m55841a() / f12;
            ImageView.ScaleType scaleType = this.f54280z;
            Matrix matrix = null;
            if (scaleType == null) {
                AbstractC19074t.m100223u("imageScaleType");
                scaleType = null;
            }
            int i11 = C10738h.f54313a[scaleType.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new UnsupportedOperationException("ZoomableImageView does not support FIT_START or FIT_END");
                            }
                        } else {
                            m55843c = Math.min(m55843c, m55841a);
                        }
                    } else {
                        float min = Math.min(1.0f, Math.min(m55843c, m55841a));
                        m55843c = Math.min(min, min);
                    }
                } else {
                    m55843c = Math.max(m55843c, m55841a);
                }
                m55841a = m55843c;
            } else {
                m55843c = 1.0f;
                m55841a = 1.0f;
            }
            float m55843c2 = this.f54259E.m55843c() - (m55843c * f11);
            float m55841a2 = this.f54259E.m55841a() - (m55841a * f12);
            this.f54261G.m55847g(this.f54259E.m55843c() - m55843c2);
            this.f54261G.m55846f(this.f54259E.m55841a() - m55841a2);
            if ((!m55886E() && !this.f54255A) || (this.f54262H.m55843c() == 0.0f && this.f54262H.m55841a() == 0.0f)) {
                Matrix matrix2 = this.f54270p;
                if (matrix2 == null) {
                    AbstractC19074t.m100223u("imgMatrix");
                    matrix2 = null;
                }
                matrix2.setScale(m55843c, m55841a);
                Matrix matrix3 = this.f54270p;
                if (matrix3 == null) {
                    AbstractC19074t.m100223u("imgMatrix");
                    matrix3 = null;
                }
                float f13 = 2;
                matrix3.postTranslate(m55843c2 / f13, m55841a2 / f13);
                this.f54269O = 1.0f;
            } else {
                Matrix matrix4 = this.f54271q;
                if (matrix4 == null) {
                    AbstractC19074t.m100223u("prevMatrix");
                    matrix4 = null;
                }
                float[] fArr = this.f54277w;
                if (fArr == null) {
                    AbstractC19074t.m100223u("matrix");
                    fArr = null;
                }
                matrix4.getValues(fArr);
                float[] fArr2 = this.f54277w;
                if (fArr2 == null) {
                    AbstractC19074t.m100223u("matrix");
                    fArr2 = null;
                }
                fArr2[0] = (this.f54261G.m55843c() / f11) * this.f54269O;
                float[] fArr3 = this.f54277w;
                if (fArr3 == null) {
                    AbstractC19074t.m100223u("matrix");
                    fArr3 = null;
                }
                fArr3[4] = (this.f54261G.m55841a() / f12) * this.f54269O;
                float[] fArr4 = this.f54277w;
                if (fArr4 == null) {
                    AbstractC19074t.m100223u("matrix");
                    fArr4 = null;
                }
                float f14 = fArr4[2];
                float[] fArr5 = this.f54277w;
                if (fArr5 == null) {
                    AbstractC19074t.m100223u("matrix");
                    fArr5 = null;
                }
                float f15 = fArr5[5];
                m55866P(2, f14, this.f54262H.m55843c() * this.f54269O, getImageWidth(), this.f54260F.m55843c(), this.f54259E.m55843c(), intrinsicWidth);
                m55866P(5, f15, this.f54262H.m55841a() * this.f54269O, getImageHeight(), this.f54260F.m55841a(), this.f54259E.m55841a(), intrinsicHeight);
                Matrix matrix5 = this.f54270p;
                if (matrix5 == null) {
                    AbstractC19074t.m100223u("imgMatrix");
                    matrix5 = null;
                }
                float[] fArr6 = this.f54277w;
                if (fArr6 == null) {
                    AbstractC19074t.m100223u("matrix");
                    fArr6 = null;
                }
                matrix5.setValues(fArr6);
            }
            m55855B();
            Matrix matrix6 = this.f54270p;
            if (matrix6 == null) {
                AbstractC19074t.m100223u("imgMatrix");
            } else {
                matrix = matrix6;
            }
            setImageMatrix(matrix);
        }
    }

    /* renamed from: E */
    public final boolean m55886E() {
        return !(this.f54269O == 1.0f);
    }

    /* renamed from: G */
    public final void m55887G() {
        this.f54269O = 1.0f;
        m55885z();
    }

    /* renamed from: K */
    public final void m55888K(float f11, float f12, float f13, ImageView.ScaleType scaleType) {
        AbstractC19074t.m100208f(scaleType, "scaleType");
        if (!this.f54256B) {
            this.f54257C = new C10739i(this, f11, f12, f13, scaleType);
            return;
        }
        ImageView.ScaleType scaleType2 = this.f54280z;
        Matrix matrix = null;
        if (scaleType2 == null) {
            AbstractC19074t.m100223u("imageScaleType");
            scaleType2 = null;
        }
        if (scaleType != scaleType2) {
            setScaleType(scaleType);
        }
        m55887G();
        float f14 = 2;
        m55860I(f11, this.f54259E.m55843c() / f14, this.f54259E.m55841a() / f14, true);
        Matrix matrix2 = this.f54270p;
        if (matrix2 == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix2 = null;
        }
        float[] fArr = this.f54277w;
        if (fArr == null) {
            AbstractC19074t.m100223u("matrix");
            fArr = null;
        }
        matrix2.getValues(fArr);
        float[] fArr2 = this.f54277w;
        if (fArr2 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr2 = null;
        }
        fArr2[2] = -((f12 * getImageWidth()) - (this.f54259E.m55843c() / f14));
        float[] fArr3 = this.f54277w;
        if (fArr3 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr3 = null;
        }
        fArr3[5] = -((f13 * getImageHeight()) - (this.f54259E.m55841a() / f14));
        Matrix matrix3 = this.f54270p;
        if (matrix3 == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix3 = null;
        }
        float[] fArr4 = this.f54277w;
        if (fArr4 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr4 = null;
        }
        matrix3.setValues(fArr4);
        m55855B();
        Matrix matrix4 = this.f54270p;
        if (matrix4 == null) {
            AbstractC19074t.m100223u("imgMatrix");
        } else {
            matrix = matrix4;
        }
        setImageMatrix(matrix);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        Matrix matrix = this.f54270p;
        float[] fArr = null;
        if (matrix == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix = null;
        }
        float[] fArr2 = this.f54277w;
        if (fArr2 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr2 = null;
        }
        matrix.getValues(fArr2);
        float[] fArr3 = this.f54277w;
        if (fArr3 == null) {
            AbstractC19074t.m100223u("matrix");
        } else {
            fArr = fArr3;
        }
        float f11 = fArr[2];
        if (getImageWidth() < this.f54259E.m55843c()) {
            return false;
        }
        if (f11 >= -1.0f && i11 < 0) {
            return false;
        }
        if (Math.abs(f11) + this.f54259E.m55843c() + 1.0f >= getImageWidth() && i11 > 0) {
            return false;
        }
        return true;
    }

    public final float getCurrentZoom() {
        return this.f54269O;
    }

    public final GestureDetector.OnDoubleTapListener getDoubleTapListener() {
        return this.f54265K;
    }

    public final RectF getImageBounds() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            getImageMatrix().mapRect(rectF2, rectF);
            return new RectF(rectF2);
        }
        return new RectF();
    }

    public final InterfaceC10735e getImageMoveListener() {
        return this.f54267M;
    }

    public final float getMaxZoom() {
        return this.f54274t;
    }

    public final float getMinZoom() {
        return this.f54273s;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ImageView.ScaleType scaleType = this.f54280z;
        if (scaleType == null) {
            AbstractC19074t.m100223u("imageScaleType");
            return null;
        }
        return scaleType;
    }

    public final PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float f11 = 2;
        PointF m55865O = m55865O(this.f54259E.m55843c() / f11, this.f54259E.m55841a() / f11, true);
        m55865O.x /= intrinsicWidth;
        m55865O.y /= intrinsicHeight;
        return m55865O;
    }

    public final View.OnTouchListener getUserTouchListener() {
        return this.f54266L;
    }

    public final RectF getViewport() {
        return this.f54268N;
    }

    public final RectF getZoomedRect() {
        ImageView.ScaleType scaleType = this.f54280z;
        if (scaleType == null) {
            AbstractC19074t.m100223u("imageScaleType");
            scaleType = null;
        }
        if (scaleType != ImageView.ScaleType.FIT_XY) {
            PointF m55865O = m55865O(0.0f, 0.0f, true);
            PointF m55865O2 = m55865O(this.f54259E.m55843c(), this.f54259E.m55841a(), true);
            float intrinsicWidth = getDrawable().getIntrinsicWidth();
            float intrinsicHeight = getDrawable().getIntrinsicHeight();
            return new RectF(m55865O.x / intrinsicWidth, m55865O.y / intrinsicHeight, m55865O2.x / intrinsicWidth, m55865O2.y / intrinsicHeight);
        }
        throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        m55859H();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        this.f54256B = true;
        this.f54255A = true;
        C10739i c10739i = this.f54257C;
        if (c10739i != null) {
            m55888K(c10739i.m55910c(), c10739i.m55908a(), c10739i.m55909b(), c10739i.m55911d());
            this.f54257C = null;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int size = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i12);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.f54258D.m55847g(m55861J(mode, size, intrinsicWidth));
            this.f54258D.m55846f(m55861J(mode2, size2, intrinsicHeight));
            if (this.f54268N.isEmpty()) {
                RectF rectF = this.f54268N;
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                rectF.right = this.f54258D.m55843c();
                rectF.bottom = this.f54258D.m55841a();
            }
            this.f54259E.m55847g(this.f54268N.width());
            this.f54259E.m55846f(this.f54268N.height());
            RectF m55845e = this.f54258D.m55845e(this.f54259E);
            setMeasuredDimension(this.f54258D.m55844d(), this.f54258D.m55842b());
            setPadding((int) m55845e.left, (int) m55845e.top, (int) m55845e.right, (int) m55845e.bottom);
            m55885z();
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        AbstractC19074t.m100208f(parcelable, "state");
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f54269O = savedState.m55889a();
            this.f54277w = savedState.m55891c();
            this.f54262H = savedState.m55892d();
            this.f54260F = savedState.m55893e();
            this.f54255A = savedState.m55890b();
            Matrix matrix = this.f54271q;
            float[] fArr = null;
            if (matrix == null) {
                AbstractC19074t.m100223u("prevMatrix");
                matrix = null;
            }
            float[] fArr2 = this.f54277w;
            if (fArr2 == null) {
                AbstractC19074t.m100223u("matrix");
            } else {
                fArr = fArr2;
            }
            matrix.setValues(fArr);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        float[] fArr;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Matrix matrix = this.f54270p;
        if (matrix == null) {
            AbstractC19074t.m100223u("imgMatrix");
            matrix = null;
        }
        float[] fArr2 = this.f54277w;
        if (fArr2 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr2 = null;
        }
        matrix.getValues(fArr2);
        AbstractC19074t.m100205c(onSaveInstanceState);
        float f11 = this.f54269O;
        float[] fArr3 = this.f54277w;
        if (fArr3 == null) {
            AbstractC19074t.m100223u("matrix");
            fArr = null;
        } else {
            fArr = fArr3;
        }
        return new SavedState(onSaveInstanceState, f11, fArr, this.f54261G, this.f54259E, this.f54255A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:            if (r2 != 6) goto L33;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        RectF rectF = this.f54268N;
        motionEvent.offsetLocation(-rectF.left, -rectF.top);
        ScaleGestureDetector scaleGestureDetector = this.f54263I;
        Matrix matrix = null;
        if (scaleGestureDetector == null) {
            AbstractC19074t.m100223u("scaleDetector");
            scaleGestureDetector = null;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        GestureDetector gestureDetector = this.f54264J;
        if (gestureDetector == null) {
            AbstractC19074t.m100223u("gestureDetector");
            gestureDetector = null;
        }
        gestureDetector.onTouchEvent(motionEvent);
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        EnumC10737g enumC10737g = this.f54272r;
        EnumC10737g enumC10737g2 = EnumC10737g.f54306p;
        if (enumC10737g == enumC10737g2 || enumC10737g == EnumC10737g.f54307q || enumC10737g == EnumC10737g.f54309s) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.f54272r == EnumC10737g.f54307q) {
                            float f11 = pointF.x;
                            PointF pointF2 = this.f54279y;
                            float f12 = f11 - pointF2.x;
                            float f13 = pointF.y - pointF2.y;
                            float m55856C = m55856C(f12, this.f54259E.m55843c(), getImageWidth());
                            float m55856C2 = m55856C(f13, this.f54259E.m55841a(), getImageHeight());
                            Matrix matrix2 = this.f54270p;
                            if (matrix2 == null) {
                                AbstractC19074t.m100223u("imgMatrix");
                                matrix2 = null;
                            }
                            matrix2.postTranslate(m55856C, m55856C2);
                            m55855B();
                            this.f54279y.set(pointF.x, pointF.y);
                        }
                    }
                }
                this.f54272r = enumC10737g2;
                m55858F(false);
            } else {
                m55858F(true);
                this.f54279y.set(pointF);
                RunnableC10733c runnableC10733c = this.f54278x;
                if (runnableC10733c != null) {
                    runnableC10733c.m55906a();
                }
                this.f54272r = EnumC10737g.f54307q;
            }
        }
        Matrix matrix3 = this.f54270p;
        if (matrix3 == null) {
            AbstractC19074t.m100223u("imgMatrix");
        } else {
            matrix = matrix3;
        }
        setImageMatrix(matrix);
        View.OnTouchListener onTouchListener = this.f54266L;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        InterfaceC10735e interfaceC10735e = this.f54267M;
        if (interfaceC10735e != null) {
            interfaceC10735e.mo55840a();
        }
        return true;
    }

    public final void setDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f54265K = onDoubleTapListener;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        AbstractC19074t.m100208f(bitmap, "bm");
        super.setImageBitmap(bitmap);
        m55859H();
        m55885z();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m55859H();
        m55885z();
    }

    public final void setImageMoveListener(InterfaceC10735e interfaceC10735e) {
        this.f54267M = interfaceC10735e;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        super.setImageResource(i11);
        m55859H();
        m55885z();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m55859H();
        m55885z();
    }

    public final void setMaxZoom(float f11) {
        this.f54274t = f11;
        this.f54276v = f11 * 1.25f;
    }

    public final void setMinZoom(float f11) {
        this.f54273s = f11;
        this.f54275u = f11 * 0.75f;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        AbstractC19074t.m100208f(scaleType, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (scaleType != ImageView.ScaleType.FIT_START && scaleType != ImageView.ScaleType.FIT_END) {
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
            if (scaleType == scaleType2) {
                super.setScaleType(scaleType2);
                return;
            }
            this.f54280z = scaleType;
            if (this.f54256B) {
                setZoom(this);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("ZoomableImageView does not support FIT_START or FIT_END");
    }

    public final void setUserTouchListener(View.OnTouchListener onTouchListener) {
        this.f54266L = onTouchListener;
    }

    public final void setViewport(RectF rectF) {
        AbstractC19074t.m100208f(rectF, "<set-?>");
        this.f54268N = rectF;
    }

    public final void setZoom(float f11) {
        m55862L(this, f11, 0.0f, 0.0f, null, 14, null);
    }

    public final void setZoom(ZoomableImageView zoomableImageView) {
        AbstractC19074t.m100208f(zoomableImageView, "img");
        PointF scrollPosition = zoomableImageView.getScrollPosition();
        if (scrollPosition != null) {
            m55888K(zoomableImageView.f54269O, scrollPosition.x, scrollPosition.y, zoomableImageView.getScaleType());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f54279y = new PointF();
        this.f54258D = new SizeF(0.0f, 0.0f, 3, null);
        this.f54259E = new SizeF(0.0f, 0.0f, 3, null);
        this.f54260F = new SizeF(0.0f, 0.0f, 3, null);
        this.f54261G = new SizeF(0.0f, 0.0f, 3, null);
        this.f54262H = new SizeF(0.0f, 0.0f, 3, null);
        this.f54268N = new RectF();
        m55863M(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f54279y = new PointF();
        this.f54258D = new SizeF(0.0f, 0.0f, 3, null);
        this.f54259E = new SizeF(0.0f, 0.0f, 3, null);
        this.f54260F = new SizeF(0.0f, 0.0f, 3, null);
        this.f54261G = new SizeF(0.0f, 0.0f, 3, null);
        this.f54262H = new SizeF(0.0f, 0.0f, 3, null);
        this.f54268N = new RectF();
        m55863M(context);
    }
}
