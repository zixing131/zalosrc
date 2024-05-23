package pk0;

import android.graphics.Rect;
import com.zing.zalo.zinstant.InterfaceC17139d;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import ll0.C22518f;
import nj0.AbstractC23802a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qk0.InterfaceC25305a;
import uk0.AbstractC27288b;

/* renamed from: pk0.f */
/* loaded from: classes7.dex */
public abstract class AbstractC24807f implements InterfaceC24806e {

    /* renamed from: a */
    private final a f119068a = new a();

    /* renamed from: b */
    private final f f119069b = new f();

    /* renamed from: c */
    private final c f119070c = new c();

    /* renamed from: d */
    private final d f119071d = new d();

    /* renamed from: e */
    private final e f119072e = new e();

    /* renamed from: f */
    private final InterfaceC24854k f119073f;

    /* renamed from: g */
    private InterfaceC24806e f119074g;

    /* renamed from: pk0.f$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC24802a {
        a() {
        }
    }

    /* renamed from: pk0.f$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f119075q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22518f mo12V4() {
            return new C22518f();
        }
    }

    /* renamed from: pk0.f$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC27288b {
        c() {
        }
    }

    /* renamed from: pk0.f$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC23802a {
        d() {
        }
    }

    /* renamed from: pk0.f$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC24804c {
        e() {
        }
    }

    /* renamed from: pk0.f$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC24809h {
        f() {
        }
    }

    public AbstractC24807f() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f119075q);
        this.f119073f = m129210a;
    }

    /* renamed from: d */
    private final C22518f m128881d() {
        return (C22518f) this.f119073f.getValue();
    }

    @Override // pk0.InterfaceC24806e
    /* renamed from: a */
    public InterfaceC25305a mo128873a() {
        InterfaceC24806e interfaceC24806e = this.f119074g;
        if (interfaceC24806e != null) {
            this.f119068a.m128868g(interfaceC24806e.mo128873a());
        }
        return this.f119068a;
    }

    @Override // pk0.InterfaceC24806e
    /* renamed from: b */
    public InterfaceC17139d mo128874b() {
        InterfaceC24806e interfaceC24806e = this.f119074g;
        if (interfaceC24806e != null) {
            this.f119071d.m124373d(interfaceC24806e.mo128874b());
        }
        return this.f119071d;
    }

    @Override // pk0.InterfaceC24806e
    /* renamed from: c */
    public C22518f mo128880c() {
        InterfaceC24806e interfaceC24806e = this.f119074g;
        if (interfaceC24806e != null) {
            return interfaceC24806e.mo128880c();
        }
        return m128881d();
    }

    /* renamed from: e */
    public Rect mo128875e() {
        return new Rect(0, 0, 0, 0);
    }
}
