package z00;

import a10.C0038c;
import a10.C0039d;
import a10.C0040e;
import a10.C0041f;
import a10.C0042g;
import a10.C0043h;
import a10.C0044i;
import a10.C0045j;
import a10.C0046k;
import a10.C0047l;
import a10.C0048m;
import a10.C0049n;
import a10.C0050o;
import a10.C0051p;
import android.database.Cursor;
import java.util.Collections;
import java.util.List;
import p008a2.AbstractC0066f0;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3205a;
import p046c2.AbstractC3206b;
import p119e2.InterfaceC18186k;
import y00.C30247a;
import z00.InterfaceC31140a;

/* renamed from: z00.b */
/* loaded from: classes5.dex */
public final class C31141b implements InterfaceC31140a {

    /* renamed from: A */
    private final AbstractC0066f0 f143504A;

    /* renamed from: B */
    private final AbstractC0066f0 f143505B;

    /* renamed from: C */
    private final AbstractC0066f0 f143506C;

    /* renamed from: a */
    private final AbstractC0086w f143507a;

    /* renamed from: b */
    private final AbstractC0074k f143508b;

    /* renamed from: c */
    private final AbstractC0074k f143509c;

    /* renamed from: d */
    private final AbstractC0074k f143510d;

    /* renamed from: e */
    private final AbstractC0074k f143511e;

    /* renamed from: f */
    private final AbstractC0074k f143512f;

    /* renamed from: g */
    private final AbstractC0074k f143513g;

    /* renamed from: h */
    private final AbstractC0074k f143514h;

    /* renamed from: i */
    private final AbstractC0074k f143515i;

    /* renamed from: j */
    private final AbstractC0074k f143516j;

    /* renamed from: k */
    private final AbstractC0074k f143517k;

    /* renamed from: l */
    private final AbstractC0074k f143518l;

    /* renamed from: m */
    private final AbstractC0074k f143519m;

    /* renamed from: n */
    private final AbstractC0074k f143520n;

    /* renamed from: o */
    private final AbstractC0074k f143521o;

    /* renamed from: p */
    private final AbstractC0066f0 f143522p;

    /* renamed from: q */
    private final AbstractC0066f0 f143523q;

    /* renamed from: r */
    private final AbstractC0066f0 f143524r;

    /* renamed from: s */
    private final AbstractC0066f0 f143525s;

    /* renamed from: t */
    private final AbstractC0066f0 f143526t;

    /* renamed from: u */
    private final AbstractC0066f0 f143527u;

    /* renamed from: v */
    private final AbstractC0066f0 f143528v;

    /* renamed from: w */
    private final AbstractC0066f0 f143529w;

    /* renamed from: x */
    private final AbstractC0066f0 f143530x;

    /* renamed from: y */
    private final AbstractC0066f0 f143531y;

    /* renamed from: z */
    private final AbstractC0066f0 f143532z;

