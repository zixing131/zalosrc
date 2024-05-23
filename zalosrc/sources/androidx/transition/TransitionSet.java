package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.AbstractC1404k;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import p286k2.AbstractC21443g;

/* loaded from: classes2.dex */
public class TransitionSet extends Transition {

    /* renamed from: Z */
    private ArrayList f8514Z;

    /* renamed from: a0 */
    private boolean f8515a0;

    /* renamed from: b0 */
    int f8516b0;

    /* renamed from: c0 */
    boolean f8517c0;

    /* renamed from: d0 */
    private int f8518d0;

    /* renamed from: androidx.transition.TransitionSet$a */
    /* loaded from: classes2.dex */
    class C1996a extends AbstractC2027q {

        /* renamed from: p */
        final /* synthetic */ Transition f8519p;

        C1996a(Transition transition) {
            this.f8519p = transition;
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            this.f8519p.mo10913f0();
            transition.mo10910b0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.TransitionSet$b */
    /* loaded from: classes2.dex */
    public static class C1997b extends AbstractC2027q {

        /* renamed from: p */
        TransitionSet f8521p;

        C1997b(TransitionSet transitionSet) {
            this.f8521p = transitionSet;
        }

        @Override // androidx.transition.AbstractC2027q, androidx.transition.Transition.InterfaceC1995f
        /* renamed from: b */
        public void mo10939b(Transition transition) {
            TransitionSet transitionSet = this.f8521p;
            if (!transitionSet.f8517c0) {
                transitionSet.m10927p0();
                this.f8521p.f8517c0 = true;
            }
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            TransitionSet transitionSet = this.f8521p;
            int i11 = transitionSet.f8516b0 - 1;
            transitionSet.f8516b0 = i11;
            if (i11 == 0) {
                transitionSet.f8517c0 = false;
                transitionSet.m10930r();
            }
            transition.mo10910b0(this);
        }
    }

    public TransitionSet() {
        this.f8514Z = new ArrayList();
        this.f8515a0 = true;
        this.f8517c0 = false;
        this.f8518d0 = 0;
    }

    /* renamed from: D0 */
    private void m10940D0() {
        C1997b c1997b = new C1997b(this);
        Iterator it = this.f8514Z.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).mo10907a(c1997b);
        }
        this.f8516b0 = this.f8514Z.size();
    }

