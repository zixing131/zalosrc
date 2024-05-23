package com.zing.zalo.uicontrol.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.zing.zalo.uicontrol.svg.C16652a;
import dd0.AbstractC17891d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xml.sax.SAXException;

/* renamed from: com.zing.zalo.uicontrol.svg.c */
/* loaded from: classes4.dex */
public class C16654c {

    /* renamed from: a */
    private f0 f84011a = null;

    /* renamed from: b */
    private String f84012b = "";

    /* renamed from: c */
    private String f84013c = "";

    /* renamed from: d */
    private float f84014d = 96.0f;

    /* renamed from: e */
    private final C16652a.h f84015e = new C16652a.h();

    /* renamed from: f */
    Map f84016f = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f84017a;

        static {
            int[] iArr = new int[d1.values().length];
            f84017a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84017a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84017a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84017a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84017a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f84017a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f84017a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f84017a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f84017a[d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$a0 */
    /* loaded from: classes4.dex */
    public static class a0 extends z {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$a1 */
    /* loaded from: classes4.dex */
    public static class a1 extends y0 {

        /* renamed from: o */
        public List f84018o;

        /* renamed from: p */
        public List f84019p;

        /* renamed from: q */
        public List f84020q;

        /* renamed from: r */
        public List f84021r;

        protected a1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$b */
    /* loaded from: classes4.dex */
    public static class b implements Cloneable {

        /* renamed from: p */
        public float f84022p;

        /* renamed from: q */
        public float f84023q;

        /* renamed from: r */
        public float f84024r;

        /* renamed from: s */
        public float f84025s;

        public b(float f11, float f12, float f13, float f14) {
            this.f84022p = f11;
            this.f84023q = f12;
            this.f84024r = f13;
            this.f84025s = f14;
        }

        /* renamed from: a */
        public static b m88494a(float f11, float f12, float f13, float f14) {
            return new b(f11, f12, f13 - f11, f14 - f12);
        }

        /* renamed from: b */
        public float m88495b() {
            return this.f84022p + this.f84024r;
        }

        /* renamed from: c */
        public float m88496c() {
            return this.f84023q + this.f84025s;
        }

        /* renamed from: e */
        public void m88497e(b bVar) {
            float f11 = bVar.f84022p;
            if (f11 < this.f84022p) {
                this.f84022p = f11;
            }
            float f12 = bVar.f84023q;
            if (f12 < this.f84023q) {
                this.f84023q = f12;
            }
            if (bVar.m88495b() > m88495b()) {
                this.f84024r = bVar.m88495b() - this.f84022p;
            }
            if (bVar.m88496c() > m88496c()) {
                this.f84025s = bVar.m88496c() - this.f84023q;
            }
        }

        public String toString() {
            return "[" + this.f84022p + " " + this.f84023q + " " + this.f84024r + " " + this.f84025s + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$b0 */
    /* loaded from: classes4.dex */
    public static class b0 extends l {

        /* renamed from: o */
        public p f84026o;

        /* renamed from: p */
        public p f84027p;

        /* renamed from: q */
        public p f84028q;

        /* renamed from: r */
        public p f84029r;

        /* renamed from: s */
        public p f84030s;

        /* renamed from: t */
        public p f84031t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$b1 */
    /* loaded from: classes4.dex */
    public interface b1 {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$c */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a */
        public p f84032a;

        /* renamed from: b */
        public p f84033b;

        /* renamed from: c */
        public p f84034c;

        /* renamed from: d */
        public p f84035d;

        public c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f84032a = pVar;
            this.f84033b = pVar2;
            this.f84034c = pVar3;
            this.f84035d = pVar4;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$c0 */
    /* loaded from: classes4.dex */
    public static class c0 extends l0 implements j0 {
        @Override // com.zing.zalo.uicontrol.svg.C16654c.j0
        /* renamed from: b */
        public List mo88498b() {
            return Collections.emptyList();
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.j0
        /* renamed from: j */
        public void mo88499j(n0 n0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$c1 */
    /* loaded from: classes4.dex */
    public static class c1 extends n0 implements x0 {

        /* renamed from: c */
        public String f84036c;

        /* renamed from: d */
        private b1 f84037d;

        public c1(String str) {
            this.f84036c = str;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x0
        /* renamed from: e */
        public b1 mo88500e() {
            return this.f84037d;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.n0
        public String toString() {
            return getClass().getSimpleName() + " '" + this.f84036c + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$d */
    /* loaded from: classes4.dex */
    public static class d extends l {

        /* renamed from: o */
        public p f84038o;

        /* renamed from: p */
        public p f84039p;

        /* renamed from: q */
        public p f84040q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$d0 */
    /* loaded from: classes4.dex */
    public static class d0 extends l0 implements j0 {

        /* renamed from: h */
        public Float f84041h;

        @Override // com.zing.zalo.uicontrol.svg.C16654c.j0
        /* renamed from: b */
        public List mo88498b() {
            return Collections.emptyList();
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.j0
        /* renamed from: j */
        public void mo88499j(n0 n0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$d1 */
    /* loaded from: classes4.dex */
    public enum d1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$e */
    /* loaded from: classes4.dex */
    public static class e extends m implements t {

        /* renamed from: p */
        public Boolean f84052p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$e0 */
    /* loaded from: classes4.dex */
    public static class e0 implements Cloneable {

        /* renamed from: A */
        public p f84053A;

        /* renamed from: B */
        public Float f84054B;

        /* renamed from: C */
        public f f84055C;

        /* renamed from: D */
        public List f84056D;

        /* renamed from: E */
        public p f84057E;

        /* renamed from: F */
        public Integer f84058F;

        /* renamed from: G */
        public b f84059G;

        /* renamed from: H */
        public f f84060H;

        /* renamed from: I */
        public g f84061I;

        /* renamed from: J */
        public e f84062J;

        /* renamed from: K */
        public Boolean f84063K;

        /* renamed from: L */
        public c f84064L;

        /* renamed from: M */
        public String f84065M;

        /* renamed from: N */
        public String f84066N;

        /* renamed from: O */
        public String f84067O;

        /* renamed from: P */
        public Boolean f84068P;

        /* renamed from: Q */
        public Boolean f84069Q;

        /* renamed from: R */
        public o0 f84070R;

        /* renamed from: S */
        public Float f84071S;

        /* renamed from: T */
        public String f84072T;

        /* renamed from: U */
        public a f84073U;

        /* renamed from: V */
        public String f84074V;

        /* renamed from: W */
        public o0 f84075W;

        /* renamed from: X */
        public Float f84076X;

        /* renamed from: Y */
        public o0 f84077Y;

        /* renamed from: Z */
        public Float f84078Z;

        /* renamed from: a0 */
        public h f84079a0;

        /* renamed from: p */
        public long f84080p = 0;

        /* renamed from: q */
        public o0 f84081q;

        /* renamed from: r */
        public a f84082r;

        /* renamed from: s */
        public Float f84083s;

        /* renamed from: t */
        public o0 f84084t;

        /* renamed from: u */
        public Float f84085u;

        /* renamed from: v */
        public p f84086v;

        /* renamed from: w */
        public c f84087w;

        /* renamed from: x */
        public d f84088x;

        /* renamed from: y */
        public Float f84089y;

        /* renamed from: z */
        public p[] f84090z;

        /* renamed from: com.zing.zalo.uicontrol.svg.c$e0$a */
        /* loaded from: classes4.dex */
        public enum a {
            NonZero,
            EvenOdd
        }

        /* renamed from: com.zing.zalo.uicontrol.svg.c$e0$b */
        /* loaded from: classes4.dex */
        public enum b {
            Normal,
            Italic,
            Oblique
        }

        /* renamed from: com.zing.zalo.uicontrol.svg.c$e0$c */
        /* loaded from: classes4.dex */
        public enum c {
            Butt,
            Round,
            Square
        }

        /* renamed from: com.zing.zalo.uicontrol.svg.c$e0$d */
        /* loaded from: classes4.dex */
        public enum d {
            Miter,
            Round,
            Bevel
        }

        /* renamed from: com.zing.zalo.uicontrol.svg.c$e0$e */
        /* loaded from: classes4.dex */
        public enum e {
            Start,
            Middle,
            End
        }

        /* renamed from: com.zing.zalo.uicontrol.svg.c$e0$f */
        /* loaded from: classes4.dex */
        public enum f {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* renamed from: com.zing.zalo.uicontrol.svg.c$e0$g */
        /* loaded from: classes4.dex */
        public enum g {
            LTR,
            RTL
        }

        /* renamed from: com.zing.zalo.uicontrol.svg.c$e0$h */
        /* loaded from: classes4.dex */
        public enum h {
            None,
            NonScalingStroke
        }

        /* renamed from: a */
        public static e0 m88502a() {
            e0 e0Var = new e0();
            e0Var.f84080p = -1L;
            f fVar = f.f84127q;
            e0Var.f84081q = fVar;
            a aVar = a.NonZero;
            e0Var.f84082r = aVar;
            Float valueOf = Float.valueOf(1.0f);
            e0Var.f84083s = valueOf;
            e0Var.f84084t = null;
            e0Var.f84085u = valueOf;
            e0Var.f84086v = new p(1.0f);
            e0Var.f84087w = c.Butt;
            e0Var.f84088x = d.Miter;
            e0Var.f84089y = Float.valueOf(4.0f);
            e0Var.f84090z = null;
            e0Var.f84053A = new p(0.0f);
            e0Var.f84054B = valueOf;
            e0Var.f84055C = fVar;
            e0Var.f84056D = null;
            e0Var.f84057E = new p(12.0f, d1.pt);
            e0Var.f84058F = 400;
            e0Var.f84059G = b.Normal;
            e0Var.f84060H = f.None;
            e0Var.f84061I = g.LTR;
            e0Var.f84062J = e.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f84063K = bool;
            e0Var.f84064L = null;
            e0Var.f84065M = null;
            e0Var.f84066N = null;
            e0Var.f84067O = null;
            e0Var.f84068P = bool;
            e0Var.f84069Q = bool;
            e0Var.f84070R = fVar;
            e0Var.f84071S = valueOf;
            e0Var.f84072T = null;
            e0Var.f84073U = aVar;
            e0Var.f84074V = null;
            e0Var.f84075W = null;
            e0Var.f84076X = valueOf;
            e0Var.f84077Y = null;
            e0Var.f84078Z = valueOf;
            e0Var.f84079a0 = h.None;
            return e0Var;
        }

        /* renamed from: b */
        public void m88503b(boolean z11) {
            Boolean bool = Boolean.TRUE;
            this.f84068P = bool;
            if (!z11) {
                bool = Boolean.FALSE;
            }
            this.f84063K = bool;
            this.f84064L = null;
            this.f84072T = null;
            this.f84054B = Float.valueOf(1.0f);
            this.f84070R = f.f84127q;
            this.f84071S = Float.valueOf(1.0f);
            this.f84074V = null;
            this.f84075W = null;
            this.f84076X = Float.valueOf(1.0f);
            this.f84077Y = null;
            this.f84078Z = Float.valueOf(1.0f);
            this.f84079a0 = h.None;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Object clone() {
            try {
                e0 e0Var = (e0) super.clone();
                p[] pVarArr = this.f84090z;
                if (pVarArr != null) {
                    e0Var.f84090z = (p[]) pVarArr.clone();
                }
                return e0Var;
            } catch (CloneNotSupportedException e11) {
                throw new InternalError(e11.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$e1 */
    /* loaded from: classes4.dex */
    public static class e1 extends m {

        /* renamed from: p */
        public String f84122p;

        /* renamed from: q */
        public p f84123q;

        /* renamed from: r */
        public p f84124r;

        /* renamed from: s */
        public p f84125s;

        /* renamed from: t */
        public p f84126t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$f */
    /* loaded from: classes4.dex */
    public static class f extends o0 {

        /* renamed from: q */
        public static final f f84127q = new f(0);

        /* renamed from: p */
        public int f84128p;

        public f(int i11) {
            this.f84128p = i11;
        }

        public String toString() {
            return String.format("#%06x", Integer.valueOf(this.f84128p));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$f0 */
    /* loaded from: classes4.dex */
    public static class f0 extends r0 {

        /* renamed from: q */
        public p f84129q;

        /* renamed from: r */
        public p f84130r;

        /* renamed from: s */
        public p f84131s;

        /* renamed from: t */
        public p f84132t;

        /* renamed from: u */
        public String f84133u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$f1 */
    /* loaded from: classes4.dex */
    public static class f1 extends r0 implements t {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$g */
    /* loaded from: classes4.dex */
    public static class g extends o0 {

        /* renamed from: p */
        private static final g f84134p = new g();

        private g() {
        }

        /* renamed from: a */
        public static g m88512a() {
            return f84134p;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$g0 */
    /* loaded from: classes4.dex */
    public interface g0 {
        /* renamed from: a */
        Set mo88513a();

        /* renamed from: c */
        String mo88514c();

        /* renamed from: d */
        void mo88515d(Set set);

        /* renamed from: f */
        void mo88516f(Set set);

        /* renamed from: g */
        Set mo88517g();

        /* renamed from: h */
        void mo88518h(Set set);

        /* renamed from: i */
        void mo88519i(Set set);

        /* renamed from: k */
        void mo88520k(String str);

        /* renamed from: m */
        Set mo88521m();

        /* renamed from: n */
        Set mo88522n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$h */
    /* loaded from: classes4.dex */
    public static class h extends m implements t {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$h0 */
    /* loaded from: classes4.dex */
    public static class h0 extends k0 implements j0, g0 {

        /* renamed from: i */
        public List f84135i = new ArrayList();

        /* renamed from: j */
        public Set f84136j = null;

        /* renamed from: k */
        public String f84137k = null;

        /* renamed from: l */
        public Set f84138l = null;

        /* renamed from: m */
        public Set f84139m = null;

        /* renamed from: n */
        public Set f84140n = null;

        protected h0() {
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: a */
        public Set mo88513a() {
            return null;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.j0
        /* renamed from: b */
        public List mo88498b() {
            return this.f84135i;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: c */
        public String mo88514c() {
            return this.f84137k;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: d */
        public void mo88515d(Set set) {
            this.f84140n = set;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: f */
        public void mo88516f(Set set) {
            this.f84136j = set;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: g */
        public Set mo88517g() {
            return this.f84136j;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: h */
        public void mo88518h(Set set) {
            this.f84138l = set;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: i */
        public void mo88519i(Set set) {
            this.f84139m = set;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.j0
        /* renamed from: j */
        public void mo88499j(n0 n0Var) {
            this.f84135i.add(n0Var);
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: k */
        public void mo88520k(String str) {
            this.f84137k = str;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: m */
        public Set mo88521m() {
            return this.f84139m;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: n */
        public Set mo88522n() {
            return this.f84140n;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$i */
    /* loaded from: classes4.dex */
    public static class i extends l {

        /* renamed from: o */
        public p f84141o;

        /* renamed from: p */
        public p f84142p;

        /* renamed from: q */
        public p f84143q;

        /* renamed from: r */
        public p f84144r;
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.c$i0 */
    /* loaded from: classes4.dex */
    protected static class i0 extends k0 implements g0 {

        /* renamed from: i */
        public Set f84145i = null;

        /* renamed from: j */
        public String f84146j = null;

        /* renamed from: k */
        public Set f84147k = null;

        /* renamed from: l */
        public Set f84148l = null;

        /* renamed from: m */
        public Set f84149m = null;

        protected i0() {
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: a */
        public Set mo88513a() {
            return this.f84147k;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: c */
        public String mo88514c() {
            return this.f84146j;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: d */
        public void mo88515d(Set set) {
            this.f84149m = set;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: f */
        public void mo88516f(Set set) {
            this.f84145i = set;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: g */
        public Set mo88517g() {
            return this.f84145i;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: h */
        public void mo88518h(Set set) {
            this.f84147k = set;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: i */
        public void mo88519i(Set set) {
            this.f84148l = set;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: k */
        public void mo88520k(String str) {
            this.f84146j = str;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: m */
        public Set mo88521m() {
            return this.f84148l;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.g0
        /* renamed from: n */
        public Set mo88522n() {
            return this.f84149m;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$j */
    /* loaded from: classes4.dex */
    public static class j extends l0 implements j0 {

        /* renamed from: h */
        public List f84150h = new ArrayList();

        /* renamed from: i */
        public Boolean f84151i;

        /* renamed from: j */
        public Matrix f84152j;

        /* renamed from: k */
        public k f84153k;

        /* renamed from: l */
        public String f84154l;

        protected j() {
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.j0
        /* renamed from: b */
        public List mo88498b() {
            return this.f84150h;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.j0
        /* renamed from: j */
        public void mo88499j(n0 n0Var) {
            if (n0Var instanceof d0) {
                this.f84150h.add(n0Var);
                return;
            }
            throw new SAXException("Gradient elements cannot contain " + n0Var + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$j0 */
    /* loaded from: classes4.dex */
    public interface j0 {
        /* renamed from: b */
        List mo88498b();

        /* renamed from: j */
        void mo88499j(n0 n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$k */
    /* loaded from: classes4.dex */
    public enum k {
        pad,
        reflect,
        repeat
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$k0 */
    /* loaded from: classes4.dex */
    public static class k0 extends l0 {

        /* renamed from: h */
        public b f84159h = null;

        protected k0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$l */
    /* loaded from: classes4.dex */
    public static abstract class l extends i0 implements n {

        /* renamed from: n */
        public Matrix f84160n;

        protected l() {
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.n
        /* renamed from: l */
        public void mo88524l(Matrix matrix) {
            this.f84160n = matrix;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$l0 */
    /* loaded from: classes4.dex */
    public static class l0 extends n0 {

        /* renamed from: c */
        public String f84161c = null;

        /* renamed from: d */
        public Boolean f84162d = null;

        /* renamed from: e */
        public e0 f84163e = null;

        /* renamed from: f */
        public e0 f84164f = null;

        /* renamed from: g */
        public List f84165g = null;

        protected l0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$m */
    /* loaded from: classes4.dex */
    public static class m extends h0 implements n {

        /* renamed from: o */
        public Matrix f84166o;

        @Override // com.zing.zalo.uicontrol.svg.C16654c.n
        /* renamed from: l */
        public void mo88524l(Matrix matrix) {
            this.f84166o = matrix;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$m0 */
    /* loaded from: classes4.dex */
    public static class m0 extends j {

        /* renamed from: m */
        public p f84167m;

        /* renamed from: n */
        public p f84168n;

        /* renamed from: o */
        public p f84169o;

        /* renamed from: p */
        public p f84170p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$n */
    /* loaded from: classes4.dex */
    public interface n {
        /* renamed from: l */
        void mo88524l(Matrix matrix);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$n0 */
    /* loaded from: classes4.dex */
    public static class n0 {

        /* renamed from: a */
        public C16654c f84171a;

        /* renamed from: b */
        public j0 f84172b;

        protected n0() {
        }

        public String toString() {
            return getClass().getSimpleName();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$o */
    /* loaded from: classes4.dex */
    public static class o extends p0 implements n {

        /* renamed from: p */
        public String f84173p;

        /* renamed from: q */
        public p f84174q;

        /* renamed from: r */
        public p f84175r;

        /* renamed from: s */
        public p f84176s;

        /* renamed from: t */
        public p f84177t;

        /* renamed from: u */
        public Matrix f84178u;

        @Override // com.zing.zalo.uicontrol.svg.C16654c.n
        /* renamed from: l */
        public void mo88524l(Matrix matrix) {
            this.f84178u = matrix;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$o0 */
    /* loaded from: classes4.dex */
    public static abstract class o0 implements Cloneable {
        protected o0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$p0 */
    /* loaded from: classes4.dex */
    public static class p0 extends h0 {

        /* renamed from: o */
        public C16653b f84181o = null;

        protected p0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$q */
    /* loaded from: classes4.dex */
    public static class q extends l {

        /* renamed from: o */
        public p f84182o;

        /* renamed from: p */
        public p f84183p;

        /* renamed from: q */
        public p f84184q;

        /* renamed from: r */
        public p f84185r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$q0 */
    /* loaded from: classes4.dex */
    public static class q0 extends j {

        /* renamed from: m */
        public p f84186m;

        /* renamed from: n */
        public p f84187n;

        /* renamed from: o */
        public p f84188o;

        /* renamed from: p */
        public p f84189p;

        /* renamed from: q */
        public p f84190q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$r */
    /* loaded from: classes4.dex */
    public static class r extends r0 implements t {

        /* renamed from: q */
        public boolean f84191q;

        /* renamed from: r */
        public p f84192r;

        /* renamed from: s */
        public p f84193s;

        /* renamed from: t */
        public p f84194t;

        /* renamed from: u */
        public p f84195u;

        /* renamed from: v */
        public Float f84196v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$r0 */
    /* loaded from: classes4.dex */
    public static class r0 extends p0 {

        /* renamed from: p */
        public b f84197p;

        protected r0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$s */
    /* loaded from: classes4.dex */
    public static class s extends h0 implements t {

        /* renamed from: o */
        public Boolean f84198o;

        /* renamed from: p */
        public Boolean f84199p;

        /* renamed from: q */
        public p f84200q;

        /* renamed from: r */
        public p f84201r;

        /* renamed from: s */
        public p f84202s;

        /* renamed from: t */
        public p f84203t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$s0 */
    /* loaded from: classes4.dex */
    public static class s0 extends m {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$t */
    /* loaded from: classes4.dex */
    public interface t {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$t0 */
    /* loaded from: classes4.dex */
    public static class t0 extends r0 implements t {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$u */
    /* loaded from: classes4.dex */
    public static class u extends o0 {

        /* renamed from: p */
        public String f84204p;

        /* renamed from: q */
        public o0 f84205q;

        public u(String str, o0 o0Var) {
            this.f84204p = str;
            this.f84205q = o0Var;
        }

        public String toString() {
            return this.f84204p + " " + this.f84205q;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$u0 */
    /* loaded from: classes4.dex */
    public static class u0 extends y0 implements x0 {

        /* renamed from: o */
        public String f84206o;

        /* renamed from: p */
        private b1 f84207p;

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x0
        /* renamed from: e */
        public b1 mo88500e() {
            return this.f84207p;
        }

        /* renamed from: o */
        public void m88533o(b1 b1Var) {
            this.f84207p = b1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$v */
    /* loaded from: classes4.dex */
    public static class v extends l {

        /* renamed from: o */
        public w f84208o;

        /* renamed from: p */
        public Float f84209p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$v0 */
    /* loaded from: classes4.dex */
    public static class v0 extends a1 implements x0 {

        /* renamed from: s */
        private b1 f84210s;

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x0
        /* renamed from: e */
        public b1 mo88500e() {
            return this.f84210s;
        }

        /* renamed from: o */
        public void m88534o(b1 b1Var) {
            this.f84210s = b1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$w */
    /* loaded from: classes4.dex */
    public static class w implements x {

        /* renamed from: b */
        private int f84212b = 0;

        /* renamed from: d */
        private int f84214d = 0;

        /* renamed from: a */
        private byte[] f84211a = new byte[8];

        /* renamed from: c */
        private float[] f84213c = new float[16];

        /* renamed from: f */
        private void m88535f(byte b11) {
            int i11 = this.f84212b;
            byte[] bArr = this.f84211a;
            if (i11 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f84211a = bArr2;
            }
            byte[] bArr3 = this.f84211a;
            int i12 = this.f84212b;
            this.f84212b = i12 + 1;
            bArr3[i12] = b11;
        }

        /* renamed from: g */
        private void m88536g(int i11) {
            float[] fArr = this.f84213c;
            if (fArr.length < this.f84214d + i11) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f84213c = fArr2;
            }
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: a */
        public void mo88537a(float f11, float f12, float f13, float f14) {
            m88535f((byte) 3);
            m88536g(4);
            float[] fArr = this.f84213c;
            int i11 = this.f84214d;
            fArr[i11] = f11;
            fArr[i11 + 1] = f12;
            fArr[i11 + 2] = f13;
            this.f84214d = i11 + 4;
            fArr[i11 + 3] = f14;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: b */
        public void mo88538b(float f11, float f12) {
            m88535f((byte) 0);
            m88536g(2);
            float[] fArr = this.f84213c;
            int i11 = this.f84214d;
            fArr[i11] = f11;
            this.f84214d = i11 + 2;
            fArr[i11 + 1] = f12;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: c */
        public void mo88539c(float f11, float f12, float f13, float f14, float f15, float f16) {
            m88535f((byte) 2);
            m88536g(6);
            float[] fArr = this.f84213c;
            int i11 = this.f84214d;
            fArr[i11] = f11;
            fArr[i11 + 1] = f12;
            fArr[i11 + 2] = f13;
            fArr[i11 + 3] = f14;
            fArr[i11 + 4] = f15;
            this.f84214d = i11 + 6;
            fArr[i11 + 5] = f16;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        public void close() {
            m88535f((byte) 8);
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: d */
        public void mo88540d(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            int i11;
            if (z11) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            m88535f((byte) (i11 | 4 | (z12 ? 1 : 0)));
            m88536g(5);
            float[] fArr = this.f84213c;
            int i12 = this.f84214d;
            fArr[i12] = f11;
            fArr[i12 + 1] = f12;
            fArr[i12 + 2] = f13;
            fArr[i12 + 3] = f14;
            this.f84214d = i12 + 5;
            fArr[i12 + 4] = f15;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: e */
        public void mo88541e(float f11, float f12) {
            m88535f((byte) 1);
            m88536g(2);
            float[] fArr = this.f84213c;
            int i11 = this.f84214d;
            fArr[i11] = f11;
            this.f84214d = i11 + 2;
            fArr[i11 + 1] = f12;
        }

        /* renamed from: h */
        public void m88542h(x xVar) {
            boolean z11;
            boolean z12;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f84212b; i12++) {
                byte b11 = this.f84211a[i12];
                if (b11 != 0) {
                    if (b11 != 1) {
                        if (b11 != 2) {
                            if (b11 != 3) {
                                if (b11 != 8) {
                                    if ((b11 & 2) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if ((b11 & 1) != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    float[] fArr = this.f84213c;
                                    float f11 = fArr[i11];
                                    float f12 = fArr[i11 + 1];
                                    float f13 = fArr[i11 + 2];
                                    int i13 = i11 + 4;
                                    float f14 = fArr[i11 + 3];
                                    i11 += 5;
                                    xVar.mo88540d(f11, f12, f13, z11, z12, f14, fArr[i13]);
                                } else {
                                    xVar.close();
                                }
                            } else {
                                float[] fArr2 = this.f84213c;
                                float f15 = fArr2[i11];
                                float f16 = fArr2[i11 + 1];
                                int i14 = i11 + 3;
                                float f17 = fArr2[i11 + 2];
                                i11 += 4;
                                xVar.mo88537a(f15, f16, f17, fArr2[i14]);
                            }
                        } else {
                            float[] fArr3 = this.f84213c;
                            float f18 = fArr3[i11];
                            float f19 = fArr3[i11 + 1];
                            float f21 = fArr3[i11 + 2];
                            float f22 = fArr3[i11 + 3];
                            int i15 = i11 + 5;
                            float f23 = fArr3[i11 + 4];
                            i11 += 6;
                            xVar.mo88539c(f18, f19, f21, f22, f23, fArr3[i15]);
                        }
                    } else {
                        float[] fArr4 = this.f84213c;
                        int i16 = i11 + 1;
                        float f24 = fArr4[i11];
                        i11 += 2;
                        xVar.mo88541e(f24, fArr4[i16]);
                    }
                } else {
                    float[] fArr5 = this.f84213c;
                    int i17 = i11 + 1;
                    float f25 = fArr5[i11];
                    i11 += 2;
                    xVar.mo88538b(f25, fArr5[i17]);
                }
            }
        }

        /* renamed from: i */
        public boolean m88543i() {
            return this.f84212b == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$w0 */
    /* loaded from: classes4.dex */
    public static class w0 extends a1 implements b1, n {

        /* renamed from: s */
        public Matrix f84215s;

        @Override // com.zing.zalo.uicontrol.svg.C16654c.n
        /* renamed from: l */
        public void mo88524l(Matrix matrix) {
            this.f84215s = matrix;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$x */
    /* loaded from: classes4.dex */
    public interface x {
        /* renamed from: a */
        void mo88537a(float f11, float f12, float f13, float f14);

        /* renamed from: b */
        void mo88538b(float f11, float f12);

        /* renamed from: c */
        void mo88539c(float f11, float f12, float f13, float f14, float f15, float f16);

        void close();

        /* renamed from: d */
        void mo88540d(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15);

        /* renamed from: e */
        void mo88541e(float f11, float f12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$x0 */
    /* loaded from: classes4.dex */
    public interface x0 {
        /* renamed from: e */
        b1 mo88500e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$y */
    /* loaded from: classes4.dex */
    public static class y extends r0 implements t {

        /* renamed from: q */
        public Boolean f84216q;

        /* renamed from: r */
        public Boolean f84217r;

        /* renamed from: s */
        public Matrix f84218s;

        /* renamed from: t */
        public p f84219t;

        /* renamed from: u */
        public p f84220u;

        /* renamed from: v */
        public p f84221v;

        /* renamed from: w */
        public p f84222w;

        /* renamed from: x */
        public String f84223x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$y0 */
    /* loaded from: classes4.dex */
    public static class y0 extends h0 {
        protected y0() {
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.h0, com.zing.zalo.uicontrol.svg.C16654c.j0
        /* renamed from: j */
        public void mo88499j(n0 n0Var) {
            if (n0Var instanceof x0) {
                this.f84135i.add(n0Var);
                return;
            }
            throw new SAXException("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$z */
    /* loaded from: classes4.dex */
    public static class z extends l {

        /* renamed from: o */
        public float[] f84224o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$z0 */
    /* loaded from: classes4.dex */
    public static class z0 extends y0 implements x0 {

        /* renamed from: o */
        public String f84225o;

        /* renamed from: p */
        public p f84226p;

        /* renamed from: q */
        private b1 f84227q;

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x0
        /* renamed from: e */
        public b1 mo88500e() {
            return this.f84227q;
        }

        /* renamed from: o */
        public void m88544o(b1 b1Var) {
            this.f84227q = b1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private l0 m88480c(j0 j0Var, String str) {
        l0 m88480c;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f84161c)) {
            return l0Var;
        }
        for (Object obj : j0Var.mo88498b()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f84161c)) {
                    return l0Var2;
                }
                if ((obj instanceof j0) && (m88480c = m88480c((j0) obj, str)) != null) {
                    return m88480c;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C16654c m88481f(AssetManager assetManager, String str) {
        C16656e c16656e = new C16656e();
        InputStream open = assetManager.open(str);
        try {
            return c16656e.m88741n(open);
        } finally {
            try {
                open.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m88482a(C16652a.h hVar) {
        this.f84015e.m88464b(hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public List m88483b() {
        return this.f84015e.m88465c();
    }

    /* renamed from: d */
    protected n0 m88484d(String str) {
        if (str != null && str.length() != 0) {
            if (str.equals(this.f84011a.f84161c)) {
                return this.f84011a;
            }
            if (this.f84016f.containsKey(str)) {
                return (n0) this.f84016f.get(str);
            }
            l0 m88480c = m88480c(this.f84011a, str);
            this.f84016f.put(str, m88480c);
            return m88480c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public AbstractC17891d m88485e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public f0 m88486g() {
        return this.f84011a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public boolean m88487h() {
        return !this.f84015e.m88466d();
    }

    /* renamed from: i */
    public void m88488i(Canvas canvas) {
        m88489j(canvas, null);
    }

    /* renamed from: j */
    public void m88489j(Canvas canvas, RectF rectF) {
        b bVar;
        if (rectF != null) {
            bVar = b.m88494a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        } else {
            bVar = new b(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new C16655d(canvas, bVar, this.f84014d).m88641z0(this, null, null, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public n0 m88490k(String str) {
        if (str == null || str.length() <= 1 || !str.startsWith("#")) {
            return null;
        }
        return m88484d(str.substring(1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void m88491l(String str) {
        this.f84013c = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void m88492m(f0 f0Var) {
        this.f84011a = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m88493n(String str) {
        this.f84012b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.uicontrol.svg.c$p */
    /* loaded from: classes4.dex */
    public static class p implements Cloneable {

        /* renamed from: p */
        float f84179p;

        /* renamed from: q */
        d1 f84180q;

        public p(float f11, d1 d1Var) {
            this.f84179p = 0.0f;
            d1 d1Var2 = d1.px;
            this.f84179p = f11;
            this.f84180q = d1Var;
        }

        /* renamed from: a */
        public float m88525a() {
            return this.f84179p;
        }

        /* renamed from: b */
        public float m88526b(float f11) {
            int i11 = a.f84017a[this.f84180q.ordinal()];
            if (i11 != 1) {
                switch (i11) {
                    case 4:
                        return this.f84179p * f11;
                    case 5:
                        return (this.f84179p * f11) / 2.54f;
                    case 6:
                        return (this.f84179p * f11) / 25.4f;
                    case 7:
                        return (this.f84179p * f11) / 72.0f;
                    case 8:
                        return (this.f84179p * f11) / 6.0f;
                    default:
                        return this.f84179p;
                }
            }
            return this.f84179p;
        }

        /* renamed from: c */
        public float m88527c(C16655d c16655d) {
            if (this.f84180q == d1.percent) {
                b m88580P = c16655d.m88580P();
                if (m88580P == null) {
                    return this.f84179p;
                }
                float f11 = m88580P.f84024r;
                if (f11 == m88580P.f84025s) {
                    return (this.f84179p * f11) / 100.0f;
                }
                return (this.f84179p * ((float) (Math.sqrt((f11 * f11) + (r7 * r7)) / 1.414213562373095d))) / 100.0f;
            }
            return m88529f(c16655d);
        }

        /* renamed from: e */
        public float m88528e(C16655d c16655d, float f11) {
            if (this.f84180q == d1.percent) {
                return (this.f84179p * f11) / 100.0f;
            }
            return m88529f(c16655d);
        }

        /* renamed from: f */
        public float m88529f(C16655d c16655d) {
            switch (a.f84017a[this.f84180q.ordinal()]) {
                case 1:
                    return this.f84179p;
                case 2:
                    return this.f84179p * c16655d.m88576N();
                case 3:
                    return this.f84179p * c16655d.m88578O();
                case 4:
                    return this.f84179p * c16655d.m88582Q();
                case 5:
                    return (this.f84179p * c16655d.m88582Q()) / 2.54f;
                case 6:
                    return (this.f84179p * c16655d.m88582Q()) / 25.4f;
                case 7:
                    return (this.f84179p * c16655d.m88582Q()) / 72.0f;
                case 8:
                    return (this.f84179p * c16655d.m88582Q()) / 6.0f;
                case 9:
                    b m88580P = c16655d.m88580P();
                    if (m88580P == null) {
                        return this.f84179p;
                    }
                    return (this.f84179p * m88580P.f84024r) / 100.0f;
                default:
                    return this.f84179p;
            }
        }

        /* renamed from: g */
        public float m88530g(C16655d c16655d) {
            if (this.f84180q == d1.percent) {
                b m88580P = c16655d.m88580P();
                if (m88580P == null) {
                    return this.f84179p;
                }
                return (this.f84179p * m88580P.f84025s) / 100.0f;
            }
            return m88529f(c16655d);
        }

        /* renamed from: h */
        public boolean m88531h() {
            return this.f84179p < 0.0f;
        }

        /* renamed from: i */
        public boolean m88532i() {
            return this.f84179p == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f84179p) + this.f84180q;
        }

        public p(float f11) {
            this.f84179p = 0.0f;
            d1 d1Var = d1.px;
            this.f84179p = f11;
            this.f84180q = d1Var;
        }
    }
}
