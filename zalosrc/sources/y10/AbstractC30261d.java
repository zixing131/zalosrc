package y10;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC1933z;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;

/* renamed from: y10.d */
/* loaded from: classes5.dex */
public abstract class AbstractC30261d extends AbstractC1933z {
    public static final c Companion = new c(null);

    /* renamed from: h */
    private final ArrayList f140561h = new ArrayList();

    /* renamed from: i */
    private final ArrayList f140562i = new ArrayList();

    /* renamed from: j */
    private final ArrayList f140563j = new ArrayList();

    /* renamed from: k */
    private final ArrayList f140564k = new ArrayList();

    /* renamed from: l */
    private final ArrayList f140565l = new ArrayList();

    /* renamed from: m */
    private final ArrayList f140566m = new ArrayList();

    /* renamed from: n */
    private final ArrayList f140567n = new ArrayList();

    /* renamed from: o */
    private ArrayList f140568o = new ArrayList();

    /* renamed from: p */
    private final ArrayList f140569p = new ArrayList();

    /* renamed from: q */
    private ArrayList f140570q = new ArrayList();

    /* renamed from: r */
    private final ArrayList f140571r = new ArrayList();

    /* renamed from: y10.d$a */
    /* loaded from: classes5.dex */
    public static class a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y10.d$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private RecyclerView.AbstractC1876c0 f140572a;

        /* renamed from: b */
        private RecyclerView.AbstractC1876c0 f140573b;

        /* renamed from: c */
        private int f140574c;

        /* renamed from: d */
        private int f140575d;

        /* renamed from: e */
        private int f140576e;

        /* renamed from: f */
        private int f140577f;

        private b(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02) {
            this.f140572a = abstractC1876c0;
            this.f140573b = abstractC1876c02;
        }

        /* renamed from: a */
        public final int m149305a() {
            return this.f140574c;
        }

        /* renamed from: b */
        public final int m149306b() {
            return this.f140575d;
        }

        /* renamed from: c */
        public final RecyclerView.AbstractC1876c0 m149307c() {
            return this.f140573b;
        }

        /* renamed from: d */
        public final RecyclerView.AbstractC1876c0 m149308d() {
            return this.f140572a;
        }

        /* renamed from: e */
        public final int m149309e() {
            return this.f140576e;
        }

        /* renamed from: f */
        public final int m149310f() {
            return this.f140577f;
        }

        /* renamed from: g */
        public final void m149311g(RecyclerView.AbstractC1876c0 abstractC1876c0) {
            this.f140573b = abstractC1876c0;
        }

