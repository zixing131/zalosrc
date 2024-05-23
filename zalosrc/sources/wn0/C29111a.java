package wn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import mn0.InterfaceC23364b;
import p664y.AbstractC30228a;
import qn0.InterfaceC25386a;
import qn0.InterfaceC25393h;

/* renamed from: wn0.a */
/* loaded from: classes7.dex */
public final class C29111a extends AbstractC29112b {

    /* renamed from: a */
    private final Map f134956a;

    /* renamed from: b */
    public final Map f134957b;

    /* renamed from: c */
    private final Map f134958c;

    /* renamed from: d */
    private final Map f134959d;

    /* renamed from: e */
    private final Map f134960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29111a(Map map, Map map2, Map map3, Map map4, Map map5) {
        super(null);
        AbstractC19074t.m100208f(map, "class2ContextualFactory");
        AbstractC19074t.m100208f(map2, "polyBase2Serializers");
        AbstractC19074t.m100208f(map3, "polyBase2DefaultSerializerProvider");
        AbstractC19074t.m100208f(map4, "polyBase2NamedSerializers");
        AbstractC19074t.m100208f(map5, "polyBase2DefaultDeserializerProvider");
        this.f134956a = map;
        this.f134957b = map2;
        this.f134958c = map3;
        this.f134959d = map4;
        this.f134960e = map5;
    }

    @Override // wn0.AbstractC29112b
    /* renamed from: a */
    public void mo145360a(InterfaceC29114d interfaceC29114d) {
        AbstractC19074t.m100208f(interfaceC29114d, "collector");
        for (Map.Entry entry : this.f134956a.entrySet()) {
            AbstractC30228a.m149044a(entry.getValue());
        }
        for (Map.Entry entry2 : this.f134957b.entrySet()) {
            InterfaceC23364b interfaceC23364b = (InterfaceC23364b) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC23364b interfaceC23364b2 = (InterfaceC23364b) entry3.getKey();
                KSerializer kSerializer = (KSerializer) entry3.getValue();
                AbstractC19074t.m100206d(interfaceC23364b, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC19074t.m100206d(interfaceC23364b2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC19074t.m100206d(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                interfaceC29114d.mo142773c(interfaceC23364b, interfaceC23364b2, kSerializer);
            }
        }
        for (Map.Entry entry4 : this.f134958c.entrySet()) {
            InterfaceC23364b interfaceC23364b3 = (InterfaceC23364b) entry4.getKey();
            InterfaceC18505l interfaceC18505l = (InterfaceC18505l) entry4.getValue();
            AbstractC19074t.m100206d(interfaceC23364b3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC19074t.m100206d(interfaceC18505l, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            interfaceC29114d.mo142771a(interfaceC23364b3, (InterfaceC18505l) AbstractC19069o0.m100188e(interfaceC18505l, 1));
        }
        for (Map.Entry entry5 : this.f134960e.entrySet()) {
            InterfaceC23364b interfaceC23364b4 = (InterfaceC23364b) entry5.getKey();
            InterfaceC18505l interfaceC18505l2 = (InterfaceC18505l) entry5.getValue();
            AbstractC19074t.m100206d(interfaceC23364b4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC19074t.m100206d(interfaceC18505l2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            interfaceC29114d.mo142772b(interfaceC23364b4, (InterfaceC18505l) AbstractC19069o0.m100188e(interfaceC18505l2, 1));
        }
    }

    @Override // wn0.AbstractC29112b
    /* renamed from: b */
    public KSerializer mo145361b(InterfaceC23364b interfaceC23364b, List list) {
        AbstractC19074t.m100208f(interfaceC23364b, "kClass");
        AbstractC19074t.m100208f(list, "typeArgumentsSerializers");
        AbstractC30228a.m149044a(this.f134956a.get(interfaceC23364b));
        return null;
    }

    @Override // wn0.AbstractC29112b
    /* renamed from: d */
    public InterfaceC25386a mo145362d(InterfaceC23364b interfaceC23364b, String str) {
        KSerializer kSerializer;
        InterfaceC18505l interfaceC18505l;
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        Map map = (Map) this.f134959d.get(interfaceC23364b);
        if (map != null) {
            kSerializer = (KSerializer) map.get(str);
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.f134960e.get(interfaceC23364b);
        if (AbstractC19069o0.m100194k(obj, 1)) {
            interfaceC18505l = (InterfaceC18505l) obj;
        } else {
            interfaceC18505l = null;
        }
        if (interfaceC18505l == null) {
            return null;
        }
        return (InterfaceC25386a) interfaceC18505l.mo205i9(str);
    }

    @Override // wn0.AbstractC29112b
    /* renamed from: e */
    public InterfaceC25393h mo145363e(InterfaceC23364b interfaceC23364b, Object obj) {
        KSerializer kSerializer;
        InterfaceC18505l interfaceC18505l;
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        AbstractC19074t.m100208f(obj, "value");
        if (!interfaceC23364b.mo100162a(obj)) {
            return null;
        }
        Map map = (Map) this.f134957b.get(interfaceC23364b);
        if (map != null) {
            kSerializer = (KSerializer) map.get(AbstractC19061k0.m100169b(obj.getClass()));
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof InterfaceC25393h)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj2 = this.f134958c.get(interfaceC23364b);
        if (AbstractC19069o0.m100194k(obj2, 1)) {
            interfaceC18505l = (InterfaceC18505l) obj2;
        } else {
            interfaceC18505l = null;
        }
        if (interfaceC18505l == null) {
            return null;
        }
        return (InterfaceC25393h) interfaceC18505l.mo205i9(obj);
    }
}
