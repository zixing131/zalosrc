package com.zing.zalo.zlottie.widget;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.zlottie.widget.C17291a;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EnumSet;
import nl0.AbstractC23880j;
import nl0.EnumC23875e;
import nl0.EnumC23879i;
import ol0.C24307e;
import ol0.InterfaceC24305c;

/* loaded from: classes7.dex */
public class LottieImageView extends AppCompatImageView {

    /* renamed from: A */
    private EnumC23879i f88019A;

    /* renamed from: B */
    private float f88020B;

    /* renamed from: C */
    private float f88021C;

    /* renamed from: D */
    private C17291a.g f88022D;

    /* renamed from: E */
    private int f88023E;

    /* renamed from: F */
    private C17291a.f f88024F;

    /* renamed from: G */
    private boolean f88025G;

    /* renamed from: H */
    private boolean f88026H;

    /* renamed from: p */
    private final InterfaceC24305c f88027p;

    /* renamed from: q */
    private Runnable f88028q;

    /* renamed from: r */
    private volatile Runnable f88029r;

    /* renamed from: s */
    private C17291a f88030s;

    /* renamed from: t */
    private boolean f88031t;

    /* renamed from: u */
    private boolean f88032u;

    /* renamed from: v */
    private boolean f88033v;

    /* renamed from: w */
    private C17290b f88034w;

    /* renamed from: x */
    private final EnumSet f88035x;

    /* renamed from: y */
    private final EnumSet f88036y;

    /* renamed from: z */
    private float f88037z;

    /* renamed from: com.zing.zalo.zlottie.widget.LottieImageView$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C17289a {

        /* renamed from: a */
        static final /* synthetic */ int[] f88038a;

