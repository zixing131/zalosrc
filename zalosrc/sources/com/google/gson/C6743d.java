package com.google.gson;

import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p674y9.AbstractC30855l;
import p674y9.C30846c;
import p674y9.C30847d;
import p709z9.AbstractC31725l;
import p709z9.C31714a;
import p709z9.C31715b;
import p709z9.C31716c;
import p709z9.C31717d;
import p709z9.C31719f;
import p709z9.C31720g;
import p709z9.C31721h;
import p709z9.C31722i;
import p709z9.C31723j;

/* renamed from: com.google.gson.d */
/* loaded from: classes3.dex */
public final class C6743d {

    /* renamed from: v */
    private static final TypeToken f37102v = TypeToken.get(Object.class);

    /* renamed from: a */
    private final ThreadLocal f37103a;

    /* renamed from: b */
    private final Map f37104b;

    /* renamed from: c */
    private final C30846c f37105c;

    /* renamed from: d */
    private final C31717d f37106d;

    /* renamed from: e */
    final List f37107e;

    /* renamed from: f */
    final C30847d f37108f;

    /* renamed from: g */
    final InterfaceC6742c f37109g;

    /* renamed from: h */
    final Map f37110h;

    /* renamed from: i */
    final boolean f37111i;

    /* renamed from: j */
    final boolean f37112j;

    /* renamed from: k */
    final boolean f37113k;

    /* renamed from: l */
    final boolean f37114l;

    /* renamed from: m */
    final boolean f37115m;

    /* renamed from: n */
    final boolean f37116n;

    /* renamed from: o */
    final boolean f37117o;

    /* renamed from: p */
    final String f37118p;

    /* renamed from: q */
    final int f37119q;

    /* renamed from: r */
    final int f37120r;

    /* renamed from: s */
    final EnumC6749j f37121s;

    /* renamed from: t */
    final List f37122t;

    /* renamed from: u */
    final List f37123u;

