package vn0;

import fn0.AbstractC19074t;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC21883a;
import on0.AbstractC24322d0;
import un0.AbstractC27323a;
import wn0.AbstractC29112b;

/* renamed from: vn0.z */
/* loaded from: classes7.dex */
public final class C28356z extends AbstractC21883a {

    /* renamed from: a */
    private final AbstractC28305a f132117a;

    /* renamed from: b */
    private final AbstractC29112b f132118b;

    public C28356z(AbstractC28305a abstractC28305a, AbstractC27323a abstractC27323a) {
        AbstractC19074t.m100208f(abstractC28305a, "lexer");
        AbstractC19074t.m100208f(abstractC27323a, "json");
        this.f132117a = abstractC28305a;
        this.f132118b = abstractC27323a.mo131586a();
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public byte mo113967H() {
        AbstractC28305a abstractC28305a = this.f132117a;
        String m142620s = abstractC28305a.m142620s();
        try {
            return AbstractC24322d0.m126983b(m142620s);
        } catch (IllegalArgumentException unused) {
            AbstractC28305a.m142595y(abstractC28305a, "Failed to parse type 'UByte' for input '" + m142620s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: a */
    public AbstractC29112b mo114036a() {
        return this.f132118b;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public int mo113970h() {
        AbstractC28305a abstractC28305a = this.f132117a;
        String m142620s = abstractC28305a.m142620s();
        try {
            return AbstractC24322d0.m126986e(m142620s);
        } catch (IllegalArgumentException unused) {
            AbstractC28305a.m142595y(abstractC28305a, "Failed to parse type 'UInt' for input '" + m142620s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: n */
    public long mo113973n() {
        AbstractC28305a abstractC28305a = this.f132117a;
        String m142620s = abstractC28305a.m142620s();
        try {
            return AbstractC24322d0.m126989h(m142620s);
        } catch (IllegalArgumentException unused) {
            AbstractC28305a.m142595y(abstractC28305a, "Failed to parse type 'ULong' for input '" + m142620s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: p */
    public int mo114037p(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public short mo113975t() {
        AbstractC28305a abstractC28305a = this.f132117a;
        String m142620s = abstractC28305a.m142620s();
        try {
            return AbstractC24322d0.m126992k(m142620s);
        } catch (IllegalArgumentException unused) {
            AbstractC28305a.m142595y(abstractC28305a, "Failed to parse type 'UShort' for input '" + m142620s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
