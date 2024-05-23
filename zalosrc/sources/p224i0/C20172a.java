package p224i0;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C1181j1;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.graphics.drawable.InterfaceC1416c;
import androidx.vectordrawable.graphics.drawable.C2040d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p224i0.AbstractC20175d;
import p224i0.AbstractC20177f;
import p251j0.AbstractC20897b;
import p665y0.C30242d;
import p665y0.C30246h;

/* renamed from: i0.a */
/* loaded from: classes2.dex */
public class C20172a extends AbstractC20177f implements InterfaceC1416c {

    /* renamed from: D */
    private c f99635D;

    /* renamed from: E */
    private g f99636E;

    /* renamed from: F */
    private int f99637F;

    /* renamed from: G */
    private int f99638G;

    /* renamed from: H */
    private boolean f99639H;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0.a$b */
    /* loaded from: classes2.dex */
    public static class b extends g {

        /* renamed from: a */
        private final Animatable f99640a;

        b(Animatable animatable) {
            super();
            this.f99640a = animatable;
        }

        @Override // p224i0.C20172a.g
        /* renamed from: c */
        public void mo105205c() {
            this.f99640a.start();
        }

        @Override // p224i0.C20172a.g
        /* renamed from: d */
        public void mo105206d() {
            this.f99640a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.a$c */
    /* loaded from: classes2.dex */
    public static class c extends AbstractC20177f.a {

        /* renamed from: K */
        C30242d f99641K;

        /* renamed from: L */
        C30246h f99642L;

        c(c cVar, C20172a c20172a, Resources resources) {
            super(cVar, c20172a, resources);
            if (cVar != null) {
                this.f99641K = cVar.f99641K;
                this.f99642L = cVar.f99642L;
            } else {
                this.f99641K = new C30242d();
                this.f99642L = new C30246h();
            }
        }

        /* renamed from: D */
        private static long m105207D(int i11, int i12) {
            return i12 | (i11 << 32);
        }

        /* renamed from: B */
        int m105208B(int[] iArr, Drawable drawable, int i11) {
            int m105259z = super.m105259z(iArr, drawable);
            this.f99642L.m149177k(m105259z, Integer.valueOf(i11));
            return m105259z;
        }

        /* renamed from: C */
        int m105209C(int i11, int i12, Drawable drawable, boolean z11) {
            long j11;
            int m105233a = super.m105233a(drawable);
            long m105207D = m105207D(i11, i12);
            if (z11) {
                j11 = 8589934592L;
            } else {
                j11 = 0;
            }
            long j12 = m105233a;
            this.f99641K.m149125a(m105207D, Long.valueOf(j12 | j11));
            if (z11) {
                this.f99641K.m149125a(m105207D(i12, i11), Long.valueOf(4294967296L | j12 | j11));
            }
            return m105233a;
        }

        /* renamed from: E */
        int m105210E(int i11) {
            if (i11 < 0) {
                return 0;
            }
            return ((Integer) this.f99642L.m149173g(i11, 0)).intValue();
        }

        /* renamed from: F */
        int m105211F(int[] iArr) {
            int m105258A = super.m105258A(iArr);
            if (m105258A >= 0) {
                return m105258A;
            }
            return super.m105258A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        int m105212G(int i11, int i12) {
            return (int) ((Long) this.f99641K.m149129g(m105207D(i11, i12), -1L)).longValue();
        }

        /* renamed from: H */
        boolean m105213H(int i11, int i12) {
            if ((((Long) this.f99641K.m149129g(m105207D(i11, i12), -1L)).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: I */
        boolean m105214I(int i11, int i12) {
            if ((((Long) this.f99641K.m149129g(m105207D(i11, i12), -1L)).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C20172a(this, null);
        }

        @Override // p224i0.AbstractC20177f.a, p224i0.AbstractC20175d.c
        /* renamed from: r */
        void mo105215r() {
            this.f99641K = this.f99641K.clone();
            this.f99642L = this.f99642L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C20172a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0.a$d */
    /* loaded from: classes2.dex */
    public static class d extends g {

        /* renamed from: a */
        private final C2040d f99643a;

        d(C2040d c2040d) {
            super();
            this.f99643a = c2040d;
        }

        @Override // p224i0.C20172a.g
        /* renamed from: c */
        public void mo105205c() {
            this.f99643a.start();
        }

        @Override // p224i0.C20172a.g
        /* renamed from: d */
        public void mo105206d() {
            this.f99643a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0.a$e */
    /* loaded from: classes2.dex */
    public static class e extends g {

        /* renamed from: a */
        private final ObjectAnimator f99644a;

        /* renamed from: b */
        private final boolean f99645b;

        e(AnimationDrawable animationDrawable, boolean z11, boolean z12) {
            super();
            int i11;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z11) {
                i11 = numberOfFrames - 1;
            } else {
                i11 = 0;
            }
            int i12 = z11 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z11);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i12);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.m105218a());
            ofInt.setInterpolator(fVar);
            this.f99645b = z12;
            this.f99644a = ofInt;
        }

        @Override // p224i0.C20172a.g
        /* renamed from: a */
        public boolean mo105216a() {
            return this.f99645b;
        }

        @Override // p224i0.C20172a.g
        /* renamed from: b */
        public void mo105217b() {
            this.f99644a.reverse();
        }

        @Override // p224i0.C20172a.g
        /* renamed from: c */
        public void mo105205c() {
            this.f99644a.start();
        }

        @Override // p224i0.C20172a.g
        /* renamed from: d */
        public void mo105206d() {
            this.f99644a.cancel();
        }
    }

    /* renamed from: i0.a$f */
    /* loaded from: classes2.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f99646a;

        /* renamed from: b */
        private int f99647b;

        /* renamed from: c */
        private int f99648c;

        f(AnimationDrawable animationDrawable, boolean z11) {
            m105219b(animationDrawable, z11);
        }

        /* renamed from: a */
        int m105218a() {
            return this.f99648c;
        }

        /* renamed from: b */
        int m105219b(AnimationDrawable animationDrawable, boolean z11) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f99647b = numberOfFrames;
            int[] iArr = this.f99646a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f99646a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f99646a;
            int i11 = 0;
            for (int i12 = 0; i12 < numberOfFrames; i12++) {
                int duration = animationDrawable.getDuration(z11 ? (numberOfFrames - i12) - 1 : i12);
                iArr2[i12] = duration;
                i11 += duration;
            }
            this.f99648c = i11;
            return i11;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12;
            int i11 = (int) ((f11 * this.f99648c) + 0.5f);
            int i12 = this.f99647b;
            int[] iArr = this.f99646a;
            int i13 = 0;
            while (i13 < i12) {
                int i14 = iArr[i13];
                if (i11 < i14) {
                    break;
                }
                i11 -= i14;
                i13++;
            }
            if (i13 < i12) {
                f12 = i11 / this.f99648c;
            } else {
                f12 = 0.0f;
            }
            return (i13 / i12) + f12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0.a$g */
    /* loaded from: classes2.dex */
    public static abstract class g {
        private g() {
        }

        /* renamed from: a */
        public boolean mo105216a() {
            return false;
        }

        /* renamed from: b */
        public void mo105217b() {
        }

        /* renamed from: c */
        public abstract void mo105205c();

        /* renamed from: d */
        public abstract void mo105206d();
    }

    public C20172a() {
        this(null, null);
    }

    /* renamed from: l */
    public static C20172a m105194l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C20172a c20172a = new C20172a();
            c20172a.m105204m(context, resources, xmlPullParser, attributeSet, theme);
            return c20172a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: n */
    private void m105195n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            m105197q(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals("transition")) {
                            m105198r(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m105196p() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:            if (r5 != 2) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:            if (r7.getName().equals("vector") == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:            r5 = androidx.vectordrawable.graphics.drawable.C2045i.m11074d(r6, r7, r8, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:            r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:            if (r5 == null) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:            return r4.f99635D.m105208B(r0, r5, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:            if (r5 == null) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:            r5 = r7.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:            if (r5 != 4) goto L24;     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m105197q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC20897b.AnimatedStateListDrawableItem);
        int resourceId = m7115k.getResourceId(AbstractC20897b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = m7115k.getResourceId(AbstractC20897b.AnimatedStateListDrawableItem_android_drawable, -1);
        if (resourceId2 > 0) {
            drawable = C1181j1.m5584h().m5593j(context, resourceId2);
        } else {
            drawable = null;
        }
        m7115k.recycle();
        int[] m105257j = m105257j(attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:            if (r4 != 2) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:            if (r10.getName().equals("animated-vector") == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:            r4 = androidx.vectordrawable.graphics.drawable.C2040d.m11046c(r8, r9, r10, r11, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:            r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:            if (r4 == null) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:            if (r1 == (-1)) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:            if (r3 == (-1)) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:            return r7.f99635D.m105209C(r1, r3, r4, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:            if (r4 == null) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:            r4 = r10.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:            if (r4 != 4) goto L28;     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m105198r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC20897b.AnimatedStateListDrawableTransition);
        int resourceId = m7115k.getResourceId(AbstractC20897b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = m7115k.getResourceId(AbstractC20897b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = m7115k.getResourceId(AbstractC20897b.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (resourceId3 > 0) {
            drawable = C1181j1.m5584h().m5593j(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z11 = m7115k.getBoolean(AbstractC20897b.AnimatedStateListDrawableTransition_android_reversible, false);
        m7115k.recycle();
    }

    /* renamed from: s */
    private boolean m105199s(int i11) {
        int m105226c;
        int m105212G;
        g bVar;
        g gVar = this.f99636E;
        if (gVar != null) {
            if (i11 == this.f99637F) {
                return true;
            }
            if (i11 == this.f99638G && gVar.mo105216a()) {
                gVar.mo105217b();
                this.f99637F = this.f99638G;
                this.f99638G = i11;
                return true;
            }
            m105226c = this.f99637F;
            gVar.mo105206d();
        } else {
            m105226c = m105226c();
        }
        this.f99636E = null;
        this.f99638G = -1;
        this.f99637F = -1;
        c cVar = this.f99635D;
        int m105210E = cVar.m105210E(m105226c);
        int m105210E2 = cVar.m105210E(i11);
        if (m105210E2 == 0 || m105210E == 0 || (m105212G = cVar.m105212G(m105210E, m105210E2)) < 0) {
            return false;
        }
        boolean m105214I = cVar.m105214I(m105210E, m105210E2);
        m105227g(m105212G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m105213H(m105210E, m105210E2), m105214I);
        } else if (current instanceof C2040d) {
            bVar = new d((C2040d) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.mo105205c();
        this.f99636E = bVar;
        this.f99638G = m105226c;
        this.f99637F = i11;
        return true;
    }

    /* renamed from: u */
    private void m105200u(TypedArray typedArray) {
        c cVar = this.f99635D;
        cVar.f99675d |= typedArray.getChangingConfigurations();
        cVar.m105253x(typedArray.getBoolean(AbstractC20897b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f99680i));
        cVar.m105249t(typedArray.getBoolean(AbstractC20897b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f99683l));
        cVar.m105250u(typedArray.getInt(AbstractC20897b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f99663A));
        cVar.m105251v(typedArray.getInt(AbstractC20897b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f99664B));
        setDither(typedArray.getBoolean(AbstractC20897b.AnimatedStateListDrawableCompat_android_dither, cVar.f99695x));
    }

    @Override // p224i0.AbstractC20177f, p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p224i0.AbstractC20177f, p224i0.AbstractC20175d
    /* renamed from: h */
    public void mo105202h(AbstractC20175d.c cVar) {
        super.mo105202h(cVar);
        if (cVar instanceof c) {
            this.f99635D = (c) cVar;
        }
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f99636E;
        if (gVar != null) {
            gVar.mo105206d();
            this.f99636E = null;
            m105227g(this.f99637F);
            this.f99637F = -1;
            this.f99638G = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p224i0.AbstractC20175d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c mo105201b() {
        return new c(this.f99635D, this, null);
    }

    /* renamed from: m */
    public void m105204m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC20897b.AnimatedStateListDrawableCompat);
        setVisible(m7115k.getBoolean(AbstractC20897b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m105200u(m7115k);
        m105228i(resources);
        m7115k.recycle();
        m105195n(context, resources, xmlPullParser, attributeSet, theme);
        m105196p();
    }

    @Override // p224i0.AbstractC20177f, p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f99639H && super.mutate() == this) {
            this.f99635D.mo105215r();
            this.f99639H = true;
        }
        return this;
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i11) {
        return super.onLayoutDirectionChanged(i11);
    }

    @Override // p224i0.AbstractC20177f, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z11;
        int m105211F = this.f99635D.m105211F(iArr);
        if (m105211F != m105226c() && (m105199s(m105211F) || m105227g(m105211F))) {
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z11 | current.setState(iArr);
        }
        return z11;
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        super.scheduleDrawable(drawable, runnable, j11);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i11) {
        super.setAlpha(i11);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z11) {
        super.setAutoMirrored(z11);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z11) {
        super.setDither(z11);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f11, float f12) {
        super.setHotspot(f11, f12);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i11, int i12, int i13, int i14) {
        super.setHotspotBounds(i11, i12, i13, i14);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        g gVar = this.f99636E;
        if (gVar != null && (visible || z12)) {
            if (z11) {
                gVar.mo105205c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C20172a(c cVar, Resources resources) {
        super(null);
        this.f99637F = -1;
        this.f99638G = -1;
        mo105202h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