    /* renamed from: z00.b$a */
    /* loaded from: classes5.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogEventStreamTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0040e c0040e) {
            if (c0040e.m129b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0040e.m129b());
            }
            String m149198r = C30247a.f140500a.m149198r(c0040e.m128a());
            if (m149198r == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149198r);
            }
        }
    }

    /* renamed from: z00.b$a0 */
    /* loaded from: classes5.dex */
    class a0 extends AbstractC0074k {
        a0(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogEventTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0041f c0041f) {
            if (c0041f.m131b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0041f.m131b());
            }
            String m149198r = C30247a.f140500a.m149198r(c0041f.m130a());
            if (m149198r == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149198r);
            }
        }
    }

    /* renamed from: z00.b$b */
    /* loaded from: classes5.dex */
    class b extends AbstractC0074k {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogUploadTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0048m c0048m) {
            if (c0048m.m145b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0048m.m145b());
            }
            String m149203w = C30247a.f140500a.m149203w(c0048m.m144a());
            if (m149203w == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149203w);
            }
        }
    }

    /* renamed from: z00.b$b0 */
    /* loaded from: classes5.dex */
    class b0 extends AbstractC0074k {
        b0(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogEventAdsTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0039d c0039d) {
            if (c0039d.m127b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0039d.m127b());
            }
            String m149198r = C30247a.f140500a.m149198r(c0039d.m126a());
            if (m149198r == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149198r);
            }
        }
    }

    /* renamed from: z00.b$c */
    /* loaded from: classes5.dex */
    class c extends AbstractC0074k {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogSessionTable` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0047l c0047l) {
            if (c0047l.m143b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0047l.m143b());
            }
            String m149202v = C30247a.f140500a.m149202v(c0047l.m142a());
            if (m149202v == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149202v);
            }
        }
    }

    /* renamed from: z00.b$d */
    /* loaded from: classes5.dex */
    class d extends AbstractC0074k {
        d(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogGetListTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0042g c0042g) {
            if (c0042g.m133b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0042g.m133b());
            }
            String m149199s = C30247a.f140500a.m149199s(c0042g.m132a());
            if (m149199s == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149199s);
            }
        }
    }

    /* renamed from: z00.b$e */
    /* loaded from: classes5.dex */
    class e extends AbstractC0074k {
        e(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogActiveTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0038c c0038c) {
            if (c0038c.m125b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0038c.m125b());
            }
            String m149197q = C30247a.f140500a.m149197q(c0038c.m124a());
            if (m149197q == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149197q);
            }
        }
    }

    /* renamed from: z00.b$f */
    /* loaded from: classes5.dex */
    class f extends AbstractC0066f0 {
        f(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogViewVideoTB";
        }
    }

    /* renamed from: z00.b$g */
    /* loaded from: classes5.dex */
    class g extends AbstractC0066f0 {
        g(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogViewVideoAdsTb";
        }
    }

    /* renamed from: z00.b$h */
    /* loaded from: classes5.dex */
    class h extends AbstractC0066f0 {
        h(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogHistoryVideoTb";
        }
    }

    /* renamed from: z00.b$i */
    /* loaded from: classes5.dex */
    class i extends AbstractC0066f0 {
        i(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogHistoryLivestreamTb";
        }
    }

    /* renamed from: z00.b$j */
    /* loaded from: classes5.dex */
    class j extends AbstractC0066f0 {
        j(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogViewStreamTb";
        }
    }

    /* renamed from: z00.b$k */
    /* loaded from: classes5.dex */
    class k extends AbstractC0074k {
        k(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogViewVideoTB` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0051p c0051p) {
            if (c0051p.m151b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0051p.m151b());
            }
            String m149205y = C30247a.f140500a.m149205y(c0051p.m150a());
            if (m149205y == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149205y);
            }
        }
    }

    /* renamed from: z00.b$l */
    /* loaded from: classes5.dex */
    class l extends AbstractC0066f0 {
        l(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogImpsTB";
        }
    }

    /* renamed from: z00.b$m */
    /* loaded from: classes5.dex */
    class m extends AbstractC0066f0 {
        m(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogImpsAdsTb";
        }
    }

    /* renamed from: z00.b$n */
    /* loaded from: classes5.dex */
    class n extends AbstractC0066f0 {
        n(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogEventTb";
        }
    }

    /* renamed from: z00.b$o */
    /* loaded from: classes5.dex */
    class o extends AbstractC0066f0 {
        o(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogEventAdsTb";
        }
    }

    /* renamed from: z00.b$p */
    /* loaded from: classes5.dex */
    class p extends AbstractC0066f0 {
        p(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogEventStreamTb";
        }
    }

    /* renamed from: z00.b$q */
    /* loaded from: classes5.dex */
    class q extends AbstractC0066f0 {
        q(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogUploadTb";
        }
    }

    /* renamed from: z00.b$r */
    /* loaded from: classes5.dex */
    class r extends AbstractC0066f0 {
        r(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogSessionTable";
        }
    }

    /* renamed from: z00.b$s */
    /* loaded from: classes5.dex */
    class s extends AbstractC0066f0 {
        s(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogGetListTb";
        }
    }

    /* renamed from: z00.b$t */
    /* loaded from: classes5.dex */
    class t extends AbstractC0066f0 {
        t(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM LogActiveTb";
        }
    }

    /* renamed from: z00.b$u */
    /* loaded from: classes5.dex */
    class u extends AbstractC0074k {
        u(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogViewVideoAdsTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0050o c0050o) {
            if (c0050o.m149b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0050o.m149b());
            }
            String m149205y = C30247a.f140500a.m149205y(c0050o.m148a());
            if (m149205y == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149205y);
            }
        }
    }

    /* renamed from: z00.b$v */
    /* loaded from: classes5.dex */
    class v extends AbstractC0074k {
        v(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogHistoryVideoTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0044i c0044i) {
            if (c0044i.m137b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0044i.m137b());
            }
            String m149196p = C30247a.f140500a.m149196p(c0044i.m136a());
            if (m149196p == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149196p);
            }
        }
    }

    /* renamed from: z00.b$w */
    /* loaded from: classes5.dex */
    class w extends AbstractC0074k {
        w(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogHistoryLivestreamTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0043h c0043h) {
            if (c0043h.m135b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0043h.m135b());
            }
            String m149196p = C30247a.f140500a.m149196p(c0043h.m134a());
            if (m149196p == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149196p);
            }
        }
    }

    /* renamed from: z00.b$x */
    /* loaded from: classes5.dex */
    class x extends AbstractC0074k {
        x(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogViewStreamTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0049n c0049n) {
            if (c0049n.m147b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0049n.m147b());
            }
            String m149204x = C30247a.f140500a.m149204x(c0049n.m146a());
            if (m149204x == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149204x);
            }
        }
    }

    /* renamed from: z00.b$y */
    /* loaded from: classes5.dex */
    class y extends AbstractC0074k {
        y(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogImpsTB` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0046k c0046k) {
            if (c0046k.m141b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0046k.m141b());
            }
            String m149201u = C30247a.f140500a.m149201u(c0046k.m140a());
            if (m149201u == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149201u);
            }
        }
    }

    /* renamed from: z00.b$z */
    /* loaded from: classes5.dex */
    class z extends AbstractC0074k {
        z(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `LogImpsAdsTb` (`userId`,`logs`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0045j c0045j) {
            if (c0045j.m139b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0045j.m139b());
            }
            String m149200t = C30247a.f140500a.m149200t(c0045j.m138a());
            if (m149200t == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149200t);
            }
        }
    }

    public C31141b(AbstractC0086w abstractC0086w) {
        this.f143507a = abstractC0086w;
        this.f143508b = new k(abstractC0086w);
        this.f143509c = new u(abstractC0086w);
        this.f143510d = new v(abstractC0086w);
        this.f143511e = new w(abstractC0086w);
        this.f143512f = new x(abstractC0086w);
        this.f143513g = new y(abstractC0086w);
        this.f143514h = new z(abstractC0086w);
        this.f143515i = new a0(abstractC0086w);
        this.f143516j = new b0(abstractC0086w);
        this.f143517k = new a(abstractC0086w);
        this.f143518l = new b(abstractC0086w);
        this.f143519m = new c(abstractC0086w);
        this.f143520n = new d(abstractC0086w);
        this.f143521o = new e(abstractC0086w);
        this.f143522p = new f(abstractC0086w);
        this.f143523q = new g(abstractC0086w);
        this.f143524r = new h(abstractC0086w);
        this.f143525s = new i(abstractC0086w);
        this.f143526t = new j(abstractC0086w);
        this.f143527u = new l(abstractC0086w);
        this.f143528v = new m(abstractC0086w);
        this.f143529w = new n(abstractC0086w);
        this.f143530x = new o(abstractC0086w);
        this.f143531y = new p(abstractC0086w);
        this.f143532z = new q(abstractC0086w);
        this.f143504A = new r(abstractC0086w);
        this.f143505B = new s(abstractC0086w);
        this.f143506C = new t(abstractC0086w);
    }

    /* renamed from: e0 */
    public static List m151380e0() {
        return Collections.emptyList();
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: A */
    public void mo151310A(C0038c c0038c) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151366a(this, c0038c);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: B */
    public void mo151311B(C0048m c0048m) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143518l.m263j(c0048m);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: C */
    public C0046k mo151312C(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogImpsTB WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0046k c0046k = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0046k = new C0046k(string, C30247a.f140500a.m149189i(string2));
            }
            return c0046k;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: D */
    public void mo151313D() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143505B.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143505B.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: E */
    public void mo151314E() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143528v.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143528v.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: F */
    public void mo151315F(C0043h c0043h) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151371f(this, c0043h);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: G */
    public void mo151316G(C0041f c0041f) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143515i.m263j(c0041f);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: H */
    public C0050o mo151317H(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogViewVideoAdsTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0050o c0050o = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0050o = new C0050o(string, C30247a.f140500a.m149194n(string2));
            }
            return c0050o;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: I */
    public void mo151318I(C0051p c0051p) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143508b.m263j(c0051p);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: J */
    public void mo151319J() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143527u.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143527u.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: K */
    public void mo151320K(C0042g c0042g) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143520n.m263j(c0042g);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: L */
    public void mo151321L(C0047l c0047l) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151375j(this, c0047l);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: M */
    public C0041f mo151322M(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogEventTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0041f c0041f = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0041f = new C0041f(string, C30247a.f140500a.m149187g(string2));
            }
            return c0041f;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: N */
    public void mo151323N(C0050o c0050o) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151379n(this, c0050o);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: O */
    public void mo151324O() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143524r.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143524r.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: P */
    public void mo151325P() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143531y.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143531y.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: Q */
    public C0047l mo151326Q(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogSessionTable WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0047l c0047l = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0047l = new C0047l(string, C30247a.f140500a.m149191k(string2));
            }
            return c0047l;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: R */
    public C0040e mo151327R(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogEventStreamTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0040e c0040e = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0040e = new C0040e(string, C30247a.f140500a.m149187g(string2));
            }
            return c0040e;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: S */
    public C0038c mo151328S(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogActiveTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0038c c0038c = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0038c = new C0038c(string, C30247a.f140500a.m149186f(string2));
            }
            return c0038c;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: T */
    public void mo151329T() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143525s.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143525s.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: U */
    public void mo151330U(C0046k c0046k) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143513g.m263j(c0046k);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: V */
    public void mo151331V(C0047l c0047l) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143519m.m263j(c0047l);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: W */
    public void mo151332W(C0049n c0049n) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151377l(this, c0049n);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: X */
    public void mo151333X(C0050o c0050o) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143509c.m263j(c0050o);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: Y */
    public void mo151334Y(C0040e c0040e) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151369d(this, c0040e);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: Z */
    public void mo151335Z() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143526t.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143526t.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: a */
    public void mo151336a() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143506C.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143506C.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: a0 */
    public void mo151337a0() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143504A.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143504A.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: b */
    public void mo151338b() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143532z.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143532z.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: b0 */
    public void mo151339b0(C0046k c0046k) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151373h(this, c0046k);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: c */
    public C0044i mo151340c(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogHistoryVideoTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0044i c0044i = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0044i = new C0044i(string, C30247a.f140500a.m149195o(string2));
            }
            return c0044i;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: c0 */
    public void mo151341c0(C0044i c0044i) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151372g(this, c0044i);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: d */
    public void mo151342d() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143522p.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143522p.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: d0 */
    public void mo151343d0(C0041f c0041f) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151367b(this, c0041f);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: e */
    public void mo151344e(C0044i c0044i) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143510d.m263j(c0044i);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: f */
    public void mo151345f(C0045j c0045j) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143514h.m263j(c0045j);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: g */
    public C0042g mo151346g(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogGetListTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0042g c0042g = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0042g = new C0042g(string, C30247a.f140500a.m149188h(string2));
            }
            return c0042g;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: h */
    public void mo151347h(C0038c c0038c) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143521o.m263j(c0038c);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: i */
    public void mo151348i(C0042g c0042g) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151370e(this, c0042g);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: j */
    public void mo151349j(C0049n c0049n) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143512f.m263j(c0049n);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: k */
    public void mo151350k() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143523q.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143523q.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: l */
    public C0048m mo151351l(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogUploadTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0048m c0048m = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0048m = new C0048m(string, C30247a.f140500a.m149192l(string2));
            }
            return c0048m;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: m */
    public C0049n mo151352m(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogViewStreamTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0049n c0049n = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0049n = new C0049n(string, C30247a.f140500a.m149193m(string2));
            }
            return c0049n;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: n */
    public C0045j mo151353n(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogImpsAdsTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0045j c0045j = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0045j = new C0045j(string, C30247a.f140500a.m149190j(string2));
            }
            return c0045j;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: o */
    public void mo151354o(C0048m c0048m) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151376k(this, c0048m);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: p */
    public void mo151355p(C0045j c0045j) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151374i(this, c0045j);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: q */
    public C0043h mo151356q(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogHistoryLivestreamTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0043h c0043h = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0043h = new C0043h(string, C30247a.f140500a.m149195o(string2));
            }
            return c0043h;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: r */
    public void mo151357r(C0043h c0043h) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143511e.m263j(c0043h);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: s */
    public void mo151358s() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143530x.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143530x.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: t */
    public void mo151359t(C0039d c0039d) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143516j.m263j(c0039d);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: u */
    public void mo151360u(C0040e c0040e) {
        this.f143507a.m341d();
        this.f143507a.m342e();
        try {
            this.f143517k.m263j(c0040e);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: v */
    public C0051p mo151361v(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogViewVideoTB WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0051p c0051p = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0051p = new C0051p(string, C30247a.f140500a.m149194n(string2));
            }
            return c0051p;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: w */
    public void mo151362w(C0039d c0039d) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151368c(this, c0039d);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: x */
    public C0039d mo151363x(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM LogEventAdsTb WHERE userId = ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143507a.m341d();
        C0039d c0039d = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143507a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "logs");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0039d = new C0039d(string, C30247a.f140500a.m149187g(string2));
            }
            return c0039d;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: y */
    public void mo151364y() {
        this.f143507a.m341d();
        InterfaceC18186k m248b = this.f143529w.m248b();
        this.f143507a.m342e();
        try {
            m248b.mo223w();
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
            this.f143529w.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31140a
    /* renamed from: z */
    public void mo151365z(C0051p c0051p) {
        this.f143507a.m342e();
        try {
            InterfaceC31140a.a.m151378m(this, c0051p);
            this.f143507a.m339E();
        } finally {
            this.f143507a.m347j();
        }
    }
}
