package p440q8;

/* renamed from: q8.a */
/* loaded from: classes.dex */
public class C25157a implements InterfaceC25160d {

    /* renamed from: a */
    private final int f120726a;

    /* renamed from: b */
    private final InterfaceC25160d[] f120727b;

    /* renamed from: c */
    private final C25158b f120728c;

    public C25157a(int i11, InterfaceC25160d... interfaceC25160dArr) {
        this.f120726a = i11;
        this.f120727b = interfaceC25160dArr;
        this.f120728c = new C25158b(i11);
    }

    @Override // p440q8.InterfaceC25160d
    /* renamed from: a */
    public StackTraceElement[] mo130299a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f120726a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (InterfaceC25160d interfaceC25160d : this.f120727b) {
            if (stackTraceElementArr2.length <= this.f120726a) {
                break;
            }
            stackTraceElementArr2 = interfaceC25160d.mo130299a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f120726a) {
            return this.f120728c.mo130299a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
