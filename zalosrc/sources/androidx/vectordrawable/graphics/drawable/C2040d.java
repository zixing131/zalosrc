package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p665y0.C30239a;

/* renamed from: androidx.vectordrawable.graphics.drawable.d */
/* loaded from: classes2.dex */
public class C2040d extends AbstractC2044h implements InterfaceC2038b {

    /* renamed from: q */
    private c f8650q;

    /* renamed from: r */
    private Context f8651r;

    /* renamed from: s */
    private ArgbEvaluator f8652s;

    /* renamed from: t */
    d f8653t;

    /* renamed from: u */
    private Animator.AnimatorListener f8654u;

    /* renamed from: v */
    ArrayList f8655v;

    /* renamed from: w */
    final Drawable.Callback f8656w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.d$a */
    /* loaded from: classes2.dex */
    public class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C2040d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
            C2040d.this.scheduleSelf(runnable, j11);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C2040d.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.d$b */
    /* loaded from: classes2.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C2040d.this.f8655v);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((InterfaceC2038b.a) arrayList.get(i11)).mo11042b(C2040d.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C2040d.this.f8655v);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((InterfaceC2038b.a) arrayList.get(i11)).m11043c(C2040d.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.d$c */
    /* loaded from: classes2.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a */
        int f8659a;

        /* renamed from: b */
        C2045i f8660b;

        /* renamed from: c */
        AnimatorSet f8661c;

        /* renamed from: d */
        ArrayList f8662d;

