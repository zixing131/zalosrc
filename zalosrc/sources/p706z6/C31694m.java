package p706z6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p357n6.AbstractC23587l;

/* renamed from: z6.m */
/* loaded from: classes3.dex */
public class C31694m {

    /* renamed from: m */
    public static final InterfaceC31684c f145586m = new C31692k(0.5f);

    /* renamed from: a */
    AbstractC31685d f145587a;

    /* renamed from: b */
    AbstractC31685d f145588b;

    /* renamed from: c */
    AbstractC31685d f145589c;

    /* renamed from: d */
    AbstractC31685d f145590d;

    /* renamed from: e */
    InterfaceC31684c f145591e;

    /* renamed from: f */
    InterfaceC31684c f145592f;

    /* renamed from: g */
    InterfaceC31684c f145593g;

    /* renamed from: h */
    InterfaceC31684c f145594h;

    /* renamed from: i */
    C31687f f145595i;

    /* renamed from: j */
    C31687f f145596j;

    /* renamed from: k */
    C31687f f145597k;

    /* renamed from: l */
    C31687f f145598l;

    /* renamed from: z6.m$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC31684c mo152464a(InterfaceC31684c interfaceC31684c);
    }

    /* renamed from: a */
    public static b m152471a() {
        return new b();
    }

    /* renamed from: b */
    public static b m152472b(Context context, int i11, int i12) {
        return m152473c(context, i11, i12, 0);
    }

    /* renamed from: c */
    private static b m152473c(Context context, int i11, int i12, int i13) {
        return m152474d(context, i11, i12, new C31682a(i13));
    }