        /* renamed from: h */
        public final void m149312h(RecyclerView.AbstractC1876c0 abstractC1876c0) {
            this.f140572a = abstractC1876c0;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f140572a + ", newHolder=" + this.f140573b + ", fromX=" + this.f140574c + ", fromY=" + this.f140575d + ", toX=" + this.f140576e + ", toY=" + this.f140577f + "}";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02, int i11, int i12, int i13, int i14) {
            this(abstractC1876c0, abstractC1876c02);
            AbstractC19074t.m100208f(abstractC1876c0, "oldHolder");
            AbstractC19074t.m100208f(abstractC1876c02, "newHolder");
            this.f140574c = i11;
            this.f140575d = i12;
            this.f140576e = i13;
            this.f140577f = i14;
        }
    }

    /* renamed from: y10.d$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: y10.d$d */
    /* loaded from: classes5.dex */
    public final class d extends a {

        /* renamed from: p */
        private RecyclerView.AbstractC1876c0 f140578p;

        /* renamed from: q */
        final /* synthetic */ AbstractC30261d f140579q;

        public d(AbstractC30261d abstractC30261d, RecyclerView.AbstractC1876c0 abstractC1876c0) {
            AbstractC19074t.m100208f(abstractC1876c0, "viewHolder");
            this.f140579q = abstractC30261d;
            this.f140578p = abstractC1876c0;
        }

        @Override // y10.AbstractC30261d.a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            AbstractC30261d abstractC30261d = this.f140579q;
            View view = this.f140578p.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            abstractC30261d.m149285i0(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            AbstractC30261d abstractC30261d = this.f140579q;
            View view = this.f140578p.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            abstractC30261d.m149285i0(view);
            this.f140579q.m10678F(this.f140578p);
            this.f140579q.m149299p0().remove(this.f140578p);
            this.f140579q.m149286j0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f140579q.m10679G(this.f140578p);
        }
    }

    /* renamed from: y10.d$e */
    /* loaded from: classes5.dex */
    protected final class e extends a {

        /* renamed from: p */
        private RecyclerView.AbstractC1876c0 f140580p;

        /* renamed from: q */
        final /* synthetic */ AbstractC30261d f140581q;

        public e(AbstractC30261d abstractC30261d, RecyclerView.AbstractC1876c0 abstractC1876c0) {
            AbstractC19074t.m100208f(abstractC1876c0, "viewHolder");
            this.f140581q = abstractC30261d;
            this.f140580p = abstractC1876c0;
        }

        @Override // y10.AbstractC30261d.a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            AbstractC30261d abstractC30261d = this.f140581q;
            View view = this.f140580p.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            abstractC30261d.m149285i0(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            AbstractC30261d abstractC30261d = this.f140581q;
            View view = this.f140580p.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            abstractC30261d.m149285i0(view);
            this.f140581q.m10684L(this.f140580p);
            this.f140581q.m149301r0().remove(this.f140580p);
            this.f140581q.m149286j0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f140581q.m10685M(this.f140580p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y10.d$f */
    /* loaded from: classes5.dex */
    public static final class f {

        /* renamed from: a */
        private RecyclerView.AbstractC1876c0 f140582a;

        /* renamed from: b */
        private int f140583b;

        /* renamed from: c */
        private int f140584c;

        /* renamed from: d */
        private int f140585d;

        /* renamed from: e */
        private int f140586e;

        public f(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
            AbstractC19074t.m100208f(abstractC1876c0, "holder");
            this.f140582a = abstractC1876c0;
            this.f140583b = i11;
            this.f140584c = i12;
            this.f140585d = i13;
            this.f140586e = i14;
        }

        /* renamed from: a */
        public final int m149313a() {
            return this.f140583b;
        }

        /* renamed from: b */
        public final int m149314b() {
            return this.f140584c;
        }

        /* renamed from: c */
        public final RecyclerView.AbstractC1876c0 m149315c() {
            return this.f140582a;
        }

        /* renamed from: d */
        public final int m149316d() {
            return this.f140585d;
        }

        /* renamed from: e */
        public final int m149317e() {
            return this.f140586e;
        }
    }

    /* renamed from: y10.d$g */
    /* loaded from: classes5.dex */
    public static final class g extends a {

        /* renamed from: q */
        final /* synthetic */ b f140588q;

        /* renamed from: r */
        final /* synthetic */ ViewPropertyAnimator f140589r;

        /* renamed from: s */
        final /* synthetic */ View f140590s;

        g(b bVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f140588q = bVar;
            this.f140589r = viewPropertyAnimator;
            this.f140590s = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f140589r.setListener(null);
            this.f140590s.setAlpha(1.0f);
            this.f140590s.setTranslationX(0.0f);
            this.f140590s.setTranslationY(0.0f);
            AbstractC30261d.this.m10680H(this.f140588q.m149308d(), true);
            if (this.f140588q.m149308d() != null) {
                ArrayList arrayList = AbstractC30261d.this.f140571r;
                RecyclerView.AbstractC1876c0 m149308d = this.f140588q.m149308d();
                AbstractC19074t.m100205c(m149308d);
                arrayList.remove(m149308d);
            }
            AbstractC30261d.this.m149286j0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            AbstractC30261d.this.m10681I(this.f140588q.m149308d(), true);
        }
    }

    /* renamed from: y10.d$h */
    /* loaded from: classes5.dex */
    public static final class h extends a {

        /* renamed from: q */
        final /* synthetic */ b f140592q;

        /* renamed from: r */
        final /* synthetic */ ViewPropertyAnimator f140593r;

        /* renamed from: s */
        final /* synthetic */ View f140594s;

        h(b bVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f140592q = bVar;
            this.f140593r = viewPropertyAnimator;
            this.f140594s = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f140593r.setListener(null);
            this.f140594s.setAlpha(1.0f);
            this.f140594s.setTranslationX(0.0f);
            this.f140594s.setTranslationY(0.0f);
            AbstractC30261d.this.m10680H(this.f140592q.m149307c(), false);
            if (this.f140592q.m149307c() != null) {
                ArrayList arrayList = AbstractC30261d.this.f140571r;
                RecyclerView.AbstractC1876c0 m149307c = this.f140592q.m149307c();
                AbstractC19074t.m100205c(m149307c);
                arrayList.remove(m149307c);
            }
            AbstractC30261d.this.m149286j0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            AbstractC30261d.this.m10681I(this.f140592q.m149307c(), false);
        }
    }

    /* renamed from: y10.d$i */
    /* loaded from: classes5.dex */
    public static final class i extends a {

        /* renamed from: q */
        final /* synthetic */ RecyclerView.AbstractC1876c0 f140596q;

        /* renamed from: r */
        final /* synthetic */ int f140597r;

        /* renamed from: s */
        final /* synthetic */ View f140598s;

        /* renamed from: t */
        final /* synthetic */ int f140599t;

        /* renamed from: u */
        final /* synthetic */ ViewPropertyAnimator f140600u;

        i(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, View view, int i12, ViewPropertyAnimator viewPropertyAnimator) {
            this.f140596q = abstractC1876c0;
            this.f140597r = i11;
            this.f140598s = view;
            this.f140599t = i12;
            this.f140600u = viewPropertyAnimator;
        }

        @Override // y10.AbstractC30261d.a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            if (this.f140597r != 0) {
                this.f140598s.setTranslationX(0.0f);
            }
            if (this.f140599t != 0) {
                this.f140598s.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f140600u.setListener(null);
            AbstractC30261d.this.m10682J(this.f140596q);
            AbstractC30261d.this.f140569p.remove(this.f140596q);
            AbstractC30261d.this.m149286j0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            AbstractC30261d.this.m10683K(this.f140596q);
        }
    }

    public AbstractC30261d() {
        m10694V(false);
    }

    /* renamed from: e0 */
    private final void m149282e0(b bVar) {
        View view;
        RecyclerView.AbstractC1876c0 m149308d = bVar.m149308d();
        View view2 = null;
        if (m149308d != null) {
            view = m149308d.f7784p;
        } else {
            view = null;
        }
        RecyclerView.AbstractC1876c0 m149307c = bVar.m149307c();
        if (m149307c != null) {
            view2 = m149307c.f7784p;
        }
        if (view != null) {
            if (bVar.m149308d() != null) {
                ArrayList arrayList = this.f140571r;
                RecyclerView.AbstractC1876c0 m149308d2 = bVar.m149308d();
                AbstractC19074t.m100205c(m149308d2);
                arrayList.add(m149308d2);
            }
            ViewPropertyAnimator duration = view.animate().setDuration(m10047m());
            AbstractC19074t.m100207e(duration, "setDuration(...)");
            duration.translationX(bVar.m149309e() - bVar.m149305a());
            duration.translationY(bVar.m149310f() - bVar.m149306b());
            duration.alpha(0.0f).setListener(new g(bVar, duration, view)).start();
        }
        if (view2 != null) {
            if (bVar.m149307c() != null) {
                ArrayList arrayList2 = this.f140571r;
                RecyclerView.AbstractC1876c0 m149307c2 = bVar.m149307c();
                AbstractC19074t.m100205c(m149307c2);
                arrayList2.add(m149307c2);
            }
            ViewPropertyAnimator animate = view2.animate();
            animate.translationX(0.0f).translationY(0.0f).setDuration(m10047m()).alpha(1.0f).setListener(new h(bVar, animate, view2)).start();
        }
    }

    /* renamed from: f0 */
    private final void m149283f0(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
        View view = abstractC1876c0.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        if (i15 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i16 != 0) {
            view.animate().translationY(0.0f);
        }
        this.f140569p.add(abstractC1876c0);
        ViewPropertyAnimator animate = view.animate();
        animate.setDuration(m10048n()).setListener(new i(abstractC1876c0, i15, view, i16, animate)).start();
    }

    /* renamed from: h0 */
    private final void m149284h0(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            ((RecyclerView.AbstractC1876c0) list.get(size)).f7784p.animate().cancel();
            if (i11 >= 0) {
                size = i11;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m149285i0(View view) {
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2.0f);
        view.setPivotX(view.getMeasuredWidth() / 2.0f);
        view.animate().setInterpolator(null).setStartDelay(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m149286j0() {
        if (!mo10050p()) {
            m10043i();
        }
    }

    /* renamed from: k0 */
    private final void m149287k0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        mo149297d0(abstractC1876c0);
        this.f140568o.add(abstractC1876c0);
    }

    /* renamed from: l0 */
    private final void m149288l0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        mo149298g0(abstractC1876c0);
        this.f140570q.add(abstractC1876c0);
    }

    /* renamed from: m0 */
    private final void m149289m0(List list, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            b bVar = (b) list.get(size);
            if (m149291o0(bVar, abstractC1876c0) && bVar.m149308d() == null && bVar.m149307c() == null) {
                list.remove(bVar);
            }
            if (i11 >= 0) {
                size = i11;
            } else {
                return;
            }
        }
    }

    /* renamed from: n0 */
    private final void m149290n0(b bVar) {
        if (bVar.m149308d() != null) {
            m149291o0(bVar, bVar.m149308d());
        }
        if (bVar.m149307c() != null) {
            m149291o0(bVar, bVar.m149307c());
        }
    }

    /* renamed from: o0 */
    private final boolean m149291o0(b bVar, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        boolean z11 = false;
        if (bVar.m149307c() == abstractC1876c0) {
            bVar.m149311g(null);
        } else {
            if (bVar.m149308d() != abstractC1876c0) {
                return false;
            }
            bVar.m149312h(null);
            z11 = true;
        }
        AbstractC19074t.m100205c(abstractC1876c0);
        abstractC1876c0.f7784p.setAlpha(1.0f);
        abstractC1876c0.f7784p.setTranslationX(0.0f);
        abstractC1876c0.f7784p.setTranslationY(0.0f);
        m10680H(abstractC1876c0, z11);
        return true;
    }

    /* renamed from: t0 */
    private final void m149292t0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        View view = abstractC1876c0.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        m149285i0(view);
        mo149303u0(abstractC1876c0);
    }

    /* renamed from: v0 */
    private final void m149293v0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        View view = abstractC1876c0.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        m149285i0(view);
        m149304w0(abstractC1876c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m149294x0(AbstractC30261d abstractC30261d, ArrayList arrayList) {
        AbstractC19074t.m100208f(abstractC30261d, "this$0");
        AbstractC19074t.m100208f(arrayList, "$moves");
        if (!abstractC30261d.f140566m.remove(arrayList)) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            abstractC30261d.m149283f0(fVar.m149315c(), fVar.m149313a(), fVar.m149314b(), fVar.m149316d(), fVar.m149317e());
        }
        arrayList.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m149295y0(AbstractC30261d abstractC30261d, ArrayList arrayList) {
        AbstractC19074t.m100208f(abstractC30261d, "this$0");
        AbstractC19074t.m100208f(arrayList, "$changes");
        if (!abstractC30261d.f140567n.remove(arrayList)) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            AbstractC19074t.m100205c(bVar);
            abstractC30261d.m149282e0(bVar);
        }
        arrayList.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m149296z0(AbstractC30261d abstractC30261d, ArrayList arrayList) {
        AbstractC19074t.m100208f(abstractC30261d, "this$0");
        AbstractC19074t.m100208f(arrayList, "$additions");
        if (!abstractC30261d.f140565l.remove(arrayList)) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.AbstractC1876c0 abstractC1876c0 = (RecyclerView.AbstractC1876c0) it.next();
            AbstractC19074t.m100205c(abstractC1876c0);
            abstractC30261d.m149287k0(abstractC1876c0);
        }
        arrayList.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: B */
    public boolean mo10483B(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        mo10044j(abstractC1876c0);
        m149292t0(abstractC1876c0);
        this.f140562i.add(abstractC1876c0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: C */
    public boolean mo10484C(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02, int i11, int i12, int i13, int i14) {
        if (abstractC1876c0 == abstractC1876c02) {
            return mo10485D(abstractC1876c0, i11, i12, i13, i14);
        }
        if (abstractC1876c0 != null && abstractC1876c02 != null) {
            float translationX = abstractC1876c0.f7784p.getTranslationX();
            float translationY = abstractC1876c0.f7784p.getTranslationY();
            float alpha = abstractC1876c0.f7784p.getAlpha();
            mo10044j(abstractC1876c0);
            abstractC1876c0.f7784p.setTranslationX(translationX);
            abstractC1876c0.f7784p.setTranslationY(translationY);
            abstractC1876c0.f7784p.setAlpha(alpha);
            mo10044j(abstractC1876c02);
            abstractC1876c02.f7784p.setTranslationX(-((int) ((i13 - i11) - translationX)));
            abstractC1876c02.f7784p.setTranslationY(-((int) ((i14 - i12) - translationY)));
            abstractC1876c02.f7784p.setAlpha(0.0f);
            this.f140564k.add(new b(abstractC1876c0, abstractC1876c02, i11, i12, i13, i14));
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: D */
    public boolean mo10485D(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
        if (abstractC1876c0 == null) {
            return false;
        }
        View view = abstractC1876c0.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        int translationX = i11 + ((int) abstractC1876c0.f7784p.getTranslationX());
        int translationY = i12 + ((int) abstractC1876c0.f7784p.getTranslationY());
        mo10044j(abstractC1876c0);
        int i15 = i13 - translationX;
        int i16 = i14 - translationY;
        if (i15 == 0 && i16 == 0) {
            m10682J(abstractC1876c0);
            return false;
        }
        if (i15 != 0) {
            view.setTranslationX(-i15);
        }
        if (i16 != 0) {
            view.setTranslationY(-i16);
        }
        this.f140563j.add(new f(abstractC1876c0, translationX, translationY, i13, i14));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: E */
    public boolean mo10486E(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        if (abstractC1876c0 == null) {
            return true;
        }
        mo10044j(abstractC1876c0);
        m149293v0(abstractC1876c0);
        this.f140561h.add(abstractC1876c0);
        return true;
    }

    /* renamed from: d0 */
    protected abstract void mo149297d0(RecyclerView.AbstractC1876c0 abstractC1876c0);

    /* renamed from: g0 */
    protected abstract void mo149298g0(RecyclerView.AbstractC1876c0 abstractC1876c0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: j */
    public void mo10044j(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "item");
        View view = abstractC1876c0.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        view.animate().cancel();
        int size = this.f140563j.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                Object obj = this.f140563j.get(size);
                AbstractC19074t.m100207e(obj, "get(...)");
                if (((f) obj).m149315c() == abstractC1876c0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m10682J(abstractC1876c0);
                    this.f140563j.remove(size);
                }
                if (i11 < 0) {
                    break;
                } else {
                    size = i11;
                }
            }
        }
        m149289m0(this.f140564k, abstractC1876c0);
        if (this.f140561h.remove(abstractC1876c0)) {
            View view2 = abstractC1876c0.f7784p;
            AbstractC19074t.m100207e(view2, "itemView");
            m149285i0(view2);
            m10684L(abstractC1876c0);
        }
        if (this.f140562i.remove(abstractC1876c0)) {
            View view3 = abstractC1876c0.f7784p;
            AbstractC19074t.m100207e(view3, "itemView");
            m149285i0(view3);
            m10678F(abstractC1876c0);
        }
        int size2 = this.f140567n.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i12 = size2 - 1;
                Object obj2 = this.f140567n.get(size2);
                AbstractC19074t.m100207e(obj2, "get(...)");
                ArrayList arrayList = (ArrayList) obj2;
                m149289m0(arrayList, abstractC1876c0);
                if (arrayList.isEmpty()) {
                    this.f140567n.remove(size2);
                }
                if (i12 < 0) {
                    break;
                } else {
                    size2 = i12;
                }
            }
        }
        int size3 = this.f140566m.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i13 = size3 - 1;
                Object obj3 = this.f140566m.get(size3);
                AbstractC19074t.m100207e(obj3, "get(...)");
                ArrayList arrayList2 = (ArrayList) obj3;
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i14 = size4 - 1;
                        Object obj4 = arrayList2.get(size4);
                        AbstractC19074t.m100207e(obj4, "get(...)");
                        if (((f) obj4).m149315c() == abstractC1876c0) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            m10682J(abstractC1876c0);
                            arrayList2.remove(size4);
                            if (arrayList2.isEmpty()) {
                                this.f140566m.remove(size3);
                            }
                        } else if (i14 < 0) {
                            break;
                        } else {
                            size4 = i14;
                        }
                    }
                }
                if (i13 < 0) {
                    break;
                } else {
                    size3 = i13;
                }
            }
        }
        int size5 = this.f140565l.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i15 = size5 - 1;
                Object obj5 = this.f140565l.get(size5);
                AbstractC19074t.m100207e(obj5, "get(...)");
                ArrayList arrayList3 = (ArrayList) obj5;
                if (arrayList3.remove(abstractC1876c0)) {
                    View view4 = abstractC1876c0.f7784p;
                    AbstractC19074t.m100207e(view4, "itemView");
                    m149285i0(view4);
                    m10678F(abstractC1876c0);
                    if (arrayList3.isEmpty()) {
                        this.f140565l.remove(size5);
                    }
                }
                if (i15 < 0) {
                    break;
                } else {
                    size5 = i15;
                }
            }
        }
        this.f140570q.remove(abstractC1876c0);
        this.f140568o.remove(abstractC1876c0);
        this.f140571r.remove(abstractC1876c0);
        this.f140569p.remove(abstractC1876c0);
        m149286j0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: k */
    public void mo10045k() {
        int size = this.f140563j.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            Object obj = this.f140563j.get(size);
            AbstractC19074t.m100207e(obj, "get(...)");
            f fVar = (f) obj;
            View view = fVar.m149315c().f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m10682J(fVar.m149315c());
            this.f140563j.remove(size);
        }
        for (int size2 = this.f140561h.size() - 1; -1 < size2; size2--) {
            Object obj2 = this.f140561h.get(size2);
            AbstractC19074t.m100207e(obj2, "get(...)");
            m10684L((RecyclerView.AbstractC1876c0) obj2);
            this.f140561h.remove(size2);
        }
        for (int size3 = this.f140562i.size() - 1; -1 < size3; size3--) {
            Object obj3 = this.f140562i.get(size3);
            AbstractC19074t.m100207e(obj3, "get(...)");
            RecyclerView.AbstractC1876c0 abstractC1876c0 = (RecyclerView.AbstractC1876c0) obj3;
            View view2 = abstractC1876c0.f7784p;
            AbstractC19074t.m100207e(view2, "itemView");
            m149285i0(view2);
            m10678F(abstractC1876c0);
            this.f140562i.remove(size3);
        }
        for (int size4 = this.f140564k.size() - 1; -1 < size4; size4--) {
            Object obj4 = this.f140564k.get(size4);
            AbstractC19074t.m100207e(obj4, "get(...)");
            m149290n0((b) obj4);
        }
        this.f140564k.clear();
        if (!mo10050p()) {
            return;
        }
        for (int size5 = this.f140566m.size() - 1; -1 < size5; size5--) {
            Object obj5 = this.f140566m.get(size5);
            AbstractC19074t.m100207e(obj5, "get(...)");
            ArrayList arrayList = (ArrayList) obj5;
            for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                Object obj6 = arrayList.get(size6);
                AbstractC19074t.m100207e(obj6, "get(...)");
                f fVar2 = (f) obj6;
                View view3 = fVar2.m149315c().f7784p;
                AbstractC19074t.m100207e(view3, "itemView");
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                m10682J(fVar2.m149315c());
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f140566m.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f140565l.size() - 1; -1 < size7; size7--) {
            Object obj7 = this.f140565l.get(size7);
            AbstractC19074t.m100207e(obj7, "get(...)");
            ArrayList arrayList2 = (ArrayList) obj7;
            for (int size8 = arrayList2.size() - 1; -1 < size8; size8--) {
                Object obj8 = arrayList2.get(size8);
                AbstractC19074t.m100207e(obj8, "get(...)");
                RecyclerView.AbstractC1876c0 abstractC1876c02 = (RecyclerView.AbstractC1876c0) obj8;
                View view4 = abstractC1876c02.f7784p;
                AbstractC19074t.m100207e(view4, "itemView");
                view4.setAlpha(1.0f);
                m10678F(abstractC1876c02);
                if (size8 < arrayList2.size()) {
                    arrayList2.remove(size8);
                }
                if (arrayList2.isEmpty()) {
                    this.f140565l.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.f140567n.size() - 1; -1 < size9; size9--) {
            Object obj9 = this.f140567n.get(size9);
            AbstractC19074t.m100207e(obj9, "get(...)");
            ArrayList arrayList3 = (ArrayList) obj9;
            for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                Object obj10 = arrayList3.get(size10);
                AbstractC19074t.m100207e(obj10, "get(...)");
                m149290n0((b) obj10);
                if (arrayList3.isEmpty()) {
                    this.f140567n.remove(arrayList3);
                }
            }
        }
        m149284h0(this.f140570q);
        m149284h0(this.f140569p);
        m149284h0(this.f140568o);
        m149284h0(this.f140571r);
        m10043i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: p */
    public boolean mo10050p() {
        if ((!this.f140562i.isEmpty()) || (!this.f140564k.isEmpty()) || (!this.f140563j.isEmpty()) || (!this.f140561h.isEmpty()) || (!this.f140569p.isEmpty()) || (!this.f140570q.isEmpty()) || (!this.f140568o.isEmpty()) || (!this.f140571r.isEmpty()) || (!this.f140566m.isEmpty()) || (!this.f140565l.isEmpty()) || (!this.f140567n.isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    protected final ArrayList m149299p0() {
        return this.f140568o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q0 */
    public final long m149300q0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        return Math.abs((abstractC1876c0.m9929A() * m10046l()) / 4);
    }

    /* renamed from: r0 */
    protected final ArrayList m149301r0() {
        return this.f140570q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s0 */
    public final long m149302s0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        return Math.abs((abstractC1876c0.m9933G() * m10049o()) / 4);
    }

    /* renamed from: u0 */
    protected abstract void mo149303u0(RecyclerView.AbstractC1876c0 abstractC1876c0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: v */
    public void mo10056v() {
        long j11;
        long j12;
        long m116581d;
        boolean z11 = !this.f140561h.isEmpty();
        boolean z12 = !this.f140563j.isEmpty();
        boolean z13 = !this.f140564k.isEmpty();
        boolean z14 = !this.f140562i.isEmpty();
        if (!z11 && !z12 && !z14 && !z13) {
            return;
        }
        Iterator it = this.f140561h.iterator();
        while (it.hasNext()) {
            RecyclerView.AbstractC1876c0 abstractC1876c0 = (RecyclerView.AbstractC1876c0) it.next();
            AbstractC19074t.m100205c(abstractC1876c0);
            m149288l0(abstractC1876c0);
        }
        this.f140561h.clear();
        if (z12) {
            final ArrayList arrayList = new ArrayList(this.f140563j);
            this.f140566m.add(arrayList);
            this.f140563j.clear();
            Runnable runnable = new Runnable() { // from class: y10.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC30261d.m149294x0(AbstractC30261d.this, arrayList);
                }
            };
            if (z11) {
                View view = ((f) arrayList.get(0)).m149315c().f7784p;
                AbstractC19074t.m100207e(view, "itemView");
                view.postOnAnimationDelayed(runnable, m10049o());
            } else {
                runnable.run();
            }
        }
        if (z13) {
            final ArrayList arrayList2 = new ArrayList(this.f140564k);
            this.f140567n.add(arrayList2);
            this.f140564k.clear();
            Runnable runnable2 = new Runnable() { // from class: y10.b
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC30261d.m149295y0(AbstractC30261d.this, arrayList2);
                }
            };
            if (z11) {
                RecyclerView.AbstractC1876c0 m149308d = ((b) arrayList2.get(0)).m149308d();
                AbstractC19074t.m100205c(m149308d);
                m149308d.f7784p.postOnAnimationDelayed(runnable2, m10049o());
            } else {
                runnable2.run();
            }
        }
        if (z14) {
            final ArrayList arrayList3 = new ArrayList(this.f140562i);
            this.f140565l.add(arrayList3);
            this.f140562i.clear();
            Runnable runnable3 = new Runnable() { // from class: y10.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC30261d.m149296z0(AbstractC30261d.this, arrayList3);
                }
            };
            if (!z11 && !z12 && !z13) {
                runnable3.run();
                return;
            }
            long j13 = 0;
            if (z11) {
                j11 = m10049o();
            } else {
                j11 = 0;
            }
            if (z12) {
                j12 = m10048n();
            } else {
                j12 = 0;
            }
            if (z13) {
                j13 = m10047m();
            }
            m116581d = AbstractC22543l.m116581d(j12, j13);
            long j14 = j11 + m116581d;
            View view2 = ((RecyclerView.AbstractC1876c0) arrayList3.get(0)).f7784p;
            AbstractC19074t.m100207e(view2, "itemView");
            view2.postOnAnimationDelayed(runnable3, j14);
        }
    }

    /* renamed from: w0 */
    protected void m149304w0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
    }
}
