package kotlinx.coroutines.internal;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.reflect.Constructor;

/* loaded from: classes7.dex */
final class ExceptionsConstructorKt$createConstructor$1$3 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ Constructor f107368q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsConstructorKt$createConstructor$1$3(Constructor constructor) {
        super(1);
        this.f107368q = constructor;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Throwable mo205i9(Throwable th2) {
        Object newInstance = this.f107368q.newInstance(th2);
        AbstractC19074t.m100206d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) newInstance;
    }
}
