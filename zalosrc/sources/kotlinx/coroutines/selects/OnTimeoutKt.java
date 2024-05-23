package kotlinx.coroutines.selects;

import en0.InterfaceC18505l;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes7.dex */
public final class OnTimeoutKt {
    /* renamed from: a */
    public static final void m113828a(SelectBuilder selectBuilder, long j11, InterfaceC18505l interfaceC18505l) {
        selectBuilder.mo113830a(new OnTimeout(j11).m113826b(), interfaceC18505l);
    }

    /* renamed from: b */
    public static final void m113829b(SelectBuilder selectBuilder, long j11, InterfaceC18505l interfaceC18505l) {
        m113828a(selectBuilder, DelayKt.m112668d(j11), interfaceC18505l);
    }
}
