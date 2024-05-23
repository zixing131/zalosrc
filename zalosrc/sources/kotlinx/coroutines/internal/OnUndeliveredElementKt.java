package kotlinx.coroutines.internal;

import en0.InterfaceC18505l;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import pm0.AbstractC24845f;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class OnUndeliveredElementKt {
    /* renamed from: a */
    public static final InterfaceC18505l m113694a(InterfaceC18505l interfaceC18505l, Object obj, InterfaceC27315f interfaceC27315f) {
        return new OnUndeliveredElementKt$bindCancellationFun$1(interfaceC18505l, obj, interfaceC27315f);
    }

    /* renamed from: b */
    public static final void m113695b(InterfaceC18505l interfaceC18505l, Object obj, InterfaceC27315f interfaceC27315f) {
        UndeliveredElementException m113696c = m113696c(interfaceC18505l, obj, null);
        if (m113696c != null) {
            CoroutineExceptionHandlerKt.m112629a(interfaceC27315f, m113696c);
        }
    }

    /* renamed from: c */
    public static final UndeliveredElementException m113696c(InterfaceC18505l interfaceC18505l, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            interfaceC18505l.mo205i9(obj);
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                AbstractC24845f.m129182a(undeliveredElementException, th2);
            } else {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th2);
            }
        }
        return undeliveredElementException;
    }

    /* renamed from: d */
    public static /* synthetic */ UndeliveredElementException m113697d(InterfaceC18505l interfaceC18505l, Object obj, UndeliveredElementException undeliveredElementException, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            undeliveredElementException = null;
        }
        return m113696c(interfaceC18505l, obj, undeliveredElementException);
    }
}
