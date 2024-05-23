package on0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import ln0.C22537f;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;
import qm0.AbstractC25331a;
import qm0.AbstractC25332a0;
import qm0.AbstractC25336c;
import qm0.AbstractC25368s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: on0.i */
/* loaded from: classes7.dex */
public final class C24328i implements InterfaceC24327h {

    /* renamed from: a */
    private final Matcher f117426a;

    /* renamed from: b */
    private final CharSequence f117427b;

    /* renamed from: c */
    private final InterfaceC24326g f117428c;

    /* renamed from: d */
    private List f117429d;

    /* renamed from: on0.i$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC25336c {
        a() {
        }

        @Override // qm0.AbstractC25331a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m127006e((String) obj);
        }

        @Override // qm0.AbstractC25331a
        /* renamed from: d */
        public int mo127005d() {
            return C24328i.this.m127004c().groupCount() + 1;
        }

        /* renamed from: e */
        public /* bridge */ boolean m127006e(String str) {
            return super.contains(str);
        }

        @Override // qm0.AbstractC25336c, java.util.List
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public String get(int i11) {
            String group = C24328i.this.m127004c().group(i11);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // qm0.AbstractC25336c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return m127008j((String) obj);
        }

        /* renamed from: j */
        public /* bridge */ int m127008j(String str) {
            return super.indexOf(str);
        }

        /* renamed from: k */
        public /* bridge */ int m127009k(String str) {
            return super.lastIndexOf(str);
        }

        @Override // qm0.AbstractC25336c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return m127009k((String) obj);
        }
    }

    /* renamed from: on0.i$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC25331a implements InterfaceC24326g {

        /* renamed from: on0.i$b$a */
        /* loaded from: classes7.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {
            a() {
                super(1);
            }

            /* renamed from: a */
            public final C24325f m127012a(int i11) {
                return b.this.m127011g(i11);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                return m127012a(((Number) obj).intValue());
            }
        }

        b() {
        }

        @Override // qm0.AbstractC25331a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null && !(obj instanceof C24325f)) {
                return false;
            }
            return m127010e((C24325f) obj);
        }

        @Override // qm0.AbstractC25331a
        /* renamed from: d */
        public int mo127005d() {
            return C24328i.this.m127004c().groupCount() + 1;
        }

        /* renamed from: e */
        public /* bridge */ boolean m127010e(C24325f c24325f) {
            return super.contains(c24325f);
        }

        /* renamed from: g */
        public C24325f m127011g(int i11) {
            C22537f m127027d;
            m127027d = AbstractC24330k.m127027d(C24328i.this.m127004c(), i11);
            if (m127027d.m116556n().intValue() >= 0) {
                String group = C24328i.this.m127004c().group(i11);
                AbstractC19074t.m100207e(group, "group(...)");
                return new C24325f(group, m127027d);
            }
            return null;
        }

        @Override // qm0.AbstractC25331a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            C22537f m131503k;
            InterfaceC23898g m131191S;
            InterfaceC23898g m125028q;
            m131503k = AbstractC25368s.m131503k(this);
            m131191S = AbstractC25332a0.m131191S(m131503k);
            m125028q = AbstractC23906o.m125028q(m131191S, new a());
            return m125028q.iterator();
        }
    }

    public C24328i(Matcher matcher, CharSequence charSequence) {
        AbstractC19074t.m100208f(matcher, "matcher");
        AbstractC19074t.m100208f(charSequence, "input");
        this.f117426a = matcher;
        this.f117427b = charSequence;
        this.f117428c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final MatchResult m127004c() {
        return this.f117426a;
    }

    @Override // on0.InterfaceC24327h
    /* renamed from: a */
    public List mo127002a() {
        if (this.f117429d == null) {
            this.f117429d = new a();
        }
        List list = this.f117429d;
        AbstractC19074t.m100205c(list);
        return list;
    }

    @Override // on0.InterfaceC24327h
    public String getValue() {
        String group = m127004c().group();
        AbstractC19074t.m100207e(group, "group(...)");
        return group;
    }

    @Override // on0.InterfaceC24327h
    public InterfaceC24327h next() {
        int i11;
        InterfaceC24327h m127026c;
        int end = m127004c().end();
        if (m127004c().end() == m127004c().start()) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i12 = end + i11;
        if (i12 <= this.f117427b.length()) {
            Matcher matcher = this.f117426a.pattern().matcher(this.f117427b);
            AbstractC19074t.m100207e(matcher, "matcher(...)");
            m127026c = AbstractC24330k.m127026c(matcher, i12, this.f117427b);
            return m127026c;
        }
        return null;
    }
}
