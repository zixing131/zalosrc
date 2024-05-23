package androidx.lifecycle;

import android.view.View;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import nn0.AbstractC23904m;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;
import p514t1.AbstractC26448a;

/* renamed from: androidx.lifecycle.b1 */
/* loaded from: classes.dex */
public abstract class AbstractC1759b1 {

    /* renamed from: androidx.lifecycle.b1$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f7296q = new a();

        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo205i9(View view) {
            AbstractC19074t.m100208f(view, "currentView");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: androidx.lifecycle.b1$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f7297q = new b();

        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1801w mo205i9(View view) {
            AbstractC19074t.m100208f(view, "viewParent");
            Object tag = view.getTag(AbstractC26448a.view_tree_lifecycle_owner);
            if (tag instanceof InterfaceC1801w) {
                return (InterfaceC1801w) tag;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final InterfaceC1801w m9259a(View view) {
        InterfaceC23898g m125018g;
        InterfaceC23898g m125029r;
        Object m125026o;
        AbstractC19074t.m100208f(view, "<this>");
        m125018g = AbstractC23904m.m125018g(view, a.f7296q);
        m125029r = AbstractC23906o.m125029r(m125018g, b.f7297q);
        m125026o = AbstractC23906o.m125026o(m125029r);
        return (InterfaceC1801w) m125026o;
    }

    /* renamed from: b */
    public static final void m9260b(View view, InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setTag(AbstractC26448a.view_tree_lifecycle_owner, interfaceC1801w);
    }
}
