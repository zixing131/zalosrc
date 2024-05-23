package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherFactory;

@InternalCoroutinesApi
/* loaded from: classes7.dex */
public final class MissingMainCoroutineDispatcherFactory implements MainDispatcherFactory {

    /* renamed from: a */
    public static final MissingMainCoroutineDispatcherFactory f107406a = new MissingMainCoroutineDispatcherFactory();

    private MissingMainCoroutineDispatcherFactory() {
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: a */
    public String mo112883a() {
        return MainDispatcherFactory.DefaultImpls.m113683a(this);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: b */
    public MainCoroutineDispatcher mo112884b(List list) {
        return new MissingMainCoroutineDispatcher(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: c */
    public int mo112885c() {
        return -1;
    }
}