    /* renamed from: u0 */
    private void m10941u0(Transition transition) {
        this.f8514Z.add(transition);
        transition.f8479G = this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public TransitionSet mo10918j0(TimeInterpolator timeInterpolator) {
        this.f8518d0 |= 1;
        ArrayList arrayList = this.f8514Z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((Transition) this.f8514Z.get(i11)).mo10918j0(timeInterpolator);
            }
        }
        return (TransitionSet) super.mo10918j0(timeInterpolator);
    }

    /* renamed from: B0 */
    public TransitionSet m10943B0(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                this.f8515a0 = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i11);
            }
        } else {
            this.f8515a0 = true;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public TransitionSet mo10925n0(long j11) {
        return (TransitionSet) super.mo10925n0(j11);
    }

    @Override // androidx.transition.Transition
    /* renamed from: Y */
    public void mo10906Y(View view) {
        super.mo10906Y(view);
        int size = this.f8514Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((Transition) this.f8514Z.get(i11)).mo10906Y(view);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: d0 */
    public void mo10912d0(View view) {
        super.mo10912d0(view);
        int size = this.f8514Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((Transition) this.f8514Z.get(i11)).mo10912d0(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    /* renamed from: f0 */
    public void mo10913f0() {
        if (this.f8514Z.isEmpty()) {
            m10927p0();
            m10930r();
            return;
        }
        m10940D0();
        if (!this.f8515a0) {
            for (int i11 = 1; i11 < this.f8514Z.size(); i11++) {
                ((Transition) this.f8514Z.get(i11 - 1)).mo10907a(new C1996a((Transition) this.f8514Z.get(i11)));
            }
            Transition transition = (Transition) this.f8514Z.get(0);
            if (transition != null) {
                transition.mo10913f0();
                return;
            }
            return;
        }
        Iterator it = this.f8514Z.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).mo10913f0();
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: h0 */
    public void mo10917h0(Transition.AbstractC1994e abstractC1994e) {
        super.mo10917h0(abstractC1994e);
        this.f8518d0 |= 8;
        int size = this.f8514Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((Transition) this.f8514Z.get(i11)).mo10917h0(abstractC1994e);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        if (m10905P(c2030t.f8616b)) {
            Iterator it = this.f8514Z.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m10905P(c2030t.f8616b)) {
                    transition.mo10818i(c2030t);
                    c2030t.f8617c.add(transition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo10919k(C2030t c2030t) {
        super.mo10919k(c2030t);
        int size = this.f8514Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((Transition) this.f8514Z.get(i11)).mo10919k(c2030t);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        if (m10905P(c2030t.f8616b)) {
            Iterator it = this.f8514Z.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m10905P(c2030t.f8616b)) {
                    transition.mo10819l(c2030t);
                    c2030t.f8617c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: l0 */
    public void mo10921l0(PathMotion pathMotion) {
        super.mo10921l0(pathMotion);
        this.f8518d0 |= 4;
        if (this.f8514Z != null) {
            for (int i11 = 0; i11 < this.f8514Z.size(); i11++) {
                ((Transition) this.f8514Z.get(i11)).mo10921l0(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: m0 */
    public void mo10923m0(AbstractC21443g abstractC21443g) {
        super.mo10923m0(abstractC21443g);
        this.f8518d0 |= 2;
        int size = this.f8514Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((Transition) this.f8514Z.get(i11)).mo10923m0(abstractC21443g);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: o */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f8514Z = new ArrayList();
        int size = this.f8514Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            transitionSet.m10941u0(((Transition) this.f8514Z.get(i11)).clone());
        }
        return transitionSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    /* renamed from: q */
    public void mo10928q(ViewGroup viewGroup, C2031u c2031u, C2031u c2031u2, ArrayList arrayList, ArrayList arrayList2) {
        long m10898C = m10898C();
        int size = this.f8514Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            Transition transition = (Transition) this.f8514Z.get(i11);
            if (m10898C > 0 && (this.f8515a0 || i11 == 0)) {
                long m10898C2 = transition.m10898C();
                if (m10898C2 > 0) {
                    transition.mo10925n0(m10898C2 + m10898C);
                } else {
                    transition.mo10925n0(m10898C);
                }
            }
            transition.mo10928q(viewGroup, c2031u, c2031u2, arrayList, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    /* renamed from: q0 */
    public String mo10929q0(String str) {
        String mo10929q0 = super.mo10929q0(str);
        for (int i11 = 0; i11 < this.f8514Z.size(); i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo10929q0);
            sb2.append("\n");
            sb2.append(((Transition) this.f8514Z.get(i11)).mo10929q0(str + "  "));
            mo10929q0 = sb2.toString();
        }
        return mo10929q0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public TransitionSet mo10907a(Transition.InterfaceC1995f interfaceC1995f) {
        return (TransitionSet) super.mo10907a(interfaceC1995f);
    }

    @Override // androidx.transition.Transition
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public TransitionSet mo10909b(View view) {
        for (int i11 = 0; i11 < this.f8514Z.size(); i11++) {
            ((Transition) this.f8514Z.get(i11)).mo10909b(view);
        }
        return (TransitionSet) super.mo10909b(view);
    }

    /* renamed from: t0 */
    public TransitionSet m10947t0(Transition transition) {
        m10941u0(transition);
        long j11 = this.f8497r;
        if (j11 >= 0) {
            transition.mo10915g0(j11);
        }
        if ((this.f8518d0 & 1) != 0) {
            transition.mo10918j0(m10934w());
        }
        if ((this.f8518d0 & 2) != 0) {
            transition.mo10923m0(m10897A());
        }
        if ((this.f8518d0 & 4) != 0) {
            transition.mo10921l0(m10937z());
        }
        if ((this.f8518d0 & 8) != 0) {
            transition.mo10917h0(m10933v());
        }
        return this;
    }

    /* renamed from: v0 */
    public Transition m10948v0(int i11) {
        if (i11 >= 0 && i11 < this.f8514Z.size()) {
            return (Transition) this.f8514Z.get(i11);
        }
        return null;
    }

    /* renamed from: w0 */
    public int m10949w0() {
        return this.f8514Z.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public TransitionSet mo10910b0(Transition.InterfaceC1995f interfaceC1995f) {
        return (TransitionSet) super.mo10910b0(interfaceC1995f);
    }

    @Override // androidx.transition.Transition
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public TransitionSet mo10911c0(View view) {
        for (int i11 = 0; i11 < this.f8514Z.size(); i11++) {
            ((Transition) this.f8514Z.get(i11)).mo10911c0(view);
        }
        return (TransitionSet) super.mo10911c0(view);
    }

    @Override // androidx.transition.Transition
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public TransitionSet mo10915g0(long j11) {
        ArrayList arrayList;
        super.mo10915g0(j11);
        if (this.f8497r >= 0 && (arrayList = this.f8514Z) != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((Transition) this.f8514Z.get(i11)).mo10915g0(j11);
            }
        }
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8514Z = new ArrayList();
        this.f8515a0 = true;
        this.f8517c0 = false;
        this.f8518d0 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2026p.f8599i);
        m10943B0(AbstractC1404k.m7111g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
