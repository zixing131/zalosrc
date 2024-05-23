package p674y9;

import ca.C3380a;
import ca.C3382c;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6740a;
import com.google.gson.C6743d;
import com.google.gson.InterfaceC6751l;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p637x9.InterfaceC29510a;
import p637x9.InterfaceC29513d;
import p637x9.InterfaceC29514e;
import p664y.AbstractC30228a;

/* renamed from: y9.d */
/* loaded from: classes3.dex */
public final class C30847d implements InterfaceC6751l, Cloneable {

    /* renamed from: v */
    public static final C30847d f142338v = new C30847d();

    /* renamed from: s */
    private boolean f142342s;

    /* renamed from: p */
    private double f142339p = -1.0d;

    /* renamed from: q */
    private int f142340q = 136;

    /* renamed from: r */
    private boolean f142341r = true;

    /* renamed from: t */
    private List f142343t = Collections.emptyList();

    /* renamed from: u */
    private List f142344u = Collections.emptyList();

    /* renamed from: y9.d$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC6750k {

        /* renamed from: a */
        private AbstractC6750k f142345a;

        /* renamed from: b */
        final /* synthetic */ boolean f142346b;

        /* renamed from: c */
        final /* synthetic */ boolean f142347c;

        /* renamed from: d */
        final /* synthetic */ C6743d f142348d;

        /* renamed from: e */
        final /* synthetic */ TypeToken f142349e;

        a(boolean z11, boolean z12, C6743d c6743d, TypeToken typeToken) {
            this.f142346b = z11;
            this.f142347c = z12;
            this.f142348d = c6743d;
            this.f142349e = typeToken;
        }

        /* renamed from: e */
        private AbstractC6750k m149967e() {
            AbstractC6750k abstractC6750k = this.f142345a;
            if (abstractC6750k == null) {
                AbstractC6750k m34528l = this.f142348d.m34528l(C30847d.this, this.f142349e);
                this.f142345a = m34528l;
                return m34528l;
            }
            return abstractC6750k;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: b */
        public Object mo34534b(C3380a c3380a) {
            if (this.f142346b) {
                c3380a.m17006g0();
                return null;
            }
            return m149967e().mo34534b(c3380a);
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: d */
        public void mo34535d(C3382c c3382c, Object obj) {
            if (this.f142347c) {
                c3382c.mo17043v();
            } else {
                m149967e().mo34535d(c3382c, obj);
            }
        }
    }

    /* renamed from: e */
    private boolean m149956e(Class cls) {
        if (this.f142339p != -1.0d && !m149963m((InterfaceC29513d) cls.getAnnotation(InterfaceC29513d.class), (InterfaceC29514e) cls.getAnnotation(InterfaceC29514e.class))) {
            return true;
        }
        if ((!this.f142341r && m149959i(cls)) || m149958h(cls)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m149957f(Class cls, boolean z11) {
        List list;
        if (z11) {
            list = this.f142343t;
        } else {
            list = this.f142344u;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC30228a.m149044a(it.next());
        throw null;
    }

    /* renamed from: h */
    private boolean m149958h(Class cls) {
        if (!Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private boolean m149959i(Class cls) {
        if (cls.isMemberClass() && !m149960j(cls)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m149960j(Class cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m149961k(InterfaceC29513d interfaceC29513d) {
        if (interfaceC29513d != null && interfaceC29513d.value() > this.f142339p) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m149962l(InterfaceC29514e interfaceC29514e) {
        if (interfaceC29514e != null && interfaceC29514e.value() <= this.f142339p) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m149963m(InterfaceC29513d interfaceC29513d, InterfaceC29514e interfaceC29514e) {
        if (m149961k(interfaceC29513d) && m149962l(interfaceC29514e)) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.InterfaceC6751l
    /* renamed from: a */
    public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
        boolean z11;
        boolean z12;
        Class rawType = typeToken.getRawType();
        boolean m149956e = m149956e(rawType);
        if (!m149956e && !m149957f(rawType, true)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!m149956e && !m149957f(rawType, false)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z11 && !z12) {
            return null;
        }
        return new a(z12, z11, c6743d, typeToken);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C30847d clone() {
        try {
            return (C30847d) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    /* renamed from: c */
    public boolean m149965c(Class cls, boolean z11) {
        if (!m149956e(cls) && !m149957f(cls, z11)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean m149966g(Field field, boolean z11) {
        List list;
        InterfaceC29510a interfaceC29510a;
        if ((this.f142340q & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f142339p != -1.0d && !m149963m((InterfaceC29513d) field.getAnnotation(InterfaceC29513d.class), (InterfaceC29514e) field.getAnnotation(InterfaceC29514e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f142342s && ((interfaceC29510a = (InterfaceC29510a) field.getAnnotation(InterfaceC29510a.class)) == null || (!z11 ? !interfaceC29510a.deserialize() : !interfaceC29510a.serialize()))) {
            return true;
        }
        if ((!this.f142341r && m149959i(field.getType())) || m149958h(field.getType())) {
            return true;
        }
        if (z11) {
            list = this.f142343t;
        } else {
            list = this.f142344u;
        }
        if (!list.isEmpty()) {
            new C6740a(field);
            Iterator it = list.iterator();
            if (it.hasNext()) {
                AbstractC30228a.m149044a(it.next());
                throw null;
            }
            return false;
        }
        return false;
    }
}
