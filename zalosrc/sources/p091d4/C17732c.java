package p091d4;

import p601w8.InterfaceC28797c;

/* renamed from: d4.c */
/* loaded from: classes.dex */
public final class C17732c {

    /* renamed from: c */
    private static final C17732c f89877c = new a().m93866a();

    /* renamed from: a */
    private final long f89878a;

    /* renamed from: b */
    private final b f89879b;

    /* renamed from: d4.c$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private long f89880a = 0;

        /* renamed from: b */
        private b f89881b = b.REASON_UNKNOWN;

        a() {
        }

        /* renamed from: a */
        public C17732c m93866a() {
            return new C17732c(this.f89880a, this.f89881b);
        }

        /* renamed from: b */
        public a m93867b(long j11) {
            this.f89880a = j11;
            return this;
        }

        /* renamed from: c */
        public a m93868c(b bVar) {
            this.f89881b = bVar;
            return this;
        }
    }

    /* renamed from: d4.c$b */
    /* loaded from: classes2.dex */
    public enum b implements InterfaceC28797c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: p */
        private final int f89890p;

        b(int i11) {
            this.f89890p = i11;
        }

        @Override // p601w8.InterfaceC28797c
        /* renamed from: a */
        public int mo93869a() {
            return this.f89890p;
        }
    }

    C17732c(long j11, b bVar) {
        this.f89878a = j11;
        this.f89879b = bVar;
    }

    /* renamed from: c */
    public static a m93863c() {
        return new a();
    }

    /* renamed from: a */
    public long m93864a() {
        return this.f89878a;
    }

    /* renamed from: b */
    public b m93865b() {
        return this.f89879b;
    }
}
