package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.C1279s;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.C1299g;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.t */
/* loaded from: classes2.dex */
public class C1280t {

    /* renamed from: a */
    private final MotionLayout f5323a;

    /* renamed from: c */
    private HashSet f5325c;

    /* renamed from: e */
    ArrayList f5327e;

    /* renamed from: b */
    private ArrayList f5324b = new ArrayList();

    /* renamed from: d */
    private String f5326d = "ViewTransitionController";

    /* renamed from: f */
    ArrayList f5328f = new ArrayList();

    /* renamed from: androidx.constraintlayout.motion.widget.t$a */
    /* loaded from: classes2.dex */
    public class a implements C1299g.a {

        /* renamed from: p */
        final /* synthetic */ C1279s f5329p;

        /* renamed from: q */
        final /* synthetic */ int f5330q;

        /* renamed from: r */
        final /* synthetic */ boolean f5331r;

        /* renamed from: s */
        final /* synthetic */ int f5332s;

        a(C1279s c1279s, int i11, boolean z11, int i12) {
            this.f5329p = c1279s;
            this.f5330q = i11;
            this.f5331r = z11;
            this.f5332s = i12;
        }
    }

    public C1280t(MotionLayout motionLayout) {
        this.f5323a = motionLayout;
    }

    /* renamed from: f */
    private void m6318f(C1279s c1279s, boolean z11) {
        ConstraintLayout.getSharedValues().m6486a(c1279s.m6309h(), new a(c1279s, c1279s.m6309h(), z11, c1279s.m6308g()));
    }

    /* renamed from: a */
    public void m6319a(C1279s c1279s) {
        this.f5324b.add(c1279s);
        this.f5325c = null;
        if (c1279s.m6310i() == 4) {
            m6318f(c1279s, true);
        } else if (c1279s.m6310i() == 5) {
            m6318f(c1279s, false);
        }
    }

    /* renamed from: b */
    public void m6320b(C1279s.b bVar) {
        if (this.f5327e == null) {
            this.f5327e = new ArrayList();
        }
        this.f5327e.add(bVar);
    }

    /* renamed from: c */
    public void m6321c() {
        ArrayList arrayList = this.f5327e;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C1279s.b) it.next()).m6313a();
        }
        this.f5327e.removeAll(this.f5328f);
        this.f5328f.clear();
        if (this.f5327e.isEmpty()) {
            this.f5327e = null;
        }
    }

    /* renamed from: d */
    public boolean m6322d(int i11, C1273m c1273m) {
        Iterator it = this.f5324b.iterator();
        while (it.hasNext()) {
            C1279s c1279s = (C1279s) it.next();
            if (c1279s.m6306e() == i11) {
                c1279s.f5289f.m6109a(c1273m);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m6323e() {
        this.f5323a.invalidate();
    }

    /* renamed from: g */
    public void m6324g(C1279s.b bVar) {
        this.f5328f.add(bVar);
    }

    /* renamed from: h */
    public void m6325h(MotionEvent motionEvent) {
        C1279s c1279s;
        int currentState = this.f5323a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f5325c == null) {
            this.f5325c = new HashSet();
            Iterator it = this.f5324b.iterator();
            while (it.hasNext()) {
                C1279s c1279s2 = (C1279s) it.next();
                int childCount = this.f5323a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f5323a.getChildAt(i11);
                    if (c1279s2.m6311k(childAt)) {
                        childAt.getId();
                        this.f5325c.add(childAt);
                    }
                }
            }
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f5327e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = this.f5327e.iterator();
            while (it2.hasNext()) {
                ((C1279s.b) it2.next()).m6316d(action, x11, y11);
            }
        }
        if (action == 0 || action == 1) {
            C1295c m6008n0 = this.f5323a.m6008n0(currentState);
            Iterator it3 = this.f5324b.iterator();
            while (it3.hasNext()) {
                C1279s c1279s3 = (C1279s) it3.next();
                if (c1279s3.m6312m(action)) {
                    Iterator it4 = this.f5325c.iterator();
                    while (it4.hasNext()) {
                        View view = (View) it4.next();
                        if (c1279s3.m6311k(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x11, (int) y11)) {
                                c1279s = c1279s3;
                                c1279s3.m6304c(this, this.f5323a, currentState, m6008n0, view);
                            } else {
                                c1279s = c1279s3;
                            }
                            c1279s3 = c1279s;
                        }
                    }
                }
            }
        }
    }
}