    /* renamed from: d */
    private static b m152474d(Context context, int i11, int i12, InterfaceC31684c interfaceC31684c) {
        if (i12 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
            i11 = i12;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, AbstractC23587l.ShapeAppearance);
        try {
            int i13 = obtainStyledAttributes.getInt(AbstractC23587l.ShapeAppearance_cornerFamily, 0);
            int i14 = obtainStyledAttributes.getInt(AbstractC23587l.ShapeAppearance_cornerFamilyTopLeft, i13);
            int i15 = obtainStyledAttributes.getInt(AbstractC23587l.ShapeAppearance_cornerFamilyTopRight, i13);
            int i16 = obtainStyledAttributes.getInt(AbstractC23587l.ShapeAppearance_cornerFamilyBottomRight, i13);
            int i17 = obtainStyledAttributes.getInt(AbstractC23587l.ShapeAppearance_cornerFamilyBottomLeft, i13);
            InterfaceC31684c m152478m = m152478m(obtainStyledAttributes, AbstractC23587l.ShapeAppearance_cornerSize, interfaceC31684c);
            InterfaceC31684c m152478m2 = m152478m(obtainStyledAttributes, AbstractC23587l.ShapeAppearance_cornerSizeTopLeft, m152478m);
            InterfaceC31684c m152478m3 = m152478m(obtainStyledAttributes, AbstractC23587l.ShapeAppearance_cornerSizeTopRight, m152478m);
            InterfaceC31684c m152478m4 = m152478m(obtainStyledAttributes, AbstractC23587l.ShapeAppearance_cornerSizeBottomRight, m152478m);
            return new b().m152511C(i14, m152478m2).m152515G(i15, m152478m3).m152529x(i16, m152478m4).m152525t(i17, m152478m(obtainStyledAttributes, AbstractC23587l.ShapeAppearance_cornerSizeBottomLeft, m152478m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static b m152475e(Context context, AttributeSet attributeSet, int i11, int i12) {
        return m152476f(context, attributeSet, i11, i12, 0);
    }

    /* renamed from: f */
    public static b m152476f(Context context, AttributeSet attributeSet, int i11, int i12, int i13) {
        return m152477g(context, attributeSet, i11, i12, new C31682a(i13));
    }

    /* renamed from: g */
    public static b m152477g(Context context, AttributeSet attributeSet, int i11, int i12, InterfaceC31684c interfaceC31684c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.MaterialShape, i11, i12);
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC23587l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(AbstractC23587l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m152474d(context, resourceId, resourceId2, interfaceC31684c);
    }

    /* renamed from: m */
    private static InterfaceC31684c m152478m(TypedArray typedArray, int i11, InterfaceC31684c interfaceC31684c) {
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue == null) {
            return interfaceC31684c;
        }
        int i12 = peekValue.type;
        if (i12 == 5) {
            return new C31682a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i12 == 6) {
            return new C31692k(peekValue.getFraction(1.0f, 1.0f));
        }
        return interfaceC31684c;
    }

    /* renamed from: h */
    public C31687f m152479h() {
        return this.f145597k;
    }

    /* renamed from: i */
    public AbstractC31685d m152480i() {
        return this.f145590d;
    }

    /* renamed from: j */
    public InterfaceC31684c m152481j() {
        return this.f145594h;
    }

    /* renamed from: k */
    public AbstractC31685d m152482k() {
        return this.f145589c;
    }

    /* renamed from: l */
    public InterfaceC31684c m152483l() {
        return this.f145593g;
    }

    /* renamed from: n */
    public C31687f m152484n() {
        return this.f145598l;
    }

    /* renamed from: o */
    public C31687f m152485o() {
        return this.f145596j;
    }

    /* renamed from: p */
    public C31687f m152486p() {
        return this.f145595i;
    }

    /* renamed from: q */
    public AbstractC31685d m152487q() {
        return this.f145587a;
    }

    /* renamed from: r */
    public InterfaceC31684c m152488r() {
        return this.f145591e;
    }

    /* renamed from: s */
    public AbstractC31685d m152489s() {
        return this.f145588b;
    }

    /* renamed from: t */
    public InterfaceC31684c m152490t() {
        return this.f145592f;
    }

    /* renamed from: u */
    public boolean m152491u(RectF rectF) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f145598l.getClass().equals(C31687f.class) && this.f145596j.getClass().equals(C31687f.class) && this.f145595i.getClass().equals(C31687f.class) && this.f145597k.getClass().equals(C31687f.class)) {
            z11 = true;
        } else {
            z11 = false;
        }
        float mo152392a = this.f145591e.mo152392a(rectF);
        if (this.f145592f.mo152392a(rectF) == mo152392a && this.f145594h.mo152392a(rectF) == mo152392a && this.f145593g.mo152392a(rectF) == mo152392a) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((this.f145588b instanceof C31693l) && (this.f145587a instanceof C31693l) && (this.f145589c instanceof C31693l) && (this.f145590d instanceof C31693l)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z11 || !z12 || !z13) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public b m152492v() {
        return new b(this);
    }

    /* renamed from: w */
    public C31694m m152493w(float f11) {
        return m152492v().m152520o(f11).m152519m();
    }

    /* renamed from: x */
    public C31694m m152494x(InterfaceC31684c interfaceC31684c) {
        return m152492v().m152521p(interfaceC31684c).m152519m();
    }

    /* renamed from: y */
    public C31694m m152495y(c cVar) {
        return m152492v().m152514F(cVar.mo152464a(m152488r())).m152518J(cVar.mo152464a(m152490t())).m152528w(cVar.mo152464a(m152481j())).m152509A(cVar.mo152464a(m152483l())).m152519m();
    }

    private C31694m(b bVar) {
        this.f145587a = bVar.f145599a;
        this.f145588b = bVar.f145600b;
        this.f145589c = bVar.f145601c;
        this.f145590d = bVar.f145602d;
        this.f145591e = bVar.f145603e;
        this.f145592f = bVar.f145604f;
        this.f145593g = bVar.f145605g;
        this.f145594h = bVar.f145606h;
        this.f145595i = bVar.f145607i;
        this.f145596j = bVar.f145608j;
        this.f145597k = bVar.f145609k;
        this.f145598l = bVar.f145610l;
    }

    /* renamed from: z6.m$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private AbstractC31685d f145599a;

        /* renamed from: b */
        private AbstractC31685d f145600b;

        /* renamed from: c */
        private AbstractC31685d f145601c;

        /* renamed from: d */
        private AbstractC31685d f145602d;

        /* renamed from: e */
        private InterfaceC31684c f145603e;

        /* renamed from: f */
        private InterfaceC31684c f145604f;

        /* renamed from: g */
        private InterfaceC31684c f145605g;

        /* renamed from: h */
        private InterfaceC31684c f145606h;

        /* renamed from: i */
        private C31687f f145607i;

        /* renamed from: j */
        private C31687f f145608j;

        /* renamed from: k */
        private C31687f f145609k;

        /* renamed from: l */
        private C31687f f145610l;

        public b() {
            this.f145599a = AbstractC31690i.m152466b();
            this.f145600b = AbstractC31690i.m152466b();
            this.f145601c = AbstractC31690i.m152466b();
            this.f145602d = AbstractC31690i.m152466b();
            this.f145603e = new C31682a(0.0f);
            this.f145604f = new C31682a(0.0f);
            this.f145605g = new C31682a(0.0f);
            this.f145606h = new C31682a(0.0f);
            this.f145607i = AbstractC31690i.m152467c();
            this.f145608j = AbstractC31690i.m152467c();
            this.f145609k = AbstractC31690i.m152467c();
            this.f145610l = AbstractC31690i.m152467c();
        }

        /* renamed from: n */
        private static float m152508n(AbstractC31685d abstractC31685d) {
            if (abstractC31685d instanceof C31693l) {
                return ((C31693l) abstractC31685d).f145585a;
            }
            if (abstractC31685d instanceof C31686e) {
                return ((C31686e) abstractC31685d).f145532a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public b m152509A(InterfaceC31684c interfaceC31684c) {
            this.f145605g = interfaceC31684c;
            return this;
        }

        /* renamed from: B */
        public b m152510B(C31687f c31687f) {
            this.f145607i = c31687f;
            return this;
        }

        /* renamed from: C */
        public b m152511C(int i11, InterfaceC31684c interfaceC31684c) {
            return m152512D(AbstractC31690i.m152465a(i11)).m152514F(interfaceC31684c);
        }

        /* renamed from: D */
        public b m152512D(AbstractC31685d abstractC31685d) {
            this.f145599a = abstractC31685d;
            float m152508n = m152508n(abstractC31685d);
            if (m152508n != -1.0f) {
                m152513E(m152508n);
            }
            return this;
        }

        /* renamed from: E */
        public b m152513E(float f11) {
            this.f145603e = new C31682a(f11);
            return this;
        }

        /* renamed from: F */
        public b m152514F(InterfaceC31684c interfaceC31684c) {
            this.f145603e = interfaceC31684c;
            return this;
        }

        /* renamed from: G */
        public b m152515G(int i11, InterfaceC31684c interfaceC31684c) {
            return m152516H(AbstractC31690i.m152465a(i11)).m152518J(interfaceC31684c);
        }

        /* renamed from: H */
        public b m152516H(AbstractC31685d abstractC31685d) {
            this.f145600b = abstractC31685d;
            float m152508n = m152508n(abstractC31685d);
            if (m152508n != -1.0f) {
                m152517I(m152508n);
            }
            return this;
        }

        /* renamed from: I */
        public b m152517I(float f11) {
            this.f145604f = new C31682a(f11);
            return this;
        }

        /* renamed from: J */
        public b m152518J(InterfaceC31684c interfaceC31684c) {
            this.f145604f = interfaceC31684c;
            return this;
        }

        /* renamed from: m */
        public C31694m m152519m() {
            return new C31694m(this);
        }

        /* renamed from: o */
        public b m152520o(float f11) {
            return m152513E(f11).m152517I(f11).m152531z(f11).m152527v(f11);
        }

        /* renamed from: p */
        public b m152521p(InterfaceC31684c interfaceC31684c) {
            return m152514F(interfaceC31684c).m152518J(interfaceC31684c).m152509A(interfaceC31684c).m152528w(interfaceC31684c);
        }

        /* renamed from: q */
        public b m152522q(int i11, float f11) {
            return m152523r(AbstractC31690i.m152465a(i11)).m152520o(f11);
        }

        /* renamed from: r */
        public b m152523r(AbstractC31685d abstractC31685d) {
            return m152512D(abstractC31685d).m152516H(abstractC31685d).m152530y(abstractC31685d).m152526u(abstractC31685d);
        }

        /* renamed from: s */
        public b m152524s(C31687f c31687f) {
            this.f145609k = c31687f;
            return this;
        }

        /* renamed from: t */
        public b m152525t(int i11, InterfaceC31684c interfaceC31684c) {
            return m152526u(AbstractC31690i.m152465a(i11)).m152528w(interfaceC31684c);
        }

        /* renamed from: u */
        public b m152526u(AbstractC31685d abstractC31685d) {
            this.f145602d = abstractC31685d;
            float m152508n = m152508n(abstractC31685d);
            if (m152508n != -1.0f) {
                m152527v(m152508n);
            }
            return this;
        }

        /* renamed from: v */
        public b m152527v(float f11) {
            this.f145606h = new C31682a(f11);
            return this;
        }

        /* renamed from: w */
        public b m152528w(InterfaceC31684c interfaceC31684c) {
            this.f145606h = interfaceC31684c;
            return this;
        }

        /* renamed from: x */
        public b m152529x(int i11, InterfaceC31684c interfaceC31684c) {
            return m152530y(AbstractC31690i.m152465a(i11)).m152509A(interfaceC31684c);
        }

        /* renamed from: y */
        public b m152530y(AbstractC31685d abstractC31685d) {
            this.f145601c = abstractC31685d;
            float m152508n = m152508n(abstractC31685d);
            if (m152508n != -1.0f) {
                m152531z(m152508n);
            }
            return this;
        }

        /* renamed from: z */
        public b m152531z(float f11) {
            this.f145605g = new C31682a(f11);
            return this;
        }

        public b(C31694m c31694m) {
            this.f145599a = AbstractC31690i.m152466b();
            this.f145600b = AbstractC31690i.m152466b();
            this.f145601c = AbstractC31690i.m152466b();
            this.f145602d = AbstractC31690i.m152466b();
            this.f145603e = new C31682a(0.0f);
            this.f145604f = new C31682a(0.0f);
            this.f145605g = new C31682a(0.0f);
            this.f145606h = new C31682a(0.0f);
            this.f145607i = AbstractC31690i.m152467c();
            this.f145608j = AbstractC31690i.m152467c();
            this.f145609k = AbstractC31690i.m152467c();
            this.f145610l = AbstractC31690i.m152467c();
            this.f145599a = c31694m.f145587a;
            this.f145600b = c31694m.f145588b;
            this.f145601c = c31694m.f145589c;
            this.f145602d = c31694m.f145590d;
            this.f145603e = c31694m.f145591e;
            this.f145604f = c31694m.f145592f;
            this.f145605g = c31694m.f145593g;
            this.f145606h = c31694m.f145594h;
            this.f145607i = c31694m.f145595i;
            this.f145608j = c31694m.f145596j;
            this.f145609k = c31694m.f145597k;
            this.f145610l = c31694m.f145598l;
        }
    }

    public C31694m() {
        this.f145587a = AbstractC31690i.m152466b();
        this.f145588b = AbstractC31690i.m152466b();
        this.f145589c = AbstractC31690i.m152466b();
        this.f145590d = AbstractC31690i.m152466b();
        this.f145591e = new C31682a(0.0f);
        this.f145592f = new C31682a(0.0f);
        this.f145593g = new C31682a(0.0f);
        this.f145594h = new C31682a(0.0f);
        this.f145595i = AbstractC31690i.m152467c();
        this.f145596j = AbstractC31690i.m152467c();
        this.f145597k = AbstractC31690i.m152467c();
        this.f145598l = AbstractC31690i.m152467c();
    }
}
