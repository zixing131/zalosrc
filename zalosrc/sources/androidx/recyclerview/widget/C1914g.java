package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.AbstractC1579n0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public class C1914g extends AbstractC1933z {

    /* renamed from: s */
    private static TimeInterpolator f8005s;

    /* renamed from: h */
    private ArrayList f8006h = new ArrayList();

    /* renamed from: i */
    private ArrayList f8007i = new ArrayList();

    /* renamed from: j */
    private ArrayList f8008j = new ArrayList();

    /* renamed from: k */
    private ArrayList f8009k = new ArrayList();

    /* renamed from: l */
    ArrayList f8010l = new ArrayList();

    /* renamed from: m */
    ArrayList f8011m = new ArrayList();

    /* renamed from: n */
    ArrayList f8012n = new ArrayList();

    /* renamed from: o */
    ArrayList f8013o = new ArrayList();

    /* renamed from: p */
    ArrayList f8014p = new ArrayList();

    /* renamed from: q */
    ArrayList f8015q = new ArrayList();

    /* renamed from: r */
    ArrayList f8016r = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ArrayList f8017p;

        a(ArrayList arrayList) {
            this.f8017p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f8017p.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                C1914g.this.m10489Y(jVar.f8051a, jVar.f8052b, jVar.f8053c, jVar.f8054d, jVar.f8055e);
            }
            this.f8017p.clear();
            C1914g.this.f8011m.remove(this.f8017p);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ArrayList f8019p;

        b(ArrayList arrayList) {
            this.f8019p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f8019p.iterator();
            while (it.hasNext()) {
                C1914g.this.m10488X((i) it.next());
            }
            this.f8019p.clear();
            C1914g.this.f8012n.remove(this.f8019p);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    /* loaded from: classes2.dex */
    class c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ArrayList f8021p;

        c(ArrayList arrayList) {
            this.f8021p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f8021p.iterator();
            while (it.hasNext()) {
                C1914g.this.m10487W((RecyclerView.AbstractC1876c0) it.next());
            }
            this.f8021p.clear();
            C1914g.this.f8010l.remove(this.f8021p);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ RecyclerView.AbstractC1876c0 f8023p;

        /* renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f8024q;

        /* renamed from: r */
        final /* synthetic */ View f8025r;

        d(RecyclerView.AbstractC1876c0 abstractC1876c0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8023p = abstractC1876c0;
            this.f8024q = viewPropertyAnimator;
            this.f8025r = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8024q.setListener(null);
            this.f8025r.setAlpha(1.0f);
            C1914g.this.m10684L(this.f8023p);
            C1914g.this.f8015q.remove(this.f8023p);
            C1914g.this.m10491b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1914g.this.m10685M(this.f8023p);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$e */
    /* loaded from: classes2.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ RecyclerView.AbstractC1876c0 f8027p;

        /* renamed from: q */
        final /* synthetic */ View f8028q;

        /* renamed from: r */
        final /* synthetic */ ViewPropertyAnimator f8029r;

        e(RecyclerView.AbstractC1876c0 abstractC1876c0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f8027p = abstractC1876c0;
            this.f8028q = view;
            this.f8029r = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8028q.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8029r.setListener(null);
            C1914g.this.m10678F(this.f8027p);
            C1914g.this.f8013o.remove(this.f8027p);
            C1914g.this.m10491b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1914g.this.m10679G(this.f8027p);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$f */
    /* loaded from: classes2.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ RecyclerView.AbstractC1876c0 f8031p;

        /* renamed from: q */
        final /* synthetic */ int f8032q;

        /* renamed from: r */
        final /* synthetic */ View f8033r;

        /* renamed from: s */
        final /* synthetic */ int f8034s;

        /* renamed from: t */
        final /* synthetic */ ViewPropertyAnimator f8035t;

        f(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, View view, int i12, ViewPropertyAnimator viewPropertyAnimator) {
            this.f8031p = abstractC1876c0;
            this.f8032q = i11;
            this.f8033r = view;
            this.f8034s = i12;
            this.f8035t = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f8032q != 0) {
                this.f8033r.setTranslationX(0.0f);
            }
            if (this.f8034s != 0) {
                this.f8033r.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8035t.setListener(null);
            C1914g.this.m10682J(this.f8031p);
            C1914g.this.f8014p.remove(this.f8031p);
            C1914g.this.m10491b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1914g.this.m10683K(this.f8031p);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g */
    /* loaded from: classes2.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ i f8037p;

        /* renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f8038q;

        /* renamed from: r */
        final /* synthetic */ View f8039r;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8037p = iVar;
            this.f8038q = viewPropertyAnimator;
            this.f8039r = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8038q.setListener(null);
            this.f8039r.setAlpha(1.0f);
            this.f8039r.setTranslationX(0.0f);
            this.f8039r.setTranslationY(0.0f);
            C1914g.this.m10680H(this.f8037p.f8045a, true);
            C1914g.this.f8016r.remove(this.f8037p.f8045a);
            C1914g.this.m10491b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1914g.this.m10681I(this.f8037p.f8045a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$h */
    /* loaded from: classes2.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ i f8041p;

        /* renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f8042q;

        /* renamed from: r */
        final /* synthetic */ View f8043r;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8041p = iVar;
            this.f8042q = viewPropertyAnimator;
            this.f8043r = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8042q.setListener(null);
            this.f8043r.setAlpha(1.0f);
            this.f8043r.setTranslationX(0.0f);
            this.f8043r.setTranslationY(0.0f);
            C1914g.this.m10680H(this.f8041p.f8046b, false);
            C1914g.this.f8016r.remove(this.f8041p.f8046b);
            C1914g.this.m10491b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1914g.this.m10681I(this.f8041p.f8046b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$i */
    /* loaded from: classes2.dex */
    public static class i {

        /* renamed from: a */
        public RecyclerView.AbstractC1876c0 f8045a;

        /* renamed from: b */
        public RecyclerView.AbstractC1876c0 f8046b;

        /* renamed from: c */
        public int f8047c;

        /* renamed from: d */
        public int f8048d;

        /* renamed from: e */
        public int f8049e;

        /* renamed from: f */
        public int f8050f;

        private i(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02) {
            this.f8045a = abstractC1876c0;
            this.f8046b = abstractC1876c02;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f8045a + ", newHolder=" + this.f8046b + ", fromX=" + this.f8047c + ", fromY=" + this.f8048d + ", toX=" + this.f8049e + ", toY=" + this.f8050f + '}';
        }

        i(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02, int i11, int i12, int i13, int i14) {
            this(abstractC1876c0, abstractC1876c02);
            this.f8047c = i11;
            this.f8048d = i12;
            this.f8049e = i13;
            this.f8050f = i14;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$j */
    /* loaded from: classes2.dex */
    public static class j {

        /* renamed from: a */
        public RecyclerView.AbstractC1876c0 f8051a;

        /* renamed from: b */
        public int f8052b;

        /* renamed from: c */
        public int f8053c;

        /* renamed from: d */
        public int f8054d;

        /* renamed from: e */
        public int f8055e;

        j(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
            this.f8051a = abstractC1876c0;
            this.f8052b = i11;
            this.f8053c = i12;
            this.f8054d = i13;
            this.f8055e = i14;
        }
    }

    /* renamed from: Z */
    private void m10478Z(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        View view = abstractC1876c0.f7784p;
        ViewPropertyAnimator animate = view.animate();
        this.f8015q.add(abstractC1876c0);
        animate.setDuration(m10049o()).alpha(0.0f).setListener(new d(abstractC1876c0, animate, view)).start();
    }

    /* renamed from: c0 */
    private void m10479c0(List list, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (m10481e0(iVar, abstractC1876c0) && iVar.f8045a == null && iVar.f8046b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: d0 */
    private void m10480d0(i iVar) {
        RecyclerView.AbstractC1876c0 abstractC1876c0 = iVar.f8045a;
        if (abstractC1876c0 != null) {
            m10481e0(iVar, abstractC1876c0);
        }
        RecyclerView.AbstractC1876c0 abstractC1876c02 = iVar.f8046b;
        if (abstractC1876c02 != null) {
            m10481e0(iVar, abstractC1876c02);
        }
    }

    /* renamed from: e0 */
    private boolean m10481e0(i iVar, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        boolean z11 = false;
        if (iVar.f8046b == abstractC1876c0) {
            iVar.f8046b = null;
        } else {
            if (iVar.f8045a != abstractC1876c0) {
                return false;
            }
            iVar.f8045a = null;
            z11 = true;
        }
        abstractC1876c0.f7784p.setAlpha(1.0f);
        abstractC1876c0.f7784p.setTranslationX(0.0f);
        abstractC1876c0.f7784p.setTranslationY(0.0f);
        m10680H(abstractC1876c0, z11);
        return true;
    }

    /* renamed from: f0 */
    private void m10482f0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        if (f8005s == null) {
            f8005s = new ValueAnimator().getInterpolator();
        }
        abstractC1876c0.f7784p.animate().setInterpolator(f8005s);
        mo10044j(abstractC1876c0);
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: B */
    public boolean mo10483B(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        m10482f0(abstractC1876c0);
        abstractC1876c0.f7784p.setAlpha(0.0f);
        this.f8007i.add(abstractC1876c0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: C */
    public boolean mo10484C(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02, int i11, int i12, int i13, int i14) {
        if (abstractC1876c0 == abstractC1876c02) {
            return mo10485D(abstractC1876c0, i11, i12, i13, i14);
        }
        float translationX = abstractC1876c0.f7784p.getTranslationX();
        float translationY = abstractC1876c0.f7784p.getTranslationY();
        float alpha = abstractC1876c0.f7784p.getAlpha();
        m10482f0(abstractC1876c0);
        int i15 = (int) ((i13 - i11) - translationX);
        int i16 = (int) ((i14 - i12) - translationY);
        abstractC1876c0.f7784p.setTranslationX(translationX);
        abstractC1876c0.f7784p.setTranslationY(translationY);
        abstractC1876c0.f7784p.setAlpha(alpha);
        if (abstractC1876c02 != null) {
            m10482f0(abstractC1876c02);
            abstractC1876c02.f7784p.setTranslationX(-i15);
            abstractC1876c02.f7784p.setTranslationY(-i16);
            abstractC1876c02.f7784p.setAlpha(0.0f);
        }
        this.f8009k.add(new i(abstractC1876c0, abstractC1876c02, i11, i12, i13, i14));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: D */
    public boolean mo10485D(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
        View view = abstractC1876c0.f7784p;
        int translationX = i11 + ((int) view.getTranslationX());
        int translationY = i12 + ((int) abstractC1876c0.f7784p.getTranslationY());
        m10482f0(abstractC1876c0);
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
        this.f8008j.add(new j(abstractC1876c0, translationX, translationY, i13, i14));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1933z
    /* renamed from: E */
    public boolean mo10486E(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        m10482f0(abstractC1876c0);
        this.f8006h.add(abstractC1876c0);
        return true;
    }

    /* renamed from: W */
    void m10487W(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        View view = abstractC1876c0.f7784p;
        ViewPropertyAnimator animate = view.animate();
        this.f8013o.add(abstractC1876c0);
        animate.alpha(1.0f).setDuration(m10046l()).setListener(new e(abstractC1876c0, view, animate)).start();
    }

    /* renamed from: X */
    void m10488X(i iVar) {
        View view;
        RecyclerView.AbstractC1876c0 abstractC1876c0 = iVar.f8045a;
        View view2 = null;
        if (abstractC1876c0 == null) {
            view = null;
        } else {
            view = abstractC1876c0.f7784p;
        }
        RecyclerView.AbstractC1876c0 abstractC1876c02 = iVar.f8046b;
        if (abstractC1876c02 != null) {
            view2 = abstractC1876c02.f7784p;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m10047m());
            this.f8016r.add(iVar.f8045a);
            duration.translationX(iVar.f8049e - iVar.f8047c);
            duration.translationY(iVar.f8050f - iVar.f8048d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f8016r.add(iVar.f8046b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m10047m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* renamed from: Y */
    void m10489Y(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
        View view = abstractC1876c0.f7784p;
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        if (i15 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i16 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f8014p.add(abstractC1876c0);
        animate.setDuration(m10048n()).setListener(new f(abstractC1876c0, i15, view, i16, animate)).start();
    }

    /* renamed from: a0 */
    void m10490a0(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.AbstractC1876c0) list.get(size)).f7784p.animate().cancel();
        }
    }

    /* renamed from: b0 */
    void m10491b0() {
        if (!mo10050p()) {
            m10043i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: g */
    public boolean mo10041g(RecyclerView.AbstractC1876c0 abstractC1876c0, List list) {
        if (list.isEmpty() && !super.mo10041g(abstractC1876c0, list)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: j */
    public void mo10044j(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        View view = abstractC1876c0.f7784p;
        view.animate().cancel();
        int size = this.f8008j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f8008j.get(size)).f8051a == abstractC1876c0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m10682J(abstractC1876c0);
                this.f8008j.remove(size);
            }
        }
        m10479c0(this.f8009k, abstractC1876c0);
        if (this.f8006h.remove(abstractC1876c0)) {
            view.setAlpha(1.0f);
            m10684L(abstractC1876c0);
        }
        if (this.f8007i.remove(abstractC1876c0)) {
            view.setAlpha(1.0f);
            m10678F(abstractC1876c0);
        }
        for (int size2 = this.f8012n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f8012n.get(size2);
            m10479c0(arrayList, abstractC1876c0);
            if (arrayList.isEmpty()) {
                this.f8012n.remove(size2);
            }
        }
        for (int size3 = this.f8011m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f8011m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f8051a == abstractC1876c0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m10682J(abstractC1876c0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f8011m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f8010l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f8010l.get(size5);
            if (arrayList3.remove(abstractC1876c0)) {
                view.setAlpha(1.0f);
                m10678F(abstractC1876c0);
                if (arrayList3.isEmpty()) {
                    this.f8010l.remove(size5);
                }
            }
        }
        this.f8015q.remove(abstractC1876c0);
        this.f8013o.remove(abstractC1876c0);
        this.f8016r.remove(abstractC1876c0);
        this.f8014p.remove(abstractC1876c0);
        m10491b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: k */
    public void mo10045k() {
        int size = this.f8008j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f8008j.get(size);
            View view = jVar.f8051a.f7784p;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m10682J(jVar.f8051a);
            this.f8008j.remove(size);
        }
        for (int size2 = this.f8006h.size() - 1; size2 >= 0; size2--) {
            m10684L((RecyclerView.AbstractC1876c0) this.f8006h.get(size2));
            this.f8006h.remove(size2);
        }
        int size3 = this.f8007i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC1876c0 abstractC1876c0 = (RecyclerView.AbstractC1876c0) this.f8007i.get(size3);
            abstractC1876c0.f7784p.setAlpha(1.0f);
            m10678F(abstractC1876c0);
            this.f8007i.remove(size3);
        }
        for (int size4 = this.f8009k.size() - 1; size4 >= 0; size4--) {
            m10480d0((i) this.f8009k.get(size4));
        }
        this.f8009k.clear();
        if (!mo10050p()) {
            return;
        }
        for (int size5 = this.f8011m.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList = (ArrayList) this.f8011m.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                j jVar2 = (j) arrayList.get(size6);
                View view2 = jVar2.f8051a.f7784p;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                m10682J(jVar2.f8051a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f8011m.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f8010l.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList2 = (ArrayList) this.f8010l.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.AbstractC1876c0 abstractC1876c02 = (RecyclerView.AbstractC1876c0) arrayList2.get(size8);
                abstractC1876c02.f7784p.setAlpha(1.0f);
                m10678F(abstractC1876c02);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.f8010l.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.f8012n.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList3 = (ArrayList) this.f8012n.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                m10480d0((i) arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.f8012n.remove(arrayList3);
                }
            }
        }
        m10490a0(this.f8015q);
        m10490a0(this.f8014p);
        m10490a0(this.f8013o);
        m10490a0(this.f8016r);
        m10043i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: p */
    public boolean mo10050p() {
        if (this.f8007i.isEmpty() && this.f8009k.isEmpty() && this.f8008j.isEmpty() && this.f8006h.isEmpty() && this.f8014p.isEmpty() && this.f8015q.isEmpty() && this.f8013o.isEmpty() && this.f8016r.isEmpty() && this.f8011m.isEmpty() && this.f8010l.isEmpty() && this.f8012n.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: v */
    public void mo10056v() {
        long j11;
        long j12;
        boolean z11 = !this.f8006h.isEmpty();
        boolean z12 = !this.f8008j.isEmpty();
        boolean z13 = !this.f8009k.isEmpty();
        boolean z14 = !this.f8007i.isEmpty();
        if (!z11 && !z12 && !z14 && !z13) {
            return;
        }
        Iterator it = this.f8006h.iterator();
        while (it.hasNext()) {
            m10478Z((RecyclerView.AbstractC1876c0) it.next());
        }
        this.f8006h.clear();
        if (z12) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f8008j);
            this.f8011m.add(arrayList);
            this.f8008j.clear();
            a aVar = new a(arrayList);
            if (z11) {
                AbstractC1579n0.m7902t0(((j) arrayList.get(0)).f8051a.f7784p, aVar, m10049o());
            } else {
                aVar.run();
            }
        }
        if (z13) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f8009k);
            this.f8012n.add(arrayList2);
            this.f8009k.clear();
            b bVar = new b(arrayList2);
            if (z11) {
                AbstractC1579n0.m7902t0(((i) arrayList2.get(0)).f8045a.f7784p, bVar, m10049o());
            } else {
                bVar.run();
            }
        }
        if (z14) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f8007i);
            this.f8010l.add(arrayList3);
            this.f8007i.clear();
            c cVar = new c(arrayList3);
            if (!z11 && !z12 && !z13) {
                cVar.run();
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
            AbstractC1579n0.m7902t0(((RecyclerView.AbstractC1876c0) arrayList3.get(0)).f7784p, cVar, j11 + Math.max(j12, j13));
        }
    }
}
