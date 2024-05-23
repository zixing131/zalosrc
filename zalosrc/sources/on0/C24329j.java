package on0;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ln0.AbstractC22543l;
import nn0.AbstractC23904m;
import nn0.InterfaceC23898g;
import qm0.AbstractC25366r;

/* renamed from: on0.j */
/* loaded from: classes.dex */
public final class C24329j implements Serializable {

    /* renamed from: q */
    public static final a f117433q = new a(null);

    /* renamed from: p */
    private final Pattern f117434p;

    /* renamed from: on0.j$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: on0.j$b */
    /* loaded from: classes7.dex */
    private static final class b implements Serializable {

        /* renamed from: r */
        public static final a f117435r = new a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: p */
        private final String f117436p;

        /* renamed from: q */
        private final int f117437q;

        /* renamed from: on0.j$b$a */
        /* loaded from: classes7.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public b(String str, int i11) {
            AbstractC19074t.m100208f(str, "pattern");
            this.f117436p = str;
            this.f117437q = i11;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f117436p, this.f117437q);
            AbstractC19074t.m100207e(compile, "compile(...)");
            return new C24329j(compile);
        }
    }

    /* renamed from: on0.j$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ CharSequence f117439r;

        /* renamed from: s */
        final /* synthetic */ int f117440s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence, int i11) {
            super(0);
            this.f117439r = charSequence;
            this.f117440s = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC24327h mo12V4() {
            return C24329j.this.m127016b(this.f117439r, this.f117440s);
        }
    }

    /* renamed from: on0.j$d */
    /* loaded from: classes7.dex */
    public /* synthetic */ class d extends C19071q implements InterfaceC18505l {

        /* renamed from: y */
        public static final d f117441y = new d();

        d() {
            super(1, InterfaceC24327h.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: h */
        public final InterfaceC24327h mo205i9(InterfaceC24327h interfaceC24327h) {
            AbstractC19074t.m100208f(interfaceC24327h, "p0");
            return interfaceC24327h.next();
        }
    }

    public C24329j(Pattern pattern) {
        AbstractC19074t.m100208f(pattern, "nativePattern");
        this.f117434p = pattern;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC24327h m127013c(C24329j c24329j, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return c24329j.m127016b(charSequence, i11);
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC23898g m127014e(C24329j c24329j, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return c24329j.m127017d(charSequence, i11);
    }

    private final Object writeReplace() {
        String pattern = this.f117434p.pattern();
        AbstractC19074t.m100207e(pattern, "pattern(...)");
        return new b(pattern, this.f117434p.flags());
    }

    /* renamed from: a */
    public final boolean m127015a(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "input");
        return this.f117434p.matcher(charSequence).find();
    }

    /* renamed from: b */
    public final InterfaceC24327h m127016b(CharSequence charSequence, int i11) {
        InterfaceC24327h m127026c;
        AbstractC19074t.m100208f(charSequence, "input");
        Matcher matcher = this.f117434p.matcher(charSequence);
        AbstractC19074t.m100207e(matcher, "matcher(...)");
        m127026c = AbstractC24330k.m127026c(matcher, i11, charSequence);
        return m127026c;
    }

    /* renamed from: d */
    public final InterfaceC23898g m127017d(CharSequence charSequence, int i11) {
        InterfaceC23898g m125017f;
        AbstractC19074t.m100208f(charSequence, "input");
        if (i11 >= 0 && i11 <= charSequence.length()) {
            m125017f = AbstractC23904m.m125017f(new c(charSequence, i11), d.f117441y);
            return m125017f;
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i11 + ", input length: " + charSequence.length());
    }

    /* renamed from: f */
    public final boolean m127018f(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "input");
        return this.f117434p.matcher(charSequence).matches();
    }

    /* renamed from: g */
    public final String m127019g(CharSequence charSequence, String str) {
        AbstractC19074t.m100208f(charSequence, "input");
        AbstractC19074t.m100208f(str, "replacement");
        String replaceAll = this.f117434p.matcher(charSequence).replaceAll(str);
        AbstractC19074t.m100207e(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    /* renamed from: h */
    public final String m127020h(CharSequence charSequence, String str) {
        AbstractC19074t.m100208f(charSequence, "input");
        AbstractC19074t.m100208f(str, "replacement");
        String replaceFirst = this.f117434p.matcher(charSequence).replaceFirst(str);
        AbstractC19074t.m100207e(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    /* renamed from: i */
    public final List m127021i(CharSequence charSequence, int i11) {
        List m131496e;
        AbstractC19074t.m100208f(charSequence, "input");
        AbstractC24342w.m127194w0(i11);
        Matcher matcher = this.f117434p.matcher(charSequence);
        if (i11 == 1 || !matcher.find()) {
            m131496e = AbstractC25366r.m131496e(charSequence.toString());
            return m131496e;
        }
        int i12 = 10;
        if (i11 > 0) {
            i12 = AbstractC22543l.m116584g(i11, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = i11 - 1;
        int i14 = 0;
        do {
            arrayList.add(charSequence.subSequence(i14, matcher.start()).toString());
            i14 = matcher.end();
            if (i13 >= 0 && arrayList.size() == i13) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i14, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f117434p.toString();
        AbstractC19074t.m100207e(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24329j(String str) {
        this(r2);
        AbstractC19074t.m100208f(str, "pattern");
        Pattern compile = Pattern.compile(str);
        AbstractC19074t.m100207e(compile, "compile(...)");
    }
}
