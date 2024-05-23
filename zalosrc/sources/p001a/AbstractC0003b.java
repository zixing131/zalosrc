package p001a;

/* renamed from: a.b */
/* loaded from: classes2.dex */
public abstract class AbstractC0003b {

    /* renamed from: a */
    private static final String f1a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final StackTraceElement m3b(Throwable th2, String str) {
        StackTraceElement stackTraceElement = th2.getStackTrace()[0];
        return new StackTraceElement(f1a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