    /* renamed from: com.google.gson.d$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC6750k {
        a() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e */
        public Double mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return Double.valueOf(c3380a.m17014y());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f */
        public void mo34535d(C3382c c3382c, Number number) {
            if (number == null) {
                c3382c.mo17043v();
            } else {
                C6743d.m34519d(number.doubleValue());
                c3382c.mo17032P(number);
            }
        }
    }

    /* renamed from: com.google.gson.d$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC6750k {
        b() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e */
        public Float mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return Float.valueOf((float) c3380a.m17014y());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f */
        public void mo34535d(C3382c c3382c, Number number) {
            if (number == null) {
                c3382c.mo17043v();
            } else {
                C6743d.m34519d(number.floatValue());
                c3382c.mo17032P(number);
            }
        }
    }

    /* renamed from: com.google.gson.d$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC6750k {
        c() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e */
        public Number mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return Long.valueOf(c3380a.m16997E());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f */
        public void mo34535d(C3382c c3382c, Number number) {
            if (number == null) {
                c3382c.mo17043v();
            } else {
                c3382c.mo17033Q(number.toString());
            }
        }
    }

    /* renamed from: com.google.gson.d$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC6750k {

        /* renamed from: a */
        final /* synthetic */ AbstractC6750k f37126a;

        d(AbstractC6750k abstractC6750k) {
            this.f37126a = abstractC6750k;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e */
        public AtomicLong mo34534b(C3380a c3380a) {
            return new AtomicLong(((Number) this.f37126a.mo34534b(c3380a)).longValue());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f */
        public void mo34535d(C3382c c3382c, AtomicLong atomicLong) {
            this.f37126a.mo34535d(c3382c, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.google.gson.d$e */
    /* loaded from: classes3.dex */
    public class e extends AbstractC6750k {

        /* renamed from: a */
        final /* synthetic */ AbstractC6750k f37127a;

        e(AbstractC6750k abstractC6750k) {
            this.f37127a = abstractC6750k;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e */
        public AtomicLongArray mo34534b(C3380a c3380a) {
            ArrayList arrayList = new ArrayList();
            c3380a.m17003a();
            while (c3380a.m17010q()) {
                arrayList.add(Long.valueOf(((Number) this.f37127a.mo34534b(c3380a)).longValue()));
            }
            c3380a.m17007h();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                atomicLongArray.set(i11, ((Long) arrayList.get(i11)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f */
        public void mo34535d(C3382c c3382c, AtomicLongArray atomicLongArray) {
            c3382c.mo17035c();
            int length = atomicLongArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f37127a.mo34535d(c3382c, Long.valueOf(atomicLongArray.get(i11)));
            }
            c3382c.mo17037h();
        }
    }

    /* renamed from: com.google.gson.d$f */
    /* loaded from: classes3.dex */
    public static class f extends AbstractC6750k {

        /* renamed from: a */
        private AbstractC6750k f37128a;

        f() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: b */
        public Object mo34534b(C3380a c3380a) {
            AbstractC6750k abstractC6750k = this.f37128a;
            if (abstractC6750k != null) {
                return abstractC6750k.mo34534b(c3380a);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: d */
        public void mo34535d(C3382c c3382c, Object obj) {
            AbstractC6750k abstractC6750k = this.f37128a;
            if (abstractC6750k != null) {
                abstractC6750k.mo34535d(c3382c, obj);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public void m34546e(AbstractC6750k abstractC6750k) {
            if (this.f37128a == null) {
                this.f37128a = abstractC6750k;
                return;
            }
            throw new AssertionError();
        }
    }

    public C6743d() {
        this(C30847d.f142338v, EnumC6741b.f37095p, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC6749j.f37133p, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private static void m34516a(Object obj, C3380a c3380a) {
        if (obj != null) {
            try {
                if (c3380a.m17001N() != EnumC3381b.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e11) {
                throw new JsonSyntaxException(e11);
            } catch (IOException e12) {
                throw new JsonIOException(e12);
            }
        }
    }

    /* renamed from: b */
    private static AbstractC6750k m34517b(AbstractC6750k abstractC6750k) {
        return new d(abstractC6750k).m34564a();
    }

    /* renamed from: c */
    private static AbstractC6750k m34518c(AbstractC6750k abstractC6750k) {
        return new e(abstractC6750k).m34564a();
    }

    /* renamed from: d */
    static void m34519d(double d11) {
        if (!Double.isNaN(d11) && !Double.isInfinite(d11)) {
            return;
        }
        throw new IllegalArgumentException(d11 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    /* renamed from: e */
    private AbstractC6750k m34520e(boolean z11) {
        if (z11) {
            return AbstractC31725l.f145767v;
        }
        return new a();
    }

    /* renamed from: f */
    private AbstractC6750k m34521f(boolean z11) {
        if (z11) {
            return AbstractC31725l.f145766u;
        }
        return new b();
    }

    /* renamed from: m */
    private static AbstractC6750k m34522m(EnumC6749j enumC6749j) {
        if (enumC6749j == EnumC6749j.f37133p) {
            return AbstractC31725l.f145765t;
        }
        return new c();
    }

    /* renamed from: g */
    public Object m34523g(C3380a c3380a, Type type) {
        boolean m17011r = c3380a.m17011r();
        boolean z11 = true;
        c3380a.m17002T(true);
        try {
            try {
                try {
                    c3380a.m17001N();
                    z11 = false;
                    return m34526j(TypeToken.get(type)).mo34534b(c3380a);
                } catch (IOException e11) {
                    throw new JsonSyntaxException(e11);
                } catch (AssertionError e12) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e12.getMessage());
                    assertionError.initCause(e12);
                    throw assertionError;
                }
            } catch (EOFException e13) {
                if (z11) {
                    c3380a.m17002T(m17011r);
                    return null;
                }
                throw new JsonSyntaxException(e13);
            } catch (IllegalStateException e14) {
                throw new JsonSyntaxException(e14);
            }
        } finally {
            c3380a.m17002T(m17011r);
        }
    }

    /* renamed from: h */
    public Object m34524h(Reader reader, Type type) {
        C3380a m34529n = m34529n(reader);
        Object m34523g = m34523g(m34529n, type);
        m34516a(m34523g, m34529n);
        return m34523g;
    }

    /* renamed from: i */
    public Object m34525i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return m34524h(new StringReader(str), type);
    }

    /* renamed from: j */
    public AbstractC6750k m34526j(TypeToken typeToken) {
        TypeToken typeToken2;
        boolean z11;
        Map map = this.f37104b;
        if (typeToken == null) {
            typeToken2 = f37102v;
        } else {
            typeToken2 = typeToken;
        }
        AbstractC6750k abstractC6750k = (AbstractC6750k) map.get(typeToken2);
        if (abstractC6750k != null) {
            return abstractC6750k;
        }
        Map map2 = (Map) this.f37103a.get();
        if (map2 == null) {
            map2 = new HashMap();
            this.f37103a.set(map2);
            z11 = true;
        } else {
            z11 = false;
        }
        f fVar = (f) map2.get(typeToken);
        if (fVar != null) {
            return fVar;
        }
        try {
            f fVar2 = new f();
            map2.put(typeToken, fVar2);
            Iterator it = this.f37107e.iterator();
            while (it.hasNext()) {
                AbstractC6750k mo34566a = ((InterfaceC6751l) it.next()).mo34566a(this, typeToken);
                if (mo34566a != null) {
                    fVar2.m34546e(mo34566a);
                    this.f37104b.put(typeToken, mo34566a);
                    return mo34566a;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + typeToken);
        } finally {
            map2.remove(typeToken);
            if (z11) {
                this.f37103a.remove();
            }
        }
    }

    /* renamed from: k */
    public AbstractC6750k m34527k(Class cls) {
        return m34526j(TypeToken.get(cls));
    }

    /* renamed from: l */
    public AbstractC6750k m34528l(InterfaceC6751l interfaceC6751l, TypeToken typeToken) {
        if (!this.f37107e.contains(interfaceC6751l)) {
            interfaceC6751l = this.f37106d;
        }
        boolean z11 = false;
        for (InterfaceC6751l interfaceC6751l2 : this.f37107e) {
            if (!z11) {
                if (interfaceC6751l2 == interfaceC6751l) {
                    z11 = true;
                }
            } else {
                AbstractC6750k mo34566a = interfaceC6751l2.mo34566a(this, typeToken);
                if (mo34566a != null) {
                    return mo34566a;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    /* renamed from: n */
    public C3380a m34529n(Reader reader) {
        C3380a c3380a = new C3380a(reader);
        c3380a.m17002T(this.f37116n);
        return c3380a;
    }

    /* renamed from: o */
    public C3382c m34530o(Writer writer) {
        if (this.f37113k) {
            writer.write(")]}'\n");
        }
        C3382c c3382c = new C3382c(writer);
        if (this.f37115m) {
            c3382c.m17027J("  ");
        }
        c3382c.m17029L(this.f37111i);
        return c3382c;
    }

    /* renamed from: p */
    public String m34531p(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m34533r(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: q */
    public void m34532q(Object obj, Type type, C3382c c3382c) {
        AbstractC6750k m34526j = m34526j(TypeToken.get(type));
        boolean m17041r = c3382c.m17041r();
        c3382c.m17028K(true);
        boolean m17040q = c3382c.m17040q();
        c3382c.m17026G(this.f37114l);
        boolean m17039o = c3382c.m17039o();
        c3382c.m17029L(this.f37111i);
        try {
            try {
                m34526j.mo34535d(c3382c, obj);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            } catch (AssertionError e12) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e12.getMessage());
                assertionError.initCause(e12);
                throw assertionError;
            }
        } finally {
            c3382c.m17028K(m17041r);
            c3382c.m17026G(m17040q);
            c3382c.m17029L(m17039o);
        }
    }

    /* renamed from: r */
    public void m34533r(Object obj, Type type, Appendable appendable) {
        try {
            m34532q(obj, type, m34530o(AbstractC30855l.m149994b(appendable)));
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f37111i + ",factories:" + this.f37107e + ",instanceCreators:" + this.f37105c + "}";
    }

    C6743d(C30847d c30847d, InterfaceC6742c interfaceC6742c, Map map, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, EnumC6749j enumC6749j, String str, int i11, int i12, List list, List list2, List list3) {
        this.f37103a = new ThreadLocal();
        this.f37104b = new ConcurrentHashMap();
        this.f37108f = c30847d;
        this.f37109g = interfaceC6742c;
        this.f37110h = map;
        C30846c c30846c = new C30846c(map);
        this.f37105c = c30846c;
        this.f37111i = z11;
        this.f37112j = z12;
        this.f37113k = z13;
        this.f37114l = z14;
        this.f37115m = z15;
        this.f37116n = z16;
        this.f37117o = z17;
        this.f37121s = enumC6749j;
        this.f37118p = str;
        this.f37119q = i11;
        this.f37120r = i12;
        this.f37122t = list;
        this.f37123u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC31725l.f145744Y);
        arrayList.add(C31720g.f145693b);
        arrayList.add(c30847d);
        arrayList.addAll(list3);
        arrayList.add(AbstractC31725l.f145723D);
        arrayList.add(AbstractC31725l.f145758m);
        arrayList.add(AbstractC31725l.f145752g);
        arrayList.add(AbstractC31725l.f145754i);
        arrayList.add(AbstractC31725l.f145756k);
        AbstractC6750k m34522m = m34522m(enumC6749j);
        arrayList.add(AbstractC31725l.m152623b(Long.TYPE, Long.class, m34522m));
        arrayList.add(AbstractC31725l.m152623b(Double.TYPE, Double.class, m34520e(z17)));
        arrayList.add(AbstractC31725l.m152623b(Float.TYPE, Float.class, m34521f(z17)));
        arrayList.add(AbstractC31725l.f145769x);
        arrayList.add(AbstractC31725l.f145760o);
        arrayList.add(AbstractC31725l.f145762q);
        arrayList.add(AbstractC31725l.m152622a(AtomicLong.class, m34517b(m34522m)));
        arrayList.add(AbstractC31725l.m152622a(AtomicLongArray.class, m34518c(m34522m)));
        arrayList.add(AbstractC31725l.f145764s);
        arrayList.add(AbstractC31725l.f145771z);
        arrayList.add(AbstractC31725l.f145725F);
        arrayList.add(AbstractC31725l.f145727H);
        arrayList.add(AbstractC31725l.m152622a(BigDecimal.class, AbstractC31725l.f145721B));
        arrayList.add(AbstractC31725l.m152622a(BigInteger.class, AbstractC31725l.f145722C));
        arrayList.add(AbstractC31725l.f145729J);
        arrayList.add(AbstractC31725l.f145731L);
        arrayList.add(AbstractC31725l.f145735P);
        arrayList.add(AbstractC31725l.f145737R);
        arrayList.add(AbstractC31725l.f145742W);
        arrayList.add(AbstractC31725l.f145733N);
        arrayList.add(AbstractC31725l.f145749d);
        arrayList.add(C31716c.f145679b);
        arrayList.add(AbstractC31725l.f145740U);
        arrayList.add(C31723j.f145715b);
        arrayList.add(C31722i.f145713b);
        arrayList.add(AbstractC31725l.f145738S);
        arrayList.add(C31714a.f145673c);
        arrayList.add(AbstractC31725l.f145747b);
        arrayList.add(new C31715b(c30846c));
        arrayList.add(new C31719f(c30846c, z12));
        C31717d c31717d = new C31717d(c30846c);
        this.f37106d = c31717d;
        arrayList.add(c31717d);
        arrayList.add(AbstractC31725l.f145745Z);
        arrayList.add(new C31721h(c30846c, interfaceC6742c, c30847d, c31717d));
        this.f37107e = Collections.unmodifiableList(arrayList);
    }
}
