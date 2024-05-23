package p097db;

/* renamed from: db.u */
/* loaded from: classes3.dex */
public enum EnumC17862u {
    SUCCESS(0),
    FAILED(-1),
    AUDIO_DEVICE_INIT_FAILED(-2),
    VIDEO_DEVICE_INIT_FAILED(-3),
    NETWORK_DISCONNECTED(-4),
    WRONG_SERVER_INFO(-5),
    NOT_INITIALIZED(-6),
    NO_SESSION_INFO(-7),
    AUDIO_DEVICE_START_FAILED(-8),
    VIDEO_DEVICE_START_FAILED(-9),
    JVM_NOT_READY(-10),
    JVM_INIT_FAILED(-11),
    SESSION_EXPIRED(-12),
    CONFIG_NOT_SET(-13),
    INVALID_STATE(-14),
    NOT_SET_APP_CONTEXT(-15),
    INVALID_MODE(-16);


    /* renamed from: p */
    private final int f90289p;

    EnumC17862u(int i11) {
        this.f90289p = i11;
    }

    /* renamed from: b */
    public int m94384b() {
        return this.f90289p;
    }
}
