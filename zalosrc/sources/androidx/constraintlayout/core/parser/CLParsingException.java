package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLParsingException extends Exception {

    /* renamed from: p */
    private final String f4867p;

    /* renamed from: q */
    private final int f4868q;

    /* renamed from: r */
    private final String f4869r;

    /* renamed from: a */
    public String m5923a() {
        return this.f4867p + " (" + this.f4869r + " at line " + this.f4868q + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + m5923a();
    }
}
