package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p469r1.C25600b;

/* renamed from: androidx.emoji2.text.m */
/* loaded from: classes2.dex */
abstract class AbstractC1705m {

    /* renamed from: androidx.emoji2.text.m$a */
    /* loaded from: classes2.dex */
    private static class a implements c {

        /* renamed from: a */
        private final ByteBuffer f6884a;

        a(ByteBuffer byteBuffer) {
            this.f6884a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.AbstractC1705m.c
        /* renamed from: a */
        public void mo8740a(int i11) {
            ByteBuffer byteBuffer = this.f6884a;
            byteBuffer.position(byteBuffer.position() + i11);
        }

        @Override // androidx.emoji2.text.AbstractC1705m.c
        /* renamed from: b */
        public int mo8741b() {
            return this.f6884a.getInt();
        }

        @Override // androidx.emoji2.text.AbstractC1705m.c
        /* renamed from: c */
        public long mo8742c() {
            return AbstractC1705m.m8738c(this.f6884a.getInt());
        }

        @Override // androidx.emoji2.text.AbstractC1705m.c
        public long getPosition() {
            return this.f6884a.position();
        }

        @Override // androidx.emoji2.text.AbstractC1705m.c
        public int readUnsignedShort() {
            return AbstractC1705m.m8739d(this.f6884a.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.m$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private final long f6885a;

        /* renamed from: b */
        private final long f6886b;

        b(long j11, long j12) {
            this.f6885a = j11;
            this.f6886b = j12;
        }

        /* renamed from: a */
        long m8743a() {
            return this.f6885a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.m$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        void mo8740a(int i11);

        /* renamed from: b */
        int mo8741b();

        /* renamed from: c */
        long mo8742c();

        long getPosition();

        int readUnsignedShort();
    }

    /* renamed from: a */
    private static b m8736a(c cVar) {
        long j11;
        cVar.mo8740a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.mo8740a(6);
            int i11 = 0;
            while (true) {
                if (i11 < readUnsignedShort) {
                    int mo8741b = cVar.mo8741b();
                    cVar.mo8740a(4);
                    j11 = cVar.mo8742c();
                    cVar.mo8740a(4);
                    if (1835365473 == mo8741b) {
                        break;
                    }
                    i11++;
                } else {
                    j11 = -1;
                    break;
                }
            }
            if (j11 != -1) {
                cVar.mo8740a((int) (j11 - cVar.getPosition()));
                cVar.mo8740a(12);
                long mo8742c = cVar.mo8742c();
                for (int i12 = 0; i12 < mo8742c; i12++) {
                    int mo8741b2 = cVar.mo8741b();
                    long mo8742c2 = cVar.mo8742c();
                    long mo8742c3 = cVar.mo8742c();
                    if (1164798569 == mo8741b2 || 1701669481 == mo8741b2) {
                        return new b(mo8742c2 + j11, mo8742c3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C25600b m8737b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m8736a(new a(duplicate)).m8743a());
        return C25600b.m132242h(duplicate);
    }

    /* renamed from: c */
    static long m8738c(int i11) {
        return i11 & 4294967295L;
    }

    /* renamed from: d */
    static int m8739d(short s7) {
        return s7 & 65535;
    }
}