        /* renamed from: e */
        C30239a f8663e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f8659a = cVar.f8659a;
                C2045i c2045i = cVar.f8660b;
                if (c2045i != null) {
                    Drawable.ConstantState constantState = c2045i.getConstantState();
                    if (resources != null) {
                        this.f8660b = (C2045i) constantState.newDrawable(resources);
                    } else {
                        this.f8660b = (C2045i) constantState.newDrawable();
                    }
                    C2045i c2045i2 = (C2045i) this.f8660b.mutate();
                    this.f8660b = c2045i2;
                    c2045i2.setCallback(callback);
                    this.f8660b.setBounds(cVar.f8660b.getBounds());
                    this.f8660b.m11080i(false);
                }
                ArrayList arrayList = cVar.f8662d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f8662d = new ArrayList(size);
                    this.f8663e = new C30239a(size);
                    for (int i11 = 0; i11 < size; i11++) {
                        Animator animator = (Animator) cVar.f8662d.get(i11);
                        Animator clone = animator.clone();
                        String str = (String) cVar.f8663e.get(animator);
                        clone.setTarget(this.f8660b.m11079e(str));
                        this.f8662d.add(clone);
                        this.f8663e.put(clone, str);
                    }
                    m11049a();
                }
            }
        }

        /* renamed from: a */
        public void m11049a() {
            if (this.f8661c == null) {
                this.f8661c = new AnimatorSet();
            }
            this.f8661c.playTogether(this.f8662d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f8659a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C2040d() {
        this(null, null, null);
    }

    /* renamed from: b */
    public static C2040d m11045b(Context context, int i11) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C2040d c2040d = new C2040d(context);
            Drawable m7082f = AbstractC1401h.m7082f(context.getResources(), i11, context.getTheme());
            c2040d.f8667p = m7082f;
            m7082f.setCallback(c2040d.f8656w);
            c2040d.f8653t = new d(c2040d.f8667p.getConstantState());
            return c2040d;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i11);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m11046c(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static C2040d m11046c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2040d c2040d = new C2040d(context);
        c2040d.inflate(resources, xmlPullParser, attributeSet, theme);
        return c2040d;
    }

    /* renamed from: d */
    private static void m11047d(AnimatedVectorDrawable animatedVectorDrawable, InterfaceC2038b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.m11041a());
    }

    /* renamed from: e */
    private void m11048e(String str, Animator animator) {
        animator.setTarget(this.f8650q.f8660b.m11079e(str));
        c cVar = this.f8650q;
        if (cVar.f8662d == null) {
            cVar.f8662d = new ArrayList();
            this.f8650q.f8663e = new C30239a();
        }
        this.f8650q.f8662d.add(animator);
        this.f8650q.f8663e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.InterfaceC2038b
    /* renamed from: a */
    public void mo11040a(InterfaceC2038b.a aVar) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            m11047d((AnimatedVectorDrawable) drawable, aVar);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.f8655v == null) {
            this.f8655v = new ArrayList();
        }
        if (this.f8655v.contains(aVar)) {
            return;
        }
        this.f8655v.add(aVar);
        if (this.f8654u == null) {
            this.f8654u = new b();
        }
        this.f8650q.f8661c.addListener(this.f8654u);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7183a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return AbstractC1414a.m7184b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f8650q.f8660b.draw(canvas);
        if (this.f8650q.f8661c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return AbstractC1414a.m7186d(drawable);
        }
        return this.f8650q.f8660b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f8650q.f8659a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return AbstractC1414a.m7187e(drawable);
        }
        return this.f8650q.f8660b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f8667p != null && Build.VERSION.SDK_INT >= 24) {
            return new d(this.f8667p.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f8650q.f8660b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f8650q.f8660b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f8650q.f8660b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7189g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8640e);
                    int resourceId = m7115k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C2045i m11073c = C2045i.m11073c(resources, resourceId, theme);
                        m11073c.m11080i(false);
                        m11073c.setCallback(this.f8656w);
                        C2045i c2045i = this.f8650q.f8660b;
                        if (c2045i != null) {
                            c2045i.setCallback(null);
                        }
                        this.f8650q.f8660b = m11073c;
                    }
                    m7115k.recycle();
                } else if (ZinstantMetaConstant.TARGET_VIEWPORT.equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC2037a.f8641f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f8651r;
                        if (context != null) {
                            m11048e(string, AbstractC2042f.m11059i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f8650q.m11049a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return AbstractC1414a.m7190h(drawable);
        }
        return this.f8650q.f8660b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f8650q.f8661c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f8650q.f8660b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f8650q.f8660b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.setLevel(i11);
        }
        return this.f8650q.f8660b.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f8650q.f8660b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else {
            this.f8650q.f8660b.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7192j(drawable, z11);
        } else {
            this.f8650q.f8660b.setAutoMirrored(z11);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i11) {
        super.setChangingConfigurations(i11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i11, PorterDuff.Mode mode) {
        super.setColorFilter(i11, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z11) {
        super.setFilterBitmap(z11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f11, float f12) {
        super.setHotspot(f11, f12);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i11, int i12, int i13, int i14) {
        super.setHotspotBounds(i11, i12, i13, i14);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7196n(drawable, i11);
        } else {
            this.f8650q.f8660b.setTint(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7197o(drawable, colorStateList);
        } else {
            this.f8650q.f8660b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7198p(drawable, mode);
        } else {
            this.f8650q.f8660b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        this.f8650q.f8660b.setVisible(z11, z12);
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f8650q.f8661c.isStarted()) {
                return;
            }
            this.f8650q.f8661c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f8650q.f8661c.end();
        }
    }

    private C2040d(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8650q.f8660b.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.d$d */
    /* loaded from: classes2.dex */
    public static class d extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f8664a;

        public d(Drawable.ConstantState constantState) {
            this.f8664a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f8664a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f8664a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2040d c2040d = new C2040d();
            Drawable newDrawable = this.f8664a.newDrawable();
            c2040d.f8667p = newDrawable;
            newDrawable.setCallback(c2040d.f8656w);
            return c2040d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C2040d c2040d = new C2040d();
            Drawable newDrawable = this.f8664a.newDrawable(resources);
            c2040d.f8667p = newDrawable;
            newDrawable.setCallback(c2040d.f8656w);
            return c2040d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2040d c2040d = new C2040d();
            Drawable newDrawable = this.f8664a.newDrawable(resources, theme);
            c2040d.f8667p = newDrawable;
            newDrawable.setCallback(c2040d.f8656w);
            return c2040d;
        }
    }

    private C2040d(Context context, c cVar, Resources resources) {
        this.f8652s = null;
        this.f8654u = null;
        this.f8655v = null;
        a aVar = new a();
        this.f8656w = aVar;
        this.f8651r = context;
        if (cVar != null) {
            this.f8650q = cVar;
        } else {
            this.f8650q = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
