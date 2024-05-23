package rk0;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import com.zing.zalo.zinstant.zom.properties.ZOMTransitionElement;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import pm0.C24848g0;
import pm0.C24860q;

/* renamed from: rk0.d */
/* loaded from: classes7.dex */
public final class C25818d {
    private static final a Companion = new a(null);

    /* renamed from: a */
    private InterfaceC25816b f123124a;

    /* renamed from: b */
    private LinkedHashMap f123125b;

    /* renamed from: rk0.d$a */
    /* loaded from: classes7.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rk0.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ LinkedHashMap f123126q;

        /* renamed from: r */
        final /* synthetic */ int f123127r;

        /* renamed from: s */
        final /* synthetic */ ValueAnimator f123128s;

        /* renamed from: t */
        final /* synthetic */ C25818d f123129t;

        /* renamed from: u */
        final /* synthetic */ int f123130u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LinkedHashMap linkedHashMap, int i11, ValueAnimator valueAnimator, C25818d c25818d, int i12) {
            super(1);
            this.f123126q = linkedHashMap;
            this.f123127r = i11;
            this.f123128s = valueAnimator;
            this.f123129t = c25818d;
            this.f123130u = i12;
        }

        /* renamed from: a */
        public final void m133124a(float f11) {
            ValueAnimator valueAnimator;
            InterfaceC25816b interfaceC25816b;
            C24860q c24860q = (C24860q) this.f123126q.get(Integer.valueOf(this.f123127r));
            if (c24860q != null && (valueAnimator = (ValueAnimator) c24860q.m129215c()) != null) {
                ValueAnimator valueAnimator2 = this.f123128s;
                C25818d c25818d = this.f123129t;
                int i11 = this.f123130u;
                if (AbstractC19074t.m100204b(valueAnimator, valueAnimator2) && (interfaceC25816b = c25818d.f123124a) != null) {
                    interfaceC25816b.mo131049e(f11, i11);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m133124a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rk0.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ LinkedHashMap f123131q;

        /* renamed from: r */
        final /* synthetic */ int f123132r;

        /* renamed from: s */
        final /* synthetic */ ValueAnimator f123133s;

        /* renamed from: t */
        final /* synthetic */ C25818d f123134t;

        /* renamed from: u */
        final /* synthetic */ int f123135u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LinkedHashMap linkedHashMap, int i11, ValueAnimator valueAnimator, C25818d c25818d, int i12) {
            super(1);
            this.f123131q = linkedHashMap;
            this.f123132r = i11;
            this.f123133s = valueAnimator;
            this.f123134t = c25818d;
            this.f123135u = i12;
        }

        /* renamed from: a */
        public final void m133125a(float f11) {
            ValueAnimator valueAnimator;
            InterfaceC25816b interfaceC25816b;
            C24860q c24860q = (C24860q) this.f123131q.get(Integer.valueOf(this.f123132r));
            if (c24860q != null && (valueAnimator = (ValueAnimator) c24860q.m129215c()) != null) {
                ValueAnimator valueAnimator2 = this.f123133s;
                C25818d c25818d = this.f123134t;
                int i11 = this.f123135u;
                if (AbstractC19074t.m100204b(valueAnimator, valueAnimator2) && (interfaceC25816b = c25818d.f123124a) != null) {
                    interfaceC25816b.mo131046b(f11, i11);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m133125a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rk0.d$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ LinkedHashMap f123136q;

        /* renamed from: r */
        final /* synthetic */ int f123137r;

        /* renamed from: s */
        final /* synthetic */ ValueAnimator f123138s;

        /* renamed from: t */
        final /* synthetic */ C25818d f123139t;

        /* renamed from: u */
        final /* synthetic */ int f123140u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(LinkedHashMap linkedHashMap, int i11, ValueAnimator valueAnimator, C25818d c25818d, int i12) {
            super(1);
            this.f123136q = linkedHashMap;
            this.f123137r = i11;
            this.f123138s = valueAnimator;
            this.f123139t = c25818d;
            this.f123140u = i12;
        }

        /* renamed from: a */
        public final void m133126a(float f11) {
            ValueAnimator valueAnimator;
            InterfaceC25816b interfaceC25816b;
            C24860q c24860q = (C24860q) this.f123136q.get(Integer.valueOf(this.f123137r));
            if (c24860q != null && (valueAnimator = (ValueAnimator) c24860q.m129215c()) != null) {
                ValueAnimator valueAnimator2 = this.f123138s;
                C25818d c25818d = this.f123139t;
                int i11 = this.f123140u;
                if (AbstractC19074t.m100204b(valueAnimator, valueAnimator2) && (interfaceC25816b = c25818d.f123124a) != null) {
                    interfaceC25816b.mo131047c(f11, i11);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m133126a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: rk0.d$e */
    /* loaded from: classes7.dex */
    public static final class e implements InterfaceC25815a {

        /* renamed from: b */
        final /* synthetic */ int f123142b;

        /* renamed from: c */
        final /* synthetic */ ZOMTransitionElement f123143c;

        /* renamed from: d */
        final /* synthetic */ int f123144d;

        e(int i11, ZOMTransitionElement zOMTransitionElement, int i12) {
            this.f123142b = i11;
            this.f123143c = zOMTransitionElement;
            this.f123144d = i12;
        }

        @Override // rk0.InterfaceC25815a
        /* renamed from: a */
        public void mo133108a(Animator animator) {
            InterfaceC25816b interfaceC25816b;
            AbstractC19074t.m100208f(animator, "animation");
            C24860q c24860q = (C24860q) C25818d.this.f123125b.get(Integer.valueOf(this.f123142b));
            if (c24860q != null) {
                C25818d c25818d = C25818d.this;
                ZOMTransitionElement zOMTransitionElement = this.f123143c;
                int i11 = this.f123144d;
                if (AbstractC19074t.m100204b(c24860q.m129215c(), animator) && (interfaceC25816b = c25818d.f123124a) != null) {
                    interfaceC25816b.mo131050f(zOMTransitionElement, i11);
                }
            }
        }

        @Override // rk0.InterfaceC25815a
        /* renamed from: b */
        public void mo133109b(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C24860q c24860q = (C24860q) C25818d.this.f123125b.get(Integer.valueOf(this.f123142b));
            if (c24860q != null) {
                C25818d c25818d = C25818d.this;
                ZOMTransitionElement zOMTransitionElement = this.f123143c;
                int i11 = this.f123144d;
                int i12 = this.f123142b;
                if (AbstractC19074t.m100204b(c24860q.m129215c(), animator)) {
                    ((InterfaceC18505l) c24860q.m129216d()).mo205i9(Float.valueOf(1.0f));
                    InterfaceC25816b interfaceC25816b = c25818d.f123124a;
                    if (interfaceC25816b != null) {
                        interfaceC25816b.mo131051g(zOMTransitionElement, i11);
                    }
                    c25818d.f123125b.remove(Integer.valueOf(i12));
                }
            }
        }

        @Override // rk0.InterfaceC25815a
        /* renamed from: c */
        public void mo133110c(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C24860q c24860q = (C24860q) C25818d.this.f123125b.get(Integer.valueOf(this.f123142b));
            if (c24860q != null) {
                C25818d c25818d = C25818d.this;
                ZOMTransitionElement zOMTransitionElement = this.f123143c;
                int i11 = this.f123144d;
                int i12 = this.f123142b;
                if (AbstractC19074t.m100204b(c24860q.m129215c(), animator)) {
                    ((InterfaceC18505l) c24860q.m129216d()).mo205i9(Float.valueOf(1.0f));
                    InterfaceC25816b interfaceC25816b = c25818d.f123124a;
                    if (interfaceC25816b != null) {
                        interfaceC25816b.mo131045a(zOMTransitionElement, i11);
                    }
                    c25818d.f123125b.remove(Integer.valueOf(i12));
                }
            }
        }

        @Override // rk0.InterfaceC25815a
        /* renamed from: d */
        public void mo133111d(Animator animator) {
            InterfaceC25816b interfaceC25816b;
            AbstractC19074t.m100208f(animator, "animation");
            C24860q c24860q = (C24860q) C25818d.this.f123125b.get(Integer.valueOf(this.f123142b));
            if (c24860q != null) {
                C25818d c25818d = C25818d.this;
                ZOMTransitionElement zOMTransitionElement = this.f123143c;
                int i11 = this.f123144d;
                if (AbstractC19074t.m100204b(c24860q.m129215c(), animator) && (interfaceC25816b = c25818d.f123124a) != null) {
                    interfaceC25816b.mo131048d(zOMTransitionElement, i11);
                }
            }
        }
    }

    public C25818d() {
        this.f123125b = new LinkedHashMap();
    }

    /* renamed from: d */
    private final void m133115d(int i11, ValueAnimator valueAnimator, int i12) {
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        ValueAnimator valueAnimator4;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    LinkedHashMap linkedHashMap = this.f123125b;
                    C24860q c24860q = (C24860q) linkedHashMap.get(Integer.valueOf(i11));
                    if (c24860q != null && (valueAnimator4 = (ValueAnimator) c24860q.m129215c()) != null) {
                        valueAnimator4.cancel();
                    }
                    linkedHashMap.put(Integer.valueOf(i11), new C24860q(valueAnimator, new b(linkedHashMap, i11, valueAnimator, this, i12)));
                    return;
                }
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f123125b;
            C24860q c24860q2 = (C24860q) linkedHashMap2.get(Integer.valueOf(i11));
            if (c24860q2 != null && (valueAnimator3 = (ValueAnimator) c24860q2.m129215c()) != null) {
                valueAnimator3.cancel();
            }
            linkedHashMap2.put(Integer.valueOf(i11), new C24860q(valueAnimator, new d(linkedHashMap2, i11, valueAnimator, this, i12)));
            return;
        }
        LinkedHashMap linkedHashMap3 = this.f123125b;
        C24860q c24860q3 = (C24860q) linkedHashMap3.get(Integer.valueOf(i11));
        if (c24860q3 != null && (valueAnimator2 = (ValueAnimator) c24860q3.m129215c()) != null) {
            valueAnimator2.cancel();
        }
        linkedHashMap3.put(Integer.valueOf(i11), new C24860q(valueAnimator, new c(linkedHashMap3, i11, valueAnimator, this, i12)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m133116f(C25818d c25818d, int i11, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c25818d, "this$0");
        c25818d.m133117h(i11);
    }

    /* renamed from: h */
    private final void m133117h(int i11) {
        C24860q c24860q = (C24860q) this.f123125b.get(Integer.valueOf(i11));
        if (c24860q != null && ((ValueAnimator) c24860q.m129215c()).isRunning()) {
            InterfaceC18505l interfaceC18505l = (InterfaceC18505l) c24860q.m129216d();
            Object animatedValue = ((ValueAnimator) c24860q.m129215c()).getAnimatedValue(String.valueOf(i11));
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            interfaceC18505l.mo205i9((Float) animatedValue);
        }
    }

    /* renamed from: i */
    private final void m133118i() {
        Iterator it = new ArrayList(this.f123125b.values()).iterator();
        while (it.hasNext()) {
            C24860q c24860q = (C24860q) it.next();
            if (!((ValueAnimator) c24860q.m129215c()).isStarted()) {
                ((ValueAnimator) c24860q.m129215c()).start();
            }
        }
    }

    /* renamed from: j */
    private final void m133119j() {
        Iterator it = new ArrayList(this.f123125b.values()).iterator();
        while (it.hasNext()) {
            ((ValueAnimator) ((C24860q) it.next()).m129215c()).cancel();
        }
        this.f123125b.clear();
    }

    /* renamed from: e */
    public final void m133120e(final int i11, ZOMTransitionElement zOMTransitionElement, int i12) {
        AbstractC19074t.m100208f(zOMTransitionElement, "transition");
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(String.valueOf(i11), 0.0f, 1.0f);
        C25819e c25819e = new C25819e(new e(i11, zOMTransitionElement, i12));
        c25819e.setValues(ofFloat);
        c25819e.setInterpolator(zOMTransitionElement.getInterpolator());
        c25819e.setDuration(zOMTransitionElement.mDuration);
        c25819e.setStartDelay(zOMTransitionElement.mDelay);
        c25819e.setRepeatCount(0);
        c25819e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rk0.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C25818d.m133116f(C25818d.this, i11, valueAnimator);
            }
        });
        m133115d(i11, c25819e, i12);
    }

    /* renamed from: g */
    public final void m133121g(int i11) {
        ValueAnimator valueAnimator;
        C24860q c24860q = (C24860q) this.f123125b.remove(Integer.valueOf(i11));
        if (c24860q != null && (valueAnimator = (ValueAnimator) c24860q.m129215c()) != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: k */
    public final void m133122k() {
        m133118i();
    }

    /* renamed from: l */
    public final void m133123l() {
        m133119j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25818d(InterfaceC25816b interfaceC25816b) {
        this();
        AbstractC19074t.m100208f(interfaceC25816b, "transitionListener");
        this.f123124a = interfaceC25816b;
    }
}
