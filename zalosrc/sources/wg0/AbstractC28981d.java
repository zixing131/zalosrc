package wg0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: wg0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC28981d {

    /* renamed from: a */
    private final int f134106a;

    /* renamed from: b */
    private final float f134107b;

    /* renamed from: c */
    private final InterfaceC28990m[] f134108c;

    /* renamed from: wg0.d$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC28981d {

        /* renamed from: d */
        private final EnumC28993p f134109d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i11, EnumC28993p enumC28993p, InterfaceC28990m[] interfaceC28990mArr) {
            super(i11, r0, interfaceC28990mArr, null);
            float m144702b;
            AbstractC19074t.m100208f(enumC28993p, "reason");
            AbstractC19074t.m100208f(interfaceC28990mArr, "states");
            m144702b = AbstractC28983f.m144702b(interfaceC28990mArr);
            this.f134109d = enumC28993p;
        }

        /* renamed from: f */
        public final EnumC28993p m144699f() {
            return this.f134109d;
        }
    }

    /* renamed from: wg0.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC28981d {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(int i11, InterfaceC28990m[] interfaceC28990mArr) {
            super(i11, r0, interfaceC28990mArr, null);
            float m144702b;
            AbstractC19074t.m100208f(interfaceC28990mArr, "states");
            m144702b = AbstractC28983f.m144702b(interfaceC28990mArr);
        }
    }

    /* renamed from: wg0.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC28981d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, InterfaceC28990m[] interfaceC28990mArr) {
            super(i11, 0.0f, interfaceC28990mArr, null);
            AbstractC19074t.m100208f(interfaceC28990mArr, "states");
        }
    }

    /* renamed from: wg0.d$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC28981d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i11, InterfaceC28990m[] interfaceC28990mArr) {
            super(i11, 0.0f, interfaceC28990mArr, null);
            AbstractC19074t.m100208f(interfaceC28990mArr, "states");
        }
    }

    /* renamed from: wg0.d$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC28981d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i11, InterfaceC28990m[] interfaceC28990mArr) {
            super(i11, 1.0f, interfaceC28990mArr, null);
            AbstractC19074t.m100208f(interfaceC28990mArr, "states");
        }
    }

    /* renamed from: wg0.d$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC28981d {

        /* renamed from: d */
        public static final f f134110d = new f();

        private f() {
            super(-1, -1.0f, new InterfaceC28990m[0], null);
        }
    }

    public /* synthetic */ AbstractC28981d(int i11, float f11, InterfaceC28990m[] interfaceC28990mArr, AbstractC19060k abstractC19060k) {
        this(i11, f11, interfaceC28990mArr);
    }

    /* renamed from: a */
    public final InterfaceC28990m m144694a(int i11) {
        for (InterfaceC28990m interfaceC28990m : this.f134108c) {
            if (interfaceC28990m.mo90085f() == i11) {
                return interfaceC28990m;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final float m144695b() {
        return this.f134107b;
    }

    /* renamed from: c */
    public final int m144696c() {
        return this.f134106a;
    }

    /* renamed from: d */
    public final boolean m144697d() {
        return this.f134106a != -1;
    }

    /* renamed from: e */
    public final boolean m144698e() {
        if ((this instanceof a) && ((a) this).m144699f() == EnumC28993p.f134268r) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (this instanceof f) {
            return "Uninitialized";
        }
        if (this instanceof d) {
            return "Start";
        }
        if (this instanceof a) {
            return "Paused(currentProgress=" + this.f134107b + ", reason=" + ((a) this).m144699f() + ")";
        }
        if (this instanceof b) {
            return "Progressing(currentProgress=" + this.f134107b + ")";
        }
        if (this instanceof c) {
            return "RuntimeError";
        }
        if (this instanceof e) {
            return "Success";
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC28981d(int i11, float f11, InterfaceC28990m[] interfaceC28990mArr) {
        this.f134106a = i11;
        this.f134107b = f11;
        this.f134108c = interfaceC28990mArr;
    }
}
