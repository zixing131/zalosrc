package p245iv;

/* renamed from: iv.a */
/* loaded from: classes4.dex */
public final class C20837a {

    /* renamed from: a */
    public static final C20837a f102420a = new C20837a();

    private C20837a() {
    }

    /* renamed from: a */
    public final String m108934a(int i11) {
        if (i11 == -1) {
            return "Something wrong. Process action failed";
        }
        switch (i11) {
            case -304:
                return "No internet";
            case -303:
                return "The URL is being downloaded";
            case -302:
                return "Invalid path. Make sure the path follows MA scheme and belongs to this MA";
            case -301:
                return "Device full storage";
            case -300:
                return "Exceed limit size";
            default:
                return "An error occurred";
        }
    }
}
