package p535u2;

import androidx.work.C2148h;
import java.util.Collections;
import java.util.List;
import p008a2.AbstractC0066f0;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p119e2.InterfaceC18186k;

/* renamed from: u2.t */
/* loaded from: classes.dex */
public final class C26973t implements InterfaceC26972s {

    /* renamed from: a */
    private final AbstractC0086w f127487a;

    /* renamed from: b */
    private final AbstractC0074k f127488b;

    /* renamed from: c */
    private final AbstractC0066f0 f127489c;

    /* renamed from: d */
    private final AbstractC0066f0 f127490d;

    /* renamed from: u2.t$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C26971r c26971r) {
            if (c26971r.m138963b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c26971r.m138963b());
            }
            byte[] m11529l = C2148h.m11529l(c26971r.m138962a());
            if (m11529l == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo221n0(2, m11529l);
            }
        }
    }

    /* renamed from: u2.t$b */
    /* loaded from: classes.dex */
    class b extends AbstractC0066f0 {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: u2.t$c */
    /* loaded from: classes.dex */
    class c extends AbstractC0066f0 {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C26973t(AbstractC0086w abstractC0086w) {
        this.f127487a = abstractC0086w;
        this.f127488b = new a(abstractC0086w);
        this.f127489c = new b(abstractC0086w);
        this.f127490d = new c(abstractC0086w);
    }

    /* renamed from: d */
    public static List m138967d() {
        return Collections.emptyList();
    }

    @Override // p535u2.InterfaceC26972s
    /* renamed from: a */
    public void mo138964a() {
        this.f127487a.m341d();
        InterfaceC18186k m248b = this.f127490d.m248b();
        this.f127487a.m342e();
        try {
            m248b.mo223w();
            this.f127487a.m339E();
        } finally {
            this.f127487a.m347j();
            this.f127490d.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26972s
    /* renamed from: b */
    public void mo138965b(String str) {
        this.f127487a.m341d();
        InterfaceC18186k m248b = this.f127489c.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        this.f127487a.m342e();
        try {
            m248b.mo223w();
            this.f127487a.m339E();
        } finally {
            this.f127487a.m347j();
            this.f127489c.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26972s
    /* renamed from: c */
    public void mo138966c(C26971r c26971r) {
        this.f127487a.m341d();
        this.f127487a.m342e();
        try {
            this.f127488b.m263j(c26971r);
            this.f127487a.m339E();
        } finally {
            this.f127487a.m347j();
        }
    }
}
