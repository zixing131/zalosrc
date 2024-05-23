package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kd0.C21693c;
import kd0.C21697g;
import l30.AbstractC22047r0;
import me0.AbstractC23222t7;
import o30.C24009b;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import sm0.AbstractC26327c;
import ti0.C26705d;
import ti0.C26707f;

/* loaded from: classes6.dex */
public final class StoryReactedOverviewLayout extends ModulesView {
    public static final C13545a Companion = new C13545a(null);

    /* renamed from: K */
    private final C21697g f69830K;

    /* renamed from: com.zing.zalo.ui.widget.StoryReactedOverviewLayout$a */
    /* loaded from: classes6.dex */
    public static final class C13545a {
        private C13545a() {
        }

        public /* synthetic */ C13545a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.StoryReactedOverviewLayout$b */
    /* loaded from: classes6.dex */
    public static final class C13546b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(((C24009b) obj2).m125885c()), Integer.valueOf(((C24009b) obj).m125885c()));
            return m135478b;
        }
    }

    public StoryReactedOverviewLayout(Context context) {
        super(context);
        C21697g c21697g = new C21697g(getContext());
        c21697g.mo111965M1(0);
        this.f69830K = c21697g;
    }

    /* renamed from: V */
    public final void m75959V(int i11, int i12) {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(this.f69830K).m137318a(C26705d.m137293a(context, i12));
        this.f69830K.m111962J1(i11);
        this.f69830K.mo111965M1(0);
    }

    /* renamed from: W */
    public final void m75960W(List list, String str) {
        AbstractC19074t.m100208f(list, "reactionIds");
        AbstractC19074t.m100208f(str, "totalReaction");
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        mo44090O();
        int i11 = AbstractC23222t7.f112514B;
        Iterator it = list.iterator();
        C21693c c21693c = null;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C21693c c21693c2 = new C21693c(getContext());
            c21693c2.m89106L().m89028L(i11, i11).m89041Y(AbstractC23222t7.f112552c).m89027K(true);
            AbstractC22047r0.m115048f(c21693c2, str2, 20);
            if (c21693c == null) {
                c21693c2.m89106L().m89073z(Boolean.TRUE);
            } else {
                c21693c2.m89106L().m89054h0(c21693c);
            }
            mo69681L(c21693c2);
            c21693c = c21693c2;
        }
        this.f69830K.m89106L().m89063o();
        this.f69830K.m89106L().m89028L(-2, -2).m89027K(true);
        if (c21693c == null) {
            this.f69830K.m89106L().m89073z(Boolean.TRUE);
        } else {
            this.f69830K.m89106L().m89054h0(c21693c).m89034R(AbstractC23222t7.f112556e);
        }
        this.f69830K.m111959G1(str);
        mo69681L(this.f69830K);
    }

    /* renamed from: X */
    public final void m75961X(int i11) {
        String valueOf;
        C21697g c21697g = this.f69830K;
        if (i11 > 99) {
            valueOf = "99+";
        } else {
            valueOf = String.valueOf(i11);
        }
        c21697g.m111959G1(valueOf);
    }

    public final void setReactions(List<C24009b> list) {
        List m131177E0;
        List m131179G0;
        int m131511r;
        String valueOf;
        AbstractC19074t.m100208f(list, "listReactionData");
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        List<C24009b> list2 = list;
        m131177E0 = AbstractC25332a0.m131177E0(list2, new C13546b());
        m131179G0 = AbstractC25332a0.m131179G0(m131177E0, 3);
        List list3 = m131179G0;
        m131511r = AbstractC25370t.m131511r(list3, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((C24009b) it.next()).m125886d());
        }
        Iterator<T> it2 = list2.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            i11 += ((C24009b) it2.next()).m125885c();
        }
        if (i11 > 99) {
            valueOf = "99+";
        } else {
            valueOf = String.valueOf(i11);
        }
        m75960W(arrayList, valueOf);
    }

    public StoryReactedOverviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C21697g c21697g = new C21697g(getContext());
        c21697g.mo111965M1(0);
        this.f69830K = c21697g;
    }
}
