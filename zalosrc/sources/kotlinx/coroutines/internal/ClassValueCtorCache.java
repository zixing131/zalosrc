package kotlinx.coroutines.internal;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
final class ClassValueCtorCache extends CtorCache {

    /* renamed from: a */
    public static final ClassValueCtorCache f107347a = new ClassValueCtorCache();

    /* renamed from: b */
    private static final ClassValueCtorCache$cache$1 f107348b = new ClassValue<InterfaceC18505l>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ClassValue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC18505l computeValue(Class cls) {
            AbstractC19074t.m100206d(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return ExceptionsConstructorKt.m113615a(cls);
        }
    };

    private ClassValueCtorCache() {
    }
}
