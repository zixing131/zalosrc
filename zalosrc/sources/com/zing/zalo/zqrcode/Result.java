package com.zing.zalo.zqrcode;

import androidx.annotation.Keep;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.nio.ByteBuffer;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import tl0.AbstractC26733a;

@Keep
/* loaded from: classes7.dex */
public abstract class Result {
    private final long executionTime;

    @Keep
    /* loaded from: classes7.dex */
    public static final class Failed extends Result {
        private final EnumC17397a reason;

        /* renamed from: com.zing.zalo.zqrcode.Result$Failed$a */
        /* loaded from: classes7.dex */
        public enum EnumC17397a {
            Unknown,
            IllegalArgument,
            NotFound,
            FormatError,
            CheckSumError
        }

        public Failed() {
            this(0L, 0, 3, null);
        }

        public final EnumC17397a getReason() {
            return this.reason;
        }

        public /* synthetic */ Failed(long j11, int i11, int i12, AbstractC19060k abstractC19060k) {
            this((i12 & 1) != 0 ? 0L : j11, (i12 & 2) != 0 ? 0 : i11);
        }

        public Failed(long j11, int i11) {
            super(j11, null);
            this.reason = EnumC17397a.values()[i11];
        }
    }

    public /* synthetic */ Result(long j11, AbstractC19060k abstractC19060k) {
        this(j11);
    }

    public final long getExecutionTime() {
        return this.executionTime;
    }

    private Result(long j11) {
        this.executionTime = j11;
    }

    /* loaded from: classes7.dex */
    public static final class Success extends Result {

        /* renamed from: a */
        private final String f88659a;

        /* renamed from: b */
        private final byte[] f88660b;

        /* renamed from: c */
        private final float[] f88661c;

        /* renamed from: d */
        private final float[] f88662d;

        /* renamed from: e */
        private final InterfaceC24854k f88663e;

        /* renamed from: f */
        private final InterfaceC24854k f88664f;

        /* renamed from: com.zing.zalo.zqrcode.Result$Success$a */
        /* loaded from: classes7.dex */
        static final class C17398a extends AbstractC19075u implements InterfaceC18494a {
            C17398a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ResultPoint[] mo12V4() {
                if (Success.this.m92581a().length % 2 == 0) {
                    int length = Success.this.m92581a().length / 2;
                    ResultPoint[] resultPointArr = new ResultPoint[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        resultPointArr[i11] = new ResultPoint(0.0f, 0.0f);
                    }
                    int length2 = Success.this.m92581a().length / 2;
                    for (int i12 = 0; i12 < length2; i12++) {
                        int i13 = i12 * 2;
                        resultPointArr[i12] = new ResultPoint(Success.this.m92581a()[i13], Success.this.m92581a()[i13 + 1]);
                    }
                    return resultPointArr;
                }
                return new ResultPoint[0];
            }
        }

        /* renamed from: com.zing.zalo.zqrcode.Result$Success$b */
        /* loaded from: classes7.dex */
        static final class C17399b extends AbstractC19075u implements InterfaceC18494a {
            C17399b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ResultPoint[] mo12V4() {
                if (Success.this.m92582b().length % 2 == 0) {
                    int length = Success.this.m92582b().length / 2;
                    ResultPoint[] resultPointArr = new ResultPoint[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        resultPointArr[i11] = new ResultPoint(0.0f, 0.0f);
                    }
                    int length2 = Success.this.m92582b().length / 2;
                    for (int i12 = 0; i12 < length2; i12++) {
                        int i13 = i12 * 2;
                        resultPointArr[i12] = new ResultPoint(Success.this.m92582b()[i13], Success.this.m92582b()[i13 + 1]);
                    }
                    return resultPointArr;
                }
                return new ResultPoint[0];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(long j11, String str, byte[] bArr, float[] fArr, float[] fArr2) {
            super(j11, null);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            AbstractC19074t.m100208f(str, "text");
            AbstractC19074t.m100208f(bArr, "rawBytes");
            AbstractC19074t.m100208f(fArr, "points");
            AbstractC19074t.m100208f(fArr2, "corners");
            this.f88659a = str;
            this.f88660b = bArr;
            this.f88661c = fArr;
            this.f88662d = fArr2;
            m129210a = AbstractC24856m.m129210a(new C17399b());
            this.f88663e = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new C17398a());
            this.f88664f = m129210a2;
        }

        /* renamed from: a */
        public final float[] m92581a() {
            return this.f88662d;
        }

        /* renamed from: b */
        public final float[] m92582b() {
            return this.f88661c;
        }

        /* renamed from: c */
        public final byte[] m92583c() {
            return this.f88660b;
        }

        /* renamed from: d */
        public final ResultPoint[] m92584d() {
            return (ResultPoint[]) this.f88663e.getValue();
        }

        /* renamed from: e */
        public final String m92585e() {
            return this.f88659a;
        }

        @Keep
        private Success(long j11, ByteBuffer byteBuffer, byte[] bArr, float[] fArr, float[] fArr2) {
            this(j11, AbstractC26733a.m137528a(byteBuffer), bArr, fArr, fArr2);
        }
    }
}