        static {
            int[] iArr = new int[EnumC23879i.values().length];
            f88038a = iArr;
            try {
                iArr[EnumC23879i.SCALE_TYPE_FREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88038a[EnumC23879i.SCALE_TYPE_FIXED_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88038a[EnumC23879i.SCALE_TYPE_FIXED_HEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88038a[EnumC23879i.SCALE_TYPE_FIXED_VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.zing.zalo.zlottie.widget.LottieImageView$b */
    /* loaded from: classes7.dex */
    public static final class C17290b {

        /* renamed from: a */
        final String f88039a;

        /* renamed from: b */
        final String f88040b;

        /* renamed from: c */
        final int f88041c;

        /* renamed from: d */
        final Uri f88042d;

        /* renamed from: e */
        final int f88043e;

        /* renamed from: f */
        final int f88044f;

        /* renamed from: g */
        final boolean f88045g;

        /* renamed from: h */
        final boolean f88046h;

        /* renamed from: i */
        final String f88047i;

        /* renamed from: com.zing.zalo.zlottie.widget.LottieImageView$b$a */
        /* loaded from: classes7.dex */
        public static final class a {

            /* renamed from: a */
            String f88048a = "";

            /* renamed from: b */
            String f88049b = "";

            /* renamed from: c */
            int f88050c = 0;

            /* renamed from: d */
            Uri f88051d = null;

            /* renamed from: e */
            int f88052e = 0;

            /* renamed from: f */
            int f88053f = 0;

            /* renamed from: g */
            boolean f88054g = false;

            /* renamed from: h */
            boolean f88055h = false;

            /* renamed from: i */
            String f88056i = "";

            a() {
            }

            /* renamed from: a */
            C17290b m92158a() {
                return new C17290b(this);
            }

            /* renamed from: b */
            a m92159b(String str) {
                this.f88049b = str;
                return this;
            }

            /* renamed from: c */
            a m92160c(String str) {
                this.f88048a = str;
                return this;
            }

            /* renamed from: d */
            a m92161d(boolean z11) {
                this.f88054g = z11;
                return this;
            }

            /* renamed from: e */
            a m92162e(boolean z11) {
                this.f88055h = z11;
                return this;
            }

            /* renamed from: f */
            a m92163f(int i11) {
                this.f88050c = i11;
                return this;
            }

            /* renamed from: g */
            a m92164g(String str) {
                this.f88056i = str;
                return this;
            }

            /* renamed from: h */
            a m92165h(int i11) {
                this.f88053f = i11;
                return this;
            }

            /* renamed from: i */
            a m92166i(int i11) {
                this.f88052e = i11;
                return this;
            }
        }

        C17290b(a aVar) {
            this.f88039a = aVar.f88048a;
            this.f88040b = aVar.f88049b;
            this.f88041c = aVar.f88050c;
            this.f88042d = aVar.f88051d;
            this.f88043e = aVar.f88052e;
            this.f88044f = aVar.f88053f;
            this.f88045g = aVar.f88054g;
            this.f88046h = aVar.f88055h;
            this.f88047i = aVar.f88056i;
        }
    }

    public LottieImageView(Context context) {
        super(context);
        this.f88027p = new C24307e(AbstractC0837p0.m2225f());
        this.f88028q = null;
        this.f88029r = null;
        this.f88033v = false;
        EnumC23875e enumC23875e = EnumC23875e.TOP;
        EnumC23875e enumC23875e2 = EnumC23875e.LEFT;
        this.f88035x = EnumSet.of(enumC23875e, enumC23875e2);
        this.f88036y = EnumSet.of(enumC23875e, enumC23875e2);
        this.f88037z = 1.0f;
        this.f88019A = EnumC23879i.SCALE_TYPE_FIXED_VIEW;
        this.f88020B = 0.0f;
        this.f88021C = 0.0f;
        this.f88022D = C17291a.g.INFINITE;
        this.f88023E = 1;
        this.f88024F = null;
        this.f88025G = false;
        this.f88026H = false;
        m92140p();
    }

    /* renamed from: j */
    private Matrix m92137j(int i11, int i12, int i13, int i14) {
        int i15;
        Matrix matrix = new Matrix();
        float f11 = this.f88020B;
        int i16 = 0;
        if (-1.0f <= f11 && f11 <= 1.0f) {
            i15 = m92152k(i11, i13);
        } else {
            i15 = 0;
        }
        float f12 = this.f88021C;
        if (-1.0f <= f12 && f12 <= 1.0f) {
            i16 = m92153l(i12, i14);
        }
        matrix.setTranslate(i15, i16);
        return matrix;
    }

    /* renamed from: m */
    private void m92138m() {
        Runnable runnable = this.f88028q;
        if (runnable != null) {
            this.f88027p.mo126932a(runnable);
            this.f88028q = null;
        }
    }

    /* renamed from: n */
    private C17291a m92139n(Context context, C17290b c17290b, Size size) {
        C17291a c17291a;
        C17291a c17291a2;
        int width = size.getWidth();
        int height = size.getHeight();
        if (c17290b.f88041c != 0) {
            c17291a2 = new C17291a(c17290b.f88041c, c17290b.f88047i, width, height, c17290b.f88045g);
        } else {
            if (!TextUtils.isEmpty(c17290b.f88040b)) {
                try {
                    c17291a = new C17291a(context.getAssets().open(c17290b.f88040b), c17290b.f88047i, width, height, c17290b.f88045g);
                } catch (IOException e11) {
                    AbstractC20110a.m104546o(e11);
                    return null;
                }
            } else if (c17290b.f88042d != null) {
                try {
                    c17291a = new C17291a(context.getContentResolver().openInputStream(c17290b.f88042d), c17290b.f88047i, width, height, c17290b.f88045g);
                } catch (FileNotFoundException e12) {
                    AbstractC20110a.m104546o(e12);
                    return null;
                }
            } else {
                c17291a2 = new C17291a(new File(c17290b.f88039a), c17290b.f88047i, width, height, c17290b.f88046h, c17290b.f88045g);
            }
            c17291a2 = c17291a;
        }
        c17291a2.m92215V(this.f88022D);
        c17291a2.m92217Y(this.f88023E);
        c17291a2.m92214U(this.f88024F);
        c17291a2.m92216X(this.f88025G);
        return c17291a2;
    }

    /* renamed from: p */
    private void m92140p() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: r */
    public /* synthetic */ void m92141r(Matrix matrix, C17291a c17291a, long j11) {
        setImageMatrix(matrix);
        m92145z(c17291a, j11);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.zlottie.widget.e.<init>(com.zing.zalo.zlottie.widget.LottieImageView, android.graphics.Matrix, com.zing.zalo.zlottie.widget.a, long):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: s */
    public /* synthetic */ void m92142s(com.zing.zalo.zlottie.widget.LottieImageView.C17290b r9, int r10, int r11, android.view.ViewGroup.LayoutParams r12, android.content.Context r13, long r14) {
        /*
            r8 = this;
            android.util.Size r12 = r8.m92151i(r9, r10, r11, r12)
            if (r12 != 0) goto L7
            return
        L7:
            int r0 = r12.getWidth()
            int r1 = r12.getHeight()
            android.graphics.Matrix r4 = r8.m92137j(r10, r11, r0, r1)
            com.zing.zalo.zlottie.widget.a r5 = r8.m92139n(r13, r9, r12)
            if (r5 == 0) goto L24
            com.zing.zalo.zlottie.widget.e r9 = new com.zing.zalo.zlottie.widget.e
            r2 = r9
            r3 = r8
            r6 = r14
            r2.<init>()
            r8.m92144w(r9)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.zlottie.widget.LottieImageView.m92142s(com.zing.zalo.zlottie.widget.LottieImageView$b, int, int, android.view.ViewGroup$LayoutParams, android.content.Context, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.zlottie.widget.d.<init>(com.zing.zalo.zlottie.widget.LottieImageView, com.zing.zalo.zlottie.widget.LottieImageView$b, int, int, android.view.ViewGroup$LayoutParams, android.content.Context, long):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private void setDrawableFromInfo(com.zing.zalo.zlottie.widget.LottieImageView.C17290b r12) {
        /*
            r11 = this;
            long r7 = java.lang.System.currentTimeMillis()
            r11.m92138m()
            r0 = 1
            r11.f88026H = r0
            android.content.Context r6 = r11.getContext()
            if (r6 != 0) goto L11
            return
        L11:
            int r0 = r11.getWidth()
            int r1 = r11.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r11.getPaddingRight()
            int r3 = r0 - r1
            int r0 = r11.getHeight()
            int r1 = r11.getPaddingTop()
            int r0 = r0 - r1
            int r1 = r11.getPaddingBottom()
            int r4 = r0 - r1
            android.view.ViewGroup$LayoutParams r5 = r11.getLayoutParams()
            if (r5 == 0) goto L52
            r0 = -2
            if (r3 > 0) goto L3c
            int r1 = r5.width
            if (r1 != r0) goto L52
        L3c:
            if (r4 > 0) goto L43
            int r1 = r5.height
            if (r1 == r0) goto L43
            goto L52
        L43:
            ol0.c r9 = r11.f88027p
            com.zing.zalo.zlottie.widget.d r10 = new com.zing.zalo.zlottie.widget.d
            r0 = r10
            r1 = r11
            r2 = r12
            r0.<init>()
            r11.f88028q = r10
            r9.mo126933b(r10)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.zlottie.widget.LottieImageView.setDrawableFromInfo(com.zing.zalo.zlottie.widget.LottieImageView$b):void");
    }

    /* renamed from: w */
    private void m92144w(Runnable runnable) {
        if (this.f88029r != null) {
            removeCallbacks(this.f88029r);
        }
        this.f88029r = runnable;
        post(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    private void m92145z(C17291a c17291a, long j11) {
        C17291a c17291a2;
        C17291a c17291a3;
        this.f88026H = false;
        C17291a c17291a4 = this.f88030s;
        this.f88030s = c17291a;
        if (c17291a != null) {
            c17291a.m92213T(true);
        }
        if (System.currentTimeMillis() - j11 > 16 && c17291a4 == null && this.f88030s != null) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), this.f88030s});
            transitionDrawable.setCrossFadeEnabled(true);
            this.f88030s.m92218Z(new C17291a.h() { // from class: com.zing.zalo.zlottie.widget.c

                /* renamed from: a */
                public final /* synthetic */ TransitionDrawable f88117a;

                public /* synthetic */ C17293c(TransitionDrawable transitionDrawable2) {
                    r1 = transitionDrawable2;
                }

                @Override // com.zing.zalo.zlottie.widget.C17291a.h
                /* renamed from: a */
                public final void mo92221a() {
                    r1.startTransition(300);
                }
            });
            c17291a2 = transitionDrawable2;
        } else {
            c17291a2 = this.f88030s;
        }
        setImageDrawable(c17291a2);
        if (m92154q() && (c17291a3 = this.f88030s) != null) {
            c17291a3.start();
        }
    }

    /* renamed from: A */
    public void m92146A(String str, String str2, int i11, int i12, boolean z11, boolean z12) {
        C17290b c17290b;
        if (this.f88026H && (c17290b = this.f88034w) != null && TextUtils.equals(str, c17290b.f88039a)) {
            return;
        }
        C17290b m92158a = new C17290b.a().m92160c(str).m92166i(i11).m92165h(i12).m92161d(z12).m92162e(z11).m92164g(str2).m92158a();
        this.f88034w = m92158a;
        setDrawableFromInfo(m92158a);
    }

    /* renamed from: B */
    public void m92147B(String str, String str2, boolean z11, boolean z12) {
        m92146A(str, str2, 0, 0, z11, z12);
    }

    /* renamed from: C */
    public void m92148C(int i11, boolean z11) {
        C17290b c17290b;
        if (this.f88026H && (c17290b = this.f88034w) != null && i11 == c17290b.f88041c) {
            return;
        }
        C17290b m92158a = new C17290b.a().m92163f(i11).m92161d(z11).m92162e(false).m92158a();
        this.f88034w = m92158a;
        setDrawableFromInfo(m92158a);
    }

    /* renamed from: D */
    public void m92149D(float f11, float f12) {
        boolean z11;
        C17290b c17290b;
        if (f11 == this.f88020B && f12 == this.f88021C) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f88020B = f11;
        this.f88021C = f12;
        if (this.f88030s != null) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                if (width > 0 || layoutParams.width == -2) {
                    if (height > 0 || layoutParams.height == -2) {
                        setImageMatrix(m92137j(width, height, this.f88030s.getIntrinsicWidth(), this.f88030s.getIntrinsicHeight()));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (z11 && (c17290b = this.f88034w) != null) {
            setDrawableFromInfo(c17290b);
        }
    }

    /* renamed from: E */
    public void m92150E() {
        this.f88032u = false;
        C17291a c17291a = this.f88030s;
        if (c17291a != null && this.f88031t) {
            c17291a.stop();
        }
    }

    public C17291a getAnimatedDrawable() {
        return this.f88030s;
    }

    C17291a.f getAnimationListener() {
        return this.f88024F;
    }

    public C17291a.g getAutoRepeatMode() {
        return this.f88022D;
    }

    C17290b getCachedStickerInfo() {
        return this.f88034w;
    }

    public EnumSet<EnumC23875e> getDrawableAnchor() {
        return EnumSet.copyOf(this.f88036y);
    }

    public EnumC23879i getLottieScaleType() {
        return this.f88019A;
    }

    public float getLottieTranslateX() {
        return this.f88020B;
    }

    public float getLottieTranslateY() {
        return this.f88021C;
    }

    public int getMaxRepeatCount() {
        return this.f88023E;
    }

    public float getScale() {
        return this.f88037z;
    }

    public EnumSet<EnumC23875e> getViewAnchor() {
        return EnumSet.copyOf(this.f88035x);
    }

    /* renamed from: i */
    Size m92151i(C17290b c17290b, int i11, int i12, ViewGroup.LayoutParams layoutParams) {
        Size m124938e;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f11;
        float f12;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        int i19 = c17290b.f88041c;
        if (i19 != 0) {
            m124938e = AbstractC23880j.m124934a(context, i19);
        } else if (!TextUtils.isEmpty(c17290b.f88040b)) {
            m124938e = AbstractC23880j.m124936c(context, c17290b.f88040b);
        } else {
            Uri uri = c17290b.f88042d;
            if (uri != null) {
                m124938e = AbstractC23880j.m124935b(context, uri);
            } else {
                m124938e = AbstractC23880j.m124938e(c17290b.f88039a);
            }
        }
        if (m124938e.getWidth() > 0) {
            i13 = m124938e.getWidth();
        } else {
            i13 = 1;
        }
        if (m124938e.getHeight() > 0) {
            i14 = m124938e.getHeight();
        } else {
            i14 = 1;
        }
        float f13 = i13;
        float f14 = i14;
        float f15 = f13 / f14;
        int i21 = C17289a.f88038a[this.f88019A.ordinal()];
        if (i21 != 1) {
            if (i21 != 2) {
                if (i21 != 3) {
                    if (i21 != 4) {
                        i18 = 0;
                        i17 = 0;
                        return new Size(i18, i17);
                    }
                    if ((i11 <= 0 && layoutParams.width != -2) || (i12 <= 0 && layoutParams.height != -2)) {
                        return null;
                    }
                    if (layoutParams.width == -2) {
                        i11 = i13;
                    }
                    if (layoutParams.height == -2) {
                        i12 = i14;
                    }
                    f11 = i11;
                    float f16 = i12;
                    if (f11 / f13 <= f16 / f14) {
                        f12 = this.f88037z;
                    } else {
                        i16 = (int) (f16 * this.f88037z);
                    }
                } else {
                    if (i12 <= 0 && layoutParams.height != -2) {
                        return null;
                    }
                    if (layoutParams.height == -2) {
                        i16 = (int) (f14 * this.f88037z);
                    } else {
                        i16 = (int) (i12 * this.f88037z);
                    }
                }
                i15 = (int) (i16 * f15);
            } else {
                if (i11 <= 0 && layoutParams.width != -2) {
                    return null;
                }
                if (layoutParams.width == -2) {
                    i18 = (int) (f13 * this.f88037z);
                    i17 = (int) (i18 / f15);
                    return new Size(i18, i17);
                }
                f11 = i11;
                f12 = this.f88037z;
            }
            i18 = (int) (f11 * f12);
            i17 = (int) (i18 / f15);
            return new Size(i18, i17);
        }
        float f17 = this.f88037z;
        i15 = (int) (f13 * f17);
        i16 = (int) (f14 * f17);
        int i22 = i15;
        i17 = i16;
        i18 = i22;
        return new Size(i18, i17);
    }

    /* renamed from: k */
    int m92152k(int i11, int i12) {
        int i13 = (int) (i11 * this.f88020B);
        EnumSet enumSet = this.f88035x;
        EnumC23875e enumC23875e = EnumC23875e.LEFT;
        if (enumSet.contains(enumC23875e)) {
            if (this.f88036y.contains(EnumC23875e.CENTER_HORIZONTAL)) {
                i12 /= 2;
            } else if (!this.f88036y.contains(EnumC23875e.RIGHT)) {
                return i13;
            }
            return i13 - i12;
        }
        EnumSet enumSet2 = this.f88035x;
        EnumC23875e enumC23875e2 = EnumC23875e.CENTER_HORIZONTAL;
        if (enumSet2.contains(enumC23875e2)) {
            if (this.f88036y.contains(enumC23875e)) {
                i11 /= 2;
            } else {
                if (this.f88036y.contains(enumC23875e2)) {
                    i11 /= 2;
                    i12 /= 2;
                } else if (this.f88036y.contains(EnumC23875e.RIGHT)) {
                    i11 /= 2;
                } else {
                    return i13;
                }
                i11 -= i12;
            }
        } else {
            EnumSet enumSet3 = this.f88035x;
            EnumC23875e enumC23875e3 = EnumC23875e.RIGHT;
            if (enumSet3.contains(enumC23875e3)) {
                if (!this.f88036y.contains(enumC23875e)) {
                    if (this.f88036y.contains(enumC23875e2)) {
                        i12 /= 2;
                    } else if (!this.f88036y.contains(enumC23875e3)) {
                        return i13;
                    }
                    i11 -= i12;
                }
            } else {
                return i13;
            }
        }
        return i13 + i11;
    }

    /* renamed from: l */
    int m92153l(int i11, int i12) {
        int i13 = (int) (this.f88021C * i11);
        EnumSet enumSet = this.f88035x;
        EnumC23875e enumC23875e = EnumC23875e.TOP;
        if (enumSet.contains(enumC23875e)) {
            if (this.f88036y.contains(EnumC23875e.CENTER_VERTICAL)) {
                i12 /= 2;
            } else if (!this.f88036y.contains(EnumC23875e.BOTTOM)) {
                return i13;
            }
            return i13 - i12;
        }
        EnumSet enumSet2 = this.f88035x;
        EnumC23875e enumC23875e2 = EnumC23875e.CENTER_VERTICAL;
        if (enumSet2.contains(enumC23875e2)) {
            if (this.f88036y.contains(enumC23875e)) {
                i11 /= 2;
            } else {
                if (this.f88036y.contains(enumC23875e2)) {
                    i11 /= 2;
                    i12 /= 2;
                } else if (this.f88036y.contains(EnumC23875e.BOTTOM)) {
                    i11 /= 2;
                } else {
                    return i13;
                }
                i11 -= i12;
            }
        } else {
            EnumSet enumSet3 = this.f88035x;
            EnumC23875e enumC23875e3 = EnumC23875e.BOTTOM;
            if (enumSet3.contains(enumC23875e3)) {
                if (!this.f88036y.contains(enumC23875e)) {
                    if (this.f88036y.contains(enumC23875e2)) {
                        i12 /= 2;
                    } else if (!this.f88036y.contains(enumC23875e3)) {
                        return i13;
                    }
                    i11 -= i12;
                }
            } else {
                return i13;
            }
        }
        return i13 + i11;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f88031t = true;
        C17291a c17291a = this.f88030s;
        if (c17291a == null) {
            return;
        }
        c17291a.setCallback(this);
        if (this.f88032u) {
            if (this.f88033v) {
                this.f88030s.m92212R();
                this.f88033v = false;
            } else {
                this.f88030s.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f88031t = false;
        C17291a c17291a = this.f88030s;
        if (c17291a != null) {
            c17291a.stop();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        C17290b c17290b;
        super.onSizeChanged(i11, i12, i13, i14);
        if ((i11 == i13 && i12 == i14) || (c17290b = this.f88034w) == null) {
            return;
        }
        setDrawableFromInfo(c17290b);
    }

    /* renamed from: q */
    public boolean m92154q() {
        C17291a c17291a = this.f88030s;
        if ((c17291a != null && c17291a.isRunning()) || this.f88032u) {
            return true;
        }
        return false;
    }

    public void setAnimationListener(C17291a.f fVar) {
        this.f88024F = fVar;
        C17291a c17291a = this.f88030s;
        if (c17291a != null) {
            c17291a.m92214U(fVar);
            return;
        }
        C17290b c17290b = this.f88034w;
        if (c17290b != null) {
            setDrawableFromInfo(c17290b);
        }
    }

    public void setAutoRepeatMode(C17291a.g gVar) {
        if (gVar == this.f88022D) {
            return;
        }
        this.f88022D = gVar;
        C17291a c17291a = this.f88030s;
        if (c17291a != null) {
            c17291a.m92215V(gVar);
            return;
        }
        C17290b c17290b = this.f88034w;
        if (c17290b != null) {
            setDrawableFromInfo(c17290b);
        }
    }

    public void setDrawAnimationBound(boolean z11) {
        this.f88025G = z11;
        C17291a c17291a = this.f88030s;
        if (c17291a != null) {
            c17291a.m92216X(z11);
            return;
        }
        C17290b c17290b = this.f88034w;
        if (c17290b != null) {
            setDrawableFromInfo(c17290b);
        }
    }

    public void setDrawableAnchor(EnumSet<EnumC23875e> enumSet) {
        m92156x(getViewAnchor(), enumSet);
    }

    public void setLottieDrawable(C17291a c17291a) {
        if (c17291a == this.f88030s) {
            return;
        }
        this.f88034w = null;
        m92145z(c17291a, System.currentTimeMillis());
    }

    public void setLottieScale(float f11) {
        if (f11 == this.f88037z) {
            return;
        }
        this.f88037z = f11;
        C17290b c17290b = this.f88034w;
        if (c17290b != null) {
            setDrawableFromInfo(c17290b);
        }
    }

    public void setLottieScaleType(EnumC23879i enumC23879i) {
        if (enumC23879i == this.f88019A) {
            return;
        }
        this.f88019A = enumC23879i;
        C17290b c17290b = this.f88034w;
        if (c17290b != null) {
            setDrawableFromInfo(c17290b);
        }
    }

    public void setLottieTranslateX(float f11) {
        m92149D(f11, this.f88021C);
    }

    public void setLottieTranslateY(float f11) {
        m92149D(this.f88020B, f11);
    }

    public void setMaxRepeatCount(int i11) {
        if (i11 == this.f88023E) {
            return;
        }
        this.f88023E = i11;
        C17291a c17291a = this.f88030s;
        if (c17291a != null) {
            c17291a.m92217Y(i11);
            return;
        }
        C17290b c17290b = this.f88034w;
        if (c17290b != null) {
            setDrawableFromInfo(c17290b);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setViewAnchor(EnumSet<EnumC23875e> enumSet) {
        m92156x(enumSet, getDrawableAnchor());
    }

    /* renamed from: v */
    public void m92155v() {
        this.f88032u = true;
        this.f88033v = false;
        C17291a c17291a = this.f88030s;
        if (c17291a != null && this.f88031t) {
            c17291a.start();
        }
    }

    /* renamed from: x */
    public void m92156x(EnumSet enumSet, EnumSet enumSet2) {
        if (enumSet.equals(this.f88035x) && enumSet2.equals(this.f88036y)) {
            return;
        }
        this.f88036y.clear();
        this.f88036y.addAll(enumSet2);
        this.f88035x.clear();
        this.f88035x.addAll(enumSet);
        if (this.f88030s != null) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                if (width > 0 || layoutParams.width == -2) {
                    if (height > 0 || layoutParams.height == -2) {
                        setImageMatrix(m92137j(width, height, this.f88030s.getIntrinsicWidth(), this.f88030s.getIntrinsicHeight()));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C17290b c17290b = this.f88034w;
        if (c17290b != null) {
            setDrawableFromInfo(c17290b);
        }
    }

    /* renamed from: y */
    public void m92157y(String str, boolean z11) {
        C17290b c17290b;
        if (this.f88026H && (c17290b = this.f88034w) != null && str.equals(c17290b.f88040b)) {
            return;
        }
        C17290b m92158a = new C17290b.a().m92159b(str).m92161d(z11).m92158a();
        this.f88034w = m92158a;
        setDrawableFromInfo(m92158a);
    }

    public LottieImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88027p = new C24307e(AbstractC0837p0.m2225f());
        this.f88028q = null;
        this.f88029r = null;
        this.f88033v = false;
        EnumC23875e enumC23875e = EnumC23875e.TOP;
        EnumC23875e enumC23875e2 = EnumC23875e.LEFT;
        this.f88035x = EnumSet.of(enumC23875e, enumC23875e2);
        this.f88036y = EnumSet.of(enumC23875e, enumC23875e2);
        this.f88037z = 1.0f;
        this.f88019A = EnumC23879i.SCALE_TYPE_FIXED_VIEW;
        this.f88020B = 0.0f;
        this.f88021C = 0.0f;
        this.f88022D = C17291a.g.INFINITE;
        this.f88023E = 1;
        this.f88024F = null;
        this.f88025G = false;
        this.f88026H = false;
        m92140p();
    }
}
