package com.zing.zalo.p077ui.chat.widget.popup;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.zing.zalo.p077ui.chat.widget.popup.C11785a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23136l9;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import y50.C30795e;
import y50.InterfaceC30793c;

/* renamed from: com.zing.zalo.ui.chat.widget.popup.a */
/* loaded from: classes5.dex */
public final class C11785a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final ViewGroup f61300a;

    /* renamed from: b */
    private final List f61301b;

    /* renamed from: c */
    private final TextSelectPopupMenuView f61302c;

    /* renamed from: d */
    private final PopupWindow f61303d;

    /* renamed from: e */
    private final Runnable f61304e;

    /* renamed from: f */
    private final int f61305f;

    /* renamed from: g */
    private final int[] f61306g;

    /* renamed from: h */
    private final int[] f61307h;

    /* renamed from: i */
    private final Rect f61308i;

    /* renamed from: j */
    private final Rect f61309j;

    /* renamed from: k */
    private final Rect f61310k;

    /* renamed from: com.zing.zalo.ui.chat.widget.popup.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.popup.a$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final String f61311a;

        /* renamed from: b */
        private final InterfaceC18494a f61312b;

        public b(String str, InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(str, "label");
            AbstractC19074t.m100208f(interfaceC18494a, "onClickListener");
            this.f61311a = str;
            this.f61312b = interfaceC18494a;
        }

        /* renamed from: a */
        public final String m65571a() {
            return this.f61311a;
        }

        /* renamed from: b */
        public final InterfaceC18494a m65572b() {
            return this.f61312b;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.popup.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends Enum {

        /* renamed from: p */
        public static final c f61313p = new c("ABOVE_START", 0);

        /* renamed from: q */
        public static final c f61314q = new c("BELOW_START", 1);

        /* renamed from: r */
        public static final c f61315r = new c("ABOVE_END", 2);

        /* renamed from: s */
        public static final c f61316s = new c("BELOW_END", 3);

        /* renamed from: t */
        public static final c f61317t = new c("MIDDLE", 4);

        /* renamed from: u */
        public static final c f61318u = new c("NULL", 5);

        /* renamed from: v */
        private static final /* synthetic */ c[] f61319v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f61320w;

        static {
            c[] m65573b = m65573b();
            f61319v = m65573b;
            f61320w = AbstractC30166b.m148796a(m65573b);
        }

        private c(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m65573b() {
            return new c[]{f61313p, f61314q, f61315r, f61316s, f61317t, f61318u};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f61319v.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.popup.a$d */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61321a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f61317t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f61313p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f61314q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f61315r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.f61316s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f61321a = iArr;
        }
    }

    public C11785a(ViewGroup viewGroup, List list) {
        AbstractC19074t.m100208f(viewGroup, "root");
        AbstractC19074t.m100208f(list, "options");
        this.f61300a = viewGroup;
        this.f61301b = list;
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        TextSelectPopupMenuView textSelectPopupMenuView = new TextSelectPopupMenuView(context);
        textSelectPopupMenuView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textSelectPopupMenuView.setOrientation(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            textSelectPopupMenuView.m65553b((b) it.next());
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        textSelectPopupMenuView.measure(makeMeasureSpec, makeMeasureSpec);
        this.f61302c = textSelectPopupMenuView;
        this.f61303d = new PopupWindow(textSelectPopupMenuView, -2, -2);
        this.f61304e = new Runnable() { // from class: p60.a
            public /* synthetic */ RunnableC24660a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11785a.m65567n(C11785a.this);
            }
        };
        this.f61305f = AbstractC23136l9.m118742r(11.0f);
        this.f61306g = new int[2];
        this.f61307h = new int[2];
        this.f61308i = new Rect();
        this.f61309j = new Rect();
        this.f61310k = new Rect();
    }

    /* renamed from: b */
    private final Point m65556b(c cVar) {
        int i11 = d.f61321a[cVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return new Point(-1, -1);
                        }
                        return new Point(this.f61309j.centerX(), m65565l());
                    }
                    return new Point(this.f61309j.centerX(), m65562i());
                }
                return new Point(this.f61308i.centerX(), m65566m());
            }
            return new Point(this.f61308i.centerX(), m65563j());
        }
        return new Point(this.f61300a.getWidth() / 2, this.f61300a.getHeight() / 2);
    }

    /* renamed from: c */
    private final void m65557c(InterfaceC30793c.b bVar) {
        bVar.m149763g().getLocationInWindow(this.f61307h);
        this.f61300a.getLocationInWindow(this.f61306g);
        int m149758b = (bVar.m149758b() + this.f61307h[0]) - this.f61306g[0];
        int m149759c = (bVar.m149759c() + this.f61307h[1]) - this.f61306g[1];
        bVar.m149757a().m149804b(bVar.m149761e(), bVar.m149760d(), C30795e.m149801g(bVar.m149757a(), bVar.m149761e(), false, 2, null), this.f61308i);
        this.f61308i.offset(m149758b, m149759c);
        bVar.m149757a().m149804b(bVar.m149761e(), bVar.m149760d(), bVar.m149757a().m149808f(bVar.m149760d(), true), this.f61309j);
        this.f61309j.offset(m149758b, m149759c);
    }

    /* renamed from: d */
    private final c m65558d() {
        if (m65563j() >= 0 && this.f61308i.top <= this.f61300a.getHeight()) {
            return c.f61313p;
        }
        if (this.f61309j.bottom >= 0 && m65565l() <= this.f61300a.getHeight()) {
            return c.f61316s;
        }
        if (this.f61308i.top >= 0 && m65566m() <= this.f61300a.getHeight()) {
            return c.f61314q;
        }
        if (m65562i() >= 0 && this.f61309j.top <= this.f61300a.getHeight()) {
            return c.f61315r;
        }
        if (this.f61308i.bottom <= 0 && this.f61309j.top >= this.f61300a.getHeight()) {
            return c.f61317t;
        }
        return c.f61318u;
    }

    /* renamed from: e */
    private final void m65559e(Point point) {
        int measuredWidth = point.x - (this.f61302c.getMeasuredWidth() / 2);
        int measuredHeight = point.y - (this.f61302c.getMeasuredHeight() / 2);
        this.f61310k.set(measuredWidth, measuredHeight, this.f61302c.getMeasuredWidth() + measuredWidth, this.f61302c.getMeasuredHeight() + measuredHeight);
    }

    /* renamed from: g */
    public static /* synthetic */ void m65560g(C11785a c11785a, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        c11785a.m65569f(j11);
    }

    /* renamed from: h */
    private final int m65561h(Rect rect) {
        return rect.top - (this.f61302c.getMeasuredHeight() / 2);
    }

    /* renamed from: i */
    private final int m65562i() {
        return m65561h(this.f61309j);
    }

    /* renamed from: j */
    private final int m65563j() {
        return m65561h(this.f61308i);
    }

    /* renamed from: k */
    private final int m65564k(Rect rect) {
        return rect.bottom + (this.f61302c.getMeasuredHeight() / 2);
    }

    /* renamed from: l */
    private final int m65565l() {
        boolean z11;
        if (this.f61309j.width() < this.f61302c.getMeasuredWidth()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return m65564k(this.f61309j) + (this.f61305f * 2);
        }
        if (!z11) {
            return m65564k(this.f61309j);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: m */
    private final int m65566m() {
        return m65564k(this.f61308i);
    }

    /* renamed from: n */
    public static final void m65567n(C11785a c11785a) {
        AbstractC19074t.m100208f(c11785a, "this$0");
        c11785a.f61303d.dismiss();
    }

    /* renamed from: p */
    private final void m65568p() {
        try {
            if (this.f61303d.isShowing()) {
                PopupWindow popupWindow = this.f61303d;
                Rect rect = this.f61310k;
                popupWindow.update(rect.left, rect.top, popupWindow.getWidth(), this.f61303d.getHeight());
            } else {
                PopupWindow popupWindow2 = this.f61303d;
                ViewGroup viewGroup = this.f61300a;
                Rect rect2 = this.f61310k;
                popupWindow2.showAtLocation(viewGroup, 0, rect2.left, rect2.top);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    public final void m65569f(long j11) {
        AbstractC19444a.m101696d(this.f61304e);
        if (j11 <= 0) {
            this.f61303d.dismiss();
        } else {
            AbstractC19444a.m101694b(this.f61304e, j11);
        }
    }

    /* renamed from: o */
    public final void m65570o(InterfaceC30793c.b bVar) {
        AbstractC19074t.m100208f(bVar, "content");
        AbstractC19444a.m101696d(this.f61304e);
        m65557c(bVar);
        c m65558d = m65558d();
        if (m65558d == c.f61318u) {
            m65560g(this, 0L, 1, null);
            return;
        }
        m65559e(m65556b(m65558d));
        if (this.f61300a.getWidth() - this.f61310k.centerX() < this.f61310k.width() / 2) {
            this.f61302c.m65554f(m65558d, this.f61300a.getWidth() - this.f61310k.centerX());
        } else if (this.f61310k.centerX() < this.f61310k.width() / 2) {
            this.f61302c.m65554f(m65558d, this.f61310k.width() - this.f61310k.centerX());
        } else {
            this.f61302c.m65554f(m65558d, this.f61310k.width() / 2);
        }
        m65568p();
    }
}
