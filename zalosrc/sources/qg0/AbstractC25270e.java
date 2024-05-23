package qg0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.security.Key;
import org.json.JSONObject;
import qm0.AbstractC25356m;
import sg0.AbstractC26246b;

/* renamed from: qg0.e */
/* loaded from: classes7.dex */
public abstract class AbstractC25270e implements Key {

    /* renamed from: p */
    private final Key f121216p;

    /* renamed from: q */
    private final int f121217q;

    /* renamed from: qg0.e$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC25270e {

        /* renamed from: r */
        private final byte[] f121218r;

        /* renamed from: s */
        private final byte[] f121219s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Key key, byte[] bArr, byte[] bArr2) {
            super(key, 1, null);
            AbstractC19074t.m100208f(key, "key");
            AbstractC19074t.m100208f(bArr, "iv");
            AbstractC19074t.m100208f(bArr2, "tag");
            this.f121218r = bArr;
            this.f121219s = bArr2;
        }

        @Override // qg0.AbstractC25270e
        /* renamed from: b */
        public byte[] mo130787b() {
            byte[] m131332o;
            byte[] m131332o2;
            byte[] encoded = m130788c().getEncoded();
            AbstractC19074t.m100207e(encoded, "getEncoded(...)");
            m131332o = AbstractC25356m.m131332o(encoded, this.f121218r);
            m131332o2 = AbstractC25356m.m131332o(m131332o, this.f121219s);
            return m131332o2;
        }

        /* renamed from: e */
        public final byte[] m130790e() {
            return this.f121218r;
        }

        /* renamed from: f */
        public final byte[] m130791f() {
            return this.f121219s;
        }
    }

    /* renamed from: qg0.e$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC25270e {

        /* renamed from: r */
        private final byte[] f121220r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Key key, byte[] bArr) {
            super(key, 2, null);
            AbstractC19074t.m100208f(key, "key");
            AbstractC19074t.m100208f(bArr, "iv");
            this.f121220r = bArr;
        }

        @Override // qg0.AbstractC25270e
        /* renamed from: b */
        public byte[] mo130787b() {
            byte[] m131332o;
            byte[] encoded = m130788c().getEncoded();
            AbstractC19074t.m100207e(encoded, "getEncoded(...)");
            m131332o = AbstractC25356m.m131332o(encoded, this.f121220r);
            return m131332o;
        }

        /* renamed from: e */
        public final byte[] m130792e() {
            return this.f121220r;
        }
    }

    public /* synthetic */ AbstractC25270e(Key key, int i11, AbstractC19060k abstractC19060k) {
        this(key, i11);
    }

    /* renamed from: a */
    public final int m130786a() {
        return this.f121217q;
    }

    /* renamed from: b */
    public abstract byte[] mo130787b();

    /* renamed from: c */
    public final Key m130788c() {
        return this.f121216p;
    }

    /* renamed from: d */
    public final String m130789d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", AbstractC26246b.m134962a(this.f121216p));
        if (this instanceof a) {
            a aVar = (a) this;
            jSONObject.put("iv", AbstractC26246b.m134963b(aVar.m130790e()));
            jSONObject.put("tag", AbstractC26246b.m134963b(aVar.m130791f()));
        } else if (this instanceof b) {
            jSONObject.put("iv", AbstractC26246b.m134963b(((b) this).m130792e()));
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f121216p.getAlgorithm();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f121216p.getEncoded();
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f121216p.getFormat();
    }

    private AbstractC25270e(Key key, int i11) {
        this.f121216p = key;
        this.f121217q = i11;
    }
}
