package p012a6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.ag */
/* loaded from: classes2.dex */
public final class C0161ag extends AbstractC0256fg {

    /* renamed from: a */
    private String f772a;

    /* renamed from: b */
    private boolean f773b;

    /* renamed from: c */
    private int f774c;

    /* renamed from: d */
    private byte f775d;

    @Override // p012a6.AbstractC0256fg
    /* renamed from: a */
    public final AbstractC0256fg mo612a(boolean z11) {
        this.f773b = true;
        this.f775d = (byte) (1 | this.f775d);
        return this;
    }

    @Override // p012a6.AbstractC0256fg
    /* renamed from: b */
    public final AbstractC0256fg mo613b(int i11) {
        this.f774c = 1;
        this.f775d = (byte) (this.f775d | 2);
        return this;
    }

    @Override // p012a6.AbstractC0256fg
    /* renamed from: c */
    public final AbstractC0275gg mo614c() {
        String str;
        if (this.f775d == 3 && (str = this.f772a) != null) {
            return new C0199cg(str, this.f773b, this.f774c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f772a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f775d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f775d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    /* renamed from: d */
    public final AbstractC0256fg m615d(String str) {
        if (str != null) {
            this.f772a = str;
            return this;
        }
        throw new NullPointerException("Null libraryName");
    }
}
