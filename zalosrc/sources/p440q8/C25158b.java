package p440q8;

/* renamed from: q8.b */
/* loaded from: classes.dex */
public class C25158b implements InterfaceC25160d {

    /* renamed from: a */
    private final int f120729a;

    public C25158b(int i11) {
        this.f120729a = i11;
    }

    @Override // p440q8.InterfaceC25160d
    /* renamed from: a */
    public StackTraceElement[] mo130299a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i11 = this.f120729a;
        if (length <= i11) {
            return stackTraceElementArr;
        }
        int i12 = i11 / 2;
        int i13 = i11 - i12;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i13);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i12, stackTraceElementArr2, i13, i12);
        return stackTraceElementArr2;
    }
}
